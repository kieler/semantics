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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_D", "RULE_STRING_S", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "'variable'", "':'", "'var'", "','", "';'", "':='", "'combine'", "'with'", "'('", "')'", "'inputoutput'", "'return'", "'@'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'?'", "'pure'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_STRING_S=6;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=12;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_INT=8;
    public static final int RULE_WS=15;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=11;
    public static final int RULE_HOSTCODE=7;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_STRING_D=5;

        public InternalInterfacesParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[199+1];
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
                case 17:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==18) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_ID) ) {
                        alt1=4;
                    }


                    }
                    break;
                case 18:
                    {
                    alt1=3;
                    }
                    break;
                case 19:
                    {
                    alt1=5;
                    }
                    break;
                case 20:
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
            	    match(input,17,FOLLOW_17_in_ruleStateExtend154); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_1_0(), null); 
            	          
            	    }
            	    match(input,18,FOLLOW_18_in_ruleStateExtend164); if (failed) return current;
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
            	    match(input,18,FOLLOW_18_in_ruleStateExtend203); if (failed) return current;
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
            	    match(input,17,FOLLOW_17_in_ruleStateExtend242); if (failed) return current;
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
            	    match(input,19,FOLLOW_19_in_ruleStateExtend281); if (failed) return current;
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
            	    match(input,20,FOLLOW_20_in_ruleStateExtend320); if (failed) return current;
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

            match(input,21,FOLLOW_21_in_ruleRegionSignalDec446); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:316:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
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
                    match(input,22,FOLLOW_22_in_ruleRegionSignalDec458); if (failed) return current;
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

                        if ( (LA2_0==23) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_ID) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:344:4: ',' ( (lv_vars_5_0= ruleVariable ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec490); if (failed) return current;
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
                    match(input,19,FOLLOW_19_in_ruleRegionSignalDec531); if (failed) return current;
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

                        if ( (LA3_0==23) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:401:4: ',' ( (lv_signals_9_0= ruleSignal ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec563); if (failed) return current;
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

                if ( (LA7_0==23) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==19) ) {
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
            	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0(), null); 
            	          
            	    }
            	    match(input,22,FOLLOW_22_in_ruleRegionSignalDec610); if (failed) return current;
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

            	        if ( (LA5_0==23) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:461:4: ',' ( (lv_vars_14_0= ruleVariable ) )
            	    	    {
            	    	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec642); if (failed) return current;
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
            	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec683); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0(), null); 
            	          
            	    }
            	    match(input,19,FOLLOW_19_in_ruleRegionSignalDec693); if (failed) return current;
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

            	        if ( (LA6_0==23) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:522:4: ',' ( (lv_signals_19_0= ruleSignal ) )
            	    	    {
            	    	    match(input,23,FOLLOW_23_in_ruleRegionSignalDec725); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleRegionSignalDec761); if (failed) return current;
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

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:601:4: ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleVariables865); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleVariables899); if (failed) return current;
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

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:680:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleSignals1003); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleSignals1037); if (failed) return current;
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

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:759:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleInputSignals1141); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleInputSignals1175); if (failed) return current;
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

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:838:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleOutputSignals1279); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleOutputSignals1313); if (failed) return current;
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

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:917:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleInOutputSignals1417); if (failed) return current;
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

            match(input,24,FOLLOW_24_in_ruleInOutputSignals1451); if (failed) return current;
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
                case 21:
                    {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING_S) ) {
                        alt13=6;
                    }
                    else if ( ((LA13_2>=48 && LA13_2<=55)) ) {
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
                case 26:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING_S) ) {
                        alt13=10;
                    }
                    else if ( ((LA13_3>=48 && LA13_3<=55)) ) {
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
                case 25:
                    {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_STRING_D) ) {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            int LA13_11 = input.LA(5);

                            if ( (LA13_11==RULE_STRING_S) ) {
                                alt13=8;
                            }
                            else if ( ((LA13_11>=48 && LA13_11<=55)) ) {
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
                        case 21:
                            {
                            int LA13_12 = input.LA(5);

                            if ( (LA13_12==RULE_STRING_S) ) {
                                alt13=7;
                            }
                            else if ( ((LA13_12>=48 && LA13_12<=55)) ) {
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
                        case 23:
                        case 24:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("972:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING_S ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING_S ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING_D ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING_S ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING_S ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING_S ) ) ) ) )", 13, 10, input);

                            throw nvae;
                        }

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
                case 23:
                case 24:
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

                    match(input,21,FOLLOW_21_in_ruleSignal1583); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleSignal1645); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleSignal1709); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleSignal1742); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleSignal1804); if (failed) return current;
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
                    match(input,26,FOLLOW_26_in_ruleSignal1838); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleSignal1869); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleSignal1931); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleSignal1994); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleSignal2027); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleSignal2090); if (failed) return current;
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
                    match(input,26,FOLLOW_26_in_ruleSignal2124); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleSignal2156); if (failed) return current;
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
                    match(input,26,FOLLOW_26_in_ruleSignal2220); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleSignal2251); if (failed) return current;
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
                    match(input,26,FOLLOW_26_in_ruleSignal2314); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleSignal2346); if (failed) return current;
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
                case 25:
                    {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==RULE_STRING_D) ) {
                        int LA14_5 = input.LA(4);

                        if ( (LA14_5==21) ) {
                            int LA14_8 = input.LA(5);

                            if ( (LA14_8==RULE_STRING_S) ) {
                                alt14=6;
                            }
                            else if ( ((LA14_8>=48 && LA14_8<=55)) ) {
                                alt14=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1720:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING_D ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING_D ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ':' ( (lv_hostType_14_0= RULE_STRING_S ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING_D ) ) ) ':' ( (lv_hostType_19_0= RULE_STRING_S ) ) ) )", 14, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_5==EOF||(LA14_5>=23 && LA14_5<=24)) ) {
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
                case 21:
                    {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==RULE_STRING_S) ) {
                        alt14=5;
                    }
                    else if ( ((LA14_3>=48 && LA14_3<=55)) ) {
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
                case 23:
                case 24:
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

                    match(input,21,FOLLOW_21_in_ruleVariable2502); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleVariable2564); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleVariable2628); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleVariable2661); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleVariable2722); if (failed) return current;
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
                    match(input,25,FOLLOW_25_in_ruleVariable2785); if (failed) return current;
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

                    match(input,21,FOLLOW_21_in_ruleVariable2818); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2077:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2078:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2079:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2881);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2891); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2086:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2091:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2092:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2092:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==25) ) {
                    alt15=2;
                }
                else if ( (LA15_1==EOF||LA15_1==28) ) {
                    alt15=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2092:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_HOSTCODE) ) {
                alt15=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2092:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2093:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect2941);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2106:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect2971);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2119:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect3001);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2138:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2139:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2140:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission3036);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission3046); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2147:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2152:6: ( ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2153:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2153:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2153:2: ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2153:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2154:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2154:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2155:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission3093); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2170:2: ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2170:4: '(' ( (lv_newValue_2_0= ruleExpression ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleEmission3104); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2174:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2175:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2175:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2176:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission3125);
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

                    match(input,29,FOLLOW_29_in_ruleEmission3135); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2210:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2211:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2212:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3173);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3183); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2219:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2224:6: ( ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2225:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2225:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2225:2: ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2225:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2226:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2226:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2227:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment3230); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,25,FOLLOW_25_in_ruleAssignment3240); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2246:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2247:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2247:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2248:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment3261);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2278:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2279:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2280:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect3297);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect3307); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2287:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2292:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2293:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2293:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2293:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2293:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2294:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2294:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2295:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3349); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2317:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2317:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleTextEffect3365); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2321:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2322:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2322:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2323:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextEffect3382); if (failed) return current;
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

                    match(input,29,FOLLOW_29_in_ruleTextEffect3397); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2359:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2360:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2361:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3437);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3447); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2368:1: ruleExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2373:6: ( (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2374:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2374:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2375:2: this_BooleanExpression_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression3497);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2388:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression3527);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2407:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2408:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2409:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3562);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression3572); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2416:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2421:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2423:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression3621);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2442:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2443:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2444:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression3655);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression3665); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2451:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2456:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2457:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2457:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2458:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression3715);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2469:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2469:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2469:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2470:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2488:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2489:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2489:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2490:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOperator_in_ruleOrExpression3748);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2512:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2513:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2513:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2514:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression3769);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2544:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2545:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2546:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression3807);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression3817); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2553:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2558:6: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2559:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2559:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2560:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression3867);
            this_CompareOperation_0=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2571:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2571:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2571:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2572:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2590:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2591:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2591:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2592:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpression3900);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2614:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2615:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2615:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2616:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression3921);
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


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2646:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2647:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2648:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3959);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation3969); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2655:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2660:6: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 44:
                {
                alt21=1;
                }
                break;
            case 28:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred40()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 23:
                case 29:
                case 40:
                case 41:
                    {
                    alt21=2;
                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt21=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA21_22 = input.LA(4);

                        if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                            alt21=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HOSTCODE:
                    case RULE_INT:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 28:
                    case 39:
                    case 44:
                    case 47:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 3, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                int LA21_4 = input.LA(2);

                if ( (LA21_4==28) ) {
                    switch ( input.LA(3) ) {
                    case 39:
                        {
                        int LA21_23 = input.LA(4);

                        if ( (LA21_23==28) ) {
                            int LA21_30 = input.LA(5);

                            if ( (synpred40()) ) {
                                alt21=1;
                            }
                            else if ( (true) ) {
                                alt21=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA21_24 = input.LA(4);

                        if ( (LA21_24==RULE_ID) ) {
                            int LA21_31 = input.LA(5);

                            if ( (LA21_31==29) ) {
                                switch ( input.LA(6) ) {
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                    {
                                    alt21=1;
                                    }
                                    break;
                                case EOF:
                                case 23:
                                case 29:
                                case 40:
                                case 41:
                                    {
                                    alt21=2;
                                    }
                                    break;
                                case 21:
                                    {
                                    switch ( input.LA(7) ) {
                                    case 26:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        {
                                        alt21=2;
                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA21_22 = input.LA(8);

                                        if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                                            alt21=1;
                                        }
                                        else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                                            alt21=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                                            throw nvae;
                                        }
                                        }
                                        break;
                                    case RULE_HOSTCODE:
                                    case RULE_INT:
                                    case RULE_FLOAT:
                                    case RULE_BOOLEAN:
                                    case 28:
                                    case 39:
                                    case 44:
                                    case 47:
                                        {
                                        alt21=1;
                                        }
                                        break;
                                    default:
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                                        throw nvae;
                                    }

                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 32, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 31, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA21_25 = input.LA(4);

                        if ( (LA21_25==29) ) {
                            switch ( input.LA(5) ) {
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                {
                                alt21=1;
                                }
                                break;
                            case EOF:
                            case 23:
                            case 29:
                            case 40:
                            case 41:
                                {
                                alt21=2;
                                }
                                break;
                            case 21:
                                {
                                switch ( input.LA(6) ) {
                                case 26:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                    {
                                    alt21=2;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA21_22 = input.LA(7);

                                    if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                                        alt21=1;
                                    }
                                    else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                                        alt21=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case RULE_HOSTCODE:
                                case RULE_INT:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 28:
                                case 39:
                                case 44:
                                case 47:
                                    {
                                    alt21=1;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                                    throw nvae;
                                }

                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 32, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 12, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA21_5 = input.LA(2);

                if ( (LA21_5==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt21=1;
                        }
                        break;
                    case 21:
                        {
                        switch ( input.LA(4) ) {
                        case 26:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            {
                            alt21=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA21_22 = input.LA(5);

                            if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                                alt21=1;
                            }
                            else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                                alt21=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_HOSTCODE:
                        case RULE_INT:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 28:
                        case 39:
                        case 44:
                        case 47:
                            {
                            alt21=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                            throw nvae;
                        }

                        }
                        break;
                    case EOF:
                    case 23:
                    case 29:
                    case 40:
                    case 41:
                        {
                        alt21=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 13, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 23:
                case 29:
                case 40:
                case 41:
                    {
                    alt21=2;
                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt21=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA21_22 = input.LA(4);

                        if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                            alt21=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HOSTCODE:
                    case RULE_INT:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 28:
                    case 39:
                    case 44:
                    case 47:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_HOSTCODE:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    int LA21_14 = input.LA(3);

                    if ( (LA21_14==RULE_ID) ) {
                        int LA21_26 = input.LA(4);

                        if ( (LA21_26==29) ) {
                            switch ( input.LA(5) ) {
                            case EOF:
                            case 23:
                            case 29:
                            case 40:
                            case 41:
                                {
                                alt21=2;
                                }
                                break;
                            case 21:
                                {
                                switch ( input.LA(6) ) {
                                case 26:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                    {
                                    alt21=2;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA21_22 = input.LA(7);

                                    if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                                        alt21=1;
                                    }
                                    else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                                        alt21=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case RULE_HOSTCODE:
                                case RULE_INT:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 28:
                                case 39:
                                case 44:
                                case 47:
                                    {
                                    alt21=1;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                                    throw nvae;
                                }

                                }
                                break;
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                                {
                                alt21=1;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 33, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 26, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 23:
                case 29:
                case 40:
                case 41:
                    {
                    alt21=2;
                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt21=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA21_22 = input.LA(4);

                        if ( ((LA21_22>=33 && LA21_22<=38)||(LA21_22>=43 && LA21_22<=46)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_22==EOF||(LA21_22>=23 && LA21_22<=24)) ) {
                            alt21=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HOSTCODE:
                    case RULE_INT:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 28:
                    case 39:
                    case 44:
                    case 47:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 7, input);

                    throw nvae;
                }

                }
                break;
            case 42:
                {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    int LA21_15 = input.LA(3);

                    if ( (synpred40()) ) {
                        alt21=1;
                    }
                    else if ( (true) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    int LA21_16 = input.LA(3);

                    if ( (LA21_16==EOF||LA21_16==21||LA21_16==23||LA21_16==29||(LA21_16>=40 && LA21_16<=41)) ) {
                        alt21=2;
                    }
                    else if ( ((LA21_16>=33 && LA21_16<=38)) ) {
                        alt21=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA21_17 = input.LA(3);

                    if ( (LA21_17==28) ) {
                        switch ( input.LA(4) ) {
                        case 39:
                            {
                            int LA21_34 = input.LA(5);

                            if ( (LA21_34==28) ) {
                                int LA21_38 = input.LA(6);

                                if ( (synpred40()) ) {
                                    alt21=1;
                                }
                                else if ( (true) ) {
                                    alt21=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 38, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 47:
                            {
                            int LA21_35 = input.LA(5);

                            if ( (LA21_35==RULE_ID) ) {
                                int LA21_39 = input.LA(6);

                                if ( (LA21_39==29) ) {
                                    int LA21_40 = input.LA(7);

                                    if ( ((LA21_40>=33 && LA21_40<=38)) ) {
                                        alt21=1;
                                    }
                                    else if ( (LA21_40==EOF||LA21_40==21||LA21_40==23||LA21_40==29||(LA21_40>=40 && LA21_40<=41)) ) {
                                        alt21=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 40, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 39, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA21_36 = input.LA(5);

                            if ( (LA21_36==29) ) {
                                int LA21_40 = input.LA(6);

                                if ( ((LA21_40>=33 && LA21_40<=38)) ) {
                                    alt21=1;
                                }
                                else if ( (LA21_40==EOF||LA21_40==21||LA21_40==23||LA21_40==29||(LA21_40>=40 && LA21_40<=41)) ) {
                                    alt21=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 40, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 27, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA21_18 = input.LA(3);

                    if ( (LA21_18==RULE_ID) ) {
                        int LA21_28 = input.LA(4);

                        if ( ((LA21_28>=33 && LA21_28<=38)) ) {
                            alt21=1;
                        }
                        else if ( (LA21_28==EOF||LA21_28==21||LA21_28==23||LA21_28==29||(LA21_28>=40 && LA21_28<=41)) ) {
                            alt21=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 28, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA21_19 = input.LA(3);

                    if ( ((LA21_19>=33 && LA21_19<=38)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_19==EOF||LA21_19==21||LA21_19==23||LA21_19==29||(LA21_19>=40 && LA21_19<=41)) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA21_20 = input.LA(3);

                    if ( (synpred40()) ) {
                        alt21=1;
                    }
                    else if ( (true) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HOSTCODE:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        int LA21_29 = input.LA(4);

                        if ( (LA21_29==RULE_ID) ) {
                            int LA21_37 = input.LA(5);

                            if ( (LA21_37==29) ) {
                                int LA21_41 = input.LA(6);

                                if ( (LA21_41==EOF||LA21_41==21||LA21_41==23||LA21_41==29||(LA21_41>=40 && LA21_41<=41)) ) {
                                    alt21=2;
                                }
                                else if ( ((LA21_41>=33 && LA21_41<=38)) ) {
                                    alt21=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 41, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case 21:
                    case 23:
                    case 29:
                    case 40:
                    case 41:
                        {
                        alt21=2;
                        }
                        break;
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        {
                        alt21=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 21, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2661:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2662:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4020);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2674:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2692:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2693:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2693:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2694:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation4053);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2716:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2717:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2717:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2718:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4074);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2742:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleCompareOperation4107);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2761:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2762:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2763:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4142);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression4152); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2770:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2775:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt22=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 44:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                int LA22_2 = input.LA(2);

                if ( (synpred41()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred41()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA22_4 = input.LA(2);

                if ( (LA22_4==28) ) {
                    switch ( input.LA(3) ) {
                    case 39:
                        {
                        int LA22_11 = input.LA(4);

                        if ( (LA22_11==28) ) {
                            int LA22_14 = input.LA(5);

                            if ( (synpred41()) ) {
                                alt22=1;
                            }
                            else if ( (true) ) {
                                alt22=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                        {
                        int LA22_12 = input.LA(4);

                        if ( (LA22_12==RULE_ID) ) {
                            int LA22_15 = input.LA(5);

                            if ( (LA22_15==29) ) {
                                int LA22_16 = input.LA(6);

                                if ( (synpred41()) ) {
                                    alt22=1;
                                }
                                else if ( (true) ) {
                                    alt22=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA22_13 = input.LA(4);

                        if ( (LA22_13==29) ) {
                            int LA22_16 = input.LA(5);

                            if ( (synpred41()) ) {
                                alt22=1;
                            }
                            else if ( (true) ) {
                                alt22=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 9, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 4, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA22_5 = input.LA(2);

                if ( (LA22_5==RULE_ID) ) {
                    int LA22_10 = input.LA(3);

                    if ( (synpred41()) ) {
                        alt22=1;
                    }
                    else if ( (true) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA22_6 = input.LA(2);

                if ( (synpred41()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA22_7 = input.LA(2);

                if ( (synpred41()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 7, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt22=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2776:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2777:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4202);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2790:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4232);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2809:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2810:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2811:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression4267);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression4277); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2818:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2823:6: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID||LA23_0==RULE_HOSTCODE||LA23_0==RULE_BOOLEAN||LA23_0==28||LA23_0==39||LA23_0==47) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2824:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2824:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2825:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2838:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2839:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2839:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2840:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression4336);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2862:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2863:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2863:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2864:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression4357);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2888:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression4389);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2907:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2908:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2909:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4424);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression4434); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2916:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2921:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2923:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression4483);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2942:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2943:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2944:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression4517);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression4527); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2951:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2956:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2957:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2957:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2958:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4577);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2969:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2969:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2969:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2970:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2988:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2989:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2989:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2990:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression4610);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3012:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3013:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3013:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3014:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression4631);
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
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3044:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3045:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3046:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression4669);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression4679); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3053:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3058:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3059:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3059:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3060:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression4729);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3071:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3071:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3071:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3072:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3090:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3091:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3091:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3092:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression4762);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3114:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3115:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3115:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3116:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression4783);
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
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3146:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3147:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3148:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression4821);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression4831); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3155:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3160:6: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3161:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3161:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3162:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression4881);
            this_DivExpression_0=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3173:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3173:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3173:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3174:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3192:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3193:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3193:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3194:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression4914);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3216:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3217:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3217:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3218:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression4935);
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
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3248:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3249:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3250:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression4973);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression4983); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3257:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3262:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3263:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3263:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3264:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression5033);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                        case 21:
                        case 29:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 40:
                        case 41:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            {
                            alt27=1;
                            }
                            break;
                        case EOF:
                            {
                            int LA27_5 = input.LA(4);

                            if ( (LA27_5==EOF) ) {
                                int LA27_51 = input.LA(5);


                            }
                            }
                            break;
                        case 23:
                            {
                            int LA27_6 = input.LA(4);

                            if ( (LA27_6==RULE_ID) ) {
                                int LA27_7 = input.LA(5);

                                if ( (synpred46()) ) {
                                    alt27=1;
                                }
                            }
                            }
                            break;
                    }

                }
                else if ( ((LA27_1>=RULE_HOSTCODE && LA27_1<=RULE_BOOLEAN)||LA27_1==28||LA27_1==39||LA27_1==44||LA27_1==47) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3276:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3294:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3295:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3295:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3296:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression5066);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3318:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3319:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3319:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression5087);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3350:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3351:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3352:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression5125);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression5135); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3359:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3364:6: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3365:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3365:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3366:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression5185);
            this_NegExpression_0=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3377:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3377:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3377:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3378:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3396:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3397:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3397:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3398:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression5218);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3420:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3421:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3421:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3422:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5239);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3452:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3453:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3454:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression5277);
            iv_ruleNegExpression=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression5287); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3461:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3466:6: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID||(LA29_0>=RULE_HOSTCODE && LA29_0<=RULE_BOOLEAN)||LA29_0==28||LA29_0==39||LA29_0==47) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3467:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3467:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3468:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3481:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3482:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3482:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3483:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression5346);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3505:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3506:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3506:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3507:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression5367);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3531:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression5399);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3550:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3551:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3552:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5434);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression5444); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3559:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_TextExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3564:6: ( (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3565:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3565:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
            case 39:
            case 47:
                {
                alt30=2;
                }
                break;
            case 28:
                {
                alt30=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt30=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3565:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3566:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5494);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3579:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5524);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3591:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3591:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3591:8: '(' this_BooleanExpression_3= ruleBooleanExpression ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleAtomicExpression5540); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5565);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,29,FOLLOW_29_in_ruleAtomicExpression5574); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3613:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression5606);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3632:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3633:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3634:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5641);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression5651); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3641:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3646:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
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
            case 28:
                {
                int LA31_3 = input.LA(2);

                if ( (synpred54()) ) {
                    alt31=3;
                }
                else if ( (true) ) {
                    alt31=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HOSTCODE:
            case RULE_BOOLEAN:
            case 39:
            case 47:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3647:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3648:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5701);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3661:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5731);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:8: '(' this_ValuedExpression_3= ruleValuedExpression ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleAtomicValuedExpression5747); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5772);
                    this_ValuedExpression_3=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,29,FOLLOW_29_in_ruleAtomicValuedExpression5781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3695:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression5813);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3714:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3715:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3716:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression5848);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5858); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3723:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_subExpressions_7_0 = null;

        EObject this_ValuedObjectReference_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3728:6: ( ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 47:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3729:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:3: () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3729:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3730:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3743:2: ( (lv_operator_1_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3744:1: (lv_operator_1_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3744:1: (lv_operator_1_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3745:3: lv_operator_1_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5917);
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

                    match(input,28,FOLLOW_28_in_ruleValuedObjectTestExpression5927); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3771:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3772:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3772:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3773:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5948);
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

                    match(input,29,FOLLOW_29_in_ruleValuedObjectTestExpression5958); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3800:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3800:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3800:7: () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3800:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3801:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3814:2: ( (lv_operator_6_0= ruleValueTestOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3815:1: (lv_operator_6_0= ruleValueTestOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3815:1: (lv_operator_6_0= ruleValueTestOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3816:3: lv_operator_6_0= ruleValueTestOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression5999);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3838:2: ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3839:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3839:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3840:3: lv_subExpressions_7_0= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6020);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3864:2: this_ValuedObjectReference_8= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6052);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3883:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3884:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3885:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6087);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference6097); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3892:1: ruleValuedObjectReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3897:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3898:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3898:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3899:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3899:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3900:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference6143); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3923:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3924:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3925:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression6178);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression6188); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3932:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3937:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3938:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3938:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3938:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3938:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3939:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3939:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3940:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6230); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3962:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3962:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleTextExpression6246); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3966:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3967:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3967:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3968:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextExpression6263); if (failed) return current;
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

                    match(input,29,FOLLOW_29_in_ruleTextExpression6278); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4002:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4003:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4004:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue6316);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue6326); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4011:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4016:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4017:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4017:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4018:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4018:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4019:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue6367); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4049:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4050:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4051:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue6407);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue6417); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4058:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4063:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4064:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4064:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4065:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4065:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4066:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue6458); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4096:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4097:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4098:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6498);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue6508); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4105:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4110:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4111:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4111:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4112:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4112:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4113:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6549); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4145:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4146:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4147:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration6591);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDeclaration6601); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4154:1: ruleInterfaceDeclaration returns [EObject current=null] : (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceSignalDecl_0 = null;

        EObject this_InterfaceVariableDecl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4159:6: ( (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4160:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=17 && LA34_0<=18)||(LA34_0>=30 && LA34_0<=31)) ) {
                alt34=1;
            }
            else if ( (LA34_0==22) ) {
                alt34=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4160:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4161:2: this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration6651);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4174:2: this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration6681);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4193:1: entryRuleISignal returns [EObject current=null] : iv_ruleISignal= ruleISignal EOF ;
    public final EObject entryRuleISignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4194:2: (iv_ruleISignal= ruleISignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4195:2: iv_ruleISignal= ruleISignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getISignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleISignal_in_entryRuleISignal6716);
            iv_ruleISignal=ruleISignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleISignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleISignal6726); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4202:1: ruleISignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) ;
    public final EObject ruleISignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_channelDescr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4207:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4208:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4208:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4208:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4208:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4209:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4209:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4210:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleISignal6768); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4232:2: ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21||LA35_0==25||LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4233:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4233:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4234:3: lv_channelDescr_1_0= ruleChannelDescription
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleISignal6794);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4264:1: entryRuleInterfaceSignalDecl returns [EObject current=null] : iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF ;
    public final EObject entryRuleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4265:2: (iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4266:2: iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl6831);
            iv_ruleInterfaceSignalDecl=ruleInterfaceSignalDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceSignalDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceSignalDecl6841); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4273:1: ruleInterfaceSignalDecl returns [EObject current=null] : ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) ;
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
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4278:6: ( ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt40=1;
                }
                break;
            case 18:
                {
                alt40=2;
                }
                break;
            case 30:
                {
                alt40=3;
                }
                break;
            case 31:
                {
                alt40=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4279:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:3: () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4279:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4280:2: 
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

                    match(input,17,FOLLOW_17_in_ruleInterfaceSignalDecl6889); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4297:1: ( (lv_signals_2_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4298:1: (lv_signals_2_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4298:1: (lv_signals_2_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4299:3: lv_signals_2_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl6910);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4321:2: ( ',' ( (lv_signals_4_0= ruleISignal ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==23) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4321:4: ',' ( (lv_signals_4_0= ruleISignal ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleInterfaceSignalDecl6921); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4325:1: ( (lv_signals_4_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4326:1: (lv_signals_4_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4326:1: (lv_signals_4_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4327:3: lv_signals_4_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl6942);
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
                    	    break loop36;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleInterfaceSignalDecl6954); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:7: () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4354:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4355:2: 
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

                    match(input,18,FOLLOW_18_in_ruleInterfaceSignalDecl6984); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4372:1: ( (lv_signals_8_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4373:1: (lv_signals_8_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4373:1: (lv_signals_8_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4374:3: lv_signals_8_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7005);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4396:2: ( ',' ( (lv_signals_10_0= ruleISignal ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==23) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4396:4: ',' ( (lv_signals_10_0= ruleISignal ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleInterfaceSignalDecl7016); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4400:1: ( (lv_signals_10_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4401:1: (lv_signals_10_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4401:1: (lv_signals_10_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4402:3: lv_signals_10_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7037);
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
                    	    break loop37;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleInterfaceSignalDecl7049); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:7: () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4429:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4430:2: 
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

                    match(input,30,FOLLOW_30_in_ruleInterfaceSignalDecl7079); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4447:1: ( (lv_signals_14_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4448:1: (lv_signals_14_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4448:1: (lv_signals_14_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4449:3: lv_signals_14_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7100);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4471:2: ( ',' ( (lv_signals_16_0= ruleISignal ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==23) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4471:4: ',' ( (lv_signals_16_0= ruleISignal ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleInterfaceSignalDecl7111); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4475:1: ( (lv_signals_16_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4476:1: (lv_signals_16_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4476:1: (lv_signals_16_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4477:3: lv_signals_16_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7132);
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
                    	    break loop38;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleInterfaceSignalDecl7144); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:7: () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4504:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4505:2: 
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

                    match(input,31,FOLLOW_31_in_ruleInterfaceSignalDecl7174); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4522:1: ( (lv_signals_20_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4523:1: (lv_signals_20_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4523:1: (lv_signals_20_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4524:3: lv_signals_20_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7195);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4546:2: ( ',' ( (lv_signals_22_0= ruleISignal ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==23) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4546:4: ',' ( (lv_signals_22_0= ruleISignal ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleInterfaceSignalDecl7206); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4550:1: ( (lv_signals_22_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4551:1: (lv_signals_22_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4551:1: (lv_signals_22_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4552:3: lv_signals_22_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7227);
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
                    	    break loop39;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_ruleInterfaceSignalDecl7239); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4586:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4587:2: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4588:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription7276);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleChannelDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelDescription7286); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4595:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_type_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4600:6: ( ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4601:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4601:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt41=1;
                }
                break;
            case 28:
                {
                alt41=2;
                }
                break;
            case 25:
                {
                alt41=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4601:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4601:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4601:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4601:4: ':' ( (lv_type_1_0= ruleTypeIdentifier ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleChannelDescription7322); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4605:1: ( (lv_type_1_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4606:1: (lv_type_1_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4606:1: (lv_type_1_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4607:3: lv_type_1_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7343);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4630:8: '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')'
                    {
                    match(input,28,FOLLOW_28_in_ruleChannelDescription7361); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4634:1: ( (lv_type_3_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4635:1: (lv_type_3_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4635:1: (lv_type_3_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4636:3: lv_type_3_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7382);
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

                    match(input,29,FOLLOW_29_in_ruleChannelDescription7392); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4663:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4663:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4663:8: ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleChannelDescription7410); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4667:1: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4668:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4668:1: (lv_expression_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4669:3: lv_expression_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleChannelDescription7431);
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

                    match(input,21,FOLLOW_21_in_ruleChannelDescription7441); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4695:1: ( (lv_type_8_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4696:1: (lv_type_8_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4696:1: (lv_type_8_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4697:3: lv_type_8_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7462);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4727:1: entryRuleInterfaceVariableDecl returns [EObject current=null] : iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF ;
    public final EObject entryRuleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4728:2: (iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4729:2: iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceVariableDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl7499);
            iv_ruleInterfaceVariableDecl=ruleInterfaceVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceVariableDecl7509); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4736:1: ruleInterfaceVariableDecl returns [EObject current=null] : ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) ;
    public final EObject ruleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecls_1_0 = null;

        EObject lv_varDecls_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4741:6: ( ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4742:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4742:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4742:3: 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            {
            match(input,22,FOLLOW_22_in_ruleInterfaceVariableDecl7544); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4746:1: ( (lv_varDecls_1_0= ruleVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4747:1: (lv_varDecls_1_0= ruleVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4747:1: (lv_varDecls_1_0= ruleVariableDecl )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4748:3: lv_varDecls_1_0= ruleVariableDecl
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl7565);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4770:2: ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==23) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4770:4: ',' ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleInterfaceVariableDecl7576); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4774:1: ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4775:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4775:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4776:3: lv_varDecls_3_0= ruleVariableDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl7597);
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
            	    break loop42;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4806:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4807:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4808:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl7635);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl7645); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4815:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4820:6: ( ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4821:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4821:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4821:2: ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4821:2: ( (lv_variables_0_0= ruleIVariable ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4822:1: (lv_variables_0_0= ruleIVariable )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4822:1: (lv_variables_0_0= ruleIVariable )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4823:3: lv_variables_0_0= ruleIVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIVariable_in_ruleVariableDecl7691);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4845:2: ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==23) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4845:4: ',' ( (lv_variables_2_0= ruleIVariable ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleVariableDecl7702); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4849:1: ( (lv_variables_2_0= ruleIVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4850:1: (lv_variables_2_0= ruleIVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4850:1: (lv_variables_2_0= ruleIVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4851:3: lv_variables_2_0= ruleIVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIVariable_in_ruleVariableDecl7723);
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
            	    break loop43;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleVariableDecl7735); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4877:1: ( (lv_type_4_0= ruleTypeIdentifier ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4878:1: (lv_type_4_0= ruleTypeIdentifier )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4878:1: (lv_type_4_0= ruleTypeIdentifier )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4879:3: lv_type_4_0= ruleTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl7756);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4909:1: entryRuleIVariable returns [EObject current=null] : iv_ruleIVariable= ruleIVariable EOF ;
    public final EObject entryRuleIVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4910:2: (iv_ruleIVariable= ruleIVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4911:2: iv_ruleIVariable= ruleIVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIVariable_in_entryRuleIVariable7792);
            iv_ruleIVariable=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIVariable7802); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4918:1: ruleIVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleIVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4923:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4924:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4924:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4924:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4924:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4925:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4925:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4926:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIVariable7844); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4948:2: ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==25) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4948:4: ':=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleIVariable7860); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4952:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4953:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4953:1: (lv_expression_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4954:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIVariable7881);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4984:1: entryRuleTypeIdentifier returns [EObject current=null] : iv_ruleTypeIdentifier= ruleTypeIdentifier EOF ;
    public final EObject entryRuleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdentifier = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4985:2: (iv_ruleTypeIdentifier= ruleTypeIdentifier EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4986:2: iv_ruleTypeIdentifier= ruleTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier7919);
            iv_ruleTypeIdentifier=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdentifier7929); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4993:1: ruleTypeIdentifier returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) ;
    public final EObject ruleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_typeID_1_0=null;
        Token lv_typeID_4_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_type_3_0 = null;

        Enumerator lv_operator_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4998:6: ( ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4999:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4999:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt46=1;
                }
                break;
            case RULE_ID:
                {
                alt46=2;
                }
                break;
            case 26:
                {
                alt46=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4999:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4999:2: ( (lv_type_0_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:4999:2: ( (lv_type_0_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5000:1: (lv_type_0_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5000:1: (lv_type_0_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5001:3: lv_type_0_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleTypeIdentifier7975);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5024:6: ( (lv_typeID_1_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5024:6: ( (lv_typeID_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5025:1: (lv_typeID_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5025:1: (lv_typeID_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5026:3: lv_typeID_1_0= RULE_ID
                    {
                    lv_typeID_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeIdentifier7998); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5049:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5049:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5049:8: 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleTypeIdentifier8020); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5053:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=48 && LA45_0<=55)) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==RULE_ID) ) {
                        alt45=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("5053:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5053:2: ( (lv_type_3_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5053:2: ( (lv_type_3_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5054:1: (lv_type_3_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5054:1: (lv_type_3_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5055:3: lv_type_3_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleTypeIdentifier8042);
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5078:6: ( (lv_typeID_4_0= RULE_ID ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5078:6: ( (lv_typeID_4_0= RULE_ID ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5079:1: (lv_typeID_4_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5079:1: (lv_typeID_4_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5080:3: lv_typeID_4_0= RULE_ID
                            {
                            lv_typeID_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeIdentifier8065); if (failed) return current;
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

                    match(input,27,FOLLOW_27_in_ruleTypeIdentifier8081); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5106:1: ( (lv_operator_6_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5107:1: (lv_operator_6_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5107:1: (lv_operator_6_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5108:3: lv_operator_6_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier8102);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5140:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5141:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5142:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8141);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation8151); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5149:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5154:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5155:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5155:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5156:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5156:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5157:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8192); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5187:1: entryRuleKeyValueAnnotation returns [EObject current=null] : iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF ;
    public final EObject entryRuleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5188:2: (iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5189:2: iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyValueAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation8232);
            iv_ruleKeyValueAnnotation=ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValueAnnotation8242); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5196:1: ruleKeyValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5201:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5202:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5202:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5202:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            match(input,32,FOLLOW_32_in_ruleKeyValueAnnotation8277); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5206:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5207:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5207:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5208:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValueAnnotation8294); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5230:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5231:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5231:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5232:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyValueAnnotation8320);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5264:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5265:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5266:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString8359);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString8370); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5273:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5278:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5279:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5279:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5279:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5279:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString8410); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5287:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString8436); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5302:1: ruleDivOperator returns [Enumerator current=null] : ( ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5306:6: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5307:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5307:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5307:3: ':'
            {
            match(input,21,FOLLOW_21_in_ruleDivOperator8492); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5317:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5321:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5322:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5322:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt48=1;
                }
                break;
            case 34:
                {
                alt48=2;
                }
                break;
            case 35:
                {
                alt48=3;
                }
                break;
            case 36:
                {
                alt48=4;
                }
                break;
            case 37:
                {
                alt48=5;
                }
                break;
            case 38:
                {
                alt48=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5322:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5322:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5322:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5322:4: '='
                    {
                    match(input,33,FOLLOW_33_in_ruleCompareOperator8534); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5328:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5328:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5328:8: '<'
                    {
                    match(input,34,FOLLOW_34_in_ruleCompareOperator8549); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5334:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5334:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5334:8: '<='
                    {
                    match(input,35,FOLLOW_35_in_ruleCompareOperator8564); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5340:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5340:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5340:8: '>'
                    {
                    match(input,36,FOLLOW_36_in_ruleCompareOperator8579); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5346:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5346:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5346:8: '>='
                    {
                    match(input,37,FOLLOW_37_in_ruleCompareOperator8594); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5352:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5352:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5352:8: '<>'
                    {
                    match(input,38,FOLLOW_38_in_ruleCompareOperator8609); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5362:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5366:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5367:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5367:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5367:3: 'pre'
            {
            match(input,39,FOLLOW_39_in_rulePreOperator8651); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5377:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5381:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5382:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5382:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5382:3: 'or'
            {
            match(input,40,FOLLOW_40_in_ruleOrOperator8692); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5392:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5396:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5397:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5397:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5397:3: 'and'
            {
            match(input,41,FOLLOW_41_in_ruleAndOperator8733); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5407:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5411:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5412:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5412:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5412:3: 'not'
            {
            match(input,42,FOLLOW_42_in_ruleNotOperator8774); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5422:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5426:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5427:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5427:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5427:3: '+'
            {
            match(input,43,FOLLOW_43_in_ruleAddOperator8815); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5437:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5441:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5442:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5442:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5442:3: '-'
            {
            match(input,44,FOLLOW_44_in_ruleSubOperator8856); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5452:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5456:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5457:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5457:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5457:3: '*'
            {
            match(input,45,FOLLOW_45_in_ruleMultOperator8897); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5467:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5471:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5472:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5472:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5472:3: 'mod'
            {
            match(input,46,FOLLOW_46_in_ruleModOperator8938); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5482:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5486:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5487:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5487:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5487:3: '?'
            {
            match(input,47,FOLLOW_47_in_ruleValueTestOperator8979); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5497:1: ruleValueType returns [Enumerator current=null] : ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5501:6: ( ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5502:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5502:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )
            int alt49=8;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt49=1;
                }
                break;
            case 49:
                {
                alt49=2;
                }
                break;
            case 50:
                {
                alt49=3;
                }
                break;
            case 51:
                {
                alt49=4;
                }
                break;
            case 52:
                {
                alt49=5;
                }
                break;
            case 53:
                {
                alt49=6;
                }
                break;
            case 54:
                {
                alt49=7;
                }
                break;
            case 55:
                {
                alt49=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5502:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5502:2: ( 'pure' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5502:2: ( 'pure' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5502:4: 'pure'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType9021); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5508:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5508:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5508:8: 'boolean'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType9036); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5514:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5514:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5514:8: 'unsigned'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType9051); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5520:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5520:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5520:8: 'integer'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType9066); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5526:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5526:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5526:8: 'float'
                    {
                    match(input,52,FOLLOW_52_in_ruleValueType9081); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5532:6: ( 'double' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5532:6: ( 'double' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5532:8: 'double'
                    {
                    match(input,53,FOLLOW_53_in_ruleValueType9096); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5538:6: ( 'string' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5538:6: ( 'string' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5538:8: 'string'
                    {
                    match(input,54,FOLLOW_54_in_ruleValueType9111); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5544:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5544:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5544:8: 'host'
                    {
                    match(input,55,FOLLOW_55_in_ruleValueType9126); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5554:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5558:6: ( ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5559:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5559:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt50=8;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt50=1;
                }
                break;
            case 43:
                {
                alt50=2;
                }
                break;
            case 45:
                {
                alt50=3;
                }
                break;
            case 57:
                {
                alt50=4;
                }
                break;
            case 58:
                {
                alt50=5;
                }
                break;
            case 40:
                {
                alt50=6;
                }
                break;
            case 41:
                {
                alt50=7;
                }
                break;
            case 55:
                {
                alt50=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5559:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5559:2: ( 'none' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5559:2: ( 'none' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5559:4: 'none'
                    {
                    match(input,56,FOLLOW_56_in_ruleCombineOperator9169); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5565:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5565:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5565:8: '+'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator9184); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5571:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5571:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5571:8: '*'
                    {
                    match(input,45,FOLLOW_45_in_ruleCombineOperator9199); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5577:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5577:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5577:8: 'max'
                    {
                    match(input,57,FOLLOW_57_in_ruleCombineOperator9214); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5583:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5583:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5583:8: 'min'
                    {
                    match(input,58,FOLLOW_58_in_ruleCombineOperator9229); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5589:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5589:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5589:8: 'or'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator9244); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5595:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5595:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5595:8: 'and'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator9259); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5601:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5601:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:5601:8: 'host'
                    {
                    match(input,55,FOLLOW_55_in_ruleCombineOperator9274); if (failed) return current;
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

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2375:2: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2375:2: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred373497);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: ( ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2661:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2662:2: ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred404020);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:1: ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:2: () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2673:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2674:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2692:2: ( ( ruleCompareOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2693:1: ( ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2693:1: ( ruleCompareOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2694:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOperator_in_synpred404053);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2716:2: ( ( ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2717:1: ( ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2717:1: ( ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2718:3: ruleNotOrValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred404074);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2777:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:2777:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred414202);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:2: ( () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:2: () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3275:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3276:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3294:2: ( ( ruleDivOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3295:1: ( ruleDivOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3295:1: ( ruleDivOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3296:3: ruleDivOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDivOperator_in_synpred465066);
        ruleDivOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3318:2: ( ( ruleModExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3319:1: ( ruleModExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3319:1: ( ruleModExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3320:3: ruleModExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleModExpression_in_synpred465087);
        ruleModExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/interfaces/parser/antlr/internal/InternalInterfaces.g:3673:8: '(' ruleValuedExpression ')'
        {
        match(input,28,FOLLOW_28_in_synpred545747); if (failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred545772);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,29,FOLLOW_29_in_synpred545781); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred54

    public final boolean synpred46() {
        backtracking++;
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
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
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\u03cf\uffff";
    static final String DFA18_eofS =
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
        "\3\31\1\uffff\2\31\1\uffff\1\31\2\uffff\1\31\6\uffff\2\31\4\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\6\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\3\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\1\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\6\uffff\2\31\2\uffff\2\31\1\uffff\1\31\7\uffff\2\31\2\uffff"+
        "\2\31\1\uffff\1\31\7\uffff\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\3\uffff\2\31\2\uffff\2\31\1\uffff"+
        "\1\31\7\uffff\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\3\uffff\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\3\uffff\1\31\3\uffff\2\31\6\uffff\2\31\6\uffff\2\31\2\uffff"+
        "\2\31\4\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\13\uffff"+
        "\2\31\2\uffff\2\31\4\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\7\uffff\2\31\4\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\6\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\2\uffff\2\31\2\uffff"+
        "\2\31\1\uffff\1\31\7\uffff\2\31\2\uffff\2\31\2\uffff\2\31\1\uffff"+
        "\1\31\7\uffff\2\31\2\uffff\2\31\1\uffff\1\31\7\uffff\2\31\5\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\2\uffff\1\31\3\uffff"+
        "\2\31\6\uffff\2\31\6\uffff\2\31\6\uffff\2\31\2\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\2\uffff"+
        "\2\31\2\uffff\2\31\2\uffff\2\31\5\uffff\1\31\3\uffff\2\31\2\uffff"+
        "\2\31\6\uffff\2\31";
    static final String DFA18_minS =
        "\2\4\2\25\2\0\1\34\1\4\2\0\1\uffff\1\0\2\25\1\0\1\25\1\34\1\4\2"+
        "\25\5\4\1\uffff\1\4\1\0\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25"+
        "\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25"+
        "\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25"+
        "\1\34\1\4\1\35\1\34\1\4\2\35\1\4\1\25\1\4\1\0\2\25\1\0\1\25\1\34"+
        "\1\4\2\25\2\4\1\25\1\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\3\4\1\25"+
        "\1\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\4\4\1\25\1\4\1\0\2\25\1\0\1"+
        "\25\1\34\1\4\2\25\5\4\1\25\1\4\1\0\1\35\2\0\1\35\2\25\1\34\1\4\2"+
        "\35\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\34\1\4\2\35\1\4\1"+
        "\25\1\4\2\25\1\0\1\25\1\34\1\4\3\25\1\4\2\25\1\0\1\25\1\34\1\4\1"+
        "\25\1\34\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\3\25\1\4\2"+
        "\25\1\0\1\25\1\34\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\34"+
        "\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\3\25\1\4\2\25\1\0"+
        "\1\25\1\34\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\4\2\25\1\0"+
        "\1\25\1\34\1\4\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\1"+
        "\4\1\25\1\4\1\0\1\35\2\25\1\34\1\4\2\35\1\4\1\25\2\4\1\0\2\25\1"+
        "\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\0\1\35\2\25\1\34\1\4\2\35\1"+
        "\4\1\25\2\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\0\2\25"+
        "\1\0\1\25\1\34\1\4\2\25\3\4\1\25\1\4\1\0\1\35\2\25\1\34\1\4\2\35"+
        "\1\4\1\25\2\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\0\2"+
        "\25\1\0\1\25\1\34\1\4\2\25\3\4\1\25\1\4\1\0\2\25\1\0\1\25\1\34\1"+
        "\4\2\25\4\4\1\25\1\4\1\0\1\35\2\25\1\0\1\35\2\25\1\34\1\4\2\35\1"+
        "\0\1\35\2\25\1\34\1\4\2\35\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25"+
        "\1\4\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\2\25\1\0\1\25\1\34"+
        "\1\4\2\25\1\4\1\25\1\4\1\34\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1\25"+
        "\1\34\1\4\3\25\1\4\2\25\1\0\1\25\1\34\1\4\1\25\1\34\1\4\2\35\1\0"+
        "\1\35\2\25\1\34\1\4\2\35\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1"+
        "\4\1\34\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\3\25\1\4\2"+
        "\25\1\0\1\25\1\34\1\4\1\25\1\34\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1"+
        "\25\1\34\1\4\3\25\1\4\2\25\1\0\1\25\1\34\1\4\1\25\1\4\2\25\1\0\1"+
        "\25\1\34\1\4\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\0\1\35\2\25\1\4"+
        "\1\25\1\4\1\34\1\4\2\35\1\0\1\35\2\25\1\0\1\35\2\25\1\4\1\25\1\4"+
        "\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\1\4\1\25\2\4\1\0\2\25"+
        "\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\0\1\35\2\25\1\0\1\35\2\25"+
        "\1\4\1\25\1\4\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\1\4\1\25"+
        "\2\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\0\1\35\2\25"+
        "\1\34\1\4\2\35\1\4\1\25\2\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\1\4"+
        "\1\25\1\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\3\4\1\25\1\4\1\0\1\35"+
        "\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1"+
        "\0\1\35\2\25\1\34\1\4\2\35\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25"+
        "\1\4\1\34\1\4\2\35\1\34\1\4\2\35\1\0\1\35\2\25\1\0\1\35\2\25\1\34"+
        "\1\4\2\35\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25\1\4\1\34\1\4\2\35"+
        "\1\0\1\35\2\25\1\34\1\4\2\35\2\25\1\0\1\25\1\34\1\4\2\25\1\4\1\25"+
        "\1\4\1\34\1\4\2\35\1\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\4"+
        "\2\25\1\0\1\25\1\34\1\4\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\0\1\35"+
        "\2\25\1\0\1\35\2\25\1\4\1\25\1\4\1\34\1\4\2\35\1\0\1\35\2\25\1\0"+
        "\1\35\2\25\1\0\1\35\2\25\1\4\1\25\1\4\1\34\1\4\2\35\1\0\1\35\2\25"+
        "\1\0\1\35\2\25\1\4\1\25\1\4\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4"+
        "\2\35\1\4\1\25\1\4\1\0\2\25\1\0\1\25\1\34\1\4\2\25\2\4\1\25\1\4"+
        "\1\0\1\35\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\34\1\4\2\35\1\0\1\35"+
        "\2\25\1\34\1\4\2\35\1\0\1\35\2\25\1\0\1\35\2\25\1\34\1\4\2\35\1"+
        "\4\1\25\1\4\2\25\1\0\1\25\1\34\1\4\2\25\1\34\1\4\2\35\1\0\1\35\2"+
        "\25\1\0\1\35\2\25\1\0\1\35\2\25\1\0\1\35\2\25\1\34\1\4\2\35\1\4"+
        "\1\25\1\4\1\0\1\35\2\25\1\0\1\35\2\25\1\34\1\4\2\35\1\0\1\35\2\25";
    static final String DFA18_maxS =
        "\2\57\2\56\2\0\1\34\1\4\2\0\1\uffff\1\0\2\56\1\0\1\56\1\34\1\4\2"+
        "\56\1\57\1\67\3\57\1\uffff\1\57\1\0\1\57\1\56\1\4\2\55\1\0\1\55"+
        "\1\34\1\4\2\55\1\57\2\56\1\0\1\56\1\34\1\4\2\56\1\57\2\56\1\0\1"+
        "\56\1\34\1\4\2\56\1\57\2\56\1\0\1\56\1\34\1\4\2\56\1\57\2\56\1\0"+
        "\1\56\1\34\1\4\2\56\1\34\1\4\1\35\1\34\1\4\2\35\1\57\1\55\1\4\1"+
        "\0\2\56\1\0\1\56\1\34\1\4\2\56\2\57\1\56\1\4\1\0\2\56\1\0\1\56\1"+
        "\34\1\4\2\56\1\57\1\67\1\57\1\56\1\4\1\0\2\56\1\0\1\56\1\34\1\4"+
        "\2\56\1\57\1\67\2\57\1\56\1\4\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1"+
        "\57\1\67\3\57\1\56\1\4\1\0\1\35\2\0\1\35\2\56\1\34\1\4\2\35\1\57"+
        "\1\56\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1\34\1\4\2\35\1\57\1\56\1"+
        "\4\2\55\1\0\1\55\1\34\1\4\2\55\1\56\1\57\2\56\1\0\1\56\1\34\1\4"+
        "\1\56\1\34\1\4\2\35\1\57\1\56\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1"+
        "\56\1\57\2\56\1\0\1\56\1\34\1\4\1\56\1\57\2\56\1\0\1\56\1\34\1\4"+
        "\2\56\1\34\1\4\2\35\1\57\1\56\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1"+
        "\56\1\57\2\56\1\0\1\56\1\34\1\4\1\56\1\57\2\56\1\0\1\56\1\34\1\4"+
        "\2\56\1\57\2\56\1\0\1\56\1\34\1\4\2\56\1\34\1\4\2\35\1\0\1\35\2"+
        "\55\1\34\1\4\2\35\1\57\1\55\1\4\1\0\1\35\2\56\1\34\1\4\2\35\1\57"+
        "\1\55\1\4\1\57\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57\1\56\1\4\1\0"+
        "\1\35\2\56\1\34\1\4\2\35\1\57\1\55\1\4\1\57\1\0\2\56\1\0\1\56\1"+
        "\34\1\4\2\56\1\57\1\56\1\4\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57"+
        "\1\67\1\57\1\56\1\4\1\0\1\35\2\56\1\34\1\4\2\35\1\57\1\55\1\4\1"+
        "\57\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57\1\56\1\4\1\0\2\56\1\0\1"+
        "\56\1\34\1\4\2\56\1\57\1\67\1\57\1\56\1\4\1\0\2\56\1\0\1\56\1\34"+
        "\1\4\2\56\1\57\1\67\2\57\1\56\1\4\1\0\1\35\2\56\1\0\1\35\2\56\1"+
        "\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\2\55\1\0\1\55\1\34\1\4"+
        "\2\55\1\57\1\56\1\4\1\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\2"+
        "\55\1\0\1\55\1\34\1\4\2\55\1\57\1\56\1\4\1\34\1\4\2\35\1\57\1\56"+
        "\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1\56\1\57\2\56\1\0\1\56\1\34\1"+
        "\4\1\56\1\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\2\55\1\0\1\55"+
        "\1\34\1\4\2\55\1\57\1\56\1\4\1\34\1\4\2\35\1\57\1\56\1\4\2\55\1"+
        "\0\1\55\1\34\1\4\2\55\1\56\1\57\2\56\1\0\1\56\1\34\1\4\1\56\1\34"+
        "\1\4\2\35\1\57\1\56\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1\56\1\57\2"+
        "\56\1\0\1\56\1\34\1\4\1\56\1\57\2\56\1\0\1\56\1\34\1\4\2\56\1\34"+
        "\1\4\2\35\1\0\1\35\2\55\1\0\1\35\2\55\1\57\1\55\1\4\1\34\1\4\2\35"+
        "\1\0\1\35\2\56\1\0\1\35\2\55\1\57\1\55\1\4\1\34\1\4\2\35\1\0\1\35"+
        "\2\56\1\34\1\4\2\35\1\57\1\55\1\4\1\57\1\0\2\56\1\0\1\56\1\34\1"+
        "\4\2\56\1\57\1\56\1\4\1\0\1\35\2\56\1\0\1\35\2\55\1\57\1\55\1\4"+
        "\1\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\1\57\1\55\1\4\1\57\1"+
        "\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57\1\56\1\4\1\0\1\35\2\56\1\34"+
        "\1\4\2\35\1\57\1\55\1\4\1\57\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57"+
        "\1\56\1\4\1\0\2\56\1\0\1\56\1\34\1\4\2\56\1\57\1\67\1\57\1\56\1"+
        "\4\1\0\1\35\2\56\1\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\1\0\1"+
        "\35\2\56\1\0\1\35\2\56\1\34\1\4\2\35\2\55\1\0\1\55\1\34\1\4\2\55"+
        "\1\57\1\56\1\4\1\34\1\4\2\35\1\34\1\4\2\35\1\0\1\35\2\56\1\0\1\35"+
        "\2\56\1\34\1\4\2\35\2\55\1\0\1\55\1\34\1\4\2\55\1\57\1\56\1\4\1"+
        "\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\2\55\1\0\1\55\1\34\1\4"+
        "\2\55\1\57\1\56\1\4\1\34\1\4\2\35\1\57\1\56\1\4\2\55\1\0\1\55\1"+
        "\34\1\4\2\55\1\57\2\56\1\0\1\56\1\34\1\4\2\56\1\34\1\4\2\35\1\0"+
        "\1\35\2\55\1\0\1\35\2\55\1\0\1\35\2\55\1\57\1\55\1\4\1\34\1\4\2"+
        "\35\1\0\1\35\2\56\1\0\1\35\2\55\1\0\1\35\2\55\1\57\1\55\1\4\1\34"+
        "\1\4\2\35\1\0\1\35\2\56\1\0\1\35\2\55\1\57\1\55\1\4\1\34\1\4\2\35"+
        "\1\0\1\35\2\56\1\34\1\4\2\35\1\57\1\55\1\4\1\0\2\56\1\0\1\56\1\34"+
        "\1\4\2\56\2\57\1\56\1\4\1\0\1\35\2\56\1\34\1\4\2\35\1\0\1\35\2\56"+
        "\1\34\1\4\2\35\1\0\1\35\2\56\1\34\1\4\2\35\1\0\1\35\2\56\1\0\1\35"+
        "\2\56\1\34\1\4\2\35\1\57\1\56\1\4\2\55\1\0\1\55\1\34\1\4\2\55\1"+
        "\34\1\4\2\35\1\0\1\35\2\55\1\0\1\35\2\55\1\0\1\35\2\55\1\0\1\35"+
        "\2\55\1\34\1\4\2\35\1\57\1\55\1\4\1\0\1\35\2\56\1\0\1\35\2\56\1"+
        "\34\1\4\2\35\1\0\1\35\2\55";
    static final String DFA18_acceptS =
        "\12\uffff\1\1\16\uffff\1\2\u03b5\uffff";
    static final String DFA18_specialS =
        "\4\uffff\1\0\1\44\2\uffff\1\132\1\135\1\uffff\1\147\2\uffff\1\124"+
        "\14\uffff\1\133\5\uffff\1\125\10\uffff\1\35\10\uffff\1\34\10\uffff"+
        "\1\33\10\uffff\1\32\17\uffff\1\146\2\uffff\1\31\11\uffff\1\150\2"+
        "\uffff\1\14\12\uffff\1\151\2\uffff\1\15\13\uffff\1\152\2\uffff\1"+
        "\16\14\uffff\1\134\1\uffff\1\131\1\76\14\uffff\1\143\16\uffff\1"+
        "\144\11\uffff\1\17\15\uffff\1\142\11\uffff\1\13\7\uffff\1\12\16"+
        "\uffff\1\141\11\uffff\1\11\7\uffff\1\10\10\uffff\1\7\11\uffff\1"+
        "\75\12\uffff\1\74\13\uffff\1\164\2\uffff\1\6\10\uffff\1\73\13\uffff"+
        "\1\163\2\uffff\1\5\10\uffff\1\162\2\uffff\1\4\12\uffff\1\72\13\uffff"+
        "\1\161\2\uffff\1\3\10\uffff\1\160\2\uffff\1\2\12\uffff\1\157\2\uffff"+
        "\1\1\13\uffff\1\77\3\uffff\1\100\7\uffff\1\101\11\uffff\1\20\14"+
        "\uffff\1\102\11\uffff\1\21\21\uffff\1\22\11\uffff\1\36\10\uffff"+
        "\1\103\11\uffff\1\23\21\uffff\1\24\11\uffff\1\37\15\uffff\1\25\11"+
        "\uffff\1\40\7\uffff\1\41\11\uffff\1\104\3\uffff\1\105\12\uffff\1"+
        "\106\3\uffff\1\107\12\uffff\1\110\13\uffff\1\153\2\uffff\1\126\10"+
        "\uffff\1\111\3\uffff\1\112\12\uffff\1\113\13\uffff\1\154\2\uffff"+
        "\1\127\10\uffff\1\114\13\uffff\1\155\2\uffff\1\130\10\uffff\1\156"+
        "\2\uffff\1\26\12\uffff\1\115\7\uffff\1\116\7\uffff\1\117\3\uffff"+
        "\1\120\11\uffff\1\42\20\uffff\1\121\3\uffff\1\122\11\uffff\1\43"+
        "\14\uffff\1\123\11\uffff\1\30\21\uffff\1\27\10\uffff\1\140\11\uffff"+
        "\1\71\3\uffff\1\70\3\uffff\1\67\12\uffff\1\66\3\uffff\1\65\3\uffff"+
        "\1\64\12\uffff\1\63\3\uffff\1\62\12\uffff\1\61\12\uffff\1\145\2"+
        "\uffff\1\137\11\uffff\1\60\7\uffff\1\57\7\uffff\1\56\7\uffff\1\55"+
        "\3\uffff\1\54\14\uffff\1\136\11\uffff\1\53\3\uffff\1\52\3\uffff"+
        "\1\51\3\uffff\1\50\12\uffff\1\47\3\uffff\1\46\7\uffff\1\45\3\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\10\2\uffff\1\11\1\2\1\3\1\5\21\uffff\1\4\12\uffff\1\6\2\uffff"+
            "\1\12\1\uffff\1\1\2\uffff\1\7",
            "\1\22\2\uffff\1\23\1\14\1\15\1\17\21\uffff\1\16\12\uffff\1\20"+
            "\4\uffff\1\13\2\uffff\1\21",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\uffff",
            "\1\uffff",
            "\1\32",
            "\1\33",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\uffff",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\34",
            "\1\35",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\25\1\uffff\1\31\4\uffff\1\36\1\31\3\uffff\6\12\4\uffff\1"+
            "\30\1\27\1\26\1\24",
            "\1\45\2\uffff\1\46\1\37\1\40\1\42\21\uffff\1\41\12\uffff\1\43"+
            "\7\uffff\1\44",
            "\1\56\2\uffff\1\57\1\50\1\51\1\53\17\uffff\1\31\1\uffff\1\52"+
            "\12\uffff\1\54\4\uffff\1\47\2\uffff\1\55\10\31",
            "\1\67\2\uffff\1\70\1\61\1\62\1\64\21\uffff\1\63\12\uffff\1\65"+
            "\4\uffff\1\60\2\uffff\1\66",
            "\1\100\2\uffff\1\101\1\72\1\73\1\75\21\uffff\1\74\12\uffff\1"+
            "\76\4\uffff\1\71\2\uffff\1\77",
            "\1\111\2\uffff\1\112\1\103\1\104\1\106\21\uffff\1\105\12\uffff"+
            "\1\107\4\uffff\1\102\2\uffff\1\110",
            "",
            "\1\115\42\uffff\1\113\7\uffff\1\114",
            "\1\uffff",
            "\1\120\42\uffff\1\116\7\uffff\1\117",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\121",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\122",
            "\1\123",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\25\1\uffff\1\31\4\uffff\1\124\1\31\3\uffff\6\12\4\uffff\1"+
            "\30\1\27\1\26",
            "\1\134\2\uffff\1\135\1\126\1\127\1\131\21\uffff\1\130\12\uffff"+
            "\1\132\4\uffff\1\125\2\uffff\1\133",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\137",
            "\1\140",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\4\uffff\1\141\1\31\3\uffff\6\12\4\uffff\1"+
            "\30\1\27\1\26\1\136",
            "\1\151\2\uffff\1\152\1\143\1\144\1\146\21\uffff\1\145\12\uffff"+
            "\1\147\4\uffff\1\142\2\uffff\1\150",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\uffff",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\155",
            "\1\156",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\4\uffff\1\157\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26\1\153",
            "\1\167\2\uffff\1\170\1\161\1\162\1\164\21\uffff\1\163\12\uffff"+
            "\1\165\4\uffff\1\160\2\uffff\1\166",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\uffff",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\174",
            "\1\175",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\4\uffff\1\176\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\171",
            "\1\u0086\2\uffff\1\u0087\1\u0080\1\u0081\1\u0083\21\uffff\1"+
            "\u0082\12\uffff\1\u0084\4\uffff\1\177\2\uffff\1\u0085",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u008c",
            "\1\u008d",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\4\uffff\1\u008e\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0088",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0098\42\uffff\1\u0096\7\uffff\1\u0097",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0099",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u009a",
            "\1\u009b",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\4\uffff\1\u009c\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26\1\136",
            "\1\u00a3\2\uffff\1\u00a4\1\u009d\1\u009e\1\u00a0\21\uffff\1"+
            "\u009f\12\uffff\1\u00a1\7\uffff\1\u00a2",
            "\1\u00a7\42\uffff\1\u00a5\7\uffff\1\u00a6",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u00a8",
            "\1\uffff",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\uffff",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u00a9",
            "\1\u00aa",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\4\uffff\1\u00ab\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26\1\153",
            "\1\u00b2\2\uffff\1\u00b3\1\u00ac\1\u00ad\1\u00af\21\uffff\1"+
            "\u00ae\12\uffff\1\u00b0\7\uffff\1\u00b1",
            "\1\u00b4\2\uffff\1\u00bc\1\u00b6\1\u00b7\1\u00b9\17\uffff\1"+
            "\31\1\uffff\1\u00b8\12\uffff\1\u00ba\4\uffff\1\u00b5\2\uffff"+
            "\1\u00bb\10\31",
            "\1\u00bf\42\uffff\1\u00bd\7\uffff\1\u00be",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u00c0",
            "\1\uffff",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\uffff",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u00c1",
            "\1\u00c2",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\4\uffff\1\u00c3\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\171",
            "\1\u00ca\2\uffff\1\u00cb\1\u00c4\1\u00c5\1\u00c7\21\uffff\1"+
            "\u00c6\12\uffff\1\u00c8\7\uffff\1\u00c9",
            "\1\u00cc\2\uffff\1\u00d4\1\u00ce\1\u00cf\1\u00d1\17\uffff\1"+
            "\31\1\uffff\1\u00d0\12\uffff\1\u00d2\4\uffff\1\u00cd\2\uffff"+
            "\1\u00d3\10\31",
            "\1\u00dc\2\uffff\1\u00dd\1\u00d6\1\u00d7\1\u00d9\21\uffff\1"+
            "\u00d8\12\uffff\1\u00da\4\uffff\1\u00d5\2\uffff\1\u00db",
            "\1\u00e0\42\uffff\1\u00de\7\uffff\1\u00df",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u00e1",
            "\1\uffff",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\4\uffff\1\u00e4\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0088",
            "\1\u00eb\2\uffff\1\u00ec\1\u00e5\1\u00e6\1\u00e8\21\uffff\1"+
            "\u00e7\12\uffff\1\u00e9\7\uffff\1\u00ea",
            "\1\u00ed\2\uffff\1\u00f5\1\u00ef\1\u00f0\1\u00f2\17\uffff\1"+
            "\31\1\uffff\1\u00f1\12\uffff\1\u00f3\4\uffff\1\u00ee\2\uffff"+
            "\1\u00f4\10\31",
            "\1\u00fd\2\uffff\1\u00fe\1\u00f7\1\u00f8\1\u00fa\21\uffff\1"+
            "\u00f9\12\uffff\1\u00fb\4\uffff\1\u00f6\2\uffff\1\u00fc",
            "\1\u0106\2\uffff\1\u0107\1\u0100\1\u0101\1\u0103\21\uffff\1"+
            "\u0102\12\uffff\1\u0104\4\uffff\1\u00ff\2\uffff\1\u0105",
            "\1\u010a\42\uffff\1\u0108\7\uffff\1\u0109",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u010b",
            "\1\uffff",
            "\1\u0091",
            "\1\uffff",
            "\1\uffff",
            "\1\u0094",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0112\42\uffff\1\u0110\7\uffff\1\u0111",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u0113",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0114",
            "\1\u0115",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\4\uffff\1\u0116\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011d\42\uffff\1\u011b\7\uffff\1\u011c",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u011e",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u011f",
            "\1\u0120",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\154\1\uffff\1\31\4\uffff\1\u0121\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u012a\2\uffff\1\u012b\1\u0124\1\u0125\1\u0127\21\uffff\1"+
            "\u0126\12\uffff\1\u0128\4\uffff\1\u0123\2\uffff\1\u0129",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u012c",
            "\1\u012d",
            "\1\31\1\uffff\1\31\4\uffff\1\u012e\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26\1\u0122",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0135\42\uffff\1\u0133\7\uffff\1\u0134",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u0136",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0137",
            "\1\u0138",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\172\1\uffff\1\31\4\uffff\1\u0139\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0142\2\uffff\1\u0143\1\u013c\1\u013d\1\u013f\21\uffff\1"+
            "\u013e\12\uffff\1\u0140\4\uffff\1\u013b\2\uffff\1\u0141",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0144",
            "\1\u0145",
            "\1\31\1\uffff\1\31\4\uffff\1\u0146\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u013a",
            "\1\u014e\2\uffff\1\u014f\1\u0148\1\u0149\1\u014b\21\uffff\1"+
            "\u014a\12\uffff\1\u014c\4\uffff\1\u0147\2\uffff\1\u014d",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0152",
            "\1\u0153",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\4\uffff\1\u0154\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u0150",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u015b\42\uffff\1\u0159\7\uffff\1\u015a",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u015c",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\uffff",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u015d",
            "\1\u015e",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0089\1\uffff\1\31\4\uffff\1\u015f\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u0168\2\uffff\1\u0169\1\u0162\1\u0163\1\u0165\21\uffff\1"+
            "\u0164\12\uffff\1\u0166\4\uffff\1\u0161\2\uffff\1\u0167",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u016a",
            "\1\u016b",
            "\1\31\1\uffff\1\31\4\uffff\1\u016c\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0160",
            "\1\u0174\2\uffff\1\u0175\1\u016e\1\u016f\1\u0171\21\uffff\1"+
            "\u0170\12\uffff\1\u0172\4\uffff\1\u016d\2\uffff\1\u0173",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\uffff",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0178",
            "\1\u0179",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\4\uffff\1\u017a\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0176",
            "\1\u0182\2\uffff\1\u0183\1\u017c\1\u017d\1\u017f\21\uffff\1"+
            "\u017e\12\uffff\1\u0180\4\uffff\1\u017b\2\uffff\1\u0181",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\uffff",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0187",
            "\1\u0188",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\4\uffff\1\u0189\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0184",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\uffff",
            "\1\u010e",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\25\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0194\42\uffff\1\u0192\7\uffff\1\u0193",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0195",
            "\1\uffff",
            "\1\u0119",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019c\42\uffff\1\u019a\7\uffff\1\u019b",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u019d",
            "\1\u01a4\2\uffff\1\u01a5\1\u019e\1\u019f\1\u01a1\21\uffff\1"+
            "\u01a0\12\uffff\1\u01a2\7\uffff\1\u01a3",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u01a6",
            "\1\u01a7",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\4\uffff\1\u01a8\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26\1\u0122",
            "\1\u01ab\42\uffff\1\u01a9\7\uffff\1\u01aa",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u01ac",
            "\1\uffff",
            "\1\u0131",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b3\42\uffff\1\u01b1\7\uffff\1\u01b2",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u01b4",
            "\1\u01bb\2\uffff\1\u01bc\1\u01b5\1\u01b6\1\u01b8\21\uffff\1"+
            "\u01b7\12\uffff\1\u01b9\7\uffff\1\u01ba",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u01bd",
            "\1\u01be",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\4\uffff\1\u01bf\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u013a",
            "\1\u01c2\42\uffff\1\u01c0\7\uffff\1\u01c1",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u01c3",
            "\1\uffff",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\4\uffff\1\u01c6\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u0150",
            "\1\u01cd\2\uffff\1\u01ce\1\u01c7\1\u01c8\1\u01ca\21\uffff\1"+
            "\u01c9\12\uffff\1\u01cb\7\uffff\1\u01cc",
            "\1\u01cf\2\uffff\1\u01d7\1\u01d1\1\u01d2\1\u01d4\17\uffff\1"+
            "\31\1\uffff\1\u01d3\12\uffff\1\u01d5\4\uffff\1\u01d0\2\uffff"+
            "\1\u01d6\10\31",
            "\1\u01da\42\uffff\1\u01d8\7\uffff\1\u01d9",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u01db",
            "\1\uffff",
            "\1\u0157",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e2\42\uffff\1\u01e0\7\uffff\1\u01e1",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u01e3",
            "\1\u01ea\2\uffff\1\u01eb\1\u01e4\1\u01e5\1\u01e7\21\uffff\1"+
            "\u01e6\12\uffff\1\u01e8\7\uffff\1\u01e9",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u01ec",
            "\1\u01ed",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\4\uffff\1\u01ee\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0160",
            "\1\u01f1\42\uffff\1\u01ef\7\uffff\1\u01f0",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u01f2",
            "\1\uffff",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\uffff",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\4\uffff\1\u01f5\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u0176",
            "\1\u01fc\2\uffff\1\u01fd\1\u01f6\1\u01f7\1\u01f9\21\uffff\1"+
            "\u01f8\12\uffff\1\u01fa\7\uffff\1\u01fb",
            "\1\u01fe\2\uffff\1\u0206\1\u0200\1\u0201\1\u0203\17\uffff\1"+
            "\31\1\uffff\1\u0202\12\uffff\1\u0204\4\uffff\1\u01ff\2\uffff"+
            "\1\u0205\10\31",
            "\1\u0209\42\uffff\1\u0207\7\uffff\1\u0208",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u020a",
            "\1\uffff",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\uffff",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u020b",
            "\1\u020c",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\4\uffff\1\u020d\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0184",
            "\1\u0214\2\uffff\1\u0215\1\u020e\1\u020f\1\u0211\21\uffff\1"+
            "\u0210\12\uffff\1\u0212\7\uffff\1\u0213",
            "\1\u0216\2\uffff\1\u021e\1\u0218\1\u0219\1\u021b\17\uffff\1"+
            "\31\1\uffff\1\u021a\12\uffff\1\u021c\4\uffff\1\u0217\2\uffff"+
            "\1\u021d\10\31",
            "\1\u0226\2\uffff\1\u0227\1\u0220\1\u0221\1\u0223\21\uffff\1"+
            "\u0222\12\uffff\1\u0224\4\uffff\1\u021f\2\uffff\1\u0225",
            "\1\u022a\42\uffff\1\u0228\7\uffff\1\u0229",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u022b",
            "\1\uffff",
            "\1\u018c",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\u0190",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\uffff",
            "\1\u0198",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0234",
            "\1\u0235",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\4\uffff\1\u0236\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\26",
            "\1\u0239\42\uffff\1\u0237\7\uffff\1\u0238",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\uffff",
            "\1\u01af",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0243",
            "\1\u0244",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\4\uffff\1\u0245\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173",
            "\1\u0248\42\uffff\1\u0246\7\uffff\1\u0247",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u0250\42\uffff\1\u024e\7\uffff\1\u024f",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0251",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\uffff",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0252",
            "\1\u0253",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0151\1\uffff\1\31\4\uffff\1\u0254\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u025d\2\uffff\1\u025e\1\u0257\1\u0258\1\u025a\21\uffff\1"+
            "\u0259\12\uffff\1\u025b\4\uffff\1\u0256\2\uffff\1\u025c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u025f",
            "\1\u0260",
            "\1\31\1\uffff\1\31\4\uffff\1\u0261\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u0255",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\uffff",
            "\1\u01de",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u026a",
            "\1\u026b",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\4\uffff\1\u026c\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a",
            "\1\u026f\42\uffff\1\u026d\7\uffff\1\u026e",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0277\42\uffff\1\u0275\7\uffff\1\u0276",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0278",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\uffff",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0279",
            "\1\u027a",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0177\1\uffff\1\31\4\uffff\1\u027b\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u0284\2\uffff\1\u0285\1\u027e\1\u027f\1\u0281\21\uffff\1"+
            "\u0280\12\uffff\1\u0282\4\uffff\1\u027d\2\uffff\1\u0283",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u0286",
            "\1\u0287",
            "\1\31\1\uffff\1\31\4\uffff\1\u0288\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u027c",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028f\42\uffff\1\u028d\7\uffff\1\u028e",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0290",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\uffff",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0291",
            "\1\u0292",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0185\1\uffff\1\31\4\uffff\1\u0293\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u029c\2\uffff\1\u029d\1\u0296\1\u0297\1\u0299\21\uffff\1"+
            "\u0298\12\uffff\1\u029a\4\uffff\1\u0295\2\uffff\1\u029b",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u029e",
            "\1\u029f",
            "\1\31\1\uffff\1\31\4\uffff\1\u02a0\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0294",
            "\1\u02a8\2\uffff\1\u02a9\1\u02a2\1\u02a3\1\u02a5\21\uffff\1"+
            "\u02a4\12\uffff\1\u02a6\4\uffff\1\u02a1\2\uffff\1\u02a7",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\uffff",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\4\uffff\1\u02ae\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u02aa",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\uffff",
            "\1\u022e",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\u0232",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\154\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u02b5\42\uffff\1\u02b3\7\uffff\1\u02b4",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\uffff",
            "\1\u023d",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\u0241",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\172\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u02bd\42\uffff\1\u02bb\7\uffff\1\u02bc",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\uffff",
            "\1\u024c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c9\42\uffff\1\u02c7\7\uffff\1\u02c8",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u02ca",
            "\1\u02d1\2\uffff\1\u02d2\1\u02cb\1\u02cc\1\u02ce\21\uffff\1"+
            "\u02cd\12\uffff\1\u02cf\7\uffff\1\u02d0",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u02d3",
            "\1\u02d4",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\31\1\uffff\1\31\4\uffff\1\u02d5\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173\1\u0255",
            "\1\u02d8\42\uffff\1\u02d6\7\uffff\1\u02d7",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u02d9",
            "\1\uffff",
            "\1\u0264",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\u0268",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0089\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u02dc\42\uffff\1\u02da\7\uffff\1\u02db",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\uffff",
            "\1\u0273",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e8\42\uffff\1\u02e6\7\uffff\1\u02e7",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u02e9",
            "\1\u02f0\2\uffff\1\u02f1\1\u02ea\1\u02eb\1\u02ed\21\uffff\1"+
            "\u02ec\12\uffff\1\u02ee\7\uffff\1\u02ef",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u02f2",
            "\1\u02f3",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\31\1\uffff\1\31\4\uffff\1\u02f4\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a\1\u027c",
            "\1\u02f7\42\uffff\1\u02f5\7\uffff\1\u02f6",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u02f8",
            "\1\uffff",
            "\1\u028b",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02ff\42\uffff\1\u02fd\7\uffff\1\u02fe",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0300",
            "\1\u0307\2\uffff\1\u0308\1\u0301\1\u0302\1\u0304\21\uffff\1"+
            "\u0303\12\uffff\1\u0305\7\uffff\1\u0306",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u0309",
            "\1\u030a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\31\1\uffff\1\31\4\uffff\1\u030b\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0294",
            "\1\u030e\42\uffff\1\u030c\7\uffff\1\u030d",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u030f",
            "\1\uffff",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\uffff",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0310",
            "\1\u0311",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\4\uffff\1\u0312\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u02aa",
            "\1\u0319\2\uffff\1\u031a\1\u0313\1\u0314\1\u0316\21\uffff\1"+
            "\u0315\12\uffff\1\u0317\7\uffff\1\u0318",
            "\1\u0322\2\uffff\1\u0323\1\u031c\1\u031d\1\u031f\17\uffff\1"+
            "\31\1\uffff\1\u031e\12\uffff\1\u0320\4\uffff\1\u031b\2\uffff"+
            "\1\u0321\10\31",
            "\1\u0326\42\uffff\1\u0324\7\uffff\1\u0325",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0327",
            "\1\uffff",
            "\1\u02b1",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\uffff",
            "\1\u02b9",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\uffff",
            "\1\u02c1",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\u02c5",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0334",
            "\1\u0335",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\4\uffff\1\u0336\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\27\1\173",
            "\1\u0339\42\uffff\1\u0337\7\uffff\1\u0338",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u033a",
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
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\u02e4",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u0347",
            "\1\u0348",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\4\uffff\1\u0349\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u008a",
            "\1\u034c\42\uffff\1\u034a\7\uffff\1\u034b",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\uffff",
            "\1\u02fb",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u0356",
            "\1\u0357",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\4\uffff\1\u0358\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186",
            "\1\u035b\42\uffff\1\u0359\7\uffff\1\u035a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0363\42\uffff\1\u0361\7\uffff\1\u0362",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0364",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\uffff",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0365",
            "\1\u0366",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u02ab\1\uffff\1\31\4\uffff\1\u0367\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186",
            "\1\u036f\2\uffff\1\u0370\1\u0369\1\u036a\1\u036c\21\uffff\1"+
            "\u036b\12\uffff\1\u036d\4\uffff\1\u0368\2\uffff\1\u036e",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\4\uffff\1\u0374\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0371",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\uffff",
            "\1\u032a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\u032e",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\u0332",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0151\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u037b\42\uffff\1\u0379\7\uffff\1\u037a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\uffff",
            "\1\u033d",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\uffff",
            "\1\u0341",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\u0345",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0177\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0383\42\uffff\1\u0381\7\uffff\1\u0382",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\uffff",
            "\1\u0350",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\uffff",
            "\1\u0354",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0185\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u038b\42\uffff\1\u0389\7\uffff\1\u038a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\uffff",
            "\1\u035f",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0397\42\uffff\1\u0395\7\uffff\1\u0396",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0398",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u0399",
            "\1\u039a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\4\uffff\1\u039b\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186\1\u0371",
            "\1\u03a2\2\uffff\1\u03a3\1\u039c\1\u039d\1\u039f\21\uffff\1"+
            "\u039e\12\uffff\1\u03a0\7\uffff\1\u03a1",
            "\1\u03a6\42\uffff\1\u03a4\7\uffff\1\u03a5",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03a7",
            "\1\uffff",
            "\1\u0377",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\uffff",
            "\1\u037f",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u0255",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\uffff",
            "\1\u0387",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u027c",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\uffff",
            "\1\u038f",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0294",
            "\1\uffff",
            "\1\u0393",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03ba\42\uffff\1\u03b8\7\uffff\1\u03b9",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03bb",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u03bc",
            "\1\u03bd",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\4\uffff\1\u03be\1\31\3\uffff\6\12\4\uffff"+
            "\1\30\1\u008b\1\u0186",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\1\uffff",
            "\1\u03aa",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\u03ae",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\u03b2",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\u03b6",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u02ab\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c9\42\uffff\1\u03c7\7\uffff\1\u03c8",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u03ca",
            "\1\uffff",
            "\1\u03c1",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\u03c5",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\uffff",
            "\1\u03cd",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\5\uffff\1\31\3\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "2374:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_382 = input.LA(1);

                         
                        int index18_382 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_382);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_368 = input.LA(1);

                         
                        int index18_368 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_368);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_356 = input.LA(1);

                         
                        int index18_356 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_356);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_330 = input.LA(1);

                         
                        int index18_330 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_330);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_318 = input.LA(1);

                         
                        int index18_318 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_318);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_294 = input.LA(1);

                         
                        int index18_294 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_294);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_258 = input.LA(1);

                         
                        int index18_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_258);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_249 = input.LA(1);

                         
                        int index18_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_249);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_241 = input.LA(1);

                         
                        int index18_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_241);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_216 = input.LA(1);

                         
                        int index18_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_216);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_208 = input.LA(1);

                         
                        int index18_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_208);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_101 = input.LA(1);

                         
                        int index18_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_101);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_115 = input.LA(1);

                         
                        int index18_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_115);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_130 = input.LA(1);

                         
                        int index18_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_130);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_184 = input.LA(1);

                         
                        int index18_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_184);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_416 = input.LA(1);

                         
                        int index18_416 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_416);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA18_439 = input.LA(1);

                         
                        int index18_439 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_439);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA18_457 = input.LA(1);

                         
                        int index18_457 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_457);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA18_486 = input.LA(1);

                         
                        int index18_486 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_486);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA18_504 = input.LA(1);

                         
                        int index18_504 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_504);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA18_528 = input.LA(1);

                         
                        int index18_528 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_528);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA18_676 = input.LA(1);

                         
                        int index18_676 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_676);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA18_789 = input.LA(1);

                         
                        int index18_789 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_789);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA18_771 = input.LA(1);

                         
                        int index18_771 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_771);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA18_88 = input.LA(1);

                         
                        int index18_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_88);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA18_69 = input.LA(1);

                         
                        int index18_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_69);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA18_60 = input.LA(1);

                         
                        int index18_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_60);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA18_51 = input.LA(1);

                         
                        int index18_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_51);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA18_42 = input.LA(1);

                         
                        int index18_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_42);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA18_467 = input.LA(1);

                         
                        int index18_467 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_467);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA18_514 = input.LA(1);

                         
                        int index18_514 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_514);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA18_538 = input.LA(1);

                         
                        int index18_538 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_538);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA18_546 = input.LA(1);

                         
                        int index18_546 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_546);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA18_717 = input.LA(1);

                         
                        int index18_717 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_717);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA18_748 = input.LA(1);

                         
                        int index18_748 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_748);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA18_971 = input.LA(1);

                         
                        int index18_971 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_971);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA18_963 = input.LA(1);

                         
                        int index18_963 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_963);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA18_959 = input.LA(1);

                         
                        int index18_959 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_959);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA18_948 = input.LA(1);

                         
                        int index18_948 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_948);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA18_944 = input.LA(1);

                         
                        int index18_944 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_944);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA18_940 = input.LA(1);

                         
                        int index18_940 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_940);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA18_936 = input.LA(1);

                         
                        int index18_936 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_936);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA18_913 = input.LA(1);

                         
                        int index18_913 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_913);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA18_909 = input.LA(1);

                         
                        int index18_909 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_909);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA18_901 = input.LA(1);

                         
                        int index18_901 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_901);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA18_893 = input.LA(1);

                         
                        int index18_893 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_893);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA18_885 = input.LA(1);

                         
                        int index18_885 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_885);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA18_861 = input.LA(1);

                         
                        int index18_861 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_861);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA18_850 = input.LA(1);

                         
                        int index18_850 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_850);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA18_846 = input.LA(1);

                         
                        int index18_846 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_846);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA18_835 = input.LA(1);

                         
                        int index18_835 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_835);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA18_831 = input.LA(1);

                         
                        int index18_831 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_831);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA18_827 = input.LA(1);

                         
                        int index18_827 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_827);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA18_816 = input.LA(1);

                         
                        int index18_816 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_816);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA18_812 = input.LA(1);

                         
                        int index18_812 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_812);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA18_808 = input.LA(1);

                         
                        int index18_808 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_808);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA18_341 = input.LA(1);

                         
                        int index18_341 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_341);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA18_303 = input.LA(1);

                         
                        int index18_303 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_303);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA18_279 = input.LA(1);

                         
                        int index18_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_279);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA18_268 = input.LA(1);

                         
                        int index18_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_268);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA18_146 = input.LA(1);

                         
                        int index18_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_146);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA18_394 = input.LA(1);

                         
                        int index18_394 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_394);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA18_398 = input.LA(1);

                         
                        int index18_398 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_398);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA18_406 = input.LA(1);

                         
                        int index18_406 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_406);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA18_429 = input.LA(1);

                         
                        int index18_429 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_429);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA18_476 = input.LA(1);

                         
                        int index18_476 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_476);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA18_556 = input.LA(1);

                         
                        int index18_556 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_556);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA18_560 = input.LA(1);

                         
                        int index18_560 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_560);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA18_571 = input.LA(1);

                         
                        int index18_571 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_571);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA18_575 = input.LA(1);

                         
                        int index18_575 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_575);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA18_586 = input.LA(1);

                         
                        int index18_586 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_586);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA18_610 = input.LA(1);

                         
                        int index18_610 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_610);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA18_614 = input.LA(1);

                         
                        int index18_614 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_614);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA18_625 = input.LA(1);

                         
                        int index18_625 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_625);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA18_649 = input.LA(1);

                         
                        int index18_649 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_649);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA18_687 = input.LA(1);

                         
                        int index18_687 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_687);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA18_695 = input.LA(1);

                         
                        int index18_695 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_695);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA18_703 = input.LA(1);

                         
                        int index18_703 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_703);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA18_707 = input.LA(1);

                         
                        int index18_707 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_707);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA18_734 = input.LA(1);

                         
                        int index18_734 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_734);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA18_738 = input.LA(1);

                         
                        int index18_738 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_738);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA18_761 = input.LA(1);

                         
                        int index18_761 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_761);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA18_14 = input.LA(1);

                         
                        int index18_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_14);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA18_33 = input.LA(1);

                         
                        int index18_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_33);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA18_601 = input.LA(1);

                         
                        int index18_601 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_601);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA18_640 = input.LA(1);

                         
                        int index18_640 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_640);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA18_664 = input.LA(1);

                         
                        int index18_664 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_664);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA18_145 = input.LA(1);

                         
                        int index18_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_145);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_27);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA18_143 = input.LA(1);

                         
                        int index18_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_143);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA18_926 = input.LA(1);

                         
                        int index18_926 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_926);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA18_875 = input.LA(1);

                         
                        int index18_875 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_875);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA18_798 = input.LA(1);

                         
                        int index18_798 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_798);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA18_231 = input.LA(1);

                         
                        int index18_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_231);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA18_198 = input.LA(1);

                         
                        int index18_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_198);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA18_159 = input.LA(1);

                         
                        int index18_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_159);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA18_174 = input.LA(1);

                         
                        int index18_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_174);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA18_872 = input.LA(1);

                         
                        int index18_872 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_872);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA18_85 = input.LA(1);

                         
                        int index18_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_85);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA18_11 = input.LA(1);

                         
                        int index18_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_11);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA18_98 = input.LA(1);

                         
                        int index18_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_98);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA18_112 = input.LA(1);

                         
                        int index18_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_112);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA18_127 = input.LA(1);

                         
                        int index18_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_127);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA18_598 = input.LA(1);

                         
                        int index18_598 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_598);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA18_637 = input.LA(1);

                         
                        int index18_637 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_637);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA18_661 = input.LA(1);

                         
                        int index18_661 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_661);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA18_673 = input.LA(1);

                         
                        int index18_673 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_673);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA18_379 = input.LA(1);

                         
                        int index18_379 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_379);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA18_365 = input.LA(1);

                         
                        int index18_365 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_365);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA18_353 = input.LA(1);

                         
                        int index18_353 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_353);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA18_327 = input.LA(1);

                         
                        int index18_327 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_327);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA18_315 = input.LA(1);

                         
                        int index18_315 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_315);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA18_291 = input.LA(1);

                         
                        int index18_291 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index18_291);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend137 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_17_in_ruleStateExtend154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStateExtend164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend185 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_18_in_ruleStateExtend203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend224 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_17_in_ruleStateExtend242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend263 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_19_in_ruleStateExtend281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend302 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_20_in_ruleStateExtend320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariables_in_ruleStateExtend341 = new BitSet(new long[]{0x00000000001E0012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegionSignalDec436 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRegionSignalDec446 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleRegionSignalDec458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec479 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec511 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec552 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec584 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec600 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRegionSignalDec610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec631 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec663 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec683 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRegionSignalDec693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec714 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRegionSignalDec725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec746 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleRegionSignalDec761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables854 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleVariables865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleVariables886 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleVariables899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals992 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleSignals1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals1024 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleSignals1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1130 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInputSignals1141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1162 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInputSignals1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1268 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleOutputSignals1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1300 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleOutputSignals1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1406 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInOutputSignals1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1438 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInOutputSignals1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1568 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1583 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1629 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1693 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1726 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1742 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal1821 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSignal1838 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1859 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSignal1869 = new BitSet(new long[]{0x07802B0000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1916 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1931 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1978 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2011 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2027 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2074 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleSignal2107 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSignal2124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2141 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSignal2156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSignal2220 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2241 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSignal2251 = new BitSet(new long[]{0x07802B0000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2298 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSignal2314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2331 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSignal2346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleSignal2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2487 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2502 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2548 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable2564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2612 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2645 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2661 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2722 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable2785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_ruleVariable2802 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVariable2818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_ruleVariable2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3093 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEmission3104 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission3125 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleEmission3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3230 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment3240 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3349 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleTextEffect3365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3382 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTextEffect3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression3655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3715 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression3748 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3769 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression3867 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression3900 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression3921 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4020 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4053 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression4336 = new BitSet(new long[]{0x0000848010000490L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4577 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4610 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4631 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4729 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression4762 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4783 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression4821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression4881 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression4914 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression4935 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression4973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5033 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5066 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression5125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression5185 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression5218 = new BitSet(new long[]{0x0000808010000790L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression5277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression5346 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicExpression5540 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5565 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicExpression5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicValuedExpression5747 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtomicValuedExpression5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression5848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5917 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleValuedObjectTestExpression5927 = new BitSet(new long[]{0x0000808000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5948 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleValuedObjectTestExpression5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression5999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6230 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleTextExpression6246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6263 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTextExpression6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue6407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue6458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration6591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleISignal_in_entryRuleISignal6716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleISignal6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleISignal6768 = new BitSet(new long[]{0x0000000012200002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleISignal6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl6831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceSignalDecl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl6889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl6910 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceSignalDecl6921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl6942 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceSignalDecl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInterfaceSignalDecl6984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7005 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceSignalDecl7016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7037 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceSignalDecl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInterfaceSignalDecl7079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7100 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceSignalDecl7111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7132 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceSignalDecl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInterfaceSignalDecl7174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7195 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceSignalDecl7206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7227 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceSignalDecl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription7276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleChannelDescription7322 = new BitSet(new long[]{0x00FF000004000010L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleChannelDescription7361 = new BitSet(new long[]{0x00FF000004000010L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7382 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleChannelDescription7392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleChannelDescription7410 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleChannelDescription7431 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleChannelDescription7441 = new BitSet(new long[]{0x00FF000004000010L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl7499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceVariableDecl7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceVariableDecl7544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl7565 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceVariableDecl7576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl7597 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl7635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl7691 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleVariableDecl7702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl7723 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleVariableDecl7735 = new BitSet(new long[]{0x00FF000004000010L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIVariable_in_entryRuleIVariable7792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIVariable7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIVariable7844 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleIVariable7860 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIVariable7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier7919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdentifier7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTypeIdentifier8020 = new BitSet(new long[]{0x00FF000000000010L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier8042 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier8065 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeIdentifier8081 = new BitSet(new long[]{0x07802B0000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation8232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleKeyValueAnnotation8277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValueAnnotation8294 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyValueAnnotation8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDivOperator8492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCompareOperator8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOperator8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompareOperator8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOperator8579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCompareOperator8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCompareOperator8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePreOperator8651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOrOperator8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAndOperator8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotOperator8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAddOperator8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSubOperator8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleMultOperator8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleModOperator8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueTestOperator8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType9096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValueType9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValueType9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCombineOperator9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCombineOperator9229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCombineOperator9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred373497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred404020 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_synpred404053 = new BitSet(new long[]{0x0000948010000790L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred404074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred414202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_synpred465066 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleModExpression_in_synpred465087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred545747 = new BitSet(new long[]{0x0000908010000790L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred545772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred545781 = new BitSet(new long[]{0x0000000000000002L});

}