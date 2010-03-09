package de.cau.cs.kieler.synccharts.interfacedeclparser.parser.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.interfacedeclparser.services.InterfaceDeclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalInterfaceDeclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "':'", "'var'", "','", "';'", "':='", "'combine'", "'with'", "'host'", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'+'", "'*'", "'max'", "'min'", "'or'", "'and'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalInterfaceDeclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g"; }



     	private InterfaceDeclGrammarAccess grammarAccess;
     	
        public InternalInterfaceDeclParser(TokenStream input, IAstFactory factory, InterfaceDeclGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateExtend";	
       	} 



    // $ANTLR start entryRuleStateExtend
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:73:1: entryRuleStateExtend returns [EObject current=null] : iv_ruleStateExtend= ruleStateExtend EOF ;
    public final EObject entryRuleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExtend = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:74:2: (iv_ruleStateExtend= ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:75:2: iv_ruleStateExtend= ruleStateExtend EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateExtendRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateExtend_in_entryRuleStateExtend75);
            iv_ruleStateExtend=ruleStateExtend();
            _fsp--;

             current =iv_ruleStateExtend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExtend85); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:82:1: ruleStateExtend returns [EObject current=null] : ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) )+ ;
    public final EObject ruleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject lv_regions_0_0 = null;

        EObject lv_inOutputSignals_3_0 = null;

        EObject lv_outputSignals_5_0 = null;

        EObject lv_inputSignals_7_0 = null;

        EObject lv_signals_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:87:6: ( ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) )+ )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) )+
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt1=1;
                    }
                    break;
                case 11:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==12) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_ID) ) {
                        alt1=4;
                    }


                    }
                    break;
                case 12:
                    {
                    alt1=3;
                    }
                    break;
                case 13:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:89:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:89:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:90:3: lv_regions_0_0= ruleRegionSignalDec
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRegionSignalDec_in_ruleStateExtend131);
            	    lv_regions_0_0=ruleRegionSignalDec();
            	    _fsp--;


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
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:113:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:113:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:113:8: 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend148); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_1_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleStateExtend158); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:121:1: ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:122:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:122:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:123:3: lv_inOutputSignals_3_0= ruleInOutputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInOutputSignals_in_ruleStateExtend179);
            	    lv_inOutputSignals_3_0=ruleInOutputSignals();
            	    _fsp--;


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
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:8: 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    {
            	    match(input,12,FOLLOW_12_in_ruleStateExtend197); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:150:1: ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:151:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:151:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:152:3: lv_outputSignals_5_0= ruleOutputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutputSignals_in_ruleStateExtend218);
            	    lv_outputSignals_5_0=ruleOutputSignals();
            	    _fsp--;


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
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:175:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:175:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:175:8: 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend236); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:179:1: ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:180:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:180:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:181:3: lv_inputSignals_7_0= ruleInputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputSignals_in_ruleStateExtend257);
            	    lv_inputSignals_7_0=ruleInputSignals();
            	    _fsp--;


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
            	    break;
            	case 5 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:204:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:204:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:204:8: 'signal' ( (lv_signals_9_0= ruleSignals ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleStateExtend275); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:208:1: ( (lv_signals_9_0= ruleSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:1: (lv_signals_9_0= ruleSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:1: (lv_signals_9_0= ruleSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:210:3: lv_signals_9_0= ruleSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignals_in_ruleStateExtend296);
            	    lv_signals_9_0=ruleSignals();
            	    _fsp--;


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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:240:1: entryRuleRegionSignalDec returns [EObject current=null] : iv_ruleRegionSignalDec= ruleRegionSignalDec EOF ;
    public final EObject entryRuleRegionSignalDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionSignalDec = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:241:2: (iv_ruleRegionSignalDec= ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:242:2: iv_ruleRegionSignalDec= ruleRegionSignalDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRegionSignalDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec334);
            iv_ruleRegionSignalDec=ruleRegionSignalDec();
            _fsp--;

             current =iv_ruleRegionSignalDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionSignalDec344); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:249:1: ruleRegionSignalDec returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) ;
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


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:254:6: ( ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:255:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:255:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:255:2: ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:255:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:256:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:256:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:257:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegionSignalDec387); 

            		createLeafNode(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0(), "region"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRegionSignalDec397); 

                    createLeafNode(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:273:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("273:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:273:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:273:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:273:4: 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    {
                    match(input,15,FOLLOW_15_in_ruleRegionSignalDec409); 

                            createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:277:1: ( (lv_vars_3_0= ruleVariable ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:278:1: (lv_vars_3_0= ruleVariable )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:278:1: (lv_vars_3_0= ruleVariable )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:279:3: lv_vars_3_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec430);
                    lv_vars_3_0=ruleVariable();
                    _fsp--;


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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:301:2: ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_ID) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:301:4: ',' ( (lv_vars_5_0= ruleVariable ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec441); 

                    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:305:1: ( (lv_vars_5_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:306:1: (lv_vars_5_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:306:1: (lv_vars_5_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:307:3: lv_vars_5_0= ruleVariable
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec462);
                    	    lv_vars_5_0=ruleVariable();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:330:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:330:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:330:8: 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    {
                    match(input,13,FOLLOW_13_in_ruleRegionSignalDec482); 

                            createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:334:1: ( (lv_signals_7_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:335:1: (lv_signals_7_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:335:1: (lv_signals_7_0= ruleSignal )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:336:3: lv_signals_7_0= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec503);
                    lv_signals_7_0=ruleSignal();
                    _fsp--;


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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:358:2: ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:358:4: ',' ( (lv_signals_9_0= ruleSignal ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec514); 

                    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:362:1: ( (lv_signals_9_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:363:1: (lv_signals_9_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:363:1: (lv_signals_9_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:364:3: lv_signals_9_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec535);
                    	    lv_signals_9_0=ruleSignal();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:386:6: ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==15) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==13) ) {
                        alt7=2;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:386:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:386:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:386:9: ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    {
            	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec551); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0(), null); 
            	        
            	    match(input,15,FOLLOW_15_in_ruleRegionSignalDec561); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:394:1: ( (lv_vars_12_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:395:1: (lv_vars_12_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:395:1: (lv_vars_12_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:396:3: lv_vars_12_0= ruleVariable
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec582);
            	    lv_vars_12_0=ruleVariable();
            	    _fsp--;


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

            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:418:2: ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==16) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:418:4: ',' ( (lv_vars_14_0= ruleVariable ) )
            	    	    {
            	    	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec593); 

            	    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0(), null); 
            	    	        
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:422:1: ( (lv_vars_14_0= ruleVariable ) )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:423:1: (lv_vars_14_0= ruleVariable )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:423:1: (lv_vars_14_0= ruleVariable )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:424:3: lv_vars_14_0= ruleVariable
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec614);
            	    	    lv_vars_14_0=ruleVariable();
            	    	    _fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:447:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:447:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:447:8: ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    {
            	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec634); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0(), null); 
            	        
            	    match(input,13,FOLLOW_13_in_ruleRegionSignalDec644); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:455:1: ( (lv_signals_17_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:456:1: (lv_signals_17_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:456:1: (lv_signals_17_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:457:3: lv_signals_17_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec665);
            	    lv_signals_17_0=ruleSignal();
            	    _fsp--;


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

            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:479:2: ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==16) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:479:4: ',' ( (lv_signals_19_0= ruleSignal ) )
            	    	    {
            	    	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec676); 

            	    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0(), null); 
            	    	        
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:483:1: ( (lv_signals_19_0= ruleSignal ) )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:484:1: (lv_signals_19_0= ruleSignal )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:484:1: (lv_signals_19_0= ruleSignal )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:485:3: lv_signals_19_0= ruleSignal
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec697);
            	    	    lv_signals_19_0=ruleSignal();
            	    	    _fsp--;


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

            match(input,17,FOLLOW_17_in_ruleRegionSignalDec712); 

                    createLeafNode(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:519:1: entryRuleSignals returns [EObject current=null] : iv_ruleSignals= ruleSignals EOF ;
    public final EObject entryRuleSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:520:2: (iv_ruleSignals= ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:521:2: iv_ruleSignals= ruleSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignals_in_entryRuleSignals748);
            iv_ruleSignals=ruleSignals();
            _fsp--;

             current =iv_ruleSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignals758); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:528:1: ruleSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:533:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:534:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:535:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:535:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:536:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleSignals805);
            lv_signals_0_0=ruleSignal();
            _fsp--;


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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:558:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:558:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSignals816); 

            	            createLeafNode(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:562:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:563:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:563:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:564:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleSignals837);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            match(input,17,FOLLOW_17_in_ruleSignals850); 

                    createLeafNode(grammarAccess.getSignalsAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:598:1: entryRuleInputSignals returns [EObject current=null] : iv_ruleInputSignals= ruleInputSignals EOF ;
    public final EObject entryRuleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:599:2: (iv_ruleInputSignals= ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:600:2: iv_ruleInputSignals= ruleInputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals886);
            iv_ruleInputSignals=ruleInputSignals();
            _fsp--;

             current =iv_ruleInputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals896); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:607:1: ruleInputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:612:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:613:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:614:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:614:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:615:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals943);
            lv_signals_0_0=ruleSignal();
            _fsp--;


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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:637:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:637:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleInputSignals954); 

            	            createLeafNode(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:641:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:642:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:642:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:643:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals975);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            match(input,17,FOLLOW_17_in_ruleInputSignals988); 

                    createLeafNode(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:677:1: entryRuleOutputSignals returns [EObject current=null] : iv_ruleOutputSignals= ruleOutputSignals EOF ;
    public final EObject entryRuleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:678:2: (iv_ruleOutputSignals= ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:679:2: iv_ruleOutputSignals= ruleOutputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1024);
            iv_ruleOutputSignals=ruleOutputSignals();
            _fsp--;

             current =iv_ruleOutputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals1034); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:686:1: ruleOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:691:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:692:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:693:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:693:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:694:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1081);
            lv_signals_0_0=ruleSignal();
            _fsp--;


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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:716:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:716:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleOutputSignals1092); 

            	            createLeafNode(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:720:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:721:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:721:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:722:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1113);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            match(input,17,FOLLOW_17_in_ruleOutputSignals1126); 

                    createLeafNode(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:756:1: entryRuleInOutputSignals returns [EObject current=null] : iv_ruleInOutputSignals= ruleInOutputSignals EOF ;
    public final EObject entryRuleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:757:2: (iv_ruleInOutputSignals= ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:758:2: iv_ruleInOutputSignals= ruleInOutputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInOutputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1162);
            iv_ruleInOutputSignals=ruleInOutputSignals();
            _fsp--;

             current =iv_ruleInOutputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals1172); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:765:1: ruleInOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:770:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:771:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:772:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:772:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:773:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1219);
            lv_signals_0_0=ruleSignal();
            _fsp--;


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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:795:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:795:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleInOutputSignals1230); 

            	            createLeafNode(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:799:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:800:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:800:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:801:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1251);
            	    lv_signals_2_0=ruleSignal();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            match(input,17,FOLLOW_17_in_ruleInOutputSignals1264); 

                    createLeafNode(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:835:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:836:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:837:2: iv_ruleSignal= ruleSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1300);
            iv_ruleSignal=ruleSignal();
            _fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1310); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:844:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) ) ;
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


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:849:6: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )
            int alt12=10;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==RULE_STRING) ) {
                        switch ( input.LA(4) ) {
                        case 19:
                            {
                            int LA12_11 = input.LA(5);

                            if ( (LA12_11==RULE_STRING) ) {
                                alt12=8;
                            }
                            else if ( ((LA12_11>=22 && LA12_11<=27)) ) {
                                alt12=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 11, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA12_12 = input.LA(5);

                            if ( (LA12_12==RULE_STRING) ) {
                                alt12=7;
                            }
                            else if ( ((LA12_12>=22 && LA12_12<=27)) ) {
                                alt12=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 12, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case 16:
                        case 17:
                            {
                            alt12=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_STRING) ) {
                        alt12=10;
                    }
                    else if ( ((LA12_3>=22 && LA12_3<=27)) ) {
                        alt12=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA12_4 = input.LA(3);

                    if ( (LA12_4==RULE_STRING) ) {
                        alt12=6;
                    }
                    else if ( ((LA12_4>=22 && LA12_4<=27)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 16:
                case 17:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:851:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:851:1: (lv_name_0_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:852:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1352); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
                    		

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
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:7: ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:876:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:876:1: (lv_name_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:877:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1381); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                    		

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

                    match(input,14,FOLLOW_14_in_ruleSignal1396); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:903:1: ( (lv_type_3_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:904:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:904:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:905:3: lv_type_3_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1417);
                    lv_type_3_0=ruleValueType();
                    _fsp--;


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
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:7: ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:7: ( (lv_name_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:929:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:929:1: (lv_name_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:930:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1442); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:952:2: ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:952:4: ':=' ( (lv_initialValue_6_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1458); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:956:1: ( (lv_initialValue_6_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:957:1: (lv_initialValue_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:957:1: (lv_initialValue_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:958:3: lv_initialValue_6_0= RULE_STRING
                    {
                    lv_initialValue_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1475); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_2_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_6_0, 
                    	        		"STRING", 
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
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:7: ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:7: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:982:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:982:1: (lv_name_7_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:983:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1506); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:2: ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:4: ':=' ( (lv_initialValue_9_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1522); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1009:1: ( (lv_initialValue_9_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1010:1: (lv_initialValue_9_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1010:1: (lv_initialValue_9_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1011:3: lv_initialValue_9_0= RULE_STRING
                    {
                    lv_initialValue_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1539); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_3_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_9_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleSignal1555); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_3_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1037:1: ( (lv_type_11_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1038:1: (lv_type_11_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1038:1: (lv_type_11_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1039:3: lv_type_11_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1576);
                    lv_type_11_0=ruleValueType();
                    _fsp--;


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
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:7: ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:7: ( (lv_name_12_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1063:1: (lv_name_12_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1063:1: (lv_name_12_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1064:3: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1601); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1086:2: ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1086:4: ':=' ( (lv_initialValue_14_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1617); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1090:1: ( (lv_initialValue_14_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1091:1: (lv_initialValue_14_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1091:1: (lv_initialValue_14_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1092:3: lv_initialValue_14_0= RULE_STRING
                    {
                    lv_initialValue_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1634); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_4_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_14_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:3: ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:5: 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1651); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1118:1: ( (lv_type_16_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1119:1: (lv_type_16_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1119:1: (lv_type_16_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1120:3: lv_type_16_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1672);
                    lv_type_16_0=ruleValueType();
                    _fsp--;


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

                    match(input,20,FOLLOW_20_in_ruleSignal1682); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_4_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1146:1: ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1147:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1147:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1148:3: lv_combineOperator_18_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1703);
                    lv_combineOperator_18_0=ruleCombineOperator();
                    _fsp--;


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
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1171:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1171:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1171:7: ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1171:7: ( (lv_name_19_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1172:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1172:1: (lv_name_19_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1173:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1729); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0(), "name"); 
                    		

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

                    match(input,14,FOLLOW_14_in_ruleSignal1744); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_1(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1199:1: ( (lv_hostType_21_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1200:1: (lv_hostType_21_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1200:1: (lv_hostType_21_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1201:3: lv_hostType_21_0= RULE_STRING
                    {
                    lv_hostType_21_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1761); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_2_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_21_0, 
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
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1224:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1224:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1224:7: ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1224:7: ( (lv_name_22_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1225:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1225:1: (lv_name_22_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1226:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1791); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1248:2: ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1248:4: ':=' ( (lv_initialValue_24_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1807); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1252:1: ( (lv_initialValue_24_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1253:1: (lv_initialValue_24_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1253:1: (lv_initialValue_24_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1254:3: lv_initialValue_24_0= RULE_STRING
                    {
                    lv_initialValue_24_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1824); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_6_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_24_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleSignal1840); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_6_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1280:1: ( (lv_hostType_26_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1281:1: (lv_hostType_26_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1281:1: (lv_hostType_26_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1282:3: lv_hostType_26_0= RULE_STRING
                    {
                    lv_hostType_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1857); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_6_3_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_26_0, 
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
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1305:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1305:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1305:7: ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1305:7: ( (lv_name_27_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1306:1: (lv_name_27_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1306:1: (lv_name_27_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1307:3: lv_name_27_0= RULE_ID
                    {
                    lv_name_27_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1887); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1329:2: ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1329:4: ':=' ( (lv_initialValue_29_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1903); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1333:1: ( (lv_initialValue_29_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1334:1: (lv_initialValue_29_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1334:1: (lv_initialValue_29_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1335:3: lv_initialValue_29_0= RULE_STRING
                    {
                    lv_initialValue_29_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1920); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_7_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_29_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1357:3: ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1357:5: 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1937); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1361:1: ( (lv_hostType_31_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1362:1: (lv_hostType_31_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1362:1: (lv_hostType_31_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1363:3: lv_hostType_31_0= RULE_STRING
                    {
                    lv_hostType_31_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1954); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_7_2_1_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_31_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal1969); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_7_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1389:1: ( (lv_hostCombineOperator_33_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1390:1: (lv_hostCombineOperator_33_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1390:1: (lv_hostCombineOperator_33_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1391:3: lv_hostCombineOperator_33_0= RULE_STRING
                    {
                    lv_hostCombineOperator_33_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1986); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_7_2_3_0(), "hostCombineOperator"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostCombineOperator",
                    	        		lv_hostCombineOperator_33_0, 
                    	        		"STRING", 
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
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1414:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1414:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1414:7: ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1414:7: ( (lv_name_34_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1415:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1415:1: (lv_name_34_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1416:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2017); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_8_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1438:2: ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1438:4: 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal2033); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1442:1: ( (lv_type_36_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1443:1: (lv_type_36_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1443:1: (lv_type_36_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1444:3: lv_type_36_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal2054);
                    lv_type_36_0=ruleValueType();
                    _fsp--;


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

                    match(input,20,FOLLOW_20_in_ruleSignal2064); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_8_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1470:1: ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1471:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1471:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1472:3: lv_combineOperator_38_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal2085);
                    lv_combineOperator_38_0=ruleCombineOperator();
                    _fsp--;


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
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1495:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1495:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1495:7: ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1495:7: ( (lv_name_39_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1496:1: (lv_name_39_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1496:1: (lv_name_39_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1497:3: lv_name_39_0= RULE_ID
                    {
                    lv_name_39_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2111); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_9_0_0(), "name"); 
                    		

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1519:2: ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1519:4: 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal2127); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1523:1: ( (lv_hostType_41_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1524:1: (lv_hostType_41_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1524:1: (lv_hostType_41_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1525:3: lv_hostType_41_0= RULE_STRING
                    {
                    lv_hostType_41_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2144); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_9_1_1_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_41_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal2159); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_9_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1551:1: ( (lv_hostCombineOperator_43_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1552:1: (lv_hostCombineOperator_43_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1552:1: (lv_hostCombineOperator_43_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1553:3: lv_hostCombineOperator_43_0= RULE_STRING
                    {
                    lv_hostCombineOperator_43_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2176); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_9_1_3_0(), "hostCombineOperator"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostCombineOperator",
                    	        		lv_hostCombineOperator_43_0, 
                    	        		"STRING", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1583:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1584:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1585:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2219);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2229); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1592:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_initialValue_2_0=null;
        Token lv_hostType_5_0=null;
        Enumerator lv_type_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1597:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1598:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1598:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1598:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1598:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1599:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1599:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1600:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2271); 

            			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1622:2: ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1622:4: ':=' ( (lv_initialValue_2_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleVariable2287); 

                            createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1626:1: ( (lv_initialValue_2_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1627:1: (lv_initialValue_2_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1627:1: (lv_initialValue_2_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1628:3: lv_initialValue_2_0= RULE_STRING
                    {
                    lv_initialValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2304); 

                    			createLeafNode(grammarAccess.getVariableAccess().getInitialValueSTRINGTerminalRuleCall_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_2_0, 
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1650:4: ( (lv_type_3_0= ruleValueType ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1651:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1651:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1652:3: lv_type_3_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable2332);
                    lv_type_3_0=ruleValueType();
                    _fsp--;


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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1674:3: ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1674:5: 'host' ( (lv_hostType_5_0= RULE_STRING ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleVariable2344); 

                            createLeafNode(grammarAccess.getVariableAccess().getHostKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1678:1: ( (lv_hostType_5_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1679:1: (lv_hostType_5_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1679:1: (lv_hostType_5_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1680:3: lv_hostType_5_0= RULE_STRING
                    {
                    lv_hostType_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2361); 

                    			createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_3_1_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_5_0, 
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


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1710:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1714:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1715:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1715:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            case 27:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1715:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1715:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1715:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1715:4: 'PURE'
                    {
                    match(input,22,FOLLOW_22_in_ruleValueType2416); 

                            current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1721:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1721:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1721:8: 'BOOL'
                    {
                    match(input,23,FOLLOW_23_in_ruleValueType2431); 

                            current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1727:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1727:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1727:8: 'UNSIGNED'
                    {
                    match(input,24,FOLLOW_24_in_ruleValueType2446); 

                            current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1733:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1733:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1733:8: 'INT'
                    {
                    match(input,25,FOLLOW_25_in_ruleValueType2461); 

                            current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1739:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1739:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1739:8: 'FLOAT'
                    {
                    match(input,26,FOLLOW_26_in_ruleValueType2476); 

                            current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1745:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1745:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1745:8: 'HOST'
                    {
                    match(input,27,FOLLOW_27_in_ruleValueType2491); 

                            current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1755:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1759:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1760:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1760:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 33:
                {
                alt17=6;
                }
                break;
            case 34:
                {
                alt17=7;
                }
                break;
            case 21:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1760:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1760:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1760:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1760:4: 'NONE'
                    {
                    match(input,28,FOLLOW_28_in_ruleCombineOperator2534); 

                            current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1766:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1766:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1766:8: '+'
                    {
                    match(input,29,FOLLOW_29_in_ruleCombineOperator2549); 

                            current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1772:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1772:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1772:8: '*'
                    {
                    match(input,30,FOLLOW_30_in_ruleCombineOperator2564); 

                            current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1778:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1778:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1778:8: 'max'
                    {
                    match(input,31,FOLLOW_31_in_ruleCombineOperator2579); 

                            current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1784:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1784:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1784:8: 'min'
                    {
                    match(input,32,FOLLOW_32_in_ruleCombineOperator2594); 

                            current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1790:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1790:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1790:8: 'or'
                    {
                    match(input,33,FOLLOW_33_in_ruleCombineOperator2609); 

                            current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1796:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1796:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1796:8: 'and'
                    {
                    match(input,34,FOLLOW_34_in_ruleCombineOperator2624); 

                            current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1802:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1802:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1802:8: 'host'
                    {
                    match(input,21,FOLLOW_21_in_ruleCombineOperator2639); 

                            current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend131 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_11_in_ruleStateExtend148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend179 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend218 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_11_in_ruleStateExtend236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend257 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_13_in_ruleStateExtend275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend296 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegionSignalDec387 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRegionSignalDec397 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleRegionSignalDec409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec430 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec462 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13_in_ruleRegionSignalDec482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec503 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec535 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec551 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRegionSignalDec561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec582 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec614 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec634 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRegionSignalDec644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec665 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec697 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals805 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSignals816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals837 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleSignals850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals943 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInputSignals954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals975 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInputSignals988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1081 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleOutputSignals1092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1113 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleOutputSignals1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1219 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInOutputSignals1230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1251 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInOutputSignals1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1381 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSignal1396 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1506 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1539 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSignal1555 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1634 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1651 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1672 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1682 = new BitSet(new long[]{0x00000007F0200000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1729 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSignal1744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1791 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1824 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSignal1840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1887 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1920 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1954 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2017 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal2033 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2054 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2064 = new BitSet(new long[]{0x00000007F0200000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2111 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal2127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2144 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2271 = new BitSet(new long[]{0x000000000FE40002L});
    public static final BitSet FOLLOW_18_in_ruleVariable2287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2304 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2332 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariable2344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValueType2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValueType2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueType2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValueType2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleValueType2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleValueType2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCombineOperator2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCombineOperator2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCombineOperator2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCombineOperator2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCombineOperator2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCombineOperator2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCombineOperator2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCombineOperator2639 = new BitSet(new long[]{0x0000000000000002L});

}