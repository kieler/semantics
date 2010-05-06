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
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.krep.editors.klp.services.KlpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:61:1: entryRuleKLP : ruleKLP EOF ;
    public final void entryRuleKLP() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:62:1: ( ruleKLP EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:63:1: ruleKLP EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:70:1: ruleKLP : ( ( rule__KLP__InstructionsAssignment )* ) ;
    public final void ruleKLP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:74:2: ( ( ( rule__KLP__InstructionsAssignment )* ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:75:1: ( ( rule__KLP__InstructionsAssignment )* )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:75:1: ( ( rule__KLP__InstructionsAssignment )* )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:76:1: ( rule__KLP__InstructionsAssignment )*
            {
             before(grammarAccess.getKLPAccess().getInstructionsAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:77:1: ( rule__KLP__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=52)||(LA1_0>=54 && LA1_0<=58)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:77:2: rule__KLP__InstructionsAssignment
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:89:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:90:1: ( ruleLine EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:91:1: ruleLine EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:98:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:102:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:103:1: ( ( rule__Line__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:103:1: ( ( rule__Line__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:104:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:105:1: ( rule__Line__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:105:2: rule__Line__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:117:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:118:1: ( ruleInstruction EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:119:1: ruleInstruction EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:126:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:130:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:131:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:131:1: ( ( rule__Instruction__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:132:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:133:1: ( rule__Instruction__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:133:2: rule__Instruction__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:145:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:146:1: ( ruleDecl EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:147:1: ruleDecl EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:154:1: ruleDecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:158:2: ( ( ( rule__Decl__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:159:1: ( ( rule__Decl__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:159:1: ( ( rule__Decl__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:160:1: ( rule__Decl__Group__0 )
            {
             before(grammarAccess.getDeclAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:161:1: ( rule__Decl__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:161:2: rule__Decl__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:173:1: entryRuleSetClk : ruleSetClk EOF ;
    public final void entryRuleSetClk() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:174:1: ( ruleSetClk EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:175:1: ruleSetClk EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:182:1: ruleSetClk : ( ( rule__SetClk__Group__0 ) ) ;
    public final void ruleSetClk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:186:2: ( ( ( rule__SetClk__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:187:1: ( ( rule__SetClk__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:187:1: ( ( rule__SetClk__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:188:1: ( rule__SetClk__Group__0 )
            {
             before(grammarAccess.getSetClkAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:189:1: ( rule__SetClk__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:189:2: rule__SetClk__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:201:1: entryRuleSetPC : ruleSetPC EOF ;
    public final void entryRuleSetPC() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:202:1: ( ruleSetPC EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:203:1: ruleSetPC EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:210:1: ruleSetPC : ( ( rule__SetPC__Group__0 ) ) ;
    public final void ruleSetPC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:214:2: ( ( ( rule__SetPC__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:215:1: ( ( rule__SetPC__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:215:1: ( ( rule__SetPC__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:216:1: ( rule__SetPC__Group__0 )
            {
             before(grammarAccess.getSetPCAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:217:1: ( rule__SetPC__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:217:2: rule__SetPC__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:229:1: entryRulePrio : rulePrio EOF ;
    public final void entryRulePrio() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:230:1: ( rulePrio EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:231:1: rulePrio EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:238:1: rulePrio : ( ( rule__Prio__Group__0 ) ) ;
    public final void rulePrio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:242:2: ( ( ( rule__Prio__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:243:1: ( ( rule__Prio__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:243:1: ( ( rule__Prio__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:244:1: ( rule__Prio__Group__0 )
            {
             before(grammarAccess.getPrioAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:245:1: ( rule__Prio__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:245:2: rule__Prio__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:257:1: entryRuleDone : ruleDone EOF ;
    public final void entryRuleDone() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:258:1: ( ruleDone EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:259:1: ruleDone EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:266:1: ruleDone : ( ( rule__Done__Group__0 ) ) ;
    public final void ruleDone() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:270:2: ( ( ( rule__Done__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:271:1: ( ( rule__Done__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:271:1: ( ( rule__Done__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:272:1: ( rule__Done__Group__0 )
            {
             before(grammarAccess.getDoneAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:273:1: ( rule__Done__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:273:2: rule__Done__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:285:1: entryRuleBinop : ruleBinop EOF ;
    public final void entryRuleBinop() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:286:1: ( ruleBinop EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:287:1: ruleBinop EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:294:1: ruleBinop : ( ( rule__Binop__Group__0 ) ) ;
    public final void ruleBinop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:298:2: ( ( ( rule__Binop__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:299:1: ( ( rule__Binop__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:299:1: ( ( rule__Binop__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:300:1: ( rule__Binop__Group__0 )
            {
             before(grammarAccess.getBinopAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:301:1: ( rule__Binop__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:301:2: rule__Binop__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:313:1: entryRuleJmp : ruleJmp EOF ;
    public final void entryRuleJmp() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:314:1: ( ruleJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:315:1: ruleJmp EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:322:1: ruleJmp : ( ( rule__Jmp__Group__0 ) ) ;
    public final void ruleJmp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:326:2: ( ( ( rule__Jmp__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:327:1: ( ( rule__Jmp__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:327:1: ( ( rule__Jmp__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:328:1: ( rule__Jmp__Group__0 )
            {
             before(grammarAccess.getJmpAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:329:1: ( rule__Jmp__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:329:2: rule__Jmp__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:341:1: entryRuleCJmp : ruleCJmp EOF ;
    public final void entryRuleCJmp() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:342:1: ( ruleCJmp EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:343:1: ruleCJmp EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:350:1: ruleCJmp : ( ( rule__CJmp__Group__0 ) ) ;
    public final void ruleCJmp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:354:2: ( ( ( rule__CJmp__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:355:1: ( ( rule__CJmp__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:355:1: ( ( rule__CJmp__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:356:1: ( rule__CJmp__Group__0 )
            {
             before(grammarAccess.getCJmpAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:357:1: ( rule__CJmp__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:357:2: rule__CJmp__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:369:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:370:1: ( ruleMove EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:371:1: ruleMove EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:378:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:382:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:383:1: ( ( rule__Move__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:383:1: ( ( rule__Move__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:384:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:385:1: ( rule__Move__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:385:2: rule__Move__Group__0
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:397:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:398:1: ( ruleLabel EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:399:1: ruleLabel EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:406:1: ruleLabel : ( ( rule__Label__NameAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:410:2: ( ( ( rule__Label__NameAssignment ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:411:1: ( ( rule__Label__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:411:1: ( ( rule__Label__NameAssignment ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:412:1: ( rule__Label__NameAssignment )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:413:1: ( rule__Label__NameAssignment )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:413:2: rule__Label__NameAssignment
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:425:1: entryRuleReg : ruleReg EOF ;
    public final void entryRuleReg() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:426:1: ( ruleReg EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:427:1: ruleReg EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:434:1: ruleReg : ( ( rule__Reg__NameAssignment ) ) ;
    public final void ruleReg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:438:2: ( ( ( rule__Reg__NameAssignment ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:439:1: ( ( rule__Reg__NameAssignment ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:439:1: ( ( rule__Reg__NameAssignment ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:440:1: ( rule__Reg__NameAssignment )
            {
             before(grammarAccess.getRegAccess().getNameAssignment()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:441:1: ( rule__Reg__NameAssignment )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:441:2: rule__Reg__NameAssignment
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:453:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:454:1: ( ruleRead EOF )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:455:1: ruleRead EOF
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:462:1: ruleRead : ( ( rule__Read__Alternatives ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:466:2: ( ( ( rule__Read__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:467:1: ( ( rule__Read__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:467:1: ( ( rule__Read__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:468:1: ( rule__Read__Alternatives )
            {
             before(grammarAccess.getReadAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:469:1: ( rule__Read__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:469:2: rule__Read__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:482:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:486:1: ( ( ( rule__Scope__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:487:1: ( ( rule__Scope__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:487:1: ( ( rule__Scope__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:488:1: ( rule__Scope__Alternatives )
            {
             before(grammarAccess.getScopeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:489:1: ( rule__Scope__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:489:2: rule__Scope__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:501:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:505:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:506:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:506:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:507:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:508:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:508:2: rule__Operator__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:520:1: ruleJumpKind : ( ( rule__JumpKind__Alternatives ) ) ;
    public final void ruleJumpKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:524:1: ( ( ( rule__JumpKind__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:525:1: ( ( rule__JumpKind__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:525:1: ( ( rule__JumpKind__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:526:1: ( rule__JumpKind__Alternatives )
            {
             before(grammarAccess.getJumpKindAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:527:1: ( rule__JumpKind__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:527:2: rule__JumpKind__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:539:1: ruleMoveKind : ( ( rule__MoveKind__Alternatives ) ) ;
    public final void ruleMoveKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:543:1: ( ( ( rule__MoveKind__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:544:1: ( ( rule__MoveKind__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:544:1: ( ( rule__MoveKind__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:545:1: ( rule__MoveKind__Alternatives )
            {
             before(grammarAccess.getMoveKindAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:546:1: ( rule__MoveKind__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:546:2: rule__MoveKind__Alternatives
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:557:1: rule__Instruction__Alternatives : ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:561:1: ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) )
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
                    new NoViableAltException("557:1: rule__Instruction__Alternatives : ( ( ruleDecl ) | ( ruleSetClk ) | ( ruleSetPC ) | ( rulePrio ) | ( ruleDone ) | ( ruleBinop ) | ( ruleJmp ) | ( ruleCJmp ) | ( ruleMove ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:562:1: ( ruleDecl )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:562:1: ( ruleDecl )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:563:1: ruleDecl
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:568:6: ( ruleSetClk )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:568:6: ( ruleSetClk )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:569:1: ruleSetClk
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:574:6: ( ruleSetPC )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:574:6: ( ruleSetPC )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:575:1: ruleSetPC
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:580:6: ( rulePrio )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:580:6: ( rulePrio )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:581:1: rulePrio
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:586:6: ( ruleDone )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:586:6: ( ruleDone )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:587:1: ruleDone
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:592:6: ( ruleBinop )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:592:6: ( ruleBinop )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:593:1: ruleBinop
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:598:6: ( ruleJmp )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:598:6: ( ruleJmp )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:599:1: ruleJmp
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:604:6: ( ruleCJmp )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:604:6: ( ruleCJmp )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:605:1: ruleCJmp
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:610:6: ( ruleMove )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:610:6: ( ruleMove )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:611:1: ruleMove
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:621:1: rule__Binop__Alternatives_3 : ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) );
    public final void rule__Binop__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:625:1: ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) )
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
                    new NoViableAltException("621:1: rule__Binop__Alternatives_3 : ( ( ( rule__Binop__Arg2Assignment_3_0 ) ) | ( ( rule__Binop__ValAssignment_3_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:626:1: ( ( rule__Binop__Arg2Assignment_3_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:626:1: ( ( rule__Binop__Arg2Assignment_3_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:627:1: ( rule__Binop__Arg2Assignment_3_0 )
                    {
                     before(grammarAccess.getBinopAccess().getArg2Assignment_3_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:628:1: ( rule__Binop__Arg2Assignment_3_0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:628:2: rule__Binop__Arg2Assignment_3_0
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:632:6: ( ( rule__Binop__ValAssignment_3_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:632:6: ( ( rule__Binop__ValAssignment_3_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:633:1: ( rule__Binop__ValAssignment_3_1 )
                    {
                     before(grammarAccess.getBinopAccess().getValAssignment_3_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:634:1: ( rule__Binop__ValAssignment_3_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:634:2: rule__Binop__ValAssignment_3_1
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:643:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) );
    public final void rule__Move__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:647:1: ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) )
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
                    new NoViableAltException("643:1: rule__Move__Alternatives_2 : ( ( ( rule__Move__FromAssignment_2_0 ) ) | ( ( rule__Move__ValAssignment_2_1 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:648:1: ( ( rule__Move__FromAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:648:1: ( ( rule__Move__FromAssignment_2_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:649:1: ( rule__Move__FromAssignment_2_0 )
                    {
                     before(grammarAccess.getMoveAccess().getFromAssignment_2_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:650:1: ( rule__Move__FromAssignment_2_0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:650:2: rule__Move__FromAssignment_2_0
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:654:6: ( ( rule__Move__ValAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:654:6: ( ( rule__Move__ValAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:655:1: ( rule__Move__ValAssignment_2_1 )
                    {
                     before(grammarAccess.getMoveAccess().getValAssignment_2_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:656:1: ( rule__Move__ValAssignment_2_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:656:2: rule__Move__ValAssignment_2_1
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:665:1: rule__Read__Alternatives : ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) );
    public final void rule__Read__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:669:1: ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) )
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
                    new NoViableAltException("665:1: rule__Read__Alternatives : ( ( ( rule__Read__Group_0__0 ) ) | ( ( rule__Read__RegAssignment_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:670:1: ( ( rule__Read__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:670:1: ( ( rule__Read__Group_0__0 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:671:1: ( rule__Read__Group_0__0 )
                    {
                     before(grammarAccess.getReadAccess().getGroup_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:672:1: ( rule__Read__Group_0__0 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:672:2: rule__Read__Group_0__0
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
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:676:6: ( ( rule__Read__RegAssignment_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:676:6: ( ( rule__Read__RegAssignment_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:677:1: ( rule__Read__RegAssignment_1 )
                    {
                     before(grammarAccess.getReadAccess().getRegAssignment_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:678:1: ( rule__Read__RegAssignment_1 )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:678:2: rule__Read__RegAssignment_1
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:687:1: rule__Scope__Alternatives : ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:691:1: ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) )
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
                    new NoViableAltException("687:1: rule__Scope__Alternatives : ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'LOCAL' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:692:1: ( ( 'INPUT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:692:1: ( ( 'INPUT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:693:1: ( 'INPUT' )
                    {
                     before(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:694:1: ( 'INPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:694:3: 'INPUT'
                    {
                    match(input,14,FOLLOW_14_in_rule__Scope__Alternatives1437); 

                    }

                     after(grammarAccess.getScopeAccess().getInputEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:699:6: ( ( 'OUTPUT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:699:6: ( ( 'OUTPUT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:700:1: ( 'OUTPUT' )
                    {
                     before(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:701:1: ( 'OUTPUT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:701:3: 'OUTPUT'
                    {
                    match(input,15,FOLLOW_15_in_rule__Scope__Alternatives1458); 

                    }

                     after(grammarAccess.getScopeAccess().getOutputEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:706:6: ( ( 'LOCAL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:706:6: ( ( 'LOCAL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:707:1: ( 'LOCAL' )
                    {
                     before(grammarAccess.getScopeAccess().getLocalEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:708:1: ( 'LOCAL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:708:3: 'LOCAL'
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:718:1: rule__Operator__Alternatives : ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:722:1: ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) )
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
                    new NoViableAltException("718:1: rule__Operator__Alternatives : ( ( ( 'ADD' ) ) | ( ( 'IADD' ) ) | ( ( 'SUB' ) ) | ( ( 'MUL' ) ) | ( ( 'DIV' ) ) | ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'XOR' ) ) | ( ( 'LT' ) ) | ( ( 'LE' ) ) | ( ( 'EQ' ) ) | ( ( 'GE' ) ) | ( ( 'GT' ) ) | ( ( 'NEQ' ) ) | ( ( 'ISUB' ) ) | ( ( 'IMUL' ) ) | ( ( 'IDIV' ) ) | ( ( 'IAND' ) ) | ( ( 'IOR' ) ) | ( ( 'IXOR' ) ) | ( ( 'ILT' ) ) | ( ( 'ILE' ) ) | ( ( 'IEQ' ) ) | ( ( 'IGE' ) ) | ( ( 'IGT' ) ) | ( ( 'INEQ' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:723:1: ( ( 'ADD' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:723:1: ( ( 'ADD' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:724:1: ( 'ADD' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:725:1: ( 'ADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:725:3: 'ADD'
                    {
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives1515); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:730:6: ( ( 'IADD' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:730:6: ( ( 'IADD' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:731:1: ( 'IADD' )
                    {
                     before(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:732:1: ( 'IADD' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:732:3: 'IADD'
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives1536); 

                    }

                     after(grammarAccess.getOperatorAccess().getIaddEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:737:6: ( ( 'SUB' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:737:6: ( ( 'SUB' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:738:1: ( 'SUB' )
                    {
                     before(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:739:1: ( 'SUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:739:3: 'SUB'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives1557); 

                    }

                     after(grammarAccess.getOperatorAccess().getSubEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:744:6: ( ( 'MUL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:744:6: ( ( 'MUL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:745:1: ( 'MUL' )
                    {
                     before(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:746:1: ( 'MUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:746:3: 'MUL'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives1578); 

                    }

                     after(grammarAccess.getOperatorAccess().getMulEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:751:6: ( ( 'DIV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:751:6: ( ( 'DIV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:752:1: ( 'DIV' )
                    {
                     before(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:753:1: ( 'DIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:753:3: 'DIV'
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives1599); 

                    }

                     after(grammarAccess.getOperatorAccess().getDivEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:758:6: ( ( 'AND' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:758:6: ( ( 'AND' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:759:1: ( 'AND' )
                    {
                     before(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:760:1: ( 'AND' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:760:3: 'AND'
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives1620); 

                    }

                     after(grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:765:6: ( ( 'OR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:765:6: ( ( 'OR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:766:1: ( 'OR' )
                    {
                     before(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:767:1: ( 'OR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:767:3: 'OR'
                    {
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives1641); 

                    }

                     after(grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:772:6: ( ( 'XOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:772:6: ( ( 'XOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:773:1: ( 'XOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:774:1: ( 'XOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:774:3: 'XOR'
                    {
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives1662); 

                    }

                     after(grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:779:6: ( ( 'LT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:779:6: ( ( 'LT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:780:1: ( 'LT' )
                    {
                     before(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:781:1: ( 'LT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:781:3: 'LT'
                    {
                    match(input,25,FOLLOW_25_in_rule__Operator__Alternatives1683); 

                    }

                     after(grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:786:6: ( ( 'LE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:786:6: ( ( 'LE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:787:1: ( 'LE' )
                    {
                     before(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:788:1: ( 'LE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:788:3: 'LE'
                    {
                    match(input,26,FOLLOW_26_in_rule__Operator__Alternatives1704); 

                    }

                     after(grammarAccess.getOperatorAccess().getLeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:793:6: ( ( 'EQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:793:6: ( ( 'EQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:794:1: ( 'EQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:795:1: ( 'EQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:795:3: 'EQ'
                    {
                    match(input,27,FOLLOW_27_in_rule__Operator__Alternatives1725); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:800:6: ( ( 'GE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:800:6: ( ( 'GE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:801:1: ( 'GE' )
                    {
                     before(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:802:1: ( 'GE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:802:3: 'GE'
                    {
                    match(input,28,FOLLOW_28_in_rule__Operator__Alternatives1746); 

                    }

                     after(grammarAccess.getOperatorAccess().getGeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:807:6: ( ( 'GT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:807:6: ( ( 'GT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:808:1: ( 'GT' )
                    {
                     before(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:809:1: ( 'GT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:809:3: 'GT'
                    {
                    match(input,29,FOLLOW_29_in_rule__Operator__Alternatives1767); 

                    }

                     after(grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:814:6: ( ( 'NEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:814:6: ( ( 'NEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:815:1: ( 'NEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:816:1: ( 'NEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:816:3: 'NEQ'
                    {
                    match(input,30,FOLLOW_30_in_rule__Operator__Alternatives1788); 

                    }

                     after(grammarAccess.getOperatorAccess().getNeqEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:821:6: ( ( 'ISUB' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:821:6: ( ( 'ISUB' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:822:1: ( 'ISUB' )
                    {
                     before(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:823:1: ( 'ISUB' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:823:3: 'ISUB'
                    {
                    match(input,31,FOLLOW_31_in_rule__Operator__Alternatives1809); 

                    }

                     after(grammarAccess.getOperatorAccess().getIsubEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:828:6: ( ( 'IMUL' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:828:6: ( ( 'IMUL' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:829:1: ( 'IMUL' )
                    {
                     before(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:830:1: ( 'IMUL' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:830:3: 'IMUL'
                    {
                    match(input,32,FOLLOW_32_in_rule__Operator__Alternatives1830); 

                    }

                     after(grammarAccess.getOperatorAccess().getImulEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:835:6: ( ( 'IDIV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:835:6: ( ( 'IDIV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:836:1: ( 'IDIV' )
                    {
                     before(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:837:1: ( 'IDIV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:837:3: 'IDIV'
                    {
                    match(input,33,FOLLOW_33_in_rule__Operator__Alternatives1851); 

                    }

                     after(grammarAccess.getOperatorAccess().getIdivEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:842:6: ( ( 'IAND' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:842:6: ( ( 'IAND' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:843:1: ( 'IAND' )
                    {
                     before(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:844:1: ( 'IAND' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:844:3: 'IAND'
                    {
                    match(input,34,FOLLOW_34_in_rule__Operator__Alternatives1872); 

                    }

                     after(grammarAccess.getOperatorAccess().getIandEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:849:6: ( ( 'IOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:849:6: ( ( 'IOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:850:1: ( 'IOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:851:1: ( 'IOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:851:3: 'IOR'
                    {
                    match(input,35,FOLLOW_35_in_rule__Operator__Alternatives1893); 

                    }

                     after(grammarAccess.getOperatorAccess().getIorEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:856:6: ( ( 'IXOR' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:856:6: ( ( 'IXOR' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:857:1: ( 'IXOR' )
                    {
                     before(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:858:1: ( 'IXOR' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:858:3: 'IXOR'
                    {
                    match(input,36,FOLLOW_36_in_rule__Operator__Alternatives1914); 

                    }

                     after(grammarAccess.getOperatorAccess().getIxorEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:863:6: ( ( 'ILT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:863:6: ( ( 'ILT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:864:1: ( 'ILT' )
                    {
                     before(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:865:1: ( 'ILT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:865:3: 'ILT'
                    {
                    match(input,37,FOLLOW_37_in_rule__Operator__Alternatives1935); 

                    }

                     after(grammarAccess.getOperatorAccess().getIltEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:870:6: ( ( 'ILE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:870:6: ( ( 'ILE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:871:1: ( 'ILE' )
                    {
                     before(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:872:1: ( 'ILE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:872:3: 'ILE'
                    {
                    match(input,38,FOLLOW_38_in_rule__Operator__Alternatives1956); 

                    }

                     after(grammarAccess.getOperatorAccess().getIleEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:877:6: ( ( 'IEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:877:6: ( ( 'IEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:878:1: ( 'IEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:879:1: ( 'IEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:879:3: 'IEQ'
                    {
                    match(input,39,FOLLOW_39_in_rule__Operator__Alternatives1977); 

                    }

                     after(grammarAccess.getOperatorAccess().getIeqEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:884:6: ( ( 'IGE' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:884:6: ( ( 'IGE' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:885:1: ( 'IGE' )
                    {
                     before(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:886:1: ( 'IGE' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:886:3: 'IGE'
                    {
                    match(input,40,FOLLOW_40_in_rule__Operator__Alternatives1998); 

                    }

                     after(grammarAccess.getOperatorAccess().getIgeEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:891:6: ( ( 'IGT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:891:6: ( ( 'IGT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:892:1: ( 'IGT' )
                    {
                     before(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:893:1: ( 'IGT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:893:3: 'IGT'
                    {
                    match(input,41,FOLLOW_41_in_rule__Operator__Alternatives2019); 

                    }

                     after(grammarAccess.getOperatorAccess().getIgtEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:898:6: ( ( 'INEQ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:898:6: ( ( 'INEQ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:899:1: ( 'INEQ' )
                    {
                     before(grammarAccess.getOperatorAccess().getIneqEnumLiteralDeclaration_25()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:900:1: ( 'INEQ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:900:3: 'INEQ'
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:910:1: rule__JumpKind__Alternatives : ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) );
    public final void rule__JumpKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:914:1: ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) )
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
                    new NoViableAltException("910:1: rule__JumpKind__Alternatives : ( ( ( 'JT' ) ) | ( ( 'JF' ) ) | ( ( 'JZ' ) ) | ( ( 'JNZ' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:915:1: ( ( 'JT' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:915:1: ( ( 'JT' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:916:1: ( 'JT' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:917:1: ( 'JT' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:917:3: 'JT'
                    {
                    match(input,43,FOLLOW_43_in_rule__JumpKind__Alternatives2076); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:922:6: ( ( 'JF' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:922:6: ( ( 'JF' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:923:1: ( 'JF' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:924:1: ( 'JF' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:924:3: 'JF'
                    {
                    match(input,44,FOLLOW_44_in_rule__JumpKind__Alternatives2097); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJfEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:929:6: ( ( 'JZ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:929:6: ( ( 'JZ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:930:1: ( 'JZ' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:931:1: ( 'JZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:931:3: 'JZ'
                    {
                    match(input,45,FOLLOW_45_in_rule__JumpKind__Alternatives2118); 

                    }

                     after(grammarAccess.getJumpKindAccess().getJzEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:936:6: ( ( 'JNZ' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:936:6: ( ( 'JNZ' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:937:1: ( 'JNZ' )
                    {
                     before(grammarAccess.getJumpKindAccess().getJnzEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:938:1: ( 'JNZ' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:938:3: 'JNZ'
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:948:1: rule__MoveKind__Alternatives : ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) );
    public final void rule__MoveKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:952:1: ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) )
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
                    new NoViableAltException("948:1: rule__MoveKind__Alternatives : ( ( ( 'CVMOV' ) ) | ( ( 'VCMOV' ) ) | ( ( 'VVMOV' ) ) | ( ( 'CCMOV' ) ) | ( ( 'IVMOV' ) ) | ( ( 'ICMOV' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:953:1: ( ( 'CVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:953:1: ( ( 'CVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:954:1: ( 'CVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:955:1: ( 'CVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:955:3: 'CVMOV'
                    {
                    match(input,47,FOLLOW_47_in_rule__MoveKind__Alternatives2175); 

                    }

                     after(grammarAccess.getMoveKindAccess().getCmovEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:960:6: ( ( 'VCMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:960:6: ( ( 'VCMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:961:1: ( 'VCMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:962:1: ( 'VCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:962:3: 'VCMOV'
                    {
                    match(input,48,FOLLOW_48_in_rule__MoveKind__Alternatives2196); 

                    }

                     after(grammarAccess.getMoveKindAccess().getVcmovEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:967:6: ( ( 'VVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:967:6: ( ( 'VVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:968:1: ( 'VVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:969:1: ( 'VVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:969:3: 'VVMOV'
                    {
                    match(input,49,FOLLOW_49_in_rule__MoveKind__Alternatives2217); 

                    }

                     after(grammarAccess.getMoveKindAccess().getVvmovEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:974:6: ( ( 'CCMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:974:6: ( ( 'CCMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:975:1: ( 'CCMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:976:1: ( 'CCMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:976:3: 'CCMOV'
                    {
                    match(input,50,FOLLOW_50_in_rule__MoveKind__Alternatives2238); 

                    }

                     after(grammarAccess.getMoveKindAccess().getCcmovEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:981:6: ( ( 'IVMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:981:6: ( ( 'IVMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:982:1: ( 'IVMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:983:1: ( 'IVMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:983:3: 'IVMOV'
                    {
                    match(input,51,FOLLOW_51_in_rule__MoveKind__Alternatives2259); 

                    }

                     after(grammarAccess.getMoveKindAccess().getIvmovEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:988:6: ( ( 'ICMOV' ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:988:6: ( ( 'ICMOV' ) )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:989:1: ( 'ICMOV' )
                    {
                     before(grammarAccess.getMoveKindAccess().getIcmovEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:990:1: ( 'ICMOV' )
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:990:3: 'ICMOV'
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1002:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1006:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1007:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__02313);
            rule__Line__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Line__Group__1_in_rule__Line__Group__02316);
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


    // $ANTLR start rule__Line__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1014:1: rule__Line__Group__0__Impl : ( ( rule__Line__Group_0__0 )* ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1018:1: ( ( ( rule__Line__Group_0__0 )* ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1019:1: ( ( rule__Line__Group_0__0 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1019:1: ( ( rule__Line__Group_0__0 )* )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1020:1: ( rule__Line__Group_0__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1021:1: ( rule__Line__Group_0__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1021:2: rule__Line__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Line__Group_0__0_in_rule__Line__Group__0__Impl2343);
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
    // $ANTLR end rule__Line__Group__0__Impl


    // $ANTLR start rule__Line__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1031:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1035:1: ( rule__Line__Group__1__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1036:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__12374);
            rule__Line__Group__1__Impl();
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
    // $ANTLR end rule__Line__Group__1


    // $ANTLR start rule__Line__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1042:1: rule__Line__Group__1__Impl : ( ( rule__Line__InstructionAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1046:1: ( ( ( rule__Line__InstructionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1047:1: ( ( rule__Line__InstructionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1047:1: ( ( rule__Line__InstructionAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1048:1: ( rule__Line__InstructionAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getInstructionAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1049:1: ( rule__Line__InstructionAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1049:2: rule__Line__InstructionAssignment_1
            {
            pushFollow(FOLLOW_rule__Line__InstructionAssignment_1_in_rule__Line__Group__1__Impl2401);
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
    // $ANTLR end rule__Line__Group__1__Impl


    // $ANTLR start rule__Line__Group_0__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1063:1: rule__Line__Group_0__0 : rule__Line__Group_0__0__Impl rule__Line__Group_0__1 ;
    public final void rule__Line__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1067:1: ( rule__Line__Group_0__0__Impl rule__Line__Group_0__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1068:2: rule__Line__Group_0__0__Impl rule__Line__Group_0__1
            {
            pushFollow(FOLLOW_rule__Line__Group_0__0__Impl_in_rule__Line__Group_0__02435);
            rule__Line__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Line__Group_0__1_in_rule__Line__Group_0__02438);
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


    // $ANTLR start rule__Line__Group_0__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1075:1: rule__Line__Group_0__0__Impl : ( ( rule__Line__LabelsAssignment_0_0 ) ) ;
    public final void rule__Line__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1079:1: ( ( ( rule__Line__LabelsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1080:1: ( ( rule__Line__LabelsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1080:1: ( ( rule__Line__LabelsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1081:1: ( rule__Line__LabelsAssignment_0_0 )
            {
             before(grammarAccess.getLineAccess().getLabelsAssignment_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1082:1: ( rule__Line__LabelsAssignment_0_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1082:2: rule__Line__LabelsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Line__LabelsAssignment_0_0_in_rule__Line__Group_0__0__Impl2465);
            rule__Line__LabelsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getLineAccess().getLabelsAssignment_0_0()); 

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
    // $ANTLR end rule__Line__Group_0__0__Impl


    // $ANTLR start rule__Line__Group_0__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1092:1: rule__Line__Group_0__1 : rule__Line__Group_0__1__Impl ;
    public final void rule__Line__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1096:1: ( rule__Line__Group_0__1__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1097:2: rule__Line__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Line__Group_0__1__Impl_in_rule__Line__Group_0__12495);
            rule__Line__Group_0__1__Impl();
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
    // $ANTLR end rule__Line__Group_0__1


    // $ANTLR start rule__Line__Group_0__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1103:1: rule__Line__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Line__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1107:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1108:1: ( ':' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1108:1: ( ':' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1109:1: ':'
            {
             before(grammarAccess.getLineAccess().getColonKeyword_0_1()); 
            match(input,53,FOLLOW_53_in_rule__Line__Group_0__1__Impl2523); 
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
    // $ANTLR end rule__Line__Group_0__1__Impl


    // $ANTLR start rule__Decl__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1126:1: rule__Decl__Group__0 : rule__Decl__Group__0__Impl rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1130:1: ( rule__Decl__Group__0__Impl rule__Decl__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1131:2: rule__Decl__Group__0__Impl rule__Decl__Group__1
            {
            pushFollow(FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__02558);
            rule__Decl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02561);
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


    // $ANTLR start rule__Decl__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1138:1: rule__Decl__Group__0__Impl : ( ( rule__Decl__ScopeAssignment_0 ) ) ;
    public final void rule__Decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1142:1: ( ( ( rule__Decl__ScopeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1143:1: ( ( rule__Decl__ScopeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1143:1: ( ( rule__Decl__ScopeAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1144:1: ( rule__Decl__ScopeAssignment_0 )
            {
             before(grammarAccess.getDeclAccess().getScopeAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1145:1: ( rule__Decl__ScopeAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1145:2: rule__Decl__ScopeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decl__ScopeAssignment_0_in_rule__Decl__Group__0__Impl2588);
            rule__Decl__ScopeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getScopeAssignment_0()); 

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
    // $ANTLR end rule__Decl__Group__0__Impl


    // $ANTLR start rule__Decl__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1155:1: rule__Decl__Group__1 : rule__Decl__Group__1__Impl ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1159:1: ( rule__Decl__Group__1__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1160:2: rule__Decl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__12618);
            rule__Decl__Group__1__Impl();
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
    // $ANTLR end rule__Decl__Group__1


    // $ANTLR start rule__Decl__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1166:1: rule__Decl__Group__1__Impl : ( ( rule__Decl__RegAssignment_1 ) ) ;
    public final void rule__Decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1170:1: ( ( ( rule__Decl__RegAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1171:1: ( ( rule__Decl__RegAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1171:1: ( ( rule__Decl__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1172:1: ( rule__Decl__RegAssignment_1 )
            {
             before(grammarAccess.getDeclAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1173:1: ( rule__Decl__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1173:2: rule__Decl__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__Decl__RegAssignment_1_in_rule__Decl__Group__1__Impl2645);
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
    // $ANTLR end rule__Decl__Group__1__Impl


    // $ANTLR start rule__SetClk__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1187:1: rule__SetClk__Group__0 : rule__SetClk__Group__0__Impl rule__SetClk__Group__1 ;
    public final void rule__SetClk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1191:1: ( rule__SetClk__Group__0__Impl rule__SetClk__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1192:2: rule__SetClk__Group__0__Impl rule__SetClk__Group__1
            {
            pushFollow(FOLLOW_rule__SetClk__Group__0__Impl_in_rule__SetClk__Group__02679);
            rule__SetClk__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SetClk__Group__1_in_rule__SetClk__Group__02682);
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


    // $ANTLR start rule__SetClk__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1199:1: rule__SetClk__Group__0__Impl : ( 'SETCLK' ) ;
    public final void rule__SetClk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1203:1: ( ( 'SETCLK' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1204:1: ( 'SETCLK' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1204:1: ( 'SETCLK' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1205:1: 'SETCLK'
            {
             before(grammarAccess.getSetClkAccess().getSETCLKKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SetClk__Group__0__Impl2710); 
             after(grammarAccess.getSetClkAccess().getSETCLKKeyword_0()); 

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
    // $ANTLR end rule__SetClk__Group__0__Impl


    // $ANTLR start rule__SetClk__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1218:1: rule__SetClk__Group__1 : rule__SetClk__Group__1__Impl rule__SetClk__Group__2 ;
    public final void rule__SetClk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1222:1: ( rule__SetClk__Group__1__Impl rule__SetClk__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1223:2: rule__SetClk__Group__1__Impl rule__SetClk__Group__2
            {
            pushFollow(FOLLOW_rule__SetClk__Group__1__Impl_in_rule__SetClk__Group__12741);
            rule__SetClk__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SetClk__Group__2_in_rule__SetClk__Group__12744);
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


    // $ANTLR start rule__SetClk__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1230:1: rule__SetClk__Group__1__Impl : ( ( rule__SetClk__RegAssignment_1 ) ) ;
    public final void rule__SetClk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1234:1: ( ( ( rule__SetClk__RegAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1235:1: ( ( rule__SetClk__RegAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1235:1: ( ( rule__SetClk__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1236:1: ( rule__SetClk__RegAssignment_1 )
            {
             before(grammarAccess.getSetClkAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1237:1: ( rule__SetClk__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1237:2: rule__SetClk__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__SetClk__RegAssignment_1_in_rule__SetClk__Group__1__Impl2771);
            rule__SetClk__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSetClkAccess().getRegAssignment_1()); 

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
    // $ANTLR end rule__SetClk__Group__1__Impl


    // $ANTLR start rule__SetClk__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1247:1: rule__SetClk__Group__2 : rule__SetClk__Group__2__Impl ;
    public final void rule__SetClk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1251:1: ( rule__SetClk__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1252:2: rule__SetClk__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SetClk__Group__2__Impl_in_rule__SetClk__Group__22801);
            rule__SetClk__Group__2__Impl();
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
    // $ANTLR end rule__SetClk__Group__2


    // $ANTLR start rule__SetClk__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1258:1: rule__SetClk__Group__2__Impl : ( ( rule__SetClk__ClkAssignment_2 ) ) ;
    public final void rule__SetClk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1262:1: ( ( ( rule__SetClk__ClkAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1263:1: ( ( rule__SetClk__ClkAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1263:1: ( ( rule__SetClk__ClkAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1264:1: ( rule__SetClk__ClkAssignment_2 )
            {
             before(grammarAccess.getSetClkAccess().getClkAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1265:1: ( rule__SetClk__ClkAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1265:2: rule__SetClk__ClkAssignment_2
            {
            pushFollow(FOLLOW_rule__SetClk__ClkAssignment_2_in_rule__SetClk__Group__2__Impl2828);
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
    // $ANTLR end rule__SetClk__Group__2__Impl


    // $ANTLR start rule__SetPC__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1281:1: rule__SetPC__Group__0 : rule__SetPC__Group__0__Impl rule__SetPC__Group__1 ;
    public final void rule__SetPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1285:1: ( rule__SetPC__Group__0__Impl rule__SetPC__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1286:2: rule__SetPC__Group__0__Impl rule__SetPC__Group__1
            {
            pushFollow(FOLLOW_rule__SetPC__Group__0__Impl_in_rule__SetPC__Group__02864);
            rule__SetPC__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SetPC__Group__1_in_rule__SetPC__Group__02867);
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


    // $ANTLR start rule__SetPC__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1293:1: rule__SetPC__Group__0__Impl : ( 'SETPC' ) ;
    public final void rule__SetPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1297:1: ( ( 'SETPC' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1298:1: ( 'SETPC' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1298:1: ( 'SETPC' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1299:1: 'SETPC'
            {
             before(grammarAccess.getSetPCAccess().getSETPCKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__SetPC__Group__0__Impl2895); 
             after(grammarAccess.getSetPCAccess().getSETPCKeyword_0()); 

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
    // $ANTLR end rule__SetPC__Group__0__Impl


    // $ANTLR start rule__SetPC__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1312:1: rule__SetPC__Group__1 : rule__SetPC__Group__1__Impl rule__SetPC__Group__2 ;
    public final void rule__SetPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1316:1: ( rule__SetPC__Group__1__Impl rule__SetPC__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1317:2: rule__SetPC__Group__1__Impl rule__SetPC__Group__2
            {
            pushFollow(FOLLOW_rule__SetPC__Group__1__Impl_in_rule__SetPC__Group__12926);
            rule__SetPC__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SetPC__Group__2_in_rule__SetPC__Group__12929);
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


    // $ANTLR start rule__SetPC__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1324:1: rule__SetPC__Group__1__Impl : ( ( rule__SetPC__RegAssignment_1 ) ) ;
    public final void rule__SetPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1328:1: ( ( ( rule__SetPC__RegAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1329:1: ( ( rule__SetPC__RegAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1329:1: ( ( rule__SetPC__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1330:1: ( rule__SetPC__RegAssignment_1 )
            {
             before(grammarAccess.getSetPCAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1331:1: ( rule__SetPC__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1331:2: rule__SetPC__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__SetPC__RegAssignment_1_in_rule__SetPC__Group__1__Impl2956);
            rule__SetPC__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSetPCAccess().getRegAssignment_1()); 

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
    // $ANTLR end rule__SetPC__Group__1__Impl


    // $ANTLR start rule__SetPC__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1341:1: rule__SetPC__Group__2 : rule__SetPC__Group__2__Impl ;
    public final void rule__SetPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1345:1: ( rule__SetPC__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1346:2: rule__SetPC__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SetPC__Group__2__Impl_in_rule__SetPC__Group__22986);
            rule__SetPC__Group__2__Impl();
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
    // $ANTLR end rule__SetPC__Group__2


    // $ANTLR start rule__SetPC__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1352:1: rule__SetPC__Group__2__Impl : ( ( rule__SetPC__LabelAssignment_2 ) ) ;
    public final void rule__SetPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1356:1: ( ( ( rule__SetPC__LabelAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1357:1: ( ( rule__SetPC__LabelAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1357:1: ( ( rule__SetPC__LabelAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1358:1: ( rule__SetPC__LabelAssignment_2 )
            {
             before(grammarAccess.getSetPCAccess().getLabelAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1359:1: ( rule__SetPC__LabelAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1359:2: rule__SetPC__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__SetPC__LabelAssignment_2_in_rule__SetPC__Group__2__Impl3013);
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
    // $ANTLR end rule__SetPC__Group__2__Impl


    // $ANTLR start rule__Prio__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1375:1: rule__Prio__Group__0 : rule__Prio__Group__0__Impl rule__Prio__Group__1 ;
    public final void rule__Prio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1379:1: ( rule__Prio__Group__0__Impl rule__Prio__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1380:2: rule__Prio__Group__0__Impl rule__Prio__Group__1
            {
            pushFollow(FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__03049);
            rule__Prio__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__03052);
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


    // $ANTLR start rule__Prio__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1387:1: rule__Prio__Group__0__Impl : ( 'PRIO' ) ;
    public final void rule__Prio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1391:1: ( ( 'PRIO' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1392:1: ( 'PRIO' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1392:1: ( 'PRIO' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1393:1: 'PRIO'
            {
             before(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__Prio__Group__0__Impl3080); 
             after(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 

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
    // $ANTLR end rule__Prio__Group__0__Impl


    // $ANTLR start rule__Prio__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1406:1: rule__Prio__Group__1 : rule__Prio__Group__1__Impl rule__Prio__Group__2 ;
    public final void rule__Prio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1410:1: ( rule__Prio__Group__1__Impl rule__Prio__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1411:2: rule__Prio__Group__1__Impl rule__Prio__Group__2
            {
            pushFollow(FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__13111);
            rule__Prio__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__13114);
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


    // $ANTLR start rule__Prio__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1418:1: rule__Prio__Group__1__Impl : ( ( rule__Prio__RegAssignment_1 )? ) ;
    public final void rule__Prio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1422:1: ( ( ( rule__Prio__RegAssignment_1 )? ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1423:1: ( ( rule__Prio__RegAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1423:1: ( ( rule__Prio__RegAssignment_1 )? )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1424:1: ( rule__Prio__RegAssignment_1 )?
            {
             before(grammarAccess.getPrioAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1425:1: ( rule__Prio__RegAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1425:2: rule__Prio__RegAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Prio__RegAssignment_1_in_rule__Prio__Group__1__Impl3141);
                    rule__Prio__RegAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrioAccess().getRegAssignment_1()); 

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
    // $ANTLR end rule__Prio__Group__1__Impl


    // $ANTLR start rule__Prio__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1435:1: rule__Prio__Group__2 : rule__Prio__Group__2__Impl ;
    public final void rule__Prio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1439:1: ( rule__Prio__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1440:2: rule__Prio__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__23172);
            rule__Prio__Group__2__Impl();
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
    // $ANTLR end rule__Prio__Group__2


    // $ANTLR start rule__Prio__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1446:1: rule__Prio__Group__2__Impl : ( ( rule__Prio__PrioAssignment_2 ) ) ;
    public final void rule__Prio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1450:1: ( ( ( rule__Prio__PrioAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1451:1: ( ( rule__Prio__PrioAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1451:1: ( ( rule__Prio__PrioAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1452:1: ( rule__Prio__PrioAssignment_2 )
            {
             before(grammarAccess.getPrioAccess().getPrioAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1453:1: ( rule__Prio__PrioAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1453:2: rule__Prio__PrioAssignment_2
            {
            pushFollow(FOLLOW_rule__Prio__PrioAssignment_2_in_rule__Prio__Group__2__Impl3199);
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
    // $ANTLR end rule__Prio__Group__2__Impl


    // $ANTLR start rule__Done__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1469:1: rule__Done__Group__0 : rule__Done__Group__0__Impl rule__Done__Group__1 ;
    public final void rule__Done__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1473:1: ( rule__Done__Group__0__Impl rule__Done__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1474:2: rule__Done__Group__0__Impl rule__Done__Group__1
            {
            pushFollow(FOLLOW_rule__Done__Group__0__Impl_in_rule__Done__Group__03235);
            rule__Done__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Done__Group__1_in_rule__Done__Group__03238);
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


    // $ANTLR start rule__Done__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1481:1: rule__Done__Group__0__Impl : ( 'DONE' ) ;
    public final void rule__Done__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1485:1: ( ( 'DONE' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1486:1: ( 'DONE' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1486:1: ( 'DONE' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1487:1: 'DONE'
            {
             before(grammarAccess.getDoneAccess().getDONEKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Done__Group__0__Impl3266); 
             after(grammarAccess.getDoneAccess().getDONEKeyword_0()); 

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
    // $ANTLR end rule__Done__Group__0__Impl


    // $ANTLR start rule__Done__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1500:1: rule__Done__Group__1 : rule__Done__Group__1__Impl ;
    public final void rule__Done__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1504:1: ( rule__Done__Group__1__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1505:2: rule__Done__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Done__Group__1__Impl_in_rule__Done__Group__13297);
            rule__Done__Group__1__Impl();
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
    // $ANTLR end rule__Done__Group__1


    // $ANTLR start rule__Done__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1511:1: rule__Done__Group__1__Impl : ( ( rule__Done__PcAssignment_1 ) ) ;
    public final void rule__Done__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1515:1: ( ( ( rule__Done__PcAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1516:1: ( ( rule__Done__PcAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1516:1: ( ( rule__Done__PcAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1517:1: ( rule__Done__PcAssignment_1 )
            {
             before(grammarAccess.getDoneAccess().getPcAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1518:1: ( rule__Done__PcAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1518:2: rule__Done__PcAssignment_1
            {
            pushFollow(FOLLOW_rule__Done__PcAssignment_1_in_rule__Done__Group__1__Impl3324);
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
    // $ANTLR end rule__Done__Group__1__Impl


    // $ANTLR start rule__Binop__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1532:1: rule__Binop__Group__0 : rule__Binop__Group__0__Impl rule__Binop__Group__1 ;
    public final void rule__Binop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1536:1: ( rule__Binop__Group__0__Impl rule__Binop__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1537:2: rule__Binop__Group__0__Impl rule__Binop__Group__1
            {
            pushFollow(FOLLOW_rule__Binop__Group__0__Impl_in_rule__Binop__Group__03358);
            rule__Binop__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binop__Group__1_in_rule__Binop__Group__03361);
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


    // $ANTLR start rule__Binop__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1544:1: rule__Binop__Group__0__Impl : ( ( rule__Binop__OpAssignment_0 ) ) ;
    public final void rule__Binop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1548:1: ( ( ( rule__Binop__OpAssignment_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1549:1: ( ( rule__Binop__OpAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1549:1: ( ( rule__Binop__OpAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1550:1: ( rule__Binop__OpAssignment_0 )
            {
             before(grammarAccess.getBinopAccess().getOpAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1551:1: ( rule__Binop__OpAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1551:2: rule__Binop__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__Binop__OpAssignment_0_in_rule__Binop__Group__0__Impl3388);
            rule__Binop__OpAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getOpAssignment_0()); 

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
    // $ANTLR end rule__Binop__Group__0__Impl


    // $ANTLR start rule__Binop__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1561:1: rule__Binop__Group__1 : rule__Binop__Group__1__Impl rule__Binop__Group__2 ;
    public final void rule__Binop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1565:1: ( rule__Binop__Group__1__Impl rule__Binop__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1566:2: rule__Binop__Group__1__Impl rule__Binop__Group__2
            {
            pushFollow(FOLLOW_rule__Binop__Group__1__Impl_in_rule__Binop__Group__13418);
            rule__Binop__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binop__Group__2_in_rule__Binop__Group__13421);
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


    // $ANTLR start rule__Binop__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1573:1: rule__Binop__Group__1__Impl : ( ( rule__Binop__ToAssignment_1 ) ) ;
    public final void rule__Binop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1577:1: ( ( ( rule__Binop__ToAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1578:1: ( ( rule__Binop__ToAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1578:1: ( ( rule__Binop__ToAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1579:1: ( rule__Binop__ToAssignment_1 )
            {
             before(grammarAccess.getBinopAccess().getToAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1580:1: ( rule__Binop__ToAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1580:2: rule__Binop__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Binop__ToAssignment_1_in_rule__Binop__Group__1__Impl3448);
            rule__Binop__ToAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getToAssignment_1()); 

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
    // $ANTLR end rule__Binop__Group__1__Impl


    // $ANTLR start rule__Binop__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1590:1: rule__Binop__Group__2 : rule__Binop__Group__2__Impl rule__Binop__Group__3 ;
    public final void rule__Binop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1594:1: ( rule__Binop__Group__2__Impl rule__Binop__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1595:2: rule__Binop__Group__2__Impl rule__Binop__Group__3
            {
            pushFollow(FOLLOW_rule__Binop__Group__2__Impl_in_rule__Binop__Group__23478);
            rule__Binop__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Binop__Group__3_in_rule__Binop__Group__23481);
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


    // $ANTLR start rule__Binop__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1602:1: rule__Binop__Group__2__Impl : ( ( rule__Binop__Arg1Assignment_2 ) ) ;
    public final void rule__Binop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1606:1: ( ( ( rule__Binop__Arg1Assignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1607:1: ( ( rule__Binop__Arg1Assignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1607:1: ( ( rule__Binop__Arg1Assignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1608:1: ( rule__Binop__Arg1Assignment_2 )
            {
             before(grammarAccess.getBinopAccess().getArg1Assignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1609:1: ( rule__Binop__Arg1Assignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1609:2: rule__Binop__Arg1Assignment_2
            {
            pushFollow(FOLLOW_rule__Binop__Arg1Assignment_2_in_rule__Binop__Group__2__Impl3508);
            rule__Binop__Arg1Assignment_2();
            _fsp--;


            }

             after(grammarAccess.getBinopAccess().getArg1Assignment_2()); 

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
    // $ANTLR end rule__Binop__Group__2__Impl


    // $ANTLR start rule__Binop__Group__3
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1619:1: rule__Binop__Group__3 : rule__Binop__Group__3__Impl ;
    public final void rule__Binop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1623:1: ( rule__Binop__Group__3__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1624:2: rule__Binop__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Binop__Group__3__Impl_in_rule__Binop__Group__33538);
            rule__Binop__Group__3__Impl();
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
    // $ANTLR end rule__Binop__Group__3


    // $ANTLR start rule__Binop__Group__3__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1630:1: rule__Binop__Group__3__Impl : ( ( rule__Binop__Alternatives_3 ) ) ;
    public final void rule__Binop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1634:1: ( ( ( rule__Binop__Alternatives_3 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1635:1: ( ( rule__Binop__Alternatives_3 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1635:1: ( ( rule__Binop__Alternatives_3 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1636:1: ( rule__Binop__Alternatives_3 )
            {
             before(grammarAccess.getBinopAccess().getAlternatives_3()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1637:1: ( rule__Binop__Alternatives_3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1637:2: rule__Binop__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Binop__Alternatives_3_in_rule__Binop__Group__3__Impl3565);
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
    // $ANTLR end rule__Binop__Group__3__Impl


    // $ANTLR start rule__Jmp__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1655:1: rule__Jmp__Group__0 : rule__Jmp__Group__0__Impl rule__Jmp__Group__1 ;
    public final void rule__Jmp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1659:1: ( rule__Jmp__Group__0__Impl rule__Jmp__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1660:2: rule__Jmp__Group__0__Impl rule__Jmp__Group__1
            {
            pushFollow(FOLLOW_rule__Jmp__Group__0__Impl_in_rule__Jmp__Group__03603);
            rule__Jmp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Jmp__Group__1_in_rule__Jmp__Group__03606);
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


    // $ANTLR start rule__Jmp__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1667:1: rule__Jmp__Group__0__Impl : ( 'JMP' ) ;
    public final void rule__Jmp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1671:1: ( ( 'JMP' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1672:1: ( 'JMP' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1672:1: ( 'JMP' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1673:1: 'JMP'
            {
             before(grammarAccess.getJmpAccess().getJMPKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__Jmp__Group__0__Impl3634); 
             after(grammarAccess.getJmpAccess().getJMPKeyword_0()); 

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
    // $ANTLR end rule__Jmp__Group__0__Impl


    // $ANTLR start rule__Jmp__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1686:1: rule__Jmp__Group__1 : rule__Jmp__Group__1__Impl ;
    public final void rule__Jmp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1690:1: ( rule__Jmp__Group__1__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1691:2: rule__Jmp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Jmp__Group__1__Impl_in_rule__Jmp__Group__13665);
            rule__Jmp__Group__1__Impl();
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
    // $ANTLR end rule__Jmp__Group__1


    // $ANTLR start rule__Jmp__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1697:1: rule__Jmp__Group__1__Impl : ( ( rule__Jmp__LabelAssignment_1 ) ) ;
    public final void rule__Jmp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1701:1: ( ( ( rule__Jmp__LabelAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1702:1: ( ( rule__Jmp__LabelAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1702:1: ( ( rule__Jmp__LabelAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1703:1: ( rule__Jmp__LabelAssignment_1 )
            {
             before(grammarAccess.getJmpAccess().getLabelAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1704:1: ( rule__Jmp__LabelAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1704:2: rule__Jmp__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Jmp__LabelAssignment_1_in_rule__Jmp__Group__1__Impl3692);
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
    // $ANTLR end rule__Jmp__Group__1__Impl


    // $ANTLR start rule__CJmp__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1718:1: rule__CJmp__Group__0 : rule__CJmp__Group__0__Impl rule__CJmp__Group__1 ;
    public final void rule__CJmp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1722:1: ( rule__CJmp__Group__0__Impl rule__CJmp__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1723:2: rule__CJmp__Group__0__Impl rule__CJmp__Group__1
            {
            pushFollow(FOLLOW_rule__CJmp__Group__0__Impl_in_rule__CJmp__Group__03726);
            rule__CJmp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CJmp__Group__1_in_rule__CJmp__Group__03729);
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


    // $ANTLR start rule__CJmp__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1730:1: rule__CJmp__Group__0__Impl : ( ( rule__CJmp__CondAssignment_0 ) ) ;
    public final void rule__CJmp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1734:1: ( ( ( rule__CJmp__CondAssignment_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1735:1: ( ( rule__CJmp__CondAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1735:1: ( ( rule__CJmp__CondAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1736:1: ( rule__CJmp__CondAssignment_0 )
            {
             before(grammarAccess.getCJmpAccess().getCondAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1737:1: ( rule__CJmp__CondAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1737:2: rule__CJmp__CondAssignment_0
            {
            pushFollow(FOLLOW_rule__CJmp__CondAssignment_0_in_rule__CJmp__Group__0__Impl3756);
            rule__CJmp__CondAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getCondAssignment_0()); 

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
    // $ANTLR end rule__CJmp__Group__0__Impl


    // $ANTLR start rule__CJmp__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1747:1: rule__CJmp__Group__1 : rule__CJmp__Group__1__Impl rule__CJmp__Group__2 ;
    public final void rule__CJmp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1751:1: ( rule__CJmp__Group__1__Impl rule__CJmp__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1752:2: rule__CJmp__Group__1__Impl rule__CJmp__Group__2
            {
            pushFollow(FOLLOW_rule__CJmp__Group__1__Impl_in_rule__CJmp__Group__13786);
            rule__CJmp__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CJmp__Group__2_in_rule__CJmp__Group__13789);
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


    // $ANTLR start rule__CJmp__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1759:1: rule__CJmp__Group__1__Impl : ( ( rule__CJmp__RegAssignment_1 ) ) ;
    public final void rule__CJmp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1763:1: ( ( ( rule__CJmp__RegAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1764:1: ( ( rule__CJmp__RegAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1764:1: ( ( rule__CJmp__RegAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1765:1: ( rule__CJmp__RegAssignment_1 )
            {
             before(grammarAccess.getCJmpAccess().getRegAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1766:1: ( rule__CJmp__RegAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1766:2: rule__CJmp__RegAssignment_1
            {
            pushFollow(FOLLOW_rule__CJmp__RegAssignment_1_in_rule__CJmp__Group__1__Impl3816);
            rule__CJmp__RegAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCJmpAccess().getRegAssignment_1()); 

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
    // $ANTLR end rule__CJmp__Group__1__Impl


    // $ANTLR start rule__CJmp__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1776:1: rule__CJmp__Group__2 : rule__CJmp__Group__2__Impl ;
    public final void rule__CJmp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1780:1: ( rule__CJmp__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1781:2: rule__CJmp__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CJmp__Group__2__Impl_in_rule__CJmp__Group__23846);
            rule__CJmp__Group__2__Impl();
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
    // $ANTLR end rule__CJmp__Group__2


    // $ANTLR start rule__CJmp__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1787:1: rule__CJmp__Group__2__Impl : ( ( rule__CJmp__LabelAssignment_2 ) ) ;
    public final void rule__CJmp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1791:1: ( ( ( rule__CJmp__LabelAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1792:1: ( ( rule__CJmp__LabelAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1792:1: ( ( rule__CJmp__LabelAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1793:1: ( rule__CJmp__LabelAssignment_2 )
            {
             before(grammarAccess.getCJmpAccess().getLabelAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1794:1: ( rule__CJmp__LabelAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1794:2: rule__CJmp__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__CJmp__LabelAssignment_2_in_rule__CJmp__Group__2__Impl3873);
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
    // $ANTLR end rule__CJmp__Group__2__Impl


    // $ANTLR start rule__Move__Group__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1810:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1814:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1815:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__03909);
            rule__Move__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03912);
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


    // $ANTLR start rule__Move__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1822:1: rule__Move__Group__0__Impl : ( ( rule__Move__TypeAssignment_0 ) ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1826:1: ( ( ( rule__Move__TypeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1827:1: ( ( rule__Move__TypeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1827:1: ( ( rule__Move__TypeAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1828:1: ( rule__Move__TypeAssignment_0 )
            {
             before(grammarAccess.getMoveAccess().getTypeAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1829:1: ( rule__Move__TypeAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1829:2: rule__Move__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Move__TypeAssignment_0_in_rule__Move__Group__0__Impl3939);
            rule__Move__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAssignment_0()); 

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
    // $ANTLR end rule__Move__Group__0__Impl


    // $ANTLR start rule__Move__Group__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1839:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1843:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1844:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__13969);
            rule__Move__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13972);
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


    // $ANTLR start rule__Move__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1851:1: rule__Move__Group__1__Impl : ( ( rule__Move__ToAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1855:1: ( ( ( rule__Move__ToAssignment_1 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1856:1: ( ( rule__Move__ToAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1856:1: ( ( rule__Move__ToAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1857:1: ( rule__Move__ToAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1858:1: ( rule__Move__ToAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1858:2: rule__Move__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__Move__ToAssignment_1_in_rule__Move__Group__1__Impl3999);
            rule__Move__ToAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMoveAccess().getToAssignment_1()); 

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
    // $ANTLR end rule__Move__Group__1__Impl


    // $ANTLR start rule__Move__Group__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1868:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1872:1: ( rule__Move__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1873:2: rule__Move__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__24029);
            rule__Move__Group__2__Impl();
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
    // $ANTLR end rule__Move__Group__2


    // $ANTLR start rule__Move__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1879:1: rule__Move__Group__2__Impl : ( ( rule__Move__Alternatives_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1883:1: ( ( ( rule__Move__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1884:1: ( ( rule__Move__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1884:1: ( ( rule__Move__Alternatives_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1885:1: ( rule__Move__Alternatives_2 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1886:1: ( rule__Move__Alternatives_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1886:2: rule__Move__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Move__Alternatives_2_in_rule__Move__Group__2__Impl4056);
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
    // $ANTLR end rule__Move__Group__2__Impl


    // $ANTLR start rule__Read__Group_0__0
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1902:1: rule__Read__Group_0__0 : rule__Read__Group_0__0__Impl rule__Read__Group_0__1 ;
    public final void rule__Read__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1906:1: ( rule__Read__Group_0__0__Impl rule__Read__Group_0__1 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1907:2: rule__Read__Group_0__0__Impl rule__Read__Group_0__1
            {
            pushFollow(FOLLOW_rule__Read__Group_0__0__Impl_in_rule__Read__Group_0__04092);
            rule__Read__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Read__Group_0__1_in_rule__Read__Group_0__04095);
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


    // $ANTLR start rule__Read__Group_0__0__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1914:1: rule__Read__Group_0__0__Impl : ( ( rule__Read__PreAssignment_0_0 ) ) ;
    public final void rule__Read__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1918:1: ( ( ( rule__Read__PreAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1919:1: ( ( rule__Read__PreAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1919:1: ( ( rule__Read__PreAssignment_0_0 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1920:1: ( rule__Read__PreAssignment_0_0 )
            {
             before(grammarAccess.getReadAccess().getPreAssignment_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1921:1: ( rule__Read__PreAssignment_0_0 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1921:2: rule__Read__PreAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Read__PreAssignment_0_0_in_rule__Read__Group_0__0__Impl4122);
            rule__Read__PreAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getReadAccess().getPreAssignment_0_0()); 

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
    // $ANTLR end rule__Read__Group_0__0__Impl


    // $ANTLR start rule__Read__Group_0__1
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1931:1: rule__Read__Group_0__1 : rule__Read__Group_0__1__Impl rule__Read__Group_0__2 ;
    public final void rule__Read__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1935:1: ( rule__Read__Group_0__1__Impl rule__Read__Group_0__2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1936:2: rule__Read__Group_0__1__Impl rule__Read__Group_0__2
            {
            pushFollow(FOLLOW_rule__Read__Group_0__1__Impl_in_rule__Read__Group_0__14152);
            rule__Read__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Read__Group_0__2_in_rule__Read__Group_0__14155);
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


    // $ANTLR start rule__Read__Group_0__1__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1943:1: rule__Read__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Read__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1947:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1948:1: ( '(' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1948:1: ( '(' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1949:1: '('
            {
             before(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,59,FOLLOW_59_in_rule__Read__Group_0__1__Impl4183); 
             after(grammarAccess.getReadAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end rule__Read__Group_0__1__Impl


    // $ANTLR start rule__Read__Group_0__2
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1962:1: rule__Read__Group_0__2 : rule__Read__Group_0__2__Impl rule__Read__Group_0__3 ;
    public final void rule__Read__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1966:1: ( rule__Read__Group_0__2__Impl rule__Read__Group_0__3 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1967:2: rule__Read__Group_0__2__Impl rule__Read__Group_0__3
            {
            pushFollow(FOLLOW_rule__Read__Group_0__2__Impl_in_rule__Read__Group_0__24214);
            rule__Read__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Read__Group_0__3_in_rule__Read__Group_0__24217);
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


    // $ANTLR start rule__Read__Group_0__2__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1974:1: rule__Read__Group_0__2__Impl : ( ( rule__Read__RegAssignment_0_2 ) ) ;
    public final void rule__Read__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1978:1: ( ( ( rule__Read__RegAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1979:1: ( ( rule__Read__RegAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1979:1: ( ( rule__Read__RegAssignment_0_2 ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1980:1: ( rule__Read__RegAssignment_0_2 )
            {
             before(grammarAccess.getReadAccess().getRegAssignment_0_2()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1981:1: ( rule__Read__RegAssignment_0_2 )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1981:2: rule__Read__RegAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Read__RegAssignment_0_2_in_rule__Read__Group_0__2__Impl4244);
            rule__Read__RegAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getReadAccess().getRegAssignment_0_2()); 

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
    // $ANTLR end rule__Read__Group_0__2__Impl


    // $ANTLR start rule__Read__Group_0__3
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1991:1: rule__Read__Group_0__3 : rule__Read__Group_0__3__Impl ;
    public final void rule__Read__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1995:1: ( rule__Read__Group_0__3__Impl )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:1996:2: rule__Read__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Read__Group_0__3__Impl_in_rule__Read__Group_0__34274);
            rule__Read__Group_0__3__Impl();
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
    // $ANTLR end rule__Read__Group_0__3


    // $ANTLR start rule__Read__Group_0__3__Impl
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2002:1: rule__Read__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Read__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2006:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2007:1: ( ')' )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2007:1: ( ')' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2008:1: ')'
            {
             before(grammarAccess.getReadAccess().getRightParenthesisKeyword_0_3()); 
            match(input,60,FOLLOW_60_in_rule__Read__Group_0__3__Impl4302); 
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
    // $ANTLR end rule__Read__Group_0__3__Impl


    // $ANTLR start rule__KLP__InstructionsAssignment
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2030:1: rule__KLP__InstructionsAssignment : ( ruleLine ) ;
    public final void rule__KLP__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2034:1: ( ( ruleLine ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2035:1: ( ruleLine )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2035:1: ( ruleLine )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2036:1: ruleLine
            {
             before(grammarAccess.getKLPAccess().getInstructionsLineParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleLine_in_rule__KLP__InstructionsAssignment4346);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2045:1: rule__Line__LabelsAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Line__LabelsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2049:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2050:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2050:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2051:1: RULE_ID
            {
             before(grammarAccess.getLineAccess().getLabelsIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Line__LabelsAssignment_0_04377); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2060:1: rule__Line__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Line__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2064:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2065:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2065:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2066:1: ruleInstruction
            {
             before(grammarAccess.getLineAccess().getInstructionInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Line__InstructionAssignment_14408);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2075:1: rule__Decl__ScopeAssignment_0 : ( ruleScope ) ;
    public final void rule__Decl__ScopeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2079:1: ( ( ruleScope ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2080:1: ( ruleScope )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2080:1: ( ruleScope )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2081:1: ruleScope
            {
             before(grammarAccess.getDeclAccess().getScopeScopeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleScope_in_rule__Decl__ScopeAssignment_04439);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2090:1: rule__Decl__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Decl__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2094:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2095:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2095:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2096:1: ruleReg
            {
             before(grammarAccess.getDeclAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Decl__RegAssignment_14470);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2105:1: rule__SetClk__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__SetClk__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2109:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2110:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2110:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2111:1: ruleReg
            {
             before(grammarAccess.getSetClkAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetClk__RegAssignment_14501);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2120:1: rule__SetClk__ClkAssignment_2 : ( ruleReg ) ;
    public final void rule__SetClk__ClkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2124:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2125:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2125:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2126:1: ruleReg
            {
             before(grammarAccess.getSetClkAccess().getClkRegParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetClk__ClkAssignment_24532);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2135:1: rule__SetPC__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__SetPC__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2139:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2140:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2140:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2141:1: ruleReg
            {
             before(grammarAccess.getSetPCAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__SetPC__RegAssignment_14563);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2150:1: rule__SetPC__LabelAssignment_2 : ( ruleLabel ) ;
    public final void rule__SetPC__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2154:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2155:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2155:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2156:1: ruleLabel
            {
             before(grammarAccess.getSetPCAccess().getLabelLabelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__SetPC__LabelAssignment_24594);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2165:1: rule__Prio__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Prio__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2169:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2170:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2170:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2171:1: ruleReg
            {
             before(grammarAccess.getPrioAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Prio__RegAssignment_14625);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2180:1: rule__Prio__PrioAssignment_2 : ( RULE_INT ) ;
    public final void rule__Prio__PrioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2184:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2185:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2185:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2186:1: RULE_INT
            {
             before(grammarAccess.getPrioAccess().getPrioINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Prio__PrioAssignment_24656); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2195:1: rule__Done__PcAssignment_1 : ( ruleLabel ) ;
    public final void rule__Done__PcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2199:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2200:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2200:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2201:1: ruleLabel
            {
             before(grammarAccess.getDoneAccess().getPcLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Done__PcAssignment_14687);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2210:1: rule__Binop__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__Binop__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2214:1: ( ( ruleOperator ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2215:1: ( ruleOperator )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2215:1: ( ruleOperator )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2216:1: ruleOperator
            {
             before(grammarAccess.getBinopAccess().getOpOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Binop__OpAssignment_04718);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2225:1: rule__Binop__ToAssignment_1 : ( ruleReg ) ;
    public final void rule__Binop__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2229:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2230:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2230:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2231:1: ruleReg
            {
             before(grammarAccess.getBinopAccess().getToRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Binop__ToAssignment_14749);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2240:1: rule__Binop__Arg1Assignment_2 : ( ruleRead ) ;
    public final void rule__Binop__Arg1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2244:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2245:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2245:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2246:1: ruleRead
            {
             before(grammarAccess.getBinopAccess().getArg1ReadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Binop__Arg1Assignment_24780);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2255:1: rule__Binop__Arg2Assignment_3_0 : ( ruleRead ) ;
    public final void rule__Binop__Arg2Assignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2259:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2260:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2260:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2261:1: ruleRead
            {
             before(grammarAccess.getBinopAccess().getArg2ReadParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Binop__Arg2Assignment_3_04811);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2270:1: rule__Binop__ValAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Binop__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2274:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2275:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2275:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2276:1: RULE_INT
            {
             before(grammarAccess.getBinopAccess().getValINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Binop__ValAssignment_3_14842); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2285:1: rule__Jmp__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Jmp__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2289:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2290:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2290:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2291:1: ruleLabel
            {
             before(grammarAccess.getJmpAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Jmp__LabelAssignment_14873);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2300:1: rule__CJmp__CondAssignment_0 : ( ruleJumpKind ) ;
    public final void rule__CJmp__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2304:1: ( ( ruleJumpKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2305:1: ( ruleJumpKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2305:1: ( ruleJumpKind )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2306:1: ruleJumpKind
            {
             before(grammarAccess.getCJmpAccess().getCondJumpKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJumpKind_in_rule__CJmp__CondAssignment_04904);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2315:1: rule__CJmp__RegAssignment_1 : ( ruleRead ) ;
    public final void rule__CJmp__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2319:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2320:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2320:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2321:1: ruleRead
            {
             before(grammarAccess.getCJmpAccess().getRegReadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__CJmp__RegAssignment_14935);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2330:1: rule__CJmp__LabelAssignment_2 : ( ruleLabel ) ;
    public final void rule__CJmp__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2334:1: ( ( ruleLabel ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2335:1: ( ruleLabel )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2335:1: ( ruleLabel )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2336:1: ruleLabel
            {
             before(grammarAccess.getCJmpAccess().getLabelLabelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__CJmp__LabelAssignment_24966);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2345:1: rule__Move__TypeAssignment_0 : ( ruleMoveKind ) ;
    public final void rule__Move__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2349:1: ( ( ruleMoveKind ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2350:1: ( ruleMoveKind )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2350:1: ( ruleMoveKind )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2351:1: ruleMoveKind
            {
             before(grammarAccess.getMoveAccess().getTypeMoveKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMoveKind_in_rule__Move__TypeAssignment_04997);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2360:1: rule__Move__ToAssignment_1 : ( ruleReg ) ;
    public final void rule__Move__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2364:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2365:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2365:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2366:1: ruleReg
            {
             before(grammarAccess.getMoveAccess().getToRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Move__ToAssignment_15028);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2375:1: rule__Move__FromAssignment_2_0 : ( ruleRead ) ;
    public final void rule__Move__FromAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2379:1: ( ( ruleRead ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2380:1: ( ruleRead )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2380:1: ( ruleRead )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2381:1: ruleRead
            {
             before(grammarAccess.getMoveAccess().getFromReadParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRead_in_rule__Move__FromAssignment_2_05059);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2390:1: rule__Move__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Move__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2394:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2395:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2395:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2396:1: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getValINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Move__ValAssignment_2_15090); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2405:1: rule__Label__NameAssignment : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2409:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2410:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2410:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2411:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment5121); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2420:1: rule__Reg__NameAssignment : ( RULE_ID ) ;
    public final void rule__Reg__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2424:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2425:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2425:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2426:1: RULE_ID
            {
             before(grammarAccess.getRegAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reg__NameAssignment5152); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2435:1: rule__Read__PreAssignment_0_0 : ( ( 'pre' ) ) ;
    public final void rule__Read__PreAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2439:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2440:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2440:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2441:1: ( 'pre' )
            {
             before(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2442:1: ( 'pre' )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2443:1: 'pre'
            {
             before(grammarAccess.getReadAccess().getPrePreKeyword_0_0_0()); 
            match(input,61,FOLLOW_61_in_rule__Read__PreAssignment_0_05188); 
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2458:1: rule__Read__RegAssignment_0_2 : ( ruleReg ) ;
    public final void rule__Read__RegAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2462:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2463:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2463:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2464:1: ruleReg
            {
             before(grammarAccess.getReadAccess().getRegRegParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Read__RegAssignment_0_25227);
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
    // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2473:1: rule__Read__RegAssignment_1 : ( ruleReg ) ;
    public final void rule__Read__RegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2477:1: ( ( ruleReg ) )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2478:1: ( ruleReg )
            {
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2478:1: ( ruleReg )
            // ../de.cau.cs.kieler.krep.editors.klp.ui/src-gen/de/cau/cs/kieler/krep/editors/klp/ui/contentassist/antlr/internal/InternalKlp.g:2479:1: ruleReg
            {
             before(grammarAccess.getReadAccess().getRegRegParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReg_in_rule__Read__RegAssignment_15258);
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
    public static final BitSet FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__02313 = new BitSet(new long[]{0x07DFFFFFFFFFC000L});
    public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__02316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_0__0_in_rule__Line__Group__0__Impl2343 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__InstructionAssignment_1_in_rule__Line__Group__1__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_0__0__Impl_in_rule__Line__Group_0__02435 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Line__Group_0__1_in_rule__Line__Group_0__02438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__LabelsAssignment_0_0_in_rule__Line__Group_0__0__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Line__Group_0__1__Impl_in_rule__Line__Group_0__12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Line__Group_0__1__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__02558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__ScopeAssignment_0_in_rule__Decl__Group__0__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__RegAssignment_1_in_rule__Decl__Group__1__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__Group__0__Impl_in_rule__SetClk__Group__02679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetClk__Group__1_in_rule__SetClk__Group__02682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SetClk__Group__0__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__Group__1__Impl_in_rule__SetClk__Group__12741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetClk__Group__2_in_rule__SetClk__Group__12744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__RegAssignment_1_in_rule__SetClk__Group__1__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__Group__2__Impl_in_rule__SetClk__Group__22801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClk__ClkAssignment_2_in_rule__SetClk__Group__2__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__Group__0__Impl_in_rule__SetPC__Group__02864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetPC__Group__1_in_rule__SetPC__Group__02867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SetPC__Group__0__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__Group__1__Impl_in_rule__SetPC__Group__12926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SetPC__Group__2_in_rule__SetPC__Group__12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__RegAssignment_1_in_rule__SetPC__Group__1__Impl2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__Group__2__Impl_in_rule__SetPC__Group__22986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetPC__LabelAssignment_2_in_rule__SetPC__Group__2__Impl3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__03049 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__03052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Prio__Group__0__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__13111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__RegAssignment_1_in_rule__Prio__Group__1__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__23172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__PrioAssignment_2_in_rule__Prio__Group__2__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Done__Group__0__Impl_in_rule__Done__Group__03235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Done__Group__1_in_rule__Done__Group__03238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Done__Group__0__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Done__Group__1__Impl_in_rule__Done__Group__13297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Done__PcAssignment_1_in_rule__Done__Group__1__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Group__0__Impl_in_rule__Binop__Group__03358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Binop__Group__1_in_rule__Binop__Group__03361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__OpAssignment_0_in_rule__Binop__Group__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Group__1__Impl_in_rule__Binop__Group__13418 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_rule__Binop__Group__2_in_rule__Binop__Group__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__ToAssignment_1_in_rule__Binop__Group__1__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Group__2__Impl_in_rule__Binop__Group__23478 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__Binop__Group__3_in_rule__Binop__Group__23481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Arg1Assignment_2_in_rule__Binop__Group__2__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Group__3__Impl_in_rule__Binop__Group__33538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binop__Alternatives_3_in_rule__Binop__Group__3__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jmp__Group__0__Impl_in_rule__Jmp__Group__03603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Jmp__Group__1_in_rule__Jmp__Group__03606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Jmp__Group__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jmp__Group__1__Impl_in_rule__Jmp__Group__13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Jmp__LabelAssignment_1_in_rule__Jmp__Group__1__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__Group__0__Impl_in_rule__CJmp__Group__03726 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_rule__CJmp__Group__1_in_rule__CJmp__Group__03729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__CondAssignment_0_in_rule__CJmp__Group__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__Group__1__Impl_in_rule__CJmp__Group__13786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CJmp__Group__2_in_rule__CJmp__Group__13789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__RegAssignment_1_in_rule__CJmp__Group__1__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__Group__2__Impl_in_rule__CJmp__Group__23846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CJmp__LabelAssignment_2_in_rule__CJmp__Group__2__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__03909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__03912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__TypeAssignment_0_in_rule__Move__Group__0__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__13969 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__13972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__ToAssignment_1_in_rule__Move__Group__1__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__24029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Move__Alternatives_2_in_rule__Move__Group__2__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group_0__0__Impl_in_rule__Read__Group_0__04092 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Read__Group_0__1_in_rule__Read__Group_0__04095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__PreAssignment_0_0_in_rule__Read__Group_0__0__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group_0__1__Impl_in_rule__Read__Group_0__14152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Read__Group_0__2_in_rule__Read__Group_0__14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Read__Group_0__1__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group_0__2__Impl_in_rule__Read__Group_0__24214 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Read__Group_0__3_in_rule__Read__Group_0__24217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__RegAssignment_0_2_in_rule__Read__Group_0__2__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group_0__3__Impl_in_rule__Read__Group_0__34274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Read__Group_0__3__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_rule__KLP__InstructionsAssignment4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Line__LabelsAssignment_0_04377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Line__InstructionAssignment_14408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_rule__Decl__ScopeAssignment_04439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Decl__RegAssignment_14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetClk__RegAssignment_14501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetClk__ClkAssignment_24532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__SetPC__RegAssignment_14563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__SetPC__LabelAssignment_24594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Prio__RegAssignment_14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Prio__PrioAssignment_24656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Done__PcAssignment_14687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Binop__OpAssignment_04718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Binop__ToAssignment_14749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Binop__Arg1Assignment_24780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Binop__Arg2Assignment_3_04811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Binop__ValAssignment_3_14842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Jmp__LabelAssignment_14873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpKind_in_rule__CJmp__CondAssignment_04904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__CJmp__RegAssignment_14935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__CJmp__LabelAssignment_24966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoveKind_in_rule__Move__TypeAssignment_04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Move__ToAssignment_15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Move__FromAssignment_2_05059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Move__ValAssignment_2_15090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reg__NameAssignment5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Read__PreAssignment_0_05188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Read__RegAssignment_0_25227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReg_in_rule__Read__RegAssignment_15258 = new BitSet(new long[]{0x0000000000000002L});

}