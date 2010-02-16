package de.cau.cs.kieler.krep.editors.rif.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.krep.editors.rif.services.RifGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalRifParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INPUTS", "RULE_OUTPUTS", "RULE_LOCALS", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_COMMENT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'bool'", "'int'", "'@#'", "':'", "'#step'", "'#outs'", "'#locs'", "'The'", "'execution'", "'lasted'", "'.'", "'second.'", "'T'", "'F'"
    };
    public static final int RULE_LOCALS=6;
    public static final int RULE_ID=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_OUTPUTS=5;
    public static final int RULE_INPUTS=4;
    public static final int RULE_INT=7;
    public static final int RULE_COMMENT=10;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;

        public InternalRifParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g"; }


     
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:60:1: entryRuleTrace : ruleTrace EOF ;
    public final void entryRuleTrace() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:61:1: ( ruleTrace EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:62:1: ruleTrace EOF
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:69:1: ruleTrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruleTrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:73:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:74:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:74:1: ( ( rule__Trace__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:75:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:76:1: ( rule__Trace__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:76:2: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_rule__Trace__Group__0_in_ruleTrace95);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:88:1: entryRuledecl : ruledecl EOF ;
    public final void entryRuledecl() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:89:1: ( ruledecl EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:90:1: ruledecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruledecl_in_entryRuledecl122);
            ruledecl();
            _fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledecl129); 

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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:97:1: ruledecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruledecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:101:2: ( ( ( rule__Decl__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:102:1: ( ( rule__Decl__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:102:1: ( ( rule__Decl__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:103:1: ( rule__Decl__Group__0 )
            {
             before(grammarAccess.getDeclAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:104:1: ( rule__Decl__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:104:2: rule__Decl__Group__0
            {
            pushFollow(FOLLOW_rule__Decl__Group__0_in_ruledecl156);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:117:1: ( ruleType EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType183);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType190); 

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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:125:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:129:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:130:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:130:1: ( ( rule__Type__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:131:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:132:1: ( rule__Type__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:132:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType217);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:144:1: entryRuleTick : ruleTick EOF ;
    public final void entryRuleTick() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:145:1: ( ruleTick EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:146:1: ruleTick EOF
            {
             before(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_ruleTick_in_entryRuleTick244);
            ruleTick();
            _fsp--;

             after(grammarAccess.getTickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTick251); 

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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:153:1: ruleTick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruleTick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:157:2: ( ( ( rule__Tick__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:158:1: ( ( rule__Tick__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:158:1: ( ( rule__Tick__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:159:1: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:160:1: ( rule__Tick__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:160:2: rule__Tick__Group__0
            {
            pushFollow(FOLLOW_rule__Tick__Group__0_in_ruleTick278);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:172:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:173:1: ( ruleData EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:174:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData305);
            ruleData();
            _fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData312); 

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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:181:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:185:2: ( ( ( rule__Data__Alternatives ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:186:1: ( ( rule__Data__Alternatives ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:186:1: ( ( rule__Data__Alternatives ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:187:1: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:188:1: ( rule__Data__Alternatives )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:188:2: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_rule__Data__Alternatives_in_ruleData339);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:200:1: entryRuleStatus : ruleStatus EOF ;
    public final void entryRuleStatus() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:201:1: ( ruleStatus EOF )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:202:1: ruleStatus EOF
            {
             before(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_ruleStatus_in_entryRuleStatus366);
            ruleStatus();
            _fsp--;

             after(grammarAccess.getStatusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatus373); 

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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:209:1: ruleStatus : ( ( rule__Status__Group__0 ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:213:2: ( ( ( rule__Status__Group__0 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:214:1: ( ( rule__Status__Group__0 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:214:1: ( ( rule__Status__Group__0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:215:1: ( rule__Status__Group__0 )
            {
             before(grammarAccess.getStatusAccess().getGroup()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:216:1: ( rule__Status__Group__0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:216:2: rule__Status__Group__0
            {
            pushFollow(FOLLOW_rule__Status__Group__0_in_ruleStatus400);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:228:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:232:1: ( ( 'bool' ) | ( 'int' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("228:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:233:1: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:233:1: ( 'bool' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:234:1: 'bool'
                    {
                     before(grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives437); 
                     after(grammarAccess.getTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:241:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:241:6: ( 'int' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:242:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives457); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:254:1: rule__Data__Alternatives : ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:258:1: ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("254:1: rule__Data__Alternatives : ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:259:1: ( ( rule__Data__IntValAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:259:1: ( ( rule__Data__IntValAssignment_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:260:1: ( rule__Data__IntValAssignment_0 )
                    {
                     before(grammarAccess.getDataAccess().getIntValAssignment_0()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:261:1: ( rule__Data__IntValAssignment_0 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:261:2: rule__Data__IntValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Data__IntValAssignment_0_in_rule__Data__Alternatives491);
                    rule__Data__IntValAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getIntValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:265:6: ( ( rule__Data__TrueAssignment_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:265:6: ( ( rule__Data__TrueAssignment_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:266:1: ( rule__Data__TrueAssignment_1 )
                    {
                     before(grammarAccess.getDataAccess().getTrueAssignment_1()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:267:1: ( rule__Data__TrueAssignment_1 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:267:2: rule__Data__TrueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives509);
                    rule__Data__TrueAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getTrueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:271:6: ( ( rule__Data__FalseAssignment_2 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:271:6: ( ( rule__Data__FalseAssignment_2 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:272:1: ( rule__Data__FalseAssignment_2 )
                    {
                     before(grammarAccess.getDataAccess().getFalseAssignment_2()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:273:1: ( rule__Data__FalseAssignment_2 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:273:2: rule__Data__FalseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives527);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:284:1: rule__Trace__Group__0 : ( RULE_INPUTS ) rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:288:1: ( ( RULE_INPUTS ) rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:289:1: ( RULE_INPUTS ) rule__Trace__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:289:1: ( RULE_INPUTS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:290:1: RULE_INPUTS
            {
             before(grammarAccess.getTraceAccess().getINPUTSTerminalRuleCall_0()); 
            match(input,RULE_INPUTS,FOLLOW_RULE_INPUTS_in_rule__Trace__Group__0562); 
             after(grammarAccess.getTraceAccess().getINPUTSTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0570);
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


    // $ANTLR start rule__Trace__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:302:1: rule__Trace__Group__1 : ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:306:1: ( ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:307:1: ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:307:1: ( ( rule__Trace__InputsAssignment_1 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:308:1: ( rule__Trace__InputsAssignment_1 )*
            {
             before(grammarAccess.getTraceAccess().getInputsAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:309:1: ( rule__Trace__InputsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:309:2: rule__Trace__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1598);
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

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1608);
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


    // $ANTLR start rule__Trace__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:320:1: rule__Trace__Group__2 : ( '@#' ) rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:324:1: ( ( '@#' ) rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:325:1: ( '@#' ) rule__Trace__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:325:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:326:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Trace__Group__2637); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2647);
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


    // $ANTLR start rule__Trace__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:340:1: rule__Trace__Group__3 : ( RULE_OUTPUTS ) rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:344:1: ( ( RULE_OUTPUTS ) rule__Trace__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:345:1: ( RULE_OUTPUTS ) rule__Trace__Group__4
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:345:1: ( RULE_OUTPUTS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:346:1: RULE_OUTPUTS
            {
             before(grammarAccess.getTraceAccess().getOUTPUTSTerminalRuleCall_3()); 
            match(input,RULE_OUTPUTS,FOLLOW_RULE_OUTPUTS_in_rule__Trace__Group__3675); 
             after(grammarAccess.getTraceAccess().getOUTPUTSTerminalRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3683);
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


    // $ANTLR start rule__Trace__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:358:1: rule__Trace__Group__4 : ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:362:1: ( ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:363:1: ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:363:1: ( ( rule__Trace__OutputsAssignment_4 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:364:1: ( rule__Trace__OutputsAssignment_4 )*
            {
             before(grammarAccess.getTraceAccess().getOutputsAssignment_4()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:365:1: ( rule__Trace__OutputsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:365:2: rule__Trace__OutputsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4711);
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

            pushFollow(FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4721);
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


    // $ANTLR start rule__Trace__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:376:1: rule__Trace__Group__5 : ( '@#' ) rule__Trace__Group__6 ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:380:1: ( ( '@#' ) rule__Trace__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:381:1: ( '@#' ) rule__Trace__Group__6
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:381:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:382:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Trace__Group__5750); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5760);
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


    // $ANTLR start rule__Trace__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:396:1: rule__Trace__Group__6 : ( RULE_LOCALS ) rule__Trace__Group__7 ;
    public final void rule__Trace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:400:1: ( ( RULE_LOCALS ) rule__Trace__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:401:1: ( RULE_LOCALS ) rule__Trace__Group__7
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:401:1: ( RULE_LOCALS )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:402:1: RULE_LOCALS
            {
             before(grammarAccess.getTraceAccess().getLOCALSTerminalRuleCall_6()); 
            match(input,RULE_LOCALS,FOLLOW_RULE_LOCALS_in_rule__Trace__Group__6788); 
             after(grammarAccess.getTraceAccess().getLOCALSTerminalRuleCall_6()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6796);
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


    // $ANTLR start rule__Trace__Group__7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:414:1: rule__Trace__Group__7 : ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8 ;
    public final void rule__Trace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:418:1: ( ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:419:1: ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:419:1: ( ( rule__Trace__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:420:1: ( rule__Trace__LocalAssignment_7 )*
            {
             before(grammarAccess.getTraceAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:421:1: ( rule__Trace__LocalAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:421:2: rule__Trace__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7824);
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

            pushFollow(FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7834);
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


    // $ANTLR start rule__Trace__Group__8
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:432:1: rule__Trace__Group__8 : ( '@#' ) rule__Trace__Group__9 ;
    public final void rule__Trace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:436:1: ( ( '@#' ) rule__Trace__Group__9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:437:1: ( '@#' ) rule__Trace__Group__9
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:437:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:438:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Trace__Group__8863); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__8873);
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


    // $ANTLR start rule__Trace__Group__9
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:452:1: rule__Trace__Group__9 : ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) rule__Trace__Group__10 ;
    public final void rule__Trace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:456:1: ( ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) rule__Trace__Group__10 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:457:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) rule__Trace__Group__10
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:457:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:458:1: ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:458:1: ( ( rule__Trace__TickAssignment_9 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:459:1: ( rule__Trace__TickAssignment_9 )
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:460:1: ( rule__Trace__TickAssignment_9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:460:2: rule__Trace__TickAssignment_9
            {
            pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9903);
            rule__Trace__TickAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getTickAssignment_9()); 

            }

            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:463:1: ( ( rule__Trace__TickAssignment_9 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:464:1: ( rule__Trace__TickAssignment_9 )*
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:465:1: ( rule__Trace__TickAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:465:2: rule__Trace__TickAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9915);
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

            pushFollow(FOLLOW_rule__Trace__Group__10_in_rule__Trace__Group__9927);
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


    // $ANTLR start rule__Trace__Group__10
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:477:1: rule__Trace__Group__10 : ( ( ruleStatus )? ) ;
    public final void rule__Trace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:481:1: ( ( ( ruleStatus )? ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:482:1: ( ( ruleStatus )? )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:482:1: ( ( ruleStatus )? )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:483:1: ( ruleStatus )?
            {
             before(grammarAccess.getTraceAccess().getStatusParserRuleCall_10()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:484:1: ( ruleStatus )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:484:3: ruleStatus
                    {
                    pushFollow(FOLLOW_ruleStatus_in_rule__Trace__Group__10956);
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
    // $ANTLR end rule__Trace__Group__10


    // $ANTLR start rule__Decl__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:516:1: rule__Decl__Group__0 : ( ( rule__Decl__NameAssignment_0 ) ) rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:520:1: ( ( ( rule__Decl__NameAssignment_0 ) ) rule__Decl__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:521:1: ( ( rule__Decl__NameAssignment_0 ) ) rule__Decl__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:521:1: ( ( rule__Decl__NameAssignment_0 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:522:1: ( rule__Decl__NameAssignment_0 )
            {
             before(grammarAccess.getDeclAccess().getNameAssignment_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:523:1: ( rule__Decl__NameAssignment_0 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:523:2: rule__Decl__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Decl__NameAssignment_0_in_rule__Decl__Group__01013);
            rule__Decl__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__01022);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:534:1: rule__Decl__Group__1 : ( ':' ) rule__Decl__Group__2 ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:538:1: ( ( ':' ) rule__Decl__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:539:1: ( ':' ) rule__Decl__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:539:1: ( ':' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:540:1: ':'
            {
             before(grammarAccess.getDeclAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Decl__Group__11051); 
             after(grammarAccess.getDeclAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__11061);
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


    // $ANTLR start rule__Decl__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:554:1: rule__Decl__Group__2 : ( ( rule__Decl__TypeAssignment_2 ) ) ;
    public final void rule__Decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:558:1: ( ( ( rule__Decl__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:559:1: ( ( rule__Decl__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:559:1: ( ( rule__Decl__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:560:1: ( rule__Decl__TypeAssignment_2 )
            {
             before(grammarAccess.getDeclAccess().getTypeAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:561:1: ( rule__Decl__TypeAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:561:2: rule__Decl__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Decl__TypeAssignment_2_in_rule__Decl__Group__21089);
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
    // $ANTLR end rule__Decl__Group__2


    // $ANTLR start rule__Tick__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:577:1: rule__Tick__Group__0 : ( () ) rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:581:1: ( ( () ) rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:582:1: ( () ) rule__Tick__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:582:1: ( () )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:583:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:584:1: ()
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:586:1: 
            {
            }

             after(grammarAccess.getTickAccess().getTickAction_0()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01139);
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


    // $ANTLR start rule__Tick__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:597:1: rule__Tick__Group__1 : ( '#step' ) rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:601:1: ( ( '#step' ) rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:602:1: ( '#step' ) rule__Tick__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:602:1: ( '#step' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:603:1: '#step'
            {
             before(grammarAccess.getTickAccess().getStepKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Tick__Group__11168); 
             after(grammarAccess.getTickAccess().getStepKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11178);
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


    // $ANTLR start rule__Tick__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:617:1: rule__Tick__Group__2 : ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:621:1: ( ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:622:1: ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:622:1: ( ( rule__Tick__NrAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:623:1: ( rule__Tick__NrAssignment_2 )
            {
             before(grammarAccess.getTickAccess().getNrAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:624:1: ( rule__Tick__NrAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:624:2: rule__Tick__NrAssignment_2
            {
            pushFollow(FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__21206);
            rule__Tick__NrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getNrAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21215);
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


    // $ANTLR start rule__Tick__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:635:1: rule__Tick__Group__3 : ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:639:1: ( ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:640:1: ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:640:1: ( ( rule__Tick__InputAssignment_3 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:641:1: ( rule__Tick__InputAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_3()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:642:1: ( rule__Tick__InputAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:642:2: rule__Tick__InputAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__31243);
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

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31253);
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


    // $ANTLR start rule__Tick__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:653:1: rule__Tick__Group__4 : ( '#outs' ) rule__Tick__Group__5 ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:657:1: ( ( '#outs' ) rule__Tick__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:658:1: ( '#outs' ) rule__Tick__Group__5
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:658:1: ( '#outs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:659:1: '#outs'
            {
             before(grammarAccess.getTickAccess().getOutsKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Tick__Group__41282); 
             after(grammarAccess.getTickAccess().getOutsKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41292);
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


    // $ANTLR start rule__Tick__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:673:1: rule__Tick__Group__5 : ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6 ;
    public final void rule__Tick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:677:1: ( ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:678:1: ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:678:1: ( ( rule__Tick__OutputAssignment_5 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:679:1: ( rule__Tick__OutputAssignment_5 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_5()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:680:1: ( rule__Tick__OutputAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=27 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:680:2: rule__Tick__OutputAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__51320);
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

            pushFollow(FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51330);
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


    // $ANTLR start rule__Tick__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:691:1: rule__Tick__Group__6 : ( '#locs' ) rule__Tick__Group__7 ;
    public final void rule__Tick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:695:1: ( ( '#locs' ) rule__Tick__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:696:1: ( '#locs' ) rule__Tick__Group__7
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:696:1: ( '#locs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:697:1: '#locs'
            {
             before(grammarAccess.getTickAccess().getLocsKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Tick__Group__61359); 
             after(grammarAccess.getTickAccess().getLocsKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61369);
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


    // $ANTLR start rule__Tick__Group__7
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:711:1: rule__Tick__Group__7 : ( ( rule__Tick__LocalAssignment_7 )* ) ;
    public final void rule__Tick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:715:1: ( ( ( rule__Tick__LocalAssignment_7 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:716:1: ( ( rule__Tick__LocalAssignment_7 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:716:1: ( ( rule__Tick__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:717:1: ( rule__Tick__LocalAssignment_7 )*
            {
             before(grammarAccess.getTickAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:718:1: ( rule__Tick__LocalAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:718:2: rule__Tick__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__71397);
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
    // $ANTLR end rule__Tick__Group__7


    // $ANTLR start rule__Status__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:744:1: rule__Status__Group__0 : ( 'The' ) rule__Status__Group__1 ;
    public final void rule__Status__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:748:1: ( ( 'The' ) rule__Status__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:749:1: ( 'The' ) rule__Status__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:749:1: ( 'The' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:750:1: 'The'
            {
             before(grammarAccess.getStatusAccess().getTheKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Status__Group__01449); 
             after(grammarAccess.getStatusAccess().getTheKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01459);
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


    // $ANTLR start rule__Status__Group__1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:764:1: rule__Status__Group__1 : ( 'execution' ) rule__Status__Group__2 ;
    public final void rule__Status__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:768:1: ( ( 'execution' ) rule__Status__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:769:1: ( 'execution' ) rule__Status__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:769:1: ( 'execution' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:770:1: 'execution'
            {
             before(grammarAccess.getStatusAccess().getExecutionKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Status__Group__11488); 
             after(grammarAccess.getStatusAccess().getExecutionKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11498);
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


    // $ANTLR start rule__Status__Group__2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:784:1: rule__Status__Group__2 : ( 'lasted' ) rule__Status__Group__3 ;
    public final void rule__Status__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:788:1: ( ( 'lasted' ) rule__Status__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:789:1: ( 'lasted' ) rule__Status__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:789:1: ( 'lasted' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:790:1: 'lasted'
            {
             before(grammarAccess.getStatusAccess().getLastedKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Status__Group__21527); 
             after(grammarAccess.getStatusAccess().getLastedKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21537);
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


    // $ANTLR start rule__Status__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:804:1: rule__Status__Group__3 : ( RULE_INT ) rule__Status__Group__4 ;
    public final void rule__Status__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:808:1: ( ( RULE_INT ) rule__Status__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:809:1: ( RULE_INT ) rule__Status__Group__4
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:809:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:810:1: RULE_INT
            {
             before(grammarAccess.getStatusAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Status__Group__31565); 
             after(grammarAccess.getStatusAccess().getINTTerminalRuleCall_3()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__4_in_rule__Status__Group__31573);
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


    // $ANTLR start rule__Status__Group__4
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:822:1: rule__Status__Group__4 : ( '.' ) rule__Status__Group__5 ;
    public final void rule__Status__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:826:1: ( ( '.' ) rule__Status__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:827:1: ( '.' ) rule__Status__Group__5
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:827:1: ( '.' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:828:1: '.'
            {
             before(grammarAccess.getStatusAccess().getFullStopKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Status__Group__41602); 
             after(grammarAccess.getStatusAccess().getFullStopKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__5_in_rule__Status__Group__41612);
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


    // $ANTLR start rule__Status__Group__5
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:842:1: rule__Status__Group__5 : ( RULE_INT ) rule__Status__Group__6 ;
    public final void rule__Status__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:846:1: ( ( RULE_INT ) rule__Status__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:847:1: ( RULE_INT ) rule__Status__Group__6
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:847:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:848:1: RULE_INT
            {
             before(grammarAccess.getStatusAccess().getINTTerminalRuleCall_5()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Status__Group__51640); 
             after(grammarAccess.getStatusAccess().getINTTerminalRuleCall_5()); 

            }

            pushFollow(FOLLOW_rule__Status__Group__6_in_rule__Status__Group__51648);
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


    // $ANTLR start rule__Status__Group__6
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:860:1: rule__Status__Group__6 : ( 'second.' ) ;
    public final void rule__Status__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:864:1: ( ( 'second.' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:865:1: ( 'second.' )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:865:1: ( 'second.' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:866:1: 'second.'
            {
             before(grammarAccess.getStatusAccess().getSecondKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__Status__Group__61677); 
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
    // $ANTLR end rule__Status__Group__6


    // $ANTLR start rule__Trace__InputsAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:893:1: rule__Trace__InputsAssignment_1 : ( ruledecl ) ;
    public final void rule__Trace__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:897:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:898:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:898:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:899:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getInputsDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_11726);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:908:1: rule__Trace__OutputsAssignment_4 : ( ruledecl ) ;
    public final void rule__Trace__OutputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:912:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:913:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:913:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:914:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getOutputsDeclParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_41757);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:923:1: rule__Trace__LocalAssignment_7 : ( ruledecl ) ;
    public final void rule__Trace__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:927:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:928:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:928:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:929:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getLocalDeclParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_71788);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:938:1: rule__Trace__TickAssignment_9 : ( ruleTick ) ;
    public final void rule__Trace__TickAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:942:1: ( ( ruleTick ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:943:1: ( ruleTick )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:943:1: ( ruleTick )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:944:1: ruleTick
            {
             before(grammarAccess.getTraceAccess().getTickTickParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTick_in_rule__Trace__TickAssignment_91819);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:953:1: rule__Decl__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Decl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:957:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:958:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:958:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:959:1: RULE_STRING
            {
             before(grammarAccess.getDeclAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Decl__NameAssignment_01850); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:968:1: rule__Decl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Decl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:972:1: ( ( ruleType ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:973:1: ( ruleType )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:973:1: ( ruleType )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:974:1: ruleType
            {
             before(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Decl__TypeAssignment_21881);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:983:1: rule__Tick__NrAssignment_2 : ( RULE_INT ) ;
    public final void rule__Tick__NrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:987:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:988:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:988:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:989:1: RULE_INT
            {
             before(grammarAccess.getTickAccess().getNrINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_21912); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:998:1: rule__Tick__InputAssignment_3 : ( ruleData ) ;
    public final void rule__Tick__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1002:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1003:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1003:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1004:1: ruleData
            {
             before(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__InputAssignment_31943);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1013:1: rule__Tick__OutputAssignment_5 : ( ruleData ) ;
    public final void rule__Tick__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1017:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1018:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1018:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1019:1: ruleData
            {
             before(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__OutputAssignment_51974);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1028:1: rule__Tick__LocalAssignment_7 : ( ruleData ) ;
    public final void rule__Tick__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1032:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1033:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1033:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1034:1: ruleData
            {
             before(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__LocalAssignment_72005);
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


    // $ANTLR start rule__Data__IntValAssignment_0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1043:1: rule__Data__IntValAssignment_0 : ( RULE_INT ) ;
    public final void rule__Data__IntValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1047:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1048:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1048:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1049:1: RULE_INT
            {
             before(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Data__IntValAssignment_02036); 
             after(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__IntValAssignment_0


    // $ANTLR start rule__Data__TrueAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1058:1: rule__Data__TrueAssignment_1 : ( ( 'T' ) ) ;
    public final void rule__Data__TrueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1062:1: ( ( ( 'T' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1063:1: ( ( 'T' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1063:1: ( ( 'T' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1064:1: ( 'T' )
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1065:1: ( 'T' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1066:1: 'T'
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Data__TrueAssignment_12072); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1081:1: rule__Data__FalseAssignment_2 : ( ( 'F' ) ) ;
    public final void rule__Data__FalseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1085:1: ( ( ( 'F' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1086:1: ( ( 'F' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1086:1: ( ( 'F' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1087:1: ( 'F' )
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1088:1: ( 'F' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:1089:1: 'F'
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Data__FalseAssignment_22116); 
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
    public static final BitSet FOLLOW_rule__Trace__Group__0_in_ruleTrace95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_entryRuledecl122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledecl129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0_in_ruledecl156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_entryRuleTick244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTick251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__0_in_ruleTick278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Alternatives_in_ruleData339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_entryRuleStatus366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatus373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Status__Group__0_in_ruleStatus400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__IntValAssignment_0_in_rule__Data__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INPUTS_in_rule__Trace__Group__0562 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1598 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Trace__Group__2637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUTPUTS_in_rule__Trace__Group__3675 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4711 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Trace__Group__5750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALS_in_rule__Trace__Group__6788 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7824 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Trace__Group__8863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__8873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9903 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9915 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_rule__Trace__Group__10_in_rule__Trace__Group__9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatus_in_rule__Trace__Group__10956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__NameAssignment_0_in_rule__Decl__Group__01013 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__01022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Decl__Group__11051 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__TypeAssignment_2_in_rule__Decl__Group__21089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Tick__Group__11168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__21206 = new BitSet(new long[]{0x0000000018100080L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__31243 = new BitSet(new long[]{0x0000000018100080L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Tick__Group__41282 = new BitSet(new long[]{0x0000000018200080L});
    public static final BitSet FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__51320 = new BitSet(new long[]{0x0000000018200080L});
    public static final BitSet FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Tick__Group__61359 = new BitSet(new long[]{0x0000000018000082L});
    public static final BitSet FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__71397 = new BitSet(new long[]{0x0000000018000082L});
    public static final BitSet FOLLOW_22_in_rule__Status__Group__01449 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Status__Group__1_in_rule__Status__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Status__Group__11488 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Status__Group__2_in_rule__Status__Group__11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Status__Group__21527 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Status__Group__3_in_rule__Status__Group__21537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Status__Group__31565 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Status__Group__4_in_rule__Status__Group__31573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Status__Group__41602 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Status__Group__5_in_rule__Status__Group__41612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Status__Group__51640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Status__Group__6_in_rule__Status__Group__51648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Status__Group__61677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_41757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_71788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_rule__Trace__TickAssignment_91819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Decl__NameAssignment_01850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Decl__TypeAssignment_21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_21912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__InputAssignment_31943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__OutputAssignment_51974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__LocalAssignment_72005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Data__IntValAssignment_02036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Data__TrueAssignment_12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Data__FalseAssignment_22116 = new BitSet(new long[]{0x0000000000000002L});

}