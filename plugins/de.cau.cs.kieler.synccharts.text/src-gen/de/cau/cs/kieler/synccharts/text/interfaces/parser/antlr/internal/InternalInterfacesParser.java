package de.cau.cs.kieler.synccharts.text.interfaces.parser.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.text.interfaces.services.InterfacesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalInterfacesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_D", "RULE_STRING_S", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "'variable'", "':'", "'var'", "','", "';'", "':='", "'combine'", "'with'", "'('", "')'", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'*'", "'mod'", "'/'", "'?'", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'max'", "'min'", "'host'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_STRING_S=6;
    public static final int RULE_INT=8;
    public static final int EOF=-1;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_STRING_D=5;
    public static final int RULE_SL_COMMENT=10;

        public InternalInterfacesParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[171+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private InterfacesGrammarAccess grammarAccess;
     	
        public InternalInterfacesParser(TokenStream input, IAstFactory factory, InterfacesGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateExtend";	
       	}
       	
       	@Override
       	protected InterfacesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleStateExtend
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:84:1: entryRuleStateExtend returns [EObject current=null] : iv_ruleStateExtend= ruleStateExtend EOF ;
    public final EObject entryRuleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExtend = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:85:2: (iv_ruleStateExtend= ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:86:2: iv_ruleStateExtend= ruleStateExtend EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateExtendRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStateExtend_in_entryRuleStateExtend81);
            iv_ruleStateExtend=ruleStateExtend();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStateExtend; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExtend91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateExtend


    // $ANTLR start ruleStateExtend
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:93:1: ruleStateExtend returns [EObject current=null] : ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) ) )+ ;
    public final EObject ruleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject lv_regions_0_0 = null;

        EObject lv_inOutputSignals_3_0 = null;

        EObject lv_outputSignals_5_0 = null;

        EObject lv_inputSignals_7_0 = null;

        EObject lv_signals_9_0 = null;

        EObject lv_variable_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:98:6: ( ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) ) )+ )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:99:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) ) )+
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:99:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==14) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_ID) ) {
                        alt1=4;
                    }


                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case 15:
                    {
                    alt1=5;
                    }
                    break;
                case 16:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:99:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:99:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:100:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:100:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:101:3: lv_regions_0_0= ruleRegionSignalDec
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRegionSignalDec_in_ruleStateExtend137);
            	    lv_regions_0_0=ruleRegionSignalDec();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"regions",
            	      	        		lv_regions_0_0, 
            	      	        		"RegionSignalDec", 
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
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:124:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:124:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:124:8: 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleStateExtend154); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_1_0(), null); 
            	          
            	    }
            	    match(input,14,FOLLOW_14_in_ruleStateExtend164); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:132:1: ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:133:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:133:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:134:3: lv_inOutputSignals_3_0= ruleInOutputSignals
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInOutputSignals_in_ruleStateExtend185);
            	    lv_inOutputSignals_3_0=ruleInOutputSignals();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"inOutputSignals",
            	      	        		lv_inOutputSignals_3_0, 
            	      	        		"InOutputSignals", 
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
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:157:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:157:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:157:8: 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleStateExtend203); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:161:1: ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:162:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:162:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:163:3: lv_outputSignals_5_0= ruleOutputSignals
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputSignals_in_ruleStateExtend224);
            	    lv_outputSignals_5_0=ruleOutputSignals();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"outputSignals",
            	      	        		lv_outputSignals_5_0, 
            	      	        		"OutputSignals", 
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
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:186:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:186:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:186:8: 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleStateExtend242); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_3_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:190:1: ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:191:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:191:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:192:3: lv_inputSignals_7_0= ruleInputSignals
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInputSignals_in_ruleStateExtend263);
            	    lv_inputSignals_7_0=ruleInputSignals();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"inputSignals",
            	      	        		lv_inputSignals_7_0, 
            	      	        		"InputSignals", 
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
            	case 5 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:215:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:215:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:215:8: 'signal' ( (lv_signals_9_0= ruleSignals ) )
            	    {
            	    match(input,15,FOLLOW_15_in_ruleStateExtend281); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:219:1: ( (lv_signals_9_0= ruleSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:220:1: (lv_signals_9_0= ruleSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:220:1: (lv_signals_9_0= ruleSignals )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:221:3: lv_signals_9_0= ruleSignals
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignals_in_ruleStateExtend302);
            	    lv_signals_9_0=ruleSignals();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_9_0, 
            	      	        		"Signals", 
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
            	case 6 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:244:6: ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:244:6: ( 'variable' ( (lv_variable_11_0= ruleVariables ) ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:244:8: 'variable' ( (lv_variable_11_0= ruleVariables ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleStateExtend320); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getVariableKeyword_5_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:248:1: ( (lv_variable_11_0= ruleVariables ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:249:1: (lv_variable_11_0= ruleVariables )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:249:1: (lv_variable_11_0= ruleVariables )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:250:3: lv_variable_11_0= ruleVariables
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getVariableVariablesParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariables_in_ruleStateExtend341);
            	    lv_variable_11_0=ruleVariables();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variable",
            	      	        		lv_variable_11_0, 
            	      	        		"Variables", 
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

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end ruleStateExtend


    // $ANTLR start entryRuleRegionSignalDec
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:280:1: entryRuleRegionSignalDec returns [EObject current=null] : iv_ruleRegionSignalDec= ruleRegionSignalDec EOF ;
    public final EObject entryRuleRegionSignalDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionSignalDec = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:281:2: (iv_ruleRegionSignalDec= ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:282:2: iv_ruleRegionSignalDec= ruleRegionSignalDec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionSignalDecRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec379);
            iv_ruleRegionSignalDec=ruleRegionSignalDec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegionSignalDec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionSignalDec389); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRegionSignalDec


    // $ANTLR start ruleRegionSignalDec
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:289:1: ruleRegionSignalDec returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) ;
    public final EObject ruleRegionSignalDec() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_3_0 = null;

        EObject lv_vars_5_0 = null;

        EObject lv_signals_7_0 = null;

        EObject lv_signals_9_0 = null;

        EObject lv_vars_12_0 = null;

        EObject lv_vars_14_0 = null;

        EObject lv_signals_17_0 = null;

        EObject lv_signals_19_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:294:6: ( ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:295:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:295:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:295:2: ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:295:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:296:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:296:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:297:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegionSignalDec436); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0(), "region"); 
              	
            }

            }


            }

            match(input,17,FOLLOW_17_in_ruleRegionSignalDec446); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("316:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:4: 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    {
                    match(input,18,FOLLOW_18_in_ruleRegionSignalDec458); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:320:1: ( (lv_vars_3_0= ruleVariable ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:321:1: (lv_vars_3_0= ruleVariable )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:321:1: (lv_vars_3_0= ruleVariable )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:322:3: lv_vars_3_0= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec479);
                    lv_vars_3_0=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"vars",
                      	        		lv_vars_3_0, 
                      	        		"Variable", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:344:2: ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_ID) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:344:4: ',' ( (lv_vars_5_0= ruleVariable ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec490); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:348:1: ( (lv_vars_5_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:349:1: (lv_vars_5_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:349:1: (lv_vars_5_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:350:3: lv_vars_5_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec511);
                    	    lv_vars_5_0=ruleVariable();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"vars",
                    	      	        		lv_vars_5_0, 
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

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:373:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:373:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:373:8: 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleRegionSignalDec531); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:377:1: ( (lv_signals_7_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:378:1: (lv_signals_7_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:378:1: (lv_signals_7_0= ruleSignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:379:3: lv_signals_7_0= ruleSignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec552);
                    lv_signals_7_0=ruleSignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_7_0, 
                      	        		"Signal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:401:2: ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:401:4: ',' ( (lv_signals_9_0= ruleSignal ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec563); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:405:1: ( (lv_signals_9_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:406:1: (lv_signals_9_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:406:1: (lv_signals_9_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:407:3: lv_signals_9_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec584);
                    	    lv_signals_9_0=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_9_0, 
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


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:6: ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==15) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==18) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:9: ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    {
            	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0(), null); 
            	          
            	    }
            	    match(input,18,FOLLOW_18_in_ruleRegionSignalDec610); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:437:1: ( (lv_vars_12_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:438:1: (lv_vars_12_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:438:1: (lv_vars_12_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:439:3: lv_vars_12_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec631);
            	    lv_vars_12_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"vars",
            	      	        		lv_vars_12_0, 
            	      	        		"Variable", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:461:2: ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==19) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:461:4: ',' ( (lv_vars_14_0= ruleVariable ) )
            	    	    {
            	    	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec642); if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0(), null); 
            	    	          
            	    	    }
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:465:1: ( (lv_vars_14_0= ruleVariable ) )
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:466:1: (lv_vars_14_0= ruleVariable )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:466:1: (lv_vars_14_0= ruleVariable )
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:467:3: lv_vars_14_0= ruleVariable
            	    	    {
            	    	    if ( backtracking==0 ) {
            	    	       
            	    	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0(), currentNode); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec663);
            	    	    lv_vars_14_0=ruleVariable();
            	    	    _fsp--;
            	    	    if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	      	        }
            	    	      	        try {
            	    	      	       		add(
            	    	      	       			current, 
            	    	      	       			"vars",
            	    	      	        		lv_vars_14_0, 
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

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:490:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:490:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:490:8: ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    {
            	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec683); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0(), null); 
            	          
            	    }
            	    match(input,15,FOLLOW_15_in_ruleRegionSignalDec693); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:498:1: ( (lv_signals_17_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:499:1: (lv_signals_17_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:499:1: (lv_signals_17_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:500:3: lv_signals_17_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec714);
            	    lv_signals_17_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_17_0, 
            	      	        		"Signal", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:522:2: ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==19) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:522:4: ',' ( (lv_signals_19_0= ruleSignal ) )
            	    	    {
            	    	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec725); if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0(), null); 
            	    	          
            	    	    }
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:526:1: ( (lv_signals_19_0= ruleSignal ) )
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:527:1: (lv_signals_19_0= ruleSignal )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:527:1: (lv_signals_19_0= ruleSignal )
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:528:3: lv_signals_19_0= ruleSignal
            	    	    {
            	    	    if ( backtracking==0 ) {
            	    	       
            	    	      	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0(), currentNode); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec746);
            	    	    lv_signals_19_0=ruleSignal();
            	    	    _fsp--;
            	    	    if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	      	        }
            	    	      	        try {
            	    	      	       		add(
            	    	      	       			current, 
            	    	      	       			"signals",
            	    	      	        		lv_signals_19_0, 
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
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleRegionSignalDec761); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4(), null); 
                  
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
    // $ANTLR end ruleRegionSignalDec


    // $ANTLR start entryRuleVariables
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:562:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:563:2: (iv_ruleVariables= ruleVariables EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:564:2: iv_ruleVariables= ruleVariables EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariablesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables797);
            iv_ruleVariables=ruleVariables();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariables; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables807); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariables


    // $ANTLR start ruleVariables
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:571:1: ruleVariables returns [EObject current=null] : ( ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ';' ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:576:6: ( ( ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:1: ( ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:1: ( ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:2: ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:2: ( ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:3: ( (lv_vars_0_0= ruleVariable ) ) ( ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:577:3: ( (lv_vars_0_0= ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:578:1: (lv_vars_0_0= ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:578:1: (lv_vars_0_0= ruleVariable )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:579:3: lv_vars_0_0= ruleVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleVariables854);
            lv_vars_0_0=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariablesRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"vars",
              	        		lv_vars_0_0, 
              	        		"Variable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:601:2: ( ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:601:4: ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleVariables865); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getVariablesAccess().getCommaKeyword_0_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:605:1: ( (lv_vars_2_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:606:1: (lv_vars_2_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:606:1: (lv_vars_2_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:607:3: lv_vars_2_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleVariables886);
            	    lv_vars_2_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getVariablesRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"vars",
            	      	        		lv_vars_2_0, 
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

            	default :
            	    break loop8;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleVariables899); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariablesAccess().getSemicolonKeyword_1(), null); 
                  
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
    // $ANTLR end ruleVariables


    // $ANTLR start entryRuleSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:641:1: entryRuleSignals returns [EObject current=null] : iv_ruleSignals= ruleSignals EOF ;
    public final EObject entryRuleSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:642:2: (iv_ruleSignals= ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:643:2: iv_ruleSignals= ruleSignals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignals_in_entryRuleSignals935);
            iv_ruleSignals=ruleSignals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignals945); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignals


    // $ANTLR start ruleSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:650:1: ruleSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:655:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:656:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:657:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:657:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:658:3: lv_signals_0_0= ruleSignal
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleSignals992);
            lv_signals_0_0=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"signals",
              	        		lv_signals_0_0, 
              	        		"Signal", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:680:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:680:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleSignals1003); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:684:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:685:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:685:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:686:3: lv_signals_2_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleSignals1024);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSignalsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_2_0, 
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
            	    break loop9;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleSignals1037); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalsAccess().getSemicolonKeyword_1(), null); 
                  
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
    // $ANTLR end ruleSignals


    // $ANTLR start entryRuleInputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:720:1: entryRuleInputSignals returns [EObject current=null] : iv_ruleInputSignals= ruleInputSignals EOF ;
    public final EObject entryRuleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:721:2: (iv_ruleInputSignals= ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:722:2: iv_ruleInputSignals= ruleInputSignals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInputSignalsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals1073);
            iv_ruleInputSignals=ruleInputSignals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInputSignals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals1083); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInputSignals


    // $ANTLR start ruleInputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:729:1: ruleInputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:734:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:735:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:736:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:736:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:737:3: lv_signals_0_0= ruleSignal
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals1130);
            lv_signals_0_0=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInputSignalsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"signals",
              	        		lv_signals_0_0, 
              	        		"Signal", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:759:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:759:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleInputSignals1141); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:763:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:764:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:764:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:765:3: lv_signals_2_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals1162);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInputSignalsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_2_0, 
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
            	    break loop10;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleInputSignals1175); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1(), null); 
                  
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
    // $ANTLR end ruleInputSignals


    // $ANTLR start entryRuleOutputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:799:1: entryRuleOutputSignals returns [EObject current=null] : iv_ruleOutputSignals= ruleOutputSignals EOF ;
    public final EObject entryRuleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:800:2: (iv_ruleOutputSignals= ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:801:2: iv_ruleOutputSignals= ruleOutputSignals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOutputSignalsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1211);
            iv_ruleOutputSignals=ruleOutputSignals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOutputSignals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals1221); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOutputSignals


    // $ANTLR start ruleOutputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:808:1: ruleOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:813:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:814:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:815:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:815:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:816:3: lv_signals_0_0= ruleSignal
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1268);
            lv_signals_0_0=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOutputSignalsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"signals",
              	        		lv_signals_0_0, 
              	        		"Signal", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:838:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:838:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleOutputSignals1279); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:842:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:843:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:843:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:844:3: lv_signals_2_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1300);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOutputSignalsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_2_0, 
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
            	    break loop11;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleOutputSignals1313); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1(), null); 
                  
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
    // $ANTLR end ruleOutputSignals


    // $ANTLR start entryRuleInOutputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:878:1: entryRuleInOutputSignals returns [EObject current=null] : iv_ruleInOutputSignals= ruleInOutputSignals EOF ;
    public final EObject entryRuleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:879:2: (iv_ruleInOutputSignals= ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:880:2: iv_ruleInOutputSignals= ruleInOutputSignals EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInOutputSignalsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1349);
            iv_ruleInOutputSignals=ruleInOutputSignals();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInOutputSignals; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals1359); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInOutputSignals


    // $ANTLR start ruleInOutputSignals
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:887:1: ruleInOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:892:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:893:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:894:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:894:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:895:3: lv_signals_0_0= ruleSignal
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1406);
            lv_signals_0_0=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInOutputSignalsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"signals",
              	        		lv_signals_0_0, 
              	        		"Signal", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:917:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:917:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleInOutputSignals1417); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:921:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:922:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:922:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:923:3: lv_signals_2_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1438);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInOutputSignalsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_2_0, 
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
            	    break loop12;
                }
            } while (true);


            }

            match(input,20,FOLLOW_20_in_ruleInOutputSignals1451); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1(), null); 
                  
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
    // $ANTLR end ruleInOutputSignals


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:957:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:958:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:959:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1487);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1497); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:966:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_4_0=null;
        Token lv_initialValue_6_0=null;
        Token lv_name_7_0=null;
        Token lv_initialValue_9_0=null;
        Token lv_name_12_0=null;
        Token lv_initialValue_14_0=null;
        Token lv_name_19_0=null;
        Token lv_hostType_21_0=null;
        Token lv_name_22_0=null;
        Token lv_initialValue_24_0=null;
        Token lv_hostType_26_0=null;
        Token lv_name_27_0=null;
        Token lv_initialValue_29_0=null;
        Token lv_hostType_31_0=null;
        Token lv_hostCombineOperator_33_0=null;
        Token lv_name_34_0=null;
        Token lv_name_39_0=null;
        Token lv_hostType_41_0=null;
        Token lv_hostCombineOperator_43_0=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_type_11_0 = null;

        Enumerator lv_type_16_0 = null;

        Enumerator lv_combineOperator_18_0 = null;

        Enumerator lv_type_36_0 = null;

        Enumerator lv_combineOperator_38_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:971:6: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )
            int alt13=10;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING_S) ) {
                        alt13=6;
                    }
                    else if ( ((LA13_2>=47 && LA13_2<=52)) ) {
                        alt13=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING_D) ) {
                        switch ( input.LA(4) ) {
                        case 22:
                            {
                            int LA13_11 = input.LA(5);

                            if ( (LA13_11==RULE_STRING_S) ) {
                                alt13=8;
                            }
                            else if ( ((LA13_11>=47 && LA13_11<=52)) ) {
                                alt13=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 11, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 17:
                            {
                            int LA13_12 = input.LA(5);

                            if ( (LA13_12==RULE_STRING_S) ) {
                                alt13=7;
                            }
                            else if ( ((LA13_12>=47 && LA13_12<=52)) ) {
                                alt13=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 12, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case 19:
                        case 20:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 8, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_STRING_S) ) {
                        alt13=10;
                    }
                    else if ( ((LA13_4>=47 && LA13_4<=52)) ) {
                        alt13=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 19:
                case 20:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:972:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:972:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:973:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:973:1: (lv_name_0_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:974:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1539); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
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


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:997:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:997:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:997:7: ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:997:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:998:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:998:1: (lv_name_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:999:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1568); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
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

                    match(input,17,FOLLOW_17_in_ruleSignal1583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1025:1: ( (lv_type_3_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1026:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1026:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1027:3: lv_type_3_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1604);
                    lv_type_3_0=ruleValueType();
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


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1050:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1050:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1050:7: ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1050:7: ( (lv_name_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1051:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1051:1: (lv_name_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1052:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1629); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_4_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1074:2: ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1074:4: ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleSignal1645); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1078:1: ( (lv_initialValue_6_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1079:1: (lv_initialValue_6_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1079:1: (lv_initialValue_6_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1080:3: lv_initialValue_6_0= RULE_STRING_D
                    {
                    lv_initialValue_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleSignal1662); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_6_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1103:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1103:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1103:7: ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1103:7: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1104:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1104:1: (lv_name_7_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1105:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1693); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_7_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1127:2: ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1127:4: ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleSignal1709); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1131:1: ( (lv_initialValue_9_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1132:1: (lv_initialValue_9_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1132:1: (lv_initialValue_9_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1133:3: lv_initialValue_9_0= RULE_STRING_D
                    {
                    lv_initialValue_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleSignal1726); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_9_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleSignal1742); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_3_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1159:1: ( (lv_type_11_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1160:1: (lv_type_11_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1160:1: (lv_type_11_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1161:3: lv_type_11_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1763);
                    lv_type_11_0=ruleValueType();
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
                      	        		lv_type_11_0, 
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
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1184:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1184:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1184:7: ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1184:7: ( (lv_name_12_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1185:1: (lv_name_12_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1185:1: (lv_name_12_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1186:3: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1788); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_12_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1208:2: ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1208:4: ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleSignal1804); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1212:1: ( (lv_initialValue_14_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1213:1: (lv_initialValue_14_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1213:1: (lv_initialValue_14_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1214:3: lv_initialValue_14_0= RULE_STRING_D
                    {
                    lv_initialValue_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleSignal1821); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_4_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_14_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1236:3: ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1236:5: 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleSignal1838); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1240:1: ( (lv_type_16_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1241:1: (lv_type_16_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1241:1: (lv_type_16_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1242:3: lv_type_16_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1859);
                    lv_type_16_0=ruleValueType();
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
                      	        		lv_type_16_0, 
                      	        		"ValueType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleSignal1869); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_4_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1268:1: ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1269:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1269:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1270:3: lv_combineOperator_18_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1890);
                    lv_combineOperator_18_0=ruleCombineOperator();
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
                      	        		lv_combineOperator_18_0, 
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


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1293:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1293:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1293:7: ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1293:7: ( (lv_name_19_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1294:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1294:1: (lv_name_19_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1295:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1916); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_19_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleSignal1931); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1321:1: ( (lv_hostType_21_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1322:1: (lv_hostType_21_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1322:1: (lv_hostType_21_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1323:3: lv_hostType_21_0= RULE_STRING_S
                    {
                    lv_hostType_21_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal1948); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_5_2_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_21_0, 
                      	        		"STRING_S", 
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
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1346:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1346:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1346:7: ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1346:7: ( (lv_name_22_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1347:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1347:1: (lv_name_22_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1348:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1978); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_22_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1370:2: ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1370:4: ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleSignal1994); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1374:1: ( (lv_initialValue_24_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1375:1: (lv_initialValue_24_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1375:1: (lv_initialValue_24_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1376:3: lv_initialValue_24_0= RULE_STRING_D
                    {
                    lv_initialValue_24_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleSignal2011); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_6_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_24_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleSignal2027); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_6_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1402:1: ( (lv_hostType_26_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1403:1: (lv_hostType_26_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1403:1: (lv_hostType_26_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1404:3: lv_hostType_26_0= RULE_STRING_S
                    {
                    lv_hostType_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal2044); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_6_3_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_26_0, 
                      	        		"STRING_S", 
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
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1427:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1427:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1427:7: ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1427:7: ( (lv_name_27_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1428:1: (lv_name_27_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1428:1: (lv_name_27_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1429:3: lv_name_27_0= RULE_ID
                    {
                    lv_name_27_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2074); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_27_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1451:2: ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1451:4: ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleSignal2090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1455:1: ( (lv_initialValue_29_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1456:1: (lv_initialValue_29_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1456:1: (lv_initialValue_29_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1457:3: lv_initialValue_29_0= RULE_STRING_D
                    {
                    lv_initialValue_29_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleSignal2107); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_7_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_29_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1479:3: ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1479:5: 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleSignal2124); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1483:1: ( (lv_hostType_31_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1484:1: (lv_hostType_31_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1484:1: (lv_hostType_31_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1485:3: lv_hostType_31_0= RULE_STRING_S
                    {
                    lv_hostType_31_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal2141); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_7_2_1_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_31_0, 
                      	        		"STRING_S", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleSignal2156); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_7_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1511:1: ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1512:1: (lv_hostCombineOperator_33_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1512:1: (lv_hostCombineOperator_33_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1513:3: lv_hostCombineOperator_33_0= RULE_STRING_S
                    {
                    lv_hostCombineOperator_33_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal2173); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_7_2_3_0(), "hostCombineOperator"); 
                      		
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
                      	        		lv_hostCombineOperator_33_0, 
                      	        		"STRING_S", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1536:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1536:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1536:7: ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1536:7: ( (lv_name_34_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1537:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1537:1: (lv_name_34_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1538:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2204); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_8_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_34_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1560:2: ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1560:4: 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleSignal2220); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1564:1: ( (lv_type_36_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1565:1: (lv_type_36_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1565:1: (lv_type_36_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1566:3: lv_type_36_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal2241);
                    lv_type_36_0=ruleValueType();
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
                      	        		lv_type_36_0, 
                      	        		"ValueType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleSignal2251); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_8_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1592:1: ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1593:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1593:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1594:3: lv_combineOperator_38_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal2272);
                    lv_combineOperator_38_0=ruleCombineOperator();
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
                      	        		lv_combineOperator_38_0, 
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


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1617:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1617:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1617:7: ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1617:7: ( (lv_name_39_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1618:1: (lv_name_39_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1618:1: (lv_name_39_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1619:3: lv_name_39_0= RULE_ID
                    {
                    lv_name_39_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2298); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_9_0_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_39_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1641:2: ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1641:4: 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleSignal2314); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1645:1: ( (lv_hostType_41_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1646:1: (lv_hostType_41_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1646:1: (lv_hostType_41_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1647:3: lv_hostType_41_0= RULE_STRING_S
                    {
                    lv_hostType_41_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal2331); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_9_1_1_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_41_0, 
                      	        		"STRING_S", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleSignal2346); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_9_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1673:1: ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1674:1: (lv_hostCombineOperator_43_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1674:1: (lv_hostCombineOperator_43_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1675:3: lv_hostCombineOperator_43_0= RULE_STRING_S
                    {
                    lv_hostCombineOperator_43_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleSignal2363); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_9_1_3_0(), "hostCombineOperator"); 
                      		
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
                      	        		lv_hostCombineOperator_43_0, 
                      	        		"STRING_S", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1705:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1706:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1707:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2406);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2416); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1714:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_4_0=null;
        Token lv_initialValue_6_0=null;
        Token lv_name_7_0=null;
        Token lv_initialValue_9_0=null;
        Token lv_name_12_0=null;
        Token lv_hostType_14_0=null;
        Token lv_name_15_0=null;
        Token lv_initialValue_17_0=null;
        Token lv_hostType_19_0=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_type_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1719:6: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )
            int alt14=6;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_STRING_S) ) {
                        alt14=5;
                    }
                    else if ( ((LA14_2>=47 && LA14_2<=52)) ) {
                        alt14=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_STRING_D) ) {
                        int LA14_7 = input.LA(4);

                        if ( (LA14_7==17) ) {
                            int LA14_8 = input.LA(5);

                            if ( (LA14_8==RULE_STRING_S) ) {
                                alt14=6;
                            }
                            else if ( ((LA14_8>=47 && LA14_8<=52)) ) {
                                alt14=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_7==EOF||(LA14_7>=19 && LA14_7<=20)) ) {
                            alt14=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 19:
                case 20:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1720:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1720:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1721:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1721:1: (lv_name_0_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1722:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2458); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
                      		
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
                      	        		lv_name_0_0, 
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
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1745:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1745:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1745:7: ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1745:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1746:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1746:1: (lv_name_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1747:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2487); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                      		
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

                    match(input,17,FOLLOW_17_in_ruleVariable2502); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1773:1: ( (lv_type_3_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1774:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1774:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1775:3: lv_type_3_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable2523);
                    lv_type_3_0=ruleValueType();
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


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1798:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1798:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1798:7: ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1798:7: ( (lv_name_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1799:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1799:1: (lv_name_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1800:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2548); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                      		
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
                      	        		lv_name_4_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1822:2: ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1822:4: ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleVariable2564); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1826:1: ( (lv_initialValue_6_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1827:1: (lv_initialValue_6_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1827:1: (lv_initialValue_6_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1828:3: lv_initialValue_6_0= RULE_STRING_D
                    {
                    lv_initialValue_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleVariable2581); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_6_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1851:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1851:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1851:7: ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1851:7: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1852:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1852:1: (lv_name_7_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1853:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2612); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                      		
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
                      	        		lv_name_7_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1875:2: ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1875:4: ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleVariable2628); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1879:1: ( (lv_initialValue_9_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1880:1: (lv_initialValue_9_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1880:1: (lv_initialValue_9_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1881:3: lv_initialValue_9_0= RULE_STRING_D
                    {
                    lv_initialValue_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleVariable2645); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_9_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleVariable2661); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_3_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1907:1: ( (lv_type_11_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1908:1: (lv_type_11_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1908:1: (lv_type_11_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1909:3: lv_type_11_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable2682);
                    lv_type_11_0=ruleValueType();
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
                      	        		lv_type_11_0, 
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
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1932:6: ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1932:6: ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1932:7: ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1932:7: ( (lv_name_12_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1933:1: (lv_name_12_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1933:1: (lv_name_12_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1934:3: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2707); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0(), "name"); 
                      		
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
                      	        		lv_name_12_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleVariable2722); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_4_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1960:1: ( (lv_hostType_14_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1961:1: (lv_hostType_14_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1961:1: (lv_hostType_14_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1962:3: lv_hostType_14_0= RULE_STRING_S
                    {
                    lv_hostType_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleVariable2739); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_4_2_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_14_0, 
                      	        		"STRING_S", 
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
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1985:6: ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1985:6: ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1985:7: ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1985:7: ( (lv_name_15_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1986:1: (lv_name_15_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1986:1: (lv_name_15_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:1987:3: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2769); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0(), "name"); 
                      		
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
                      	        		lv_name_15_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2009:2: ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2009:4: ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleVariable2785); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_5_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2013:1: ( (lv_initialValue_17_0= RULE_STRING_D ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2014:1: (lv_initialValue_17_0= RULE_STRING_D )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2014:1: (lv_initialValue_17_0= RULE_STRING_D )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2015:3: lv_initialValue_17_0= RULE_STRING_D
                    {
                    lv_initialValue_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_ruleVariable2802); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_5_1_1_0(), "initialValue"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_17_0, 
                      	        		"STRING_D", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleVariable2818); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_5_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2041:1: ( (lv_hostType_19_0= RULE_STRING_S ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2042:1: (lv_hostType_19_0= RULE_STRING_S )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2042:1: (lv_hostType_19_0= RULE_STRING_S )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2043:3: lv_hostType_19_0= RULE_STRING_S
                    {
                    lv_hostType_19_0=(Token)input.LT(1);
                    match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_ruleVariable2835); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_5_3_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_19_0, 
                      	        		"STRING_S", 
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

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
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


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2075:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2076:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2077:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2879);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2889); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2084:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2089:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2090:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2090:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==21) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||LA15_1==24) ) {
                    alt15=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2090:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2090:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2091:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect2939);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2104:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect2969);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2117:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect2999);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2136:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2137:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2138:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission3034);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission3044); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2145:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2150:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2151:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2151:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2151:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2151:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2152:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2152:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2153:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission3091); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:2: ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                switch ( input.LA(2) ) {
                    case RULE_INT:
                    case 26:
                    case 27:
                    case 46:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        switch ( input.LA(3) ) {
                            case 24:
                            case 26:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt16=1;
                                }
                                break;
                            case 25:
                                {
                                int LA16_9 = input.LA(4);

                                if ( (synpred35()) ) {
                                    alt16=1;
                                }
                                else if ( (synpred36()) ) {
                                    alt16=2;
                                }
                                }
                                break;
                            case 39:
                            case 40:
                                {
                                alt16=2;
                                }
                                break;
                        }

                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(3) ) {
                            case 39:
                            case 40:
                                {
                                alt16=2;
                                }
                                break;
                            case 25:
                                {
                                int LA16_9 = input.LA(4);

                                if ( (synpred35()) ) {
                                    alt16=1;
                                }
                                else if ( (synpred36()) ) {
                                    alt16=2;
                                }
                                }
                                break;
                            case 26:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt16=1;
                                }
                                break;
                        }

                        }
                        break;
                    case 38:
                        {
                        int LA16_6 = input.LA(3);

                        if ( (LA16_6==24) ) {
                            int LA16_10 = input.LA(4);

                            if ( (LA16_10==46) ) {
                                alt16=1;
                            }
                            else if ( (LA16_10==RULE_ID||LA16_10==RULE_STRING) ) {
                                alt16=2;
                            }
                        }
                        }
                        break;
                    case 24:
                        {
                        int LA16_7 = input.LA(3);

                        if ( (synpred35()) ) {
                            alt16=1;
                        }
                        else if ( (synpred36()) ) {
                            alt16=2;
                        }
                        }
                        break;
                    case 30:
                    case 31:
                    case 41:
                        {
                        alt16=2;
                        }
                        break;
                }

            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:5: '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleEmission3103); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2172:1: ( (lv_newValue_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2173:1: (lv_newValue_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2173:1: (lv_newValue_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2174:3: lv_newValue_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleEmission3124);
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

                    match(input,25,FOLLOW_25_in_ruleEmission3134); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleEmission3152); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2205:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2206:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2206:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2207:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission3173);
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

                    match(input,25,FOLLOW_25_in_ruleEmission3183); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2241:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2242:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2243:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3222);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3232); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2250:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2255:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2256:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2256:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2256:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2256:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2257:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2257:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2258:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment3279); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,21,FOLLOW_21_in_ruleAssignment3289); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 26:
            case 27:
            case 46:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA17_4 = input.LA(2);

                if ( (LA17_4==24) ) {
                    int LA17_7 = input.LA(3);

                    if ( (LA17_7==46) ) {
                        alt17=1;
                    }
                    else if ( (LA17_7==RULE_ID||LA17_7==RULE_STRING) ) {
                        alt17=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 5, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 31:
            case 41:
                {
                alt17=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2278:1: (lv_expression_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2278:1: (lv_expression_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2279:3: lv_expression_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAssignment3311);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2302:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2302:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2303:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2303:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2304:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment3338);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2334:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2335:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2336:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect3375);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect3385); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2343:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2348:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2349:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2349:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2349:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2349:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2350:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2350:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2351:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextEffect3427); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2373:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2373:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleTextEffect3443); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2377:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2378:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2378:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2379:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextEffect3460); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleTextEffect3475); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2415:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2416:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2417:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3515);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression3525); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2424:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2429:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2431:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression3574);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2450:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2451:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2452:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression3608);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression3618); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2459:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2464:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2465:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2465:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2466:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression3668);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2477:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2477:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2477:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2478:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2496:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2497:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2497:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2498:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOperator_in_ruleOrExpression3701);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2520:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2522:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression3722);
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
            	    break loop19;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2552:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2553:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2554:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression3760);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression3770); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2561:1: ruleAndExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2566:6: ( (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2567:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2567:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2568:2: this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNotExpression_in_ruleAndExpression3820);
            this_NotExpression_0=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NotExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2579:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2579:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2579:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2580:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2598:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2599:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2599:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2600:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpression3853);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2622:2: ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2623:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2623:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2624:3: lv_subExpressions_3_0= ruleNotExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotExpression_in_ruleAndExpression3874);
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
            	    break loop20;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2654:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2655:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2656:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression3912);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression3922); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2663:1: ruleNotExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2668:6: ( (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2669:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2669:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING||LA21_0==24||(LA21_0>=30 && LA21_0<=31)||LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2669:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2670:2: this_AtomicExpression_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression3972);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2682:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2682:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2682:7: () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2682:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2683:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2696:2: ( (lv_operator_2_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2697:1: (lv_operator_2_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2697:1: (lv_operator_2_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2698:3: lv_operator_2_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression4011);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2720:2: ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2721:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2721:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2722:3: lv_subExpressions_3_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression4032);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2752:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2753:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2754:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4069);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression4079); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2761:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) ;
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
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2766:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case 38:
                {
                alt22=3;
                }
                break;
            case 24:
                {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case 26:
                case 27:
                case 46:
                    {
                    alt22=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA22_6 = input.LA(3);

                    if ( (LA22_6==24||LA22_6==26||(LA22_6>=32 && LA22_6<=37)||(LA22_6>=42 && LA22_6<=44)) ) {
                        alt22=4;
                    }
                    else if ( (LA22_6==25||(LA22_6>=39 && LA22_6<=40)) ) {
                        alt22=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA22_7 = input.LA(3);

                    if ( (LA22_7==25||(LA22_7>=39 && LA22_7<=40)) ) {
                        alt22=5;
                    }
                    else if ( (LA22_7==26||(LA22_7>=32 && LA22_7<=37)||(LA22_7>=42 && LA22_7<=44)) ) {
                        alt22=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA22_8 = input.LA(3);

                    if ( (LA22_8==24) ) {
                        int LA22_11 = input.LA(4);

                        if ( (LA22_11==46) ) {
                            alt22=4;
                        }
                        else if ( (LA22_11==RULE_ID||LA22_11==RULE_STRING) ) {
                            alt22=5;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA22_9 = input.LA(3);

                    if ( (synpred45()) ) {
                        alt22=4;
                    }
                    else if ( (true) ) {
                        alt22=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 30:
                case 31:
                case 41:
                    {
                    alt22=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2767:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2768:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleAtomicExpression4129);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2781:2: this_SignalReference_1= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleAtomicExpression4159);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2793:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2793:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2793:7: () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2793:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2794:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2807:2: ( (lv_operator_3_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2808:1: (lv_operator_3_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2808:1: (lv_operator_3_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2809:3: lv_operator_3_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreOperator_in_ruleAtomicExpression4198);
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

                    match(input,24,FOLLOW_24_in_ruleAtomicExpression4208); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2835:1: ( (lv_subExpressions_5_0= ruleSignalReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2836:1: (lv_subExpressions_5_0= ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2836:1: (lv_subExpressions_5_0= ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2837:3: lv_subExpressions_5_0= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleAtomicExpression4229);
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

                    match(input,25,FOLLOW_25_in_ruleAtomicExpression4239); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:8: '(' this_CompareOperation_8= ruleCompareOperation ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAtomicExpression4257); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleAtomicExpression4282);
                    this_CompareOperation_8=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,25,FOLLOW_25_in_ruleAtomicExpression4291); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2885:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2885:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2885:8: '(' this_BooleanExpression_11= ruleBooleanExpression ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAtomicExpression4309); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression4334);
                    this_BooleanExpression_11=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_11; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,25,FOLLOW_25_in_ruleAtomicExpression4343); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2913:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2914:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2915:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference4380);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference4390); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2922:1: ruleSignalReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2927:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2928:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2928:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2929:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2929:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2930:3: ruleEString
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
            pushFollow(FOLLOW_ruleEString_in_ruleSignalReference4441);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2955:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2956:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2957:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4476);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation4486); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2964:1: ruleCompareOperation returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2969:6: ( (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2971:2: this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation4536);
            this_ValuedExpression_0=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2982:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2982:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2982:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2983:2: 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3001:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3002:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3002:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3003:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation4569);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3025:2: ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3026:1: (lv_subExpressions_3_0= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3026:1: (lv_subExpressions_3_0= ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3027:3: lv_subExpressions_3_0= ruleValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation4590);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3057:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3058:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3059:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4627);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression4637); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3066:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3071:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3073:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression4686);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3092:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3093:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3094:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression4720);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression4730); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3101:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3106:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3107:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3107:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3108:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4780);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3119:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3119:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3119:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3120:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3138:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3139:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3139:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3140:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression4813);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3162:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3163:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3163:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3164:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4834);
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
            	    break loop23;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3194:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3195:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3196:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression4872);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression4882); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3203:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3208:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3209:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3209:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3210:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression4932);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3221:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3221:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3221:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3222:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3240:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3241:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3241:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3242:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression4965);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3264:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3265:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3265:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3266:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression4986);
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
            	    break loop24;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3296:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3297:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3298:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression5024);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression5034); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3305:1: ruleMultExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3310:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3311:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3311:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3312:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleMultExpression5084);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3323:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3323:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3323:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3324:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3342:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3343:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3343:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3344:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression5117);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3366:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3367:1: (lv_subExpressions_3_0= ruleModExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3367:1: (lv_subExpressions_3_0= ruleModExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3368:3: lv_subExpressions_3_0= ruleModExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModExpression_in_ruleMultExpression5138);
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
            	    break loop25;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3398:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3399:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3400:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression5176);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression5186); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3407:1: ruleModExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3412:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3413:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3413:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3414:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5236);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3425:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3425:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3425:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3426:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3444:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3445:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3445:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3446:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression5269);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3468:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3469:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3469:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3470:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5290);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3500:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3501:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3502:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5328);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression5338); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3509:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3514:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            int alt27=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_INT) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==EOF||(LA27_2>=25 && LA27_2<=26)||(LA27_2>=32 && LA27_2<=37)||(LA27_2>=42 && LA27_2<=45)) ) {
                        alt27=1;
                    }
                    else if ( (LA27_2==27) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==27) ) {
                    alt27=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==EOF||(LA27_2>=25 && LA27_2<=26)||(LA27_2>=32 && LA27_2<=37)||(LA27_2>=42 && LA27_2<=45)) ) {
                    alt27=1;
                }
                else if ( (LA27_2==27) ) {
                    alt27=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
                {
                int LA27_4 = input.LA(2);

                if ( (synpred52()) ) {
                    alt27=3;
                }
                else if ( (true) ) {
                    alt27=8;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            case 46:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            case 24:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    int LA27_11 = input.LA(3);

                    if ( (LA27_11==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 27:
                            {
                            int LA27_13 = input.LA(5);

                            if ( (LA27_13==RULE_INT) ) {
                                switch ( input.LA(6) ) {
                                case 28:
                                    {
                                    int LA27_25 = input.LA(7);

                                    if ( (LA27_25==26) ) {
                                        int LA27_31 = input.LA(8);

                                        if ( (LA27_31==RULE_INT) ) {
                                            int LA27_32 = input.LA(9);

                                            if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                                alt27=7;
                                            }
                                            else if ( (LA27_32==45) ) {
                                                alt27=6;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA27_25==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 25, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 29:
                                    {
                                    int LA27_26 = input.LA(7);

                                    if ( (LA27_26==26) ) {
                                        int LA27_31 = input.LA(8);

                                        if ( (LA27_31==RULE_INT) ) {
                                            int LA27_32 = input.LA(9);

                                            if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                                alt27=7;
                                            }
                                            else if ( (LA27_32==45) ) {
                                                alt27=6;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA27_26==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 26, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 45:
                                    {
                                    alt27=6;
                                    }
                                    break;
                                case 25:
                                case 26:
                                case 42:
                                case 43:
                                case 44:
                                    {
                                    alt27=7;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 21, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 13, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 25:
                        case 26:
                        case 42:
                        case 43:
                        case 44:
                            {
                            alt27=7;
                            }
                            break;
                        case 45:
                            {
                            alt27=6;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 12, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA27_11==27) ) {
                        int LA27_13 = input.LA(4);

                        if ( (LA27_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 28:
                                {
                                int LA27_25 = input.LA(6);

                                if ( (LA27_25==26) ) {
                                    int LA27_31 = input.LA(7);

                                    if ( (LA27_31==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA27_25==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 29:
                                {
                                int LA27_26 = input.LA(6);

                                if ( (LA27_26==26) ) {
                                    int LA27_31 = input.LA(7);

                                    if ( (LA27_31==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA27_26==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 45:
                                {
                                alt27=6;
                                }
                                break;
                            case 25:
                            case 26:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt27=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    switch ( input.LA(3) ) {
                    case 27:
                        {
                        int LA27_13 = input.LA(4);

                        if ( (LA27_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 28:
                                {
                                int LA27_25 = input.LA(6);

                                if ( (LA27_25==26) ) {
                                    int LA27_31 = input.LA(7);

                                    if ( (LA27_31==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA27_25==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 29:
                                {
                                int LA27_26 = input.LA(6);

                                if ( (LA27_26==26) ) {
                                    int LA27_31 = input.LA(7);

                                    if ( (LA27_31==RULE_INT) ) {
                                        int LA27_32 = input.LA(8);

                                        if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                            alt27=7;
                                        }
                                        else if ( (LA27_32==45) ) {
                                            alt27=6;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA27_26==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 45:
                                {
                                alt27=6;
                                }
                                break;
                            case 25:
                            case 26:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt27=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                    case 26:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt27=7;
                        }
                        break;
                    case 45:
                        {
                        alt27=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case 27:
                    {
                    int LA27_13 = input.LA(3);

                    if ( (LA27_13==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 28:
                            {
                            int LA27_25 = input.LA(5);

                            if ( (LA27_25==26) ) {
                                int LA27_31 = input.LA(6);

                                if ( (LA27_31==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA27_25==RULE_INT) ) {
                                int LA27_32 = input.LA(6);

                                if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                    alt27=7;
                                }
                                else if ( (LA27_32==45) ) {
                                    alt27=6;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 25, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 29:
                            {
                            int LA27_26 = input.LA(5);

                            if ( (LA27_26==26) ) {
                                int LA27_31 = input.LA(6);

                                if ( (LA27_31==RULE_INT) ) {
                                    int LA27_32 = input.LA(7);

                                    if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                        alt27=7;
                                    }
                                    else if ( (LA27_32==45) ) {
                                        alt27=6;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA27_26==RULE_INT) ) {
                                int LA27_32 = input.LA(6);

                                if ( ((LA27_32>=25 && LA27_32<=26)||(LA27_32>=42 && LA27_32<=44)) ) {
                                    alt27=7;
                                }
                                else if ( (LA27_32==45) ) {
                                    alt27=6;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 26, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 45:
                            {
                            alt27=6;
                            }
                            break;
                        case 25:
                        case 26:
                        case 42:
                        case 43:
                        case 44:
                            {
                            alt27=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 21, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 45:
                        {
                        alt27=6;
                        }
                        break;
                    case 24:
                        {
                        int LA27_22 = input.LA(4);

                        if ( (LA27_22==RULE_ID) ) {
                            int LA27_27 = input.LA(5);

                            if ( (LA27_27==25) ) {
                                int LA27_33 = input.LA(6);

                                if ( ((LA27_33>=25 && LA27_33<=26)||(LA27_33>=42 && LA27_33<=44)) ) {
                                    alt27=7;
                                }
                                else if ( (LA27_33==45) ) {
                                    alt27=6;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 33, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 27, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                    case 26:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt27=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 14, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    int LA27_15 = input.LA(3);

                    if ( (LA27_15==45) ) {
                        alt27=6;
                    }
                    else if ( ((LA27_15>=25 && LA27_15<=26)||(LA27_15>=42 && LA27_15<=44)) ) {
                        alt27=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA27_16 = input.LA(3);

                    if ( (LA27_16==24) ) {
                        int LA27_23 = input.LA(4);

                        if ( (LA27_23==RULE_STRING) ) {
                            int LA27_28 = input.LA(5);

                            if ( (LA27_28==25) ) {
                                int LA27_34 = input.LA(6);

                                if ( (LA27_34==45) ) {
                                    alt27=6;
                                }
                                else if ( ((LA27_34>=25 && LA27_34<=26)||(LA27_34>=42 && LA27_34<=44)) ) {
                                    alt27=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 28, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA27_23==RULE_ID) ) {
                            int LA27_29 = input.LA(5);

                            if ( (LA27_29==25) ) {
                                int LA27_34 = input.LA(6);

                                if ( (LA27_34==45) ) {
                                    alt27=6;
                                }
                                else if ( ((LA27_34>=25 && LA27_34<=26)||(LA27_34>=42 && LA27_34<=44)) ) {
                                    alt27=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 29, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 23, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA27_17 = input.LA(3);

                    if ( (LA27_17==24) ) {
                        int LA27_24 = input.LA(4);

                        if ( (LA27_24==46) ) {
                            int LA27_30 = input.LA(5);

                            if ( (LA27_30==24) ) {
                                int LA27_35 = input.LA(6);

                                if ( (LA27_35==RULE_STRING) ) {
                                    int LA27_36 = input.LA(7);

                                    if ( (LA27_36==25) ) {
                                        int LA27_38 = input.LA(8);

                                        if ( (LA27_38==25) ) {
                                            int LA27_39 = input.LA(9);

                                            if ( ((LA27_39>=25 && LA27_39<=26)||(LA27_39>=42 && LA27_39<=44)) ) {
                                                alt27=7;
                                            }
                                            else if ( (LA27_39==45) ) {
                                                alt27=6;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 36, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA27_35==RULE_ID) ) {
                                    int LA27_37 = input.LA(7);

                                    if ( (LA27_37==25) ) {
                                        int LA27_38 = input.LA(8);

                                        if ( (LA27_38==25) ) {
                                            int LA27_39 = input.LA(9);

                                            if ( ((LA27_39>=25 && LA27_39<=26)||(LA27_39>=42 && LA27_39<=44)) ) {
                                                alt27=7;
                                            }
                                            else if ( (LA27_39==45) ) {
                                                alt27=6;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 35, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA27_18 = input.LA(3);

                    if ( (synpred55()) ) {
                        alt27=6;
                    }
                    else if ( (synpred56()) ) {
                        alt27=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3515:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3516:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5388);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3529:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5418);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3542:2: this_VariableReference_2= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression5448);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3555:2: this_ValueTestExpression_3= ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression5478);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3568:2: this_PreValueTestExpression_4= rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression5508);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:8: '(' this_DivExpression_6= ruleDivExpression ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAtomicValuedExpression5524); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5549);
                    this_DivExpression_6=ruleDivExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivExpression_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,25,FOLLOW_25_in_ruleAtomicValuedExpression5558); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:8: '(' this_ValuedExpression_9= ruleValuedExpression ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleAtomicValuedExpression5576); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5601);
                    this_ValuedExpression_9=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,25,FOLLOW_25_in_ruleAtomicValuedExpression5610); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3623:2: this_TextExpression_11= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression5642);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3642:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3643:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3644:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression5677);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression5687); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3651:1: ruleDivExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3656:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3657:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3657:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3658:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5737);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3669:1: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3670:2: 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3688:2: ( (lv_operator_2_0= ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3689:1: (lv_operator_2_0= ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3689:1: (lv_operator_2_0= ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3690:3: lv_operator_2_0= ruleDivOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression5769);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3712:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3713:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3713:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3714:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5790);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3744:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3745:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3746:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference5826);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference5836); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3753:1: ruleVariableReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3758:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3759:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3759:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3760:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3760:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3761:3: ruleEString
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
            pushFollow(FOLLOW_ruleEString_in_ruleVariableReference5887);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3786:1: entryRuleValueTestExpression returns [EObject current=null] : iv_ruleValueTestExpression= ruleValueTestExpression EOF ;
    public final EObject entryRuleValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3787:2: (iv_ruleValueTestExpression= ruleValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3788:2: iv_ruleValueTestExpression= ruleValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression5922);
            iv_ruleValueTestExpression=ruleValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueTestExpression5932); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3795:1: ruleValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) ;
    public final EObject ruleValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3800:6: ( ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3801:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3801:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3801:2: ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3801:2: ( (lv_operator_0_0= ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3802:1: (lv_operator_0_0= ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3802:1: (lv_operator_0_0= ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3803:3: lv_operator_0_0= ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression5978);
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

            match(input,24,FOLLOW_24_in_ruleValueTestExpression5988); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3829:1: ( (lv_subExpressions_2_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3830:1: (lv_subExpressions_2_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3830:1: (lv_subExpressions_2_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3831:3: lv_subExpressions_2_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValueTestExpression6009);
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

            match(input,25,FOLLOW_25_in_ruleValueTestExpression6019); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3865:1: entryRulePreValueTestExpression returns [EObject current=null] : iv_rulePreValueTestExpression= rulePreValueTestExpression EOF ;
    public final EObject entryRulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3866:2: (iv_rulePreValueTestExpression= rulePreValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3867:2: iv_rulePreValueTestExpression= rulePreValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression6055);
            iv_rulePreValueTestExpression=rulePreValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreValueTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueTestExpression6065); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3874:1: rulePreValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) ;
    public final EObject rulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3879:6: ( ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3880:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3880:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3880:2: ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3880:2: ( (lv_operator_0_0= rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3881:1: (lv_operator_0_0= rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3881:1: (lv_operator_0_0= rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3882:3: lv_operator_0_0= rulePreOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePreOperator_in_rulePreValueTestExpression6111);
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

            match(input,24,FOLLOW_24_in_rulePreValueTestExpression6121); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3908:1: ( (lv_subExpressions_2_0= ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3909:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3909:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3910:3: lv_subExpressions_2_0= ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression6142);
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

            match(input,25,FOLLOW_25_in_rulePreValueTestExpression6152); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3944:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3945:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3946:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression6188);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression6198); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3953:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3958:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3959:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3959:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3959:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3959:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3960:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3960:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3961:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextExpression6240); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3983:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3983:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleTextExpression6256); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3987:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3988:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3988:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3989:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextExpression6273); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleTextExpression6288); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4023:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4024:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4025:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue6326);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue6336); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4032:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4037:6: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4038:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4038:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4039:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4039:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4040:3: lv_value_0_0= ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntValue6381);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4070:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4071:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4072:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue6416);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue6426); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4079:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4084:6: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4085:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4085:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4086:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4086:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4087:3: lv_value_0_0= ruleEFloatObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue6471);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4117:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4118:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4119:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6506);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue6516); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4126:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4131:6: ( ( (lv_value_0_0= ruleEBooleanObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4132:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4132:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4133:1: (lv_value_0_0= ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4133:1: (lv_value_0_0= ruleEBooleanObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4134:3: lv_value_0_0= ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_ruleBooleanValue6561);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4164:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4165:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4166:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEIntegerObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject6597);
            iv_ruleEIntegerObject=ruleEIntegerObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEIntegerObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject6608); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4173:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4178:6: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4179:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4179:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4179:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4179:2: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4180:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleEIntegerObject6647); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject6664); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4200:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4201:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4202:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEFloatObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject6710);
            iv_ruleEFloatObject=ruleEFloatObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEFloatObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject6721); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4209:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4214:6: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4215:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4215:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4215:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4215:2: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4216:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleEFloatObject6760); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4221:3: (this_INT_1= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4221:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject6778); if (failed) return current;
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
            match(input,27,FOLLOW_27_in_ruleEFloatObject6798); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2(), null); 
                  
            }
            this_INT_3=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject6813); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4241:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=28 && LA34_0<=29)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4241:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4241:2: (kw= 'E' | kw= 'e' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==28) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==29) ) {
                        alt32=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4241:2: (kw= 'E' | kw= 'e' )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4242:2: kw= 'E'
                            {
                            kw=(Token)input.LT(1);
                            match(input,28,FOLLOW_28_in_ruleEFloatObject6833); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4249:2: kw= 'e'
                            {
                            kw=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleEFloatObject6852); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4254:2: (kw= '-' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==26) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4255:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleEFloatObject6867); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject6884); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4275:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4276:2: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4277:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEBooleanObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject6932);
            iv_ruleEBooleanObject=ruleEBooleanObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEBooleanObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBooleanObject6943); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4284:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4289:6: ( (kw= 'true' | kw= 'false' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4290:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4290:1: (kw= 'true' | kw= 'false' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            else if ( (LA35_0==31) ) {
                alt35=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4290:1: (kw= 'true' | kw= 'false' )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4291:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleEBooleanObject6981); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4298:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleEBooleanObject7000); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4311:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4312:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4313:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString7041);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString7052); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4320:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4325:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4326:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4326:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString7092); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4334:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString7118); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4349:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4353:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt37=1;
                }
                break;
            case 33:
                {
                alt37=2;
                }
                break;
            case 34:
                {
                alt37=3;
                }
                break;
            case 35:
                {
                alt37=4;
                }
                break;
            case 36:
                {
                alt37=5;
                }
                break;
            case 37:
                {
                alt37=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4354:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:4: '='
                    {
                    match(input,32,FOLLOW_32_in_ruleCompareOperator7175); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4360:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4360:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4360:8: '<'
                    {
                    match(input,33,FOLLOW_33_in_ruleCompareOperator7190); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4366:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4366:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4366:8: '<='
                    {
                    match(input,34,FOLLOW_34_in_ruleCompareOperator7205); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:8: '>'
                    {
                    match(input,35,FOLLOW_35_in_ruleCompareOperator7220); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:8: '>='
                    {
                    match(input,36,FOLLOW_36_in_ruleCompareOperator7235); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4384:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4384:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4384:8: '<>'
                    {
                    match(input,37,FOLLOW_37_in_ruleCompareOperator7250); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4394:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4398:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:3: 'pre'
            {
            match(input,38,FOLLOW_38_in_rulePreOperator7292); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4409:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4413:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:3: 'or'
            {
            match(input,39,FOLLOW_39_in_ruleOrOperator7333); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4424:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4428:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:3: 'and'
            {
            match(input,40,FOLLOW_40_in_ruleAndOperator7374); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4439:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4443:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4444:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4444:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4444:3: 'not'
            {
            match(input,41,FOLLOW_41_in_ruleNotOperator7415); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4454:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4458:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:3: '+'
            {
            match(input,42,FOLLOW_42_in_ruleAddOperator7456); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4469:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4473:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:3: '-'
            {
            match(input,26,FOLLOW_26_in_ruleSubOperator7497); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4484:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4488:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4489:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4489:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4489:3: '*'
            {
            match(input,43,FOLLOW_43_in_ruleMultOperator7538); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4499:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4503:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:3: 'mod'
            {
            match(input,44,FOLLOW_44_in_ruleModOperator7579); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4514:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4518:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4519:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4519:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4519:3: '/'
            {
            match(input,45,FOLLOW_45_in_ruleDivOperator7620); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4529:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4533:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4534:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4534:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4534:3: '?'
            {
            match(input,46,FOLLOW_46_in_ruleValueTestOperator7661); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4544:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4548:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4549:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4549:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 48:
                {
                alt38=2;
                }
                break;
            case 49:
                {
                alt38=3;
                }
                break;
            case 50:
                {
                alt38=4;
                }
                break;
            case 51:
                {
                alt38=5;
                }
                break;
            case 52:
                {
                alt38=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4549:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4549:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4549:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4549:4: 'PURE'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType7703); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4555:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4555:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4555:8: 'BOOL'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType7718); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4561:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4561:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4561:8: 'UNSIGNED'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType7733); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4567:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4567:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4567:8: 'INT'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType7748); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4573:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4573:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4573:8: 'FLOAT'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType7763); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4579:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4579:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4579:8: 'HOST'
                    {
                    match(input,52,FOLLOW_52_in_ruleValueType7778); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4589:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4593:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4594:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4594:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt39=1;
                }
                break;
            case 42:
                {
                alt39=2;
                }
                break;
            case 43:
                {
                alt39=3;
                }
                break;
            case 54:
                {
                alt39=4;
                }
                break;
            case 55:
                {
                alt39=5;
                }
                break;
            case 39:
                {
                alt39=6;
                }
                break;
            case 40:
                {
                alt39=7;
                }
                break;
            case 56:
                {
                alt39=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4594:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4594:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4594:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4594:4: 'NONE'
                    {
                    match(input,53,FOLLOW_53_in_ruleCombineOperator7821); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4600:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4600:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4600:8: '+'
                    {
                    match(input,42,FOLLOW_42_in_ruleCombineOperator7836); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4606:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4606:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4606:8: '*'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator7851); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4612:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4612:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4612:8: 'max'
                    {
                    match(input,54,FOLLOW_54_in_ruleCombineOperator7866); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4618:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4618:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4618:8: 'min'
                    {
                    match(input,55,FOLLOW_55_in_ruleCombineOperator7881); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4624:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4624:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4624:8: 'or'
                    {
                    match(input,39,FOLLOW_39_in_ruleCombineOperator7896); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:8: 'and'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator7911); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4636:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4636:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4636:8: 'host'
                    {
                    match(input,56,FOLLOW_56_in_ruleCombineOperator7926); if (failed) return current;
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

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( ( '(' ( ( ruleValuedExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:5: '(' ( ( ruleValuedExpression ) ) ')'
        {
        match(input,24,FOLLOW_24_in_synpred353103); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2172:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2173:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2173:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2174:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred353124);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,25,FOLLOW_25_in_synpred353134); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:6: ( ( '(' ( ( ruleBooleanExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2201:8: '(' ( ( ruleBooleanExpression ) ) ')'
        {
        match(input,24,FOLLOW_24_in_synpred363152); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2205:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2206:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2206:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2207:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred363173);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,25,FOLLOW_25_in_synpred363183); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:2: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:2: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:2: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2278:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2278:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2279:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred373311);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:6: ( ( '(' ruleCompareOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:6: ( '(' ruleCompareOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:6: ( '(' ruleCompareOperation ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:8: '(' ruleCompareOperation ')'
        {
        match(input,24,FOLLOW_24_in_synpred454257); if (failed) return ;
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred454282);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;
        match(input,25,FOLLOW_25_in_synpred454291); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3542:2: ( ruleVariableReference )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3542:2: ruleVariableReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleVariableReference_in_synpred525448);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:6: ( ( '(' ruleDivExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:6: ( '(' ruleDivExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:6: ( '(' ruleDivExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3580:8: '(' ruleDivExpression ')'
        {
        match(input,24,FOLLOW_24_in_synpred555524); if (failed) return ;
        pushFollow(FOLLOW_ruleDivExpression_in_synpred555549);
        ruleDivExpression();
        _fsp--;
        if (failed) return ;
        match(input,25,FOLLOW_25_in_synpred555558); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3601:8: '(' ruleValuedExpression ')'
        {
        match(input,24,FOLLOW_24_in_synpred565576); if (failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred565601);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,25,FOLLOW_25_in_synpred565610); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred56

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
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
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
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend137 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_13_in_ruleStateExtend154 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStateExtend164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend185 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_14_in_ruleStateExtend203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend224 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_13_in_ruleStateExtend242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend263 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_15_in_ruleStateExtend281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend302 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_16_in_ruleStateExtend320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleStateExtend341 = new BitSet(new long[]{0x000000000001E012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegionSignalDec436 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec446 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleRegionSignalDec458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec479 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec511 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15_in_ruleRegionSignalDec531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec552 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec584 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec600 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRegionSignalDec610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec631 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec663 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec683 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRegionSignalDec693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec714 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec746 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleRegionSignalDec761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables854 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleVariables865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables886 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleVariables899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals992 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleSignals1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals1024 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleSignals1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1130 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleInputSignals1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1162 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleInputSignals1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1268 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleOutputSignals1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1300 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleOutputSignals1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1406 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleInOutputSignals1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1438 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleInOutputSignals1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1568 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSignal1583 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1629 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1726 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSignal1742 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1788 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1821 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSignal1838 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1859 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal1869 = new BitSet(new long[]{0x01E00D8000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1916 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSignal1931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2011 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSignal2027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2074 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSignal2124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2141 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal2156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSignal2220 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2241 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal2251 = new BitSet(new long[]{0x01E00D8000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2298 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSignal2314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2331 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal2346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariable2502 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2548 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2612 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2645 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariable2661 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2707 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariable2722 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVariable2818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3091 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleEmission3103 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleEmission3124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmission3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEmission3152 = new BitSet(new long[]{0x00000240C1000090L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission3173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmission3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3279 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssignment3289 = new BitSet(new long[]{0x00004240CD000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAssignment3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextEffect3427 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTextEffect3443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3460 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTextEffect3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression3608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3668 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression3701 = new BitSet(new long[]{0x00000240C1000090L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3722 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression3760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression3820 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression3853 = new BitSet(new long[]{0x00000240C1000090L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression3874 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression3912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression4011 = new BitSet(new long[]{0x00000040C1000090L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression4069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleAtomicExpression4198 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicExpression4208 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression4229 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicExpression4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomicExpression4257 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAtomicExpression4282 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicExpression4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomicExpression4309 = new BitSet(new long[]{0x00000240C1000090L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression4334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicExpression4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference4380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSignalReference4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation4536 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4569 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4780 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4813 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4834 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4932 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression4965 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4986 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression5024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression5084 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression5117 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression5138 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression5176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5236 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression5269 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomicValuedExpression5524 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicValuedExpression5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAtomicValuedExpression5576 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5601 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAtomicValuedExpression5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5737 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5769 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference5826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueTestExpression5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression5978 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValueTestExpression5988 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValueTestExpression6009 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValueTestExpression6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression6055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueTestExpression6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rulePreValueTestExpression6111 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePreValueTestExpression6121 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression6142 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePreValueTestExpression6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextExpression6240 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTextExpression6256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6273 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTextExpression6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntValue6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue6416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_ruleBooleanValue6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject6597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEIntegerObject6647 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject6710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEFloatObject6760 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6778 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEFloatObject6798 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6813 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleEFloatObject6833 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_29_in_ruleEFloatObject6852 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_26_in_ruleEFloatObject6867 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject6932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBooleanObject6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEBooleanObject6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEBooleanObject7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareOperator7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCompareOperator7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOperator7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompareOperator7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOperator7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCompareOperator7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePreOperator7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOrOperator7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAndOperator7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNotOperator7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAddOperator7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSubOperator7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultOperator7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModOperator7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDivOperator7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueTestOperator7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCombineOperator7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCombineOperator7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator7866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCombineOperator7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCombineOperator7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred353103 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred353124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred353134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred363152 = new BitSet(new long[]{0x00000240C1000090L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred363173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred363183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred373311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred454257 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred454282 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred454291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred525448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred555524 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleDivExpression_in_synpred555549 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred555558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred565576 = new BitSet(new long[]{0x000040400D000190L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred565601 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred565610 = new BitSet(new long[]{0x0000000000000002L});

}