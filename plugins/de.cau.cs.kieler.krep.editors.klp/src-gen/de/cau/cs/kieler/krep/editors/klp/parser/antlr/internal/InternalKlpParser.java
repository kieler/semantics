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
       	
       	@Override
       	protected KlpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleKLP
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:78:1: entryRuleKLP returns [EObject current=null] : iv_ruleKLP= ruleKLP EOF ;
    public final EObject entryRuleKLP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKLP = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:79:2: (iv_ruleKLP= ruleKLP EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:80:2: iv_ruleKLP= ruleKLP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKLPRule(), currentNode); 
            pushFollow(FOLLOW_ruleKLP_in_entryRuleKLP75);
            iv_ruleKLP=ruleKLP();
            _fsp--;

             current =iv_ruleKLP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKLP85); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:87:1: ruleKLP returns [EObject current=null] : ( (lv_instructions_0_0= ruleLine ) )* ;
    public final EObject ruleKLP() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:92:6: ( ( (lv_instructions_0_0= ruleLine ) )* )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:93:1: ( (lv_instructions_0_0= ruleLine ) )*
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:93:1: ( (lv_instructions_0_0= ruleLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=15 && LA1_0<=19)||(LA1_0>=23 && LA1_0<=61)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:94:1: (lv_instructions_0_0= ruleLine )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:94:1: (lv_instructions_0_0= ruleLine )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:95:3: lv_instructions_0_0= ruleLine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleKLP130);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:125:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:126:2: (iv_ruleLine= ruleLine EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:127:2: iv_ruleLine= ruleLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine166);
            iv_ruleLine=ruleLine();
            _fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine176); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:134:1: ruleLine returns [EObject current=null] : ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_labels_0_0=null;
        EObject lv_instruction_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:139:6: ( ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:1: ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:1: ( ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:2: ( ( (lv_labels_0_0= RULE_ID ) ) ':' )* ( (lv_instruction_2_0= ruleInstruction ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:2: ( ( (lv_labels_0_0= RULE_ID ) ) ':' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:3: ( (lv_labels_0_0= RULE_ID ) ) ':'
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:140:3: ( (lv_labels_0_0= RULE_ID ) )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:141:1: (lv_labels_0_0= RULE_ID )
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:141:1: (lv_labels_0_0= RULE_ID )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:142:3: lv_labels_0_0= RULE_ID
            	    {
            	    lv_labels_0_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLine219); 

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

            	    match(input,14,FOLLOW_14_in_ruleLine234); 

            	            createLeafNode(grammarAccess.getLineAccess().getColonKeyword_0_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:168:3: ( (lv_instruction_2_0= ruleInstruction ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:169:1: (lv_instruction_2_0= ruleInstruction )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:169:1: (lv_instruction_2_0= ruleInstruction )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:170:3: lv_instruction_2_0= ruleInstruction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleLine257);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:200:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:201:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:202:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction293);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction303); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:209:1: ruleInstruction returns [EObject current=null] : (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) ;
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
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:214:6: ( (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:215:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:215:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
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
                    new NoViableAltException("215:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:216:5: this_Decl_0= ruleDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecl_in_ruleInstruction350);
                    this_Decl_0=ruleDecl();
                    _fsp--;

                     
                            current = this_Decl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:226:5: this_SetClk_1= ruleSetClk
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetClkParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetClk_in_ruleInstruction377);
                    this_SetClk_1=ruleSetClk();
                    _fsp--;

                     
                            current = this_SetClk_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:236:5: this_SetPC_2= ruleSetPC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetPCParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetPC_in_ruleInstruction404);
                    this_SetPC_2=ruleSetPC();
                    _fsp--;

                     
                            current = this_SetPC_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:246:5: this_Prio_3= rulePrio
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPrioParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrio_in_ruleInstruction431);
                    this_Prio_3=rulePrio();
                    _fsp--;

                     
                            current = this_Prio_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:256:5: this_Done_4= ruleDone
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDoneParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDone_in_ruleInstruction458);
                    this_Done_4=ruleDone();
                    _fsp--;

                     
                            current = this_Done_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:266:5: this_Binop_5= ruleBinop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getBinopParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinop_in_ruleInstruction485);
                    this_Binop_5=ruleBinop();
                    _fsp--;

                     
                            current = this_Binop_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:276:5: this_Jmp_6= ruleJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getJmpParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleJmp_in_ruleInstruction512);
                    this_Jmp_6=ruleJmp();
                    _fsp--;

                     
                            current = this_Jmp_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:286:5: this_CJmp_7= ruleCJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getCJmpParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCJmp_in_ruleInstruction539);
                    this_CJmp_7=ruleCJmp();
                    _fsp--;

                     
                            current = this_CJmp_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:296:5: this_Move_8= ruleMove
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getMoveParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMove_in_ruleInstruction566);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:312:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:313:2: (iv_ruleDecl= ruleDecl EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:314:2: iv_ruleDecl= ruleDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl601);
            iv_ruleDecl=ruleDecl();
            _fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl611); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:321:1: ruleDecl returns [EObject current=null] : ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0_0 = null;

        EObject lv_reg_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:326:6: ( ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:327:1: ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:327:1: ( ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:327:2: ( (lv_scope_0_0= ruleScope ) ) ( (lv_reg_1_0= ruleReg ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:327:2: ( (lv_scope_0_0= ruleScope ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:328:1: (lv_scope_0_0= ruleScope )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:328:1: (lv_scope_0_0= ruleScope )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:329:3: lv_scope_0_0= ruleScope
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScope_in_ruleDecl657);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:351:2: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:352:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:352:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:353:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleDecl678);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:383:1: entryRuleSetClk returns [EObject current=null] : iv_ruleSetClk= ruleSetClk EOF ;
    public final EObject entryRuleSetClk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClk = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:384:2: (iv_ruleSetClk= ruleSetClk EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:385:2: iv_ruleSetClk= ruleSetClk EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetClkRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetClk_in_entryRuleSetClk714);
            iv_ruleSetClk=ruleSetClk();
            _fsp--;

             current =iv_ruleSetClk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClk724); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:392:1: ruleSetClk returns [EObject current=null] : ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) ) ;
    public final EObject ruleSetClk() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1_0 = null;

        EObject lv_clk_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:397:6: ( ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:398:1: ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:398:1: ( 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:398:3: 'SETCLK' ( (lv_reg_1_0= ruleReg ) ) ( (lv_clk_2_0= ruleReg ) )
            {
            match(input,15,FOLLOW_15_in_ruleSetClk759); 

                    createLeafNode(grammarAccess.getSetClkAccess().getSETCLKKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:402:1: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:403:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:403:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:404:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk780);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:426:2: ( (lv_clk_2_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:427:1: (lv_clk_2_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:427:1: (lv_clk_2_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:428:3: lv_clk_2_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk801);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:458:1: entryRuleSetPC returns [EObject current=null] : iv_ruleSetPC= ruleSetPC EOF ;
    public final EObject entryRuleSetPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPC = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:459:2: (iv_ruleSetPC= ruleSetPC EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:460:2: iv_ruleSetPC= ruleSetPC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetPCRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetPC_in_entryRuleSetPC837);
            iv_ruleSetPC=ruleSetPC();
            _fsp--;

             current =iv_ruleSetPC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPC847); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:467:1: ruleSetPC returns [EObject current=null] : ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) ) ;
    public final EObject ruleSetPC() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:472:6: ( ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:473:1: ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:473:1: ( 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:473:3: 'SETPC' ( (lv_reg_1_0= ruleReg ) ) ( (lv_label_2_0= ruleLabel ) )
            {
            match(input,16,FOLLOW_16_in_ruleSetPC882); 

                    createLeafNode(grammarAccess.getSetPCAccess().getSETPCKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:477:1: ( (lv_reg_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:478:1: (lv_reg_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:478:1: (lv_reg_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:479:3: lv_reg_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetPC903);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:501:2: ( (lv_label_2_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:502:1: (lv_label_2_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:502:1: (lv_label_2_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:503:3: lv_label_2_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleSetPC924);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:533:1: entryRulePrio returns [EObject current=null] : iv_rulePrio= rulePrio EOF ;
    public final EObject entryRulePrio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrio = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:534:2: (iv_rulePrio= rulePrio EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:535:2: iv_rulePrio= rulePrio EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrioRule(), currentNode); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio960);
            iv_rulePrio=rulePrio();
            _fsp--;

             current =iv_rulePrio; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio970); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:542:1: rulePrio returns [EObject current=null] : ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) ) ;
    public final EObject rulePrio() throws RecognitionException {
        EObject current = null;

        Token lv_prio_2_0=null;
        EObject lv_reg_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:547:6: ( ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:548:1: ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:548:1: ( 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:548:3: 'PRIO' ( (lv_reg_1_0= ruleReg ) )? ( (lv_prio_2_0= RULE_INT ) )
            {
            match(input,17,FOLLOW_17_in_rulePrio1005); 

                    createLeafNode(grammarAccess.getPrioAccess().getPRIOKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:552:1: ( (lv_reg_1_0= ruleReg ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:553:1: (lv_reg_1_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:553:1: (lv_reg_1_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:554:3: lv_reg_1_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_rulePrio1026);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:576:3: ( (lv_prio_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:577:1: (lv_prio_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:577:1: (lv_prio_2_0= RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:578:3: lv_prio_2_0= RULE_INT
            {
            lv_prio_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrio1044); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:608:1: entryRuleDone returns [EObject current=null] : iv_ruleDone= ruleDone EOF ;
    public final EObject entryRuleDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDone = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:609:2: (iv_ruleDone= ruleDone EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:610:2: iv_ruleDone= ruleDone EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoneRule(), currentNode); 
            pushFollow(FOLLOW_ruleDone_in_entryRuleDone1085);
            iv_ruleDone=ruleDone();
            _fsp--;

             current =iv_ruleDone; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDone1095); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:617:1: ruleDone returns [EObject current=null] : ( 'DONE' ( (lv_pc_1_0= ruleLabel ) ) ) ;
    public final EObject ruleDone() throws RecognitionException {
        EObject current = null;

        EObject lv_pc_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:622:6: ( ( 'DONE' ( (lv_pc_1_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:623:1: ( 'DONE' ( (lv_pc_1_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:623:1: ( 'DONE' ( (lv_pc_1_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:623:3: 'DONE' ( (lv_pc_1_0= ruleLabel ) )
            {
            match(input,18,FOLLOW_18_in_ruleDone1130); 

                    createLeafNode(grammarAccess.getDoneAccess().getDONEKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:627:1: ( (lv_pc_1_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:628:1: (lv_pc_1_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:628:1: (lv_pc_1_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:629:3: lv_pc_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleDone1151);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:659:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:660:2: (iv_ruleBinop= ruleBinop EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:661:2: iv_ruleBinop= ruleBinop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinopRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinop_in_entryRuleBinop1187);
            iv_ruleBinop=ruleBinop();
            _fsp--;

             current =iv_ruleBinop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinop1197); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:668:1: ruleBinop returns [EObject current=null] : ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token lv_val_4_0=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_to_1_0 = null;

        EObject lv_arg1_2_0 = null;

        EObject lv_arg2_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:673:6: ( ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:674:1: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:674:1: ( ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:674:2: ( (lv_op_0_0= ruleOperator ) ) ( (lv_to_1_0= ruleReg ) ) ( (lv_arg1_2_0= ruleRead ) ) ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:674:2: ( (lv_op_0_0= ruleOperator ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:675:1: (lv_op_0_0= ruleOperator )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:675:1: (lv_op_0_0= ruleOperator )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:676:3: lv_op_0_0= ruleOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBinop1243);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:698:2: ( (lv_to_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:699:1: (lv_to_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:699:1: (lv_to_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:700:3: lv_to_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleBinop1264);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:722:2: ( (lv_arg1_2_0= ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:723:1: (lv_arg1_2_0= ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:723:1: (lv_arg1_2_0= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:724:3: lv_arg1_2_0= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleBinop1285);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:746:2: ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("746:2: ( ( (lv_arg2_3_0= ruleRead ) ) | ( (lv_val_4_0= RULE_INT ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:746:3: ( (lv_arg2_3_0= ruleRead ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:746:3: ( (lv_arg2_3_0= ruleRead ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:747:1: (lv_arg2_3_0= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:747:1: (lv_arg2_3_0= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:748:3: lv_arg2_3_0= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleBinop1307);
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
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:771:6: ( (lv_val_4_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:771:6: ( (lv_val_4_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:772:1: (lv_val_4_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:772:1: (lv_val_4_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:773:3: lv_val_4_0= RULE_INT
                    {
                    lv_val_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBinop1330); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:803:1: entryRuleJmp returns [EObject current=null] : iv_ruleJmp= ruleJmp EOF ;
    public final EObject entryRuleJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:804:2: (iv_ruleJmp= ruleJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:805:2: iv_ruleJmp= ruleJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleJmp_in_entryRuleJmp1372);
            iv_ruleJmp=ruleJmp();
            _fsp--;

             current =iv_ruleJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJmp1382); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:812:1: ruleJmp returns [EObject current=null] : ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) ) ;
    public final EObject ruleJmp() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:817:6: ( ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:818:1: ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:818:1: ( 'JMP' ( (lv_label_1_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:818:3: 'JMP' ( (lv_label_1_0= ruleLabel ) )
            {
            match(input,19,FOLLOW_19_in_ruleJmp1417); 

                    createLeafNode(grammarAccess.getJmpAccess().getJMPKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:822:1: ( (lv_label_1_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:823:1: (lv_label_1_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:823:1: (lv_label_1_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:824:3: lv_label_1_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleJmp1438);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:854:1: entryRuleCJmp returns [EObject current=null] : iv_ruleCJmp= ruleCJmp EOF ;
    public final EObject entryRuleCJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:855:2: (iv_ruleCJmp= ruleCJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:856:2: iv_ruleCJmp= ruleCJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleCJmp_in_entryRuleCJmp1474);
            iv_ruleCJmp=ruleCJmp();
            _fsp--;

             current =iv_ruleCJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCJmp1484); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:863:1: ruleCJmp returns [EObject current=null] : ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) ) ;
    public final EObject ruleCJmp() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cond_0_0 = null;

        EObject lv_reg_1_0 = null;

        EObject lv_label_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:868:6: ( ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:1: ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:1: ( ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:2: ( (lv_cond_0_0= ruleJumpKind ) ) ( (lv_reg_1_0= ruleRead ) ) ( (lv_label_2_0= ruleLabel ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:2: ( (lv_cond_0_0= ruleJumpKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:1: (lv_cond_0_0= ruleJumpKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:1: (lv_cond_0_0= ruleJumpKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:871:3: lv_cond_0_0= ruleJumpKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJumpKind_in_ruleCJmp1530);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:893:2: ( (lv_reg_1_0= ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:894:1: (lv_reg_1_0= ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:894:1: (lv_reg_1_0= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:895:3: lv_reg_1_0= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleCJmp1551);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:917:2: ( (lv_label_2_0= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:918:1: (lv_label_2_0= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:918:1: (lv_label_2_0= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:919:3: lv_label_2_0= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleCJmp1572);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:949:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:950:2: (iv_ruleMove= ruleMove EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:951:2: iv_ruleMove= ruleMove EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMoveRule(), currentNode); 
            pushFollow(FOLLOW_ruleMove_in_entryRuleMove1608);
            iv_ruleMove=ruleMove();
            _fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMove1618); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:958:1: ruleMove returns [EObject current=null] : ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_val_3_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_to_1_0 = null;

        EObject lv_from_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:963:6: ( ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:964:1: ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:964:1: ( ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:964:2: ( (lv_type_0_0= ruleMoveKind ) ) ( (lv_to_1_0= ruleReg ) ) ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:964:2: ( (lv_type_0_0= ruleMoveKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:965:1: (lv_type_0_0= ruleMoveKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:965:1: (lv_type_0_0= ruleMoveKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:966:3: lv_type_0_0= ruleMoveKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMoveKind_in_ruleMove1664);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:988:2: ( (lv_to_1_0= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:989:1: (lv_to_1_0= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:989:1: (lv_to_1_0= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:990:3: lv_to_1_0= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleMove1685);
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

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1012:2: ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )
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
                    new NoViableAltException("1012:2: ( ( (lv_from_2_0= ruleRead ) ) | ( (lv_val_3_0= RULE_INT ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1012:3: ( (lv_from_2_0= ruleRead ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1012:3: ( (lv_from_2_0= ruleRead ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1013:1: (lv_from_2_0= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1013:1: (lv_from_2_0= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1014:3: lv_from_2_0= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleMove1707);
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
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1037:6: ( (lv_val_3_0= RULE_INT ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1037:6: ( (lv_val_3_0= RULE_INT ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1038:1: (lv_val_3_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1038:1: (lv_val_3_0= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1039:3: lv_val_3_0= RULE_INT
                    {
                    lv_val_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMove1730); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1069:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1070:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1071:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1772);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1782); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1078:1: ruleLabel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1083:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1084:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1084:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1085:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1085:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1086:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel1823); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1116:1: entryRuleReg returns [EObject current=null] : iv_ruleReg= ruleReg EOF ;
    public final EObject entryRuleReg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReg = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1117:2: (iv_ruleReg= ruleReg EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1118:2: iv_ruleReg= ruleReg EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRegRule(), currentNode); 
            pushFollow(FOLLOW_ruleReg_in_entryRuleReg1863);
            iv_ruleReg=ruleReg();
            _fsp--;

             current =iv_ruleReg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReg1873); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1125:1: ruleReg returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1130:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1131:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1131:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1132:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1132:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1133:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReg1914); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1163:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1164:2: (iv_ruleRead= ruleRead EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1165:2: iv_ruleRead= ruleRead EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadRule(), currentNode); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead1954);
            iv_ruleRead=ruleRead();
            _fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead1964); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1172:1: ruleRead returns [EObject current=null] : ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_pre_0_0=null;
        EObject lv_reg_2_0 = null;

        EObject lv_reg_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1177:6: ( ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1178:1: ( ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' ) | ( (lv_reg_4_0= ruleReg ) ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:2: ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:2: ( ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:3: ( (lv_pre_0_0= 'pre' ) ) '(' ( (lv_reg_2_0= ruleReg ) ) ')'
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1178:3: ( (lv_pre_0_0= 'pre' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1179:1: (lv_pre_0_0= 'pre' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1179:1: (lv_pre_0_0= 'pre' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1180:3: lv_pre_0_0= 'pre'
                    {
                    lv_pre_0_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleRead2008); 

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

                    match(input,21,FOLLOW_21_in_ruleRead2031); 

                            createLeafNode(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1203:1: ( (lv_reg_2_0= ruleReg ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1204:1: (lv_reg_2_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1204:1: (lv_reg_2_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1205:3: lv_reg_2_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2052);
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

                    match(input,22,FOLLOW_22_in_ruleRead2062); 

                            createLeafNode(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1232:6: ( (lv_reg_4_0= ruleReg ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1232:6: ( (lv_reg_4_0= ruleReg ) )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1233:1: (lv_reg_4_0= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1233:1: (lv_reg_4_0= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:3: lv_reg_4_0= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2090);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1264:1: ruleScope returns [Enumerator current=null] : ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) ;
    public final Enumerator ruleScope() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1268:6: ( ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1269:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1269:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1269:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1269:2: ( 'INPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1269:2: ( 'INPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1269:4: 'INPUT'
                    {
                    match(input,23,FOLLOW_23_in_ruleScope2138); 

                            current = grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1275:6: ( 'OUTPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1275:6: ( 'OUTPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1275:8: 'OUTPUT'
                    {
                    match(input,24,FOLLOW_24_in_ruleScope2153); 

                            current = grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1281:6: ( 'LOCAL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1281:6: ( 'LOCAL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1281:8: 'LOCAL'
                    {
                    match(input,25,FOLLOW_25_in_ruleScope2168); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1291:1: ruleOperator returns [Enumerator current=null] : ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1295:6: ( ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1296:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1296:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
            int alt9=26;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            case 32:
                {
                alt9=7;
                }
                break;
            case 33:
                {
                alt9=8;
                }
                break;
            case 34:
                {
                alt9=9;
                }
                break;
            case 35:
                {
                alt9=10;
                }
                break;
            case 36:
                {
                alt9=11;
                }
                break;
            case 37:
                {
                alt9=12;
                }
                break;
            case 38:
                {
                alt9=13;
                }
                break;
            case 39:
                {
                alt9=14;
                }
                break;
            case 40:
                {
                alt9=15;
                }
                break;
            case 41:
                {
                alt9=16;
                }
                break;
            case 42:
                {
                alt9=17;
                }
                break;
            case 43:
                {
                alt9=18;
                }
                break;
            case 44:
                {
                alt9=19;
                }
                break;
            case 45:
                {
                alt9=20;
                }
                break;
            case 46:
                {
                alt9=21;
                }
                break;
            case 47:
                {
                alt9=22;
                }
                break;
            case 48:
                {
                alt9=23;
                }
                break;
            case 49:
                {
                alt9=24;
                }
                break;
            case 50:
                {
                alt9=25;
                }
                break;
            case 51:
                {
                alt9=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1296:2: ( 'ADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1296:2: ( 'ADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1296:4: 'ADD'
                    {
                    match(input,26,FOLLOW_26_in_ruleOperator2211); 

                            current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1302:6: ( 'IADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1302:6: ( 'IADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1302:8: 'IADD'
                    {
                    match(input,27,FOLLOW_27_in_ruleOperator2226); 

                            current = grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1308:6: ( 'SUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1308:6: ( 'SUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1308:8: 'SUB'
                    {
                    match(input,28,FOLLOW_28_in_ruleOperator2241); 

                            current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1314:6: ( 'MUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1314:6: ( 'MUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1314:8: 'MUL'
                    {
                    match(input,29,FOLLOW_29_in_ruleOperator2256); 

                            current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1320:6: ( 'DIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1320:6: ( 'DIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1320:8: 'DIV'
                    {
                    match(input,30,FOLLOW_30_in_ruleOperator2271); 

                            current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1326:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1326:6: ( 'AND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1326:8: 'AND'
                    {
                    match(input,31,FOLLOW_31_in_ruleOperator2286); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1332:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1332:6: ( 'OR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1332:8: 'OR'
                    {
                    match(input,32,FOLLOW_32_in_ruleOperator2301); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1338:6: ( 'XOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1338:6: ( 'XOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1338:8: 'XOR'
                    {
                    match(input,33,FOLLOW_33_in_ruleOperator2316); 

                            current = grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1344:6: ( 'LT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1344:6: ( 'LT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1344:8: 'LT'
                    {
                    match(input,34,FOLLOW_34_in_ruleOperator2331); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1350:6: ( 'LE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1350:6: ( 'LE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1350:8: 'LE'
                    {
                    match(input,35,FOLLOW_35_in_ruleOperator2346); 

                            current = grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1356:6: ( 'EQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1356:6: ( 'EQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1356:8: 'EQ'
                    {
                    match(input,36,FOLLOW_36_in_ruleOperator2361); 

                            current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1362:6: ( 'GE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1362:6: ( 'GE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1362:8: 'GE'
                    {
                    match(input,37,FOLLOW_37_in_ruleOperator2376); 

                            current = grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1368:6: ( 'GT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1368:6: ( 'GT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1368:8: 'GT'
                    {
                    match(input,38,FOLLOW_38_in_ruleOperator2391); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1374:6: ( 'NEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1374:6: ( 'NEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1374:8: 'NEQ'
                    {
                    match(input,39,FOLLOW_39_in_ruleOperator2406); 

                            current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1380:6: ( 'ISUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1380:6: ( 'ISUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1380:8: 'ISUB'
                    {
                    match(input,40,FOLLOW_40_in_ruleOperator2421); 

                            current = grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1386:6: ( 'IMUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1386:6: ( 'IMUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1386:8: 'IMUL'
                    {
                    match(input,41,FOLLOW_41_in_ruleOperator2436); 

                            current = grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1392:6: ( 'IDIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1392:6: ( 'IDIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1392:8: 'IDIV'
                    {
                    match(input,42,FOLLOW_42_in_ruleOperator2451); 

                            current = grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1398:6: ( 'IAND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1398:6: ( 'IAND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1398:8: 'IAND'
                    {
                    match(input,43,FOLLOW_43_in_ruleOperator2466); 

                            current = grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1404:6: ( 'IOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1404:6: ( 'IOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1404:8: 'IOR'
                    {
                    match(input,44,FOLLOW_44_in_ruleOperator2481); 

                            current = grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1410:6: ( 'IXOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1410:6: ( 'IXOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1410:8: 'IXOR'
                    {
                    match(input,45,FOLLOW_45_in_ruleOperator2496); 

                            current = grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19(), null); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1416:6: ( 'ILT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1416:6: ( 'ILT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1416:8: 'ILT'
                    {
                    match(input,46,FOLLOW_46_in_ruleOperator2511); 

                            current = grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20(), null); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1422:6: ( 'ILE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1422:6: ( 'ILE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1422:8: 'ILE'
                    {
                    match(input,47,FOLLOW_47_in_ruleOperator2526); 

                            current = grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21(), null); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1428:6: ( 'IEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1428:6: ( 'IEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1428:8: 'IEQ'
                    {
                    match(input,48,FOLLOW_48_in_ruleOperator2541); 

                            current = grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22(), null); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1434:6: ( 'IGE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1434:6: ( 'IGE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1434:8: 'IGE'
                    {
                    match(input,49,FOLLOW_49_in_ruleOperator2556); 

                            current = grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23(), null); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1440:6: ( 'IGT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1440:6: ( 'IGT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1440:8: 'IGT'
                    {
                    match(input,50,FOLLOW_50_in_ruleOperator2571); 

                            current = grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24(), null); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1446:6: ( 'INEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1446:6: ( 'INEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1446:8: 'INEQ'
                    {
                    match(input,51,FOLLOW_51_in_ruleOperator2586); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1456:1: ruleJumpKind returns [Enumerator current=null] : ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) ;
    public final Enumerator ruleJumpKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1460:6: ( ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1461:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1461:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt10=1;
                }
                break;
            case 53:
                {
                alt10=2;
                }
                break;
            case 54:
                {
                alt10=3;
                }
                break;
            case 55:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1461:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1461:2: ( 'JT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1461:2: ( 'JT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1461:4: 'JT'
                    {
                    match(input,52,FOLLOW_52_in_ruleJumpKind2629); 

                            current = grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1467:6: ( 'JF' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1467:6: ( 'JF' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1467:8: 'JF'
                    {
                    match(input,53,FOLLOW_53_in_ruleJumpKind2644); 

                            current = grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1473:6: ( 'JZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1473:6: ( 'JZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1473:8: 'JZ'
                    {
                    match(input,54,FOLLOW_54_in_ruleJumpKind2659); 

                            current = grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1479:6: ( 'JNZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1479:6: ( 'JNZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1479:8: 'JNZ'
                    {
                    match(input,55,FOLLOW_55_in_ruleJumpKind2674); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1489:1: ruleMoveKind returns [Enumerator current=null] : ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) ;
    public final Enumerator ruleMoveKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1493:6: ( ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1494:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1494:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt11=1;
                }
                break;
            case 57:
                {
                alt11=2;
                }
                break;
            case 58:
                {
                alt11=3;
                }
                break;
            case 59:
                {
                alt11=4;
                }
                break;
            case 60:
                {
                alt11=5;
                }
                break;
            case 61:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1494:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1494:2: ( 'CVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1494:2: ( 'CVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1494:4: 'CVMOV'
                    {
                    match(input,56,FOLLOW_56_in_ruleMoveKind2717); 

                            current = grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1500:6: ( 'VCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1500:6: ( 'VCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1500:8: 'VCMOV'
                    {
                    match(input,57,FOLLOW_57_in_ruleMoveKind2732); 

                            current = grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1506:6: ( 'VVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1506:6: ( 'VVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1506:8: 'VVMOV'
                    {
                    match(input,58,FOLLOW_58_in_ruleMoveKind2747); 

                            current = grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1512:6: ( 'CCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1512:6: ( 'CCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1512:8: 'CCMOV'
                    {
                    match(input,59,FOLLOW_59_in_ruleMoveKind2762); 

                            current = grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1518:6: ( 'IVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1518:6: ( 'IVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1518:8: 'IVMOV'
                    {
                    match(input,60,FOLLOW_60_in_ruleMoveKind2777); 

                            current = grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1524:6: ( 'ICMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1524:6: ( 'ICMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1524:8: 'ICMOV'
                    {
                    match(input,61,FOLLOW_61_in_ruleMoveKind2792); 

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


 

    public static final BitSet FOLLOW_ruleKLP_in_entryRuleKLP75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKLP85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleKLP130 = new BitSet(new long[]{0x3FFFFFFFFF8F8012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLine219 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLine234 = new BitSet(new long[]{0x3FFFFFFFFF8F8010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLine257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleInstruction350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_ruleInstruction377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_ruleInstruction404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_ruleInstruction431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_ruleInstruction458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_ruleInstruction485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_ruleInstruction512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_ruleInstruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_ruleInstruction566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleDecl657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleDecl678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_entryRuleSetClk714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClk724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSetClk759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_entryRuleSetPC837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPC847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSetPC882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetPC903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSetPC924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrio1005 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleReg_in_rulePrio1026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrio1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_entryRuleDone1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDone1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDone1130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDone1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_entryRuleBinop1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinop1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBinop1243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleBinop1264 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1285 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBinop1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_entryRuleJmp1372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJmp1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleJmp1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleJmp1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_entryRuleCJmp1474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCJmp1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpKind_in_ruleCJmp1530 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleCJmp1551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleCJmp1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMove1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoveKind_in_ruleMove1664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleMove1685 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleMove1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMove1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_entryRuleReg1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReg1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReg1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRead2008 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRead2031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2052 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRead2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleScope2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScope2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleScope2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperator2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperator2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperator2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperator2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperator2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperator2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperator2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOperator2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOperator2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperator2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperator2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperator2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperator2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOperator2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJumpKind2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleJumpKind2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJumpKind2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJumpKind2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMoveKind2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMoveKind2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMoveKind2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMoveKind2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMoveKind2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMoveKind2792 = new BitSet(new long[]{0x0000000000000002L});

}