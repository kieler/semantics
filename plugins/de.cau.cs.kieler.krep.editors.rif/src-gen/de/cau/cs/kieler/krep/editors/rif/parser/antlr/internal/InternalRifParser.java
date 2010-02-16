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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INPUTS", "RULE_OUTPUTS", "RULE_LOCALS", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'@#'", "':'", "'bool'", "'int'", "'#step'", "'#outs'", "'#locs'", "'T'", "'F'", "'The'", "'execution'", "'lasted'", "'.'", "'second.'"
    };
    public static final int RULE_LOCALS=6;
    public static final int RULE_ID=11;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_OUTPUTS=5;
    public static final int RULE_INT=8;
    public static final int RULE_INPUTS=4;
    public static final int RULE_COMMENT=10;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:81:1: ruleTrace returns [EObject current=null] : ( RULE_INPUTS ( (lv_inputs_1_0= ruledecl ) )* '@#' RULE_OUTPUTS ( (lv_outputs_4_0= ruledecl ) )* '@#' RULE_LOCALS ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ( ruleStatus )? ) ;
    public final EObject ruleTrace() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_local_7_0 = null;

        EObject lv_tick_9_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:86:6: ( ( RULE_INPUTS ( (lv_inputs_1_0= ruledecl ) )* '@#' RULE_OUTPUTS ( (lv_outputs_4_0= ruledecl ) )* '@#' RULE_LOCALS ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ( ruleStatus )? ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:1: ( RULE_INPUTS ( (lv_inputs_1_0= ruledecl ) )* '@#' RULE_OUTPUTS ( (lv_outputs_4_0= ruledecl ) )* '@#' RULE_LOCALS ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ( ruleStatus )? )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:1: ( RULE_INPUTS ( (lv_inputs_1_0= ruledecl ) )* '@#' RULE_OUTPUTS ( (lv_outputs_4_0= ruledecl ) )* '@#' RULE_LOCALS ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ( ruleStatus )? )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:87:2: RULE_INPUTS ( (lv_inputs_1_0= ruledecl ) )* '@#' RULE_OUTPUTS ( (lv_outputs_4_0= ruledecl ) )* '@#' RULE_LOCALS ( (lv_local_7_0= ruledecl ) )* '@#' ( (lv_tick_9_0= ruleTick ) )+ ( ruleStatus )?
            {
            match(input,RULE_INPUTS,FOLLOW_RULE_INPUTS_in_ruleTrace119); 
             
                createLeafNode(grammarAccess.getTraceAccess().getINPUTSTerminalRuleCall_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:91:1: ( (lv_inputs_1_0= ruledecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
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
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace139);
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

            match(input,15,FOLLOW_15_in_ruleTrace150); 

                    createLeafNode(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2(), null); 
                
            match(input,RULE_OUTPUTS,FOLLOW_RULE_OUTPUTS_in_ruleTrace159); 
             
                createLeafNode(grammarAccess.getTraceAccess().getOUTPUTSTerminalRuleCall_3(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:123:1: ( (lv_outputs_4_0= ruledecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
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
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace179);
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

            match(input,15,FOLLOW_15_in_ruleTrace190); 

                    createLeafNode(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5(), null); 
                
            match(input,RULE_LOCALS,FOLLOW_RULE_LOCALS_in_ruleTrace199); 
             
                createLeafNode(grammarAccess.getTraceAccess().getLOCALSTerminalRuleCall_6(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:155:1: ( (lv_local_7_0= ruledecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
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
            	    	    
            	    pushFollow(FOLLOW_ruledecl_in_ruleTrace219);
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

            match(input,15,FOLLOW_15_in_ruleTrace230); 

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
            	    	    
            	    pushFollow(FOLLOW_ruleTick_in_ruleTrace251);
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

            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:207:3: ( ruleStatus )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:207:4: ruleStatus
                    {
                    pushFollow(FOLLOW_ruleStatus_in_ruleTrace262);
                    ruleStatus();
                    _fsp--;


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
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl292);
            iv_ruledecl=ruledecl();
            _fsp--;

             current =iv_ruledecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl302); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:224:1: ruledecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruledecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:229:6: ( ( ( (lv_name_0_0= RULE_STRING ) ) ':' ( (lv_type_2_0= ruleType ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:1: ( ( (lv_name_0_0= RULE_STRING ) ) ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:1: ( ( (lv_name_0_0= RULE_STRING ) ) ':' ( (lv_type_2_0= ruleType ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:2: ( (lv_name_0_0= RULE_STRING ) ) ':' ( (lv_type_2_0= ruleType ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:230:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:231:1: (lv_name_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:231:1: (lv_name_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:232:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruledecl344); 

            			createLeafNode(grammarAccess.getDeclAccess().getNameSTRINGTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruledecl359); 

                    createLeafNode(grammarAccess.getDeclAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:258:1: ( (lv_type_2_0= ruleType ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:259:1: (lv_type_2_0= ruleType )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:259:1: (lv_type_2_0= ruleType )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:260:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruledecl380);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:290:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:291:2: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:292:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType417);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType428); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:299:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'int' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:304:6: ( (kw= 'bool' | kw= 'int' ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:305:1: (kw= 'bool' | kw= 'int' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:305:1: (kw= 'bool' | kw= 'int' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("305:1: (kw= 'bool' | kw= 'int' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:306:2: kw= 'bool'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleType466); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getTypeAccess().getBoolKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:313:2: kw= 'int'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleType485); 

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:326:1: entryRuleTick returns [EObject current=null] : iv_ruleTick= ruleTick EOF ;
    public final EObject entryRuleTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTick = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:327:2: (iv_ruleTick= ruleTick EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:328:2: iv_ruleTick= ruleTick EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTickRule(), currentNode); 
            pushFollow(FOLLOW_ruleTick_in_entryRuleTick525);
            iv_ruleTick=ruleTick();
            _fsp--;

             current =iv_ruleTick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTick535); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:335:1: ruleTick returns [EObject current=null] : ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* ) ;
    public final EObject ruleTick() throws RecognitionException {
        EObject current = null;

        Token lv_nr_2_0=null;
        EObject lv_input_3_0 = null;

        EObject lv_output_5_0 = null;

        EObject lv_local_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:340:6: ( ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:341:1: ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:341:1: ( () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )* )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:341:2: () '#step' ( (lv_nr_2_0= RULE_INT ) ) ( (lv_input_3_0= ruleData ) )* '#outs' ( (lv_output_5_0= ruleData ) )* '#locs' ( (lv_local_7_0= ruleData ) )*
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:341:2: ()
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:342:5: 
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

            match(input,19,FOLLOW_19_in_ruleTick579); 

                    createLeafNode(grammarAccess.getTickAccess().getStepKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:356:1: ( (lv_nr_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:357:1: (lv_nr_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:357:1: (lv_nr_2_0= RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:358:3: lv_nr_2_0= RULE_INT
            {
            lv_nr_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTick596); 

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

            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:380:2: ( (lv_input_3_0= ruleData ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||(LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:381:1: (lv_input_3_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:381:1: (lv_input_3_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:382:3: lv_input_3_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick622);
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
            	    break loop7;
                }
            } while (true);

            match(input,20,FOLLOW_20_in_ruleTick633); 

                    createLeafNode(grammarAccess.getTickAccess().getOutsKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:408:1: ( (lv_output_5_0= ruleData ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:409:1: (lv_output_5_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:409:1: (lv_output_5_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:410:3: lv_output_5_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick654);
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
            	    break loop8;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleTick665); 

                    createLeafNode(grammarAccess.getTickAccess().getLocsKeyword_6(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:436:1: ( (lv_local_7_0= ruleData ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=22 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:437:1: (lv_local_7_0= ruleData )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:437:1: (lv_local_7_0= ruleData )
            	    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:438:3: lv_local_7_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleTick686);
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
            	    break loop9;
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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:468:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:469:2: (iv_ruleData= ruleData EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:470:2: iv_ruleData= ruleData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData723);
            iv_ruleData=ruleData();
            _fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData733); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:477:1: ruleData returns [EObject current=null] : ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_intVal_0_0=null;
        Token lv_true_1_0=null;
        Token lv_false_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:482:6: ( ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:483:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:483:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("483:1: ( ( (lv_intVal_0_0= RULE_INT ) ) | ( (lv_true_1_0= 'T' ) ) | ( (lv_false_2_0= 'F' ) ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:483:2: ( (lv_intVal_0_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:483:2: ( (lv_intVal_0_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:484:1: (lv_intVal_0_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:484:1: (lv_intVal_0_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:485:3: lv_intVal_0_0= RULE_INT
                    {
                    lv_intVal_0_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleData775); 

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
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:508:6: ( (lv_true_1_0= 'T' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:508:6: ( (lv_true_1_0= 'T' ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:509:1: (lv_true_1_0= 'T' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:509:1: (lv_true_1_0= 'T' )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:510:3: lv_true_1_0= 'T'
                    {
                    lv_true_1_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleData804); 

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
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:530:6: ( (lv_false_2_0= 'F' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:530:6: ( (lv_false_2_0= 'F' ) )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:531:1: (lv_false_2_0= 'F' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:531:1: (lv_false_2_0= 'F' )
                    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:532:3: lv_false_2_0= 'F'
                    {
                    lv_false_2_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleData841); 

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


    // $ANTLR start entryRuleStatus
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:559:1: entryRuleStatus returns [String current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final String entryRuleStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatus = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:560:2: (iv_ruleStatus= ruleStatus EOF )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:561:2: iv_ruleStatus= ruleStatus EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatusRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus891);
            iv_ruleStatus=ruleStatus();
            _fsp--;

             current =iv_ruleStatus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatus


    // $ANTLR start ruleStatus
    // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:568:1: ruleStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'The' kw= 'execution' kw= 'lasted' this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT kw= 'second.' ) ;
    public final AntlrDatatypeRuleToken ruleStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;
        Token this_INT_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:573:6: ( (kw= 'The' kw= 'execution' kw= 'lasted' this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT kw= 'second.' ) )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:574:1: (kw= 'The' kw= 'execution' kw= 'lasted' this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT kw= 'second.' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:574:1: (kw= 'The' kw= 'execution' kw= 'lasted' this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT kw= 'second.' )
            // ../de.cau.cs.kieler.krep.editors.rif/src-gen/de/cau/cs/kieler/krep/editors/rif/parser/antlr/internal/InternalRif.g:575:2: kw= 'The' kw= 'execution' kw= 'lasted' this_INT_3= RULE_INT kw= '.' this_INT_5= RULE_INT kw= 'second.'
            {
            kw=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleStatus940); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getStatusAccess().getTheKeyword_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_ruleStatus953); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getStatusAccess().getExecutionKeyword_1(), null); 
                
            kw=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleStatus966); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getStatusAccess().getLastedKeyword_2(), null); 
                
            this_INT_3=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStatus981); 

            		current.merge(this_INT_3);
                
             
                createLeafNode(grammarAccess.getStatusAccess().getINTTerminalRuleCall_3(), null); 
                
            kw=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleStatus999); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getStatusAccess().getFullStopKeyword_4(), null); 
                
            this_INT_5=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStatus1014); 

            		current.merge(this_INT_5);
                
             
                createLeafNode(grammarAccess.getStatusAccess().getINTTerminalRuleCall_5(), null); 
                
            kw=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleStatus1032); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getStatusAccess().getSecondKeyword_6(), null); 
                

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
    // $ANTLR end ruleStatus


 

    public static final BitSet FOLLOW_ruleTrace_in_entryRuleTrace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUTS_in_ruleTrace119 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace139 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_ruleTrace150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_OUTPUTS_in_ruleTrace159 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace179 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_ruleTrace190 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LOCALS_in_ruleTrace199 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_ruledecl_in_ruleTrace219 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_ruleTrace230 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTick_in_ruleTrace251 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_ruleStatus_in_ruleTrace262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruledecl344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruledecl359 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleType_in_ruledecl380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_entryRuleTick525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTick535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTick579 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTick596 = new BitSet(new long[]{0x0000000000D00100L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick622 = new BitSet(new long[]{0x0000000000D00100L});
    public static final BitSet FOLLOW_20_in_ruleTick633 = new BitSet(new long[]{0x0000000000E00100L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick654 = new BitSet(new long[]{0x0000000000E00100L});
    public static final BitSet FOLLOW_21_in_ruleTick665 = new BitSet(new long[]{0x0000000000C00102L});
    public static final BitSet FOLLOW_ruleData_in_ruleTick686 = new BitSet(new long[]{0x0000000000C00102L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleData775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleData804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleData841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStatus940 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatus953 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleStatus966 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStatus981 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatus999 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStatus1014 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleStatus1032 = new BitSet(new long[]{0x0000000000000002L});

}