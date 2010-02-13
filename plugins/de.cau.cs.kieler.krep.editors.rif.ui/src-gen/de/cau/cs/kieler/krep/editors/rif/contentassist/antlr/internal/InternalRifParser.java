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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'int'", "'#@inputs'", "'@#'", "'#@outputs'", "'#@locals'", "'\"'", "'\":'", "'#step'", "'#outs'", "'#locs'", "'T'", "'F'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start rule__Type__Alternatives
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:200:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:204:1: ( ( 'bool' ) | ( 'int' ) )
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
                    new NoViableAltException("200:1: rule__Type__Alternatives : ( ( 'bool' ) | ( 'int' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:205:1: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:205:1: ( 'bool' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:206:1: 'bool'
                    {
                     before(grammarAccess.getTypeAccess().getBoolKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives376); 
                     after(grammarAccess.getTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:213:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:213:6: ( 'int' )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:214:1: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives396); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:226:1: rule__Data__Alternatives : ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:230:1: ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("226:1: rule__Data__Alternatives : ( ( ( rule__Data__IntValAssignment_0 ) ) | ( ( rule__Data__TrueAssignment_1 ) ) | ( ( rule__Data__FalseAssignment_2 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:231:1: ( ( rule__Data__IntValAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:231:1: ( ( rule__Data__IntValAssignment_0 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:232:1: ( rule__Data__IntValAssignment_0 )
                    {
                     before(grammarAccess.getDataAccess().getIntValAssignment_0()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:233:1: ( rule__Data__IntValAssignment_0 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:233:2: rule__Data__IntValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Data__IntValAssignment_0_in_rule__Data__Alternatives430);
                    rule__Data__IntValAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getIntValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:237:6: ( ( rule__Data__TrueAssignment_1 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:237:6: ( ( rule__Data__TrueAssignment_1 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:238:1: ( rule__Data__TrueAssignment_1 )
                    {
                     before(grammarAccess.getDataAccess().getTrueAssignment_1()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:239:1: ( rule__Data__TrueAssignment_1 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:239:2: rule__Data__TrueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives448);
                    rule__Data__TrueAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDataAccess().getTrueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:243:6: ( ( rule__Data__FalseAssignment_2 ) )
                    {
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:243:6: ( ( rule__Data__FalseAssignment_2 ) )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:244:1: ( rule__Data__FalseAssignment_2 )
                    {
                     before(grammarAccess.getDataAccess().getFalseAssignment_2()); 
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:245:1: ( rule__Data__FalseAssignment_2 )
                    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:245:2: rule__Data__FalseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives466);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:256:1: rule__Trace__Group__0 : ( '#@inputs' ) rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:260:1: ( ( '#@inputs' ) rule__Trace__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:261:1: ( '#@inputs' ) rule__Trace__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:261:1: ( '#@inputs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:262:1: '#@inputs'
            {
             before(grammarAccess.getTraceAccess().getInputsKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Trace__Group__0502); 
             after(grammarAccess.getTraceAccess().getInputsKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0512);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:276:1: rule__Trace__Group__1 : ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:280:1: ( ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:281:1: ( ( rule__Trace__InputsAssignment_1 )* ) rule__Trace__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:281:1: ( ( rule__Trace__InputsAssignment_1 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:282:1: ( rule__Trace__InputsAssignment_1 )*
            {
             before(grammarAccess.getTraceAccess().getInputsAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:283:1: ( rule__Trace__InputsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:283:2: rule__Trace__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1540);
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

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1550);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:294:1: rule__Trace__Group__2 : ( '@#' ) rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:298:1: ( ( '@#' ) rule__Trace__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:299:1: ( '@#' ) rule__Trace__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:299:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:300:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Trace__Group__2579); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2589);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:314:1: rule__Trace__Group__3 : ( '#@outputs' ) rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:318:1: ( ( '#@outputs' ) rule__Trace__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:319:1: ( '#@outputs' ) rule__Trace__Group__4
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:319:1: ( '#@outputs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:320:1: '#@outputs'
            {
             before(grammarAccess.getTraceAccess().getOutputsKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Trace__Group__3618); 
             after(grammarAccess.getTraceAccess().getOutputsKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3628);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:334:1: rule__Trace__Group__4 : ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:338:1: ( ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:339:1: ( ( rule__Trace__OutputsAssignment_4 )* ) rule__Trace__Group__5
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:339:1: ( ( rule__Trace__OutputsAssignment_4 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:340:1: ( rule__Trace__OutputsAssignment_4 )*
            {
             before(grammarAccess.getTraceAccess().getOutputsAssignment_4()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:341:1: ( rule__Trace__OutputsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:341:2: rule__Trace__OutputsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4656);
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

            pushFollow(FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4666);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:352:1: rule__Trace__Group__5 : ( '@#' ) rule__Trace__Group__6 ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:356:1: ( ( '@#' ) rule__Trace__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:357:1: ( '@#' ) rule__Trace__Group__6
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:357:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:358:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Trace__Group__5695); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5705);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:372:1: rule__Trace__Group__6 : ( '#@locals' ) rule__Trace__Group__7 ;
    public final void rule__Trace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:376:1: ( ( '#@locals' ) rule__Trace__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:377:1: ( '#@locals' ) rule__Trace__Group__7
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:377:1: ( '#@locals' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:378:1: '#@locals'
            {
             before(grammarAccess.getTraceAccess().getLocalsKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Trace__Group__6734); 
             after(grammarAccess.getTraceAccess().getLocalsKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6744);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:392:1: rule__Trace__Group__7 : ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8 ;
    public final void rule__Trace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:396:1: ( ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:397:1: ( ( rule__Trace__LocalAssignment_7 )* ) rule__Trace__Group__8
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:397:1: ( ( rule__Trace__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:398:1: ( rule__Trace__LocalAssignment_7 )*
            {
             before(grammarAccess.getTraceAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:399:1: ( rule__Trace__LocalAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:399:2: rule__Trace__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7772);
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

            pushFollow(FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7782);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:410:1: rule__Trace__Group__8 : ( '@#' ) rule__Trace__Group__9 ;
    public final void rule__Trace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:414:1: ( ( '@#' ) rule__Trace__Group__9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:415:1: ( '@#' ) rule__Trace__Group__9
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:415:1: ( '@#' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:416:1: '@#'
            {
             before(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Trace__Group__8811); 
             after(grammarAccess.getTraceAccess().getCommercialAtNumberSignKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__8821);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:430:1: rule__Trace__Group__9 : ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) ;
    public final void rule__Trace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:434:1: ( ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:435:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:435:1: ( ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:436:1: ( ( rule__Trace__TickAssignment_9 ) ) ( ( rule__Trace__TickAssignment_9 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:436:1: ( ( rule__Trace__TickAssignment_9 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:437:1: ( rule__Trace__TickAssignment_9 )
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:438:1: ( rule__Trace__TickAssignment_9 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:438:2: rule__Trace__TickAssignment_9
            {
            pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9851);
            rule__Trace__TickAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getTraceAccess().getTickAssignment_9()); 

            }

            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:441:1: ( ( rule__Trace__TickAssignment_9 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:442:1: ( rule__Trace__TickAssignment_9 )*
            {
             before(grammarAccess.getTraceAccess().getTickAssignment_9()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:443:1: ( rule__Trace__TickAssignment_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:443:2: rule__Trace__TickAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9863);
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
    // $ANTLR end rule__Trace__Group__9


    // $ANTLR start rule__Decl__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:474:1: rule__Decl__Group__0 : ( '\"' ) rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:478:1: ( ( '\"' ) rule__Decl__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:479:1: ( '\"' ) rule__Decl__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:479:1: ( '\"' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:480:1: '\"'
            {
             before(grammarAccess.getDeclAccess().getQuotationMarkKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Decl__Group__0921); 
             after(grammarAccess.getDeclAccess().getQuotationMarkKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__0931);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:494:1: rule__Decl__Group__1 : ( ( rule__Decl__NameAssignment_1 ) ) rule__Decl__Group__2 ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:498:1: ( ( ( rule__Decl__NameAssignment_1 ) ) rule__Decl__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:499:1: ( ( rule__Decl__NameAssignment_1 ) ) rule__Decl__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:499:1: ( ( rule__Decl__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:500:1: ( rule__Decl__NameAssignment_1 )
            {
             before(grammarAccess.getDeclAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:501:1: ( rule__Decl__NameAssignment_1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:501:2: rule__Decl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decl__NameAssignment_1_in_rule__Decl__Group__1959);
            rule__Decl__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__1968);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:512:1: rule__Decl__Group__2 : ( '\":' ) rule__Decl__Group__3 ;
    public final void rule__Decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:516:1: ( ( '\":' ) rule__Decl__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:517:1: ( '\":' ) rule__Decl__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:517:1: ( '\":' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:518:1: '\":'
            {
             before(grammarAccess.getDeclAccess().getQuotationMarkColonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Decl__Group__2997); 
             after(grammarAccess.getDeclAccess().getQuotationMarkColonKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Decl__Group__3_in_rule__Decl__Group__21007);
            rule__Decl__Group__3();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Decl__Group__3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:532:1: rule__Decl__Group__3 : ( ( rule__Decl__TypeAssignment_3 ) ) ;
    public final void rule__Decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:536:1: ( ( ( rule__Decl__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:537:1: ( ( rule__Decl__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:537:1: ( ( rule__Decl__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:538:1: ( rule__Decl__TypeAssignment_3 )
            {
             before(grammarAccess.getDeclAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:539:1: ( rule__Decl__TypeAssignment_3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:539:2: rule__Decl__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Decl__TypeAssignment_3_in_rule__Decl__Group__31035);
            rule__Decl__TypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDeclAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__Group__3


    // $ANTLR start rule__Tick__Group__0
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:557:1: rule__Tick__Group__0 : ( () ) rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:561:1: ( ( () ) rule__Tick__Group__1 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:562:1: ( () ) rule__Tick__Group__1
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:562:1: ( () )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:563:1: ()
            {
             before(grammarAccess.getTickAccess().getTickAction_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:564:1: ()
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:566:1: 
            {
            }

             after(grammarAccess.getTickAccess().getTickAction_0()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01087);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:577:1: rule__Tick__Group__1 : ( '#step' ) rule__Tick__Group__2 ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:581:1: ( ( '#step' ) rule__Tick__Group__2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:582:1: ( '#step' ) rule__Tick__Group__2
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:582:1: ( '#step' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:583:1: '#step'
            {
             before(grammarAccess.getTickAccess().getStepKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Tick__Group__11116); 
             after(grammarAccess.getTickAccess().getStepKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11126);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:597:1: rule__Tick__Group__2 : ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3 ;
    public final void rule__Tick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:601:1: ( ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:602:1: ( ( rule__Tick__NrAssignment_2 ) ) rule__Tick__Group__3
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:602:1: ( ( rule__Tick__NrAssignment_2 ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:603:1: ( rule__Tick__NrAssignment_2 )
            {
             before(grammarAccess.getTickAccess().getNrAssignment_2()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:604:1: ( rule__Tick__NrAssignment_2 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:604:2: rule__Tick__NrAssignment_2
            {
            pushFollow(FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__21154);
            rule__Tick__NrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTickAccess().getNrAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21163);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:615:1: rule__Tick__Group__3 : ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4 ;
    public final void rule__Tick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:619:1: ( ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:620:1: ( ( rule__Tick__InputAssignment_3 )* ) rule__Tick__Group__4
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:620:1: ( ( rule__Tick__InputAssignment_3 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:621:1: ( rule__Tick__InputAssignment_3 )*
            {
             before(grammarAccess.getTickAccess().getInputAssignment_3()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:622:1: ( rule__Tick__InputAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT||(LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:622:2: rule__Tick__InputAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__31191);
            	    rule__Tick__InputAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getInputAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31201);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:633:1: rule__Tick__Group__4 : ( '#outs' ) rule__Tick__Group__5 ;
    public final void rule__Tick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:637:1: ( ( '#outs' ) rule__Tick__Group__5 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:638:1: ( '#outs' ) rule__Tick__Group__5
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:638:1: ( '#outs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:639:1: '#outs'
            {
             before(grammarAccess.getTickAccess().getOutsKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Tick__Group__41230); 
             after(grammarAccess.getTickAccess().getOutsKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41240);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:653:1: rule__Tick__Group__5 : ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6 ;
    public final void rule__Tick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:657:1: ( ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:658:1: ( ( rule__Tick__OutputAssignment_5 )* ) rule__Tick__Group__6
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:658:1: ( ( rule__Tick__OutputAssignment_5 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:659:1: ( rule__Tick__OutputAssignment_5 )*
            {
             before(grammarAccess.getTickAccess().getOutputAssignment_5()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:660:1: ( rule__Tick__OutputAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:660:2: rule__Tick__OutputAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__51268);
            	    rule__Tick__OutputAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTickAccess().getOutputAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51278);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:671:1: rule__Tick__Group__6 : ( '#locs' ) rule__Tick__Group__7 ;
    public final void rule__Tick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:675:1: ( ( '#locs' ) rule__Tick__Group__7 )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:676:1: ( '#locs' ) rule__Tick__Group__7
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:676:1: ( '#locs' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:677:1: '#locs'
            {
             before(grammarAccess.getTickAccess().getLocsKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Tick__Group__61307); 
             after(grammarAccess.getTickAccess().getLocsKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61317);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:691:1: rule__Tick__Group__7 : ( ( rule__Tick__LocalAssignment_7 )* ) ;
    public final void rule__Tick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:695:1: ( ( ( rule__Tick__LocalAssignment_7 )* ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:696:1: ( ( rule__Tick__LocalAssignment_7 )* )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:696:1: ( ( rule__Tick__LocalAssignment_7 )* )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:697:1: ( rule__Tick__LocalAssignment_7 )*
            {
             before(grammarAccess.getTickAccess().getLocalAssignment_7()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:698:1: ( rule__Tick__LocalAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=22 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:698:2: rule__Tick__LocalAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__71345);
            	    rule__Tick__LocalAssignment_7();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start rule__Trace__InputsAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:724:1: rule__Trace__InputsAssignment_1 : ( ruledecl ) ;
    public final void rule__Trace__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:728:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:729:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:729:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:730:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getInputsDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_11396);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:739:1: rule__Trace__OutputsAssignment_4 : ( ruledecl ) ;
    public final void rule__Trace__OutputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:743:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:744:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:744:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:745:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getOutputsDeclParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_41427);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:754:1: rule__Trace__LocalAssignment_7 : ( ruledecl ) ;
    public final void rule__Trace__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:758:1: ( ( ruledecl ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:759:1: ( ruledecl )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:759:1: ( ruledecl )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:760:1: ruledecl
            {
             before(grammarAccess.getTraceAccess().getLocalDeclParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_71458);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:769:1: rule__Trace__TickAssignment_9 : ( ruleTick ) ;
    public final void rule__Trace__TickAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:773:1: ( ( ruleTick ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:774:1: ( ruleTick )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:774:1: ( ruleTick )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:775:1: ruleTick
            {
             before(grammarAccess.getTraceAccess().getTickTickParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTick_in_rule__Trace__TickAssignment_91489);
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


    // $ANTLR start rule__Decl__NameAssignment_1
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:784:1: rule__Decl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:788:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:789:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:789:1: ( RULE_ID )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:790:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_11520); 
             after(grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__NameAssignment_1


    // $ANTLR start rule__Decl__TypeAssignment_3
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:799:1: rule__Decl__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Decl__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:803:1: ( ( ruleType ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:804:1: ( ruleType )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:804:1: ( ruleType )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:805:1: ruleType
            {
             before(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Decl__TypeAssignment_31551);
            ruleType();
            _fsp--;

             after(grammarAccess.getDeclAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decl__TypeAssignment_3


    // $ANTLR start rule__Tick__NrAssignment_2
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:814:1: rule__Tick__NrAssignment_2 : ( RULE_INT ) ;
    public final void rule__Tick__NrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:818:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:819:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:819:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:820:1: RULE_INT
            {
             before(grammarAccess.getTickAccess().getNrINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_21582); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:829:1: rule__Tick__InputAssignment_3 : ( ruleData ) ;
    public final void rule__Tick__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:833:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:834:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:834:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:835:1: ruleData
            {
             before(grammarAccess.getTickAccess().getInputDataParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__InputAssignment_31613);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:844:1: rule__Tick__OutputAssignment_5 : ( ruleData ) ;
    public final void rule__Tick__OutputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:848:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:849:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:849:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:850:1: ruleData
            {
             before(grammarAccess.getTickAccess().getOutputDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__OutputAssignment_51644);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:859:1: rule__Tick__LocalAssignment_7 : ( ruleData ) ;
    public final void rule__Tick__LocalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:863:1: ( ( ruleData ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:864:1: ( ruleData )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:864:1: ( ruleData )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:865:1: ruleData
            {
             before(grammarAccess.getTickAccess().getLocalDataParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__Tick__LocalAssignment_71675);
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:874:1: rule__Data__IntValAssignment_0 : ( RULE_INT ) ;
    public final void rule__Data__IntValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:878:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:879:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:879:1: ( RULE_INT )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:880:1: RULE_INT
            {
             before(grammarAccess.getDataAccess().getIntValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Data__IntValAssignment_01706); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:889:1: rule__Data__TrueAssignment_1 : ( ( 'T' ) ) ;
    public final void rule__Data__TrueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:893:1: ( ( ( 'T' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:894:1: ( ( 'T' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:894:1: ( ( 'T' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:895:1: ( 'T' )
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:896:1: ( 'T' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:897:1: 'T'
            {
             before(grammarAccess.getDataAccess().getTrueTKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Data__TrueAssignment_11742); 
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
    // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:912:1: rule__Data__FalseAssignment_2 : ( ( 'F' ) ) ;
    public final void rule__Data__FalseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:916:1: ( ( ( 'F' ) ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:917:1: ( ( 'F' ) )
            {
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:917:1: ( ( 'F' ) )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:918:1: ( 'F' )
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:919:1: ( 'F' )
            // ../de.cau.cs.kieler.krep.editors.rif.ui/src-gen/de/cau/cs/kieler/krep/editors/rif/contentassist/antlr/internal/InternalRif.g:920:1: 'F'
            {
             before(grammarAccess.getDataAccess().getFalseFKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Data__FalseAssignment_21786); 
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
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__IntValAssignment_0_in_rule__Data__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__TrueAssignment_1_in_rule__Data__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__FalseAssignment_2_in_rule__Data__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Trace__Group__0502 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__0512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__InputsAssignment_1_in_rule__Trace__Group__1540 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Group__2579 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Trace__Group__3618 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__OutputsAssignment_4_in_rule__Trace__Group__4656 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Group__5695 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Trace__Group__6734 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__7_in_rule__Trace__Group__6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__LocalAssignment_7_in_rule__Trace__Group__7772 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__Trace__Group__8_in_rule__Trace__Group__7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Group__8811 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Trace__Group__9_in_rule__Trace__Group__8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9851 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Trace__TickAssignment_9_in_rule__Trace__Group__9863 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17_in_rule__Decl__Group__0921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__0931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__NameAssignment_1_in_rule__Decl__Group__1959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Decl__Group__2997 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Decl__Group__3_in_rule__Decl__Group__21007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__TypeAssignment_3_in_rule__Decl__Group__31035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__Group__1_in_rule__Tick__Group__01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Tick__Group__11116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Tick__Group__2_in_rule__Tick__Group__11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__NrAssignment_2_in_rule__Tick__Group__21154 = new BitSet(new long[]{0x0000000000D00020L});
    public static final BitSet FOLLOW_rule__Tick__Group__3_in_rule__Tick__Group__21163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__InputAssignment_3_in_rule__Tick__Group__31191 = new BitSet(new long[]{0x0000000000D00020L});
    public static final BitSet FOLLOW_rule__Tick__Group__4_in_rule__Tick__Group__31201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Tick__Group__41230 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__Tick__Group__5_in_rule__Tick__Group__41240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__OutputAssignment_5_in_rule__Tick__Group__51268 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__Tick__Group__6_in_rule__Tick__Group__51278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Tick__Group__61307 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_rule__Tick__Group__7_in_rule__Tick__Group__61317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tick__LocalAssignment_7_in_rule__Tick__Group__71345 = new BitSet(new long[]{0x0000000000C00022L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__InputsAssignment_11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__OutputsAssignment_41427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledecl_in_rule__Trace__LocalAssignment_71458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTick_in_rule__Trace__TickAssignment_91489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__NameAssignment_11520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Decl__TypeAssignment_31551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Tick__NrAssignment_21582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__InputAssignment_31613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__OutputAssignment_51644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__Tick__LocalAssignment_71675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Data__IntValAssignment_01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Data__TrueAssignment_11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Data__FalseAssignment_21786 = new BitSet(new long[]{0x0000000000000002L});

}