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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'INT'", "'BOOL'", "'FLOAT'", "'Synchronous Program'", "'('", "')'", "'Inputs'", "';'", "','", "'Outputs'", "'Signals'", "':'", "'SIGNALS'", "'combine'", "'CUSTOM'", "'PAUSE'", "'TERM'", "'JOIN'", "'ABORT'", "'PRESENT'", "'{'", "'}'", "'GOTO'", "'FORK'", "'FORKE'", "'EMIT'", "'AWAIT'", "'PRIO'"
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


    // $ANTLR start entryRuleStateReference
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:147:1: entryRuleStateReference : ruleStateReference EOF ;
    public final void entryRuleStateReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:148:1: ( ruleStateReference EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:149:1: ruleStateReference EOF
            {
             before(grammarAccess.getStateReferenceRule()); 
            pushFollow(FOLLOW_ruleStateReference_in_entryRuleStateReference243);
            ruleStateReference();
            _fsp--;

             after(grammarAccess.getStateReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateReference250); 

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
    // $ANTLR end entryRuleStateReference


    // $ANTLR start ruleStateReference
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:156:1: ruleStateReference : ( ( rule__StateReference__StateAssignment ) ) ;
    public final void ruleStateReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:160:2: ( ( ( rule__StateReference__StateAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:161:1: ( ( rule__StateReference__StateAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:161:1: ( ( rule__StateReference__StateAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:162:1: ( rule__StateReference__StateAssignment )
            {
             before(grammarAccess.getStateReferenceAccess().getStateAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:163:1: ( rule__StateReference__StateAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:163:2: rule__StateReference__StateAssignment
            {
            pushFollow(FOLLOW_rule__StateReference__StateAssignment_in_ruleStateReference276);
            rule__StateReference__StateAssignment();
            _fsp--;


            }

             after(grammarAccess.getStateReferenceAccess().getStateAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStateReference


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:175:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:176:1: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:177:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal303);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal310); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:184:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:188:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:189:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:189:1: ( ( rule__Signal__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:190:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:191:1: ( rule__Signal__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:191:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_ruleSignal336);
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


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:203:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:204:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:205:1: ruleSignalReference EOF
            {
             before(grammarAccess.getSignalReferenceRule()); 
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference363);
            ruleSignalReference();
            _fsp--;

             after(grammarAccess.getSignalReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference370); 

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
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:212:1: ruleSignalReference : ( ( rule__SignalReference__SignalAssignment ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:216:2: ( ( ( rule__SignalReference__SignalAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:217:1: ( ( rule__SignalReference__SignalAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:217:1: ( ( rule__SignalReference__SignalAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:218:1: ( rule__SignalReference__SignalAssignment )
            {
             before(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:219:1: ( rule__SignalReference__SignalAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:219:2: rule__SignalReference__SignalAssignment
            {
            pushFollow(FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference396);
            rule__SignalReference__SignalAssignment();
            _fsp--;


            }

             after(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:233:1: entryRuleSignalType : ruleSignalType EOF ;
    public final void entryRuleSignalType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:234:1: ( ruleSignalType EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:235:1: ruleSignalType EOF
            {
             before(grammarAccess.getSignalTypeRule()); 
            pushFollow(FOLLOW_ruleSignalType_in_entryRuleSignalType425);
            ruleSignalType();
            _fsp--;

             after(grammarAccess.getSignalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalType432); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:242:1: ruleSignalType : ( ( rule__SignalType__Alternatives ) ) ;
    public final void ruleSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:246:2: ( ( ( rule__SignalType__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:247:1: ( ( rule__SignalType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:247:1: ( ( rule__SignalType__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:248:1: ( rule__SignalType__Alternatives )
            {
             before(grammarAccess.getSignalTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:249:1: ( rule__SignalType__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:249:2: rule__SignalType__Alternatives
            {
            pushFollow(FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType458);
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


    // $ANTLR start entryRuleCustomSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:261:1: entryRuleCustomSignal : ruleCustomSignal EOF ;
    public final void entryRuleCustomSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:262:1: ( ruleCustomSignal EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:263:1: ruleCustomSignal EOF
            {
             before(grammarAccess.getCustomSignalRule()); 
            pushFollow(FOLLOW_ruleCustomSignal_in_entryRuleCustomSignal485);
            ruleCustomSignal();
            _fsp--;

             after(grammarAccess.getCustomSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomSignal492); 

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
    // $ANTLR end entryRuleCustomSignal


    // $ANTLR start ruleCustomSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:270:1: ruleCustomSignal : ( ( rule__CustomSignal__Group__0 ) ) ;
    public final void ruleCustomSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:274:2: ( ( ( rule__CustomSignal__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:275:1: ( ( rule__CustomSignal__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:275:1: ( ( rule__CustomSignal__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:276:1: ( rule__CustomSignal__Group__0 )
            {
             before(grammarAccess.getCustomSignalAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:277:1: ( rule__CustomSignal__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:277:2: rule__CustomSignal__Group__0
            {
            pushFollow(FOLLOW_rule__CustomSignal__Group__0_in_ruleCustomSignal518);
            rule__CustomSignal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCustomSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCustomSignal


    // $ANTLR start entryRulePrimitiveSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:289:1: entryRulePrimitiveSignal : rulePrimitiveSignal EOF ;
    public final void entryRulePrimitiveSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:290:1: ( rulePrimitiveSignal EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:291:1: rulePrimitiveSignal EOF
            {
             before(grammarAccess.getPrimitiveSignalRule()); 
            pushFollow(FOLLOW_rulePrimitiveSignal_in_entryRulePrimitiveSignal545);
            rulePrimitiveSignal();
            _fsp--;

             after(grammarAccess.getPrimitiveSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveSignal552); 

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
    // $ANTLR end entryRulePrimitiveSignal


    // $ANTLR start rulePrimitiveSignal
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:298:1: rulePrimitiveSignal : ( ( rule__PrimitiveSignal__TypeAssignment ) ) ;
    public final void rulePrimitiveSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:302:2: ( ( ( rule__PrimitiveSignal__TypeAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:303:1: ( ( rule__PrimitiveSignal__TypeAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:303:1: ( ( rule__PrimitiveSignal__TypeAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:304:1: ( rule__PrimitiveSignal__TypeAssignment )
            {
             before(grammarAccess.getPrimitiveSignalAccess().getTypeAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:305:1: ( rule__PrimitiveSignal__TypeAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:305:2: rule__PrimitiveSignal__TypeAssignment
            {
            pushFollow(FOLLOW_rule__PrimitiveSignal__TypeAssignment_in_rulePrimitiveSignal578);
            rule__PrimitiveSignal__TypeAssignment();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveSignalAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrimitiveSignal


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:317:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:318:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:319:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue605);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue612); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:326:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:330:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:331:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:331:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:332:1: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:333:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:333:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue638);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:349:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:350:1: ( ruleInstruction EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:351:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction669);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction676); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:358:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:362:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:363:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:363:1: ( ( rule__Instruction__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:364:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:365:1: ( rule__Instruction__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:365:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction702);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:377:1: entryRulePause : rulePause EOF ;
    public final void entryRulePause() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:378:1: ( rulePause EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:379:1: rulePause EOF
            {
             before(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_rulePause_in_entryRulePause729);
            rulePause();
            _fsp--;

             after(grammarAccess.getPauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePause736); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:386:1: rulePause : ( ( rule__Pause__Group__0 ) ) ;
    public final void rulePause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:390:2: ( ( ( rule__Pause__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Pause__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:391:1: ( ( rule__Pause__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:392:1: ( rule__Pause__Group__0 )
            {
             before(grammarAccess.getPauseAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:1: ( rule__Pause__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:393:2: rule__Pause__Group__0
            {
            pushFollow(FOLLOW_rule__Pause__Group__0_in_rulePause762);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:405:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:406:1: ( ruleTerm EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:407:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm789);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm796); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:414:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:418:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Term__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:419:1: ( ( rule__Term__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:420:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:1: ( rule__Term__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:421:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm822);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:433:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:434:1: ( ruleJoin EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:435:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin849);
            ruleJoin();
            _fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin856); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:442:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:446:2: ( ( ( rule__Join__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Join__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:447:1: ( ( rule__Join__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:448:1: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:1: ( rule__Join__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:449:2: rule__Join__Group__0
            {
            pushFollow(FOLLOW_rule__Join__Group__0_in_ruleJoin882);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:461:1: entryRuleAbort : ruleAbort EOF ;
    public final void entryRuleAbort() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:462:1: ( ruleAbort EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:463:1: ruleAbort EOF
            {
             before(grammarAccess.getAbortRule()); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort909);
            ruleAbort();
            _fsp--;

             after(grammarAccess.getAbortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort916); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:470:1: ruleAbort : ( ( rule__Abort__Group__0 ) ) ;
    public final void ruleAbort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:474:2: ( ( ( rule__Abort__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Abort__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:475:1: ( ( rule__Abort__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:476:1: ( rule__Abort__Group__0 )
            {
             before(grammarAccess.getAbortAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:1: ( rule__Abort__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:477:2: rule__Abort__Group__0
            {
            pushFollow(FOLLOW_rule__Abort__Group__0_in_ruleAbort942);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:489:1: entryRulePresent : rulePresent EOF ;
    public final void entryRulePresent() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:490:1: ( rulePresent EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:491:1: rulePresent EOF
            {
             before(grammarAccess.getPresentRule()); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent969);
            rulePresent();
            _fsp--;

             after(grammarAccess.getPresentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent976); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:498:1: rulePresent : ( ( rule__Present__Group__0 ) ) ;
    public final void rulePresent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:502:2: ( ( ( rule__Present__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Present__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:503:1: ( ( rule__Present__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:504:1: ( rule__Present__Group__0 )
            {
             before(grammarAccess.getPresentAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:1: ( rule__Present__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:505:2: rule__Present__Group__0
            {
            pushFollow(FOLLOW_rule__Present__Group__0_in_rulePresent1002);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:517:1: entryRuleGoto : ruleGoto EOF ;
    public final void entryRuleGoto() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:518:1: ( ruleGoto EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:519:1: ruleGoto EOF
            {
             before(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto1029);
            ruleGoto();
            _fsp--;

             after(grammarAccess.getGotoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto1036); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:526:1: ruleGoto : ( ( rule__Goto__Group__0 ) ) ;
    public final void ruleGoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:530:2: ( ( ( rule__Goto__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Goto__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:531:1: ( ( rule__Goto__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:532:1: ( rule__Goto__Group__0 )
            {
             before(grammarAccess.getGotoAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:1: ( rule__Goto__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:533:2: rule__Goto__Group__0
            {
            pushFollow(FOLLOW_rule__Goto__Group__0_in_ruleGoto1062);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:545:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:546:1: ( ruleFork EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:547:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_ruleFork_in_entryRuleFork1089);
            ruleFork();
            _fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFork1096); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:554:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:558:2: ( ( ( rule__Fork__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Fork__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:559:1: ( ( rule__Fork__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:560:1: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:1: ( rule__Fork__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:561:2: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_rule__Fork__Group__0_in_ruleFork1122);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:573:1: entryRuleForke : ruleForke EOF ;
    public final void entryRuleForke() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:574:1: ( ruleForke EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:575:1: ruleForke EOF
            {
             before(grammarAccess.getForkeRule()); 
            pushFollow(FOLLOW_ruleForke_in_entryRuleForke1149);
            ruleForke();
            _fsp--;

             after(grammarAccess.getForkeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForke1156); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:582:1: ruleForke : ( ( rule__Forke__Group__0 ) ) ;
    public final void ruleForke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:586:2: ( ( ( rule__Forke__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Forke__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:587:1: ( ( rule__Forke__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:588:1: ( rule__Forke__Group__0 )
            {
             before(grammarAccess.getForkeAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:1: ( rule__Forke__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:589:2: rule__Forke__Group__0
            {
            pushFollow(FOLLOW_rule__Forke__Group__0_in_ruleForke1182);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:601:1: entryRuleEmit : ruleEmit EOF ;
    public final void entryRuleEmit() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:602:1: ( ruleEmit EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:603:1: ruleEmit EOF
            {
             before(grammarAccess.getEmitRule()); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit1209);
            ruleEmit();
            _fsp--;

             after(grammarAccess.getEmitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit1216); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:610:1: ruleEmit : ( ( rule__Emit__Group__0 ) ) ;
    public final void ruleEmit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:614:2: ( ( ( rule__Emit__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Emit__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:615:1: ( ( rule__Emit__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:616:1: ( rule__Emit__Group__0 )
            {
             before(grammarAccess.getEmitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:1: ( rule__Emit__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:617:2: rule__Emit__Group__0
            {
            pushFollow(FOLLOW_rule__Emit__Group__0_in_ruleEmit1242);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:629:1: entryRuleAwait : ruleAwait EOF ;
    public final void entryRuleAwait() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:630:1: ( ruleAwait EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:631:1: ruleAwait EOF
            {
             before(grammarAccess.getAwaitRule()); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait1269);
            ruleAwait();
            _fsp--;

             after(grammarAccess.getAwaitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait1276); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:638:1: ruleAwait : ( ( rule__Await__Group__0 ) ) ;
    public final void ruleAwait() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:642:2: ( ( ( rule__Await__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:643:1: ( ( rule__Await__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:643:1: ( ( rule__Await__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:644:1: ( rule__Await__Group__0 )
            {
             before(grammarAccess.getAwaitAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:645:1: ( rule__Await__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:645:2: rule__Await__Group__0
            {
            pushFollow(FOLLOW_rule__Await__Group__0_in_ruleAwait1302);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:657:1: entryRulePrio : rulePrio EOF ;
    public final void entryRulePrio() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:658:1: ( rulePrio EOF )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:659:1: rulePrio EOF
            {
             before(grammarAccess.getPrioRule()); 
            pushFollow(FOLLOW_rulePrio_in_entryRulePrio1329);
            rulePrio();
            _fsp--;

             after(grammarAccess.getPrioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrio1336); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:666:1: rulePrio : ( ( rule__Prio__Group__0 ) ) ;
    public final void rulePrio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:670:2: ( ( ( rule__Prio__Group__0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:671:1: ( ( rule__Prio__Group__0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:671:1: ( ( rule__Prio__Group__0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:672:1: ( rule__Prio__Group__0 )
            {
             before(grammarAccess.getPrioAccess().getGroup()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:673:1: ( rule__Prio__Group__0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:673:2: rule__Prio__Group__0
            {
            pushFollow(FOLLOW_rule__Prio__Group__0_in_rulePrio1362);
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


    // $ANTLR start rulePrimitiveSignalType
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:686:1: rulePrimitiveSignalType : ( ( rule__PrimitiveSignalType__Alternatives ) ) ;
    public final void rulePrimitiveSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:690:1: ( ( ( rule__PrimitiveSignalType__Alternatives ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:691:1: ( ( rule__PrimitiveSignalType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:691:1: ( ( rule__PrimitiveSignalType__Alternatives ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:692:1: ( rule__PrimitiveSignalType__Alternatives )
            {
             before(grammarAccess.getPrimitiveSignalTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:693:1: ( rule__PrimitiveSignalType__Alternatives )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:693:2: rule__PrimitiveSignalType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveSignalType__Alternatives_in_rulePrimitiveSignalType1399);
            rule__PrimitiveSignalType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPrimitiveSignalTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start rule__SignalType__Alternatives
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:705:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignal ) | ( ruleCustomSignal ) );
    public final void rule__SignalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:709:1: ( ( rulePrimitiveSignal ) | ( ruleCustomSignal ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                alt1=1;
            }
            else if ( (LA1_0==28) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("705:1: rule__SignalType__Alternatives : ( ( rulePrimitiveSignal ) | ( ruleCustomSignal ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:710:1: ( rulePrimitiveSignal )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:710:1: ( rulePrimitiveSignal )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:711:1: rulePrimitiveSignal
                    {
                     before(grammarAccess.getSignalTypeAccess().getPrimitiveSignalParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveSignal_in_rule__SignalType__Alternatives1435);
                    rulePrimitiveSignal();
                    _fsp--;

                     after(grammarAccess.getSignalTypeAccess().getPrimitiveSignalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:716:6: ( ruleCustomSignal )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:716:6: ( ruleCustomSignal )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:717:1: ruleCustomSignal
                    {
                     before(grammarAccess.getSignalTypeAccess().getCustomSignalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomSignal_in_rule__SignalType__Alternatives1452);
                    ruleCustomSignal();
                    _fsp--;

                     after(grammarAccess.getSignalTypeAccess().getCustomSignalParserRuleCall_1()); 

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:727:1: rule__Instruction__Alternatives : ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( rulePrio ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:731:1: ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( rulePrio ) )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:732:1: ( ruleAbort )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:732:1: ( ruleAbort )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:733:1: ruleAbort
                    {
                     before(grammarAccess.getInstructionAccess().getAbortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1484);
                    ruleAbort();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAbortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:738:6: ( ruleJoin )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:738:6: ( ruleJoin )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:739:1: ruleJoin
                    {
                     before(grammarAccess.getInstructionAccess().getJoinParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1501);
                    ruleJoin();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getJoinParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:744:6: ( rulePause )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:744:6: ( rulePause )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:745:1: rulePause
                    {
                     before(grammarAccess.getInstructionAccess().getPauseParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePause_in_rule__Instruction__Alternatives1518);
                    rulePause();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPauseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:750:6: ( ruleTerm )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:750:6: ( ruleTerm )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:751:1: ruleTerm
                    {
                     before(grammarAccess.getInstructionAccess().getTermParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1535);
                    ruleTerm();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getTermParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:756:6: ( rulePresent )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:756:6: ( rulePresent )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:757:1: rulePresent
                    {
                     before(grammarAccess.getInstructionAccess().getPresentParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePresent_in_rule__Instruction__Alternatives1552);
                    rulePresent();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPresentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:762:6: ( ruleGoto )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:762:6: ( ruleGoto )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:763:1: ruleGoto
                    {
                     before(grammarAccess.getInstructionAccess().getGotoParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1569);
                    ruleGoto();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getGotoParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:768:6: ( ruleFork )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:768:6: ( ruleFork )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:769:1: ruleFork
                    {
                     before(grammarAccess.getInstructionAccess().getForkParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFork_in_rule__Instruction__Alternatives1586);
                    ruleFork();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:774:6: ( ruleForke )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:774:6: ( ruleForke )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:775:1: ruleForke
                    {
                     before(grammarAccess.getInstructionAccess().getForkeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleForke_in_rule__Instruction__Alternatives1603);
                    ruleForke();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getForkeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:780:6: ( ruleEmit )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:780:6: ( ruleEmit )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:781:1: ruleEmit
                    {
                     before(grammarAccess.getInstructionAccess().getEmitParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1620);
                    ruleEmit();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getEmitParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:786:6: ( ruleAwait )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:786:6: ( ruleAwait )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:787:1: ruleAwait
                    {
                     before(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1637);
                    ruleAwait();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getAwaitParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:792:6: ( rulePrio )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:792:6: ( rulePrio )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:793:1: rulePrio
                    {
                     before(grammarAccess.getInstructionAccess().getPrioParserRuleCall_10()); 
                    pushFollow(FOLLOW_rulePrio_in_rule__Instruction__Alternatives1654);
                    rulePrio();
                    _fsp--;

                     after(grammarAccess.getInstructionAccess().getPrioParserRuleCall_10()); 

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


    // $ANTLR start rule__PrimitiveSignalType__Alternatives
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:803:1: rule__PrimitiveSignalType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );
    public final void rule__PrimitiveSignalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:807:1: ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) )
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
                    new NoViableAltException("803:1: rule__PrimitiveSignalType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'INT' ) ) | ( ( 'BOOL' ) ) | ( ( 'FLOAT' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:808:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:808:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:809:1: ( 'PURE' )
                    {
                     before(grammarAccess.getPrimitiveSignalTypeAccess().getPureEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:810:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:810:3: 'PURE'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveSignalType__Alternatives1687); 

                    }

                     after(grammarAccess.getPrimitiveSignalTypeAccess().getPureEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:815:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:815:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:816:1: ( 'INT' )
                    {
                     before(grammarAccess.getPrimitiveSignalTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:817:1: ( 'INT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:817:3: 'INT'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveSignalType__Alternatives1708); 

                    }

                     after(grammarAccess.getPrimitiveSignalTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:822:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:822:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:823:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getPrimitiveSignalTypeAccess().getBoolEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:824:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:824:3: 'BOOL'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveSignalType__Alternatives1729); 

                    }

                     after(grammarAccess.getPrimitiveSignalTypeAccess().getBoolEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:829:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:829:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:830:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getPrimitiveSignalTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:831:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:831:3: 'FLOAT'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveSignalType__Alternatives1750); 

                    }

                     after(grammarAccess.getPrimitiveSignalTypeAccess().getFloatEnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__PrimitiveSignalType__Alternatives


    // $ANTLR start rule__Program__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:843:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:847:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:848:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01783);
            rule__Program__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01786);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:855:1: rule__Program__Group__0__Impl : ( 'Synchronous Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:859:1: ( ( 'Synchronous Program' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:860:1: ( 'Synchronous Program' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:860:1: ( 'Synchronous Program' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:861:1: 'Synchronous Program'
            {
             before(grammarAccess.getProgramAccess().getSynchronousProgramKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Program__Group__0__Impl1814); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:874:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:878:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:879:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11845);
            rule__Program__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11848);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:886:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:890:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:891:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:891:1: ( ( rule__Program__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:892:1: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:893:1: ( rule__Program__NameAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:893:2: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1875);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:903:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:907:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:908:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21905);
            rule__Program__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21908);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:915:1: rule__Program__Group__2__Impl : ( '(' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:919:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:920:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:920:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:921:1: '('
            {
             before(grammarAccess.getProgramAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group__2__Impl1936); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:934:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:938:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:939:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31967);
            rule__Program__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31970);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:946:1: rule__Program__Group__3__Impl : ( ( rule__Program__PriorityAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:950:1: ( ( ( rule__Program__PriorityAssignment_3 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:951:1: ( ( rule__Program__PriorityAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:951:1: ( ( rule__Program__PriorityAssignment_3 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:952:1: ( rule__Program__PriorityAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getPriorityAssignment_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:953:1: ( rule__Program__PriorityAssignment_3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:953:2: rule__Program__PriorityAssignment_3
            {
            pushFollow(FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1997);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:963:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:967:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:968:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42027);
            rule__Program__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42030);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:975:1: rule__Program__Group__4__Impl : ( ')' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:979:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:980:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:980:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:981:1: ')'
            {
             before(grammarAccess.getProgramAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group__4__Impl2058); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:994:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:998:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:999:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52089);
            rule__Program__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52092);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1006:1: rule__Program__Group__5__Impl : ( ( rule__Program__Group_5__0 )? ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1010:1: ( ( ( rule__Program__Group_5__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1011:1: ( ( rule__Program__Group_5__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1011:1: ( ( rule__Program__Group_5__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1012:1: ( rule__Program__Group_5__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1013:1: ( rule__Program__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1013:2: rule__Program__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2119);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1023:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1027:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1028:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62150);
            rule__Program__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62153);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1035:1: rule__Program__Group__6__Impl : ( ( rule__Program__Group_6__0 )? ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1039:1: ( ( ( rule__Program__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1040:1: ( ( rule__Program__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1040:1: ( ( rule__Program__Group_6__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1041:1: ( rule__Program__Group_6__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1042:1: ( rule__Program__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1042:2: rule__Program__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2180);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1052:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1056:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1057:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72211);
            rule__Program__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72214);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1064:1: rule__Program__Group__7__Impl : ( ( rule__Program__Group_7__0 )? ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1068:1: ( ( ( rule__Program__Group_7__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1069:1: ( ( rule__Program__Group_7__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1069:1: ( ( rule__Program__Group_7__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1070:1: ( rule__Program__Group_7__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_7()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1071:1: ( rule__Program__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1071:2: rule__Program__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2241);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1081:1: rule__Program__Group__8 : rule__Program__Group__8__Impl ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1085:1: ( rule__Program__Group__8__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1086:2: rule__Program__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82272);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1092:1: rule__Program__Group__8__Impl : ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1096:1: ( ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1097:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1097:1: ( ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1098:1: ( ( rule__Program__StatesAssignment_8 ) ) ( ( rule__Program__StatesAssignment_8 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1098:1: ( ( rule__Program__StatesAssignment_8 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1099:1: ( rule__Program__StatesAssignment_8 )
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1100:1: ( rule__Program__StatesAssignment_8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1100:2: rule__Program__StatesAssignment_8
            {
            pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2301);
            rule__Program__StatesAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getProgramAccess().getStatesAssignment_8()); 

            }

            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1103:1: ( ( rule__Program__StatesAssignment_8 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1104:1: ( rule__Program__StatesAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getStatesAssignment_8()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1105:1: ( rule__Program__StatesAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1105:2: rule__Program__StatesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2313);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1134:1: rule__Program__Group_5__0 : rule__Program__Group_5__0__Impl rule__Program__Group_5__1 ;
    public final void rule__Program__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1138:1: ( rule__Program__Group_5__0__Impl rule__Program__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1139:2: rule__Program__Group_5__0__Impl rule__Program__Group_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02364);
            rule__Program__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02367);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1146:1: rule__Program__Group_5__0__Impl : ( 'Inputs' ) ;
    public final void rule__Program__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1150:1: ( ( 'Inputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1151:1: ( 'Inputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1151:1: ( 'Inputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1152:1: 'Inputs'
            {
             before(grammarAccess.getProgramAccess().getInputsKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_5__0__Impl2395); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1165:1: rule__Program__Group_5__1 : rule__Program__Group_5__1__Impl rule__Program__Group_5__2 ;
    public final void rule__Program__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1169:1: ( rule__Program__Group_5__1__Impl rule__Program__Group_5__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1170:2: rule__Program__Group_5__1__Impl rule__Program__Group_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12426);
            rule__Program__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12429);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1177:1: rule__Program__Group_5__1__Impl : ( ( rule__Program__SignalsAssignment_5_1 ) ) ;
    public final void rule__Program__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1181:1: ( ( ( rule__Program__SignalsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1182:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1182:1: ( ( rule__Program__SignalsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1183:1: ( rule__Program__SignalsAssignment_5_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1184:1: ( rule__Program__SignalsAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1184:2: rule__Program__SignalsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2456);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1194:1: rule__Program__Group_5__2 : rule__Program__Group_5__2__Impl rule__Program__Group_5__3 ;
    public final void rule__Program__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1198:1: ( rule__Program__Group_5__2__Impl rule__Program__Group_5__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1199:2: rule__Program__Group_5__2__Impl rule__Program__Group_5__3
            {
            pushFollow(FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22486);
            rule__Program__Group_5__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22489);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1206:1: rule__Program__Group_5__2__Impl : ( ( rule__Program__Group_5_2__0 )* ) ;
    public final void rule__Program__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1210:1: ( ( ( rule__Program__Group_5_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1211:1: ( ( rule__Program__Group_5_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1211:1: ( ( rule__Program__Group_5_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1212:1: ( rule__Program__Group_5_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_5_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1213:1: ( rule__Program__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1213:2: rule__Program__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2516);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1223:1: rule__Program__Group_5__3 : rule__Program__Group_5__3__Impl ;
    public final void rule__Program__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1227:1: ( rule__Program__Group_5__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1228:2: rule__Program__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32547);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1234:1: rule__Program__Group_5__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1238:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1239:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1239:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1240:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_5_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_5__3__Impl2575); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1261:1: rule__Program__Group_5_2__0 : rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 ;
    public final void rule__Program__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1265:1: ( rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1266:2: rule__Program__Group_5_2__0__Impl rule__Program__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02614);
            rule__Program__Group_5_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02617);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1273:1: rule__Program__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1277:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1278:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1278:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1279:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_5_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2645); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1292:1: rule__Program__Group_5_2__1 : rule__Program__Group_5_2__1__Impl ;
    public final void rule__Program__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1296:1: ( rule__Program__Group_5_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1297:2: rule__Program__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12676);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1303:1: rule__Program__Group_5_2__1__Impl : ( ( rule__Program__SignalsAssignment_5_2_1 ) ) ;
    public final void rule__Program__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1307:1: ( ( ( rule__Program__SignalsAssignment_5_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1308:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1308:1: ( ( rule__Program__SignalsAssignment_5_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1309:1: ( rule__Program__SignalsAssignment_5_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_5_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1310:1: ( rule__Program__SignalsAssignment_5_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1310:2: rule__Program__SignalsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2703);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1324:1: rule__Program__Group_6__0 : rule__Program__Group_6__0__Impl rule__Program__Group_6__1 ;
    public final void rule__Program__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1328:1: ( rule__Program__Group_6__0__Impl rule__Program__Group_6__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1329:2: rule__Program__Group_6__0__Impl rule__Program__Group_6__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02737);
            rule__Program__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02740);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1336:1: rule__Program__Group_6__0__Impl : ( 'Outputs' ) ;
    public final void rule__Program__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1340:1: ( ( 'Outputs' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1341:1: ( 'Outputs' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1341:1: ( 'Outputs' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1342:1: 'Outputs'
            {
             before(grammarAccess.getProgramAccess().getOutputsKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__Program__Group_6__0__Impl2768); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1355:1: rule__Program__Group_6__1 : rule__Program__Group_6__1__Impl rule__Program__Group_6__2 ;
    public final void rule__Program__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1359:1: ( rule__Program__Group_6__1__Impl rule__Program__Group_6__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1360:2: rule__Program__Group_6__1__Impl rule__Program__Group_6__2
            {
            pushFollow(FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12799);
            rule__Program__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12802);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1367:1: rule__Program__Group_6__1__Impl : ( ( rule__Program__SignalsAssignment_6_1 ) ) ;
    public final void rule__Program__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1371:1: ( ( ( rule__Program__SignalsAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1372:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1372:1: ( ( rule__Program__SignalsAssignment_6_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1373:1: ( rule__Program__SignalsAssignment_6_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1374:1: ( rule__Program__SignalsAssignment_6_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1374:2: rule__Program__SignalsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2829);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1384:1: rule__Program__Group_6__2 : rule__Program__Group_6__2__Impl rule__Program__Group_6__3 ;
    public final void rule__Program__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1388:1: ( rule__Program__Group_6__2__Impl rule__Program__Group_6__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1389:2: rule__Program__Group_6__2__Impl rule__Program__Group_6__3
            {
            pushFollow(FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22859);
            rule__Program__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22862);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1396:1: rule__Program__Group_6__2__Impl : ( ( rule__Program__Group_6_2__0 )* ) ;
    public final void rule__Program__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1400:1: ( ( ( rule__Program__Group_6_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1401:1: ( ( rule__Program__Group_6_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1401:1: ( ( rule__Program__Group_6_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1402:1: ( rule__Program__Group_6_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_6_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1403:1: ( rule__Program__Group_6_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1403:2: rule__Program__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2889);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1413:1: rule__Program__Group_6__3 : rule__Program__Group_6__3__Impl ;
    public final void rule__Program__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1417:1: ( rule__Program__Group_6__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1418:2: rule__Program__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32920);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1424:1: rule__Program__Group_6__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1428:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1429:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1429:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1430:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_6_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_6__3__Impl2948); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1451:1: rule__Program__Group_6_2__0 : rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 ;
    public final void rule__Program__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1455:1: ( rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1456:2: rule__Program__Group_6_2__0__Impl rule__Program__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02987);
            rule__Program__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02990);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1463:1: rule__Program__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1467:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1468:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1468:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1469:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_6_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_6_2__0__Impl3018); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1482:1: rule__Program__Group_6_2__1 : rule__Program__Group_6_2__1__Impl ;
    public final void rule__Program__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1486:1: ( rule__Program__Group_6_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1487:2: rule__Program__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__13049);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1493:1: rule__Program__Group_6_2__1__Impl : ( ( rule__Program__SignalsAssignment_6_2_1 ) ) ;
    public final void rule__Program__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1497:1: ( ( ( rule__Program__SignalsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1498:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1498:1: ( ( rule__Program__SignalsAssignment_6_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1499:1: ( rule__Program__SignalsAssignment_6_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_6_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1500:1: ( rule__Program__SignalsAssignment_6_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1500:2: rule__Program__SignalsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl3076);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1514:1: rule__Program__Group_7__0 : rule__Program__Group_7__0__Impl rule__Program__Group_7__1 ;
    public final void rule__Program__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1518:1: ( rule__Program__Group_7__0__Impl rule__Program__Group_7__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1519:2: rule__Program__Group_7__0__Impl rule__Program__Group_7__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__03110);
            rule__Program__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__03113);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1526:1: rule__Program__Group_7__0__Impl : ( 'Signals' ) ;
    public final void rule__Program__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1530:1: ( ( 'Signals' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1531:1: ( 'Signals' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1531:1: ( 'Signals' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1532:1: 'Signals'
            {
             before(grammarAccess.getProgramAccess().getSignalsKeyword_7_0()); 
            match(input,24,FOLLOW_24_in_rule__Program__Group_7__0__Impl3141); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1545:1: rule__Program__Group_7__1 : rule__Program__Group_7__1__Impl rule__Program__Group_7__2 ;
    public final void rule__Program__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1549:1: ( rule__Program__Group_7__1__Impl rule__Program__Group_7__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1550:2: rule__Program__Group_7__1__Impl rule__Program__Group_7__2
            {
            pushFollow(FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13172);
            rule__Program__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13175);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1557:1: rule__Program__Group_7__1__Impl : ( ( rule__Program__SignalsAssignment_7_1 ) ) ;
    public final void rule__Program__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1561:1: ( ( ( rule__Program__SignalsAssignment_7_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1562:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1562:1: ( ( rule__Program__SignalsAssignment_7_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1563:1: ( rule__Program__SignalsAssignment_7_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1564:1: ( rule__Program__SignalsAssignment_7_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1564:2: rule__Program__SignalsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3202);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1574:1: rule__Program__Group_7__2 : rule__Program__Group_7__2__Impl rule__Program__Group_7__3 ;
    public final void rule__Program__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1578:1: ( rule__Program__Group_7__2__Impl rule__Program__Group_7__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1579:2: rule__Program__Group_7__2__Impl rule__Program__Group_7__3
            {
            pushFollow(FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23232);
            rule__Program__Group_7__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23235);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1586:1: rule__Program__Group_7__2__Impl : ( ( rule__Program__Group_7_2__0 )* ) ;
    public final void rule__Program__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1590:1: ( ( ( rule__Program__Group_7_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1591:1: ( ( rule__Program__Group_7_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1591:1: ( ( rule__Program__Group_7_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1592:1: ( rule__Program__Group_7_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_7_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1593:1: ( rule__Program__Group_7_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1593:2: rule__Program__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3262);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1603:1: rule__Program__Group_7__3 : rule__Program__Group_7__3__Impl ;
    public final void rule__Program__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1607:1: ( rule__Program__Group_7__3__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1608:2: rule__Program__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33293);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1614:1: rule__Program__Group_7__3__Impl : ( ';' ) ;
    public final void rule__Program__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1618:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1619:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1619:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1620:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_7_3()); 
            match(input,21,FOLLOW_21_in_rule__Program__Group_7__3__Impl3321); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1641:1: rule__Program__Group_7_2__0 : rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 ;
    public final void rule__Program__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1645:1: ( rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1646:2: rule__Program__Group_7_2__0__Impl rule__Program__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03360);
            rule__Program__Group_7_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03363);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1653:1: rule__Program__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1657:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1658:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1658:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1659:1: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_7_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3391); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1672:1: rule__Program__Group_7_2__1 : rule__Program__Group_7_2__1__Impl ;
    public final void rule__Program__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1676:1: ( rule__Program__Group_7_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1677:2: rule__Program__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13422);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1683:1: rule__Program__Group_7_2__1__Impl : ( ( rule__Program__SignalsAssignment_7_2_1 ) ) ;
    public final void rule__Program__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1687:1: ( ( ( rule__Program__SignalsAssignment_7_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1688:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1688:1: ( ( rule__Program__SignalsAssignment_7_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1689:1: ( rule__Program__SignalsAssignment_7_2_1 )
            {
             before(grammarAccess.getProgramAccess().getSignalsAssignment_7_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1690:1: ( rule__Program__SignalsAssignment_7_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1690:2: rule__Program__SignalsAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3449);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1704:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1708:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1709:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03483);
            rule__Annotation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03486);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1716:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1720:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1721:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1721:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1722:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1723:1: ( rule__Annotation__KeyAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1723:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3513);
            rule__Annotation__KeyAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1733:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1737:1: ( rule__Annotation__Group__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1738:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13543);
            rule__Annotation__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1744:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__ValueAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1748:1: ( ( ( rule__Annotation__ValueAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1749:1: ( ( rule__Annotation__ValueAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1749:1: ( ( rule__Annotation__ValueAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1750:1: ( rule__Annotation__ValueAssignment_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1751:1: ( rule__Annotation__ValueAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1751:2: rule__Annotation__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_1_in_rule__Annotation__Group__1__Impl3570);
            rule__Annotation__ValueAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1765:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1769:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1770:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03604);
            rule__State__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03607);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1777:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1781:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1782:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1782:1: ( ( rule__State__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1783:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1784:1: ( rule__State__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1784:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3634);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1794:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1798:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1799:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13664);
            rule__State__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13667);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1806:1: rule__State__Group__1__Impl : ( ':' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1810:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1811:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1811:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1812:1: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__State__Group__1__Impl3695); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1825:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1829:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1830:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23726);
            rule__State__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23729);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1837:1: rule__State__Group__2__Impl : ( ( rule__State__AnnotationsAssignment_2 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1841:1: ( ( ( rule__State__AnnotationsAssignment_2 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1842:1: ( ( rule__State__AnnotationsAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1842:1: ( ( rule__State__AnnotationsAssignment_2 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1843:1: ( rule__State__AnnotationsAssignment_2 )?
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1844:1: ( rule__State__AnnotationsAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_STRING) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1844:2: rule__State__AnnotationsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__State__AnnotationsAssignment_2_in_rule__State__Group__2__Impl3756);
                    rule__State__AnnotationsAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getAnnotationsAssignment_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1854:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1858:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1859:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33787);
            rule__State__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__33790);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1866:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1870:1: ( ( ( rule__State__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1871:1: ( ( rule__State__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1871:1: ( ( rule__State__Group_3__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1872:1: ( rule__State__Group_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1873:1: ( rule__State__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        int LA12_3 = input.LA(3);

                        if ( (LA12_3==RULE_STRING) ) {
                            alt12=1;
                        }


                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1873:2: rule__State__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3817);
            	    rule__State__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1883:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1887:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1888:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43848);
            rule__State__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__43851);
            rule__State__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1895:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1899:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1900:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1900:1: ( ( rule__State__Group_4__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1901:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1902:1: ( rule__State__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1902:2: rule__State__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3878);
                    rule__State__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

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


    // $ANTLR start rule__State__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1912:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1916:1: ( rule__State__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1917:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__53909);
            rule__State__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__5


    // $ANTLR start rule__State__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1923:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1927:1: ( ( ( rule__State__Group_5__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1928:1: ( ( rule__State__Group_5__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1928:1: ( ( rule__State__Group_5__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1929:1: ( rule__State__Group_5__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1930:1: ( rule__State__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_STRING) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==22||(LA14_0>=29 && LA14_0<=33)||(LA14_0>=36 && LA14_0<=41)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1930:2: rule__State__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl3936);
            	    rule__State__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__5__Impl


    // $ANTLR start rule__State__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1952:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1956:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1957:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03979);
            rule__State__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03982);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1964:1: rule__State__Group_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1968:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1969:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1969:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1970:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__State__Group_3__0__Impl4010); 
             after(grammarAccess.getStateAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1983:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1987:1: ( rule__State__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1988:2: rule__State__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14041);
            rule__State__Group_3__1__Impl();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1994:1: rule__State__Group_3__1__Impl : ( ( rule__State__AnnotationsAssignment_3_1 ) ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1998:1: ( ( ( rule__State__AnnotationsAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1999:1: ( ( rule__State__AnnotationsAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:1999:1: ( ( rule__State__AnnotationsAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2000:1: ( rule__State__AnnotationsAssignment_3_1 )
            {
             before(grammarAccess.getStateAccess().getAnnotationsAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2001:1: ( rule__State__AnnotationsAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2001:2: rule__State__AnnotationsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__State__AnnotationsAssignment_3_1_in_rule__State__Group_3__1__Impl4068);
            rule__State__AnnotationsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__State__Group_4__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2015:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2019:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2020:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04102);
            rule__State__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04105);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2027:1: rule__State__Group_4__0__Impl : ( 'SIGNALS' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2031:1: ( ( 'SIGNALS' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2032:1: ( 'SIGNALS' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2032:1: ( 'SIGNALS' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2033:1: 'SIGNALS'
            {
             before(grammarAccess.getStateAccess().getSIGNALSKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__State__Group_4__0__Impl4133); 
             after(grammarAccess.getStateAccess().getSIGNALSKeyword_4_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2046:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl rule__State__Group_4__2 ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2050:1: ( rule__State__Group_4__1__Impl rule__State__Group_4__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2051:2: rule__State__Group_4__1__Impl rule__State__Group_4__2
            {
            pushFollow(FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14164);
            rule__State__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__14167);
            rule__State__Group_4__2();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2058:1: rule__State__Group_4__1__Impl : ( ( rule__State__SignalsAssignment_4_1 )* ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2062:1: ( ( ( rule__State__SignalsAssignment_4_1 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2063:1: ( ( rule__State__SignalsAssignment_4_1 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2063:1: ( ( rule__State__SignalsAssignment_4_1 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2064:1: ( rule__State__SignalsAssignment_4_1 )*
            {
             before(grammarAccess.getStateAccess().getSignalsAssignment_4_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2065:1: ( rule__State__SignalsAssignment_4_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2065:2: rule__State__SignalsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__State__SignalsAssignment_4_1_in_rule__State__Group_4__1__Impl4194);
            	    rule__State__SignalsAssignment_4_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getSignalsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start rule__State__Group_4__2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2075:1: rule__State__Group_4__2 : rule__State__Group_4__2__Impl ;
    public final void rule__State__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2079:1: ( rule__State__Group_4__2__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2080:2: rule__State__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__24225);
            rule__State__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_4__2


    // $ANTLR start rule__State__Group_4__2__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2086:1: rule__State__Group_4__2__Impl : ( ';' ) ;
    public final void rule__State__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2090:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2091:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2091:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2092:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_4_2()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_4__2__Impl4253); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_4__2__Impl


    // $ANTLR start rule__State__Group_5__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2111:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2115:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2116:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04290);
            rule__State__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04293);
            rule__State__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_5__0


    // $ANTLR start rule__State__Group_5__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2123:1: rule__State__Group_5__0__Impl : ( ( rule__State__InstructionsAssignment_5_0 ) ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2127:1: ( ( ( rule__State__InstructionsAssignment_5_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2128:1: ( ( rule__State__InstructionsAssignment_5_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2128:1: ( ( rule__State__InstructionsAssignment_5_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2129:1: ( rule__State__InstructionsAssignment_5_0 )
            {
             before(grammarAccess.getStateAccess().getInstructionsAssignment_5_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2130:1: ( rule__State__InstructionsAssignment_5_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2130:2: rule__State__InstructionsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__State__InstructionsAssignment_5_0_in_rule__State__Group_5__0__Impl4320);
            rule__State__InstructionsAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getInstructionsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_5__0__Impl


    // $ANTLR start rule__State__Group_5__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2140:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2144:1: ( rule__State__Group_5__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2145:2: rule__State__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14350);
            rule__State__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_5__1


    // $ANTLR start rule__State__Group_5__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2151:1: rule__State__Group_5__1__Impl : ( ';' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2155:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2156:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2156:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2157:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_5_1()); 
            match(input,21,FOLLOW_21_in_rule__State__Group_5__1__Impl4378); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_5__1__Impl


    // $ANTLR start rule__Signal__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2174:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2178:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2179:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04413);
            rule__Signal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04416);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2186:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2190:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2191:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2191:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2192:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2193:1: ( rule__Signal__NameAssignment_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2193:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4443);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2203:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2207:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2208:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14473);
            rule__Signal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14476);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2215:1: rule__Signal__Group__1__Impl : ( ':' ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2219:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2220:1: ( ':' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2220:1: ( ':' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2221:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Signal__Group__1__Impl4504); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2234:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2238:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2239:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24535);
            rule__Signal__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24538);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2246:1: rule__Signal__Group__2__Impl : ( ( rule__Signal__TypeAssignment_2 ) ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2250:1: ( ( ( rule__Signal__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2251:1: ( ( rule__Signal__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2251:1: ( ( rule__Signal__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2252:1: ( rule__Signal__TypeAssignment_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2253:1: ( rule__Signal__TypeAssignment_2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2253:2: rule__Signal__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4565);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2263:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl rule__Signal__Group__4 ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2267:1: ( rule__Signal__Group__3__Impl rule__Signal__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2268:2: rule__Signal__Group__3__Impl rule__Signal__Group__4
            {
            pushFollow(FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34595);
            rule__Signal__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34598);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2275:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__Group_3__0 )? ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2279:1: ( ( ( rule__Signal__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2280:1: ( ( rule__Signal__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2280:1: ( ( rule__Signal__Group_3__0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2281:1: ( rule__Signal__Group_3__0 )?
            {
             before(grammarAccess.getSignalAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2282:1: ( rule__Signal__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2282:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4625);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2292:1: rule__Signal__Group__4 : rule__Signal__Group__4__Impl rule__Signal__Group__5 ;
    public final void rule__Signal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2296:1: ( rule__Signal__Group__4__Impl rule__Signal__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2297:2: rule__Signal__Group__4__Impl rule__Signal__Group__5
            {
            pushFollow(FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44656);
            rule__Signal__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__5_in_rule__Signal__Group__44659);
            rule__Signal__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2304:1: rule__Signal__Group__4__Impl : ( ( rule__Signal__AnnotationsAssignment_4 )? ) ;
    public final void rule__Signal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2308:1: ( ( ( rule__Signal__AnnotationsAssignment_4 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2309:1: ( ( rule__Signal__AnnotationsAssignment_4 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2309:1: ( ( rule__Signal__AnnotationsAssignment_4 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2310:1: ( rule__Signal__AnnotationsAssignment_4 )?
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2311:1: ( rule__Signal__AnnotationsAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2311:2: rule__Signal__AnnotationsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_4_in_rule__Signal__Group__4__Impl4686);
                    rule__Signal__AnnotationsAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2321:1: rule__Signal__Group__5 : rule__Signal__Group__5__Impl ;
    public final void rule__Signal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2325:1: ( rule__Signal__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2326:2: rule__Signal__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__5__Impl_in_rule__Signal__Group__54717);
            rule__Signal__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group__5


    // $ANTLR start rule__Signal__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2332:1: rule__Signal__Group__5__Impl : ( ( rule__Signal__Group_5__0 )* ) ;
    public final void rule__Signal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2336:1: ( ( ( rule__Signal__Group_5__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2337:1: ( ( rule__Signal__Group_5__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2337:1: ( ( rule__Signal__Group_5__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2338:1: ( rule__Signal__Group_5__0 )*
            {
             before(grammarAccess.getSignalAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2339:1: ( rule__Signal__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==RULE_ID) ) {
                        int LA18_3 = input.LA(3);

                        if ( (LA18_3==RULE_STRING) ) {
                            alt18=1;
                        }


                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2339:2: rule__Signal__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Group__5__Impl4744);
            	    rule__Signal__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSignalAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group__5__Impl


    // $ANTLR start rule__Signal__Group_3__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2361:1: rule__Signal__Group_3__0 : rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2365:1: ( rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2366:2: rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04787);
            rule__Signal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04790);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2373:1: rule__Signal__Group_3__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2377:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2378:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2378:1: ( 'combine' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2379:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Signal__Group_3__0__Impl4818); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2392:1: rule__Signal__Group_3__1 : rule__Signal__Group_3__1__Impl ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2396:1: ( rule__Signal__Group_3__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2397:2: rule__Signal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14849);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2403:1: rule__Signal__Group_3__1__Impl : ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) ;
    public final void rule__Signal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2407:1: ( ( ( rule__Signal__CombineFunctionAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2408:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2408:1: ( ( rule__Signal__CombineFunctionAssignment_3_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2409:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionAssignment_3_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2410:1: ( rule__Signal__CombineFunctionAssignment_3_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2410:2: rule__Signal__CombineFunctionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4876);
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


    // $ANTLR start rule__Signal__Group_5__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2424:1: rule__Signal__Group_5__0 : rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1 ;
    public final void rule__Signal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2428:1: ( rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2429:2: rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_5__0__Impl_in_rule__Signal__Group_5__04910);
            rule__Signal__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__04913);
            rule__Signal__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__0


    // $ANTLR start rule__Signal__Group_5__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2436:1: rule__Signal__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Signal__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2440:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2441:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2441:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2442:1: ','
            {
             before(grammarAccess.getSignalAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Signal__Group_5__0__Impl4941); 
             after(grammarAccess.getSignalAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__0__Impl


    // $ANTLR start rule__Signal__Group_5__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2455:1: rule__Signal__Group_5__1 : rule__Signal__Group_5__1__Impl ;
    public final void rule__Signal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2459:1: ( rule__Signal__Group_5__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2460:2: rule__Signal__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_5__1__Impl_in_rule__Signal__Group_5__14972);
            rule__Signal__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__1


    // $ANTLR start rule__Signal__Group_5__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2466:1: rule__Signal__Group_5__1__Impl : ( ( rule__Signal__AnnotationsAssignment_5_1 ) ) ;
    public final void rule__Signal__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2470:1: ( ( ( rule__Signal__AnnotationsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2471:1: ( ( rule__Signal__AnnotationsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2471:1: ( ( rule__Signal__AnnotationsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2472:1: ( rule__Signal__AnnotationsAssignment_5_1 )
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2473:1: ( rule__Signal__AnnotationsAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2473:2: rule__Signal__AnnotationsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Signal__AnnotationsAssignment_5_1_in_rule__Signal__Group_5__1__Impl4999);
            rule__Signal__AnnotationsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getAnnotationsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__1__Impl


    // $ANTLR start rule__CustomSignal__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2488:1: rule__CustomSignal__Group__0 : rule__CustomSignal__Group__0__Impl rule__CustomSignal__Group__1 ;
    public final void rule__CustomSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2492:1: ( rule__CustomSignal__Group__0__Impl rule__CustomSignal__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2493:2: rule__CustomSignal__Group__0__Impl rule__CustomSignal__Group__1
            {
            pushFollow(FOLLOW_rule__CustomSignal__Group__0__Impl_in_rule__CustomSignal__Group__05034);
            rule__CustomSignal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CustomSignal__Group__1_in_rule__CustomSignal__Group__05037);
            rule__CustomSignal__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomSignal__Group__0


    // $ANTLR start rule__CustomSignal__Group__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2500:1: rule__CustomSignal__Group__0__Impl : ( 'CUSTOM' ) ;
    public final void rule__CustomSignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2504:1: ( ( 'CUSTOM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2505:1: ( 'CUSTOM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2505:1: ( 'CUSTOM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2506:1: 'CUSTOM'
            {
             before(grammarAccess.getCustomSignalAccess().getCUSTOMKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__CustomSignal__Group__0__Impl5065); 
             after(grammarAccess.getCustomSignalAccess().getCUSTOMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomSignal__Group__0__Impl


    // $ANTLR start rule__CustomSignal__Group__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2519:1: rule__CustomSignal__Group__1 : rule__CustomSignal__Group__1__Impl ;
    public final void rule__CustomSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2523:1: ( rule__CustomSignal__Group__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2524:2: rule__CustomSignal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomSignal__Group__1__Impl_in_rule__CustomSignal__Group__15096);
            rule__CustomSignal__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomSignal__Group__1


    // $ANTLR start rule__CustomSignal__Group__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2530:1: rule__CustomSignal__Group__1__Impl : ( ( rule__CustomSignal__TypeAssignment_1 ) ) ;
    public final void rule__CustomSignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2534:1: ( ( ( rule__CustomSignal__TypeAssignment_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2535:1: ( ( rule__CustomSignal__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2535:1: ( ( rule__CustomSignal__TypeAssignment_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2536:1: ( rule__CustomSignal__TypeAssignment_1 )
            {
             before(grammarAccess.getCustomSignalAccess().getTypeAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2537:1: ( rule__CustomSignal__TypeAssignment_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2537:2: rule__CustomSignal__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomSignal__TypeAssignment_1_in_rule__CustomSignal__Group__1__Impl5123);
            rule__CustomSignal__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCustomSignalAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomSignal__Group__1__Impl


    // $ANTLR start rule__Pause__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2551:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2555:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2556:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05157);
            rule__Pause__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05160);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2563:1: rule__Pause__Group__0__Impl : ( () ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2567:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2568:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2568:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2569:1: ()
            {
             before(grammarAccess.getPauseAccess().getPauseAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2570:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2572:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2582:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2586:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2587:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
            {
            pushFollow(FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15218);
            rule__Pause__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15221);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2594:1: rule__Pause__Group__1__Impl : ( 'PAUSE' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2598:1: ( ( 'PAUSE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2599:1: ( 'PAUSE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2599:1: ( 'PAUSE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2600:1: 'PAUSE'
            {
             before(grammarAccess.getPauseAccess().getPAUSEKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Pause__Group__1__Impl5249); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2613:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2617:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2618:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
            {
            pushFollow(FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25280);
            rule__Pause__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25283);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2625:1: rule__Pause__Group__2__Impl : ( '(' ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2629:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2630:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2630:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2631:1: '('
            {
             before(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Pause__Group__2__Impl5311); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2644:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl rule__Pause__Group__4 ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2648:1: ( rule__Pause__Group__3__Impl rule__Pause__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2649:2: rule__Pause__Group__3__Impl rule__Pause__Group__4
            {
            pushFollow(FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35342);
            rule__Pause__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35345);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2656:1: rule__Pause__Group__3__Impl : ( ')' ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2660:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2661:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2661:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2662:1: ')'
            {
             before(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__Pause__Group__3__Impl5373); 
             after(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2675:1: rule__Pause__Group__4 : rule__Pause__Group__4__Impl rule__Pause__Group__5 ;
    public final void rule__Pause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2679:1: ( rule__Pause__Group__4__Impl rule__Pause__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2680:2: rule__Pause__Group__4__Impl rule__Pause__Group__5
            {
            pushFollow(FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45404);
            rule__Pause__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group__5_in_rule__Pause__Group__45407);
            rule__Pause__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2687:1: rule__Pause__Group__4__Impl : ( ( rule__Pause__AnnotationsAssignment_4 )? ) ;
    public final void rule__Pause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2691:1: ( ( ( rule__Pause__AnnotationsAssignment_4 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2692:1: ( ( rule__Pause__AnnotationsAssignment_4 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2692:1: ( ( rule__Pause__AnnotationsAssignment_4 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2693:1: ( rule__Pause__AnnotationsAssignment_4 )?
            {
             before(grammarAccess.getPauseAccess().getAnnotationsAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2694:1: ( rule__Pause__AnnotationsAssignment_4 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2694:2: rule__Pause__AnnotationsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Pause__AnnotationsAssignment_4_in_rule__Pause__Group__4__Impl5434);
                    rule__Pause__AnnotationsAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPauseAccess().getAnnotationsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Pause__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2704:1: rule__Pause__Group__5 : rule__Pause__Group__5__Impl ;
    public final void rule__Pause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2708:1: ( rule__Pause__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2709:2: rule__Pause__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Pause__Group__5__Impl_in_rule__Pause__Group__55465);
            rule__Pause__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group__5


    // $ANTLR start rule__Pause__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2715:1: rule__Pause__Group__5__Impl : ( ( rule__Pause__Group_5__0 )* ) ;
    public final void rule__Pause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2719:1: ( ( ( rule__Pause__Group_5__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2720:1: ( ( rule__Pause__Group_5__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2720:1: ( ( rule__Pause__Group_5__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2721:1: ( rule__Pause__Group_5__0 )*
            {
             before(grammarAccess.getPauseAccess().getGroup_5()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2722:1: ( rule__Pause__Group_5__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2722:2: rule__Pause__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Pause__Group_5__0_in_rule__Pause__Group__5__Impl5492);
            	    rule__Pause__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPauseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group__5__Impl


    // $ANTLR start rule__Pause__Group_5__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2744:1: rule__Pause__Group_5__0 : rule__Pause__Group_5__0__Impl rule__Pause__Group_5__1 ;
    public final void rule__Pause__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2748:1: ( rule__Pause__Group_5__0__Impl rule__Pause__Group_5__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2749:2: rule__Pause__Group_5__0__Impl rule__Pause__Group_5__1
            {
            pushFollow(FOLLOW_rule__Pause__Group_5__0__Impl_in_rule__Pause__Group_5__05535);
            rule__Pause__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Pause__Group_5__1_in_rule__Pause__Group_5__05538);
            rule__Pause__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group_5__0


    // $ANTLR start rule__Pause__Group_5__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2756:1: rule__Pause__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Pause__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2760:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2761:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2761:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2762:1: ','
            {
             before(grammarAccess.getPauseAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Pause__Group_5__0__Impl5566); 
             after(grammarAccess.getPauseAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group_5__0__Impl


    // $ANTLR start rule__Pause__Group_5__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2775:1: rule__Pause__Group_5__1 : rule__Pause__Group_5__1__Impl ;
    public final void rule__Pause__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2779:1: ( rule__Pause__Group_5__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2780:2: rule__Pause__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Pause__Group_5__1__Impl_in_rule__Pause__Group_5__15597);
            rule__Pause__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group_5__1


    // $ANTLR start rule__Pause__Group_5__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2786:1: rule__Pause__Group_5__1__Impl : ( ( rule__Pause__AnnotationsAssignment_5_1 ) ) ;
    public final void rule__Pause__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2790:1: ( ( ( rule__Pause__AnnotationsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2791:1: ( ( rule__Pause__AnnotationsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2791:1: ( ( rule__Pause__AnnotationsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2792:1: ( rule__Pause__AnnotationsAssignment_5_1 )
            {
             before(grammarAccess.getPauseAccess().getAnnotationsAssignment_5_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2793:1: ( rule__Pause__AnnotationsAssignment_5_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2793:2: rule__Pause__AnnotationsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Pause__AnnotationsAssignment_5_1_in_rule__Pause__Group_5__1__Impl5624);
            rule__Pause__AnnotationsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getPauseAccess().getAnnotationsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__Group_5__1__Impl


    // $ANTLR start rule__Term__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2807:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2811:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2812:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05658);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05661);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2819:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2823:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2824:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2824:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2825:1: ()
            {
             before(grammarAccess.getTermAccess().getTermAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2826:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2828:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2838:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2842:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2843:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15719);
            rule__Term__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__2_in_rule__Term__Group__15722);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2850:1: rule__Term__Group__1__Impl : ( ( rule__Term__AnnotationsAssignment_1 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2854:1: ( ( ( rule__Term__AnnotationsAssignment_1 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2855:1: ( ( rule__Term__AnnotationsAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2855:1: ( ( rule__Term__AnnotationsAssignment_1 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2856:1: ( rule__Term__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getTermAccess().getAnnotationsAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2857:1: ( rule__Term__AnnotationsAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2857:2: rule__Term__AnnotationsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Term__AnnotationsAssignment_1_in_rule__Term__Group__1__Impl5749);
                    rule__Term__AnnotationsAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2867:1: rule__Term__Group__2 : rule__Term__Group__2__Impl rule__Term__Group__3 ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2871:1: ( rule__Term__Group__2__Impl rule__Term__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2872:2: rule__Term__Group__2__Impl rule__Term__Group__3
            {
            pushFollow(FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__25780);
            rule__Term__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__3_in_rule__Term__Group__25783);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2879:1: rule__Term__Group__2__Impl : ( ( rule__Term__Group_2__0 )* ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2883:1: ( ( ( rule__Term__Group_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2884:1: ( ( rule__Term__Group_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2884:1: ( ( rule__Term__Group_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2885:1: ( rule__Term__Group_2__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2886:1: ( rule__Term__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2886:2: rule__Term__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl5810);
            	    rule__Term__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2896:1: rule__Term__Group__3 : rule__Term__Group__3__Impl rule__Term__Group__4 ;
    public final void rule__Term__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2900:1: ( rule__Term__Group__3__Impl rule__Term__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2901:2: rule__Term__Group__3__Impl rule__Term__Group__4
            {
            pushFollow(FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__35841);
            rule__Term__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__4_in_rule__Term__Group__35844);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2908:1: rule__Term__Group__3__Impl : ( 'TERM' ) ;
    public final void rule__Term__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2912:1: ( ( 'TERM' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2913:1: ( 'TERM' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2913:1: ( 'TERM' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2914:1: 'TERM'
            {
             before(grammarAccess.getTermAccess().getTERMKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Term__Group__3__Impl5872); 
             after(grammarAccess.getTermAccess().getTERMKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2927:1: rule__Term__Group__4 : rule__Term__Group__4__Impl rule__Term__Group__5 ;
    public final void rule__Term__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2931:1: ( rule__Term__Group__4__Impl rule__Term__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2932:2: rule__Term__Group__4__Impl rule__Term__Group__5
            {
            pushFollow(FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__45903);
            rule__Term__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__5_in_rule__Term__Group__45906);
            rule__Term__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2939:1: rule__Term__Group__4__Impl : ( '(' ) ;
    public final void rule__Term__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2943:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2944:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2944:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2945:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Term__Group__4__Impl5934); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Term__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2958:1: rule__Term__Group__5 : rule__Term__Group__5__Impl ;
    public final void rule__Term__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2962:1: ( rule__Term__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2963:2: rule__Term__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__5__Impl_in_rule__Term__Group__55965);
            rule__Term__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__5


    // $ANTLR start rule__Term__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2969:1: rule__Term__Group__5__Impl : ( ')' ) ;
    public final void rule__Term__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2973:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2974:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2974:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:2975:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Term__Group__5__Impl5993); 
             after(grammarAccess.getTermAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group__5__Impl


    // $ANTLR start rule__Term__Group_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3000:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3004:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3005:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__06036);
            rule__Term__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__06039);
            rule__Term__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_2__0


    // $ANTLR start rule__Term__Group_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3012:1: rule__Term__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3016:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3017:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3017:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3018:1: ','
            {
             before(grammarAccess.getTermAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Term__Group_2__0__Impl6067); 
             after(grammarAccess.getTermAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_2__0__Impl


    // $ANTLR start rule__Term__Group_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3031:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3035:1: ( rule__Term__Group_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3036:2: rule__Term__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__16098);
            rule__Term__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_2__1


    // $ANTLR start rule__Term__Group_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3042:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3046:1: ( ( ( rule__Term__AnnotationsAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3047:1: ( ( rule__Term__AnnotationsAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3047:1: ( ( rule__Term__AnnotationsAssignment_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3048:1: ( rule__Term__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getTermAccess().getAnnotationsAssignment_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3049:1: ( rule__Term__AnnotationsAssignment_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3049:2: rule__Term__AnnotationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Term__AnnotationsAssignment_2_1_in_rule__Term__Group_2__1__Impl6125);
            rule__Term__AnnotationsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getAnnotationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__Group_2__1__Impl


    // $ANTLR start rule__Join__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3063:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3067:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3068:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06159);
            rule__Join__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06162);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3075:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3079:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3080:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3080:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3081:1: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3082:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3084:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3094:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3098:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3099:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16220);
            rule__Join__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16223);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3106:1: rule__Join__Group__1__Impl : ( ( rule__Join__AnnotationsAssignment_1 )? ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3110:1: ( ( ( rule__Join__AnnotationsAssignment_1 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3111:1: ( ( rule__Join__AnnotationsAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3111:1: ( ( rule__Join__AnnotationsAssignment_1 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3112:1: ( rule__Join__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getJoinAccess().getAnnotationsAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3113:1: ( rule__Join__AnnotationsAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3113:2: rule__Join__AnnotationsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Join__AnnotationsAssignment_1_in_rule__Join__Group__1__Impl6250);
                    rule__Join__AnnotationsAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3123:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3127:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3128:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26281);
            rule__Join__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26284);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3135:1: rule__Join__Group__2__Impl : ( ( rule__Join__Group_2__0 )* ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3139:1: ( ( ( rule__Join__Group_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3140:1: ( ( rule__Join__Group_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3140:1: ( ( rule__Join__Group_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3141:1: ( rule__Join__Group_2__0 )*
            {
             before(grammarAccess.getJoinAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3142:1: ( rule__Join__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3142:2: rule__Join__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Join__Group_2__0_in_rule__Join__Group__2__Impl6311);
            	    rule__Join__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getJoinAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3152:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3156:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3157:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36342);
            rule__Join__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36345);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3164:1: rule__Join__Group__3__Impl : ( 'JOIN' ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3168:1: ( ( 'JOIN' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3169:1: ( 'JOIN' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3169:1: ( 'JOIN' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3170:1: 'JOIN'
            {
             before(grammarAccess.getJoinAccess().getJOINKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Join__Group__3__Impl6373); 
             after(grammarAccess.getJoinAccess().getJOINKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3183:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3187:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3188:2: rule__Join__Group__4__Impl rule__Join__Group__5
            {
            pushFollow(FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46404);
            rule__Join__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group__5_in_rule__Join__Group__46407);
            rule__Join__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3195:1: rule__Join__Group__4__Impl : ( '(' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3199:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3200:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3200:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3201:1: '('
            {
             before(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Join__Group__4__Impl6435); 
             after(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Join__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3214:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3218:1: ( rule__Join__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3219:2: rule__Join__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Join__Group__5__Impl_in_rule__Join__Group__56466);
            rule__Join__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group__5


    // $ANTLR start rule__Join__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3225:1: rule__Join__Group__5__Impl : ( ')' ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3229:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3230:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3230:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3231:1: ')'
            {
             before(grammarAccess.getJoinAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Join__Group__5__Impl6494); 
             after(grammarAccess.getJoinAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group__5__Impl


    // $ANTLR start rule__Join__Group_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3256:1: rule__Join__Group_2__0 : rule__Join__Group_2__0__Impl rule__Join__Group_2__1 ;
    public final void rule__Join__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3260:1: ( rule__Join__Group_2__0__Impl rule__Join__Group_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3261:2: rule__Join__Group_2__0__Impl rule__Join__Group_2__1
            {
            pushFollow(FOLLOW_rule__Join__Group_2__0__Impl_in_rule__Join__Group_2__06537);
            rule__Join__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Join__Group_2__1_in_rule__Join__Group_2__06540);
            rule__Join__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group_2__0


    // $ANTLR start rule__Join__Group_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3268:1: rule__Join__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Join__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3272:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3273:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3273:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3274:1: ','
            {
             before(grammarAccess.getJoinAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Join__Group_2__0__Impl6568); 
             after(grammarAccess.getJoinAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group_2__0__Impl


    // $ANTLR start rule__Join__Group_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3287:1: rule__Join__Group_2__1 : rule__Join__Group_2__1__Impl ;
    public final void rule__Join__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3291:1: ( rule__Join__Group_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3292:2: rule__Join__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Join__Group_2__1__Impl_in_rule__Join__Group_2__16599);
            rule__Join__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group_2__1


    // $ANTLR start rule__Join__Group_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3298:1: rule__Join__Group_2__1__Impl : ( ( rule__Join__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__Join__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3302:1: ( ( ( rule__Join__AnnotationsAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3303:1: ( ( rule__Join__AnnotationsAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3303:1: ( ( rule__Join__AnnotationsAssignment_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3304:1: ( rule__Join__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getJoinAccess().getAnnotationsAssignment_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3305:1: ( rule__Join__AnnotationsAssignment_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3305:2: rule__Join__AnnotationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Join__AnnotationsAssignment_2_1_in_rule__Join__Group_2__1__Impl6626);
            rule__Join__AnnotationsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getJoinAccess().getAnnotationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__Group_2__1__Impl


    // $ANTLR start rule__Abort__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3319:1: rule__Abort__Group__0 : rule__Abort__Group__0__Impl rule__Abort__Group__1 ;
    public final void rule__Abort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3323:1: ( rule__Abort__Group__0__Impl rule__Abort__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3324:2: rule__Abort__Group__0__Impl rule__Abort__Group__1
            {
            pushFollow(FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06660);
            rule__Abort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06663);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3331:1: rule__Abort__Group__0__Impl : ( () ) ;
    public final void rule__Abort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3335:1: ( ( () ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3336:1: ( () )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3336:1: ( () )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3337:1: ()
            {
             before(grammarAccess.getAbortAccess().getAbortAction_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3338:1: ()
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3340:1: 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3350:1: rule__Abort__Group__1 : rule__Abort__Group__1__Impl rule__Abort__Group__2 ;
    public final void rule__Abort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3354:1: ( rule__Abort__Group__1__Impl rule__Abort__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3355:2: rule__Abort__Group__1__Impl rule__Abort__Group__2
            {
            pushFollow(FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__16721);
            rule__Abort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__16724);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3362:1: rule__Abort__Group__1__Impl : ( ( rule__Abort__AnnotationsAssignment_1 )? ) ;
    public final void rule__Abort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3366:1: ( ( ( rule__Abort__AnnotationsAssignment_1 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3367:1: ( ( rule__Abort__AnnotationsAssignment_1 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3367:1: ( ( rule__Abort__AnnotationsAssignment_1 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3368:1: ( rule__Abort__AnnotationsAssignment_1 )?
            {
             before(grammarAccess.getAbortAccess().getAnnotationsAssignment_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3369:1: ( rule__Abort__AnnotationsAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3369:2: rule__Abort__AnnotationsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Abort__AnnotationsAssignment_1_in_rule__Abort__Group__1__Impl6751);
                    rule__Abort__AnnotationsAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbortAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3379:1: rule__Abort__Group__2 : rule__Abort__Group__2__Impl rule__Abort__Group__3 ;
    public final void rule__Abort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3383:1: ( rule__Abort__Group__2__Impl rule__Abort__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3384:2: rule__Abort__Group__2__Impl rule__Abort__Group__3
            {
            pushFollow(FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__26782);
            rule__Abort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__26785);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3391:1: rule__Abort__Group__2__Impl : ( ( rule__Abort__Group_2__0 )* ) ;
    public final void rule__Abort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3395:1: ( ( ( rule__Abort__Group_2__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3396:1: ( ( rule__Abort__Group_2__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3396:1: ( ( rule__Abort__Group_2__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3397:1: ( rule__Abort__Group_2__0 )*
            {
             before(grammarAccess.getAbortAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3398:1: ( rule__Abort__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3398:2: rule__Abort__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Abort__Group_2__0_in_rule__Abort__Group__2__Impl6812);
            	    rule__Abort__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAbortAccess().getGroup_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3408:1: rule__Abort__Group__3 : rule__Abort__Group__3__Impl rule__Abort__Group__4 ;
    public final void rule__Abort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3412:1: ( rule__Abort__Group__3__Impl rule__Abort__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3413:2: rule__Abort__Group__3__Impl rule__Abort__Group__4
            {
            pushFollow(FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__36843);
            rule__Abort__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__36846);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3420:1: rule__Abort__Group__3__Impl : ( 'ABORT' ) ;
    public final void rule__Abort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3424:1: ( ( 'ABORT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3425:1: ( 'ABORT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3425:1: ( 'ABORT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3426:1: 'ABORT'
            {
             before(grammarAccess.getAbortAccess().getABORTKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Abort__Group__3__Impl6874); 
             after(grammarAccess.getAbortAccess().getABORTKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3439:1: rule__Abort__Group__4 : rule__Abort__Group__4__Impl rule__Abort__Group__5 ;
    public final void rule__Abort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3443:1: ( rule__Abort__Group__4__Impl rule__Abort__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3444:2: rule__Abort__Group__4__Impl rule__Abort__Group__5
            {
            pushFollow(FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__46905);
            rule__Abort__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group__5_in_rule__Abort__Group__46908);
            rule__Abort__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3451:1: rule__Abort__Group__4__Impl : ( '(' ) ;
    public final void rule__Abort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3455:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3456:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3456:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3457:1: '('
            {
             before(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Abort__Group__4__Impl6936); 
             after(grammarAccess.getAbortAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Abort__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3470:1: rule__Abort__Group__5 : rule__Abort__Group__5__Impl ;
    public final void rule__Abort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3474:1: ( rule__Abort__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3475:2: rule__Abort__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Abort__Group__5__Impl_in_rule__Abort__Group__56967);
            rule__Abort__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group__5


    // $ANTLR start rule__Abort__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3481:1: rule__Abort__Group__5__Impl : ( ')' ) ;
    public final void rule__Abort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3485:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3486:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3486:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3487:1: ')'
            {
             before(grammarAccess.getAbortAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Abort__Group__5__Impl6995); 
             after(grammarAccess.getAbortAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group__5__Impl


    // $ANTLR start rule__Abort__Group_2__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3512:1: rule__Abort__Group_2__0 : rule__Abort__Group_2__0__Impl rule__Abort__Group_2__1 ;
    public final void rule__Abort__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3516:1: ( rule__Abort__Group_2__0__Impl rule__Abort__Group_2__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3517:2: rule__Abort__Group_2__0__Impl rule__Abort__Group_2__1
            {
            pushFollow(FOLLOW_rule__Abort__Group_2__0__Impl_in_rule__Abort__Group_2__07038);
            rule__Abort__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Abort__Group_2__1_in_rule__Abort__Group_2__07041);
            rule__Abort__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group_2__0


    // $ANTLR start rule__Abort__Group_2__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3524:1: rule__Abort__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Abort__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3528:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3529:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3529:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3530:1: ','
            {
             before(grammarAccess.getAbortAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Abort__Group_2__0__Impl7069); 
             after(grammarAccess.getAbortAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group_2__0__Impl


    // $ANTLR start rule__Abort__Group_2__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3543:1: rule__Abort__Group_2__1 : rule__Abort__Group_2__1__Impl ;
    public final void rule__Abort__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3547:1: ( rule__Abort__Group_2__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3548:2: rule__Abort__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Abort__Group_2__1__Impl_in_rule__Abort__Group_2__17100);
            rule__Abort__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group_2__1


    // $ANTLR start rule__Abort__Group_2__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3554:1: rule__Abort__Group_2__1__Impl : ( ( rule__Abort__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__Abort__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3558:1: ( ( ( rule__Abort__AnnotationsAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3559:1: ( ( rule__Abort__AnnotationsAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3559:1: ( ( rule__Abort__AnnotationsAssignment_2_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3560:1: ( rule__Abort__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getAbortAccess().getAnnotationsAssignment_2_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3561:1: ( rule__Abort__AnnotationsAssignment_2_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3561:2: rule__Abort__AnnotationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Abort__AnnotationsAssignment_2_1_in_rule__Abort__Group_2__1__Impl7127);
            rule__Abort__AnnotationsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAbortAccess().getAnnotationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__Group_2__1__Impl


    // $ANTLR start rule__Present__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3575:1: rule__Present__Group__0 : rule__Present__Group__0__Impl rule__Present__Group__1 ;
    public final void rule__Present__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3579:1: ( rule__Present__Group__0__Impl rule__Present__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3580:2: rule__Present__Group__0__Impl rule__Present__Group__1
            {
            pushFollow(FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__07161);
            rule__Present__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__1_in_rule__Present__Group__07164);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3587:1: rule__Present__Group__0__Impl : ( ( rule__Present__AnnotationsAssignment_0 )? ) ;
    public final void rule__Present__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3591:1: ( ( ( rule__Present__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3592:1: ( ( rule__Present__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3592:1: ( ( rule__Present__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3593:1: ( rule__Present__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getPresentAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3594:1: ( rule__Present__AnnotationsAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3594:2: rule__Present__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Present__AnnotationsAssignment_0_in_rule__Present__Group__0__Impl7191);
                    rule__Present__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3604:1: rule__Present__Group__1 : rule__Present__Group__1__Impl rule__Present__Group__2 ;
    public final void rule__Present__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3608:1: ( rule__Present__Group__1__Impl rule__Present__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3609:2: rule__Present__Group__1__Impl rule__Present__Group__2
            {
            pushFollow(FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__17222);
            rule__Present__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__2_in_rule__Present__Group__17225);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3616:1: rule__Present__Group__1__Impl : ( ( rule__Present__Group_1__0 )* ) ;
    public final void rule__Present__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3620:1: ( ( ( rule__Present__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3621:1: ( ( rule__Present__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3621:1: ( ( rule__Present__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3622:1: ( rule__Present__Group_1__0 )*
            {
             before(grammarAccess.getPresentAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3623:1: ( rule__Present__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3623:2: rule__Present__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Present__Group_1__0_in_rule__Present__Group__1__Impl7252);
            	    rule__Present__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPresentAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3633:1: rule__Present__Group__2 : rule__Present__Group__2__Impl rule__Present__Group__3 ;
    public final void rule__Present__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3637:1: ( rule__Present__Group__2__Impl rule__Present__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3638:2: rule__Present__Group__2__Impl rule__Present__Group__3
            {
            pushFollow(FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27283);
            rule__Present__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27286);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3645:1: rule__Present__Group__2__Impl : ( 'PRESENT' ) ;
    public final void rule__Present__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3649:1: ( ( 'PRESENT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3650:1: ( 'PRESENT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3650:1: ( 'PRESENT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3651:1: 'PRESENT'
            {
             before(grammarAccess.getPresentAccess().getPRESENTKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Present__Group__2__Impl7314); 
             after(grammarAccess.getPresentAccess().getPRESENTKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3664:1: rule__Present__Group__3 : rule__Present__Group__3__Impl rule__Present__Group__4 ;
    public final void rule__Present__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3668:1: ( rule__Present__Group__3__Impl rule__Present__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3669:2: rule__Present__Group__3__Impl rule__Present__Group__4
            {
            pushFollow(FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37345);
            rule__Present__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37348);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3676:1: rule__Present__Group__3__Impl : ( '(' ) ;
    public final void rule__Present__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3680:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3681:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3681:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3682:1: '('
            {
             before(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Present__Group__3__Impl7376); 
             after(grammarAccess.getPresentAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3695:1: rule__Present__Group__4 : rule__Present__Group__4__Impl rule__Present__Group__5 ;
    public final void rule__Present__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3699:1: ( rule__Present__Group__4__Impl rule__Present__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3700:2: rule__Present__Group__4__Impl rule__Present__Group__5
            {
            pushFollow(FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47407);
            rule__Present__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47410);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3707:1: rule__Present__Group__4__Impl : ( ( rule__Present__SignalAssignment_4 ) ) ;
    public final void rule__Present__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3711:1: ( ( ( rule__Present__SignalAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3712:1: ( ( rule__Present__SignalAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3712:1: ( ( rule__Present__SignalAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3713:1: ( rule__Present__SignalAssignment_4 )
            {
             before(grammarAccess.getPresentAccess().getSignalAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3714:1: ( rule__Present__SignalAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3714:2: rule__Present__SignalAssignment_4
            {
            pushFollow(FOLLOW_rule__Present__SignalAssignment_4_in_rule__Present__Group__4__Impl7437);
            rule__Present__SignalAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getSignalAssignment_4()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3724:1: rule__Present__Group__5 : rule__Present__Group__5__Impl rule__Present__Group__6 ;
    public final void rule__Present__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3728:1: ( rule__Present__Group__5__Impl rule__Present__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3729:2: rule__Present__Group__5__Impl rule__Present__Group__6
            {
            pushFollow(FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57467);
            rule__Present__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57470);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3736:1: rule__Present__Group__5__Impl : ( ')' ) ;
    public final void rule__Present__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3740:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3741:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3741:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3742:1: ')'
            {
             before(grammarAccess.getPresentAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Present__Group__5__Impl7498); 
             after(grammarAccess.getPresentAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3755:1: rule__Present__Group__6 : rule__Present__Group__6__Impl rule__Present__Group__7 ;
    public final void rule__Present__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3759:1: ( rule__Present__Group__6__Impl rule__Present__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3760:2: rule__Present__Group__6__Impl rule__Present__Group__7
            {
            pushFollow(FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67529);
            rule__Present__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67532);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3767:1: rule__Present__Group__6__Impl : ( '{' ) ;
    public final void rule__Present__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3771:1: ( ( '{' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3772:1: ( '{' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3772:1: ( '{' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3773:1: '{'
            {
             before(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__Present__Group__6__Impl7560); 
             after(grammarAccess.getPresentAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3786:1: rule__Present__Group__7 : rule__Present__Group__7__Impl rule__Present__Group__8 ;
    public final void rule__Present__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3790:1: ( rule__Present__Group__7__Impl rule__Present__Group__8 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3791:2: rule__Present__Group__7__Impl rule__Present__Group__8
            {
            pushFollow(FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77591);
            rule__Present__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group__8_in_rule__Present__Group__77594);
            rule__Present__Group__8();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3798:1: rule__Present__Group__7__Impl : ( ( rule__Present__Group_7__0 )* ) ;
    public final void rule__Present__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3802:1: ( ( ( rule__Present__Group_7__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3803:1: ( ( rule__Present__Group_7__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3803:1: ( ( rule__Present__Group_7__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3804:1: ( rule__Present__Group_7__0 )*
            {
             before(grammarAccess.getPresentAccess().getGroup_7()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3805:1: ( rule__Present__Group_7__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==22||(LA29_0>=29 && LA29_0<=33)||(LA29_0>=36 && LA29_0<=41)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3805:2: rule__Present__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Present__Group_7__0_in_rule__Present__Group__7__Impl7621);
            	    rule__Present__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPresentAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start rule__Present__Group__8
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3815:1: rule__Present__Group__8 : rule__Present__Group__8__Impl ;
    public final void rule__Present__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3819:1: ( rule__Present__Group__8__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3820:2: rule__Present__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group__8__Impl_in_rule__Present__Group__87652);
            rule__Present__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group__8


    // $ANTLR start rule__Present__Group__8__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3826:1: rule__Present__Group__8__Impl : ( '}' ) ;
    public final void rule__Present__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3830:1: ( ( '}' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3831:1: ( '}' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3831:1: ( '}' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3832:1: '}'
            {
             before(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_35_in_rule__Present__Group__8__Impl7680); 
             after(grammarAccess.getPresentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group__8__Impl


    // $ANTLR start rule__Present__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3863:1: rule__Present__Group_1__0 : rule__Present__Group_1__0__Impl rule__Present__Group_1__1 ;
    public final void rule__Present__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3867:1: ( rule__Present__Group_1__0__Impl rule__Present__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3868:2: rule__Present__Group_1__0__Impl rule__Present__Group_1__1
            {
            pushFollow(FOLLOW_rule__Present__Group_1__0__Impl_in_rule__Present__Group_1__07729);
            rule__Present__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_1__1_in_rule__Present__Group_1__07732);
            rule__Present__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_1__0


    // $ANTLR start rule__Present__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3875:1: rule__Present__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Present__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3879:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3880:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3880:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3881:1: ','
            {
             before(grammarAccess.getPresentAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Present__Group_1__0__Impl7760); 
             after(grammarAccess.getPresentAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_1__0__Impl


    // $ANTLR start rule__Present__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3894:1: rule__Present__Group_1__1 : rule__Present__Group_1__1__Impl ;
    public final void rule__Present__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3898:1: ( rule__Present__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3899:2: rule__Present__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_1__1__Impl_in_rule__Present__Group_1__17791);
            rule__Present__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_1__1


    // $ANTLR start rule__Present__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3905:1: rule__Present__Group_1__1__Impl : ( ( rule__Present__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Present__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3909:1: ( ( ( rule__Present__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3910:1: ( ( rule__Present__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3910:1: ( ( rule__Present__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3911:1: ( rule__Present__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getPresentAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3912:1: ( rule__Present__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3912:2: rule__Present__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Present__AnnotationsAssignment_1_1_in_rule__Present__Group_1__1__Impl7818);
            rule__Present__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_1__1__Impl


    // $ANTLR start rule__Present__Group_7__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3926:1: rule__Present__Group_7__0 : rule__Present__Group_7__0__Impl rule__Present__Group_7__1 ;
    public final void rule__Present__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3930:1: ( rule__Present__Group_7__0__Impl rule__Present__Group_7__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3931:2: rule__Present__Group_7__0__Impl rule__Present__Group_7__1
            {
            pushFollow(FOLLOW_rule__Present__Group_7__0__Impl_in_rule__Present__Group_7__07852);
            rule__Present__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Present__Group_7__1_in_rule__Present__Group_7__07855);
            rule__Present__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_7__0


    // $ANTLR start rule__Present__Group_7__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3938:1: rule__Present__Group_7__0__Impl : ( ( rule__Present__InstructionsAssignment_7_0 ) ) ;
    public final void rule__Present__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3942:1: ( ( ( rule__Present__InstructionsAssignment_7_0 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3943:1: ( ( rule__Present__InstructionsAssignment_7_0 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3943:1: ( ( rule__Present__InstructionsAssignment_7_0 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3944:1: ( rule__Present__InstructionsAssignment_7_0 )
            {
             before(grammarAccess.getPresentAccess().getInstructionsAssignment_7_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3945:1: ( rule__Present__InstructionsAssignment_7_0 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3945:2: rule__Present__InstructionsAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Present__InstructionsAssignment_7_0_in_rule__Present__Group_7__0__Impl7882);
            rule__Present__InstructionsAssignment_7_0();
            _fsp--;


            }

             after(grammarAccess.getPresentAccess().getInstructionsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_7__0__Impl


    // $ANTLR start rule__Present__Group_7__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3955:1: rule__Present__Group_7__1 : rule__Present__Group_7__1__Impl ;
    public final void rule__Present__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3959:1: ( rule__Present__Group_7__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3960:2: rule__Present__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Present__Group_7__1__Impl_in_rule__Present__Group_7__17912);
            rule__Present__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_7__1


    // $ANTLR start rule__Present__Group_7__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3966:1: rule__Present__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Present__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3970:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3971:1: ( ';' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3971:1: ( ';' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3972:1: ';'
            {
             before(grammarAccess.getPresentAccess().getSemicolonKeyword_7_1()); 
            match(input,21,FOLLOW_21_in_rule__Present__Group_7__1__Impl7940); 
             after(grammarAccess.getPresentAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__Group_7__1__Impl


    // $ANTLR start rule__Goto__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3989:1: rule__Goto__Group__0 : rule__Goto__Group__0__Impl rule__Goto__Group__1 ;
    public final void rule__Goto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3993:1: ( rule__Goto__Group__0__Impl rule__Goto__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:3994:2: rule__Goto__Group__0__Impl rule__Goto__Group__1
            {
            pushFollow(FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__07975);
            rule__Goto__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__07978);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4001:1: rule__Goto__Group__0__Impl : ( ( rule__Goto__AnnotationsAssignment_0 )? ) ;
    public final void rule__Goto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4005:1: ( ( ( rule__Goto__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4006:1: ( ( rule__Goto__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4006:1: ( ( rule__Goto__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4007:1: ( rule__Goto__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getGotoAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4008:1: ( rule__Goto__AnnotationsAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4008:2: rule__Goto__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Goto__AnnotationsAssignment_0_in_rule__Goto__Group__0__Impl8005);
                    rule__Goto__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGotoAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4018:1: rule__Goto__Group__1 : rule__Goto__Group__1__Impl rule__Goto__Group__2 ;
    public final void rule__Goto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4022:1: ( rule__Goto__Group__1__Impl rule__Goto__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4023:2: rule__Goto__Group__1__Impl rule__Goto__Group__2
            {
            pushFollow(FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__18036);
            rule__Goto__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__18039);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4030:1: rule__Goto__Group__1__Impl : ( ( rule__Goto__Group_1__0 )* ) ;
    public final void rule__Goto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4034:1: ( ( ( rule__Goto__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4035:1: ( ( rule__Goto__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4035:1: ( ( rule__Goto__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4036:1: ( rule__Goto__Group_1__0 )*
            {
             before(grammarAccess.getGotoAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4037:1: ( rule__Goto__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4037:2: rule__Goto__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Goto__Group_1__0_in_rule__Goto__Group__1__Impl8066);
            	    rule__Goto__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGotoAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4047:1: rule__Goto__Group__2 : rule__Goto__Group__2__Impl rule__Goto__Group__3 ;
    public final void rule__Goto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4051:1: ( rule__Goto__Group__2__Impl rule__Goto__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4052:2: rule__Goto__Group__2__Impl rule__Goto__Group__3
            {
            pushFollow(FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__28097);
            rule__Goto__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__28100);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4059:1: rule__Goto__Group__2__Impl : ( 'GOTO' ) ;
    public final void rule__Goto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4063:1: ( ( 'GOTO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4064:1: ( 'GOTO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4064:1: ( 'GOTO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4065:1: 'GOTO'
            {
             before(grammarAccess.getGotoAccess().getGOTOKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Goto__Group__2__Impl8128); 
             after(grammarAccess.getGotoAccess().getGOTOKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4078:1: rule__Goto__Group__3 : rule__Goto__Group__3__Impl rule__Goto__Group__4 ;
    public final void rule__Goto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4082:1: ( rule__Goto__Group__3__Impl rule__Goto__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4083:2: rule__Goto__Group__3__Impl rule__Goto__Group__4
            {
            pushFollow(FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__38159);
            rule__Goto__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__38162);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4090:1: rule__Goto__Group__3__Impl : ( '(' ) ;
    public final void rule__Goto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4094:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4095:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4095:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4096:1: '('
            {
             before(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Goto__Group__3__Impl8190); 
             after(grammarAccess.getGotoAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4109:1: rule__Goto__Group__4 : rule__Goto__Group__4__Impl rule__Goto__Group__5 ;
    public final void rule__Goto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4113:1: ( rule__Goto__Group__4__Impl rule__Goto__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4114:2: rule__Goto__Group__4__Impl rule__Goto__Group__5
            {
            pushFollow(FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__48221);
            rule__Goto__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group__5_in_rule__Goto__Group__48224);
            rule__Goto__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4121:1: rule__Goto__Group__4__Impl : ( ( rule__Goto__StateAssignment_4 ) ) ;
    public final void rule__Goto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4125:1: ( ( ( rule__Goto__StateAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4126:1: ( ( rule__Goto__StateAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4126:1: ( ( rule__Goto__StateAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4127:1: ( rule__Goto__StateAssignment_4 )
            {
             before(grammarAccess.getGotoAccess().getStateAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4128:1: ( rule__Goto__StateAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4128:2: rule__Goto__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Goto__StateAssignment_4_in_rule__Goto__Group__4__Impl8251);
            rule__Goto__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getGotoAccess().getStateAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Goto__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4138:1: rule__Goto__Group__5 : rule__Goto__Group__5__Impl ;
    public final void rule__Goto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4142:1: ( rule__Goto__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4143:2: rule__Goto__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group__5__Impl_in_rule__Goto__Group__58281);
            rule__Goto__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group__5


    // $ANTLR start rule__Goto__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4149:1: rule__Goto__Group__5__Impl : ( ')' ) ;
    public final void rule__Goto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4153:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4154:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4154:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4155:1: ')'
            {
             before(grammarAccess.getGotoAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Goto__Group__5__Impl8309); 
             after(grammarAccess.getGotoAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group__5__Impl


    // $ANTLR start rule__Goto__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4180:1: rule__Goto__Group_1__0 : rule__Goto__Group_1__0__Impl rule__Goto__Group_1__1 ;
    public final void rule__Goto__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4184:1: ( rule__Goto__Group_1__0__Impl rule__Goto__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4185:2: rule__Goto__Group_1__0__Impl rule__Goto__Group_1__1
            {
            pushFollow(FOLLOW_rule__Goto__Group_1__0__Impl_in_rule__Goto__Group_1__08352);
            rule__Goto__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goto__Group_1__1_in_rule__Goto__Group_1__08355);
            rule__Goto__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group_1__0


    // $ANTLR start rule__Goto__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4192:1: rule__Goto__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Goto__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4196:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4197:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4197:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4198:1: ','
            {
             before(grammarAccess.getGotoAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Goto__Group_1__0__Impl8383); 
             after(grammarAccess.getGotoAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group_1__0__Impl


    // $ANTLR start rule__Goto__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4211:1: rule__Goto__Group_1__1 : rule__Goto__Group_1__1__Impl ;
    public final void rule__Goto__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4215:1: ( rule__Goto__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4216:2: rule__Goto__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Goto__Group_1__1__Impl_in_rule__Goto__Group_1__18414);
            rule__Goto__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group_1__1


    // $ANTLR start rule__Goto__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4222:1: rule__Goto__Group_1__1__Impl : ( ( rule__Goto__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Goto__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4226:1: ( ( ( rule__Goto__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4227:1: ( ( rule__Goto__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4227:1: ( ( rule__Goto__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4228:1: ( rule__Goto__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getGotoAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4229:1: ( rule__Goto__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4229:2: rule__Goto__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Goto__AnnotationsAssignment_1_1_in_rule__Goto__Group_1__1__Impl8441);
            rule__Goto__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getGotoAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__Group_1__1__Impl


    // $ANTLR start rule__Fork__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4243:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4247:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4248:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08475);
            rule__Fork__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08478);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4255:1: rule__Fork__Group__0__Impl : ( ( rule__Fork__AnnotationsAssignment_0 )? ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4259:1: ( ( ( rule__Fork__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4260:1: ( ( rule__Fork__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4260:1: ( ( rule__Fork__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4261:1: ( rule__Fork__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getForkAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4262:1: ( rule__Fork__AnnotationsAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4262:2: rule__Fork__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Fork__AnnotationsAssignment_0_in_rule__Fork__Group__0__Impl8505);
                    rule__Fork__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4272:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4276:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4277:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18536);
            rule__Fork__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18539);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4284:1: rule__Fork__Group__1__Impl : ( ( rule__Fork__Group_1__0 )* ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4288:1: ( ( ( rule__Fork__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4289:1: ( ( rule__Fork__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4289:1: ( ( rule__Fork__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4290:1: ( rule__Fork__Group_1__0 )*
            {
             before(grammarAccess.getForkAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4291:1: ( rule__Fork__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4291:2: rule__Fork__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Fork__Group_1__0_in_rule__Fork__Group__1__Impl8566);
            	    rule__Fork__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getForkAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4301:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4305:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4306:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28597);
            rule__Fork__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28600);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4313:1: rule__Fork__Group__2__Impl : ( 'FORK' ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4317:1: ( ( 'FORK' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4318:1: ( 'FORK' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4318:1: ( 'FORK' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4319:1: 'FORK'
            {
             before(grammarAccess.getForkAccess().getFORKKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Fork__Group__2__Impl8628); 
             after(grammarAccess.getForkAccess().getFORKKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4332:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl rule__Fork__Group__4 ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4336:1: ( rule__Fork__Group__3__Impl rule__Fork__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4337:2: rule__Fork__Group__3__Impl rule__Fork__Group__4
            {
            pushFollow(FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38659);
            rule__Fork__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38662);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4344:1: rule__Fork__Group__3__Impl : ( '(' ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4348:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4349:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4349:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4350:1: '('
            {
             before(grammarAccess.getForkAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Fork__Group__3__Impl8690); 
             after(grammarAccess.getForkAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4363:1: rule__Fork__Group__4 : rule__Fork__Group__4__Impl rule__Fork__Group__5 ;
    public final void rule__Fork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4367:1: ( rule__Fork__Group__4__Impl rule__Fork__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4368:2: rule__Fork__Group__4__Impl rule__Fork__Group__5
            {
            pushFollow(FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48721);
            rule__Fork__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48724);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4375:1: rule__Fork__Group__4__Impl : ( ( rule__Fork__StateAssignment_4 ) ) ;
    public final void rule__Fork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4379:1: ( ( ( rule__Fork__StateAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4380:1: ( ( rule__Fork__StateAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4380:1: ( ( rule__Fork__StateAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4381:1: ( rule__Fork__StateAssignment_4 )
            {
             before(grammarAccess.getForkAccess().getStateAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4382:1: ( rule__Fork__StateAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4382:2: rule__Fork__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Fork__StateAssignment_4_in_rule__Fork__Group__4__Impl8751);
            rule__Fork__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getStateAssignment_4()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4392:1: rule__Fork__Group__5 : rule__Fork__Group__5__Impl rule__Fork__Group__6 ;
    public final void rule__Fork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4396:1: ( rule__Fork__Group__5__Impl rule__Fork__Group__6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4397:2: rule__Fork__Group__5__Impl rule__Fork__Group__6
            {
            pushFollow(FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58781);
            rule__Fork__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58784);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4404:1: rule__Fork__Group__5__Impl : ( ',' ) ;
    public final void rule__Fork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4408:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4409:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4409:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4410:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group__5__Impl8812); 
             after(grammarAccess.getForkAccess().getCommaKeyword_5()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4423:1: rule__Fork__Group__6 : rule__Fork__Group__6__Impl rule__Fork__Group__7 ;
    public final void rule__Fork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4427:1: ( rule__Fork__Group__6__Impl rule__Fork__Group__7 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4428:2: rule__Fork__Group__6__Impl rule__Fork__Group__7
            {
            pushFollow(FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68843);
            rule__Fork__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group__7_in_rule__Fork__Group__68846);
            rule__Fork__Group__7();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4435:1: rule__Fork__Group__6__Impl : ( ( rule__Fork__PriorityAssignment_6 ) ) ;
    public final void rule__Fork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4439:1: ( ( ( rule__Fork__PriorityAssignment_6 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4440:1: ( ( rule__Fork__PriorityAssignment_6 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4440:1: ( ( rule__Fork__PriorityAssignment_6 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4441:1: ( rule__Fork__PriorityAssignment_6 )
            {
             before(grammarAccess.getForkAccess().getPriorityAssignment_6()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4442:1: ( rule__Fork__PriorityAssignment_6 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4442:2: rule__Fork__PriorityAssignment_6
            {
            pushFollow(FOLLOW_rule__Fork__PriorityAssignment_6_in_rule__Fork__Group__6__Impl8873);
            rule__Fork__PriorityAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getPriorityAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start rule__Fork__Group__7
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4452:1: rule__Fork__Group__7 : rule__Fork__Group__7__Impl ;
    public final void rule__Fork__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4456:1: ( rule__Fork__Group__7__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4457:2: rule__Fork__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group__7__Impl_in_rule__Fork__Group__78903);
            rule__Fork__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group__7


    // $ANTLR start rule__Fork__Group__7__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4463:1: rule__Fork__Group__7__Impl : ( ')' ) ;
    public final void rule__Fork__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4467:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4468:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4468:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4469:1: ')'
            {
             before(grammarAccess.getForkAccess().getRightParenthesisKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Fork__Group__7__Impl8931); 
             after(grammarAccess.getForkAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group__7__Impl


    // $ANTLR start rule__Fork__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4498:1: rule__Fork__Group_1__0 : rule__Fork__Group_1__0__Impl rule__Fork__Group_1__1 ;
    public final void rule__Fork__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4502:1: ( rule__Fork__Group_1__0__Impl rule__Fork__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4503:2: rule__Fork__Group_1__0__Impl rule__Fork__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fork__Group_1__0__Impl_in_rule__Fork__Group_1__08978);
            rule__Fork__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fork__Group_1__1_in_rule__Fork__Group_1__08981);
            rule__Fork__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group_1__0


    // $ANTLR start rule__Fork__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4510:1: rule__Fork__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Fork__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4514:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4515:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4515:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4516:1: ','
            {
             before(grammarAccess.getForkAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Fork__Group_1__0__Impl9009); 
             after(grammarAccess.getForkAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group_1__0__Impl


    // $ANTLR start rule__Fork__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4529:1: rule__Fork__Group_1__1 : rule__Fork__Group_1__1__Impl ;
    public final void rule__Fork__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4533:1: ( rule__Fork__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4534:2: rule__Fork__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fork__Group_1__1__Impl_in_rule__Fork__Group_1__19040);
            rule__Fork__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group_1__1


    // $ANTLR start rule__Fork__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4540:1: rule__Fork__Group_1__1__Impl : ( ( rule__Fork__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Fork__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4544:1: ( ( ( rule__Fork__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4545:1: ( ( rule__Fork__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4545:1: ( ( rule__Fork__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4546:1: ( rule__Fork__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getForkAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4547:1: ( rule__Fork__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4547:2: rule__Fork__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fork__AnnotationsAssignment_1_1_in_rule__Fork__Group_1__1__Impl9067);
            rule__Fork__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getForkAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__Group_1__1__Impl


    // $ANTLR start rule__Forke__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4561:1: rule__Forke__Group__0 : rule__Forke__Group__0__Impl rule__Forke__Group__1 ;
    public final void rule__Forke__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4565:1: ( rule__Forke__Group__0__Impl rule__Forke__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4566:2: rule__Forke__Group__0__Impl rule__Forke__Group__1
            {
            pushFollow(FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__09101);
            rule__Forke__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__09104);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4573:1: rule__Forke__Group__0__Impl : ( ( rule__Forke__AnnotationsAssignment_0 )? ) ;
    public final void rule__Forke__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4577:1: ( ( ( rule__Forke__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4578:1: ( ( rule__Forke__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4578:1: ( ( rule__Forke__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4579:1: ( rule__Forke__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getForkeAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4580:1: ( rule__Forke__AnnotationsAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4580:2: rule__Forke__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Forke__AnnotationsAssignment_0_in_rule__Forke__Group__0__Impl9131);
                    rule__Forke__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4590:1: rule__Forke__Group__1 : rule__Forke__Group__1__Impl rule__Forke__Group__2 ;
    public final void rule__Forke__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4594:1: ( rule__Forke__Group__1__Impl rule__Forke__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4595:2: rule__Forke__Group__1__Impl rule__Forke__Group__2
            {
            pushFollow(FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__19162);
            rule__Forke__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__19165);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4602:1: rule__Forke__Group__1__Impl : ( ( rule__Forke__Group_1__0 )* ) ;
    public final void rule__Forke__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4606:1: ( ( ( rule__Forke__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4607:1: ( ( rule__Forke__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4607:1: ( ( rule__Forke__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4608:1: ( rule__Forke__Group_1__0 )*
            {
             before(grammarAccess.getForkeAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4609:1: ( rule__Forke__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==22) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4609:2: rule__Forke__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Forke__Group_1__0_in_rule__Forke__Group__1__Impl9192);
            	    rule__Forke__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getForkeAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4619:1: rule__Forke__Group__2 : rule__Forke__Group__2__Impl rule__Forke__Group__3 ;
    public final void rule__Forke__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4623:1: ( rule__Forke__Group__2__Impl rule__Forke__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4624:2: rule__Forke__Group__2__Impl rule__Forke__Group__3
            {
            pushFollow(FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__29223);
            rule__Forke__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__29226);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4631:1: rule__Forke__Group__2__Impl : ( 'FORKE' ) ;
    public final void rule__Forke__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4635:1: ( ( 'FORKE' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4636:1: ( 'FORKE' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4636:1: ( 'FORKE' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4637:1: 'FORKE'
            {
             before(grammarAccess.getForkeAccess().getFORKEKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Forke__Group__2__Impl9254); 
             after(grammarAccess.getForkeAccess().getFORKEKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4650:1: rule__Forke__Group__3 : rule__Forke__Group__3__Impl rule__Forke__Group__4 ;
    public final void rule__Forke__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4654:1: ( rule__Forke__Group__3__Impl rule__Forke__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4655:2: rule__Forke__Group__3__Impl rule__Forke__Group__4
            {
            pushFollow(FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__39285);
            rule__Forke__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__39288);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4662:1: rule__Forke__Group__3__Impl : ( '(' ) ;
    public final void rule__Forke__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4666:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4667:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4667:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4668:1: '('
            {
             before(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Forke__Group__3__Impl9316); 
             after(grammarAccess.getForkeAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4681:1: rule__Forke__Group__4 : rule__Forke__Group__4__Impl rule__Forke__Group__5 ;
    public final void rule__Forke__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4685:1: ( rule__Forke__Group__4__Impl rule__Forke__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4686:2: rule__Forke__Group__4__Impl rule__Forke__Group__5
            {
            pushFollow(FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__49347);
            rule__Forke__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group__5_in_rule__Forke__Group__49350);
            rule__Forke__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4693:1: rule__Forke__Group__4__Impl : ( ( rule__Forke__StateAssignment_4 ) ) ;
    public final void rule__Forke__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4697:1: ( ( ( rule__Forke__StateAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4698:1: ( ( rule__Forke__StateAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4698:1: ( ( rule__Forke__StateAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4699:1: ( rule__Forke__StateAssignment_4 )
            {
             before(grammarAccess.getForkeAccess().getStateAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4700:1: ( rule__Forke__StateAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4700:2: rule__Forke__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Forke__StateAssignment_4_in_rule__Forke__Group__4__Impl9377);
            rule__Forke__StateAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getForkeAccess().getStateAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Forke__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4710:1: rule__Forke__Group__5 : rule__Forke__Group__5__Impl ;
    public final void rule__Forke__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4714:1: ( rule__Forke__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4715:2: rule__Forke__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group__5__Impl_in_rule__Forke__Group__59407);
            rule__Forke__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group__5


    // $ANTLR start rule__Forke__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4721:1: rule__Forke__Group__5__Impl : ( ')' ) ;
    public final void rule__Forke__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4725:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4726:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4726:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4727:1: ')'
            {
             before(grammarAccess.getForkeAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Forke__Group__5__Impl9435); 
             after(grammarAccess.getForkeAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group__5__Impl


    // $ANTLR start rule__Forke__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4752:1: rule__Forke__Group_1__0 : rule__Forke__Group_1__0__Impl rule__Forke__Group_1__1 ;
    public final void rule__Forke__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4756:1: ( rule__Forke__Group_1__0__Impl rule__Forke__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4757:2: rule__Forke__Group_1__0__Impl rule__Forke__Group_1__1
            {
            pushFollow(FOLLOW_rule__Forke__Group_1__0__Impl_in_rule__Forke__Group_1__09478);
            rule__Forke__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forke__Group_1__1_in_rule__Forke__Group_1__09481);
            rule__Forke__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group_1__0


    // $ANTLR start rule__Forke__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4764:1: rule__Forke__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Forke__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4768:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4769:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4769:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4770:1: ','
            {
             before(grammarAccess.getForkeAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Forke__Group_1__0__Impl9509); 
             after(grammarAccess.getForkeAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group_1__0__Impl


    // $ANTLR start rule__Forke__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4783:1: rule__Forke__Group_1__1 : rule__Forke__Group_1__1__Impl ;
    public final void rule__Forke__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4787:1: ( rule__Forke__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4788:2: rule__Forke__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Forke__Group_1__1__Impl_in_rule__Forke__Group_1__19540);
            rule__Forke__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group_1__1


    // $ANTLR start rule__Forke__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4794:1: rule__Forke__Group_1__1__Impl : ( ( rule__Forke__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Forke__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4798:1: ( ( ( rule__Forke__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4799:1: ( ( rule__Forke__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4799:1: ( ( rule__Forke__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4800:1: ( rule__Forke__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getForkeAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4801:1: ( rule__Forke__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4801:2: rule__Forke__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Forke__AnnotationsAssignment_1_1_in_rule__Forke__Group_1__1__Impl9567);
            rule__Forke__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getForkeAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__Group_1__1__Impl


    // $ANTLR start rule__Emit__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4815:1: rule__Emit__Group__0 : rule__Emit__Group__0__Impl rule__Emit__Group__1 ;
    public final void rule__Emit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4819:1: ( rule__Emit__Group__0__Impl rule__Emit__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4820:2: rule__Emit__Group__0__Impl rule__Emit__Group__1
            {
            pushFollow(FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09601);
            rule__Emit__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09604);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4827:1: rule__Emit__Group__0__Impl : ( ( rule__Emit__AnnotationsAssignment_0 )? ) ;
    public final void rule__Emit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4831:1: ( ( ( rule__Emit__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4832:1: ( ( rule__Emit__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4832:1: ( ( rule__Emit__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4833:1: ( rule__Emit__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getEmitAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4834:1: ( rule__Emit__AnnotationsAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4834:2: rule__Emit__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Emit__AnnotationsAssignment_0_in_rule__Emit__Group__0__Impl9631);
                    rule__Emit__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmitAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4844:1: rule__Emit__Group__1 : rule__Emit__Group__1__Impl rule__Emit__Group__2 ;
    public final void rule__Emit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4848:1: ( rule__Emit__Group__1__Impl rule__Emit__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4849:2: rule__Emit__Group__1__Impl rule__Emit__Group__2
            {
            pushFollow(FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19662);
            rule__Emit__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19665);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4856:1: rule__Emit__Group__1__Impl : ( ( rule__Emit__Group_1__0 )* ) ;
    public final void rule__Emit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4860:1: ( ( ( rule__Emit__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4861:1: ( ( rule__Emit__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4861:1: ( ( rule__Emit__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4862:1: ( rule__Emit__Group_1__0 )*
            {
             before(grammarAccess.getEmitAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4863:1: ( rule__Emit__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==22) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4863:2: rule__Emit__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Emit__Group_1__0_in_rule__Emit__Group__1__Impl9692);
            	    rule__Emit__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getEmitAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4873:1: rule__Emit__Group__2 : rule__Emit__Group__2__Impl rule__Emit__Group__3 ;
    public final void rule__Emit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4877:1: ( rule__Emit__Group__2__Impl rule__Emit__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4878:2: rule__Emit__Group__2__Impl rule__Emit__Group__3
            {
            pushFollow(FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29723);
            rule__Emit__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29726);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4885:1: rule__Emit__Group__2__Impl : ( 'EMIT' ) ;
    public final void rule__Emit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4889:1: ( ( 'EMIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4890:1: ( 'EMIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4890:1: ( 'EMIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4891:1: 'EMIT'
            {
             before(grammarAccess.getEmitAccess().getEMITKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Emit__Group__2__Impl9754); 
             after(grammarAccess.getEmitAccess().getEMITKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4904:1: rule__Emit__Group__3 : rule__Emit__Group__3__Impl rule__Emit__Group__4 ;
    public final void rule__Emit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4908:1: ( rule__Emit__Group__3__Impl rule__Emit__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4909:2: rule__Emit__Group__3__Impl rule__Emit__Group__4
            {
            pushFollow(FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39785);
            rule__Emit__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39788);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4916:1: rule__Emit__Group__3__Impl : ( '(' ) ;
    public final void rule__Emit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4920:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4921:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4921:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4922:1: '('
            {
             before(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Emit__Group__3__Impl9816); 
             after(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4935:1: rule__Emit__Group__4 : rule__Emit__Group__4__Impl rule__Emit__Group__5 ;
    public final void rule__Emit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4939:1: ( rule__Emit__Group__4__Impl rule__Emit__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4940:2: rule__Emit__Group__4__Impl rule__Emit__Group__5
            {
            pushFollow(FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49847);
            rule__Emit__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group__5_in_rule__Emit__Group__49850);
            rule__Emit__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4947:1: rule__Emit__Group__4__Impl : ( ( rule__Emit__SignalAssignment_4 ) ) ;
    public final void rule__Emit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4951:1: ( ( ( rule__Emit__SignalAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4952:1: ( ( rule__Emit__SignalAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4952:1: ( ( rule__Emit__SignalAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4953:1: ( rule__Emit__SignalAssignment_4 )
            {
             before(grammarAccess.getEmitAccess().getSignalAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4954:1: ( rule__Emit__SignalAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4954:2: rule__Emit__SignalAssignment_4
            {
            pushFollow(FOLLOW_rule__Emit__SignalAssignment_4_in_rule__Emit__Group__4__Impl9877);
            rule__Emit__SignalAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getEmitAccess().getSignalAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Emit__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4964:1: rule__Emit__Group__5 : rule__Emit__Group__5__Impl ;
    public final void rule__Emit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4968:1: ( rule__Emit__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4969:2: rule__Emit__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group__5__Impl_in_rule__Emit__Group__59907);
            rule__Emit__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group__5


    // $ANTLR start rule__Emit__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4975:1: rule__Emit__Group__5__Impl : ( ')' ) ;
    public final void rule__Emit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4979:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4980:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4980:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:4981:1: ')'
            {
             before(grammarAccess.getEmitAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Emit__Group__5__Impl9935); 
             after(grammarAccess.getEmitAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group__5__Impl


    // $ANTLR start rule__Emit__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5006:1: rule__Emit__Group_1__0 : rule__Emit__Group_1__0__Impl rule__Emit__Group_1__1 ;
    public final void rule__Emit__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5010:1: ( rule__Emit__Group_1__0__Impl rule__Emit__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5011:2: rule__Emit__Group_1__0__Impl rule__Emit__Group_1__1
            {
            pushFollow(FOLLOW_rule__Emit__Group_1__0__Impl_in_rule__Emit__Group_1__09978);
            rule__Emit__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Emit__Group_1__1_in_rule__Emit__Group_1__09981);
            rule__Emit__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group_1__0


    // $ANTLR start rule__Emit__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5018:1: rule__Emit__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Emit__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5022:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5023:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5023:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5024:1: ','
            {
             before(grammarAccess.getEmitAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Emit__Group_1__0__Impl10009); 
             after(grammarAccess.getEmitAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group_1__0__Impl


    // $ANTLR start rule__Emit__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5037:1: rule__Emit__Group_1__1 : rule__Emit__Group_1__1__Impl ;
    public final void rule__Emit__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5041:1: ( rule__Emit__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5042:2: rule__Emit__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Emit__Group_1__1__Impl_in_rule__Emit__Group_1__110040);
            rule__Emit__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group_1__1


    // $ANTLR start rule__Emit__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5048:1: rule__Emit__Group_1__1__Impl : ( ( rule__Emit__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Emit__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5052:1: ( ( ( rule__Emit__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5053:1: ( ( rule__Emit__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5053:1: ( ( rule__Emit__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5054:1: ( rule__Emit__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getEmitAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5055:1: ( rule__Emit__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5055:2: rule__Emit__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Emit__AnnotationsAssignment_1_1_in_rule__Emit__Group_1__1__Impl10067);
            rule__Emit__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getEmitAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__Group_1__1__Impl


    // $ANTLR start rule__Await__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5069:1: rule__Await__Group__0 : rule__Await__Group__0__Impl rule__Await__Group__1 ;
    public final void rule__Await__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5073:1: ( rule__Await__Group__0__Impl rule__Await__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5074:2: rule__Await__Group__0__Impl rule__Await__Group__1
            {
            pushFollow(FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__010101);
            rule__Await__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__1_in_rule__Await__Group__010104);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5081:1: rule__Await__Group__0__Impl : ( ( rule__Await__AnnotationsAssignment_0 )? ) ;
    public final void rule__Await__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5085:1: ( ( ( rule__Await__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5086:1: ( ( rule__Await__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5086:1: ( ( rule__Await__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5087:1: ( rule__Await__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getAwaitAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5088:1: ( rule__Await__AnnotationsAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5088:2: rule__Await__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Await__AnnotationsAssignment_0_in_rule__Await__Group__0__Impl10131);
                    rule__Await__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAwaitAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5098:1: rule__Await__Group__1 : rule__Await__Group__1__Impl rule__Await__Group__2 ;
    public final void rule__Await__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5102:1: ( rule__Await__Group__1__Impl rule__Await__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5103:2: rule__Await__Group__1__Impl rule__Await__Group__2
            {
            pushFollow(FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__110162);
            rule__Await__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__2_in_rule__Await__Group__110165);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5110:1: rule__Await__Group__1__Impl : ( ( rule__Await__Group_1__0 )* ) ;
    public final void rule__Await__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5114:1: ( ( ( rule__Await__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5115:1: ( ( rule__Await__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5115:1: ( ( rule__Await__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5116:1: ( rule__Await__Group_1__0 )*
            {
             before(grammarAccess.getAwaitAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5117:1: ( rule__Await__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5117:2: rule__Await__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Await__Group_1__0_in_rule__Await__Group__1__Impl10192);
            	    rule__Await__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getAwaitAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5127:1: rule__Await__Group__2 : rule__Await__Group__2__Impl rule__Await__Group__3 ;
    public final void rule__Await__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5131:1: ( rule__Await__Group__2__Impl rule__Await__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5132:2: rule__Await__Group__2__Impl rule__Await__Group__3
            {
            pushFollow(FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__210223);
            rule__Await__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__3_in_rule__Await__Group__210226);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5139:1: rule__Await__Group__2__Impl : ( 'AWAIT' ) ;
    public final void rule__Await__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5143:1: ( ( 'AWAIT' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5144:1: ( 'AWAIT' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5144:1: ( 'AWAIT' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5145:1: 'AWAIT'
            {
             before(grammarAccess.getAwaitAccess().getAWAITKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Await__Group__2__Impl10254); 
             after(grammarAccess.getAwaitAccess().getAWAITKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5158:1: rule__Await__Group__3 : rule__Await__Group__3__Impl rule__Await__Group__4 ;
    public final void rule__Await__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5162:1: ( rule__Await__Group__3__Impl rule__Await__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5163:2: rule__Await__Group__3__Impl rule__Await__Group__4
            {
            pushFollow(FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__310285);
            rule__Await__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__4_in_rule__Await__Group__310288);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5170:1: rule__Await__Group__3__Impl : ( '(' ) ;
    public final void rule__Await__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5174:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5175:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5175:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5176:1: '('
            {
             before(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Await__Group__3__Impl10316); 
             after(grammarAccess.getAwaitAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5189:1: rule__Await__Group__4 : rule__Await__Group__4__Impl rule__Await__Group__5 ;
    public final void rule__Await__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5193:1: ( rule__Await__Group__4__Impl rule__Await__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5194:2: rule__Await__Group__4__Impl rule__Await__Group__5
            {
            pushFollow(FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__410347);
            rule__Await__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group__5_in_rule__Await__Group__410350);
            rule__Await__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5201:1: rule__Await__Group__4__Impl : ( ( rule__Await__SignalAssignment_4 ) ) ;
    public final void rule__Await__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5205:1: ( ( ( rule__Await__SignalAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5206:1: ( ( rule__Await__SignalAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5206:1: ( ( rule__Await__SignalAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5207:1: ( rule__Await__SignalAssignment_4 )
            {
             before(grammarAccess.getAwaitAccess().getSignalAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5208:1: ( rule__Await__SignalAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5208:2: rule__Await__SignalAssignment_4
            {
            pushFollow(FOLLOW_rule__Await__SignalAssignment_4_in_rule__Await__Group__4__Impl10377);
            rule__Await__SignalAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAwaitAccess().getSignalAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Await__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5218:1: rule__Await__Group__5 : rule__Await__Group__5__Impl ;
    public final void rule__Await__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5222:1: ( rule__Await__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5223:2: rule__Await__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group__5__Impl_in_rule__Await__Group__510407);
            rule__Await__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group__5


    // $ANTLR start rule__Await__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5229:1: rule__Await__Group__5__Impl : ( ')' ) ;
    public final void rule__Await__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5233:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5234:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5234:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5235:1: ')'
            {
             before(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Await__Group__5__Impl10435); 
             after(grammarAccess.getAwaitAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group__5__Impl


    // $ANTLR start rule__Await__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5260:1: rule__Await__Group_1__0 : rule__Await__Group_1__0__Impl rule__Await__Group_1__1 ;
    public final void rule__Await__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5264:1: ( rule__Await__Group_1__0__Impl rule__Await__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5265:2: rule__Await__Group_1__0__Impl rule__Await__Group_1__1
            {
            pushFollow(FOLLOW_rule__Await__Group_1__0__Impl_in_rule__Await__Group_1__010478);
            rule__Await__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Await__Group_1__1_in_rule__Await__Group_1__010481);
            rule__Await__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group_1__0


    // $ANTLR start rule__Await__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5272:1: rule__Await__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Await__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5276:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5277:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5277:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5278:1: ','
            {
             before(grammarAccess.getAwaitAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Await__Group_1__0__Impl10509); 
             after(grammarAccess.getAwaitAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group_1__0__Impl


    // $ANTLR start rule__Await__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5291:1: rule__Await__Group_1__1 : rule__Await__Group_1__1__Impl ;
    public final void rule__Await__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5295:1: ( rule__Await__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5296:2: rule__Await__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Await__Group_1__1__Impl_in_rule__Await__Group_1__110540);
            rule__Await__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group_1__1


    // $ANTLR start rule__Await__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5302:1: rule__Await__Group_1__1__Impl : ( ( rule__Await__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Await__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5306:1: ( ( ( rule__Await__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5307:1: ( ( rule__Await__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5307:1: ( ( rule__Await__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5308:1: ( rule__Await__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getAwaitAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5309:1: ( rule__Await__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5309:2: rule__Await__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Await__AnnotationsAssignment_1_1_in_rule__Await__Group_1__1__Impl10567);
            rule__Await__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAwaitAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__Group_1__1__Impl


    // $ANTLR start rule__Prio__Group__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5323:1: rule__Prio__Group__0 : rule__Prio__Group__0__Impl rule__Prio__Group__1 ;
    public final void rule__Prio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5327:1: ( rule__Prio__Group__0__Impl rule__Prio__Group__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5328:2: rule__Prio__Group__0__Impl rule__Prio__Group__1
            {
            pushFollow(FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__010601);
            rule__Prio__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__010604);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5335:1: rule__Prio__Group__0__Impl : ( ( rule__Prio__AnnotationsAssignment_0 )? ) ;
    public final void rule__Prio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5339:1: ( ( ( rule__Prio__AnnotationsAssignment_0 )? ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5340:1: ( ( rule__Prio__AnnotationsAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5340:1: ( ( rule__Prio__AnnotationsAssignment_0 )? )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5341:1: ( rule__Prio__AnnotationsAssignment_0 )?
            {
             before(grammarAccess.getPrioAccess().getAnnotationsAssignment_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5342:1: ( rule__Prio__AnnotationsAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5342:2: rule__Prio__AnnotationsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Prio__AnnotationsAssignment_0_in_rule__Prio__Group__0__Impl10631);
                    rule__Prio__AnnotationsAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrioAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5352:1: rule__Prio__Group__1 : rule__Prio__Group__1__Impl rule__Prio__Group__2 ;
    public final void rule__Prio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5356:1: ( rule__Prio__Group__1__Impl rule__Prio__Group__2 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5357:2: rule__Prio__Group__1__Impl rule__Prio__Group__2
            {
            pushFollow(FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110662);
            rule__Prio__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110665);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5364:1: rule__Prio__Group__1__Impl : ( ( rule__Prio__Group_1__0 )* ) ;
    public final void rule__Prio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5368:1: ( ( ( rule__Prio__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5369:1: ( ( rule__Prio__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5369:1: ( ( rule__Prio__Group_1__0 )* )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5370:1: ( rule__Prio__Group_1__0 )*
            {
             before(grammarAccess.getPrioAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5371:1: ( rule__Prio__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==22) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5371:2: rule__Prio__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Prio__Group_1__0_in_rule__Prio__Group__1__Impl10692);
            	    rule__Prio__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getPrioAccess().getGroup_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5381:1: rule__Prio__Group__2 : rule__Prio__Group__2__Impl rule__Prio__Group__3 ;
    public final void rule__Prio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5385:1: ( rule__Prio__Group__2__Impl rule__Prio__Group__3 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5386:2: rule__Prio__Group__2__Impl rule__Prio__Group__3
            {
            pushFollow(FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210723);
            rule__Prio__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210726);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5393:1: rule__Prio__Group__2__Impl : ( 'PRIO' ) ;
    public final void rule__Prio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5397:1: ( ( 'PRIO' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5398:1: ( 'PRIO' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5398:1: ( 'PRIO' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5399:1: 'PRIO'
            {
             before(grammarAccess.getPrioAccess().getPRIOKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Prio__Group__2__Impl10754); 
             after(grammarAccess.getPrioAccess().getPRIOKeyword_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5412:1: rule__Prio__Group__3 : rule__Prio__Group__3__Impl rule__Prio__Group__4 ;
    public final void rule__Prio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5416:1: ( rule__Prio__Group__3__Impl rule__Prio__Group__4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5417:2: rule__Prio__Group__3__Impl rule__Prio__Group__4
            {
            pushFollow(FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310785);
            rule__Prio__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310788);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5424:1: rule__Prio__Group__3__Impl : ( '(' ) ;
    public final void rule__Prio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5428:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5429:1: ( '(' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5429:1: ( '(' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5430:1: '('
            {
             before(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Prio__Group__3__Impl10816); 
             after(grammarAccess.getPrioAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5443:1: rule__Prio__Group__4 : rule__Prio__Group__4__Impl rule__Prio__Group__5 ;
    public final void rule__Prio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5447:1: ( rule__Prio__Group__4__Impl rule__Prio__Group__5 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5448:2: rule__Prio__Group__4__Impl rule__Prio__Group__5
            {
            pushFollow(FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410847);
            rule__Prio__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group__5_in_rule__Prio__Group__410850);
            rule__Prio__Group__5();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5455:1: rule__Prio__Group__4__Impl : ( ( rule__Prio__PriorityAssignment_4 ) ) ;
    public final void rule__Prio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5459:1: ( ( ( rule__Prio__PriorityAssignment_4 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5460:1: ( ( rule__Prio__PriorityAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5460:1: ( ( rule__Prio__PriorityAssignment_4 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5461:1: ( rule__Prio__PriorityAssignment_4 )
            {
             before(grammarAccess.getPrioAccess().getPriorityAssignment_4()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5462:1: ( rule__Prio__PriorityAssignment_4 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5462:2: rule__Prio__PriorityAssignment_4
            {
            pushFollow(FOLLOW_rule__Prio__PriorityAssignment_4_in_rule__Prio__Group__4__Impl10877);
            rule__Prio__PriorityAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getPriorityAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__Prio__Group__5
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5472:1: rule__Prio__Group__5 : rule__Prio__Group__5__Impl ;
    public final void rule__Prio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5476:1: ( rule__Prio__Group__5__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5477:2: rule__Prio__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group__5__Impl_in_rule__Prio__Group__510907);
            rule__Prio__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group__5


    // $ANTLR start rule__Prio__Group__5__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5483:1: rule__Prio__Group__5__Impl : ( ')' ) ;
    public final void rule__Prio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5487:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5488:1: ( ')' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5488:1: ( ')' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5489:1: ')'
            {
             before(grammarAccess.getPrioAccess().getRightParenthesisKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Prio__Group__5__Impl10935); 
             after(grammarAccess.getPrioAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group__5__Impl


    // $ANTLR start rule__Prio__Group_1__0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5514:1: rule__Prio__Group_1__0 : rule__Prio__Group_1__0__Impl rule__Prio__Group_1__1 ;
    public final void rule__Prio__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5518:1: ( rule__Prio__Group_1__0__Impl rule__Prio__Group_1__1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5519:2: rule__Prio__Group_1__0__Impl rule__Prio__Group_1__1
            {
            pushFollow(FOLLOW_rule__Prio__Group_1__0__Impl_in_rule__Prio__Group_1__010978);
            rule__Prio__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Prio__Group_1__1_in_rule__Prio__Group_1__010981);
            rule__Prio__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group_1__0


    // $ANTLR start rule__Prio__Group_1__0__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5526:1: rule__Prio__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Prio__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5530:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5531:1: ( ',' )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5531:1: ( ',' )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5532:1: ','
            {
             before(grammarAccess.getPrioAccess().getCommaKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Prio__Group_1__0__Impl11009); 
             after(grammarAccess.getPrioAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group_1__0__Impl


    // $ANTLR start rule__Prio__Group_1__1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5545:1: rule__Prio__Group_1__1 : rule__Prio__Group_1__1__Impl ;
    public final void rule__Prio__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5549:1: ( rule__Prio__Group_1__1__Impl )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5550:2: rule__Prio__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Prio__Group_1__1__Impl_in_rule__Prio__Group_1__111040);
            rule__Prio__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group_1__1


    // $ANTLR start rule__Prio__Group_1__1__Impl
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5556:1: rule__Prio__Group_1__1__Impl : ( ( rule__Prio__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Prio__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5560:1: ( ( ( rule__Prio__AnnotationsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5561:1: ( ( rule__Prio__AnnotationsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5561:1: ( ( rule__Prio__AnnotationsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5562:1: ( rule__Prio__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getPrioAccess().getAnnotationsAssignment_1_1()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5563:1: ( rule__Prio__AnnotationsAssignment_1_1 )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5563:2: rule__Prio__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Prio__AnnotationsAssignment_1_1_in_rule__Prio__Group_1__1__Impl11067);
            rule__Prio__AnnotationsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getPrioAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__Group_1__1__Impl


    // $ANTLR start rule__Program__NameAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5578:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5582:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5583:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5583:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5584:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_111106); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5593:1: rule__Program__PriorityAssignment_3 : ( ruleIntValue ) ;
    public final void rule__Program__PriorityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5597:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5598:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5598:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5599:1: ruleIntValue
            {
             before(grammarAccess.getProgramAccess().getPriorityIntValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_311137);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5608:1: rule__Program__SignalsAssignment_5_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5612:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5613:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5613:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5614:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_111168);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5623:1: rule__Program__SignalsAssignment_5_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5627:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5628:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5628:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5629:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_111199);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5638:1: rule__Program__SignalsAssignment_6_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5642:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5643:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5643:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5644:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_111230);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5653:1: rule__Program__SignalsAssignment_6_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5657:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5658:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5658:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5659:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_111261);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5668:1: rule__Program__SignalsAssignment_7_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5672:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5673:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5673:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5674:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_111292);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5683:1: rule__Program__SignalsAssignment_7_2_1 : ( ruleSignal ) ;
    public final void rule__Program__SignalsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5687:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5688:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5688:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5689:1: ruleSignal
            {
             before(grammarAccess.getProgramAccess().getSignalsSignalParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_111323);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5698:1: rule__Program__StatesAssignment_8 : ( ruleState ) ;
    public final void rule__Program__StatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5702:1: ( ( ruleState ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5703:1: ( ruleState )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5703:1: ( ruleState )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5704:1: ruleState
            {
             before(grammarAccess.getProgramAccess().getStatesStateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Program__StatesAssignment_811354);
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


    // $ANTLR start rule__Annotation__KeyAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5713:1: rule__Annotation__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5717:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5718:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5718:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5719:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_011385); 
             after(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__KeyAssignment_0


    // $ANTLR start rule__Annotation__ValueAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5728:1: rule__Annotation__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5732:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5733:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5733:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5734:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_111416); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__ValueAssignment_1


    // $ANTLR start rule__State__NameAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5743:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5747:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5748:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5748:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5749:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_011447); 
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


    // $ANTLR start rule__State__AnnotationsAssignment_2
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5758:1: rule__State__AnnotationsAssignment_2 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5762:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5763:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5763:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5764:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_211478);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__AnnotationsAssignment_2


    // $ANTLR start rule__State__AnnotationsAssignment_3_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5773:1: rule__State__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__State__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5777:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5778:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5778:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5779:1: ruleAnnotation
            {
             before(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_3_111509);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__AnnotationsAssignment_3_1


    // $ANTLR start rule__State__SignalsAssignment_4_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5788:1: rule__State__SignalsAssignment_4_1 : ( ruleSignal ) ;
    public final void rule__State__SignalsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5792:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5793:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5793:1: ( ruleSignal )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5794:1: ruleSignal
            {
             before(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_4_111540);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__SignalsAssignment_4_1


    // $ANTLR start rule__State__InstructionsAssignment_5_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5803:1: rule__State__InstructionsAssignment_5_0 : ( ruleInstruction ) ;
    public final void rule__State__InstructionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5807:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5808:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5808:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5809:1: ruleInstruction
            {
             before(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_5_011571);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getStateAccess().getInstructionsInstructionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__InstructionsAssignment_5_0


    // $ANTLR start rule__StateReference__StateAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5818:1: rule__StateReference__StateAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StateReference__StateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5822:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5823:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5823:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5824:1: ( RULE_ID )
            {
             before(grammarAccess.getStateReferenceAccess().getStateStateCrossReference_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5825:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5826:1: RULE_ID
            {
             before(grammarAccess.getStateReferenceAccess().getStateStateIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateReference__StateAssignment11606); 
             after(grammarAccess.getStateReferenceAccess().getStateStateIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStateReferenceAccess().getStateStateCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateReference__StateAssignment


    // $ANTLR start rule__Signal__NameAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5837:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5841:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5842:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5842:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5843:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011641); 
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5852:1: rule__Signal__TypeAssignment_2 : ( ruleSignalType ) ;
    public final void rule__Signal__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5856:1: ( ( ruleSignalType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5857:1: ( ruleSignalType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5857:1: ( ruleSignalType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5858:1: ruleSignalType
            {
             before(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_211672);
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
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5867:1: rule__Signal__CombineFunctionAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Signal__CombineFunctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5871:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5872:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5872:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5873:1: ( RULE_ID )
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionCrossReference_3_1_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5874:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5875:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getCombineFunctionCombineFunctionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_111707); 
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


    // $ANTLR start rule__Signal__AnnotationsAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5886:1: rule__Signal__AnnotationsAssignment_4 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5890:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5891:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5891:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5892:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_411742);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__AnnotationsAssignment_4


    // $ANTLR start rule__Signal__AnnotationsAssignment_5_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5901:1: rule__Signal__AnnotationsAssignment_5_1 : ( ruleAnnotation ) ;
    public final void rule__Signal__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5905:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5906:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5906:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5907:1: ruleAnnotation
            {
             before(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_5_111773);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getSignalAccess().getAnnotationsAnnotationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__AnnotationsAssignment_5_1


    // $ANTLR start rule__SignalReference__SignalAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5916:1: rule__SignalReference__SignalAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5920:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5921:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5921:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5922:1: ( RULE_ID )
            {
             before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5923:1: ( RULE_ID )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5924:1: RULE_ID
            {
             before(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment11808); 
             after(grammarAccess.getSignalReferenceAccess().getSignalSignalIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__SignalAssignment


    // $ANTLR start rule__CustomSignal__TypeAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5937:1: rule__CustomSignal__TypeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomSignal__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5941:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5942:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5942:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5943:1: RULE_STRING
            {
             before(grammarAccess.getCustomSignalAccess().getTypeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomSignal__TypeAssignment_111845); 
             after(grammarAccess.getCustomSignalAccess().getTypeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CustomSignal__TypeAssignment_1


    // $ANTLR start rule__PrimitiveSignal__TypeAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5952:1: rule__PrimitiveSignal__TypeAssignment : ( rulePrimitiveSignalType ) ;
    public final void rule__PrimitiveSignal__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5956:1: ( ( rulePrimitiveSignalType ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5957:1: ( rulePrimitiveSignalType )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5957:1: ( rulePrimitiveSignalType )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5958:1: rulePrimitiveSignalType
            {
             before(grammarAccess.getPrimitiveSignalAccess().getTypePrimitiveSignalTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveSignalType_in_rule__PrimitiveSignal__TypeAssignment11876);
            rulePrimitiveSignalType();
            _fsp--;

             after(grammarAccess.getPrimitiveSignalAccess().getTypePrimitiveSignalTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrimitiveSignal__TypeAssignment


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5967:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5971:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5972:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5972:1: ( RULE_INT )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5973:1: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11907); 
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


    // $ANTLR start rule__Pause__AnnotationsAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5984:1: rule__Pause__AnnotationsAssignment_4 : ( ruleAnnotation ) ;
    public final void rule__Pause__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5988:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5989:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5989:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5990:1: ruleAnnotation
            {
             before(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Pause__AnnotationsAssignment_411940);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__AnnotationsAssignment_4


    // $ANTLR start rule__Pause__AnnotationsAssignment_5_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:5999:1: rule__Pause__AnnotationsAssignment_5_1 : ( ruleAnnotation ) ;
    public final void rule__Pause__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6003:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6004:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6004:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6005:1: ruleAnnotation
            {
             before(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Pause__AnnotationsAssignment_5_111971);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPauseAccess().getAnnotationsAnnotationParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Pause__AnnotationsAssignment_5_1


    // $ANTLR start rule__Term__AnnotationsAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6014:1: rule__Term__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Term__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6018:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6019:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6019:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6020:1: ruleAnnotation
            {
             before(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Term__AnnotationsAssignment_112002);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__AnnotationsAssignment_1


    // $ANTLR start rule__Term__AnnotationsAssignment_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6029:1: rule__Term__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__Term__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6033:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6034:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6034:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6035:1: ruleAnnotation
            {
             before(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Term__AnnotationsAssignment_2_112033);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getTermAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Term__AnnotationsAssignment_2_1


    // $ANTLR start rule__Join__AnnotationsAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6044:1: rule__Join__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Join__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6048:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6049:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6049:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6050:1: ruleAnnotation
            {
             before(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Join__AnnotationsAssignment_112064);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__AnnotationsAssignment_1


    // $ANTLR start rule__Join__AnnotationsAssignment_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6059:1: rule__Join__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__Join__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6063:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6064:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6064:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6065:1: ruleAnnotation
            {
             before(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Join__AnnotationsAssignment_2_112095);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getJoinAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Join__AnnotationsAssignment_2_1


    // $ANTLR start rule__Abort__AnnotationsAssignment_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6074:1: rule__Abort__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Abort__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6078:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6079:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6079:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6080:1: ruleAnnotation
            {
             before(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Abort__AnnotationsAssignment_112126);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__AnnotationsAssignment_1


    // $ANTLR start rule__Abort__AnnotationsAssignment_2_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6089:1: rule__Abort__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__Abort__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6093:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6094:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6094:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6095:1: ruleAnnotation
            {
             before(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Abort__AnnotationsAssignment_2_112157);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAbortAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Abort__AnnotationsAssignment_2_1


    // $ANTLR start rule__Present__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6104:1: rule__Present__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Present__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6108:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6109:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6109:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6110:1: ruleAnnotation
            {
             before(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Present__AnnotationsAssignment_012188);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__AnnotationsAssignment_0


    // $ANTLR start rule__Present__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6119:1: rule__Present__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Present__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6123:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6124:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6124:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6125:1: ruleAnnotation
            {
             before(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Present__AnnotationsAssignment_1_112219);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPresentAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__AnnotationsAssignment_1_1


    // $ANTLR start rule__Present__SignalAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6134:1: rule__Present__SignalAssignment_4 : ( ruleSignalReference ) ;
    public final void rule__Present__SignalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6138:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6139:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6139:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6140:1: ruleSignalReference
            {
             before(grammarAccess.getPresentAccess().getSignalSignalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSignalReference_in_rule__Present__SignalAssignment_412250);
            ruleSignalReference();
            _fsp--;

             after(grammarAccess.getPresentAccess().getSignalSignalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__SignalAssignment_4


    // $ANTLR start rule__Present__InstructionsAssignment_7_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6149:1: rule__Present__InstructionsAssignment_7_0 : ( ruleInstruction ) ;
    public final void rule__Present__InstructionsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6153:1: ( ( ruleInstruction ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6154:1: ( ruleInstruction )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6154:1: ( ruleInstruction )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6155:1: ruleInstruction
            {
             before(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_7_012281);
            ruleInstruction();
            _fsp--;

             after(grammarAccess.getPresentAccess().getInstructionsInstructionParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Present__InstructionsAssignment_7_0


    // $ANTLR start rule__Goto__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6164:1: rule__Goto__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Goto__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6168:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6169:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6169:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6170:1: ruleAnnotation
            {
             before(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Goto__AnnotationsAssignment_012312);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__AnnotationsAssignment_0


    // $ANTLR start rule__Goto__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6179:1: rule__Goto__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Goto__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6183:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6184:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6184:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6185:1: ruleAnnotation
            {
             before(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Goto__AnnotationsAssignment_1_112343);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getGotoAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__AnnotationsAssignment_1_1


    // $ANTLR start rule__Goto__StateAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6194:1: rule__Goto__StateAssignment_4 : ( ruleStateReference ) ;
    public final void rule__Goto__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6198:1: ( ( ruleStateReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6199:1: ( ruleStateReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6199:1: ( ruleStateReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6200:1: ruleStateReference
            {
             before(grammarAccess.getGotoAccess().getStateStateReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStateReference_in_rule__Goto__StateAssignment_412374);
            ruleStateReference();
            _fsp--;

             after(grammarAccess.getGotoAccess().getStateStateReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goto__StateAssignment_4


    // $ANTLR start rule__Fork__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6209:1: rule__Fork__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Fork__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6213:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6214:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6214:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6215:1: ruleAnnotation
            {
             before(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Fork__AnnotationsAssignment_012405);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__AnnotationsAssignment_0


    // $ANTLR start rule__Fork__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6224:1: rule__Fork__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Fork__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6228:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6229:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6229:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6230:1: ruleAnnotation
            {
             before(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Fork__AnnotationsAssignment_1_112436);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getForkAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__AnnotationsAssignment_1_1


    // $ANTLR start rule__Fork__StateAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6239:1: rule__Fork__StateAssignment_4 : ( ruleStateReference ) ;
    public final void rule__Fork__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6243:1: ( ( ruleStateReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6244:1: ( ruleStateReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6244:1: ( ruleStateReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6245:1: ruleStateReference
            {
             before(grammarAccess.getForkAccess().getStateStateReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStateReference_in_rule__Fork__StateAssignment_412467);
            ruleStateReference();
            _fsp--;

             after(grammarAccess.getForkAccess().getStateStateReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__StateAssignment_4


    // $ANTLR start rule__Fork__PriorityAssignment_6
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6254:1: rule__Fork__PriorityAssignment_6 : ( ruleIntValue ) ;
    public final void rule__Fork__PriorityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6258:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6259:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6259:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6260:1: ruleIntValue
            {
             before(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_612498);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getForkAccess().getPriorityIntValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fork__PriorityAssignment_6


    // $ANTLR start rule__Forke__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6269:1: rule__Forke__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Forke__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6273:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6274:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6274:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6275:1: ruleAnnotation
            {
             before(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Forke__AnnotationsAssignment_012529);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__AnnotationsAssignment_0


    // $ANTLR start rule__Forke__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6284:1: rule__Forke__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Forke__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6288:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6289:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6289:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6290:1: ruleAnnotation
            {
             before(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Forke__AnnotationsAssignment_1_112560);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getForkeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__AnnotationsAssignment_1_1


    // $ANTLR start rule__Forke__StateAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6299:1: rule__Forke__StateAssignment_4 : ( ruleStateReference ) ;
    public final void rule__Forke__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6303:1: ( ( ruleStateReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6304:1: ( ruleStateReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6304:1: ( ruleStateReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6305:1: ruleStateReference
            {
             before(grammarAccess.getForkeAccess().getStateStateReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStateReference_in_rule__Forke__StateAssignment_412591);
            ruleStateReference();
            _fsp--;

             after(grammarAccess.getForkeAccess().getStateStateReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forke__StateAssignment_4


    // $ANTLR start rule__Emit__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6314:1: rule__Emit__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Emit__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6318:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6319:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6319:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6320:1: ruleAnnotation
            {
             before(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Emit__AnnotationsAssignment_012622);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__AnnotationsAssignment_0


    // $ANTLR start rule__Emit__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6329:1: rule__Emit__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Emit__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6333:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6334:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6334:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6335:1: ruleAnnotation
            {
             before(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Emit__AnnotationsAssignment_1_112653);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getEmitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__AnnotationsAssignment_1_1


    // $ANTLR start rule__Emit__SignalAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6344:1: rule__Emit__SignalAssignment_4 : ( ruleSignalReference ) ;
    public final void rule__Emit__SignalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6348:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6349:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6349:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6350:1: ruleSignalReference
            {
             before(grammarAccess.getEmitAccess().getSignalSignalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSignalReference_in_rule__Emit__SignalAssignment_412684);
            ruleSignalReference();
            _fsp--;

             after(grammarAccess.getEmitAccess().getSignalSignalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Emit__SignalAssignment_4


    // $ANTLR start rule__Await__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6359:1: rule__Await__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Await__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6363:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6364:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6364:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6365:1: ruleAnnotation
            {
             before(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Await__AnnotationsAssignment_012715);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__AnnotationsAssignment_0


    // $ANTLR start rule__Await__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6374:1: rule__Await__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Await__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6378:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6379:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6379:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6380:1: ruleAnnotation
            {
             before(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Await__AnnotationsAssignment_1_112746);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAwaitAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__AnnotationsAssignment_1_1


    // $ANTLR start rule__Await__SignalAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6389:1: rule__Await__SignalAssignment_4 : ( ruleSignalReference ) ;
    public final void rule__Await__SignalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6393:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6394:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6394:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6395:1: ruleSignalReference
            {
             before(grammarAccess.getAwaitAccess().getSignalSignalReferenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSignalReference_in_rule__Await__SignalAssignment_412777);
            ruleSignalReference();
            _fsp--;

             after(grammarAccess.getAwaitAccess().getSignalSignalReferenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Await__SignalAssignment_4


    // $ANTLR start rule__Prio__AnnotationsAssignment_0
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6404:1: rule__Prio__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Prio__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6408:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6409:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6409:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6410:1: ruleAnnotation
            {
             before(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Prio__AnnotationsAssignment_012808);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__AnnotationsAssignment_0


    // $ANTLR start rule__Prio__AnnotationsAssignment_1_1
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6419:1: rule__Prio__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Prio__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6423:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6424:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6424:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6425:1: ruleAnnotation
            {
             before(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Prio__AnnotationsAssignment_1_112839);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getPrioAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__AnnotationsAssignment_1_1


    // $ANTLR start rule__Prio__PriorityAssignment_4
    // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6434:1: rule__Prio__PriorityAssignment_4 : ( ruleIntValue ) ;
    public final void rule__Prio__PriorityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6438:1: ( ( ruleIntValue ) )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6439:1: ( ruleIntValue )
            {
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6439:1: ( ruleIntValue )
            // ../de.cau.cs.kieler.s.ui/src-gen/de/cau/cs/kieler/s/ui/contentassist/antlr/internal/InternalS.g:6440:1: ruleIntValue
            {
             before(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_412870);
            ruleIntValue();
            _fsp--;

             after(grammarAccess.getPrioAccess().getPriorityIntValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Prio__PriorityAssignment_4


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\21\uffff";
    static final String DFA2_eofS =
        "\21\uffff";
    static final String DFA2_minS =
        "\1\4\1\5\1\4\13\uffff\1\26\1\5\1\26";
    static final String DFA2_maxS =
        "\1\51\1\5\1\4\13\uffff\1\51\1\5\1\51";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff";
    static final String DFA2_specialS =
        "\21\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\21\uffff\1\2\6\uffff\1\5\1\6\1\4\1\3\1\7\2\uffff\1\10\1"+
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
            "\1\2\7\uffff\1\6\1\4\1\3\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14"+
            "\1\15",
            "\1\20",
            "\1\2\7\uffff\1\6\1\4\1\3\1\7\2\uffff\1\10\1\11\1\12\1\13\1\14"+
            "\1\15"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "727:1: rule__Instruction__Alternatives : ( ( ruleAbort ) | ( ruleJoin ) | ( rulePause ) | ( ruleTerm ) | ( rulePresent ) | ( ruleGoto ) | ( ruleFork ) | ( ruleForke ) | ( ruleEmit ) | ( ruleAwait ) | ( rulePrio ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReference_in_entryRuleStateReference243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateReference250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateReference__StateAssignment_in_ruleStateReference276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_ruleSignal336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_entryRuleSignalType425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalType432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignal_in_entryRuleCustomSignal485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomSignal492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignal__Group__0_in_ruleCustomSignal518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignal_in_entryRulePrimitiveSignal545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveSignal552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveSignal__TypeAssignment_in_rulePrimitiveSignal578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__0_in_rulePause762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0_in_ruleJoin882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0_in_ruleAbort942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0_in_rulePresent1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0_in_ruleGoto1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_entryRuleFork1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFork1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0_in_ruleFork1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_entryRuleForke1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForke1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0_in_ruleForke1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0_in_ruleEmit1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0_in_ruleAwait1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_entryRulePrio1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrio1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0_in_rulePrio1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveSignalType__Alternatives_in_rulePrimitiveSignalType1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignal_in_rule__SignalType__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSignal_in_rule__SignalType__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_rule__Instruction__Alternatives1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_rule__Instruction__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_rule__Instruction__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Instruction__Alternatives1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_rule__Instruction__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_rule__Instruction__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFork_in_rule__Instruction__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForke_in_rule__Instruction__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_rule__Instruction__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_rule__Instruction__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrio_in_rule__Instruction__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveSignalType__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveSignalType__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveSignalType__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveSignalType__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Program__Group__0__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11845 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_1_in_rule__Program__Group__1__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21905 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__21908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group__2__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__31967 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__31970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PriorityAssignment_3_in_rule__Program__Group__3__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__42027 = new BitSet(new long[]{0x0000000001900010L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__42030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group__4__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__52089 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__Program__Group__6_in_rule__Program__Group__52092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0_in_rule__Program__Group__5__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__6__Impl_in_rule__Program__Group__62150 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Program__Group__7_in_rule__Program__Group__62153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0_in_rule__Program__Group__6__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__7__Impl_in_rule__Program__Group__72211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group__8_in_rule__Program__Group__72214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0_in_rule__Program__Group__7__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__8__Impl_in_rule__Program__Group__82272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2301 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__StatesAssignment_8_in_rule__Program__Group__8__Impl2313 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__Group_5__0__Impl_in_rule__Program__Group_5__02364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1_in_rule__Program__Group_5__02367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_5__0__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__1__Impl_in_rule__Program__Group_5__12426 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2_in_rule__Program__Group_5__12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_1_in_rule__Program__Group_5__1__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__2__Impl_in_rule__Program__Group_5__22486 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3_in_rule__Program__Group_5__22489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0_in_rule__Program__Group_5__2__Impl2516 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_5__3__Impl_in_rule__Program__Group_5__32547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_5__3__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__0__Impl_in_rule__Program__Group_5_2__02614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1_in_rule__Program__Group_5_2__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_5_2__0__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_5_2__1__Impl_in_rule__Program__Group_5_2__12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_5_2_1_in_rule__Program__Group_5_2__1__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__0__Impl_in_rule__Program__Group_6__02737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1_in_rule__Program__Group_6__02740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Program__Group_6__0__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__1__Impl_in_rule__Program__Group_6__12799 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2_in_rule__Program__Group_6__12802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_1_in_rule__Program__Group_6__1__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__2__Impl_in_rule__Program__Group_6__22859 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3_in_rule__Program__Group_6__22862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0_in_rule__Program__Group_6__2__Impl2889 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_6__3__Impl_in_rule__Program__Group_6__32920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_6__3__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__0__Impl_in_rule__Program__Group_6_2__02987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1_in_rule__Program__Group_6_2__02990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_6_2__0__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_6_2__1__Impl_in_rule__Program__Group_6_2__13049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_6_2_1_in_rule__Program__Group_6_2__1__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__0__Impl_in_rule__Program__Group_7__03110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1_in_rule__Program__Group_7__03113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Program__Group_7__0__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__1__Impl_in_rule__Program__Group_7__13172 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2_in_rule__Program__Group_7__13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_1_in_rule__Program__Group_7__1__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__2__Impl_in_rule__Program__Group_7__23232 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3_in_rule__Program__Group_7__23235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0_in_rule__Program__Group_7__2__Impl3262 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Program__Group_7__3__Impl_in_rule__Program__Group_7__33293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Program__Group_7__3__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__0__Impl_in_rule__Program__Group_7_2__03360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1_in_rule__Program__Group_7_2__03363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Program__Group_7_2__0__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_7_2__1__Impl_in_rule__Program__Group_7_2__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SignalsAssignment_7_2_1_in_rule__Program__Group_7_2__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_1_in_rule__Annotation__Group__1__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03604 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13664 = new BitSet(new long[]{0x000003F3E4400012L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__State__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23726 = new BitSet(new long[]{0x000003F3E4400012L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_2_in_rule__State__Group__2__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33787 = new BitSet(new long[]{0x000003F3E4400012L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__0_in_rule__State__Group__3__Impl3817 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43848 = new BitSet(new long[]{0x000003F3E0400012L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__43851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__53909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl3936 = new BitSet(new long[]{0x000003F3E0400012L});
    public static final BitSet FOLLOW_rule__State__Group_3__0__Impl_in_rule__State__Group_3__03979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group_3__1_in_rule__State__Group_3__03982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__State__Group_3__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_3__1__Impl_in_rule__State__Group_3__14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__AnnotationsAssignment_3_1_in_rule__State__Group_3__1__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__04102 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group_4__0__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__14164 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_4__2_in_rule__State__Group_4__14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__SignalsAssignment_4_1_in_rule__State__Group_4__1__Impl4194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group_4__2__Impl_in_rule__State__Group_4__24225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_4__2__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04290 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__InstructionsAssignment_5_0_in_rule__State__Group_5__0__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__State__Group_5__1__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__04413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__04416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__14473 = new BitSet(new long[]{0x000000001001E000L});
    public static final BitSet FOLLOW_rule__Signal__Group__2_in_rule__Signal__Group__14476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Signal__Group__1__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__2__Impl_in_rule__Signal__Group__24535 = new BitSet(new long[]{0x0000000008400012L});
    public static final BitSet FOLLOW_rule__Signal__Group__3_in_rule__Signal__Group__24538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_2_in_rule__Signal__Group__2__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__3__Impl_in_rule__Signal__Group__34595 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_rule__Signal__Group__4_in_rule__Signal__Group__34598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Group__3__Impl4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__4__Impl_in_rule__Signal__Group__44656 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group__5_in_rule__Signal__Group__44659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_4_in_rule__Signal__Group__4__Impl4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__5__Impl_in_rule__Signal__Group__54717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Group__5__Impl4744 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__04787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Signal__Group_3__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineFunctionAssignment_3_1_in_rule__Signal__Group_3__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0__Impl_in_rule__Signal__Group_5__04910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__04913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Signal__Group_5__0__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1__Impl_in_rule__Signal__Group_5__14972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__AnnotationsAssignment_5_1_in_rule__Signal__Group_5__1__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignal__Group__0__Impl_in_rule__CustomSignal__Group__05034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CustomSignal__Group__1_in_rule__CustomSignal__Group__05037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomSignal__Group__0__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignal__Group__1__Impl_in_rule__CustomSignal__Group__15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomSignal__TypeAssignment_1_in_rule__CustomSignal__Group__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__0__Impl_in_rule__Pause__Group__05157 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Pause__Group__1_in_rule__Pause__Group__05160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__1__Impl_in_rule__Pause__Group__15218 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Pause__Group__2_in_rule__Pause__Group__15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Pause__Group__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__2__Impl_in_rule__Pause__Group__25280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Pause__Group__3_in_rule__Pause__Group__25283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Pause__Group__2__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__3__Impl_in_rule__Pause__Group__35342 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_rule__Pause__Group__4_in_rule__Pause__Group__35345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Pause__Group__3__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__4__Impl_in_rule__Pause__Group__45404 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Pause__Group__5_in_rule__Pause__Group__45407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__AnnotationsAssignment_4_in_rule__Pause__Group__4__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group__5__Impl_in_rule__Pause__Group__55465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group_5__0_in_rule__Pause__Group__5__Impl5492 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Pause__Group_5__0__Impl_in_rule__Pause__Group_5__05535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pause__Group_5__1_in_rule__Pause__Group_5__05538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Pause__Group_5__0__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__Group_5__1__Impl_in_rule__Pause__Group_5__15597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pause__AnnotationsAssignment_5_1_in_rule__Pause__Group_5__1__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__05658 = new BitSet(new long[]{0x0000000040400010L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__15719 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__AnnotationsAssignment_1_in_rule__Term__Group__1__Impl5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__25780 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Term__Group__3_in_rule__Term__Group__25783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl5810 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Term__Group__3__Impl_in_rule__Term__Group__35841 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Term__Group__4_in_rule__Term__Group__35844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Term__Group__3__Impl5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__4__Impl_in_rule__Term__Group__45903 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Term__Group__5_in_rule__Term__Group__45906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Term__Group__4__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__5__Impl_in_rule__Term__Group__55965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Term__Group__5__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__06036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__06039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Term__Group_2__0__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__AnnotationsAssignment_2_1_in_rule__Term__Group_2__1__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__0__Impl_in_rule__Join__Group__06159 = new BitSet(new long[]{0x0000000080400010L});
    public static final BitSet FOLLOW_rule__Join__Group__1_in_rule__Join__Group__06162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__1__Impl_in_rule__Join__Group__16220 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_rule__Join__Group__2_in_rule__Join__Group__16223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__AnnotationsAssignment_1_in_rule__Join__Group__1__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__2__Impl_in_rule__Join__Group__26281 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Join__Group__3_in_rule__Join__Group__26284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group_2__0_in_rule__Join__Group__2__Impl6311 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Join__Group__3__Impl_in_rule__Join__Group__36342 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Join__Group__4_in_rule__Join__Group__36345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Join__Group__3__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__4__Impl_in_rule__Join__Group__46404 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Join__Group__5_in_rule__Join__Group__46407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Join__Group__4__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group__5__Impl_in_rule__Join__Group__56466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Join__Group__5__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group_2__0__Impl_in_rule__Join__Group_2__06537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Join__Group_2__1_in_rule__Join__Group_2__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Join__Group_2__0__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__Group_2__1__Impl_in_rule__Join__Group_2__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Join__AnnotationsAssignment_2_1_in_rule__Join__Group_2__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__0__Impl_in_rule__Abort__Group__06660 = new BitSet(new long[]{0x0000000100400010L});
    public static final BitSet FOLLOW_rule__Abort__Group__1_in_rule__Abort__Group__06663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__1__Impl_in_rule__Abort__Group__16721 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__Abort__Group__2_in_rule__Abort__Group__16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__AnnotationsAssignment_1_in_rule__Abort__Group__1__Impl6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__2__Impl_in_rule__Abort__Group__26782 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Abort__Group__3_in_rule__Abort__Group__26785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group_2__0_in_rule__Abort__Group__2__Impl6812 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Abort__Group__3__Impl_in_rule__Abort__Group__36843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Abort__Group__4_in_rule__Abort__Group__36846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Abort__Group__3__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__4__Impl_in_rule__Abort__Group__46905 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Abort__Group__5_in_rule__Abort__Group__46908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Abort__Group__4__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group__5__Impl_in_rule__Abort__Group__56967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Abort__Group__5__Impl6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group_2__0__Impl_in_rule__Abort__Group_2__07038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Abort__Group_2__1_in_rule__Abort__Group_2__07041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Abort__Group_2__0__Impl7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__Group_2__1__Impl_in_rule__Abort__Group_2__17100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abort__AnnotationsAssignment_2_1_in_rule__Abort__Group_2__1__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__0__Impl_in_rule__Present__Group__07161 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_rule__Present__Group__1_in_rule__Present__Group__07164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__AnnotationsAssignment_0_in_rule__Present__Group__0__Impl7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__1__Impl_in_rule__Present__Group__17222 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Present__Group__2_in_rule__Present__Group__17225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_1__0_in_rule__Present__Group__1__Impl7252 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Present__Group__2__Impl_in_rule__Present__Group__27283 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Present__Group__3_in_rule__Present__Group__27286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Present__Group__2__Impl7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__3__Impl_in_rule__Present__Group__37345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group__4_in_rule__Present__Group__37348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Present__Group__3__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__4__Impl_in_rule__Present__Group__47407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Present__Group__5_in_rule__Present__Group__47410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__SignalAssignment_4_in_rule__Present__Group__4__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__5__Impl_in_rule__Present__Group__57467 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Present__Group__6_in_rule__Present__Group__57470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Present__Group__5__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__6__Impl_in_rule__Present__Group__67529 = new BitSet(new long[]{0x000003FBE0400010L});
    public static final BitSet FOLLOW_rule__Present__Group__7_in_rule__Present__Group__67532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Present__Group__6__Impl7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group__7__Impl_in_rule__Present__Group__77591 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Present__Group__8_in_rule__Present__Group__77594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_7__0_in_rule__Present__Group__7__Impl7621 = new BitSet(new long[]{0x000003F3E0400012L});
    public static final BitSet FOLLOW_rule__Present__Group__8__Impl_in_rule__Present__Group__87652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Present__Group__8__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_1__0__Impl_in_rule__Present__Group_1__07729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Present__Group_1__1_in_rule__Present__Group_1__07732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Present__Group_1__0__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_1__1__Impl_in_rule__Present__Group_1__17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__AnnotationsAssignment_1_1_in_rule__Present__Group_1__1__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_7__0__Impl_in_rule__Present__Group_7__07852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Present__Group_7__1_in_rule__Present__Group_7__07855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__InstructionsAssignment_7_0_in_rule__Present__Group_7__0__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Present__Group_7__1__Impl_in_rule__Present__Group_7__17912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Present__Group_7__1__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__0__Impl_in_rule__Goto__Group__07975 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_rule__Goto__Group__1_in_rule__Goto__Group__07978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__AnnotationsAssignment_0_in_rule__Goto__Group__0__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__1__Impl_in_rule__Goto__Group__18036 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Goto__Group__2_in_rule__Goto__Group__18039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_1__0_in_rule__Goto__Group__1__Impl8066 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Goto__Group__2__Impl_in_rule__Goto__Group__28097 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Goto__Group__3_in_rule__Goto__Group__28100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Goto__Group__2__Impl8128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__3__Impl_in_rule__Goto__Group__38159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group__4_in_rule__Goto__Group__38162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Goto__Group__3__Impl8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__4__Impl_in_rule__Goto__Group__48221 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Goto__Group__5_in_rule__Goto__Group__48224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__StateAssignment_4_in_rule__Goto__Group__4__Impl8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group__5__Impl_in_rule__Goto__Group__58281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Goto__Group__5__Impl8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_1__0__Impl_in_rule__Goto__Group_1__08352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goto__Group_1__1_in_rule__Goto__Group_1__08355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Goto__Group_1__0__Impl8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__Group_1__1__Impl_in_rule__Goto__Group_1__18414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goto__AnnotationsAssignment_1_1_in_rule__Goto__Group_1__1__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__0__Impl_in_rule__Fork__Group__08475 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_rule__Fork__Group__1_in_rule__Fork__Group__08478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__AnnotationsAssignment_0_in_rule__Fork__Group__0__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__1__Impl_in_rule__Fork__Group__18536 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Fork__Group__2_in_rule__Fork__Group__18539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_1__0_in_rule__Fork__Group__1__Impl8566 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Fork__Group__2__Impl_in_rule__Fork__Group__28597 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Fork__Group__3_in_rule__Fork__Group__28600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Fork__Group__2__Impl8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__3__Impl_in_rule__Fork__Group__38659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group__4_in_rule__Fork__Group__38662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Fork__Group__3__Impl8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__4__Impl_in_rule__Fork__Group__48721 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Fork__Group__5_in_rule__Fork__Group__48724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__StateAssignment_4_in_rule__Fork__Group__4__Impl8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__5__Impl_in_rule__Fork__Group__58781 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Fork__Group__6_in_rule__Fork__Group__58784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group__5__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__6__Impl_in_rule__Fork__Group__68843 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Fork__Group__7_in_rule__Fork__Group__68846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__PriorityAssignment_6_in_rule__Fork__Group__6__Impl8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group__7__Impl_in_rule__Fork__Group__78903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Fork__Group__7__Impl8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_1__0__Impl_in_rule__Fork__Group_1__08978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fork__Group_1__1_in_rule__Fork__Group_1__08981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Fork__Group_1__0__Impl9009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__Group_1__1__Impl_in_rule__Fork__Group_1__19040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fork__AnnotationsAssignment_1_1_in_rule__Fork__Group_1__1__Impl9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__0__Impl_in_rule__Forke__Group__09101 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_rule__Forke__Group__1_in_rule__Forke__Group__09104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__AnnotationsAssignment_0_in_rule__Forke__Group__0__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__1__Impl_in_rule__Forke__Group__19162 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Forke__Group__2_in_rule__Forke__Group__19165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_1__0_in_rule__Forke__Group__1__Impl9192 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Forke__Group__2__Impl_in_rule__Forke__Group__29223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Forke__Group__3_in_rule__Forke__Group__29226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Forke__Group__2__Impl9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__3__Impl_in_rule__Forke__Group__39285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group__4_in_rule__Forke__Group__39288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Forke__Group__3__Impl9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__4__Impl_in_rule__Forke__Group__49347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Forke__Group__5_in_rule__Forke__Group__49350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__StateAssignment_4_in_rule__Forke__Group__4__Impl9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group__5__Impl_in_rule__Forke__Group__59407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Forke__Group__5__Impl9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_1__0__Impl_in_rule__Forke__Group_1__09478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Forke__Group_1__1_in_rule__Forke__Group_1__09481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Forke__Group_1__0__Impl9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__Group_1__1__Impl_in_rule__Forke__Group_1__19540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forke__AnnotationsAssignment_1_1_in_rule__Forke__Group_1__1__Impl9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__0__Impl_in_rule__Emit__Group__09601 = new BitSet(new long[]{0x0000008000400000L});
    public static final BitSet FOLLOW_rule__Emit__Group__1_in_rule__Emit__Group__09604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__AnnotationsAssignment_0_in_rule__Emit__Group__0__Impl9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__1__Impl_in_rule__Emit__Group__19662 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Emit__Group__2_in_rule__Emit__Group__19665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_1__0_in_rule__Emit__Group__1__Impl9692 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Emit__Group__2__Impl_in_rule__Emit__Group__29723 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Emit__Group__3_in_rule__Emit__Group__29726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Emit__Group__2__Impl9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__3__Impl_in_rule__Emit__Group__39785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group__4_in_rule__Emit__Group__39788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Emit__Group__3__Impl9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__4__Impl_in_rule__Emit__Group__49847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Emit__Group__5_in_rule__Emit__Group__49850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__SignalAssignment_4_in_rule__Emit__Group__4__Impl9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group__5__Impl_in_rule__Emit__Group__59907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Emit__Group__5__Impl9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_1__0__Impl_in_rule__Emit__Group_1__09978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Emit__Group_1__1_in_rule__Emit__Group_1__09981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Emit__Group_1__0__Impl10009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__Group_1__1__Impl_in_rule__Emit__Group_1__110040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Emit__AnnotationsAssignment_1_1_in_rule__Emit__Group_1__1__Impl10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__0__Impl_in_rule__Await__Group__010101 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_rule__Await__Group__1_in_rule__Await__Group__010104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__AnnotationsAssignment_0_in_rule__Await__Group__0__Impl10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__1__Impl_in_rule__Await__Group__110162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Await__Group__2_in_rule__Await__Group__110165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_1__0_in_rule__Await__Group__1__Impl10192 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Await__Group__2__Impl_in_rule__Await__Group__210223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Await__Group__3_in_rule__Await__Group__210226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Await__Group__2__Impl10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__3__Impl_in_rule__Await__Group__310285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group__4_in_rule__Await__Group__310288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Await__Group__3__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__4__Impl_in_rule__Await__Group__410347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Await__Group__5_in_rule__Await__Group__410350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__SignalAssignment_4_in_rule__Await__Group__4__Impl10377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group__5__Impl_in_rule__Await__Group__510407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Await__Group__5__Impl10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_1__0__Impl_in_rule__Await__Group_1__010478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Await__Group_1__1_in_rule__Await__Group_1__010481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Await__Group_1__0__Impl10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__Group_1__1__Impl_in_rule__Await__Group_1__110540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Await__AnnotationsAssignment_1_1_in_rule__Await__Group_1__1__Impl10567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__0__Impl_in_rule__Prio__Group__010601 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_rule__Prio__Group__1_in_rule__Prio__Group__010604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__AnnotationsAssignment_0_in_rule__Prio__Group__0__Impl10631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__1__Impl_in_rule__Prio__Group__110662 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Prio__Group__2_in_rule__Prio__Group__110665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_1__0_in_rule__Prio__Group__1__Impl10692 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Prio__Group__2__Impl_in_rule__Prio__Group__210723 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Prio__Group__3_in_rule__Prio__Group__210726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Prio__Group__2__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__3__Impl_in_rule__Prio__Group__310785 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Prio__Group__4_in_rule__Prio__Group__310788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Prio__Group__3__Impl10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__4__Impl_in_rule__Prio__Group__410847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Prio__Group__5_in_rule__Prio__Group__410850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__PriorityAssignment_4_in_rule__Prio__Group__4__Impl10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group__5__Impl_in_rule__Prio__Group__510907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Prio__Group__5__Impl10935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_1__0__Impl_in_rule__Prio__Group_1__010978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Prio__Group_1__1_in_rule__Prio__Group_1__010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Prio__Group_1__0__Impl11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__Group_1__1__Impl_in_rule__Prio__Group_1__111040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Prio__AnnotationsAssignment_1_1_in_rule__Prio__Group_1__1__Impl11067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_111106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Program__PriorityAssignment_311137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_111168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_5_2_111199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_111230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_6_2_111261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Program__SignalsAssignment_7_2_111323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Program__StatesAssignment_811354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_011385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_111416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_011447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_211478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__State__AnnotationsAssignment_3_111509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__State__SignalsAssignment_4_111540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__State__InstructionsAssignment_5_011571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateReference__StateAssignment11606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_211672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__CombineFunctionAssignment_3_111707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_411742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Signal__AnnotationsAssignment_5_111773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignalReference__SignalAssignment11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomSignal__TypeAssignment_111845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveSignalType_in_rule__PrimitiveSignal__TypeAssignment11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Pause__AnnotationsAssignment_411940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Pause__AnnotationsAssignment_5_111971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Term__AnnotationsAssignment_112002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Term__AnnotationsAssignment_2_112033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Join__AnnotationsAssignment_112064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Join__AnnotationsAssignment_2_112095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Abort__AnnotationsAssignment_112126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Abort__AnnotationsAssignment_2_112157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Present__AnnotationsAssignment_012188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Present__AnnotationsAssignment_1_112219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__Present__SignalAssignment_412250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Present__InstructionsAssignment_7_012281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Goto__AnnotationsAssignment_012312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Goto__AnnotationsAssignment_1_112343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReference_in_rule__Goto__StateAssignment_412374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Fork__AnnotationsAssignment_012405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Fork__AnnotationsAssignment_1_112436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReference_in_rule__Fork__StateAssignment_412467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Fork__PriorityAssignment_612498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Forke__AnnotationsAssignment_012529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Forke__AnnotationsAssignment_1_112560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateReference_in_rule__Forke__StateAssignment_412591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Emit__AnnotationsAssignment_012622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Emit__AnnotationsAssignment_1_112653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__Emit__SignalAssignment_412684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Await__AnnotationsAssignment_012715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Await__AnnotationsAssignment_1_112746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_rule__Await__SignalAssignment_412777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Prio__AnnotationsAssignment_012808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Prio__AnnotationsAssignment_1_112839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Prio__PriorityAssignment_412870 = new BitSet(new long[]{0x0000000000000002L});

}