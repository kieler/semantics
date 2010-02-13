package de.cau.cs.kieler.krep.editors.rif.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.krep.editors.rif.services.RifGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalRifParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#@inputs'", "'@#'", "'#@outputs'", "'#@locals'", "'\"'", "'\":'", "'bool'", "'int'", "'#step'", "'#outs'", "'#locs'", "'T'", "'F'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRifParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g"; }



     	private RifGrammarAccess grammarAccess;
     	
        public InternalRifParser(TokenStream input, IAstFactory factory, RifGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Trace";	
       	} 



    // $ANTLR start entryRuleTrace
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:72:1: entryRuleTrace returns [EObject current=null] : iv_ruleTrace= ruleTrace EOF ;
    public final EObject entryRuleTrace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrace = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:73:2: (iv_ruleTrace= ruleTrace EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:74:2: iv_ruleTrace= ruleTrace EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTraceRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrace_in_entryRuleTrace75);
            iv_ruleTrace=ruleTrace();
            _fsp--;

             current =iv_ruleTrace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrace85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrace


    // $ANTLR start ruleTrace
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:81:1: ruleTrace returns [EObject current=null] : ( '#@inputs' ( (lv_inputs_1_0= ruledecl ) )* '@#' '#@outputs' ( (lv_outputs_4_0= ruledecl ) )* '@#' '#@locals' ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_local_7_0 = null;

        EObject lv_tick_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:86:6: ( ( '#@inputs' ( (lv_inputs_1_0= ruledecl ) )* '@#' '#@outputs' ( (lv_outputs_4_0= ruledecl ) )* '@#' '#@locals' ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:1: ( '#@inputs' ( (lv_inputs_1_0= ruledecl ) )* '@#' '#@outputs' ( (lv_outputs_4_0= ruledecl ) )* '@#' '#@locals' ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:1: ( '#@inputs' ( (lv_inputs_1_0= ruledecl ) )* '@#' '#@outputs' ( (lv_outputs_4_0= ruledecl ) )* '@#' '#@locals' ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:3: '#@inputs' ( (lv_inputs_1_0= ruledecl ) )* '@#' '#@outputs' ( (lv_outputs_4_0= ruledecl ) )* '@#' '#@locals' ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+
            {
            match(input,11,FOLLOW_11_in_ruleTrace120); 

                    createLeafNode(grammarAccess.getTraceAccess().getInputsKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:91:1: ( (lv_inputs_1_0= ruledecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:92:1: (lv_inputs_1_0= ruledecl )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:92:1: (lv_inputs_1_0= ruledecl )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:93:3: lv_inputs_1_0= ruledecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTraceAccess().getInputsDeclParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace141);
            	    lv_inputs_1_0=ruledecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTraceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"inputs",
            	    	        		lv_inputs_1_0, 
            	    	        		"decl", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleTrace152); 

                    createLeafNode(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleTrace162); 

                    createLeafNode(grammarAccess.getTraceAccess().getOutputsKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:123:1: ( (lv_outputs_4_0= ruledecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:124:1: (lv_outputs_4_0= ruledecl )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:124:1: (lv_outputs_4_0= ruledecl )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:125:3: lv_outputs_4_0= ruledecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTraceAccess().getOutputsDeclParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace183);
            	    lv_outputs_4_0=ruledecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTraceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"outputs",
            	    	        		lv_outputs_4_0, 
            	    	        		"decl", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleTrace194); 

                    createLeafNode(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5(), null); 
                
            match(input,14,FOLLOW_14_in_ruleTrace204); 

                    createLeafNode(grammarAccess.getTraceAccess().getLocalsKeyword_6(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:155:1: ( (lv_local_7_0= ruledecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:156:1: (lv_local_7_0= ruledecl )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:156:1: (lv_local_7_0= ruledecl )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:157:3: lv_local_7_0= ruledecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTraceAccess().getLocalDeclParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace225);
            	    lv_local_7_0=ruledecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTraceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"local",
            	    	        		lv_local_7_0, 
            	    	        		"decl", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleTrace236); 

                    createLeafNode(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:183:1: ( (lv_tick_9_0= ruleTick ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:184:1: (lv_tick_9_0= ruleTick )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:184:1: (lv_tick_9_0= ruleTick )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:185:3: lv_tick_9_0= ruleTick
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTraceAccess().getTickTickParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTick_in_ruleTrace257);
            	    lv_tick_9_0=ruleTick();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTraceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"tick",
            	    	        		lv_tick_9_0, 
            	    	        		"Tick", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end ruleTrace


    // $ANTLR start entryRuledecl
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:215:1: entryRuledecl returns [EObject current=null] : iv_ruledecl= ruledecl EOF ;
    public final EObject entryRuledecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledecl = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:216:2: (iv_ruledecl= ruledecl EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:217:2: iv_ruledecl= ruledecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl294);
            iv_ruledecl=ruledecl();
            _fsp--;

             current =iv_ruledecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuledecl


    // $ANTLR start ruledecl
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:224:1: ruledecl returns [EObject current=null] : ( '\"' ( (lv_name_1_0= RULE_ID ) ) '\":' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruledecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:229:6: ( ( '\"' ( (lv_name_1_0= RULE_ID ) ) '\":' ( (lv_type_3_0= ruleType ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:1: ( '\"' ( (lv_name_1_0= RULE_ID ) ) '\":' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:1: ( '\"' ( (lv_name_1_0= RULE_ID ) ) '\":' ( (lv_type_3_0= ruleType ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:3: '\"' ( (lv_name_1_0= RULE_ID ) ) '\":' ( (lv_type_3_0= ruleType ) )
            {
            match(input,15,FOLLOW_15_in_ruledecl339); 

                    createLeafNode(grammarAccess.getDeclAccess().getQuotationMarkKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:235:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:236:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledecl356); 

            			createLeafNode(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
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

            match(input,16,FOLLOW_16_in_ruledecl371); 

                    createLeafNode(grammarAccess.getDeclAccess().getQuotationMarkColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:262:1: ( (lv_type_3_0= ruleType ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:263:1: (lv_type_3_0= ruleType )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:263:1: (lv_type_3_0= ruleType )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:264:3: lv_type_3_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruledecl392);
            lv_type_3_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_3_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruledecl


    // $ANTLR start entryRuleType
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:294:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:295:2: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:296:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType429);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:303:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'int' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:308:6: ( (kw= 'bool' | kw= 'int' ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:309:1: (kw= 'bool' | kw= 'int' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:309:1: (kw= 'bool' | kw= 'int' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("309:1: (kw= 'bool' | kw= 'int' )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:310:2: kw= 'bool'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleType478); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTypeAccess().getBoolKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:317:2: kw= 'int'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleType497); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTypeAccess().getIntKeyword_1(), null); 
                        

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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTick
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:330:1: entryRuleTick returns [EObject current=null] : iv_ruleTick= ruleTick EOF ;
    public final EObject entryRuleTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTick = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:331:2: (iv_ruleTick= ruleTick EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:332:2: iv_ruleTick= ruleTick EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTickRule(), currentNode); 
            pushFollow(FOLLOW_ruleTick_in_entryRuleTick537);
            iv_ruleTick=ruleTick();
            _fsp--;

             current =iv_ruleTick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTick547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTick


    // $ANTLR start ruleTick
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:339:1: ruleTick returns [EObject current=null] : ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* ) ;
    public final EObject ruleTick() throws RecognitionException {
        EObject current = null;

        Token lv_nr_2_0=null;
        EObject lv_input_3_0 = null;

        EObject lv_output_5_0 = null;

        EObject lv_local_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:344:6: ( ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:345:1: ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:345:1: ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:345:2: () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )*
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:345:2: ()
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:346:5: 
            {
             
                    temp=factory.create(grammarAccess.getTickAccess().getTickAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTickAccess().getTickAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,19,FOLLOW_19_in_ruleTick591); 

                    createLeafNode(grammarAccess.getTickAccess().getStepKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:360:1: ( (lv_nr_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:361:1: (lv_nr_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:361:1: (lv_nr_2_0= RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:362:3: lv_nr_2_0= RULE_INT
            {
            lv_nr_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTick608); 

            			createLeafNode(grammarAccess.getTickAccess().getNrINTTerminalRuleCall_2_0(), "nr"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"nr",
            	        		lv_nr_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:384:2: ( (lv_input_3_0= ruleData ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT||(LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:385:1: (lv_input_3_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:385:1: (lv_input_3_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:386:3: lv_input_3_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick634);
            	    lv_input_3_0=ruleData();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"input",
            	    	        		lv_input_3_0, 
            	    	        		"Data", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleTick645); 

                    createLeafNode(grammarAccess.getTickAccess().getOutsKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:412:1: ( (lv_output_5_0= ruleData ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||(LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:413:1: (lv_output_5_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:413:1: (lv_output_5_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:414:3: lv_output_5_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick666);
            	    lv_output_5_0=ruleData();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"output",
            	    	        		lv_output_5_0, 
            	    	        		"Data", 
            	    	        		currentNode);
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

            match(input,21,FOLLOW_21_in_ruleTick677); 

                    createLeafNode(grammarAccess.getTickAccess().getLocsKeyword_6(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:440:1: ( (lv_local_7_0= ruleData ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:441:1: (lv_local_7_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:441:1: (lv_local_7_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:442:3: lv_local_7_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick698);
            	    lv_local_7_0=ruleData();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTickRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"local",
            	    	        		lv_local_7_0, 
            	    	        		"Data", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end ruleTick


    // $ANTLR start entryRuleData
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:472:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:473:2: (iv_ruleData= ruleData EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:474:2: iv_ruleData= ruleData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData735);
            iv_ruleData=ruleData();
            _fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData745); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleData


    // $ANTLR start ruleData
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:481:1: ruleData returns [EObject current=null] : ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_intVal_0_0=null;
        Token lv_true_1_0=null;
        Token lv_false_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:486:6: ( ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:487:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:487:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("487:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:487:2: ( (lv_intVal_0_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:487:2: ( (lv_intVal_0_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:488:1: (lv_intVal_0_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:488:1: (lv_intVal_0_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:489:3: lv_intVal_0_0= RULE_INT
                    {
                    lv_intVal_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleData787); 

                    			createLeafNode(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_0_0(), "intVal"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"intVal",
                    	        		lv_intVal_0_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:512:6: ( (lv_true_1_0= 'T' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:512:6: ( (lv_true_1_0= 'T' ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:513:1: (lv_true_1_0= 'T' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:513:1: (lv_true_1_0= 'T' )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:514:3: lv_true_1_0= 'T'
                    {
                    lv_true_1_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleData816); 

                            createLeafNode(grammarAccess.getDataAccess().getTrueTKeyword_1_0(), "true"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "true", true, "T", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:534:6: ( (lv_false_2_0= 'F' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:534:6: ( (lv_false_2_0= 'F' ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:535:1: (lv_false_2_0= 'F' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:535:1: (lv_false_2_0= 'F' )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:536:3: lv_false_2_0= 'F'
                    {
                    lv_false_2_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleData853); 

                            createLeafNode(grammarAccess.getDataAccess().getFalseFKeyword_2_0(), "false"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "false", true, "F", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // $ANTLR end ruleData


 

    public static final BitSet FOLLOW_ruleTrace_in_entryRuleTrace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTrace120 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace141 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleTrace152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTrace162 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace183 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleTrace194 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTrace204 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace225 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_12_in_ruleTrace236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTick_in_ruleTrace257 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruledecl339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledecl356 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruledecl371 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleType_in_ruledecl392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_entryRuleTick537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTick547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTick591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTick608 = new BitSet(new long[]{0x0000000000D00020L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick634 = new BitSet(new long[]{0x0000000000D00020L});
    public static final BitSet FOLLOW_20_in_ruleTick645 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick666 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_21_in_ruleTick677 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick698 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleData787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleData816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleData853 = new BitSet(new long[]{0x0000000000000002L});

}