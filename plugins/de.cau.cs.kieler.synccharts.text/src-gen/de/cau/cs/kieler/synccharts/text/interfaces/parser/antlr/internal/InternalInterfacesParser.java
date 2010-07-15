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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_D", "RULE_STRING_S", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "'variable'", "':'", "'var'", "','", "';'", "':='", "'combine'", "'with'", "'('", "')'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'not'", "'pre'", "'or'", "'and'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'max'", "'min'", "'host'"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_STRING_S=6;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING_D=5;

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
                case 15:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==16) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_ID) ) {
                        alt1=4;
                    }


                    }
                    break;
                case 16:
                    {
                    alt1=3;
                    }
                    break;
                case 17:
                    {
                    alt1=5;
                    }
                    break;
                case 18:
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
            	    match(input,15,FOLLOW_15_in_ruleStateExtend154); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_1_0(), null); 
            	          
            	    }
            	    match(input,16,FOLLOW_16_in_ruleStateExtend164); if (failed) return current;
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
            	    match(input,16,FOLLOW_16_in_ruleStateExtend203); if (failed) return current;
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
            	    match(input,15,FOLLOW_15_in_ruleStateExtend242); if (failed) return current;
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
            	    match(input,17,FOLLOW_17_in_ruleStateExtend281); if (failed) return current;
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
            	    match(input,18,FOLLOW_18_in_ruleStateExtend320); if (failed) return current;
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

            match(input,19,FOLLOW_19_in_ruleRegionSignalDec446); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
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
                    match(input,20,FOLLOW_20_in_ruleRegionSignalDec458); if (failed) return current;
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

                        if ( (LA2_0==21) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_ID) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:344:4: ',' ( (lv_vars_5_0= ruleVariable ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec490); if (failed) return current;
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
                    match(input,17,FOLLOW_17_in_ruleRegionSignalDec531); if (failed) return current;
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

                        if ( (LA3_0==21) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:401:4: ',' ( (lv_signals_9_0= ruleSignal ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec563); if (failed) return current;
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

                if ( (LA7_0==21) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==20) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==17) ) {
                        alt7=2;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:429:9: ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    {
            	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0(), null); 
            	          
            	    }
            	    match(input,20,FOLLOW_20_in_ruleRegionSignalDec610); if (failed) return current;
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

            	        if ( (LA5_0==21) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:461:4: ',' ( (lv_vars_14_0= ruleVariable ) )
            	    	    {
            	    	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec642); if (failed) return current;
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
            	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec683); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0(), null); 
            	          
            	    }
            	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec693); if (failed) return current;
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

            	        if ( (LA6_0==21) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:522:4: ',' ( (lv_signals_19_0= ruleSignal ) )
            	    	    {
            	    	    match(input,21,FOLLOW_21_in_ruleRegionSignalDec725); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleRegionSignalDec761); if (failed) return current;
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

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:601:4: ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleVariables865); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleVariables899); if (failed) return current;
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

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:680:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleSignals1003); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleSignals1037); if (failed) return current;
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

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:759:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleInputSignals1141); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleInputSignals1175); if (failed) return current;
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

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:838:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleOutputSignals1279); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleOutputSignals1313); if (failed) return current;
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

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:917:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleInOutputSignals1417); if (failed) return current;
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

            match(input,22,FOLLOW_22_in_ruleInOutputSignals1451); if (failed) return current;
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
                case 23:
                    {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING_D) ) {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            int LA13_11 = input.LA(5);

                            if ( (LA13_11==RULE_STRING_S) ) {
                                alt13=8;
                            }
                            else if ( ((LA13_11>=44 && LA13_11<=49)) ) {
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
                        case 19:
                            {
                            int LA13_12 = input.LA(5);

                            if ( (LA13_12==RULE_STRING_S) ) {
                                alt13=7;
                            }
                            else if ( ((LA13_12>=44 && LA13_12<=49)) ) {
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
                        case 21:
                        case 22:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING_S) ) {
                        alt13=10;
                    }
                    else if ( ((LA13_3>=44 && LA13_3<=49)) ) {
                        alt13=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_STRING_S) ) {
                        alt13=6;
                    }
                    else if ( ((LA13_4>=44 && LA13_4<=49)) ) {
                        alt13=2;
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
                case 21:
                case 22:
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

                    match(input,19,FOLLOW_19_in_ruleSignal1583); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleSignal1645); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleSignal1709); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleSignal1742); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleSignal1804); if (failed) return current;
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
                    match(input,24,FOLLOW_24_in_ruleSignal1838); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleSignal1869); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleSignal1931); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleSignal1994); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleSignal2027); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleSignal2090); if (failed) return current;
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
                    match(input,24,FOLLOW_24_in_ruleSignal2124); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleSignal2156); if (failed) return current;
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
                    match(input,24,FOLLOW_24_in_ruleSignal2220); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleSignal2251); if (failed) return current;
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
                    match(input,24,FOLLOW_24_in_ruleSignal2314); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleSignal2346); if (failed) return current;
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
                case 23:
                    {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_STRING_D) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==19) ) {
                            int LA14_8 = input.LA(5);

                            if ( (LA14_8==RULE_STRING_S) ) {
                                alt14=6;
                            }
                            else if ( ((LA14_8>=44 && LA14_8<=49)) ) {
                                alt14=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_5==EOF||(LA14_5>=21 && LA14_5<=22)) ) {
                            alt14=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_STRING_S) ) {
                        alt14=5;
                    }
                    else if ( ((LA14_3>=44 && LA14_3<=49)) ) {
                        alt14=2;
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
                case 21:
                case 22:
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

                    match(input,19,FOLLOW_19_in_ruleVariable2502); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleVariable2564); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleVariable2628); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleVariable2661); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleVariable2722); if (failed) return current;
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
                    match(input,23,FOLLOW_23_in_ruleVariable2785); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleVariable2818); if (failed) return current;
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

                if ( (LA15_1==23) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||LA15_1==26) ) {
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

            if ( (LA16_0==26) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred35()) ) {
                    alt16=1;
                }
                else if ( (synpred36()) ) {
                    alt16=2;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2168:5: '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleEmission3103); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleEmission3134); if (failed) return current;
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
                    match(input,26,FOLLOW_26_in_ruleEmission3152); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleEmission3183); if (failed) return current;
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

            match(input,23,FOLLOW_23_in_ruleAssignment3289); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA17_1 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
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
            case RULE_FLOAT:
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
            case 28:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
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
            case RULE_STRING:
                {
                int LA17_6 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 6, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA17_7 = input.LA(2);

                if ( (synpred37()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2277:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 17, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 35:
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

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2373:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleTextEffect3443); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleTextEffect3475); if (failed) return current;
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


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2413:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2414:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2415:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference3513);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference3523); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2422:1: ruleSignalReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2427:6: ( ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2428:1: ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2428:1: ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2428:2: ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2428:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2429:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2429:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2430:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference3570); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2445:2: ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred41()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2445:4: '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleSignalReference3581); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalReferenceAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:1: ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||(LA20_0>=RULE_STRING && LA20_0<=RULE_BOOLEAN)||LA20_0==26||LA20_0==28||(LA20_0>=35 && LA20_0<=36)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:2: ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:2: ( (lv_subExpressions_2_0= ruleExpression ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2450:1: (lv_subExpressions_2_0= ruleExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2450:1: (lv_subExpressions_2_0= ruleExpression )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2451:3: lv_subExpressions_2_0= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleSignalReference3603);
                    	    lv_subExpressions_2_0=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"subExpressions",
                    	      	        		lv_subExpressions_2_0, 
                    	      	        		"Expression", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2473:2: ( ',' )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==21) ) {
                    	        alt19=1;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2473:4: ','
                    	            {
                    	            match(input,21,FOLLOW_21_in_ruleSignalReference3614); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getSignalReferenceAccess().getCommaKeyword_1_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_ruleSignalReference3628); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalReferenceAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2489:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2490:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2491:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference3666);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference3676); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2498:1: ruleVariableReference returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2503:6: ( ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2504:1: ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2504:1: ( ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2504:2: ( ( RULE_ID ) ) ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2504:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2505:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2505:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2506:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference3723); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:2: ( '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:4: '(' ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )* ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleVariableReference3734); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableReferenceAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:1: ( ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )? )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID||(LA23_0>=RULE_STRING && LA23_0<=RULE_BOOLEAN)||LA23_0==26||LA23_0==28||(LA23_0>=35 && LA23_0<=36)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:2: ( (lv_subExpressions_2_0= ruleExpression ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:2: ( (lv_subExpressions_2_0= ruleExpression ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2526:1: (lv_subExpressions_2_0= ruleExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2526:1: (lv_subExpressions_2_0= ruleExpression )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2527:3: lv_subExpressions_2_0= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleVariableReference3756);
                    	    lv_subExpressions_2_0=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"subExpressions",
                    	      	        		lv_subExpressions_2_0, 
                    	      	        		"Expression", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2549:2: ( ',' )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==21) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2549:4: ','
                    	            {
                    	            match(input,21,FOLLOW_21_in_ruleVariableReference3767); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getVariableReferenceAccess().getCommaKeyword_1_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,27,FOLLOW_27_in_ruleVariableReference3781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableReferenceAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2565:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2566:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2567:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3819);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3829); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2574:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2579:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2580:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2580:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2581:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2581:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2582:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue3870); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2612:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2613:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2614:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3910);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3920); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2621:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2626:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2627:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2627:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2628:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2628:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2629:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue3961); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2659:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2660:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4001);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue4011); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2668:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2674:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2674:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2675:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2675:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2676:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue4052); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2708:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2709:2: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2710:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation4094);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation4104); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2717:1: ruleValOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2722:6: ( ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2723:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2723:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2723:2: ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2723:2: ( (lv_operator_0_0= ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2724:1: (lv_operator_0_0= ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2724:1: (lv_operator_0_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2725:3: lv_operator_0_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation4150);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2747:2: ( (lv_subExpressions_1_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2748:1: (lv_subExpressions_1_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2748:1: (lv_subExpressions_1_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2749:3: lv_subExpressions_1_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation4171);
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2779:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2780:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2781:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4207);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression4217); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2788:1: ruleValuedExpression returns [EObject current=null] : this_PlusOperation_0= rulePlusOperation ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOperation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2793:6: (this_PlusOperation_0= rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2795:2: this_PlusOperation_0= rulePlusOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getPlusOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValuedExpression4266);
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
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleParanthesedValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2814:1: entryRuleParanthesedValuedExpression returns [EObject current=null] : iv_ruleParanthesedValuedExpression= ruleParanthesedValuedExpression EOF ;
    public final EObject entryRuleParanthesedValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2815:2: (iv_ruleParanthesedValuedExpression= ruleParanthesedValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2816:2: iv_ruleParanthesedValuedExpression= ruleParanthesedValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression4300);
            iv_ruleParanthesedValuedExpression=ruleParanthesedValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValuedExpression4310); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParanthesedValuedExpression


    // $ANTLR start ruleParanthesedValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2823:1: ruleParanthesedValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) ;
    public final EObject ruleParanthesedValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_TextExpression_4 = null;

        EObject this_PlusOperation_6 = null;

        EObject this_DivOperation_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2828:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt25=2;
                }
                break;
            case 28:
                {
                alt25=3;
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            case RULE_STRING:
                {
                alt25=5;
                }
                break;
            case 26:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    int LA25_7 = input.LA(3);

                    if ( (LA25_7==26) ) {
                        int LA25_14 = input.LA(4);

                        if ( (LA25_14==28) ) {
                            int LA25_21 = input.LA(5);

                            if ( (LA25_21==RULE_ID) ) {
                                int LA25_24 = input.LA(6);

                                if ( (LA25_24==26) ) {
                                    int LA25_26 = input.LA(7);

                                    if ( (synpred50()) ) {
                                        alt25=6;
                                    }
                                    else if ( (true) ) {
                                        alt25=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 26, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA25_24==27) ) {
                                    switch ( input.LA(7) ) {
                                    case 43:
                                        {
                                        alt25=7;
                                        }
                                        break;
                                    case 27:
                                        {
                                        int LA25_16 = input.LA(8);

                                        if ( (synpred50()) ) {
                                            alt25=6;
                                        }
                                        else if ( (true) ) {
                                            alt25=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                                            throw nvae;
                                        }
                                        }
                                        break;
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                        {
                                        alt25=6;
                                        }
                                        break;
                                    default:
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 27, input);

                                        throw nvae;
                                    }

                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 24, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 14, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        alt25=7;
                        }
                        break;
                    case 27:
                        {
                        int LA25_16 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt25=6;
                        }
                        else if ( (true) ) {
                            alt25=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        {
                        alt25=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 8, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_FLOAT:
                    {
                    switch ( input.LA(3) ) {
                    case 43:
                        {
                        alt25=7;
                        }
                        break;
                    case 27:
                        {
                        int LA25_16 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt25=6;
                        }
                        else if ( (true) ) {
                            alt25=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        {
                        alt25=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 9, input);

                        throw nvae;
                    }

                    }
                    break;
                case 28:
                    {
                    int LA25_10 = input.LA(3);

                    if ( (LA25_10==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            int LA25_22 = input.LA(5);

                            if ( (synpred50()) ) {
                                alt25=6;
                            }
                            else if ( (true) ) {
                                alt25=7;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 22, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                            {
                            alt25=6;
                            }
                            break;
                        case 27:
                            {
                            int LA25_16 = input.LA(5);

                            if ( (synpred50()) ) {
                                alt25=6;
                            }
                            else if ( (true) ) {
                                alt25=7;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 43:
                            {
                            alt25=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 18, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        int LA25_19 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt25=6;
                        }
                        else if ( (true) ) {
                            alt25=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 19, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        {
                        alt25=6;
                        }
                        break;
                    case 27:
                        {
                        int LA25_16 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt25=6;
                        }
                        else if ( (true) ) {
                            alt25=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        alt25=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        int LA25_20 = input.LA(4);

                        if ( (LA25_20==RULE_ID) ) {
                            int LA25_23 = input.LA(5);

                            if ( (LA25_23==27) ) {
                                switch ( input.LA(6) ) {
                                case 43:
                                    {
                                    alt25=7;
                                    }
                                    break;
                                case 27:
                                    {
                                    int LA25_16 = input.LA(7);

                                    if ( (synpred50()) ) {
                                        alt25=6;
                                    }
                                    else if ( (true) ) {
                                        alt25=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                    {
                                    alt25=6;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 25, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 23, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 20, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        {
                        alt25=6;
                        }
                        break;
                    case 27:
                        {
                        int LA25_16 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt25=6;
                        }
                        else if ( (true) ) {
                            alt25=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 43:
                        {
                        alt25=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case 26:
                    {
                    int LA25_13 = input.LA(3);

                    if ( (synpred50()) ) {
                        alt25=6;
                    }
                    else if ( (true) ) {
                        alt25=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2829:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_TextExpression_4= ruleTextExpression | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2830:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParanthesedValuedExpression4360);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2843:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleParanthesedValuedExpression4390);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2856:2: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedValuedExpression4420);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2869:2: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleParanthesedValuedExpression4450);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2882:2: this_TextExpression_4= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getTextExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleParanthesedValuedExpression4480);
                    this_TextExpression_4=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:8: '(' this_PlusOperation_6= rulePlusOperation ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleParanthesedValuedExpression4496); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getPlusOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOperation_in_ruleParanthesedValuedExpression4521);
                    this_PlusOperation_6=rulePlusOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PlusOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,27,FOLLOW_27_in_ruleParanthesedValuedExpression4530); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2915:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2915:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2915:8: '(' this_DivOperation_9= ruleDivOperation ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleParanthesedValuedExpression4548); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValuedExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValuedExpressionAccess().getDivOperationParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleParanthesedValuedExpression4573);
                    this_DivOperation_9=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,27,FOLLOW_27_in_ruleParanthesedValuedExpression4582); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValuedExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
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
    // $ANTLR end ruleParanthesedValuedExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2943:1: entryRulePlusOperation returns [EObject current=null] : iv_rulePlusOperation= rulePlusOperation EOF ;
    public final EObject entryRulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2944:2: (iv_rulePlusOperation= rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2945:2: iv_rulePlusOperation= rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPlusOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation4619);
            iv_rulePlusOperation=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePlusOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation4629); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2952:1: rulePlusOperation returns [EObject current=null] : (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) ;
    public final EObject rulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOrDivOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2957:6: ( (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2958:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2958:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2959:2: this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4679);
            this_MultOrDivOperation_0=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultOrDivOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:1: ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=39 && LA26_0<=40)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:2: () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2971:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2989:2: ( (lv_operator_2_0= rulePlusOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2990:1: (lv_operator_2_0= rulePlusOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2990:1: (lv_operator_2_0= rulePlusOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2991:3: lv_operator_2_0= rulePlusOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOperator_in_rulePlusOperation4712);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3013:2: ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3014:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3014:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3015:3: lv_subExpressions_3_0= ruleMultOrDivOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4733);
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
    // $ANTLR end rulePlusOperation


    // $ANTLR start entryRuleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3045:1: entryRuleMultOrDivOperation returns [EObject current=null] : iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF ;
    public final EObject entryRuleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3046:2: (iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3047:2: iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOrDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation4771);
            iv_ruleMultOrDivOperation=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOrDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation4781); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3054:1: ruleMultOrDivOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) ;
    public final EObject ruleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOperation_0 = null;

        EObject this_DivOperation_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3059:6: ( (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3060:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3060:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=RULE_STRING && LA27_0<=RULE_FLOAT)||LA27_0==28||LA27_0==36) ) {
                alt27=1;
            }
            else if ( (LA27_0==26) ) {
                int LA27_7 = input.LA(2);

                if ( (synpred52()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3060:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 27, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3060:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3061:2: this_MultOperation_0= ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation4831);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3073:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3073:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3073:8: '(' this_DivOperation_2= ruleDivOperation ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleMultOrDivOperation4847); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation4872);
                    this_DivOperation_2=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,27,FOLLOW_27_in_ruleMultOrDivOperation4881); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3101:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3102:2: (iv_ruleMultOperation= ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3103:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation4918);
            iv_ruleMultOperation=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation4928); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3110:1: ruleMultOperation returns [EObject current=null] : (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3115:6: ( (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3116:1: (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3116:1: (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3117:2: this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_ruleMultOperation4978);
            this_PreOrNormalValuedExpression_0=rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3128:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=41 && LA28_0<=42)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3128:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3128:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3129:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3147:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3148:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3148:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3149:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultOperation5011);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3171:2: ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3172:1: (lv_subExpressions_3_0= rulePreOrNormalValuedExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3172:1: (lv_subExpressions_3_0= rulePreOrNormalValuedExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3173:3: lv_subExpressions_3_0= rulePreOrNormalValuedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_ruleMultOperation5032);
            	    lv_subExpressions_3_0=rulePreOrNormalValuedExpression();
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
            	      	        		"PreOrNormalValuedExpression", 
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


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3203:1: entryRuleDivOperation returns [EObject current=null] : iv_ruleDivOperation= ruleDivOperation EOF ;
    public final EObject entryRuleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3204:2: (iv_ruleDivOperation= ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3205:2: iv_ruleDivOperation= ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation5070);
            iv_ruleDivOperation=ruleDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation5080); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3212:1: ruleDivOperation returns [EObject current=null] : (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* ) ;
    public final EObject ruleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3217:6: ( (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3218:1: (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3218:1: (this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3219:2: this_PreOrNormalValuedExpression_0= rulePreOrNormalValuedExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getPreOrNormalValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_ruleDivOperation5130);
            this_PreOrNormalValuedExpression_0=rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3230:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3230:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3230:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3231:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getDivOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3249:2: ( (lv_operator_2_0= ruleDivOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3250:1: (lv_operator_2_0= ruleDivOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3250:1: (lv_operator_2_0= ruleDivOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3251:3: lv_operator_2_0= ruleDivOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivOperation5163);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3273:2: ( (lv_subExpressions_3_0= rulePreOrNormalValuedExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3274:1: (lv_subExpressions_3_0= rulePreOrNormalValuedExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3274:1: (lv_subExpressions_3_0= rulePreOrNormalValuedExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:3: lv_subExpressions_3_0= rulePreOrNormalValuedExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValuedExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_ruleDivOperation5184);
            	    lv_subExpressions_3_0=rulePreOrNormalValuedExpression();
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
            	      	        		"PreOrNormalValuedExpression", 
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


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3305:1: entryRulePreArithmOperation returns [EObject current=null] : iv_rulePreArithmOperation= rulePreArithmOperation EOF ;
    public final EObject entryRulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreArithmOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3306:2: (iv_rulePreArithmOperation= rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3307:2: iv_rulePreArithmOperation= rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreArithmOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation5222);
            iv_rulePreArithmOperation=rulePreArithmOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreArithmOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation5232); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3314:1: rulePreArithmOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) ;
    public final EObject rulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3319:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3321:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3321:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3322:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation5278);
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

            match(input,26,FOLLOW_26_in_rulePreArithmOperation5288); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3348:1: ( (lv_subExpressions_2_0= ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3349:1: (lv_subExpressions_2_0= ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3349:1: (lv_subExpressions_2_0= ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3350:3: lv_subExpressions_2_0= ruleValOperation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperation_in_rulePreArithmOperation5309);
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

            match(input,27,FOLLOW_27_in_rulePreArithmOperation5319); if (failed) return current;
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


    // $ANTLR start entryRulePreOrNormalValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3384:1: entryRulePreOrNormalValuedExpression returns [EObject current=null] : iv_rulePreOrNormalValuedExpression= rulePreOrNormalValuedExpression EOF ;
    public final EObject entryRulePreOrNormalValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreOrNormalValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3385:2: (iv_rulePreOrNormalValuedExpression= rulePreOrNormalValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3386:2: iv_rulePreOrNormalValuedExpression= rulePreOrNormalValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreOrNormalValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression5355);
            iv_rulePreOrNormalValuedExpression=rulePreOrNormalValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreOrNormalValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression5365); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreOrNormalValuedExpression


    // $ANTLR start rulePreOrNormalValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3393:1: rulePreOrNormalValuedExpression returns [EObject current=null] : (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression ) ;
    public final EObject rulePreOrNormalValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PreArithmOperation_0 = null;

        EObject this_ParanthesedValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3398:6: ( (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3399:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3399:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID||(LA30_0>=RULE_STRING && LA30_0<=RULE_FLOAT)||LA30_0==26||LA30_0==28) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3399:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3400:2: this_PreArithmOperation_0= rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValuedExpressionAccess().getPreArithmOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValuedExpression5415);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3413:2: this_ParanthesedValuedExpression_1= ruleParanthesedValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValuedExpressionAccess().getParanthesedValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedValuedExpression_in_rulePreOrNormalValuedExpression5445);
                    this_ParanthesedValuedExpression_1=ruleParanthesedValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedValuedExpression_1; 
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
    // $ANTLR end rulePreOrNormalValuedExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3432:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3433:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3434:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5480);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation5490); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3441:1: ruleCompareOperation returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3446:6: ( (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3447:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3447:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3448:2: this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation5540);
            this_ValuedExpression_0=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3459:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3459:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3459:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3460:2: 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3478:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3479:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3479:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3480:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation5573);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3502:2: ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3503:1: (lv_subExpressions_3_0= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3503:1: (lv_subExpressions_3_0= ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3504:3: lv_subExpressions_3_0= ruleValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation5594);
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


    // $ANTLR start entryRuleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3534:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3535:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3536:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5631);
            iv_ruleUnaryOperation=ruleUnaryOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation5641); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3543:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_1 = null;

        EObject lv_subExpressions_1_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3548:6: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3549:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3549:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3549:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3549:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3550:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3550:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3551:3: lv_operator_0_0= ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5687);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3573:2: ( ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3574:1: ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3574:1: ( (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=RULE_STRING && LA31_0<=RULE_BOOLEAN)||LA31_0==26||LA31_0==28) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==26) ) {
                    int LA31_3 = input.LA(3);

                    if ( (LA31_3==28) ) {
                        int LA31_4 = input.LA(4);

                        if ( (LA31_4==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 26:
                                {
                                int LA31_7 = input.LA(6);

                                if ( (synpred56()) ) {
                                    alt31=1;
                                }
                                else if ( (true) ) {
                                    alt31=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 7, input);

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
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                                {
                                alt31=2;
                                }
                                break;
                            case 27:
                                {
                                int LA31_8 = input.LA(6);

                                if ( ((LA31_8>=29 && LA31_8<=34)||(LA31_8>=39 && LA31_8<=42)) ) {
                                    alt31=1;
                                }
                                else if ( (LA31_8==EOF||LA31_8==RULE_ID||(LA31_8>=RULE_STRING && LA31_8<=RULE_BOOLEAN)||LA31_8==21||(LA31_8>=26 && LA31_8<=28)||(LA31_8>=35 && LA31_8<=38)) ) {
                                    alt31=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 6, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA31_3==RULE_ID||(LA31_3>=RULE_STRING && LA31_3<=RULE_BOOLEAN)||LA31_3==26||(LA31_3>=35 && LA31_3<=36)) ) {
                        alt31=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3575:1: (lv_subExpressions_1_1= ruleParanthesedBooleanExpression | lv_subExpressions_1_2= ruleUnaryParanthesedOperation )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3576:3: lv_subExpressions_1_1= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5710);
                    lv_subExpressions_1_1=ruleParanthesedBooleanExpression();
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
                      	        		lv_subExpressions_1_1, 
                      	        		"ParanthesedBooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3597:8: lv_subExpressions_1_2= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsUnaryParanthesedOperationParserRuleCall_1_0_1(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOperation5729);
                    lv_subExpressions_1_2=ruleUnaryParanthesedOperation();
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
                      	        		lv_subExpressions_1_2, 
                      	        		"UnaryParanthesedOperation", 
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


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3629:1: entryRuleUnaryParanthesedOperation returns [EObject current=null] : iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF ;
    public final EObject entryRuleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryParanthesedOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3630:2: (iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3631:2: iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryParanthesedOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation5768);
            iv_ruleUnaryParanthesedOperation=ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryParanthesedOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation5778); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3638:1: ruleUnaryParanthesedOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) ;
    public final EObject ruleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3643:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3644:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3644:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3644:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3644:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3645:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3645:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3646:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation5824);
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

            match(input,26,FOLLOW_26_in_ruleUnaryParanthesedOperation5834); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3672:1: ( (lv_subExpressions_2_0= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3674:3: lv_subExpressions_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation5855);
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

            match(input,27,FOLLOW_27_in_ruleUnaryParanthesedOperation5865); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3708:1: entryRuleUnaryOrNormalExpression returns [EObject current=null] : iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF ;
    public final EObject entryRuleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3709:2: (iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3710:2: iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression5901);
            iv_ruleUnaryOrNormalExpression=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression5911); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3717:1: ruleUnaryOrNormalExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject this_UnaryParanthesedOperation_1 = null;

        EObject this_ParanthesedBooleanExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3722:6: ( (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt32=1;
                }
                break;
            case 36:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==26) ) {
                    int LA32_4 = input.LA(3);

                    if ( (LA32_4==RULE_ID||(LA32_4>=RULE_STRING && LA32_4<=RULE_BOOLEAN)||LA32_4==26||(LA32_4>=35 && LA32_4<=36)) ) {
                        alt32=2;
                    }
                    else if ( (LA32_4==28) ) {
                        int LA32_6 = input.LA(4);

                        if ( (LA32_6==RULE_ID) ) {
                            switch ( input.LA(5) ) {
                            case 26:
                                {
                                int LA32_8 = input.LA(6);

                                if ( (synpred58()) ) {
                                    alt32=2;
                                }
                                else if ( (true) ) {
                                    alt32=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 8, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 27:
                                {
                                int LA32_9 = input.LA(6);

                                if ( ((LA32_9>=29 && LA32_9<=34)||(LA32_9>=39 && LA32_9<=42)) ) {
                                    alt32=3;
                                }
                                else if ( (LA32_9==EOF||LA32_9==RULE_ID||(LA32_9>=RULE_STRING && LA32_9<=RULE_BOOLEAN)||LA32_9==21||(LA32_9>=26 && LA32_9<=28)||(LA32_9>=35 && LA32_9<=38)) ) {
                                    alt32=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 9, input);

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
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                                {
                                alt32=2;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 7, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 26:
            case 28:
                {
                alt32=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3723:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3724:2: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5961);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3737:2: this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5991);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3750:2: this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression6021);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3769:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3770:2: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3771:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation6056);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation6066); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3778:1: ruleAndOperation returns [EObject current=null] : (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrNormalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3783:6: ( (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3784:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3784:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3785:2: this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6116);
            this_UnaryOrNormalExpression_0=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_UnaryOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3796:1: ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3796:2: () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3796:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3797:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3815:2: ( (lv_operator_2_0= ruleOperatorAnd ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3816:1: (lv_operator_2_0= ruleOperatorAnd )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3816:1: (lv_operator_2_0= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3817:3: lv_operator_2_0= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation6149);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3839:2: ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3840:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3840:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3841:3: lv_subExpressions_3_0= ruleUnaryOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6170);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3871:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3872:2: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3873:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation6208);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation6218); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3880:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3885:6: ( (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3886:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3886:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3887:2: this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation6268);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3898:1: ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3898:2: () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3898:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3899:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3917:2: ( (lv_operator_2_0= ruleOperatorOr ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3918:1: (lv_operator_2_0= ruleOperatorOr )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3918:1: (lv_operator_2_0= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3919:3: lv_operator_2_0= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation6301);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3941:2: ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3942:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3942:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3943:3: lv_subExpressions_3_0= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation6322);
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


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3973:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3974:2: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3975:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression6360);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression6370); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3982:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_CompareOperation_1 = null;

        EObject this_SignalReference_2 = null;

        EObject this_ValOperation_3 = null;

        EObject this_TextExpression_4 = null;

        EObject this_OrOperation_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3987:6: ( (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt35=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 36:
                {
                alt35=2;
                }
                break;
            case 28:
                {
                int LA35_5 = input.LA(2);

                if ( (synpred62()) ) {
                    alt35=2;
                }
                else if ( (synpred64()) ) {
                    alt35=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 35, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA35_6 = input.LA(2);

                if ( (synpred62()) ) {
                    alt35=2;
                }
                else if ( (synpred63()) ) {
                    alt35=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 35, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA35_7 = input.LA(2);

                if ( (synpred62()) ) {
                    alt35=2;
                }
                else if ( (synpred65()) ) {
                    alt35=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 35, 7, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA35_8 = input.LA(2);

                if ( (synpred62()) ) {
                    alt35=2;
                }
                else if ( (true) ) {
                    alt35=6;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 35, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3988:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_ValOperation_3= ruleValOperation | this_TextExpression_4= ruleTextExpression | ( '(' this_OrOperation_6= ruleOrOperation ')' ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3989:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression6420);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4002:2: this_CompareOperation_1= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6450);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4015:2: this_SignalReference_2= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6480);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4028:2: this_ValOperation_3= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getValOperationParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedBooleanExpression6510);
                    this_ValOperation_3=ruleValOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValOperation_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4041:2: this_TextExpression_4= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getTextExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleParanthesedBooleanExpression6540);
                    this_TextExpression_4=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4053:6: ( '(' this_OrOperation_6= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4053:6: ( '(' this_OrOperation_6= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4053:8: '(' this_OrOperation_6= ruleOrOperation ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleParanthesedBooleanExpression6556); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6581);
                    this_OrOperation_6=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,27,FOLLOW_27_in_ruleParanthesedBooleanExpression6590); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4081:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4082:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4083:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6627);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression6637); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4090:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4095:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4097:2: this_OrOperation_0= ruleOrOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression6686);
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


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4116:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4117:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4118:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression6720);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression6730); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4125:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4130:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4131:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4131:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4131:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4131:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4132:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4132:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4133:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextExpression6772); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4155:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==27) ) {
                        int LA36_4 = input.LA(4);

                        if ( (synpred66()) ) {
                            alt36=1;
                        }
                    }
                }
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4155:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,26,FOLLOW_26_in_ruleTextExpression6788); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4159:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4161:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextExpression6805); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleTextExpression6820); if (failed) return current;
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


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4195:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4196:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4197:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6858);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6868); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4204:1: ruleExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_BooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4209:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )
            int alt37=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA37_1 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA37_3 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA37_4 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA37_5 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA37_6 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 6, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA37_7 = input.LA(2);

                if ( (synpred67()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 35:
                {
                alt37=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4210:1: (this_ValuedExpression_0= ruleValuedExpression | this_BooleanExpression_1= ruleBooleanExpression )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4211:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression6918);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4224:2: this_BooleanExpression_1= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression6948);
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
    // $ANTLR end ruleExpression


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4245:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4249:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4250:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4250:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4250:3: '?'
            {
            match(input,28,FOLLOW_28_in_ruleValOperator6996); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4260:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4264:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt38=1;
                }
                break;
            case 30:
                {
                alt38=2;
                }
                break;
            case 31:
                {
                alt38=3;
                }
                break;
            case 32:
                {
                alt38=4;
                }
                break;
            case 33:
                {
                alt38=5;
                }
                break;
            case 34:
                {
                alt38=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4265:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:4: '='
                    {
                    match(input,29,FOLLOW_29_in_ruleCompareOperator7038); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4271:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4271:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4271:8: '<'
                    {
                    match(input,30,FOLLOW_30_in_ruleCompareOperator7053); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4277:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4277:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4277:8: '<='
                    {
                    match(input,31,FOLLOW_31_in_ruleCompareOperator7068); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4283:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4283:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4283:8: '>'
                    {
                    match(input,32,FOLLOW_32_in_ruleCompareOperator7083); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4289:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4289:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4289:8: '>='
                    {
                    match(input,33,FOLLOW_33_in_ruleCompareOperator7098); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4295:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4295:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4295:8: '<>'
                    {
                    match(input,34,FOLLOW_34_in_ruleCompareOperator7113); if (failed) return current;
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


    // $ANTLR start ruleUnaryOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4305:1: ruleUnaryOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4309:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4310:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4310:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4310:3: 'not'
            {
            match(input,35,FOLLOW_35_in_ruleUnaryOperator7155); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4320:1: ruleUnaryParanthesedOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator ruleUnaryParanthesedOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4324:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4325:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4325:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4325:3: 'pre'
            {
            match(input,36,FOLLOW_36_in_ruleUnaryParanthesedOperator7196); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4335:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4339:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4340:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4340:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4340:3: 'or'
            {
            match(input,37,FOLLOW_37_in_ruleOperatorOr7237); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4350:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4355:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4355:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4355:3: 'and'
            {
            match(input,38,FOLLOW_38_in_ruleOperatorAnd7278); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4367:1: rulePlusOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator rulePlusOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4371:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:1: ( ( '+' ) | ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:1: ( ( '+' ) | ( '-' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            else if ( (LA39_0==40) ) {
                alt39=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4372:1: ( ( '+' ) | ( '-' ) )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:2: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:2: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:4: '+'
                    {
                    match(input,39,FOLLOW_39_in_rulePlusOperator7322); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4378:8: '-'
                    {
                    match(input,40,FOLLOW_40_in_rulePlusOperator7337); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4388:1: ruleMultOperator returns [Enumerator current=null] : ( ( '*' ) | ( 'mod' ) ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4392:6: ( ( ( '*' ) | ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4393:1: ( ( '*' ) | ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4393:1: ( ( '*' ) | ( 'mod' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            else if ( (LA40_0==42) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4393:1: ( ( '*' ) | ( 'mod' ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4393:2: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4393:2: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4393:4: '*'
                    {
                    match(input,41,FOLLOW_41_in_ruleMultOperator7380); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4399:8: 'mod'
                    {
                    match(input,42,FOLLOW_42_in_ruleMultOperator7395); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4409:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4413:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4414:3: '/'
            {
            match(input,43,FOLLOW_43_in_ruleDivOperator7437); if (failed) return current;
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


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4424:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4428:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt41=1;
                }
                break;
            case 45:
                {
                alt41=2;
                }
                break;
            case 46:
                {
                alt41=3;
                }
                break;
            case 47:
                {
                alt41=4;
                }
                break;
            case 48:
                {
                alt41=5;
                }
                break;
            case 49:
                {
                alt41=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4429:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:4: 'PURE'
                    {
                    match(input,44,FOLLOW_44_in_ruleValueType7479); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4435:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4435:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4435:8: 'BOOL'
                    {
                    match(input,45,FOLLOW_45_in_ruleValueType7494); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4441:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4441:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4441:8: 'UNSIGNED'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType7509); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4447:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4447:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4447:8: 'INT'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType7524); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4453:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4453:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4453:8: 'FLOAT'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType7539); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4459:8: 'HOST'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType7554); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4469:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4473:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt42=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt42=1;
                }
                break;
            case 39:
                {
                alt42=2;
                }
                break;
            case 41:
                {
                alt42=3;
                }
                break;
            case 51:
                {
                alt42=4;
                }
                break;
            case 52:
                {
                alt42=5;
                }
                break;
            case 37:
                {
                alt42=6;
                }
                break;
            case 38:
                {
                alt42=7;
                }
                break;
            case 53:
                {
                alt42=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4474:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4474:4: 'NONE'
                    {
                    match(input,50,FOLLOW_50_in_ruleCombineOperator7597); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4480:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4480:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4480:8: '+'
                    {
                    match(input,39,FOLLOW_39_in_ruleCombineOperator7612); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4486:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4486:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4486:8: '*'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator7627); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4492:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4492:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4492:8: 'max'
                    {
                    match(input,51,FOLLOW_51_in_ruleCombineOperator7642); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4498:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4498:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4498:8: 'min'
                    {
                    match(input,52,FOLLOW_52_in_ruleCombineOperator7657); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:8: 'or'
                    {
                    match(input,37,FOLLOW_37_in_ruleCombineOperator7672); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4510:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4510:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4510:8: 'and'
                    {
                    match(input,38,FOLLOW_38_in_ruleCombineOperator7687); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4516:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4516:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4516:8: 'host'
                    {
                    match(input,53,FOLLOW_53_in_ruleCombineOperator7702); if (failed) return current;
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
        match(input,26,FOLLOW_26_in_synpred353103); if (failed) return ;
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

        match(input,27,FOLLOW_27_in_synpred353134); if (failed) return ;

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
        match(input,26,FOLLOW_26_in_synpred363152); if (failed) return ;
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

        match(input,27,FOLLOW_27_in_synpred363183); if (failed) return ;

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

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2445:4: ( '(' ( ( ( ruleExpression ) ) ( ',' )? )* ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2445:4: '(' ( ( ( ruleExpression ) ) ( ',' )? )* ')'
        {
        match(input,26,FOLLOW_26_in_synpred413581); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:1: ( ( ( ruleExpression ) ) ( ',' )? )*
        loop48:
        do {
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||(LA48_0>=RULE_STRING && LA48_0<=RULE_BOOLEAN)||LA48_0==26||LA48_0==28||(LA48_0>=35 && LA48_0<=36)) ) {
                alt48=1;
            }


            switch (alt48) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:2: ( ( ruleExpression ) ) ( ',' )?
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2449:2: ( ( ruleExpression ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2450:1: ( ruleExpression )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2450:1: ( ruleExpression )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2451:3: ruleExpression
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSignalReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleExpression_in_synpred413603);
        	    ruleExpression();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2473:2: ( ',' )?
        	    int alt47=2;
        	    int LA47_0 = input.LA(1);

        	    if ( (LA47_0==21) ) {
        	        alt47=1;
        	    }
        	    switch (alt47) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2473:4: ','
        	            {
        	            match(input,21,FOLLOW_21_in_synpred413614); if (failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop48;
            }
        } while (true);

        match(input,27,FOLLOW_27_in_synpred413628); if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:4: ( '(' ( ( ( ruleExpression ) ) ( ',' )? )* ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2521:4: '(' ( ( ( ruleExpression ) ) ( ',' )? )* ')'
        {
        match(input,26,FOLLOW_26_in_synpred443734); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:1: ( ( ( ruleExpression ) ) ( ',' )? )*
        loop51:
        do {
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||(LA51_0>=RULE_STRING && LA51_0<=RULE_BOOLEAN)||LA51_0==26||LA51_0==28||(LA51_0>=35 && LA51_0<=36)) ) {
                alt51=1;
            }


            switch (alt51) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:2: ( ( ruleExpression ) ) ( ',' )?
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2525:2: ( ( ruleExpression ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2526:1: ( ruleExpression )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2526:1: ( ruleExpression )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2527:3: ruleExpression
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getVariableReferenceAccess().getSubExpressionsExpressionParserRuleCall_1_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleExpression_in_synpred443756);
        	    ruleExpression();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2549:2: ( ',' )?
        	    int alt50=2;
        	    int LA50_0 = input.LA(1);

        	    if ( (LA50_0==21) ) {
        	        alt50=1;
        	    }
        	    switch (alt50) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2549:4: ','
        	            {
        	            match(input,21,FOLLOW_21_in_synpred443767); if (failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    break loop51;
            }
        } while (true);

        match(input,27,FOLLOW_27_in_synpred443781); if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:6: ( ( '(' rulePlusOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:6: ( '(' rulePlusOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:6: ( '(' rulePlusOperation ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2894:8: '(' rulePlusOperation ')'
        {
        match(input,26,FOLLOW_26_in_synpred504496); if (failed) return ;
        pushFollow(FOLLOW_rulePlusOperation_in_synpred504521);
        rulePlusOperation();
        _fsp--;
        if (failed) return ;
        match(input,27,FOLLOW_27_in_synpred504530); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3061:2: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3061:2: ruleMultOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred524831);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3576:3: ( ruleParanthesedBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3576:3: ruleParanthesedBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_synpred565710);
        ruleParanthesedBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3737:2: ( ruleUnaryParanthesedOperation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3737:2: ruleUnaryParanthesedOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_synpred585991);
        ruleUnaryParanthesedOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4002:2: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4002:2: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred626450);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4015:2: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4015:2: ruleSignalReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred636480);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred64
    public final void synpred64_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4028:2: ( ruleValOperation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4028:2: ruleValOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValOperation_in_synpred646510);
        ruleValOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred64

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4041:2: ( ruleTextExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4041:2: ruleTextExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleTextExpression_in_synpred656540);
        ruleTextExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred66
    public final void synpred66_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4155:4: ( '(' ( ( RULE_ID ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4155:4: '(' ( ( RULE_ID ) ) ')'
        {
        match(input,26,FOLLOW_26_in_synpred666788); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4159:1: ( ( RULE_ID ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: ( RULE_ID )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4161:3: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred666805); if (failed) return ;

        }


        }

        match(input,27,FOLLOW_27_in_synpred666820); if (failed) return ;

        }
    }
    // $ANTLR end synpred66

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4211:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4211:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred676918);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred67

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
    public final boolean synpred66() {
        backtracking++;
        int start = input.mark();
        try {
            synpred66_fragment(); // can never throw exception
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
    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
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
    public final boolean synpred64() {
        backtracking++;
        int start = input.mark();
        try {
            synpred64_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend137 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_15_in_ruleStateExtend154 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStateExtend164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend185 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_16_in_ruleStateExtend203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend224 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_15_in_ruleStateExtend242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend263 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_17_in_ruleStateExtend281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend302 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_18_in_ruleStateExtend320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleStateExtend341 = new BitSet(new long[]{0x0000000000078012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegionSignalDec436 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec446 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleRegionSignalDec458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec479 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec511 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec552 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec584 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec600 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRegionSignalDec610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec631 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec663 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec714 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec746 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleRegionSignalDec761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables854 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleVariables865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables886 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleVariables899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals992 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSignals1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals1024 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSignals1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1130 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleInputSignals1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1162 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleInputSignals1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1268 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleOutputSignals1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1300 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleOutputSignals1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1406 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleInOutputSignals1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1438 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleInOutputSignals1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1568 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1583 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1629 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal1645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1693 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal1709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1742 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1788 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1821 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSignal1838 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1869 = new BitSet(new long[]{0x003C02E000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1978 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal1994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2011 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal2027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2074 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSignal2090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2107 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSignal2124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2141 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2204 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSignal2220 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2241 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2251 = new BitSet(new long[]{0x003C02E000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2298 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSignal2314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2331 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2487 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable2502 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2548 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariable2564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2612 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariable2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable2661 = new BitSet(new long[]{0x0003F00000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2707 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable2722 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariable2785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable2818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3091 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleEmission3103 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleEmission3124 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEmission3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEmission3152 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission3173 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEmission3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3279 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAssignment3289 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAssignment3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextEffect3427 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTextEffect3443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3460 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTextEffect3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference3570 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSignalReference3581 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSignalReference3603 = new BitSet(new long[]{0x000000181C200790L});
    public static final BitSet FOLLOW_21_in_ruleSignalReference3614 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_27_in_ruleSignalReference3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference3666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference3723 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleVariableReference3734 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableReference3756 = new BitSet(new long[]{0x000000181C200790L});
    public static final BitSet FOLLOW_21_in_ruleVariableReference3767 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_27_in_ruleVariableReference3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue4001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation4094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation4150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValuedExpression4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_entryRuleParanthesedValuedExpression4300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValuedExpression4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParanthesedValuedExpression4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleParanthesedValuedExpression4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedValuedExpression4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleParanthesedValuedExpression4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleParanthesedValuedExpression4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleParanthesedValuedExpression4496 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleParanthesedValuedExpression4521 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParanthesedValuedExpression4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleParanthesedValuedExpression4548 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleParanthesedValuedExpression4573 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParanthesedValuedExpression4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation4619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4679 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rulePlusOperation4712 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4733 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation4771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMultOrDivOperation4847 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation4872 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMultOrDivOperation4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation4918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_ruleMultOperation4978 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultOperation5011 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_ruleMultOperation5032 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation5070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_ruleDivOperation5130 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivOperation5163 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_ruleDivOperation5184 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation5222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation5278 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePreArithmOperation5288 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleValOperation_in_rulePreArithmOperation5309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePreArithmOperation5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValuedExpression_in_entryRulePreOrNormalValuedExpression5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValuedExpression5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValuedExpression5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValuedExpression_in_rulePreOrNormalValuedExpression5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation5540 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5573 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5687 = new BitSet(new long[]{0x0000001014000790L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOperation5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation5768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation5824 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUnaryParanthesedOperation5834 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation5855 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUnaryParanthesedOperation5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression5901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation6056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6116 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation6149 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation6170 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation6208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation6268 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation6301 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation6322 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression6360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedBooleanExpression6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleParanthesedBooleanExpression6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleParanthesedBooleanExpression6556 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6581 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParanthesedBooleanExpression6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextExpression6772 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleTextExpression6788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTextExpression6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleValOperator6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompareOperator7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCompareOperator7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCompareOperator7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareOperator7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCompareOperator7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOperator7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUnaryOperator7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUnaryParanthesedOperator7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperatorOr7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperatorAnd7278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePlusOperator7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePlusOperator7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMultOperator7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMultOperator7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDivOperator7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValueType7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValueType7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCombineOperator7612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCombineOperator7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCombineOperator7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCombineOperator7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCombineOperator7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred353103 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred353124 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred353134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred363152 = new BitSet(new long[]{0x0000001814000790L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred363173 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred363183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred373311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred413581 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred413603 = new BitSet(new long[]{0x000000181C200790L});
    public static final BitSet FOLLOW_21_in_synpred413614 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_27_in_synpred413628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred443734 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred443756 = new BitSet(new long[]{0x000000181C200790L});
    public static final BitSet FOLLOW_21_in_synpred443767 = new BitSet(new long[]{0x000000181C000790L});
    public static final BitSet FOLLOW_27_in_synpred443781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred504496 = new BitSet(new long[]{0x0000001014000390L});
    public static final BitSet FOLLOW_rulePlusOperation_in_synpred504521 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred504530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred524831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_synpred565710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_synpred585991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred626450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred636480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_synpred646510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_synpred656540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred666788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred666805 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred666820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred676918 = new BitSet(new long[]{0x0000000000000002L});

}