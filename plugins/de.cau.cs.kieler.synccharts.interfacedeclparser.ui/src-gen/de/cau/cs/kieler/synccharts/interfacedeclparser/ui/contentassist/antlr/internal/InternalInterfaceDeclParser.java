package de.cau.cs.kieler.synccharts.interfacedeclparser.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.interfacedeclparser.services.InterfaceDeclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInterfaceDeclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_D", "RULE_STRING_S", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'+'", "'*'", "'max'", "'min'", "'or'", "'and'", "'host'", "'input'", "'output'", "'signal'", "'variable'", "':'", "';'", "'var'", "','", "':='", "'combine'", "'with'"
    };
    public static final int RULE_STRING_S=6;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING_D=5;

        public InternalInterfaceDeclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g"; }


     
     	private InterfaceDeclGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InterfaceDeclGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleStateExtend
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:61:1: entryRuleStateExtend : ruleStateExtend EOF ;
    public final void entryRuleStateExtend() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:62:1: ( ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:63:1: ruleStateExtend EOF
            {
             before(grammarAccess.getStateExtendRule()); 
            pushFollow(FOLLOW_ruleStateExtend_in_entryRuleStateExtend61);
            ruleStateExtend();
            _fsp--;

             after(grammarAccess.getStateExtendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateExtend68); 

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
    // $ANTLR end entryRuleStateExtend


    // $ANTLR start ruleStateExtend
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:70:1: ruleStateExtend : ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) ;
    public final void ruleStateExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:74:2: ( ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:76:1: ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:76:1: ( ( rule__StateExtend__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:77:1: ( rule__StateExtend__Alternatives )
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:78:1: ( rule__StateExtend__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:78:2: rule__StateExtend__Alternatives
            {
            pushFollow(FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend96);
            rule__StateExtend__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getAlternatives()); 

            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:81:1: ( ( rule__StateExtend__Alternatives )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:82:1: ( rule__StateExtend__Alternatives )*
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:83:1: ( rule__StateExtend__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=27 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:83:2: rule__StateExtend__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend108);
            	    rule__StateExtend__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStateExtendAccess().getAlternatives()); 

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
    // $ANTLR end ruleStateExtend


    // $ANTLR start entryRuleRegionSignalDec
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:96:1: entryRuleRegionSignalDec : ruleRegionSignalDec EOF ;
    public final void entryRuleRegionSignalDec() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:97:1: ( ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:98:1: ruleRegionSignalDec EOF
            {
             before(grammarAccess.getRegionSignalDecRule()); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec138);
            ruleRegionSignalDec();
            _fsp--;

             after(grammarAccess.getRegionSignalDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionSignalDec145); 

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
    // $ANTLR end entryRuleRegionSignalDec


    // $ANTLR start ruleRegionSignalDec
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:105:1: ruleRegionSignalDec : ( ( rule__RegionSignalDec__Group__0 ) ) ;
    public final void ruleRegionSignalDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:109:2: ( ( ( rule__RegionSignalDec__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:110:1: ( ( rule__RegionSignalDec__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:110:1: ( ( rule__RegionSignalDec__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:111:1: ( rule__RegionSignalDec__Group__0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:112:1: ( rule__RegionSignalDec__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:112:2: rule__RegionSignalDec__Group__0
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__0_in_ruleRegionSignalDec171);
            rule__RegionSignalDec__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRegionSignalDec


    // $ANTLR start entryRuleVariables
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:124:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:125:1: ( ruleVariables EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:126:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_ruleVariables_in_entryRuleVariables198);
            ruleVariables();
            _fsp--;

             after(grammarAccess.getVariablesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariables205); 

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
    // $ANTLR end entryRuleVariables


    // $ANTLR start ruleVariables
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:133:1: ruleVariables : ( ( rule__Variables__Group__0 ) ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:137:2: ( ( ( rule__Variables__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:138:1: ( ( rule__Variables__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:138:1: ( ( rule__Variables__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:139:1: ( rule__Variables__Group__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:140:1: ( rule__Variables__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:140:2: rule__Variables__Group__0
            {
            pushFollow(FOLLOW_rule__Variables__Group__0_in_ruleVariables231);
            rule__Variables__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariables


    // $ANTLR start entryRuleSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:152:1: entryRuleSignals : ruleSignals EOF ;
    public final void entryRuleSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:153:1: ( ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:154:1: ruleSignals EOF
            {
             before(grammarAccess.getSignalsRule()); 
            pushFollow(FOLLOW_ruleSignals_in_entryRuleSignals258);
            ruleSignals();
            _fsp--;

             after(grammarAccess.getSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignals265); 

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
    // $ANTLR end entryRuleSignals


    // $ANTLR start ruleSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:161:1: ruleSignals : ( ( rule__Signals__Group__0 ) ) ;
    public final void ruleSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:165:2: ( ( ( rule__Signals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:166:1: ( ( rule__Signals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:166:1: ( ( rule__Signals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:167:1: ( rule__Signals__Group__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:168:1: ( rule__Signals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:168:2: rule__Signals__Group__0
            {
            pushFollow(FOLLOW_rule__Signals__Group__0_in_ruleSignals291);
            rule__Signals__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSignals


    // $ANTLR start entryRuleInputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:180:1: entryRuleInputSignals : ruleInputSignals EOF ;
    public final void entryRuleInputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:181:1: ( ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:182:1: ruleInputSignals EOF
            {
             before(grammarAccess.getInputSignalsRule()); 
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals318);
            ruleInputSignals();
            _fsp--;

             after(grammarAccess.getInputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals325); 

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
    // $ANTLR end entryRuleInputSignals


    // $ANTLR start ruleInputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:189:1: ruleInputSignals : ( ( rule__InputSignals__Group__0 ) ) ;
    public final void ruleInputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:193:2: ( ( ( rule__InputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:194:1: ( ( rule__InputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:194:1: ( ( rule__InputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:195:1: ( rule__InputSignals__Group__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:196:1: ( rule__InputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:196:2: rule__InputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals351);
            rule__InputSignals__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInputSignals


    // $ANTLR start entryRuleOutputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:208:1: entryRuleOutputSignals : ruleOutputSignals EOF ;
    public final void entryRuleOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:209:1: ( ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:210:1: ruleOutputSignals EOF
            {
             before(grammarAccess.getOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals378);
            ruleOutputSignals();
            _fsp--;

             after(grammarAccess.getOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals385); 

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
    // $ANTLR end entryRuleOutputSignals


    // $ANTLR start ruleOutputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:217:1: ruleOutputSignals : ( ( rule__OutputSignals__Group__0 ) ) ;
    public final void ruleOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:221:2: ( ( ( rule__OutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:222:1: ( ( rule__OutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:222:1: ( ( rule__OutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:223:1: ( rule__OutputSignals__Group__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:224:1: ( rule__OutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:224:2: rule__OutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals411);
            rule__OutputSignals__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOutputSignals


    // $ANTLR start entryRuleInOutputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:236:1: entryRuleInOutputSignals : ruleInOutputSignals EOF ;
    public final void entryRuleInOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:237:1: ( ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:238:1: ruleInOutputSignals EOF
            {
             before(grammarAccess.getInOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals438);
            ruleInOutputSignals();
            _fsp--;

             after(grammarAccess.getInOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals445); 

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
    // $ANTLR end entryRuleInOutputSignals


    // $ANTLR start ruleInOutputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:245:1: ruleInOutputSignals : ( ( rule__InOutputSignals__Group__0 ) ) ;
    public final void ruleInOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:249:2: ( ( ( rule__InOutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:250:1: ( ( rule__InOutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:250:1: ( ( rule__InOutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:251:1: ( rule__InOutputSignals__Group__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:252:1: ( rule__InOutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:252:2: rule__InOutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals471);
            rule__InOutputSignals__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInOutputSignals


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:264:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:265:1: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:266:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal498);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal505); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:273:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:277:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:278:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:278:1: ( ( rule__Signal__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:279:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:280:1: ( rule__Signal__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:280:2: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_rule__Signal__Alternatives_in_ruleSignal531);
            rule__Signal__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:292:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:293:1: ( ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:294:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable558);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable565); 

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:301:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:305:2: ( ( ( rule__Variable__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:306:1: ( ( rule__Variable__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:306:1: ( ( rule__Variable__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:307:1: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:308:1: ( rule__Variable__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:308:2: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_in_ruleVariable591);
            rule__Variable__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:321:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:325:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:326:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:326:1: ( ( rule__ValueType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:327:1: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:328:1: ( rule__ValueType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:328:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType628);
            rule__ValueType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValueType


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:340:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:344:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:345:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:345:1: ( ( rule__CombineOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:346:1: ( rule__CombineOperator__Alternatives )
            {
             before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:347:1: ( rule__CombineOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:347:2: rule__CombineOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator664);
            rule__CombineOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCombineOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCombineOperator


    // $ANTLR start rule__StateExtend__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:358:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );
    public final void rule__StateExtend__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:362:1: ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    alt2=4;
                }
                else if ( (LA2_2==28) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("358:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("358:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:363:1: ( ( rule__StateExtend__RegionsAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:363:1: ( ( rule__StateExtend__RegionsAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:364:1: ( rule__StateExtend__RegionsAssignment_0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getRegionsAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:365:1: ( rule__StateExtend__RegionsAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:365:2: rule__StateExtend__RegionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__RegionsAssignment_0_in_rule__StateExtend__Alternatives699);
                    rule__StateExtend__RegionsAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getRegionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:369:6: ( ( rule__StateExtend__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:369:6: ( ( rule__StateExtend__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:370:1: ( rule__StateExtend__Group_1__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:371:1: ( rule__StateExtend__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:371:2: rule__StateExtend__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives717);
                    rule__StateExtend__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:375:6: ( ( rule__StateExtend__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:375:6: ( ( rule__StateExtend__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:376:1: ( rule__StateExtend__Group_2__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:377:1: ( rule__StateExtend__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:377:2: rule__StateExtend__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives735);
                    rule__StateExtend__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:381:6: ( ( rule__StateExtend__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:381:6: ( ( rule__StateExtend__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:382:1: ( rule__StateExtend__Group_3__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:383:1: ( rule__StateExtend__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:383:2: rule__StateExtend__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives753);
                    rule__StateExtend__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:387:6: ( ( rule__StateExtend__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:387:6: ( ( rule__StateExtend__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:388:1: ( rule__StateExtend__Group_4__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:389:1: ( rule__StateExtend__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:389:2: rule__StateExtend__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_4__0_in_rule__StateExtend__Alternatives771);
                    rule__StateExtend__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:393:6: ( ( rule__StateExtend__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:393:6: ( ( rule__StateExtend__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:394:1: ( rule__StateExtend__Group_5__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:395:1: ( rule__StateExtend__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:395:2: rule__StateExtend__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_5__0_in_rule__StateExtend__Alternatives789);
                    rule__StateExtend__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_5()); 

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
    // $ANTLR end rule__StateExtend__Alternatives


    // $ANTLR start rule__RegionSignalDec__Alternatives_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:404:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) );
    public final void rule__RegionSignalDec__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:408:1: ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("404:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:409:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:409:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:410:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:411:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:411:2: rule__RegionSignalDec__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2822);
                    rule__RegionSignalDec__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:415:6: ( ( rule__RegionSignalDec__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:415:6: ( ( rule__RegionSignalDec__Group_2_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:416:1: ( rule__RegionSignalDec__Group_2_1__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_2_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:417:1: ( rule__RegionSignalDec__Group_2_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:417:2: rule__RegionSignalDec__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__0_in_rule__RegionSignalDec__Alternatives_2840);
                    rule__RegionSignalDec__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_2_1()); 

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
    // $ANTLR end rule__RegionSignalDec__Alternatives_2


    // $ANTLR start rule__RegionSignalDec__Alternatives_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:426:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );
    public final void rule__RegionSignalDec__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:430:1: ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==33) ) {
                    alt4=1;
                }
                else if ( (LA4_1==29) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("426:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("426:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:431:1: ( ( rule__RegionSignalDec__Group_3_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:431:1: ( ( rule__RegionSignalDec__Group_3_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:432:1: ( rule__RegionSignalDec__Group_3_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_3_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:433:1: ( rule__RegionSignalDec__Group_3_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:433:2: rule__RegionSignalDec__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__0_in_rule__RegionSignalDec__Alternatives_3873);
                    rule__RegionSignalDec__Group_3_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:437:6: ( ( rule__RegionSignalDec__Group_3_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:437:6: ( ( rule__RegionSignalDec__Group_3_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:438:1: ( rule__RegionSignalDec__Group_3_1__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_3_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:439:1: ( rule__RegionSignalDec__Group_3_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:439:2: rule__RegionSignalDec__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__0_in_rule__RegionSignalDec__Alternatives_3891);
                    rule__RegionSignalDec__Group_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_3_1()); 

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
    // $ANTLR end rule__RegionSignalDec__Alternatives_3


    // $ANTLR start rule__Signal__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:452:1: ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) )
            int alt5=10;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STRING_S) ) {
                        alt5=6;
                    }
                    else if ( ((LA5_2>=13 && LA5_2<=18)) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_STRING_D) ) {
                        switch ( input.LA(4) ) {
                        case 36:
                            {
                            int LA5_11 = input.LA(5);

                            if ( ((LA5_11>=13 && LA5_11<=18)) ) {
                                alt5=5;
                            }
                            else if ( (LA5_11==RULE_STRING_S) ) {
                                alt5=8;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 11, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 31:
                            {
                            int LA5_12 = input.LA(5);

                            if ( (LA5_12==RULE_STRING_S) ) {
                                alt5=7;
                            }
                            else if ( ((LA5_12>=13 && LA5_12<=18)) ) {
                                alt5=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 12, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case 32:
                        case 34:
                            {
                            alt5=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 8, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA5_4 = input.LA(3);

                    if ( ((LA5_4>=13 && LA5_4<=18)) ) {
                        alt5=9;
                    }
                    else if ( (LA5_4==RULE_STRING_S) ) {
                        alt5=10;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 32:
                case 34:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("448:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:453:1: ( ( rule__Signal__NameAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:453:1: ( ( rule__Signal__NameAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:454:1: ( rule__Signal__NameAssignment_0 )
                    {
                     before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:455:1: ( rule__Signal__NameAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:455:2: rule__Signal__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives924);
                    rule__Signal__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:459:6: ( ( rule__Signal__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:459:6: ( ( rule__Signal__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:460:1: ( rule__Signal__Group_1__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:461:1: ( rule__Signal__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:461:2: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives942);
                    rule__Signal__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:465:6: ( ( rule__Signal__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:465:6: ( ( rule__Signal__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:466:1: ( rule__Signal__Group_2__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:467:1: ( rule__Signal__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:467:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives960);
                    rule__Signal__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:471:6: ( ( rule__Signal__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:471:6: ( ( rule__Signal__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:472:1: ( rule__Signal__Group_3__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:473:1: ( rule__Signal__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:473:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives978);
                    rule__Signal__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:477:6: ( ( rule__Signal__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:477:6: ( ( rule__Signal__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:478:1: ( rule__Signal__Group_4__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:479:1: ( rule__Signal__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:479:2: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives996);
                    rule__Signal__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:483:6: ( ( rule__Signal__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:483:6: ( ( rule__Signal__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:484:1: ( rule__Signal__Group_5__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:485:1: ( rule__Signal__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:485:2: rule__Signal__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives1014);
                    rule__Signal__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:489:6: ( ( rule__Signal__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:489:6: ( ( rule__Signal__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:490:1: ( rule__Signal__Group_6__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:491:1: ( rule__Signal__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:491:2: rule__Signal__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives1032);
                    rule__Signal__Group_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:495:6: ( ( rule__Signal__Group_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:495:6: ( ( rule__Signal__Group_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:496:1: ( rule__Signal__Group_7__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:497:1: ( rule__Signal__Group_7__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:497:2: rule__Signal__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives1050);
                    rule__Signal__Group_7__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:501:6: ( ( rule__Signal__Group_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:501:6: ( ( rule__Signal__Group_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:502:1: ( rule__Signal__Group_8__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_8()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:503:1: ( rule__Signal__Group_8__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:503:2: rule__Signal__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_8__0_in_rule__Signal__Alternatives1068);
                    rule__Signal__Group_8__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:507:6: ( ( rule__Signal__Group_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:507:6: ( ( rule__Signal__Group_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:508:1: ( rule__Signal__Group_9__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_9()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:509:1: ( rule__Signal__Group_9__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:509:2: rule__Signal__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_9__0_in_rule__Signal__Alternatives1086);
                    rule__Signal__Group_9__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_9()); 

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
    // $ANTLR end rule__Signal__Alternatives


    // $ANTLR start rule__Variable__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:522:1: ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_STRING_D) ) {
                        int LA6_5 = input.LA(4);

                        if ( (LA6_5==EOF||LA6_5==32||LA6_5==34) ) {
                            alt6=3;
                        }
                        else if ( (LA6_5==31) ) {
                            int LA6_9 = input.LA(5);

                            if ( ((LA6_9>=13 && LA6_9<=18)) ) {
                                alt6=4;
                            }
                            else if ( (LA6_9==RULE_STRING_S) ) {
                                alt6=6;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 9, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_STRING_S) ) {
                        alt6=5;
                    }
                    else if ( ((LA6_3>=13 && LA6_3<=18)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 32:
                case 34:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("518:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:523:1: ( ( rule__Variable__NameAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:523:1: ( ( rule__Variable__NameAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:524:1: ( rule__Variable__NameAssignment_0 )
                    {
                     before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:525:1: ( rule__Variable__NameAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:525:2: rule__Variable__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Alternatives1119);
                    rule__Variable__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:529:6: ( ( rule__Variable__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:529:6: ( ( rule__Variable__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:530:1: ( rule__Variable__Group_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:531:1: ( rule__Variable__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:531:2: rule__Variable__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Alternatives1137);
                    rule__Variable__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:535:6: ( ( rule__Variable__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:535:6: ( ( rule__Variable__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:536:1: ( rule__Variable__Group_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:537:1: ( rule__Variable__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:537:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Alternatives1155);
                    rule__Variable__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:541:6: ( ( rule__Variable__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:541:6: ( ( rule__Variable__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:542:1: ( rule__Variable__Group_3__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:543:1: ( rule__Variable__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:543:2: rule__Variable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Alternatives1173);
                    rule__Variable__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:547:6: ( ( rule__Variable__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:547:6: ( ( rule__Variable__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:548:1: ( rule__Variable__Group_4__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:549:1: ( rule__Variable__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:549:2: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Alternatives1191);
                    rule__Variable__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:553:6: ( ( rule__Variable__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:553:6: ( ( rule__Variable__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:554:1: ( rule__Variable__Group_5__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:555:1: ( rule__Variable__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:555:2: rule__Variable__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_5__0_in_rule__Variable__Alternatives1209);
                    rule__Variable__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_5()); 

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
    // $ANTLR end rule__Variable__Alternatives


    // $ANTLR start rule__ValueType__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:564:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:568:1: ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            case 18:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("564:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:569:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:569:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:570:1: ( 'PURE' )
                    {
                     before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:571:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:571:3: 'PURE'
                    {
                    match(input,13,FOLLOW_13_in_rule__ValueType__Alternatives1243); 

                    }

                     after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:576:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:576:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:577:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:578:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:578:3: 'BOOL'
                    {
                    match(input,14,FOLLOW_14_in_rule__ValueType__Alternatives1264); 

                    }

                     after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:583:6: ( ( 'UNSIGNED' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:583:6: ( ( 'UNSIGNED' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:584:1: ( 'UNSIGNED' )
                    {
                     before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:585:1: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:585:3: 'UNSIGNED'
                    {
                    match(input,15,FOLLOW_15_in_rule__ValueType__Alternatives1285); 

                    }

                     after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:590:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:590:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:591:1: ( 'INT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:592:1: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:592:3: 'INT'
                    {
                    match(input,16,FOLLOW_16_in_rule__ValueType__Alternatives1306); 

                    }

                     after(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:597:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:597:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:598:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:599:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:599:3: 'FLOAT'
                    {
                    match(input,17,FOLLOW_17_in_rule__ValueType__Alternatives1327); 

                    }

                     after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:604:6: ( ( 'HOST' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:604:6: ( ( 'HOST' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:605:1: ( 'HOST' )
                    {
                     before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:606:1: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:606:3: 'HOST'
                    {
                    match(input,18,FOLLOW_18_in_rule__ValueType__Alternatives1348); 

                    }

                     after(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__ValueType__Alternatives


    // $ANTLR start rule__CombineOperator__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:616:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:620:1: ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("616:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:621:1: ( ( 'NONE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:621:1: ( ( 'NONE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:622:1: ( 'NONE' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:623:1: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:623:3: 'NONE'
                    {
                    match(input,19,FOLLOW_19_in_rule__CombineOperator__Alternatives1384); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:628:6: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:628:6: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:629:1: ( '+' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:630:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:630:3: '+'
                    {
                    match(input,20,FOLLOW_20_in_rule__CombineOperator__Alternatives1405); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:635:6: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:635:6: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:636:1: ( '*' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:637:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:637:3: '*'
                    {
                    match(input,21,FOLLOW_21_in_rule__CombineOperator__Alternatives1426); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:642:6: ( ( 'max' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:642:6: ( ( 'max' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:643:1: ( 'max' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:644:1: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:644:3: 'max'
                    {
                    match(input,22,FOLLOW_22_in_rule__CombineOperator__Alternatives1447); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:649:6: ( ( 'min' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:649:6: ( ( 'min' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:650:1: ( 'min' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:651:1: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:651:3: 'min'
                    {
                    match(input,23,FOLLOW_23_in_rule__CombineOperator__Alternatives1468); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:656:6: ( ( 'or' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:656:6: ( ( 'or' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:657:1: ( 'or' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:658:1: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:658:3: 'or'
                    {
                    match(input,24,FOLLOW_24_in_rule__CombineOperator__Alternatives1489); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:663:6: ( ( 'and' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:663:6: ( ( 'and' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:664:1: ( 'and' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:665:1: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:665:3: 'and'
                    {
                    match(input,25,FOLLOW_25_in_rule__CombineOperator__Alternatives1510); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:670:6: ( ( 'host' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:670:6: ( ( 'host' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:671:1: ( 'host' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:672:1: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:672:3: 'host'
                    {
                    match(input,26,FOLLOW_26_in_rule__CombineOperator__Alternatives1531); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 

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
    // $ANTLR end rule__CombineOperator__Alternatives


    // $ANTLR start rule__StateExtend__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:684:1: rule__StateExtend__Group_1__0 : rule__StateExtend__Group_1__0__Impl rule__StateExtend__Group_1__1 ;
    public final void rule__StateExtend__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:688:1: ( rule__StateExtend__Group_1__0__Impl rule__StateExtend__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:689:2: rule__StateExtend__Group_1__0__Impl rule__StateExtend__Group_1__1
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_1__0__Impl_in_rule__StateExtend__Group_1__01564);
            rule__StateExtend__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01567);
            rule__StateExtend__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__0


    // $ANTLR start rule__StateExtend__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:696:1: rule__StateExtend__Group_1__0__Impl : ( 'input' ) ;
    public final void rule__StateExtend__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:700:1: ( ( 'input' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:701:1: ( 'input' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:701:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:702:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__StateExtend__Group_1__0__Impl1595); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__0__Impl


    // $ANTLR start rule__StateExtend__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:715:1: rule__StateExtend__Group_1__1 : rule__StateExtend__Group_1__1__Impl rule__StateExtend__Group_1__2 ;
    public final void rule__StateExtend__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:719:1: ( rule__StateExtend__Group_1__1__Impl rule__StateExtend__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:720:2: rule__StateExtend__Group_1__1__Impl rule__StateExtend__Group_1__2
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_1__1__Impl_in_rule__StateExtend__Group_1__11626);
            rule__StateExtend__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_1__2_in_rule__StateExtend__Group_1__11629);
            rule__StateExtend__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__1


    // $ANTLR start rule__StateExtend__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:727:1: rule__StateExtend__Group_1__1__Impl : ( 'output' ) ;
    public final void rule__StateExtend__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:731:1: ( ( 'output' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:732:1: ( 'output' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:732:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:733:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__StateExtend__Group_1__1__Impl1657); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__1__Impl


    // $ANTLR start rule__StateExtend__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:746:1: rule__StateExtend__Group_1__2 : rule__StateExtend__Group_1__2__Impl ;
    public final void rule__StateExtend__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:750:1: ( rule__StateExtend__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:751:2: rule__StateExtend__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_1__2__Impl_in_rule__StateExtend__Group_1__21688);
            rule__StateExtend__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__2


    // $ANTLR start rule__StateExtend__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:757:1: rule__StateExtend__Group_1__2__Impl : ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) ) ;
    public final void rule__StateExtend__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:761:1: ( ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:762:1: ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:762:1: ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:763:1: ( rule__StateExtend__InOutputSignalsAssignment_1_2 )
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:764:1: ( rule__StateExtend__InOutputSignalsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:764:2: rule__StateExtend__InOutputSignalsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StateExtend__InOutputSignalsAssignment_1_2_in_rule__StateExtend__Group_1__2__Impl1715);
            rule__StateExtend__InOutputSignalsAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getInOutputSignalsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_1__2__Impl


    // $ANTLR start rule__StateExtend__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:780:1: rule__StateExtend__Group_2__0 : rule__StateExtend__Group_2__0__Impl rule__StateExtend__Group_2__1 ;
    public final void rule__StateExtend__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:784:1: ( rule__StateExtend__Group_2__0__Impl rule__StateExtend__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:785:2: rule__StateExtend__Group_2__0__Impl rule__StateExtend__Group_2__1
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_2__0__Impl_in_rule__StateExtend__Group_2__01751);
            rule__StateExtend__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01754);
            rule__StateExtend__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_2__0


    // $ANTLR start rule__StateExtend__Group_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:792:1: rule__StateExtend__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__StateExtend__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:796:1: ( ( 'output' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:797:1: ( 'output' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:797:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:798:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__StateExtend__Group_2__0__Impl1782); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_2__0__Impl


    // $ANTLR start rule__StateExtend__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:811:1: rule__StateExtend__Group_2__1 : rule__StateExtend__Group_2__1__Impl ;
    public final void rule__StateExtend__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:815:1: ( rule__StateExtend__Group_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:816:2: rule__StateExtend__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_2__1__Impl_in_rule__StateExtend__Group_2__11813);
            rule__StateExtend__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_2__1


    // $ANTLR start rule__StateExtend__Group_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:822:1: rule__StateExtend__Group_2__1__Impl : ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) ) ;
    public final void rule__StateExtend__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:826:1: ( ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:827:1: ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:827:1: ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:828:1: ( rule__StateExtend__OutputSignalsAssignment_2_1 )
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsAssignment_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:829:1: ( rule__StateExtend__OutputSignalsAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:829:2: rule__StateExtend__OutputSignalsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StateExtend__OutputSignalsAssignment_2_1_in_rule__StateExtend__Group_2__1__Impl1840);
            rule__StateExtend__OutputSignalsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getOutputSignalsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_2__1__Impl


    // $ANTLR start rule__StateExtend__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:843:1: rule__StateExtend__Group_3__0 : rule__StateExtend__Group_3__0__Impl rule__StateExtend__Group_3__1 ;
    public final void rule__StateExtend__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:847:1: ( rule__StateExtend__Group_3__0__Impl rule__StateExtend__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:848:2: rule__StateExtend__Group_3__0__Impl rule__StateExtend__Group_3__1
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_3__0__Impl_in_rule__StateExtend__Group_3__01874);
            rule__StateExtend__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01877);
            rule__StateExtend__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_3__0


    // $ANTLR start rule__StateExtend__Group_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:855:1: rule__StateExtend__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__StateExtend__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:859:1: ( ( 'input' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:860:1: ( 'input' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:860:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:861:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__StateExtend__Group_3__0__Impl1905); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_3__0__Impl


    // $ANTLR start rule__StateExtend__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:874:1: rule__StateExtend__Group_3__1 : rule__StateExtend__Group_3__1__Impl ;
    public final void rule__StateExtend__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:878:1: ( rule__StateExtend__Group_3__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:879:2: rule__StateExtend__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_3__1__Impl_in_rule__StateExtend__Group_3__11936);
            rule__StateExtend__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_3__1


    // $ANTLR start rule__StateExtend__Group_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:885:1: rule__StateExtend__Group_3__1__Impl : ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) ) ;
    public final void rule__StateExtend__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:889:1: ( ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:890:1: ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:890:1: ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:891:1: ( rule__StateExtend__InputSignalsAssignment_3_1 )
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsAssignment_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:892:1: ( rule__StateExtend__InputSignalsAssignment_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:892:2: rule__StateExtend__InputSignalsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StateExtend__InputSignalsAssignment_3_1_in_rule__StateExtend__Group_3__1__Impl1963);
            rule__StateExtend__InputSignalsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getInputSignalsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_3__1__Impl


    // $ANTLR start rule__StateExtend__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:906:1: rule__StateExtend__Group_4__0 : rule__StateExtend__Group_4__0__Impl rule__StateExtend__Group_4__1 ;
    public final void rule__StateExtend__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:910:1: ( rule__StateExtend__Group_4__0__Impl rule__StateExtend__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:911:2: rule__StateExtend__Group_4__0__Impl rule__StateExtend__Group_4__1
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_4__0__Impl_in_rule__StateExtend__Group_4__01997);
            rule__StateExtend__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_4__1_in_rule__StateExtend__Group_4__02000);
            rule__StateExtend__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_4__0


    // $ANTLR start rule__StateExtend__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:918:1: rule__StateExtend__Group_4__0__Impl : ( 'signal' ) ;
    public final void rule__StateExtend__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:922:1: ( ( 'signal' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:923:1: ( 'signal' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:923:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:924:1: 'signal'
            {
             before(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__StateExtend__Group_4__0__Impl2028); 
             after(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_4__0__Impl


    // $ANTLR start rule__StateExtend__Group_4__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:937:1: rule__StateExtend__Group_4__1 : rule__StateExtend__Group_4__1__Impl ;
    public final void rule__StateExtend__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:941:1: ( rule__StateExtend__Group_4__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:942:2: rule__StateExtend__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_4__1__Impl_in_rule__StateExtend__Group_4__12059);
            rule__StateExtend__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_4__1


    // $ANTLR start rule__StateExtend__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:948:1: rule__StateExtend__Group_4__1__Impl : ( ( rule__StateExtend__SignalsAssignment_4_1 ) ) ;
    public final void rule__StateExtend__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:952:1: ( ( ( rule__StateExtend__SignalsAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:953:1: ( ( rule__StateExtend__SignalsAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:953:1: ( ( rule__StateExtend__SignalsAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:954:1: ( rule__StateExtend__SignalsAssignment_4_1 )
            {
             before(grammarAccess.getStateExtendAccess().getSignalsAssignment_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:955:1: ( rule__StateExtend__SignalsAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:955:2: rule__StateExtend__SignalsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StateExtend__SignalsAssignment_4_1_in_rule__StateExtend__Group_4__1__Impl2086);
            rule__StateExtend__SignalsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getSignalsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_4__1__Impl


    // $ANTLR start rule__StateExtend__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:969:1: rule__StateExtend__Group_5__0 : rule__StateExtend__Group_5__0__Impl rule__StateExtend__Group_5__1 ;
    public final void rule__StateExtend__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:973:1: ( rule__StateExtend__Group_5__0__Impl rule__StateExtend__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:974:2: rule__StateExtend__Group_5__0__Impl rule__StateExtend__Group_5__1
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_5__0__Impl_in_rule__StateExtend__Group_5__02120);
            rule__StateExtend__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StateExtend__Group_5__1_in_rule__StateExtend__Group_5__02123);
            rule__StateExtend__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_5__0


    // $ANTLR start rule__StateExtend__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:981:1: rule__StateExtend__Group_5__0__Impl : ( 'variable' ) ;
    public final void rule__StateExtend__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:985:1: ( ( 'variable' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:986:1: ( 'variable' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:986:1: ( 'variable' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:987:1: 'variable'
            {
             before(grammarAccess.getStateExtendAccess().getVariableKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__StateExtend__Group_5__0__Impl2151); 
             after(grammarAccess.getStateExtendAccess().getVariableKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_5__0__Impl


    // $ANTLR start rule__StateExtend__Group_5__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1000:1: rule__StateExtend__Group_5__1 : rule__StateExtend__Group_5__1__Impl ;
    public final void rule__StateExtend__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1004:1: ( rule__StateExtend__Group_5__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1005:2: rule__StateExtend__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StateExtend__Group_5__1__Impl_in_rule__StateExtend__Group_5__12182);
            rule__StateExtend__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_5__1


    // $ANTLR start rule__StateExtend__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1011:1: rule__StateExtend__Group_5__1__Impl : ( ( rule__StateExtend__VariableAssignment_5_1 ) ) ;
    public final void rule__StateExtend__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1015:1: ( ( ( rule__StateExtend__VariableAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1016:1: ( ( rule__StateExtend__VariableAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1016:1: ( ( rule__StateExtend__VariableAssignment_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1017:1: ( rule__StateExtend__VariableAssignment_5_1 )
            {
             before(grammarAccess.getStateExtendAccess().getVariableAssignment_5_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1018:1: ( rule__StateExtend__VariableAssignment_5_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1018:2: rule__StateExtend__VariableAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StateExtend__VariableAssignment_5_1_in_rule__StateExtend__Group_5__1__Impl2209);
            rule__StateExtend__VariableAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getVariableAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_5__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1032:1: rule__RegionSignalDec__Group__0 : rule__RegionSignalDec__Group__0__Impl rule__RegionSignalDec__Group__1 ;
    public final void rule__RegionSignalDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1036:1: ( rule__RegionSignalDec__Group__0__Impl rule__RegionSignalDec__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1037:2: rule__RegionSignalDec__Group__0__Impl rule__RegionSignalDec__Group__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__0__Impl_in_rule__RegionSignalDec__Group__02243);
            rule__RegionSignalDec__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__02246);
            rule__RegionSignalDec__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__0


    // $ANTLR start rule__RegionSignalDec__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1044:1: rule__RegionSignalDec__Group__0__Impl : ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) ;
    public final void rule__RegionSignalDec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1048:1: ( ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1049:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1049:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1050:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1051:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1051:2: rule__RegionSignalDec__RegionAssignment_0
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__0__Impl2273);
            rule__RegionSignalDec__RegionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1061:1: rule__RegionSignalDec__Group__1 : rule__RegionSignalDec__Group__1__Impl rule__RegionSignalDec__Group__2 ;
    public final void rule__RegionSignalDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1065:1: ( rule__RegionSignalDec__Group__1__Impl rule__RegionSignalDec__Group__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1066:2: rule__RegionSignalDec__Group__1__Impl rule__RegionSignalDec__Group__2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__1__Impl_in_rule__RegionSignalDec__Group__12303);
            rule__RegionSignalDec__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__12306);
            rule__RegionSignalDec__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__1


    // $ANTLR start rule__RegionSignalDec__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1073:1: rule__RegionSignalDec__Group__1__Impl : ( ':' ) ;
    public final void rule__RegionSignalDec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1077:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1078:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1078:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1079:1: ':'
            {
             before(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__RegionSignalDec__Group__1__Impl2334); 
             after(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1092:1: rule__RegionSignalDec__Group__2 : rule__RegionSignalDec__Group__2__Impl rule__RegionSignalDec__Group__3 ;
    public final void rule__RegionSignalDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1096:1: ( rule__RegionSignalDec__Group__2__Impl rule__RegionSignalDec__Group__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1097:2: rule__RegionSignalDec__Group__2__Impl rule__RegionSignalDec__Group__3
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__2__Impl_in_rule__RegionSignalDec__Group__22365);
            rule__RegionSignalDec__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__22368);
            rule__RegionSignalDec__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__2


    // $ANTLR start rule__RegionSignalDec__Group__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1104:1: rule__RegionSignalDec__Group__2__Impl : ( ( rule__RegionSignalDec__Alternatives_2 ) ) ;
    public final void rule__RegionSignalDec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1108:1: ( ( ( rule__RegionSignalDec__Alternatives_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1109:1: ( ( rule__RegionSignalDec__Alternatives_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1109:1: ( ( rule__RegionSignalDec__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1110:1: ( rule__RegionSignalDec__Alternatives_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1111:1: ( rule__RegionSignalDec__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1111:2: rule__RegionSignalDec__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__2__Impl2395);
            rule__RegionSignalDec__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__2__Impl


    // $ANTLR start rule__RegionSignalDec__Group__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1121:1: rule__RegionSignalDec__Group__3 : rule__RegionSignalDec__Group__3__Impl rule__RegionSignalDec__Group__4 ;
    public final void rule__RegionSignalDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1125:1: ( rule__RegionSignalDec__Group__3__Impl rule__RegionSignalDec__Group__4 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1126:2: rule__RegionSignalDec__Group__3__Impl rule__RegionSignalDec__Group__4
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__3__Impl_in_rule__RegionSignalDec__Group__32425);
            rule__RegionSignalDec__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__32428);
            rule__RegionSignalDec__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__3


    // $ANTLR start rule__RegionSignalDec__Group__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1133:1: rule__RegionSignalDec__Group__3__Impl : ( ( rule__RegionSignalDec__Alternatives_3 )* ) ;
    public final void rule__RegionSignalDec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1137:1: ( ( ( rule__RegionSignalDec__Alternatives_3 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1138:1: ( ( rule__RegionSignalDec__Alternatives_3 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1138:1: ( ( rule__RegionSignalDec__Alternatives_3 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1139:1: ( rule__RegionSignalDec__Alternatives_3 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1140:1: ( rule__RegionSignalDec__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1140:2: rule__RegionSignalDec__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_3_in_rule__RegionSignalDec__Group__3__Impl2455);
            	    rule__RegionSignalDec__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__3__Impl


    // $ANTLR start rule__RegionSignalDec__Group__4
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1150:1: rule__RegionSignalDec__Group__4 : rule__RegionSignalDec__Group__4__Impl ;
    public final void rule__RegionSignalDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1154:1: ( rule__RegionSignalDec__Group__4__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1155:2: rule__RegionSignalDec__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__4__Impl_in_rule__RegionSignalDec__Group__42486);
            rule__RegionSignalDec__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__4


    // $ANTLR start rule__RegionSignalDec__Group__4__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1161:1: rule__RegionSignalDec__Group__4__Impl : ( ';' ) ;
    public final void rule__RegionSignalDec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1165:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1166:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1166:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1167:1: ';'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__RegionSignalDec__Group__4__Impl2514); 
             after(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group__4__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1190:1: rule__RegionSignalDec__Group_2_0__0 : rule__RegionSignalDec__Group_2_0__0__Impl rule__RegionSignalDec__Group_2_0__1 ;
    public final void rule__RegionSignalDec__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1194:1: ( rule__RegionSignalDec__Group_2_0__0__Impl rule__RegionSignalDec__Group_2_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1195:2: rule__RegionSignalDec__Group_2_0__0__Impl rule__RegionSignalDec__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__0__Impl_in_rule__RegionSignalDec__Group_2_0__02555);
            rule__RegionSignalDec__Group_2_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__02558);
            rule__RegionSignalDec__Group_2_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__0


    // $ANTLR start rule__RegionSignalDec__Group_2_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1202:1: rule__RegionSignalDec__Group_2_0__0__Impl : ( 'var' ) ;
    public final void rule__RegionSignalDec__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1206:1: ( ( 'var' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1207:1: ( 'var' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1207:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1208:1: 'var'
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0()); 
            match(input,33,FOLLOW_33_in_rule__RegionSignalDec__Group_2_0__0__Impl2586); 
             after(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1221:1: rule__RegionSignalDec__Group_2_0__1 : rule__RegionSignalDec__Group_2_0__1__Impl rule__RegionSignalDec__Group_2_0__2 ;
    public final void rule__RegionSignalDec__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1225:1: ( rule__RegionSignalDec__Group_2_0__1__Impl rule__RegionSignalDec__Group_2_0__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1226:2: rule__RegionSignalDec__Group_2_0__1__Impl rule__RegionSignalDec__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__1__Impl_in_rule__RegionSignalDec__Group_2_0__12617);
            rule__RegionSignalDec__Group_2_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__2_in_rule__RegionSignalDec__Group_2_0__12620);
            rule__RegionSignalDec__Group_2_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__1


    // $ANTLR start rule__RegionSignalDec__Group_2_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1233:1: rule__RegionSignalDec__Group_2_0__1__Impl : ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1237:1: ( ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1238:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1238:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1239:1: ( rule__RegionSignalDec__VarsAssignment_2_0_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1240:1: ( rule__RegionSignalDec__VarsAssignment_2_0_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1240:2: rule__RegionSignalDec__VarsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__1__Impl2647);
            rule__RegionSignalDec__VarsAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_0__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1250:1: rule__RegionSignalDec__Group_2_0__2 : rule__RegionSignalDec__Group_2_0__2__Impl ;
    public final void rule__RegionSignalDec__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1254:1: ( rule__RegionSignalDec__Group_2_0__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1255:2: rule__RegionSignalDec__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__2__Impl_in_rule__RegionSignalDec__Group_2_0__22677);
            rule__RegionSignalDec__Group_2_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__2


    // $ANTLR start rule__RegionSignalDec__Group_2_0__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1261:1: rule__RegionSignalDec__Group_2_0__2__Impl : ( ( rule__RegionSignalDec__Group_2_0_2__0 )* ) ;
    public final void rule__RegionSignalDec__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1265:1: ( ( ( rule__RegionSignalDec__Group_2_0_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1266:1: ( ( rule__RegionSignalDec__Group_2_0_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1266:1: ( ( rule__RegionSignalDec__Group_2_0_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1267:1: ( rule__RegionSignalDec__Group_2_0_2__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_2_0_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1268:1: ( rule__RegionSignalDec__Group_2_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1268:2: rule__RegionSignalDec__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__0_in_rule__RegionSignalDec__Group_2_0__2__Impl2704);
            	    rule__RegionSignalDec__Group_2_0_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0__2__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1284:1: rule__RegionSignalDec__Group_2_0_2__0 : rule__RegionSignalDec__Group_2_0_2__0__Impl rule__RegionSignalDec__Group_2_0_2__1 ;
    public final void rule__RegionSignalDec__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1288:1: ( rule__RegionSignalDec__Group_2_0_2__0__Impl rule__RegionSignalDec__Group_2_0_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1289:2: rule__RegionSignalDec__Group_2_0_2__0__Impl rule__RegionSignalDec__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__0__Impl_in_rule__RegionSignalDec__Group_2_0_2__02741);
            rule__RegionSignalDec__Group_2_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__1_in_rule__RegionSignalDec__Group_2_0_2__02744);
            rule__RegionSignalDec__Group_2_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0_2__0


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1296:1: rule__RegionSignalDec__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1300:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1301:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1301:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1302:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_2_0_2__0__Impl2772); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0_2__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1315:1: rule__RegionSignalDec__Group_2_0_2__1 : rule__RegionSignalDec__Group_2_0_2__1__Impl ;
    public final void rule__RegionSignalDec__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1319:1: ( rule__RegionSignalDec__Group_2_0_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1320:2: rule__RegionSignalDec__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__1__Impl_in_rule__RegionSignalDec__Group_2_0_2__12803);
            rule__RegionSignalDec__Group_2_0_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0_2__1


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1326:1: rule__RegionSignalDec__Group_2_0_2__1__Impl : ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1330:1: ( ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1331:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1331:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1332:1: ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1333:1: ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1333:2: rule__RegionSignalDec__VarsAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_2_1_in_rule__RegionSignalDec__Group_2_0_2__1__Impl2830);
            rule__RegionSignalDec__VarsAssignment_2_0_2_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_0_2__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1347:1: rule__RegionSignalDec__Group_2_1__0 : rule__RegionSignalDec__Group_2_1__0__Impl rule__RegionSignalDec__Group_2_1__1 ;
    public final void rule__RegionSignalDec__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1351:1: ( rule__RegionSignalDec__Group_2_1__0__Impl rule__RegionSignalDec__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1352:2: rule__RegionSignalDec__Group_2_1__0__Impl rule__RegionSignalDec__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__0__Impl_in_rule__RegionSignalDec__Group_2_1__02864);
            rule__RegionSignalDec__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__1_in_rule__RegionSignalDec__Group_2_1__02867);
            rule__RegionSignalDec__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__0


    // $ANTLR start rule__RegionSignalDec__Group_2_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1359:1: rule__RegionSignalDec__Group_2_1__0__Impl : ( 'signal' ) ;
    public final void rule__RegionSignalDec__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1363:1: ( ( 'signal' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1364:1: ( 'signal' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1364:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1365:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__RegionSignalDec__Group_2_1__0__Impl2895); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1378:1: rule__RegionSignalDec__Group_2_1__1 : rule__RegionSignalDec__Group_2_1__1__Impl rule__RegionSignalDec__Group_2_1__2 ;
    public final void rule__RegionSignalDec__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1382:1: ( rule__RegionSignalDec__Group_2_1__1__Impl rule__RegionSignalDec__Group_2_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1383:2: rule__RegionSignalDec__Group_2_1__1__Impl rule__RegionSignalDec__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__1__Impl_in_rule__RegionSignalDec__Group_2_1__12926);
            rule__RegionSignalDec__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__2_in_rule__RegionSignalDec__Group_2_1__12929);
            rule__RegionSignalDec__Group_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__1


    // $ANTLR start rule__RegionSignalDec__Group_2_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1390:1: rule__RegionSignalDec__Group_2_1__1__Impl : ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1394:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1395:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1395:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1396:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1397:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1397:2: rule__RegionSignalDec__SignalsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_1_in_rule__RegionSignalDec__Group_2_1__1__Impl2956);
            rule__RegionSignalDec__SignalsAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1407:1: rule__RegionSignalDec__Group_2_1__2 : rule__RegionSignalDec__Group_2_1__2__Impl ;
    public final void rule__RegionSignalDec__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1411:1: ( rule__RegionSignalDec__Group_2_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1412:2: rule__RegionSignalDec__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__2__Impl_in_rule__RegionSignalDec__Group_2_1__22986);
            rule__RegionSignalDec__Group_2_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__2


    // $ANTLR start rule__RegionSignalDec__Group_2_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1418:1: rule__RegionSignalDec__Group_2_1__2__Impl : ( ( rule__RegionSignalDec__Group_2_1_2__0 )* ) ;
    public final void rule__RegionSignalDec__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1422:1: ( ( ( rule__RegionSignalDec__Group_2_1_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1423:1: ( ( rule__RegionSignalDec__Group_2_1_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1423:1: ( ( rule__RegionSignalDec__Group_2_1_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1424:1: ( rule__RegionSignalDec__Group_2_1_2__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_2_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1425:1: ( rule__RegionSignalDec__Group_2_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1425:2: rule__RegionSignalDec__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__0_in_rule__RegionSignalDec__Group_2_1__2__Impl3013);
            	    rule__RegionSignalDec__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1__2__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1441:1: rule__RegionSignalDec__Group_2_1_2__0 : rule__RegionSignalDec__Group_2_1_2__0__Impl rule__RegionSignalDec__Group_2_1_2__1 ;
    public final void rule__RegionSignalDec__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1445:1: ( rule__RegionSignalDec__Group_2_1_2__0__Impl rule__RegionSignalDec__Group_2_1_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1446:2: rule__RegionSignalDec__Group_2_1_2__0__Impl rule__RegionSignalDec__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__0__Impl_in_rule__RegionSignalDec__Group_2_1_2__03050);
            rule__RegionSignalDec__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__1_in_rule__RegionSignalDec__Group_2_1_2__03053);
            rule__RegionSignalDec__Group_2_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1_2__0


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1453:1: rule__RegionSignalDec__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1457:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1458:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1458:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1459:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_2_1_2__0__Impl3081); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1_2__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1472:1: rule__RegionSignalDec__Group_2_1_2__1 : rule__RegionSignalDec__Group_2_1_2__1__Impl ;
    public final void rule__RegionSignalDec__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1476:1: ( rule__RegionSignalDec__Group_2_1_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1477:2: rule__RegionSignalDec__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__1__Impl_in_rule__RegionSignalDec__Group_2_1_2__13112);
            rule__RegionSignalDec__Group_2_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1_2__1


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1483:1: rule__RegionSignalDec__Group_2_1_2__1__Impl : ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1487:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1488:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1488:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1489:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1490:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1490:2: rule__RegionSignalDec__SignalsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_2_1_in_rule__RegionSignalDec__Group_2_1_2__1__Impl3139);
            rule__RegionSignalDec__SignalsAssignment_2_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_2_1_2__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1504:1: rule__RegionSignalDec__Group_3_0__0 : rule__RegionSignalDec__Group_3_0__0__Impl rule__RegionSignalDec__Group_3_0__1 ;
    public final void rule__RegionSignalDec__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1508:1: ( rule__RegionSignalDec__Group_3_0__0__Impl rule__RegionSignalDec__Group_3_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1509:2: rule__RegionSignalDec__Group_3_0__0__Impl rule__RegionSignalDec__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__0__Impl_in_rule__RegionSignalDec__Group_3_0__03173);
            rule__RegionSignalDec__Group_3_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__1_in_rule__RegionSignalDec__Group_3_0__03176);
            rule__RegionSignalDec__Group_3_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__0


    // $ANTLR start rule__RegionSignalDec__Group_3_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1516:1: rule__RegionSignalDec__Group_3_0__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1520:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1521:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1521:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1522:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_0__0__Impl3204); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1535:1: rule__RegionSignalDec__Group_3_0__1 : rule__RegionSignalDec__Group_3_0__1__Impl rule__RegionSignalDec__Group_3_0__2 ;
    public final void rule__RegionSignalDec__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1539:1: ( rule__RegionSignalDec__Group_3_0__1__Impl rule__RegionSignalDec__Group_3_0__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1540:2: rule__RegionSignalDec__Group_3_0__1__Impl rule__RegionSignalDec__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__1__Impl_in_rule__RegionSignalDec__Group_3_0__13235);
            rule__RegionSignalDec__Group_3_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__2_in_rule__RegionSignalDec__Group_3_0__13238);
            rule__RegionSignalDec__Group_3_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__1


    // $ANTLR start rule__RegionSignalDec__Group_3_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1547:1: rule__RegionSignalDec__Group_3_0__1__Impl : ( 'var' ) ;
    public final void rule__RegionSignalDec__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1551:1: ( ( 'var' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1552:1: ( 'var' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1552:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1553:1: 'var'
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1()); 
            match(input,33,FOLLOW_33_in_rule__RegionSignalDec__Group_3_0__1__Impl3266); 
             after(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1566:1: rule__RegionSignalDec__Group_3_0__2 : rule__RegionSignalDec__Group_3_0__2__Impl rule__RegionSignalDec__Group_3_0__3 ;
    public final void rule__RegionSignalDec__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1570:1: ( rule__RegionSignalDec__Group_3_0__2__Impl rule__RegionSignalDec__Group_3_0__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1571:2: rule__RegionSignalDec__Group_3_0__2__Impl rule__RegionSignalDec__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__2__Impl_in_rule__RegionSignalDec__Group_3_0__23297);
            rule__RegionSignalDec__Group_3_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__3_in_rule__RegionSignalDec__Group_3_0__23300);
            rule__RegionSignalDec__Group_3_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__2


    // $ANTLR start rule__RegionSignalDec__Group_3_0__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1578:1: rule__RegionSignalDec__Group_3_0__2__Impl : ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) ) ;
    public final void rule__RegionSignalDec__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1582:1: ( ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1583:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1583:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1584:1: ( rule__RegionSignalDec__VarsAssignment_3_0_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1585:1: ( rule__RegionSignalDec__VarsAssignment_3_0_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1585:2: rule__RegionSignalDec__VarsAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_2_in_rule__RegionSignalDec__Group_3_0__2__Impl3327);
            rule__RegionSignalDec__VarsAssignment_3_0_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__2__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1595:1: rule__RegionSignalDec__Group_3_0__3 : rule__RegionSignalDec__Group_3_0__3__Impl ;
    public final void rule__RegionSignalDec__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1599:1: ( rule__RegionSignalDec__Group_3_0__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1600:2: rule__RegionSignalDec__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__3__Impl_in_rule__RegionSignalDec__Group_3_0__33357);
            rule__RegionSignalDec__Group_3_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__3


    // $ANTLR start rule__RegionSignalDec__Group_3_0__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1606:1: rule__RegionSignalDec__Group_3_0__3__Impl : ( ( rule__RegionSignalDec__Group_3_0_3__0 )* ) ;
    public final void rule__RegionSignalDec__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1610:1: ( ( ( rule__RegionSignalDec__Group_3_0_3__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1611:1: ( ( rule__RegionSignalDec__Group_3_0_3__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1611:1: ( ( rule__RegionSignalDec__Group_3_0_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1612:1: ( rule__RegionSignalDec__Group_3_0_3__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_3_0_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1613:1: ( rule__RegionSignalDec__Group_3_0_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1613:2: rule__RegionSignalDec__Group_3_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__0_in_rule__RegionSignalDec__Group_3_0__3__Impl3384);
            	    rule__RegionSignalDec__Group_3_0_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getGroup_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0__3__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1631:1: rule__RegionSignalDec__Group_3_0_3__0 : rule__RegionSignalDec__Group_3_0_3__0__Impl rule__RegionSignalDec__Group_3_0_3__1 ;
    public final void rule__RegionSignalDec__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1635:1: ( rule__RegionSignalDec__Group_3_0_3__0__Impl rule__RegionSignalDec__Group_3_0_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1636:2: rule__RegionSignalDec__Group_3_0_3__0__Impl rule__RegionSignalDec__Group_3_0_3__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__0__Impl_in_rule__RegionSignalDec__Group_3_0_3__03423);
            rule__RegionSignalDec__Group_3_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__1_in_rule__RegionSignalDec__Group_3_0_3__03426);
            rule__RegionSignalDec__Group_3_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0_3__0


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1643:1: rule__RegionSignalDec__Group_3_0_3__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1647:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1648:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1648:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1649:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_0_3__0__Impl3454); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0_3__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1662:1: rule__RegionSignalDec__Group_3_0_3__1 : rule__RegionSignalDec__Group_3_0_3__1__Impl ;
    public final void rule__RegionSignalDec__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1666:1: ( rule__RegionSignalDec__Group_3_0_3__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1667:2: rule__RegionSignalDec__Group_3_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__1__Impl_in_rule__RegionSignalDec__Group_3_0_3__13485);
            rule__RegionSignalDec__Group_3_0_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0_3__1


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1673:1: rule__RegionSignalDec__Group_3_0_3__1__Impl : ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1677:1: ( ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1678:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1678:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1679:1: ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1680:1: ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1680:2: rule__RegionSignalDec__VarsAssignment_3_0_3_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_3_1_in_rule__RegionSignalDec__Group_3_0_3__1__Impl3512);
            rule__RegionSignalDec__VarsAssignment_3_0_3_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_0_3__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1694:1: rule__RegionSignalDec__Group_3_1__0 : rule__RegionSignalDec__Group_3_1__0__Impl rule__RegionSignalDec__Group_3_1__1 ;
    public final void rule__RegionSignalDec__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1698:1: ( rule__RegionSignalDec__Group_3_1__0__Impl rule__RegionSignalDec__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1699:2: rule__RegionSignalDec__Group_3_1__0__Impl rule__RegionSignalDec__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__0__Impl_in_rule__RegionSignalDec__Group_3_1__03546);
            rule__RegionSignalDec__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__1_in_rule__RegionSignalDec__Group_3_1__03549);
            rule__RegionSignalDec__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__0


    // $ANTLR start rule__RegionSignalDec__Group_3_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1706:1: rule__RegionSignalDec__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1710:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1711:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1711:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1712:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_1__0__Impl3577); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1725:1: rule__RegionSignalDec__Group_3_1__1 : rule__RegionSignalDec__Group_3_1__1__Impl rule__RegionSignalDec__Group_3_1__2 ;
    public final void rule__RegionSignalDec__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1729:1: ( rule__RegionSignalDec__Group_3_1__1__Impl rule__RegionSignalDec__Group_3_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1730:2: rule__RegionSignalDec__Group_3_1__1__Impl rule__RegionSignalDec__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__1__Impl_in_rule__RegionSignalDec__Group_3_1__13608);
            rule__RegionSignalDec__Group_3_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__2_in_rule__RegionSignalDec__Group_3_1__13611);
            rule__RegionSignalDec__Group_3_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__1


    // $ANTLR start rule__RegionSignalDec__Group_3_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1737:1: rule__RegionSignalDec__Group_3_1__1__Impl : ( 'signal' ) ;
    public final void rule__RegionSignalDec__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1741:1: ( ( 'signal' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1742:1: ( 'signal' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1742:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1743:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1()); 
            match(input,29,FOLLOW_29_in_rule__RegionSignalDec__Group_3_1__1__Impl3639); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__1__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1756:1: rule__RegionSignalDec__Group_3_1__2 : rule__RegionSignalDec__Group_3_1__2__Impl rule__RegionSignalDec__Group_3_1__3 ;
    public final void rule__RegionSignalDec__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1760:1: ( rule__RegionSignalDec__Group_3_1__2__Impl rule__RegionSignalDec__Group_3_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1761:2: rule__RegionSignalDec__Group_3_1__2__Impl rule__RegionSignalDec__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__2__Impl_in_rule__RegionSignalDec__Group_3_1__23670);
            rule__RegionSignalDec__Group_3_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__3_in_rule__RegionSignalDec__Group_3_1__23673);
            rule__RegionSignalDec__Group_3_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__2


    // $ANTLR start rule__RegionSignalDec__Group_3_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1768:1: rule__RegionSignalDec__Group_3_1__2__Impl : ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) ) ;
    public final void rule__RegionSignalDec__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1772:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1773:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1773:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1774:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1775:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1775:2: rule__RegionSignalDec__SignalsAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_2_in_rule__RegionSignalDec__Group_3_1__2__Impl3700);
            rule__RegionSignalDec__SignalsAssignment_3_1_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__2__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1785:1: rule__RegionSignalDec__Group_3_1__3 : rule__RegionSignalDec__Group_3_1__3__Impl ;
    public final void rule__RegionSignalDec__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1789:1: ( rule__RegionSignalDec__Group_3_1__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1790:2: rule__RegionSignalDec__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__3__Impl_in_rule__RegionSignalDec__Group_3_1__33730);
            rule__RegionSignalDec__Group_3_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__3


    // $ANTLR start rule__RegionSignalDec__Group_3_1__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1796:1: rule__RegionSignalDec__Group_3_1__3__Impl : ( ( rule__RegionSignalDec__Group_3_1_3__0 )* ) ;
    public final void rule__RegionSignalDec__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1800:1: ( ( ( rule__RegionSignalDec__Group_3_1_3__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1801:1: ( ( rule__RegionSignalDec__Group_3_1_3__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1801:1: ( ( rule__RegionSignalDec__Group_3_1_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1802:1: ( rule__RegionSignalDec__Group_3_1_3__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_3_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1803:1: ( rule__RegionSignalDec__Group_3_1_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1803:2: rule__RegionSignalDec__Group_3_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__0_in_rule__RegionSignalDec__Group_3_1__3__Impl3757);
            	    rule__RegionSignalDec__Group_3_1_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getGroup_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1__3__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1821:1: rule__RegionSignalDec__Group_3_1_3__0 : rule__RegionSignalDec__Group_3_1_3__0__Impl rule__RegionSignalDec__Group_3_1_3__1 ;
    public final void rule__RegionSignalDec__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1825:1: ( rule__RegionSignalDec__Group_3_1_3__0__Impl rule__RegionSignalDec__Group_3_1_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1826:2: rule__RegionSignalDec__Group_3_1_3__0__Impl rule__RegionSignalDec__Group_3_1_3__1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__0__Impl_in_rule__RegionSignalDec__Group_3_1_3__03796);
            rule__RegionSignalDec__Group_3_1_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__1_in_rule__RegionSignalDec__Group_3_1_3__03799);
            rule__RegionSignalDec__Group_3_1_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_3__0


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1833:1: rule__RegionSignalDec__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__RegionSignalDec__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1837:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1838:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1838:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1839:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_1_3__0__Impl3827); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_3__0__Impl


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1852:1: rule__RegionSignalDec__Group_3_1_3__1 : rule__RegionSignalDec__Group_3_1_3__1__Impl ;
    public final void rule__RegionSignalDec__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1856:1: ( rule__RegionSignalDec__Group_3_1_3__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1857:2: rule__RegionSignalDec__Group_3_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__1__Impl_in_rule__RegionSignalDec__Group_3_1_3__13858);
            rule__RegionSignalDec__Group_3_1_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_3__1


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1863:1: rule__RegionSignalDec__Group_3_1_3__1__Impl : ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1867:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1868:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1868:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1869:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1870:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1870:2: rule__RegionSignalDec__SignalsAssignment_3_1_3_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_3_1_in_rule__RegionSignalDec__Group_3_1_3__1__Impl3885);
            rule__RegionSignalDec__SignalsAssignment_3_1_3_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_3__1__Impl


    // $ANTLR start rule__Variables__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1884:1: rule__Variables__Group__0 : rule__Variables__Group__0__Impl rule__Variables__Group__1 ;
    public final void rule__Variables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1888:1: ( rule__Variables__Group__0__Impl rule__Variables__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1889:2: rule__Variables__Group__0__Impl rule__Variables__Group__1
            {
            pushFollow(FOLLOW_rule__Variables__Group__0__Impl_in_rule__Variables__Group__03919);
            rule__Variables__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variables__Group__1_in_rule__Variables__Group__03922);
            rule__Variables__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group__0


    // $ANTLR start rule__Variables__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1896:1: rule__Variables__Group__0__Impl : ( ( rule__Variables__Group_0__0 ) ) ;
    public final void rule__Variables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1900:1: ( ( ( rule__Variables__Group_0__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1901:1: ( ( rule__Variables__Group_0__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1901:1: ( ( rule__Variables__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1902:1: ( rule__Variables__Group_0__0 )
            {
             before(grammarAccess.getVariablesAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1903:1: ( rule__Variables__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1903:2: rule__Variables__Group_0__0
            {
            pushFollow(FOLLOW_rule__Variables__Group_0__0_in_rule__Variables__Group__0__Impl3949);
            rule__Variables__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getVariablesAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group__0__Impl


    // $ANTLR start rule__Variables__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1913:1: rule__Variables__Group__1 : rule__Variables__Group__1__Impl ;
    public final void rule__Variables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1917:1: ( rule__Variables__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1918:2: rule__Variables__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group__1__Impl_in_rule__Variables__Group__13979);
            rule__Variables__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group__1


    // $ANTLR start rule__Variables__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1924:1: rule__Variables__Group__1__Impl : ( ';' ) ;
    public final void rule__Variables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1928:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1929:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1929:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1930:1: ';'
            {
             before(grammarAccess.getVariablesAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Variables__Group__1__Impl4007); 
             after(grammarAccess.getVariablesAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group__1__Impl


    // $ANTLR start rule__Variables__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1947:1: rule__Variables__Group_0__0 : rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 ;
    public final void rule__Variables__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1951:1: ( rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1952:2: rule__Variables__Group_0__0__Impl rule__Variables__Group_0__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_0__0__Impl_in_rule__Variables__Group_0__04042);
            rule__Variables__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_0__1_in_rule__Variables__Group_0__04045);
            rule__Variables__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0__0


    // $ANTLR start rule__Variables__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1959:1: rule__Variables__Group_0__0__Impl : ( ( rule__Variables__VarsAssignment_0_0 ) ) ;
    public final void rule__Variables__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1963:1: ( ( ( rule__Variables__VarsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1964:1: ( ( rule__Variables__VarsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1964:1: ( ( rule__Variables__VarsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1965:1: ( rule__Variables__VarsAssignment_0_0 )
            {
             before(grammarAccess.getVariablesAccess().getVarsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1966:1: ( rule__Variables__VarsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1966:2: rule__Variables__VarsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Variables__VarsAssignment_0_0_in_rule__Variables__Group_0__0__Impl4072);
            rule__Variables__VarsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getVariablesAccess().getVarsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0__0__Impl


    // $ANTLR start rule__Variables__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1976:1: rule__Variables__Group_0__1 : rule__Variables__Group_0__1__Impl ;
    public final void rule__Variables__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1980:1: ( rule__Variables__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1981:2: rule__Variables__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_0__1__Impl_in_rule__Variables__Group_0__14102);
            rule__Variables__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0__1


    // $ANTLR start rule__Variables__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1987:1: rule__Variables__Group_0__1__Impl : ( ( rule__Variables__Group_0_1__0 )* ) ;
    public final void rule__Variables__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1991:1: ( ( ( rule__Variables__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1992:1: ( ( rule__Variables__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1992:1: ( ( rule__Variables__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1993:1: ( rule__Variables__Group_0_1__0 )*
            {
             before(grammarAccess.getVariablesAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1994:1: ( rule__Variables__Group_0_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1994:2: rule__Variables__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Variables__Group_0_1__0_in_rule__Variables__Group_0__1__Impl4129);
            	    rule__Variables__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getVariablesAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0__1__Impl


    // $ANTLR start rule__Variables__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2008:1: rule__Variables__Group_0_1__0 : rule__Variables__Group_0_1__0__Impl rule__Variables__Group_0_1__1 ;
    public final void rule__Variables__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2012:1: ( rule__Variables__Group_0_1__0__Impl rule__Variables__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2013:2: rule__Variables__Group_0_1__0__Impl rule__Variables__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Variables__Group_0_1__0__Impl_in_rule__Variables__Group_0_1__04164);
            rule__Variables__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variables__Group_0_1__1_in_rule__Variables__Group_0_1__04167);
            rule__Variables__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0_1__0


    // $ANTLR start rule__Variables__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2020:1: rule__Variables__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__Variables__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2024:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2025:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2025:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2026:1: ','
            {
             before(grammarAccess.getVariablesAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Variables__Group_0_1__0__Impl4195); 
             after(grammarAccess.getVariablesAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0_1__0__Impl


    // $ANTLR start rule__Variables__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2039:1: rule__Variables__Group_0_1__1 : rule__Variables__Group_0_1__1__Impl ;
    public final void rule__Variables__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2043:1: ( rule__Variables__Group_0_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2044:2: rule__Variables__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variables__Group_0_1__1__Impl_in_rule__Variables__Group_0_1__14226);
            rule__Variables__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0_1__1


    // $ANTLR start rule__Variables__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2050:1: rule__Variables__Group_0_1__1__Impl : ( ( rule__Variables__VarsAssignment_0_1_1 ) ) ;
    public final void rule__Variables__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2054:1: ( ( ( rule__Variables__VarsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2055:1: ( ( rule__Variables__VarsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2055:1: ( ( rule__Variables__VarsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2056:1: ( rule__Variables__VarsAssignment_0_1_1 )
            {
             before(grammarAccess.getVariablesAccess().getVarsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2057:1: ( rule__Variables__VarsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2057:2: rule__Variables__VarsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Variables__VarsAssignment_0_1_1_in_rule__Variables__Group_0_1__1__Impl4253);
            rule__Variables__VarsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariablesAccess().getVarsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__Group_0_1__1__Impl


    // $ANTLR start rule__Signals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2071:1: rule__Signals__Group__0 : rule__Signals__Group__0__Impl rule__Signals__Group__1 ;
    public final void rule__Signals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2075:1: ( rule__Signals__Group__0__Impl rule__Signals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2076:2: rule__Signals__Group__0__Impl rule__Signals__Group__1
            {
            pushFollow(FOLLOW_rule__Signals__Group__0__Impl_in_rule__Signals__Group__04287);
            rule__Signals__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__04290);
            rule__Signals__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group__0


    // $ANTLR start rule__Signals__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2083:1: rule__Signals__Group__0__Impl : ( ( rule__Signals__Group_0__0 ) ) ;
    public final void rule__Signals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2087:1: ( ( ( rule__Signals__Group_0__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2088:1: ( ( rule__Signals__Group_0__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2088:1: ( ( rule__Signals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2089:1: ( rule__Signals__Group_0__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2090:1: ( rule__Signals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2090:2: rule__Signals__Group_0__0
            {
            pushFollow(FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__0__Impl4317);
            rule__Signals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group__0__Impl


    // $ANTLR start rule__Signals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2100:1: rule__Signals__Group__1 : rule__Signals__Group__1__Impl ;
    public final void rule__Signals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2104:1: ( rule__Signals__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2105:2: rule__Signals__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signals__Group__1__Impl_in_rule__Signals__Group__14347);
            rule__Signals__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group__1


    // $ANTLR start rule__Signals__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2111:1: rule__Signals__Group__1__Impl : ( ';' ) ;
    public final void rule__Signals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2115:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2116:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2116:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2117:1: ';'
            {
             before(grammarAccess.getSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Signals__Group__1__Impl4375); 
             after(grammarAccess.getSignalsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group__1__Impl


    // $ANTLR start rule__Signals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2134:1: rule__Signals__Group_0__0 : rule__Signals__Group_0__0__Impl rule__Signals__Group_0__1 ;
    public final void rule__Signals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2138:1: ( rule__Signals__Group_0__0__Impl rule__Signals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2139:2: rule__Signals__Group_0__0__Impl rule__Signals__Group_0__1
            {
            pushFollow(FOLLOW_rule__Signals__Group_0__0__Impl_in_rule__Signals__Group_0__04410);
            rule__Signals__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__04413);
            rule__Signals__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0__0


    // $ANTLR start rule__Signals__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2146:1: rule__Signals__Group_0__0__Impl : ( ( rule__Signals__SignalsAssignment_0_0 ) ) ;
    public final void rule__Signals__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2150:1: ( ( ( rule__Signals__SignalsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2151:1: ( ( rule__Signals__SignalsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2151:1: ( ( rule__Signals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2152:1: ( rule__Signals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2153:1: ( rule__Signals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2153:2: rule__Signals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__0__Impl4440);
            rule__Signals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0__0__Impl


    // $ANTLR start rule__Signals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2163:1: rule__Signals__Group_0__1 : rule__Signals__Group_0__1__Impl ;
    public final void rule__Signals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2167:1: ( rule__Signals__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2168:2: rule__Signals__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Signals__Group_0__1__Impl_in_rule__Signals__Group_0__14470);
            rule__Signals__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0__1


    // $ANTLR start rule__Signals__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2174:1: rule__Signals__Group_0__1__Impl : ( ( rule__Signals__Group_0_1__0 )* ) ;
    public final void rule__Signals__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2178:1: ( ( ( rule__Signals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2179:1: ( ( rule__Signals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2179:1: ( ( rule__Signals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2180:1: ( rule__Signals__Group_0_1__0 )*
            {
             before(grammarAccess.getSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2181:1: ( rule__Signals__Group_0_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2181:2: rule__Signals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__1__Impl4497);
            	    rule__Signals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSignalsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0__1__Impl


    // $ANTLR start rule__Signals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2195:1: rule__Signals__Group_0_1__0 : rule__Signals__Group_0_1__0__Impl rule__Signals__Group_0_1__1 ;
    public final void rule__Signals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2199:1: ( rule__Signals__Group_0_1__0__Impl rule__Signals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2200:2: rule__Signals__Group_0_1__0__Impl rule__Signals__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Signals__Group_0_1__0__Impl_in_rule__Signals__Group_0_1__04532);
            rule__Signals__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__04535);
            rule__Signals__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0_1__0


    // $ANTLR start rule__Signals__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2207:1: rule__Signals__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__Signals__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2211:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2212:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2212:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2213:1: ','
            {
             before(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Signals__Group_0_1__0__Impl4563); 
             after(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0_1__0__Impl


    // $ANTLR start rule__Signals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2226:1: rule__Signals__Group_0_1__1 : rule__Signals__Group_0_1__1__Impl ;
    public final void rule__Signals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2230:1: ( rule__Signals__Group_0_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2231:2: rule__Signals__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signals__Group_0_1__1__Impl_in_rule__Signals__Group_0_1__14594);
            rule__Signals__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0_1__1


    // $ANTLR start rule__Signals__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2237:1: rule__Signals__Group_0_1__1__Impl : ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__Signals__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2241:1: ( ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2242:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2242:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2243:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2244:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2244:2: rule__Signals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__1__Impl4621);
            rule__Signals__SignalsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getSignalsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__Group_0_1__1__Impl


    // $ANTLR start rule__InputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2258:1: rule__InputSignals__Group__0 : rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1 ;
    public final void rule__InputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2262:1: ( rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2263:2: rule__InputSignals__Group__0__Impl rule__InputSignals__Group__1
            {
            pushFollow(FOLLOW_rule__InputSignals__Group__0__Impl_in_rule__InputSignals__Group__04655);
            rule__InputSignals__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__04658);
            rule__InputSignals__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group__0


    // $ANTLR start rule__InputSignals__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2270:1: rule__InputSignals__Group__0__Impl : ( ( rule__InputSignals__Group_0__0 ) ) ;
    public final void rule__InputSignals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2274:1: ( ( ( rule__InputSignals__Group_0__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2275:1: ( ( rule__InputSignals__Group_0__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2275:1: ( ( rule__InputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2276:1: ( rule__InputSignals__Group_0__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2277:1: ( rule__InputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2277:2: rule__InputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__0__Impl4685);
            rule__InputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group__0__Impl


    // $ANTLR start rule__InputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2287:1: rule__InputSignals__Group__1 : rule__InputSignals__Group__1__Impl ;
    public final void rule__InputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2291:1: ( rule__InputSignals__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2292:2: rule__InputSignals__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InputSignals__Group__1__Impl_in_rule__InputSignals__Group__14715);
            rule__InputSignals__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group__1


    // $ANTLR start rule__InputSignals__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2298:1: rule__InputSignals__Group__1__Impl : ( ';' ) ;
    public final void rule__InputSignals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2302:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2303:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2303:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2304:1: ';'
            {
             before(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InputSignals__Group__1__Impl4743); 
             after(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group__1__Impl


    // $ANTLR start rule__InputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2321:1: rule__InputSignals__Group_0__0 : rule__InputSignals__Group_0__0__Impl rule__InputSignals__Group_0__1 ;
    public final void rule__InputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2325:1: ( rule__InputSignals__Group_0__0__Impl rule__InputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2326:2: rule__InputSignals__Group_0__0__Impl rule__InputSignals__Group_0__1
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0__0__Impl_in_rule__InputSignals__Group_0__04778);
            rule__InputSignals__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__04781);
            rule__InputSignals__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0__0


    // $ANTLR start rule__InputSignals__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2333:1: rule__InputSignals__Group_0__0__Impl : ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) ;
    public final void rule__InputSignals__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2337:1: ( ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2338:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2338:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2339:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2340:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2340:2: rule__InputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__0__Impl4808);
            rule__InputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0__0__Impl


    // $ANTLR start rule__InputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2350:1: rule__InputSignals__Group_0__1 : rule__InputSignals__Group_0__1__Impl ;
    public final void rule__InputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2354:1: ( rule__InputSignals__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2355:2: rule__InputSignals__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0__1__Impl_in_rule__InputSignals__Group_0__14838);
            rule__InputSignals__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0__1


    // $ANTLR start rule__InputSignals__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2361:1: rule__InputSignals__Group_0__1__Impl : ( ( rule__InputSignals__Group_0_1__0 )* ) ;
    public final void rule__InputSignals__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2365:1: ( ( ( rule__InputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2366:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2366:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2367:1: ( rule__InputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2368:1: ( rule__InputSignals__Group_0_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2368:2: rule__InputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__1__Impl4865);
            	    rule__InputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getInputSignalsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0__1__Impl


    // $ANTLR start rule__InputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2382:1: rule__InputSignals__Group_0_1__0 : rule__InputSignals__Group_0_1__0__Impl rule__InputSignals__Group_0_1__1 ;
    public final void rule__InputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2386:1: ( rule__InputSignals__Group_0_1__0__Impl rule__InputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2387:2: rule__InputSignals__Group_0_1__0__Impl rule__InputSignals__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0_1__0__Impl_in_rule__InputSignals__Group_0_1__04900);
            rule__InputSignals__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__04903);
            rule__InputSignals__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0_1__0


    // $ANTLR start rule__InputSignals__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2394:1: rule__InputSignals__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__InputSignals__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2398:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2399:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2399:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2400:1: ','
            {
             before(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__InputSignals__Group_0_1__0__Impl4931); 
             after(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0_1__0__Impl


    // $ANTLR start rule__InputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2413:1: rule__InputSignals__Group_0_1__1 : rule__InputSignals__Group_0_1__1__Impl ;
    public final void rule__InputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2417:1: ( rule__InputSignals__Group_0_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2418:2: rule__InputSignals__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0_1__1__Impl_in_rule__InputSignals__Group_0_1__14962);
            rule__InputSignals__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0_1__1


    // $ANTLR start rule__InputSignals__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2424:1: rule__InputSignals__Group_0_1__1__Impl : ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InputSignals__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2428:1: ( ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2429:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2429:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2430:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2431:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2431:2: rule__InputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__1__Impl4989);
            rule__InputSignals__SignalsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__Group_0_1__1__Impl


    // $ANTLR start rule__OutputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2445:1: rule__OutputSignals__Group__0 : rule__OutputSignals__Group__0__Impl rule__OutputSignals__Group__1 ;
    public final void rule__OutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2449:1: ( rule__OutputSignals__Group__0__Impl rule__OutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2450:2: rule__OutputSignals__Group__0__Impl rule__OutputSignals__Group__1
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group__0__Impl_in_rule__OutputSignals__Group__05023);
            rule__OutputSignals__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__05026);
            rule__OutputSignals__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group__0


    // $ANTLR start rule__OutputSignals__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2457:1: rule__OutputSignals__Group__0__Impl : ( ( rule__OutputSignals__Group_0__0 ) ) ;
    public final void rule__OutputSignals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2461:1: ( ( ( rule__OutputSignals__Group_0__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2462:1: ( ( rule__OutputSignals__Group_0__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2462:1: ( ( rule__OutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2463:1: ( rule__OutputSignals__Group_0__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2464:1: ( rule__OutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2464:2: rule__OutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__0__Impl5053);
            rule__OutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group__0__Impl


    // $ANTLR start rule__OutputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2474:1: rule__OutputSignals__Group__1 : rule__OutputSignals__Group__1__Impl ;
    public final void rule__OutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2478:1: ( rule__OutputSignals__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2479:2: rule__OutputSignals__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group__1__Impl_in_rule__OutputSignals__Group__15083);
            rule__OutputSignals__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group__1


    // $ANTLR start rule__OutputSignals__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2485:1: rule__OutputSignals__Group__1__Impl : ( ';' ) ;
    public final void rule__OutputSignals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2489:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2490:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2490:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2491:1: ';'
            {
             before(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__OutputSignals__Group__1__Impl5111); 
             after(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group__1__Impl


    // $ANTLR start rule__OutputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2508:1: rule__OutputSignals__Group_0__0 : rule__OutputSignals__Group_0__0__Impl rule__OutputSignals__Group_0__1 ;
    public final void rule__OutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2512:1: ( rule__OutputSignals__Group_0__0__Impl rule__OutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2513:2: rule__OutputSignals__Group_0__0__Impl rule__OutputSignals__Group_0__1
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0__0__Impl_in_rule__OutputSignals__Group_0__05146);
            rule__OutputSignals__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__05149);
            rule__OutputSignals__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0__0


    // $ANTLR start rule__OutputSignals__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2520:1: rule__OutputSignals__Group_0__0__Impl : ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) ;
    public final void rule__OutputSignals__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2524:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2525:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2525:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2526:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2527:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2527:2: rule__OutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__0__Impl5176);
            rule__OutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0__0__Impl


    // $ANTLR start rule__OutputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2537:1: rule__OutputSignals__Group_0__1 : rule__OutputSignals__Group_0__1__Impl ;
    public final void rule__OutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2541:1: ( rule__OutputSignals__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2542:2: rule__OutputSignals__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0__1__Impl_in_rule__OutputSignals__Group_0__15206);
            rule__OutputSignals__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0__1


    // $ANTLR start rule__OutputSignals__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2548:1: rule__OutputSignals__Group_0__1__Impl : ( ( rule__OutputSignals__Group_0_1__0 )* ) ;
    public final void rule__OutputSignals__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2552:1: ( ( ( rule__OutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2553:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2553:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2554:1: ( rule__OutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2555:1: ( rule__OutputSignals__Group_0_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2555:2: rule__OutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__1__Impl5233);
            	    rule__OutputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOutputSignalsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0__1__Impl


    // $ANTLR start rule__OutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2569:1: rule__OutputSignals__Group_0_1__0 : rule__OutputSignals__Group_0_1__0__Impl rule__OutputSignals__Group_0_1__1 ;
    public final void rule__OutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2573:1: ( rule__OutputSignals__Group_0_1__0__Impl rule__OutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2574:2: rule__OutputSignals__Group_0_1__0__Impl rule__OutputSignals__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__0__Impl_in_rule__OutputSignals__Group_0_1__05268);
            rule__OutputSignals__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__05271);
            rule__OutputSignals__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0_1__0


    // $ANTLR start rule__OutputSignals__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2581:1: rule__OutputSignals__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__OutputSignals__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2585:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2586:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2586:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2587:1: ','
            {
             before(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__OutputSignals__Group_0_1__0__Impl5299); 
             after(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0_1__0__Impl


    // $ANTLR start rule__OutputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2600:1: rule__OutputSignals__Group_0_1__1 : rule__OutputSignals__Group_0_1__1__Impl ;
    public final void rule__OutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2604:1: ( rule__OutputSignals__Group_0_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2605:2: rule__OutputSignals__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__1__Impl_in_rule__OutputSignals__Group_0_1__15330);
            rule__OutputSignals__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0_1__1


    // $ANTLR start rule__OutputSignals__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2611:1: rule__OutputSignals__Group_0_1__1__Impl : ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__OutputSignals__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2615:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2616:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2616:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2617:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2618:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2618:2: rule__OutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__1__Impl5357);
            rule__OutputSignals__SignalsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__Group_0_1__1__Impl


    // $ANTLR start rule__InOutputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2632:1: rule__InOutputSignals__Group__0 : rule__InOutputSignals__Group__0__Impl rule__InOutputSignals__Group__1 ;
    public final void rule__InOutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2636:1: ( rule__InOutputSignals__Group__0__Impl rule__InOutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2637:2: rule__InOutputSignals__Group__0__Impl rule__InOutputSignals__Group__1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group__0__Impl_in_rule__InOutputSignals__Group__05391);
            rule__InOutputSignals__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__05394);
            rule__InOutputSignals__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group__0


    // $ANTLR start rule__InOutputSignals__Group__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2644:1: rule__InOutputSignals__Group__0__Impl : ( ( rule__InOutputSignals__Group_0__0 ) ) ;
    public final void rule__InOutputSignals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2648:1: ( ( ( rule__InOutputSignals__Group_0__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2649:1: ( ( rule__InOutputSignals__Group_0__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2649:1: ( ( rule__InOutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2650:1: ( rule__InOutputSignals__Group_0__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2651:1: ( rule__InOutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2651:2: rule__InOutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__0__Impl5421);
            rule__InOutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group__0__Impl


    // $ANTLR start rule__InOutputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2661:1: rule__InOutputSignals__Group__1 : rule__InOutputSignals__Group__1__Impl ;
    public final void rule__InOutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2665:1: ( rule__InOutputSignals__Group__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2666:2: rule__InOutputSignals__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group__1__Impl_in_rule__InOutputSignals__Group__15451);
            rule__InOutputSignals__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group__1


    // $ANTLR start rule__InOutputSignals__Group__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2672:1: rule__InOutputSignals__Group__1__Impl : ( ';' ) ;
    public final void rule__InOutputSignals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2676:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2677:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2677:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2678:1: ';'
            {
             before(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InOutputSignals__Group__1__Impl5479); 
             after(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group__1__Impl


    // $ANTLR start rule__InOutputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2695:1: rule__InOutputSignals__Group_0__0 : rule__InOutputSignals__Group_0__0__Impl rule__InOutputSignals__Group_0__1 ;
    public final void rule__InOutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2699:1: ( rule__InOutputSignals__Group_0__0__Impl rule__InOutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2700:2: rule__InOutputSignals__Group_0__0__Impl rule__InOutputSignals__Group_0__1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__0__Impl_in_rule__InOutputSignals__Group_0__05514);
            rule__InOutputSignals__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__05517);
            rule__InOutputSignals__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0__0


    // $ANTLR start rule__InOutputSignals__Group_0__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2707:1: rule__InOutputSignals__Group_0__0__Impl : ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) ;
    public final void rule__InOutputSignals__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2711:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2712:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2712:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2713:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2714:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2714:2: rule__InOutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__0__Impl5544);
            rule__InOutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0__0__Impl


    // $ANTLR start rule__InOutputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2724:1: rule__InOutputSignals__Group_0__1 : rule__InOutputSignals__Group_0__1__Impl ;
    public final void rule__InOutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2728:1: ( rule__InOutputSignals__Group_0__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2729:2: rule__InOutputSignals__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__1__Impl_in_rule__InOutputSignals__Group_0__15574);
            rule__InOutputSignals__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0__1


    // $ANTLR start rule__InOutputSignals__Group_0__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2735:1: rule__InOutputSignals__Group_0__1__Impl : ( ( rule__InOutputSignals__Group_0_1__0 )* ) ;
    public final void rule__InOutputSignals__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2739:1: ( ( ( rule__InOutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2740:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2740:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2741:1: ( rule__InOutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2742:1: ( rule__InOutputSignals__Group_0_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2742:2: rule__InOutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__1__Impl5601);
            	    rule__InOutputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInOutputSignalsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0__1__Impl


    // $ANTLR start rule__InOutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2756:1: rule__InOutputSignals__Group_0_1__0 : rule__InOutputSignals__Group_0_1__0__Impl rule__InOutputSignals__Group_0_1__1 ;
    public final void rule__InOutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2760:1: ( rule__InOutputSignals__Group_0_1__0__Impl rule__InOutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2761:2: rule__InOutputSignals__Group_0_1__0__Impl rule__InOutputSignals__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__0__Impl_in_rule__InOutputSignals__Group_0_1__05636);
            rule__InOutputSignals__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__05639);
            rule__InOutputSignals__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0_1__0


    // $ANTLR start rule__InOutputSignals__Group_0_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2768:1: rule__InOutputSignals__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__InOutputSignals__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2772:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2773:1: ( ',' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2773:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2774:1: ','
            {
             before(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__InOutputSignals__Group_0_1__0__Impl5667); 
             after(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0_1__0__Impl


    // $ANTLR start rule__InOutputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2787:1: rule__InOutputSignals__Group_0_1__1 : rule__InOutputSignals__Group_0_1__1__Impl ;
    public final void rule__InOutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2791:1: ( rule__InOutputSignals__Group_0_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2792:2: rule__InOutputSignals__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__1__Impl_in_rule__InOutputSignals__Group_0_1__15698);
            rule__InOutputSignals__Group_0_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0_1__1


    // $ANTLR start rule__InOutputSignals__Group_0_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2798:1: rule__InOutputSignals__Group_0_1__1__Impl : ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InOutputSignals__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2802:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2803:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2803:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2804:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2805:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2805:2: rule__InOutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__1__Impl5725);
            rule__InOutputSignals__SignalsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__Group_0_1__1__Impl


    // $ANTLR start rule__Signal__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2819:1: rule__Signal__Group_1__0 : rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2823:1: ( rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2824:2: rule__Signal__Group_1__0__Impl rule__Signal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__0__Impl_in_rule__Signal__Group_1__05759);
            rule__Signal__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__05762);
            rule__Signal__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__0


    // $ANTLR start rule__Signal__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2831:1: rule__Signal__Group_1__0__Impl : ( ( rule__Signal__NameAssignment_1_0 ) ) ;
    public final void rule__Signal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2835:1: ( ( ( rule__Signal__NameAssignment_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2836:1: ( ( rule__Signal__NameAssignment_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2836:1: ( ( rule__Signal__NameAssignment_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2837:1: ( rule__Signal__NameAssignment_1_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2838:1: ( rule__Signal__NameAssignment_1_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2838:2: rule__Signal__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__0__Impl5789);
            rule__Signal__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__0__Impl


    // $ANTLR start rule__Signal__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2848:1: rule__Signal__Group_1__1 : rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2852:1: ( rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2853:2: rule__Signal__Group_1__1__Impl rule__Signal__Group_1__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__1__Impl_in_rule__Signal__Group_1__15819);
            rule__Signal__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__15822);
            rule__Signal__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__1


    // $ANTLR start rule__Signal__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2860:1: rule__Signal__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Signal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2864:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2865:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2865:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2866:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_1__1__Impl5850); 
             after(grammarAccess.getSignalAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__1__Impl


    // $ANTLR start rule__Signal__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2879:1: rule__Signal__Group_1__2 : rule__Signal__Group_1__2__Impl ;
    public final void rule__Signal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2883:1: ( rule__Signal__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2884:2: rule__Signal__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_1__2__Impl_in_rule__Signal__Group_1__25881);
            rule__Signal__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__2


    // $ANTLR start rule__Signal__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2890:1: rule__Signal__Group_1__2__Impl : ( ( rule__Signal__TypeAssignment_1_2 ) ) ;
    public final void rule__Signal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2894:1: ( ( ( rule__Signal__TypeAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2895:1: ( ( rule__Signal__TypeAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2895:1: ( ( rule__Signal__TypeAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2896:1: ( rule__Signal__TypeAssignment_1_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2897:1: ( rule__Signal__TypeAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2897:2: rule__Signal__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_1_2_in_rule__Signal__Group_1__2__Impl5908);
            rule__Signal__TypeAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1__2__Impl


    // $ANTLR start rule__Signal__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2913:1: rule__Signal__Group_2__0 : rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2917:1: ( rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2918:2: rule__Signal__Group_2__0__Impl rule__Signal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__05944);
            rule__Signal__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__05947);
            rule__Signal__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2__0


    // $ANTLR start rule__Signal__Group_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2925:1: rule__Signal__Group_2__0__Impl : ( ( rule__Signal__NameAssignment_2_0 ) ) ;
    public final void rule__Signal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2929:1: ( ( ( rule__Signal__NameAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2930:1: ( ( rule__Signal__NameAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2930:1: ( ( rule__Signal__NameAssignment_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2931:1: ( rule__Signal__NameAssignment_2_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2932:1: ( rule__Signal__NameAssignment_2_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2932:2: rule__Signal__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__0__Impl5974);
            rule__Signal__NameAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2__0__Impl


    // $ANTLR start rule__Signal__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2942:1: rule__Signal__Group_2__1 : rule__Signal__Group_2__1__Impl ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2946:1: ( rule__Signal__Group_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2947:2: rule__Signal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__16004);
            rule__Signal__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2__1


    // $ANTLR start rule__Signal__Group_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2953:1: rule__Signal__Group_2__1__Impl : ( ( rule__Signal__Group_2_1__0 ) ) ;
    public final void rule__Signal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2957:1: ( ( ( rule__Signal__Group_2_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2958:1: ( ( rule__Signal__Group_2_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2958:1: ( ( rule__Signal__Group_2_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2959:1: ( rule__Signal__Group_2_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2960:1: ( rule__Signal__Group_2_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2960:2: rule__Signal__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__1__Impl6031);
            rule__Signal__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2__1__Impl


    // $ANTLR start rule__Signal__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2974:1: rule__Signal__Group_2_1__0 : rule__Signal__Group_2_1__0__Impl rule__Signal__Group_2_1__1 ;
    public final void rule__Signal__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2978:1: ( rule__Signal__Group_2_1__0__Impl rule__Signal__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2979:2: rule__Signal__Group_2_1__0__Impl rule__Signal__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_2_1__0__Impl_in_rule__Signal__Group_2_1__06065);
            rule__Signal__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__06068);
            rule__Signal__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2_1__0


    // $ANTLR start rule__Signal__Group_2_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2986:1: rule__Signal__Group_2_1__0__Impl : ( ':=' ) ;
    public final void rule__Signal__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2990:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2991:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2991:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2992:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_2_1__0__Impl6096); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2_1__0__Impl


    // $ANTLR start rule__Signal__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3005:1: rule__Signal__Group_2_1__1 : rule__Signal__Group_2_1__1__Impl ;
    public final void rule__Signal__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3009:1: ( rule__Signal__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3010:2: rule__Signal__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_2_1__1__Impl_in_rule__Signal__Group_2_1__16127);
            rule__Signal__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2_1__1


    // $ANTLR start rule__Signal__Group_2_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3016:1: rule__Signal__Group_2_1__1__Impl : ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) ;
    public final void rule__Signal__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3020:1: ( ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3021:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3021:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3022:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3023:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3023:2: rule__Signal__InitialValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__1__Impl6154);
            rule__Signal__InitialValueAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2_1__1__Impl


    // $ANTLR start rule__Signal__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3037:1: rule__Signal__Group_3__0 : rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3041:1: ( rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3042:2: rule__Signal__Group_3__0__Impl rule__Signal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__06188);
            rule__Signal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__06191);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3049:1: rule__Signal__Group_3__0__Impl : ( ( rule__Signal__NameAssignment_3_0 ) ) ;
    public final void rule__Signal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3053:1: ( ( ( rule__Signal__NameAssignment_3_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3054:1: ( ( rule__Signal__NameAssignment_3_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3054:1: ( ( rule__Signal__NameAssignment_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3055:1: ( rule__Signal__NameAssignment_3_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3056:1: ( rule__Signal__NameAssignment_3_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3056:2: rule__Signal__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__0__Impl6218);
            rule__Signal__NameAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3066:1: rule__Signal__Group_3__1 : rule__Signal__Group_3__1__Impl rule__Signal__Group_3__2 ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3070:1: ( rule__Signal__Group_3__1__Impl rule__Signal__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3071:2: rule__Signal__Group_3__1__Impl rule__Signal__Group_3__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__16248);
            rule__Signal__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__16251);
            rule__Signal__Group_3__2();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3078:1: rule__Signal__Group_3__1__Impl : ( ( rule__Signal__Group_3_1__0 ) ) ;
    public final void rule__Signal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3082:1: ( ( ( rule__Signal__Group_3_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3083:1: ( ( rule__Signal__Group_3_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3083:1: ( ( rule__Signal__Group_3_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3084:1: ( rule__Signal__Group_3_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3085:1: ( rule__Signal__Group_3_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3085:2: rule__Signal__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__1__Impl6278);
            rule__Signal__Group_3_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_3__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3095:1: rule__Signal__Group_3__2 : rule__Signal__Group_3__2__Impl rule__Signal__Group_3__3 ;
    public final void rule__Signal__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3099:1: ( rule__Signal__Group_3__2__Impl rule__Signal__Group_3__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3100:2: rule__Signal__Group_3__2__Impl rule__Signal__Group_3__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__2__Impl_in_rule__Signal__Group_3__26308);
            rule__Signal__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3__3_in_rule__Signal__Group_3__26311);
            rule__Signal__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3__2


    // $ANTLR start rule__Signal__Group_3__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3107:1: rule__Signal__Group_3__2__Impl : ( ':' ) ;
    public final void rule__Signal__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3111:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3112:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3112:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3113:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3_2()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_3__2__Impl6339); 
             after(grammarAccess.getSignalAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3__2__Impl


    // $ANTLR start rule__Signal__Group_3__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3126:1: rule__Signal__Group_3__3 : rule__Signal__Group_3__3__Impl ;
    public final void rule__Signal__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3130:1: ( rule__Signal__Group_3__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3131:2: rule__Signal__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_3__3__Impl_in_rule__Signal__Group_3__36370);
            rule__Signal__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3__3


    // $ANTLR start rule__Signal__Group_3__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3137:1: rule__Signal__Group_3__3__Impl : ( ( rule__Signal__TypeAssignment_3_3 ) ) ;
    public final void rule__Signal__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3141:1: ( ( ( rule__Signal__TypeAssignment_3_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3142:1: ( ( rule__Signal__TypeAssignment_3_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3142:1: ( ( rule__Signal__TypeAssignment_3_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3143:1: ( rule__Signal__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_3_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3144:1: ( rule__Signal__TypeAssignment_3_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3144:2: rule__Signal__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_3_3_in_rule__Signal__Group_3__3__Impl6397);
            rule__Signal__TypeAssignment_3_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3__3__Impl


    // $ANTLR start rule__Signal__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3162:1: rule__Signal__Group_3_1__0 : rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1 ;
    public final void rule__Signal__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3166:1: ( rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3167:2: rule__Signal__Group_3_1__0__Impl rule__Signal__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_1__0__Impl_in_rule__Signal__Group_3_1__06435);
            rule__Signal__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__06438);
            rule__Signal__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_1__0


    // $ANTLR start rule__Signal__Group_3_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3174:1: rule__Signal__Group_3_1__0__Impl : ( ':=' ) ;
    public final void rule__Signal__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3178:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3179:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3179:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3180:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_3_1__0__Impl6466); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_1__0__Impl


    // $ANTLR start rule__Signal__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3193:1: rule__Signal__Group_3_1__1 : rule__Signal__Group_3_1__1__Impl ;
    public final void rule__Signal__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3197:1: ( rule__Signal__Group_3_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3198:2: rule__Signal__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_1__1__Impl_in_rule__Signal__Group_3_1__16497);
            rule__Signal__Group_3_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_1__1


    // $ANTLR start rule__Signal__Group_3_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3204:1: rule__Signal__Group_3_1__1__Impl : ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) ;
    public final void rule__Signal__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3208:1: ( ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3209:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3209:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3210:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_3_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3211:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3211:2: rule__Signal__InitialValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__1__Impl6524);
            rule__Signal__InitialValueAssignment_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_1__1__Impl


    // $ANTLR start rule__Signal__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3225:1: rule__Signal__Group_4__0 : rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3229:1: ( rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3230:2: rule__Signal__Group_4__0__Impl rule__Signal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__06558);
            rule__Signal__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__06561);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3237:1: rule__Signal__Group_4__0__Impl : ( ( rule__Signal__NameAssignment_4_0 ) ) ;
    public final void rule__Signal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3241:1: ( ( ( rule__Signal__NameAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3242:1: ( ( rule__Signal__NameAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3242:1: ( ( rule__Signal__NameAssignment_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3243:1: ( rule__Signal__NameAssignment_4_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3244:1: ( rule__Signal__NameAssignment_4_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3244:2: rule__Signal__NameAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__0__Impl6588);
            rule__Signal__NameAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3254:1: rule__Signal__Group_4__1 : rule__Signal__Group_4__1__Impl rule__Signal__Group_4__2 ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3258:1: ( rule__Signal__Group_4__1__Impl rule__Signal__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3259:2: rule__Signal__Group_4__1__Impl rule__Signal__Group_4__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__16618);
            rule__Signal__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__16621);
            rule__Signal__Group_4__2();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3266:1: rule__Signal__Group_4__1__Impl : ( ( rule__Signal__Group_4_1__0 ) ) ;
    public final void rule__Signal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3270:1: ( ( ( rule__Signal__Group_4_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3271:1: ( ( rule__Signal__Group_4_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3271:1: ( ( rule__Signal__Group_4_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3272:1: ( rule__Signal__Group_4_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3273:1: ( rule__Signal__Group_4_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3273:2: rule__Signal__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl6648);
            rule__Signal__Group_4_1__0();
            _fsp--;


            }

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


    // $ANTLR start rule__Signal__Group_4__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3283:1: rule__Signal__Group_4__2 : rule__Signal__Group_4__2__Impl ;
    public final void rule__Signal__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3287:1: ( rule__Signal__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3288:2: rule__Signal__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4__2__Impl_in_rule__Signal__Group_4__26678);
            rule__Signal__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4__2


    // $ANTLR start rule__Signal__Group_4__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3294:1: rule__Signal__Group_4__2__Impl : ( ( rule__Signal__Group_4_2__0 ) ) ;
    public final void rule__Signal__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3298:1: ( ( ( rule__Signal__Group_4_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3299:1: ( ( rule__Signal__Group_4_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3299:1: ( ( rule__Signal__Group_4_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3300:1: ( rule__Signal__Group_4_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_4_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3301:1: ( rule__Signal__Group_4_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3301:2: rule__Signal__Group_4_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__0_in_rule__Signal__Group_4__2__Impl6705);
            rule__Signal__Group_4_2__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4__2__Impl


    // $ANTLR start rule__Signal__Group_4_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3317:1: rule__Signal__Group_4_1__0 : rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 ;
    public final void rule__Signal__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3321:1: ( rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3322:2: rule__Signal__Group_4_1__0__Impl rule__Signal__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__06741);
            rule__Signal__Group_4_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__06744);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3329:1: rule__Signal__Group_4_1__0__Impl : ( ':=' ) ;
    public final void rule__Signal__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3333:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3334:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3334:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3335:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_4_1__0__Impl6772); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3348:1: rule__Signal__Group_4_1__1 : rule__Signal__Group_4_1__1__Impl ;
    public final void rule__Signal__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3352:1: ( rule__Signal__Group_4_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3353:2: rule__Signal__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__16803);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3359:1: rule__Signal__Group_4_1__1__Impl : ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) ;
    public final void rule__Signal__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3363:1: ( ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3364:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3364:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3365:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_4_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3366:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3366:2: rule__Signal__InitialValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl6830);
            rule__Signal__InitialValueAssignment_4_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_4_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_4_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3380:1: rule__Signal__Group_4_2__0 : rule__Signal__Group_4_2__0__Impl rule__Signal__Group_4_2__1 ;
    public final void rule__Signal__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3384:1: ( rule__Signal__Group_4_2__0__Impl rule__Signal__Group_4_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3385:2: rule__Signal__Group_4_2__0__Impl rule__Signal__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__0__Impl_in_rule__Signal__Group_4_2__06864);
            rule__Signal__Group_4_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_2__1_in_rule__Signal__Group_4_2__06867);
            rule__Signal__Group_4_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__0


    // $ANTLR start rule__Signal__Group_4_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3392:1: rule__Signal__Group_4_2__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3396:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3397:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3397:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3398:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_4_2__0__Impl6895); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__0__Impl


    // $ANTLR start rule__Signal__Group_4_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3411:1: rule__Signal__Group_4_2__1 : rule__Signal__Group_4_2__1__Impl rule__Signal__Group_4_2__2 ;
    public final void rule__Signal__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3415:1: ( rule__Signal__Group_4_2__1__Impl rule__Signal__Group_4_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3416:2: rule__Signal__Group_4_2__1__Impl rule__Signal__Group_4_2__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__1__Impl_in_rule__Signal__Group_4_2__16926);
            rule__Signal__Group_4_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_2__2_in_rule__Signal__Group_4_2__16929);
            rule__Signal__Group_4_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__1


    // $ANTLR start rule__Signal__Group_4_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3423:1: rule__Signal__Group_4_2__1__Impl : ( ( rule__Signal__TypeAssignment_4_2_1 ) ) ;
    public final void rule__Signal__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3427:1: ( ( ( rule__Signal__TypeAssignment_4_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3428:1: ( ( rule__Signal__TypeAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3428:1: ( ( rule__Signal__TypeAssignment_4_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3429:1: ( rule__Signal__TypeAssignment_4_2_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_4_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3430:1: ( rule__Signal__TypeAssignment_4_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3430:2: rule__Signal__TypeAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_4_2_1_in_rule__Signal__Group_4_2__1__Impl6956);
            rule__Signal__TypeAssignment_4_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__1__Impl


    // $ANTLR start rule__Signal__Group_4_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3440:1: rule__Signal__Group_4_2__2 : rule__Signal__Group_4_2__2__Impl rule__Signal__Group_4_2__3 ;
    public final void rule__Signal__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3444:1: ( rule__Signal__Group_4_2__2__Impl rule__Signal__Group_4_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3445:2: rule__Signal__Group_4_2__2__Impl rule__Signal__Group_4_2__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__2__Impl_in_rule__Signal__Group_4_2__26986);
            rule__Signal__Group_4_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_4_2__3_in_rule__Signal__Group_4_2__26989);
            rule__Signal__Group_4_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__2


    // $ANTLR start rule__Signal__Group_4_2__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3452:1: rule__Signal__Group_4_2__2__Impl : ( 'with' ) ;
    public final void rule__Signal__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3456:1: ( ( 'with' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3457:1: ( 'with' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3457:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3458:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_4_2_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_4_2__2__Impl7017); 
             after(grammarAccess.getSignalAccess().getWithKeyword_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__2__Impl


    // $ANTLR start rule__Signal__Group_4_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3471:1: rule__Signal__Group_4_2__3 : rule__Signal__Group_4_2__3__Impl ;
    public final void rule__Signal__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3475:1: ( rule__Signal__Group_4_2__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3476:2: rule__Signal__Group_4_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__3__Impl_in_rule__Signal__Group_4_2__37048);
            rule__Signal__Group_4_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__3


    // $ANTLR start rule__Signal__Group_4_2__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3482:1: rule__Signal__Group_4_2__3__Impl : ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) ) ;
    public final void rule__Signal__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3486:1: ( ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3487:1: ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3487:1: ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3488:1: ( rule__Signal__CombineOperatorAssignment_4_2_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_4_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3489:1: ( rule__Signal__CombineOperatorAssignment_4_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3489:2: rule__Signal__CombineOperatorAssignment_4_2_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_4_2_3_in_rule__Signal__Group_4_2__3__Impl7075);
            rule__Signal__CombineOperatorAssignment_4_2_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getCombineOperatorAssignment_4_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_4_2__3__Impl


    // $ANTLR start rule__Signal__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3507:1: rule__Signal__Group_5__0 : rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1 ;
    public final void rule__Signal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3511:1: ( rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3512:2: rule__Signal__Group_5__0__Impl rule__Signal__Group_5__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_5__0__Impl_in_rule__Signal__Group_5__07113);
            rule__Signal__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__07116);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3519:1: rule__Signal__Group_5__0__Impl : ( ( rule__Signal__NameAssignment_5_0 ) ) ;
    public final void rule__Signal__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3523:1: ( ( ( rule__Signal__NameAssignment_5_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3524:1: ( ( rule__Signal__NameAssignment_5_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3524:1: ( ( rule__Signal__NameAssignment_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3525:1: ( rule__Signal__NameAssignment_5_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3526:1: ( rule__Signal__NameAssignment_5_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3526:2: rule__Signal__NameAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__0__Impl7143);
            rule__Signal__NameAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3536:1: rule__Signal__Group_5__1 : rule__Signal__Group_5__1__Impl rule__Signal__Group_5__2 ;
    public final void rule__Signal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3540:1: ( rule__Signal__Group_5__1__Impl rule__Signal__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3541:2: rule__Signal__Group_5__1__Impl rule__Signal__Group_5__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_5__1__Impl_in_rule__Signal__Group_5__17173);
            rule__Signal__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__17176);
            rule__Signal__Group_5__2();
            _fsp--;


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3548:1: rule__Signal__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Signal__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3552:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3553:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3553:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3554:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_5_1()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_5__1__Impl7204); 
             after(grammarAccess.getSignalAccess().getColonKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_5__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3567:1: rule__Signal__Group_5__2 : rule__Signal__Group_5__2__Impl ;
    public final void rule__Signal__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3571:1: ( rule__Signal__Group_5__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3572:2: rule__Signal__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_5__2__Impl_in_rule__Signal__Group_5__27235);
            rule__Signal__Group_5__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__2


    // $ANTLR start rule__Signal__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3578:1: rule__Signal__Group_5__2__Impl : ( ( rule__Signal__HostTypeAssignment_5_2 ) ) ;
    public final void rule__Signal__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3582:1: ( ( ( rule__Signal__HostTypeAssignment_5_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3583:1: ( ( rule__Signal__HostTypeAssignment_5_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3583:1: ( ( rule__Signal__HostTypeAssignment_5_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3584:1: ( rule__Signal__HostTypeAssignment_5_2 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_5_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3585:1: ( rule__Signal__HostTypeAssignment_5_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3585:2: rule__Signal__HostTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_5_2_in_rule__Signal__Group_5__2__Impl7262);
            rule__Signal__HostTypeAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5__2__Impl


    // $ANTLR start rule__Signal__Group_6__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3601:1: rule__Signal__Group_6__0 : rule__Signal__Group_6__0__Impl rule__Signal__Group_6__1 ;
    public final void rule__Signal__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3605:1: ( rule__Signal__Group_6__0__Impl rule__Signal__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3606:2: rule__Signal__Group_6__0__Impl rule__Signal__Group_6__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_6__0__Impl_in_rule__Signal__Group_6__07298);
            rule__Signal__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__07301);
            rule__Signal__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__0


    // $ANTLR start rule__Signal__Group_6__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3613:1: rule__Signal__Group_6__0__Impl : ( ( rule__Signal__NameAssignment_6_0 ) ) ;
    public final void rule__Signal__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3617:1: ( ( ( rule__Signal__NameAssignment_6_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3618:1: ( ( rule__Signal__NameAssignment_6_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3618:1: ( ( rule__Signal__NameAssignment_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3619:1: ( rule__Signal__NameAssignment_6_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3620:1: ( rule__Signal__NameAssignment_6_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3620:2: rule__Signal__NameAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__0__Impl7328);
            rule__Signal__NameAssignment_6_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__0__Impl


    // $ANTLR start rule__Signal__Group_6__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3630:1: rule__Signal__Group_6__1 : rule__Signal__Group_6__1__Impl rule__Signal__Group_6__2 ;
    public final void rule__Signal__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3634:1: ( rule__Signal__Group_6__1__Impl rule__Signal__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3635:2: rule__Signal__Group_6__1__Impl rule__Signal__Group_6__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_6__1__Impl_in_rule__Signal__Group_6__17358);
            rule__Signal__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_6__2_in_rule__Signal__Group_6__17361);
            rule__Signal__Group_6__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__1


    // $ANTLR start rule__Signal__Group_6__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3642:1: rule__Signal__Group_6__1__Impl : ( ( rule__Signal__Group_6_1__0 ) ) ;
    public final void rule__Signal__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3646:1: ( ( ( rule__Signal__Group_6_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3647:1: ( ( rule__Signal__Group_6_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3647:1: ( ( rule__Signal__Group_6_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3648:1: ( rule__Signal__Group_6_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_6_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3649:1: ( rule__Signal__Group_6_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3649:2: rule__Signal__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__1__Impl7388);
            rule__Signal__Group_6_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__1__Impl


    // $ANTLR start rule__Signal__Group_6__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3659:1: rule__Signal__Group_6__2 : rule__Signal__Group_6__2__Impl rule__Signal__Group_6__3 ;
    public final void rule__Signal__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3663:1: ( rule__Signal__Group_6__2__Impl rule__Signal__Group_6__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3664:2: rule__Signal__Group_6__2__Impl rule__Signal__Group_6__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_6__2__Impl_in_rule__Signal__Group_6__27418);
            rule__Signal__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_6__3_in_rule__Signal__Group_6__27421);
            rule__Signal__Group_6__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__2


    // $ANTLR start rule__Signal__Group_6__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3671:1: rule__Signal__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Signal__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3675:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3676:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3676:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3677:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_6_2()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_6__2__Impl7449); 
             after(grammarAccess.getSignalAccess().getColonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__2__Impl


    // $ANTLR start rule__Signal__Group_6__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3690:1: rule__Signal__Group_6__3 : rule__Signal__Group_6__3__Impl ;
    public final void rule__Signal__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3694:1: ( rule__Signal__Group_6__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3695:2: rule__Signal__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_6__3__Impl_in_rule__Signal__Group_6__37480);
            rule__Signal__Group_6__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__3


    // $ANTLR start rule__Signal__Group_6__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3701:1: rule__Signal__Group_6__3__Impl : ( ( rule__Signal__HostTypeAssignment_6_3 ) ) ;
    public final void rule__Signal__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3705:1: ( ( ( rule__Signal__HostTypeAssignment_6_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3706:1: ( ( rule__Signal__HostTypeAssignment_6_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3706:1: ( ( rule__Signal__HostTypeAssignment_6_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3707:1: ( rule__Signal__HostTypeAssignment_6_3 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_6_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3708:1: ( rule__Signal__HostTypeAssignment_6_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3708:2: rule__Signal__HostTypeAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_6_3_in_rule__Signal__Group_6__3__Impl7507);
            rule__Signal__HostTypeAssignment_6_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6__3__Impl


    // $ANTLR start rule__Signal__Group_6_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3726:1: rule__Signal__Group_6_1__0 : rule__Signal__Group_6_1__0__Impl rule__Signal__Group_6_1__1 ;
    public final void rule__Signal__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3730:1: ( rule__Signal__Group_6_1__0__Impl rule__Signal__Group_6_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3731:2: rule__Signal__Group_6_1__0__Impl rule__Signal__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_6_1__0__Impl_in_rule__Signal__Group_6_1__07545);
            rule__Signal__Group_6_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__07548);
            rule__Signal__Group_6_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__0


    // $ANTLR start rule__Signal__Group_6_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3738:1: rule__Signal__Group_6_1__0__Impl : ( ':=' ) ;
    public final void rule__Signal__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3742:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3743:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3743:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3744:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_6_1__0__Impl7576); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__0__Impl


    // $ANTLR start rule__Signal__Group_6_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3757:1: rule__Signal__Group_6_1__1 : rule__Signal__Group_6_1__1__Impl ;
    public final void rule__Signal__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3761:1: ( rule__Signal__Group_6_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3762:2: rule__Signal__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_6_1__1__Impl_in_rule__Signal__Group_6_1__17607);
            rule__Signal__Group_6_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__1


    // $ANTLR start rule__Signal__Group_6_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3768:1: rule__Signal__Group_6_1__1__Impl : ( ( rule__Signal__InitialValueAssignment_6_1_1 ) ) ;
    public final void rule__Signal__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3772:1: ( ( ( rule__Signal__InitialValueAssignment_6_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3773:1: ( ( rule__Signal__InitialValueAssignment_6_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3773:1: ( ( rule__Signal__InitialValueAssignment_6_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3774:1: ( rule__Signal__InitialValueAssignment_6_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_6_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3775:1: ( rule__Signal__InitialValueAssignment_6_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3775:2: rule__Signal__InitialValueAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_6_1_1_in_rule__Signal__Group_6_1__1__Impl7634);
            rule__Signal__InitialValueAssignment_6_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__1__Impl


    // $ANTLR start rule__Signal__Group_7__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3789:1: rule__Signal__Group_7__0 : rule__Signal__Group_7__0__Impl rule__Signal__Group_7__1 ;
    public final void rule__Signal__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3793:1: ( rule__Signal__Group_7__0__Impl rule__Signal__Group_7__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3794:2: rule__Signal__Group_7__0__Impl rule__Signal__Group_7__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_7__0__Impl_in_rule__Signal__Group_7__07668);
            rule__Signal__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__07671);
            rule__Signal__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__0


    // $ANTLR start rule__Signal__Group_7__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3801:1: rule__Signal__Group_7__0__Impl : ( ( rule__Signal__NameAssignment_7_0 ) ) ;
    public final void rule__Signal__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3805:1: ( ( ( rule__Signal__NameAssignment_7_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3806:1: ( ( rule__Signal__NameAssignment_7_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3806:1: ( ( rule__Signal__NameAssignment_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3807:1: ( rule__Signal__NameAssignment_7_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3808:1: ( rule__Signal__NameAssignment_7_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3808:2: rule__Signal__NameAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__0__Impl7698);
            rule__Signal__NameAssignment_7_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__0__Impl


    // $ANTLR start rule__Signal__Group_7__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3818:1: rule__Signal__Group_7__1 : rule__Signal__Group_7__1__Impl rule__Signal__Group_7__2 ;
    public final void rule__Signal__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3822:1: ( rule__Signal__Group_7__1__Impl rule__Signal__Group_7__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3823:2: rule__Signal__Group_7__1__Impl rule__Signal__Group_7__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_7__1__Impl_in_rule__Signal__Group_7__17728);
            rule__Signal__Group_7__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7__2_in_rule__Signal__Group_7__17731);
            rule__Signal__Group_7__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__1


    // $ANTLR start rule__Signal__Group_7__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3830:1: rule__Signal__Group_7__1__Impl : ( ( rule__Signal__Group_7_1__0 ) ) ;
    public final void rule__Signal__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3834:1: ( ( ( rule__Signal__Group_7_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3835:1: ( ( rule__Signal__Group_7_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3835:1: ( ( rule__Signal__Group_7_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3836:1: ( rule__Signal__Group_7_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_7_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3837:1: ( rule__Signal__Group_7_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3837:2: rule__Signal__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__1__Impl7758);
            rule__Signal__Group_7_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__1__Impl


    // $ANTLR start rule__Signal__Group_7__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3847:1: rule__Signal__Group_7__2 : rule__Signal__Group_7__2__Impl ;
    public final void rule__Signal__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3851:1: ( rule__Signal__Group_7__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3852:2: rule__Signal__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_7__2__Impl_in_rule__Signal__Group_7__27788);
            rule__Signal__Group_7__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__2


    // $ANTLR start rule__Signal__Group_7__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3858:1: rule__Signal__Group_7__2__Impl : ( ( rule__Signal__Group_7_2__0 ) ) ;
    public final void rule__Signal__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3862:1: ( ( ( rule__Signal__Group_7_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3863:1: ( ( rule__Signal__Group_7_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3863:1: ( ( rule__Signal__Group_7_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3864:1: ( rule__Signal__Group_7_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_7_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3865:1: ( rule__Signal__Group_7_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3865:2: rule__Signal__Group_7_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__0_in_rule__Signal__Group_7__2__Impl7815);
            rule__Signal__Group_7_2__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7__2__Impl


    // $ANTLR start rule__Signal__Group_7_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3881:1: rule__Signal__Group_7_1__0 : rule__Signal__Group_7_1__0__Impl rule__Signal__Group_7_1__1 ;
    public final void rule__Signal__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3885:1: ( rule__Signal__Group_7_1__0__Impl rule__Signal__Group_7_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3886:2: rule__Signal__Group_7_1__0__Impl rule__Signal__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_1__0__Impl_in_rule__Signal__Group_7_1__07851);
            rule__Signal__Group_7_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__07854);
            rule__Signal__Group_7_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__0


    // $ANTLR start rule__Signal__Group_7_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3893:1: rule__Signal__Group_7_1__0__Impl : ( ':=' ) ;
    public final void rule__Signal__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3897:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3898:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3898:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3899:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_7_1__0__Impl7882); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__0__Impl


    // $ANTLR start rule__Signal__Group_7_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3912:1: rule__Signal__Group_7_1__1 : rule__Signal__Group_7_1__1__Impl ;
    public final void rule__Signal__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3916:1: ( rule__Signal__Group_7_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3917:2: rule__Signal__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_1__1__Impl_in_rule__Signal__Group_7_1__17913);
            rule__Signal__Group_7_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__1


    // $ANTLR start rule__Signal__Group_7_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3923:1: rule__Signal__Group_7_1__1__Impl : ( ( rule__Signal__InitialValueAssignment_7_1_1 ) ) ;
    public final void rule__Signal__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3927:1: ( ( ( rule__Signal__InitialValueAssignment_7_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3928:1: ( ( rule__Signal__InitialValueAssignment_7_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3928:1: ( ( rule__Signal__InitialValueAssignment_7_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3929:1: ( rule__Signal__InitialValueAssignment_7_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_7_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3930:1: ( rule__Signal__InitialValueAssignment_7_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3930:2: rule__Signal__InitialValueAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_7_1_1_in_rule__Signal__Group_7_1__1__Impl7940);
            rule__Signal__InitialValueAssignment_7_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__1__Impl


    // $ANTLR start rule__Signal__Group_7_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3944:1: rule__Signal__Group_7_2__0 : rule__Signal__Group_7_2__0__Impl rule__Signal__Group_7_2__1 ;
    public final void rule__Signal__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3948:1: ( rule__Signal__Group_7_2__0__Impl rule__Signal__Group_7_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3949:2: rule__Signal__Group_7_2__0__Impl rule__Signal__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__0__Impl_in_rule__Signal__Group_7_2__07974);
            rule__Signal__Group_7_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7_2__1_in_rule__Signal__Group_7_2__07977);
            rule__Signal__Group_7_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__0


    // $ANTLR start rule__Signal__Group_7_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3956:1: rule__Signal__Group_7_2__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3960:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3961:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3961:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3962:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_7_2__0__Impl8005); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__0__Impl


    // $ANTLR start rule__Signal__Group_7_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3975:1: rule__Signal__Group_7_2__1 : rule__Signal__Group_7_2__1__Impl rule__Signal__Group_7_2__2 ;
    public final void rule__Signal__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3979:1: ( rule__Signal__Group_7_2__1__Impl rule__Signal__Group_7_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3980:2: rule__Signal__Group_7_2__1__Impl rule__Signal__Group_7_2__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__1__Impl_in_rule__Signal__Group_7_2__18036);
            rule__Signal__Group_7_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7_2__2_in_rule__Signal__Group_7_2__18039);
            rule__Signal__Group_7_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__1


    // $ANTLR start rule__Signal__Group_7_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3987:1: rule__Signal__Group_7_2__1__Impl : ( ( rule__Signal__HostTypeAssignment_7_2_1 ) ) ;
    public final void rule__Signal__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3991:1: ( ( ( rule__Signal__HostTypeAssignment_7_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3992:1: ( ( rule__Signal__HostTypeAssignment_7_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3992:1: ( ( rule__Signal__HostTypeAssignment_7_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3993:1: ( rule__Signal__HostTypeAssignment_7_2_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_7_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3994:1: ( rule__Signal__HostTypeAssignment_7_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3994:2: rule__Signal__HostTypeAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_7_2_1_in_rule__Signal__Group_7_2__1__Impl8066);
            rule__Signal__HostTypeAssignment_7_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__1__Impl


    // $ANTLR start rule__Signal__Group_7_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4004:1: rule__Signal__Group_7_2__2 : rule__Signal__Group_7_2__2__Impl rule__Signal__Group_7_2__3 ;
    public final void rule__Signal__Group_7_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4008:1: ( rule__Signal__Group_7_2__2__Impl rule__Signal__Group_7_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4009:2: rule__Signal__Group_7_2__2__Impl rule__Signal__Group_7_2__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__2__Impl_in_rule__Signal__Group_7_2__28096);
            rule__Signal__Group_7_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_7_2__3_in_rule__Signal__Group_7_2__28099);
            rule__Signal__Group_7_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__2


    // $ANTLR start rule__Signal__Group_7_2__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4016:1: rule__Signal__Group_7_2__2__Impl : ( 'with' ) ;
    public final void rule__Signal__Group_7_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4020:1: ( ( 'with' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4021:1: ( 'with' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4021:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4022:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_7_2_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_7_2__2__Impl8127); 
             after(grammarAccess.getSignalAccess().getWithKeyword_7_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__2__Impl


    // $ANTLR start rule__Signal__Group_7_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4035:1: rule__Signal__Group_7_2__3 : rule__Signal__Group_7_2__3__Impl ;
    public final void rule__Signal__Group_7_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4039:1: ( rule__Signal__Group_7_2__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4040:2: rule__Signal__Group_7_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__3__Impl_in_rule__Signal__Group_7_2__38158);
            rule__Signal__Group_7_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__3


    // $ANTLR start rule__Signal__Group_7_2__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4046:1: rule__Signal__Group_7_2__3__Impl : ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) ) ;
    public final void rule__Signal__Group_7_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4050:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4051:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4051:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4052:1: ( rule__Signal__HostCombineOperatorAssignment_7_2_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_7_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4053:1: ( rule__Signal__HostCombineOperatorAssignment_7_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4053:2: rule__Signal__HostCombineOperatorAssignment_7_2_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_2_3_in_rule__Signal__Group_7_2__3__Impl8185);
            rule__Signal__HostCombineOperatorAssignment_7_2_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_7_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_2__3__Impl


    // $ANTLR start rule__Signal__Group_8__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4071:1: rule__Signal__Group_8__0 : rule__Signal__Group_8__0__Impl rule__Signal__Group_8__1 ;
    public final void rule__Signal__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4075:1: ( rule__Signal__Group_8__0__Impl rule__Signal__Group_8__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4076:2: rule__Signal__Group_8__0__Impl rule__Signal__Group_8__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_8__0__Impl_in_rule__Signal__Group_8__08223);
            rule__Signal__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_8__1_in_rule__Signal__Group_8__08226);
            rule__Signal__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8__0


    // $ANTLR start rule__Signal__Group_8__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4083:1: rule__Signal__Group_8__0__Impl : ( ( rule__Signal__NameAssignment_8_0 ) ) ;
    public final void rule__Signal__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4087:1: ( ( ( rule__Signal__NameAssignment_8_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4088:1: ( ( rule__Signal__NameAssignment_8_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4088:1: ( ( rule__Signal__NameAssignment_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4089:1: ( rule__Signal__NameAssignment_8_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_8_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4090:1: ( rule__Signal__NameAssignment_8_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4090:2: rule__Signal__NameAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_8_0_in_rule__Signal__Group_8__0__Impl8253);
            rule__Signal__NameAssignment_8_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8__0__Impl


    // $ANTLR start rule__Signal__Group_8__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4100:1: rule__Signal__Group_8__1 : rule__Signal__Group_8__1__Impl ;
    public final void rule__Signal__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4104:1: ( rule__Signal__Group_8__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4105:2: rule__Signal__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_8__1__Impl_in_rule__Signal__Group_8__18283);
            rule__Signal__Group_8__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8__1


    // $ANTLR start rule__Signal__Group_8__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4111:1: rule__Signal__Group_8__1__Impl : ( ( rule__Signal__Group_8_1__0 ) ) ;
    public final void rule__Signal__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4115:1: ( ( ( rule__Signal__Group_8_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4116:1: ( ( rule__Signal__Group_8_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4116:1: ( ( rule__Signal__Group_8_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4117:1: ( rule__Signal__Group_8_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_8_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4118:1: ( rule__Signal__Group_8_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4118:2: rule__Signal__Group_8_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__0_in_rule__Signal__Group_8__1__Impl8310);
            rule__Signal__Group_8_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8__1__Impl


    // $ANTLR start rule__Signal__Group_8_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4132:1: rule__Signal__Group_8_1__0 : rule__Signal__Group_8_1__0__Impl rule__Signal__Group_8_1__1 ;
    public final void rule__Signal__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4136:1: ( rule__Signal__Group_8_1__0__Impl rule__Signal__Group_8_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4137:2: rule__Signal__Group_8_1__0__Impl rule__Signal__Group_8_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__0__Impl_in_rule__Signal__Group_8_1__08344);
            rule__Signal__Group_8_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_8_1__1_in_rule__Signal__Group_8_1__08347);
            rule__Signal__Group_8_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__0


    // $ANTLR start rule__Signal__Group_8_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4144:1: rule__Signal__Group_8_1__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4148:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4149:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4149:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4150:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_8_1__0__Impl8375); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__0__Impl


    // $ANTLR start rule__Signal__Group_8_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4163:1: rule__Signal__Group_8_1__1 : rule__Signal__Group_8_1__1__Impl rule__Signal__Group_8_1__2 ;
    public final void rule__Signal__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4167:1: ( rule__Signal__Group_8_1__1__Impl rule__Signal__Group_8_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4168:2: rule__Signal__Group_8_1__1__Impl rule__Signal__Group_8_1__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__1__Impl_in_rule__Signal__Group_8_1__18406);
            rule__Signal__Group_8_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_8_1__2_in_rule__Signal__Group_8_1__18409);
            rule__Signal__Group_8_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__1


    // $ANTLR start rule__Signal__Group_8_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4175:1: rule__Signal__Group_8_1__1__Impl : ( ( rule__Signal__TypeAssignment_8_1_1 ) ) ;
    public final void rule__Signal__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4179:1: ( ( ( rule__Signal__TypeAssignment_8_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4180:1: ( ( rule__Signal__TypeAssignment_8_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4180:1: ( ( rule__Signal__TypeAssignment_8_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4181:1: ( rule__Signal__TypeAssignment_8_1_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_8_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4182:1: ( rule__Signal__TypeAssignment_8_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4182:2: rule__Signal__TypeAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_8_1_1_in_rule__Signal__Group_8_1__1__Impl8436);
            rule__Signal__TypeAssignment_8_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__1__Impl


    // $ANTLR start rule__Signal__Group_8_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4192:1: rule__Signal__Group_8_1__2 : rule__Signal__Group_8_1__2__Impl rule__Signal__Group_8_1__3 ;
    public final void rule__Signal__Group_8_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4196:1: ( rule__Signal__Group_8_1__2__Impl rule__Signal__Group_8_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4197:2: rule__Signal__Group_8_1__2__Impl rule__Signal__Group_8_1__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__2__Impl_in_rule__Signal__Group_8_1__28466);
            rule__Signal__Group_8_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_8_1__3_in_rule__Signal__Group_8_1__28469);
            rule__Signal__Group_8_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__2


    // $ANTLR start rule__Signal__Group_8_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4204:1: rule__Signal__Group_8_1__2__Impl : ( 'with' ) ;
    public final void rule__Signal__Group_8_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4208:1: ( ( 'with' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4209:1: ( 'with' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4209:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4210:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_8_1_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_8_1__2__Impl8497); 
             after(grammarAccess.getSignalAccess().getWithKeyword_8_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__2__Impl


    // $ANTLR start rule__Signal__Group_8_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4223:1: rule__Signal__Group_8_1__3 : rule__Signal__Group_8_1__3__Impl ;
    public final void rule__Signal__Group_8_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4227:1: ( rule__Signal__Group_8_1__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4228:2: rule__Signal__Group_8_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__3__Impl_in_rule__Signal__Group_8_1__38528);
            rule__Signal__Group_8_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__3


    // $ANTLR start rule__Signal__Group_8_1__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4234:1: rule__Signal__Group_8_1__3__Impl : ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) ) ;
    public final void rule__Signal__Group_8_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4238:1: ( ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4239:1: ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4239:1: ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4240:1: ( rule__Signal__CombineOperatorAssignment_8_1_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_8_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4241:1: ( rule__Signal__CombineOperatorAssignment_8_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4241:2: rule__Signal__CombineOperatorAssignment_8_1_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_8_1_3_in_rule__Signal__Group_8_1__3__Impl8555);
            rule__Signal__CombineOperatorAssignment_8_1_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getCombineOperatorAssignment_8_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_8_1__3__Impl


    // $ANTLR start rule__Signal__Group_9__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4259:1: rule__Signal__Group_9__0 : rule__Signal__Group_9__0__Impl rule__Signal__Group_9__1 ;
    public final void rule__Signal__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4263:1: ( rule__Signal__Group_9__0__Impl rule__Signal__Group_9__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4264:2: rule__Signal__Group_9__0__Impl rule__Signal__Group_9__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_9__0__Impl_in_rule__Signal__Group_9__08593);
            rule__Signal__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_9__1_in_rule__Signal__Group_9__08596);
            rule__Signal__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9__0


    // $ANTLR start rule__Signal__Group_9__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4271:1: rule__Signal__Group_9__0__Impl : ( ( rule__Signal__NameAssignment_9_0 ) ) ;
    public final void rule__Signal__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4275:1: ( ( ( rule__Signal__NameAssignment_9_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4276:1: ( ( rule__Signal__NameAssignment_9_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4276:1: ( ( rule__Signal__NameAssignment_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4277:1: ( rule__Signal__NameAssignment_9_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_9_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4278:1: ( rule__Signal__NameAssignment_9_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4278:2: rule__Signal__NameAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_9_0_in_rule__Signal__Group_9__0__Impl8623);
            rule__Signal__NameAssignment_9_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9__0__Impl


    // $ANTLR start rule__Signal__Group_9__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4288:1: rule__Signal__Group_9__1 : rule__Signal__Group_9__1__Impl ;
    public final void rule__Signal__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4292:1: ( rule__Signal__Group_9__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4293:2: rule__Signal__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_9__1__Impl_in_rule__Signal__Group_9__18653);
            rule__Signal__Group_9__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9__1


    // $ANTLR start rule__Signal__Group_9__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4299:1: rule__Signal__Group_9__1__Impl : ( ( rule__Signal__Group_9_1__0 ) ) ;
    public final void rule__Signal__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4303:1: ( ( ( rule__Signal__Group_9_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4304:1: ( ( rule__Signal__Group_9_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4304:1: ( ( rule__Signal__Group_9_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4305:1: ( rule__Signal__Group_9_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_9_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4306:1: ( rule__Signal__Group_9_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4306:2: rule__Signal__Group_9_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__0_in_rule__Signal__Group_9__1__Impl8680);
            rule__Signal__Group_9_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9__1__Impl


    // $ANTLR start rule__Signal__Group_9_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4320:1: rule__Signal__Group_9_1__0 : rule__Signal__Group_9_1__0__Impl rule__Signal__Group_9_1__1 ;
    public final void rule__Signal__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4324:1: ( rule__Signal__Group_9_1__0__Impl rule__Signal__Group_9_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4325:2: rule__Signal__Group_9_1__0__Impl rule__Signal__Group_9_1__1
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__0__Impl_in_rule__Signal__Group_9_1__08714);
            rule__Signal__Group_9_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_9_1__1_in_rule__Signal__Group_9_1__08717);
            rule__Signal__Group_9_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__0


    // $ANTLR start rule__Signal__Group_9_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4332:1: rule__Signal__Group_9_1__0__Impl : ( 'combine' ) ;
    public final void rule__Signal__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4336:1: ( ( 'combine' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4337:1: ( 'combine' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4337:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4338:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_9_1__0__Impl8745); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__0__Impl


    // $ANTLR start rule__Signal__Group_9_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4351:1: rule__Signal__Group_9_1__1 : rule__Signal__Group_9_1__1__Impl rule__Signal__Group_9_1__2 ;
    public final void rule__Signal__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4355:1: ( rule__Signal__Group_9_1__1__Impl rule__Signal__Group_9_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4356:2: rule__Signal__Group_9_1__1__Impl rule__Signal__Group_9_1__2
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__1__Impl_in_rule__Signal__Group_9_1__18776);
            rule__Signal__Group_9_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_9_1__2_in_rule__Signal__Group_9_1__18779);
            rule__Signal__Group_9_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__1


    // $ANTLR start rule__Signal__Group_9_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4363:1: rule__Signal__Group_9_1__1__Impl : ( ( rule__Signal__HostTypeAssignment_9_1_1 ) ) ;
    public final void rule__Signal__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4367:1: ( ( ( rule__Signal__HostTypeAssignment_9_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4368:1: ( ( rule__Signal__HostTypeAssignment_9_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4368:1: ( ( rule__Signal__HostTypeAssignment_9_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4369:1: ( rule__Signal__HostTypeAssignment_9_1_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_9_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4370:1: ( rule__Signal__HostTypeAssignment_9_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4370:2: rule__Signal__HostTypeAssignment_9_1_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_9_1_1_in_rule__Signal__Group_9_1__1__Impl8806);
            rule__Signal__HostTypeAssignment_9_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__1__Impl


    // $ANTLR start rule__Signal__Group_9_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4380:1: rule__Signal__Group_9_1__2 : rule__Signal__Group_9_1__2__Impl rule__Signal__Group_9_1__3 ;
    public final void rule__Signal__Group_9_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4384:1: ( rule__Signal__Group_9_1__2__Impl rule__Signal__Group_9_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4385:2: rule__Signal__Group_9_1__2__Impl rule__Signal__Group_9_1__3
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__2__Impl_in_rule__Signal__Group_9_1__28836);
            rule__Signal__Group_9_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Signal__Group_9_1__3_in_rule__Signal__Group_9_1__28839);
            rule__Signal__Group_9_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__2


    // $ANTLR start rule__Signal__Group_9_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4392:1: rule__Signal__Group_9_1__2__Impl : ( 'with' ) ;
    public final void rule__Signal__Group_9_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4396:1: ( ( 'with' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4397:1: ( 'with' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4397:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4398:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_9_1_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_9_1__2__Impl8867); 
             after(grammarAccess.getSignalAccess().getWithKeyword_9_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__2__Impl


    // $ANTLR start rule__Signal__Group_9_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4411:1: rule__Signal__Group_9_1__3 : rule__Signal__Group_9_1__3__Impl ;
    public final void rule__Signal__Group_9_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4415:1: ( rule__Signal__Group_9_1__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4416:2: rule__Signal__Group_9_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__3__Impl_in_rule__Signal__Group_9_1__38898);
            rule__Signal__Group_9_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__3


    // $ANTLR start rule__Signal__Group_9_1__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4422:1: rule__Signal__Group_9_1__3__Impl : ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) ) ;
    public final void rule__Signal__Group_9_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4426:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4427:1: ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4427:1: ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4428:1: ( rule__Signal__HostCombineOperatorAssignment_9_1_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_9_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4429:1: ( rule__Signal__HostCombineOperatorAssignment_9_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4429:2: rule__Signal__HostCombineOperatorAssignment_9_1_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_9_1_3_in_rule__Signal__Group_9_1__3__Impl8925);
            rule__Signal__HostCombineOperatorAssignment_9_1_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_9_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_9_1__3__Impl


    // $ANTLR start rule__Variable__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4447:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4451:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4452:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_1__0__Impl_in_rule__Variable__Group_1__08963);
            rule__Variable__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__08966);
            rule__Variable__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__0


    // $ANTLR start rule__Variable__Group_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4459:1: rule__Variable__Group_1__0__Impl : ( ( rule__Variable__NameAssignment_1_0 ) ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4463:1: ( ( ( rule__Variable__NameAssignment_1_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4464:1: ( ( rule__Variable__NameAssignment_1_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4464:1: ( ( rule__Variable__NameAssignment_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4465:1: ( rule__Variable__NameAssignment_1_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4466:1: ( rule__Variable__NameAssignment_1_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4466:2: rule__Variable__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_0_in_rule__Variable__Group_1__0__Impl8993);
            rule__Variable__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__0__Impl


    // $ANTLR start rule__Variable__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4476:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2 ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4480:1: ( rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4481:2: rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2
            {
            pushFollow(FOLLOW_rule__Variable__Group_1__1__Impl_in_rule__Variable__Group_1__19023);
            rule__Variable__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_1__2_in_rule__Variable__Group_1__19026);
            rule__Variable__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__1


    // $ANTLR start rule__Variable__Group_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4488:1: rule__Variable__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4492:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4493:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4493:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4494:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_1__1__Impl9054); 
             after(grammarAccess.getVariableAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__1__Impl


    // $ANTLR start rule__Variable__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4507:1: rule__Variable__Group_1__2 : rule__Variable__Group_1__2__Impl ;
    public final void rule__Variable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4511:1: ( rule__Variable__Group_1__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4512:2: rule__Variable__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_1__2__Impl_in_rule__Variable__Group_1__29085);
            rule__Variable__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__2


    // $ANTLR start rule__Variable__Group_1__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4518:1: rule__Variable__Group_1__2__Impl : ( ( rule__Variable__TypeAssignment_1_2 ) ) ;
    public final void rule__Variable__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4522:1: ( ( ( rule__Variable__TypeAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4523:1: ( ( rule__Variable__TypeAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4523:1: ( ( rule__Variable__TypeAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4524:1: ( rule__Variable__TypeAssignment_1_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4525:1: ( rule__Variable__TypeAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4525:2: rule__Variable__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_1_2_in_rule__Variable__Group_1__2__Impl9112);
            rule__Variable__TypeAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_1__2__Impl


    // $ANTLR start rule__Variable__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4541:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4545:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4546:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__09148);
            rule__Variable__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__09151);
            rule__Variable__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2__0


    // $ANTLR start rule__Variable__Group_2__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4553:1: rule__Variable__Group_2__0__Impl : ( ( rule__Variable__NameAssignment_2_0 ) ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4557:1: ( ( ( rule__Variable__NameAssignment_2_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4558:1: ( ( rule__Variable__NameAssignment_2_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4558:1: ( ( rule__Variable__NameAssignment_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4559:1: ( rule__Variable__NameAssignment_2_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4560:1: ( rule__Variable__NameAssignment_2_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4560:2: rule__Variable__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_2_0_in_rule__Variable__Group_2__0__Impl9178);
            rule__Variable__NameAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2__0__Impl


    // $ANTLR start rule__Variable__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4570:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4574:1: ( rule__Variable__Group_2__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4575:2: rule__Variable__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__19208);
            rule__Variable__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2__1


    // $ANTLR start rule__Variable__Group_2__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4581:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__Group_2_1__0 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4585:1: ( ( ( rule__Variable__Group_2_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4586:1: ( ( rule__Variable__Group_2_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4586:1: ( ( rule__Variable__Group_2_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4587:1: ( rule__Variable__Group_2_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4588:1: ( rule__Variable__Group_2_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4588:2: rule__Variable__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_2_1__0_in_rule__Variable__Group_2__1__Impl9235);
            rule__Variable__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2__1__Impl


    // $ANTLR start rule__Variable__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4602:1: rule__Variable__Group_2_1__0 : rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1 ;
    public final void rule__Variable__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4606:1: ( rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4607:2: rule__Variable__Group_2_1__0__Impl rule__Variable__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_2_1__0__Impl_in_rule__Variable__Group_2_1__09269);
            rule__Variable__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_2_1__1_in_rule__Variable__Group_2_1__09272);
            rule__Variable__Group_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2_1__0


    // $ANTLR start rule__Variable__Group_2_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4614:1: rule__Variable__Group_2_1__0__Impl : ( ':=' ) ;
    public final void rule__Variable__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4618:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4619:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4619:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4620:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_2_1__0__Impl9300); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2_1__0__Impl


    // $ANTLR start rule__Variable__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4633:1: rule__Variable__Group_2_1__1 : rule__Variable__Group_2_1__1__Impl ;
    public final void rule__Variable__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4637:1: ( rule__Variable__Group_2_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4638:2: rule__Variable__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_2_1__1__Impl_in_rule__Variable__Group_2_1__19331);
            rule__Variable__Group_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2_1__1


    // $ANTLR start rule__Variable__Group_2_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4644:1: rule__Variable__Group_2_1__1__Impl : ( ( rule__Variable__InitialValueAssignment_2_1_1 ) ) ;
    public final void rule__Variable__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4648:1: ( ( ( rule__Variable__InitialValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4649:1: ( ( rule__Variable__InitialValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4649:1: ( ( rule__Variable__InitialValueAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4650:1: ( rule__Variable__InitialValueAssignment_2_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4651:1: ( rule__Variable__InitialValueAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4651:2: rule__Variable__InitialValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_2_1_1_in_rule__Variable__Group_2_1__1__Impl9358);
            rule__Variable__InitialValueAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_2_1__1__Impl


    // $ANTLR start rule__Variable__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4665:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4669:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4670:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_3__0__Impl_in_rule__Variable__Group_3__09392);
            rule__Variable__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__09395);
            rule__Variable__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__0


    // $ANTLR start rule__Variable__Group_3__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4677:1: rule__Variable__Group_3__0__Impl : ( ( rule__Variable__NameAssignment_3_0 ) ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4681:1: ( ( ( rule__Variable__NameAssignment_3_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4682:1: ( ( rule__Variable__NameAssignment_3_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4682:1: ( ( rule__Variable__NameAssignment_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4683:1: ( rule__Variable__NameAssignment_3_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4684:1: ( rule__Variable__NameAssignment_3_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4684:2: rule__Variable__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_3_0_in_rule__Variable__Group_3__0__Impl9422);
            rule__Variable__NameAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__0__Impl


    // $ANTLR start rule__Variable__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4694:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2 ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4698:1: ( rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4699:2: rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2
            {
            pushFollow(FOLLOW_rule__Variable__Group_3__1__Impl_in_rule__Variable__Group_3__19452);
            rule__Variable__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_3__2_in_rule__Variable__Group_3__19455);
            rule__Variable__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__1


    // $ANTLR start rule__Variable__Group_3__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4706:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__Group_3_1__0 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4710:1: ( ( ( rule__Variable__Group_3_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4711:1: ( ( rule__Variable__Group_3_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4711:1: ( ( rule__Variable__Group_3_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4712:1: ( rule__Variable__Group_3_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4713:1: ( rule__Variable__Group_3_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4713:2: rule__Variable__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_3_1__0_in_rule__Variable__Group_3__1__Impl9482);
            rule__Variable__Group_3_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__1__Impl


    // $ANTLR start rule__Variable__Group_3__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4723:1: rule__Variable__Group_3__2 : rule__Variable__Group_3__2__Impl rule__Variable__Group_3__3 ;
    public final void rule__Variable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4727:1: ( rule__Variable__Group_3__2__Impl rule__Variable__Group_3__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4728:2: rule__Variable__Group_3__2__Impl rule__Variable__Group_3__3
            {
            pushFollow(FOLLOW_rule__Variable__Group_3__2__Impl_in_rule__Variable__Group_3__29512);
            rule__Variable__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_3__3_in_rule__Variable__Group_3__29515);
            rule__Variable__Group_3__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__2


    // $ANTLR start rule__Variable__Group_3__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4735:1: rule__Variable__Group_3__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4739:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4740:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4740:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4741:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_3_2()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_3__2__Impl9543); 
             after(grammarAccess.getVariableAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__2__Impl


    // $ANTLR start rule__Variable__Group_3__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4754:1: rule__Variable__Group_3__3 : rule__Variable__Group_3__3__Impl ;
    public final void rule__Variable__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4758:1: ( rule__Variable__Group_3__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4759:2: rule__Variable__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_3__3__Impl_in_rule__Variable__Group_3__39574);
            rule__Variable__Group_3__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__3


    // $ANTLR start rule__Variable__Group_3__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4765:1: rule__Variable__Group_3__3__Impl : ( ( rule__Variable__TypeAssignment_3_3 ) ) ;
    public final void rule__Variable__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4769:1: ( ( ( rule__Variable__TypeAssignment_3_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4770:1: ( ( rule__Variable__TypeAssignment_3_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4770:1: ( ( rule__Variable__TypeAssignment_3_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4771:1: ( rule__Variable__TypeAssignment_3_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4772:1: ( rule__Variable__TypeAssignment_3_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4772:2: rule__Variable__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_3_3_in_rule__Variable__Group_3__3__Impl9601);
            rule__Variable__TypeAssignment_3_3();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3__3__Impl


    // $ANTLR start rule__Variable__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4790:1: rule__Variable__Group_3_1__0 : rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1 ;
    public final void rule__Variable__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4794:1: ( rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4795:2: rule__Variable__Group_3_1__0__Impl rule__Variable__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_3_1__0__Impl_in_rule__Variable__Group_3_1__09639);
            rule__Variable__Group_3_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_3_1__1_in_rule__Variable__Group_3_1__09642);
            rule__Variable__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3_1__0


    // $ANTLR start rule__Variable__Group_3_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4802:1: rule__Variable__Group_3_1__0__Impl : ( ':=' ) ;
    public final void rule__Variable__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4806:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4807:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4807:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4808:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_3_1__0__Impl9670); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3_1__0__Impl


    // $ANTLR start rule__Variable__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4821:1: rule__Variable__Group_3_1__1 : rule__Variable__Group_3_1__1__Impl ;
    public final void rule__Variable__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4825:1: ( rule__Variable__Group_3_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4826:2: rule__Variable__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_3_1__1__Impl_in_rule__Variable__Group_3_1__19701);
            rule__Variable__Group_3_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3_1__1


    // $ANTLR start rule__Variable__Group_3_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4832:1: rule__Variable__Group_3_1__1__Impl : ( ( rule__Variable__InitialValueAssignment_3_1_1 ) ) ;
    public final void rule__Variable__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4836:1: ( ( ( rule__Variable__InitialValueAssignment_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4837:1: ( ( rule__Variable__InitialValueAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4837:1: ( ( rule__Variable__InitialValueAssignment_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4838:1: ( rule__Variable__InitialValueAssignment_3_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_3_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4839:1: ( rule__Variable__InitialValueAssignment_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4839:2: rule__Variable__InitialValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_3_1_1_in_rule__Variable__Group_3_1__1__Impl9728);
            rule__Variable__InitialValueAssignment_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_3_1__1__Impl


    // $ANTLR start rule__Variable__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4853:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4857:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4858:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_4__0__Impl_in_rule__Variable__Group_4__09762);
            rule__Variable__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__09765);
            rule__Variable__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__0


    // $ANTLR start rule__Variable__Group_4__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4865:1: rule__Variable__Group_4__0__Impl : ( ( rule__Variable__NameAssignment_4_0 ) ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4869:1: ( ( ( rule__Variable__NameAssignment_4_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4870:1: ( ( rule__Variable__NameAssignment_4_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4870:1: ( ( rule__Variable__NameAssignment_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4871:1: ( rule__Variable__NameAssignment_4_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4872:1: ( rule__Variable__NameAssignment_4_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4872:2: rule__Variable__NameAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_4_0_in_rule__Variable__Group_4__0__Impl9792);
            rule__Variable__NameAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__0__Impl


    // $ANTLR start rule__Variable__Group_4__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4882:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2 ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4886:1: ( rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4887:2: rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2
            {
            pushFollow(FOLLOW_rule__Variable__Group_4__1__Impl_in_rule__Variable__Group_4__19822);
            rule__Variable__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_4__2_in_rule__Variable__Group_4__19825);
            rule__Variable__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__1


    // $ANTLR start rule__Variable__Group_4__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4894:1: rule__Variable__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4898:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4899:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4899:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4900:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_4_1()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_4__1__Impl9853); 
             after(grammarAccess.getVariableAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__1__Impl


    // $ANTLR start rule__Variable__Group_4__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4913:1: rule__Variable__Group_4__2 : rule__Variable__Group_4__2__Impl ;
    public final void rule__Variable__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4917:1: ( rule__Variable__Group_4__2__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4918:2: rule__Variable__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_4__2__Impl_in_rule__Variable__Group_4__29884);
            rule__Variable__Group_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__2


    // $ANTLR start rule__Variable__Group_4__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4924:1: rule__Variable__Group_4__2__Impl : ( ( rule__Variable__HostTypeAssignment_4_2 ) ) ;
    public final void rule__Variable__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4928:1: ( ( ( rule__Variable__HostTypeAssignment_4_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4929:1: ( ( rule__Variable__HostTypeAssignment_4_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4929:1: ( ( rule__Variable__HostTypeAssignment_4_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4930:1: ( rule__Variable__HostTypeAssignment_4_2 )
            {
             before(grammarAccess.getVariableAccess().getHostTypeAssignment_4_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4931:1: ( rule__Variable__HostTypeAssignment_4_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4931:2: rule__Variable__HostTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Variable__HostTypeAssignment_4_2_in_rule__Variable__Group_4__2__Impl9911);
            rule__Variable__HostTypeAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getHostTypeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_4__2__Impl


    // $ANTLR start rule__Variable__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4947:1: rule__Variable__Group_5__0 : rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 ;
    public final void rule__Variable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4951:1: ( rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4952:2: rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_5__0__Impl_in_rule__Variable__Group_5__09947);
            rule__Variable__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_5__1_in_rule__Variable__Group_5__09950);
            rule__Variable__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__0


    // $ANTLR start rule__Variable__Group_5__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4959:1: rule__Variable__Group_5__0__Impl : ( ( rule__Variable__NameAssignment_5_0 ) ) ;
    public final void rule__Variable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4963:1: ( ( ( rule__Variable__NameAssignment_5_0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4964:1: ( ( rule__Variable__NameAssignment_5_0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4964:1: ( ( rule__Variable__NameAssignment_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4965:1: ( rule__Variable__NameAssignment_5_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4966:1: ( rule__Variable__NameAssignment_5_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4966:2: rule__Variable__NameAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_5_0_in_rule__Variable__Group_5__0__Impl9977);
            rule__Variable__NameAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__0__Impl


    // $ANTLR start rule__Variable__Group_5__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4976:1: rule__Variable__Group_5__1 : rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2 ;
    public final void rule__Variable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4980:1: ( rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4981:2: rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2
            {
            pushFollow(FOLLOW_rule__Variable__Group_5__1__Impl_in_rule__Variable__Group_5__110007);
            rule__Variable__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_5__2_in_rule__Variable__Group_5__110010);
            rule__Variable__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__1


    // $ANTLR start rule__Variable__Group_5__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4988:1: rule__Variable__Group_5__1__Impl : ( ( rule__Variable__Group_5_1__0 ) ) ;
    public final void rule__Variable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4992:1: ( ( ( rule__Variable__Group_5_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4993:1: ( ( rule__Variable__Group_5_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4993:1: ( ( rule__Variable__Group_5_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4994:1: ( rule__Variable__Group_5_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_5_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4995:1: ( rule__Variable__Group_5_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4995:2: rule__Variable__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_5_1__0_in_rule__Variable__Group_5__1__Impl10037);
            rule__Variable__Group_5_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__1__Impl


    // $ANTLR start rule__Variable__Group_5__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5005:1: rule__Variable__Group_5__2 : rule__Variable__Group_5__2__Impl rule__Variable__Group_5__3 ;
    public final void rule__Variable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5009:1: ( rule__Variable__Group_5__2__Impl rule__Variable__Group_5__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5010:2: rule__Variable__Group_5__2__Impl rule__Variable__Group_5__3
            {
            pushFollow(FOLLOW_rule__Variable__Group_5__2__Impl_in_rule__Variable__Group_5__210067);
            rule__Variable__Group_5__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_5__3_in_rule__Variable__Group_5__210070);
            rule__Variable__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__2


    // $ANTLR start rule__Variable__Group_5__2__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5017:1: rule__Variable__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5021:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5022:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5022:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5023:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_5_2()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_5__2__Impl10098); 
             after(grammarAccess.getVariableAccess().getColonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__2__Impl


    // $ANTLR start rule__Variable__Group_5__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5036:1: rule__Variable__Group_5__3 : rule__Variable__Group_5__3__Impl ;
    public final void rule__Variable__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5040:1: ( rule__Variable__Group_5__3__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5041:2: rule__Variable__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_5__3__Impl_in_rule__Variable__Group_5__310129);
            rule__Variable__Group_5__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__3


    // $ANTLR start rule__Variable__Group_5__3__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5047:1: rule__Variable__Group_5__3__Impl : ( ( rule__Variable__HostTypeAssignment_5_3 ) ) ;
    public final void rule__Variable__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5051:1: ( ( ( rule__Variable__HostTypeAssignment_5_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5052:1: ( ( rule__Variable__HostTypeAssignment_5_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5052:1: ( ( rule__Variable__HostTypeAssignment_5_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5053:1: ( rule__Variable__HostTypeAssignment_5_3 )
            {
             before(grammarAccess.getVariableAccess().getHostTypeAssignment_5_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5054:1: ( rule__Variable__HostTypeAssignment_5_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5054:2: rule__Variable__HostTypeAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Variable__HostTypeAssignment_5_3_in_rule__Variable__Group_5__3__Impl10156);
            rule__Variable__HostTypeAssignment_5_3();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getHostTypeAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5__3__Impl


    // $ANTLR start rule__Variable__Group_5_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5072:1: rule__Variable__Group_5_1__0 : rule__Variable__Group_5_1__0__Impl rule__Variable__Group_5_1__1 ;
    public final void rule__Variable__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5076:1: ( rule__Variable__Group_5_1__0__Impl rule__Variable__Group_5_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5077:2: rule__Variable__Group_5_1__0__Impl rule__Variable__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Variable__Group_5_1__0__Impl_in_rule__Variable__Group_5_1__010194);
            rule__Variable__Group_5_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Variable__Group_5_1__1_in_rule__Variable__Group_5_1__010197);
            rule__Variable__Group_5_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5_1__0


    // $ANTLR start rule__Variable__Group_5_1__0__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5084:1: rule__Variable__Group_5_1__0__Impl : ( ':=' ) ;
    public final void rule__Variable__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5088:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5089:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5089:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5090:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_5_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_5_1__0__Impl10225); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5_1__0__Impl


    // $ANTLR start rule__Variable__Group_5_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5103:1: rule__Variable__Group_5_1__1 : rule__Variable__Group_5_1__1__Impl ;
    public final void rule__Variable__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5107:1: ( rule__Variable__Group_5_1__1__Impl )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5108:2: rule__Variable__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group_5_1__1__Impl_in_rule__Variable__Group_5_1__110256);
            rule__Variable__Group_5_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5_1__1


    // $ANTLR start rule__Variable__Group_5_1__1__Impl
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5114:1: rule__Variable__Group_5_1__1__Impl : ( ( rule__Variable__InitialValueAssignment_5_1_1 ) ) ;
    public final void rule__Variable__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5118:1: ( ( ( rule__Variable__InitialValueAssignment_5_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5119:1: ( ( rule__Variable__InitialValueAssignment_5_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5119:1: ( ( rule__Variable__InitialValueAssignment_5_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5120:1: ( rule__Variable__InitialValueAssignment_5_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_5_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5121:1: ( rule__Variable__InitialValueAssignment_5_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5121:2: rule__Variable__InitialValueAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_5_1_1_in_rule__Variable__Group_5_1__1__Impl10283);
            rule__Variable__InitialValueAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group_5_1__1__Impl


    // $ANTLR start rule__StateExtend__RegionsAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5136:1: rule__StateExtend__RegionsAssignment_0 : ( ruleRegionSignalDec ) ;
    public final void rule__StateExtend__RegionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5140:1: ( ( ruleRegionSignalDec ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5141:1: ( ruleRegionSignalDec )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5141:1: ( ruleRegionSignalDec )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5142:1: ruleRegionSignalDec
            {
             before(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_010322);
            ruleRegionSignalDec();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__RegionsAssignment_0


    // $ANTLR start rule__StateExtend__InOutputSignalsAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5151:1: rule__StateExtend__InOutputSignalsAssignment_1_2 : ( ruleInOutputSignals ) ;
    public final void rule__StateExtend__InOutputSignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5155:1: ( ( ruleInOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5156:1: ( ruleInOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5156:1: ( ruleInOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5157:1: ruleInOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_1_210353);
            ruleInOutputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__InOutputSignalsAssignment_1_2


    // $ANTLR start rule__StateExtend__OutputSignalsAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5166:1: rule__StateExtend__OutputSignalsAssignment_2_1 : ( ruleOutputSignals ) ;
    public final void rule__StateExtend__OutputSignalsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5170:1: ( ( ruleOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5171:1: ( ruleOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5171:1: ( ruleOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5172:1: ruleOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_2_110384);
            ruleOutputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__OutputSignalsAssignment_2_1


    // $ANTLR start rule__StateExtend__InputSignalsAssignment_3_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5181:1: rule__StateExtend__InputSignalsAssignment_3_1 : ( ruleInputSignals ) ;
    public final void rule__StateExtend__InputSignalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5185:1: ( ( ruleInputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5186:1: ( ruleInputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5186:1: ( ruleInputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5187:1: ruleInputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_3_110415);
            ruleInputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__InputSignalsAssignment_3_1


    // $ANTLR start rule__StateExtend__SignalsAssignment_4_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5196:1: rule__StateExtend__SignalsAssignment_4_1 : ( ruleSignals ) ;
    public final void rule__StateExtend__SignalsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5200:1: ( ( ruleSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5201:1: ( ruleSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5201:1: ( ruleSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5202:1: ruleSignals
            {
             before(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_4_110446);
            ruleSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__SignalsAssignment_4_1


    // $ANTLR start rule__StateExtend__VariableAssignment_5_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5211:1: rule__StateExtend__VariableAssignment_5_1 : ( ruleVariables ) ;
    public final void rule__StateExtend__VariableAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5215:1: ( ( ruleVariables ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5216:1: ( ruleVariables )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5216:1: ( ruleVariables )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5217:1: ruleVariables
            {
             before(grammarAccess.getStateExtendAccess().getVariableVariablesParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleVariables_in_rule__StateExtend__VariableAssignment_5_110477);
            ruleVariables();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getVariableVariablesParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__VariableAssignment_5_1


    // $ANTLR start rule__RegionSignalDec__RegionAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5226:1: rule__RegionSignalDec__RegionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RegionSignalDec__RegionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5230:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5231:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5231:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5232:1: ( RULE_ID )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5233:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5234:1: RULE_ID
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_010512); 
             after(grammarAccess.getRegionSignalDecAccess().getRegionRegionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__RegionAssignment_0


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_2_0_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5245:1: rule__RegionSignalDec__VarsAssignment_2_0_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5249:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5250:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5250:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5251:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_110547);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_2_0_1


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_2_0_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5260:1: rule__RegionSignalDec__VarsAssignment_2_0_2_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5264:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5265:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5265:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5266:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_2_110578);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_2_0_2_1


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_2_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5275:1: rule__RegionSignalDec__SignalsAssignment_2_1_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5279:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5280:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5280:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5281:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_110609);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_2_1_1


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_2_1_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5290:1: rule__RegionSignalDec__SignalsAssignment_2_1_2_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5294:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5295:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5295:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5296:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_2_110640);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_2_1_2_1


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_3_0_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5305:1: rule__RegionSignalDec__VarsAssignment_3_0_2 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5309:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5310:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5310:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5311:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_210671);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_3_0_2


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_3_0_3_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5320:1: rule__RegionSignalDec__VarsAssignment_3_0_3_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5324:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5325:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5325:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5326:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_3_110702);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_3_0_3_1


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_3_1_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5335:1: rule__RegionSignalDec__SignalsAssignment_3_1_2 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5339:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5340:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5340:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5341:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_210733);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_3_1_2


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_3_1_3_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5350:1: rule__RegionSignalDec__SignalsAssignment_3_1_3_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5354:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5355:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5355:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5356:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_3_110764);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_3_1_3_1


    // $ANTLR start rule__Variables__VarsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5365:1: rule__Variables__VarsAssignment_0_0 : ( ruleVariable ) ;
    public final void rule__Variables__VarsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5369:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5370:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5370:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5371:1: ruleVariable
            {
             before(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Variables__VarsAssignment_0_010795);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__VarsAssignment_0_0


    // $ANTLR start rule__Variables__VarsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5380:1: rule__Variables__VarsAssignment_0_1_1 : ( ruleVariable ) ;
    public final void rule__Variables__VarsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5384:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5385:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5385:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5386:1: ruleVariable
            {
             before(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Variables__VarsAssignment_0_1_110826);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariablesAccess().getVarsVariableParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variables__VarsAssignment_0_1_1


    // $ANTLR start rule__Signals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5395:1: rule__Signals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5399:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5400:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5400:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5401:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_010857);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__SignalsAssignment_0_0


    // $ANTLR start rule__Signals__SignalsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5410:1: rule__Signals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5414:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5415:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5415:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5416:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_110888);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signals__SignalsAssignment_0_1_1


    // $ANTLR start rule__InputSignals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5425:1: rule__InputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5429:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5430:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5430:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5431:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_010919);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__SignalsAssignment_0_0


    // $ANTLR start rule__InputSignals__SignalsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5440:1: rule__InputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5444:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5445:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5445:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5446:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_110950);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InputSignals__SignalsAssignment_0_1_1


    // $ANTLR start rule__OutputSignals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5455:1: rule__OutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5459:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5460:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5460:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5461:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_010981);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__SignalsAssignment_0_0


    // $ANTLR start rule__OutputSignals__SignalsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5470:1: rule__OutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5474:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5475:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5475:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5476:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_111012);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OutputSignals__SignalsAssignment_0_1_1


    // $ANTLR start rule__InOutputSignals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5485:1: rule__InOutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5489:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5490:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5490:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5491:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_011043);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__SignalsAssignment_0_0


    // $ANTLR start rule__InOutputSignals__SignalsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5500:1: rule__InOutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5504:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5505:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5505:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5506:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_111074);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InOutputSignals__SignalsAssignment_0_1_1


    // $ANTLR start rule__Signal__NameAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5515:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5519:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5520:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5520:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5521:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011105); 
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


    // $ANTLR start rule__Signal__NameAssignment_1_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5530:1: rule__Signal__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5534:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5535:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5535:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5536:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_011136); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_1_0


    // $ANTLR start rule__Signal__TypeAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5545:1: rule__Signal__TypeAssignment_1_2 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5549:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5550:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5550:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5551:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_1_211167);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_1_2


    // $ANTLR start rule__Signal__NameAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5560:1: rule__Signal__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5564:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5565:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5565:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5566:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_011198); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_2_0


    // $ANTLR start rule__Signal__InitialValueAssignment_2_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5575:1: rule__Signal__InitialValueAssignment_2_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5579:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5580:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5580:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5581:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_2_1_111229); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_2_1_1


    // $ANTLR start rule__Signal__NameAssignment_3_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5590:1: rule__Signal__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5594:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5595:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5595:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5596:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_011260); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_3_0


    // $ANTLR start rule__Signal__InitialValueAssignment_3_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5605:1: rule__Signal__InitialValueAssignment_3_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5609:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5610:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5610:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5611:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_3_1_111291); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_3_1_1


    // $ANTLR start rule__Signal__TypeAssignment_3_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5620:1: rule__Signal__TypeAssignment_3_3 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5624:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5625:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5625:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5626:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_311322);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_3_3


    // $ANTLR start rule__Signal__NameAssignment_4_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5635:1: rule__Signal__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5639:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5640:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5640:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5641:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_011353); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_4_0


    // $ANTLR start rule__Signal__InitialValueAssignment_4_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5650:1: rule__Signal__InitialValueAssignment_4_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5654:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5655:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5655:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5656:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_4_1_111384); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_4_1_1


    // $ANTLR start rule__Signal__TypeAssignment_4_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5665:1: rule__Signal__TypeAssignment_4_2_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5669:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5670:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5670:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5671:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_4_2_111415);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_4_2_1


    // $ANTLR start rule__Signal__CombineOperatorAssignment_4_2_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5680:1: rule__Signal__CombineOperatorAssignment_4_2_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5684:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5685:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5685:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5686:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_4_2_311446);
            ruleCombineOperator();
            _fsp--;

             after(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__CombineOperatorAssignment_4_2_3


    // $ANTLR start rule__Signal__NameAssignment_5_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5695:1: rule__Signal__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5699:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5700:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5700:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5701:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_011477); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_5_0


    // $ANTLR start rule__Signal__HostTypeAssignment_5_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5710:1: rule__Signal__HostTypeAssignment_5_2 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5714:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5715:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5715:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5716:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_5_211508); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_5_2


    // $ANTLR start rule__Signal__NameAssignment_6_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5725:1: rule__Signal__NameAssignment_6_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5729:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5730:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5730:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5731:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_011539); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_6_0


    // $ANTLR start rule__Signal__InitialValueAssignment_6_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5740:1: rule__Signal__InitialValueAssignment_6_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5744:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5745:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5745:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5746:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_6_1_111570); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_6_1_1


    // $ANTLR start rule__Signal__HostTypeAssignment_6_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5755:1: rule__Signal__HostTypeAssignment_6_3 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostTypeAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5759:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5760:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5760:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5761:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_6_3_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_6_311601); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_6_3


    // $ANTLR start rule__Signal__NameAssignment_7_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5770:1: rule__Signal__NameAssignment_7_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5774:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5775:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5775:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5776:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_011632); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_7_0


    // $ANTLR start rule__Signal__InitialValueAssignment_7_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5785:1: rule__Signal__InitialValueAssignment_7_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5789:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5790:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5790:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5791:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_7_1_111663); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_7_1_1


    // $ANTLR start rule__Signal__HostTypeAssignment_7_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5800:1: rule__Signal__HostTypeAssignment_7_2_1 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostTypeAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5804:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5805:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5805:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5806:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_7_2_1_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_7_2_111694); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_7_2_1


    // $ANTLR start rule__Signal__HostCombineOperatorAssignment_7_2_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5815:1: rule__Signal__HostCombineOperatorAssignment_7_2_3 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_7_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5819:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5820:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5820:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5821:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_7_2_3_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostCombineOperatorAssignment_7_2_311725); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_7_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostCombineOperatorAssignment_7_2_3


    // $ANTLR start rule__Signal__NameAssignment_8_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5830:1: rule__Signal__NameAssignment_8_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5834:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5835:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5835:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5836:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_8_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_8_011756); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_8_0


    // $ANTLR start rule__Signal__TypeAssignment_8_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5845:1: rule__Signal__TypeAssignment_8_1_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5849:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5850:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5850:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5851:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_8_1_111787);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_8_1_1


    // $ANTLR start rule__Signal__CombineOperatorAssignment_8_1_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5860:1: rule__Signal__CombineOperatorAssignment_8_1_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_8_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5864:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5865:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5865:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5866:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_8_1_311818);
            ruleCombineOperator();
            _fsp--;

             after(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__CombineOperatorAssignment_8_1_3


    // $ANTLR start rule__Signal__NameAssignment_9_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5875:1: rule__Signal__NameAssignment_9_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5879:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5880:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5880:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5881:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_9_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_9_011849); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__NameAssignment_9_0


    // $ANTLR start rule__Signal__HostTypeAssignment_9_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5890:1: rule__Signal__HostTypeAssignment_9_1_1 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostTypeAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5894:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5895:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5895:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5896:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_9_1_1_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_9_1_111880); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_STerminalRuleCall_9_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_9_1_1


    // $ANTLR start rule__Signal__HostCombineOperatorAssignment_9_1_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5905:1: rule__Signal__HostCombineOperatorAssignment_9_1_3 : ( RULE_STRING_S ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_9_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5909:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5910:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5910:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5911:1: RULE_STRING_S
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_9_1_3_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Signal__HostCombineOperatorAssignment_9_1_311911); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_STerminalRuleCall_9_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostCombineOperatorAssignment_9_1_3


    // $ANTLR start rule__Variable__NameAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5920:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5924:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5925:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5925:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5926:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_011942); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_0


    // $ANTLR start rule__Variable__NameAssignment_1_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5935:1: rule__Variable__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5939:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5940:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5940:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5941:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1_011973); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_1_0


    // $ANTLR start rule__Variable__TypeAssignment_1_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5950:1: rule__Variable__TypeAssignment_1_2 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5954:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5955:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5955:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5956:1: ruleValueType
            {
             before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_1_212004);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__TypeAssignment_1_2


    // $ANTLR start rule__Variable__NameAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5965:1: rule__Variable__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5969:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5970:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5970:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5971:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_2_012035); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_2_0


    // $ANTLR start rule__Variable__InitialValueAssignment_2_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5980:1: rule__Variable__InitialValueAssignment_2_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5984:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5985:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5985:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5986:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_2_1_112066); 
             after(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__InitialValueAssignment_2_1_1


    // $ANTLR start rule__Variable__NameAssignment_3_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5995:1: rule__Variable__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:5999:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6000:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6000:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6001:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_3_012097); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_3_0


    // $ANTLR start rule__Variable__InitialValueAssignment_3_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6010:1: rule__Variable__InitialValueAssignment_3_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6014:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6015:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6015:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6016:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_3_1_112128); 
             after(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__InitialValueAssignment_3_1_1


    // $ANTLR start rule__Variable__TypeAssignment_3_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6025:1: rule__Variable__TypeAssignment_3_3 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6029:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6030:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6030:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6031:1: ruleValueType
            {
             before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_3_312159);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__TypeAssignment_3_3


    // $ANTLR start rule__Variable__NameAssignment_4_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6040:1: rule__Variable__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6044:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6045:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6045:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6046:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_4_012190); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_4_0


    // $ANTLR start rule__Variable__HostTypeAssignment_4_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6055:1: rule__Variable__HostTypeAssignment_4_2 : ( RULE_STRING_S ) ;
    public final void rule__Variable__HostTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6059:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6060:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6060:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6061:1: RULE_STRING_S
            {
             before(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Variable__HostTypeAssignment_4_212221); 
             after(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__HostTypeAssignment_4_2


    // $ANTLR start rule__Variable__NameAssignment_5_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6070:1: rule__Variable__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6074:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6075:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6075:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6076:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_5_012252); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_5_0


    // $ANTLR start rule__Variable__InitialValueAssignment_5_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6085:1: rule__Variable__InitialValueAssignment_5_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6089:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6090:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6090:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6091:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_5_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_5_1_112283); 
             after(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__InitialValueAssignment_5_1_1


    // $ANTLR start rule__Variable__HostTypeAssignment_5_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6100:1: rule__Variable__HostTypeAssignment_5_3 : ( RULE_STRING_S ) ;
    public final void rule__Variable__HostTypeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6104:1: ( ( RULE_STRING_S ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6105:1: ( RULE_STRING_S )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6105:1: ( RULE_STRING_S )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:6106:1: RULE_STRING_S
            {
             before(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING_S,FOLLOW_RULE_STRING_S_in_rule__Variable__HostTypeAssignment_5_312314); 
             after(grammarAccess.getVariableAccess().getHostTypeSTRING_STerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__HostTypeAssignment_5_3


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend96 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend108 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__0_in_ruleRegionSignalDec171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_entryRuleVariables198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariables205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group__0_in_ruleVariables231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group__0_in_ruleSignals291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_in_ruleVariable591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__RegionsAssignment_0_in_rule__StateExtend__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__0_in_rule__StateExtend__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__0_in_rule__StateExtend__Alternatives789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__0_in_rule__RegionSignalDec__Alternatives_2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__0_in_rule__RegionSignalDec__Alternatives_3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__0_in_rule__RegionSignalDec__Alternatives_3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__0_in_rule__Signal__Alternatives1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__0_in_rule__Signal__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Alternatives1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Alternatives1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__0_in_rule__Variable__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ValueType__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ValueType__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ValueType__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValueType__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValueType__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValueType__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CombineOperator__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CombineOperator__Alternatives1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CombineOperator__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CombineOperator__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CombineOperator__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CombineOperator__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CombineOperator__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CombineOperator__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__0__Impl_in_rule__StateExtend__Group_1__01564 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateExtend__Group_1__0__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__1__Impl_in_rule__StateExtend__Group_1__11626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__2_in_rule__StateExtend__Group_1__11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateExtend__Group_1__1__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__2__Impl_in_rule__StateExtend__Group_1__21688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InOutputSignalsAssignment_1_2_in_rule__StateExtend__Group_1__2__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__0__Impl_in_rule__StateExtend__Group_2__01751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateExtend__Group_2__0__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__1__Impl_in_rule__StateExtend__Group_2__11813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__OutputSignalsAssignment_2_1_in_rule__StateExtend__Group_2__1__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__0__Impl_in_rule__StateExtend__Group_3__01874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateExtend__Group_3__0__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__1__Impl_in_rule__StateExtend__Group_3__11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InputSignalsAssignment_3_1_in_rule__StateExtend__Group_3__1__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__0__Impl_in_rule__StateExtend__Group_4__01997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__1_in_rule__StateExtend__Group_4__02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StateExtend__Group_4__0__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__1__Impl_in_rule__StateExtend__Group_4__12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__SignalsAssignment_4_1_in_rule__StateExtend__Group_4__1__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__0__Impl_in_rule__StateExtend__Group_5__02120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__1_in_rule__StateExtend__Group_5__02123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StateExtend__Group_5__0__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__1__Impl_in_rule__StateExtend__Group_5__12182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__VariableAssignment_5_1_in_rule__StateExtend__Group_5__1__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__0__Impl_in_rule__RegionSignalDec__Group__02243 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__02246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__0__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__1__Impl_in_rule__RegionSignalDec__Group__12303 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RegionSignalDec__Group__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__2__Impl_in_rule__RegionSignalDec__Group__22365 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__3__Impl_in_rule__RegionSignalDec__Group__32425 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__32428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_3_in_rule__RegionSignalDec__Group__3__Impl2455 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__4__Impl_in_rule__RegionSignalDec__Group__42486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RegionSignalDec__Group__4__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__0__Impl_in_rule__RegionSignalDec__Group_2_0__02555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RegionSignalDec__Group_2_0__0__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__1__Impl_in_rule__RegionSignalDec__Group_2_0__12617 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__2_in_rule__RegionSignalDec__Group_2_0__12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__1__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__2__Impl_in_rule__RegionSignalDec__Group_2_0__22677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__0_in_rule__RegionSignalDec__Group_2_0__2__Impl2704 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__0__Impl_in_rule__RegionSignalDec__Group_2_0_2__02741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__1_in_rule__RegionSignalDec__Group_2_0_2__02744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_2_0_2__0__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__1__Impl_in_rule__RegionSignalDec__Group_2_0_2__12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_2_1_in_rule__RegionSignalDec__Group_2_0_2__1__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__0__Impl_in_rule__RegionSignalDec__Group_2_1__02864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__1_in_rule__RegionSignalDec__Group_2_1__02867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegionSignalDec__Group_2_1__0__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__1__Impl_in_rule__RegionSignalDec__Group_2_1__12926 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__2_in_rule__RegionSignalDec__Group_2_1__12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_1_in_rule__RegionSignalDec__Group_2_1__1__Impl2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__2__Impl_in_rule__RegionSignalDec__Group_2_1__22986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__0_in_rule__RegionSignalDec__Group_2_1__2__Impl3013 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__0__Impl_in_rule__RegionSignalDec__Group_2_1_2__03050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__1_in_rule__RegionSignalDec__Group_2_1_2__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_2_1_2__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__1__Impl_in_rule__RegionSignalDec__Group_2_1_2__13112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_2_1_in_rule__RegionSignalDec__Group_2_1_2__1__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__0__Impl_in_rule__RegionSignalDec__Group_3_0__03173 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__1_in_rule__RegionSignalDec__Group_3_0__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_0__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__1__Impl_in_rule__RegionSignalDec__Group_3_0__13235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__2_in_rule__RegionSignalDec__Group_3_0__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RegionSignalDec__Group_3_0__1__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__2__Impl_in_rule__RegionSignalDec__Group_3_0__23297 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__3_in_rule__RegionSignalDec__Group_3_0__23300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_2_in_rule__RegionSignalDec__Group_3_0__2__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__3__Impl_in_rule__RegionSignalDec__Group_3_0__33357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__0_in_rule__RegionSignalDec__Group_3_0__3__Impl3384 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__0__Impl_in_rule__RegionSignalDec__Group_3_0_3__03423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__1_in_rule__RegionSignalDec__Group_3_0_3__03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_0_3__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__1__Impl_in_rule__RegionSignalDec__Group_3_0_3__13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_3_1_in_rule__RegionSignalDec__Group_3_0_3__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__0__Impl_in_rule__RegionSignalDec__Group_3_1__03546 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__1_in_rule__RegionSignalDec__Group_3_1__03549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_1__0__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__1__Impl_in_rule__RegionSignalDec__Group_3_1__13608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__2_in_rule__RegionSignalDec__Group_3_1__13611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegionSignalDec__Group_3_1__1__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__2__Impl_in_rule__RegionSignalDec__Group_3_1__23670 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__3_in_rule__RegionSignalDec__Group_3_1__23673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_2_in_rule__RegionSignalDec__Group_3_1__2__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__3__Impl_in_rule__RegionSignalDec__Group_3_1__33730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__0_in_rule__RegionSignalDec__Group_3_1__3__Impl3757 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__0__Impl_in_rule__RegionSignalDec__Group_3_1_3__03796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__1_in_rule__RegionSignalDec__Group_3_1_3__03799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_1_3__0__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__1__Impl_in_rule__RegionSignalDec__Group_3_1_3__13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_3_1_in_rule__RegionSignalDec__Group_3_1_3__1__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group__0__Impl_in_rule__Variables__Group__03919 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Variables__Group__1_in_rule__Variables__Group__03922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__0_in_rule__Variables__Group__0__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group__1__Impl_in_rule__Variables__Group__13979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Variables__Group__1__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__0__Impl_in_rule__Variables__Group_0__04042 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__1_in_rule__Variables__Group_0__04045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__VarsAssignment_0_0_in_rule__Variables__Group_0__0__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0__1__Impl_in_rule__Variables__Group_0__14102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0_1__0_in_rule__Variables__Group_0__1__Impl4129 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0_1__0__Impl_in_rule__Variables__Group_0_1__04164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variables__Group_0_1__1_in_rule__Variables__Group_0_1__04167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Variables__Group_0_1__0__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__Group_0_1__1__Impl_in_rule__Variables__Group_0_1__14226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variables__VarsAssignment_0_1_1_in_rule__Variables__Group_0_1__1__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group__0__Impl_in_rule__Signals__Group__04287 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__04290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__0__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group__1__Impl_in_rule__Signals__Group__14347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signals__Group__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__0__Impl_in_rule__Signals__Group_0__04410 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__04413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__0__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__1__Impl_in_rule__Signals__Group_0__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__1__Impl4497 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__0__Impl_in_rule__Signals__Group_0_1__04532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__04535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Signals__Group_0_1__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__1__Impl_in_rule__Signals__Group_0_1__14594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__1__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__0__Impl_in_rule__InputSignals__Group__04655 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__04658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__0__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__1__Impl_in_rule__InputSignals__Group__14715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InputSignals__Group__1__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__0__Impl_in_rule__InputSignals__Group_0__04778 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__04781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__0__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__1__Impl_in_rule__InputSignals__Group_0__14838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__1__Impl4865 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__0__Impl_in_rule__InputSignals__Group_0_1__04900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__04903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InputSignals__Group_0_1__0__Impl4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__1__Impl_in_rule__InputSignals__Group_0_1__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__1__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__0__Impl_in_rule__OutputSignals__Group__05023 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__05026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__0__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__1__Impl_in_rule__OutputSignals__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OutputSignals__Group__1__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__0__Impl_in_rule__OutputSignals__Group_0__05146 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__05149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__0__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__1__Impl_in_rule__OutputSignals__Group_0__15206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__1__Impl5233 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__0__Impl_in_rule__OutputSignals__Group_0_1__05268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__05271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OutputSignals__Group_0_1__0__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__1__Impl_in_rule__OutputSignals__Group_0_1__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__0__Impl_in_rule__InOutputSignals__Group__05391 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__0__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__1__Impl_in_rule__InOutputSignals__Group__15451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InOutputSignals__Group__1__Impl5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__0__Impl_in_rule__InOutputSignals__Group_0__05514 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__05517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__0__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__1__Impl_in_rule__InOutputSignals__Group_0__15574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__1__Impl5601 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__0__Impl_in_rule__InOutputSignals__Group_0_1__05636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__05639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InOutputSignals__Group_0_1__0__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__1__Impl_in_rule__InOutputSignals__Group_0_1__15698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__1__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0__Impl_in_rule__Signal__Group_1__05759 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__05762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__0__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1__Impl_in_rule__Signal__Group_1__15819 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__15822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_1__1__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2__Impl_in_rule__Signal__Group_1__25881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_1_2_in_rule__Signal__Group_1__2__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0__Impl_in_rule__Signal__Group_2__05944 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__05947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__0__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1__Impl_in_rule__Signal__Group_2__16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__1__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__0__Impl_in_rule__Signal__Group_2_1__06065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__06068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_2_1__0__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__1__Impl_in_rule__Signal__Group_2_1__16127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__1__Impl6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0__Impl_in_rule__Signal__Group_3__06188 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__06191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__0__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1__Impl_in_rule__Signal__Group_3__16248 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__16251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__1__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__2__Impl_in_rule__Signal__Group_3__26308 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__3_in_rule__Signal__Group_3__26311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_3__2__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__3__Impl_in_rule__Signal__Group_3__36370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_3_3_in_rule__Signal__Group_3__3__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__0__Impl_in_rule__Signal__Group_3_1__06435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__06438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_3_1__0__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__1__Impl_in_rule__Signal__Group_3_1__16497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__1__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0__Impl_in_rule__Signal__Group_4__06558 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__06561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__0__Impl6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1__Impl_in_rule__Signal__Group_4__16618 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__16621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__1__Impl6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__2__Impl_in_rule__Signal__Group_4__26678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__0_in_rule__Signal__Group_4__2__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0__Impl_in_rule__Signal__Group_4_1__06741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__06744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_4_1__0__Impl6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1__Impl_in_rule__Signal__Group_4_1__16803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__1__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__0__Impl_in_rule__Signal__Group_4_2__06864 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__1_in_rule__Signal__Group_4_2__06867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_4_2__0__Impl6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__1__Impl_in_rule__Signal__Group_4_2__16926 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__2_in_rule__Signal__Group_4_2__16929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_4_2_1_in_rule__Signal__Group_4_2__1__Impl6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__2__Impl_in_rule__Signal__Group_4_2__26986 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__3_in_rule__Signal__Group_4_2__26989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_4_2__2__Impl7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__3__Impl_in_rule__Signal__Group_4_2__37048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_4_2_3_in_rule__Signal__Group_4_2__3__Impl7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0__Impl_in_rule__Signal__Group_5__07113 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__07116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__0__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1__Impl_in_rule__Signal__Group_5__17173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__17176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_5__1__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__2__Impl_in_rule__Signal__Group_5__27235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_5_2_in_rule__Signal__Group_5__2__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__0__Impl_in_rule__Signal__Group_6__07298 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__07301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__0__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__1__Impl_in_rule__Signal__Group_6__17358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__2_in_rule__Signal__Group_6__17361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__1__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__2__Impl_in_rule__Signal__Group_6__27418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__3_in_rule__Signal__Group_6__27421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_6__2__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__3__Impl_in_rule__Signal__Group_6__37480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_6_3_in_rule__Signal__Group_6__3__Impl7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__0__Impl_in_rule__Signal__Group_6_1__07545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__07548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_6_1__0__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__1__Impl_in_rule__Signal__Group_6_1__17607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_6_1_1_in_rule__Signal__Group_6_1__1__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__0__Impl_in_rule__Signal__Group_7__07668 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__07671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__0__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__1__Impl_in_rule__Signal__Group_7__17728 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__2_in_rule__Signal__Group_7__17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__1__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__2__Impl_in_rule__Signal__Group_7__27788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__0_in_rule__Signal__Group_7__2__Impl7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__0__Impl_in_rule__Signal__Group_7_1__07851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__07854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_7_1__0__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__1__Impl_in_rule__Signal__Group_7_1__17913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_7_1_1_in_rule__Signal__Group_7_1__1__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__0__Impl_in_rule__Signal__Group_7_2__07974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__1_in_rule__Signal__Group_7_2__07977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_7_2__0__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__1__Impl_in_rule__Signal__Group_7_2__18036 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__2_in_rule__Signal__Group_7_2__18039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_7_2_1_in_rule__Signal__Group_7_2__1__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__2__Impl_in_rule__Signal__Group_7_2__28096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__3_in_rule__Signal__Group_7_2__28099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_7_2__2__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__3__Impl_in_rule__Signal__Group_7_2__38158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_2_3_in_rule__Signal__Group_7_2__3__Impl8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__0__Impl_in_rule__Signal__Group_8__08223 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__1_in_rule__Signal__Group_8__08226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_8_0_in_rule__Signal__Group_8__0__Impl8253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__1__Impl_in_rule__Signal__Group_8__18283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__0_in_rule__Signal__Group_8__1__Impl8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__0__Impl_in_rule__Signal__Group_8_1__08344 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__1_in_rule__Signal__Group_8_1__08347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_8_1__0__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__1__Impl_in_rule__Signal__Group_8_1__18406 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__2_in_rule__Signal__Group_8_1__18409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_8_1_1_in_rule__Signal__Group_8_1__1__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__2__Impl_in_rule__Signal__Group_8_1__28466 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__3_in_rule__Signal__Group_8_1__28469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_8_1__2__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__3__Impl_in_rule__Signal__Group_8_1__38528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_8_1_3_in_rule__Signal__Group_8_1__3__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__0__Impl_in_rule__Signal__Group_9__08593 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__1_in_rule__Signal__Group_9__08596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_9_0_in_rule__Signal__Group_9__0__Impl8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__1__Impl_in_rule__Signal__Group_9__18653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__0_in_rule__Signal__Group_9__1__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__0__Impl_in_rule__Signal__Group_9_1__08714 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__1_in_rule__Signal__Group_9_1__08717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_9_1__0__Impl8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__1__Impl_in_rule__Signal__Group_9_1__18776 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__2_in_rule__Signal__Group_9_1__18779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_9_1_1_in_rule__Signal__Group_9_1__1__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__2__Impl_in_rule__Signal__Group_9_1__28836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__3_in_rule__Signal__Group_9_1__28839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_9_1__2__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__3__Impl_in_rule__Signal__Group_9_1__38898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_9_1_3_in_rule__Signal__Group_9_1__3__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__0__Impl_in_rule__Variable__Group_1__08963 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__08966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_0_in_rule__Variable__Group_1__0__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__1__Impl_in_rule__Variable__Group_1__19023 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__2_in_rule__Variable__Group_1__19026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_1__1__Impl9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__2__Impl_in_rule__Variable__Group_1__29085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_1_2_in_rule__Variable__Group_1__2__Impl9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0__Impl_in_rule__Variable__Group_2__09148 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__09151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_2_0_in_rule__Variable__Group_2__0__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1__Impl_in_rule__Variable__Group_2__19208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__0_in_rule__Variable__Group_2__1__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__0__Impl_in_rule__Variable__Group_2_1__09269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__1_in_rule__Variable__Group_2_1__09272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_2_1__0__Impl9300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__1__Impl_in_rule__Variable__Group_2_1__19331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_2_1_1_in_rule__Variable__Group_2_1__1__Impl9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__0__Impl_in_rule__Variable__Group_3__09392 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__09395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_3_0_in_rule__Variable__Group_3__0__Impl9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__1__Impl_in_rule__Variable__Group_3__19452 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__2_in_rule__Variable__Group_3__19455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__0_in_rule__Variable__Group_3__1__Impl9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__2__Impl_in_rule__Variable__Group_3__29512 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__3_in_rule__Variable__Group_3__29515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_3__2__Impl9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__3__Impl_in_rule__Variable__Group_3__39574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_3_3_in_rule__Variable__Group_3__3__Impl9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__0__Impl_in_rule__Variable__Group_3_1__09639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__1_in_rule__Variable__Group_3_1__09642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_3_1__0__Impl9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__1__Impl_in_rule__Variable__Group_3_1__19701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_3_1_1_in_rule__Variable__Group_3_1__1__Impl9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__0__Impl_in_rule__Variable__Group_4__09762 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__09765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_4_0_in_rule__Variable__Group_4__0__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__1__Impl_in_rule__Variable__Group_4__19822 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__2_in_rule__Variable__Group_4__19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_4__1__Impl9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__2__Impl_in_rule__Variable__Group_4__29884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__HostTypeAssignment_4_2_in_rule__Variable__Group_4__2__Impl9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__0__Impl_in_rule__Variable__Group_5__09947 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__1_in_rule__Variable__Group_5__09950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_5_0_in_rule__Variable__Group_5__0__Impl9977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__1__Impl_in_rule__Variable__Group_5__110007 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__2_in_rule__Variable__Group_5__110010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__0_in_rule__Variable__Group_5__1__Impl10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__2__Impl_in_rule__Variable__Group_5__210067 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__3_in_rule__Variable__Group_5__210070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_5__2__Impl10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__3__Impl_in_rule__Variable__Group_5__310129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__HostTypeAssignment_5_3_in_rule__Variable__Group_5__3__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__0__Impl_in_rule__Variable__Group_5_1__010194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__1_in_rule__Variable__Group_5_1__010197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_5_1__0__Impl10225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__1__Impl_in_rule__Variable__Group_5_1__110256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_5_1_1_in_rule__Variable__Group_5_1__1__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_010322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_1_210353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_2_110384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_3_110415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_4_110446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariables_in_rule__StateExtend__VariableAssignment_5_110477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_010512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_110547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_2_110578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_110609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_2_110640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_210671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_3_110702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_210733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_3_110764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Variables__VarsAssignment_0_010795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Variables__VarsAssignment_0_1_110826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_010857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_110888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_010919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_110950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_111012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_011043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_111074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_011105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_011136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_1_211167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_011198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_2_1_111229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_011260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_3_1_111291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_311322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_011353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_4_1_111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_4_2_111415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_4_2_311446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_011477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_5_211508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_011539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_6_1_111570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_6_311601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_7_1_111663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_7_2_111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostCombineOperatorAssignment_7_2_311725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_8_011756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_8_1_111787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_8_1_311818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_9_011849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostTypeAssignment_9_1_111880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Signal__HostCombineOperatorAssignment_9_1_311911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_011942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1_011973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_1_212004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_2_012035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_2_1_112066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_3_012097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_3_1_112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_3_312159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_4_012190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Variable__HostTypeAssignment_4_212221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_5_012252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_5_1_112283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_S_in_rule__Variable__HostTypeAssignment_5_312314 = new BitSet(new long[]{0x0000000000000002L});

}