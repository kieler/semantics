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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'signal'", "'renaming'", "':'", "'var'", "','", "';'", "':='", "'combine'", "'with'", "'host'", "'/'", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'+'", "'*'", "'max'", "'min'", "'or'", "'and'"
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
       	
       	@Override
       	protected InterfaceDeclGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleStateExtend
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:78:1: entryRuleStateExtend returns [EObject current=null] : iv_ruleStateExtend= ruleStateExtend EOF ;
    public final EObject entryRuleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExtend = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:79:2: (iv_ruleStateExtend= ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:80:2: iv_ruleStateExtend= ruleStateExtend EOF
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:87:1: ruleStateExtend returns [EObject current=null] : ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) ) )+ ;
    public final EObject ruleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject lv_regions_0_0 = null;

        EObject lv_inOutputSignals_3_0 = null;

        EObject lv_outputSignals_5_0 = null;

        EObject lv_inputSignals_7_0 = null;

        EObject lv_signals_9_0 = null;

        EObject lv_renamings_11_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:92:6: ( ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) ) )+ )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) ) )+
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:1: ( ( (lv_regions_0_0= ruleRegionSignalDec ) ) | ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) ) | ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) ) | ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) ) | ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) ) | ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) ) )+
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
                case 14:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:2: ( (lv_regions_0_0= ruleRegionSignalDec ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:94:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:94:1: (lv_regions_0_0= ruleRegionSignalDec )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:95:3: lv_regions_0_0= ruleRegionSignalDec
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:118:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:118:6: ( 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:118:8: 'input' 'output' ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend148); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_1_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleStateExtend158); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:126:1: ( (lv_inOutputSignals_3_0= ruleInOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:127:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:127:1: (lv_inOutputSignals_3_0= ruleInOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:128:3: lv_inOutputSignals_3_0= ruleInOutputSignals
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:151:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:151:6: ( 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:151:8: 'output' ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    {
            	    match(input,12,FOLLOW_12_in_ruleStateExtend197); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:155:1: ( (lv_outputSignals_5_0= ruleOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:156:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:156:1: (lv_outputSignals_5_0= ruleOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:157:3: lv_outputSignals_5_0= ruleOutputSignals
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:180:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:180:6: ( 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:180:8: 'input' ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend236); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:184:1: ( (lv_inputSignals_7_0= ruleInputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:185:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:185:1: (lv_inputSignals_7_0= ruleInputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:186:3: lv_inputSignals_7_0= ruleInputSignals
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:6: ( 'signal' ( (lv_signals_9_0= ruleSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:8: 'signal' ( (lv_signals_9_0= ruleSignals ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleStateExtend275); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:213:1: ( (lv_signals_9_0= ruleSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:214:1: (lv_signals_9_0= ruleSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:214:1: (lv_signals_9_0= ruleSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:215:3: lv_signals_9_0= ruleSignals
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
            	case 6 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:238:6: ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:238:6: ( 'renaming' ( (lv_renamings_11_0= ruleRenamings ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:238:8: 'renaming' ( (lv_renamings_11_0= ruleRenamings ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleStateExtend314); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getRenamingKeyword_5_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:242:1: ( (lv_renamings_11_0= ruleRenamings ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:243:1: (lv_renamings_11_0= ruleRenamings )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:243:1: (lv_renamings_11_0= ruleRenamings )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:244:3: lv_renamings_11_0= ruleRenamings
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getRenamingsRenamingsParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRenamings_in_ruleStateExtend335);
            	    lv_renamings_11_0=ruleRenamings();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"renamings",
            	    	        		lv_renamings_11_0, 
            	    	        		"Renamings", 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:274:1: entryRuleRegionSignalDec returns [EObject current=null] : iv_ruleRegionSignalDec= ruleRegionSignalDec EOF ;
    public final EObject entryRuleRegionSignalDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegionSignalDec = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:275:2: (iv_ruleRegionSignalDec= ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:276:2: iv_ruleRegionSignalDec= ruleRegionSignalDec EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRegionSignalDecRule(), currentNode); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec373);
            iv_ruleRegionSignalDec=ruleRegionSignalDec();
            _fsp--;

             current =iv_ruleRegionSignalDec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionSignalDec383); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:283:1: ruleRegionSignalDec returns [EObject current=null] : ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) ;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:288:6: ( ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:289:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:289:1: ( ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:289:2: ( ( RULE_ID ) ) ':' ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) ) ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )* ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:289:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:290:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:290:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:291:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRegionSignalDecRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegionSignalDec426); 

            		createLeafNode(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0(), "region"); 
            	

            }


            }

            match(input,15,FOLLOW_15_in_ruleRegionSignalDec436); 

                    createLeafNode(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:307:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("307:1: ( ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* ) | ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:307:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:307:2: ( 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:307:4: 'var' ( (lv_vars_3_0= ruleVariable ) ) ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    {
                    match(input,16,FOLLOW_16_in_ruleRegionSignalDec448); 

                            createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:311:1: ( (lv_vars_3_0= ruleVariable ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:312:1: (lv_vars_3_0= ruleVariable )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:312:1: (lv_vars_3_0= ruleVariable )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:313:3: lv_vars_3_0= ruleVariable
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec469);
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:335:2: ( ',' ( (lv_vars_5_0= ruleVariable ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_ID) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:335:4: ',' ( (lv_vars_5_0= ruleVariable ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec480); 

                    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:339:1: ( (lv_vars_5_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:340:1: (lv_vars_5_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:340:1: (lv_vars_5_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:341:3: lv_vars_5_0= ruleVariable
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec501);
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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:364:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:364:6: ( 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )* )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:364:8: 'signal' ( (lv_signals_7_0= ruleSignal ) ) ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    {
                    match(input,13,FOLLOW_13_in_ruleRegionSignalDec521); 

                            createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:368:1: ( (lv_signals_7_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:369:1: (lv_signals_7_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:369:1: (lv_signals_7_0= ruleSignal )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:370:3: lv_signals_7_0= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec542);
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:392:2: ( ',' ( (lv_signals_9_0= ruleSignal ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1==RULE_ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:392:4: ',' ( (lv_signals_9_0= ruleSignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec553); 

                    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:396:1: ( (lv_signals_9_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:397:1: (lv_signals_9_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:397:1: (lv_signals_9_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:398:3: lv_signals_9_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec574);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:420:6: ( ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* ) | ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==16) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==13) ) {
                        alt7=2;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:420:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:420:7: ( ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:420:9: ',' 'var' ( (lv_vars_12_0= ruleVariable ) ) ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    {
            	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec590); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0(), null); 
            	        
            	    match(input,16,FOLLOW_16_in_ruleRegionSignalDec600); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:428:1: ( (lv_vars_12_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:429:1: (lv_vars_12_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:429:1: (lv_vars_12_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:430:3: lv_vars_12_0= ruleVariable
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec621);
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

            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:452:2: ( ',' ( (lv_vars_14_0= ruleVariable ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( (LA5_2==RULE_ID) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:452:4: ',' ( (lv_vars_14_0= ruleVariable ) )
            	    	    {
            	    	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec632); 

            	    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0(), null); 
            	    	        
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:456:1: ( (lv_vars_14_0= ruleVariable ) )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:457:1: (lv_vars_14_0= ruleVariable )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:457:1: (lv_vars_14_0= ruleVariable )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:458:3: lv_vars_14_0= ruleVariable
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVariable_in_ruleRegionSignalDec653);
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:481:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:481:6: ( ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )* )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:481:8: ',' 'signal' ( (lv_signals_17_0= ruleSignal ) ) ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    {
            	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec673); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0(), null); 
            	        
            	    match(input,13,FOLLOW_13_in_ruleRegionSignalDec683); 

            	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:489:1: ( (lv_signals_17_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:490:1: (lv_signals_17_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:490:1: (lv_signals_17_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:491:3: lv_signals_17_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec704);
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

            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:513:2: ( ',' ( (lv_signals_19_0= ruleSignal ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==17) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( (LA6_2==RULE_ID) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:513:4: ',' ( (lv_signals_19_0= ruleSignal ) )
            	    	    {
            	    	    match(input,17,FOLLOW_17_in_ruleRegionSignalDec715); 

            	    	            createLeafNode(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0(), null); 
            	    	        
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:517:1: ( (lv_signals_19_0= ruleSignal ) )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:518:1: (lv_signals_19_0= ruleSignal )
            	    	    {
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:518:1: (lv_signals_19_0= ruleSignal )
            	    	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:519:3: lv_signals_19_0= ruleSignal
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleSignal_in_ruleRegionSignalDec736);
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

            match(input,18,FOLLOW_18_in_ruleRegionSignalDec751); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:553:1: entryRuleSignals returns [EObject current=null] : iv_ruleSignals= ruleSignals EOF ;
    public final EObject entryRuleSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:554:2: (iv_ruleSignals= ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:555:2: iv_ruleSignals= ruleSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignals_in_entryRuleSignals787);
            iv_ruleSignals=ruleSignals();
            _fsp--;

             current =iv_ruleSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignals797); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:562:1: ruleSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:567:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:568:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:569:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:569:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:570:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleSignals844);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:592:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:592:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleSignals855); 

            	            createLeafNode(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:596:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:597:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:597:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:598:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleSignals876);
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

            match(input,18,FOLLOW_18_in_ruleSignals889); 

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


    // $ANTLR start entryRuleRenamings
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:632:1: entryRuleRenamings returns [EObject current=null] : iv_ruleRenamings= ruleRenamings EOF ;
    public final EObject entryRuleRenamings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenamings = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:633:2: (iv_ruleRenamings= ruleRenamings EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:634:2: iv_ruleRenamings= ruleRenamings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenamings_in_entryRuleRenamings925);
            iv_ruleRenamings=ruleRenamings();
            _fsp--;

             current =iv_ruleRenamings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenamings935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRenamings


    // $ANTLR start ruleRenamings
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:641:1: ruleRenamings returns [EObject current=null] : ( ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* ) ';' ) ;
    public final EObject ruleRenamings() throws RecognitionException {
        EObject current = null;

        EObject lv_renamings_0_0 = null;

        EObject lv_renamings_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:646:6: ( ( ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:1: ( ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:1: ( ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:2: ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:2: ( ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:3: ( (lv_renamings_0_0= ruleRenaming ) ) ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:647:3: ( (lv_renamings_0_0= ruleRenaming ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:648:1: (lv_renamings_0_0= ruleRenaming )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:648:1: (lv_renamings_0_0= ruleRenaming )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:649:3: lv_renamings_0_0= ruleRenaming
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRenaming_in_ruleRenamings982);
            lv_renamings_0_0=ruleRenaming();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRenamingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"renamings",
            	        		lv_renamings_0_0, 
            	        		"Renaming", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:671:2: ( ',' ( (lv_renamings_2_0= ruleRenaming ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:671:4: ',' ( (lv_renamings_2_0= ruleRenaming ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleRenamings993); 

            	            createLeafNode(grammarAccess.getRenamingsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:675:1: ( (lv_renamings_2_0= ruleRenaming ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:676:1: (lv_renamings_2_0= ruleRenaming )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:676:1: (lv_renamings_2_0= ruleRenaming )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:677:3: lv_renamings_2_0= ruleRenaming
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRenaming_in_ruleRenamings1014);
            	    lv_renamings_2_0=ruleRenaming();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRenamingsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"renamings",
            	    	        		lv_renamings_2_0, 
            	    	        		"Renaming", 
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

            match(input,18,FOLLOW_18_in_ruleRenamings1027); 

                    createLeafNode(grammarAccess.getRenamingsAccess().getSemicolonKeyword_1(), null); 
                

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
    // $ANTLR end ruleRenamings


    // $ANTLR start entryRuleInputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:711:1: entryRuleInputSignals returns [EObject current=null] : iv_ruleInputSignals= ruleInputSignals EOF ;
    public final EObject entryRuleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:712:2: (iv_ruleInputSignals= ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:713:2: iv_ruleInputSignals= ruleInputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals1063);
            iv_ruleInputSignals=ruleInputSignals();
            _fsp--;

             current =iv_ruleInputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals1073); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:720:1: ruleInputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:725:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:726:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:727:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:727:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:728:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals1120);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:750:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:750:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleInputSignals1131); 

            	            createLeafNode(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:754:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:755:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:755:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:756:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInputSignals1152);
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
            	    break loop10;
                }
            } while (true);


            }

            match(input,18,FOLLOW_18_in_ruleInputSignals1165); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:790:1: entryRuleOutputSignals returns [EObject current=null] : iv_ruleOutputSignals= ruleOutputSignals EOF ;
    public final EObject entryRuleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:791:2: (iv_ruleOutputSignals= ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:792:2: iv_ruleOutputSignals= ruleOutputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOutputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1201);
            iv_ruleOutputSignals=ruleOutputSignals();
            _fsp--;

             current =iv_ruleOutputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals1211); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:799:1: ruleOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:804:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:805:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:806:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:806:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:807:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1258);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:829:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:829:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleOutputSignals1269); 

            	            createLeafNode(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:833:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:834:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:834:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:835:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleOutputSignals1290);
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
            	    break loop11;
                }
            } while (true);


            }

            match(input,18,FOLLOW_18_in_ruleOutputSignals1303); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:869:1: entryRuleInOutputSignals returns [EObject current=null] : iv_ruleInOutputSignals= ruleInOutputSignals EOF ;
    public final EObject entryRuleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutputSignals = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:870:2: (iv_ruleInOutputSignals= ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:871:2: iv_ruleInOutputSignals= ruleInOutputSignals EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInOutputSignalsRule(), currentNode); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1339);
            iv_ruleInOutputSignals=ruleInOutputSignals();
            _fsp--;

             current =iv_ruleInOutputSignals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals1349); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:878:1: ruleInOutputSignals returns [EObject current=null] : ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) ;
    public final EObject ruleInOutputSignals() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_0_0 = null;

        EObject lv_signals_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:883:6: ( ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:1: ( ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* ) ';'
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:2: ( ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:3: ( (lv_signals_0_0= ruleSignal ) ) ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:884:3: ( (lv_signals_0_0= ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:885:1: (lv_signals_0_0= ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:885:1: (lv_signals_0_0= ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:886:3: lv_signals_0_0= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1396);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:908:2: ( ',' ( (lv_signals_2_0= ruleSignal ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:908:4: ',' ( (lv_signals_2_0= ruleSignal ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleInOutputSignals1407); 

            	            createLeafNode(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:912:1: ( (lv_signals_2_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:913:1: (lv_signals_2_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:913:1: (lv_signals_2_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:914:3: lv_signals_2_0= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleInOutputSignals1428);
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
            	    break loop12;
                }
            } while (true);


            }

            match(input,18,FOLLOW_18_in_ruleInOutputSignals1441); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:948:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:949:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:950:2: iv_ruleSignal= ruleSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1477);
            iv_ruleSignal=ruleSignal();
            _fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1487); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:957:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) ) ;
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
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:962:6: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )
            int alt13=10;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING) ) {
                        alt13=10;
                    }
                    else if ( ((LA13_2>=24 && LA13_2<=29)) ) {
                        alt13=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_STRING) ) {
                        switch ( input.LA(4) ) {
                        case 20:
                            {
                            int LA13_11 = input.LA(5);

                            if ( (LA13_11==RULE_STRING) ) {
                                alt13=8;
                            }
                            else if ( ((LA13_11>=24 && LA13_11<=29)) ) {
                                alt13=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 11, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 15:
                            {
                            int LA13_12 = input.LA(5);

                            if ( (LA13_12==RULE_STRING) ) {
                                alt13=7;
                            }
                            else if ( ((LA13_12>=24 && LA13_12<=29)) ) {
                                alt13=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 12, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case 17:
                        case 18:
                            {
                            alt13=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 8, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA13_4 = input.LA(3);

                    if ( (LA13_4==RULE_STRING) ) {
                        alt13=6;
                    }
                    else if ( ((LA13_4>=24 && LA13_4<=29)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 17:
                case 18:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("963:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ) | ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) ) | ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) ) | ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) ) | ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:963:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:963:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:964:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:964:1: (lv_name_0_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:965:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1529); 

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:988:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:988:6: ( ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:988:7: ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:988:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:989:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:989:1: (lv_name_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:990:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1558); 

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

                    match(input,15,FOLLOW_15_in_ruleSignal1573); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1016:1: ( (lv_type_3_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1017:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1017:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1018:3: lv_type_3_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1594);
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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1041:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1041:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1041:7: ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1041:7: ( (lv_name_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1042:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1042:1: (lv_name_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1043:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1619); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1065:2: ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1065:4: ':=' ( (lv_initialValue_6_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1635); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1069:1: ( (lv_initialValue_6_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1070:1: (lv_initialValue_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1070:1: (lv_initialValue_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1071:3: lv_initialValue_6_0= RULE_STRING
                    {
                    lv_initialValue_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1652); 

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1094:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1094:6: ( ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1094:7: ( (lv_name_7_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) ) ':' ( (lv_type_11_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1094:7: ( (lv_name_7_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1095:1: (lv_name_7_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1095:1: (lv_name_7_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1096:3: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1683); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1118:2: ( ':=' ( (lv_initialValue_9_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1118:4: ':=' ( (lv_initialValue_9_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1699); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1122:1: ( (lv_initialValue_9_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1123:1: (lv_initialValue_9_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1123:1: (lv_initialValue_9_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1124:3: lv_initialValue_9_0= RULE_STRING
                    {
                    lv_initialValue_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1716); 

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

                    match(input,15,FOLLOW_15_in_ruleSignal1732); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_3_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1150:1: ( (lv_type_11_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1151:1: (lv_type_11_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1151:1: (lv_type_11_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1152:3: lv_type_11_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1753);
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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1175:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1175:6: ( ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1175:7: ( (lv_name_12_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1175:7: ( (lv_name_12_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1176:1: (lv_name_12_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1176:1: (lv_name_12_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1177:3: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1778); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1199:2: ( ':=' ( (lv_initialValue_14_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1199:4: ':=' ( (lv_initialValue_14_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1794); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1203:1: ( (lv_initialValue_14_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1204:1: (lv_initialValue_14_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1204:1: (lv_initialValue_14_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1205:3: lv_initialValue_14_0= RULE_STRING
                    {
                    lv_initialValue_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1811); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1227:3: ( 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1227:5: 'combine' ( (lv_type_16_0= ruleValueType ) ) 'with' ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleSignal1828); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1231:1: ( (lv_type_16_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1232:1: (lv_type_16_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1232:1: (lv_type_16_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1233:3: lv_type_16_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1849);
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

                    match(input,21,FOLLOW_21_in_ruleSignal1859); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_4_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1259:1: ( (lv_combineOperator_18_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1260:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1260:1: (lv_combineOperator_18_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1261:3: lv_combineOperator_18_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1880);
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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1284:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1284:6: ( ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1284:7: ( (lv_name_19_0= RULE_ID ) ) ':' ( (lv_hostType_21_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1284:7: ( (lv_name_19_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1285:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1285:1: (lv_name_19_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1286:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1906); 

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

                    match(input,15,FOLLOW_15_in_ruleSignal1921); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_1(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1312:1: ( (lv_hostType_21_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1313:1: (lv_hostType_21_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1313:1: (lv_hostType_21_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1314:3: lv_hostType_21_0= RULE_STRING
                    {
                    lv_hostType_21_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1938); 

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1337:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1337:6: ( ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1337:7: ( (lv_name_22_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) ) ':' ( (lv_hostType_26_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1337:7: ( (lv_name_22_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1338:1: (lv_name_22_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1338:1: (lv_name_22_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1339:3: lv_name_22_0= RULE_ID
                    {
                    lv_name_22_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1968); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1361:2: ( ':=' ( (lv_initialValue_24_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1361:4: ':=' ( (lv_initialValue_24_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1984); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1365:1: ( (lv_initialValue_24_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1366:1: (lv_initialValue_24_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1366:1: (lv_initialValue_24_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1367:3: lv_initialValue_24_0= RULE_STRING
                    {
                    lv_initialValue_24_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2001); 

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

                    match(input,15,FOLLOW_15_in_ruleSignal2017); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_6_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1393:1: ( (lv_hostType_26_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1394:1: (lv_hostType_26_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1394:1: (lv_hostType_26_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1395:3: lv_hostType_26_0= RULE_STRING
                    {
                    lv_hostType_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2034); 

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1418:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1418:6: ( ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1418:7: ( (lv_name_27_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1418:7: ( (lv_name_27_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1419:1: (lv_name_27_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1419:1: (lv_name_27_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1420:3: lv_name_27_0= RULE_ID
                    {
                    lv_name_27_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2064); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1442:2: ( ':=' ( (lv_initialValue_29_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1442:4: ':=' ( (lv_initialValue_29_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal2080); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1446:1: ( (lv_initialValue_29_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1447:1: (lv_initialValue_29_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1447:1: (lv_initialValue_29_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1448:3: lv_initialValue_29_0= RULE_STRING
                    {
                    lv_initialValue_29_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2097); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1470:3: ( 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1470:5: 'combine' ( (lv_hostType_31_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_33_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleSignal2114); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1474:1: ( (lv_hostType_31_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1475:1: (lv_hostType_31_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1475:1: (lv_hostType_31_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1476:3: lv_hostType_31_0= RULE_STRING
                    {
                    lv_hostType_31_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2131); 

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

                    match(input,21,FOLLOW_21_in_ruleSignal2146); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_7_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1502:1: ( (lv_hostCombineOperator_33_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1503:1: (lv_hostCombineOperator_33_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1503:1: (lv_hostCombineOperator_33_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1504:3: lv_hostCombineOperator_33_0= RULE_STRING
                    {
                    lv_hostCombineOperator_33_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2163); 

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1527:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1527:6: ( ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1527:7: ( (lv_name_34_0= RULE_ID ) ) ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1527:7: ( (lv_name_34_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1528:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1528:1: (lv_name_34_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1529:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2194); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1551:2: ( 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1551:4: 'combine' ( (lv_type_36_0= ruleValueType ) ) 'with' ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleSignal2210); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1555:1: ( (lv_type_36_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1556:1: (lv_type_36_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1556:1: (lv_type_36_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1557:3: lv_type_36_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal2231);
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

                    match(input,21,FOLLOW_21_in_ruleSignal2241); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_8_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1583:1: ( (lv_combineOperator_38_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1584:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1584:1: (lv_combineOperator_38_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1585:3: lv_combineOperator_38_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal2262);
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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1608:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1608:6: ( ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1608:7: ( (lv_name_39_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1608:7: ( (lv_name_39_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1609:1: (lv_name_39_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1609:1: (lv_name_39_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1610:3: lv_name_39_0= RULE_ID
                    {
                    lv_name_39_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2288); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1632:2: ( 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1632:4: 'combine' ( (lv_hostType_41_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_43_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleSignal2304); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1636:1: ( (lv_hostType_41_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1637:1: (lv_hostType_41_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1637:1: (lv_hostType_41_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1638:3: lv_hostType_41_0= RULE_STRING
                    {
                    lv_hostType_41_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2321); 

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

                    match(input,21,FOLLOW_21_in_ruleSignal2336); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_9_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1664:1: ( (lv_hostCombineOperator_43_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1665:1: (lv_hostCombineOperator_43_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1665:1: (lv_hostCombineOperator_43_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1666:3: lv_hostCombineOperator_43_0= RULE_STRING
                    {
                    lv_hostCombineOperator_43_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2353); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1696:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1697:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1698:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2396);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2406); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1705:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_initialValue_2_0=null;
        Token lv_hostType_5_0=null;
        Enumerator lv_type_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1710:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1711:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1711:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1711:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1711:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1712:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1712:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1713:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2448); 

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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1735:2: ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1735:4: ':=' ( (lv_initialValue_2_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleVariable2464); 

                            createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1739:1: ( (lv_initialValue_2_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1740:1: (lv_initialValue_2_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1740:1: (lv_initialValue_2_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1741:3: lv_initialValue_2_0= RULE_STRING
                    {
                    lv_initialValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2481); 

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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1763:4: ( (lv_type_3_0= ruleValueType ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=24 && LA15_0<=29)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1764:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1764:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1765:3: lv_type_3_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable2509);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1787:3: ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1787:5: 'host' ( (lv_hostType_5_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleVariable2521); 

                            createLeafNode(grammarAccess.getVariableAccess().getHostKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1791:1: ( (lv_hostType_5_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1792:1: (lv_hostType_5_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1792:1: (lv_hostType_5_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1793:3: lv_hostType_5_0= RULE_STRING
                    {
                    lv_hostType_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2538); 

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


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1823:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1824:2: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1825:2: iv_ruleRenaming= ruleRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming2581);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;

             current =iv_ruleRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming2591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRenaming


    // $ANTLR start ruleRenaming
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1832:1: ruleRenaming returns [EObject current=null] : ( ( (lv_oldID_0_0= RULE_ID ) ) '/' ( (lv_newID_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_oldID_0_0=null;
        Token lv_newID_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1837:6: ( ( ( (lv_oldID_0_0= RULE_ID ) ) '/' ( (lv_newID_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1838:1: ( ( (lv_oldID_0_0= RULE_ID ) ) '/' ( (lv_newID_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1838:1: ( ( (lv_oldID_0_0= RULE_ID ) ) '/' ( (lv_newID_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1838:2: ( (lv_oldID_0_0= RULE_ID ) ) '/' ( (lv_newID_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1838:2: ( (lv_oldID_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1839:1: (lv_oldID_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1839:1: (lv_oldID_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1840:3: lv_oldID_0_0= RULE_ID
            {
            lv_oldID_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRenaming2633); 

            			createLeafNode(grammarAccess.getRenamingAccess().getOldIDIDTerminalRuleCall_0_0(), "oldID"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"oldID",
            	        		lv_oldID_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleRenaming2648); 

                    createLeafNode(grammarAccess.getRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1866:1: ( (lv_newID_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1867:1: (lv_newID_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1867:1: (lv_newID_2_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1868:3: lv_newID_2_0= RULE_ID
            {
            lv_newID_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRenaming2665); 

            			createLeafNode(grammarAccess.getRenamingAccess().getNewIDIDTerminalRuleCall_2_0(), "newID"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"newID",
            	        		lv_newID_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


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
    // $ANTLR end ruleRenaming


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1898:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1902:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1903:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1903:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1903:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1903:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1903:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1903:4: 'PURE'
                    {
                    match(input,24,FOLLOW_24_in_ruleValueType2718); 

                            current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1909:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1909:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1909:8: 'BOOL'
                    {
                    match(input,25,FOLLOW_25_in_ruleValueType2733); 

                            current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1915:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1915:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1915:8: 'UNSIGNED'
                    {
                    match(input,26,FOLLOW_26_in_ruleValueType2748); 

                            current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1921:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1921:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1921:8: 'INT'
                    {
                    match(input,27,FOLLOW_27_in_ruleValueType2763); 

                            current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1927:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1927:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1927:8: 'FLOAT'
                    {
                    match(input,28,FOLLOW_28_in_ruleValueType2778); 

                            current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1933:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1933:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1933:8: 'HOST'
                    {
                    match(input,29,FOLLOW_29_in_ruleValueType2793); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1943:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1947:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1948:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1948:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt18=1;
                }
                break;
            case 31:
                {
                alt18=2;
                }
                break;
            case 32:
                {
                alt18=3;
                }
                break;
            case 33:
                {
                alt18=4;
                }
                break;
            case 34:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 36:
                {
                alt18=7;
                }
                break;
            case 22:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1948:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1948:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1948:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1948:4: 'NONE'
                    {
                    match(input,30,FOLLOW_30_in_ruleCombineOperator2836); 

                            current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1954:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1954:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1954:8: '+'
                    {
                    match(input,31,FOLLOW_31_in_ruleCombineOperator2851); 

                            current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1960:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1960:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1960:8: '*'
                    {
                    match(input,32,FOLLOW_32_in_ruleCombineOperator2866); 

                            current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1966:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1966:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1966:8: 'max'
                    {
                    match(input,33,FOLLOW_33_in_ruleCombineOperator2881); 

                            current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1972:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1972:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1972:8: 'min'
                    {
                    match(input,34,FOLLOW_34_in_ruleCombineOperator2896); 

                            current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1978:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1978:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1978:8: 'or'
                    {
                    match(input,35,FOLLOW_35_in_ruleCombineOperator2911); 

                            current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1984:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1984:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1984:8: 'and'
                    {
                    match(input,36,FOLLOW_36_in_ruleCombineOperator2926); 

                            current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1990:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1990:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1990:8: 'host'
                    {
                    match(input,22,FOLLOW_22_in_ruleCombineOperator2941); 

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
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend131 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_11_in_ruleStateExtend148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend179 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend218 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_11_in_ruleStateExtend236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend257 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_13_in_ruleStateExtend275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend296 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_14_in_ruleStateExtend314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenamings_in_ruleStateExtend335 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegionSignalDec426 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRegionSignalDec436 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec469 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec501 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_13_in_ruleRegionSignalDec521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec542 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec574 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec590 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRegionSignalDec600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec621 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegionSignalDec653 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRegionSignalDec683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec704 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRegionSignalDec715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegionSignalDec736 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleRegionSignalDec751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals844 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSignals855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignals876 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleSignals889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenamings_in_entryRuleRenamings925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenamings935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamings982 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleRenamings993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamings1014 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleRenamings1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals1063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1120 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInputSignals1131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInputSignals1152 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleInputSignals1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1258 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleOutputSignals1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleOutputSignals1290 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleOutputSignals1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1396 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInOutputSignals1407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleInOutputSignals1428 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleInOutputSignals1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1558 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignal1573 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1683 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1716 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignal1732 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1778 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1811 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1828 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1849 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal1859 = new BitSet(new long[]{0x0000001FC0400000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1906 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignal1921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2001 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSignal2017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2064 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal2080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2097 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2131 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2194 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2210 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2231 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2241 = new BitSet(new long[]{0x0000001FC0400000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2288 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2321 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal2336 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2448 = new BitSet(new long[]{0x000000003F480002L});
    public static final BitSet FOLLOW_19_in_ruleVariable2464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2481 = new BitSet(new long[]{0x000000003F400002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2509 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleVariable2521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming2581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRenaming2633 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRenaming2648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRenaming2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueType2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValueType2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleValueType2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleValueType2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleValueType2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleValueType2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCombineOperator2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCombineOperator2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCombineOperator2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCombineOperator2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCombineOperator2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCombineOperator2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCombineOperator2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCombineOperator2941 = new BitSet(new long[]{0x0000000000000002L});

}