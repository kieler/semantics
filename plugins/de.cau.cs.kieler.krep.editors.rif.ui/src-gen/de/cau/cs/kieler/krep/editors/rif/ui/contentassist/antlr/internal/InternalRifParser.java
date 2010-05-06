package de.cau.cs.kieler.krep.editors.rif.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.krep.editors.rif.services.RifGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRifParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INPUTS", "RULE_OUTPUTS", "RULE_LOCALS", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_COMMENT", "'bool'", "'int'", "'@#'", "':'", "'#step'", "'#outs'", "'#locs'", "'The'", "'execution'", "'lasted'", "'.'", "'second.'", "'T'", "'F'"
    };
    public static final int RULE_LOCALS=6;
    public static final int RULE_STRING=8;
    public static final int RULE_OUTPUTS=5;
    public static final int RULE_INPUTS=4;
    public static final int RULE_INT=7;
    public static final int RULE_COMMENT=10;
    public static final int RULE_WS=9;
    public static final int EOF=-1;

        public InternalRifParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g"; }


     
     	private RifGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RifGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleTrace
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:61:1: entryRuleTrace : ruleTrace EOF ;
    public final void entryRuleTrace() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:62:1: ( ruleTrace EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:63:1: ruleTrace EOF
            {
             before(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruleTrace_in_entryRuleTrace61);
            ruleTrace();
            _fsp--;

             after(grammarAccess.getTraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrace68); 

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
    // $ANTLR end entryRuleTrace


    // $ANTLR start ruleTrace
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:70:1: ruleTrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruleTrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:74:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:75:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:75:1: ( ( rule__Trace__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:76:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:77:1: ( rule__Trace__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:77:2: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_rule__Trace__Group__0_in_ruleTrace94);
            rule__Trace__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTrace


    // $ANTLR start entryRuledecl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:89:1: entryRuledecl : ruledecl EOF ;
    public final void entryRuledecl() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:90:1: ( ruledecl EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:91:1: ruledecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl121);
            ruledecl();
            _fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl128); 

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
    // $ANTLR end entryRuledecl


    // $ANTLR start ruledecl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:98:1: ruledecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruledecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:102:2: ( ( ( rule__Decl__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:103:1: ( ( rule__Decl__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:103:1: ( ( rule__Decl__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:104:1: ( rule__Decl__Group__0 )
            {
             before(grammarAccess.getDeclAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:105:1: ( rule__Decl__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:105:2: rule__Decl__Group__0
            {
            pushFollow(FOLLOW_rule__Decl__Group__0_in_ruledecl154);
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
    // $ANTLR end ruledecl


    // $ANTLR start entryRuleType
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:117:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:118:1: ( ruleType EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:119:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:126:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:130:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:131:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:131:1: ( ( rule__Type__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:132:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:133:1: ( rule__Type__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:133:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType214);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleTick
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:145:1: entryRuleTick : ruleTick EOF ;
    public final void entryRuleTick() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:146:1: ( ruleTick EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:147:1: ruleTick EOF
            {
             before(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruleTick_in_entryRuleTick241);
            ruleTick();
            _fsp--;

             after(grammarAccess.getTickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTick248); 

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
    // $ANTLR end entryRuleTick


    // $ANTLR start ruleTick
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:154:1: ruleTick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruleTick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:158:2: ( ( ( rule__Tick__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:159:1: ( ( rule__Tick__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:159:1: ( ( rule__Tick__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:160:1: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:161:1: ( rule__Tick__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:161:2: rule__Tick__Group__0
            {
            pushFollow(FOLLOW_rule__Tick__Group__0_in_ruleTick274);
            rule__Tick__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTick


    // $ANTLR start entryRuleData
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:173:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:174:1: ( ruleData EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:175:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData301);
            ruleData();
            _fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData308); 

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
    // $ANTLR end entryRuleData


    // $ANTLR start ruleData
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:182:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:186:2: ( ( ( rule__Data__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:187:1: ( ( rule__Data__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:187:1: ( ( rule__Data__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:188:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:189:1: ( rule__Data__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:189:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_rule__Data__Alternatives_in_ruleData334);
            rule__Data__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleData


    // $ANTLR start entryRuleStatus
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:201:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:202:1: ( ruleStatus EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:203:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus361);
            ruleStatus();
            _fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus368); 

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
    // $ANTLR end entryRuleStatus


    // $ANTLR start ruleStatus
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:210:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:214:2: ( ( ( rule__Status__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:215:1: ( ( rule__Status__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:215:1: ( ( rule__Status__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:216:1: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:217:1: ( rule__Status__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:217:2: rule__Status__Group__0
            {
            pushFollow(FOLLOW_rule__Status__Group__0_in_ruleStatus394);
            rule__Status__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStatusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatus


    // $ANTLR start rule__Type__Alternatives
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:229:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:233:1: ( ( 'bool' ) | ( 'int' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("229:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:234:1: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:234:1: ( 'bool' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:235:1: 'bool'
                    {
                     before(grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives431); 
                     after(grammarAccess.getTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:242:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:242:6: ( 'int' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:243:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives451); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_1()); 

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Data__Alternatives
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:255:1: rule__Data__Alternatives : ( ( ( rule__Data__ValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:259:1: ( ( ( rule__Data__ValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("255:1: rule__Data__Alternatives : ( ( ( rule__Data__ValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:260:1: ( ( rule__Data__ValAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:260:1: ( ( rule__Data__ValAssignment_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:261:1: ( rule__Data__ValAssignment_0 )
                    {
                     before(grammarAccess.getDataAccess().getValAssignment_0()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:262:1: ( rule__Data__ValAssignment_0 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:262:2: rule__Data__ValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Data__ValAssignment_0_in_rule__Data__Alternatives485);
                    rule__Data__ValAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:266:6: ( ( rule__Data__TrueAssignment_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:266:6: ( ( rule__Data__TrueAssignment_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:267:1: ( rule__Data__TrueAssignment_1 )
                    {
                     before(grammarAccess.getDataAccess().getTrueAssignment_1()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:268:1: ( rule__Data__TrueAssignment_1 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:268:2: rule__Data__TrueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives503);
                    rule__Data__TrueAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getTrueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:272:6: ( ( rule__Data__FalseAssignment_2 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:272:6: ( ( rule__Data__FalseAssignment_2 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:273:1: ( rule__Data__FalseAssignment_2 )
                    {
                     before(grammarAccess.getDataAccess().getFalseAssignment_2()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:274:1: ( rule__Data__FalseAssignment_2 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:274:2: rule__Data__FalseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives521);
                    rule__Data__FalseAssignment_2();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getFalseAssignment_2()); 

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
    // $ANTLR end rule__Data__Alternatives


    // $ANTLR start rule__Trace__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:285:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:289:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:290:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0552);
            rule__Trace__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0555);
            rule__Trace__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__0


    // $ANTLR start rule__Trace__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:297:1: rule__Trace__Group__0__Impl : ( RULE_INPUTS ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:301:1: ( ( RULE_INPUTS ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:302:1: ( RULE_INPUTS )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:302:1: ( RULE_INPUTS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:303:1: RULE_INPUTS
            {
             before(grammarAccess.getTraceAccess().getINPUTSTerminalRuleCall_0()); 
            match(input,RULE_INPUTS,FOLLOW_RULE_INPUTS_in_rule__Trace__Group__0__Impl582); 
             after(grammarAccess.getTraceAccess().getINPUTSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__0__Impl


    // $ANTLR start rule__Trace__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:314:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:318:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:319:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1611);
            rule__Trace__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1614);
            rule__Trace__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__1


    // $ANTLR start rule__Trace__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:326:1: rule__Trace__Group__1__Impl : ( ( rule__Trace__InputsAssignment_1 )* ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:330:1: ( ( ( rule__Trace__InputsAssignment_1 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:331:1: ( ( rule__Trace__InputsAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:331:1: ( ( rule__Trace__InputsAssignment_1 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:332:1: ( rule__Trace__InputsAssignment_1 )*
            {
             before(grammarAccess.getTraceAccess().getInputsAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:333:1: ( rule__Trace__InputsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:333:2: rule__Trace__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1__Impl641);
            	    rule__Trace__InputsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getInputsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__1__Impl


    // $ANTLR start rule__Trace__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:343:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:347:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:348:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__2672);
            rule__Trace__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2675);
            rule__Trace__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__2


    // $ANTLR start rule__Trace__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:355:1: rule__Trace__Group__2__Impl : ( '@#' ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:359:1: ( ( '@#' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:360:1: ( '@#' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:360:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:361:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__2__Impl703); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__2__Impl


    // $ANTLR start rule__Trace__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:374:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:378:1: ( rule__Trace__Group__3__Impl rule__Trace__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:379:2: rule__Trace__Group__3__Impl rule__Trace__Group__4
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__3734);
            rule__Trace__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3737);
            rule__Trace__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__3


    // $ANTLR start rule__Trace__Group__3__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:386:1: rule__Trace__Group__3__Impl : ( RULE_OUTPUTS ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:390:1: ( ( RULE_OUTPUTS ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:391:1: ( RULE_OUTPUTS )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:391:1: ( RULE_OUTPUTS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:392:1: RULE_OUTPUTS
            {
             before(grammarAccess.getTraceAccess().getOUTPUTSTerminalRuleCall_3()); 
            match(input,RULE_OUTPUTS,FOLLOW_RULE_OUTPUTS_in_rule__Trace__Group__3__Impl764); 
             after(grammarAccess.getTraceAccess().getOUTPUTSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__3__Impl


    // $ANTLR start rule__Trace__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:403:1: rule__Trace__Group__4 : rule__Trace__Group__4__Impl rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:407:1: ( rule__Trace__Group__4__Impl rule__Trace__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:408:2: rule__Trace__Group__4__Impl rule__Trace__Group__5
            {
            pushFollow(FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__4793);
            rule__Trace__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4796);
            rule__Trace__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__4


    // $ANTLR start rule__Trace__Group__4__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:415:1: rule__Trace__Group__4__Impl : ( ( rule__Trace__OutputsAssignment_4 )* ) ;
    public final void rule__Trace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:419:1: ( ( ( rule__Trace__OutputsAssignment_4 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:420:1: ( ( rule__Trace__OutputsAssignment_4 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:420:1: ( ( rule__Trace__OutputsAssignment_4 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:421:1: ( rule__Trace__OutputsAssignment_4 )*
            {
             before(grammarAccess.getTraceAccess().getOutputsAssignment_4()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:422:1: ( rule__Trace__OutputsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:422:2: rule__Trace__OutputsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4__Impl823);
            	    rule__Trace__OutputsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getOutputsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__4__Impl


    // $ANTLR start rule__Trace__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:432:1: rule__Trace__Group__5 : rule__Trace__Group__5__Impl rule__Trace__Group__6 ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:436:1: ( rule__Trace__Group__5__Impl rule__Trace__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:437:2: rule__Trace__Group__5__Impl rule__Trace__Group__6
            {
            pushFollow(FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__5854);
            rule__Trace__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5857);
            rule__Trace__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__5


    // $ANTLR start rule__Trace__Group__5__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:444:1: rule__Trace__Group__5__Impl : ( '@#' ) ;
    public final void rule__Trace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:448:1: ( ( '@#' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:449:1: ( '@#' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:449:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:450:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__5__Impl885); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__5__Impl


    // $ANTLR start rule__Trace__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:463:1: rule__Trace__Group__6 : rule__Trace__Group__6__Impl rule__Trace__Group__7 ;
    public final void rule__Trace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:467:1: ( rule__Trace__Group__6__Impl rule__Trace__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:468:2: rule__Trace__Group__6__Impl rule__Trace__Group__7
            {
            pushFollow(FOLLOW_rule__Trace__Group__6__Impl_in_rule__Trace__Group__6916);
            rule__Trace__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6919);
            rule__Trace__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__6


    // $ANTLR start rule__Trace__Group__6__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:475:1: rule__Trace__Group__6__Impl : ( RULE_LOCALS ) ;
    public final void rule__Trace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:479:1: ( ( RULE_LOCALS ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:480:1: ( RULE_LOCALS )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:480:1: ( RULE_LOCALS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:481:1: RULE_LOCALS
            {
             before(grammarAccess.getTraceAccess().getLOCALSTerminalRuleCall_6()); 
            match(input,RULE_LOCALS,FOLLOW_RULE_LOCALS_in_rule__Trace__Group__6__Impl946); 
             after(grammarAccess.getTraceAccess().getLOCALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__6__Impl


    // $ANTLR start rule__Trace__Group__7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:492:1: rule__Trace__Group__7 : rule__Trace__Group__7__Impl rule__Trace__Group__8 ;
    public final void rule__Trace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:496:1: ( rule__Trace__Group__7__Impl rule__Trace__Group__8 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:497:2: rule__Trace__Group__7__Impl rule__Trace__Group__8
            {
            pushFollow(FOLLOW_rule__Trace__Group__7__Impl_in_rule__Trace__Group__7975);
            rule__Trace__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7978);
            rule__Trace__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__7


    // $ANTLR start rule__Trace__Group__7__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:504:1: rule__Trace__Group__7__Impl : ( ( rule__Trace__LocalAssignment_7 )* ) ;
    public final void rule__Trace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:508:1: ( ( ( rule__Trace__LocalAssignment_7 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:509:1: ( ( rule__Trace__LocalAssignment_7 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:509:1: ( ( rule__Trace__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:510:1: ( rule__Trace__LocalAssignment_7 )*
            {
             before(grammarAccess.getTraceAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:511:1: ( rule__Trace__LocalAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:511:2: rule__Trace__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7__Impl1005);
            	    rule__Trace__LocalAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getLocalAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__7__Impl


    // $ANTLR start rule__Trace__Group__8
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:521:1: rule__Trace__Group__8 : rule__Trace__Group__8__Impl rule__Trace__Group__9 ;
    public final void rule__Trace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:525:1: ( rule__Trace__Group__8__Impl rule__Trace__Group__9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:526:2: rule__Trace__Group__8__Impl rule__Trace__Group__9
            {
            pushFollow(FOLLOW_rule__Trace__Group__8__Impl_in_rule__Trace__Group__81036);
            rule__Trace__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__81039);
            rule__Trace__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__8


    // $ANTLR start rule__Trace__Group__8__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:533:1: rule__Trace__Group__8__Impl : ( '@#' ) ;
    public final void rule__Trace__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:537:1: ( ( '@#' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:538:1: ( '@#' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:538:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:539:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__8__Impl1067); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__8__Impl


    // $ANTLR start rule__Trace__Group__9
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:552:1: rule__Trace__Group__9 : rule__Trace__Group__9__Impl rule__Trace__Group__10 ;
    public final void rule__Trace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:556:1: ( rule__Trace__Group__9__Impl rule__Trace__Group__10 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:557:2: rule__Trace__Group__9__Impl rule__Trace__Group__10
            {
            pushFollow(FOLLOW_rule__Trace__Group__9__Impl_in_rule__Trace__Group__91098);
            rule__Trace__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__10_in_rule__Trace__Group__91101);
            rule__Trace__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__9


    // $ANTLR start rule__Trace__Group__9__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:564:1: rule__Trace__Group__9__Impl : ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) ;
    public final void rule__Trace__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:568:1: ( ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:569:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:569:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:570:1: ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:570:1: ( ( rule__Trace__TickAssignment_9 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:571:1: ( rule__Trace__TickAssignment_9 )
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:572:1: ( rule__Trace__TickAssignment_9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:572:2: rule__Trace__TickAssignment_9
            {
            pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9__Impl1130);
            rule__Trace__TickAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getTickAssignment_9()); 

            }

            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:575:1: ( ( rule__Trace__TickAssignment_9 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:576:1: ( rule__Trace__TickAssignment_9 )*
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:577:1: ( rule__Trace__TickAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:577:2: rule__Trace__TickAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9__Impl1142);
            	    rule__Trace__TickAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getTickAssignment_9()); 

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
    // $ANTLR end rule__Trace__Group__9__Impl


    // $ANTLR start rule__Trace__Group__10
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:588:1: rule__Trace__Group__10 : rule__Trace__Group__10__Impl ;
    public final void rule__Trace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:592:1: ( rule__Trace__Group__10__Impl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:593:2: rule__Trace__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__10__Impl_in_rule__Trace__Group__101175);
            rule__Trace__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__10


    // $ANTLR start rule__Trace__Group__10__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:599:1: rule__Trace__Group__10__Impl : ( ( ruleStatus )? ) ;
    public final void rule__Trace__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:603:1: ( ( ( ruleStatus )? ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:604:1: ( ( ruleStatus )? )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:604:1: ( ( ruleStatus )? )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:605:1: ( ruleStatus )?
            {
             before(grammarAccess.getTraceAccess().getStatusParserRuleCall_10()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:606:1: ( ruleStatus )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:606:3: ruleStatus
                    {
                    pushFollow(FOLLOW_ruleStatus_in_rule__Trace__Group__10__Impl1203);
                    ruleStatus();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTraceAccess().getStatusParserRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__Group__10__Impl


    // $ANTLR start rule__Decl__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:638:1: rule__Decl__Group__0 : rule__Decl__Group__0__Impl rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:642:1: ( rule__Decl__Group__0__Impl rule__Decl__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:643:2: rule__Decl__Group__0__Impl rule__Decl__Group__1
            {
            pushFollow(FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__01256);
            rule__Decl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__01259);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:650:1: rule__Decl__Group__0__Impl : ( ( rule__Decl__NameAssignment_0 ) ) ;
    public final void rule__Decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:654:1: ( ( ( rule__Decl__NameAssignment_0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:655:1: ( ( rule__Decl__NameAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:655:1: ( ( rule__Decl__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:656:1: ( rule__Decl__NameAssignment_0 )
            {
             before(grammarAccess.getDeclAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:657:1: ( rule__Decl__NameAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:657:2: rule__Decl__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Decl__NameAssignment_0_in_rule__Decl__Group__0__Impl1286);
            rule__Decl__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:667:1: rule__Decl__Group__1 : rule__Decl__Group__1__Impl rule__Decl__Group__2 ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:671:1: ( rule__Decl__Group__1__Impl rule__Decl__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:672:2: rule__Decl__Group__1__Impl rule__Decl__Group__2
            {
            pushFollow(FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__11316);
            rule__Decl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__11319);
            rule__Decl__Group__2();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:679:1: rule__Decl__Group__1__Impl : ( ':' ) ;
    public final void rule__Decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:683:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:684:1: ( ':' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:684:1: ( ':' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:685:1: ':'
            {
             before(grammarAccess.getDeclAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Decl__Group__1__Impl1347); 
             after(grammarAccess.getDeclAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Decl__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:698:1: rule__Decl__Group__2 : rule__Decl__Group__2__Impl ;
    public final void rule__Decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:702:1: ( rule__Decl__Group__2__Impl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:703:2: rule__Decl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group__2__Impl_in_rule__Decl__Group__21378);
            rule__Decl__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__Group__2


    // $ANTLR start rule__Decl__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:709:1: rule__Decl__Group__2__Impl : ( ( rule__Decl__TypeAssignment_2 ) ) ;
    public final void rule__Decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:713:1: ( ( ( rule__Decl__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:714:1: ( ( rule__Decl__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:714:1: ( ( rule__Decl__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:715:1: ( rule__Decl__TypeAssignment_2 )
            {
             before(grammarAccess.getDeclAccess().getTypeAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:716:1: ( rule__Decl__TypeAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:716:2: rule__Decl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Decl__TypeAssignment_2_in_rule__Decl__Group__2__Impl1405);
            rule__Decl__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__Group__2__Impl


    // $ANTLR start rule__Tick__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:732:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:736:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:737:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
            {
            pushFollow(FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01441);
            rule__Tick__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01444);
            rule__Tick__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__0


    // $ANTLR start rule__Tick__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:744:1: rule__Tick__Group__0__Impl : ( () ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:748:1: ( ( () ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:749:1: ( () )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:749:1: ( () )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:750:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:751:1: ()
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:753:1: 
            {
            }

             after(grammarAccess.getTickAccess().getTickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__0__Impl


    // $ANTLR start rule__Tick__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:763:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:767:1: ( rule__Tick__Group__1__Impl rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:768:2: rule__Tick__Group__1__Impl rule__Tick__Group__2
            {
            pushFollow(FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11502);
            rule__Tick__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11505);
            rule__Tick__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__1


    // $ANTLR start rule__Tick__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:775:1: rule__Tick__Group__1__Impl : ( '#step' ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:779:1: ( ( '#step' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:780:1: ( '#step' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:780:1: ( '#step' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:781:1: '#step'
            {
             before(grammarAccess.getTickAccess().getStepKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Tick__Group__1__Impl1533); 
             after(grammarAccess.getTickAccess().getStepKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__1__Impl


    // $ANTLR start rule__Tick__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:794:1: rule__Tick__Group__2 : rule__Tick__Group__2__Impl rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:798:1: ( rule__Tick__Group__2__Impl rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:799:2: rule__Tick__Group__2__Impl rule__Tick__Group__3
            {
            pushFollow(FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21564);
            rule__Tick__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21567);
            rule__Tick__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__2


    // $ANTLR start rule__Tick__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:806:1: rule__Tick__Group__2__Impl : ( ( rule__Tick__NrAssignment_2 ) ) ;
    public final void rule__Tick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:810:1: ( ( ( rule__Tick__NrAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:811:1: ( ( rule__Tick__NrAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:811:1: ( ( rule__Tick__NrAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:812:1: ( rule__Tick__NrAssignment_2 )
            {
             before(grammarAccess.getTickAccess().getNrAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:813:1: ( rule__Tick__NrAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:813:2: rule__Tick__NrAssignment_2
            {
            pushFollow(FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__2__Impl1594);
            rule__Tick__NrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getNrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__2__Impl


    // $ANTLR start rule__Tick__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:823:1: rule__Tick__Group__3 : rule__Tick__Group__3__Impl rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:827:1: ( rule__Tick__Group__3__Impl rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:828:2: rule__Tick__Group__3__Impl rule__Tick__Group__4
            {
            pushFollow(FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31624);
            rule__Tick__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31627);
            rule__Tick__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__3


    // $ANTLR start rule__Tick__Group__3__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:835:1: rule__Tick__Group__3__Impl : ( ( rule__Tick__InputAssignment_3 )* ) ;
    public final void rule__Tick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:839:1: ( ( ( rule__Tick__InputAssignment_3 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:840:1: ( ( rule__Tick__InputAssignment_3 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:840:1: ( ( rule__Tick__InputAssignment_3 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:841:1: ( rule__Tick__InputAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_3()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:842:1: ( rule__Tick__InputAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:842:2: rule__Tick__InputAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__3__Impl1654);
            	    rule__Tick__InputAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__3__Impl


    // $ANTLR start rule__Tick__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:852:1: rule__Tick__Group__4 : rule__Tick__Group__4__Impl rule__Tick__Group__5 ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:856:1: ( rule__Tick__Group__4__Impl rule__Tick__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:857:2: rule__Tick__Group__4__Impl rule__Tick__Group__5
            {
            pushFollow(FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41685);
            rule__Tick__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41688);
            rule__Tick__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__4


    // $ANTLR start rule__Tick__Group__4__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:864:1: rule__Tick__Group__4__Impl : ( '#outs' ) ;
    public final void rule__Tick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:868:1: ( ( '#outs' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:869:1: ( '#outs' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:869:1: ( '#outs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:870:1: '#outs'
            {
             before(grammarAccess.getTickAccess().getOutsKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Tick__Group__4__Impl1716); 
             after(grammarAccess.getTickAccess().getOutsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__4__Impl


    // $ANTLR start rule__Tick__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:883:1: rule__Tick__Group__5 : rule__Tick__Group__5__Impl rule__Tick__Group__6 ;
    public final void rule__Tick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:887:1: ( rule__Tick__Group__5__Impl rule__Tick__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:888:2: rule__Tick__Group__5__Impl rule__Tick__Group__6
            {
            pushFollow(FOLLOW_rule__Tick__Group__5__Impl_in_rule__Tick__Group__51747);
            rule__Tick__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51750);
            rule__Tick__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__5


    // $ANTLR start rule__Tick__Group__5__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:895:1: rule__Tick__Group__5__Impl : ( ( rule__Tick__OutputAssignment_5 )* ) ;
    public final void rule__Tick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:899:1: ( ( ( rule__Tick__OutputAssignment_5 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:900:1: ( ( rule__Tick__OutputAssignment_5 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:900:1: ( ( rule__Tick__OutputAssignment_5 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:901:1: ( rule__Tick__OutputAssignment_5 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_5()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:902:1: ( rule__Tick__OutputAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:902:2: rule__Tick__OutputAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__5__Impl1777);
            	    rule__Tick__OutputAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getOutputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__5__Impl


    // $ANTLR start rule__Tick__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:912:1: rule__Tick__Group__6 : rule__Tick__Group__6__Impl rule__Tick__Group__7 ;
    public final void rule__Tick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:916:1: ( rule__Tick__Group__6__Impl rule__Tick__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:917:2: rule__Tick__Group__6__Impl rule__Tick__Group__7
            {
            pushFollow(FOLLOW_rule__Tick__Group__6__Impl_in_rule__Tick__Group__61808);
            rule__Tick__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61811);
            rule__Tick__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__6


    // $ANTLR start rule__Tick__Group__6__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:924:1: rule__Tick__Group__6__Impl : ( '#locs' ) ;
    public final void rule__Tick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:928:1: ( ( '#locs' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:929:1: ( '#locs' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:929:1: ( '#locs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:930:1: '#locs'
            {
             before(grammarAccess.getTickAccess().getLocsKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Tick__Group__6__Impl1839); 
             after(grammarAccess.getTickAccess().getLocsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__6__Impl


    // $ANTLR start rule__Tick__Group__7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:943:1: rule__Tick__Group__7 : rule__Tick__Group__7__Impl ;
    public final void rule__Tick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:947:1: ( rule__Tick__Group__7__Impl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:948:2: rule__Tick__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Tick__Group__7__Impl_in_rule__Tick__Group__71870);
            rule__Tick__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__7


    // $ANTLR start rule__Tick__Group__7__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:954:1: rule__Tick__Group__7__Impl : ( ( rule__Tick__LocalAssignment_7 )* ) ;
    public final void rule__Tick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:958:1: ( ( ( rule__Tick__LocalAssignment_7 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:959:1: ( ( rule__Tick__LocalAssignment_7 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:959:1: ( ( rule__Tick__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:960:1: ( rule__Tick__LocalAssignment_7 )*
            {
             before(grammarAccess.getTickAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:961:1: ( rule__Tick__LocalAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT||(LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:961:2: rule__Tick__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__7__Impl1897);
            	    rule__Tick__LocalAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getLocalAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__Group__7__Impl


    // $ANTLR start rule__Status__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:987:1: rule__Status__Group__0 : rule__Status__Group__0__Impl rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:991:1: ( rule__Status__Group__0__Impl rule__Status__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:992:2: rule__Status__Group__0__Impl rule__Status__Group__1
            {
            pushFollow(FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01944);
            rule__Status__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01947);
            rule__Status__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__0


    // $ANTLR start rule__Status__Group__0__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:999:1: rule__Status__Group__0__Impl : ( 'The' ) ;
    public final void rule__Status__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1003:1: ( ( 'The' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1004:1: ( 'The' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1004:1: ( 'The' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1005:1: 'The'
            {
             before(grammarAccess.getStatusAccess().getTheKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Status__Group__0__Impl1975); 
             after(grammarAccess.getStatusAccess().getTheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__0__Impl


    // $ANTLR start rule__Status__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1018:1: rule__Status__Group__1 : rule__Status__Group__1__Impl rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1022:1: ( rule__Status__Group__1__Impl rule__Status__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1023:2: rule__Status__Group__1__Impl rule__Status__Group__2
            {
            pushFollow(FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__12006);
            rule__Status__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__2_in_rule__Status__Group__12009);
            rule__Status__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__1


    // $ANTLR start rule__Status__Group__1__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1030:1: rule__Status__Group__1__Impl : ( 'execution' ) ;
    public final void rule__Status__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1034:1: ( ( 'execution' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1035:1: ( 'execution' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1035:1: ( 'execution' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1036:1: 'execution'
            {
             before(grammarAccess.getStatusAccess().getExecutionKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Status__Group__1__Impl2037); 
             after(grammarAccess.getStatusAccess().getExecutionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__1__Impl


    // $ANTLR start rule__Status__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1049:1: rule__Status__Group__2 : rule__Status__Group__2__Impl rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1053:1: ( rule__Status__Group__2__Impl rule__Status__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1054:2: rule__Status__Group__2__Impl rule__Status__Group__3
            {
            pushFollow(FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__22068);
            rule__Status__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__3_in_rule__Status__Group__22071);
            rule__Status__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__2


    // $ANTLR start rule__Status__Group__2__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1061:1: rule__Status__Group__2__Impl : ( 'lasted' ) ;
    public final void rule__Status__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1065:1: ( ( 'lasted' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1066:1: ( 'lasted' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1066:1: ( 'lasted' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1067:1: 'lasted'
            {
             before(grammarAccess.getStatusAccess().getLastedKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Status__Group__2__Impl2099); 
             after(grammarAccess.getStatusAccess().getLastedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__2__Impl


    // $ANTLR start rule__Status__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1080:1: rule__Status__Group__3 : rule__Status__Group__3__Impl rule__Status__Group__4 ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1084:1: ( rule__Status__Group__3__Impl rule__Status__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1085:2: rule__Status__Group__3__Impl rule__Status__Group__4
            {
            pushFollow(FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__32130);
            rule__Status__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__4_in_rule__Status__Group__32133);
            rule__Status__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__3


    // $ANTLR start rule__Status__Group__3__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1092:1: rule__Status__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Status__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1096:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1097:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1097:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1098:1: RULE_INT
            {
             before(grammarAccess.getStatusAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Status__Group__3__Impl2160); 
             after(grammarAccess.getStatusAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__3__Impl


    // $ANTLR start rule__Status__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1109:1: rule__Status__Group__4 : rule__Status__Group__4__Impl rule__Status__Group__5 ;
    public final void rule__Status__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1113:1: ( rule__Status__Group__4__Impl rule__Status__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1114:2: rule__Status__Group__4__Impl rule__Status__Group__5
            {
            pushFollow(FOLLOW_rule__Status__Group__4__Impl_in_rule__Status__Group__42189);
            rule__Status__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__5_in_rule__Status__Group__42192);
            rule__Status__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__4


    // $ANTLR start rule__Status__Group__4__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1121:1: rule__Status__Group__4__Impl : ( '.' ) ;
    public final void rule__Status__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1125:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1126:1: ( '.' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1126:1: ( '.' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1127:1: '.'
            {
             before(grammarAccess.getStatusAccess().getFullStopKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Status__Group__4__Impl2220); 
             after(grammarAccess.getStatusAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__4__Impl


    // $ANTLR start rule__Status__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1140:1: rule__Status__Group__5 : rule__Status__Group__5__Impl rule__Status__Group__6 ;
    public final void rule__Status__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1144:1: ( rule__Status__Group__5__Impl rule__Status__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1145:2: rule__Status__Group__5__Impl rule__Status__Group__6
            {
            pushFollow(FOLLOW_rule__Status__Group__5__Impl_in_rule__Status__Group__52251);
            rule__Status__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Status__Group__6_in_rule__Status__Group__52254);
            rule__Status__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__5


    // $ANTLR start rule__Status__Group__5__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1152:1: rule__Status__Group__5__Impl : ( RULE_INT ) ;
    public final void rule__Status__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1156:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1157:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1157:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1158:1: RULE_INT
            {
             before(grammarAccess.getStatusAccess().getINTTerminalRuleCall_5()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Status__Group__5__Impl2281); 
             after(grammarAccess.getStatusAccess().getINTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__5__Impl


    // $ANTLR start rule__Status__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1169:1: rule__Status__Group__6 : rule__Status__Group__6__Impl ;
    public final void rule__Status__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1173:1: ( rule__Status__Group__6__Impl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1174:2: rule__Status__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Status__Group__6__Impl_in_rule__Status__Group__62310);
            rule__Status__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__6


    // $ANTLR start rule__Status__Group__6__Impl
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1180:1: rule__Status__Group__6__Impl : ( 'second.' ) ;
    public final void rule__Status__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1184:1: ( ( 'second.' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1185:1: ( 'second.' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1185:1: ( 'second.' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1186:1: 'second.'
            {
             before(grammarAccess.getStatusAccess().getSecondKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Status__Group__6__Impl2338); 
             after(grammarAccess.getStatusAccess().getSecondKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Status__Group__6__Impl


    // $ANTLR start rule__Trace__InputsAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1214:1: rule__Trace__InputsAssignment_1 : ( ruledecl ) ;
    public final void rule__Trace__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1218:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1219:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1219:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1220:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getInputsDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_12388);
            ruledecl();
            _fsp--;

             after(grammarAccess.getTraceAccess().getInputsDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__InputsAssignment_1


    // $ANTLR start rule__Trace__OutputsAssignment_4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1229:1: rule__Trace__OutputsAssignment_4 : ( ruledecl ) ;
    public final void rule__Trace__OutputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1233:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1234:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1234:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1235:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getOutputsDeclParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_42419);
            ruledecl();
            _fsp--;

             after(grammarAccess.getTraceAccess().getOutputsDeclParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__OutputsAssignment_4


    // $ANTLR start rule__Trace__LocalAssignment_7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1244:1: rule__Trace__LocalAssignment_7 : ( ruledecl ) ;
    public final void rule__Trace__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1248:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1249:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1249:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1250:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getLocalDeclParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_72450);
            ruledecl();
            _fsp--;

             after(grammarAccess.getTraceAccess().getLocalDeclParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__LocalAssignment_7


    // $ANTLR start rule__Trace__TickAssignment_9
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1259:1: rule__Trace__TickAssignment_9 : ( ruleTick ) ;
    public final void rule__Trace__TickAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1263:1: ( ( ruleTick ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1264:1: ( ruleTick )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1264:1: ( ruleTick )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1265:1: ruleTick
            {
             before(grammarAccess.getTraceAccess().getTickTickParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTick_in_rule__Trace__TickAssignment_92481);
            ruleTick();
            _fsp--;

             after(grammarAccess.getTraceAccess().getTickTickParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trace__TickAssignment_9


    // $ANTLR start rule__Decl__NameAssignment_0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1274:1: rule__Decl__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Decl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1278:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1279:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1279:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1280:1: RULE_STRING
            {
             before(grammarAccess.getDeclAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decl__NameAssignment_02512); 
             after(grammarAccess.getDeclAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__NameAssignment_0


    // $ANTLR start rule__Decl__TypeAssignment_2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1289:1: rule__Decl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Decl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1293:1: ( ( ruleType ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1294:1: ( ruleType )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1294:1: ( ruleType )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1295:1: ruleType
            {
             before(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Decl__TypeAssignment_22543);
            ruleType();
            _fsp--;

             after(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__TypeAssignment_2


    // $ANTLR start rule__Tick__NrAssignment_2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1304:1: rule__Tick__NrAssignment_2 : ( RULE_INT ) ;
    public final void rule__Tick__NrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1308:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1309:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1309:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1310:1: RULE_INT
            {
             before(grammarAccess.getTickAccess().getNrINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_22574); 
             after(grammarAccess.getTickAccess().getNrINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__NrAssignment_2


    // $ANTLR start rule__Tick__InputAssignment_3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1319:1: rule__Tick__InputAssignment_3 : ( ruleData ) ;
    public final void rule__Tick__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1323:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1324:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1324:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1325:1: ruleData
            {
             before(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__InputAssignment_32605);
            ruleData();
            _fsp--;

             after(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__InputAssignment_3


    // $ANTLR start rule__Tick__OutputAssignment_5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1334:1: rule__Tick__OutputAssignment_5 : ( ruleData ) ;
    public final void rule__Tick__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1338:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1339:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1339:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1340:1: ruleData
            {
             before(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__OutputAssignment_52636);
            ruleData();
            _fsp--;

             after(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__OutputAssignment_5


    // $ANTLR start rule__Tick__LocalAssignment_7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1349:1: rule__Tick__LocalAssignment_7 : ( ruleData ) ;
    public final void rule__Tick__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1353:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1354:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1354:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1355:1: ruleData
            {
             before(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__LocalAssignment_72667);
            ruleData();
            _fsp--;

             after(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Tick__LocalAssignment_7


    // $ANTLR start rule__Data__ValAssignment_0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1364:1: rule__Data__ValAssignment_0 : ( RULE_INT ) ;
    public final void rule__Data__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1368:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1369:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1369:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1370:1: RULE_INT
            {
             before(grammarAccess.getDataAccess().getValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Data__ValAssignment_02698); 
             after(grammarAccess.getDataAccess().getValINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__ValAssignment_0


    // $ANTLR start rule__Data__TrueAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1379:1: rule__Data__TrueAssignment_1 : ( ( 'T' ) ) ;
    public final void rule__Data__TrueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1383:1: ( ( ( 'T' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1384:1: ( ( 'T' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1384:1: ( ( 'T' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1385:1: ( 'T' )
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1386:1: ( 'T' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1387:1: 'T'
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Data__TrueAssignment_12734); 
             after(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 

            }

             after(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__TrueAssignment_1


    // $ANTLR start rule__Data__FalseAssignment_2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1402:1: rule__Data__FalseAssignment_2 : ( ( 'F' ) ) ;
    public final void rule__Data__FalseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1406:1: ( ( ( 'F' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1407:1: ( ( 'F' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1407:1: ( ( 'F' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1408:1: ( 'F' )
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1409:1: ( 'F' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/ui/contentassist/antlr/internal/InternalRif.g:1410:1: 'F'
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Data__FalseAssignment_22778); 
             after(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 

            }

             after(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__FalseAssignment_2


 

    public static final BitSet FOLLOW_ruleTrace_in_entryRuleTrace61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrace68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0_in_ruleTrace94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0_in_ruledecl154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_entryRuleTick241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTick248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__0_in_ruleTick274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Alternatives_in_ruleData334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__0_in_ruleStatus394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__ValAssignment_0_in_rule__Data__Alternatives485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__0552 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUTS_in_rule__Trace__Group__0__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__1611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1__Impl641 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__2672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__2__Impl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__3734 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUTPUTS_in_rule__Trace__Group__3__Impl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__4793 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4__Impl823 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__5854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__5__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__6__Impl_in_rule__Trace__Group__6916 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALS_in_rule__Trace__Group__6__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__7__Impl_in_rule__Trace__Group__7975 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7__Impl1005 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Trace__Group__8__Impl_in_rule__Trace__Group__81036 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__81039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__8__Impl1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__9__Impl_in_rule__Trace__Group__91098 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Trace__Group__10_in_rule__Trace__Group__91101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9__Impl1130 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9__Impl1142 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Trace__Group__10__Impl_in_rule__Trace__Group__101175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__Trace__Group__10__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__01256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__NameAssignment_0_in_rule__Decl__Group__0__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__11316 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Decl__Group__1__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__2__Impl_in_rule__Decl__Group__21378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__TypeAssignment_2_in_rule__Decl__Group__2__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__0__Impl_in_rule__Tick__Group__01441 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1__Impl_in_rule__Tick__Group__11502 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tick__Group__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__2__Impl_in_rule__Tick__Group__21564 = new BitSet(new long[]{0x0000000001810080L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__2__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__3__Impl_in_rule__Tick__Group__31624 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__3__Impl1654 = new BitSet(new long[]{0x0000000001800082L});
    public static final BitSet FOLLOW_rule__Tick__Group__4__Impl_in_rule__Tick__Group__41685 = new BitSet(new long[]{0x0000000001820080L});
    public static final BitSet FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tick__Group__4__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__5__Impl_in_rule__Tick__Group__51747 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__5__Impl1777 = new BitSet(new long[]{0x0000000001800082L});
    public static final BitSet FOLLOW_rule__Tick__Group__6__Impl_in_rule__Tick__Group__61808 = new BitSet(new long[]{0x0000000001800082L});
    public static final BitSet FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Tick__Group__6__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__7__Impl_in_rule__Tick__Group__71870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__7__Impl1897 = new BitSet(new long[]{0x0000000001800082L});
    public static final BitSet FOLLOW_rule__Status__Group__0__Impl_in_rule__Status__Group__01944 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Status__Group__0__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__1__Impl_in_rule__Status__Group__12006 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Status__Group__2_in_rule__Status__Group__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Status__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__2__Impl_in_rule__Status__Group__22068 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Status__Group__3_in_rule__Status__Group__22071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Status__Group__2__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__3__Impl_in_rule__Status__Group__32130 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Status__Group__4_in_rule__Status__Group__32133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Status__Group__3__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__4__Impl_in_rule__Status__Group__42189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Status__Group__5_in_rule__Status__Group__42192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Status__Group__4__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__5__Impl_in_rule__Status__Group__52251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Status__Group__6_in_rule__Status__Group__52254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Status__Group__5__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__6__Impl_in_rule__Status__Group__62310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Status__Group__6__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_42419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_72450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_rule__Trace__TickAssignment_92481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decl__NameAssignment_02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Decl__TypeAssignment_22543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_22574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__InputAssignment_32605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__OutputAssignment_52636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__LocalAssignment_72667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Data__ValAssignment_02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Data__TrueAssignment_12734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Data__FalseAssignment_22778 = new BitSet(new long[]{0x0000000000000002L});

}