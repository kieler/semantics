package de.cau.cs.kieler.s.parser.antlr.internal; 

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
import de.cau.cs.kieler.s.services.SGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Synchronous Program'", "'('", "')'", "'Inputs'", "','", "';'", "'Outputs'", "'Signals'", "':'", "'SIGNALS'", "'combine'", "'CUSTOM'", "'PAUSE'", "'TERM'", "'JOIN'", "'ABORT'", "'PRESENT'", "'{'", "'}'", "'GOTO'", "'FORK'", "'FORKE'", "'EMIT'", "'AWAIT'", "'PRIO'", "'PURE'", "'INT'", "'BOOL'", "'FLOAT'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalSParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g"; }



     	private SGrammarAccess grammarAccess;
     	
        public InternalSParser(TokenStream input, IAstFactory factory, SGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/s/parser/antlr/internal/InternalS.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProgram
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:78:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:79:2: (iv_ruleProgram= ruleProgram EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:80:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:87:1: ruleProgram returns [EObject current=null] : ( 'Synchronous Program' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_priority_3_0= ruleIntValue ) ) ')' ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )? ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )? ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )? ( (lv_states_20_0= ruleState ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_priority_3_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_signals_11_0 = null;

        EObject lv_signals_13_0 = null;

        EObject lv_signals_16_0 = null;

        EObject lv_signals_18_0 = null;

        EObject lv_states_20_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:92:6: ( ( 'Synchronous Program' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_priority_3_0= ruleIntValue ) ) ')' ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )? ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )? ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )? ( (lv_states_20_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:93:1: ( 'Synchronous Program' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_priority_3_0= ruleIntValue ) ) ')' ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )? ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )? ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )? ( (lv_states_20_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:93:1: ( 'Synchronous Program' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_priority_3_0= ruleIntValue ) ) ')' ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )? ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )? ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )? ( (lv_states_20_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:93:3: 'Synchronous Program' ( (lv_name_1_0= RULE_ID ) ) '(' ( (lv_priority_3_0= ruleIntValue ) ) ')' ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )? ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )? ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )? ( (lv_states_20_0= ruleState ) )+
            {
            match(input,13,FOLLOW_13_in_ruleProgram120); 

                    createLeafNode(grammarAccess.getProgramAccess().getSynchronousProgramKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:98:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram137); 

            			createLeafNode(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
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

            match(input,14,FOLLOW_14_in_ruleProgram152); 

                    createLeafNode(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:125:1: ( (lv_priority_3_0= ruleIntValue ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:126:1: (lv_priority_3_0= ruleIntValue )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:126:1: (lv_priority_3_0= ruleIntValue )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:127:3: lv_priority_3_0= ruleIntValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getPriorityIntValueParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntValue_in_ruleProgram173);
            lv_priority_3_0=ruleIntValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"priority",
            	        		lv_priority_3_0, 
            	        		"IntValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleProgram183); 

                    createLeafNode(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:153:1: ( 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:153:3: 'Inputs' ( (lv_signals_6_0= ruleSignal ) ) ( ',' ( (lv_signals_8_0= ruleSignal ) ) )* ';'
                    {
                    match(input,16,FOLLOW_16_in_ruleProgram194); 

                            createLeafNode(grammarAccess.getProgramAccess().getInputsKeyword_5_0(), null); 
                        
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:157:1: ( (lv_signals_6_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:158:1: (lv_signals_6_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:158:1: (lv_signals_6_0= ruleSignal )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:159:3: lv_signals_6_0= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleProgram215);
                    lv_signals_6_0=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"signals",
                    	        		lv_signals_6_0, 
                    	        		"Signal", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:181:2: ( ',' ( (lv_signals_8_0= ruleSignal ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:181:4: ',' ( (lv_signals_8_0= ruleSignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleProgram226); 

                    	            createLeafNode(grammarAccess.getProgramAccess().getCommaKeyword_5_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:185:1: ( (lv_signals_8_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:186:1: (lv_signals_8_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:186:1: (lv_signals_8_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:187:3: lv_signals_8_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleProgram247);
                    	    lv_signals_8_0=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
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
                    	    break loop1;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProgram259); 

                            createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:213:3: ( 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:213:5: 'Outputs' ( (lv_signals_11_0= ruleSignal ) ) ( ',' ( (lv_signals_13_0= ruleSignal ) ) )* ';'
                    {
                    match(input,19,FOLLOW_19_in_ruleProgram272); 

                            createLeafNode(grammarAccess.getProgramAccess().getOutputsKeyword_6_0(), null); 
                        
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:217:1: ( (lv_signals_11_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:218:1: (lv_signals_11_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:218:1: (lv_signals_11_0= ruleSignal )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:219:3: lv_signals_11_0= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleProgram293);
                    lv_signals_11_0=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"signals",
                    	        		lv_signals_11_0, 
                    	        		"Signal", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:241:2: ( ',' ( (lv_signals_13_0= ruleSignal ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:241:4: ',' ( (lv_signals_13_0= ruleSignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleProgram304); 

                    	            createLeafNode(grammarAccess.getProgramAccess().getCommaKeyword_6_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:245:1: ( (lv_signals_13_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:246:1: (lv_signals_13_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:246:1: (lv_signals_13_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:247:3: lv_signals_13_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleProgram325);
                    	    lv_signals_13_0=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"signals",
                    	    	        		lv_signals_13_0, 
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

                    match(input,18,FOLLOW_18_in_ruleProgram337); 

                            createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:273:3: ( 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:273:5: 'Signals' ( (lv_signals_16_0= ruleSignal ) ) ( ',' ( (lv_signals_18_0= ruleSignal ) ) )* ';'
                    {
                    match(input,20,FOLLOW_20_in_ruleProgram350); 

                            createLeafNode(grammarAccess.getProgramAccess().getSignalsKeyword_7_0(), null); 
                        
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:277:1: ( (lv_signals_16_0= ruleSignal ) )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:278:1: (lv_signals_16_0= ruleSignal )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:278:1: (lv_signals_16_0= ruleSignal )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:279:3: lv_signals_16_0= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleProgram371);
                    lv_signals_16_0=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"signals",
                    	        		lv_signals_16_0, 
                    	        		"Signal", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:301:2: ( ',' ( (lv_signals_18_0= ruleSignal ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:301:4: ',' ( (lv_signals_18_0= ruleSignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleProgram382); 

                    	            createLeafNode(grammarAccess.getProgramAccess().getCommaKeyword_7_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:305:1: ( (lv_signals_18_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:306:1: (lv_signals_18_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:306:1: (lv_signals_18_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:307:3: lv_signals_18_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleProgram403);
                    	    lv_signals_18_0=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"signals",
                    	    	        		lv_signals_18_0, 
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
                    	    break loop5;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleProgram415); 

                            createLeafNode(grammarAccess.getProgramAccess().getSemicolonKeyword_7_3(), null); 
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:333:3: ( (lv_states_20_0= ruleState ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:334:1: (lv_states_20_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:334:1: (lv_states_20_0= ruleState )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:335:3: lv_states_20_0= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleProgram438);
            	    lv_states_20_0=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"states",
            	    	        		lv_states_20_0, 
            	    	        		"State", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleAnnotation
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:365:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:366:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:367:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation475);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation485); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:374:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:379:6: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:380:1: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:380:1: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:380:2: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:380:2: ( (lv_key_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:381:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:381:1: (lv_key_0_0= RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:382:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation527); 

            			createLeafNode(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0(), "key"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"key",
            	        		lv_key_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:404:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:405:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:405:1: (lv_value_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:406:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation549); 

            			createLeafNode(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_1_0, 
            	        		"STRING", 
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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:438:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:439:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:440:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState592);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState602); 

            }

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
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:447:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_annotations_2_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )* ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )? ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_instructions_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:452:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_annotations_2_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )* ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )? ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:453:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_annotations_2_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )* ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )? ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:453:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_annotations_2_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )* ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )? ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:453:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_annotations_2_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )* ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )? ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )*
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:453:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:454:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:454:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:455:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState644); 

            			createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
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

            match(input,21,FOLLOW_21_in_ruleState659); 

                    createLeafNode(grammarAccess.getStateAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:481:1: ( (lv_annotations_2_0= ruleAnnotation ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_STRING) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:482:1: (lv_annotations_2_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:482:1: (lv_annotations_2_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:483:3: lv_annotations_2_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleState680);
                    lv_annotations_2_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_2_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:505:3: ( ',' ( (lv_annotations_4_0= ruleAnnotation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==RULE_STRING) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:505:5: ',' ( (lv_annotations_4_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleState692); 

            	            createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:509:1: ( (lv_annotations_4_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:510:1: (lv_annotations_4_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:510:1: (lv_annotations_4_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:511:3: lv_annotations_4_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleState713);
            	    lv_annotations_4_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_4_0, 
            	    	        		"Annotation", 
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

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:533:4: ( 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:533:6: 'SIGNALS' ( (lv_signals_6_0= ruleSignal ) )* ';'
                    {
                    match(input,22,FOLLOW_22_in_ruleState726); 

                            createLeafNode(grammarAccess.getStateAccess().getSIGNALSKeyword_4_0(), null); 
                        
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:537:1: ( (lv_signals_6_0= ruleSignal ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:538:1: (lv_signals_6_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:538:1: (lv_signals_6_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:539:3: lv_signals_6_0= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState747);
                    	    lv_signals_6_0=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"signals",
                    	    	        		lv_signals_6_0, 
                    	    	        		"Signal", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleState758); 

                            createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_4_2(), null); 
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:565:3: ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_STRING) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==17||(LA12_0>=25 && LA12_0<=29)||(LA12_0>=32 && LA12_0<=37)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:565:4: ( (lv_instructions_8_0= ruleInstruction ) ) ';'
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:565:4: ( (lv_instructions_8_0= ruleInstruction ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:566:1: (lv_instructions_8_0= ruleInstruction )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:566:1: (lv_instructions_8_0= ruleInstruction )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:567:3: lv_instructions_8_0= ruleInstruction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_5_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleState782);
            	    lv_instructions_8_0=ruleInstruction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"instructions",
            	    	        		lv_instructions_8_0, 
            	    	        		"Instruction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,18,FOLLOW_18_in_ruleState792); 

            	            createLeafNode(grammarAccess.getStateAccess().getSemicolonKeyword_5_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleStateReference
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:601:1: entryRuleStateReference returns [EObject current=null] : iv_ruleStateReference= ruleStateReference EOF ;
    public final EObject entryRuleStateReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateReference = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:602:2: (iv_ruleStateReference= ruleStateReference EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:603:2: iv_ruleStateReference= ruleStateReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleStateReference_in_entryRuleStateReference830);
            iv_ruleStateReference=ruleStateReference();
            _fsp--;

             current =iv_ruleStateReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReference840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateReference


    // $ANTLR start ruleStateReference
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:610:1: ruleStateReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleStateReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:615:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:616:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:616:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:617:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:617:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:618:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getStateReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateReference882); 

            		createLeafNode(grammarAccess.getStateReferenceAccess().getStateStateCrossReference_0(), "state"); 
            	

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
    // $ANTLR end ruleStateReference


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:638:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:639:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:640:2: iv_ruleSignal= ruleSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal917);
            iv_ruleSignal=ruleSignal();
            _fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal927); 

            }

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
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:647:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleSignalType ) ) ( 'combine' ( ( RULE_ID ) ) )? ( (lv_annotations_5_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )* ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_annotations_5_0 = null;

        EObject lv_annotations_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:652:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleSignalType ) ) ( 'combine' ( ( RULE_ID ) ) )? ( (lv_annotations_5_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )* ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleSignalType ) ) ( 'combine' ( ( RULE_ID ) ) )? ( (lv_annotations_5_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )* )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:653:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleSignalType ) ) ( 'combine' ( ( RULE_ID ) ) )? ( (lv_annotations_5_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )* )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:653:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleSignalType ) ) ( 'combine' ( ( RULE_ID ) ) )? ( (lv_annotations_5_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )*
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:653:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:654:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:654:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:655:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal969); 

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

            match(input,21,FOLLOW_21_in_ruleSignal984); 

                    createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:681:1: ( (lv_type_2_0= ruleSignalType ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:682:1: (lv_type_2_0= ruleSignalType )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:682:1: (lv_type_2_0= ruleSignalType )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:683:3: lv_type_2_0= ruleSignalType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalType_in_ruleSignal1005);
            lv_type_2_0=ruleSignalType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"SignalType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:705:2: ( 'combine' ( ( RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:705:4: 'combine' ( ( RULE_ID ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleSignal1016); 

                            createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:709:1: ( ( RULE_ID ) )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:710:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:710:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:711:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal1034); 

                    		createLeafNode(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionCrossReference_3_1_0(), "combineFunction"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:723:4: ( (lv_annotations_5_0= ruleAnnotation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_STRING) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:724:1: (lv_annotations_5_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:724:1: (lv_annotations_5_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:725:3: lv_annotations_5_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleSignal1057);
                    lv_annotations_5_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_5_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:747:3: ( ',' ( (lv_annotations_7_0= ruleAnnotation ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==RULE_STRING) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:747:5: ',' ( (lv_annotations_7_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleSignal1069); 

            	            createLeafNode(grammarAccess.getSignalAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:751:1: ( (lv_annotations_7_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:752:1: (lv_annotations_7_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:752:1: (lv_annotations_7_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:753:3: lv_annotations_7_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSignal1090);
            	    lv_annotations_7_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_7_0, 
            	    	        		"Annotation", 
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
            	    break loop15;
                }
            } while (true);


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


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:783:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:784:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:785:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference1128);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;

             current =iv_ruleSignalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference1138); 

            }

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
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:792:1: ruleSignalReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:797:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:798:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:798:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:799:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:799:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:800:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference1180); 

            		createLeafNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0(), "signal"); 
            	

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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleSignalType
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:822:1: entryRuleSignalType returns [EObject current=null] : iv_ruleSignalType= ruleSignalType EOF ;
    public final EObject entryRuleSignalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalType = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:823:2: (iv_ruleSignalType= ruleSignalType EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:824:2: iv_ruleSignalType= ruleSignalType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalType_in_entryRuleSignalType1217);
            iv_ruleSignalType=ruleSignalType();
            _fsp--;

             current =iv_ruleSignalType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalType1227); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignalType


    // $ANTLR start ruleSignalType
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:831:1: ruleSignalType returns [EObject current=null] : (this_PrimitiveSignal_0= rulePrimitiveSignal | this_CustomSignal_1= ruleCustomSignal ) ;
    public final EObject ruleSignalType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveSignal_0 = null;

        EObject this_CustomSignal_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:836:6: ( (this_PrimitiveSignal_0= rulePrimitiveSignal | this_CustomSignal_1= ruleCustomSignal ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:837:1: (this_PrimitiveSignal_0= rulePrimitiveSignal | this_CustomSignal_1= ruleCustomSignal )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:837:1: (this_PrimitiveSignal_0= rulePrimitiveSignal | this_CustomSignal_1= ruleCustomSignal )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=38 && LA16_0<=41)) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("837:1: (this_PrimitiveSignal_0= rulePrimitiveSignal | this_CustomSignal_1= ruleCustomSignal )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:838:5: this_PrimitiveSignal_0= rulePrimitiveSignal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSignalTypeAccess().getPrimitiveSignalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveSignal_in_ruleSignalType1274);
                    this_PrimitiveSignal_0=rulePrimitiveSignal();
                    _fsp--;

                     
                            current = this_PrimitiveSignal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:848:5: this_CustomSignal_1= ruleCustomSignal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSignalTypeAccess().getCustomSignalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCustomSignal_in_ruleSignalType1301);
                    this_CustomSignal_1=ruleCustomSignal();
                    _fsp--;

                     
                            current = this_CustomSignal_1; 
                            currentNode = currentNode.getParent();
                        

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
    // $ANTLR end ruleSignalType


    // $ANTLR start entryRuleCustomSignal
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:864:1: entryRuleCustomSignal returns [EObject current=null] : iv_ruleCustomSignal= ruleCustomSignal EOF ;
    public final EObject entryRuleCustomSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomSignal = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:865:2: (iv_ruleCustomSignal= ruleCustomSignal EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:866:2: iv_ruleCustomSignal= ruleCustomSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCustomSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleCustomSignal_in_entryRuleCustomSignal1336);
            iv_ruleCustomSignal=ruleCustomSignal();
            _fsp--;

             current =iv_ruleCustomSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomSignal1346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCustomSignal


    // $ANTLR start ruleCustomSignal
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:873:1: ruleCustomSignal returns [EObject current=null] : ( 'CUSTOM' ( (lv_type_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomSignal() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:878:6: ( ( 'CUSTOM' ( (lv_type_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:879:1: ( 'CUSTOM' ( (lv_type_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:879:1: ( 'CUSTOM' ( (lv_type_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:879:3: 'CUSTOM' ( (lv_type_1_0= RULE_STRING ) )
            {
            match(input,24,FOLLOW_24_in_ruleCustomSignal1381); 

                    createLeafNode(grammarAccess.getCustomSignalAccess().getCUSTOMKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:883:1: ( (lv_type_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:884:1: (lv_type_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:884:1: (lv_type_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:885:3: lv_type_1_0= RULE_STRING
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomSignal1398); 

            			createLeafNode(grammarAccess.getCustomSignalAccess().getTypeSTRINGTerminalRuleCall_1_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCustomSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"STRING", 
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
    // $ANTLR end ruleCustomSignal


    // $ANTLR start entryRulePrimitiveSignal
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:915:1: entryRulePrimitiveSignal returns [EObject current=null] : iv_rulePrimitiveSignal= rulePrimitiveSignal EOF ;
    public final EObject entryRulePrimitiveSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveSignal = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:916:2: (iv_rulePrimitiveSignal= rulePrimitiveSignal EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:917:2: iv_rulePrimitiveSignal= rulePrimitiveSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveSignalRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveSignal_in_entryRulePrimitiveSignal1439);
            iv_rulePrimitiveSignal=rulePrimitiveSignal();
            _fsp--;

             current =iv_rulePrimitiveSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSignal1449); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimitiveSignal


    // $ANTLR start rulePrimitiveSignal
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:924:1: rulePrimitiveSignal returns [EObject current=null] : ( (lv_type_0_0= rulePrimitiveSignalType ) ) ;
    public final EObject rulePrimitiveSignal() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:929:6: ( ( (lv_type_0_0= rulePrimitiveSignalType ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:930:1: ( (lv_type_0_0= rulePrimitiveSignalType ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:930:1: ( (lv_type_0_0= rulePrimitiveSignalType ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:931:1: (lv_type_0_0= rulePrimitiveSignalType )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:931:1: (lv_type_0_0= rulePrimitiveSignalType )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:932:3: lv_type_0_0= rulePrimitiveSignalType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrimitiveSignalAccess().getTypePrimitiveSignalTypeEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimitiveSignalType_in_rulePrimitiveSignal1494);
            lv_type_0_0=rulePrimitiveSignalType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrimitiveSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"PrimitiveSignalType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end rulePrimitiveSignal


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:962:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:963:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:964:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue1529);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue1539); 

            }

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
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:971:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:976:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:977:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:977:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:978:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:978:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:979:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue1580); 

            			createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleInstruction
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1013:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1014:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1015:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1624);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInstruction


    // $ANTLR start ruleInstruction
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1022:1: ruleInstruction returns [EObject current=null] : (this_Abort_0= ruleAbort | this_Join_1= ruleJoin | this_Pause_2= rulePause | this_Term_3= ruleTerm | this_Present_4= rulePresent | this_Goto_5= ruleGoto | this_Fork_6= ruleFork | this_Forke_7= ruleForke | this_Emit_8= ruleEmit | this_Await_9= ruleAwait | this_Prio_10= rulePrio ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Abort_0 = null;

        EObject this_Join_1 = null;

        EObject this_Pause_2 = null;

        EObject this_Term_3 = null;

        EObject this_Present_4 = null;

        EObject this_Goto_5 = null;

        EObject this_Fork_6 = null;

        EObject this_Forke_7 = null;

        EObject this_Emit_8 = null;

        EObject this_Await_9 = null;

        EObject this_Prio_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1027:6: ( (this_Abort_0= ruleAbort | this_Join_1= ruleJoin | this_Pause_2= rulePause | this_Term_3= ruleTerm | this_Present_4= rulePresent | this_Goto_5= ruleGoto | this_Fork_6= ruleFork | this_Forke_7= ruleForke | this_Emit_8= ruleEmit | this_Await_9= ruleAwait | this_Prio_10= rulePrio ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1028:1: (this_Abort_0= ruleAbort | this_Join_1= ruleJoin | this_Pause_2= rulePause | this_Term_3= ruleTerm | this_Present_4= rulePresent | this_Goto_5= ruleGoto | this_Fork_6= ruleFork | this_Forke_7= ruleForke | this_Emit_8= ruleEmit | this_Await_9= ruleAwait | this_Prio_10= rulePrio )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1028:1: (this_Abort_0= ruleAbort | this_Join_1= ruleJoin | this_Pause_2= rulePause | this_Term_3= ruleTerm | this_Present_4= rulePresent | this_Goto_5= ruleGoto | this_Fork_6= ruleFork | this_Forke_7= ruleForke | this_Emit_8= ruleEmit | this_Await_9= ruleAwait | this_Prio_10= rulePrio )
            int alt17=11;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1029:5: this_Abort_0= ruleAbort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getAbortParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbort_in_ruleInstruction1681);
                    this_Abort_0=ruleAbort();
                    _fsp--;

                     
                            current = this_Abort_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1039:5: this_Join_1= ruleJoin
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getJoinParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleJoin_in_ruleInstruction1708);
                    this_Join_1=ruleJoin();
                    _fsp--;

                     
                            current = this_Join_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1049:5: this_Pause_2= rulePause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPauseParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePause_in_ruleInstruction1735);
                    this_Pause_2=rulePause();
                    _fsp--;

                     
                            current = this_Pause_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1059:5: this_Term_3= ruleTerm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getTermParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerm_in_ruleInstruction1762);
                    this_Term_3=ruleTerm();
                    _fsp--;

                     
                            current = this_Term_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1069:5: this_Present_4= rulePresent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPresentParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresent_in_ruleInstruction1789);
                    this_Present_4=rulePresent();
                    _fsp--;

                     
                            current = this_Present_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1079:5: this_Goto_5= ruleGoto
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getGotoParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoto_in_ruleInstruction1816);
                    this_Goto_5=ruleGoto();
                    _fsp--;

                     
                            current = this_Goto_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1089:5: this_Fork_6= ruleFork
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getForkParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFork_in_ruleInstruction1843);
                    this_Fork_6=ruleFork();
                    _fsp--;

                     
                            current = this_Fork_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1099:5: this_Forke_7= ruleForke
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getForkeParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForke_in_ruleInstruction1870);
                    this_Forke_7=ruleForke();
                    _fsp--;

                     
                            current = this_Forke_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1109:5: this_Emit_8= ruleEmit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getEmitParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmit_in_ruleInstruction1897);
                    this_Emit_8=ruleEmit();
                    _fsp--;

                     
                            current = this_Emit_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1119:5: this_Await_9= ruleAwait
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwait_in_ruleInstruction1924);
                    this_Await_9=ruleAwait();
                    _fsp--;

                     
                            current = this_Await_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1129:5: this_Prio_10= rulePrio
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPrioParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrio_in_ruleInstruction1951);
                    this_Prio_10=rulePrio();
                    _fsp--;

                     
                            current = this_Prio_10; 
                            currentNode = currentNode.getParent();
                        

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
    // $ANTLR end ruleInstruction


    // $ANTLR start entryRulePause
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1145:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1146:2: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1147:2: iv_rulePause= rulePause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPauseRule(), currentNode); 
            pushFollow(FOLLOW_rulePause_in_entryRulePause1986);
            iv_rulePause=rulePause();
            _fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePause1996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePause


    // $ANTLR start rulePause
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1154:1: rulePause returns [EObject current=null] : ( () 'PAUSE' '(' ')' ( (lv_annotations_4_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_4_0 = null;

        EObject lv_annotations_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1159:6: ( ( () 'PAUSE' '(' ')' ( (lv_annotations_4_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1160:1: ( () 'PAUSE' '(' ')' ( (lv_annotations_4_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1160:1: ( () 'PAUSE' '(' ')' ( (lv_annotations_4_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )* )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1160:2: () 'PAUSE' '(' ')' ( (lv_annotations_4_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )*
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1160:2: ()
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1161:5: 
            {
             
                    temp=factory.create(grammarAccess.getPauseAccess().getPauseAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPauseAccess().getPauseAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,25,FOLLOW_25_in_rulePause2040); 

                    createLeafNode(grammarAccess.getPauseAccess().getPAUSEKeyword_1(), null); 
                
            match(input,14,FOLLOW_14_in_rulePause2050); 

                    createLeafNode(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2(), null); 
                
            match(input,15,FOLLOW_15_in_rulePause2060); 

                    createLeafNode(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1183:1: ( (lv_annotations_4_0= ruleAnnotation ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1184:1: (lv_annotations_4_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1184:1: (lv_annotations_4_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1185:3: lv_annotations_4_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_rulePause2081);
                    lv_annotations_4_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPauseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_4_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1207:3: ( ',' ( (lv_annotations_6_0= ruleAnnotation ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1207:5: ',' ( (lv_annotations_6_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_rulePause2093); 

            	            createLeafNode(grammarAccess.getPauseAccess().getCommaKeyword_5_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1211:1: ( (lv_annotations_6_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1212:1: (lv_annotations_6_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1212:1: (lv_annotations_6_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1213:3: lv_annotations_6_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_5_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePause2114);
            	    lv_annotations_6_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPauseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_6_0, 
            	    	        		"Annotation", 
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
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end rulePause


    // $ANTLR start entryRuleTerm
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1243:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1244:2: (iv_ruleTerm= ruleTerm EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1245:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2152);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1252:1: ruleTerm returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'TERM' '(' ')' ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1257:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'TERM' '(' ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1258:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'TERM' '(' ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1258:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'TERM' '(' ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1258:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'TERM' '(' ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1258:2: ()
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1259:5: 
            {
             
                    temp=factory.create(grammarAccess.getTermAccess().getTermAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTermAccess().getTermAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1269:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1270:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1270:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1271:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleTerm2217);
                    lv_annotations_1_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_1_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1293:3: ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1293:5: ',' ( (lv_annotations_3_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleTerm2229); 

            	            createLeafNode(grammarAccess.getTermAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1297:1: ( (lv_annotations_3_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1298:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1298:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1299:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTerm2250);
            	    lv_annotations_3_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_3_0, 
            	    	        		"Annotation", 
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
            	    break loop21;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleTerm2262); 

                    createLeafNode(grammarAccess.getTermAccess().getTERMKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleTerm2272); 

                    createLeafNode(grammarAccess.getTermAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,15,FOLLOW_15_in_ruleTerm2282); 

                    createLeafNode(grammarAccess.getTermAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleJoin
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1341:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1342:2: (iv_ruleJoin= ruleJoin EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1343:2: iv_ruleJoin= ruleJoin EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJoinRule(), currentNode); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin2318);
            iv_ruleJoin=ruleJoin();
            _fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin2328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJoin


    // $ANTLR start ruleJoin
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1350:1: ruleJoin returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'JOIN' '(' ')' ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1355:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'JOIN' '(' ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1356:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'JOIN' '(' ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1356:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'JOIN' '(' ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1356:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'JOIN' '(' ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1356:2: ()
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1357:5: 
            {
             
                    temp=factory.create(grammarAccess.getJoinAccess().getJoinAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getJoinAccess().getJoinAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1367:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1368:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1368:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1369:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleJoin2383);
                    lv_annotations_1_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getJoinRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_1_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1391:3: ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1391:5: ',' ( (lv_annotations_3_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleJoin2395); 

            	            createLeafNode(grammarAccess.getJoinAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1395:1: ( (lv_annotations_3_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1396:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1396:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1397:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleJoin2416);
            	    lv_annotations_3_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getJoinRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_3_0, 
            	    	        		"Annotation", 
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
            	    break loop23;
                }
            } while (true);

            match(input,27,FOLLOW_27_in_ruleJoin2428); 

                    createLeafNode(grammarAccess.getJoinAccess().getJOINKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleJoin2438); 

                    createLeafNode(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,15,FOLLOW_15_in_ruleJoin2448); 

                    createLeafNode(grammarAccess.getJoinAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleJoin


    // $ANTLR start entryRuleAbort
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1439:1: entryRuleAbort returns [EObject current=null] : iv_ruleAbort= ruleAbort EOF ;
    public final EObject entryRuleAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbort = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1440:2: (iv_ruleAbort= ruleAbort EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1441:2: iv_ruleAbort= ruleAbort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort2484);
            iv_ruleAbort=ruleAbort();
            _fsp--;

             current =iv_ruleAbort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort2494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbort


    // $ANTLR start ruleAbort
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1448:1: ruleAbort returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'ABORT' '(' ')' ) ;
    public final EObject ruleAbort() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1453:6: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'ABORT' '(' ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1454:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'ABORT' '(' ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1454:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'ABORT' '(' ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1454:2: () ( (lv_annotations_1_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )* 'ABORT' '(' ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1454:2: ()
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1455:5: 
            {
             
                    temp=factory.create(grammarAccess.getAbortAccess().getAbortAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAbortAccess().getAbortAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1465:2: ( (lv_annotations_1_0= ruleAnnotation ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1466:1: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1466:1: (lv_annotations_1_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1467:3: lv_annotations_1_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleAbort2549);
                    lv_annotations_1_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_1_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1489:3: ( ',' ( (lv_annotations_3_0= ruleAnnotation ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1489:5: ',' ( (lv_annotations_3_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleAbort2561); 

            	            createLeafNode(grammarAccess.getAbortAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1493:1: ( (lv_annotations_3_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1494:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1494:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1495:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAbort2582);
            	    lv_annotations_3_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_3_0, 
            	    	        		"Annotation", 
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
            	    break loop25;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_ruleAbort2594); 

                    createLeafNode(grammarAccess.getAbortAccess().getABORTKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleAbort2604); 

                    createLeafNode(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,15,FOLLOW_15_in_ruleAbort2614); 

                    createLeafNode(grammarAccess.getAbortAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleAbort


    // $ANTLR start entryRulePresent
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1537:1: entryRulePresent returns [EObject current=null] : iv_rulePresent= rulePresent EOF ;
    public final EObject entryRulePresent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresent = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1538:2: (iv_rulePresent= rulePresent EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1539:2: iv_rulePresent= rulePresent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentRule(), currentNode); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent2650);
            iv_rulePresent=rulePresent();
            _fsp--;

             current =iv_rulePresent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent2660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresent


    // $ANTLR start rulePresent
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1546:1: rulePresent returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRESENT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' '{' ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* '}' ) ;
    public final EObject rulePresent() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_signal_5_0 = null;

        EObject lv_instructions_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1551:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRESENT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' '{' ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* '}' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1552:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRESENT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' '{' ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* '}' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1552:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRESENT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' '{' ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* '}' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1552:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRESENT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' '{' ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )* '}'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1552:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1553:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1553:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1554:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_rulePresent2706);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1576:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1576:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_rulePresent2718); 

            	            createLeafNode(grammarAccess.getPresentAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1580:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1581:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1581:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1582:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePresent2739);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop27;
                }
            } while (true);

            match(input,29,FOLLOW_29_in_rulePresent2751); 

                    createLeafNode(grammarAccess.getPresentAccess().getPRESENTKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_rulePresent2761); 

                    createLeafNode(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1612:1: ( (lv_signal_5_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1613:1: (lv_signal_5_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1613:1: (lv_signal_5_0= ruleSignalReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1614:3: lv_signal_5_0= ruleSignalReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getSignalSignalReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalReference_in_rulePresent2782);
            lv_signal_5_0=ruleSignalReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"signal",
            	        		lv_signal_5_0, 
            	        		"SignalReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_rulePresent2792); 

                    createLeafNode(grammarAccess.getPresentAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,30,FOLLOW_30_in_rulePresent2802); 

                    createLeafNode(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1644:1: ( ( (lv_instructions_8_0= ruleInstruction ) ) ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==17||(LA28_0>=25 && LA28_0<=29)||(LA28_0>=32 && LA28_0<=37)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1644:2: ( (lv_instructions_8_0= ruleInstruction ) ) ';'
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1644:2: ( (lv_instructions_8_0= ruleInstruction ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1645:1: (lv_instructions_8_0= ruleInstruction )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1645:1: (lv_instructions_8_0= ruleInstruction )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1646:3: lv_instructions_8_0= ruleInstruction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_7_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_rulePresent2824);
            	    lv_instructions_8_0=ruleInstruction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"instructions",
            	    	        		lv_instructions_8_0, 
            	    	        		"Instruction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,18,FOLLOW_18_in_rulePresent2834); 

            	            createLeafNode(grammarAccess.getPresentAccess().getSemicolonKeyword_7_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,31,FOLLOW_31_in_rulePresent2846); 

                    createLeafNode(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end rulePresent


    // $ANTLR start entryRuleGoto
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1684:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1685:2: (iv_ruleGoto= ruleGoto EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1686:2: iv_ruleGoto= ruleGoto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGotoRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto2882);
            iv_ruleGoto=ruleGoto();
            _fsp--;

             current =iv_ruleGoto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto2892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGoto


    // $ANTLR start ruleGoto
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1693:1: ruleGoto returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'GOTO' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_state_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1698:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'GOTO' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1699:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'GOTO' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1699:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'GOTO' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1699:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'GOTO' '(' ( (lv_state_5_0= ruleStateReference ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1699:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1700:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1700:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1701:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleGoto2938);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGotoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1723:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1723:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleGoto2950); 

            	            createLeafNode(grammarAccess.getGotoAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1727:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1728:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1728:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1729:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleGoto2971);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getGotoRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop30;
                }
            } while (true);

            match(input,32,FOLLOW_32_in_ruleGoto2983); 

                    createLeafNode(grammarAccess.getGotoAccess().getGOTOKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleGoto2993); 

                    createLeafNode(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1759:1: ( (lv_state_5_0= ruleStateReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1760:1: (lv_state_5_0= ruleStateReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1760:1: (lv_state_5_0= ruleStateReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1761:3: lv_state_5_0= ruleStateReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGotoAccess().getStateStateReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStateReference_in_ruleGoto3014);
            lv_state_5_0=ruleStateReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGotoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"state",
            	        		lv_state_5_0, 
            	        		"StateReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleGoto3024); 

                    createLeafNode(grammarAccess.getGotoAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleGoto


    // $ANTLR start entryRuleFork
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1795:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1796:2: (iv_ruleFork= ruleFork EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1797:2: iv_ruleFork= ruleFork EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForkRule(), currentNode); 
            pushFollow(FOLLOW_ruleFork_in_entryRuleFork3060);
            iv_ruleFork=ruleFork();
            _fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFork3070); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFork


    // $ANTLR start ruleFork
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1804:1: ruleFork returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORK' '(' ( (lv_state_5_0= ruleStateReference ) ) ',' ( (lv_priority_7_0= ruleIntValue ) ) ')' ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_priority_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1809:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORK' '(' ( (lv_state_5_0= ruleStateReference ) ) ',' ( (lv_priority_7_0= ruleIntValue ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1810:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORK' '(' ( (lv_state_5_0= ruleStateReference ) ) ',' ( (lv_priority_7_0= ruleIntValue ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1810:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORK' '(' ( (lv_state_5_0= ruleStateReference ) ) ',' ( (lv_priority_7_0= ruleIntValue ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1810:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORK' '(' ( (lv_state_5_0= ruleStateReference ) ) ',' ( (lv_priority_7_0= ruleIntValue ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1810:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1811:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1811:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1812:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleFork3116);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1834:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1834:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleFork3128); 

            	            createLeafNode(grammarAccess.getForkAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1838:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1839:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1839:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1840:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleFork3149);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForkRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop32;
                }
            } while (true);

            match(input,33,FOLLOW_33_in_ruleFork3161); 

                    createLeafNode(grammarAccess.getForkAccess().getFORKKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleFork3171); 

                    createLeafNode(grammarAccess.getForkAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1870:1: ( (lv_state_5_0= ruleStateReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1871:1: (lv_state_5_0= ruleStateReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1871:1: (lv_state_5_0= ruleStateReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1872:3: lv_state_5_0= ruleStateReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForkAccess().getStateStateReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStateReference_in_ruleFork3192);
            lv_state_5_0=ruleStateReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"state",
            	        		lv_state_5_0, 
            	        		"StateReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleFork3202); 

                    createLeafNode(grammarAccess.getForkAccess().getCommaKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1898:1: ( (lv_priority_7_0= ruleIntValue ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1899:1: (lv_priority_7_0= ruleIntValue )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1899:1: (lv_priority_7_0= ruleIntValue )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1900:3: lv_priority_7_0= ruleIntValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntValue_in_ruleFork3223);
            lv_priority_7_0=ruleIntValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"priority",
            	        		lv_priority_7_0, 
            	        		"IntValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleFork3233); 

                    createLeafNode(grammarAccess.getForkAccess().getRightParenthesisKeyword_7(), null); 
                

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
    // $ANTLR end ruleFork


    // $ANTLR start entryRuleForke
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1934:1: entryRuleForke returns [EObject current=null] : iv_ruleForke= ruleForke EOF ;
    public final EObject entryRuleForke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForke = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1935:2: (iv_ruleForke= ruleForke EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1936:2: iv_ruleForke= ruleForke EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForkeRule(), currentNode); 
            pushFollow(FOLLOW_ruleForke_in_entryRuleForke3269);
            iv_ruleForke=ruleForke();
            _fsp--;

             current =iv_ruleForke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForke3279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleForke


    // $ANTLR start ruleForke
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1943:1: ruleForke returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORKE' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' ) ;
    public final EObject ruleForke() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_state_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1948:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORKE' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1949:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORKE' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1949:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORKE' '(' ( (lv_state_5_0= ruleStateReference ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1949:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'FORKE' '(' ( (lv_state_5_0= ruleStateReference ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1949:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1950:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1950:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1951:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleForke3325);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForkeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1973:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1973:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleForke3337); 

            	            createLeafNode(grammarAccess.getForkeAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1977:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1978:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1978:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:1979:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleForke3358);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForkeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop34;
                }
            } while (true);

            match(input,34,FOLLOW_34_in_ruleForke3370); 

                    createLeafNode(grammarAccess.getForkeAccess().getFORKEKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleForke3380); 

                    createLeafNode(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2009:1: ( (lv_state_5_0= ruleStateReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2010:1: (lv_state_5_0= ruleStateReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2010:1: (lv_state_5_0= ruleStateReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2011:3: lv_state_5_0= ruleStateReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForkeAccess().getStateStateReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStateReference_in_ruleForke3401);
            lv_state_5_0=ruleStateReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForkeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"state",
            	        		lv_state_5_0, 
            	        		"StateReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleForke3411); 

                    createLeafNode(grammarAccess.getForkeAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleForke


    // $ANTLR start entryRuleEmit
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2045:1: entryRuleEmit returns [EObject current=null] : iv_ruleEmit= ruleEmit EOF ;
    public final EObject entryRuleEmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmit = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2046:2: (iv_ruleEmit= ruleEmit EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2047:2: iv_ruleEmit= ruleEmit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmitRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit3447);
            iv_ruleEmit=ruleEmit();
            _fsp--;

             current =iv_ruleEmit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit3457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmit


    // $ANTLR start ruleEmit
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2054:1: ruleEmit returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'EMIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' ) ;
    public final EObject ruleEmit() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_signal_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2059:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'EMIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2060:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'EMIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2060:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'EMIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2060:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'EMIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2060:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2061:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2061:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2062:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleEmit3503);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2084:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2084:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleEmit3515); 

            	            createLeafNode(grammarAccess.getEmitAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2088:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2089:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2089:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2090:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEmit3536);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop36;
                }
            } while (true);

            match(input,35,FOLLOW_35_in_ruleEmit3548); 

                    createLeafNode(grammarAccess.getEmitAccess().getEMITKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleEmit3558); 

                    createLeafNode(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2120:1: ( (lv_signal_5_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2121:1: (lv_signal_5_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2121:1: (lv_signal_5_0= ruleSignalReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2122:3: lv_signal_5_0= ruleSignalReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getSignalSignalReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalReference_in_ruleEmit3579);
            lv_signal_5_0=ruleSignalReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"signal",
            	        		lv_signal_5_0, 
            	        		"SignalReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleEmit3589); 

                    createLeafNode(grammarAccess.getEmitAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleEmit


    // $ANTLR start entryRuleAwait
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2156:1: entryRuleAwait returns [EObject current=null] : iv_ruleAwait= ruleAwait EOF ;
    public final EObject entryRuleAwait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwait = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2157:2: (iv_ruleAwait= ruleAwait EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2158:2: iv_ruleAwait= ruleAwait EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait3625);
            iv_ruleAwait=ruleAwait();
            _fsp--;

             current =iv_ruleAwait; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait3635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwait


    // $ANTLR start ruleAwait
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2165:1: ruleAwait returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'AWAIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' ) ;
    public final EObject ruleAwait() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_signal_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2170:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'AWAIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2171:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'AWAIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2171:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'AWAIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2171:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'AWAIT' '(' ( (lv_signal_5_0= ruleSignalReference ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2171:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2172:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2172:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2173:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleAwait3681);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAwaitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2195:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2195:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleAwait3693); 

            	            createLeafNode(grammarAccess.getAwaitAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2199:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2200:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2200:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2201:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAwait3714);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAwaitRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop38;
                }
            } while (true);

            match(input,36,FOLLOW_36_in_ruleAwait3726); 

                    createLeafNode(grammarAccess.getAwaitAccess().getAWAITKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_ruleAwait3736); 

                    createLeafNode(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2231:1: ( (lv_signal_5_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2232:1: (lv_signal_5_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2232:1: (lv_signal_5_0= ruleSignalReference )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2233:3: lv_signal_5_0= ruleSignalReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitAccess().getSignalSignalReferenceParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalReference_in_ruleAwait3757);
            lv_signal_5_0=ruleSignalReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"signal",
            	        		lv_signal_5_0, 
            	        		"SignalReference", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleAwait3767); 

                    createLeafNode(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleAwait


    // $ANTLR start entryRulePrio
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2267:1: entryRulePrio returns [EObject current=null] : iv_rulePrio= rulePrio EOF ;
    public final EObject entryRulePrio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrio = null;


        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2268:2: (iv_rulePrio= rulePrio EOF )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2269:2: iv_rulePrio= rulePrio EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrioRule(), currentNode); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio3803);
            iv_rulePrio=rulePrio();
            _fsp--;

             current =iv_rulePrio; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio3813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrio


    // $ANTLR start rulePrio
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2276:1: rulePrio returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRIO' '(' ( (lv_priority_5_0= ruleIntValue ) ) ')' ) ;
    public final EObject rulePrio() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_priority_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2281:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRIO' '(' ( (lv_priority_5_0= ruleIntValue ) ) ')' ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2282:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRIO' '(' ( (lv_priority_5_0= ruleIntValue ) ) ')' )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2282:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRIO' '(' ( (lv_priority_5_0= ruleIntValue ) ) ')' )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2282:2: ( (lv_annotations_0_0= ruleAnnotation ) )? ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )* 'PRIO' '(' ( (lv_priority_5_0= ruleIntValue ) ) ')'
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2282:2: ( (lv_annotations_0_0= ruleAnnotation ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2283:1: (lv_annotations_0_0= ruleAnnotation )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2283:1: (lv_annotations_0_0= ruleAnnotation )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2284:3: lv_annotations_0_0= ruleAnnotation
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_rulePrio3859);
                    lv_annotations_0_0=ruleAnnotation();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"annotations",
                    	        		lv_annotations_0_0, 
                    	        		"Annotation", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2306:3: ( ',' ( (lv_annotations_2_0= ruleAnnotation ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==17) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2306:5: ',' ( (lv_annotations_2_0= ruleAnnotation ) )
            	    {
            	    match(input,17,FOLLOW_17_in_rulePrio3871); 

            	            createLeafNode(grammarAccess.getPrioAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2310:1: ( (lv_annotations_2_0= ruleAnnotation ) )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2311:1: (lv_annotations_2_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2311:1: (lv_annotations_2_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2312:3: lv_annotations_2_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePrio3892);
            	    lv_annotations_2_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_2_0, 
            	    	        		"Annotation", 
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
            	    break loop40;
                }
            } while (true);

            match(input,37,FOLLOW_37_in_rulePrio3904); 

                    createLeafNode(grammarAccess.getPrioAccess().getPRIOKeyword_2(), null); 
                
            match(input,14,FOLLOW_14_in_rulePrio3914); 

                    createLeafNode(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2342:1: ( (lv_priority_5_0= ruleIntValue ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2343:1: (lv_priority_5_0= ruleIntValue )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2343:1: (lv_priority_5_0= ruleIntValue )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2344:3: lv_priority_5_0= ruleIntValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntValue_in_rulePrio3935);
            lv_priority_5_0=ruleIntValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"priority",
            	        		lv_priority_5_0, 
            	        		"IntValue", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_rulePrio3945); 

                    createLeafNode(grammarAccess.getPrioAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end rulePrio


    // $ANTLR start rulePrimitiveSignalType
    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2378:1: rulePrimitiveSignalType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'INT' ) | ( 'BOOL' ) | ( 'FLOAT' ) ) ;
    public final Enumerator rulePrimitiveSignalType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2382:6: ( ( ( 'PURE' ) | ( 'INT' ) | ( 'BOOL' ) | ( 'FLOAT' ) ) )
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2383:1: ( ( 'PURE' ) | ( 'INT' ) | ( 'BOOL' ) | ( 'FLOAT' ) )
            {
            // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2383:1: ( ( 'PURE' ) | ( 'INT' ) | ( 'BOOL' ) | ( 'FLOAT' ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt41=1;
                }
                break;
            case 39:
                {
                alt41=2;
                }
                break;
            case 40:
                {
                alt41=3;
                }
                break;
            case 41:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2383:1: ( ( 'PURE' ) | ( 'INT' ) | ( 'BOOL' ) | ( 'FLOAT' ) )", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2383:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2383:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2383:4: 'PURE'
                    {
                    match(input,38,FOLLOW_38_in_rulePrimitiveSignalType3993); 

                            current = grammarAccess.getPrimitiveSignalTypeAccess().getPureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveSignalTypeAccess().getPureEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2389:6: ( 'INT' )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2389:6: ( 'INT' )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2389:8: 'INT'
                    {
                    match(input,39,FOLLOW_39_in_rulePrimitiveSignalType4008); 

                            current = grammarAccess.getPrimitiveSignalTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveSignalTypeAccess().getIntEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2395:6: ( 'BOOL' )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2395:6: ( 'BOOL' )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2395:8: 'BOOL'
                    {
                    match(input,40,FOLLOW_40_in_rulePrimitiveSignalType4023); 

                            current = grammarAccess.getPrimitiveSignalTypeAccess().getBoolEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveSignalTypeAccess().getBoolEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2401:6: ( 'FLOAT' )
                    {
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2401:6: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.s/src-gen/de/cau/cs/kieler/s/parser/antlr/internal/InternalS.g:2401:8: 'FLOAT'
                    {
                    match(input,41,FOLLOW_41_in_rulePrimitiveSignalType4038); 

                            current = grammarAccess.getPrimitiveSignalTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPrimitiveSignalTypeAccess().getFloatEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end rulePrimitiveSignalType


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\21\uffff";
    static final String DFA17_eofS =
        "\21\uffff";
    static final String DFA17_minS =
        "\1\4\1\5\1\4\13\uffff\1\21\1\5\1\21";
    static final String DFA17_maxS =
        "\1\45\1\5\1\4\13\uffff\1\45\1\5\1\45";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff";
    static final String DFA17_specialS =
        "\21\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\14\uffff\1\2\7\uffff\1\5\1\6\1\4\1\3\1\7\2\uffff\1\10\1"+
            "\11\1\12\1\13\1\14\1\15",
            "\1\16",
            "\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\10\uffff\1\6\1\4\1\3\1\7\2\uffff\1\10\1\11\1\12\1\13\1"+
            "\14\1\15",
            "\1\20",
            "\1\2\10\uffff\1\6\1\4\1\3\1\7\2\uffff\1\10\1\11\1\12\1\13\1"+
            "\14\1\15"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1028:1: (this_Abort_0= ruleAbort | this_Join_1= ruleJoin | this_Pause_2= rulePause | this_Term_3= ruleTerm | this_Present_4= rulePresent | this_Goto_5= ruleGoto | this_Fork_6= ruleFork | this_Forke_7= ruleForke | this_Emit_8= ruleEmit | this_Await_9= ruleAwait | this_Prio_10= rulePrio )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleProgram120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleProgram173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProgram183 = new BitSet(new long[]{0x0000000000190010L});
    public static final BitSet FOLLOW_16_in_ruleProgram194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram215 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleProgram226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram247 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleProgram259 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_19_in_ruleProgram272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram293 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleProgram304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram325 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleProgram337 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleProgram350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram371 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleProgram382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleProgram403 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleProgram415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleState_in_ruleProgram438 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState644 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleState659 = new BitSet(new long[]{0x0000003F3E420012L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleState680 = new BitSet(new long[]{0x0000003F3E420012L});
    public static final BitSet FOLLOW_17_in_ruleState692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleState713 = new BitSet(new long[]{0x0000003F3E420012L});
    public static final BitSet FOLLOW_22_in_ruleState726 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState747 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState758 = new BitSet(new long[]{0x0000003F3E020012L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleState782 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleState792 = new BitSet(new long[]{0x0000003F3E020012L});
    public static final BitSet FOLLOW_ruleStateReference_in_entryRuleStateReference830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReference840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateReference882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal969 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSignal984 = new BitSet(new long[]{0x000003C001000000L});
    public static final BitSet FOLLOW_ruleSignalType_in_ruleSignal1005 = new BitSet(new long[]{0x0000000000820012L});
    public static final BitSet FOLLOW_23_in_ruleSignal1016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal1034 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSignal1057 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSignal1069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSignal1090 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_entryRuleSignalType1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalType1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignal_in_ruleSignalType1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignal_in_ruleSignalType1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignal_in_entryRuleCustomSignal1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomSignal1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCustomSignal1381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomSignal1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignal_in_entryRulePrimitiveSignal1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSignal1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignalType_in_rulePrimitiveSignal1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_ruleInstruction1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleInstruction1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleInstruction1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleInstruction1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_ruleInstruction1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleInstruction1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_ruleInstruction1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_ruleInstruction1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_ruleInstruction1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_ruleInstruction1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_ruleInstruction1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause1986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePause2040 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePause2050 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePause2060 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePause2081 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulePause2093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePause2114 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTerm2217 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleTerm2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTerm2250 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleTerm2262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTerm2272 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTerm2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleJoin2383 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleJoin2395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleJoin2416 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_27_in_ruleJoin2428 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJoin2438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJoin2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAbort2549 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleAbort2561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAbort2582 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleAbort2594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAbort2604 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAbort2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent2650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePresent2706 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_rulePresent2718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePresent2739 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_rulePresent2751 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePresent2761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rulePresent2782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePresent2792 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePresent2802 = new BitSet(new long[]{0x0000003FBE020010L});
    public static final BitSet FOLLOW_ruleInstruction_in_rulePresent2824 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePresent2834 = new BitSet(new long[]{0x0000003FBE020010L});
    public static final BitSet FOLLOW_31_in_rulePresent2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleGoto2938 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_17_in_ruleGoto2950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleGoto2971 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_32_in_ruleGoto2983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoto2993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateReference_in_ruleGoto3014 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGoto3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_entryRuleFork3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFork3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFork3116 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_ruleFork3128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleFork3149 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleFork3161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFork3171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateReference_in_ruleFork3192 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFork3202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleFork3223 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFork3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_entryRuleForke3269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForke3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleForke3325 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleForke3337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleForke3358 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_34_in_ruleForke3370 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleForke3380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStateReference_in_ruleForke3401 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForke3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEmit3503 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_17_in_ruleEmit3515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEmit3536 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_35_in_ruleEmit3548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEmit3558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleEmit3579 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEmit3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait3625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAwait3681 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_17_in_ruleAwait3693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAwait3714 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_36_in_ruleAwait3726 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAwait3736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleAwait3757 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAwait3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio3803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePrio3859 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_17_in_rulePrio3871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePrio3892 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_37_in_rulePrio3904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePrio3914 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntValue_in_rulePrio3935 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrio3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveSignalType3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitiveSignalType4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitiveSignalType4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrimitiveSignalType4038 = new BitSet(new long[]{0x0000000000000002L});

}