package de.cau.cs.kieler.krep.editors.klp.parser.antlr.internal; 

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
import de.cau.cs.kieler.krep.editors.klp.services.KlpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalKlpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DIGIT", "RULE_LETTER", "RULE_WS", "RULE_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "':'", "'SETCLK'", "'SETPC'", "'PRIO'", "'DONE'", "'JMP'", "'pre'", "'('", "')'", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'ADD'", "'IADD'", "'SUB'", "'MUL'", "'DIV'", "'AND'", "'OR'", "'XOR'", "'LT'", "'LE'", "'EQ'", "'GE'", "'GT'", "'NEQ'", "'ISUB'", "'IMUL'", "'IDIV'", "'IAND'", "'IOR'", "'IXOR'", "'ILT'", "'ILE'", "'IEQ'", "'IGE'", "'IGT'", "'INEQ'", "'JT'", "'JF'", "'JZ'", "'JNZ'", "'CVMOV'", "'VCMOV'", "'VVMOV'", "'CCMOV'", "'IVMOV'", "'ICMOV'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=5;
    public static final int RULE_COMMENT=9;
    public static final int RULE_WS=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_DIGIT=6;
    public static final int RULE_LETTER=7;
    public static final int RULE_ML_COMMENT=11;

        public InternalKlpParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g"; }


     
     	private KlpGrammarAccess grammarAccess;
     	
        public InternalKlpParser(TokenStream input, IAstFactory factory, KlpGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "KLP";	
       	} 



    // $ANTLR start entryRuleKLP
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:73:1: entryRuleKLP returns [EObject current=null] : iv_ruleKLP= ruleKLP EOF ;
    public final EObject entryRuleKLP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKLP = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:73:45: (iv_ruleKLP= ruleKLP EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:74:2: iv_ruleKLP= ruleKLP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKLPRule(), currentNode); 
            pushFollow(FOLLOW_ruleKLP_in_entryRuleKLP73);
            iv_ruleKLP=ruleKLP();
            _fsp--;

             current =iv_ruleKLP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKLP83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKLP


    // $ANTLR start ruleKLP
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:81:1: ruleKLP returns [EObject current=null] : ( (lv_instructions_0_0= ruleLine ) )* ;
    public final EObject ruleKLP() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:86:6: ( ( (lv_instructions_0_0= ruleLine ) )* )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:87:1: ( (lv_instructions_0_0= ruleLine ) )*
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:87:1: ( (lv_instructions_0_0= ruleLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=15 && LA1_0<=19)||(LA1_0>=23 && LA1_0<=61)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:88:1: (lv_instructions_0_0= ruleLine )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:88:1: (lv_instructions_0_0= ruleLine )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:89:3: lv_instructions_0_0= ruleLine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleKLP128);
            	    lv_instructions_0_0=ruleLine();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKLPRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"instructions",
            	    	        		lv_instructions_0_0, 
            	    	        		"Line", 
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
    // $ANTLR end ruleKLP


    // $ANTLR start entryRuleLine
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:118:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:118:46: (iv_ruleLine= ruleLine EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:119:2: iv_ruleLine= ruleLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine161);
            iv_ruleLine=ruleLine();
            _fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLine


    // $ANTLR start ruleLine
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:126:1: ruleLine returns [EObject current=null] : ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_labels_0_0=null;
        EObject lv_instruction_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:131:6: ( ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:1: ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:1: ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:2: ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:2: ( ( (lv_labels_0_0= RULE_ID ) ) ':' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:3: ( (lv_labels_0_0= RULE_ID ) ) ':'
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:132:3: ( (lv_labels_0_0= RULE_ID ) )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:133:1: (lv_labels_0_0= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:133:1: (lv_labels_0_0= RULE_ID )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:134:3: lv_labels_0_0= RULE_ID
            	    {
            	    lv_labels_0_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLine214); 

            	    			createLeafNode(grammarAccess.getLineAccess().getLabelsIDTerminalRuleCall_0_0_0(), "labels"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"labels",
            	    	        		lv_labels_0_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    match(input,14,FOLLOW_14_in_ruleLine228); 

            	            createLeafNode(grammarAccess.getLineAccess().getColonKeyword_0_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:160:3: ( (lv_instruction_2_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:161:1: (lv_instruction_2_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:161:1: (lv_instruction_2_0= ruleInstruction )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:162:3: lv_instruction_2_0= ruleInstruction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleLine251);
            lv_instruction_2_0=ruleInstruction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLineRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"instruction",
            	        		lv_instruction_2_0, 
            	        		"Instruction", 
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
    // $ANTLR end ruleLine


    // $ANTLR start entryRuleInstruction
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:191:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:191:53: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:192:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction284);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction294); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:199:1: ruleInstruction returns [EObject current=null] : (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Decl_0 = null;

        EObject this_SetClk_1 = null;

        EObject this_SetPC_2 = null;

        EObject this_Prio_3 = null;

        EObject this_Done_4 = null;

        EObject this_Binop_5 = null;

        EObject this_Jmp_6 = null;

        EObject this_CJmp_7 = null;

        EObject this_Move_8 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:204:6: ( (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:205:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:205:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt3=8;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("205:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:206:5: this_Decl_0= ruleDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecl_in_ruleInstruction341);
                    this_Decl_0=ruleDecl();
                    _fsp--;

                     
                            current = this_Decl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:216:5: this_SetClk_1= ruleSetClk
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetClkParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetClk_in_ruleInstruction368);
                    this_SetClk_1=ruleSetClk();
                    _fsp--;

                     
                            current = this_SetClk_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:226:5: this_SetPC_2= ruleSetPC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetPCParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetPC_in_ruleInstruction395);
                    this_SetPC_2=ruleSetPC();
                    _fsp--;

                     
                            current = this_SetPC_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:236:5: this_Prio_3= rulePrio
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPrioParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrio_in_ruleInstruction422);
                    this_Prio_3=rulePrio();
                    _fsp--;

                     
                            current = this_Prio_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:246:5: this_Done_4= ruleDone
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDoneParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDone_in_ruleInstruction449);
                    this_Done_4=ruleDone();
                    _fsp--;

                     
                            current = this_Done_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:256:5: this_Binop_5= ruleBinop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getBinopParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinop_in_ruleInstruction476);
                    this_Binop_5=ruleBinop();
                    _fsp--;

                     
                            current = this_Binop_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:266:5: this_Jmp_6= ruleJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getJmpParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleJmp_in_ruleInstruction503);
                    this_Jmp_6=ruleJmp();
                    _fsp--;

                     
                            current = this_Jmp_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:276:5: this_CJmp_7= ruleCJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getCJmpParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCJmp_in_ruleInstruction530);
                    this_CJmp_7=ruleCJmp();
                    _fsp--;

                     
                            current = this_CJmp_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:286:5: this_Move_8= ruleMove
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getMoveParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMove_in_ruleInstruction557);
                    this_Move_8=ruleMove();
                    _fsp--;

                     
                            current = this_Move_8; 
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


    // $ANTLR start entryRuleDecl
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:301:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:301:46: (iv_ruleDecl= ruleDecl EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:302:2: iv_ruleDecl= ruleDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl589);
            iv_ruleDecl=ruleDecl();
            _fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl599); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDecl


    // $ANTLR start ruleDecl
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:309:1: ruleDecl returns [EObject current=null] : ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_reg_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:314:6: ( ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:315:1: ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:315:1: ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:315:2: ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:315:2: ( (lv_scope_0_0= ruleScope ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:316:1: (lv_scope_0_0= ruleScope )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:316:1: (lv_scope_0_0= ruleScope )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:317:3: lv_scope_0_0= ruleScope
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScope_in_ruleDecl645);
            lv_scope_0_0=ruleScope();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"scope",
            	        		lv_scope_0_0, 
            	        		"Scope", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:339:2: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:340:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:340:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:341:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleDecl666);
            lv_reg_1_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reg",
            	        		lv_reg_1_0, 
            	        		"Reg", 
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
    // $ANTLR end ruleDecl


    // $ANTLR start entryRuleSetClk
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:370:1: entryRuleSetClk returns [EObject current=null] : iv_ruleSetClk= ruleSetClk EOF ;
    public final EObject entryRuleSetClk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClk = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:370:48: (iv_ruleSetClk= ruleSetClk EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:371:2: iv_ruleSetClk= ruleSetClk EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetClkRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetClk_in_entryRuleSetClk699);
            iv_ruleSetClk=ruleSetClk();
            _fsp--;

             current =iv_ruleSetClk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClk709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetClk


    // $ANTLR start ruleSetClk
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:378:1: ruleSetClk returns [EObject current=null] : ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) ) ;
    public final EObject ruleSetClk() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1_0 = null;

        EObject lv_clk_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:383:6: ( ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:384:1: ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:384:1: ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:384:2: 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) )
            {
            match(input,15,FOLLOW_15_in_ruleSetClk743); 

                    createLeafNode(grammarAccess.getSetClkAccess().getSETCLKKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:388:1: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:389:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:389:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:390:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk764);
            lv_reg_1_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetClkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reg",
            	        		lv_reg_1_0, 
            	        		"Reg", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:412:2: ( (lv_clk_2_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:413:1: (lv_clk_2_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:413:1: (lv_clk_2_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:414:3: lv_clk_2_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk785);
            lv_clk_2_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetClkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"clk",
            	        		lv_clk_2_0, 
            	        		"Reg", 
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
    // $ANTLR end ruleSetClk


    // $ANTLR start entryRuleSetPC
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:443:1: entryRuleSetPC returns [EObject current=null] : iv_ruleSetPC= ruleSetPC EOF ;
    public final EObject entryRuleSetPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPC = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:443:47: (iv_ruleSetPC= ruleSetPC EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:444:2: iv_ruleSetPC= ruleSetPC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetPCRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetPC_in_entryRuleSetPC818);
            iv_ruleSetPC=ruleSetPC();
            _fsp--;

             current =iv_ruleSetPC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPC828); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSetPC


    // $ANTLR start ruleSetPC
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:451:1: ruleSetPC returns [EObject current=null] : ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) ) ;
    public final EObject ruleSetPC() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:456:6: ( ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:457:1: ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:457:1: ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:457:2: 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) )
            {
            match(input,16,FOLLOW_16_in_ruleSetPC862); 

                    createLeafNode(grammarAccess.getSetPCAccess().getSETPCKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:461:1: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:462:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:462:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:463:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetPC883);
            lv_reg_1_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reg",
            	        		lv_reg_1_0, 
            	        		"Reg", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:485:2: ( (lv_label_2_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:486:1: (lv_label_2_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:486:1: (lv_label_2_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:487:3: lv_label_2_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleSetPC904);
            lv_label_2_0=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_2_0, 
            	        		"Label", 
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
    // $ANTLR end ruleSetPC


    // $ANTLR start entryRulePrio
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:516:1: entryRulePrio returns [EObject current=null] : iv_rulePrio= rulePrio EOF ;
    public final EObject entryRulePrio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrio = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:516:46: (iv_rulePrio= rulePrio EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:517:2: iv_rulePrio= rulePrio EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrioRule(), currentNode); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio937);
            iv_rulePrio=rulePrio();
            _fsp--;

             current =iv_rulePrio; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio947); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:524:1: rulePrio returns [EObject current=null] : ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) ) ;
    public final EObject rulePrio() throws RecognitionException {
        EObject current = null;

        Token lv_prio_2_0=null;
        EObject lv_reg_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:529:6: ( ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:530:1: ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:530:1: ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:530:2: 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) )
            {
            match(input,17,FOLLOW_17_in_rulePrio981); 

                    createLeafNode(grammarAccess.getPrioAccess().getPRIOKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:534:1: ( (lv_reg_1_0= ruleReg ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:535:1: (lv_reg_1_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:535:1: (lv_reg_1_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:536:3: lv_reg_1_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_rulePrio1002);
                    lv_reg_1_0=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"reg",
                    	        		lv_reg_1_0, 
                    	        		"Reg", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:558:3: ( (lv_prio_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:559:1: (lv_prio_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:559:1: (lv_prio_2_0= RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:560:3: lv_prio_2_0= RULE_INT
            {
            lv_prio_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrio1020); 

            			createLeafNode(grammarAccess.getPrioAccess().getPrioINTTerminalRuleCall_2_0(), "prio"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"prio",
            	        		lv_prio_2_0, 
            	        		"INT", 
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
    // $ANTLR end rulePrio


    // $ANTLR start entryRuleDone
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:589:1: entryRuleDone returns [EObject current=null] : iv_ruleDone= ruleDone EOF ;
    public final EObject entryRuleDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDone = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:589:46: (iv_ruleDone= ruleDone EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:590:2: iv_ruleDone= ruleDone EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoneRule(), currentNode); 
            pushFollow(FOLLOW_ruleDone_in_entryRuleDone1058);
            iv_ruleDone=ruleDone();
            _fsp--;

             current =iv_ruleDone; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDone1068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDone


    // $ANTLR start ruleDone
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:597:1: ruleDone returns [EObject current=null] : ( 'DONE' ( (lv_pc_1_0= ruleLabel ) )? ) ;
    public final EObject ruleDone() throws RecognitionException {
        EObject current = null;

        EObject lv_pc_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:602:6: ( ( 'DONE' ( (lv_pc_1_0= ruleLabel ) )? ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:603:1: ( 'DONE' ( (lv_pc_1_0= ruleLabel ) )? )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:603:1: ( 'DONE' ( (lv_pc_1_0= ruleLabel ) )? )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:603:2: 'DONE' ( (lv_pc_1_0= ruleLabel ) )?
            {
            match(input,18,FOLLOW_18_in_ruleDone1102); 

                    createLeafNode(grammarAccess.getDoneAccess().getDONEKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:607:1: ( (lv_pc_1_0= ruleLabel ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=15 && LA5_1<=19)||(LA5_1>=23 && LA5_1<=61)) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:608:1: (lv_pc_1_0= ruleLabel )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:608:1: (lv_pc_1_0= ruleLabel )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:609:3: lv_pc_1_0= ruleLabel
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleDone1123);
                    lv_pc_1_0=ruleLabel();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoneRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"pc",
                    	        		lv_pc_1_0, 
                    	        		"Label", 
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
    // $ANTLR end ruleDone


    // $ANTLR start entryRuleBinop
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:638:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:638:47: (iv_ruleBinop= ruleBinop EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:639:2: iv_ruleBinop= ruleBinop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinopRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinop_in_entryRuleBinop1157);
            iv_ruleBinop=ruleBinop();
            _fsp--;

             current =iv_ruleBinop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinop1167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinop


    // $ANTLR start ruleBinop
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:646:1: ruleBinop returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token lv_val_4_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_to_1_0 = null;

        EObject lv_arg1_2_0 = null;

        EObject lv_arg2_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:651:6: ( ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:652:1: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:652:1: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:652:2: ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:652:2: ( (lv_op_0_0= ruleOperator ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:653:1: (lv_op_0_0= ruleOperator )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:653:1: (lv_op_0_0= ruleOperator )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:654:3: lv_op_0_0= ruleOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBinop1213);
            lv_op_0_0=ruleOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"op",
            	        		lv_op_0_0, 
            	        		"Operator", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:676:2: ( (lv_to_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:677:1: (lv_to_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:677:1: (lv_to_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:678:3: lv_to_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleBinop1234);
            lv_to_1_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"to",
            	        		lv_to_1_0, 
            	        		"Reg", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:700:2: ( (lv_arg1_2_0= ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:701:1: (lv_arg1_2_0= ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:701:1: (lv_arg1_2_0= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:702:3: lv_arg1_2_0= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleBinop1255);
            lv_arg1_2_0=ruleRead();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"arg1",
            	        		lv_arg1_2_0, 
            	        		"Read", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:724:2: ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("724:2: ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:724:3: ( (lv_arg2_3_0= ruleRead ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:724:3: ( (lv_arg2_3_0= ruleRead ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:725:1: (lv_arg2_3_0= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:725:1: (lv_arg2_3_0= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:726:3: lv_arg2_3_0= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleBinop1277);
                    lv_arg2_3_0=ruleRead();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"arg2",
                    	        		lv_arg2_3_0, 
                    	        		"Read", 
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
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:749:6: ( (lv_val_4_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:749:6: ( (lv_val_4_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:750:1: (lv_val_4_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:750:1: (lv_val_4_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:751:3: lv_val_4_0= RULE_INT
                    {
                    lv_val_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBinop1300); 

                    			createLeafNode(grammarAccess.getBinopAccess().getValINTTerminalRuleCall_3_1_0(), "val"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"val",
                    	        		lv_val_4_0, 
                    	        		"INT", 
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
    // $ANTLR end ruleBinop


    // $ANTLR start entryRuleJmp
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:780:1: entryRuleJmp returns [EObject current=null] : iv_ruleJmp= ruleJmp EOF ;
    public final EObject entryRuleJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:780:45: (iv_ruleJmp= ruleJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:781:2: iv_ruleJmp= ruleJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleJmp_in_entryRuleJmp1339);
            iv_ruleJmp=ruleJmp();
            _fsp--;

             current =iv_ruleJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJmp1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleJmp


    // $ANTLR start ruleJmp
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:788:1: ruleJmp returns [EObject current=null] : ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) ) ;
    public final EObject ruleJmp() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:793:6: ( ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:794:1: ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:794:1: ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:794:2: 'JMP' ( (lv_label_1_0= ruleLabel ) )
            {
            match(input,19,FOLLOW_19_in_ruleJmp1383); 

                    createLeafNode(grammarAccess.getJmpAccess().getJMPKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:798:1: ( (lv_label_1_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:799:1: (lv_label_1_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:799:1: (lv_label_1_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:800:3: lv_label_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleJmp1404);
            lv_label_1_0=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_1_0, 
            	        		"Label", 
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
    // $ANTLR end ruleJmp


    // $ANTLR start entryRuleCJmp
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:829:1: entryRuleCJmp returns [EObject current=null] : iv_ruleCJmp= ruleCJmp EOF ;
    public final EObject entryRuleCJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:829:46: (iv_ruleCJmp= ruleCJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:830:2: iv_ruleCJmp= ruleCJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleCJmp_in_entryRuleCJmp1437);
            iv_ruleCJmp=ruleCJmp();
            _fsp--;

             current =iv_ruleCJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCJmp1447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCJmp


    // $ANTLR start ruleCJmp
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:837:1: ruleCJmp returns [EObject current=null] : ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) ) ;
    public final EObject ruleCJmp() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cond_0_0 = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:842:6: ( ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:843:1: ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:843:1: ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:843:2: ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:843:2: ( (lv_cond_0_0= ruleJumpKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:844:1: (lv_cond_0_0= ruleJumpKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:844:1: (lv_cond_0_0= ruleJumpKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:845:3: lv_cond_0_0= ruleJumpKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJumpKind_in_ruleCJmp1493);
            lv_cond_0_0=ruleJumpKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"cond",
            	        		lv_cond_0_0, 
            	        		"JumpKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:867:2: ( (lv_reg_1_0= ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:868:1: (lv_reg_1_0= ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:868:1: (lv_reg_1_0= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:3: lv_reg_1_0= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleCJmp1514);
            lv_reg_1_0=ruleRead();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"reg",
            	        		lv_reg_1_0, 
            	        		"Read", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:891:2: ( (lv_label_2_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:892:1: (lv_label_2_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:892:1: (lv_label_2_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:893:3: lv_label_2_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleCJmp1535);
            lv_label_2_0=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"label",
            	        		lv_label_2_0, 
            	        		"Label", 
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
    // $ANTLR end ruleCJmp


    // $ANTLR start entryRuleMove
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:922:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:922:46: (iv_ruleMove= ruleMove EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:923:2: iv_ruleMove= ruleMove EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMoveRule(), currentNode); 
            pushFollow(FOLLOW_ruleMove_in_entryRuleMove1568);
            iv_ruleMove=ruleMove();
            _fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMove1578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMove


    // $ANTLR start ruleMove
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:930:1: ruleMove returns [EObject current=null] : ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_val_3_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_to_1_0 = null;

        EObject lv_from_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:935:6: ( ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:936:1: ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:936:1: ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:936:2: ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:936:2: ( (lv_type_0_0= ruleMoveKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:937:1: (lv_type_0_0= ruleMoveKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:937:1: (lv_type_0_0= ruleMoveKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:938:3: lv_type_0_0= ruleMoveKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMoveKind_in_ruleMove1624);
            lv_type_0_0=ruleMoveKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"MoveKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:960:2: ( (lv_to_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:961:1: (lv_to_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:961:1: (lv_to_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:962:3: lv_to_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleMove1645);
            lv_to_1_0=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"to",
            	        		lv_to_1_0, 
            	        		"Reg", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:984:2: ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("984:2: ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:984:3: ( (lv_from_2_0= ruleRead ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:984:3: ( (lv_from_2_0= ruleRead ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:985:1: (lv_from_2_0= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:985:1: (lv_from_2_0= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:986:3: lv_from_2_0= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleMove1667);
                    lv_from_2_0=ruleRead();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"from",
                    	        		lv_from_2_0, 
                    	        		"Read", 
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
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1009:6: ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1009:6: ( (lv_val_3_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1010:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1010:1: (lv_val_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1011:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMove1690); 

                    			createLeafNode(grammarAccess.getMoveAccess().getValINTTerminalRuleCall_2_1_0(), "val"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"val",
                    	        		lv_val_3_0, 
                    	        		"INT", 
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
    // $ANTLR end ruleMove


    // $ANTLR start entryRuleLabel
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1040:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1040:47: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1041:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1729);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1048:1: ruleLabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1053:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1054:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1054:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1055:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1055:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1056:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel1780); 

            			createLeafNode(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
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
    // $ANTLR end ruleLabel


    // $ANTLR start entryRuleReg
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1085:1: entryRuleReg returns [EObject current=null] : iv_ruleReg= ruleReg EOF ;
    public final EObject entryRuleReg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReg = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1085:45: (iv_ruleReg= ruleReg EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1086:2: iv_ruleReg= ruleReg EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRegRule(), currentNode); 
            pushFollow(FOLLOW_ruleReg_in_entryRuleReg1817);
            iv_ruleReg=ruleReg();
            _fsp--;

             current =iv_ruleReg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReg1827); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReg


    // $ANTLR start ruleReg
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1093:1: ruleReg returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1098:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1099:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1099:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1100:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1100:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1101:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReg1868); 

            			createLeafNode(grammarAccess.getRegAccess().getNameIDTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRegRule().getType().getClassifier());
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
    // $ANTLR end ruleReg


    // $ANTLR start entryRuleRead
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1130:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1130:46: (iv_ruleRead= ruleRead EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1131:2: iv_ruleRead= ruleRead EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadRule(), currentNode); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead1905);
            iv_ruleRead=ruleRead();
            _fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead1915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRead


    // $ANTLR start ruleRead
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1138:1: ruleRead returns [EObject current=null] : ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_pre_0_0=null;
        EObject lv_reg_2_0 = null;

        EObject lv_reg_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1143:6: ( ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1144:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:2: ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:2: ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:3: ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')'
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1144:3: ( (lv_pre_0_0= 'pre' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1145:1: (lv_pre_0_0= 'pre' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1145:1: (lv_pre_0_0= 'pre' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1146:3: lv_pre_0_0= 'pre'
                    {
                    lv_pre_0_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleRead1958); 

                            createLeafNode(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0(), "pre"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pre", true, "pre", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleRead1980); 

                            createLeafNode(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1169:1: ( (lv_reg_2_0= ruleReg ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1170:1: (lv_reg_2_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1170:1: (lv_reg_2_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1171:3: lv_reg_2_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2001);
                    lv_reg_2_0=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"reg",
                    	        		lv_reg_2_0, 
                    	        		"Reg", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleRead2010); 

                            createLeafNode(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1198:6: ( (lv_reg_4_0= ruleReg ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1198:6: ( (lv_reg_4_0= ruleReg ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1199:1: (lv_reg_4_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1199:1: (lv_reg_4_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1200:3: lv_reg_4_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2038);
                    lv_reg_4_0=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"reg",
                    	        		lv_reg_4_0, 
                    	        		"Reg", 
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
    // $ANTLR end ruleRead


    // $ANTLR start ruleScope
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1229:1: ruleScope returns [Enumerator current=null] : ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) ;
    public final Enumerator ruleScope() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1233:6: ( ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1234:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:2: ( 'INPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:2: ( 'INPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:4: 'INPUT'
                    {
                    match(input,23,FOLLOW_23_in_ruleScope2085); 

                            current = grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:6: ( 'OUTPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:6: ( 'OUTPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:8: 'OUTPUT'
                    {
                    match(input,24,FOLLOW_24_in_ruleScope2100); 

                            current = grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:6: ( 'LOCAL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:6: ( 'LOCAL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:8: 'LOCAL'
                    {
                    match(input,25,FOLLOW_25_in_ruleScope2115); 

                            current = grammarAccess.getScopeAccess().getLocalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getLocalEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleScope


    // $ANTLR start ruleOperator
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1256:1: ruleOperator returns [Enumerator current=null] : ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1260:6: ( ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1261:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1261:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
            int alt10=26;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 29:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            case 31:
                {
                alt10=6;
                }
                break;
            case 32:
                {
                alt10=7;
                }
                break;
            case 33:
                {
                alt10=8;
                }
                break;
            case 34:
                {
                alt10=9;
                }
                break;
            case 35:
                {
                alt10=10;
                }
                break;
            case 36:
                {
                alt10=11;
                }
                break;
            case 37:
                {
                alt10=12;
                }
                break;
            case 38:
                {
                alt10=13;
                }
                break;
            case 39:
                {
                alt10=14;
                }
                break;
            case 40:
                {
                alt10=15;
                }
                break;
            case 41:
                {
                alt10=16;
                }
                break;
            case 42:
                {
                alt10=17;
                }
                break;
            case 43:
                {
                alt10=18;
                }
                break;
            case 44:
                {
                alt10=19;
                }
                break;
            case 45:
                {
                alt10=20;
                }
                break;
            case 46:
                {
                alt10=21;
                }
                break;
            case 47:
                {
                alt10=22;
                }
                break;
            case 48:
                {
                alt10=23;
                }
                break;
            case 49:
                {
                alt10=24;
                }
                break;
            case 50:
                {
                alt10=25;
                }
                break;
            case 51:
                {
                alt10=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1261:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1261:2: ( 'ADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1261:2: ( 'ADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1261:4: 'ADD'
                    {
                    match(input,26,FOLLOW_26_in_ruleOperator2158); 

                            current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1267:6: ( 'IADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1267:6: ( 'IADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1267:8: 'IADD'
                    {
                    match(input,27,FOLLOW_27_in_ruleOperator2173); 

                            current = grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1273:6: ( 'SUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1273:6: ( 'SUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1273:8: 'SUB'
                    {
                    match(input,28,FOLLOW_28_in_ruleOperator2188); 

                            current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1279:6: ( 'MUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1279:6: ( 'MUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1279:8: 'MUL'
                    {
                    match(input,29,FOLLOW_29_in_ruleOperator2203); 

                            current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1285:6: ( 'DIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1285:6: ( 'DIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1285:8: 'DIV'
                    {
                    match(input,30,FOLLOW_30_in_ruleOperator2218); 

                            current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1291:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1291:6: ( 'AND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1291:8: 'AND'
                    {
                    match(input,31,FOLLOW_31_in_ruleOperator2233); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1297:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1297:6: ( 'OR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1297:8: 'OR'
                    {
                    match(input,32,FOLLOW_32_in_ruleOperator2248); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1303:6: ( 'XOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1303:6: ( 'XOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1303:8: 'XOR'
                    {
                    match(input,33,FOLLOW_33_in_ruleOperator2263); 

                            current = grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1309:6: ( 'LT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1309:6: ( 'LT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1309:8: 'LT'
                    {
                    match(input,34,FOLLOW_34_in_ruleOperator2278); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1315:6: ( 'LE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1315:6: ( 'LE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1315:8: 'LE'
                    {
                    match(input,35,FOLLOW_35_in_ruleOperator2293); 

                            current = grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1321:6: ( 'EQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1321:6: ( 'EQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1321:8: 'EQ'
                    {
                    match(input,36,FOLLOW_36_in_ruleOperator2308); 

                            current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1327:6: ( 'GE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1327:6: ( 'GE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1327:8: 'GE'
                    {
                    match(input,37,FOLLOW_37_in_ruleOperator2323); 

                            current = grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:6: ( 'GT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:6: ( 'GT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:8: 'GT'
                    {
                    match(input,38,FOLLOW_38_in_ruleOperator2338); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:6: ( 'NEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:6: ( 'NEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:8: 'NEQ'
                    {
                    match(input,39,FOLLOW_39_in_ruleOperator2353); 

                            current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:6: ( 'ISUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:6: ( 'ISUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:8: 'ISUB'
                    {
                    match(input,40,FOLLOW_40_in_ruleOperator2368); 

                            current = grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:6: ( 'IMUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:6: ( 'IMUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:8: 'IMUL'
                    {
                    match(input,41,FOLLOW_41_in_ruleOperator2383); 

                            current = grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1357:6: ( 'IDIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1357:6: ( 'IDIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1357:8: 'IDIV'
                    {
                    match(input,42,FOLLOW_42_in_ruleOperator2398); 

                            current = grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1363:6: ( 'IAND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1363:6: ( 'IAND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1363:8: 'IAND'
                    {
                    match(input,43,FOLLOW_43_in_ruleOperator2413); 

                            current = grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1369:6: ( 'IOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1369:6: ( 'IOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1369:8: 'IOR'
                    {
                    match(input,44,FOLLOW_44_in_ruleOperator2428); 

                            current = grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1375:6: ( 'IXOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1375:6: ( 'IXOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1375:8: 'IXOR'
                    {
                    match(input,45,FOLLOW_45_in_ruleOperator2443); 

                            current = grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19(), null); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1381:6: ( 'ILT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1381:6: ( 'ILT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1381:8: 'ILT'
                    {
                    match(input,46,FOLLOW_46_in_ruleOperator2458); 

                            current = grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20(), null); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1387:6: ( 'ILE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1387:6: ( 'ILE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1387:8: 'ILE'
                    {
                    match(input,47,FOLLOW_47_in_ruleOperator2473); 

                            current = grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21(), null); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1393:6: ( 'IEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1393:6: ( 'IEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1393:8: 'IEQ'
                    {
                    match(input,48,FOLLOW_48_in_ruleOperator2488); 

                            current = grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22(), null); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1399:6: ( 'IGE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1399:6: ( 'IGE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1399:8: 'IGE'
                    {
                    match(input,49,FOLLOW_49_in_ruleOperator2503); 

                            current = grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23(), null); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1405:6: ( 'IGT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1405:6: ( 'IGT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1405:8: 'IGT'
                    {
                    match(input,50,FOLLOW_50_in_ruleOperator2518); 

                            current = grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24(), null); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1411:6: ( 'INEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1411:6: ( 'INEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1411:8: 'INEQ'
                    {
                    match(input,51,FOLLOW_51_in_ruleOperator2533); 

                            current = grammarAccess.getOperatorAccess().getIneqEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIneqEnumLiteralDeclaration_25(), null); 
                        

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
    // $ANTLR end ruleOperator


    // $ANTLR start ruleJumpKind
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1421:1: ruleJumpKind returns [Enumerator current=null] : ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) ;
    public final Enumerator ruleJumpKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1425:6: ( ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1426:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1426:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt11=1;
                }
                break;
            case 53:
                {
                alt11=2;
                }
                break;
            case 54:
                {
                alt11=3;
                }
                break;
            case 55:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1426:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1426:2: ( 'JT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1426:2: ( 'JT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1426:4: 'JT'
                    {
                    match(input,52,FOLLOW_52_in_ruleJumpKind2576); 

                            current = grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1432:6: ( 'JF' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1432:6: ( 'JF' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1432:8: 'JF'
                    {
                    match(input,53,FOLLOW_53_in_ruleJumpKind2591); 

                            current = grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1438:6: ( 'JZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1438:6: ( 'JZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1438:8: 'JZ'
                    {
                    match(input,54,FOLLOW_54_in_ruleJumpKind2606); 

                            current = grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1444:6: ( 'JNZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1444:6: ( 'JNZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1444:8: 'JNZ'
                    {
                    match(input,55,FOLLOW_55_in_ruleJumpKind2621); 

                            current = grammarAccess.getJumpKindAccess().getJnzEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJnzEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleJumpKind


    // $ANTLR start ruleMoveKind
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1454:1: ruleMoveKind returns [Enumerator current=null] : ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) ;
    public final Enumerator ruleMoveKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1458:6: ( ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1459:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1459:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt12=1;
                }
                break;
            case 57:
                {
                alt12=2;
                }
                break;
            case 58:
                {
                alt12=3;
                }
                break;
            case 59:
                {
                alt12=4;
                }
                break;
            case 60:
                {
                alt12=5;
                }
                break;
            case 61:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1459:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1459:2: ( 'CVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1459:2: ( 'CVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1459:4: 'CVMOV'
                    {
                    match(input,56,FOLLOW_56_in_ruleMoveKind2664); 

                            current = grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1465:6: ( 'VCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1465:6: ( 'VCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1465:8: 'VCMOV'
                    {
                    match(input,57,FOLLOW_57_in_ruleMoveKind2679); 

                            current = grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1471:6: ( 'VVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1471:6: ( 'VVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1471:8: 'VVMOV'
                    {
                    match(input,58,FOLLOW_58_in_ruleMoveKind2694); 

                            current = grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1477:6: ( 'CCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1477:6: ( 'CCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1477:8: 'CCMOV'
                    {
                    match(input,59,FOLLOW_59_in_ruleMoveKind2709); 

                            current = grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1483:6: ( 'IVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1483:6: ( 'IVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1483:8: 'IVMOV'
                    {
                    match(input,60,FOLLOW_60_in_ruleMoveKind2724); 

                            current = grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1489:6: ( 'ICMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1489:6: ( 'ICMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1489:8: 'ICMOV'
                    {
                    match(input,61,FOLLOW_61_in_ruleMoveKind2739); 

                            current = grammarAccess.getMoveKindAccess().getIcmovEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getIcmovEnumLiteralDeclaration_5(), null); 
                        

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
    // $ANTLR end ruleMoveKind


 

    public static final BitSet FOLLOW_ruleKLP_in_entryRuleKLP73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKLP83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleKLP128 = new BitSet(new long[]{0x3FFFFFFFFF8F8012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLine214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLine228 = new BitSet(new long[]{0x3FFFFFFFFF8F8010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLine251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleInstruction341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_ruleInstruction368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_ruleInstruction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_ruleInstruction422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_ruleInstruction449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_ruleInstruction476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_ruleInstruction503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_ruleInstruction530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_ruleInstruction557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleDecl645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleDecl666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_entryRuleSetClk699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClk709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSetClk743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_entryRuleSetPC818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPC828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSetPC862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetPC883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSetPC904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrio981 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleReg_in_rulePrio1002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrio1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_entryRuleDone1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDone1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDone1102 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDone1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_entryRuleBinop1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinop1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBinop1213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleBinop1234 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1255 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBinop1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_entryRuleJmp1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJmp1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleJmp1383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleJmp1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_entryRuleCJmp1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCJmp1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpKind_in_ruleCJmp1493 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleCJmp1514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleCJmp1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMove1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoveKind_in_ruleMove1624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleMove1645 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleMove1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMove1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_entryRuleReg1817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReg1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReg1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead1905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRead1958 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRead1980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRead2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleScope2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScope2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleScope2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperator2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperator2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperator2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperator2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperator2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperator2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperator2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOperator2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOperator2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperator2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperator2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperator2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperator2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOperator2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJumpKind2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleJumpKind2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJumpKind2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJumpKind2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMoveKind2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMoveKind2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMoveKind2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMoveKind2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMoveKind2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMoveKind2739 = new BitSet(new long[]{0x0000000000000002L});

}