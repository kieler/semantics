package de.cau.cs.kieler.krep.editors.klp.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.krep.editors.klp.services.KlpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalKlpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DIGIT", "RULE_LETTER", "RULE_WS", "RULE_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'ADD'", "'IADD'", "'SUB'", "'MUL'", "'DIV'", "'AND'", "'OR'", "'XOR'", "'LT'", "'LE'", "'EQ'", "'GE'", "'GT'", "'NEQ'", "'ISUB'", "'IMUL'", "'IDIV'", "'IAND'", "'IOR'", "'IXOR'", "'ILT'", "'ILE'", "'IEQ'", "'IGE'", "'IGT'", "'INEQ'", "'JT'", "'JF'", "'JZ'", "'JNZ'", "'CVMOV'", "'VCMOV'", "'VVMOV'", "'CCMOV'", "'IVMOV'", "'ICMOV'", "':'", "'SETCLK'", "'SETPC'", "'PRIO'", "'DONE'", "'JMP'", "'('", "')'", "'pre'"
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g"; }


     
     	private KlpGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KlpGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleKLP
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:60:1: entryRuleKLP : ruleKLP EOF ;
    public final void entryRuleKLP() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:61:1: ( ruleKLP EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:62:1: ruleKLP EOF
            {
             before(grammarAccess.getKLPRule()); 
            pushFollow(FOLLOW_ruleKLP_in_entryRuleKLP61);
            ruleKLP();
            _fsp--;

             after(grammarAccess.getKLPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKLP68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleKLP


    // $ANTLR start ruleKLP
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:69:1: ruleKLP : ( ( rule__KLP__InstructionsAssignment )* ) ;
    public final void ruleKLP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:73:2: ( ( ( rule__KLP__InstructionsAssignment )* ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:74:1: ( ( rule__KLP__InstructionsAssignment )* )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:74:1: ( ( rule__KLP__InstructionsAssignment )* )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:75:1: ( rule__KLP__InstructionsAssignment )*
            {
             before(grammarAccess.getKLPAccess().getInstructionsAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:76:1: ( rule__KLP__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=52)||(LA1_0>=54 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:76:2: rule__KLP__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__KLP__InstructionsAssignment_in_ruleKLP94);
            	    rule__KLP__InstructionsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getKLPAccess().getInstructionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleKLP


    // $ANTLR start entryRuleLine
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:88:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:89:1: ( ruleLine EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:90:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine122);
            ruleLine();
            _fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLine


    // $ANTLR start ruleLine
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:97:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:101:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:102:1: ( ( rule__Line__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:102:1: ( ( rule__Line__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:103:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:104:1: ( rule__Line__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:104:2: rule__Line__Group__0
            {
            pushFollow(FOLLOW_rule__Line__Group__0_in_ruleLine155);
            rule__Line__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLine


    // $ANTLR start entryRuleInstruction
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:116:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:117:1: ( ruleInstruction EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:118:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction182);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInstruction


    // $ANTLR start ruleInstruction
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:125:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:129:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:130:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:130:1: ( ( rule__Instruction__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:131:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:132:1: ( rule__Instruction__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:132:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction215);
            rule__Instruction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInstruction


    // $ANTLR start entryRuleDecl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:144:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:145:1: ( ruleDecl EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:146:1: ruleDecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl242);
            ruleDecl();
            _fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDecl


    // $ANTLR start ruleDecl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:153:1: ruleDecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:157:2: ( ( ( rule__Decl__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:158:1: ( ( rule__Decl__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:158:1: ( ( rule__Decl__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:159:1: ( rule__Decl__Group__0 )
            {
             before(grammarAccess.getDeclAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:160:1: ( rule__Decl__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:160:2: rule__Decl__Group__0
            {
            pushFollow(FOLLOW_rule__Decl__Group__0_in_ruleDecl275);
            rule__Decl__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecl


    // $ANTLR start entryRuleSetClk
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:172:1: entryRuleSetClk : ruleSetClk EOF ;
    public final void entryRuleSetClk() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:173:1: ( ruleSetClk EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:174:1: ruleSetClk EOF
            {
             before(grammarAccess.getSetClkRule()); 
            pushFollow(FOLLOW_ruleSetClk_in_entryRuleSetClk302);
            ruleSetClk();
            _fsp--;

             after(grammarAccess.getSetClkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClk309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSetClk


    // $ANTLR start ruleSetClk
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:181:1: ruleSetClk : ( ( rule__SetClk__Group__0 ) ) ;
    public final void ruleSetClk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:185:2: ( ( ( rule__SetClk__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:186:1: ( ( rule__SetClk__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:186:1: ( ( rule__SetClk__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:187:1: ( rule__SetClk__Group__0 )
            {
             before(grammarAccess.getSetClkAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:188:1: ( rule__SetClk__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:188:2: rule__SetClk__Group__0
            {
            pushFollow(FOLLOW_rule__SetClk__Group__0_in_ruleSetClk335);
            rule__SetClk__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSetClkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSetClk


    // $ANTLR start entryRuleSetPC
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:200:1: entryRuleSetPC : ruleSetPC EOF ;
    public final void entryRuleSetPC() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:201:1: ( ruleSetPC EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:202:1: ruleSetPC EOF
            {
             before(grammarAccess.getSetPCRule()); 
            pushFollow(FOLLOW_ruleSetPC_in_entryRuleSetPC362);
            ruleSetPC();
            _fsp--;

             after(grammarAccess.getSetPCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetPC369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSetPC


    // $ANTLR start ruleSetPC
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:209:1: ruleSetPC : ( ( rule__SetPC__Group__0 ) ) ;
    public final void ruleSetPC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:213:2: ( ( ( rule__SetPC__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:214:1: ( ( rule__SetPC__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:214:1: ( ( rule__SetPC__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:215:1: ( rule__SetPC__Group__0 )
            {
             before(grammarAccess.getSetPCAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:216:1: ( rule__SetPC__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:216:2: rule__SetPC__Group__0
            {
            pushFollow(FOLLOW_rule__SetPC__Group__0_in_ruleSetPC395);
            rule__SetPC__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSetPCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSetPC


    // $ANTLR start entryRulePrio
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:228:1: entryRulePrio : rulePrio EOF ;
    public final void entryRulePrio() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:229:1: ( rulePrio EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:230:1: rulePrio EOF
            {
             before(grammarAccess.getPrioRule()); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio422);
            rulePrio();
            _fsp--;

             after(grammarAccess.getPrioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePrio


    // $ANTLR start rulePrio
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:237:1: rulePrio : ( ( rule__Prio__Group__0 ) ) ;
    public final void rulePrio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:241:2: ( ( ( rule__Prio__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:242:1: ( ( rule__Prio__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:242:1: ( ( rule__Prio__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:243:1: ( rule__Prio__Group__0 )
            {
             before(grammarAccess.getPrioAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:244:1: ( rule__Prio__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:244:2: rule__Prio__Group__0
            {
            pushFollow(FOLLOW_rule__Prio__Group__0_in_rulePrio455);
            rule__Prio__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrio


    // $ANTLR start entryRuleDone
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:256:1: entryRuleDone : ruleDone EOF ;
    public final void entryRuleDone() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:257:1: ( ruleDone EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:258:1: ruleDone EOF
            {
             before(grammarAccess.getDoneRule()); 
            pushFollow(FOLLOW_ruleDone_in_entryRuleDone482);
            ruleDone();
            _fsp--;

             after(grammarAccess.getDoneRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDone489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDone


    // $ANTLR start ruleDone
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:265:1: ruleDone : ( ( rule__Done__Group__0 ) ) ;
    public final void ruleDone() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:269:2: ( ( ( rule__Done__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:270:1: ( ( rule__Done__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:270:1: ( ( rule__Done__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:271:1: ( rule__Done__Group__0 )
            {
             before(grammarAccess.getDoneAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:272:1: ( rule__Done__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:272:2: rule__Done__Group__0
            {
            pushFollow(FOLLOW_rule__Done__Group__0_in_ruleDone515);
            rule__Done__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDone


    // $ANTLR start entryRuleBinop
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:284:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:285:1: ( ruleBinop EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:286:1: ruleBinop EOF
            {
             before(grammarAccess.getBinopRule()); 
            pushFollow(FOLLOW_ruleBinop_in_entryRuleBinop542);
            ruleBinop();
            _fsp--;

             after(grammarAccess.getBinopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinop549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBinop


    // $ANTLR start ruleBinop
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:293:1: ruleBinop : ( ( rule__Binop__Group__0 ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:297:2: ( ( ( rule__Binop__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:298:1: ( ( rule__Binop__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:298:1: ( ( rule__Binop__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:299:1: ( rule__Binop__Group__0 )
            {
             before(grammarAccess.getBinopAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:300:1: ( rule__Binop__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:300:2: rule__Binop__Group__0
            {
            pushFollow(FOLLOW_rule__Binop__Group__0_in_ruleBinop575);
            rule__Binop__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinop


    // $ANTLR start entryRuleJmp
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:312:1: entryRuleJmp : ruleJmp EOF ;
    public final void entryRuleJmp() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:313:1: ( ruleJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:314:1: ruleJmp EOF
            {
             before(grammarAccess.getJmpRule()); 
            pushFollow(FOLLOW_ruleJmp_in_entryRuleJmp602);
            ruleJmp();
            _fsp--;

             after(grammarAccess.getJmpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJmp609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleJmp


    // $ANTLR start ruleJmp
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:321:1: ruleJmp : ( ( rule__Jmp__Group__0 ) ) ;
    public final void ruleJmp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:325:2: ( ( ( rule__Jmp__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:326:1: ( ( rule__Jmp__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:326:1: ( ( rule__Jmp__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:327:1: ( rule__Jmp__Group__0 )
            {
             before(grammarAccess.getJmpAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:328:1: ( rule__Jmp__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:328:2: rule__Jmp__Group__0
            {
            pushFollow(FOLLOW_rule__Jmp__Group__0_in_ruleJmp635);
            rule__Jmp__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJmpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJmp


    // $ANTLR start entryRuleCJmp
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:340:1: entryRuleCJmp : ruleCJmp EOF ;
    public final void entryRuleCJmp() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:341:1: ( ruleCJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:342:1: ruleCJmp EOF
            {
             before(grammarAccess.getCJmpRule()); 
            pushFollow(FOLLOW_ruleCJmp_in_entryRuleCJmp662);
            ruleCJmp();
            _fsp--;

             after(grammarAccess.getCJmpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCJmp669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCJmp


    // $ANTLR start ruleCJmp
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:349:1: ruleCJmp : ( ( rule__CJmp__Group__0 ) ) ;
    public final void ruleCJmp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:353:2: ( ( ( rule__CJmp__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:354:1: ( ( rule__CJmp__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:354:1: ( ( rule__CJmp__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:355:1: ( rule__CJmp__Group__0 )
            {
             before(grammarAccess.getCJmpAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:356:1: ( rule__CJmp__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:356:2: rule__CJmp__Group__0
            {
            pushFollow(FOLLOW_rule__CJmp__Group__0_in_ruleCJmp695);
            rule__CJmp__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCJmp


    // $ANTLR start entryRuleMove
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:368:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:369:1: ( ruleMove EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:370:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_ruleMove_in_entryRuleMove722);
            ruleMove();
            _fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMove729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMove


    // $ANTLR start ruleMove
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:377:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:381:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:382:1: ( ( rule__Move__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:382:1: ( ( rule__Move__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:383:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:384:1: ( rule__Move__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:384:2: rule__Move__Group__0
            {
            pushFollow(FOLLOW_rule__Move__Group__0_in_ruleMove755);
            rule__Move__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMove


    // $ANTLR start entryRuleLabel
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:396:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:397:1: ( ruleLabel EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:398:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel782);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLabel


    // $ANTLR start ruleLabel
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:405:1: ruleLabel : ( ( rule__Label__NameAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:409:2: ( ( ( rule__Label__NameAssignment ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:410:1: ( ( rule__Label__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:410:1: ( ( rule__Label__NameAssignment ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:411:1: ( rule__Label__NameAssignment )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:412:1: ( rule__Label__NameAssignment )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:412:2: rule__Label__NameAssignment
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_in_ruleLabel815);
            rule__Label__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLabel


    // $ANTLR start entryRuleReg
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:424:1: entryRuleReg : ruleReg EOF ;
    public final void entryRuleReg() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:425:1: ( ruleReg EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:426:1: ruleReg EOF
            {
             before(grammarAccess.getRegRule()); 
            pushFollow(FOLLOW_ruleReg_in_entryRuleReg842);
            ruleReg();
            _fsp--;

             after(grammarAccess.getRegRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReg849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleReg


    // $ANTLR start ruleReg
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:433:1: ruleReg : ( ( rule__Reg__NameAssignment ) ) ;
    public final void ruleReg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:437:2: ( ( ( rule__Reg__NameAssignment ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:438:1: ( ( rule__Reg__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:438:1: ( ( rule__Reg__NameAssignment ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:439:1: ( rule__Reg__NameAssignment )
            {
             before(grammarAccess.getRegAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:440:1: ( rule__Reg__NameAssignment )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:440:2: rule__Reg__NameAssignment
            {
            pushFollow(FOLLOW_rule__Reg__NameAssignment_in_ruleReg875);
            rule__Reg__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getRegAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleReg


    // $ANTLR start entryRuleRead
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:452:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:453:1: ( ruleRead EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:454:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead902);
            ruleRead();
            _fsp--;

             after(grammarAccess.getReadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRead


    // $ANTLR start ruleRead
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:461:1: ruleRead : ( ( rule__Read__Alternatives ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:465:2: ( ( ( rule__Read__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:466:1: ( ( rule__Read__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:466:1: ( ( rule__Read__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:467:1: ( rule__Read__Alternatives )
            {
             before(grammarAccess.getReadAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:468:1: ( rule__Read__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:468:2: rule__Read__Alternatives
            {
            pushFollow(FOLLOW_rule__Read__Alternatives_in_ruleRead935);
            rule__Read__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getReadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRead


    // $ANTLR start ruleScope
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:481:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:485:1: ( ( ( rule__Scope__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:486:1: ( ( rule__Scope__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:486:1: ( ( rule__Scope__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:487:1: ( rule__Scope__Alternatives )
            {
             before(grammarAccess.getScopeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:488:1: ( rule__Scope__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:488:2: rule__Scope__Alternatives
            {
            pushFollow(FOLLOW_rule__Scope__Alternatives_in_ruleScope972);
            rule__Scope__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getScopeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleScope


    // $ANTLR start ruleOperator
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:500:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:504:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:505:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:505:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:506:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:507:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:507:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1008);
            rule__Operator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOperator


    // $ANTLR start ruleJumpKind
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:519:1: ruleJumpKind : ( ( rule__JumpKind__Alternatives ) ) ;
    public final void ruleJumpKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:523:1: ( ( ( rule__JumpKind__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:524:1: ( ( rule__JumpKind__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:524:1: ( ( rule__JumpKind__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:525:1: ( rule__JumpKind__Alternatives )
            {
             before(grammarAccess.getJumpKindAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:526:1: ( rule__JumpKind__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:526:2: rule__JumpKind__Alternatives
            {
            pushFollow(FOLLOW_rule__JumpKind__Alternatives_in_ruleJumpKind1044);
            rule__JumpKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getJumpKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleJumpKind


    // $ANTLR start ruleMoveKind
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:538:1: ruleMoveKind : ( ( rule__MoveKind__Alternatives ) ) ;
    public final void ruleMoveKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:542:1: ( ( ( rule__MoveKind__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:543:1: ( ( rule__MoveKind__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:543:1: ( ( rule__MoveKind__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:544:1: ( rule__MoveKind__Alternatives )
            {
             before(grammarAccess.getMoveKindAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:545:1: ( rule__MoveKind__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:545:2: rule__MoveKind__Alternatives
            {
            pushFollow(FOLLOW_rule__MoveKind__Alternatives_in_ruleMoveKind1080);
            rule__MoveKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getMoveKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMoveKind


    // $ANTLR start rule__Instruction__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:556:1: rule__Instruction__Alternatives : ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:560:1: ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 54:
                {
                alt2=2;
                }
                break;
            case 55:
                {
                alt2=3;
                }
                break;
            case 56:
                {
                alt2=4;
                }
                break;
            case 57:
                {
                alt2=5;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
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
                {
                alt2=6;
                }
                break;
            case 58:
                {
                alt2=7;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt2=8;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("556:1: rule__Instruction__Alternatives : ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:561:1: ( ruleDecl )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:561:1: ( ruleDecl )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:562:1: ruleDecl
                    {
                     before(grammarAccess.getInstructionAccess().getDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecl_in_rule__Instruction__Alternatives1115);
                    ruleDecl();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:567:6: ( ruleSetClk )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:567:6: ( ruleSetClk )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:568:1: ruleSetClk
                    {
                     before(grammarAccess.getInstructionAccess().getSetClkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSetClk_in_rule__Instruction__Alternatives1132);
                    ruleSetClk();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getSetClkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:573:6: ( ruleSetPC )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:573:6: ( ruleSetPC )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:574:1: ruleSetPC
                    {
                     before(grammarAccess.getInstructionAccess().getSetPCParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSetPC_in_rule__Instruction__Alternatives1149);
                    ruleSetPC();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getSetPCParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:579:6: ( rulePrio )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:579:6: ( rulePrio )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:580:1: rulePrio
                    {
                     before(grammarAccess.getInstructionAccess().getPrioParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePrio_in_rule__Instruction__Alternatives1166);
                    rulePrio();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPrioParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:585:6: ( ruleDone )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:585:6: ( ruleDone )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:586:1: ruleDone
                    {
                     before(grammarAccess.getInstructionAccess().getDoneParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDone_in_rule__Instruction__Alternatives1183);
                    ruleDone();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getDoneParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:591:6: ( ruleBinop )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:591:6: ( ruleBinop )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:592:1: ruleBinop
                    {
                     before(grammarAccess.getInstructionAccess().getBinopParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBinop_in_rule__Instruction__Alternatives1200);
                    ruleBinop();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getBinopParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:597:6: ( ruleJmp )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:597:6: ( ruleJmp )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:598:1: ruleJmp
                    {
                     before(grammarAccess.getInstructionAccess().getJmpParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleJmp_in_rule__Instruction__Alternatives1217);
                    ruleJmp();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getJmpParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:603:6: ( ruleCJmp )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:603:6: ( ruleCJmp )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:604:1: ruleCJmp
                    {
                     before(grammarAccess.getInstructionAccess().getCJmpParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleCJmp_in_rule__Instruction__Alternatives1234);
                    ruleCJmp();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getCJmpParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:609:6: ( ruleMove )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:609:6: ( ruleMove )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:610:1: ruleMove
                    {
                     before(grammarAccess.getInstructionAccess().getMoveParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleMove_in_rule__Instruction__Alternatives1251);
                    ruleMove();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getMoveParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Alternatives


    // $ANTLR start rule__Binop__Alternatives_3
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:620:1: rule__Binop__Alternatives_3 : ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) );
    public final void rule__Binop__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:624:1: ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==61) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("620:1: rule__Binop__Alternatives_3 : ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:625:1: ( ( rule__Binop__Arg2Assignment_3_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:625:1: ( ( rule__Binop__Arg2Assignment_3_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:626:1: ( rule__Binop__Arg2Assignment_3_0 )
                    {
                     before(grammarAccess.getBinopAccess().getArg2Assignment_3_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:627:1: ( rule__Binop__Arg2Assignment_3_0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:627:2: rule__Binop__Arg2Assignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Binop__Arg2Assignment_3_0_in_rule__Binop__Alternatives_31283);
                    rule__Binop__Arg2Assignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBinopAccess().getArg2Assignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:631:6: ( ( rule__Binop__ValAssignment_3_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:631:6: ( ( rule__Binop__ValAssignment_3_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:632:1: ( rule__Binop__ValAssignment_3_1 )
                    {
                     before(grammarAccess.getBinopAccess().getValAssignment_3_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:633:1: ( rule__Binop__ValAssignment_3_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:633:2: rule__Binop__ValAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Binop__ValAssignment_3_1_in_rule__Binop__Alternatives_31301);
                    rule__Binop__ValAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBinopAccess().getValAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Alternatives_3


    // $ANTLR start rule__Move__Alternatives_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:642:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:646:1: ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==61) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("642:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:647:1: ( ( rule__Move__FromAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:647:1: ( ( rule__Move__FromAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:648:1: ( rule__Move__FromAssignment_2_0 )
                    {
                     before(grammarAccess.getMoveAccess().getFromAssignment_2_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:649:1: ( rule__Move__FromAssignment_2_0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:649:2: rule__Move__FromAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Move__FromAssignment_2_0_in_rule__Move__Alternatives_21334);
                    rule__Move__FromAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getFromAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:653:6: ( ( rule__Move__ValAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:653:6: ( ( rule__Move__ValAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:654:1: ( rule__Move__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getMoveAccess().getValAssignment_2_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:655:1: ( rule__Move__ValAssignment_2_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:655:2: rule__Move__ValAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Move__ValAssignment_2_1_in_rule__Move__Alternatives_21352);
                    rule__Move__ValAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getValAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__Alternatives_2


    // $ANTLR start rule__Read__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:664:1: rule__Read__Alternatives : ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) );
    public final void rule__Read__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:668:1: ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==61) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("664:1: rule__Read__Alternatives : ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:669:1: ( ( rule__Read__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:669:1: ( ( rule__Read__Group_0__0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:670:1: ( rule__Read__Group_0__0 )
                    {
                     before(grammarAccess.getReadAccess().getGroup_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:671:1: ( rule__Read__Group_0__0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:671:2: rule__Read__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Read__Group_0__0_in_rule__Read__Alternatives1385);
                    rule__Read__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getReadAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:675:6: ( ( rule__Read__RegAssignment_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:675:6: ( ( rule__Read__RegAssignment_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:676:1: ( rule__Read__RegAssignment_1 )
                    {
                     before(grammarAccess.getReadAccess().getRegAssignment_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:677:1: ( rule__Read__RegAssignment_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:677:2: rule__Read__RegAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Read__RegAssignment_1_in_rule__Read__Alternatives1403);
                    rule__Read__RegAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getReadAccess().getRegAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__Alternatives


    // $ANTLR start rule__Scope__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:686:1: rule__Scope__Alternatives : ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:690:1: ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("686:1: rule__Scope__Alternatives : ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:691:1: ( ( 'INPUT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:691:1: ( ( 'INPUT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:692:1: ( 'INPUT' )
                    {
                     before(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:693:1: ( 'INPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:693:3: 'INPUT'
                    {
                    match(input,14,FOLLOW_14_in_rule__Scope__Alternatives1437); 

                    }

                     after(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:698:6: ( ( 'OUTPUT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:698:6: ( ( 'OUTPUT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:699:1: ( 'OUTPUT' )
                    {
                     before(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:700:1: ( 'OUTPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:700:3: 'OUTPUT'
                    {
                    match(input,15,FOLLOW_15_in_rule__Scope__Alternatives1458); 

                    }

                     after(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:705:6: ( ( 'LOCAL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:705:6: ( ( 'LOCAL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:706:1: ( 'LOCAL' )
                    {
                     before(grammarAccess.getScopeAccess().getLocalEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:707:1: ( 'LOCAL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:707:3: 'LOCAL'
                    {
                    match(input,16,FOLLOW_16_in_rule__Scope__Alternatives1479); 

                    }

                     after(grammarAccess.getScopeAccess().getLocalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Scope__Alternatives


    // $ANTLR start rule__Operator__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:717:1: rule__Operator__Alternatives : ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:721:1: ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) )
            int alt7=26;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            case 25:
                {
                alt7=9;
                }
                break;
            case 26:
                {
                alt7=10;
                }
                break;
            case 27:
                {
                alt7=11;
                }
                break;
            case 28:
                {
                alt7=12;
                }
                break;
            case 29:
                {
                alt7=13;
                }
                break;
            case 30:
                {
                alt7=14;
                }
                break;
            case 31:
                {
                alt7=15;
                }
                break;
            case 32:
                {
                alt7=16;
                }
                break;
            case 33:
                {
                alt7=17;
                }
                break;
            case 34:
                {
                alt7=18;
                }
                break;
            case 35:
                {
                alt7=19;
                }
                break;
            case 36:
                {
                alt7=20;
                }
                break;
            case 37:
                {
                alt7=21;
                }
                break;
            case 38:
                {
                alt7=22;
                }
                break;
            case 39:
                {
                alt7=23;
                }
                break;
            case 40:
                {
                alt7=24;
                }
                break;
            case 41:
                {
                alt7=25;
                }
                break;
            case 42:
                {
                alt7=26;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("717:1: rule__Operator__Alternatives : ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:722:1: ( ( 'ADD' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:722:1: ( ( 'ADD' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:723:1: ( 'ADD' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:724:1: ( 'ADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:724:3: 'ADD'
                    {
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives1515); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:729:6: ( ( 'IADD' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:729:6: ( ( 'IADD' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:730:1: ( 'IADD' )
                    {
                     before(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:731:1: ( 'IADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:731:3: 'IADD'
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives1536); 

                    }

                     after(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:736:6: ( ( 'SUB' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:736:6: ( ( 'SUB' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:737:1: ( 'SUB' )
                    {
                     before(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:738:1: ( 'SUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:738:3: 'SUB'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives1557); 

                    }

                     after(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:743:6: ( ( 'MUL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:743:6: ( ( 'MUL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:744:1: ( 'MUL' )
                    {
                     before(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:745:1: ( 'MUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:745:3: 'MUL'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives1578); 

                    }

                     after(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:750:6: ( ( 'DIV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:750:6: ( ( 'DIV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:751:1: ( 'DIV' )
                    {
                     before(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:752:1: ( 'DIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:752:3: 'DIV'
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives1599); 

                    }

                     after(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:757:6: ( ( 'AND' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:757:6: ( ( 'AND' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:758:1: ( 'AND' )
                    {
                     before(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:759:1: ( 'AND' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:759:3: 'AND'
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives1620); 

                    }

                     after(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:764:6: ( ( 'OR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:764:6: ( ( 'OR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:765:1: ( 'OR' )
                    {
                     before(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:766:1: ( 'OR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:766:3: 'OR'
                    {
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives1641); 

                    }

                     after(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:771:6: ( ( 'XOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:771:6: ( ( 'XOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:772:1: ( 'XOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:773:1: ( 'XOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:773:3: 'XOR'
                    {
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives1662); 

                    }

                     after(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:778:6: ( ( 'LT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:778:6: ( ( 'LT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:779:1: ( 'LT' )
                    {
                     before(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:780:1: ( 'LT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:780:3: 'LT'
                    {
                    match(input,25,FOLLOW_25_in_rule__Operator__Alternatives1683); 

                    }

                     after(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:785:6: ( ( 'LE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:785:6: ( ( 'LE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:786:1: ( 'LE' )
                    {
                     before(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:787:1: ( 'LE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:787:3: 'LE'
                    {
                    match(input,26,FOLLOW_26_in_rule__Operator__Alternatives1704); 

                    }

                     after(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:792:6: ( ( 'EQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:792:6: ( ( 'EQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:793:1: ( 'EQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:794:1: ( 'EQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:794:3: 'EQ'
                    {
                    match(input,27,FOLLOW_27_in_rule__Operator__Alternatives1725); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:799:6: ( ( 'GE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:799:6: ( ( 'GE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:800:1: ( 'GE' )
                    {
                     before(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:801:1: ( 'GE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:801:3: 'GE'
                    {
                    match(input,28,FOLLOW_28_in_rule__Operator__Alternatives1746); 

                    }

                     after(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:806:6: ( ( 'GT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:806:6: ( ( 'GT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:807:1: ( 'GT' )
                    {
                     before(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:808:1: ( 'GT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:808:3: 'GT'
                    {
                    match(input,29,FOLLOW_29_in_rule__Operator__Alternatives1767); 

                    }

                     after(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:813:6: ( ( 'NEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:813:6: ( ( 'NEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:814:1: ( 'NEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:815:1: ( 'NEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:815:3: 'NEQ'
                    {
                    match(input,30,FOLLOW_30_in_rule__Operator__Alternatives1788); 

                    }

                     after(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:820:6: ( ( 'ISUB' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:820:6: ( ( 'ISUB' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:821:1: ( 'ISUB' )
                    {
                     before(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:822:1: ( 'ISUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:822:3: 'ISUB'
                    {
                    match(input,31,FOLLOW_31_in_rule__Operator__Alternatives1809); 

                    }

                     after(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:827:6: ( ( 'IMUL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:827:6: ( ( 'IMUL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:828:1: ( 'IMUL' )
                    {
                     before(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:829:1: ( 'IMUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:829:3: 'IMUL'
                    {
                    match(input,32,FOLLOW_32_in_rule__Operator__Alternatives1830); 

                    }

                     after(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:834:6: ( ( 'IDIV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:834:6: ( ( 'IDIV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:835:1: ( 'IDIV' )
                    {
                     before(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:836:1: ( 'IDIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:836:3: 'IDIV'
                    {
                    match(input,33,FOLLOW_33_in_rule__Operator__Alternatives1851); 

                    }

                     after(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:841:6: ( ( 'IAND' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:841:6: ( ( 'IAND' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:842:1: ( 'IAND' )
                    {
                     before(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:843:1: ( 'IAND' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:843:3: 'IAND'
                    {
                    match(input,34,FOLLOW_34_in_rule__Operator__Alternatives1872); 

                    }

                     after(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:848:6: ( ( 'IOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:848:6: ( ( 'IOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:849:1: ( 'IOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:850:1: ( 'IOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:850:3: 'IOR'
                    {
                    match(input,35,FOLLOW_35_in_rule__Operator__Alternatives1893); 

                    }

                     after(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:855:6: ( ( 'IXOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:855:6: ( ( 'IXOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:856:1: ( 'IXOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:857:1: ( 'IXOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:857:3: 'IXOR'
                    {
                    match(input,36,FOLLOW_36_in_rule__Operator__Alternatives1914); 

                    }

                     after(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:862:6: ( ( 'ILT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:862:6: ( ( 'ILT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:863:1: ( 'ILT' )
                    {
                     before(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:864:1: ( 'ILT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:864:3: 'ILT'
                    {
                    match(input,37,FOLLOW_37_in_rule__Operator__Alternatives1935); 

                    }

                     after(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:869:6: ( ( 'ILE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:869:6: ( ( 'ILE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:870:1: ( 'ILE' )
                    {
                     before(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:871:1: ( 'ILE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:871:3: 'ILE'
                    {
                    match(input,38,FOLLOW_38_in_rule__Operator__Alternatives1956); 

                    }

                     after(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:876:6: ( ( 'IEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:876:6: ( ( 'IEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:877:1: ( 'IEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:878:1: ( 'IEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:878:3: 'IEQ'
                    {
                    match(input,39,FOLLOW_39_in_rule__Operator__Alternatives1977); 

                    }

                     after(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:883:6: ( ( 'IGE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:883:6: ( ( 'IGE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:884:1: ( 'IGE' )
                    {
                     before(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:885:1: ( 'IGE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:885:3: 'IGE'
                    {
                    match(input,40,FOLLOW_40_in_rule__Operator__Alternatives1998); 

                    }

                     after(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:890:6: ( ( 'IGT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:890:6: ( ( 'IGT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:891:1: ( 'IGT' )
                    {
                     before(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:892:1: ( 'IGT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:892:3: 'IGT'
                    {
                    match(input,41,FOLLOW_41_in_rule__Operator__Alternatives2019); 

                    }

                     after(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:897:6: ( ( 'INEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:897:6: ( ( 'INEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:898:1: ( 'INEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getIneqEnumLiteralDeclaration_25()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:899:1: ( 'INEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:899:3: 'INEQ'
                    {
                    match(input,42,FOLLOW_42_in_rule__Operator__Alternatives2040); 

                    }

                     after(grammarAccess.getOperatorAccess().getIneqEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Operator__Alternatives


    // $ANTLR start rule__JumpKind__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:909:1: rule__JumpKind__Alternatives : ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) );
    public final void rule__JumpKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:913:1: ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            case 46:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("909:1: rule__JumpKind__Alternatives : ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:914:1: ( ( 'JT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:914:1: ( ( 'JT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:915:1: ( 'JT' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:916:1: ( 'JT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:916:3: 'JT'
                    {
                    match(input,43,FOLLOW_43_in_rule__JumpKind__Alternatives2076); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:921:6: ( ( 'JF' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:921:6: ( ( 'JF' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:922:1: ( 'JF' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:923:1: ( 'JF' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:923:3: 'JF'
                    {
                    match(input,44,FOLLOW_44_in_rule__JumpKind__Alternatives2097); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:928:6: ( ( 'JZ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:928:6: ( ( 'JZ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:929:1: ( 'JZ' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:930:1: ( 'JZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:930:3: 'JZ'
                    {
                    match(input,45,FOLLOW_45_in_rule__JumpKind__Alternatives2118); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:935:6: ( ( 'JNZ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:935:6: ( ( 'JNZ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:936:1: ( 'JNZ' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJnzEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:937:1: ( 'JNZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:937:3: 'JNZ'
                    {
                    match(input,46,FOLLOW_46_in_rule__JumpKind__Alternatives2139); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJnzEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__JumpKind__Alternatives


    // $ANTLR start rule__MoveKind__Alternatives
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:947:1: rule__MoveKind__Alternatives : ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) );
    public final void rule__MoveKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:951:1: ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 49:
                {
                alt9=3;
                }
                break;
            case 50:
                {
                alt9=4;
                }
                break;
            case 51:
                {
                alt9=5;
                }
                break;
            case 52:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("947:1: rule__MoveKind__Alternatives : ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:952:1: ( ( 'CVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:952:1: ( ( 'CVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:953:1: ( 'CVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:954:1: ( 'CVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:954:3: 'CVMOV'
                    {
                    match(input,47,FOLLOW_47_in_rule__MoveKind__Alternatives2175); 

                    }

                     after(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:959:6: ( ( 'VCMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:959:6: ( ( 'VCMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:960:1: ( 'VCMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:961:1: ( 'VCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:961:3: 'VCMOV'
                    {
                    match(input,48,FOLLOW_48_in_rule__MoveKind__Alternatives2196); 

                    }

                     after(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:966:6: ( ( 'VVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:966:6: ( ( 'VVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:967:1: ( 'VVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:968:1: ( 'VVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:968:3: 'VVMOV'
                    {
                    match(input,49,FOLLOW_49_in_rule__MoveKind__Alternatives2217); 

                    }

                     after(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:973:6: ( ( 'CCMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:973:6: ( ( 'CCMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:974:1: ( 'CCMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:975:1: ( 'CCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:975:3: 'CCMOV'
                    {
                    match(input,50,FOLLOW_50_in_rule__MoveKind__Alternatives2238); 

                    }

                     after(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:980:6: ( ( 'IVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:980:6: ( ( 'IVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:981:1: ( 'IVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:982:1: ( 'IVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:982:3: 'IVMOV'
                    {
                    match(input,51,FOLLOW_51_in_rule__MoveKind__Alternatives2259); 

                    }

                     after(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:987:6: ( ( 'ICMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:987:6: ( ( 'ICMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:988:1: ( 'ICMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getIcmovEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:989:1: ( 'ICMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:989:3: 'ICMOV'
                    {
                    match(input,52,FOLLOW_52_in_rule__MoveKind__Alternatives2280); 

                    }

                     after(grammarAccess.getMoveKindAccess().getIcmovEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MoveKind__Alternatives


    // $ANTLR start rule__Line__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1001:1: rule__Line__Group__0 : ( ( rule__Line__Group_0__0 )* ) rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1005:1: ( ( ( rule__Line__Group_0__0 )* ) rule__Line__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1006:1: ( ( rule__Line__Group_0__0 )* ) rule__Line__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1006:1: ( ( rule__Line__Group_0__0 )* )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1007:1: ( rule__Line__Group_0__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1008:1: ( rule__Line__Group_0__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1008:2: rule__Line__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Line__Group_0__0_in_rule__Line__Group__02317);
            	    rule__Line__Group_0__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Line__Group__1_in_rule__Line__Group__02327);
            rule__Line__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group__0


    // $ANTLR start rule__Line__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1019:1: rule__Line__Group__1 : ( ( rule__Line__InstructionAssignment_1 ) ) ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1023:1: ( ( ( rule__Line__InstructionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1024:1: ( ( rule__Line__InstructionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1024:1: ( ( rule__Line__InstructionAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1025:1: ( rule__Line__InstructionAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getInstructionAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1026:1: ( rule__Line__InstructionAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1026:2: rule__Line__InstructionAssignment_1
            {
            pushFollow(FOLLOW_rule__Line__InstructionAssignment_1_in_rule__Line__Group__12355);
            rule__Line__InstructionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getInstructionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group__1


    // $ANTLR start rule__Line__Group_0__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1040:1: rule__Line__Group_0__0 : ( ( rule__Line__LabelsAssignment_0_0 ) ) rule__Line__Group_0__1 ;
    public final void rule__Line__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1044:1: ( ( ( rule__Line__LabelsAssignment_0_0 ) ) rule__Line__Group_0__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1045:1: ( ( rule__Line__LabelsAssignment_0_0 ) ) rule__Line__Group_0__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1045:1: ( ( rule__Line__LabelsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1046:1: ( rule__Line__LabelsAssignment_0_0 )
            {
             before(grammarAccess.getLineAccess().getLabelsAssignment_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1047:1: ( rule__Line__LabelsAssignment_0_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1047:2: rule__Line__LabelsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Line__LabelsAssignment_0_0_in_rule__Line__Group_0__02393);
            rule__Line__LabelsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getLabelsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__Line__Group_0__1_in_rule__Line__Group_0__02402);
            rule__Line__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group_0__0


    // $ANTLR start rule__Line__Group_0__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1058:1: rule__Line__Group_0__1 : ( ':' ) ;
    public final void rule__Line__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1062:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1063:1: ( ':' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1063:1: ( ':' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1064:1: ':'
            {
             before(grammarAccess.getLineAccess().getColonKeyword_0_1()); 
            match(input,53,FOLLOW_53_in_rule__Line__Group_0__12431); 
             after(grammarAccess.getLineAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__Group_0__1


    // $ANTLR start rule__Decl__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1081:1: rule__Decl__Group__0 : ( ( rule__Decl__ScopeAssignment_0 ) ) rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1085:1: ( ( ( rule__Decl__ScopeAssignment_0 ) ) rule__Decl__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1086:1: ( ( rule__Decl__ScopeAssignment_0 ) ) rule__Decl__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1086:1: ( ( rule__Decl__ScopeAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1087:1: ( rule__Decl__ScopeAssignment_0 )
            {
             before(grammarAccess.getDeclAccess().getScopeAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1088:1: ( rule__Decl__ScopeAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1088:2: rule__Decl__ScopeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decl__ScopeAssignment_0_in_rule__Decl__Group__02470);
            rule__Decl__ScopeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getScopeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02479);
            rule__Decl__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__Group__0


    // $ANTLR start rule__Decl__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1099:1: rule__Decl__Group__1 : ( ( rule__Decl__RegAssignment_1 ) ) ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1103:1: ( ( ( rule__Decl__RegAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1104:1: ( ( rule__Decl__RegAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1104:1: ( ( rule__Decl__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1105:1: ( rule__Decl__RegAssignment_1 )
            {
             before(grammarAccess.getDeclAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1106:1: ( rule__Decl__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1106:2: rule__Decl__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__Decl__RegAssignment_1_in_rule__Decl__Group__12507);
            rule__Decl__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getRegAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__Group__1


    // $ANTLR start rule__SetClk__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1120:1: rule__SetClk__Group__0 : ( 'SETCLK' ) rule__SetClk__Group__1 ;
    public final void rule__SetClk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1124:1: ( ( 'SETCLK' ) rule__SetClk__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1125:1: ( 'SETCLK' ) rule__SetClk__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1125:1: ( 'SETCLK' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1126:1: 'SETCLK'
            {
             before(grammarAccess.getSetClkAccess().getSETCLKKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SetClk__Group__02546); 
             after(grammarAccess.getSetClkAccess().getSETCLKKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SetClk__Group__1_in_rule__SetClk__Group__02556);
            rule__SetClk__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetClk__Group__0


    // $ANTLR start rule__SetClk__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1140:1: rule__SetClk__Group__1 : ( ( rule__SetClk__RegAssignment_1 ) ) rule__SetClk__Group__2 ;
    public final void rule__SetClk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1144:1: ( ( ( rule__SetClk__RegAssignment_1 ) ) rule__SetClk__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1145:1: ( ( rule__SetClk__RegAssignment_1 ) ) rule__SetClk__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1145:1: ( ( rule__SetClk__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1146:1: ( rule__SetClk__RegAssignment_1 )
            {
             before(grammarAccess.getSetClkAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1147:1: ( rule__SetClk__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1147:2: rule__SetClk__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__SetClk__RegAssignment_1_in_rule__SetClk__Group__12584);
            rule__SetClk__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSetClkAccess().getRegAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SetClk__Group__2_in_rule__SetClk__Group__12593);
            rule__SetClk__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetClk__Group__1


    // $ANTLR start rule__SetClk__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1158:1: rule__SetClk__Group__2 : ( ( rule__SetClk__ClkAssignment_2 ) ) ;
    public final void rule__SetClk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1162:1: ( ( ( rule__SetClk__ClkAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1163:1: ( ( rule__SetClk__ClkAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1163:1: ( ( rule__SetClk__ClkAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1164:1: ( rule__SetClk__ClkAssignment_2 )
            {
             before(grammarAccess.getSetClkAccess().getClkAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1165:1: ( rule__SetClk__ClkAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1165:2: rule__SetClk__ClkAssignment_2
            {
            pushFollow(FOLLOW_rule__SetClk__ClkAssignment_2_in_rule__SetClk__Group__22621);
            rule__SetClk__ClkAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSetClkAccess().getClkAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetClk__Group__2


    // $ANTLR start rule__SetPC__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1181:1: rule__SetPC__Group__0 : ( 'SETPC' ) rule__SetPC__Group__1 ;
    public final void rule__SetPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1185:1: ( ( 'SETPC' ) rule__SetPC__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1186:1: ( 'SETPC' ) rule__SetPC__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1186:1: ( 'SETPC' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1187:1: 'SETPC'
            {
             before(grammarAccess.getSetPCAccess().getSETPCKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__SetPC__Group__02662); 
             after(grammarAccess.getSetPCAccess().getSETPCKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__SetPC__Group__1_in_rule__SetPC__Group__02672);
            rule__SetPC__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetPC__Group__0


    // $ANTLR start rule__SetPC__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1201:1: rule__SetPC__Group__1 : ( ( rule__SetPC__RegAssignment_1 ) ) rule__SetPC__Group__2 ;
    public final void rule__SetPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1205:1: ( ( ( rule__SetPC__RegAssignment_1 ) ) rule__SetPC__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1206:1: ( ( rule__SetPC__RegAssignment_1 ) ) rule__SetPC__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1206:1: ( ( rule__SetPC__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1207:1: ( rule__SetPC__RegAssignment_1 )
            {
             before(grammarAccess.getSetPCAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1208:1: ( rule__SetPC__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1208:2: rule__SetPC__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__SetPC__RegAssignment_1_in_rule__SetPC__Group__12700);
            rule__SetPC__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSetPCAccess().getRegAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__SetPC__Group__2_in_rule__SetPC__Group__12709);
            rule__SetPC__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetPC__Group__1


    // $ANTLR start rule__SetPC__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1219:1: rule__SetPC__Group__2 : ( ( rule__SetPC__LabelAssignment_2 ) ) ;
    public final void rule__SetPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1223:1: ( ( ( rule__SetPC__LabelAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1224:1: ( ( rule__SetPC__LabelAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1224:1: ( ( rule__SetPC__LabelAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1225:1: ( rule__SetPC__LabelAssignment_2 )
            {
             before(grammarAccess.getSetPCAccess().getLabelAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1226:1: ( rule__SetPC__LabelAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1226:2: rule__SetPC__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__SetPC__LabelAssignment_2_in_rule__SetPC__Group__22737);
            rule__SetPC__LabelAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSetPCAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetPC__Group__2


    // $ANTLR start rule__Prio__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1242:1: rule__Prio__Group__0 : ( 'PRIO' ) rule__Prio__Group__1 ;
    public final void rule__Prio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1246:1: ( ( 'PRIO' ) rule__Prio__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1247:1: ( 'PRIO' ) rule__Prio__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1247:1: ( 'PRIO' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1248:1: 'PRIO'
            {
             before(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__Prio__Group__02778); 
             after(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__02788);
            rule__Prio__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group__0


    // $ANTLR start rule__Prio__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1262:1: rule__Prio__Group__1 : ( ( rule__Prio__RegAssignment_1 )? ) rule__Prio__Group__2 ;
    public final void rule__Prio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1266:1: ( ( ( rule__Prio__RegAssignment_1 )? ) rule__Prio__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1267:1: ( ( rule__Prio__RegAssignment_1 )? ) rule__Prio__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1267:1: ( ( rule__Prio__RegAssignment_1 )? )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1268:1: ( rule__Prio__RegAssignment_1 )?
            {
             before(grammarAccess.getPrioAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1269:1: ( rule__Prio__RegAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1269:2: rule__Prio__RegAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Prio__RegAssignment_1_in_rule__Prio__Group__12816);
                    rule__Prio__RegAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrioAccess().getRegAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__12826);
            rule__Prio__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group__1


    // $ANTLR start rule__Prio__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1280:1: rule__Prio__Group__2 : ( ( rule__Prio__PrioAssignment_2 ) ) ;
    public final void rule__Prio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1284:1: ( ( ( rule__Prio__PrioAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1285:1: ( ( rule__Prio__PrioAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1285:1: ( ( rule__Prio__PrioAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1286:1: ( rule__Prio__PrioAssignment_2 )
            {
             before(grammarAccess.getPrioAccess().getPrioAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1287:1: ( rule__Prio__PrioAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1287:2: rule__Prio__PrioAssignment_2
            {
            pushFollow(FOLLOW_rule__Prio__PrioAssignment_2_in_rule__Prio__Group__22854);
            rule__Prio__PrioAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getPrioAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group__2


    // $ANTLR start rule__Done__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1303:1: rule__Done__Group__0 : ( 'DONE' ) rule__Done__Group__1 ;
    public final void rule__Done__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1307:1: ( ( 'DONE' ) rule__Done__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1308:1: ( 'DONE' ) rule__Done__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1308:1: ( 'DONE' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1309:1: 'DONE'
            {
             before(grammarAccess.getDoneAccess().getDONEKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Done__Group__02895); 
             after(grammarAccess.getDoneAccess().getDONEKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Done__Group__1_in_rule__Done__Group__02905);
            rule__Done__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Done__Group__0


    // $ANTLR start rule__Done__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1323:1: rule__Done__Group__1 : ( ( rule__Done__PcAssignment_1 ) ) ;
    public final void rule__Done__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1327:1: ( ( ( rule__Done__PcAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1328:1: ( ( rule__Done__PcAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1328:1: ( ( rule__Done__PcAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1329:1: ( rule__Done__PcAssignment_1 )
            {
             before(grammarAccess.getDoneAccess().getPcAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1330:1: ( rule__Done__PcAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1330:2: rule__Done__PcAssignment_1
            {
            pushFollow(FOLLOW_rule__Done__PcAssignment_1_in_rule__Done__Group__12933);
            rule__Done__PcAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDoneAccess().getPcAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Done__Group__1


    // $ANTLR start rule__Binop__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1344:1: rule__Binop__Group__0 : ( ( rule__Binop__OpAssignment_0 ) ) rule__Binop__Group__1 ;
    public final void rule__Binop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1348:1: ( ( ( rule__Binop__OpAssignment_0 ) ) rule__Binop__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1349:1: ( ( rule__Binop__OpAssignment_0 ) ) rule__Binop__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1349:1: ( ( rule__Binop__OpAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1350:1: ( rule__Binop__OpAssignment_0 )
            {
             before(grammarAccess.getBinopAccess().getOpAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1351:1: ( rule__Binop__OpAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1351:2: rule__Binop__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__Binop__OpAssignment_0_in_rule__Binop__Group__02971);
            rule__Binop__OpAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getOpAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Binop__Group__1_in_rule__Binop__Group__02980);
            rule__Binop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Group__0


    // $ANTLR start rule__Binop__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1362:1: rule__Binop__Group__1 : ( ( rule__Binop__ToAssignment_1 ) ) rule__Binop__Group__2 ;
    public final void rule__Binop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1366:1: ( ( ( rule__Binop__ToAssignment_1 ) ) rule__Binop__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1367:1: ( ( rule__Binop__ToAssignment_1 ) ) rule__Binop__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1367:1: ( ( rule__Binop__ToAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1368:1: ( rule__Binop__ToAssignment_1 )
            {
             before(grammarAccess.getBinopAccess().getToAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1369:1: ( rule__Binop__ToAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1369:2: rule__Binop__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Binop__ToAssignment_1_in_rule__Binop__Group__13008);
            rule__Binop__ToAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getToAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Binop__Group__2_in_rule__Binop__Group__13017);
            rule__Binop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Group__1


    // $ANTLR start rule__Binop__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1380:1: rule__Binop__Group__2 : ( ( rule__Binop__Arg1Assignment_2 ) ) rule__Binop__Group__3 ;
    public final void rule__Binop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1384:1: ( ( ( rule__Binop__Arg1Assignment_2 ) ) rule__Binop__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1385:1: ( ( rule__Binop__Arg1Assignment_2 ) ) rule__Binop__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1385:1: ( ( rule__Binop__Arg1Assignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1386:1: ( rule__Binop__Arg1Assignment_2 )
            {
             before(grammarAccess.getBinopAccess().getArg1Assignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1387:1: ( rule__Binop__Arg1Assignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1387:2: rule__Binop__Arg1Assignment_2
            {
            pushFollow(FOLLOW_rule__Binop__Arg1Assignment_2_in_rule__Binop__Group__23045);
            rule__Binop__Arg1Assignment_2();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getArg1Assignment_2()); 

            }

            pushFollow(FOLLOW_rule__Binop__Group__3_in_rule__Binop__Group__23054);
            rule__Binop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Group__2


    // $ANTLR start rule__Binop__Group__3
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1398:1: rule__Binop__Group__3 : ( ( rule__Binop__Alternatives_3 ) ) ;
    public final void rule__Binop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1402:1: ( ( ( rule__Binop__Alternatives_3 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1403:1: ( ( rule__Binop__Alternatives_3 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1403:1: ( ( rule__Binop__Alternatives_3 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1404:1: ( rule__Binop__Alternatives_3 )
            {
             before(grammarAccess.getBinopAccess().getAlternatives_3()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1405:1: ( rule__Binop__Alternatives_3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1405:2: rule__Binop__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Binop__Alternatives_3_in_rule__Binop__Group__33082);
            rule__Binop__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Group__3


    // $ANTLR start rule__Jmp__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1423:1: rule__Jmp__Group__0 : ( 'JMP' ) rule__Jmp__Group__1 ;
    public final void rule__Jmp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1427:1: ( ( 'JMP' ) rule__Jmp__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1428:1: ( 'JMP' ) rule__Jmp__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1428:1: ( 'JMP' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1429:1: 'JMP'
            {
             before(grammarAccess.getJmpAccess().getJMPKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__Jmp__Group__03125); 
             after(grammarAccess.getJmpAccess().getJMPKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Jmp__Group__1_in_rule__Jmp__Group__03135);
            rule__Jmp__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Jmp__Group__0


    // $ANTLR start rule__Jmp__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1443:1: rule__Jmp__Group__1 : ( ( rule__Jmp__LabelAssignment_1 ) ) ;
    public final void rule__Jmp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1447:1: ( ( ( rule__Jmp__LabelAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1448:1: ( ( rule__Jmp__LabelAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1448:1: ( ( rule__Jmp__LabelAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1449:1: ( rule__Jmp__LabelAssignment_1 )
            {
             before(grammarAccess.getJmpAccess().getLabelAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1450:1: ( rule__Jmp__LabelAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1450:2: rule__Jmp__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Jmp__LabelAssignment_1_in_rule__Jmp__Group__13163);
            rule__Jmp__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getJmpAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Jmp__Group__1


    // $ANTLR start rule__CJmp__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1464:1: rule__CJmp__Group__0 : ( ( rule__CJmp__CondAssignment_0 ) ) rule__CJmp__Group__1 ;
    public final void rule__CJmp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1468:1: ( ( ( rule__CJmp__CondAssignment_0 ) ) rule__CJmp__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1469:1: ( ( rule__CJmp__CondAssignment_0 ) ) rule__CJmp__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1469:1: ( ( rule__CJmp__CondAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1470:1: ( rule__CJmp__CondAssignment_0 )
            {
             before(grammarAccess.getCJmpAccess().getCondAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1471:1: ( rule__CJmp__CondAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1471:2: rule__CJmp__CondAssignment_0
            {
            pushFollow(FOLLOW_rule__CJmp__CondAssignment_0_in_rule__CJmp__Group__03201);
            rule__CJmp__CondAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getCondAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__CJmp__Group__1_in_rule__CJmp__Group__03210);
            rule__CJmp__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__Group__0


    // $ANTLR start rule__CJmp__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1482:1: rule__CJmp__Group__1 : ( ( rule__CJmp__RegAssignment_1 ) ) rule__CJmp__Group__2 ;
    public final void rule__CJmp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1486:1: ( ( ( rule__CJmp__RegAssignment_1 ) ) rule__CJmp__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1487:1: ( ( rule__CJmp__RegAssignment_1 ) ) rule__CJmp__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1487:1: ( ( rule__CJmp__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1488:1: ( rule__CJmp__RegAssignment_1 )
            {
             before(grammarAccess.getCJmpAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1489:1: ( rule__CJmp__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1489:2: rule__CJmp__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__CJmp__RegAssignment_1_in_rule__CJmp__Group__13238);
            rule__CJmp__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getRegAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__CJmp__Group__2_in_rule__CJmp__Group__13247);
            rule__CJmp__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__Group__1


    // $ANTLR start rule__CJmp__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1500:1: rule__CJmp__Group__2 : ( ( rule__CJmp__LabelAssignment_2 ) ) ;
    public final void rule__CJmp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1504:1: ( ( ( rule__CJmp__LabelAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1505:1: ( ( rule__CJmp__LabelAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1505:1: ( ( rule__CJmp__LabelAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1506:1: ( rule__CJmp__LabelAssignment_2 )
            {
             before(grammarAccess.getCJmpAccess().getLabelAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1507:1: ( rule__CJmp__LabelAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1507:2: rule__CJmp__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__CJmp__LabelAssignment_2_in_rule__CJmp__Group__23275);
            rule__CJmp__LabelAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__Group__2


    // $ANTLR start rule__Move__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1523:1: rule__Move__Group__0 : ( ( rule__Move__TypeAssignment_0 ) ) rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1527:1: ( ( ( rule__Move__TypeAssignment_0 ) ) rule__Move__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1528:1: ( ( rule__Move__TypeAssignment_0 ) ) rule__Move__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1528:1: ( ( rule__Move__TypeAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1529:1: ( rule__Move__TypeAssignment_0 )
            {
             before(grammarAccess.getMoveAccess().getTypeAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1530:1: ( rule__Move__TypeAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1530:2: rule__Move__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Move__TypeAssignment_0_in_rule__Move__Group__03315);
            rule__Move__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03324);
            rule__Move__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__Group__0


    // $ANTLR start rule__Move__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1541:1: rule__Move__Group__1 : ( ( rule__Move__ToAssignment_1 ) ) rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1545:1: ( ( ( rule__Move__ToAssignment_1 ) ) rule__Move__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1546:1: ( ( rule__Move__ToAssignment_1 ) ) rule__Move__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1546:1: ( ( rule__Move__ToAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1547:1: ( rule__Move__ToAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1548:1: ( rule__Move__ToAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1548:2: rule__Move__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Move__ToAssignment_1_in_rule__Move__Group__13352);
            rule__Move__ToAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getToAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13361);
            rule__Move__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__Group__1


    // $ANTLR start rule__Move__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1559:1: rule__Move__Group__2 : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1563:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1564:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1564:1: ( ( rule__Move__Alternatives_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1565:1: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1566:1: ( rule__Move__Alternatives_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1566:2: rule__Move__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Move__Alternatives_2_in_rule__Move__Group__23389);
            rule__Move__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__Group__2


    // $ANTLR start rule__Read__Group_0__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1582:1: rule__Read__Group_0__0 : ( ( rule__Read__PreAssignment_0_0 ) ) rule__Read__Group_0__1 ;
    public final void rule__Read__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1586:1: ( ( ( rule__Read__PreAssignment_0_0 ) ) rule__Read__Group_0__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1587:1: ( ( rule__Read__PreAssignment_0_0 ) ) rule__Read__Group_0__1
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1587:1: ( ( rule__Read__PreAssignment_0_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1588:1: ( rule__Read__PreAssignment_0_0 )
            {
             before(grammarAccess.getReadAccess().getPreAssignment_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1589:1: ( rule__Read__PreAssignment_0_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1589:2: rule__Read__PreAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Read__PreAssignment_0_0_in_rule__Read__Group_0__03429);
            rule__Read__PreAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getReadAccess().getPreAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__Read__Group_0__1_in_rule__Read__Group_0__03438);
            rule__Read__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__Group_0__0


    // $ANTLR start rule__Read__Group_0__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1600:1: rule__Read__Group_0__1 : ( '(' ) rule__Read__Group_0__2 ;
    public final void rule__Read__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1604:1: ( ( '(' ) rule__Read__Group_0__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1605:1: ( '(' ) rule__Read__Group_0__2
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1605:1: ( '(' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1606:1: '('
            {
             before(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,59,FOLLOW_59_in_rule__Read__Group_0__13467); 
             after(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1()); 

            }

            pushFollow(FOLLOW_rule__Read__Group_0__2_in_rule__Read__Group_0__13477);
            rule__Read__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__Group_0__1


    // $ANTLR start rule__Read__Group_0__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1620:1: rule__Read__Group_0__2 : ( ( rule__Read__RegAssignment_0_2 ) ) rule__Read__Group_0__3 ;
    public final void rule__Read__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1624:1: ( ( ( rule__Read__RegAssignment_0_2 ) ) rule__Read__Group_0__3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1625:1: ( ( rule__Read__RegAssignment_0_2 ) ) rule__Read__Group_0__3
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1625:1: ( ( rule__Read__RegAssignment_0_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1626:1: ( rule__Read__RegAssignment_0_2 )
            {
             before(grammarAccess.getReadAccess().getRegAssignment_0_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1627:1: ( rule__Read__RegAssignment_0_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1627:2: rule__Read__RegAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Read__RegAssignment_0_2_in_rule__Read__Group_0__23505);
            rule__Read__RegAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getReadAccess().getRegAssignment_0_2()); 

            }

            pushFollow(FOLLOW_rule__Read__Group_0__3_in_rule__Read__Group_0__23514);
            rule__Read__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__Group_0__2


    // $ANTLR start rule__Read__Group_0__3
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1638:1: rule__Read__Group_0__3 : ( ')' ) ;
    public final void rule__Read__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1642:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1643:1: ( ')' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1643:1: ( ')' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1644:1: ')'
            {
             before(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3()); 
            match(input,60,FOLLOW_60_in_rule__Read__Group_0__33543); 
             after(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__Group_0__3


    // $ANTLR start rule__KLP__InstructionsAssignment
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1666:1: rule__KLP__InstructionsAssignment : ( ruleLine ) ;
    public final void rule__KLP__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1670:1: ( ( ruleLine ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1671:1: ( ruleLine )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1671:1: ( ruleLine )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1672:1: ruleLine
            {
             before(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__KLP__InstructionsAssignment3587);
            ruleLine();
            _fsp--;

             after(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KLP__InstructionsAssignment


    // $ANTLR start rule__Line__LabelsAssignment_0_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1681:1: rule__Line__LabelsAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Line__LabelsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1685:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1686:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1686:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1687:1: RULE_ID
            {
             before(grammarAccess.getLineAccess().getLabelsIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Line__LabelsAssignment_0_03618); 
             after(grammarAccess.getLineAccess().getLabelsIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__LabelsAssignment_0_0


    // $ANTLR start rule__Line__InstructionAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1696:1: rule__Line__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Line__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1700:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1701:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1701:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1702:1: ruleInstruction
            {
             before(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Line__InstructionAssignment_13649);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Line__InstructionAssignment_1


    // $ANTLR start rule__Decl__ScopeAssignment_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1711:1: rule__Decl__ScopeAssignment_0 : ( ruleScope ) ;
    public final void rule__Decl__ScopeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1715:1: ( ( ruleScope ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1716:1: ( ruleScope )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1716:1: ( ruleScope )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1717:1: ruleScope
            {
             before(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScope_in_rule__Decl__ScopeAssignment_03680);
            ruleScope();
            _fsp--;

             after(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__ScopeAssignment_0


    // $ANTLR start rule__Decl__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1726:1: rule__Decl__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Decl__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1730:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1731:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1731:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1732:1: ruleReg
            {
             before(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Decl__RegAssignment_13711);
            ruleReg();
            _fsp--;

             after(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__RegAssignment_1


    // $ANTLR start rule__SetClk__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1741:1: rule__SetClk__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__SetClk__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1745:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1746:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1746:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1747:1: ruleReg
            {
             before(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetClk__RegAssignment_13742);
            ruleReg();
            _fsp--;

             after(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetClk__RegAssignment_1


    // $ANTLR start rule__SetClk__ClkAssignment_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1756:1: rule__SetClk__ClkAssignment_2 : ( ruleReg ) ;
    public final void rule__SetClk__ClkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1760:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1761:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1761:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1762:1: ruleReg
            {
             before(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetClk__ClkAssignment_23773);
            ruleReg();
            _fsp--;

             after(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetClk__ClkAssignment_2


    // $ANTLR start rule__SetPC__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1771:1: rule__SetPC__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__SetPC__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1775:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1776:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1776:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1777:1: ruleReg
            {
             before(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetPC__RegAssignment_13804);
            ruleReg();
            _fsp--;

             after(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetPC__RegAssignment_1


    // $ANTLR start rule__SetPC__LabelAssignment_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1786:1: rule__SetPC__LabelAssignment_2 : ( ruleLabel ) ;
    public final void rule__SetPC__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1790:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1791:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1791:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1792:1: ruleLabel
            {
             before(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__SetPC__LabelAssignment_23835);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SetPC__LabelAssignment_2


    // $ANTLR start rule__Prio__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1801:1: rule__Prio__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Prio__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1805:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1806:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1806:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1807:1: ruleReg
            {
             before(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Prio__RegAssignment_13866);
            ruleReg();
            _fsp--;

             after(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__RegAssignment_1


    // $ANTLR start rule__Prio__PrioAssignment_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1816:1: rule__Prio__PrioAssignment_2 : ( RULE_INT ) ;
    public final void rule__Prio__PrioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1820:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1821:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1821:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1822:1: RULE_INT
            {
             before(grammarAccess.getPrioAccess().getPrioINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Prio__PrioAssignment_23897); 
             after(grammarAccess.getPrioAccess().getPrioINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__PrioAssignment_2


    // $ANTLR start rule__Done__PcAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1831:1: rule__Done__PcAssignment_1 : ( ruleLabel ) ;
    public final void rule__Done__PcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1835:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1836:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1836:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1837:1: ruleLabel
            {
             before(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Done__PcAssignment_13928);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Done__PcAssignment_1


    // $ANTLR start rule__Binop__OpAssignment_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1846:1: rule__Binop__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__Binop__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1850:1: ( ( ruleOperator ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1851:1: ( ruleOperator )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1851:1: ( ruleOperator )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1852:1: ruleOperator
            {
             before(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Binop__OpAssignment_03959);
            ruleOperator();
            _fsp--;

             after(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__OpAssignment_0


    // $ANTLR start rule__Binop__ToAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1861:1: rule__Binop__ToAssignment_1 : ( ruleReg ) ;
    public final void rule__Binop__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1865:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1866:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1866:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1867:1: ruleReg
            {
             before(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Binop__ToAssignment_13990);
            ruleReg();
            _fsp--;

             after(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__ToAssignment_1


    // $ANTLR start rule__Binop__Arg1Assignment_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1876:1: rule__Binop__Arg1Assignment_2 : ( ruleRead ) ;
    public final void rule__Binop__Arg1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1880:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1881:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1881:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1882:1: ruleRead
            {
             before(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Binop__Arg1Assignment_24021);
            ruleRead();
            _fsp--;

             after(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Arg1Assignment_2


    // $ANTLR start rule__Binop__Arg2Assignment_3_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1891:1: rule__Binop__Arg2Assignment_3_0 : ( ruleRead ) ;
    public final void rule__Binop__Arg2Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1895:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1896:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1896:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1897:1: ruleRead
            {
             before(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Binop__Arg2Assignment_3_04052);
            ruleRead();
            _fsp--;

             after(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__Arg2Assignment_3_0


    // $ANTLR start rule__Binop__ValAssignment_3_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1906:1: rule__Binop__ValAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Binop__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1910:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1911:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1911:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1912:1: RULE_INT
            {
             before(grammarAccess.getBinopAccess().getValINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Binop__ValAssignment_3_14083); 
             after(grammarAccess.getBinopAccess().getValINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Binop__ValAssignment_3_1


    // $ANTLR start rule__Jmp__LabelAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1921:1: rule__Jmp__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Jmp__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1925:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1926:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1926:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1927:1: ruleLabel
            {
             before(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Jmp__LabelAssignment_14114);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Jmp__LabelAssignment_1


    // $ANTLR start rule__CJmp__CondAssignment_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1936:1: rule__CJmp__CondAssignment_0 : ( ruleJumpKind ) ;
    public final void rule__CJmp__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1940:1: ( ( ruleJumpKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1941:1: ( ruleJumpKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1941:1: ( ruleJumpKind )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1942:1: ruleJumpKind
            {
             before(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJumpKind_in_rule__CJmp__CondAssignment_04145);
            ruleJumpKind();
            _fsp--;

             after(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__CondAssignment_0


    // $ANTLR start rule__CJmp__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1951:1: rule__CJmp__RegAssignment_1 : ( ruleRead ) ;
    public final void rule__CJmp__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1955:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1956:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1956:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1957:1: ruleRead
            {
             before(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__CJmp__RegAssignment_14176);
            ruleRead();
            _fsp--;

             after(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__RegAssignment_1


    // $ANTLR start rule__CJmp__LabelAssignment_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1966:1: rule__CJmp__LabelAssignment_2 : ( ruleLabel ) ;
    public final void rule__CJmp__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1970:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1971:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1971:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1972:1: ruleLabel
            {
             before(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__CJmp__LabelAssignment_24207);
            ruleLabel();
            _fsp--;

             after(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CJmp__LabelAssignment_2


    // $ANTLR start rule__Move__TypeAssignment_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1981:1: rule__Move__TypeAssignment_0 : ( ruleMoveKind ) ;
    public final void rule__Move__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1985:1: ( ( ruleMoveKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1986:1: ( ruleMoveKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1986:1: ( ruleMoveKind )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1987:1: ruleMoveKind
            {
             before(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMoveKind_in_rule__Move__TypeAssignment_04238);
            ruleMoveKind();
            _fsp--;

             after(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__TypeAssignment_0


    // $ANTLR start rule__Move__ToAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1996:1: rule__Move__ToAssignment_1 : ( ruleReg ) ;
    public final void rule__Move__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2000:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2001:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2001:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2002:1: ruleReg
            {
             before(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Move__ToAssignment_14269);
            ruleReg();
            _fsp--;

             after(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__ToAssignment_1


    // $ANTLR start rule__Move__FromAssignment_2_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2011:1: rule__Move__FromAssignment_2_0 : ( ruleRead ) ;
    public final void rule__Move__FromAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2015:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2016:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2016:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2017:1: ruleRead
            {
             before(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Move__FromAssignment_2_04300);
            ruleRead();
            _fsp--;

             after(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__FromAssignment_2_0


    // $ANTLR start rule__Move__ValAssignment_2_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2026:1: rule__Move__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Move__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2030:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2031:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2031:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2032:1: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getValINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Move__ValAssignment_2_14331); 
             after(grammarAccess.getMoveAccess().getValINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Move__ValAssignment_2_1


    // $ANTLR start rule__Label__NameAssignment
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2041:1: rule__Label__NameAssignment : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2045:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2046:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2046:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2047:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment4362); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Label__NameAssignment


    // $ANTLR start rule__Reg__NameAssignment
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2056:1: rule__Reg__NameAssignment : ( RULE_ID ) ;
    public final void rule__Reg__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2060:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2061:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2061:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2062:1: RULE_ID
            {
             before(grammarAccess.getRegAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reg__NameAssignment4393); 
             after(grammarAccess.getRegAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Reg__NameAssignment


    // $ANTLR start rule__Read__PreAssignment_0_0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2071:1: rule__Read__PreAssignment_0_0 : ( ( 'pre' ) ) ;
    public final void rule__Read__PreAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2075:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2076:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2076:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2077:1: ( 'pre' )
            {
             before(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2078:1: ( 'pre' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2079:1: 'pre'
            {
             before(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 
            match(input,61,FOLLOW_61_in_rule__Read__PreAssignment_0_04429); 
             after(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 

            }

             after(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__PreAssignment_0_0


    // $ANTLR start rule__Read__RegAssignment_0_2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2094:1: rule__Read__RegAssignment_0_2 : ( ruleReg ) ;
    public final void rule__Read__RegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2098:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2099:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2099:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2100:1: ruleReg
            {
             before(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Read__RegAssignment_0_24468);
            ruleReg();
            _fsp--;

             after(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__RegAssignment_0_2


    // $ANTLR start rule__Read__RegAssignment_1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2109:1: rule__Read__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Read__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2113:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2114:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2114:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2115:1: ruleReg
            {
             before(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Read__RegAssignment_14499);
            ruleReg();
            _fsp--;

             after(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Read__RegAssignment_1


 

    public static final BitSet FOLLOW_ruleKLP_in_entryRuleKLP61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKLP68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KLP__InstructionsAssignment_in_ruleKLP94 = new BitSet(new long[]{0x07DFFFFFFFFFC012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group__0_in_ruleLine155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0_in_ruleDecl275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_entryRuleSetClk302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClk309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__Group__0_in_ruleSetClk335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_entryRuleSetPC362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetPC369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__Group__0_in_ruleSetPC395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0_in_rulePrio455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_entryRuleDone482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDone489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Done__Group__0_in_ruleDone515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_entryRuleBinop542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinop549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Group__0_in_ruleBinop575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_entryRuleJmp602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJmp609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jmp__Group__0_in_ruleJmp635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_entryRuleCJmp662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCJmp669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__Group__0_in_ruleCJmp695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_entryRuleMove722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMove729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_in_ruleLabel815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_entryRuleReg842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReg849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reg__NameAssignment_in_ruleReg875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Alternatives_in_ruleRead935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scope__Alternatives_in_ruleScope972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JumpKind__Alternatives_in_ruleJumpKind1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoveKind__Alternatives_in_ruleMoveKind1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_rule__Instruction__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClk_in_rule__Instruction__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetPC_in_rule__Instruction__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_rule__Instruction__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDone_in_rule__Instruction__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinop_in_rule__Instruction__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJmp_in_rule__Instruction__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCJmp_in_rule__Instruction__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMove_in_rule__Instruction__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Arg2Assignment_3_0_in_rule__Binop__Alternatives_31283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__ValAssignment_3_1_in_rule__Binop__Alternatives_31301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__FromAssignment_2_0_in_rule__Move__Alternatives_21334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__ValAssignment_2_1_in_rule__Move__Alternatives_21352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group_0__0_in_rule__Read__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__RegAssignment_1_in_rule__Read__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Scope__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Scope__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Scope__Alternatives1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operator__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operator__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operator__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Operator__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Operator__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operator__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operator__Alternatives1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Operator__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Operator__Alternatives1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Operator__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Operator__Alternatives1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Operator__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Operator__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operator__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Operator__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Operator__Alternatives2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__JumpKind__Alternatives2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__JumpKind__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__JumpKind__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__JumpKind__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MoveKind__Alternatives2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__MoveKind__Alternatives2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MoveKind__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MoveKind__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MoveKind__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MoveKind__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_0__0_in_rule__Line__Group__02317 = new BitSet(new long[]{0x07DFFFFFFFFFC010L});
    public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__InstructionAssignment_1_in_rule__Line__Group__12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__LabelsAssignment_0_0_in_rule__Line__Group_0__02393 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Line__Group_0__1_in_rule__Line__Group_0__02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Line__Group_0__12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__ScopeAssignment_0_in_rule__Decl__Group__02470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__RegAssignment_1_in_rule__Decl__Group__12507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SetClk__Group__02546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetClk__Group__1_in_rule__SetClk__Group__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__RegAssignment_1_in_rule__SetClk__Group__12584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetClk__Group__2_in_rule__SetClk__Group__12593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__ClkAssignment_2_in_rule__SetClk__Group__22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SetPC__Group__02662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetPC__Group__1_in_rule__SetPC__Group__02672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__RegAssignment_1_in_rule__SetPC__Group__12700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetPC__Group__2_in_rule__SetPC__Group__12709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__LabelAssignment_2_in_rule__SetPC__Group__22737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Prio__Group__02778 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__02788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__RegAssignment_1_in_rule__Prio__Group__12816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__PrioAssignment_2_in_rule__Prio__Group__22854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Done__Group__02895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Done__Group__1_in_rule__Done__Group__02905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Done__PcAssignment_1_in_rule__Done__Group__12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__OpAssignment_0_in_rule__Binop__Group__02971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binop__Group__1_in_rule__Binop__Group__02980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__ToAssignment_1_in_rule__Binop__Group__13008 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_rule__Binop__Group__2_in_rule__Binop__Group__13017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Arg1Assignment_2_in_rule__Binop__Group__23045 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__Binop__Group__3_in_rule__Binop__Group__23054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Alternatives_3_in_rule__Binop__Group__33082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Jmp__Group__03125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Jmp__Group__1_in_rule__Jmp__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jmp__LabelAssignment_1_in_rule__Jmp__Group__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__CondAssignment_0_in_rule__CJmp__Group__03201 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_rule__CJmp__Group__1_in_rule__CJmp__Group__03210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__RegAssignment_1_in_rule__CJmp__Group__13238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CJmp__Group__2_in_rule__CJmp__Group__13247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__LabelAssignment_2_in_rule__CJmp__Group__23275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__TypeAssignment_0_in_rule__Move__Group__03315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__ToAssignment_1_in_rule__Move__Group__13352 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Alternatives_2_in_rule__Move__Group__23389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__PreAssignment_0_0_in_rule__Read__Group_0__03429 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Read__Group_0__1_in_rule__Read__Group_0__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Read__Group_0__13467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Read__Group_0__2_in_rule__Read__Group_0__13477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__RegAssignment_0_2_in_rule__Read__Group_0__23505 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Read__Group_0__3_in_rule__Read__Group_0__23514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Read__Group_0__33543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__KLP__InstructionsAssignment3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Line__LabelsAssignment_0_03618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Line__InstructionAssignment_13649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_rule__Decl__ScopeAssignment_03680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Decl__RegAssignment_13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetClk__RegAssignment_13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetClk__ClkAssignment_23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetPC__RegAssignment_13804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__SetPC__LabelAssignment_23835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Prio__RegAssignment_13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Prio__PrioAssignment_23897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Done__PcAssignment_13928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Binop__OpAssignment_03959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Binop__ToAssignment_13990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Binop__Arg1Assignment_24021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Binop__Arg2Assignment_3_04052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Binop__ValAssignment_3_14083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Jmp__LabelAssignment_14114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpKind_in_rule__CJmp__CondAssignment_04145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__CJmp__RegAssignment_14176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__CJmp__LabelAssignment_24207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoveKind_in_rule__Move__TypeAssignment_04238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Move__ToAssignment_14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Move__FromAssignment_2_04300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Move__ValAssignment_2_14331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reg__NameAssignment4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Read__PreAssignment_0_04429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Read__RegAssignment_0_24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Read__RegAssignment_14499 = new BitSet(new long[]{0x0000000000000002L});

}