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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:81:1: ruleKLP returns [EObject current=null] : (lv_instructions_0= ruleLine )* ;
    public final EObject ruleKLP() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:86:6: ( (lv_instructions_0= ruleLine )* )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:87:1: (lv_instructions_0= ruleLine )*
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:87:1: (lv_instructions_0= ruleLine )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=15 && LA1_0<=19)||(LA1_0>=23 && LA1_0<=61)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:90:6: lv_instructions_0= ruleLine
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLine_in_ruleKLP141);
            	    lv_instructions_0=ruleLine();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKLPRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "instructions", lv_instructions_0, "Line", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:115:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:115:46: (iv_ruleLine= ruleLine EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:116:2: iv_ruleLine= ruleLine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLineRule(), currentNode); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine178);
            iv_ruleLine=ruleLine();
            _fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine188); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:123:1: ruleLine returns [EObject current=null] : ( ( (lv_labels_0= RULE_ID ) ':' )* (lv_instruction_2= ruleInstruction ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_labels_0=null;
        EObject lv_instruction_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:128:6: ( ( ( (lv_labels_0= RULE_ID ) ':' )* (lv_instruction_2= ruleInstruction ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:1: ( ( (lv_labels_0= RULE_ID ) ':' )* (lv_instruction_2= ruleInstruction ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:1: ( ( (lv_labels_0= RULE_ID ) ':' )* (lv_instruction_2= ruleInstruction ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:2: ( (lv_labels_0= RULE_ID ) ':' )* (lv_instruction_2= ruleInstruction )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:2: ( (lv_labels_0= RULE_ID ) ':' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:3: (lv_labels_0= RULE_ID ) ':'
            	    {
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:129:3: (lv_labels_0= RULE_ID )
            	    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:131:6: lv_labels_0= RULE_ID
            	    {
            	    lv_labels_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLine236); 

            	    		createLeafNode(grammarAccess.getLineAccess().getLabelsIDTerminalRuleCall_0_0_0(), "labels"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "labels", lv_labels_0, "ID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }

            	    match(input,14,FOLLOW_14_in_ruleLine253); 

            	            createLeafNode(grammarAccess.getLineAccess().getColonKeyword_0_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:153:3: (lv_instruction_2= ruleInstruction )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:156:6: lv_instruction_2= ruleInstruction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleLine289);
            lv_instruction_2=ruleInstruction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLineRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "instruction", lv_instruction_2, "Instruction", currentNode);
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
    // $ANTLR end ruleLine


    // $ANTLR start entryRuleInstruction
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:181:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:181:53: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:182:2: iv_ruleInstruction= ruleInstruction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInstructionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction326);
            iv_ruleInstruction=ruleInstruction();
            _fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction336); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:189:1: ruleInstruction returns [EObject current=null] : (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) ;
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


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:194:6: ( (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:195:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:195:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )
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
                    new NoViableAltException("195:1: (this_Decl_0= ruleDecl | this_SetClk_1= ruleSetClk | this_SetPC_2= ruleSetPC | this_Prio_3= rulePrio | this_Done_4= ruleDone | this_Binop_5= ruleBinop | this_Jmp_6= ruleJmp | this_CJmp_7= ruleCJmp | this_Move_8= ruleMove )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:196:5: this_Decl_0= ruleDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecl_in_ruleInstruction383);
                    this_Decl_0=ruleDecl();
                    _fsp--;

                     
                            current = this_Decl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:206:5: this_SetClk_1= ruleSetClk
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetClkParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetClk_in_ruleInstruction410);
                    this_SetClk_1=ruleSetClk();
                    _fsp--;

                     
                            current = this_SetClk_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:216:5: this_SetPC_2= ruleSetPC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getSetPCParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSetPC_in_ruleInstruction437);
                    this_SetPC_2=ruleSetPC();
                    _fsp--;

                     
                            current = this_SetPC_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:226:5: this_Prio_3= rulePrio
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getPrioParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrio_in_ruleInstruction464);
                    this_Prio_3=rulePrio();
                    _fsp--;

                     
                            current = this_Prio_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:236:5: this_Done_4= ruleDone
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getDoneParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDone_in_ruleInstruction491);
                    this_Done_4=ruleDone();
                    _fsp--;

                     
                            current = this_Done_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:246:5: this_Binop_5= ruleBinop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getBinopParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinop_in_ruleInstruction518);
                    this_Binop_5=ruleBinop();
                    _fsp--;

                     
                            current = this_Binop_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:256:5: this_Jmp_6= ruleJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getJmpParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleJmp_in_ruleInstruction545);
                    this_Jmp_6=ruleJmp();
                    _fsp--;

                     
                            current = this_Jmp_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:266:5: this_CJmp_7= ruleCJmp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getCJmpParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCJmp_in_ruleInstruction572);
                    this_CJmp_7=ruleCJmp();
                    _fsp--;

                     
                            current = this_CJmp_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:276:5: this_Move_8= ruleMove
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInstructionAccess().getMoveParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMove_in_ruleInstruction599);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:291:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:291:46: (iv_ruleDecl= ruleDecl EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:292:2: iv_ruleDecl= ruleDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl631);
            iv_ruleDecl=ruleDecl();
            _fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl641); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:299:1: ruleDecl returns [EObject current=null] : ( (lv_scope_0= ruleScope ) (lv_reg_1= ruleReg ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Enumerator lv_scope_0 = null;

        EObject lv_reg_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:304:6: ( ( (lv_scope_0= ruleScope ) (lv_reg_1= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:305:1: ( (lv_scope_0= ruleScope ) (lv_reg_1= ruleReg ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:305:1: ( (lv_scope_0= ruleScope ) (lv_reg_1= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:305:2: (lv_scope_0= ruleScope ) (lv_reg_1= ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:305:2: (lv_scope_0= ruleScope )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:308:6: lv_scope_0= ruleScope
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleScope_in_ruleDecl700);
            lv_scope_0=ruleScope();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "scope", lv_scope_0, "Scope", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:326:2: (lv_reg_1= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:329:6: lv_reg_1= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleDecl738);
            lv_reg_1=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reg", lv_reg_1, "Reg", currentNode);
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
    // $ANTLR end ruleDecl


    // $ANTLR start entryRuleSetClk
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:354:1: entryRuleSetClk returns [EObject current=null] : iv_ruleSetClk= ruleSetClk EOF ;
    public final EObject entryRuleSetClk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClk = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:354:48: (iv_ruleSetClk= ruleSetClk EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:355:2: iv_ruleSetClk= ruleSetClk EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetClkRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetClk_in_entryRuleSetClk775);
            iv_ruleSetClk=ruleSetClk();
            _fsp--;

             current =iv_ruleSetClk; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClk785); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:362:1: ruleSetClk returns [EObject current=null] : ( 'SETCLK' (lv_reg_1= ruleReg ) (lv_clk_2= ruleReg ) ) ;
    public final EObject ruleSetClk() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1 = null;

        EObject lv_clk_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:367:6: ( ( 'SETCLK' (lv_reg_1= ruleReg ) (lv_clk_2= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:368:1: ( 'SETCLK' (lv_reg_1= ruleReg ) (lv_clk_2= ruleReg ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:368:1: ( 'SETCLK' (lv_reg_1= ruleReg ) (lv_clk_2= ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:368:2: 'SETCLK' (lv_reg_1= ruleReg ) (lv_clk_2= ruleReg )
            {
            match(input,15,FOLLOW_15_in_ruleSetClk819); 

                    createLeafNode(grammarAccess.getSetClkAccess().getSETCLKKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:372:1: (lv_reg_1= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:375:6: lv_reg_1= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk853);
            lv_reg_1=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetClkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reg", lv_reg_1, "Reg", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:393:2: (lv_clk_2= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:396:6: lv_clk_2= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetClk891);
            lv_clk_2=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetClkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "clk", lv_clk_2, "Reg", currentNode);
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
    // $ANTLR end ruleSetClk


    // $ANTLR start entryRuleSetPC
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:421:1: entryRuleSetPC returns [EObject current=null] : iv_ruleSetPC= ruleSetPC EOF ;
    public final EObject entryRuleSetPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPC = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:421:47: (iv_ruleSetPC= ruleSetPC EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:422:2: iv_ruleSetPC= ruleSetPC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSetPCRule(), currentNode); 
            pushFollow(FOLLOW_ruleSetPC_in_entryRuleSetPC928);
            iv_ruleSetPC=ruleSetPC();
            _fsp--;

             current =iv_ruleSetPC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPC938); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:429:1: ruleSetPC returns [EObject current=null] : ( 'SETPC' (lv_reg_1= ruleReg ) (lv_label_2= ruleLabel ) ) ;
    public final EObject ruleSetPC() throws RecognitionException {
        EObject current = null;

        EObject lv_reg_1 = null;

        EObject lv_label_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:434:6: ( ( 'SETPC' (lv_reg_1= ruleReg ) (lv_label_2= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:435:1: ( 'SETPC' (lv_reg_1= ruleReg ) (lv_label_2= ruleLabel ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:435:1: ( 'SETPC' (lv_reg_1= ruleReg ) (lv_label_2= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:435:2: 'SETPC' (lv_reg_1= ruleReg ) (lv_label_2= ruleLabel )
            {
            match(input,16,FOLLOW_16_in_ruleSetPC972); 

                    createLeafNode(grammarAccess.getSetPCAccess().getSETPCKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:439:1: (lv_reg_1= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:442:6: lv_reg_1= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleSetPC1006);
            lv_reg_1=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reg", lv_reg_1, "Reg", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:460:2: (lv_label_2= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:463:6: lv_label_2= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleSetPC1044);
            lv_label_2=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSetPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "label", lv_label_2, "Label", currentNode);
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
    // $ANTLR end ruleSetPC


    // $ANTLR start entryRulePrio
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:488:1: entryRulePrio returns [EObject current=null] : iv_rulePrio= rulePrio EOF ;
    public final EObject entryRulePrio() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrio = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:488:46: (iv_rulePrio= rulePrio EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:489:2: iv_rulePrio= rulePrio EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrioRule(), currentNode); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio1081);
            iv_rulePrio=rulePrio();
            _fsp--;

             current =iv_rulePrio; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio1091); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:496:1: rulePrio returns [EObject current=null] : ( 'PRIO' (lv_reg_1= ruleReg )? (lv_prio_2= RULE_INT ) ) ;
    public final EObject rulePrio() throws RecognitionException {
        EObject current = null;

        Token lv_prio_2=null;
        EObject lv_reg_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:501:6: ( ( 'PRIO' (lv_reg_1= ruleReg )? (lv_prio_2= RULE_INT ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:502:1: ( 'PRIO' (lv_reg_1= ruleReg )? (lv_prio_2= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:502:1: ( 'PRIO' (lv_reg_1= ruleReg )? (lv_prio_2= RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:502:2: 'PRIO' (lv_reg_1= ruleReg )? (lv_prio_2= RULE_INT )
            {
            match(input,17,FOLLOW_17_in_rulePrio1125); 

                    createLeafNode(grammarAccess.getPrioAccess().getPRIOKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:506:1: (lv_reg_1= ruleReg )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:509:6: lv_reg_1= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_rulePrio1159);
                    lv_reg_1=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reg", lv_reg_1, "Reg", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:527:3: (lv_prio_2= RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:529:6: lv_prio_2= RULE_INT
            {
            lv_prio_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrio1186); 

            		createLeafNode(grammarAccess.getPrioAccess().getPrioINTTerminalRuleCall_2_0(), "prio"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrioRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "prio", lv_prio_2, "INT", lastConsumedNode);
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
    // $ANTLR end rulePrio


    // $ANTLR start entryRuleDone
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:554:1: entryRuleDone returns [EObject current=null] : iv_ruleDone= ruleDone EOF ;
    public final EObject entryRuleDone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDone = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:554:46: (iv_ruleDone= ruleDone EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:555:2: iv_ruleDone= ruleDone EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoneRule(), currentNode); 
            pushFollow(FOLLOW_ruleDone_in_entryRuleDone1227);
            iv_ruleDone=ruleDone();
            _fsp--;

             current =iv_ruleDone; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDone1237); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:562:1: ruleDone returns [EObject current=null] : ( 'DONE' (lv_pc_1= ruleLabel )? ) ;
    public final EObject ruleDone() throws RecognitionException {
        EObject current = null;

        EObject lv_pc_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:567:6: ( ( 'DONE' (lv_pc_1= ruleLabel )? ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:568:1: ( 'DONE' (lv_pc_1= ruleLabel )? )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:568:1: ( 'DONE' (lv_pc_1= ruleLabel )? )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:568:2: 'DONE' (lv_pc_1= ruleLabel )?
            {
            match(input,18,FOLLOW_18_in_ruleDone1271); 

                    createLeafNode(grammarAccess.getDoneAccess().getDONEKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:572:1: (lv_pc_1= ruleLabel )?
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
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:575:6: lv_pc_1= ruleLabel
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleDone1305);
                    lv_pc_1=ruleLabel();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoneRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pc", lv_pc_1, "Label", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:600:1: entryRuleBinop returns [EObject current=null] : iv_ruleBinop= ruleBinop EOF ;
    public final EObject entryRuleBinop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinop = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:600:47: (iv_ruleBinop= ruleBinop EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:601:2: iv_ruleBinop= ruleBinop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinopRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinop_in_entryRuleBinop1343);
            iv_ruleBinop=ruleBinop();
            _fsp--;

             current =iv_ruleBinop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinop1353); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:608:1: ruleBinop returns [EObject current=null] : ( (lv_op_0= ruleOperator ) (lv_to_1= ruleReg ) (lv_arg1_2= ruleRead ) ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) ) ) ;
    public final EObject ruleBinop() throws RecognitionException {
        EObject current = null;

        Token lv_val_4=null;
        Enumerator lv_op_0 = null;

        EObject lv_to_1 = null;

        EObject lv_arg1_2 = null;

        EObject lv_arg2_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:613:6: ( ( (lv_op_0= ruleOperator ) (lv_to_1= ruleReg ) (lv_arg1_2= ruleRead ) ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:614:1: ( (lv_op_0= ruleOperator ) (lv_to_1= ruleReg ) (lv_arg1_2= ruleRead ) ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:614:1: ( (lv_op_0= ruleOperator ) (lv_to_1= ruleReg ) (lv_arg1_2= ruleRead ) ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:614:2: (lv_op_0= ruleOperator ) (lv_to_1= ruleReg ) (lv_arg1_2= ruleRead ) ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:614:2: (lv_op_0= ruleOperator )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:617:6: lv_op_0= ruleOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBinop1412);
            lv_op_0=ruleOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "op", lv_op_0, "Operator", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:635:2: (lv_to_1= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:638:6: lv_to_1= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleBinop1450);
            lv_to_1=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "to", lv_to_1, "Reg", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:656:2: (lv_arg1_2= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:659:6: lv_arg1_2= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleBinop1488);
            lv_arg1_2=ruleRead();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "arg1", lv_arg1_2, "Read", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:677:2: ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) )
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
                    new NoViableAltException("677:2: ( (lv_arg2_3= ruleRead ) | (lv_val_4= RULE_INT ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:677:3: (lv_arg2_3= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:677:3: (lv_arg2_3= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:680:6: lv_arg2_3= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleBinop1527);
                    lv_arg2_3=ruleRead();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "arg2", lv_arg2_3, "Read", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:699:6: (lv_val_4= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:699:6: (lv_val_4= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:701:6: lv_val_4= RULE_INT
                    {
                    lv_val_4=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBinop1559); 

                    		createLeafNode(grammarAccess.getBinopAccess().getValINTTerminalRuleCall_3_1_0(), "val"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBinopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "val", lv_val_4, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:726:1: entryRuleJmp returns [EObject current=null] : iv_ruleJmp= ruleJmp EOF ;
    public final EObject entryRuleJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:726:45: (iv_ruleJmp= ruleJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:727:2: iv_ruleJmp= ruleJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleJmp_in_entryRuleJmp1601);
            iv_ruleJmp=ruleJmp();
            _fsp--;

             current =iv_ruleJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJmp1611); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:734:1: ruleJmp returns [EObject current=null] : ( 'JMP' (lv_label_1= ruleLabel ) ) ;
    public final EObject ruleJmp() throws RecognitionException {
        EObject current = null;

        EObject lv_label_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:739:6: ( ( 'JMP' (lv_label_1= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:740:1: ( 'JMP' (lv_label_1= ruleLabel ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:740:1: ( 'JMP' (lv_label_1= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:740:2: 'JMP' (lv_label_1= ruleLabel )
            {
            match(input,19,FOLLOW_19_in_ruleJmp1645); 

                    createLeafNode(grammarAccess.getJmpAccess().getJMPKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:744:1: (lv_label_1= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:747:6: lv_label_1= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleJmp1679);
            lv_label_1=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "label", lv_label_1, "Label", currentNode);
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
    // $ANTLR end ruleJmp


    // $ANTLR start entryRuleCJmp
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:772:1: entryRuleCJmp returns [EObject current=null] : iv_ruleCJmp= ruleCJmp EOF ;
    public final EObject entryRuleCJmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCJmp = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:772:46: (iv_ruleCJmp= ruleCJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:773:2: iv_ruleCJmp= ruleCJmp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCJmpRule(), currentNode); 
            pushFollow(FOLLOW_ruleCJmp_in_entryRuleCJmp1716);
            iv_ruleCJmp=ruleCJmp();
            _fsp--;

             current =iv_ruleCJmp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCJmp1726); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:780:1: ruleCJmp returns [EObject current=null] : ( (lv_cond_0= ruleJumpKind ) (lv_reg_1= ruleRead ) (lv_label_2= ruleLabel ) ) ;
    public final EObject ruleCJmp() throws RecognitionException {
        EObject current = null;

        Enumerator lv_cond_0 = null;

        EObject lv_reg_1 = null;

        EObject lv_label_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:785:6: ( ( (lv_cond_0= ruleJumpKind ) (lv_reg_1= ruleRead ) (lv_label_2= ruleLabel ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:786:1: ( (lv_cond_0= ruleJumpKind ) (lv_reg_1= ruleRead ) (lv_label_2= ruleLabel ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:786:1: ( (lv_cond_0= ruleJumpKind ) (lv_reg_1= ruleRead ) (lv_label_2= ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:786:2: (lv_cond_0= ruleJumpKind ) (lv_reg_1= ruleRead ) (lv_label_2= ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:786:2: (lv_cond_0= ruleJumpKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:789:6: lv_cond_0= ruleJumpKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleJumpKind_in_ruleCJmp1785);
            lv_cond_0=ruleJumpKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "cond", lv_cond_0, "JumpKind", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:807:2: (lv_reg_1= ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:810:6: lv_reg_1= ruleRead
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRead_in_ruleCJmp1823);
            lv_reg_1=ruleRead();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "reg", lv_reg_1, "Read", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:828:2: (lv_label_2= ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:831:6: lv_label_2= ruleLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLabel_in_ruleCJmp1861);
            lv_label_2=ruleLabel();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCJmpRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "label", lv_label_2, "Label", currentNode);
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
    // $ANTLR end ruleCJmp


    // $ANTLR start entryRuleMove
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:856:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:856:46: (iv_ruleMove= ruleMove EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:857:2: iv_ruleMove= ruleMove EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMoveRule(), currentNode); 
            pushFollow(FOLLOW_ruleMove_in_entryRuleMove1898);
            iv_ruleMove=ruleMove();
            _fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMove1908); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:864:1: ruleMove returns [EObject current=null] : ( (lv_type_0= ruleMoveKind ) (lv_to_1= ruleReg ) ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_val_3=null;
        Enumerator lv_type_0 = null;

        EObject lv_to_1 = null;

        EObject lv_from_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:869:6: ( ( (lv_type_0= ruleMoveKind ) (lv_to_1= ruleReg ) ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:1: ( (lv_type_0= ruleMoveKind ) (lv_to_1= ruleReg ) ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:1: ( (lv_type_0= ruleMoveKind ) (lv_to_1= ruleReg ) ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:2: (lv_type_0= ruleMoveKind ) (lv_to_1= ruleReg ) ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:870:2: (lv_type_0= ruleMoveKind )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:873:6: lv_type_0= ruleMoveKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMoveKind_in_ruleMove1967);
            lv_type_0=ruleMoveKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0, "MoveKind", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:891:2: (lv_to_1= ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:894:6: lv_to_1= ruleReg
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleReg_in_ruleMove2005);
            lv_to_1=ruleReg();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "to", lv_to_1, "Reg", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:912:2: ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) )
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
                    new NoViableAltException("912:2: ( (lv_from_2= ruleRead ) | (lv_val_3= RULE_INT ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:912:3: (lv_from_2= ruleRead )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:912:3: (lv_from_2= ruleRead )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:915:6: lv_from_2= ruleRead
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRead_in_ruleMove2044);
                    lv_from_2=ruleRead();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "from", lv_from_2, "Read", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:934:6: (lv_val_3= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:934:6: (lv_val_3= RULE_INT )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:936:6: lv_val_3= RULE_INT
                    {
                    lv_val_3=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMove2076); 

                    		createLeafNode(grammarAccess.getMoveAccess().getValINTTerminalRuleCall_2_1_0(), "val"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMoveRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "val", lv_val_3, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:961:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:961:47: (iv_ruleLabel= ruleLabel EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:962:2: iv_ruleLabel= ruleLabel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabelRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2118);
            iv_ruleLabel=ruleLabel();
            _fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2128); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:969:1: ruleLabel returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:974:6: ( (lv_name_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:975:1: (lv_name_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:975:1: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:977:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel2174); 

            		createLeafNode(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1002:1: entryRuleReg returns [EObject current=null] : iv_ruleReg= ruleReg EOF ;
    public final EObject entryRuleReg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReg = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1002:45: (iv_ruleReg= ruleReg EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1003:2: iv_ruleReg= ruleReg EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRegRule(), currentNode); 
            pushFollow(FOLLOW_ruleReg_in_entryRuleReg2214);
            iv_ruleReg=ruleReg();
            _fsp--;

             current =iv_ruleReg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReg2224); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1010:1: ruleReg returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleReg() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1015:6: ( (lv_name_0= RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1016:1: (lv_name_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1016:1: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1018:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReg2270); 

            		createLeafNode(grammarAccess.getRegAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRegRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1043:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1043:46: (iv_ruleRead= ruleRead EOF )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1044:2: iv_ruleRead= ruleRead EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadRule(), currentNode); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead2310);
            iv_ruleRead=ruleRead();
            _fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead2320); 

            }

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1051:1: ruleRead returns [EObject current=null] : ( ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' ) | (lv_reg_4= ruleReg ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_pre_0=null;
        EObject lv_reg_2 = null;

        EObject lv_reg_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1056:6: ( ( ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' ) | (lv_reg_4= ruleReg ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:1: ( ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' ) | (lv_reg_4= ruleReg ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:1: ( ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' ) | (lv_reg_4= ruleReg ) )
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
                    new NoViableAltException("1057:1: ( ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' ) | (lv_reg_4= ruleReg ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:2: ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:2: ( (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:3: (lv_pre_0= 'pre' ) '(' (lv_reg_2= ruleReg ) ')'
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1057:3: (lv_pre_0= 'pre' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1059:6: lv_pre_0= 'pre'
                    {
                    lv_pre_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleRead2367); 

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

                    match(input,21,FOLLOW_21_in_ruleRead2389); 

                            createLeafNode(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1082:1: (lv_reg_2= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1085:6: lv_reg_2= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2423);
                    lv_reg_2=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reg", lv_reg_2, "Reg", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,22,FOLLOW_22_in_ruleRead2436); 

                            createLeafNode(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1108:6: (lv_reg_4= ruleReg )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1108:6: (lv_reg_4= ruleReg )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1111:6: lv_reg_4= ruleReg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleReg_in_ruleRead2477);
                    lv_reg_4=ruleReg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getReadRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reg", lv_reg_4, "Reg", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1136:1: ruleScope returns [Enumerator current=null] : ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) ;
    public final Enumerator ruleScope() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1140:6: ( ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1141:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1141:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )
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
                    new NoViableAltException("1141:1: ( ( 'INPUT' ) | ( 'OUTPUT' ) | ( 'LOCAL' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1141:2: ( 'INPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1141:2: ( 'INPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1141:4: 'INPUT'
                    {
                    match(input,23,FOLLOW_23_in_ruleScope2528); 

                            current = grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1147:6: ( 'OUTPUT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1147:6: ( 'OUTPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1147:8: 'OUTPUT'
                    {
                    match(input,24,FOLLOW_24_in_ruleScope2543); 

                            current = grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1153:6: ( 'LOCAL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1153:6: ( 'LOCAL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1153:8: 'LOCAL'
                    {
                    match(input,25,FOLLOW_25_in_ruleScope2558); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1163:1: ruleOperator returns [Enumerator current=null] : ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1167:6: ( ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1168:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1168:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )
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
                    new NoViableAltException("1168:1: ( ( 'ADD' ) | ( 'IADD' ) | ( 'SUB' ) | ( 'MUL' ) | ( 'DIV' ) | ( 'AND' ) | ( 'OR' ) | ( 'XOR' ) | ( 'LT' ) | ( 'LE' ) | ( 'EQ' ) | ( 'GE' ) | ( 'GT' ) | ( 'NEQ' ) | ( 'ISUB' ) | ( 'IMUL' ) | ( 'IDIV' ) | ( 'IAND' ) | ( 'IOR' ) | ( 'IXOR' ) | ( 'ILT' ) | ( 'ILE' ) | ( 'IEQ' ) | ( 'IGE' ) | ( 'IGT' ) | ( 'INEQ' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1168:2: ( 'ADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1168:2: ( 'ADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1168:4: 'ADD'
                    {
                    match(input,26,FOLLOW_26_in_ruleOperator2601); 

                            current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1174:6: ( 'IADD' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1174:6: ( 'IADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1174:8: 'IADD'
                    {
                    match(input,27,FOLLOW_27_in_ruleOperator2616); 

                            current = grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1180:6: ( 'SUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1180:6: ( 'SUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1180:8: 'SUB'
                    {
                    match(input,28,FOLLOW_28_in_ruleOperator2631); 

                            current = grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1186:6: ( 'MUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1186:6: ( 'MUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1186:8: 'MUL'
                    {
                    match(input,29,FOLLOW_29_in_ruleOperator2646); 

                            current = grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1192:6: ( 'DIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1192:6: ( 'DIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1192:8: 'DIV'
                    {
                    match(input,30,FOLLOW_30_in_ruleOperator2661); 

                            current = grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1198:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1198:6: ( 'AND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1198:8: 'AND'
                    {
                    match(input,31,FOLLOW_31_in_ruleOperator2676); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1204:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1204:6: ( 'OR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1204:8: 'OR'
                    {
                    match(input,32,FOLLOW_32_in_ruleOperator2691); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1210:6: ( 'XOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1210:6: ( 'XOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1210:8: 'XOR'
                    {
                    match(input,33,FOLLOW_33_in_ruleOperator2706); 

                            current = grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1216:6: ( 'LT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1216:6: ( 'LT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1216:8: 'LT'
                    {
                    match(input,34,FOLLOW_34_in_ruleOperator2721); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1222:6: ( 'LE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1222:6: ( 'LE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1222:8: 'LE'
                    {
                    match(input,35,FOLLOW_35_in_ruleOperator2736); 

                            current = grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1228:6: ( 'EQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1228:6: ( 'EQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1228:8: 'EQ'
                    {
                    match(input,36,FOLLOW_36_in_ruleOperator2751); 

                            current = grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:6: ( 'GE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:6: ( 'GE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1234:8: 'GE'
                    {
                    match(input,37,FOLLOW_37_in_ruleOperator2766); 

                            current = grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:6: ( 'GT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:6: ( 'GT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1240:8: 'GT'
                    {
                    match(input,38,FOLLOW_38_in_ruleOperator2781); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:6: ( 'NEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:6: ( 'NEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1246:8: 'NEQ'
                    {
                    match(input,39,FOLLOW_39_in_ruleOperator2796); 

                            current = grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1252:6: ( 'ISUB' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1252:6: ( 'ISUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1252:8: 'ISUB'
                    {
                    match(input,40,FOLLOW_40_in_ruleOperator2811); 

                            current = grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1258:6: ( 'IMUL' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1258:6: ( 'IMUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1258:8: 'IMUL'
                    {
                    match(input,41,FOLLOW_41_in_ruleOperator2826); 

                            current = grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1264:6: ( 'IDIV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1264:6: ( 'IDIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1264:8: 'IDIV'
                    {
                    match(input,42,FOLLOW_42_in_ruleOperator2841); 

                            current = grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1270:6: ( 'IAND' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1270:6: ( 'IAND' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1270:8: 'IAND'
                    {
                    match(input,43,FOLLOW_43_in_ruleOperator2856); 

                            current = grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1276:6: ( 'IOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1276:6: ( 'IOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1276:8: 'IOR'
                    {
                    match(input,44,FOLLOW_44_in_ruleOperator2871); 

                            current = grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1282:6: ( 'IXOR' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1282:6: ( 'IXOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1282:8: 'IXOR'
                    {
                    match(input,45,FOLLOW_45_in_ruleOperator2886); 

                            current = grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19(), null); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1288:6: ( 'ILT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1288:6: ( 'ILT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1288:8: 'ILT'
                    {
                    match(input,46,FOLLOW_46_in_ruleOperator2901); 

                            current = grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20(), null); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1294:6: ( 'ILE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1294:6: ( 'ILE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1294:8: 'ILE'
                    {
                    match(input,47,FOLLOW_47_in_ruleOperator2916); 

                            current = grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21(), null); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1300:6: ( 'IEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1300:6: ( 'IEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1300:8: 'IEQ'
                    {
                    match(input,48,FOLLOW_48_in_ruleOperator2931); 

                            current = grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22(), null); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1306:6: ( 'IGE' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1306:6: ( 'IGE' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1306:8: 'IGE'
                    {
                    match(input,49,FOLLOW_49_in_ruleOperator2946); 

                            current = grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23(), null); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1312:6: ( 'IGT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1312:6: ( 'IGT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1312:8: 'IGT'
                    {
                    match(input,50,FOLLOW_50_in_ruleOperator2961); 

                            current = grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24(), null); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1318:6: ( 'INEQ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1318:6: ( 'INEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1318:8: 'INEQ'
                    {
                    match(input,51,FOLLOW_51_in_ruleOperator2976); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1328:1: ruleJumpKind returns [Enumerator current=null] : ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) ;
    public final Enumerator ruleJumpKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1332:6: ( ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )
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
                    new NoViableAltException("1333:1: ( ( 'JT' ) | ( 'JF' ) | ( 'JZ' ) | ( 'JNZ' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:2: ( 'JT' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:2: ( 'JT' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1333:4: 'JT'
                    {
                    match(input,52,FOLLOW_52_in_ruleJumpKind3019); 

                            current = grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:6: ( 'JF' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:6: ( 'JF' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1339:8: 'JF'
                    {
                    match(input,53,FOLLOW_53_in_ruleJumpKind3034); 

                            current = grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:6: ( 'JZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:6: ( 'JZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1345:8: 'JZ'
                    {
                    match(input,54,FOLLOW_54_in_ruleJumpKind3049); 

                            current = grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:6: ( 'JNZ' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:6: ( 'JNZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1351:8: 'JNZ'
                    {
                    match(input,55,FOLLOW_55_in_ruleJumpKind3064); 

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
    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1361:1: ruleMoveKind returns [Enumerator current=null] : ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) ;
    public final Enumerator ruleMoveKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1365:6: ( ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1366:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1366:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )
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
                    new NoViableAltException("1366:1: ( ( 'CVMOV' ) | ( 'VCMOV' ) | ( 'VVMOV' ) | ( 'CCMOV' ) | ( 'IVMOV' ) | ( 'ICMOV' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1366:2: ( 'CVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1366:2: ( 'CVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1366:4: 'CVMOV'
                    {
                    match(input,56,FOLLOW_56_in_ruleMoveKind3107); 

                            current = grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1372:6: ( 'VCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1372:6: ( 'VCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1372:8: 'VCMOV'
                    {
                    match(input,57,FOLLOW_57_in_ruleMoveKind3122); 

                            current = grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1378:6: ( 'VVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1378:6: ( 'VVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1378:8: 'VVMOV'
                    {
                    match(input,58,FOLLOW_58_in_ruleMoveKind3137); 

                            current = grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1384:6: ( 'CCMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1384:6: ( 'CCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1384:8: 'CCMOV'
                    {
                    match(input,59,FOLLOW_59_in_ruleMoveKind3152); 

                            current = grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1390:6: ( 'IVMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1390:6: ( 'IVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1390:8: 'IVMOV'
                    {
                    match(input,60,FOLLOW_60_in_ruleMoveKind3167); 

                            current = grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1396:6: ( 'ICMOV' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1396:6: ( 'ICMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp/src-gen/de/cau/cs/kieler/krep/editors/klp/parser/antlr/internal/InternalKlp.g:1396:8: 'ICMOV'
                    {
                    match(input,61,FOLLOW_61_in_ruleMoveKind3182); 

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
    public static final BitSet FOLLOW_ruleLine_in_ruleKLP141 = new BitSet(new long[]{0x3FFFFFFFFF8F8012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLine236 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLine253 = new BitSet(new long[]{0x3FFFFFFFFF8F8010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLine289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleInstruction383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_ruleInstruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_ruleInstruction437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_ruleInstruction464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_ruleInstruction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_ruleInstruction518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_ruleInstruction545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_ruleInstruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_ruleInstruction599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleDecl700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleDecl738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_entryRuleSetClk775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClk785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSetClk819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetClk891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_entryRuleSetPC928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPC938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSetPC972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleSetPC1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleSetPC1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrio1125 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleReg_in_rulePrio1159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrio1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_entryRuleDone1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDone1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDone1271 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDone1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_entryRuleBinop1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinop1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBinop1412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleBinop1450 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1488 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleBinop1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBinop1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_entryRuleJmp1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJmp1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleJmp1645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleJmp1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_entryRuleCJmp1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCJmp1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpKind_in_ruleCJmp1785 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleRead_in_ruleCJmp1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleCJmp1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_entryRuleMove1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMove1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoveKind_in_ruleMove1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleMove2005 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_ruleRead_in_ruleMove2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMove2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_entryRuleReg2214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReg2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReg2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead2310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRead2367 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRead2389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2423 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRead2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_ruleRead2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleScope2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleScope2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleScope2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperator2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperator2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOperator2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOperator2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOperator2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOperator2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperator2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperator2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperator2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperator2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperator2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperator2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperator2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperator2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOperator2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOperator2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperator2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperator2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperator2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperator2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOperator2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJumpKind3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleJumpKind3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJumpKind3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJumpKind3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMoveKind3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMoveKind3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMoveKind3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMoveKind3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMoveKind3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMoveKind3182 = new BitSet(new long[]{0x0000000000000002L});

}