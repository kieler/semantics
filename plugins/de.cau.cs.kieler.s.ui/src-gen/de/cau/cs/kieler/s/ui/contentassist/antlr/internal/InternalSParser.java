package de.cau.cs.kieler.s.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.s.services.SGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'INT'", "'BOOL'", "'FLOAT'", "'Synchronous Program'", "'('", "')'", "'Inputs'", "';'", "','", "'Outputs'", "'Signals'", "'@'", "':'", "'SIGNALS'", "'combine'", "'CUSTOM'", "'PAUSE'", "'TERM'", "'Halt'", "'JOIN'", "'ABORT'", "'PRESENT'", "'{'", "'}'", "'GOTO'", "'FORK'", "'FORKE'", "'EMIT'", "'AWAIT'", "'PRIO'"
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g"; }


     
     	private SGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleProgram
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:62:1: ( ruleProgram EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:63:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();
            _fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:70:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:74:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:75:1: ( ( rule__Program__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:75:1: ( ( rule__Program__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:76:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:77:1: ( rule__Program__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:77:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleAnnotation
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:89:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:90:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:91:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation121);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation128); 

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:98:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:102:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:103:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:103:1: ( ( rule__Annotation__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:104:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:105:1: ( rule__Annotation__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:105:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation154);
            rule__Annotation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:119:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:120:1: ( ruleState EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:121:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState183);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState190); 

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
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:128:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:132:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:133:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:133:1: ( ( rule__State__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:134:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:135:1: ( rule__State__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:135:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState216);
            rule__State__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:147:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:148:1: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:149:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal243);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal250); 

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
    // $ANTLR end entryRuleSignal


    // $ANTLR start ruleSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:156:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:160:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:161:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:161:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:162:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:163:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:163:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_ruleSignal276);
            rule__Signal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:177:1: entryRuleSignalType : ruleSignalType EOF ;
    public final void entryRuleSignalType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:178:1: ( ruleSignalType EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:179:1: ruleSignalType EOF
            {
             before(grammarAccess.getSignalTypeRule()); 
            pushFollow(FOLLOW_ruleSignalType_in_entryRuleSignalType305);
            ruleSignalType();
            _fsp--;

             after(grammarAccess.getSignalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalType312); 

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
    // $ANTLR end entryRuleSignalType


    // $ANTLR start ruleSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:186:1: ruleSignalType : ( ( rule__SignalType__Alternatives ) ) ;
    public final void ruleSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:190:2: ( ( ( rule__SignalType__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:191:1: ( ( rule__SignalType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:191:1: ( ( rule__SignalType__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:192:1: ( rule__SignalType__Alternatives )
            {
             before(grammarAccess.getSignalTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:193:1: ( rule__SignalType__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:193:2: rule__SignalType__Alternatives
            {
            pushFollow(FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType338);
            rule__SignalType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSignalTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleSignalType


    // $ANTLR start entryRuleCustomSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:205:1: entryRuleCustomSignalType : ruleCustomSignalType EOF ;
    public final void entryRuleCustomSignalType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:206:1: ( ruleCustomSignalType EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:207:1: ruleCustomSignalType EOF
            {
             before(grammarAccess.getCustomSignalTypeRule()); 
            pushFollow(FOLLOW_ruleCustomSignalType_in_entryRuleCustomSignalType365);
            ruleCustomSignalType();
            _fsp--;

             after(grammarAccess.getCustomSignalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomSignalType372); 

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
    // $ANTLR end entryRuleCustomSignalType


    // $ANTLR start ruleCustomSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:214:1: ruleCustomSignalType : ( ( rule__CustomSignalType__Group__0 ) ) ;
    public final void ruleCustomSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:218:2: ( ( ( rule__CustomSignalType__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:219:1: ( ( rule__CustomSignalType__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:219:1: ( ( rule__CustomSignalType__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:220:1: ( rule__CustomSignalType__Group__0 )
            {
             before(grammarAccess.getCustomSignalTypeAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:221:1: ( rule__CustomSignalType__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:221:2: rule__CustomSignalType__Group__0
            {
            pushFollow(FOLLOW_rule__CustomSignalType__Group__0_in_ruleCustomSignalType398);
            rule__CustomSignalType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomSignalTypeAccess().getGroup()); 

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
    // $ANTLR end ruleCustomSignalType


    // $ANTLR start entryRulePrimitiveSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:233:1: entryRulePrimitiveSignalType : rulePrimitiveSignalType EOF ;
    public final void entryRulePrimitiveSignalType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:234:1: ( rulePrimitiveSignalType EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:235:1: rulePrimitiveSignalType EOF
            {
             before(grammarAccess.getPrimitiveSignalTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveSignalType_in_entryRulePrimitiveSignalType425);
            rulePrimitiveSignalType();
            _fsp--;

             after(grammarAccess.getPrimitiveSignalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSignalType432); 

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
    // $ANTLR end entryRulePrimitiveSignalType


    // $ANTLR start rulePrimitiveSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:242:1: rulePrimitiveSignalType : ( ( rule__PrimitiveSignalType__PrimitiveTypeAssignment ) ) ;
    public final void rulePrimitiveSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:246:2: ( ( ( rule__PrimitiveSignalType__PrimitiveTypeAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:247:1: ( ( rule__PrimitiveSignalType__PrimitiveTypeAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:247:1: ( ( rule__PrimitiveSignalType__PrimitiveTypeAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:248:1: ( rule__PrimitiveSignalType__PrimitiveTypeAssignment )
            {
             before(grammarAccess.getPrimitiveSignalTypeAccess().getPrimitiveTypeAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:249:1: ( rule__PrimitiveSignalType__PrimitiveTypeAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:249:2: rule__PrimitiveSignalType__PrimitiveTypeAssignment
            {
            pushFollow(FOLLOW_rule__PrimitiveSignalType__PrimitiveTypeAssignment_in_rulePrimitiveSignalType458);
            rule__PrimitiveSignalType__PrimitiveTypeAssignment();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveSignalTypeAccess().getPrimitiveTypeAssignment()); 

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
    // $ANTLR end rulePrimitiveSignalType


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:261:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:262:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:263:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue485);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue492); 

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
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:270:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:274:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:275:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:275:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:276:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:277:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:277:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue518);
            rule__IntValue__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleInstruction
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:293:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:294:1: ( ruleInstruction EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:295:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction549);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction556); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:302:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:306:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:307:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:307:1: ( ( rule__Instruction__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:308:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:309:1: ( rule__Instruction__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:309:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction582);
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


    // $ANTLR start entryRulePause
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:321:1: entryRulePause : rulePause EOF ;
    public final void entryRulePause() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:322:1: ( rulePause EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:323:1: rulePause EOF
            {
             before(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_rulePause_in_entryRulePause609);
            rulePause();
            _fsp--;

             after(grammarAccess.getPauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePause616); 

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
    // $ANTLR end entryRulePause


    // $ANTLR start rulePause
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:330:1: rulePause : ( ( rule__Pause__Group__0 ) ) ;
    public final void rulePause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:334:2: ( ( ( rule__Pause__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:335:1: ( ( rule__Pause__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:335:1: ( ( rule__Pause__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:336:1: ( rule__Pause__Group__0 )
            {
             before(grammarAccess.getPauseAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:337:1: ( rule__Pause__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:337:2: rule__Pause__Group__0
            {
            pushFollow(FOLLOW_rule__Pause__Group__0_in_rulePause642);
            rule__Pause__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPauseAccess().getGroup()); 

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
    // $ANTLR end rulePause


    // $ANTLR start entryRuleTerm
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:349:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:350:1: ( ruleTerm EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:351:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm669);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm676); 

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
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:358:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:362:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:363:1: ( ( rule__Term__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:363:1: ( ( rule__Term__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:364:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:365:1: ( rule__Term__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:365:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm702);
            rule__Term__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleHalt
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:377:1: entryRuleHalt : ruleHalt EOF ;
    public final void entryRuleHalt() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:378:1: ( ruleHalt EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:379:1: ruleHalt EOF
            {
             before(grammarAccess.getHaltRule()); 
            pushFollow(FOLLOW_ruleHalt_in_entryRuleHalt729);
            ruleHalt();
            _fsp--;

             after(grammarAccess.getHaltRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHalt736); 

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
    // $ANTLR end entryRuleHalt


    // $ANTLR start ruleHalt
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:386:1: ruleHalt : ( ( rule__Halt__Group__0 ) ) ;
    public final void ruleHalt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:390:2: ( ( ( rule__Halt__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Halt__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Halt__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:392:1: ( rule__Halt__Group__0 )
            {
             before(grammarAccess.getHaltAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:1: ( rule__Halt__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:2: rule__Halt__Group__0
            {
            pushFollow(FOLLOW_rule__Halt__Group__0_in_ruleHalt762);
            rule__Halt__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHaltAccess().getGroup()); 

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
    // $ANTLR end ruleHalt


    // $ANTLR start entryRuleJoin
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:405:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:406:1: ( ruleJoin EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:407:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin789);
            ruleJoin();
            _fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin796); 

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
    // $ANTLR end entryRuleJoin


    // $ANTLR start ruleJoin
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:414:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:418:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Join__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Join__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:420:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:1: ( rule__Join__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:2: rule__Join__Group__0
            {
            pushFollow(FOLLOW_rule__Join__Group__0_in_ruleJoin822);
            rule__Join__Group__0();
            _fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

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
    // $ANTLR end ruleJoin


    // $ANTLR start entryRuleAbort
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:433:1: entryRuleAbort : ruleAbort EOF ;
    public final void entryRuleAbort() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:434:1: ( ruleAbort EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:435:1: ruleAbort EOF
            {
             before(grammarAccess.getAbortRule()); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort849);
            ruleAbort();
            _fsp--;

             after(grammarAccess.getAbortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort856); 

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
    // $ANTLR end entryRuleAbort


    // $ANTLR start ruleAbort
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:442:1: ruleAbort : ( ( rule__Abort__Group__0 ) ) ;
    public final void ruleAbort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:446:2: ( ( ( rule__Abort__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Abort__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Abort__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:448:1: ( rule__Abort__Group__0 )
            {
             before(grammarAccess.getAbortAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:1: ( rule__Abort__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:2: rule__Abort__Group__0
            {
            pushFollow(FOLLOW_rule__Abort__Group__0_in_ruleAbort882);
            rule__Abort__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAbortAccess().getGroup()); 

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
    // $ANTLR end ruleAbort


    // $ANTLR start entryRulePresent
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:461:1: entryRulePresent : rulePresent EOF ;
    public final void entryRulePresent() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:462:1: ( rulePresent EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:463:1: rulePresent EOF
            {
             before(grammarAccess.getPresentRule()); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent909);
            rulePresent();
            _fsp--;

             after(grammarAccess.getPresentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent916); 

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
    // $ANTLR end entryRulePresent


    // $ANTLR start rulePresent
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:470:1: rulePresent : ( ( rule__Present__Group__0 ) ) ;
    public final void rulePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:474:2: ( ( ( rule__Present__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Present__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Present__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:476:1: ( rule__Present__Group__0 )
            {
             before(grammarAccess.getPresentAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:1: ( rule__Present__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:2: rule__Present__Group__0
            {
            pushFollow(FOLLOW_rule__Present__Group__0_in_rulePresent942);
            rule__Present__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getGroup()); 

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
    // $ANTLR end rulePresent


    // $ANTLR start entryRuleGoto
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:489:1: entryRuleGoto : ruleGoto EOF ;
    public final void entryRuleGoto() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:490:1: ( ruleGoto EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:491:1: ruleGoto EOF
            {
             before(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto969);
            ruleGoto();
            _fsp--;

             after(grammarAccess.getGotoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto976); 

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
    // $ANTLR end entryRuleGoto


    // $ANTLR start ruleGoto
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:498:1: ruleGoto : ( ( rule__Goto__Group__0 ) ) ;
    public final void ruleGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:502:2: ( ( ( rule__Goto__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Goto__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Goto__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:504:1: ( rule__Goto__Group__0 )
            {
             before(grammarAccess.getGotoAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:1: ( rule__Goto__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:2: rule__Goto__Group__0
            {
            pushFollow(FOLLOW_rule__Goto__Group__0_in_ruleGoto1002);
            rule__Goto__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGotoAccess().getGroup()); 

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
    // $ANTLR end ruleGoto


    // $ANTLR start entryRuleFork
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:517:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:518:1: ( ruleFork EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:519:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_ruleFork_in_entryRuleFork1029);
            ruleFork();
            _fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFork1036); 

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
    // $ANTLR end entryRuleFork


    // $ANTLR start ruleFork
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:526:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:530:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Fork__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:532:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:1: ( rule__Fork__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:2: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_rule__Fork__Group__0_in_ruleFork1062);
            rule__Fork__Group__0();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

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
    // $ANTLR end ruleFork


    // $ANTLR start entryRuleForke
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:545:1: entryRuleForke : ruleForke EOF ;
    public final void entryRuleForke() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:546:1: ( ruleForke EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:547:1: ruleForke EOF
            {
             before(grammarAccess.getForkeRule()); 
            pushFollow(FOLLOW_ruleForke_in_entryRuleForke1089);
            ruleForke();
            _fsp--;

             after(grammarAccess.getForkeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForke1096); 

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
    // $ANTLR end entryRuleForke


    // $ANTLR start ruleForke
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:554:1: ruleForke : ( ( rule__Forke__Group__0 ) ) ;
    public final void ruleForke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:558:2: ( ( ( rule__Forke__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Forke__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Forke__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:560:1: ( rule__Forke__Group__0 )
            {
             before(grammarAccess.getForkeAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:1: ( rule__Forke__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:2: rule__Forke__Group__0
            {
            pushFollow(FOLLOW_rule__Forke__Group__0_in_ruleForke1122);
            rule__Forke__Group__0();
            _fsp--;


            }

             after(grammarAccess.getForkeAccess().getGroup()); 

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
    // $ANTLR end ruleForke


    // $ANTLR start entryRuleEmit
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:573:1: entryRuleEmit : ruleEmit EOF ;
    public final void entryRuleEmit() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:574:1: ( ruleEmit EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:575:1: ruleEmit EOF
            {
             before(grammarAccess.getEmitRule()); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit1149);
            ruleEmit();
            _fsp--;

             after(grammarAccess.getEmitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit1156); 

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
    // $ANTLR end entryRuleEmit


    // $ANTLR start ruleEmit
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:582:1: ruleEmit : ( ( rule__Emit__Group__0 ) ) ;
    public final void ruleEmit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:586:2: ( ( ( rule__Emit__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Emit__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Emit__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:588:1: ( rule__Emit__Group__0 )
            {
             before(grammarAccess.getEmitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:1: ( rule__Emit__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:2: rule__Emit__Group__0
            {
            pushFollow(FOLLOW_rule__Emit__Group__0_in_ruleEmit1182);
            rule__Emit__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEmitAccess().getGroup()); 

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
    // $ANTLR end ruleEmit


    // $ANTLR start entryRuleAwait
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:601:1: entryRuleAwait : ruleAwait EOF ;
    public final void entryRuleAwait() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:602:1: ( ruleAwait EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:603:1: ruleAwait EOF
            {
             before(grammarAccess.getAwaitRule()); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait1209);
            ruleAwait();
            _fsp--;

             after(grammarAccess.getAwaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait1216); 

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
    // $ANTLR end entryRuleAwait


    // $ANTLR start ruleAwait
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:610:1: ruleAwait : ( ( rule__Await__Group__0 ) ) ;
    public final void ruleAwait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:614:2: ( ( ( rule__Await__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Await__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Await__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:616:1: ( rule__Await__Group__0 )
            {
             before(grammarAccess.getAwaitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:1: ( rule__Await__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:2: rule__Await__Group__0
            {
            pushFollow(FOLLOW_rule__Await__Group__0_in_ruleAwait1242);
            rule__Await__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAwaitAccess().getGroup()); 

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
    // $ANTLR end ruleAwait


    // $ANTLR start entryRulePrio
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:629:1: entryRulePrio : rulePrio EOF ;
    public final void entryRulePrio() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:630:1: ( rulePrio EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:631:1: rulePrio EOF
            {
             before(grammarAccess.getPrioRule()); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio1269);
            rulePrio();
            _fsp--;

             after(grammarAccess.getPrioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio1276); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:638:1: rulePrio : ( ( rule__Prio__Group__0 ) ) ;
    public final void rulePrio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:642:2: ( ( ( rule__Prio__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:643:1: ( ( rule__Prio__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:643:1: ( ( rule__Prio__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:644:1: ( rule__Prio__Group__0 )
            {
             before(grammarAccess.getPrioAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:645:1: ( rule__Prio__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:645:2: rule__Prio__Group__0
            {
            pushFollow(FOLLOW_rule__Prio__Group__0_in_rulePrio1302);
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


    // $ANTLR start rulePrimitiveType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:658:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:662:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:663:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:663:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:664:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:665:1: ( rule__PrimitiveType__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:665:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1339);
            rule__PrimitiveType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

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
    // $ANTLR end rulePrimitiveType


    // $ANTLR start rule__SignalType__Alternatives
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:677:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) );
    public final void rule__SignalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:681:1: ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("677:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:682:1: ( rulePrimitiveSignalType )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:682:1: ( rulePrimitiveSignalType )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:683:1: rulePrimitiveSignalType
                    {
                     before(grammarAccess.getSignalTypeAccess().getPrimitiveSignalTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveSignalType_in_rule__SignalType__Alternatives1375);
                    rulePrimitiveSignalType();
                    _fsp--;

                     after(grammarAccess.getSignalTypeAccess().getPrimitiveSignalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:688:6: ( ruleCustomSignalType )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:688:6: ( ruleCustomSignalType )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:689:1: ruleCustomSignalType
                    {
                     before(grammarAccess.getSignalTypeAccess().getCustomSignalTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomSignalType_in_rule__SignalType__Alternatives1392);
                    ruleCustomSignalType();
                    _fsp--;

                     after(grammarAccess.getSignalTypeAccess().getCustomSignalTypeParserRuleCall_1()); 

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
    // $ANTLR end rule__SignalType__Alternatives


    // $ANTLR start rule__Instruction__Alternatives
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:699:1: rule__Instruction__Alternatives : ( ( ruleHalt ) | ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_11__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:703:1: ( ( ruleHalt ) | ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_11__0 ) ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 35:
                {
                alt2=6;
                }
                break;
            case 38:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 41:
                {
                alt2=10;
                }
                break;
            case 42:
                {
                alt2=11;
                }
                break;
            case 43:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("699:1: rule__Instruction__Alternatives : ( ( ruleHalt ) | ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_11__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:704:1: ( ruleHalt )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:704:1: ( ruleHalt )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:705:1: ruleHalt
                    {
                     before(grammarAccess.getInstructionAccess().getHaltParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHalt_in_rule__Instruction__Alternatives1424);
                    ruleHalt();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getHaltParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:710:6: ( ruleAbort )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:710:6: ( ruleAbort )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:711:1: ruleAbort
                    {
                     before(grammarAccess.getInstructionAccess().getAbortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1441);
                    ruleAbort();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAbortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:716:6: ( ruleJoin )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:716:6: ( ruleJoin )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:717:1: ruleJoin
                    {
                     before(grammarAccess.getInstructionAccess().getJoinParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1458);
                    ruleJoin();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getJoinParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:722:6: ( rulePause )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:722:6: ( rulePause )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:723:1: rulePause
                    {
                     before(grammarAccess.getInstructionAccess().getPauseParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePause_in_rule__Instruction__Alternatives1475);
                    rulePause();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPauseParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:728:6: ( ruleTerm )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:728:6: ( ruleTerm )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:729:1: ruleTerm
                    {
                     before(grammarAccess.getInstructionAccess().getTermParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1492);
                    ruleTerm();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getTermParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:734:6: ( rulePresent )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:734:6: ( rulePresent )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:735:1: rulePresent
                    {
                     before(grammarAccess.getInstructionAccess().getPresentParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulePresent_in_rule__Instruction__Alternatives1509);
                    rulePresent();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPresentParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:740:6: ( ruleGoto )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:740:6: ( ruleGoto )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:741:1: ruleGoto
                    {
                     before(grammarAccess.getInstructionAccess().getGotoParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1526);
                    ruleGoto();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getGotoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:746:6: ( ruleFork )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:746:6: ( ruleFork )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:747:1: ruleFork
                    {
                     before(grammarAccess.getInstructionAccess().getForkParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleFork_in_rule__Instruction__Alternatives1543);
                    ruleFork();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:752:6: ( ruleForke )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:752:6: ( ruleForke )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:753:1: ruleForke
                    {
                     before(grammarAccess.getInstructionAccess().getForkeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleForke_in_rule__Instruction__Alternatives1560);
                    ruleForke();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:758:6: ( ruleEmit )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:758:6: ( ruleEmit )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:759:1: ruleEmit
                    {
                     before(grammarAccess.getInstructionAccess().getEmitParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1577);
                    ruleEmit();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getEmitParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:764:6: ( ruleAwait )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:764:6: ( ruleAwait )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:765:1: ruleAwait
                    {
                     before(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1594);
                    ruleAwait();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:770:6: ( ( rule__Instruction__Group_11__0 ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:770:6: ( ( rule__Instruction__Group_11__0 ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:771:1: ( rule__Instruction__Group_11__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_11()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:772:1: ( rule__Instruction__Group_11__0 )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:772:2: rule__Instruction__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_11__0_in_rule__Instruction__Alternatives1611);
                    rule__Instruction__Group_11__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_11()); 

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


    // $ANTLR start rule__PrimitiveType__Alternatives
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:781:1: rule__PrimitiveType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:785:1: ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("781:1: rule__PrimitiveType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:786:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:786:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:787:1: ( 'PURE' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getPureEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:788:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:788:3: 'PURE'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveType__Alternatives1645); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getPureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:793:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:793:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:794:1: ( 'INT' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:795:1: ( 'INT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:795:3: 'INT'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveType__Alternatives1666); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:800:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:800:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:801:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:802:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:802:3: 'BOOL'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveType__Alternatives1687); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBoolEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:807:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:807:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:808:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:809:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:809:3: 'FLOAT'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveType__Alternatives1708); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__PrimitiveType__Alternatives


    // $ANTLR start rule__Program__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:821:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:825:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:826:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01741);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01744);
            rule__Program__Group__1();
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
    // $ANTLR end rule__Program__Group__0


    // $ANTLR start rule__Program__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:833:1: rule__Program__Group__0__Impl : ( 'Synchronous Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:837:1: ( ( 'Synchronous Program' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:838:1: ( 'Synchronous Program' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:838:1: ( 'Synchronous Program' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:839:1: 'Synchronous Program'
            {
             before(grammarAccess.getProgramAccess().getSynchronousProgramKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__0__Impl1772); 
             after(grammarAccess.getProgramAccess().getSynchronousProgramKeyword_0()); 

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
    // $ANTLR end rule__Program__Group__0__Impl


    // $ANTLR start rule__Program__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:852:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:856:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:857:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11803);
            rule__Program__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11806);
            rule__Program__Group__2();
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
    // $ANTLR end rule__Program__Group__1


    // $ANTLR start rule__Program__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:864:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:868:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:869:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:869:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:870:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:871:1: ( rule__Program__NameAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:871:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1833);
            rule__Program__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Program__Group__1__Impl


    // $ANTLR start rule__Program__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:881:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:885:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:886:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21863);
            rule__Program__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21866);
            rule__Program__Group__3();
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
    // $ANTLR end rule__Program__Group__2


    // $ANTLR start rule__Program__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:893:1: rule__Program__Group__2__Impl : ( '(' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:897:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:898:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:898:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:899:1: '('
            {
             before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__2__Impl1894); 
             after(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Program__Group__2__Impl


    // $ANTLR start rule__Program__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:912:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:916:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:917:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31925);
            rule__Program__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31928);
            rule__Program__Group__4();
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
    // $ANTLR end rule__Program__Group__3


    // $ANTLR start rule__Program__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:924:1: rule__Program__Group__3__Impl : ( ( rule__Program__PriorityAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:928:1: ( ( ( rule__Program__PriorityAssignment_3 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:929:1: ( ( rule__Program__PriorityAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:929:1: ( ( rule__Program__PriorityAssignment_3 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:930:1: ( rule__Program__PriorityAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPriorityAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:931:1: ( rule__Program__PriorityAssignment_3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:931:2: rule__Program__PriorityAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1955);
            rule__Program__PriorityAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getPriorityAssignment_3()); 

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
    // $ANTLR end rule__Program__Group__3__Impl


    // $ANTLR start rule__Program__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:941:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:945:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:946:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41985);
            rule__Program__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41988);
            rule__Program__Group__5();
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
    // $ANTLR end rule__Program__Group__4


    // $ANTLR start rule__Program__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:953:1: rule__Program__Group__4__Impl : ( ')' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:957:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:958:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:958:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:959:1: ')'
            {
             before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__4__Impl2016); 
             after(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Program__Group__4__Impl


    // $ANTLR start rule__Program__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:972:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:976:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:977:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52047);
            rule__Program__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52050);
            rule__Program__Group__6();
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
    // $ANTLR end rule__Program__Group__5


    // $ANTLR start rule__Program__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:984:1: rule__Program__Group__5__Impl : ( ( rule__Program__Group_5__0 )? ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:988:1: ( ( ( rule__Program__Group_5__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:989:1: ( ( rule__Program__Group_5__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:989:1: ( ( rule__Program__Group_5__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:990:1: ( rule__Program__Group_5__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:991:1: ( rule__Program__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:991:2: rule__Program__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2077);
                    rule__Program__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_5()); 

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
    // $ANTLR end rule__Program__Group__5__Impl


    // $ANTLR start rule__Program__Group__6
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1001:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1005:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1006:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62108);
            rule__Program__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62111);
            rule__Program__Group__7();
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
    // $ANTLR end rule__Program__Group__6


    // $ANTLR start rule__Program__Group__6__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1013:1: rule__Program__Group__6__Impl : ( ( rule__Program__Group_6__0 )? ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1017:1: ( ( ( rule__Program__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1018:1: ( ( rule__Program__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1018:1: ( ( rule__Program__Group_6__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1019:1: ( rule__Program__Group_6__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1020:1: ( rule__Program__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1020:2: rule__Program__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2138);
                    rule__Program__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_6()); 

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
    // $ANTLR end rule__Program__Group__6__Impl


    // $ANTLR start rule__Program__Group__7
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1030:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1034:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1035:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72169);
            rule__Program__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72172);
            rule__Program__Group__8();
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
    // $ANTLR end rule__Program__Group__7


    // $ANTLR start rule__Program__Group__7__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1042:1: rule__Program__Group__7__Impl : ( ( rule__Program__Group_7__0 )? ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1046:1: ( ( ( rule__Program__Group_7__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1047:1: ( ( rule__Program__Group_7__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1047:1: ( ( rule__Program__Group_7__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1048:1: ( rule__Program__Group_7__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_7()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1049:1: ( rule__Program__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1049:2: rule__Program__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2199);
                    rule__Program__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_7()); 

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
    // $ANTLR end rule__Program__Group__7__Impl


    // $ANTLR start rule__Program__Group__8
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1059:1: rule__Program__Group__8 : rule__Program__Group__8__Impl ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1063:1: ( rule__Program__Group__8__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1064:2: rule__Program__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82230);
            rule__Program__Group__8__Impl();
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
    // $ANTLR end rule__Program__Group__8


    // $ANTLR start rule__Program__Group__8__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1070:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1074:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1075:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1075:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1076:1: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1076:1: ( ( rule__Program__StatesAssignment_8 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1077:1: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1078:1: ( rule__Program__StatesAssignment_8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1078:2: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2259);
            rule__Program__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1081:1: ( ( rule__Program__StatesAssignment_8 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1082:1: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1083:1: ( rule__Program__StatesAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1083:2: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2271);
            	    rule__Program__StatesAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }


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
    // $ANTLR end rule__Program__Group__8__Impl


    // $ANTLR start rule__Program__Group_5__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1112:1: rule__Program__Group_5__0 : rule__Program__Group_5__0__Impl rule__Program__Group_5__1 ;
    public final void rule__Program__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1116:1: ( rule__Program__Group_5__0__Impl rule__Program__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1117:2: rule__Program__Group_5__0__Impl rule__Program__Group_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02322);
            rule__Program__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02325);
            rule__Program__Group_5__1();
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
    // $ANTLR end rule__Program__Group_5__0


    // $ANTLR start rule__Program__Group_5__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1124:1: rule__Program__Group_5__0__Impl : ( 'Inputs' ) ;
    public final void rule__Program__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1128:1: ( ( 'Inputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1129:1: ( 'Inputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1129:1: ( 'Inputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1130:1: 'Inputs'
            {
             before(grammarAccess.getProgramAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_5__0__Impl2353); 
             after(grammarAccess.getProgramAccess().getInputsKeyword_5_0()); 

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
    // $ANTLR end rule__Program__Group_5__0__Impl


    // $ANTLR start rule__Program__Group_5__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1143:1: rule__Program__Group_5__1 : rule__Program__Group_5__1__Impl rule__Program__Group_5__2 ;
    public final void rule__Program__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1147:1: ( rule__Program__Group_5__1__Impl rule__Program__Group_5__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1148:2: rule__Program__Group_5__1__Impl rule__Program__Group_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12384);
            rule__Program__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12387);
            rule__Program__Group_5__2();
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
    // $ANTLR end rule__Program__Group_5__1


    // $ANTLR start rule__Program__Group_5__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1155:1: rule__Program__Group_5__1__Impl : ( ( rule__Program__SignalsAssignment_5_1 ) ) ;
    public final void rule__Program__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1159:1: ( ( ( rule__Program__SignalsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1160:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1160:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1161:1: ( rule__Program__SignalsAssignment_5_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1162:1: ( rule__Program__SignalsAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1162:2: rule__Program__SignalsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2414);
            rule__Program__SignalsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_5_1()); 

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
    // $ANTLR end rule__Program__Group_5__1__Impl


    // $ANTLR start rule__Program__Group_5__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1172:1: rule__Program__Group_5__2 : rule__Program__Group_5__2__Impl rule__Program__Group_5__3 ;
    public final void rule__Program__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1176:1: ( rule__Program__Group_5__2__Impl rule__Program__Group_5__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1177:2: rule__Program__Group_5__2__Impl rule__Program__Group_5__3
            {
            pushFollow(FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22444);
            rule__Program__Group_5__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22447);
            rule__Program__Group_5__3();
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
    // $ANTLR end rule__Program__Group_5__2


    // $ANTLR start rule__Program__Group_5__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1184:1: rule__Program__Group_5__2__Impl : ( ( rule__Program__Group_5_2__0 )* ) ;
    public final void rule__Program__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1188:1: ( ( ( rule__Program__Group_5_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1189:1: ( ( rule__Program__Group_5_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1189:1: ( ( rule__Program__Group_5_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1190:1: ( rule__Program__Group_5_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_5_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1191:1: ( rule__Program__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1191:2: rule__Program__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2474);
            	    rule__Program__Group_5_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_5_2()); 

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
    // $ANTLR end rule__Program__Group_5__2__Impl


    // $ANTLR start rule__Program__Group_5__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1201:1: rule__Program__Group_5__3 : rule__Program__Group_5__3__Impl ;
    public final void rule__Program__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1205:1: ( rule__Program__Group_5__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1206:2: rule__Program__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32505);
            rule__Program__Group_5__3__Impl();
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
    // $ANTLR end rule__Program__Group_5__3


    // $ANTLR start rule__Program__Group_5__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1212:1: rule__Program__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1216:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1217:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1217:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1218:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_5_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_5__3__Impl2533); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_5_3()); 

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
    // $ANTLR end rule__Program__Group_5__3__Impl


    // $ANTLR start rule__Program__Group_5_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1239:1: rule__Program__Group_5_2__0 : rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 ;
    public final void rule__Program__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1243:1: ( rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1244:2: rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02572);
            rule__Program__Group_5_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02575);
            rule__Program__Group_5_2__1();
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
    // $ANTLR end rule__Program__Group_5_2__0


    // $ANTLR start rule__Program__Group_5_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1251:1: rule__Program__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1255:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1256:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1256:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1257:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_5_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2603); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end rule__Program__Group_5_2__0__Impl


    // $ANTLR start rule__Program__Group_5_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1270:1: rule__Program__Group_5_2__1 : rule__Program__Group_5_2__1__Impl ;
    public final void rule__Program__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1274:1: ( rule__Program__Group_5_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1275:2: rule__Program__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12634);
            rule__Program__Group_5_2__1__Impl();
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
    // $ANTLR end rule__Program__Group_5_2__1


    // $ANTLR start rule__Program__Group_5_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1281:1: rule__Program__Group_5_2__1__Impl : ( ( rule__Program__SignalsAssignment_5_2_1 ) ) ;
    public final void rule__Program__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1285:1: ( ( ( rule__Program__SignalsAssignment_5_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1286:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1286:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1287:1: ( rule__Program__SignalsAssignment_5_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1288:1: ( rule__Program__SignalsAssignment_5_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1288:2: rule__Program__SignalsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2661);
            rule__Program__SignalsAssignment_5_2_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_5_2_1()); 

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
    // $ANTLR end rule__Program__Group_5_2__1__Impl


    // $ANTLR start rule__Program__Group_6__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1302:1: rule__Program__Group_6__0 : rule__Program__Group_6__0__Impl rule__Program__Group_6__1 ;
    public final void rule__Program__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1306:1: ( rule__Program__Group_6__0__Impl rule__Program__Group_6__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1307:2: rule__Program__Group_6__0__Impl rule__Program__Group_6__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02695);
            rule__Program__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02698);
            rule__Program__Group_6__1();
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
    // $ANTLR end rule__Program__Group_6__0


    // $ANTLR start rule__Program__Group_6__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1314:1: rule__Program__Group_6__0__Impl : ( 'Outputs' ) ;
    public final void rule__Program__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1318:1: ( ( 'Outputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1319:1: ( 'Outputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1319:1: ( 'Outputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1320:1: 'Outputs'
            {
             before(grammarAccess.getProgramAccess().getOutputsKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group_6__0__Impl2726); 
             after(grammarAccess.getProgramAccess().getOutputsKeyword_6_0()); 

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
    // $ANTLR end rule__Program__Group_6__0__Impl


    // $ANTLR start rule__Program__Group_6__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1333:1: rule__Program__Group_6__1 : rule__Program__Group_6__1__Impl rule__Program__Group_6__2 ;
    public final void rule__Program__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1337:1: ( rule__Program__Group_6__1__Impl rule__Program__Group_6__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1338:2: rule__Program__Group_6__1__Impl rule__Program__Group_6__2
            {
            pushFollow(FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12757);
            rule__Program__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12760);
            rule__Program__Group_6__2();
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
    // $ANTLR end rule__Program__Group_6__1


    // $ANTLR start rule__Program__Group_6__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1345:1: rule__Program__Group_6__1__Impl : ( ( rule__Program__SignalsAssignment_6_1 ) ) ;
    public final void rule__Program__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1349:1: ( ( ( rule__Program__SignalsAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1350:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1350:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1351:1: ( rule__Program__SignalsAssignment_6_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1352:1: ( rule__Program__SignalsAssignment_6_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1352:2: rule__Program__SignalsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2787);
            rule__Program__SignalsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_6_1()); 

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
    // $ANTLR end rule__Program__Group_6__1__Impl


    // $ANTLR start rule__Program__Group_6__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1362:1: rule__Program__Group_6__2 : rule__Program__Group_6__2__Impl rule__Program__Group_6__3 ;
    public final void rule__Program__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1366:1: ( rule__Program__Group_6__2__Impl rule__Program__Group_6__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1367:2: rule__Program__Group_6__2__Impl rule__Program__Group_6__3
            {
            pushFollow(FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22817);
            rule__Program__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22820);
            rule__Program__Group_6__3();
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
    // $ANTLR end rule__Program__Group_6__2


    // $ANTLR start rule__Program__Group_6__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1374:1: rule__Program__Group_6__2__Impl : ( ( rule__Program__Group_6_2__0 )* ) ;
    public final void rule__Program__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1378:1: ( ( ( rule__Program__Group_6_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1379:1: ( ( rule__Program__Group_6_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1379:1: ( ( rule__Program__Group_6_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1380:1: ( rule__Program__Group_6_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_6_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1381:1: ( rule__Program__Group_6_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1381:2: rule__Program__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2847);
            	    rule__Program__Group_6_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_6_2()); 

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
    // $ANTLR end rule__Program__Group_6__2__Impl


    // $ANTLR start rule__Program__Group_6__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1391:1: rule__Program__Group_6__3 : rule__Program__Group_6__3__Impl ;
    public final void rule__Program__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1395:1: ( rule__Program__Group_6__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1396:2: rule__Program__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32878);
            rule__Program__Group_6__3__Impl();
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
    // $ANTLR end rule__Program__Group_6__3


    // $ANTLR start rule__Program__Group_6__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1402:1: rule__Program__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1406:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1407:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1407:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1408:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_6_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_6__3__Impl2906); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_6_3()); 

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
    // $ANTLR end rule__Program__Group_6__3__Impl


    // $ANTLR start rule__Program__Group_6_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1429:1: rule__Program__Group_6_2__0 : rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 ;
    public final void rule__Program__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1433:1: ( rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1434:2: rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02945);
            rule__Program__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02948);
            rule__Program__Group_6_2__1();
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
    // $ANTLR end rule__Program__Group_6_2__0


    // $ANTLR start rule__Program__Group_6_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1441:1: rule__Program__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1445:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1446:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1446:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1447:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_6_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_6_2__0__Impl2976); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end rule__Program__Group_6_2__0__Impl


    // $ANTLR start rule__Program__Group_6_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1460:1: rule__Program__Group_6_2__1 : rule__Program__Group_6_2__1__Impl ;
    public final void rule__Program__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1464:1: ( rule__Program__Group_6_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1465:2: rule__Program__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__13007);
            rule__Program__Group_6_2__1__Impl();
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
    // $ANTLR end rule__Program__Group_6_2__1


    // $ANTLR start rule__Program__Group_6_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1471:1: rule__Program__Group_6_2__1__Impl : ( ( rule__Program__SignalsAssignment_6_2_1 ) ) ;
    public final void rule__Program__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1475:1: ( ( ( rule__Program__SignalsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1476:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1476:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1477:1: ( rule__Program__SignalsAssignment_6_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1478:1: ( rule__Program__SignalsAssignment_6_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1478:2: rule__Program__SignalsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl3034);
            rule__Program__SignalsAssignment_6_2_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_6_2_1()); 

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
    // $ANTLR end rule__Program__Group_6_2__1__Impl


    // $ANTLR start rule__Program__Group_7__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1492:1: rule__Program__Group_7__0 : rule__Program__Group_7__0__Impl rule__Program__Group_7__1 ;
    public final void rule__Program__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1496:1: ( rule__Program__Group_7__0__Impl rule__Program__Group_7__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1497:2: rule__Program__Group_7__0__Impl rule__Program__Group_7__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__03068);
            rule__Program__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__03071);
            rule__Program__Group_7__1();
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
    // $ANTLR end rule__Program__Group_7__0


    // $ANTLR start rule__Program__Group_7__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1504:1: rule__Program__Group_7__0__Impl : ( 'Signals' ) ;
    public final void rule__Program__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1508:1: ( ( 'Signals' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1509:1: ( 'Signals' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1509:1: ( 'Signals' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1510:1: 'Signals'
            {
             before(grammarAccess.getProgramAccess().getSignalsKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group_7__0__Impl3099); 
             after(grammarAccess.getProgramAccess().getSignalsKeyword_7_0()); 

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
    // $ANTLR end rule__Program__Group_7__0__Impl


    // $ANTLR start rule__Program__Group_7__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1523:1: rule__Program__Group_7__1 : rule__Program__Group_7__1__Impl rule__Program__Group_7__2 ;
    public final void rule__Program__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1527:1: ( rule__Program__Group_7__1__Impl rule__Program__Group_7__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1528:2: rule__Program__Group_7__1__Impl rule__Program__Group_7__2
            {
            pushFollow(FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13130);
            rule__Program__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13133);
            rule__Program__Group_7__2();
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
    // $ANTLR end rule__Program__Group_7__1


    // $ANTLR start rule__Program__Group_7__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1535:1: rule__Program__Group_7__1__Impl : ( ( rule__Program__SignalsAssignment_7_1 ) ) ;
    public final void rule__Program__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1539:1: ( ( ( rule__Program__SignalsAssignment_7_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1540:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1540:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1541:1: ( rule__Program__SignalsAssignment_7_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1542:1: ( rule__Program__SignalsAssignment_7_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1542:2: rule__Program__SignalsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3160);
            rule__Program__SignalsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_7_1()); 

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
    // $ANTLR end rule__Program__Group_7__1__Impl


    // $ANTLR start rule__Program__Group_7__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1552:1: rule__Program__Group_7__2 : rule__Program__Group_7__2__Impl rule__Program__Group_7__3 ;
    public final void rule__Program__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1556:1: ( rule__Program__Group_7__2__Impl rule__Program__Group_7__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1557:2: rule__Program__Group_7__2__Impl rule__Program__Group_7__3
            {
            pushFollow(FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23190);
            rule__Program__Group_7__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23193);
            rule__Program__Group_7__3();
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
    // $ANTLR end rule__Program__Group_7__2


    // $ANTLR start rule__Program__Group_7__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1564:1: rule__Program__Group_7__2__Impl : ( ( rule__Program__Group_7_2__0 )* ) ;
    public final void rule__Program__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1568:1: ( ( ( rule__Program__Group_7_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1569:1: ( ( rule__Program__Group_7_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1569:1: ( ( rule__Program__Group_7_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1570:1: ( rule__Program__Group_7_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_7_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1571:1: ( rule__Program__Group_7_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1571:2: rule__Program__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3220);
            	    rule__Program__Group_7_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_7_2()); 

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
    // $ANTLR end rule__Program__Group_7__2__Impl


    // $ANTLR start rule__Program__Group_7__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1581:1: rule__Program__Group_7__3 : rule__Program__Group_7__3__Impl ;
    public final void rule__Program__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1585:1: ( rule__Program__Group_7__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1586:2: rule__Program__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33251);
            rule__Program__Group_7__3__Impl();
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
    // $ANTLR end rule__Program__Group_7__3


    // $ANTLR start rule__Program__Group_7__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1592:1: rule__Program__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1596:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1597:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1597:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1598:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_7_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_7__3__Impl3279); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_7_3()); 

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
    // $ANTLR end rule__Program__Group_7__3__Impl


    // $ANTLR start rule__Program__Group_7_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1619:1: rule__Program__Group_7_2__0 : rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 ;
    public final void rule__Program__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1623:1: ( rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1624:2: rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03318);
            rule__Program__Group_7_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03321);
            rule__Program__Group_7_2__1();
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
    // $ANTLR end rule__Program__Group_7_2__0


    // $ANTLR start rule__Program__Group_7_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1631:1: rule__Program__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1635:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1636:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1636:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1637:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_7_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3349); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end rule__Program__Group_7_2__0__Impl


    // $ANTLR start rule__Program__Group_7_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1650:1: rule__Program__Group_7_2__1 : rule__Program__Group_7_2__1__Impl ;
    public final void rule__Program__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1654:1: ( rule__Program__Group_7_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1655:2: rule__Program__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13380);
            rule__Program__Group_7_2__1__Impl();
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
    // $ANTLR end rule__Program__Group_7_2__1


    // $ANTLR start rule__Program__Group_7_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1661:1: rule__Program__Group_7_2__1__Impl : ( ( rule__Program__SignalsAssignment_7_2_1 ) ) ;
    public final void rule__Program__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1665:1: ( ( ( rule__Program__SignalsAssignment_7_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1666:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1666:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1667:1: ( rule__Program__SignalsAssignment_7_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1668:1: ( rule__Program__SignalsAssignment_7_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1668:2: rule__Program__SignalsAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3407);
            rule__Program__SignalsAssignment_7_2_1();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getSignalsAssignment_7_2_1()); 

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
    // $ANTLR end rule__Program__Group_7_2__1__Impl


    // $ANTLR start rule__Annotation__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1682:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1686:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1687:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03441);
            rule__Annotation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03444);
            rule__Annotation__Group__1();
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
    // $ANTLR end rule__Annotation__Group__0


    // $ANTLR start rule__Annotation__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1694:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1698:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1699:1: ( '@' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1699:1: ( '@' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1700:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Annotation__Group__0__Impl3472); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end rule__Annotation__Group__0__Impl


    // $ANTLR start rule__Annotation__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1713:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1717:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1718:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13503);
            rule__Annotation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13506);
            rule__Annotation__Group__2();
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
    // $ANTLR end rule__Annotation__Group__1


    // $ANTLR start rule__Annotation__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1725:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__KeyAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1729:1: ( ( ( rule__Annotation__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1730:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1730:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1731:1: ( rule__Annotation__KeyAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1732:1: ( rule__Annotation__KeyAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1732:2: rule__Annotation__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_1_in_rule__Annotation__Group__1__Impl3533);
            rule__Annotation__KeyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); 

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
    // $ANTLR end rule__Annotation__Group__1__Impl


    // $ANTLR start rule__Annotation__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1742:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1746:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1747:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23563);
            rule__Annotation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23566);
            rule__Annotation__Group__3();
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
    // $ANTLR end rule__Annotation__Group__2


    // $ANTLR start rule__Annotation__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1754:1: rule__Annotation__Group__2__Impl : ( ':' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1758:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1759:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1759:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1760:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Annotation__Group__2__Impl3594); 
             after(grammarAccess.getAnnotationAccess().getColonKeyword_2()); 

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
    // $ANTLR end rule__Annotation__Group__2__Impl


    // $ANTLR start rule__Annotation__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1773:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1777:1: ( rule__Annotation__Group__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1778:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33625);
            rule__Annotation__Group__3__Impl();
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
    // $ANTLR end rule__Annotation__Group__3


    // $ANTLR start rule__Annotation__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1784:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__ValueAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1788:1: ( ( ( rule__Annotation__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1789:1: ( ( rule__Annotation__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1789:1: ( ( rule__Annotation__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1790:1: ( rule__Annotation__ValueAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1791:1: ( rule__Annotation__ValueAssignment_3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1791:2: rule__Annotation__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_3_in_rule__Annotation__Group__3__Impl3652);
            rule__Annotation__ValueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_3()); 

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
    // $ANTLR end rule__Annotation__Group__3__Impl


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1809:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1813:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1814:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03690);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03693);
            rule__State__Group__1();
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
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1821:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1825:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1826:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1826:1: ( ( rule__State__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1827:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1828:1: ( rule__State__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1828:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3720);
            rule__State__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__State__Group__0__Impl


    // $ANTLR start rule__State__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1838:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1842:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1843:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13750);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13753);
            rule__State__Group__2();
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
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1850:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1854:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1855:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1855:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1856:1: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group__1__Impl3781); 
             after(grammarAccess.getStateAccess().getColonKeyword_1()); 

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
    // $ANTLR end rule__State__Group__1__Impl


    // $ANTLR start rule__State__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1869:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1873:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1874:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23812);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23815);
            rule__State__Group__3();
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
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1881:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1885:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1886:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1886:1: ( ( rule__State__Group_2__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1887:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1888:1: ( rule__State__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1888:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl3842);
                    rule__State__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_2()); 

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
    // $ANTLR end rule__State__Group__2__Impl


    // $ANTLR start rule__State__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1898:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1902:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1903:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33873);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__33876);
            rule__State__Group__4();
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
    // $ANTLR end rule__State__Group__3


    // $ANTLR start rule__State__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1910:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1914:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1915:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1915:1: ( ( rule__State__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1916:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1917:1: ( rule__State__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1917:2: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3903);
                    rule__State__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

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
    // $ANTLR end rule__State__Group__3__Impl


    // $ANTLR start rule__State__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1927:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1931:1: ( rule__State__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1932:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43934);
            rule__State__Group__4__Impl();
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
    // $ANTLR end rule__State__Group__4


    // $ANTLR start rule__State__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1938:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1942:1: ( ( ( rule__State__Group_4__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1943:1: ( ( rule__State__Group_4__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1943:1: ( ( rule__State__Group_4__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1944:1: ( rule__State__Group_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1945:1: ( rule__State__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=35)||(LA13_0>=38 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1945:2: rule__State__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3961);
            	    rule__State__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_4()); 

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
    // $ANTLR end rule__State__Group__4__Impl


    // $ANTLR start rule__State__Group_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1965:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1969:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1970:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__04002);
            rule__State__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__04005);
            rule__State__Group_2__1();
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
    // $ANTLR end rule__State__Group_2__0


    // $ANTLR start rule__State__Group_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1977:1: rule__State__Group_2__0__Impl : ( ( rule__State__AnnotationsAssignment_2_0 ) ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1981:1: ( ( ( rule__State__AnnotationsAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1982:1: ( ( rule__State__AnnotationsAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1982:1: ( ( rule__State__AnnotationsAssignment_2_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1983:1: ( rule__State__AnnotationsAssignment_2_0 )
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1984:1: ( rule__State__AnnotationsAssignment_2_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1984:2: rule__State__AnnotationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__State__AnnotationsAssignment_2_0_in_rule__State__Group_2__0__Impl4032);
            rule__State__AnnotationsAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getAnnotationsAssignment_2_0()); 

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
    // $ANTLR end rule__State__Group_2__0__Impl


    // $ANTLR start rule__State__Group_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1994:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1998:1: ( rule__State__Group_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1999:2: rule__State__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__14062);
            rule__State__Group_2__1__Impl();
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
    // $ANTLR end rule__State__Group_2__1


    // $ANTLR start rule__State__Group_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2005:1: rule__State__Group_2__1__Impl : ( ( rule__State__Group_2_1__0 )* ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2009:1: ( ( ( rule__State__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2010:1: ( ( rule__State__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2010:1: ( ( rule__State__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2011:1: ( rule__State__Group_2_1__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2012:1: ( rule__State__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2012:2: rule__State__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_2_1__0_in_rule__State__Group_2__1__Impl4089);
            	    rule__State__Group_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__State__Group_2__1__Impl


    // $ANTLR start rule__State__Group_2_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2026:1: rule__State__Group_2_1__0 : rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 ;
    public final void rule__State__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2030:1: ( rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2031:2: rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04124);
            rule__State__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04127);
            rule__State__Group_2_1__1();
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
    // $ANTLR end rule__State__Group_2_1__0


    // $ANTLR start rule__State__Group_2_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2038:1: rule__State__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__State__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2042:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2043:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2043:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2044:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_22_in_rule__State__Group_2_1__0__Impl4155); 
             after(grammarAccess.getStateAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end rule__State__Group_2_1__0__Impl


    // $ANTLR start rule__State__Group_2_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2057:1: rule__State__Group_2_1__1 : rule__State__Group_2_1__1__Impl ;
    public final void rule__State__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2061:1: ( rule__State__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2062:2: rule__State__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14186);
            rule__State__Group_2_1__1__Impl();
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
    // $ANTLR end rule__State__Group_2_1__1


    // $ANTLR start rule__State__Group_2_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2068:1: rule__State__Group_2_1__1__Impl : ( ( rule__State__AnnotationsAssignment_2_1_1 ) ) ;
    public final void rule__State__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2072:1: ( ( ( rule__State__AnnotationsAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2073:1: ( ( rule__State__AnnotationsAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2073:1: ( ( rule__State__AnnotationsAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2074:1: ( rule__State__AnnotationsAssignment_2_1_1 )
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2075:1: ( rule__State__AnnotationsAssignment_2_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2075:2: rule__State__AnnotationsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__State__AnnotationsAssignment_2_1_1_in_rule__State__Group_2_1__1__Impl4213);
            rule__State__AnnotationsAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getAnnotationsAssignment_2_1_1()); 

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
    // $ANTLR end rule__State__Group_2_1__1__Impl


    // $ANTLR start rule__State__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2089:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2093:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2094:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__04247);
            rule__State__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__04250);
            rule__State__Group_3__1();
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
    // $ANTLR end rule__State__Group_3__0


    // $ANTLR start rule__State__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2101:1: rule__State__Group_3__0__Impl : ( 'SIGNALS' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2105:1: ( ( 'SIGNALS' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2106:1: ( 'SIGNALS' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2106:1: ( 'SIGNALS' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2107:1: 'SIGNALS'
            {
             before(grammarAccess.getStateAccess().getSIGNALSKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_3__0__Impl4278); 
             after(grammarAccess.getStateAccess().getSIGNALSKeyword_3_0()); 

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
    // $ANTLR end rule__State__Group_3__0__Impl


    // $ANTLR start rule__State__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2120:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2124:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2125:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14309);
            rule__State__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__14312);
            rule__State__Group_3__2();
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
    // $ANTLR end rule__State__Group_3__1


    // $ANTLR start rule__State__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2132:1: rule__State__Group_3__1__Impl : ( ( rule__State__SignalsAssignment_3_1 )* ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2136:1: ( ( ( rule__State__SignalsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2137:1: ( ( rule__State__SignalsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2137:1: ( ( rule__State__SignalsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2138:1: ( rule__State__SignalsAssignment_3_1 )*
            {
             before(grammarAccess.getStateAccess().getSignalsAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2139:1: ( rule__State__SignalsAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2139:2: rule__State__SignalsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__State__SignalsAssignment_3_1_in_rule__State__Group_3__1__Impl4339);
            	    rule__State__SignalsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getSignalsAssignment_3_1()); 

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
    // $ANTLR end rule__State__Group_3__1__Impl


    // $ANTLR start rule__State__Group_3__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2149:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2153:1: ( rule__State__Group_3__2__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2154:2: rule__State__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__24370);
            rule__State__Group_3__2__Impl();
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
    // $ANTLR end rule__State__Group_3__2


    // $ANTLR start rule__State__Group_3__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2160:1: rule__State__Group_3__2__Impl : ( ';' ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2164:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2165:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2165:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2166:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_3__2__Impl4398); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end rule__State__Group_3__2__Impl


    // $ANTLR start rule__State__Group_4__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2185:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2189:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2190:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04435);
            rule__State__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04438);
            rule__State__Group_4__1();
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
    // $ANTLR end rule__State__Group_4__0


    // $ANTLR start rule__State__Group_4__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2197:1: rule__State__Group_4__0__Impl : ( ( rule__State__InstructionsAssignment_4_0 ) ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2201:1: ( ( ( rule__State__InstructionsAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2202:1: ( ( rule__State__InstructionsAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2202:1: ( ( rule__State__InstructionsAssignment_4_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2203:1: ( rule__State__InstructionsAssignment_4_0 )
            {
             before(grammarAccess.getStateAccess().getInstructionsAssignment_4_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2204:1: ( rule__State__InstructionsAssignment_4_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2204:2: rule__State__InstructionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__State__InstructionsAssignment_4_0_in_rule__State__Group_4__0__Impl4465);
            rule__State__InstructionsAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getInstructionsAssignment_4_0()); 

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
    // $ANTLR end rule__State__Group_4__0__Impl


    // $ANTLR start rule__State__Group_4__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2214:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2218:1: ( rule__State__Group_4__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2219:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14495);
            rule__State__Group_4__1__Impl();
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
    // $ANTLR end rule__State__Group_4__1


    // $ANTLR start rule__State__Group_4__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2225:1: rule__State__Group_4__1__Impl : ( ';' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2229:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2230:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2230:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2231:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_4_1()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_4__1__Impl4523); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_4_1()); 

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
    // $ANTLR end rule__State__Group_4__1__Impl


    // $ANTLR start rule__Signal__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2248:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2252:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2253:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04558);
            rule__Signal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04561);
            rule__Signal__Group__1();
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
    // $ANTLR end rule__Signal__Group__0


    // $ANTLR start rule__Signal__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2260:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2264:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2265:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2265:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2266:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2267:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2267:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4588);
            rule__Signal__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

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
    // $ANTLR end rule__Signal__Group__0__Impl


    // $ANTLR start rule__Signal__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2277:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2281:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2282:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14618);
            rule__Signal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14621);
            rule__Signal__Group__2();
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
    // $ANTLR end rule__Signal__Group__1


    // $ANTLR start rule__Signal__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2289:1: rule__Signal__Group__1__Impl : ( ':' ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2293:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2294:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2294:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2295:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Signal__Group__1__Impl4649); 
             after(grammarAccess.getSignalAccess().getColonKeyword_1()); 

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
    // $ANTLR end rule__Signal__Group__1__Impl


    // $ANTLR start rule__Signal__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2308:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2312:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2313:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24680);
            rule__Signal__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24683);
            rule__Signal__Group__3();
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
    // $ANTLR end rule__Signal__Group__2


    // $ANTLR start rule__Signal__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2320:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__TypeAssignment_2 ) ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2324:1: ( ( ( rule__Signal__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2325:1: ( ( rule__Signal__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2325:1: ( ( rule__Signal__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2326:1: ( rule__Signal__TypeAssignment_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2327:1: ( rule__Signal__TypeAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2327:2: rule__Signal__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4710);
            rule__Signal__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_2()); 

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
    // $ANTLR end rule__Signal__Group__2__Impl


    // $ANTLR start rule__Signal__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2337:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2341:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2342:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34740);
            rule__Signal__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34743);
            rule__Signal__Group__4();
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
    // $ANTLR end rule__Signal__Group__3


    // $ANTLR start rule__Signal__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2349:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__Group_3__0 )? ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2353:1: ( ( ( rule__Signal__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2354:1: ( ( rule__Signal__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2354:1: ( ( rule__Signal__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2355:1: ( rule__Signal__Group_3__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2356:1: ( rule__Signal__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2356:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4770);
                    rule__Signal__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_3()); 

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
    // $ANTLR end rule__Signal__Group__3__Impl


    // $ANTLR start rule__Signal__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2366:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2370:1: ( rule__Signal__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2371:2: rule__Signal__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44801);
            rule__Signal__Group__4__Impl();
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
    // $ANTLR end rule__Signal__Group__4


    // $ANTLR start rule__Signal__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2377:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2381:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2382:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2382:1: ( ( rule__Signal__Group_4__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2383:1: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2384:1: ( rule__Signal__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2384:2: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Group__4__Impl4828);
                    rule__Signal__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getGroup_4()); 

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
    // $ANTLR end rule__Signal__Group__4__Impl


    // $ANTLR start rule__Signal__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2404:1: rule__Signal__Group_3__0 : rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2408:1: ( rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2409:2: rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04869);
            rule__Signal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04872);
            rule__Signal__Group_3__1();
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
    // $ANTLR end rule__Signal__Group_3__0


    // $ANTLR start rule__Signal__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2416:1: rule__Signal__Group_3__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2420:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2421:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2421:1: ( 'combine' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2422:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Signal__Group_3__0__Impl4900); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_3_0()); 

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
    // $ANTLR end rule__Signal__Group_3__0__Impl


    // $ANTLR start rule__Signal__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2435:1: rule__Signal__Group_3__1 : rule__Signal__Group_3__1__Impl ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2439:1: ( rule__Signal__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2440:2: rule__Signal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14931);
            rule__Signal__Group_3__1__Impl();
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
    // $ANTLR end rule__Signal__Group_3__1


    // $ANTLR start rule__Signal__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2446:1: rule__Signal__Group_3__1__Impl : ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) ;
    public final void rule__Signal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2450:1: ( ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2451:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2451:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2452:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2453:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2453:2: rule__Signal__CombineFunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4958);
            rule__Signal__CombineFunctionAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getCombineFunctionAssignment_3_1()); 

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
    // $ANTLR end rule__Signal__Group_3__1__Impl


    // $ANTLR start rule__Signal__Group_4__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2467:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2471:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2472:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__04992);
            rule__Signal__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04995);
            rule__Signal__Group_4__1();
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
    // $ANTLR end rule__Signal__Group_4__0


    // $ANTLR start rule__Signal__Group_4__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2479:1: rule__Signal__Group_4__0__Impl : ( ( rule__Signal__AnnotationsAssignment_4_0 ) ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2483:1: ( ( ( rule__Signal__AnnotationsAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2484:1: ( ( rule__Signal__AnnotationsAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2484:1: ( ( rule__Signal__AnnotationsAssignment_4_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2485:1: ( rule__Signal__AnnotationsAssignment_4_0 )
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2486:1: ( rule__Signal__AnnotationsAssignment_4_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2486:2: rule__Signal__AnnotationsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_4_0_in_rule__Signal__Group_4__0__Impl5022);
            rule__Signal__AnnotationsAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_0()); 

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
    // $ANTLR end rule__Signal__Group_4__0__Impl


    // $ANTLR start rule__Signal__Group_4__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2496:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2500:1: ( rule__Signal__Group_4__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2501:2: rule__Signal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__15052);
            rule__Signal__Group_4__1__Impl();
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
    // $ANTLR end rule__Signal__Group_4__1


    // $ANTLR start rule__Signal__Group_4__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2507:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__Group_4_1__0 )* ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2511:1: ( ( ( rule__Signal__Group_4_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2512:1: ( ( rule__Signal__Group_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2512:1: ( ( rule__Signal__Group_4_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2513:1: ( rule__Signal__Group_4_1__0 )*
            {
             before(grammarAccess.getSignalAccess().getGroup_4_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2514:1: ( rule__Signal__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==25) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2514:2: rule__Signal__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl5079);
            	    rule__Signal__Group_4_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getGroup_4_1()); 

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
    // $ANTLR end rule__Signal__Group_4__1__Impl


    // $ANTLR start rule__Signal__Group_4_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2528:1: rule__Signal__Group_4_1__0 : rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 ;
    public final void rule__Signal__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2532:1: ( rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2533:2: rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__05114);
            rule__Signal__Group_4_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__05117);
            rule__Signal__Group_4_1__1();
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
    // $ANTLR end rule__Signal__Group_4_1__0


    // $ANTLR start rule__Signal__Group_4_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2540:1: rule__Signal__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Signal__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2544:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2545:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2545:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2546:1: ','
            {
             before(grammarAccess.getSignalAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Signal__Group_4_1__0__Impl5145); 
             after(grammarAccess.getSignalAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end rule__Signal__Group_4_1__0__Impl


    // $ANTLR start rule__Signal__Group_4_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2559:1: rule__Signal__Group_4_1__1 : rule__Signal__Group_4_1__1__Impl ;
    public final void rule__Signal__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2563:1: ( rule__Signal__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2564:2: rule__Signal__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__15176);
            rule__Signal__Group_4_1__1__Impl();
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
    // $ANTLR end rule__Signal__Group_4_1__1


    // $ANTLR start rule__Signal__Group_4_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2570:1: rule__Signal__Group_4_1__1__Impl : ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) ) ;
    public final void rule__Signal__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2574:1: ( ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2575:1: ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2575:1: ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2576:1: ( rule__Signal__AnnotationsAssignment_4_1_1 )
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2577:1: ( rule__Signal__AnnotationsAssignment_4_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2577:2: rule__Signal__AnnotationsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl5203);
            rule__Signal__AnnotationsAssignment_4_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_1_1()); 

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
    // $ANTLR end rule__Signal__Group_4_1__1__Impl


    // $ANTLR start rule__CustomSignalType__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2592:1: rule__CustomSignalType__Group__0 : rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1 ;
    public final void rule__CustomSignalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2596:1: ( rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2597:2: rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1
            {
            pushFollow(FOLLOW_rule__CustomSignalType__Group__0__Impl_in_rule__CustomSignalType__Group__05238);
            rule__CustomSignalType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomSignalType__Group__1_in_rule__CustomSignalType__Group__05241);
            rule__CustomSignalType__Group__1();
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
    // $ANTLR end rule__CustomSignalType__Group__0


    // $ANTLR start rule__CustomSignalType__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2604:1: rule__CustomSignalType__Group__0__Impl : ( 'CUSTOM' ) ;
    public final void rule__CustomSignalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2608:1: ( ( 'CUSTOM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2609:1: ( 'CUSTOM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2609:1: ( 'CUSTOM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2610:1: 'CUSTOM'
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCUSTOMKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomSignalType__Group__0__Impl5269); 
             after(grammarAccess.getCustomSignalTypeAccess().getCUSTOMKeyword_0()); 

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
    // $ANTLR end rule__CustomSignalType__Group__0__Impl


    // $ANTLR start rule__CustomSignalType__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2623:1: rule__CustomSignalType__Group__1 : rule__CustomSignalType__Group__1__Impl ;
    public final void rule__CustomSignalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2627:1: ( rule__CustomSignalType__Group__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2628:2: rule__CustomSignalType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomSignalType__Group__1__Impl_in_rule__CustomSignalType__Group__15300);
            rule__CustomSignalType__Group__1__Impl();
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
    // $ANTLR end rule__CustomSignalType__Group__1


    // $ANTLR start rule__CustomSignalType__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2634:1: rule__CustomSignalType__Group__1__Impl : ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) ) ;
    public final void rule__CustomSignalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2638:1: ( ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2639:1: ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2639:1: ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2640:1: ( rule__CustomSignalType__CustomTypeAssignment_1 )
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCustomTypeAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2641:1: ( rule__CustomSignalType__CustomTypeAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2641:2: rule__CustomSignalType__CustomTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomSignalType__CustomTypeAssignment_1_in_rule__CustomSignalType__Group__1__Impl5327);
            rule__CustomSignalType__CustomTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCustomSignalTypeAccess().getCustomTypeAssignment_1()); 

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
    // $ANTLR end rule__CustomSignalType__Group__1__Impl


    // $ANTLR start rule__Instruction__Group_11__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2655:1: rule__Instruction__Group_11__0 : rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 ;
    public final void rule__Instruction__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2659:1: ( rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2660:2: rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11__0__Impl_in_rule__Instruction__Group_11__05361);
            rule__Instruction__Group_11__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_11__1_in_rule__Instruction__Group_11__05364);
            rule__Instruction__Group_11__1();
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
    // $ANTLR end rule__Instruction__Group_11__0


    // $ANTLR start rule__Instruction__Group_11__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2667:1: rule__Instruction__Group_11__0__Impl : ( rulePrio ) ;
    public final void rule__Instruction__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2671:1: ( ( rulePrio ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2672:1: ( rulePrio )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2672:1: ( rulePrio )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2673:1: rulePrio
            {
             before(grammarAccess.getInstructionAccess().getPrioParserRuleCall_11_0()); 
            pushFollow(FOLLOW_rulePrio_in_rule__Instruction__Group_11__0__Impl5391);
            rulePrio();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getPrioParserRuleCall_11_0()); 

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
    // $ANTLR end rule__Instruction__Group_11__0__Impl


    // $ANTLR start rule__Instruction__Group_11__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2684:1: rule__Instruction__Group_11__1 : rule__Instruction__Group_11__1__Impl ;
    public final void rule__Instruction__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2688:1: ( rule__Instruction__Group_11__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2689:2: rule__Instruction__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11__1__Impl_in_rule__Instruction__Group_11__15420);
            rule__Instruction__Group_11__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_11__1


    // $ANTLR start rule__Instruction__Group_11__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2695:1: rule__Instruction__Group_11__1__Impl : ( ( rule__Instruction__Group_11_1__0 )? ) ;
    public final void rule__Instruction__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2699:1: ( ( ( rule__Instruction__Group_11_1__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2700:1: ( ( rule__Instruction__Group_11_1__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2700:1: ( ( rule__Instruction__Group_11_1__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2701:1: ( rule__Instruction__Group_11_1__0 )?
            {
             before(grammarAccess.getInstructionAccess().getGroup_11_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2702:1: ( rule__Instruction__Group_11_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2702:2: rule__Instruction__Group_11_1__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_11_1__0_in_rule__Instruction__Group_11__1__Impl5447);
                    rule__Instruction__Group_11_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstructionAccess().getGroup_11_1()); 

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
    // $ANTLR end rule__Instruction__Group_11__1__Impl


    // $ANTLR start rule__Instruction__Group_11_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2716:1: rule__Instruction__Group_11_1__0 : rule__Instruction__Group_11_1__0__Impl rule__Instruction__Group_11_1__1 ;
    public final void rule__Instruction__Group_11_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2720:1: ( rule__Instruction__Group_11_1__0__Impl rule__Instruction__Group_11_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2721:2: rule__Instruction__Group_11_1__0__Impl rule__Instruction__Group_11_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11_1__0__Impl_in_rule__Instruction__Group_11_1__05482);
            rule__Instruction__Group_11_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_11_1__1_in_rule__Instruction__Group_11_1__05485);
            rule__Instruction__Group_11_1__1();
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
    // $ANTLR end rule__Instruction__Group_11_1__0


    // $ANTLR start rule__Instruction__Group_11_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2728:1: rule__Instruction__Group_11_1__0__Impl : ( ( rule__Instruction__AnnotationsAssignment_11_1_0 ) ) ;
    public final void rule__Instruction__Group_11_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2732:1: ( ( ( rule__Instruction__AnnotationsAssignment_11_1_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2733:1: ( ( rule__Instruction__AnnotationsAssignment_11_1_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2733:1: ( ( rule__Instruction__AnnotationsAssignment_11_1_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2734:1: ( rule__Instruction__AnnotationsAssignment_11_1_0 )
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAssignment_11_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2735:1: ( rule__Instruction__AnnotationsAssignment_11_1_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2735:2: rule__Instruction__AnnotationsAssignment_11_1_0
            {
            pushFollow(FOLLOW_rule__Instruction__AnnotationsAssignment_11_1_0_in_rule__Instruction__Group_11_1__0__Impl5512);
            rule__Instruction__AnnotationsAssignment_11_1_0();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAnnotationsAssignment_11_1_0()); 

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
    // $ANTLR end rule__Instruction__Group_11_1__0__Impl


    // $ANTLR start rule__Instruction__Group_11_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2745:1: rule__Instruction__Group_11_1__1 : rule__Instruction__Group_11_1__1__Impl ;
    public final void rule__Instruction__Group_11_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2749:1: ( rule__Instruction__Group_11_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2750:2: rule__Instruction__Group_11_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11_1__1__Impl_in_rule__Instruction__Group_11_1__15542);
            rule__Instruction__Group_11_1__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_11_1__1


    // $ANTLR start rule__Instruction__Group_11_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2756:1: rule__Instruction__Group_11_1__1__Impl : ( ( rule__Instruction__Group_11_1_1__0 )* ) ;
    public final void rule__Instruction__Group_11_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2760:1: ( ( ( rule__Instruction__Group_11_1_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2761:1: ( ( rule__Instruction__Group_11_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2761:1: ( ( rule__Instruction__Group_11_1_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2762:1: ( rule__Instruction__Group_11_1_1__0 )*
            {
             before(grammarAccess.getInstructionAccess().getGroup_11_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2763:1: ( rule__Instruction__Group_11_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2763:2: rule__Instruction__Group_11_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__Group_11_1_1__0_in_rule__Instruction__Group_11_1__1__Impl5569);
            	    rule__Instruction__Group_11_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getInstructionAccess().getGroup_11_1_1()); 

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
    // $ANTLR end rule__Instruction__Group_11_1__1__Impl


    // $ANTLR start rule__Instruction__Group_11_1_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2777:1: rule__Instruction__Group_11_1_1__0 : rule__Instruction__Group_11_1_1__0__Impl rule__Instruction__Group_11_1_1__1 ;
    public final void rule__Instruction__Group_11_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2781:1: ( rule__Instruction__Group_11_1_1__0__Impl rule__Instruction__Group_11_1_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2782:2: rule__Instruction__Group_11_1_1__0__Impl rule__Instruction__Group_11_1_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11_1_1__0__Impl_in_rule__Instruction__Group_11_1_1__05604);
            rule__Instruction__Group_11_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_11_1_1__1_in_rule__Instruction__Group_11_1_1__05607);
            rule__Instruction__Group_11_1_1__1();
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
    // $ANTLR end rule__Instruction__Group_11_1_1__0


    // $ANTLR start rule__Instruction__Group_11_1_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2789:1: rule__Instruction__Group_11_1_1__0__Impl : ( ',' ) ;
    public final void rule__Instruction__Group_11_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2793:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2794:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2794:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2795:1: ','
            {
             before(grammarAccess.getInstructionAccess().getCommaKeyword_11_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Instruction__Group_11_1_1__0__Impl5635); 
             after(grammarAccess.getInstructionAccess().getCommaKeyword_11_1_1_0()); 

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
    // $ANTLR end rule__Instruction__Group_11_1_1__0__Impl


    // $ANTLR start rule__Instruction__Group_11_1_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2808:1: rule__Instruction__Group_11_1_1__1 : rule__Instruction__Group_11_1_1__1__Impl ;
    public final void rule__Instruction__Group_11_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2812:1: ( rule__Instruction__Group_11_1_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2813:2: rule__Instruction__Group_11_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_11_1_1__1__Impl_in_rule__Instruction__Group_11_1_1__15666);
            rule__Instruction__Group_11_1_1__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_11_1_1__1


    // $ANTLR start rule__Instruction__Group_11_1_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2819:1: rule__Instruction__Group_11_1_1__1__Impl : ( ( rule__Instruction__AnnotationsAssignment_11_1_1_1 ) ) ;
    public final void rule__Instruction__Group_11_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2823:1: ( ( ( rule__Instruction__AnnotationsAssignment_11_1_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2824:1: ( ( rule__Instruction__AnnotationsAssignment_11_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2824:1: ( ( rule__Instruction__AnnotationsAssignment_11_1_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2825:1: ( rule__Instruction__AnnotationsAssignment_11_1_1_1 )
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAssignment_11_1_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2826:1: ( rule__Instruction__AnnotationsAssignment_11_1_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2826:2: rule__Instruction__AnnotationsAssignment_11_1_1_1
            {
            pushFollow(FOLLOW_rule__Instruction__AnnotationsAssignment_11_1_1_1_in_rule__Instruction__Group_11_1_1__1__Impl5693);
            rule__Instruction__AnnotationsAssignment_11_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAnnotationsAssignment_11_1_1_1()); 

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
    // $ANTLR end rule__Instruction__Group_11_1_1__1__Impl


    // $ANTLR start rule__Pause__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2840:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2844:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2845:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05727);
            rule__Pause__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05730);
            rule__Pause__Group__1();
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
    // $ANTLR end rule__Pause__Group__0


    // $ANTLR start rule__Pause__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2852:1: rule__Pause__Group__0__Impl : ( () ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2856:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2857:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2857:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2858:1: ()
            {
             before(grammarAccess.getPauseAccess().getPauseAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2859:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2861:1: 
            {
            }

             after(grammarAccess.getPauseAccess().getPauseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group__0__Impl


    // $ANTLR start rule__Pause__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2871:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2875:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2876:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
            {
            pushFollow(FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15788);
            rule__Pause__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15791);
            rule__Pause__Group__2();
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
    // $ANTLR end rule__Pause__Group__1


    // $ANTLR start rule__Pause__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2883:1: rule__Pause__Group__1__Impl : ( 'PAUSE' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2887:1: ( ( 'PAUSE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2888:1: ( 'PAUSE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2888:1: ( 'PAUSE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2889:1: 'PAUSE'
            {
             before(grammarAccess.getPauseAccess().getPAUSEKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Pause__Group__1__Impl5819); 
             after(grammarAccess.getPauseAccess().getPAUSEKeyword_1()); 

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
    // $ANTLR end rule__Pause__Group__1__Impl


    // $ANTLR start rule__Pause__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2902:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2906:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2907:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
            {
            pushFollow(FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25850);
            rule__Pause__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25853);
            rule__Pause__Group__3();
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
    // $ANTLR end rule__Pause__Group__2


    // $ANTLR start rule__Pause__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2914:1: rule__Pause__Group__2__Impl : ( '(' ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2918:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2919:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2919:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2920:1: '('
            {
             before(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Pause__Group__2__Impl5881); 
             after(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Pause__Group__2__Impl


    // $ANTLR start rule__Pause__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2933:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl rule__Pause__Group__4 ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2937:1: ( rule__Pause__Group__3__Impl rule__Pause__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2938:2: rule__Pause__Group__3__Impl rule__Pause__Group__4
            {
            pushFollow(FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35912);
            rule__Pause__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35915);
            rule__Pause__Group__4();
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
    // $ANTLR end rule__Pause__Group__3


    // $ANTLR start rule__Pause__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2945:1: rule__Pause__Group__3__Impl : ( ( rule__Pause__ContinuationAssignment_3 )? ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2949:1: ( ( ( rule__Pause__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2950:1: ( ( rule__Pause__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2950:1: ( ( rule__Pause__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2951:1: ( rule__Pause__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getPauseAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2952:1: ( rule__Pause__ContinuationAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2952:2: rule__Pause__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Pause__ContinuationAssignment_3_in_rule__Pause__Group__3__Impl5942);
                    rule__Pause__ContinuationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPauseAccess().getContinuationAssignment_3()); 

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
    // $ANTLR end rule__Pause__Group__3__Impl


    // $ANTLR start rule__Pause__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2962:1: rule__Pause__Group__4 : rule__Pause__Group__4__Impl ;
    public final void rule__Pause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2966:1: ( rule__Pause__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2967:2: rule__Pause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45973);
            rule__Pause__Group__4__Impl();
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
    // $ANTLR end rule__Pause__Group__4


    // $ANTLR start rule__Pause__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2973:1: rule__Pause__Group__4__Impl : ( ')' ) ;
    public final void rule__Pause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2977:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2978:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2978:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2979:1: ')'
            {
             before(grammarAccess.getPauseAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Pause__Group__4__Impl6001); 
             after(grammarAccess.getPauseAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Pause__Group__4__Impl


    // $ANTLR start rule__Term__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3002:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3006:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3007:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__06042);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__06045);
            rule__Term__Group__1();
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
    // $ANTLR end rule__Term__Group__0


    // $ANTLR start rule__Term__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3014:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3018:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3019:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3019:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3020:1: ()
            {
             before(grammarAccess.getTermAccess().getTermAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3021:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3023:1: 
            {
            }

             after(grammarAccess.getTermAccess().getTermAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__0__Impl


    // $ANTLR start rule__Term__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3033:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3037:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3038:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16103);
            rule__Term__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__2_in_rule__Term__Group__16106);
            rule__Term__Group__2();
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
    // $ANTLR end rule__Term__Group__1


    // $ANTLR start rule__Term__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3045:1: rule__Term__Group__1__Impl : ( 'TERM' ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3049:1: ( ( 'TERM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3050:1: ( 'TERM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3050:1: ( 'TERM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3051:1: 'TERM'
            {
             before(grammarAccess.getTermAccess().getTERMKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Term__Group__1__Impl6134); 
             after(grammarAccess.getTermAccess().getTERMKeyword_1()); 

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
    // $ANTLR end rule__Term__Group__1__Impl


    // $ANTLR start rule__Term__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3064:1: rule__Term__Group__2 : rule__Term__Group__2__Impl rule__Term__Group__3 ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3068:1: ( rule__Term__Group__2__Impl rule__Term__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3069:2: rule__Term__Group__2__Impl rule__Term__Group__3
            {
            pushFollow(FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__26165);
            rule__Term__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__3_in_rule__Term__Group__26168);
            rule__Term__Group__3();
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
    // $ANTLR end rule__Term__Group__2


    // $ANTLR start rule__Term__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3076:1: rule__Term__Group__2__Impl : ( '(' ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3080:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3081:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3081:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3082:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Term__Group__2__Impl6196); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Term__Group__2__Impl


    // $ANTLR start rule__Term__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3095:1: rule__Term__Group__3 : rule__Term__Group__3__Impl rule__Term__Group__4 ;
    public final void rule__Term__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3099:1: ( rule__Term__Group__3__Impl rule__Term__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3100:2: rule__Term__Group__3__Impl rule__Term__Group__4
            {
            pushFollow(FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__36227);
            rule__Term__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__4_in_rule__Term__Group__36230);
            rule__Term__Group__4();
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
    // $ANTLR end rule__Term__Group__3


    // $ANTLR start rule__Term__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3107:1: rule__Term__Group__3__Impl : ( ( rule__Term__ContinuationAssignment_3 )? ) ;
    public final void rule__Term__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3111:1: ( ( ( rule__Term__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3112:1: ( ( rule__Term__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3112:1: ( ( rule__Term__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3113:1: ( rule__Term__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getTermAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3114:1: ( rule__Term__ContinuationAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3114:2: rule__Term__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__ContinuationAssignment_3_in_rule__Term__Group__3__Impl6257);
                    rule__Term__ContinuationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getContinuationAssignment_3()); 

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
    // $ANTLR end rule__Term__Group__3__Impl


    // $ANTLR start rule__Term__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3124:1: rule__Term__Group__4 : rule__Term__Group__4__Impl ;
    public final void rule__Term__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3128:1: ( rule__Term__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3129:2: rule__Term__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__46288);
            rule__Term__Group__4__Impl();
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
    // $ANTLR end rule__Term__Group__4


    // $ANTLR start rule__Term__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3135:1: rule__Term__Group__4__Impl : ( ')' ) ;
    public final void rule__Term__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3139:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3140:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3140:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3141:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group__4__Impl6316); 
             after(grammarAccess.getTermAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Term__Group__4__Impl


    // $ANTLR start rule__Halt__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3164:1: rule__Halt__Group__0 : rule__Halt__Group__0__Impl rule__Halt__Group__1 ;
    public final void rule__Halt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3168:1: ( rule__Halt__Group__0__Impl rule__Halt__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3169:2: rule__Halt__Group__0__Impl rule__Halt__Group__1
            {
            pushFollow(FOLLOW_rule__Halt__Group__0__Impl_in_rule__Halt__Group__06357);
            rule__Halt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Halt__Group__1_in_rule__Halt__Group__06360);
            rule__Halt__Group__1();
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
    // $ANTLR end rule__Halt__Group__0


    // $ANTLR start rule__Halt__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3176:1: rule__Halt__Group__0__Impl : ( () ) ;
    public final void rule__Halt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3180:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3181:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3181:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3182:1: ()
            {
             before(grammarAccess.getHaltAccess().getHaltAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3183:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3185:1: 
            {
            }

             after(grammarAccess.getHaltAccess().getHaltAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Halt__Group__0__Impl


    // $ANTLR start rule__Halt__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3195:1: rule__Halt__Group__1 : rule__Halt__Group__1__Impl rule__Halt__Group__2 ;
    public final void rule__Halt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3199:1: ( rule__Halt__Group__1__Impl rule__Halt__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3200:2: rule__Halt__Group__1__Impl rule__Halt__Group__2
            {
            pushFollow(FOLLOW_rule__Halt__Group__1__Impl_in_rule__Halt__Group__16418);
            rule__Halt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Halt__Group__2_in_rule__Halt__Group__16421);
            rule__Halt__Group__2();
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
    // $ANTLR end rule__Halt__Group__1


    // $ANTLR start rule__Halt__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3207:1: rule__Halt__Group__1__Impl : ( 'Halt' ) ;
    public final void rule__Halt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3211:1: ( ( 'Halt' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3212:1: ( 'Halt' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3212:1: ( 'Halt' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3213:1: 'Halt'
            {
             before(grammarAccess.getHaltAccess().getHaltKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Halt__Group__1__Impl6449); 
             after(grammarAccess.getHaltAccess().getHaltKeyword_1()); 

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
    // $ANTLR end rule__Halt__Group__1__Impl


    // $ANTLR start rule__Halt__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3226:1: rule__Halt__Group__2 : rule__Halt__Group__2__Impl rule__Halt__Group__3 ;
    public final void rule__Halt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3230:1: ( rule__Halt__Group__2__Impl rule__Halt__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3231:2: rule__Halt__Group__2__Impl rule__Halt__Group__3
            {
            pushFollow(FOLLOW_rule__Halt__Group__2__Impl_in_rule__Halt__Group__26480);
            rule__Halt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Halt__Group__3_in_rule__Halt__Group__26483);
            rule__Halt__Group__3();
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
    // $ANTLR end rule__Halt__Group__2


    // $ANTLR start rule__Halt__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3238:1: rule__Halt__Group__2__Impl : ( '(' ) ;
    public final void rule__Halt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3242:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3243:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3243:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3244:1: '('
            {
             before(grammarAccess.getHaltAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Halt__Group__2__Impl6511); 
             after(grammarAccess.getHaltAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Halt__Group__2__Impl


    // $ANTLR start rule__Halt__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3257:1: rule__Halt__Group__3 : rule__Halt__Group__3__Impl rule__Halt__Group__4 ;
    public final void rule__Halt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3261:1: ( rule__Halt__Group__3__Impl rule__Halt__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3262:2: rule__Halt__Group__3__Impl rule__Halt__Group__4
            {
            pushFollow(FOLLOW_rule__Halt__Group__3__Impl_in_rule__Halt__Group__36542);
            rule__Halt__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Halt__Group__4_in_rule__Halt__Group__36545);
            rule__Halt__Group__4();
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
    // $ANTLR end rule__Halt__Group__3


    // $ANTLR start rule__Halt__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3269:1: rule__Halt__Group__3__Impl : ( ( rule__Halt__ContinuationAssignment_3 )? ) ;
    public final void rule__Halt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3273:1: ( ( ( rule__Halt__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3274:1: ( ( rule__Halt__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3274:1: ( ( rule__Halt__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3275:1: ( rule__Halt__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getHaltAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3276:1: ( rule__Halt__ContinuationAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3276:2: rule__Halt__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Halt__ContinuationAssignment_3_in_rule__Halt__Group__3__Impl6572);
                    rule__Halt__ContinuationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHaltAccess().getContinuationAssignment_3()); 

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
    // $ANTLR end rule__Halt__Group__3__Impl


    // $ANTLR start rule__Halt__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3286:1: rule__Halt__Group__4 : rule__Halt__Group__4__Impl ;
    public final void rule__Halt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3290:1: ( rule__Halt__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3291:2: rule__Halt__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Halt__Group__4__Impl_in_rule__Halt__Group__46603);
            rule__Halt__Group__4__Impl();
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
    // $ANTLR end rule__Halt__Group__4


    // $ANTLR start rule__Halt__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3297:1: rule__Halt__Group__4__Impl : ( ')' ) ;
    public final void rule__Halt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3301:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3302:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3302:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3303:1: ')'
            {
             before(grammarAccess.getHaltAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Halt__Group__4__Impl6631); 
             after(grammarAccess.getHaltAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Halt__Group__4__Impl


    // $ANTLR start rule__Join__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3326:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3330:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3331:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06672);
            rule__Join__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06675);
            rule__Join__Group__1();
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
    // $ANTLR end rule__Join__Group__0


    // $ANTLR start rule__Join__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3338:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3342:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3343:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3343:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3344:1: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3345:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3347:1: 
            {
            }

             after(grammarAccess.getJoinAccess().getJoinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group__0__Impl


    // $ANTLR start rule__Join__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3357:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3361:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3362:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16733);
            rule__Join__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16736);
            rule__Join__Group__2();
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
    // $ANTLR end rule__Join__Group__1


    // $ANTLR start rule__Join__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3369:1: rule__Join__Group__1__Impl : ( 'JOIN' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3373:1: ( ( 'JOIN' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3374:1: ( 'JOIN' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3374:1: ( 'JOIN' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3375:1: 'JOIN'
            {
             before(grammarAccess.getJoinAccess().getJOINKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Join__Group__1__Impl6764); 
             after(grammarAccess.getJoinAccess().getJOINKeyword_1()); 

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
    // $ANTLR end rule__Join__Group__1__Impl


    // $ANTLR start rule__Join__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3388:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3392:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3393:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26795);
            rule__Join__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26798);
            rule__Join__Group__3();
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
    // $ANTLR end rule__Join__Group__2


    // $ANTLR start rule__Join__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3400:1: rule__Join__Group__2__Impl : ( '(' ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3404:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3405:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3405:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3406:1: '('
            {
             before(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Join__Group__2__Impl6826); 
             after(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Join__Group__2__Impl


    // $ANTLR start rule__Join__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3419:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3423:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3424:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36857);
            rule__Join__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36860);
            rule__Join__Group__4();
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
    // $ANTLR end rule__Join__Group__3


    // $ANTLR start rule__Join__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3431:1: rule__Join__Group__3__Impl : ( ( rule__Join__ContinuationAssignment_3 )? ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3435:1: ( ( ( rule__Join__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3436:1: ( ( rule__Join__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3436:1: ( ( rule__Join__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3437:1: ( rule__Join__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getJoinAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3438:1: ( rule__Join__ContinuationAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3438:2: rule__Join__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Join__ContinuationAssignment_3_in_rule__Join__Group__3__Impl6887);
                    rule__Join__ContinuationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getContinuationAssignment_3()); 

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
    // $ANTLR end rule__Join__Group__3__Impl


    // $ANTLR start rule__Join__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3448:1: rule__Join__Group__4 : rule__Join__Group__4__Impl ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3452:1: ( rule__Join__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3453:2: rule__Join__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46918);
            rule__Join__Group__4__Impl();
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
    // $ANTLR end rule__Join__Group__4


    // $ANTLR start rule__Join__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3459:1: rule__Join__Group__4__Impl : ( ')' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3463:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3464:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3464:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3465:1: ')'
            {
             before(grammarAccess.getJoinAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Join__Group__4__Impl6946); 
             after(grammarAccess.getJoinAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Join__Group__4__Impl


    // $ANTLR start rule__Abort__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3488:1: rule__Abort__Group__0 : rule__Abort__Group__0__Impl rule__Abort__Group__1 ;
    public final void rule__Abort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3492:1: ( rule__Abort__Group__0__Impl rule__Abort__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3493:2: rule__Abort__Group__0__Impl rule__Abort__Group__1
            {
            pushFollow(FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06987);
            rule__Abort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06990);
            rule__Abort__Group__1();
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
    // $ANTLR end rule__Abort__Group__0


    // $ANTLR start rule__Abort__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3500:1: rule__Abort__Group__0__Impl : ( () ) ;
    public final void rule__Abort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3504:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3505:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3505:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3506:1: ()
            {
             before(grammarAccess.getAbortAccess().getAbortAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3507:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3509:1: 
            {
            }

             after(grammarAccess.getAbortAccess().getAbortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group__0__Impl


    // $ANTLR start rule__Abort__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3519:1: rule__Abort__Group__1 : rule__Abort__Group__1__Impl rule__Abort__Group__2 ;
    public final void rule__Abort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3523:1: ( rule__Abort__Group__1__Impl rule__Abort__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3524:2: rule__Abort__Group__1__Impl rule__Abort__Group__2
            {
            pushFollow(FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__17048);
            rule__Abort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__17051);
            rule__Abort__Group__2();
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
    // $ANTLR end rule__Abort__Group__1


    // $ANTLR start rule__Abort__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3531:1: rule__Abort__Group__1__Impl : ( 'ABORT' ) ;
    public final void rule__Abort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3535:1: ( ( 'ABORT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3536:1: ( 'ABORT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3536:1: ( 'ABORT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3537:1: 'ABORT'
            {
             before(grammarAccess.getAbortAccess().getABORTKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Abort__Group__1__Impl7079); 
             after(grammarAccess.getAbortAccess().getABORTKeyword_1()); 

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
    // $ANTLR end rule__Abort__Group__1__Impl


    // $ANTLR start rule__Abort__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3550:1: rule__Abort__Group__2 : rule__Abort__Group__2__Impl rule__Abort__Group__3 ;
    public final void rule__Abort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3554:1: ( rule__Abort__Group__2__Impl rule__Abort__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3555:2: rule__Abort__Group__2__Impl rule__Abort__Group__3
            {
            pushFollow(FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__27110);
            rule__Abort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__27113);
            rule__Abort__Group__3();
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
    // $ANTLR end rule__Abort__Group__2


    // $ANTLR start rule__Abort__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3562:1: rule__Abort__Group__2__Impl : ( '(' ) ;
    public final void rule__Abort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3566:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3567:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3567:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3568:1: '('
            {
             before(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Abort__Group__2__Impl7141); 
             after(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end rule__Abort__Group__2__Impl


    // $ANTLR start rule__Abort__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3581:1: rule__Abort__Group__3 : rule__Abort__Group__3__Impl rule__Abort__Group__4 ;
    public final void rule__Abort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3585:1: ( rule__Abort__Group__3__Impl rule__Abort__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3586:2: rule__Abort__Group__3__Impl rule__Abort__Group__4
            {
            pushFollow(FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__37172);
            rule__Abort__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__37175);
            rule__Abort__Group__4();
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
    // $ANTLR end rule__Abort__Group__3


    // $ANTLR start rule__Abort__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3593:1: rule__Abort__Group__3__Impl : ( ( rule__Abort__ContinuationAssignment_3 )? ) ;
    public final void rule__Abort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3597:1: ( ( ( rule__Abort__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3598:1: ( ( rule__Abort__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3598:1: ( ( rule__Abort__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3599:1: ( rule__Abort__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getAbortAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3600:1: ( rule__Abort__ContinuationAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3600:2: rule__Abort__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Abort__ContinuationAssignment_3_in_rule__Abort__Group__3__Impl7202);
                    rule__Abort__ContinuationAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbortAccess().getContinuationAssignment_3()); 

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
    // $ANTLR end rule__Abort__Group__3__Impl


    // $ANTLR start rule__Abort__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3610:1: rule__Abort__Group__4 : rule__Abort__Group__4__Impl ;
    public final void rule__Abort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3614:1: ( rule__Abort__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3615:2: rule__Abort__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__47233);
            rule__Abort__Group__4__Impl();
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
    // $ANTLR end rule__Abort__Group__4


    // $ANTLR start rule__Abort__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3621:1: rule__Abort__Group__4__Impl : ( ')' ) ;
    public final void rule__Abort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3625:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3626:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3626:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3627:1: ')'
            {
             before(grammarAccess.getAbortAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Abort__Group__4__Impl7261); 
             after(grammarAccess.getAbortAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Abort__Group__4__Impl


    // $ANTLR start rule__Present__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3650:1: rule__Present__Group__0 : rule__Present__Group__0__Impl rule__Present__Group__1 ;
    public final void rule__Present__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3654:1: ( rule__Present__Group__0__Impl rule__Present__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3655:2: rule__Present__Group__0__Impl rule__Present__Group__1
            {
            pushFollow(FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__07302);
            rule__Present__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__1_in_rule__Present__Group__07305);
            rule__Present__Group__1();
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
    // $ANTLR end rule__Present__Group__0


    // $ANTLR start rule__Present__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3662:1: rule__Present__Group__0__Impl : ( 'PRESENT' ) ;
    public final void rule__Present__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3666:1: ( ( 'PRESENT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3667:1: ( 'PRESENT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3667:1: ( 'PRESENT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3668:1: 'PRESENT'
            {
             before(grammarAccess.getPresentAccess().getPRESENTKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Present__Group__0__Impl7333); 
             after(grammarAccess.getPresentAccess().getPRESENTKeyword_0()); 

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
    // $ANTLR end rule__Present__Group__0__Impl


    // $ANTLR start rule__Present__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3681:1: rule__Present__Group__1 : rule__Present__Group__1__Impl rule__Present__Group__2 ;
    public final void rule__Present__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3685:1: ( rule__Present__Group__1__Impl rule__Present__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3686:2: rule__Present__Group__1__Impl rule__Present__Group__2
            {
            pushFollow(FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__17364);
            rule__Present__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__2_in_rule__Present__Group__17367);
            rule__Present__Group__2();
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
    // $ANTLR end rule__Present__Group__1


    // $ANTLR start rule__Present__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3693:1: rule__Present__Group__1__Impl : ( '(' ) ;
    public final void rule__Present__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3697:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3698:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3698:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3699:1: '('
            {
             before(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Present__Group__1__Impl7395); 
             after(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Present__Group__1__Impl


    // $ANTLR start rule__Present__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3712:1: rule__Present__Group__2 : rule__Present__Group__2__Impl rule__Present__Group__3 ;
    public final void rule__Present__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3716:1: ( rule__Present__Group__2__Impl rule__Present__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3717:2: rule__Present__Group__2__Impl rule__Present__Group__3
            {
            pushFollow(FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27426);
            rule__Present__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27429);
            rule__Present__Group__3();
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
    // $ANTLR end rule__Present__Group__2


    // $ANTLR start rule__Present__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3724:1: rule__Present__Group__2__Impl : ( ( rule__Present__SignalAssignment_2 ) ) ;
    public final void rule__Present__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3728:1: ( ( ( rule__Present__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3729:1: ( ( rule__Present__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3729:1: ( ( rule__Present__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3730:1: ( rule__Present__SignalAssignment_2 )
            {
             before(grammarAccess.getPresentAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3731:1: ( rule__Present__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3731:2: rule__Present__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Present__SignalAssignment_2_in_rule__Present__Group__2__Impl7456);
            rule__Present__SignalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getSignalAssignment_2()); 

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
    // $ANTLR end rule__Present__Group__2__Impl


    // $ANTLR start rule__Present__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3741:1: rule__Present__Group__3 : rule__Present__Group__3__Impl rule__Present__Group__4 ;
    public final void rule__Present__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3745:1: ( rule__Present__Group__3__Impl rule__Present__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3746:2: rule__Present__Group__3__Impl rule__Present__Group__4
            {
            pushFollow(FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37486);
            rule__Present__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37489);
            rule__Present__Group__4();
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
    // $ANTLR end rule__Present__Group__3


    // $ANTLR start rule__Present__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3753:1: rule__Present__Group__3__Impl : ( ( rule__Present__Group_3__0 )? ) ;
    public final void rule__Present__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3757:1: ( ( ( rule__Present__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3758:1: ( ( rule__Present__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3758:1: ( ( rule__Present__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3759:1: ( rule__Present__Group_3__0 )?
            {
             before(grammarAccess.getPresentAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3760:1: ( rule__Present__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3760:2: rule__Present__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Present__Group_3__0_in_rule__Present__Group__3__Impl7516);
                    rule__Present__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentAccess().getGroup_3()); 

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
    // $ANTLR end rule__Present__Group__3__Impl


    // $ANTLR start rule__Present__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3770:1: rule__Present__Group__4 : rule__Present__Group__4__Impl rule__Present__Group__5 ;
    public final void rule__Present__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3774:1: ( rule__Present__Group__4__Impl rule__Present__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3775:2: rule__Present__Group__4__Impl rule__Present__Group__5
            {
            pushFollow(FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47547);
            rule__Present__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47550);
            rule__Present__Group__5();
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
    // $ANTLR end rule__Present__Group__4


    // $ANTLR start rule__Present__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3782:1: rule__Present__Group__4__Impl : ( ')' ) ;
    public final void rule__Present__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3786:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3787:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3787:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3788:1: ')'
            {
             before(grammarAccess.getPresentAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Present__Group__4__Impl7578); 
             after(grammarAccess.getPresentAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Present__Group__4__Impl


    // $ANTLR start rule__Present__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3801:1: rule__Present__Group__5 : rule__Present__Group__5__Impl rule__Present__Group__6 ;
    public final void rule__Present__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3805:1: ( rule__Present__Group__5__Impl rule__Present__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3806:2: rule__Present__Group__5__Impl rule__Present__Group__6
            {
            pushFollow(FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57609);
            rule__Present__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57612);
            rule__Present__Group__6();
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
    // $ANTLR end rule__Present__Group__5


    // $ANTLR start rule__Present__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3813:1: rule__Present__Group__5__Impl : ( '{' ) ;
    public final void rule__Present__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3817:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3818:1: ( '{' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3818:1: ( '{' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3819:1: '{'
            {
             before(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__Present__Group__5__Impl7640); 
             after(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end rule__Present__Group__5__Impl


    // $ANTLR start rule__Present__Group__6
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3832:1: rule__Present__Group__6 : rule__Present__Group__6__Impl rule__Present__Group__7 ;
    public final void rule__Present__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3836:1: ( rule__Present__Group__6__Impl rule__Present__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3837:2: rule__Present__Group__6__Impl rule__Present__Group__7
            {
            pushFollow(FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67671);
            rule__Present__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67674);
            rule__Present__Group__7();
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
    // $ANTLR end rule__Present__Group__6


    // $ANTLR start rule__Present__Group__6__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3844:1: rule__Present__Group__6__Impl : ( ( rule__Present__Group_6__0 )* ) ;
    public final void rule__Present__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3848:1: ( ( ( rule__Present__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3849:1: ( ( rule__Present__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3849:1: ( ( rule__Present__Group_6__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3850:1: ( rule__Present__Group_6__0 )*
            {
             before(grammarAccess.getPresentAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3851:1: ( rule__Present__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=30 && LA27_0<=35)||(LA27_0>=38 && LA27_0<=43)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3851:2: rule__Present__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Present__Group_6__0_in_rule__Present__Group__6__Impl7701);
            	    rule__Present__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPresentAccess().getGroup_6()); 

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
    // $ANTLR end rule__Present__Group__6__Impl


    // $ANTLR start rule__Present__Group__7
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3861:1: rule__Present__Group__7 : rule__Present__Group__7__Impl ;
    public final void rule__Present__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3865:1: ( rule__Present__Group__7__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3866:2: rule__Present__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77732);
            rule__Present__Group__7__Impl();
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
    // $ANTLR end rule__Present__Group__7


    // $ANTLR start rule__Present__Group__7__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3872:1: rule__Present__Group__7__Impl : ( '}' ) ;
    public final void rule__Present__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3876:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3877:1: ( '}' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3877:1: ( '}' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3878:1: '}'
            {
             before(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,37,FOLLOW_37_in_rule__Present__Group__7__Impl7760); 
             after(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end rule__Present__Group__7__Impl


    // $ANTLR start rule__Present__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3907:1: rule__Present__Group_3__0 : rule__Present__Group_3__0__Impl rule__Present__Group_3__1 ;
    public final void rule__Present__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3911:1: ( rule__Present__Group_3__0__Impl rule__Present__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3912:2: rule__Present__Group_3__0__Impl rule__Present__Group_3__1
            {
            pushFollow(FOLLOW_rule__Present__Group_3__0__Impl_in_rule__Present__Group_3__07807);
            rule__Present__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_3__1_in_rule__Present__Group_3__07810);
            rule__Present__Group_3__1();
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
    // $ANTLR end rule__Present__Group_3__0


    // $ANTLR start rule__Present__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3919:1: rule__Present__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Present__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3923:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3924:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3924:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3925:1: ','
            {
             before(grammarAccess.getPresentAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Present__Group_3__0__Impl7838); 
             after(grammarAccess.getPresentAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Present__Group_3__0__Impl


    // $ANTLR start rule__Present__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3938:1: rule__Present__Group_3__1 : rule__Present__Group_3__1__Impl ;
    public final void rule__Present__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3942:1: ( rule__Present__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3943:2: rule__Present__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_3__1__Impl_in_rule__Present__Group_3__17869);
            rule__Present__Group_3__1__Impl();
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
    // $ANTLR end rule__Present__Group_3__1


    // $ANTLR start rule__Present__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3949:1: rule__Present__Group_3__1__Impl : ( ( rule__Present__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Present__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3953:1: ( ( ( rule__Present__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3954:1: ( ( rule__Present__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3954:1: ( ( rule__Present__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3955:1: ( rule__Present__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getPresentAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3956:1: ( rule__Present__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3956:2: rule__Present__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Present__ContinuationAssignment_3_1_in_rule__Present__Group_3__1__Impl7896);
            rule__Present__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Present__Group_3__1__Impl


    // $ANTLR start rule__Present__Group_6__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3970:1: rule__Present__Group_6__0 : rule__Present__Group_6__0__Impl rule__Present__Group_6__1 ;
    public final void rule__Present__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3974:1: ( rule__Present__Group_6__0__Impl rule__Present__Group_6__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3975:2: rule__Present__Group_6__0__Impl rule__Present__Group_6__1
            {
            pushFollow(FOLLOW_rule__Present__Group_6__0__Impl_in_rule__Present__Group_6__07930);
            rule__Present__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_6__1_in_rule__Present__Group_6__07933);
            rule__Present__Group_6__1();
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
    // $ANTLR end rule__Present__Group_6__0


    // $ANTLR start rule__Present__Group_6__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3982:1: rule__Present__Group_6__0__Impl : ( ( rule__Present__InstructionsAssignment_6_0 ) ) ;
    public final void rule__Present__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3986:1: ( ( ( rule__Present__InstructionsAssignment_6_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3987:1: ( ( rule__Present__InstructionsAssignment_6_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3987:1: ( ( rule__Present__InstructionsAssignment_6_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3988:1: ( rule__Present__InstructionsAssignment_6_0 )
            {
             before(grammarAccess.getPresentAccess().getInstructionsAssignment_6_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3989:1: ( rule__Present__InstructionsAssignment_6_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3989:2: rule__Present__InstructionsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Present__InstructionsAssignment_6_0_in_rule__Present__Group_6__0__Impl7960);
            rule__Present__InstructionsAssignment_6_0();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getInstructionsAssignment_6_0()); 

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
    // $ANTLR end rule__Present__Group_6__0__Impl


    // $ANTLR start rule__Present__Group_6__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3999:1: rule__Present__Group_6__1 : rule__Present__Group_6__1__Impl ;
    public final void rule__Present__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4003:1: ( rule__Present__Group_6__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4004:2: rule__Present__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_6__1__Impl_in_rule__Present__Group_6__17990);
            rule__Present__Group_6__1__Impl();
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
    // $ANTLR end rule__Present__Group_6__1


    // $ANTLR start rule__Present__Group_6__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4010:1: rule__Present__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Present__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4014:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4015:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4015:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4016:1: ';'
            {
             before(grammarAccess.getPresentAccess().getSemicolonKeyword_6_1()); 
            match(input,21,FOLLOW_21_in_rule__Present__Group_6__1__Impl8018); 
             after(grammarAccess.getPresentAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end rule__Present__Group_6__1__Impl


    // $ANTLR start rule__Goto__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4033:1: rule__Goto__Group__0 : rule__Goto__Group__0__Impl rule__Goto__Group__1 ;
    public final void rule__Goto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4037:1: ( rule__Goto__Group__0__Impl rule__Goto__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4038:2: rule__Goto__Group__0__Impl rule__Goto__Group__1
            {
            pushFollow(FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__08053);
            rule__Goto__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__08056);
            rule__Goto__Group__1();
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
    // $ANTLR end rule__Goto__Group__0


    // $ANTLR start rule__Goto__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4045:1: rule__Goto__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__Goto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4049:1: ( ( 'GOTO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4050:1: ( 'GOTO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4050:1: ( 'GOTO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4051:1: 'GOTO'
            {
             before(grammarAccess.getGotoAccess().getGOTOKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Goto__Group__0__Impl8084); 
             after(grammarAccess.getGotoAccess().getGOTOKeyword_0()); 

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
    // $ANTLR end rule__Goto__Group__0__Impl


    // $ANTLR start rule__Goto__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4064:1: rule__Goto__Group__1 : rule__Goto__Group__1__Impl rule__Goto__Group__2 ;
    public final void rule__Goto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4068:1: ( rule__Goto__Group__1__Impl rule__Goto__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4069:2: rule__Goto__Group__1__Impl rule__Goto__Group__2
            {
            pushFollow(FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__18115);
            rule__Goto__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__18118);
            rule__Goto__Group__2();
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
    // $ANTLR end rule__Goto__Group__1


    // $ANTLR start rule__Goto__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4076:1: rule__Goto__Group__1__Impl : ( '(' ) ;
    public final void rule__Goto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4080:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4081:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4081:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4082:1: '('
            {
             before(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Goto__Group__1__Impl8146); 
             after(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Goto__Group__1__Impl


    // $ANTLR start rule__Goto__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4095:1: rule__Goto__Group__2 : rule__Goto__Group__2__Impl rule__Goto__Group__3 ;
    public final void rule__Goto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4099:1: ( rule__Goto__Group__2__Impl rule__Goto__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4100:2: rule__Goto__Group__2__Impl rule__Goto__Group__3
            {
            pushFollow(FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__28177);
            rule__Goto__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__28180);
            rule__Goto__Group__3();
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
    // $ANTLR end rule__Goto__Group__2


    // $ANTLR start rule__Goto__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4107:1: rule__Goto__Group__2__Impl : ( ( rule__Goto__StateAssignment_2 ) ) ;
    public final void rule__Goto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4111:1: ( ( ( rule__Goto__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4112:1: ( ( rule__Goto__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4112:1: ( ( rule__Goto__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4113:1: ( rule__Goto__StateAssignment_2 )
            {
             before(grammarAccess.getGotoAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4114:1: ( rule__Goto__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4114:2: rule__Goto__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Goto__StateAssignment_2_in_rule__Goto__Group__2__Impl8207);
            rule__Goto__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getGotoAccess().getStateAssignment_2()); 

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
    // $ANTLR end rule__Goto__Group__2__Impl


    // $ANTLR start rule__Goto__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4124:1: rule__Goto__Group__3 : rule__Goto__Group__3__Impl rule__Goto__Group__4 ;
    public final void rule__Goto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4128:1: ( rule__Goto__Group__3__Impl rule__Goto__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4129:2: rule__Goto__Group__3__Impl rule__Goto__Group__4
            {
            pushFollow(FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__38237);
            rule__Goto__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__38240);
            rule__Goto__Group__4();
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
    // $ANTLR end rule__Goto__Group__3


    // $ANTLR start rule__Goto__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4136:1: rule__Goto__Group__3__Impl : ( ( rule__Goto__Group_3__0 )? ) ;
    public final void rule__Goto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4140:1: ( ( ( rule__Goto__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4141:1: ( ( rule__Goto__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4141:1: ( ( rule__Goto__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4142:1: ( rule__Goto__Group_3__0 )?
            {
             before(grammarAccess.getGotoAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4143:1: ( rule__Goto__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4143:2: rule__Goto__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Goto__Group_3__0_in_rule__Goto__Group__3__Impl8267);
                    rule__Goto__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGotoAccess().getGroup_3()); 

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
    // $ANTLR end rule__Goto__Group__3__Impl


    // $ANTLR start rule__Goto__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4153:1: rule__Goto__Group__4 : rule__Goto__Group__4__Impl ;
    public final void rule__Goto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4157:1: ( rule__Goto__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4158:2: rule__Goto__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__48298);
            rule__Goto__Group__4__Impl();
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
    // $ANTLR end rule__Goto__Group__4


    // $ANTLR start rule__Goto__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4164:1: rule__Goto__Group__4__Impl : ( ')' ) ;
    public final void rule__Goto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4168:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4169:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4169:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4170:1: ')'
            {
             before(grammarAccess.getGotoAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Goto__Group__4__Impl8326); 
             after(grammarAccess.getGotoAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Goto__Group__4__Impl


    // $ANTLR start rule__Goto__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4193:1: rule__Goto__Group_3__0 : rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1 ;
    public final void rule__Goto__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4197:1: ( rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4198:2: rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1
            {
            pushFollow(FOLLOW_rule__Goto__Group_3__0__Impl_in_rule__Goto__Group_3__08367);
            rule__Goto__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group_3__1_in_rule__Goto__Group_3__08370);
            rule__Goto__Group_3__1();
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
    // $ANTLR end rule__Goto__Group_3__0


    // $ANTLR start rule__Goto__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4205:1: rule__Goto__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Goto__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4209:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4210:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4210:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4211:1: ','
            {
             before(grammarAccess.getGotoAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Goto__Group_3__0__Impl8398); 
             after(grammarAccess.getGotoAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Goto__Group_3__0__Impl


    // $ANTLR start rule__Goto__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4224:1: rule__Goto__Group_3__1 : rule__Goto__Group_3__1__Impl ;
    public final void rule__Goto__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4228:1: ( rule__Goto__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4229:2: rule__Goto__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group_3__1__Impl_in_rule__Goto__Group_3__18429);
            rule__Goto__Group_3__1__Impl();
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
    // $ANTLR end rule__Goto__Group_3__1


    // $ANTLR start rule__Goto__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4235:1: rule__Goto__Group_3__1__Impl : ( ( rule__Goto__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Goto__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4239:1: ( ( ( rule__Goto__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4240:1: ( ( rule__Goto__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4240:1: ( ( rule__Goto__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4241:1: ( rule__Goto__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getGotoAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4242:1: ( rule__Goto__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4242:2: rule__Goto__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Goto__ContinuationAssignment_3_1_in_rule__Goto__Group_3__1__Impl8456);
            rule__Goto__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getGotoAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Goto__Group_3__1__Impl


    // $ANTLR start rule__Fork__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4256:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4260:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4261:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08490);
            rule__Fork__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08493);
            rule__Fork__Group__1();
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
    // $ANTLR end rule__Fork__Group__0


    // $ANTLR start rule__Fork__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4268:1: rule__Fork__Group__0__Impl : ( 'FORK' ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4272:1: ( ( 'FORK' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4273:1: ( 'FORK' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4273:1: ( 'FORK' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4274:1: 'FORK'
            {
             before(grammarAccess.getForkAccess().getFORKKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Fork__Group__0__Impl8521); 
             after(grammarAccess.getForkAccess().getFORKKeyword_0()); 

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
    // $ANTLR end rule__Fork__Group__0__Impl


    // $ANTLR start rule__Fork__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4287:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4291:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4292:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18552);
            rule__Fork__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18555);
            rule__Fork__Group__2();
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
    // $ANTLR end rule__Fork__Group__1


    // $ANTLR start rule__Fork__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4299:1: rule__Fork__Group__1__Impl : ( '(' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4303:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4304:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4304:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4305:1: '('
            {
             before(grammarAccess.getForkAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Fork__Group__1__Impl8583); 
             after(grammarAccess.getForkAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Fork__Group__1__Impl


    // $ANTLR start rule__Fork__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4318:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4322:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4323:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28614);
            rule__Fork__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28617);
            rule__Fork__Group__3();
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
    // $ANTLR end rule__Fork__Group__2


    // $ANTLR start rule__Fork__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4330:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__StateAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4334:1: ( ( ( rule__Fork__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4335:1: ( ( rule__Fork__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4335:1: ( ( rule__Fork__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4336:1: ( rule__Fork__StateAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4337:1: ( rule__Fork__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4337:2: rule__Fork__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Fork__StateAssignment_2_in_rule__Fork__Group__2__Impl8644);
            rule__Fork__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getStateAssignment_2()); 

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
    // $ANTLR end rule__Fork__Group__2__Impl


    // $ANTLR start rule__Fork__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4347:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl rule__Fork__Group__4 ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4351:1: ( rule__Fork__Group__3__Impl rule__Fork__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4352:2: rule__Fork__Group__3__Impl rule__Fork__Group__4
            {
            pushFollow(FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38674);
            rule__Fork__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38677);
            rule__Fork__Group__4();
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
    // $ANTLR end rule__Fork__Group__3


    // $ANTLR start rule__Fork__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4359:1: rule__Fork__Group__3__Impl : ( ',' ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4363:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4364:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4364:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4365:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group__3__Impl8705); 
             after(grammarAccess.getForkAccess().getCommaKeyword_3()); 

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
    // $ANTLR end rule__Fork__Group__3__Impl


    // $ANTLR start rule__Fork__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4378:1: rule__Fork__Group__4 : rule__Fork__Group__4__Impl rule__Fork__Group__5 ;
    public final void rule__Fork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4382:1: ( rule__Fork__Group__4__Impl rule__Fork__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4383:2: rule__Fork__Group__4__Impl rule__Fork__Group__5
            {
            pushFollow(FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48736);
            rule__Fork__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48739);
            rule__Fork__Group__5();
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
    // $ANTLR end rule__Fork__Group__4


    // $ANTLR start rule__Fork__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4390:1: rule__Fork__Group__4__Impl : ( ( rule__Fork__PriorityAssignment_4 ) ) ;
    public final void rule__Fork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4394:1: ( ( ( rule__Fork__PriorityAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4395:1: ( ( rule__Fork__PriorityAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4395:1: ( ( rule__Fork__PriorityAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4396:1: ( rule__Fork__PriorityAssignment_4 )
            {
             before(grammarAccess.getForkAccess().getPriorityAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4397:1: ( rule__Fork__PriorityAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4397:2: rule__Fork__PriorityAssignment_4
            {
            pushFollow(FOLLOW_rule__Fork__PriorityAssignment_4_in_rule__Fork__Group__4__Impl8766);
            rule__Fork__PriorityAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getPriorityAssignment_4()); 

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
    // $ANTLR end rule__Fork__Group__4__Impl


    // $ANTLR start rule__Fork__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4407:1: rule__Fork__Group__5 : rule__Fork__Group__5__Impl rule__Fork__Group__6 ;
    public final void rule__Fork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4411:1: ( rule__Fork__Group__5__Impl rule__Fork__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4412:2: rule__Fork__Group__5__Impl rule__Fork__Group__6
            {
            pushFollow(FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58796);
            rule__Fork__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58799);
            rule__Fork__Group__6();
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
    // $ANTLR end rule__Fork__Group__5


    // $ANTLR start rule__Fork__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4419:1: rule__Fork__Group__5__Impl : ( ( rule__Fork__Group_5__0 )? ) ;
    public final void rule__Fork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4423:1: ( ( ( rule__Fork__Group_5__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4424:1: ( ( rule__Fork__Group_5__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4424:1: ( ( rule__Fork__Group_5__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4425:1: ( rule__Fork__Group_5__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4426:1: ( rule__Fork__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4426:2: rule__Fork__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Fork__Group_5__0_in_rule__Fork__Group__5__Impl8826);
                    rule__Fork__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getGroup_5()); 

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
    // $ANTLR end rule__Fork__Group__5__Impl


    // $ANTLR start rule__Fork__Group__6
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4436:1: rule__Fork__Group__6 : rule__Fork__Group__6__Impl ;
    public final void rule__Fork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4440:1: ( rule__Fork__Group__6__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4441:2: rule__Fork__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68857);
            rule__Fork__Group__6__Impl();
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
    // $ANTLR end rule__Fork__Group__6


    // $ANTLR start rule__Fork__Group__6__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4447:1: rule__Fork__Group__6__Impl : ( ')' ) ;
    public final void rule__Fork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4451:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4452:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4452:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4453:1: ')'
            {
             before(grammarAccess.getForkAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Fork__Group__6__Impl8885); 
             after(grammarAccess.getForkAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end rule__Fork__Group__6__Impl


    // $ANTLR start rule__Fork__Group_5__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4480:1: rule__Fork__Group_5__0 : rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1 ;
    public final void rule__Fork__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4484:1: ( rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4485:2: rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1
            {
            pushFollow(FOLLOW_rule__Fork__Group_5__0__Impl_in_rule__Fork__Group_5__08930);
            rule__Fork__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group_5__1_in_rule__Fork__Group_5__08933);
            rule__Fork__Group_5__1();
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
    // $ANTLR end rule__Fork__Group_5__0


    // $ANTLR start rule__Fork__Group_5__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4492:1: rule__Fork__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Fork__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4496:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4497:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4497:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4498:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group_5__0__Impl8961); 
             after(grammarAccess.getForkAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end rule__Fork__Group_5__0__Impl


    // $ANTLR start rule__Fork__Group_5__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4511:1: rule__Fork__Group_5__1 : rule__Fork__Group_5__1__Impl ;
    public final void rule__Fork__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4515:1: ( rule__Fork__Group_5__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4516:2: rule__Fork__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group_5__1__Impl_in_rule__Fork__Group_5__18992);
            rule__Fork__Group_5__1__Impl();
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
    // $ANTLR end rule__Fork__Group_5__1


    // $ANTLR start rule__Fork__Group_5__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4522:1: rule__Fork__Group_5__1__Impl : ( ( rule__Fork__ContinuationAssignment_5_1 ) ) ;
    public final void rule__Fork__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4526:1: ( ( ( rule__Fork__ContinuationAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4527:1: ( ( rule__Fork__ContinuationAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4527:1: ( ( rule__Fork__ContinuationAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4528:1: ( rule__Fork__ContinuationAssignment_5_1 )
            {
             before(grammarAccess.getForkAccess().getContinuationAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4529:1: ( rule__Fork__ContinuationAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4529:2: rule__Fork__ContinuationAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Fork__ContinuationAssignment_5_1_in_rule__Fork__Group_5__1__Impl9019);
            rule__Fork__ContinuationAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getContinuationAssignment_5_1()); 

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
    // $ANTLR end rule__Fork__Group_5__1__Impl


    // $ANTLR start rule__Forke__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4543:1: rule__Forke__Group__0 : rule__Forke__Group__0__Impl rule__Forke__Group__1 ;
    public final void rule__Forke__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4547:1: ( rule__Forke__Group__0__Impl rule__Forke__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4548:2: rule__Forke__Group__0__Impl rule__Forke__Group__1
            {
            pushFollow(FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__09053);
            rule__Forke__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__09056);
            rule__Forke__Group__1();
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
    // $ANTLR end rule__Forke__Group__0


    // $ANTLR start rule__Forke__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4555:1: rule__Forke__Group__0__Impl : ( 'FORKE' ) ;
    public final void rule__Forke__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4559:1: ( ( 'FORKE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4560:1: ( 'FORKE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4560:1: ( 'FORKE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4561:1: 'FORKE'
            {
             before(grammarAccess.getForkeAccess().getFORKEKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Forke__Group__0__Impl9084); 
             after(grammarAccess.getForkeAccess().getFORKEKeyword_0()); 

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
    // $ANTLR end rule__Forke__Group__0__Impl


    // $ANTLR start rule__Forke__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4574:1: rule__Forke__Group__1 : rule__Forke__Group__1__Impl rule__Forke__Group__2 ;
    public final void rule__Forke__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4578:1: ( rule__Forke__Group__1__Impl rule__Forke__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4579:2: rule__Forke__Group__1__Impl rule__Forke__Group__2
            {
            pushFollow(FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__19115);
            rule__Forke__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__19118);
            rule__Forke__Group__2();
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
    // $ANTLR end rule__Forke__Group__1


    // $ANTLR start rule__Forke__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4586:1: rule__Forke__Group__1__Impl : ( '(' ) ;
    public final void rule__Forke__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4590:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4591:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4591:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4592:1: '('
            {
             before(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Forke__Group__1__Impl9146); 
             after(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Forke__Group__1__Impl


    // $ANTLR start rule__Forke__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4605:1: rule__Forke__Group__2 : rule__Forke__Group__2__Impl rule__Forke__Group__3 ;
    public final void rule__Forke__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4609:1: ( rule__Forke__Group__2__Impl rule__Forke__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4610:2: rule__Forke__Group__2__Impl rule__Forke__Group__3
            {
            pushFollow(FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__29177);
            rule__Forke__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__29180);
            rule__Forke__Group__3();
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
    // $ANTLR end rule__Forke__Group__2


    // $ANTLR start rule__Forke__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4617:1: rule__Forke__Group__2__Impl : ( ( rule__Forke__StateAssignment_2 ) ) ;
    public final void rule__Forke__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4621:1: ( ( ( rule__Forke__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4622:1: ( ( rule__Forke__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4622:1: ( ( rule__Forke__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4623:1: ( rule__Forke__StateAssignment_2 )
            {
             before(grammarAccess.getForkeAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4624:1: ( rule__Forke__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4624:2: rule__Forke__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Forke__StateAssignment_2_in_rule__Forke__Group__2__Impl9207);
            rule__Forke__StateAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getForkeAccess().getStateAssignment_2()); 

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
    // $ANTLR end rule__Forke__Group__2__Impl


    // $ANTLR start rule__Forke__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4634:1: rule__Forke__Group__3 : rule__Forke__Group__3__Impl rule__Forke__Group__4 ;
    public final void rule__Forke__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4638:1: ( rule__Forke__Group__3__Impl rule__Forke__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4639:2: rule__Forke__Group__3__Impl rule__Forke__Group__4
            {
            pushFollow(FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__39237);
            rule__Forke__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__39240);
            rule__Forke__Group__4();
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
    // $ANTLR end rule__Forke__Group__3


    // $ANTLR start rule__Forke__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4646:1: rule__Forke__Group__3__Impl : ( ( rule__Forke__Group_3__0 )? ) ;
    public final void rule__Forke__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4650:1: ( ( ( rule__Forke__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4651:1: ( ( rule__Forke__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4651:1: ( ( rule__Forke__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4652:1: ( rule__Forke__Group_3__0 )?
            {
             before(grammarAccess.getForkeAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4653:1: ( rule__Forke__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4653:2: rule__Forke__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Forke__Group_3__0_in_rule__Forke__Group__3__Impl9267);
                    rule__Forke__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkeAccess().getGroup_3()); 

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
    // $ANTLR end rule__Forke__Group__3__Impl


    // $ANTLR start rule__Forke__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4663:1: rule__Forke__Group__4 : rule__Forke__Group__4__Impl ;
    public final void rule__Forke__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4667:1: ( rule__Forke__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4668:2: rule__Forke__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__49298);
            rule__Forke__Group__4__Impl();
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
    // $ANTLR end rule__Forke__Group__4


    // $ANTLR start rule__Forke__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4674:1: rule__Forke__Group__4__Impl : ( ')' ) ;
    public final void rule__Forke__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4678:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4679:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4679:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4680:1: ')'
            {
             before(grammarAccess.getForkeAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Forke__Group__4__Impl9326); 
             after(grammarAccess.getForkeAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Forke__Group__4__Impl


    // $ANTLR start rule__Forke__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4703:1: rule__Forke__Group_3__0 : rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1 ;
    public final void rule__Forke__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4707:1: ( rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4708:2: rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1
            {
            pushFollow(FOLLOW_rule__Forke__Group_3__0__Impl_in_rule__Forke__Group_3__09367);
            rule__Forke__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group_3__1_in_rule__Forke__Group_3__09370);
            rule__Forke__Group_3__1();
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
    // $ANTLR end rule__Forke__Group_3__0


    // $ANTLR start rule__Forke__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4715:1: rule__Forke__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Forke__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4719:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4720:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4720:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4721:1: ','
            {
             before(grammarAccess.getForkeAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Forke__Group_3__0__Impl9398); 
             after(grammarAccess.getForkeAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Forke__Group_3__0__Impl


    // $ANTLR start rule__Forke__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4734:1: rule__Forke__Group_3__1 : rule__Forke__Group_3__1__Impl ;
    public final void rule__Forke__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4738:1: ( rule__Forke__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4739:2: rule__Forke__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group_3__1__Impl_in_rule__Forke__Group_3__19429);
            rule__Forke__Group_3__1__Impl();
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
    // $ANTLR end rule__Forke__Group_3__1


    // $ANTLR start rule__Forke__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4745:1: rule__Forke__Group_3__1__Impl : ( ( rule__Forke__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Forke__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4749:1: ( ( ( rule__Forke__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4750:1: ( ( rule__Forke__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4750:1: ( ( rule__Forke__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4751:1: ( rule__Forke__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getForkeAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4752:1: ( rule__Forke__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4752:2: rule__Forke__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Forke__ContinuationAssignment_3_1_in_rule__Forke__Group_3__1__Impl9456);
            rule__Forke__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getForkeAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Forke__Group_3__1__Impl


    // $ANTLR start rule__Emit__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4766:1: rule__Emit__Group__0 : rule__Emit__Group__0__Impl rule__Emit__Group__1 ;
    public final void rule__Emit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4770:1: ( rule__Emit__Group__0__Impl rule__Emit__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4771:2: rule__Emit__Group__0__Impl rule__Emit__Group__1
            {
            pushFollow(FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09490);
            rule__Emit__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09493);
            rule__Emit__Group__1();
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
    // $ANTLR end rule__Emit__Group__0


    // $ANTLR start rule__Emit__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4778:1: rule__Emit__Group__0__Impl : ( 'EMIT' ) ;
    public final void rule__Emit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4782:1: ( ( 'EMIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4783:1: ( 'EMIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4783:1: ( 'EMIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4784:1: 'EMIT'
            {
             before(grammarAccess.getEmitAccess().getEMITKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Emit__Group__0__Impl9521); 
             after(grammarAccess.getEmitAccess().getEMITKeyword_0()); 

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
    // $ANTLR end rule__Emit__Group__0__Impl


    // $ANTLR start rule__Emit__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4797:1: rule__Emit__Group__1 : rule__Emit__Group__1__Impl rule__Emit__Group__2 ;
    public final void rule__Emit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4801:1: ( rule__Emit__Group__1__Impl rule__Emit__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4802:2: rule__Emit__Group__1__Impl rule__Emit__Group__2
            {
            pushFollow(FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19552);
            rule__Emit__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19555);
            rule__Emit__Group__2();
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
    // $ANTLR end rule__Emit__Group__1


    // $ANTLR start rule__Emit__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4809:1: rule__Emit__Group__1__Impl : ( '(' ) ;
    public final void rule__Emit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4813:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4814:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4814:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4815:1: '('
            {
             before(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Emit__Group__1__Impl9583); 
             after(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Emit__Group__1__Impl


    // $ANTLR start rule__Emit__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4828:1: rule__Emit__Group__2 : rule__Emit__Group__2__Impl rule__Emit__Group__3 ;
    public final void rule__Emit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4832:1: ( rule__Emit__Group__2__Impl rule__Emit__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4833:2: rule__Emit__Group__2__Impl rule__Emit__Group__3
            {
            pushFollow(FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29614);
            rule__Emit__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29617);
            rule__Emit__Group__3();
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
    // $ANTLR end rule__Emit__Group__2


    // $ANTLR start rule__Emit__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4840:1: rule__Emit__Group__2__Impl : ( ( rule__Emit__SignalAssignment_2 ) ) ;
    public final void rule__Emit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4844:1: ( ( ( rule__Emit__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4845:1: ( ( rule__Emit__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4845:1: ( ( rule__Emit__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4846:1: ( rule__Emit__SignalAssignment_2 )
            {
             before(grammarAccess.getEmitAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4847:1: ( rule__Emit__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4847:2: rule__Emit__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Emit__SignalAssignment_2_in_rule__Emit__Group__2__Impl9644);
            rule__Emit__SignalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getEmitAccess().getSignalAssignment_2()); 

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
    // $ANTLR end rule__Emit__Group__2__Impl


    // $ANTLR start rule__Emit__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4857:1: rule__Emit__Group__3 : rule__Emit__Group__3__Impl rule__Emit__Group__4 ;
    public final void rule__Emit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4861:1: ( rule__Emit__Group__3__Impl rule__Emit__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4862:2: rule__Emit__Group__3__Impl rule__Emit__Group__4
            {
            pushFollow(FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39674);
            rule__Emit__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39677);
            rule__Emit__Group__4();
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
    // $ANTLR end rule__Emit__Group__3


    // $ANTLR start rule__Emit__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4869:1: rule__Emit__Group__3__Impl : ( ( rule__Emit__Group_3__0 )? ) ;
    public final void rule__Emit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4873:1: ( ( ( rule__Emit__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4874:1: ( ( rule__Emit__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4874:1: ( ( rule__Emit__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4875:1: ( rule__Emit__Group_3__0 )?
            {
             before(grammarAccess.getEmitAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4876:1: ( rule__Emit__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4876:2: rule__Emit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Emit__Group_3__0_in_rule__Emit__Group__3__Impl9704);
                    rule__Emit__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmitAccess().getGroup_3()); 

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
    // $ANTLR end rule__Emit__Group__3__Impl


    // $ANTLR start rule__Emit__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4886:1: rule__Emit__Group__4 : rule__Emit__Group__4__Impl ;
    public final void rule__Emit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4890:1: ( rule__Emit__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4891:2: rule__Emit__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49735);
            rule__Emit__Group__4__Impl();
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
    // $ANTLR end rule__Emit__Group__4


    // $ANTLR start rule__Emit__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4897:1: rule__Emit__Group__4__Impl : ( ')' ) ;
    public final void rule__Emit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4901:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4902:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4902:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4903:1: ')'
            {
             before(grammarAccess.getEmitAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Emit__Group__4__Impl9763); 
             after(grammarAccess.getEmitAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Emit__Group__4__Impl


    // $ANTLR start rule__Emit__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4926:1: rule__Emit__Group_3__0 : rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1 ;
    public final void rule__Emit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4930:1: ( rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4931:2: rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1
            {
            pushFollow(FOLLOW_rule__Emit__Group_3__0__Impl_in_rule__Emit__Group_3__09804);
            rule__Emit__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group_3__1_in_rule__Emit__Group_3__09807);
            rule__Emit__Group_3__1();
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
    // $ANTLR end rule__Emit__Group_3__0


    // $ANTLR start rule__Emit__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4938:1: rule__Emit__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Emit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4942:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4943:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4943:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4944:1: ','
            {
             before(grammarAccess.getEmitAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Emit__Group_3__0__Impl9835); 
             after(grammarAccess.getEmitAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Emit__Group_3__0__Impl


    // $ANTLR start rule__Emit__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4957:1: rule__Emit__Group_3__1 : rule__Emit__Group_3__1__Impl ;
    public final void rule__Emit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4961:1: ( rule__Emit__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4962:2: rule__Emit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group_3__1__Impl_in_rule__Emit__Group_3__19866);
            rule__Emit__Group_3__1__Impl();
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
    // $ANTLR end rule__Emit__Group_3__1


    // $ANTLR start rule__Emit__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4968:1: rule__Emit__Group_3__1__Impl : ( ( rule__Emit__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Emit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4972:1: ( ( ( rule__Emit__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4973:1: ( ( rule__Emit__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4973:1: ( ( rule__Emit__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4974:1: ( rule__Emit__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getEmitAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4975:1: ( rule__Emit__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4975:2: rule__Emit__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Emit__ContinuationAssignment_3_1_in_rule__Emit__Group_3__1__Impl9893);
            rule__Emit__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getEmitAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Emit__Group_3__1__Impl


    // $ANTLR start rule__Await__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4989:1: rule__Await__Group__0 : rule__Await__Group__0__Impl rule__Await__Group__1 ;
    public final void rule__Await__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4993:1: ( rule__Await__Group__0__Impl rule__Await__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4994:2: rule__Await__Group__0__Impl rule__Await__Group__1
            {
            pushFollow(FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__09927);
            rule__Await__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__1_in_rule__Await__Group__09930);
            rule__Await__Group__1();
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
    // $ANTLR end rule__Await__Group__0


    // $ANTLR start rule__Await__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5001:1: rule__Await__Group__0__Impl : ( 'AWAIT' ) ;
    public final void rule__Await__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5005:1: ( ( 'AWAIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5006:1: ( 'AWAIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5006:1: ( 'AWAIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5007:1: 'AWAIT'
            {
             before(grammarAccess.getAwaitAccess().getAWAITKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Await__Group__0__Impl9958); 
             after(grammarAccess.getAwaitAccess().getAWAITKeyword_0()); 

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
    // $ANTLR end rule__Await__Group__0__Impl


    // $ANTLR start rule__Await__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5020:1: rule__Await__Group__1 : rule__Await__Group__1__Impl rule__Await__Group__2 ;
    public final void rule__Await__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5024:1: ( rule__Await__Group__1__Impl rule__Await__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5025:2: rule__Await__Group__1__Impl rule__Await__Group__2
            {
            pushFollow(FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__19989);
            rule__Await__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__2_in_rule__Await__Group__19992);
            rule__Await__Group__2();
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
    // $ANTLR end rule__Await__Group__1


    // $ANTLR start rule__Await__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5032:1: rule__Await__Group__1__Impl : ( '(' ) ;
    public final void rule__Await__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5036:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5037:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5037:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5038:1: '('
            {
             before(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Await__Group__1__Impl10020); 
             after(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end rule__Await__Group__1__Impl


    // $ANTLR start rule__Await__Group__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5051:1: rule__Await__Group__2 : rule__Await__Group__2__Impl rule__Await__Group__3 ;
    public final void rule__Await__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5055:1: ( rule__Await__Group__2__Impl rule__Await__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5056:2: rule__Await__Group__2__Impl rule__Await__Group__3
            {
            pushFollow(FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__210051);
            rule__Await__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__3_in_rule__Await__Group__210054);
            rule__Await__Group__3();
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
    // $ANTLR end rule__Await__Group__2


    // $ANTLR start rule__Await__Group__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5063:1: rule__Await__Group__2__Impl : ( ( rule__Await__SignalAssignment_2 ) ) ;
    public final void rule__Await__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5067:1: ( ( ( rule__Await__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5068:1: ( ( rule__Await__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5068:1: ( ( rule__Await__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5069:1: ( rule__Await__SignalAssignment_2 )
            {
             before(grammarAccess.getAwaitAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5070:1: ( rule__Await__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5070:2: rule__Await__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Await__SignalAssignment_2_in_rule__Await__Group__2__Impl10081);
            rule__Await__SignalAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAwaitAccess().getSignalAssignment_2()); 

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
    // $ANTLR end rule__Await__Group__2__Impl


    // $ANTLR start rule__Await__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5080:1: rule__Await__Group__3 : rule__Await__Group__3__Impl rule__Await__Group__4 ;
    public final void rule__Await__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5084:1: ( rule__Await__Group__3__Impl rule__Await__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5085:2: rule__Await__Group__3__Impl rule__Await__Group__4
            {
            pushFollow(FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__310111);
            rule__Await__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__4_in_rule__Await__Group__310114);
            rule__Await__Group__4();
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
    // $ANTLR end rule__Await__Group__3


    // $ANTLR start rule__Await__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5092:1: rule__Await__Group__3__Impl : ( ( rule__Await__Group_3__0 )? ) ;
    public final void rule__Await__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5096:1: ( ( ( rule__Await__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5097:1: ( ( rule__Await__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5097:1: ( ( rule__Await__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5098:1: ( rule__Await__Group_3__0 )?
            {
             before(grammarAccess.getAwaitAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5099:1: ( rule__Await__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5099:2: rule__Await__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Await__Group_3__0_in_rule__Await__Group__3__Impl10141);
                    rule__Await__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAwaitAccess().getGroup_3()); 

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
    // $ANTLR end rule__Await__Group__3__Impl


    // $ANTLR start rule__Await__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5109:1: rule__Await__Group__4 : rule__Await__Group__4__Impl ;
    public final void rule__Await__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5113:1: ( rule__Await__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5114:2: rule__Await__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__410172);
            rule__Await__Group__4__Impl();
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
    // $ANTLR end rule__Await__Group__4


    // $ANTLR start rule__Await__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5120:1: rule__Await__Group__4__Impl : ( ')' ) ;
    public final void rule__Await__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5124:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5125:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5125:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5126:1: ')'
            {
             before(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Await__Group__4__Impl10200); 
             after(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Await__Group__4__Impl


    // $ANTLR start rule__Await__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5149:1: rule__Await__Group_3__0 : rule__Await__Group_3__0__Impl rule__Await__Group_3__1 ;
    public final void rule__Await__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5153:1: ( rule__Await__Group_3__0__Impl rule__Await__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5154:2: rule__Await__Group_3__0__Impl rule__Await__Group_3__1
            {
            pushFollow(FOLLOW_rule__Await__Group_3__0__Impl_in_rule__Await__Group_3__010241);
            rule__Await__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group_3__1_in_rule__Await__Group_3__010244);
            rule__Await__Group_3__1();
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
    // $ANTLR end rule__Await__Group_3__0


    // $ANTLR start rule__Await__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5161:1: rule__Await__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Await__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5165:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5166:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5166:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5167:1: ','
            {
             before(grammarAccess.getAwaitAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Await__Group_3__0__Impl10272); 
             after(grammarAccess.getAwaitAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Await__Group_3__0__Impl


    // $ANTLR start rule__Await__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5180:1: rule__Await__Group_3__1 : rule__Await__Group_3__1__Impl ;
    public final void rule__Await__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5184:1: ( rule__Await__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5185:2: rule__Await__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group_3__1__Impl_in_rule__Await__Group_3__110303);
            rule__Await__Group_3__1__Impl();
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
    // $ANTLR end rule__Await__Group_3__1


    // $ANTLR start rule__Await__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5191:1: rule__Await__Group_3__1__Impl : ( ( rule__Await__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Await__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5195:1: ( ( ( rule__Await__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5196:1: ( ( rule__Await__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5196:1: ( ( rule__Await__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5197:1: ( rule__Await__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getAwaitAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5198:1: ( rule__Await__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5198:2: rule__Await__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Await__ContinuationAssignment_3_1_in_rule__Await__Group_3__1__Impl10330);
            rule__Await__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getAwaitAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Await__Group_3__1__Impl


    // $ANTLR start rule__Prio__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5212:1: rule__Prio__Group__0 : rule__Prio__Group__0__Impl rule__Prio__Group__1 ;
    public final void rule__Prio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5216:1: ( rule__Prio__Group__0__Impl rule__Prio__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5217:2: rule__Prio__Group__0__Impl rule__Prio__Group__1
            {
            pushFollow(FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__010364);
            rule__Prio__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__010367);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5224:1: rule__Prio__Group__0__Impl : ( 'PRIO' ) ;
    public final void rule__Prio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5228:1: ( ( 'PRIO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5229:1: ( 'PRIO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5229:1: ( 'PRIO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5230:1: 'PRIO'
            {
             before(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Prio__Group__0__Impl10395); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5243:1: rule__Prio__Group__1 : rule__Prio__Group__1__Impl rule__Prio__Group__2 ;
    public final void rule__Prio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5247:1: ( rule__Prio__Group__1__Impl rule__Prio__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5248:2: rule__Prio__Group__1__Impl rule__Prio__Group__2
            {
            pushFollow(FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110426);
            rule__Prio__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110429);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5255:1: rule__Prio__Group__1__Impl : ( '(' ) ;
    public final void rule__Prio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5259:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5260:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5260:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5261:1: '('
            {
             before(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Prio__Group__1__Impl10457); 
             after(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_1()); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5274:1: rule__Prio__Group__2 : rule__Prio__Group__2__Impl rule__Prio__Group__3 ;
    public final void rule__Prio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5278:1: ( rule__Prio__Group__2__Impl rule__Prio__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5279:2: rule__Prio__Group__2__Impl rule__Prio__Group__3
            {
            pushFollow(FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210488);
            rule__Prio__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210491);
            rule__Prio__Group__3();
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5286:1: rule__Prio__Group__2__Impl : ( ( rule__Prio__PriorityAssignment_2 ) ) ;
    public final void rule__Prio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5290:1: ( ( ( rule__Prio__PriorityAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5291:1: ( ( rule__Prio__PriorityAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5291:1: ( ( rule__Prio__PriorityAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5292:1: ( rule__Prio__PriorityAssignment_2 )
            {
             before(grammarAccess.getPrioAccess().getPriorityAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5293:1: ( rule__Prio__PriorityAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5293:2: rule__Prio__PriorityAssignment_2
            {
            pushFollow(FOLLOW_rule__Prio__PriorityAssignment_2_in_rule__Prio__Group__2__Impl10518);
            rule__Prio__PriorityAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getPriorityAssignment_2()); 

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


    // $ANTLR start rule__Prio__Group__3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5303:1: rule__Prio__Group__3 : rule__Prio__Group__3__Impl rule__Prio__Group__4 ;
    public final void rule__Prio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5307:1: ( rule__Prio__Group__3__Impl rule__Prio__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5308:2: rule__Prio__Group__3__Impl rule__Prio__Group__4
            {
            pushFollow(FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310548);
            rule__Prio__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310551);
            rule__Prio__Group__4();
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
    // $ANTLR end rule__Prio__Group__3


    // $ANTLR start rule__Prio__Group__3__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5315:1: rule__Prio__Group__3__Impl : ( ( rule__Prio__Group_3__0 )? ) ;
    public final void rule__Prio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5319:1: ( ( ( rule__Prio__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5320:1: ( ( rule__Prio__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5320:1: ( ( rule__Prio__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5321:1: ( rule__Prio__Group_3__0 )?
            {
             before(grammarAccess.getPrioAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5322:1: ( rule__Prio__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5322:2: rule__Prio__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Prio__Group_3__0_in_rule__Prio__Group__3__Impl10578);
                    rule__Prio__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrioAccess().getGroup_3()); 

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
    // $ANTLR end rule__Prio__Group__3__Impl


    // $ANTLR start rule__Prio__Group__4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5332:1: rule__Prio__Group__4 : rule__Prio__Group__4__Impl ;
    public final void rule__Prio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5336:1: ( rule__Prio__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5337:2: rule__Prio__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410609);
            rule__Prio__Group__4__Impl();
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
    // $ANTLR end rule__Prio__Group__4


    // $ANTLR start rule__Prio__Group__4__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5343:1: rule__Prio__Group__4__Impl : ( ')' ) ;
    public final void rule__Prio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5347:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5348:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5348:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5349:1: ')'
            {
             before(grammarAccess.getPrioAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Prio__Group__4__Impl10637); 
             after(grammarAccess.getPrioAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end rule__Prio__Group__4__Impl


    // $ANTLR start rule__Prio__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5372:1: rule__Prio__Group_3__0 : rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1 ;
    public final void rule__Prio__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5376:1: ( rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5377:2: rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1
            {
            pushFollow(FOLLOW_rule__Prio__Group_3__0__Impl_in_rule__Prio__Group_3__010678);
            rule__Prio__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group_3__1_in_rule__Prio__Group_3__010681);
            rule__Prio__Group_3__1();
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
    // $ANTLR end rule__Prio__Group_3__0


    // $ANTLR start rule__Prio__Group_3__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5384:1: rule__Prio__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Prio__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5388:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5389:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5389:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5390:1: ','
            {
             before(grammarAccess.getPrioAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Prio__Group_3__0__Impl10709); 
             after(grammarAccess.getPrioAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end rule__Prio__Group_3__0__Impl


    // $ANTLR start rule__Prio__Group_3__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5403:1: rule__Prio__Group_3__1 : rule__Prio__Group_3__1__Impl ;
    public final void rule__Prio__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5407:1: ( rule__Prio__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5408:2: rule__Prio__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group_3__1__Impl_in_rule__Prio__Group_3__110740);
            rule__Prio__Group_3__1__Impl();
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
    // $ANTLR end rule__Prio__Group_3__1


    // $ANTLR start rule__Prio__Group_3__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5414:1: rule__Prio__Group_3__1__Impl : ( ( rule__Prio__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Prio__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5418:1: ( ( ( rule__Prio__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5419:1: ( ( rule__Prio__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5419:1: ( ( rule__Prio__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5420:1: ( rule__Prio__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getPrioAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5421:1: ( rule__Prio__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5421:2: rule__Prio__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Prio__ContinuationAssignment_3_1_in_rule__Prio__Group_3__1__Impl10767);
            rule__Prio__ContinuationAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getContinuationAssignment_3_1()); 

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
    // $ANTLR end rule__Prio__Group_3__1__Impl


    // $ANTLR start rule__Program__NameAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5436:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5440:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5441:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5441:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5442:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_110806); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Program__NameAssignment_1


    // $ANTLR start rule__Program__PriorityAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5451:1: rule__Program__PriorityAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Program__PriorityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5455:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5456:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5456:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5457:1: ruleIntValue
            {
             before(grammarAccess.getProgramAccess().getPriorityIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_310837);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getProgramAccess().getPriorityIntValueParserRuleCall_3_0()); 

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
    // $ANTLR end rule__Program__PriorityAssignment_3


    // $ANTLR start rule__Program__SignalsAssignment_5_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5466:1: rule__Program__SignalsAssignment_5_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5470:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5471:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5471:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5472:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_110868);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_5_1


    // $ANTLR start rule__Program__SignalsAssignment_5_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5481:1: rule__Program__SignalsAssignment_5_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5485:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5486:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5486:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5487:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_110899);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_5_2_1


    // $ANTLR start rule__Program__SignalsAssignment_6_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5496:1: rule__Program__SignalsAssignment_6_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5500:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5501:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5501:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5502:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_110930);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_6_1


    // $ANTLR start rule__Program__SignalsAssignment_6_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5511:1: rule__Program__SignalsAssignment_6_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5515:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5516:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5516:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5517:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_110961);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_6_2_1


    // $ANTLR start rule__Program__SignalsAssignment_7_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5526:1: rule__Program__SignalsAssignment_7_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5530:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5531:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5531:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5532:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_110992);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_7_1


    // $ANTLR start rule__Program__SignalsAssignment_7_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5541:1: rule__Program__SignalsAssignment_7_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5545:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5546:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5546:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5547:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_111023);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end rule__Program__SignalsAssignment_7_2_1


    // $ANTLR start rule__Program__StatesAssignment_8
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5556:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5560:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5561:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5561:1: ( ruleState )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5562:1: ruleState
            {
             before(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Program__StatesAssignment_811054);
            ruleState();
            _fsp--;

             after(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 

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
    // $ANTLR end rule__Program__StatesAssignment_8


    // $ANTLR start rule__Annotation__KeyAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5571:1: rule__Annotation__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5575:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5576:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5576:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5577:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_111085); 
             after(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Annotation__KeyAssignment_1


    // $ANTLR start rule__Annotation__ValueAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5586:1: rule__Annotation__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5590:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5591:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5591:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5592:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_311116); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__Annotation__ValueAssignment_3


    // $ANTLR start rule__State__NameAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5601:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5605:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5606:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5606:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5607:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_011147); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__State__NameAssignment_0


    // $ANTLR start rule__State__AnnotationsAssignment_2_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5616:1: rule__State__AnnotationsAssignment_2_0 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5620:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5621:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5621:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5622:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_011178);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0_0()); 

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
    // $ANTLR end rule__State__AnnotationsAssignment_2_0


    // $ANTLR start rule__State__AnnotationsAssignment_2_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5631:1: rule__State__AnnotationsAssignment_2_1_1 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5635:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5636:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5636:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5637:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_1_111209);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end rule__State__AnnotationsAssignment_2_1_1


    // $ANTLR start rule__State__SignalsAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5646:1: rule__State__SignalsAssignment_3_1 : ( ruleSignal ) ;
    public final void rule__State__SignalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5650:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5651:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5651:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5652:1: ruleSignal
            {
             before(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_3_111240);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_3_1_0()); 

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
    // $ANTLR end rule__State__SignalsAssignment_3_1


    // $ANTLR start rule__State__InstructionsAssignment_4_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5661:1: rule__State__InstructionsAssignment_4_0 : ( ruleInstruction ) ;
    public final void rule__State__InstructionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5665:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5666:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5666:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5667:1: ruleInstruction
            {
             before(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_4_011271);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__State__InstructionsAssignment_4_0


    // $ANTLR start rule__Signal__NameAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5676:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5680:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5681:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5681:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5682:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011302); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end rule__Signal__NameAssignment_0


    // $ANTLR start rule__Signal__TypeAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5691:1: rule__Signal__TypeAssignment_2 : ( ruleSignalType ) ;
    public final void rule__Signal__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5695:1: ( ( ruleSignalType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5696:1: ( ruleSignalType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5696:1: ( ruleSignalType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5697:1: ruleSignalType
            {
             before(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_211333);
            ruleSignalType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Signal__TypeAssignment_2


    // $ANTLR start rule__Signal__CombineFunctionAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5706:1: rule__Signal__CombineFunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__CombineFunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5710:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5711:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5711:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5712:1: ( RULE_ID )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5713:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5714:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_111368); 
             after(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Signal__CombineFunctionAssignment_3_1


    // $ANTLR start rule__Signal__AnnotationsAssignment_4_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5725:1: rule__Signal__AnnotationsAssignment_4_0 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5729:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5730:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5730:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5731:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_011403);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); 

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
    // $ANTLR end rule__Signal__AnnotationsAssignment_4_0


    // $ANTLR start rule__Signal__AnnotationsAssignment_4_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5740:1: rule__Signal__AnnotationsAssignment_4_1_1 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5744:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5745:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5745:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5746:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_1_111434);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end rule__Signal__AnnotationsAssignment_4_1_1


    // $ANTLR start rule__CustomSignalType__CustomTypeAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5757:1: rule__CustomSignalType__CustomTypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomSignalType__CustomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5761:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5762:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5762:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5763:1: RULE_STRING
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCustomTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomSignalType__CustomTypeAssignment_111467); 
             after(grammarAccess.getCustomSignalTypeAccess().getCustomTypeSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__CustomSignalType__CustomTypeAssignment_1


    // $ANTLR start rule__PrimitiveSignalType__PrimitiveTypeAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5772:1: rule__PrimitiveSignalType__PrimitiveTypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveSignalType__PrimitiveTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5776:1: ( ( rulePrimitiveType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5777:1: ( rulePrimitiveType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5777:1: ( rulePrimitiveType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5778:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveSignalTypeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveSignalType__PrimitiveTypeAssignment11498);
            rulePrimitiveType();
            _fsp--;

             after(grammarAccess.getPrimitiveSignalTypeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_0()); 

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
    // $ANTLR end rule__PrimitiveSignalType__PrimitiveTypeAssignment


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5787:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5791:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5792:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5792:1: ( RULE_INT )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5793:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11529); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end rule__IntValue__ValueAssignment


    // $ANTLR start rule__Instruction__AnnotationsAssignment_11_1_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5804:1: rule__Instruction__AnnotationsAssignment_11_1_0 : ( ruleAnnotation ) ;
    public final void rule__Instruction__AnnotationsAssignment_11_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5808:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5809:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5809:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5810:1: ruleAnnotation
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_11_1_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_11_1_011562);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_11_1_0_0()); 

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
    // $ANTLR end rule__Instruction__AnnotationsAssignment_11_1_0


    // $ANTLR start rule__Instruction__AnnotationsAssignment_11_1_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5819:1: rule__Instruction__AnnotationsAssignment_11_1_1_1 : ( ruleAnnotation ) ;
    public final void rule__Instruction__AnnotationsAssignment_11_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5823:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5824:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5824:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5825:1: ruleAnnotation
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_11_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_11_1_1_111593);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_11_1_1_1_0()); 

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
    // $ANTLR end rule__Instruction__AnnotationsAssignment_11_1_1_1


    // $ANTLR start rule__Pause__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5834:1: rule__Pause__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Pause__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5838:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5839:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5839:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5840:1: ( RULE_ID )
            {
             before(grammarAccess.getPauseAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5841:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5842:1: RULE_ID
            {
             before(grammarAccess.getPauseAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pause__ContinuationAssignment_311628); 
             after(grammarAccess.getPauseAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPauseAccess().getContinuationStateCrossReference_3_0()); 

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
    // $ANTLR end rule__Pause__ContinuationAssignment_3


    // $ANTLR start rule__Term__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5853:1: rule__Term__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Term__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5857:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5858:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5858:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5859:1: ( RULE_ID )
            {
             before(grammarAccess.getTermAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5860:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5861:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ContinuationAssignment_311667); 
             after(grammarAccess.getTermAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTermAccess().getContinuationStateCrossReference_3_0()); 

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
    // $ANTLR end rule__Term__ContinuationAssignment_3


    // $ANTLR start rule__Halt__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5872:1: rule__Halt__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Halt__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5876:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5877:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5877:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5878:1: ( RULE_ID )
            {
             before(grammarAccess.getHaltAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5879:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5880:1: RULE_ID
            {
             before(grammarAccess.getHaltAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Halt__ContinuationAssignment_311706); 
             after(grammarAccess.getHaltAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getHaltAccess().getContinuationStateCrossReference_3_0()); 

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
    // $ANTLR end rule__Halt__ContinuationAssignment_3


    // $ANTLR start rule__Join__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5891:1: rule__Join__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Join__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5895:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5896:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5896:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5897:1: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5898:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5899:1: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Join__ContinuationAssignment_311745); 
             after(grammarAccess.getJoinAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJoinAccess().getContinuationStateCrossReference_3_0()); 

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
    // $ANTLR end rule__Join__ContinuationAssignment_3


    // $ANTLR start rule__Abort__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5910:1: rule__Abort__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Abort__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5914:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5915:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5915:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5916:1: ( RULE_ID )
            {
             before(grammarAccess.getAbortAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5917:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5918:1: RULE_ID
            {
             before(grammarAccess.getAbortAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abort__ContinuationAssignment_311784); 
             after(grammarAccess.getAbortAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAbortAccess().getContinuationStateCrossReference_3_0()); 

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
    // $ANTLR end rule__Abort__ContinuationAssignment_3


    // $ANTLR start rule__Present__SignalAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5929:1: rule__Present__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Present__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5933:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5934:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5934:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5935:1: ( RULE_ID )
            {
             before(grammarAccess.getPresentAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5936:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5937:1: RULE_ID
            {
             before(grammarAccess.getPresentAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Present__SignalAssignment_211823); 
             after(grammarAccess.getPresentAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPresentAccess().getSignalSignalCrossReference_2_0()); 

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
    // $ANTLR end rule__Present__SignalAssignment_2


    // $ANTLR start rule__Present__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5948:1: rule__Present__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Present__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5952:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5953:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5953:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5954:1: ( RULE_ID )
            {
             before(grammarAccess.getPresentAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5955:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5956:1: RULE_ID
            {
             before(grammarAccess.getPresentAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Present__ContinuationAssignment_3_111862); 
             after(grammarAccess.getPresentAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPresentAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Present__ContinuationAssignment_3_1


    // $ANTLR start rule__Present__InstructionsAssignment_6_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5967:1: rule__Present__InstructionsAssignment_6_0 : ( ruleInstruction ) ;
    public final void rule__Present__InstructionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5971:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5972:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5972:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5973:1: ruleInstruction
            {
             before(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_6_011897);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_6_0_0()); 

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
    // $ANTLR end rule__Present__InstructionsAssignment_6_0


    // $ANTLR start rule__Goto__StateAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5982:1: rule__Goto__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Goto__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5986:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5987:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5987:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5988:1: ( RULE_ID )
            {
             before(grammarAccess.getGotoAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5989:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5990:1: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goto__StateAssignment_211932); 
             after(grammarAccess.getGotoAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGotoAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end rule__Goto__StateAssignment_2


    // $ANTLR start rule__Goto__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6001:1: rule__Goto__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goto__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6005:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6006:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6006:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6007:1: ( RULE_ID )
            {
             before(grammarAccess.getGotoAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6008:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6009:1: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goto__ContinuationAssignment_3_111971); 
             after(grammarAccess.getGotoAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getGotoAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Goto__ContinuationAssignment_3_1


    // $ANTLR start rule__Fork__StateAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6020:1: rule__Fork__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fork__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6024:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6025:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6025:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6026:1: ( RULE_ID )
            {
             before(grammarAccess.getForkAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6027:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6028:1: RULE_ID
            {
             before(grammarAccess.getForkAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fork__StateAssignment_212010); 
             after(grammarAccess.getForkAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getForkAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end rule__Fork__StateAssignment_2


    // $ANTLR start rule__Fork__PriorityAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6039:1: rule__Fork__PriorityAssignment_4 : ( ruleIntValue ) ;
    public final void rule__Fork__PriorityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6043:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6044:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6044:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6045:1: ruleIntValue
            {
             before(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_412045);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Fork__PriorityAssignment_4


    // $ANTLR start rule__Fork__ContinuationAssignment_5_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6054:1: rule__Fork__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fork__ContinuationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6058:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6059:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6059:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6060:1: ( RULE_ID )
            {
             before(grammarAccess.getForkAccess().getContinuationStateCrossReference_5_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6061:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6062:1: RULE_ID
            {
             before(grammarAccess.getForkAccess().getContinuationStateIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fork__ContinuationAssignment_5_112080); 
             after(grammarAccess.getForkAccess().getContinuationStateIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getForkAccess().getContinuationStateCrossReference_5_1_0()); 

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
    // $ANTLR end rule__Fork__ContinuationAssignment_5_1


    // $ANTLR start rule__Forke__StateAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6073:1: rule__Forke__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Forke__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6077:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6078:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6078:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6079:1: ( RULE_ID )
            {
             before(grammarAccess.getForkeAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6080:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6081:1: RULE_ID
            {
             before(grammarAccess.getForkeAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Forke__StateAssignment_212119); 
             after(grammarAccess.getForkeAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getForkeAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end rule__Forke__StateAssignment_2


    // $ANTLR start rule__Forke__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6092:1: rule__Forke__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Forke__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6096:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6097:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6097:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6098:1: ( RULE_ID )
            {
             before(grammarAccess.getForkeAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6099:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6100:1: RULE_ID
            {
             before(grammarAccess.getForkeAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Forke__ContinuationAssignment_3_112158); 
             after(grammarAccess.getForkeAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getForkeAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Forke__ContinuationAssignment_3_1


    // $ANTLR start rule__Emit__SignalAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6111:1: rule__Emit__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Emit__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6115:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6116:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6116:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6117:1: ( RULE_ID )
            {
             before(grammarAccess.getEmitAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6118:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6119:1: RULE_ID
            {
             before(grammarAccess.getEmitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emit__SignalAssignment_212197); 
             after(grammarAccess.getEmitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEmitAccess().getSignalSignalCrossReference_2_0()); 

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
    // $ANTLR end rule__Emit__SignalAssignment_2


    // $ANTLR start rule__Emit__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6130:1: rule__Emit__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Emit__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6134:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6135:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6135:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6136:1: ( RULE_ID )
            {
             before(grammarAccess.getEmitAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6137:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6138:1: RULE_ID
            {
             before(grammarAccess.getEmitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emit__ContinuationAssignment_3_112236); 
             after(grammarAccess.getEmitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEmitAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Emit__ContinuationAssignment_3_1


    // $ANTLR start rule__Await__SignalAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6149:1: rule__Await__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Await__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6153:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6154:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6154:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6155:1: ( RULE_ID )
            {
             before(grammarAccess.getAwaitAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6156:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6157:1: RULE_ID
            {
             before(grammarAccess.getAwaitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Await__SignalAssignment_212275); 
             after(grammarAccess.getAwaitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAwaitAccess().getSignalSignalCrossReference_2_0()); 

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
    // $ANTLR end rule__Await__SignalAssignment_2


    // $ANTLR start rule__Await__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6168:1: rule__Await__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Await__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6172:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6173:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6173:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6174:1: ( RULE_ID )
            {
             before(grammarAccess.getAwaitAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6175:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6176:1: RULE_ID
            {
             before(grammarAccess.getAwaitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Await__ContinuationAssignment_3_112314); 
             after(grammarAccess.getAwaitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAwaitAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Await__ContinuationAssignment_3_1


    // $ANTLR start rule__Prio__PriorityAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6187:1: rule__Prio__PriorityAssignment_2 : ( ruleIntValue ) ;
    public final void rule__Prio__PriorityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6191:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6192:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6192:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6193:1: ruleIntValue
            {
             before(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_212349);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_2_0()); 

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
    // $ANTLR end rule__Prio__PriorityAssignment_2


    // $ANTLR start rule__Prio__ContinuationAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6202:1: rule__Prio__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Prio__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6206:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6207:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6207:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6208:1: ( RULE_ID )
            {
             before(grammarAccess.getPrioAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6209:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6210:1: RULE_ID
            {
             before(grammarAccess.getPrioAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prio__ContinuationAssignment_3_112384); 
             after(grammarAccess.getPrioAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPrioAccess().getContinuationStateCrossReference_3_1_0()); 

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
    // $ANTLR end rule__Prio__ContinuationAssignment_3_1


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_ruleSignal276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_entryRuleSignalType305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalType312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignalType_in_entryRuleCustomSignalType365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomSignalType372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__0_in_ruleCustomSignalType398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignalType_in_entryRulePrimitiveSignalType425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSignalType432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveSignalType__PrimitiveTypeAssignment_in_rulePrimitiveSignalType458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__0_in_rulePause642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_entryRuleHalt729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHalt736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__0_in_ruleHalt762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0_in_ruleAbort882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0_in_rulePresent942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0_in_ruleGoto1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFork1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_entryRuleForke1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForke1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0_in_ruleForke1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0_in_ruleEmit1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0_in_ruleAwait1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0_in_rulePrio1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignalType_in_rule__SignalType__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignalType_in_rule__SignalType__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_rule__Instruction__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_rule__Instruction__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_rule__Instruction__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_rule__Instruction__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_rule__Instruction__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11__0_in_rule__Instruction__Alternatives1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveType__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveType__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveType__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__2__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31925 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41985 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__4__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52047 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62108 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2259 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2271 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_5__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12384 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22444 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2474 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_5__3__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group_6__0__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12757 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22817 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2847 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_6__3__Impl2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_6_2__0__Impl2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__03068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__03071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group_7__0__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13130 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3220 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_7__3__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Annotation__Group__0__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13503 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_1_in_rule__Annotation__Group__1__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Annotation__Group__2__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_3_in_rule__Annotation__Group__3__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03690 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13750 = new BitSet(new long[]{0x00000FCFCA000002L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group__1__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23812 = new BitSet(new long[]{0x00000FCFC8000002L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33873 = new BitSet(new long[]{0x00000FCFC0000002L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3961 = new BitSet(new long[]{0x00000FCFC0000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__04002 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_2_0_in_rule__State__Group_2__0__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0_in_rule__State__Group_2__1__Impl4089 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04124 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__Group_2_1__0__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_2_1_1_in_rule__State__Group_2_1__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__04247 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__04250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_3__0__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__SignalsAssignment_3_1_in_rule__State__Group_3__1__Impl4339 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__24370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_3__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InstructionsAssignment_4_0_in_rule__State__Group_4__0__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_4__1__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04558 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14618 = new BitSet(new long[]{0x000000002001E000L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Signal__Group__1__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24680 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34740 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Group__4__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Signal__Group_3__0__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__04992 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_4_0_in_rule__Signal__Group_4__0__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__15052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl5079 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__05114 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__05117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Signal__Group_4_1__0__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__15176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__0__Impl_in_rule__CustomSignalType__Group__05238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__1_in_rule__CustomSignalType__Group__05241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomSignalType__Group__0__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__1__Impl_in_rule__CustomSignalType__Group__15300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__CustomTypeAssignment_1_in_rule__CustomSignalType__Group__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11__0__Impl_in_rule__Instruction__Group_11__05361 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11__1_in_rule__Instruction__Group_11__05364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_rule__Instruction__Group_11__0__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11__1__Impl_in_rule__Instruction__Group_11__15420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1__0_in_rule__Instruction__Group_11__1__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1__0__Impl_in_rule__Instruction__Group_11_1__05482 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1__1_in_rule__Instruction__Group_11_1__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__AnnotationsAssignment_11_1_0_in_rule__Instruction__Group_11_1__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1__1__Impl_in_rule__Instruction__Group_11_1__15542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1_1__0_in_rule__Instruction__Group_11_1__1__Impl5569 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1_1__0__Impl_in_rule__Instruction__Group_11_1_1__05604 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1_1__1_in_rule__Instruction__Group_11_1_1__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instruction__Group_11_1_1__0__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_11_1_1__1__Impl_in_rule__Instruction__Group_11_1_1__15666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__AnnotationsAssignment_11_1_1_1_in_rule__Instruction__Group_11_1_1__1__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05727 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Pause__Group__1__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25850 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Pause__Group__2__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__ContinuationAssignment_3_in_rule__Pause__Group__3__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Pause__Group__4__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__06042 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__06045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__16106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Term__Group__1__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__26165 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Term__Group__3_in_rule__Term__Group__26168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group__2__Impl6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__36227 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Term__Group__4_in_rule__Term__Group__36230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ContinuationAssignment_3_in_rule__Term__Group__3__Impl6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__46288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group__4__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__0__Impl_in_rule__Halt__Group__06357 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Halt__Group__1_in_rule__Halt__Group__06360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__1__Impl_in_rule__Halt__Group__16418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Halt__Group__2_in_rule__Halt__Group__16421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Halt__Group__1__Impl6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__2__Impl_in_rule__Halt__Group__26480 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Halt__Group__3_in_rule__Halt__Group__26483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Halt__Group__2__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__3__Impl_in_rule__Halt__Group__36542 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Halt__Group__4_in_rule__Halt__Group__36545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__ContinuationAssignment_3_in_rule__Halt__Group__3__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Halt__Group__4__Impl_in_rule__Halt__Group__46603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Halt__Group__4__Impl6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06672 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16733 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Join__Group__1__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26795 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Join__Group__2__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__ContinuationAssignment_3_in_rule__Join__Group__3__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Join__Group__4__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06987 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__17048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__17051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Abort__Group__1__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__27110 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__27113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abort__Group__2__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__37172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__37175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__ContinuationAssignment_3_in_rule__Abort__Group__3__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__47233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abort__Group__4__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__07302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Present__Group__1_in_rule__Present__Group__07305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Present__Group__0__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__17364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group__2_in_rule__Present__Group__17367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Present__Group__1__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27426 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__SignalAssignment_2_in_rule__Present__Group__2__Impl7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__0_in_rule__Present__Group__3__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47547 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Present__Group__4__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57609 = new BitSet(new long[]{0x00000FEFC0000000L});
    public static final BitSet FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Present__Group__5__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__0_in_rule__Present__Group__6__Impl7701 = new BitSet(new long[]{0x00000FCFC0000002L});
    public static final BitSet FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Present__Group__7__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__0__Impl_in_rule__Present__Group_3__07807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group_3__1_in_rule__Present__Group_3__07810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Present__Group_3__0__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__1__Impl_in_rule__Present__Group_3__17869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__ContinuationAssignment_3_1_in_rule__Present__Group_3__1__Impl7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__0__Impl_in_rule__Present__Group_6__07930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Present__Group_6__1_in_rule__Present__Group_6__07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__InstructionsAssignment_6_0_in_rule__Present__Group_6__0__Impl7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__1__Impl_in_rule__Present__Group_6__17990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Present__Group_6__1__Impl8018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__08053 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__08056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Goto__Group__0__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__18115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__18118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Goto__Group__1__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__28177 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__28180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__StateAssignment_2_in_rule__Goto__Group__2__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__38237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__38240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__0_in_rule__Goto__Group__3__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__48298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Goto__Group__4__Impl8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__0__Impl_in_rule__Goto__Group_3__08367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__1_in_rule__Goto__Group_3__08370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Goto__Group_3__0__Impl8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__1__Impl_in_rule__Goto__Group_3__18429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__ContinuationAssignment_3_1_in_rule__Goto__Group_3__1__Impl8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08490 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Fork__Group__0__Impl8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Fork__Group__1__Impl8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28614 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__StateAssignment_2_in_rule__Fork__Group__2__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38674 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group__3__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48736 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__PriorityAssignment_4_in_rule__Fork__Group__4__Impl8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__0_in_rule__Fork__Group__5__Impl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Fork__Group__6__Impl8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__0__Impl_in_rule__Fork__Group_5__08930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__1_in_rule__Fork__Group_5__08933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group_5__0__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__1__Impl_in_rule__Fork__Group_5__18992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__ContinuationAssignment_5_1_in_rule__Fork__Group_5__1__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__09053 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__09056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Forke__Group__0__Impl9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__19115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__19118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Forke__Group__1__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__29177 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__29180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__StateAssignment_2_in_rule__Forke__Group__2__Impl9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__39237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__39240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__0_in_rule__Forke__Group__3__Impl9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__49298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Forke__Group__4__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__0__Impl_in_rule__Forke__Group_3__09367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__1_in_rule__Forke__Group_3__09370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Forke__Group_3__0__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__1__Impl_in_rule__Forke__Group_3__19429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__ContinuationAssignment_3_1_in_rule__Forke__Group_3__1__Impl9456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09490 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Emit__Group__0__Impl9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Emit__Group__1__Impl9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29614 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__SignalAssignment_2_in_rule__Emit__Group__2__Impl9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39674 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__0_in_rule__Emit__Group__3__Impl9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Emit__Group__4__Impl9763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__0__Impl_in_rule__Emit__Group_3__09804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__1_in_rule__Emit__Group_3__09807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Emit__Group_3__0__Impl9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__1__Impl_in_rule__Emit__Group_3__19866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__ContinuationAssignment_3_1_in_rule__Emit__Group_3__1__Impl9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__09927 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Await__Group__1_in_rule__Await__Group__09930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Await__Group__0__Impl9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__19989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group__2_in_rule__Await__Group__19992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Await__Group__1__Impl10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__210051 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Await__Group__3_in_rule__Await__Group__210054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__SignalAssignment_2_in_rule__Await__Group__2__Impl10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__310111 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Await__Group__4_in_rule__Await__Group__310114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__0_in_rule__Await__Group__3__Impl10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__410172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Await__Group__4__Impl10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__0__Impl_in_rule__Await__Group_3__010241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group_3__1_in_rule__Await__Group_3__010244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Await__Group_3__0__Impl10272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__1__Impl_in_rule__Await__Group_3__110303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__ContinuationAssignment_3_1_in_rule__Await__Group_3__1__Impl10330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__010364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__010367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Prio__Group__0__Impl10395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Prio__Group__1__Impl10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210488 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__PriorityAssignment_2_in_rule__Prio__Group__2__Impl10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310548 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__0_in_rule__Prio__Group__3__Impl10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Prio__Group__4__Impl10637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__0__Impl_in_rule__Prio__Group_3__010678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__1_in_rule__Prio__Group_3__010681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Prio__Group_3__0__Impl10709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__1__Impl_in_rule__Prio__Group_3__110740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__ContinuationAssignment_3_1_in_rule__Prio__Group_3__1__Impl10767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_110806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_310837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_110868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_110899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_110930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_110961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_111023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Program__StatesAssignment_811054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_111085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_311116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_011147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_011178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_1_111209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_3_111240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_4_011271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_211333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_111368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_011403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_1_111434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomSignalType__CustomTypeAssignment_111467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveSignalType__PrimitiveTypeAssignment11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_11_1_011562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_11_1_1_111593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pause__ContinuationAssignment_311628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ContinuationAssignment_311667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Halt__ContinuationAssignment_311706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Join__ContinuationAssignment_311745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abort__ContinuationAssignment_311784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Present__SignalAssignment_211823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Present__ContinuationAssignment_3_111862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_6_011897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goto__StateAssignment_211932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goto__ContinuationAssignment_3_111971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fork__StateAssignment_212010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_412045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fork__ContinuationAssignment_5_112080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Forke__StateAssignment_212119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Forke__ContinuationAssignment_3_112158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emit__SignalAssignment_212197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emit__ContinuationAssignment_3_112236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Await__SignalAssignment_212275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Await__ContinuationAssignment_3_112314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_212349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prio__ContinuationAssignment_3_112384 = new BitSet(new long[]{0x0000000000000002L});

}