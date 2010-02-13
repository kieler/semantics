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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:82:1: ruleStateExtend returns [EObject current=null] : ( ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) ) | ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) ) | ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) ) | ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) ) | ( (lv_regions_9_0= ruleRegionSignalDec ) ) )+ ;
    public final EObject ruleStateExtend() throws RecognitionException {
        EObject current = null;

        EObject lv_inputSignals_1_0 = null;

        EObject lv_outputSignals_3_0 = null;

        EObject lv_inOutputSignals_6_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_regions_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:87:6: ( ( ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) ) | ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) ) | ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) ) | ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) ) | ( (lv_regions_9_0= ruleRegionSignalDec ) ) )+ )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:1: ( ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) ) | ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) ) | ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) ) | ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) ) | ( (lv_regions_9_0= ruleRegionSignalDec ) ) )+
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:1: ( ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) ) | ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) ) | ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) ) | ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) ) | ( (lv_regions_9_0= ruleRegionSignalDec ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==12) ) {
                        alt1=3;
                    }
                    else if ( (LA1_2==RULE_ID) ) {
                        alt1=1;
                    }


                    }
                    break;
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                case 13:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:2: ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:2: ( 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:88:4: 'input' ( (lv_inputSignals_1_0= ruleInputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend121); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_0_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:92:1: ( (lv_inputSignals_1_0= ruleInputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:1: (lv_inputSignals_1_0= ruleInputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:93:1: (lv_inputSignals_1_0= ruleInputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:94:3: lv_inputSignals_1_0= ruleInputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputSignals_in_ruleStateExtend142);
            	    lv_inputSignals_1_0=ruleInputSignals();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"inputSignals",
            	    	        		lv_inputSignals_1_0, 
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
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:117:6: ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:117:6: ( 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:117:8: 'output' ( (lv_outputSignals_3_0= ruleOutputSignals ) )
            	    {
            	    match(input,12,FOLLOW_12_in_ruleStateExtend160); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:121:1: ( (lv_outputSignals_3_0= ruleOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:122:1: (lv_outputSignals_3_0= ruleOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:122:1: (lv_outputSignals_3_0= ruleOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:123:3: lv_outputSignals_3_0= ruleOutputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutputSignals_in_ruleStateExtend181);
            	    lv_outputSignals_3_0=ruleOutputSignals();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"outputSignals",
            	    	        		lv_outputSignals_3_0, 
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
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:6: ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:6: ( 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:146:8: 'input' 'output' ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleStateExtend199); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getInputKeyword_2_0(), null); 
            	        
            	    match(input,12,FOLLOW_12_in_ruleStateExtend209); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getOutputKeyword_2_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:154:1: ( (lv_inOutputSignals_6_0= ruleInOutputSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:155:1: (lv_inOutputSignals_6_0= ruleInOutputSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:155:1: (lv_inOutputSignals_6_0= ruleInOutputSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:156:3: lv_inOutputSignals_6_0= ruleInOutputSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_2_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInOutputSignals_in_ruleStateExtend230);
            	    lv_inOutputSignals_6_0=ruleInOutputSignals();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"inOutputSignals",
            	    	        		lv_inOutputSignals_6_0, 
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
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:179:6: ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:179:6: ( 'signal' ( (lv_signals_8_0= ruleSignals ) ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:179:8: 'signal' ( (lv_signals_8_0= ruleSignals ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleStateExtend248); 

            	            createLeafNode(grammarAccess.getStateExtendAccess().getSignalKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:183:1: ( (lv_signals_8_0= ruleSignals ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:184:1: (lv_signals_8_0= ruleSignals )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:184:1: (lv_signals_8_0= ruleSignals )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:185:3: lv_signals_8_0= ruleSignals
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignals_in_ruleStateExtend269);
            	    lv_signals_8_0=ruleSignals();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"signals",
            	    	        		lv_signals_8_0, 
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
            	case 5 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:208:6: ( (lv_regions_9_0= ruleRegionSignalDec ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:208:6: ( (lv_regions_9_0= ruleRegionSignalDec ) )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:1: (lv_regions_9_0= ruleRegionSignalDec )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:209:1: (lv_regions_9_0= ruleRegionSignalDec )
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:210:3: lv_regions_9_0= ruleRegionSignalDec
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRegionSignalDec_in_ruleStateExtend297);
            	    lv_regions_9_0=ruleRegionSignalDec();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateExtendRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"regions",
            	    	        		lv_regions_9_0, 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:844:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_initialValue_3_0=null;
        Token lv_name_4_0=null;
        Token lv_initialValue_6_0=null;
        Token lv_name_8_0=null;
        Token lv_initialValue_10_0=null;
        Token lv_name_15_0=null;
        Token lv_initialValue_17_0=null;
        Token lv_hostType_18_0=null;
        Token lv_name_19_0=null;
        Token lv_initialValue_21_0=null;
        Token lv_hostType_23_0=null;
        Token lv_hostCombineOperator_25_0=null;
        Token lv_name_26_0=null;
        Token lv_name_31_0=null;
        Token lv_hostType_33_0=null;
        Token lv_hostCombineOperator_35_0=null;
        Enumerator lv_type_7_0 = null;

        Enumerator lv_type_12_0 = null;

        Enumerator lv_combineOperator_14_0 = null;

        Enumerator lv_type_28_0 = null;

        Enumerator lv_combineOperator_30_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:849:6: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )
            int alt12=8;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==RULE_STRING) ) {
                        alt12=8;
                    }
                    else if ( ((LA12_2>=22 && LA12_2<=27)) ) {
                        alt12=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_STRING) ) {
                        switch ( input.LA(4) ) {
                        case 19:
                            {
                            int LA12_8 = input.LA(5);

                            if ( (LA12_8==RULE_STRING) ) {
                                alt12=6;
                            }
                            else if ( ((LA12_8>=22 && LA12_8<=27)) ) {
                                alt12=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 8, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_STRING:
                            {
                            alt12=5;
                            }
                            break;
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            {
                            alt12=3;
                            }
                            break;
                        case EOF:
                        case 16:
                        case 17:
                            {
                            alt12=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 3, input);

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
                        new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("850:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) ) | ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) ) | ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) ) | ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) ) | ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) ) )", 12, 0, input);

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
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:6: ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:6: ( ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:875:7: ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) )
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:899:2: ( ':=' ( (lv_initialValue_3_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:899:4: ':=' ( (lv_initialValue_3_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1397); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_1_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:903:1: ( (lv_initialValue_3_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:904:1: (lv_initialValue_3_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:904:1: (lv_initialValue_3_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:905:3: lv_initialValue_3_0= RULE_STRING
                    {
                    lv_initialValue_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1414); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_1_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_3_0, 
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
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:6: ( ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:7: ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= RULE_STRING ) ) ) ( (lv_type_7_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:928:7: ( (lv_name_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:929:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:929:1: (lv_name_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:930:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1445); 

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
                    match(input,18,FOLLOW_18_in_ruleSignal1461); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:956:1: ( (lv_initialValue_6_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:957:1: (lv_initialValue_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:957:1: (lv_initialValue_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:958:3: lv_initialValue_6_0= RULE_STRING
                    {
                    lv_initialValue_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1478); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:980:3: ( (lv_type_7_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:1: (lv_type_7_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:981:1: (lv_type_7_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:982:3: lv_type_7_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1505);
                    lv_type_7_0=ruleValueType();
                    _fsp--;


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
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:6: ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:6: ( ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:7: ( (lv_name_8_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) ) ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1005:7: ( (lv_name_8_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1006:1: (lv_name_8_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1006:1: (lv_name_8_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1007:3: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1530); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_8_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1029:2: ( ':=' ( (lv_initialValue_10_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1029:4: ':=' ( (lv_initialValue_10_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1546); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1033:1: ( (lv_initialValue_10_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1034:1: (lv_initialValue_10_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1034:1: (lv_initialValue_10_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1035:3: lv_initialValue_10_0= RULE_STRING
                    {
                    lv_initialValue_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1563); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_3_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1057:3: ( 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1057:5: 'combine' ( (lv_type_12_0= ruleValueType ) ) 'with' ( (lv_combineOperator_14_0= ruleCombineOperator ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1580); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_3_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1061:1: ( (lv_type_12_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:1: (lv_type_12_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1062:1: (lv_type_12_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1063:3: lv_type_12_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1601);
                    lv_type_12_0=ruleValueType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_12_0, 
                    	        		"ValueType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal1611); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_3_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1089:1: ( (lv_combineOperator_14_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1090:1: (lv_combineOperator_14_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1090:1: (lv_combineOperator_14_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1091:3: lv_combineOperator_14_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_2_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1632);
                    lv_combineOperator_14_0=ruleCombineOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"combineOperator",
                    	        		lv_combineOperator_14_0, 
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
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:6: ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:6: ( ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:7: ( (lv_name_15_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) ) ( (lv_hostType_18_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1114:7: ( (lv_name_15_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1115:1: (lv_name_15_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1115:1: (lv_name_15_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1116:3: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1658); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1138:2: ( ':=' ( (lv_initialValue_17_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1138:4: ':=' ( (lv_initialValue_17_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1674); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1142:1: ( (lv_initialValue_17_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1143:1: (lv_initialValue_17_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1143:1: (lv_initialValue_17_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1144:3: lv_initialValue_17_0= RULE_STRING
                    {
                    lv_initialValue_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1691); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_4_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_17_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1166:3: ( (lv_hostType_18_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1167:1: (lv_hostType_18_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1167:1: (lv_hostType_18_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1168:3: lv_hostType_18_0= RULE_STRING
                    {
                    lv_hostType_18_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1714); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_4_2_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_18_0, 
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
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1191:6: ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1191:6: ( ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1191:7: ( (lv_name_19_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) ) ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1191:7: ( (lv_name_19_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1192:1: (lv_name_19_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1192:1: (lv_name_19_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1193:3: lv_name_19_0= RULE_ID
                    {
                    lv_name_19_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1744); 

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

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1215:2: ( ':=' ( (lv_initialValue_21_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1215:4: ':=' ( (lv_initialValue_21_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleSignal1760); 

                            createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_5_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1219:1: ( (lv_initialValue_21_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1220:1: (lv_initialValue_21_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1220:1: (lv_initialValue_21_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1221:3: lv_initialValue_21_0= RULE_STRING
                    {
                    lv_initialValue_21_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1777); 

                    			createLeafNode(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_5_1_1_0(), "initialValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"initialValue",
                    	        		lv_initialValue_21_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1243:3: ( 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1243:5: 'combine' ( (lv_hostType_23_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_25_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1794); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_5_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1247:1: ( (lv_hostType_23_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1248:1: (lv_hostType_23_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1248:1: (lv_hostType_23_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1249:3: lv_hostType_23_0= RULE_STRING
                    {
                    lv_hostType_23_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1811); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_2_1_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_23_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal1826); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_5_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1275:1: ( (lv_hostCombineOperator_25_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1276:1: (lv_hostCombineOperator_25_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1276:1: (lv_hostCombineOperator_25_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1277:3: lv_hostCombineOperator_25_0= RULE_STRING
                    {
                    lv_hostCombineOperator_25_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1843); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_5_2_3_0(), "hostCombineOperator"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostCombineOperator",
                    	        		lv_hostCombineOperator_25_0, 
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
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1300:6: ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1300:6: ( ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1300:7: ( (lv_name_26_0= RULE_ID ) ) ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1300:7: ( (lv_name_26_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1301:1: (lv_name_26_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1301:1: (lv_name_26_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1302:3: lv_name_26_0= RULE_ID
                    {
                    lv_name_26_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1874); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_26_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1324:2: ( 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1324:4: 'combine' ( (lv_type_28_0= ruleValueType ) ) 'with' ( (lv_combineOperator_30_0= ruleCombineOperator ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1890); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_6_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1328:1: ( (lv_type_28_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1329:1: (lv_type_28_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1329:1: (lv_type_28_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1330:3: lv_type_28_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_6_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal1911);
                    lv_type_28_0=ruleValueType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_28_0, 
                    	        		"ValueType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal1921); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_6_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1356:1: ( (lv_combineOperator_30_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1357:1: (lv_combineOperator_30_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1357:1: (lv_combineOperator_30_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1358:3: lv_combineOperator_30_0= ruleCombineOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_6_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1942);
                    lv_combineOperator_30_0=ruleCombineOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"combineOperator",
                    	        		lv_combineOperator_30_0, 
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
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1381:6: ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1381:6: ( ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1381:7: ( (lv_name_31_0= RULE_ID ) ) ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1381:7: ( (lv_name_31_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1382:1: (lv_name_31_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1382:1: (lv_name_31_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1383:3: lv_name_31_0= RULE_ID
                    {
                    lv_name_31_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1968); 

                    			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_31_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1405:2: ( 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1405:4: 'combine' ( (lv_hostType_33_0= RULE_STRING ) ) 'with' ( (lv_hostCombineOperator_35_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleSignal1984); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_7_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1409:1: ( (lv_hostType_33_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1410:1: (lv_hostType_33_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1410:1: (lv_hostType_33_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1411:3: lv_hostType_33_0= RULE_STRING
                    {
                    lv_hostType_33_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2001); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_7_1_1_0(), "hostType"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostType",
                    	        		lv_hostType_33_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleSignal2016); 

                            createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_7_1_2(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1437:1: ( (lv_hostCombineOperator_35_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1438:1: (lv_hostCombineOperator_35_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1438:1: (lv_hostCombineOperator_35_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1439:3: lv_hostCombineOperator_35_0= RULE_STRING
                    {
                    lv_hostCombineOperator_35_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2033); 

                    			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_7_1_3_0(), "hostCombineOperator"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"hostCombineOperator",
                    	        		lv_hostCombineOperator_35_0, 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1469:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1470:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1471:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2076);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2086); 

            }

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1478:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_initialValue_2_0=null;
        Token lv_hostType_5_0=null;
        Enumerator lv_type_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1483:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1484:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1484:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1484:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )? ( (lv_type_3_0= ruleValueType ) )? ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1484:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1485:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1485:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1486:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2128); 

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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1508:2: ( ':=' ( (lv_initialValue_2_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1508:4: ':=' ( (lv_initialValue_2_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleVariable2144); 

                            createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1512:1: ( (lv_initialValue_2_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1513:1: (lv_initialValue_2_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1513:1: (lv_initialValue_2_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1514:3: lv_initialValue_2_0= RULE_STRING
                    {
                    lv_initialValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2161); 

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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1536:4: ( (lv_type_3_0= ruleValueType ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1537:1: (lv_type_3_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1537:1: (lv_type_3_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1538:3: lv_type_3_0= ruleValueType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable2189);
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

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1560:3: ( 'host' ( (lv_hostType_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1560:5: 'host' ( (lv_hostType_5_0= RULE_STRING ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleVariable2201); 

                            createLeafNode(grammarAccess.getVariableAccess().getHostKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1564:1: ( (lv_hostType_5_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1565:1: (lv_hostType_5_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1565:1: (lv_hostType_5_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1566:3: lv_hostType_5_0= RULE_STRING
                    {
                    lv_hostType_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariable2218); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1596:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1600:6: ( ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1601:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1601:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )
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
                    new NoViableAltException("1601:1: ( ( 'PURE' ) | ( 'BOOL' ) | ( 'UNSIGNED' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'HOST' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1601:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1601:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1601:4: 'PURE'
                    {
                    match(input,22,FOLLOW_22_in_ruleValueType2273); 

                            current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1607:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1607:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1607:8: 'BOOL'
                    {
                    match(input,23,FOLLOW_23_in_ruleValueType2288); 

                            current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1613:6: ( 'UNSIGNED' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1613:6: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1613:8: 'UNSIGNED'
                    {
                    match(input,24,FOLLOW_24_in_ruleValueType2303); 

                            current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1619:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1619:6: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1619:8: 'INT'
                    {
                    match(input,25,FOLLOW_25_in_ruleValueType2318); 

                            current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1625:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1625:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1625:8: 'FLOAT'
                    {
                    match(input,26,FOLLOW_26_in_ruleValueType2333); 

                            current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1631:6: ( 'HOST' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1631:6: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1631:8: 'HOST'
                    {
                    match(input,27,FOLLOW_27_in_ruleValueType2348); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1641:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1645:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1646:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1646:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
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
                    new NoViableAltException("1646:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1646:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1646:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1646:4: 'NONE'
                    {
                    match(input,28,FOLLOW_28_in_ruleCombineOperator2391); 

                            current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1652:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1652:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1652:8: '+'
                    {
                    match(input,29,FOLLOW_29_in_ruleCombineOperator2406); 

                            current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1658:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1658:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1658:8: '*'
                    {
                    match(input,30,FOLLOW_30_in_ruleCombineOperator2421); 

                            current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1664:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1664:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1664:8: 'max'
                    {
                    match(input,31,FOLLOW_31_in_ruleCombineOperator2436); 

                            current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1670:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1670:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1670:8: 'min'
                    {
                    match(input,32,FOLLOW_32_in_ruleCombineOperator2451); 

                            current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1676:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1676:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1676:8: 'or'
                    {
                    match(input,33,FOLLOW_33_in_ruleCombineOperator2466); 

                            current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1682:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1682:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1682:8: 'and'
                    {
                    match(input,34,FOLLOW_34_in_ruleCombineOperator2481); 

                            current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1688:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1688:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/parser/antlr/internal/InternalInterfaceDecl.g:1688:8: 'host'
                    {
                    match(input,21,FOLLOW_21_in_ruleCombineOperator2496); 

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
    public static final BitSet FOLLOW_11_in_ruleStateExtend121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputSignals_in_ruleStateExtend142 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_ruleStateExtend181 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_11_in_ruleStateExtend199 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStateExtend209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_ruleStateExtend230 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_13_in_ruleStateExtend248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignals_in_ruleStateExtend269 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_ruleStateExtend297 = new BitSet(new long[]{0x0000000000003812L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1381 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1445 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1478 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1530 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1563 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1580 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1601 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1611 = new BitSet(new long[]{0x00000007F0200000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1658 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSignal1760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1777 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1811 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1874 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1890 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1911 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal1921 = new BitSet(new long[]{0x00000007F0200000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSignal1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2001 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSignal2016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2128 = new BitSet(new long[]{0x000000000FE40002L});
    public static final BitSet FOLLOW_18_in_ruleVariable2144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2161 = new BitSet(new long[]{0x000000000FE00002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2189 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleVariable2201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleValueType2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleValueType2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValueType2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleValueType2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleValueType2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleValueType2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCombineOperator2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCombineOperator2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCombineOperator2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCombineOperator2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCombineOperator2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCombineOperator2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCombineOperator2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCombineOperator2496 = new BitSet(new long[]{0x0000000000000002L});

}