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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'INT'", "'BOOL'", "'FLOAT'", "'Synchronous Program'", "'('", "')'", "'Inputs'", "';'", "','", "'Outputs'", "'Signals'", "'@'", "':'", "'SIGNALS'", "'combine'", "'CUSTOM'", "'PAUSE'", "'TERM'", "'JOIN'", "'ABORT'", "'PRESENT'", "'{'", "'}'", "'GOTO'", "'FORK'", "'FORKE'", "'EMIT'", "'AWAIT'", "'PRIO'"
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


    // $ANTLR start entryRuleJoin
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:377:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:378:1: ( ruleJoin EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:379:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin729);
            ruleJoin();
            _fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin736); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:386:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:390:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Join__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Join__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:392:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:1: ( rule__Join__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:2: rule__Join__Group__0
            {
            pushFollow(FOLLOW_rule__Join__Group__0_in_ruleJoin762);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:405:1: entryRuleAbort : ruleAbort EOF ;
    public final void entryRuleAbort() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:406:1: ( ruleAbort EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:407:1: ruleAbort EOF
            {
             before(grammarAccess.getAbortRule()); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort789);
            ruleAbort();
            _fsp--;

             after(grammarAccess.getAbortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort796); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:414:1: ruleAbort : ( ( rule__Abort__Group__0 ) ) ;
    public final void ruleAbort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:418:2: ( ( ( rule__Abort__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Abort__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Abort__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:420:1: ( rule__Abort__Group__0 )
            {
             before(grammarAccess.getAbortAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:1: ( rule__Abort__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:2: rule__Abort__Group__0
            {
            pushFollow(FOLLOW_rule__Abort__Group__0_in_ruleAbort822);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:433:1: entryRulePresent : rulePresent EOF ;
    public final void entryRulePresent() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:434:1: ( rulePresent EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:435:1: rulePresent EOF
            {
             before(grammarAccess.getPresentRule()); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent849);
            rulePresent();
            _fsp--;

             after(grammarAccess.getPresentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent856); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:442:1: rulePresent : ( ( rule__Present__Group__0 ) ) ;
    public final void rulePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:446:2: ( ( ( rule__Present__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Present__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Present__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:448:1: ( rule__Present__Group__0 )
            {
             before(grammarAccess.getPresentAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:1: ( rule__Present__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:2: rule__Present__Group__0
            {
            pushFollow(FOLLOW_rule__Present__Group__0_in_rulePresent882);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:461:1: entryRuleGoto : ruleGoto EOF ;
    public final void entryRuleGoto() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:462:1: ( ruleGoto EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:463:1: ruleGoto EOF
            {
             before(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto909);
            ruleGoto();
            _fsp--;

             after(grammarAccess.getGotoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto916); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:470:1: ruleGoto : ( ( rule__Goto__Group__0 ) ) ;
    public final void ruleGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:474:2: ( ( ( rule__Goto__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Goto__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Goto__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:476:1: ( rule__Goto__Group__0 )
            {
             before(grammarAccess.getGotoAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:1: ( rule__Goto__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:2: rule__Goto__Group__0
            {
            pushFollow(FOLLOW_rule__Goto__Group__0_in_ruleGoto942);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:489:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:490:1: ( ruleFork EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:491:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_ruleFork_in_entryRuleFork969);
            ruleFork();
            _fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFork976); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:498:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:502:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Fork__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:504:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:1: ( rule__Fork__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:2: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_rule__Fork__Group__0_in_ruleFork1002);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:517:1: entryRuleForke : ruleForke EOF ;
    public final void entryRuleForke() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:518:1: ( ruleForke EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:519:1: ruleForke EOF
            {
             before(grammarAccess.getForkeRule()); 
            pushFollow(FOLLOW_ruleForke_in_entryRuleForke1029);
            ruleForke();
            _fsp--;

             after(grammarAccess.getForkeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForke1036); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:526:1: ruleForke : ( ( rule__Forke__Group__0 ) ) ;
    public final void ruleForke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:530:2: ( ( ( rule__Forke__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Forke__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Forke__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:532:1: ( rule__Forke__Group__0 )
            {
             before(grammarAccess.getForkeAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:1: ( rule__Forke__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:2: rule__Forke__Group__0
            {
            pushFollow(FOLLOW_rule__Forke__Group__0_in_ruleForke1062);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:545:1: entryRuleEmit : ruleEmit EOF ;
    public final void entryRuleEmit() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:546:1: ( ruleEmit EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:547:1: ruleEmit EOF
            {
             before(grammarAccess.getEmitRule()); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit1089);
            ruleEmit();
            _fsp--;

             after(grammarAccess.getEmitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit1096); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:554:1: ruleEmit : ( ( rule__Emit__Group__0 ) ) ;
    public final void ruleEmit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:558:2: ( ( ( rule__Emit__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Emit__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Emit__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:560:1: ( rule__Emit__Group__0 )
            {
             before(grammarAccess.getEmitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:1: ( rule__Emit__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:2: rule__Emit__Group__0
            {
            pushFollow(FOLLOW_rule__Emit__Group__0_in_ruleEmit1122);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:573:1: entryRuleAwait : ruleAwait EOF ;
    public final void entryRuleAwait() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:574:1: ( ruleAwait EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:575:1: ruleAwait EOF
            {
             before(grammarAccess.getAwaitRule()); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait1149);
            ruleAwait();
            _fsp--;

             after(grammarAccess.getAwaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait1156); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:582:1: ruleAwait : ( ( rule__Await__Group__0 ) ) ;
    public final void ruleAwait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:586:2: ( ( ( rule__Await__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Await__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Await__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:588:1: ( rule__Await__Group__0 )
            {
             before(grammarAccess.getAwaitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:1: ( rule__Await__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:2: rule__Await__Group__0
            {
            pushFollow(FOLLOW_rule__Await__Group__0_in_ruleAwait1182);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:601:1: entryRulePrio : rulePrio EOF ;
    public final void entryRulePrio() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:602:1: ( rulePrio EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:603:1: rulePrio EOF
            {
             before(grammarAccess.getPrioRule()); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio1209);
            rulePrio();
            _fsp--;

             after(grammarAccess.getPrioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio1216); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:610:1: rulePrio : ( ( rule__Prio__Group__0 ) ) ;
    public final void rulePrio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:614:2: ( ( ( rule__Prio__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Prio__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Prio__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:616:1: ( rule__Prio__Group__0 )
            {
             before(grammarAccess.getPrioAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:1: ( rule__Prio__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:2: rule__Prio__Group__0
            {
            pushFollow(FOLLOW_rule__Prio__Group__0_in_rulePrio1242);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:630:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:634:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:635:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:635:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:636:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:637:1: ( rule__PrimitiveType__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:637:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1279);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:649:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) );
    public final void rule__SignalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:653:1: ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) )
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
                    new NoViableAltException("649:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignalType ) | ( ruleCustomSignalType ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:654:1: ( rulePrimitiveSignalType )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:654:1: ( rulePrimitiveSignalType )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:655:1: rulePrimitiveSignalType
                    {
                     before(grammarAccess.getSignalTypeAccess().getPrimitiveSignalTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveSignalType_in_rule__SignalType__Alternatives1315);
                    rulePrimitiveSignalType();
                    _fsp--;

                     after(grammarAccess.getSignalTypeAccess().getPrimitiveSignalTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:660:6: ( ruleCustomSignalType )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:660:6: ( ruleCustomSignalType )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:661:1: ruleCustomSignalType
                    {
                     before(grammarAccess.getSignalTypeAccess().getCustomSignalTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomSignalType_in_rule__SignalType__Alternatives1332);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:671:1: rule__Instruction__Alternatives : ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_10__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:675:1: ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_10__0 ) ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 30:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            case 37:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("671:1: rule__Instruction__Alternatives : ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( ( rule__Instruction__Group_10__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:676:1: ( ruleAbort )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:676:1: ( ruleAbort )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:677:1: ruleAbort
                    {
                     before(grammarAccess.getInstructionAccess().getAbortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1364);
                    ruleAbort();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAbortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:682:6: ( ruleJoin )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:682:6: ( ruleJoin )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:683:1: ruleJoin
                    {
                     before(grammarAccess.getInstructionAccess().getJoinParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1381);
                    ruleJoin();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getJoinParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:688:6: ( rulePause )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:688:6: ( rulePause )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:689:1: rulePause
                    {
                     before(grammarAccess.getInstructionAccess().getPauseParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePause_in_rule__Instruction__Alternatives1398);
                    rulePause();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPauseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:694:6: ( ruleTerm )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:694:6: ( ruleTerm )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:695:1: ruleTerm
                    {
                     before(grammarAccess.getInstructionAccess().getTermParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1415);
                    ruleTerm();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getTermParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:700:6: ( rulePresent )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:700:6: ( rulePresent )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:701:1: rulePresent
                    {
                     before(grammarAccess.getInstructionAccess().getPresentParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePresent_in_rule__Instruction__Alternatives1432);
                    rulePresent();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPresentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:706:6: ( ruleGoto )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:706:6: ( ruleGoto )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:707:1: ruleGoto
                    {
                     before(grammarAccess.getInstructionAccess().getGotoParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1449);
                    ruleGoto();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getGotoParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:712:6: ( ruleFork )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:712:6: ( ruleFork )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:713:1: ruleFork
                    {
                     before(grammarAccess.getInstructionAccess().getForkParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFork_in_rule__Instruction__Alternatives1466);
                    ruleFork();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:718:6: ( ruleForke )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:718:6: ( ruleForke )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:719:1: ruleForke
                    {
                     before(grammarAccess.getInstructionAccess().getForkeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleForke_in_rule__Instruction__Alternatives1483);
                    ruleForke();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:724:6: ( ruleEmit )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:724:6: ( ruleEmit )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:725:1: ruleEmit
                    {
                     before(grammarAccess.getInstructionAccess().getEmitParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1500);
                    ruleEmit();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getEmitParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:730:6: ( ruleAwait )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:730:6: ( ruleAwait )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:731:1: ruleAwait
                    {
                     before(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1517);
                    ruleAwait();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:736:6: ( ( rule__Instruction__Group_10__0 ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:736:6: ( ( rule__Instruction__Group_10__0 ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:737:1: ( rule__Instruction__Group_10__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_10()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:738:1: ( rule__Instruction__Group_10__0 )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:738:2: rule__Instruction__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_10__0_in_rule__Instruction__Alternatives1534);
                    rule__Instruction__Group_10__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_10()); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:747:1: rule__PrimitiveType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:751:1: ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) )
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
                    new NoViableAltException("747:1: rule__PrimitiveType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:752:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:752:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:753:1: ( 'PURE' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getPureEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:754:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:754:3: 'PURE'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveType__Alternatives1568); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getPureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:759:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:759:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:760:1: ( 'INT' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:761:1: ( 'INT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:761:3: 'INT'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveType__Alternatives1589); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:766:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:766:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:767:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:768:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:768:3: 'BOOL'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveType__Alternatives1610); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBoolEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:773:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:773:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:774:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:775:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:775:3: 'FLOAT'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveType__Alternatives1631); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:787:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:791:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:792:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01664);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01667);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:799:1: rule__Program__Group__0__Impl : ( 'Synchronous Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:803:1: ( ( 'Synchronous Program' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:804:1: ( 'Synchronous Program' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:804:1: ( 'Synchronous Program' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:805:1: 'Synchronous Program'
            {
             before(grammarAccess.getProgramAccess().getSynchronousProgramKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__0__Impl1695); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:818:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:822:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:823:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11726);
            rule__Program__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11729);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:830:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:834:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:835:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:835:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:836:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:837:1: ( rule__Program__NameAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:837:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1756);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:847:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:851:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:852:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21786);
            rule__Program__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21789);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:859:1: rule__Program__Group__2__Impl : ( '(' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:863:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:864:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:864:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:865:1: '('
            {
             before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__2__Impl1817); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:878:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:882:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:883:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31848);
            rule__Program__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31851);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:890:1: rule__Program__Group__3__Impl : ( ( rule__Program__PriorityAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:894:1: ( ( ( rule__Program__PriorityAssignment_3 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:895:1: ( ( rule__Program__PriorityAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:895:1: ( ( rule__Program__PriorityAssignment_3 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:896:1: ( rule__Program__PriorityAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPriorityAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:897:1: ( rule__Program__PriorityAssignment_3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:897:2: rule__Program__PriorityAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1878);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:907:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:911:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:912:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41908);
            rule__Program__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41911);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:919:1: rule__Program__Group__4__Impl : ( ')' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:923:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:924:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:924:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:925:1: ')'
            {
             before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__4__Impl1939); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:938:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:942:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:943:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__51970);
            rule__Program__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__51973);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:950:1: rule__Program__Group__5__Impl : ( ( rule__Program__Group_5__0 )? ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:954:1: ( ( ( rule__Program__Group_5__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:955:1: ( ( rule__Program__Group_5__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:955:1: ( ( rule__Program__Group_5__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:956:1: ( rule__Program__Group_5__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:957:1: ( rule__Program__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:957:2: rule__Program__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2000);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:967:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:971:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:972:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62031);
            rule__Program__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62034);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:979:1: rule__Program__Group__6__Impl : ( ( rule__Program__Group_6__0 )? ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:983:1: ( ( ( rule__Program__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:984:1: ( ( rule__Program__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:984:1: ( ( rule__Program__Group_6__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:985:1: ( rule__Program__Group_6__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:986:1: ( rule__Program__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:986:2: rule__Program__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2061);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:996:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1000:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1001:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72092);
            rule__Program__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72095);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1008:1: rule__Program__Group__7__Impl : ( ( rule__Program__Group_7__0 )? ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1012:1: ( ( ( rule__Program__Group_7__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1013:1: ( ( rule__Program__Group_7__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1013:1: ( ( rule__Program__Group_7__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1014:1: ( rule__Program__Group_7__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_7()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1015:1: ( rule__Program__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1015:2: rule__Program__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2122);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1025:1: rule__Program__Group__8 : rule__Program__Group__8__Impl ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1029:1: ( rule__Program__Group__8__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1030:2: rule__Program__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82153);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1036:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1040:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1041:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1041:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1042:1: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1042:1: ( ( rule__Program__StatesAssignment_8 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1043:1: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1044:1: ( rule__Program__StatesAssignment_8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1044:2: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2182);
            rule__Program__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1047:1: ( ( rule__Program__StatesAssignment_8 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1048:1: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1049:1: ( rule__Program__StatesAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1049:2: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2194);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1078:1: rule__Program__Group_5__0 : rule__Program__Group_5__0__Impl rule__Program__Group_5__1 ;
    public final void rule__Program__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1082:1: ( rule__Program__Group_5__0__Impl rule__Program__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1083:2: rule__Program__Group_5__0__Impl rule__Program__Group_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02245);
            rule__Program__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02248);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1090:1: rule__Program__Group_5__0__Impl : ( 'Inputs' ) ;
    public final void rule__Program__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1094:1: ( ( 'Inputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1095:1: ( 'Inputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1095:1: ( 'Inputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1096:1: 'Inputs'
            {
             before(grammarAccess.getProgramAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_5__0__Impl2276); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1109:1: rule__Program__Group_5__1 : rule__Program__Group_5__1__Impl rule__Program__Group_5__2 ;
    public final void rule__Program__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1113:1: ( rule__Program__Group_5__1__Impl rule__Program__Group_5__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1114:2: rule__Program__Group_5__1__Impl rule__Program__Group_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12307);
            rule__Program__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12310);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1121:1: rule__Program__Group_5__1__Impl : ( ( rule__Program__SignalsAssignment_5_1 ) ) ;
    public final void rule__Program__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1125:1: ( ( ( rule__Program__SignalsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1126:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1126:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1127:1: ( rule__Program__SignalsAssignment_5_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1128:1: ( rule__Program__SignalsAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1128:2: rule__Program__SignalsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2337);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1138:1: rule__Program__Group_5__2 : rule__Program__Group_5__2__Impl rule__Program__Group_5__3 ;
    public final void rule__Program__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1142:1: ( rule__Program__Group_5__2__Impl rule__Program__Group_5__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1143:2: rule__Program__Group_5__2__Impl rule__Program__Group_5__3
            {
            pushFollow(FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22367);
            rule__Program__Group_5__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22370);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1150:1: rule__Program__Group_5__2__Impl : ( ( rule__Program__Group_5_2__0 )* ) ;
    public final void rule__Program__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1154:1: ( ( ( rule__Program__Group_5_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1155:1: ( ( rule__Program__Group_5_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1155:1: ( ( rule__Program__Group_5_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1156:1: ( rule__Program__Group_5_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_5_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1157:1: ( rule__Program__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1157:2: rule__Program__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2397);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1167:1: rule__Program__Group_5__3 : rule__Program__Group_5__3__Impl ;
    public final void rule__Program__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1171:1: ( rule__Program__Group_5__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1172:2: rule__Program__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32428);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1178:1: rule__Program__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1182:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1183:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1183:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1184:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_5_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_5__3__Impl2456); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1205:1: rule__Program__Group_5_2__0 : rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 ;
    public final void rule__Program__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1209:1: ( rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1210:2: rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02495);
            rule__Program__Group_5_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02498);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1217:1: rule__Program__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1221:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1222:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1222:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1223:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_5_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2526); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1236:1: rule__Program__Group_5_2__1 : rule__Program__Group_5_2__1__Impl ;
    public final void rule__Program__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1240:1: ( rule__Program__Group_5_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1241:2: rule__Program__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12557);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1247:1: rule__Program__Group_5_2__1__Impl : ( ( rule__Program__SignalsAssignment_5_2_1 ) ) ;
    public final void rule__Program__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1251:1: ( ( ( rule__Program__SignalsAssignment_5_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1252:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1252:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1253:1: ( rule__Program__SignalsAssignment_5_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1254:1: ( rule__Program__SignalsAssignment_5_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1254:2: rule__Program__SignalsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2584);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1268:1: rule__Program__Group_6__0 : rule__Program__Group_6__0__Impl rule__Program__Group_6__1 ;
    public final void rule__Program__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1272:1: ( rule__Program__Group_6__0__Impl rule__Program__Group_6__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1273:2: rule__Program__Group_6__0__Impl rule__Program__Group_6__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02618);
            rule__Program__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02621);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1280:1: rule__Program__Group_6__0__Impl : ( 'Outputs' ) ;
    public final void rule__Program__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1284:1: ( ( 'Outputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1285:1: ( 'Outputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1285:1: ( 'Outputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1286:1: 'Outputs'
            {
             before(grammarAccess.getProgramAccess().getOutputsKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group_6__0__Impl2649); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1299:1: rule__Program__Group_6__1 : rule__Program__Group_6__1__Impl rule__Program__Group_6__2 ;
    public final void rule__Program__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1303:1: ( rule__Program__Group_6__1__Impl rule__Program__Group_6__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1304:2: rule__Program__Group_6__1__Impl rule__Program__Group_6__2
            {
            pushFollow(FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12680);
            rule__Program__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12683);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1311:1: rule__Program__Group_6__1__Impl : ( ( rule__Program__SignalsAssignment_6_1 ) ) ;
    public final void rule__Program__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1315:1: ( ( ( rule__Program__SignalsAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1316:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1316:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1317:1: ( rule__Program__SignalsAssignment_6_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1318:1: ( rule__Program__SignalsAssignment_6_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1318:2: rule__Program__SignalsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2710);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1328:1: rule__Program__Group_6__2 : rule__Program__Group_6__2__Impl rule__Program__Group_6__3 ;
    public final void rule__Program__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1332:1: ( rule__Program__Group_6__2__Impl rule__Program__Group_6__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1333:2: rule__Program__Group_6__2__Impl rule__Program__Group_6__3
            {
            pushFollow(FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22740);
            rule__Program__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22743);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1340:1: rule__Program__Group_6__2__Impl : ( ( rule__Program__Group_6_2__0 )* ) ;
    public final void rule__Program__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1344:1: ( ( ( rule__Program__Group_6_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1345:1: ( ( rule__Program__Group_6_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1345:1: ( ( rule__Program__Group_6_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1346:1: ( rule__Program__Group_6_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_6_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1347:1: ( rule__Program__Group_6_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1347:2: rule__Program__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2770);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1357:1: rule__Program__Group_6__3 : rule__Program__Group_6__3__Impl ;
    public final void rule__Program__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1361:1: ( rule__Program__Group_6__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1362:2: rule__Program__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32801);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1368:1: rule__Program__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1372:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1373:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1373:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1374:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_6_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_6__3__Impl2829); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1395:1: rule__Program__Group_6_2__0 : rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 ;
    public final void rule__Program__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1399:1: ( rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1400:2: rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02868);
            rule__Program__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02871);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1407:1: rule__Program__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1411:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1412:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1412:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1413:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_6_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_6_2__0__Impl2899); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1426:1: rule__Program__Group_6_2__1 : rule__Program__Group_6_2__1__Impl ;
    public final void rule__Program__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1430:1: ( rule__Program__Group_6_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1431:2: rule__Program__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__12930);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1437:1: rule__Program__Group_6_2__1__Impl : ( ( rule__Program__SignalsAssignment_6_2_1 ) ) ;
    public final void rule__Program__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1441:1: ( ( ( rule__Program__SignalsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1442:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1442:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1443:1: ( rule__Program__SignalsAssignment_6_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1444:1: ( rule__Program__SignalsAssignment_6_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1444:2: rule__Program__SignalsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl2957);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1458:1: rule__Program__Group_7__0 : rule__Program__Group_7__0__Impl rule__Program__Group_7__1 ;
    public final void rule__Program__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1462:1: ( rule__Program__Group_7__0__Impl rule__Program__Group_7__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1463:2: rule__Program__Group_7__0__Impl rule__Program__Group_7__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__02991);
            rule__Program__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__02994);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1470:1: rule__Program__Group_7__0__Impl : ( 'Signals' ) ;
    public final void rule__Program__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1474:1: ( ( 'Signals' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1475:1: ( 'Signals' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1475:1: ( 'Signals' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1476:1: 'Signals'
            {
             before(grammarAccess.getProgramAccess().getSignalsKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group_7__0__Impl3022); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1489:1: rule__Program__Group_7__1 : rule__Program__Group_7__1__Impl rule__Program__Group_7__2 ;
    public final void rule__Program__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1493:1: ( rule__Program__Group_7__1__Impl rule__Program__Group_7__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1494:2: rule__Program__Group_7__1__Impl rule__Program__Group_7__2
            {
            pushFollow(FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13053);
            rule__Program__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13056);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1501:1: rule__Program__Group_7__1__Impl : ( ( rule__Program__SignalsAssignment_7_1 ) ) ;
    public final void rule__Program__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1505:1: ( ( ( rule__Program__SignalsAssignment_7_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1506:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1506:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1507:1: ( rule__Program__SignalsAssignment_7_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1508:1: ( rule__Program__SignalsAssignment_7_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1508:2: rule__Program__SignalsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3083);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1518:1: rule__Program__Group_7__2 : rule__Program__Group_7__2__Impl rule__Program__Group_7__3 ;
    public final void rule__Program__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1522:1: ( rule__Program__Group_7__2__Impl rule__Program__Group_7__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1523:2: rule__Program__Group_7__2__Impl rule__Program__Group_7__3
            {
            pushFollow(FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23113);
            rule__Program__Group_7__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23116);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1530:1: rule__Program__Group_7__2__Impl : ( ( rule__Program__Group_7_2__0 )* ) ;
    public final void rule__Program__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1534:1: ( ( ( rule__Program__Group_7_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1535:1: ( ( rule__Program__Group_7_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1535:1: ( ( rule__Program__Group_7_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1536:1: ( rule__Program__Group_7_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_7_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1537:1: ( rule__Program__Group_7_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1537:2: rule__Program__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3143);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1547:1: rule__Program__Group_7__3 : rule__Program__Group_7__3__Impl ;
    public final void rule__Program__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1551:1: ( rule__Program__Group_7__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1552:2: rule__Program__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33174);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1558:1: rule__Program__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1562:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1563:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1563:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1564:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_7_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_7__3__Impl3202); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1585:1: rule__Program__Group_7_2__0 : rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 ;
    public final void rule__Program__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1589:1: ( rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1590:2: rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03241);
            rule__Program__Group_7_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03244);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1597:1: rule__Program__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1601:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1602:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1602:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1603:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_7_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3272); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1616:1: rule__Program__Group_7_2__1 : rule__Program__Group_7_2__1__Impl ;
    public final void rule__Program__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1620:1: ( rule__Program__Group_7_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1621:2: rule__Program__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13303);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1627:1: rule__Program__Group_7_2__1__Impl : ( ( rule__Program__SignalsAssignment_7_2_1 ) ) ;
    public final void rule__Program__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1631:1: ( ( ( rule__Program__SignalsAssignment_7_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1632:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1632:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1633:1: ( rule__Program__SignalsAssignment_7_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1634:1: ( rule__Program__SignalsAssignment_7_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1634:2: rule__Program__SignalsAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3330);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1648:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1652:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1653:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03364);
            rule__Annotation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03367);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1660:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1664:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1665:1: ( '@' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1665:1: ( '@' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1666:1: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Annotation__Group__0__Impl3395); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1679:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1683:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1684:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13426);
            rule__Annotation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13429);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1691:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__KeyAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1695:1: ( ( ( rule__Annotation__KeyAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1696:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1696:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1697:1: ( rule__Annotation__KeyAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1698:1: ( rule__Annotation__KeyAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1698:2: rule__Annotation__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_1_in_rule__Annotation__Group__1__Impl3456);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1708:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1712:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1713:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23486);
            rule__Annotation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23489);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1720:1: rule__Annotation__Group__2__Impl : ( ':' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1724:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1725:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1725:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1726:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Annotation__Group__2__Impl3517); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1739:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1743:1: ( rule__Annotation__Group__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1744:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33548);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1750:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__ValueAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1754:1: ( ( ( rule__Annotation__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1755:1: ( ( rule__Annotation__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1755:1: ( ( rule__Annotation__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1756:1: ( rule__Annotation__ValueAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1757:1: ( rule__Annotation__ValueAssignment_3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1757:2: rule__Annotation__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_3_in_rule__Annotation__Group__3__Impl3575);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1775:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1779:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1780:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03613);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03616);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1787:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1791:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1792:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1792:1: ( ( rule__State__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1793:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1794:1: ( rule__State__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1794:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3643);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1804:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1808:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1809:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13673);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13676);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1816:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1820:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1821:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1821:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1822:1: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__State__Group__1__Impl3704); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1835:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1839:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1840:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23735);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23738);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1847:1: rule__State__Group__2__Impl : ( ( rule__State__Group_2__0 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1851:1: ( ( ( rule__State__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1852:1: ( ( rule__State__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1852:1: ( ( rule__State__Group_2__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1853:1: ( rule__State__Group_2__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1854:1: ( rule__State__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1854:2: rule__State__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl3765);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1864:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1868:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1869:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33796);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__33799);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1876:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1880:1: ( ( ( rule__State__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1881:1: ( ( rule__State__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1881:1: ( ( rule__State__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1882:1: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1883:1: ( rule__State__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1883:2: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3826);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1893:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1897:1: ( rule__State__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1898:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43857);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1904:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1908:1: ( ( ( rule__State__Group_4__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1909:1: ( ( rule__State__Group_4__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1909:1: ( ( rule__State__Group_4__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1910:1: ( rule__State__Group_4__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1911:1: ( rule__State__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=30 && LA13_0<=34)||(LA13_0>=37 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1911:2: rule__State__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3884);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1931:1: rule__State__Group_2__0 : rule__State__Group_2__0__Impl rule__State__Group_2__1 ;
    public final void rule__State__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1935:1: ( rule__State__Group_2__0__Impl rule__State__Group_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1936:2: rule__State__Group_2__0__Impl rule__State__Group_2__1
            {
            pushFollow(FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__03925);
            rule__State__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__03928);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1943:1: rule__State__Group_2__0__Impl : ( ( rule__State__AnnotationsAssignment_2_0 ) ) ;
    public final void rule__State__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1947:1: ( ( ( rule__State__AnnotationsAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1948:1: ( ( rule__State__AnnotationsAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1948:1: ( ( rule__State__AnnotationsAssignment_2_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1949:1: ( rule__State__AnnotationsAssignment_2_0 )
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1950:1: ( rule__State__AnnotationsAssignment_2_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1950:2: rule__State__AnnotationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__State__AnnotationsAssignment_2_0_in_rule__State__Group_2__0__Impl3955);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1960:1: rule__State__Group_2__1 : rule__State__Group_2__1__Impl ;
    public final void rule__State__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1964:1: ( rule__State__Group_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1965:2: rule__State__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__13985);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1971:1: rule__State__Group_2__1__Impl : ( ( rule__State__Group_2_1__0 )* ) ;
    public final void rule__State__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1975:1: ( ( ( rule__State__Group_2_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1976:1: ( ( rule__State__Group_2_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1976:1: ( ( rule__State__Group_2_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1977:1: ( rule__State__Group_2_1__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1978:1: ( rule__State__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1978:2: rule__State__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_2_1__0_in_rule__State__Group_2__1__Impl4012);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1992:1: rule__State__Group_2_1__0 : rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 ;
    public final void rule__State__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1996:1: ( rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1997:2: rule__State__Group_2_1__0__Impl rule__State__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04047);
            rule__State__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04050);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2004:1: rule__State__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__State__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2008:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2009:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2009:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2010:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_2_1_0()); 
            match(input,22,FOLLOW_22_in_rule__State__Group_2_1__0__Impl4078); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2023:1: rule__State__Group_2_1__1 : rule__State__Group_2_1__1__Impl ;
    public final void rule__State__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2027:1: ( rule__State__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2028:2: rule__State__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14109);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2034:1: rule__State__Group_2_1__1__Impl : ( ( rule__State__AnnotationsAssignment_2_1_1 ) ) ;
    public final void rule__State__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2038:1: ( ( ( rule__State__AnnotationsAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2039:1: ( ( rule__State__AnnotationsAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2039:1: ( ( rule__State__AnnotationsAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2040:1: ( rule__State__AnnotationsAssignment_2_1_1 )
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2041:1: ( rule__State__AnnotationsAssignment_2_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2041:2: rule__State__AnnotationsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__State__AnnotationsAssignment_2_1_1_in_rule__State__Group_2_1__1__Impl4136);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2055:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2059:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2060:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__04170);
            rule__State__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__04173);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2067:1: rule__State__Group_3__0__Impl : ( 'SIGNALS' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2071:1: ( ( 'SIGNALS' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2072:1: ( 'SIGNALS' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2072:1: ( 'SIGNALS' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2073:1: 'SIGNALS'
            {
             before(grammarAccess.getStateAccess().getSIGNALSKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__State__Group_3__0__Impl4201); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2086:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2090:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2091:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14232);
            rule__State__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__14235);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2098:1: rule__State__Group_3__1__Impl : ( ( rule__State__SignalsAssignment_3_1 )* ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2102:1: ( ( ( rule__State__SignalsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2103:1: ( ( rule__State__SignalsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2103:1: ( ( rule__State__SignalsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2104:1: ( rule__State__SignalsAssignment_3_1 )*
            {
             before(grammarAccess.getStateAccess().getSignalsAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2105:1: ( rule__State__SignalsAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2105:2: rule__State__SignalsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__State__SignalsAssignment_3_1_in_rule__State__Group_3__1__Impl4262);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2115:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2119:1: ( rule__State__Group_3__2__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2120:2: rule__State__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__24293);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2126:1: rule__State__Group_3__2__Impl : ( ';' ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2130:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2131:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2131:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2132:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_3__2__Impl4321); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2151:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2155:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2156:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04358);
            rule__State__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04361);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2163:1: rule__State__Group_4__0__Impl : ( ( rule__State__InstructionsAssignment_4_0 ) ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2167:1: ( ( ( rule__State__InstructionsAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2168:1: ( ( rule__State__InstructionsAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2168:1: ( ( rule__State__InstructionsAssignment_4_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2169:1: ( rule__State__InstructionsAssignment_4_0 )
            {
             before(grammarAccess.getStateAccess().getInstructionsAssignment_4_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2170:1: ( rule__State__InstructionsAssignment_4_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2170:2: rule__State__InstructionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__State__InstructionsAssignment_4_0_in_rule__State__Group_4__0__Impl4388);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2180:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2184:1: ( rule__State__Group_4__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2185:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14418);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2191:1: rule__State__Group_4__1__Impl : ( ';' ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2195:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2196:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2196:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2197:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_4_1()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_4__1__Impl4446); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2214:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2218:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2219:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04481);
            rule__Signal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04484);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2226:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2230:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2231:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2231:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2232:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2233:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2233:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4511);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2243:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2247:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2248:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14541);
            rule__Signal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14544);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2255:1: rule__Signal__Group__1__Impl : ( ':' ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2259:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2260:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2260:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2261:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Signal__Group__1__Impl4572); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2274:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2278:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2279:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24603);
            rule__Signal__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24606);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2286:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__TypeAssignment_2 ) ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2290:1: ( ( ( rule__Signal__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2291:1: ( ( rule__Signal__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2291:1: ( ( rule__Signal__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2292:1: ( rule__Signal__TypeAssignment_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2293:1: ( rule__Signal__TypeAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2293:2: rule__Signal__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4633);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2303:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2307:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2308:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34663);
            rule__Signal__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34666);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2315:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__Group_3__0 )? ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2319:1: ( ( ( rule__Signal__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2320:1: ( ( rule__Signal__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2320:1: ( ( rule__Signal__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2321:1: ( rule__Signal__Group_3__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2322:1: ( rule__Signal__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2322:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4693);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2332:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2336:1: ( rule__Signal__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2337:2: rule__Signal__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44724);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2343:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__Group_4__0 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2347:1: ( ( ( rule__Signal__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2348:1: ( ( rule__Signal__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2348:1: ( ( rule__Signal__Group_4__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2349:1: ( rule__Signal__Group_4__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2350:1: ( rule__Signal__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2350:2: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Group__4__Impl4751);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2370:1: rule__Signal__Group_3__0 : rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2374:1: ( rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2375:2: rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04792);
            rule__Signal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04795);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2382:1: rule__Signal__Group_3__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2386:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2387:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2387:1: ( 'combine' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2388:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Signal__Group_3__0__Impl4823); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2401:1: rule__Signal__Group_3__1 : rule__Signal__Group_3__1__Impl ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2405:1: ( rule__Signal__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2406:2: rule__Signal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14854);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2412:1: rule__Signal__Group_3__1__Impl : ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) ;
    public final void rule__Signal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2416:1: ( ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2417:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2417:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2418:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2419:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2419:2: rule__Signal__CombineFunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4881);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2433:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2437:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2438:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__04915);
            rule__Signal__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04918);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2445:1: rule__Signal__Group_4__0__Impl : ( ( rule__Signal__AnnotationsAssignment_4_0 ) ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2449:1: ( ( ( rule__Signal__AnnotationsAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2450:1: ( ( rule__Signal__AnnotationsAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2450:1: ( ( rule__Signal__AnnotationsAssignment_4_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2451:1: ( rule__Signal__AnnotationsAssignment_4_0 )
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2452:1: ( rule__Signal__AnnotationsAssignment_4_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2452:2: rule__Signal__AnnotationsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_4_0_in_rule__Signal__Group_4__0__Impl4945);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2462:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2466:1: ( rule__Signal__Group_4__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2467:2: rule__Signal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__14975);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2473:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__Group_4_1__0 )* ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2477:1: ( ( ( rule__Signal__Group_4_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2478:1: ( ( rule__Signal__Group_4_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2478:1: ( ( rule__Signal__Group_4_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2479:1: ( rule__Signal__Group_4_1__0 )*
            {
             before(grammarAccess.getSignalAccess().getGroup_4_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2480:1: ( rule__Signal__Group_4_1__0 )*
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
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2480:2: rule__Signal__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl5002);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2494:1: rule__Signal__Group_4_1__0 : rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 ;
    public final void rule__Signal__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2498:1: ( rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2499:2: rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__05037);
            rule__Signal__Group_4_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__05040);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2506:1: rule__Signal__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Signal__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2510:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2511:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2511:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2512:1: ','
            {
             before(grammarAccess.getSignalAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Signal__Group_4_1__0__Impl5068); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2525:1: rule__Signal__Group_4_1__1 : rule__Signal__Group_4_1__1__Impl ;
    public final void rule__Signal__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2529:1: ( rule__Signal__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2530:2: rule__Signal__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__15099);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2536:1: rule__Signal__Group_4_1__1__Impl : ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) ) ;
    public final void rule__Signal__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2540:1: ( ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2541:1: ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2541:1: ( ( rule__Signal__AnnotationsAssignment_4_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2542:1: ( rule__Signal__AnnotationsAssignment_4_1_1 )
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_4_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2543:1: ( rule__Signal__AnnotationsAssignment_4_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2543:2: rule__Signal__AnnotationsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl5126);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2558:1: rule__CustomSignalType__Group__0 : rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1 ;
    public final void rule__CustomSignalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2562:1: ( rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2563:2: rule__CustomSignalType__Group__0__Impl rule__CustomSignalType__Group__1
            {
            pushFollow(FOLLOW_rule__CustomSignalType__Group__0__Impl_in_rule__CustomSignalType__Group__05161);
            rule__CustomSignalType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomSignalType__Group__1_in_rule__CustomSignalType__Group__05164);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2570:1: rule__CustomSignalType__Group__0__Impl : ( 'CUSTOM' ) ;
    public final void rule__CustomSignalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2574:1: ( ( 'CUSTOM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2575:1: ( 'CUSTOM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2575:1: ( 'CUSTOM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2576:1: 'CUSTOM'
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCUSTOMKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomSignalType__Group__0__Impl5192); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2589:1: rule__CustomSignalType__Group__1 : rule__CustomSignalType__Group__1__Impl ;
    public final void rule__CustomSignalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2593:1: ( rule__CustomSignalType__Group__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2594:2: rule__CustomSignalType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomSignalType__Group__1__Impl_in_rule__CustomSignalType__Group__15223);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2600:1: rule__CustomSignalType__Group__1__Impl : ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) ) ;
    public final void rule__CustomSignalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2604:1: ( ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2605:1: ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2605:1: ( ( rule__CustomSignalType__CustomTypeAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2606:1: ( rule__CustomSignalType__CustomTypeAssignment_1 )
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCustomTypeAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2607:1: ( rule__CustomSignalType__CustomTypeAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2607:2: rule__CustomSignalType__CustomTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomSignalType__CustomTypeAssignment_1_in_rule__CustomSignalType__Group__1__Impl5250);
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


    // $ANTLR start rule__Instruction__Group_10__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2621:1: rule__Instruction__Group_10__0 : rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 ;
    public final void rule__Instruction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2625:1: ( rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2626:2: rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10__0__Impl_in_rule__Instruction__Group_10__05284);
            rule__Instruction__Group_10__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_10__1_in_rule__Instruction__Group_10__05287);
            rule__Instruction__Group_10__1();
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
    // $ANTLR end rule__Instruction__Group_10__0


    // $ANTLR start rule__Instruction__Group_10__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2633:1: rule__Instruction__Group_10__0__Impl : ( rulePrio ) ;
    public final void rule__Instruction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2637:1: ( ( rulePrio ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2638:1: ( rulePrio )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2638:1: ( rulePrio )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2639:1: rulePrio
            {
             before(grammarAccess.getInstructionAccess().getPrioParserRuleCall_10_0()); 
            pushFollow(FOLLOW_rulePrio_in_rule__Instruction__Group_10__0__Impl5314);
            rulePrio();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getPrioParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10__0__Impl


    // $ANTLR start rule__Instruction__Group_10__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2650:1: rule__Instruction__Group_10__1 : rule__Instruction__Group_10__1__Impl ;
    public final void rule__Instruction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2654:1: ( rule__Instruction__Group_10__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2655:2: rule__Instruction__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10__1__Impl_in_rule__Instruction__Group_10__15343);
            rule__Instruction__Group_10__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_10__1


    // $ANTLR start rule__Instruction__Group_10__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2661:1: rule__Instruction__Group_10__1__Impl : ( ( rule__Instruction__Group_10_1__0 )? ) ;
    public final void rule__Instruction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2665:1: ( ( ( rule__Instruction__Group_10_1__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2666:1: ( ( rule__Instruction__Group_10_1__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2666:1: ( ( rule__Instruction__Group_10_1__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2667:1: ( rule__Instruction__Group_10_1__0 )?
            {
             before(grammarAccess.getInstructionAccess().getGroup_10_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2668:1: ( rule__Instruction__Group_10_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2668:2: rule__Instruction__Group_10_1__0
                    {
                    pushFollow(FOLLOW_rule__Instruction__Group_10_1__0_in_rule__Instruction__Group_10__1__Impl5370);
                    rule__Instruction__Group_10_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstructionAccess().getGroup_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10__1__Impl


    // $ANTLR start rule__Instruction__Group_10_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2682:1: rule__Instruction__Group_10_1__0 : rule__Instruction__Group_10_1__0__Impl rule__Instruction__Group_10_1__1 ;
    public final void rule__Instruction__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2686:1: ( rule__Instruction__Group_10_1__0__Impl rule__Instruction__Group_10_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2687:2: rule__Instruction__Group_10_1__0__Impl rule__Instruction__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10_1__0__Impl_in_rule__Instruction__Group_10_1__05405);
            rule__Instruction__Group_10_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_10_1__1_in_rule__Instruction__Group_10_1__05408);
            rule__Instruction__Group_10_1__1();
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
    // $ANTLR end rule__Instruction__Group_10_1__0


    // $ANTLR start rule__Instruction__Group_10_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2694:1: rule__Instruction__Group_10_1__0__Impl : ( ( rule__Instruction__AnnotationsAssignment_10_1_0 ) ) ;
    public final void rule__Instruction__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2698:1: ( ( ( rule__Instruction__AnnotationsAssignment_10_1_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2699:1: ( ( rule__Instruction__AnnotationsAssignment_10_1_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2699:1: ( ( rule__Instruction__AnnotationsAssignment_10_1_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2700:1: ( rule__Instruction__AnnotationsAssignment_10_1_0 )
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAssignment_10_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2701:1: ( rule__Instruction__AnnotationsAssignment_10_1_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2701:2: rule__Instruction__AnnotationsAssignment_10_1_0
            {
            pushFollow(FOLLOW_rule__Instruction__AnnotationsAssignment_10_1_0_in_rule__Instruction__Group_10_1__0__Impl5435);
            rule__Instruction__AnnotationsAssignment_10_1_0();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAnnotationsAssignment_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10_1__0__Impl


    // $ANTLR start rule__Instruction__Group_10_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2711:1: rule__Instruction__Group_10_1__1 : rule__Instruction__Group_10_1__1__Impl ;
    public final void rule__Instruction__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2715:1: ( rule__Instruction__Group_10_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2716:2: rule__Instruction__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10_1__1__Impl_in_rule__Instruction__Group_10_1__15465);
            rule__Instruction__Group_10_1__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_10_1__1


    // $ANTLR start rule__Instruction__Group_10_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2722:1: rule__Instruction__Group_10_1__1__Impl : ( ( rule__Instruction__Group_10_1_1__0 )* ) ;
    public final void rule__Instruction__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2726:1: ( ( ( rule__Instruction__Group_10_1_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2727:1: ( ( rule__Instruction__Group_10_1_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2727:1: ( ( rule__Instruction__Group_10_1_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2728:1: ( rule__Instruction__Group_10_1_1__0 )*
            {
             before(grammarAccess.getInstructionAccess().getGroup_10_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2729:1: ( rule__Instruction__Group_10_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2729:2: rule__Instruction__Group_10_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Instruction__Group_10_1_1__0_in_rule__Instruction__Group_10_1__1__Impl5492);
            	    rule__Instruction__Group_10_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getInstructionAccess().getGroup_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10_1__1__Impl


    // $ANTLR start rule__Instruction__Group_10_1_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2743:1: rule__Instruction__Group_10_1_1__0 : rule__Instruction__Group_10_1_1__0__Impl rule__Instruction__Group_10_1_1__1 ;
    public final void rule__Instruction__Group_10_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2747:1: ( rule__Instruction__Group_10_1_1__0__Impl rule__Instruction__Group_10_1_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2748:2: rule__Instruction__Group_10_1_1__0__Impl rule__Instruction__Group_10_1_1__1
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10_1_1__0__Impl_in_rule__Instruction__Group_10_1_1__05527);
            rule__Instruction__Group_10_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Instruction__Group_10_1_1__1_in_rule__Instruction__Group_10_1_1__05530);
            rule__Instruction__Group_10_1_1__1();
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
    // $ANTLR end rule__Instruction__Group_10_1_1__0


    // $ANTLR start rule__Instruction__Group_10_1_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2755:1: rule__Instruction__Group_10_1_1__0__Impl : ( ',' ) ;
    public final void rule__Instruction__Group_10_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2759:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2760:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2760:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2761:1: ','
            {
             before(grammarAccess.getInstructionAccess().getCommaKeyword_10_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Instruction__Group_10_1_1__0__Impl5558); 
             after(grammarAccess.getInstructionAccess().getCommaKeyword_10_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10_1_1__0__Impl


    // $ANTLR start rule__Instruction__Group_10_1_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2774:1: rule__Instruction__Group_10_1_1__1 : rule__Instruction__Group_10_1_1__1__Impl ;
    public final void rule__Instruction__Group_10_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2778:1: ( rule__Instruction__Group_10_1_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2779:2: rule__Instruction__Group_10_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instruction__Group_10_1_1__1__Impl_in_rule__Instruction__Group_10_1_1__15589);
            rule__Instruction__Group_10_1_1__1__Impl();
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
    // $ANTLR end rule__Instruction__Group_10_1_1__1


    // $ANTLR start rule__Instruction__Group_10_1_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2785:1: rule__Instruction__Group_10_1_1__1__Impl : ( ( rule__Instruction__AnnotationsAssignment_10_1_1_1 ) ) ;
    public final void rule__Instruction__Group_10_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2789:1: ( ( ( rule__Instruction__AnnotationsAssignment_10_1_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2790:1: ( ( rule__Instruction__AnnotationsAssignment_10_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2790:1: ( ( rule__Instruction__AnnotationsAssignment_10_1_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2791:1: ( rule__Instruction__AnnotationsAssignment_10_1_1_1 )
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAssignment_10_1_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2792:1: ( rule__Instruction__AnnotationsAssignment_10_1_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2792:2: rule__Instruction__AnnotationsAssignment_10_1_1_1
            {
            pushFollow(FOLLOW_rule__Instruction__AnnotationsAssignment_10_1_1_1_in_rule__Instruction__Group_10_1_1__1__Impl5616);
            rule__Instruction__AnnotationsAssignment_10_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAnnotationsAssignment_10_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__Group_10_1_1__1__Impl


    // $ANTLR start rule__Pause__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2806:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2810:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2811:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05650);
            rule__Pause__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05653);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2818:1: rule__Pause__Group__0__Impl : ( () ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2822:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2823:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2823:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2824:1: ()
            {
             before(grammarAccess.getPauseAccess().getPauseAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2825:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2827:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2837:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2841:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2842:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
            {
            pushFollow(FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15711);
            rule__Pause__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15714);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2849:1: rule__Pause__Group__1__Impl : ( 'PAUSE' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2853:1: ( ( 'PAUSE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2854:1: ( 'PAUSE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2854:1: ( 'PAUSE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2855:1: 'PAUSE'
            {
             before(grammarAccess.getPauseAccess().getPAUSEKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Pause__Group__1__Impl5742); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2868:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2872:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2873:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
            {
            pushFollow(FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25773);
            rule__Pause__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25776);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2880:1: rule__Pause__Group__2__Impl : ( '(' ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2884:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2885:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2885:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2886:1: '('
            {
             before(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Pause__Group__2__Impl5804); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2899:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl rule__Pause__Group__4 ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2903:1: ( rule__Pause__Group__3__Impl rule__Pause__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2904:2: rule__Pause__Group__3__Impl rule__Pause__Group__4
            {
            pushFollow(FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35835);
            rule__Pause__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35838);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2911:1: rule__Pause__Group__3__Impl : ( ( rule__Pause__ContinuationAssignment_3 )? ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2915:1: ( ( ( rule__Pause__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2916:1: ( ( rule__Pause__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2916:1: ( ( rule__Pause__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2917:1: ( rule__Pause__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getPauseAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2918:1: ( rule__Pause__ContinuationAssignment_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2918:2: rule__Pause__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Pause__ContinuationAssignment_3_in_rule__Pause__Group__3__Impl5865);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2928:1: rule__Pause__Group__4 : rule__Pause__Group__4__Impl ;
    public final void rule__Pause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2932:1: ( rule__Pause__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2933:2: rule__Pause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45896);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2939:1: rule__Pause__Group__4__Impl : ( ')' ) ;
    public final void rule__Pause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2943:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2944:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2944:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2945:1: ')'
            {
             before(grammarAccess.getPauseAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Pause__Group__4__Impl5924); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2968:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2972:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2973:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05965);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05968);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2980:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2984:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2985:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2985:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2986:1: ()
            {
             before(grammarAccess.getTermAccess().getTermAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2987:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2989:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2999:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3003:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3004:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16026);
            rule__Term__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__2_in_rule__Term__Group__16029);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3011:1: rule__Term__Group__1__Impl : ( 'TERM' ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3015:1: ( ( 'TERM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3016:1: ( 'TERM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3016:1: ( 'TERM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3017:1: 'TERM'
            {
             before(grammarAccess.getTermAccess().getTERMKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Term__Group__1__Impl6057); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3030:1: rule__Term__Group__2 : rule__Term__Group__2__Impl rule__Term__Group__3 ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3034:1: ( rule__Term__Group__2__Impl rule__Term__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3035:2: rule__Term__Group__2__Impl rule__Term__Group__3
            {
            pushFollow(FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__26088);
            rule__Term__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__3_in_rule__Term__Group__26091);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3042:1: rule__Term__Group__2__Impl : ( '(' ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3046:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3047:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3047:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3048:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Term__Group__2__Impl6119); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3061:1: rule__Term__Group__3 : rule__Term__Group__3__Impl rule__Term__Group__4 ;
    public final void rule__Term__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3065:1: ( rule__Term__Group__3__Impl rule__Term__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3066:2: rule__Term__Group__3__Impl rule__Term__Group__4
            {
            pushFollow(FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__36150);
            rule__Term__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__4_in_rule__Term__Group__36153);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3073:1: rule__Term__Group__3__Impl : ( ( rule__Term__ContinuationAssignment_3 )? ) ;
    public final void rule__Term__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3077:1: ( ( ( rule__Term__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3078:1: ( ( rule__Term__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3078:1: ( ( rule__Term__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3079:1: ( rule__Term__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getTermAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3080:1: ( rule__Term__ContinuationAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3080:2: rule__Term__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Term__ContinuationAssignment_3_in_rule__Term__Group__3__Impl6180);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3090:1: rule__Term__Group__4 : rule__Term__Group__4__Impl ;
    public final void rule__Term__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3094:1: ( rule__Term__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3095:2: rule__Term__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__46211);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3101:1: rule__Term__Group__4__Impl : ( ')' ) ;
    public final void rule__Term__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3105:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3106:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3106:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3107:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group__4__Impl6239); 
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


    // $ANTLR start rule__Join__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3130:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3134:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3135:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06280);
            rule__Join__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06283);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3142:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3146:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3147:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3147:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3148:1: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3149:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3151:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3161:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3165:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3166:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16341);
            rule__Join__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16344);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3173:1: rule__Join__Group__1__Impl : ( 'JOIN' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3177:1: ( ( 'JOIN' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3178:1: ( 'JOIN' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3178:1: ( 'JOIN' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3179:1: 'JOIN'
            {
             before(grammarAccess.getJoinAccess().getJOINKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Join__Group__1__Impl6372); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3192:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3196:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3197:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26403);
            rule__Join__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26406);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3204:1: rule__Join__Group__2__Impl : ( '(' ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3208:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3209:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3209:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3210:1: '('
            {
             before(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Join__Group__2__Impl6434); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3223:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3227:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3228:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36465);
            rule__Join__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36468);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3235:1: rule__Join__Group__3__Impl : ( ( rule__Join__ContinuationAssignment_3 )? ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3239:1: ( ( ( rule__Join__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3240:1: ( ( rule__Join__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3240:1: ( ( rule__Join__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3241:1: ( rule__Join__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getJoinAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3242:1: ( rule__Join__ContinuationAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3242:2: rule__Join__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Join__ContinuationAssignment_3_in_rule__Join__Group__3__Impl6495);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3252:1: rule__Join__Group__4 : rule__Join__Group__4__Impl ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3256:1: ( rule__Join__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3257:2: rule__Join__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46526);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3263:1: rule__Join__Group__4__Impl : ( ')' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3267:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3268:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3268:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3269:1: ')'
            {
             before(grammarAccess.getJoinAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Join__Group__4__Impl6554); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3292:1: rule__Abort__Group__0 : rule__Abort__Group__0__Impl rule__Abort__Group__1 ;
    public final void rule__Abort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3296:1: ( rule__Abort__Group__0__Impl rule__Abort__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3297:2: rule__Abort__Group__0__Impl rule__Abort__Group__1
            {
            pushFollow(FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06595);
            rule__Abort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06598);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3304:1: rule__Abort__Group__0__Impl : ( () ) ;
    public final void rule__Abort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3308:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3309:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3309:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3310:1: ()
            {
             before(grammarAccess.getAbortAccess().getAbortAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3311:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3313:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3323:1: rule__Abort__Group__1 : rule__Abort__Group__1__Impl rule__Abort__Group__2 ;
    public final void rule__Abort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3327:1: ( rule__Abort__Group__1__Impl rule__Abort__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3328:2: rule__Abort__Group__1__Impl rule__Abort__Group__2
            {
            pushFollow(FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__16656);
            rule__Abort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__16659);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3335:1: rule__Abort__Group__1__Impl : ( 'ABORT' ) ;
    public final void rule__Abort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3339:1: ( ( 'ABORT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3340:1: ( 'ABORT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3340:1: ( 'ABORT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3341:1: 'ABORT'
            {
             before(grammarAccess.getAbortAccess().getABORTKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Abort__Group__1__Impl6687); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3354:1: rule__Abort__Group__2 : rule__Abort__Group__2__Impl rule__Abort__Group__3 ;
    public final void rule__Abort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3358:1: ( rule__Abort__Group__2__Impl rule__Abort__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3359:2: rule__Abort__Group__2__Impl rule__Abort__Group__3
            {
            pushFollow(FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__26718);
            rule__Abort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__26721);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3366:1: rule__Abort__Group__2__Impl : ( '(' ) ;
    public final void rule__Abort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3370:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3371:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3371:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3372:1: '('
            {
             before(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Abort__Group__2__Impl6749); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3385:1: rule__Abort__Group__3 : rule__Abort__Group__3__Impl rule__Abort__Group__4 ;
    public final void rule__Abort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3389:1: ( rule__Abort__Group__3__Impl rule__Abort__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3390:2: rule__Abort__Group__3__Impl rule__Abort__Group__4
            {
            pushFollow(FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__36780);
            rule__Abort__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__36783);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3397:1: rule__Abort__Group__3__Impl : ( ( rule__Abort__ContinuationAssignment_3 )? ) ;
    public final void rule__Abort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3401:1: ( ( ( rule__Abort__ContinuationAssignment_3 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3402:1: ( ( rule__Abort__ContinuationAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3402:1: ( ( rule__Abort__ContinuationAssignment_3 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3403:1: ( rule__Abort__ContinuationAssignment_3 )?
            {
             before(grammarAccess.getAbortAccess().getContinuationAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3404:1: ( rule__Abort__ContinuationAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3404:2: rule__Abort__ContinuationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Abort__ContinuationAssignment_3_in_rule__Abort__Group__3__Impl6810);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3414:1: rule__Abort__Group__4 : rule__Abort__Group__4__Impl ;
    public final void rule__Abort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3418:1: ( rule__Abort__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3419:2: rule__Abort__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__46841);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3425:1: rule__Abort__Group__4__Impl : ( ')' ) ;
    public final void rule__Abort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3429:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3430:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3430:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3431:1: ')'
            {
             before(grammarAccess.getAbortAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Abort__Group__4__Impl6869); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3454:1: rule__Present__Group__0 : rule__Present__Group__0__Impl rule__Present__Group__1 ;
    public final void rule__Present__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3458:1: ( rule__Present__Group__0__Impl rule__Present__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3459:2: rule__Present__Group__0__Impl rule__Present__Group__1
            {
            pushFollow(FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__06910);
            rule__Present__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__1_in_rule__Present__Group__06913);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3466:1: rule__Present__Group__0__Impl : ( 'PRESENT' ) ;
    public final void rule__Present__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3470:1: ( ( 'PRESENT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3471:1: ( 'PRESENT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3471:1: ( 'PRESENT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3472:1: 'PRESENT'
            {
             before(grammarAccess.getPresentAccess().getPRESENTKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Present__Group__0__Impl6941); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3485:1: rule__Present__Group__1 : rule__Present__Group__1__Impl rule__Present__Group__2 ;
    public final void rule__Present__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3489:1: ( rule__Present__Group__1__Impl rule__Present__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3490:2: rule__Present__Group__1__Impl rule__Present__Group__2
            {
            pushFollow(FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__16972);
            rule__Present__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__2_in_rule__Present__Group__16975);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3497:1: rule__Present__Group__1__Impl : ( '(' ) ;
    public final void rule__Present__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3501:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3502:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3502:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3503:1: '('
            {
             before(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Present__Group__1__Impl7003); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3516:1: rule__Present__Group__2 : rule__Present__Group__2__Impl rule__Present__Group__3 ;
    public final void rule__Present__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3520:1: ( rule__Present__Group__2__Impl rule__Present__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3521:2: rule__Present__Group__2__Impl rule__Present__Group__3
            {
            pushFollow(FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27034);
            rule__Present__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27037);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3528:1: rule__Present__Group__2__Impl : ( ( rule__Present__SignalAssignment_2 ) ) ;
    public final void rule__Present__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3532:1: ( ( ( rule__Present__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3533:1: ( ( rule__Present__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3533:1: ( ( rule__Present__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3534:1: ( rule__Present__SignalAssignment_2 )
            {
             before(grammarAccess.getPresentAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3535:1: ( rule__Present__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3535:2: rule__Present__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Present__SignalAssignment_2_in_rule__Present__Group__2__Impl7064);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3545:1: rule__Present__Group__3 : rule__Present__Group__3__Impl rule__Present__Group__4 ;
    public final void rule__Present__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3549:1: ( rule__Present__Group__3__Impl rule__Present__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3550:2: rule__Present__Group__3__Impl rule__Present__Group__4
            {
            pushFollow(FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37094);
            rule__Present__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37097);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3557:1: rule__Present__Group__3__Impl : ( ( rule__Present__Group_3__0 )? ) ;
    public final void rule__Present__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3561:1: ( ( ( rule__Present__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3562:1: ( ( rule__Present__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3562:1: ( ( rule__Present__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3563:1: ( rule__Present__Group_3__0 )?
            {
             before(grammarAccess.getPresentAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3564:1: ( rule__Present__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3564:2: rule__Present__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Present__Group_3__0_in_rule__Present__Group__3__Impl7124);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3574:1: rule__Present__Group__4 : rule__Present__Group__4__Impl rule__Present__Group__5 ;
    public final void rule__Present__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3578:1: ( rule__Present__Group__4__Impl rule__Present__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3579:2: rule__Present__Group__4__Impl rule__Present__Group__5
            {
            pushFollow(FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47155);
            rule__Present__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47158);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3586:1: rule__Present__Group__4__Impl : ( ')' ) ;
    public final void rule__Present__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3590:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3591:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3591:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3592:1: ')'
            {
             before(grammarAccess.getPresentAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Present__Group__4__Impl7186); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3605:1: rule__Present__Group__5 : rule__Present__Group__5__Impl rule__Present__Group__6 ;
    public final void rule__Present__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3609:1: ( rule__Present__Group__5__Impl rule__Present__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3610:2: rule__Present__Group__5__Impl rule__Present__Group__6
            {
            pushFollow(FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57217);
            rule__Present__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57220);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3617:1: rule__Present__Group__5__Impl : ( '{' ) ;
    public final void rule__Present__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3621:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3622:1: ( '{' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3622:1: ( '{' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3623:1: '{'
            {
             before(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Present__Group__5__Impl7248); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3636:1: rule__Present__Group__6 : rule__Present__Group__6__Impl rule__Present__Group__7 ;
    public final void rule__Present__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3640:1: ( rule__Present__Group__6__Impl rule__Present__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3641:2: rule__Present__Group__6__Impl rule__Present__Group__7
            {
            pushFollow(FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67279);
            rule__Present__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67282);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3648:1: rule__Present__Group__6__Impl : ( ( rule__Present__Group_6__0 )* ) ;
    public final void rule__Present__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3652:1: ( ( ( rule__Present__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3653:1: ( ( rule__Present__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3653:1: ( ( rule__Present__Group_6__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3654:1: ( rule__Present__Group_6__0 )*
            {
             before(grammarAccess.getPresentAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3655:1: ( rule__Present__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=30 && LA26_0<=34)||(LA26_0>=37 && LA26_0<=42)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3655:2: rule__Present__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Present__Group_6__0_in_rule__Present__Group__6__Impl7309);
            	    rule__Present__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3665:1: rule__Present__Group__7 : rule__Present__Group__7__Impl ;
    public final void rule__Present__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3669:1: ( rule__Present__Group__7__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3670:2: rule__Present__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77340);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3676:1: rule__Present__Group__7__Impl : ( '}' ) ;
    public final void rule__Present__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3680:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3681:1: ( '}' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3681:1: ( '}' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3682:1: '}'
            {
             before(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__Present__Group__7__Impl7368); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3711:1: rule__Present__Group_3__0 : rule__Present__Group_3__0__Impl rule__Present__Group_3__1 ;
    public final void rule__Present__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3715:1: ( rule__Present__Group_3__0__Impl rule__Present__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3716:2: rule__Present__Group_3__0__Impl rule__Present__Group_3__1
            {
            pushFollow(FOLLOW_rule__Present__Group_3__0__Impl_in_rule__Present__Group_3__07415);
            rule__Present__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_3__1_in_rule__Present__Group_3__07418);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3723:1: rule__Present__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Present__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3727:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3728:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3728:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3729:1: ','
            {
             before(grammarAccess.getPresentAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Present__Group_3__0__Impl7446); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3742:1: rule__Present__Group_3__1 : rule__Present__Group_3__1__Impl ;
    public final void rule__Present__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3746:1: ( rule__Present__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3747:2: rule__Present__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_3__1__Impl_in_rule__Present__Group_3__17477);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3753:1: rule__Present__Group_3__1__Impl : ( ( rule__Present__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Present__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3757:1: ( ( ( rule__Present__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3758:1: ( ( rule__Present__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3758:1: ( ( rule__Present__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3759:1: ( rule__Present__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getPresentAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3760:1: ( rule__Present__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3760:2: rule__Present__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Present__ContinuationAssignment_3_1_in_rule__Present__Group_3__1__Impl7504);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3774:1: rule__Present__Group_6__0 : rule__Present__Group_6__0__Impl rule__Present__Group_6__1 ;
    public final void rule__Present__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3778:1: ( rule__Present__Group_6__0__Impl rule__Present__Group_6__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3779:2: rule__Present__Group_6__0__Impl rule__Present__Group_6__1
            {
            pushFollow(FOLLOW_rule__Present__Group_6__0__Impl_in_rule__Present__Group_6__07538);
            rule__Present__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_6__1_in_rule__Present__Group_6__07541);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3786:1: rule__Present__Group_6__0__Impl : ( ( rule__Present__InstructionsAssignment_6_0 ) ) ;
    public final void rule__Present__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3790:1: ( ( ( rule__Present__InstructionsAssignment_6_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3791:1: ( ( rule__Present__InstructionsAssignment_6_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3791:1: ( ( rule__Present__InstructionsAssignment_6_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3792:1: ( rule__Present__InstructionsAssignment_6_0 )
            {
             before(grammarAccess.getPresentAccess().getInstructionsAssignment_6_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3793:1: ( rule__Present__InstructionsAssignment_6_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3793:2: rule__Present__InstructionsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Present__InstructionsAssignment_6_0_in_rule__Present__Group_6__0__Impl7568);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3803:1: rule__Present__Group_6__1 : rule__Present__Group_6__1__Impl ;
    public final void rule__Present__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3807:1: ( rule__Present__Group_6__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3808:2: rule__Present__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_6__1__Impl_in_rule__Present__Group_6__17598);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3814:1: rule__Present__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Present__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3818:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3819:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3819:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3820:1: ';'
            {
             before(grammarAccess.getPresentAccess().getSemicolonKeyword_6_1()); 
            match(input,21,FOLLOW_21_in_rule__Present__Group_6__1__Impl7626); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3837:1: rule__Goto__Group__0 : rule__Goto__Group__0__Impl rule__Goto__Group__1 ;
    public final void rule__Goto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3841:1: ( rule__Goto__Group__0__Impl rule__Goto__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3842:2: rule__Goto__Group__0__Impl rule__Goto__Group__1
            {
            pushFollow(FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__07661);
            rule__Goto__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__07664);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3849:1: rule__Goto__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__Goto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3853:1: ( ( 'GOTO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3854:1: ( 'GOTO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3854:1: ( 'GOTO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3855:1: 'GOTO'
            {
             before(grammarAccess.getGotoAccess().getGOTOKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Goto__Group__0__Impl7692); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3868:1: rule__Goto__Group__1 : rule__Goto__Group__1__Impl rule__Goto__Group__2 ;
    public final void rule__Goto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3872:1: ( rule__Goto__Group__1__Impl rule__Goto__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3873:2: rule__Goto__Group__1__Impl rule__Goto__Group__2
            {
            pushFollow(FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__17723);
            rule__Goto__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__17726);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3880:1: rule__Goto__Group__1__Impl : ( '(' ) ;
    public final void rule__Goto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3884:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3885:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3885:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3886:1: '('
            {
             before(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Goto__Group__1__Impl7754); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3899:1: rule__Goto__Group__2 : rule__Goto__Group__2__Impl rule__Goto__Group__3 ;
    public final void rule__Goto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3903:1: ( rule__Goto__Group__2__Impl rule__Goto__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3904:2: rule__Goto__Group__2__Impl rule__Goto__Group__3
            {
            pushFollow(FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__27785);
            rule__Goto__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__27788);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3911:1: rule__Goto__Group__2__Impl : ( ( rule__Goto__StateAssignment_2 ) ) ;
    public final void rule__Goto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3915:1: ( ( ( rule__Goto__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3916:1: ( ( rule__Goto__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3916:1: ( ( rule__Goto__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3917:1: ( rule__Goto__StateAssignment_2 )
            {
             before(grammarAccess.getGotoAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3918:1: ( rule__Goto__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3918:2: rule__Goto__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Goto__StateAssignment_2_in_rule__Goto__Group__2__Impl7815);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3928:1: rule__Goto__Group__3 : rule__Goto__Group__3__Impl rule__Goto__Group__4 ;
    public final void rule__Goto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3932:1: ( rule__Goto__Group__3__Impl rule__Goto__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3933:2: rule__Goto__Group__3__Impl rule__Goto__Group__4
            {
            pushFollow(FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__37845);
            rule__Goto__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__37848);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3940:1: rule__Goto__Group__3__Impl : ( ( rule__Goto__Group_3__0 )? ) ;
    public final void rule__Goto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3944:1: ( ( ( rule__Goto__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3945:1: ( ( rule__Goto__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3945:1: ( ( rule__Goto__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3946:1: ( rule__Goto__Group_3__0 )?
            {
             before(grammarAccess.getGotoAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3947:1: ( rule__Goto__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3947:2: rule__Goto__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Goto__Group_3__0_in_rule__Goto__Group__3__Impl7875);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3957:1: rule__Goto__Group__4 : rule__Goto__Group__4__Impl ;
    public final void rule__Goto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3961:1: ( rule__Goto__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3962:2: rule__Goto__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__47906);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3968:1: rule__Goto__Group__4__Impl : ( ')' ) ;
    public final void rule__Goto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3972:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3973:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3973:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3974:1: ')'
            {
             before(grammarAccess.getGotoAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Goto__Group__4__Impl7934); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3997:1: rule__Goto__Group_3__0 : rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1 ;
    public final void rule__Goto__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4001:1: ( rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4002:2: rule__Goto__Group_3__0__Impl rule__Goto__Group_3__1
            {
            pushFollow(FOLLOW_rule__Goto__Group_3__0__Impl_in_rule__Goto__Group_3__07975);
            rule__Goto__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group_3__1_in_rule__Goto__Group_3__07978);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4009:1: rule__Goto__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Goto__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4013:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4014:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4014:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4015:1: ','
            {
             before(grammarAccess.getGotoAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Goto__Group_3__0__Impl8006); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4028:1: rule__Goto__Group_3__1 : rule__Goto__Group_3__1__Impl ;
    public final void rule__Goto__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4032:1: ( rule__Goto__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4033:2: rule__Goto__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group_3__1__Impl_in_rule__Goto__Group_3__18037);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4039:1: rule__Goto__Group_3__1__Impl : ( ( rule__Goto__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Goto__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4043:1: ( ( ( rule__Goto__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4044:1: ( ( rule__Goto__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4044:1: ( ( rule__Goto__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4045:1: ( rule__Goto__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getGotoAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4046:1: ( rule__Goto__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4046:2: rule__Goto__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Goto__ContinuationAssignment_3_1_in_rule__Goto__Group_3__1__Impl8064);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4060:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4064:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4065:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08098);
            rule__Fork__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08101);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4072:1: rule__Fork__Group__0__Impl : ( 'FORK' ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4076:1: ( ( 'FORK' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4077:1: ( 'FORK' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4077:1: ( 'FORK' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4078:1: 'FORK'
            {
             before(grammarAccess.getForkAccess().getFORKKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Fork__Group__0__Impl8129); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4091:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4095:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4096:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18160);
            rule__Fork__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18163);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4103:1: rule__Fork__Group__1__Impl : ( '(' ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4107:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4108:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4108:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4109:1: '('
            {
             before(grammarAccess.getForkAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Fork__Group__1__Impl8191); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4122:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4126:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4127:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28222);
            rule__Fork__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28225);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4134:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__StateAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4138:1: ( ( ( rule__Fork__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4139:1: ( ( rule__Fork__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4139:1: ( ( rule__Fork__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4140:1: ( rule__Fork__StateAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4141:1: ( rule__Fork__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4141:2: rule__Fork__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Fork__StateAssignment_2_in_rule__Fork__Group__2__Impl8252);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4151:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl rule__Fork__Group__4 ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4155:1: ( rule__Fork__Group__3__Impl rule__Fork__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4156:2: rule__Fork__Group__3__Impl rule__Fork__Group__4
            {
            pushFollow(FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38282);
            rule__Fork__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38285);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4163:1: rule__Fork__Group__3__Impl : ( ',' ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4167:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4168:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4168:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4169:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group__3__Impl8313); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4182:1: rule__Fork__Group__4 : rule__Fork__Group__4__Impl rule__Fork__Group__5 ;
    public final void rule__Fork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4186:1: ( rule__Fork__Group__4__Impl rule__Fork__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4187:2: rule__Fork__Group__4__Impl rule__Fork__Group__5
            {
            pushFollow(FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48344);
            rule__Fork__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48347);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4194:1: rule__Fork__Group__4__Impl : ( ( rule__Fork__PriorityAssignment_4 ) ) ;
    public final void rule__Fork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4198:1: ( ( ( rule__Fork__PriorityAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4199:1: ( ( rule__Fork__PriorityAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4199:1: ( ( rule__Fork__PriorityAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4200:1: ( rule__Fork__PriorityAssignment_4 )
            {
             before(grammarAccess.getForkAccess().getPriorityAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4201:1: ( rule__Fork__PriorityAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4201:2: rule__Fork__PriorityAssignment_4
            {
            pushFollow(FOLLOW_rule__Fork__PriorityAssignment_4_in_rule__Fork__Group__4__Impl8374);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4211:1: rule__Fork__Group__5 : rule__Fork__Group__5__Impl rule__Fork__Group__6 ;
    public final void rule__Fork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4215:1: ( rule__Fork__Group__5__Impl rule__Fork__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4216:2: rule__Fork__Group__5__Impl rule__Fork__Group__6
            {
            pushFollow(FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58404);
            rule__Fork__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58407);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4223:1: rule__Fork__Group__5__Impl : ( ( rule__Fork__Group_5__0 )? ) ;
    public final void rule__Fork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4227:1: ( ( ( rule__Fork__Group_5__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4228:1: ( ( rule__Fork__Group_5__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4228:1: ( ( rule__Fork__Group_5__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4229:1: ( rule__Fork__Group_5__0 )?
            {
             before(grammarAccess.getForkAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4230:1: ( rule__Fork__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4230:2: rule__Fork__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Fork__Group_5__0_in_rule__Fork__Group__5__Impl8434);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4240:1: rule__Fork__Group__6 : rule__Fork__Group__6__Impl ;
    public final void rule__Fork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4244:1: ( rule__Fork__Group__6__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4245:2: rule__Fork__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68465);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4251:1: rule__Fork__Group__6__Impl : ( ')' ) ;
    public final void rule__Fork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4255:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4256:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4256:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4257:1: ')'
            {
             before(grammarAccess.getForkAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Fork__Group__6__Impl8493); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4284:1: rule__Fork__Group_5__0 : rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1 ;
    public final void rule__Fork__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4288:1: ( rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4289:2: rule__Fork__Group_5__0__Impl rule__Fork__Group_5__1
            {
            pushFollow(FOLLOW_rule__Fork__Group_5__0__Impl_in_rule__Fork__Group_5__08538);
            rule__Fork__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group_5__1_in_rule__Fork__Group_5__08541);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4296:1: rule__Fork__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Fork__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4300:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4301:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4301:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4302:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group_5__0__Impl8569); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4315:1: rule__Fork__Group_5__1 : rule__Fork__Group_5__1__Impl ;
    public final void rule__Fork__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4319:1: ( rule__Fork__Group_5__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4320:2: rule__Fork__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group_5__1__Impl_in_rule__Fork__Group_5__18600);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4326:1: rule__Fork__Group_5__1__Impl : ( ( rule__Fork__ContinuationAssignment_5_1 ) ) ;
    public final void rule__Fork__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4330:1: ( ( ( rule__Fork__ContinuationAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4331:1: ( ( rule__Fork__ContinuationAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4331:1: ( ( rule__Fork__ContinuationAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4332:1: ( rule__Fork__ContinuationAssignment_5_1 )
            {
             before(grammarAccess.getForkAccess().getContinuationAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4333:1: ( rule__Fork__ContinuationAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4333:2: rule__Fork__ContinuationAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Fork__ContinuationAssignment_5_1_in_rule__Fork__Group_5__1__Impl8627);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4347:1: rule__Forke__Group__0 : rule__Forke__Group__0__Impl rule__Forke__Group__1 ;
    public final void rule__Forke__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4351:1: ( rule__Forke__Group__0__Impl rule__Forke__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4352:2: rule__Forke__Group__0__Impl rule__Forke__Group__1
            {
            pushFollow(FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__08661);
            rule__Forke__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__08664);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4359:1: rule__Forke__Group__0__Impl : ( 'FORKE' ) ;
    public final void rule__Forke__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4363:1: ( ( 'FORKE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4364:1: ( 'FORKE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4364:1: ( 'FORKE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4365:1: 'FORKE'
            {
             before(grammarAccess.getForkeAccess().getFORKEKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Forke__Group__0__Impl8692); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4378:1: rule__Forke__Group__1 : rule__Forke__Group__1__Impl rule__Forke__Group__2 ;
    public final void rule__Forke__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4382:1: ( rule__Forke__Group__1__Impl rule__Forke__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4383:2: rule__Forke__Group__1__Impl rule__Forke__Group__2
            {
            pushFollow(FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__18723);
            rule__Forke__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__18726);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4390:1: rule__Forke__Group__1__Impl : ( '(' ) ;
    public final void rule__Forke__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4394:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4395:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4395:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4396:1: '('
            {
             before(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Forke__Group__1__Impl8754); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4409:1: rule__Forke__Group__2 : rule__Forke__Group__2__Impl rule__Forke__Group__3 ;
    public final void rule__Forke__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4413:1: ( rule__Forke__Group__2__Impl rule__Forke__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4414:2: rule__Forke__Group__2__Impl rule__Forke__Group__3
            {
            pushFollow(FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__28785);
            rule__Forke__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__28788);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4421:1: rule__Forke__Group__2__Impl : ( ( rule__Forke__StateAssignment_2 ) ) ;
    public final void rule__Forke__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4425:1: ( ( ( rule__Forke__StateAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4426:1: ( ( rule__Forke__StateAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4426:1: ( ( rule__Forke__StateAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4427:1: ( rule__Forke__StateAssignment_2 )
            {
             before(grammarAccess.getForkeAccess().getStateAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4428:1: ( rule__Forke__StateAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4428:2: rule__Forke__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Forke__StateAssignment_2_in_rule__Forke__Group__2__Impl8815);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4438:1: rule__Forke__Group__3 : rule__Forke__Group__3__Impl rule__Forke__Group__4 ;
    public final void rule__Forke__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4442:1: ( rule__Forke__Group__3__Impl rule__Forke__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4443:2: rule__Forke__Group__3__Impl rule__Forke__Group__4
            {
            pushFollow(FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__38845);
            rule__Forke__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__38848);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4450:1: rule__Forke__Group__3__Impl : ( ( rule__Forke__Group_3__0 )? ) ;
    public final void rule__Forke__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4454:1: ( ( ( rule__Forke__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4455:1: ( ( rule__Forke__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4455:1: ( ( rule__Forke__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4456:1: ( rule__Forke__Group_3__0 )?
            {
             before(grammarAccess.getForkeAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4457:1: ( rule__Forke__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4457:2: rule__Forke__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Forke__Group_3__0_in_rule__Forke__Group__3__Impl8875);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4467:1: rule__Forke__Group__4 : rule__Forke__Group__4__Impl ;
    public final void rule__Forke__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4471:1: ( rule__Forke__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4472:2: rule__Forke__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__48906);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4478:1: rule__Forke__Group__4__Impl : ( ')' ) ;
    public final void rule__Forke__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4482:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4483:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4483:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4484:1: ')'
            {
             before(grammarAccess.getForkeAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Forke__Group__4__Impl8934); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4507:1: rule__Forke__Group_3__0 : rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1 ;
    public final void rule__Forke__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4511:1: ( rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4512:2: rule__Forke__Group_3__0__Impl rule__Forke__Group_3__1
            {
            pushFollow(FOLLOW_rule__Forke__Group_3__0__Impl_in_rule__Forke__Group_3__08975);
            rule__Forke__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group_3__1_in_rule__Forke__Group_3__08978);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4519:1: rule__Forke__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Forke__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4523:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4524:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4524:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4525:1: ','
            {
             before(grammarAccess.getForkeAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Forke__Group_3__0__Impl9006); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4538:1: rule__Forke__Group_3__1 : rule__Forke__Group_3__1__Impl ;
    public final void rule__Forke__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4542:1: ( rule__Forke__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4543:2: rule__Forke__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group_3__1__Impl_in_rule__Forke__Group_3__19037);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4549:1: rule__Forke__Group_3__1__Impl : ( ( rule__Forke__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Forke__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4553:1: ( ( ( rule__Forke__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4554:1: ( ( rule__Forke__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4554:1: ( ( rule__Forke__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4555:1: ( rule__Forke__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getForkeAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4556:1: ( rule__Forke__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4556:2: rule__Forke__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Forke__ContinuationAssignment_3_1_in_rule__Forke__Group_3__1__Impl9064);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4570:1: rule__Emit__Group__0 : rule__Emit__Group__0__Impl rule__Emit__Group__1 ;
    public final void rule__Emit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4574:1: ( rule__Emit__Group__0__Impl rule__Emit__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4575:2: rule__Emit__Group__0__Impl rule__Emit__Group__1
            {
            pushFollow(FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09098);
            rule__Emit__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09101);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4582:1: rule__Emit__Group__0__Impl : ( 'EMIT' ) ;
    public final void rule__Emit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4586:1: ( ( 'EMIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4587:1: ( 'EMIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4587:1: ( 'EMIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4588:1: 'EMIT'
            {
             before(grammarAccess.getEmitAccess().getEMITKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Emit__Group__0__Impl9129); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4601:1: rule__Emit__Group__1 : rule__Emit__Group__1__Impl rule__Emit__Group__2 ;
    public final void rule__Emit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4605:1: ( rule__Emit__Group__1__Impl rule__Emit__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4606:2: rule__Emit__Group__1__Impl rule__Emit__Group__2
            {
            pushFollow(FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19160);
            rule__Emit__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19163);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4613:1: rule__Emit__Group__1__Impl : ( '(' ) ;
    public final void rule__Emit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4617:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4618:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4618:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4619:1: '('
            {
             before(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Emit__Group__1__Impl9191); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4632:1: rule__Emit__Group__2 : rule__Emit__Group__2__Impl rule__Emit__Group__3 ;
    public final void rule__Emit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4636:1: ( rule__Emit__Group__2__Impl rule__Emit__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4637:2: rule__Emit__Group__2__Impl rule__Emit__Group__3
            {
            pushFollow(FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29222);
            rule__Emit__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29225);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4644:1: rule__Emit__Group__2__Impl : ( ( rule__Emit__SignalAssignment_2 ) ) ;
    public final void rule__Emit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4648:1: ( ( ( rule__Emit__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4649:1: ( ( rule__Emit__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4649:1: ( ( rule__Emit__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4650:1: ( rule__Emit__SignalAssignment_2 )
            {
             before(grammarAccess.getEmitAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4651:1: ( rule__Emit__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4651:2: rule__Emit__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Emit__SignalAssignment_2_in_rule__Emit__Group__2__Impl9252);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4661:1: rule__Emit__Group__3 : rule__Emit__Group__3__Impl rule__Emit__Group__4 ;
    public final void rule__Emit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4665:1: ( rule__Emit__Group__3__Impl rule__Emit__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4666:2: rule__Emit__Group__3__Impl rule__Emit__Group__4
            {
            pushFollow(FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39282);
            rule__Emit__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39285);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4673:1: rule__Emit__Group__3__Impl : ( ( rule__Emit__Group_3__0 )? ) ;
    public final void rule__Emit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4677:1: ( ( ( rule__Emit__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4678:1: ( ( rule__Emit__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4678:1: ( ( rule__Emit__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4679:1: ( rule__Emit__Group_3__0 )?
            {
             before(grammarAccess.getEmitAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4680:1: ( rule__Emit__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4680:2: rule__Emit__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Emit__Group_3__0_in_rule__Emit__Group__3__Impl9312);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4690:1: rule__Emit__Group__4 : rule__Emit__Group__4__Impl ;
    public final void rule__Emit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4694:1: ( rule__Emit__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4695:2: rule__Emit__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49343);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4701:1: rule__Emit__Group__4__Impl : ( ')' ) ;
    public final void rule__Emit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4705:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4706:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4706:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4707:1: ')'
            {
             before(grammarAccess.getEmitAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Emit__Group__4__Impl9371); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4730:1: rule__Emit__Group_3__0 : rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1 ;
    public final void rule__Emit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4734:1: ( rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4735:2: rule__Emit__Group_3__0__Impl rule__Emit__Group_3__1
            {
            pushFollow(FOLLOW_rule__Emit__Group_3__0__Impl_in_rule__Emit__Group_3__09412);
            rule__Emit__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group_3__1_in_rule__Emit__Group_3__09415);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4742:1: rule__Emit__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Emit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4746:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4747:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4747:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4748:1: ','
            {
             before(grammarAccess.getEmitAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Emit__Group_3__0__Impl9443); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4761:1: rule__Emit__Group_3__1 : rule__Emit__Group_3__1__Impl ;
    public final void rule__Emit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4765:1: ( rule__Emit__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4766:2: rule__Emit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group_3__1__Impl_in_rule__Emit__Group_3__19474);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4772:1: rule__Emit__Group_3__1__Impl : ( ( rule__Emit__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Emit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4776:1: ( ( ( rule__Emit__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4777:1: ( ( rule__Emit__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4777:1: ( ( rule__Emit__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4778:1: ( rule__Emit__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getEmitAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4779:1: ( rule__Emit__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4779:2: rule__Emit__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Emit__ContinuationAssignment_3_1_in_rule__Emit__Group_3__1__Impl9501);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4793:1: rule__Await__Group__0 : rule__Await__Group__0__Impl rule__Await__Group__1 ;
    public final void rule__Await__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4797:1: ( rule__Await__Group__0__Impl rule__Await__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4798:2: rule__Await__Group__0__Impl rule__Await__Group__1
            {
            pushFollow(FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__09535);
            rule__Await__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__1_in_rule__Await__Group__09538);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4805:1: rule__Await__Group__0__Impl : ( 'AWAIT' ) ;
    public final void rule__Await__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4809:1: ( ( 'AWAIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4810:1: ( 'AWAIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4810:1: ( 'AWAIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4811:1: 'AWAIT'
            {
             before(grammarAccess.getAwaitAccess().getAWAITKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Await__Group__0__Impl9566); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4824:1: rule__Await__Group__1 : rule__Await__Group__1__Impl rule__Await__Group__2 ;
    public final void rule__Await__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4828:1: ( rule__Await__Group__1__Impl rule__Await__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4829:2: rule__Await__Group__1__Impl rule__Await__Group__2
            {
            pushFollow(FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__19597);
            rule__Await__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__2_in_rule__Await__Group__19600);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4836:1: rule__Await__Group__1__Impl : ( '(' ) ;
    public final void rule__Await__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4840:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4841:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4841:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4842:1: '('
            {
             before(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Await__Group__1__Impl9628); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4855:1: rule__Await__Group__2 : rule__Await__Group__2__Impl rule__Await__Group__3 ;
    public final void rule__Await__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4859:1: ( rule__Await__Group__2__Impl rule__Await__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4860:2: rule__Await__Group__2__Impl rule__Await__Group__3
            {
            pushFollow(FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__29659);
            rule__Await__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__3_in_rule__Await__Group__29662);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4867:1: rule__Await__Group__2__Impl : ( ( rule__Await__SignalAssignment_2 ) ) ;
    public final void rule__Await__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4871:1: ( ( ( rule__Await__SignalAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4872:1: ( ( rule__Await__SignalAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4872:1: ( ( rule__Await__SignalAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4873:1: ( rule__Await__SignalAssignment_2 )
            {
             before(grammarAccess.getAwaitAccess().getSignalAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4874:1: ( rule__Await__SignalAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4874:2: rule__Await__SignalAssignment_2
            {
            pushFollow(FOLLOW_rule__Await__SignalAssignment_2_in_rule__Await__Group__2__Impl9689);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4884:1: rule__Await__Group__3 : rule__Await__Group__3__Impl rule__Await__Group__4 ;
    public final void rule__Await__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4888:1: ( rule__Await__Group__3__Impl rule__Await__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4889:2: rule__Await__Group__3__Impl rule__Await__Group__4
            {
            pushFollow(FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__39719);
            rule__Await__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__4_in_rule__Await__Group__39722);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4896:1: rule__Await__Group__3__Impl : ( ( rule__Await__Group_3__0 )? ) ;
    public final void rule__Await__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4900:1: ( ( ( rule__Await__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4901:1: ( ( rule__Await__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4901:1: ( ( rule__Await__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4902:1: ( rule__Await__Group_3__0 )?
            {
             before(grammarAccess.getAwaitAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4903:1: ( rule__Await__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4903:2: rule__Await__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Await__Group_3__0_in_rule__Await__Group__3__Impl9749);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4913:1: rule__Await__Group__4 : rule__Await__Group__4__Impl ;
    public final void rule__Await__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4917:1: ( rule__Await__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4918:2: rule__Await__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__49780);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4924:1: rule__Await__Group__4__Impl : ( ')' ) ;
    public final void rule__Await__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4928:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4929:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4929:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4930:1: ')'
            {
             before(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Await__Group__4__Impl9808); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4953:1: rule__Await__Group_3__0 : rule__Await__Group_3__0__Impl rule__Await__Group_3__1 ;
    public final void rule__Await__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4957:1: ( rule__Await__Group_3__0__Impl rule__Await__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4958:2: rule__Await__Group_3__0__Impl rule__Await__Group_3__1
            {
            pushFollow(FOLLOW_rule__Await__Group_3__0__Impl_in_rule__Await__Group_3__09849);
            rule__Await__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group_3__1_in_rule__Await__Group_3__09852);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4965:1: rule__Await__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Await__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4969:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4970:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4970:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4971:1: ','
            {
             before(grammarAccess.getAwaitAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Await__Group_3__0__Impl9880); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4984:1: rule__Await__Group_3__1 : rule__Await__Group_3__1__Impl ;
    public final void rule__Await__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4988:1: ( rule__Await__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4989:2: rule__Await__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group_3__1__Impl_in_rule__Await__Group_3__19911);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4995:1: rule__Await__Group_3__1__Impl : ( ( rule__Await__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Await__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4999:1: ( ( ( rule__Await__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5000:1: ( ( rule__Await__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5000:1: ( ( rule__Await__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5001:1: ( rule__Await__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getAwaitAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5002:1: ( rule__Await__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5002:2: rule__Await__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Await__ContinuationAssignment_3_1_in_rule__Await__Group_3__1__Impl9938);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5016:1: rule__Prio__Group__0 : rule__Prio__Group__0__Impl rule__Prio__Group__1 ;
    public final void rule__Prio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5020:1: ( rule__Prio__Group__0__Impl rule__Prio__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5021:2: rule__Prio__Group__0__Impl rule__Prio__Group__1
            {
            pushFollow(FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__09972);
            rule__Prio__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__09975);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5028:1: rule__Prio__Group__0__Impl : ( 'PRIO' ) ;
    public final void rule__Prio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5032:1: ( ( 'PRIO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5033:1: ( 'PRIO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5033:1: ( 'PRIO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5034:1: 'PRIO'
            {
             before(grammarAccess.getPrioAccess().getPRIOKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Prio__Group__0__Impl10003); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5047:1: rule__Prio__Group__1 : rule__Prio__Group__1__Impl rule__Prio__Group__2 ;
    public final void rule__Prio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5051:1: ( rule__Prio__Group__1__Impl rule__Prio__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5052:2: rule__Prio__Group__1__Impl rule__Prio__Group__2
            {
            pushFollow(FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110034);
            rule__Prio__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110037);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5059:1: rule__Prio__Group__1__Impl : ( '(' ) ;
    public final void rule__Prio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5063:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5064:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5064:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5065:1: '('
            {
             before(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Prio__Group__1__Impl10065); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5078:1: rule__Prio__Group__2 : rule__Prio__Group__2__Impl rule__Prio__Group__3 ;
    public final void rule__Prio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5082:1: ( rule__Prio__Group__2__Impl rule__Prio__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5083:2: rule__Prio__Group__2__Impl rule__Prio__Group__3
            {
            pushFollow(FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210096);
            rule__Prio__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210099);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5090:1: rule__Prio__Group__2__Impl : ( ( rule__Prio__PriorityAssignment_2 ) ) ;
    public final void rule__Prio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5094:1: ( ( ( rule__Prio__PriorityAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5095:1: ( ( rule__Prio__PriorityAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5095:1: ( ( rule__Prio__PriorityAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5096:1: ( rule__Prio__PriorityAssignment_2 )
            {
             before(grammarAccess.getPrioAccess().getPriorityAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5097:1: ( rule__Prio__PriorityAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5097:2: rule__Prio__PriorityAssignment_2
            {
            pushFollow(FOLLOW_rule__Prio__PriorityAssignment_2_in_rule__Prio__Group__2__Impl10126);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5107:1: rule__Prio__Group__3 : rule__Prio__Group__3__Impl rule__Prio__Group__4 ;
    public final void rule__Prio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5111:1: ( rule__Prio__Group__3__Impl rule__Prio__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5112:2: rule__Prio__Group__3__Impl rule__Prio__Group__4
            {
            pushFollow(FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310156);
            rule__Prio__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310159);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5119:1: rule__Prio__Group__3__Impl : ( ( rule__Prio__Group_3__0 )? ) ;
    public final void rule__Prio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5123:1: ( ( ( rule__Prio__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5124:1: ( ( rule__Prio__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5124:1: ( ( rule__Prio__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5125:1: ( rule__Prio__Group_3__0 )?
            {
             before(grammarAccess.getPrioAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5126:1: ( rule__Prio__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5126:2: rule__Prio__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Prio__Group_3__0_in_rule__Prio__Group__3__Impl10186);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5136:1: rule__Prio__Group__4 : rule__Prio__Group__4__Impl ;
    public final void rule__Prio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5140:1: ( rule__Prio__Group__4__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5141:2: rule__Prio__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410217);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5147:1: rule__Prio__Group__4__Impl : ( ')' ) ;
    public final void rule__Prio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5151:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5152:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5152:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5153:1: ')'
            {
             before(grammarAccess.getPrioAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Prio__Group__4__Impl10245); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5176:1: rule__Prio__Group_3__0 : rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1 ;
    public final void rule__Prio__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5180:1: ( rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5181:2: rule__Prio__Group_3__0__Impl rule__Prio__Group_3__1
            {
            pushFollow(FOLLOW_rule__Prio__Group_3__0__Impl_in_rule__Prio__Group_3__010286);
            rule__Prio__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group_3__1_in_rule__Prio__Group_3__010289);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5188:1: rule__Prio__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Prio__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5192:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5193:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5193:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5194:1: ','
            {
             before(grammarAccess.getPrioAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Prio__Group_3__0__Impl10317); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5207:1: rule__Prio__Group_3__1 : rule__Prio__Group_3__1__Impl ;
    public final void rule__Prio__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5211:1: ( rule__Prio__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5212:2: rule__Prio__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group_3__1__Impl_in_rule__Prio__Group_3__110348);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5218:1: rule__Prio__Group_3__1__Impl : ( ( rule__Prio__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Prio__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5222:1: ( ( ( rule__Prio__ContinuationAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5223:1: ( ( rule__Prio__ContinuationAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5223:1: ( ( rule__Prio__ContinuationAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5224:1: ( rule__Prio__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getPrioAccess().getContinuationAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5225:1: ( rule__Prio__ContinuationAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5225:2: rule__Prio__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Prio__ContinuationAssignment_3_1_in_rule__Prio__Group_3__1__Impl10375);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5240:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5244:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5245:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5245:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5246:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_110414); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5255:1: rule__Program__PriorityAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Program__PriorityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5259:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5260:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5260:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5261:1: ruleIntValue
            {
             before(grammarAccess.getProgramAccess().getPriorityIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_310445);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5270:1: rule__Program__SignalsAssignment_5_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5274:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5275:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5275:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5276:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_110476);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5285:1: rule__Program__SignalsAssignment_5_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5289:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5290:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5290:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5291:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_110507);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5300:1: rule__Program__SignalsAssignment_6_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5304:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5305:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5305:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5306:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_110538);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5315:1: rule__Program__SignalsAssignment_6_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5319:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5320:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5320:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5321:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_110569);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5330:1: rule__Program__SignalsAssignment_7_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5334:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5335:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5335:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5336:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_110600);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5345:1: rule__Program__SignalsAssignment_7_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5349:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5350:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5350:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5351:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_110631);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5360:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5364:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5365:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5365:1: ( ruleState )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5366:1: ruleState
            {
             before(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Program__StatesAssignment_810662);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5375:1: rule__Annotation__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5379:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5380:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5380:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5381:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_110693); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5390:1: rule__Annotation__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5394:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5395:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5395:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5396:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_310724); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5405:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5409:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5410:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5410:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5411:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_010755); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5420:1: rule__State__AnnotationsAssignment_2_0 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5424:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5425:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5425:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5426:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_010786);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5435:1: rule__State__AnnotationsAssignment_2_1_1 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5439:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5440:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5440:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5441:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_1_110817);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5450:1: rule__State__SignalsAssignment_3_1 : ( ruleSignal ) ;
    public final void rule__State__SignalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5454:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5455:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5455:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5456:1: ruleSignal
            {
             before(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_3_110848);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5465:1: rule__State__InstructionsAssignment_4_0 : ( ruleInstruction ) ;
    public final void rule__State__InstructionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5469:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5470:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5470:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5471:1: ruleInstruction
            {
             before(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_4_010879);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5480:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5484:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5485:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5485:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5486:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_010910); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5495:1: rule__Signal__TypeAssignment_2 : ( ruleSignalType ) ;
    public final void rule__Signal__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5499:1: ( ( ruleSignalType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5500:1: ( ruleSignalType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5500:1: ( ruleSignalType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5501:1: ruleSignalType
            {
             before(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_210941);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5510:1: rule__Signal__CombineFunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__CombineFunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5514:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5515:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5515:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5516:1: ( RULE_ID )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5517:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5518:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_110976); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5529:1: rule__Signal__AnnotationsAssignment_4_0 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5533:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5534:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5534:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5535:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_011011);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5544:1: rule__Signal__AnnotationsAssignment_4_1_1 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5548:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5549:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5549:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5550:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_1_111042);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5561:1: rule__CustomSignalType__CustomTypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomSignalType__CustomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5565:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5566:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5566:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5567:1: RULE_STRING
            {
             before(grammarAccess.getCustomSignalTypeAccess().getCustomTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomSignalType__CustomTypeAssignment_111075); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5576:1: rule__PrimitiveSignalType__PrimitiveTypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveSignalType__PrimitiveTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5580:1: ( ( rulePrimitiveType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5581:1: ( rulePrimitiveType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5581:1: ( rulePrimitiveType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5582:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveSignalTypeAccess().getPrimitiveTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveSignalType__PrimitiveTypeAssignment11106);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5591:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5595:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5596:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5596:1: ( RULE_INT )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5597:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11137); 
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


    // $ANTLR start rule__Instruction__AnnotationsAssignment_10_1_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5608:1: rule__Instruction__AnnotationsAssignment_10_1_0 : ( ruleAnnotation ) ;
    public final void rule__Instruction__AnnotationsAssignment_10_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5612:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5613:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5613:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5614:1: ruleAnnotation
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_10_1_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_10_1_011170);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_10_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__AnnotationsAssignment_10_1_0


    // $ANTLR start rule__Instruction__AnnotationsAssignment_10_1_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5623:1: rule__Instruction__AnnotationsAssignment_10_1_1_1 : ( ruleAnnotation ) ;
    public final void rule__Instruction__AnnotationsAssignment_10_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5627:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5628:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5628:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5629:1: ruleAnnotation
            {
             before(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_10_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_10_1_1_111201);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getInstructionAccess().getAnnotationsAnnotationParserRuleCall_10_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Instruction__AnnotationsAssignment_10_1_1_1


    // $ANTLR start rule__Pause__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5638:1: rule__Pause__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Pause__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5642:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5643:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5643:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5644:1: ( RULE_ID )
            {
             before(grammarAccess.getPauseAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5645:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5646:1: RULE_ID
            {
             before(grammarAccess.getPauseAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pause__ContinuationAssignment_311236); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5657:1: rule__Term__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Term__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5661:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5662:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5662:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5663:1: ( RULE_ID )
            {
             before(grammarAccess.getTermAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5664:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5665:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ContinuationAssignment_311275); 
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


    // $ANTLR start rule__Join__ContinuationAssignment_3
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5676:1: rule__Join__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Join__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5680:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5681:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5681:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5682:1: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5683:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5684:1: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Join__ContinuationAssignment_311314); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5695:1: rule__Abort__ContinuationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Abort__ContinuationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5699:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5700:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5700:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5701:1: ( RULE_ID )
            {
             before(grammarAccess.getAbortAccess().getContinuationStateCrossReference_3_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5702:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5703:1: RULE_ID
            {
             before(grammarAccess.getAbortAccess().getContinuationStateIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Abort__ContinuationAssignment_311353); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5714:1: rule__Present__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Present__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5718:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5719:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5719:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5720:1: ( RULE_ID )
            {
             before(grammarAccess.getPresentAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5721:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5722:1: RULE_ID
            {
             before(grammarAccess.getPresentAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Present__SignalAssignment_211392); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5733:1: rule__Present__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Present__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5737:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5738:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5738:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5739:1: ( RULE_ID )
            {
             before(grammarAccess.getPresentAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5740:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5741:1: RULE_ID
            {
             before(grammarAccess.getPresentAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Present__ContinuationAssignment_3_111431); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5752:1: rule__Present__InstructionsAssignment_6_0 : ( ruleInstruction ) ;
    public final void rule__Present__InstructionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5756:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5757:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5757:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5758:1: ruleInstruction
            {
             before(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_6_011466);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5767:1: rule__Goto__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Goto__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5771:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5772:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5772:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5773:1: ( RULE_ID )
            {
             before(grammarAccess.getGotoAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5774:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5775:1: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goto__StateAssignment_211501); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5786:1: rule__Goto__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goto__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5790:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5791:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5791:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5792:1: ( RULE_ID )
            {
             before(grammarAccess.getGotoAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5793:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5794:1: RULE_ID
            {
             before(grammarAccess.getGotoAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goto__ContinuationAssignment_3_111540); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5805:1: rule__Fork__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fork__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5809:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5810:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5810:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5811:1: ( RULE_ID )
            {
             before(grammarAccess.getForkAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5812:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5813:1: RULE_ID
            {
             before(grammarAccess.getForkAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fork__StateAssignment_211579); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5824:1: rule__Fork__PriorityAssignment_4 : ( ruleIntValue ) ;
    public final void rule__Fork__PriorityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5828:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5829:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5829:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5830:1: ruleIntValue
            {
             before(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_411614);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5839:1: rule__Fork__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fork__ContinuationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5843:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5844:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5844:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5845:1: ( RULE_ID )
            {
             before(grammarAccess.getForkAccess().getContinuationStateCrossReference_5_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5846:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5847:1: RULE_ID
            {
             before(grammarAccess.getForkAccess().getContinuationStateIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fork__ContinuationAssignment_5_111649); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5858:1: rule__Forke__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Forke__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5862:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5863:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5863:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5864:1: ( RULE_ID )
            {
             before(grammarAccess.getForkeAccess().getStateStateCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5865:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5866:1: RULE_ID
            {
             before(grammarAccess.getForkeAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Forke__StateAssignment_211688); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5877:1: rule__Forke__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Forke__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5881:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5882:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5882:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5883:1: ( RULE_ID )
            {
             before(grammarAccess.getForkeAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5884:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5885:1: RULE_ID
            {
             before(grammarAccess.getForkeAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Forke__ContinuationAssignment_3_111727); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5896:1: rule__Emit__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Emit__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5900:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5901:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5901:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5902:1: ( RULE_ID )
            {
             before(grammarAccess.getEmitAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5903:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5904:1: RULE_ID
            {
             before(grammarAccess.getEmitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emit__SignalAssignment_211766); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5915:1: rule__Emit__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Emit__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5919:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5920:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5920:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5921:1: ( RULE_ID )
            {
             before(grammarAccess.getEmitAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5922:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5923:1: RULE_ID
            {
             before(grammarAccess.getEmitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Emit__ContinuationAssignment_3_111805); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5934:1: rule__Await__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Await__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5938:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5939:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5939:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5940:1: ( RULE_ID )
            {
             before(grammarAccess.getAwaitAccess().getSignalSignalCrossReference_2_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5941:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5942:1: RULE_ID
            {
             before(grammarAccess.getAwaitAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Await__SignalAssignment_211844); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5953:1: rule__Await__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Await__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5957:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5958:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5958:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5959:1: ( RULE_ID )
            {
             before(grammarAccess.getAwaitAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5960:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5961:1: RULE_ID
            {
             before(grammarAccess.getAwaitAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Await__ContinuationAssignment_3_111883); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5972:1: rule__Prio__PriorityAssignment_2 : ( ruleIntValue ) ;
    public final void rule__Prio__PriorityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5976:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5977:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5977:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5978:1: ruleIntValue
            {
             before(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_211918);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5987:1: rule__Prio__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Prio__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5991:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5992:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5992:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5993:1: ( RULE_ID )
            {
             before(grammarAccess.getPrioAccess().getContinuationStateCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5994:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5995:1: RULE_ID
            {
             before(grammarAccess.getPrioAccess().getContinuationStateIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Prio__ContinuationAssignment_3_111953); 
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
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0_in_ruleAbort822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0_in_rulePresent882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0_in_ruleGoto942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_entryRuleFork969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFork976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_entryRuleForke1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForke1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0_in_ruleForke1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0_in_ruleEmit1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0_in_ruleAwait1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0_in_rulePrio1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignalType_in_rule__SignalType__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignalType_in_rule__SignalType__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_rule__Instruction__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_rule__Instruction__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_rule__Instruction__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_rule__Instruction__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10__0_in_rule__Instruction__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveType__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveType__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveType__Alternatives1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__0__Impl1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__2__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__41908 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__41911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__4__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__51970 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__51973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62031 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2182 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_5__0__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12307 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22367 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2397 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_5__3__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group_6__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12680 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22740 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2770 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_6__3__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_6_2__0__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__12930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__02991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__02994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group_7__0__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13053 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23113 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3143 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_7__3__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Annotation__Group__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13426 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_1_in_rule__Annotation__Group__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Annotation__Group__2__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_3_in_rule__Annotation__Group__3__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13673 = new BitSet(new long[]{0x000007E7CA000002L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group__1__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23735 = new BitSet(new long[]{0x000007E7C8000002L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0_in_rule__State__Group__2__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33796 = new BitSet(new long[]{0x000007E7C0000002L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3884 = new BitSet(new long[]{0x000007E7C0000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__0__Impl_in_rule__State__Group_2__03925 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1_in_rule__State__Group_2__03928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_2_0_in_rule__State__Group_2__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2__1__Impl_in_rule__State__Group_2__13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0_in_rule__State__Group_2__1__Impl4012 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__0__Impl_in_rule__State__Group_2_1__04047 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1_in_rule__State__Group_2_1__04050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__Group_2_1__0__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_2_1__1__Impl_in_rule__State__Group_2_1__14109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_2_1_1_in_rule__State__Group_2_1__1__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__04170 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__04173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group_3__0__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14232 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_3__2_in_rule__State__Group_3__14235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__SignalsAssignment_3_1_in_rule__State__Group_3__1__Impl4262 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group_3__2__Impl_in_rule__State__Group_3__24293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_3__2__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04358 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InstructionsAssignment_4_0_in_rule__State__Group_4__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_4__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04481 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14541 = new BitSet(new long[]{0x000000002001E000L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Signal__Group__1__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24603 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34663 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Group__4__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Signal__Group_3__0__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__04915 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_4_0_in_rule__Signal__Group_4__0__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl5002 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__05037 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Signal__Group_4_1__0__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__0__Impl_in_rule__CustomSignalType__Group__05161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__1_in_rule__CustomSignalType__Group__05164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomSignalType__Group__0__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__Group__1__Impl_in_rule__CustomSignalType__Group__15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignalType__CustomTypeAssignment_1_in_rule__CustomSignalType__Group__1__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10__0__Impl_in_rule__Instruction__Group_10__05284 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10__1_in_rule__Instruction__Group_10__05287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_rule__Instruction__Group_10__0__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10__1__Impl_in_rule__Instruction__Group_10__15343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1__0_in_rule__Instruction__Group_10__1__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1__0__Impl_in_rule__Instruction__Group_10_1__05405 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1__1_in_rule__Instruction__Group_10_1__05408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__AnnotationsAssignment_10_1_0_in_rule__Instruction__Group_10_1__0__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1__1__Impl_in_rule__Instruction__Group_10_1__15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1_1__0_in_rule__Instruction__Group_10_1__1__Impl5492 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1_1__0__Impl_in_rule__Instruction__Group_10_1_1__05527 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1_1__1_in_rule__Instruction__Group_10_1_1__05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instruction__Group_10_1_1__0__Impl5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Group_10_1_1__1__Impl_in_rule__Instruction__Group_10_1_1__15589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__AnnotationsAssignment_10_1_1_1_in_rule__Instruction__Group_10_1_1__1__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05650 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15711 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Pause__Group__1__Impl5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25773 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Pause__Group__2__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35835 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__ContinuationAssignment_3_in_rule__Pause__Group__3__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Pause__Group__4__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05965 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__16026 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__16029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Term__Group__1__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__26088 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Term__Group__3_in_rule__Term__Group__26091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group__2__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__36150 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Term__Group__4_in_rule__Term__Group__36153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ContinuationAssignment_3_in_rule__Term__Group__3__Impl6180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__46211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group__4__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06280 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Join__Group__1__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26403 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Join__Group__2__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__ContinuationAssignment_3_in_rule__Join__Group__3__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Join__Group__4__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06595 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__16656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__16659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Abort__Group__1__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__26718 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abort__Group__2__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__36780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__36783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__ContinuationAssignment_3_in_rule__Abort__Group__3__Impl6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__46841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abort__Group__4__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__06910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Present__Group__1_in_rule__Present__Group__06913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Present__Group__0__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__16972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group__2_in_rule__Present__Group__16975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Present__Group__1__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27034 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__SignalAssignment_2_in_rule__Present__Group__2__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37094 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__0_in_rule__Present__Group__3__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47155 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Present__Group__4__Impl7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57217 = new BitSet(new long[]{0x000007F7C0000000L});
    public static final BitSet FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Present__Group__5__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67279 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__0_in_rule__Present__Group__6__Impl7309 = new BitSet(new long[]{0x000007E7C0000002L});
    public static final BitSet FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Present__Group__7__Impl7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__0__Impl_in_rule__Present__Group_3__07415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group_3__1_in_rule__Present__Group_3__07418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Present__Group_3__0__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_3__1__Impl_in_rule__Present__Group_3__17477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__ContinuationAssignment_3_1_in_rule__Present__Group_3__1__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__0__Impl_in_rule__Present__Group_6__07538 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Present__Group_6__1_in_rule__Present__Group_6__07541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__InstructionsAssignment_6_0_in_rule__Present__Group_6__0__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_6__1__Impl_in_rule__Present__Group_6__17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Present__Group_6__1__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__07661 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__07664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Goto__Group__0__Impl7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__17723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__17726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Goto__Group__1__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__27785 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__27788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__StateAssignment_2_in_rule__Goto__Group__2__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__37845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__37848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__0_in_rule__Goto__Group__3__Impl7875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__47906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Goto__Group__4__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__0__Impl_in_rule__Goto__Group_3__07975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__1_in_rule__Goto__Group_3__07978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Goto__Group_3__0__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_3__1__Impl_in_rule__Goto__Group_3__18037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__ContinuationAssignment_3_1_in_rule__Goto__Group_3__1__Impl8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08098 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Fork__Group__0__Impl8129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Fork__Group__1__Impl8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28222 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__StateAssignment_2_in_rule__Fork__Group__2__Impl8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group__3__Impl8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48344 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__PriorityAssignment_4_in_rule__Fork__Group__4__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58404 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__0_in_rule__Fork__Group__5__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Fork__Group__6__Impl8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__0__Impl_in_rule__Fork__Group_5__08538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__1_in_rule__Fork__Group_5__08541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group_5__0__Impl8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_5__1__Impl_in_rule__Fork__Group_5__18600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__ContinuationAssignment_5_1_in_rule__Fork__Group_5__1__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__08661 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__08664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Forke__Group__0__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__18723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__18726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Forke__Group__1__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__28785 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__28788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__StateAssignment_2_in_rule__Forke__Group__2__Impl8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__38845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__38848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__0_in_rule__Forke__Group__3__Impl8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__48906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Forke__Group__4__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__0__Impl_in_rule__Forke__Group_3__08975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__1_in_rule__Forke__Group_3__08978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Forke__Group_3__0__Impl9006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_3__1__Impl_in_rule__Forke__Group_3__19037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__ContinuationAssignment_3_1_in_rule__Forke__Group_3__1__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09098 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Emit__Group__0__Impl9129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Emit__Group__1__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29222 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__SignalAssignment_2_in_rule__Emit__Group__2__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39282 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__0_in_rule__Emit__Group__3__Impl9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Emit__Group__4__Impl9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__0__Impl_in_rule__Emit__Group_3__09412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__1_in_rule__Emit__Group_3__09415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Emit__Group_3__0__Impl9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_3__1__Impl_in_rule__Emit__Group_3__19474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__ContinuationAssignment_3_1_in_rule__Emit__Group_3__1__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__09535 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Await__Group__1_in_rule__Await__Group__09538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Await__Group__0__Impl9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__19597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group__2_in_rule__Await__Group__19600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Await__Group__1__Impl9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__29659 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Await__Group__3_in_rule__Await__Group__29662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__SignalAssignment_2_in_rule__Await__Group__2__Impl9689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__39719 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Await__Group__4_in_rule__Await__Group__39722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__0_in_rule__Await__Group__3__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__49780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Await__Group__4__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__0__Impl_in_rule__Await__Group_3__09849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group_3__1_in_rule__Await__Group_3__09852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Await__Group_3__0__Impl9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_3__1__Impl_in_rule__Await__Group_3__19911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__ContinuationAssignment_3_1_in_rule__Await__Group_3__1__Impl9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__09972 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__09975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Prio__Group__0__Impl10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Prio__Group__1__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210096 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__PriorityAssignment_2_in_rule__Prio__Group__2__Impl10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__0_in_rule__Prio__Group__3__Impl10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Prio__Group__4__Impl10245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__0__Impl_in_rule__Prio__Group_3__010286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__1_in_rule__Prio__Group_3__010289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Prio__Group_3__0__Impl10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_3__1__Impl_in_rule__Prio__Group_3__110348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__ContinuationAssignment_3_1_in_rule__Prio__Group_3__1__Impl10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_110414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_310445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_110476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_110507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_110538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_110569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_110600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_110631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Program__StatesAssignment_810662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_110693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_310724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_010755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_010786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_2_1_110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_3_110848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_4_010879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_010910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_210941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_110976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_011011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_4_1_111042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomSignalType__CustomTypeAssignment_111075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveSignalType__PrimitiveTypeAssignment11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_10_1_011170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Instruction__AnnotationsAssignment_10_1_1_111201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pause__ContinuationAssignment_311236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ContinuationAssignment_311275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Join__ContinuationAssignment_311314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Abort__ContinuationAssignment_311353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Present__SignalAssignment_211392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Present__ContinuationAssignment_3_111431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_6_011466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goto__StateAssignment_211501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goto__ContinuationAssignment_3_111540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fork__StateAssignment_211579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_411614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fork__ContinuationAssignment_5_111649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Forke__StateAssignment_211688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Forke__ContinuationAssignment_3_111727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emit__SignalAssignment_211766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Emit__ContinuationAssignment_3_111805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Await__SignalAssignment_211844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Await__ContinuationAssignment_3_111883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_211918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Prio__ContinuationAssignment_3_111953 = new BitSet(new long[]{0x0000000000000002L});

}