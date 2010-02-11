package de.cau.cs.kieler.synccharts.interfacedeclparser.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.interfacedeclparser.services.InterfaceDeclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalInterfaceDeclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'+'", "'*'", "'max'", "'min'", "'or'", "'and'", "'host'", "'input'", "'output'", "'signal'", "':'", "';'", "','", "':='", "'combine'", "'with'", "'var'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalInterfaceDeclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g"; }


     
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:60:1: entryRuleStateExtend : ruleStateExtend EOF ;
    public final void entryRuleStateExtend() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:61:1: ( ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:62:1: ruleStateExtend EOF
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:69:1: ruleStateExtend : ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) ;
    public final void ruleStateExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:73:2: ( ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:74:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:74:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( rule__StateExtend__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:76:1: ( rule__StateExtend__Alternatives )
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:77:1: ( rule__StateExtend__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:77:2: rule__StateExtend__Alternatives
            {
            pushFollow(FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend97);
            rule__StateExtend__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getAlternatives()); 

            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:80:1: ( ( rule__StateExtend__Alternatives )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:81:1: ( rule__StateExtend__Alternatives )*
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:82:1: ( rule__StateExtend__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=25 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:82:2: rule__StateExtend__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend109);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:95:1: entryRuleRegionSignalDec : ruleRegionSignalDec EOF ;
    public final void entryRuleRegionSignalDec() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:96:1: ( ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:97:1: ruleRegionSignalDec EOF
            {
             before(grammarAccess.getRegionSignalDecRule()); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec139);
            ruleRegionSignalDec();
            _fsp--;

             after(grammarAccess.getRegionSignalDecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegionSignalDec146); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:104:1: ruleRegionSignalDec : ( ( rule__RegionSignalDec__Group__0 ) ) ;
    public final void ruleRegionSignalDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:108:2: ( ( ( rule__RegionSignalDec__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:109:1: ( ( rule__RegionSignalDec__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:109:1: ( ( rule__RegionSignalDec__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:110:1: ( rule__RegionSignalDec__Group__0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:111:1: ( rule__RegionSignalDec__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:111:2: rule__RegionSignalDec__Group__0
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Group__0_in_ruleRegionSignalDec173);
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


    // $ANTLR start entryRuleSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:123:1: entryRuleSignals : ruleSignals EOF ;
    public final void entryRuleSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:124:1: ( ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:125:1: ruleSignals EOF
            {
             before(grammarAccess.getSignalsRule()); 
            pushFollow(FOLLOW_ruleSignals_in_entryRuleSignals200);
            ruleSignals();
            _fsp--;

             after(grammarAccess.getSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignals207); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:132:1: ruleSignals : ( ( rule__Signals__Group__0 ) ) ;
    public final void ruleSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:136:2: ( ( ( rule__Signals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:137:1: ( ( rule__Signals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:137:1: ( ( rule__Signals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:138:1: ( rule__Signals__Group__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:139:1: ( rule__Signals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:139:2: rule__Signals__Group__0
            {
            pushFollow(FOLLOW_rule__Signals__Group__0_in_ruleSignals234);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:151:1: entryRuleInputSignals : ruleInputSignals EOF ;
    public final void entryRuleInputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:152:1: ( ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:153:1: ruleInputSignals EOF
            {
             before(grammarAccess.getInputSignalsRule()); 
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals261);
            ruleInputSignals();
            _fsp--;

             after(grammarAccess.getInputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals268); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:160:1: ruleInputSignals : ( ( rule__InputSignals__Group__0 ) ) ;
    public final void ruleInputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:164:2: ( ( ( rule__InputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:165:1: ( ( rule__InputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:165:1: ( ( rule__InputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:166:1: ( rule__InputSignals__Group__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:167:1: ( rule__InputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:167:2: rule__InputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals295);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:179:1: entryRuleOutputSignals : ruleOutputSignals EOF ;
    public final void entryRuleOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:180:1: ( ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:181:1: ruleOutputSignals EOF
            {
             before(grammarAccess.getOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals322);
            ruleOutputSignals();
            _fsp--;

             after(grammarAccess.getOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals329); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:188:1: ruleOutputSignals : ( ( rule__OutputSignals__Group__0 ) ) ;
    public final void ruleOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:192:2: ( ( ( rule__OutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:193:1: ( ( rule__OutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:193:1: ( ( rule__OutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:194:1: ( rule__OutputSignals__Group__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:195:1: ( rule__OutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:195:2: rule__OutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals356);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:207:1: entryRuleInOutputSignals : ruleInOutputSignals EOF ;
    public final void entryRuleInOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:208:1: ( ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:209:1: ruleInOutputSignals EOF
            {
             before(grammarAccess.getInOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals383);
            ruleInOutputSignals();
            _fsp--;

             after(grammarAccess.getInOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals390); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:216:1: ruleInOutputSignals : ( ( rule__InOutputSignals__Group__0 ) ) ;
    public final void ruleInOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:220:2: ( ( ( rule__InOutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:221:1: ( ( rule__InOutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:221:1: ( ( rule__InOutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:222:1: ( rule__InOutputSignals__Group__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:223:1: ( rule__InOutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:223:2: rule__InOutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals417);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:235:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:236:1: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:237:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal444);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal451); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:244:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:248:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:249:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:249:1: ( ( rule__Signal__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:250:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:251:1: ( rule__Signal__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:251:2: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_rule__Signal__Alternatives_in_ruleSignal478);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:263:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:264:1: ( ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:265:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable505);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable512); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:272:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:276:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:277:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:277:1: ( ( rule__Variable__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:278:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:279:1: ( rule__Variable__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:279:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable539);
            rule__Variable__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:292:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:296:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:297:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:297:1: ( ( rule__ValueType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:298:1: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:299:1: ( rule__ValueType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:299:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType576);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:311:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:315:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:316:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:316:1: ( ( rule__CombineOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:317:1: ( rule__CombineOperator__Alternatives )
            {
             before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:318:1: ( rule__CombineOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:318:2: rule__CombineOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator612);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:329:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__Group_0__0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__RegionsAssignment_4 ) ) );
    public final void rule__StateExtend__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:333:1: ( ( ( rule__StateExtend__Group_0__0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__RegionsAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==26) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("329:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__Group_0__0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__RegionsAssignment_4 ) ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("329:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__Group_0__0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__RegionsAssignment_4 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:334:1: ( ( rule__StateExtend__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:334:1: ( ( rule__StateExtend__Group_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:335:1: ( rule__StateExtend__Group_0__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:336:1: ( rule__StateExtend__Group_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:336:2: rule__StateExtend__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_0__0_in_rule__StateExtend__Alternatives647);
                    rule__StateExtend__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:340:6: ( ( rule__StateExtend__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:340:6: ( ( rule__StateExtend__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:341:1: ( rule__StateExtend__Group_1__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:342:1: ( rule__StateExtend__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:342:2: rule__StateExtend__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives665);
                    rule__StateExtend__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:346:6: ( ( rule__StateExtend__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:346:6: ( ( rule__StateExtend__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:347:1: ( rule__StateExtend__Group_2__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:348:1: ( rule__StateExtend__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:348:2: rule__StateExtend__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives683);
                    rule__StateExtend__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:352:6: ( ( rule__StateExtend__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:352:6: ( ( rule__StateExtend__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:353:1: ( rule__StateExtend__Group_3__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:354:1: ( rule__StateExtend__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:354:2: rule__StateExtend__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives701);
                    rule__StateExtend__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:358:6: ( ( rule__StateExtend__RegionsAssignment_4 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:358:6: ( ( rule__StateExtend__RegionsAssignment_4 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:359:1: ( rule__StateExtend__RegionsAssignment_4 )
                    {
                     before(grammarAccess.getStateExtendAccess().getRegionsAssignment_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:360:1: ( rule__StateExtend__RegionsAssignment_4 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:360:2: rule__StateExtend__RegionsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__StateExtend__RegionsAssignment_4_in_rule__StateExtend__Alternatives719);
                    rule__StateExtend__RegionsAssignment_4();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getRegionsAssignment_4()); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:369:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_2_1 ) ) );
    public final void rule__RegionSignalDec__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:373:1: ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("369:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:374:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:374:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:375:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:376:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:376:2: rule__RegionSignalDec__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2752);
                    rule__RegionSignalDec__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:380:6: ( ( rule__RegionSignalDec__VarsAssignment_2_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:380:6: ( ( rule__RegionSignalDec__VarsAssignment_2_1 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:381:1: ( rule__RegionSignalDec__VarsAssignment_2_1 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:382:1: ( rule__RegionSignalDec__VarsAssignment_2_1 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:382:2: rule__RegionSignalDec__VarsAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_2_1_in_rule__RegionSignalDec__Alternatives_2770);
                    rule__RegionSignalDec__VarsAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_1()); 

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


    // $ANTLR start rule__RegionSignalDec__Alternatives_3_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:391:1: rule__RegionSignalDec__Alternatives_3_1 : ( ( ( rule__RegionSignalDec__Group_3_1_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_3_1_1 ) ) );
    public final void rule__RegionSignalDec__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:395:1: ( ( ( rule__RegionSignalDec__Group_3_1_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_3_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("391:1: rule__RegionSignalDec__Alternatives_3_1 : ( ( ( rule__RegionSignalDec__Group_3_1_0__0 ) ) | ( ( rule__RegionSignalDec__VarsAssignment_3_1_1 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:396:1: ( ( rule__RegionSignalDec__Group_3_1_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:396:1: ( ( rule__RegionSignalDec__Group_3_1_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:397:1: ( rule__RegionSignalDec__Group_3_1_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_3_1_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:398:1: ( rule__RegionSignalDec__Group_3_1_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:398:2: rule__RegionSignalDec__Group_3_1_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_0__0_in_rule__RegionSignalDec__Alternatives_3_1803);
                    rule__RegionSignalDec__Group_3_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:402:6: ( ( rule__RegionSignalDec__VarsAssignment_3_1_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:402:6: ( ( rule__RegionSignalDec__VarsAssignment_3_1_1 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:403:1: ( rule__RegionSignalDec__VarsAssignment_3_1_1 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_1_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:404:1: ( rule__RegionSignalDec__VarsAssignment_3_1_1 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:404:2: rule__RegionSignalDec__VarsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_3_1_1_in_rule__RegionSignalDec__Alternatives_3_1821);
                    rule__RegionSignalDec__VarsAssignment_3_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_1_1()); 

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
    // $ANTLR end rule__RegionSignalDec__Alternatives_3_1


    // $ANTLR start rule__Signal__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:417:1: ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) )
            int alt5=8;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_STRING) ) {
                        alt5=8;
                    }
                    else if ( ((LA5_2>=11 && LA5_2<=16)) ) {
                        alt5=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_STRING) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            int LA5_8 = input.LA(5);

                            if ( (LA5_8==RULE_STRING) ) {
                                alt5=6;
                            }
                            else if ( ((LA5_8>=11 && LA5_8<=16)) ) {
                                alt5=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 8, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case 29:
                        case 30:
                            {
                            alt5=2;
                            }
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            {
                            alt5=3;
                            }
                            break;
                        case RULE_STRING:
                            {
                            alt5=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 29:
                case 30:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("413:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:418:1: ( ( rule__Signal__NameAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:418:1: ( ( rule__Signal__NameAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:419:1: ( rule__Signal__NameAssignment_0 )
                    {
                     before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:420:1: ( rule__Signal__NameAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:420:2: rule__Signal__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives854);
                    rule__Signal__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:424:6: ( ( rule__Signal__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:424:6: ( ( rule__Signal__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:425:1: ( rule__Signal__Group_1__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:426:1: ( rule__Signal__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:426:2: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives872);
                    rule__Signal__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:430:6: ( ( rule__Signal__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:430:6: ( ( rule__Signal__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:431:1: ( rule__Signal__Group_2__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:432:1: ( rule__Signal__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:432:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives890);
                    rule__Signal__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:436:6: ( ( rule__Signal__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:436:6: ( ( rule__Signal__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:437:1: ( rule__Signal__Group_3__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:438:1: ( rule__Signal__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:438:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives908);
                    rule__Signal__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:442:6: ( ( rule__Signal__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:442:6: ( ( rule__Signal__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:443:1: ( rule__Signal__Group_4__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:444:1: ( rule__Signal__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:444:2: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives926);
                    rule__Signal__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:448:6: ( ( rule__Signal__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:448:6: ( ( rule__Signal__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:449:1: ( rule__Signal__Group_5__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:450:1: ( rule__Signal__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:450:2: rule__Signal__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives944);
                    rule__Signal__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:454:6: ( ( rule__Signal__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:454:6: ( ( rule__Signal__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:455:1: ( rule__Signal__Group_6__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:456:1: ( rule__Signal__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:456:2: rule__Signal__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives962);
                    rule__Signal__Group_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:460:6: ( ( rule__Signal__Group_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:460:6: ( ( rule__Signal__Group_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:461:1: ( rule__Signal__Group_7__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:462:1: ( rule__Signal__Group_7__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:462:2: rule__Signal__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives980);
                    rule__Signal__Group_7__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_7()); 

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


    // $ANTLR start rule__ValueType__Alternatives
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:471:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:475:1: ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("471:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:476:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:476:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:477:1: ( 'PURE' )
                    {
                     before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:478:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:478:3: 'PURE'
                    {
                    match(input,11,FOLLOW_11_in_rule__ValueType__Alternatives1014); 

                    }

                     after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:483:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:483:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:484:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:485:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:485:3: 'BOOL'
                    {
                    match(input,12,FOLLOW_12_in_rule__ValueType__Alternatives1035); 

                    }

                     after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:490:6: ( ( 'UNSIGNED' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:490:6: ( ( 'UNSIGNED' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:491:1: ( 'UNSIGNED' )
                    {
                     before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:492:1: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:492:3: 'UNSIGNED'
                    {
                    match(input,13,FOLLOW_13_in_rule__ValueType__Alternatives1056); 

                    }

                     after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:497:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:497:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:498:1: ( 'INT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:499:1: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:499:3: 'INT'
                    {
                    match(input,14,FOLLOW_14_in_rule__ValueType__Alternatives1077); 

                    }

                     after(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:504:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:504:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:505:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:506:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:506:3: 'FLOAT'
                    {
                    match(input,15,FOLLOW_15_in_rule__ValueType__Alternatives1098); 

                    }

                     after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:511:6: ( ( 'HOST' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:511:6: ( ( 'HOST' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:512:1: ( 'HOST' )
                    {
                     before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:513:1: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:513:3: 'HOST'
                    {
                    match(input,16,FOLLOW_16_in_rule__ValueType__Alternatives1119); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:523:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:527:1: ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
            int alt7=8;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("523:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:528:1: ( ( 'NONE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:528:1: ( ( 'NONE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:529:1: ( 'NONE' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:530:1: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:530:3: 'NONE'
                    {
                    match(input,17,FOLLOW_17_in_rule__CombineOperator__Alternatives1155); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:535:6: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:535:6: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:536:1: ( '+' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:537:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:537:3: '+'
                    {
                    match(input,18,FOLLOW_18_in_rule__CombineOperator__Alternatives1176); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:542:6: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:542:6: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:543:1: ( '*' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:544:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:544:3: '*'
                    {
                    match(input,19,FOLLOW_19_in_rule__CombineOperator__Alternatives1197); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:549:6: ( ( 'max' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:549:6: ( ( 'max' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:550:1: ( 'max' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:551:1: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:551:3: 'max'
                    {
                    match(input,20,FOLLOW_20_in_rule__CombineOperator__Alternatives1218); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:556:6: ( ( 'min' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:556:6: ( ( 'min' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:557:1: ( 'min' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:558:1: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:558:3: 'min'
                    {
                    match(input,21,FOLLOW_21_in_rule__CombineOperator__Alternatives1239); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:563:6: ( ( 'or' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:563:6: ( ( 'or' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:564:1: ( 'or' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:565:1: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:565:3: 'or'
                    {
                    match(input,22,FOLLOW_22_in_rule__CombineOperator__Alternatives1260); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:570:6: ( ( 'and' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:570:6: ( ( 'and' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:571:1: ( 'and' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:572:1: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:572:3: 'and'
                    {
                    match(input,23,FOLLOW_23_in_rule__CombineOperator__Alternatives1281); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:577:6: ( ( 'host' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:577:6: ( ( 'host' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:578:1: ( 'host' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:579:1: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:579:3: 'host'
                    {
                    match(input,24,FOLLOW_24_in_rule__CombineOperator__Alternatives1302); 

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


    // $ANTLR start rule__StateExtend__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:591:1: rule__StateExtend__Group_0__0 : ( 'input' ) rule__StateExtend__Group_0__1 ;
    public final void rule__StateExtend__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:595:1: ( ( 'input' ) rule__StateExtend__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:596:1: ( 'input' ) rule__StateExtend__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:596:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:597:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__StateExtend__Group_0__01340); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_0__1_in_rule__StateExtend__Group_0__01350);
            rule__StateExtend__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_0__0


    // $ANTLR start rule__StateExtend__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:611:1: rule__StateExtend__Group_0__1 : ( ( rule__StateExtend__InputSignalsAssignment_0_1 ) ) ;
    public final void rule__StateExtend__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:615:1: ( ( ( rule__StateExtend__InputSignalsAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:616:1: ( ( rule__StateExtend__InputSignalsAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:616:1: ( ( rule__StateExtend__InputSignalsAssignment_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:617:1: ( rule__StateExtend__InputSignalsAssignment_0_1 )
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsAssignment_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:618:1: ( rule__StateExtend__InputSignalsAssignment_0_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:618:2: rule__StateExtend__InputSignalsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__StateExtend__InputSignalsAssignment_0_1_in_rule__StateExtend__Group_0__11378);
            rule__StateExtend__InputSignalsAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getInputSignalsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_0__1


    // $ANTLR start rule__StateExtend__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:632:1: rule__StateExtend__Group_1__0 : ( 'output' ) rule__StateExtend__Group_1__1 ;
    public final void rule__StateExtend__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:636:1: ( ( 'output' ) rule__StateExtend__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:637:1: ( 'output' ) rule__StateExtend__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:637:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:638:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__StateExtend__Group_1__01417); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01427);
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


    // $ANTLR start rule__StateExtend__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:652:1: rule__StateExtend__Group_1__1 : ( ( rule__StateExtend__OutputSignalsAssignment_1_1 ) ) ;
    public final void rule__StateExtend__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:656:1: ( ( ( rule__StateExtend__OutputSignalsAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:657:1: ( ( rule__StateExtend__OutputSignalsAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:657:1: ( ( rule__StateExtend__OutputSignalsAssignment_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:658:1: ( rule__StateExtend__OutputSignalsAssignment_1_1 )
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsAssignment_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:659:1: ( rule__StateExtend__OutputSignalsAssignment_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:659:2: rule__StateExtend__OutputSignalsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StateExtend__OutputSignalsAssignment_1_1_in_rule__StateExtend__Group_1__11455);
            rule__StateExtend__OutputSignalsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getOutputSignalsAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__StateExtend__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:673:1: rule__StateExtend__Group_2__0 : ( 'input' ) rule__StateExtend__Group_2__1 ;
    public final void rule__StateExtend__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:677:1: ( ( 'input' ) rule__StateExtend__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:678:1: ( 'input' ) rule__StateExtend__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:678:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:679:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__StateExtend__Group_2__01494); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01504);
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


    // $ANTLR start rule__StateExtend__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:693:1: rule__StateExtend__Group_2__1 : ( 'output' ) rule__StateExtend__Group_2__2 ;
    public final void rule__StateExtend__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:697:1: ( ( 'output' ) rule__StateExtend__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:698:1: ( 'output' ) rule__StateExtend__Group_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:698:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:699:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_2_1()); 
            match(input,26,FOLLOW_26_in_rule__StateExtend__Group_2__11533); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_2_1()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_2__2_in_rule__StateExtend__Group_2__11543);
            rule__StateExtend__Group_2__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__StateExtend__Group_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:713:1: rule__StateExtend__Group_2__2 : ( ( rule__StateExtend__InOutputSignalsAssignment_2_2 ) ) ;
    public final void rule__StateExtend__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:717:1: ( ( ( rule__StateExtend__InOutputSignalsAssignment_2_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:718:1: ( ( rule__StateExtend__InOutputSignalsAssignment_2_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:718:1: ( ( rule__StateExtend__InOutputSignalsAssignment_2_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:719:1: ( rule__StateExtend__InOutputSignalsAssignment_2_2 )
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsAssignment_2_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:720:1: ( rule__StateExtend__InOutputSignalsAssignment_2_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:720:2: rule__StateExtend__InOutputSignalsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__StateExtend__InOutputSignalsAssignment_2_2_in_rule__StateExtend__Group_2__21571);
            rule__StateExtend__InOutputSignalsAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getInOutputSignalsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__Group_2__2


    // $ANTLR start rule__StateExtend__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:736:1: rule__StateExtend__Group_3__0 : ( 'signal' ) rule__StateExtend__Group_3__1 ;
    public final void rule__StateExtend__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:740:1: ( ( 'signal' ) rule__StateExtend__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:741:1: ( 'signal' ) rule__StateExtend__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:741:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:742:1: 'signal'
            {
             before(grammarAccess.getStateExtendAccess().getSignalKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__StateExtend__Group_3__01612); 
             after(grammarAccess.getStateExtendAccess().getSignalKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01622);
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


    // $ANTLR start rule__StateExtend__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:756:1: rule__StateExtend__Group_3__1 : ( ( rule__StateExtend__SignalsAssignment_3_1 ) ) ;
    public final void rule__StateExtend__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:760:1: ( ( ( rule__StateExtend__SignalsAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:761:1: ( ( rule__StateExtend__SignalsAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:761:1: ( ( rule__StateExtend__SignalsAssignment_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:762:1: ( rule__StateExtend__SignalsAssignment_3_1 )
            {
             before(grammarAccess.getStateExtendAccess().getSignalsAssignment_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:763:1: ( rule__StateExtend__SignalsAssignment_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:763:2: rule__StateExtend__SignalsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StateExtend__SignalsAssignment_3_1_in_rule__StateExtend__Group_3__11650);
            rule__StateExtend__SignalsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getSignalsAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start rule__RegionSignalDec__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:777:1: rule__RegionSignalDec__Group__0 : ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1 ;
    public final void rule__RegionSignalDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:781:1: ( ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:782:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:782:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:783:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:784:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:784:2: rule__RegionSignalDec__RegionAssignment_0
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__01688);
            rule__RegionSignalDec__RegionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__01697);
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


    // $ANTLR start rule__RegionSignalDec__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:795:1: rule__RegionSignalDec__Group__1 : ( ':' ) rule__RegionSignalDec__Group__2 ;
    public final void rule__RegionSignalDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:799:1: ( ( ':' ) rule__RegionSignalDec__Group__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:800:1: ( ':' ) rule__RegionSignalDec__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:800:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:801:1: ':'
            {
             before(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__RegionSignalDec__Group__11726); 
             after(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__11736);
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


    // $ANTLR start rule__RegionSignalDec__Group__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:815:1: rule__RegionSignalDec__Group__2 : ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3 ;
    public final void rule__RegionSignalDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:819:1: ( ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:820:1: ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:820:1: ( ( rule__RegionSignalDec__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:821:1: ( rule__RegionSignalDec__Alternatives_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:822:1: ( rule__RegionSignalDec__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:822:2: rule__RegionSignalDec__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__21764);
            rule__RegionSignalDec__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__21773);
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


    // $ANTLR start rule__RegionSignalDec__Group__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:833:1: rule__RegionSignalDec__Group__3 : ( ( rule__RegionSignalDec__Group_3__0 )* ) rule__RegionSignalDec__Group__4 ;
    public final void rule__RegionSignalDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:837:1: ( ( ( rule__RegionSignalDec__Group_3__0 )* ) rule__RegionSignalDec__Group__4 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:838:1: ( ( rule__RegionSignalDec__Group_3__0 )* ) rule__RegionSignalDec__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:838:1: ( ( rule__RegionSignalDec__Group_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:839:1: ( rule__RegionSignalDec__Group_3__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:840:1: ( rule__RegionSignalDec__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:840:2: rule__RegionSignalDec__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3__0_in_rule__RegionSignalDec__Group__31801);
            	    rule__RegionSignalDec__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRegionSignalDecAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__31811);
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


    // $ANTLR start rule__RegionSignalDec__Group__4
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:851:1: rule__RegionSignalDec__Group__4 : ( ';' ) ;
    public final void rule__RegionSignalDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:855:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:856:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:856:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:857:1: ';'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__RegionSignalDec__Group__41840); 
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
    // $ANTLR end rule__RegionSignalDec__Group__4


    // $ANTLR start rule__RegionSignalDec__Group_2_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:880:1: rule__RegionSignalDec__Group_2_0__0 : ( 'signal' ) rule__RegionSignalDec__Group_2_0__1 ;
    public final void rule__RegionSignalDec__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:884:1: ( ( 'signal' ) rule__RegionSignalDec__Group_2_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:885:1: ( 'signal' ) rule__RegionSignalDec__Group_2_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:885:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:886:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_0_0()); 
            match(input,27,FOLLOW_27_in_rule__RegionSignalDec__Group_2_0__01886); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__01896);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:900:1: rule__RegionSignalDec__Group_2_0__1 : ( ( rule__RegionSignalDec__SignalsAssignment_2_0_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:904:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_2_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:905:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:905:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:906:1: ( rule__RegionSignalDec__SignalsAssignment_2_0_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:907:1: ( rule__RegionSignalDec__SignalsAssignment_2_0_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:907:2: rule__RegionSignalDec__SignalsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__11924);
            rule__RegionSignalDec__SignalsAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_0_1()); 

            }


            }

        }
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


    // $ANTLR start rule__RegionSignalDec__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:921:1: rule__RegionSignalDec__Group_3__0 : ( ',' ) rule__RegionSignalDec__Group_3__1 ;
    public final void rule__RegionSignalDec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:925:1: ( ( ',' ) rule__RegionSignalDec__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:926:1: ( ',' ) rule__RegionSignalDec__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:926:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:927:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__RegionSignalDec__Group_3__01963); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3__1_in_rule__RegionSignalDec__Group_3__01973);
            rule__RegionSignalDec__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3__0


    // $ANTLR start rule__RegionSignalDec__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:941:1: rule__RegionSignalDec__Group_3__1 : ( ( rule__RegionSignalDec__Alternatives_3_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:945:1: ( ( ( rule__RegionSignalDec__Alternatives_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:946:1: ( ( rule__RegionSignalDec__Alternatives_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:946:1: ( ( rule__RegionSignalDec__Alternatives_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:947:1: ( rule__RegionSignalDec__Alternatives_3_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:948:1: ( rule__RegionSignalDec__Alternatives_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:948:2: rule__RegionSignalDec__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_3_1_in_rule__RegionSignalDec__Group_3__12001);
            rule__RegionSignalDec__Alternatives_3_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3__1


    // $ANTLR start rule__RegionSignalDec__Group_3_1_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:962:1: rule__RegionSignalDec__Group_3_1_0__0 : ( 'signal' ) rule__RegionSignalDec__Group_3_1_0__1 ;
    public final void rule__RegionSignalDec__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:966:1: ( ( 'signal' ) rule__RegionSignalDec__Group_3_1_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:967:1: ( 'signal' ) rule__RegionSignalDec__Group_3_1_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:967:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:968:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_0_0()); 
            match(input,27,FOLLOW_27_in_rule__RegionSignalDec__Group_3_1_0__02040); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_0__1_in_rule__RegionSignalDec__Group_3_1_0__02050);
            rule__RegionSignalDec__Group_3_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_0__0


    // $ANTLR start rule__RegionSignalDec__Group_3_1_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:982:1: rule__RegionSignalDec__Group_3_1_0__1 : ( ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:986:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:987:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:987:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:988:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:989:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_0_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:989:2: rule__RegionSignalDec__SignalsAssignment_3_1_0_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_0_1_in_rule__RegionSignalDec__Group_3_1_0__12078);
            rule__RegionSignalDec__SignalsAssignment_3_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__Group_3_1_0__1


    // $ANTLR start rule__Signals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1003:1: rule__Signals__Group__0 : ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1 ;
    public final void rule__Signals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1007:1: ( ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1008:1: ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1008:1: ( ( rule__Signals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1009:1: ( rule__Signals__Group_0__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1010:1: ( rule__Signals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1010:2: rule__Signals__Group_0__0
            {
            pushFollow(FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__02116);
            rule__Signals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__02125);
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


    // $ANTLR start rule__Signals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1021:1: rule__Signals__Group__1 : ( ';' ) ;
    public final void rule__Signals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1025:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1026:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1026:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1027:1: ';'
            {
             before(grammarAccess.getSignalsAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Signals__Group__12154); 
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
    // $ANTLR end rule__Signals__Group__1


    // $ANTLR start rule__Signals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1044:1: rule__Signals__Group_0__0 : ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1 ;
    public final void rule__Signals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1048:1: ( ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1049:1: ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1049:1: ( ( rule__Signals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1050:1: ( rule__Signals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1051:1: ( rule__Signals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1051:2: rule__Signals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__02193);
            rule__Signals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__02202);
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


    // $ANTLR start rule__Signals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1062:1: rule__Signals__Group_0__1 : ( ( rule__Signals__Group_0_1__0 )* ) ;
    public final void rule__Signals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1066:1: ( ( ( rule__Signals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1067:1: ( ( rule__Signals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1067:1: ( ( rule__Signals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1068:1: ( rule__Signals__Group_0_1__0 )*
            {
             before(grammarAccess.getSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1069:1: ( rule__Signals__Group_0_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1069:2: rule__Signals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__12230);
            	    rule__Signals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end rule__Signals__Group_0__1


    // $ANTLR start rule__Signals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1083:1: rule__Signals__Group_0_1__0 : ( ',' ) rule__Signals__Group_0_1__1 ;
    public final void rule__Signals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1087:1: ( ( ',' ) rule__Signals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1088:1: ( ',' ) rule__Signals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1088:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1089:1: ','
            {
             before(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Signals__Group_0_1__02270); 
             after(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__02280);
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


    // $ANTLR start rule__Signals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1103:1: rule__Signals__Group_0_1__1 : ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__Signals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1107:1: ( ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1108:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1108:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1109:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1110:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1110:2: rule__Signals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__12308);
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
    // $ANTLR end rule__Signals__Group_0_1__1


    // $ANTLR start rule__InputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1124:1: rule__InputSignals__Group__0 : ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1 ;
    public final void rule__InputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1128:1: ( ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1129:1: ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1129:1: ( ( rule__InputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1130:1: ( rule__InputSignals__Group_0__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1131:1: ( rule__InputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1131:2: rule__InputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__02346);
            rule__InputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__02355);
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


    // $ANTLR start rule__InputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1142:1: rule__InputSignals__Group__1 : ( ';' ) ;
    public final void rule__InputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1146:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1147:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1147:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1148:1: ';'
            {
             before(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__InputSignals__Group__12384); 
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
    // $ANTLR end rule__InputSignals__Group__1


    // $ANTLR start rule__InputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1165:1: rule__InputSignals__Group_0__0 : ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1 ;
    public final void rule__InputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1169:1: ( ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1170:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1170:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1171:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1172:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1172:2: rule__InputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__02423);
            rule__InputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__02432);
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


    // $ANTLR start rule__InputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1183:1: rule__InputSignals__Group_0__1 : ( ( rule__InputSignals__Group_0_1__0 )* ) ;
    public final void rule__InputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1187:1: ( ( ( rule__InputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1188:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1188:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1189:1: ( rule__InputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1190:1: ( rule__InputSignals__Group_0_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1190:2: rule__InputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__12460);
            	    rule__InputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end rule__InputSignals__Group_0__1


    // $ANTLR start rule__InputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1204:1: rule__InputSignals__Group_0_1__0 : ( ',' ) rule__InputSignals__Group_0_1__1 ;
    public final void rule__InputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1208:1: ( ( ',' ) rule__InputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1209:1: ( ',' ) rule__InputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1209:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1210:1: ','
            {
             before(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,30,FOLLOW_30_in_rule__InputSignals__Group_0_1__02500); 
             after(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__02510);
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


    // $ANTLR start rule__InputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1224:1: rule__InputSignals__Group_0_1__1 : ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1228:1: ( ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1229:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1229:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1230:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1231:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1231:2: rule__InputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__12538);
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
    // $ANTLR end rule__InputSignals__Group_0_1__1


    // $ANTLR start rule__OutputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1245:1: rule__OutputSignals__Group__0 : ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1 ;
    public final void rule__OutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1249:1: ( ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1250:1: ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1250:1: ( ( rule__OutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1251:1: ( rule__OutputSignals__Group_0__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1252:1: ( rule__OutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1252:2: rule__OutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__02576);
            rule__OutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__02585);
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


    // $ANTLR start rule__OutputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1263:1: rule__OutputSignals__Group__1 : ( ';' ) ;
    public final void rule__OutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1267:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1268:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1268:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1269:1: ';'
            {
             before(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__OutputSignals__Group__12614); 
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
    // $ANTLR end rule__OutputSignals__Group__1


    // $ANTLR start rule__OutputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1286:1: rule__OutputSignals__Group_0__0 : ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1 ;
    public final void rule__OutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1290:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1291:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1291:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1292:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1293:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1293:2: rule__OutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__02653);
            rule__OutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__02662);
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


    // $ANTLR start rule__OutputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1304:1: rule__OutputSignals__Group_0__1 : ( ( rule__OutputSignals__Group_0_1__0 )* ) ;
    public final void rule__OutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1308:1: ( ( ( rule__OutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1309:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1309:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1310:1: ( rule__OutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1311:1: ( rule__OutputSignals__Group_0_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1311:2: rule__OutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__12690);
            	    rule__OutputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end rule__OutputSignals__Group_0__1


    // $ANTLR start rule__OutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1325:1: rule__OutputSignals__Group_0_1__0 : ( ',' ) rule__OutputSignals__Group_0_1__1 ;
    public final void rule__OutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1329:1: ( ( ',' ) rule__OutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1330:1: ( ',' ) rule__OutputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1330:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1331:1: ','
            {
             before(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,30,FOLLOW_30_in_rule__OutputSignals__Group_0_1__02730); 
             after(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__02740);
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


    // $ANTLR start rule__OutputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1345:1: rule__OutputSignals__Group_0_1__1 : ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__OutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1349:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1350:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1350:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1351:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1352:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1352:2: rule__OutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__12768);
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
    // $ANTLR end rule__OutputSignals__Group_0_1__1


    // $ANTLR start rule__InOutputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1366:1: rule__InOutputSignals__Group__0 : ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1 ;
    public final void rule__InOutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1370:1: ( ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1371:1: ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1371:1: ( ( rule__InOutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1372:1: ( rule__InOutputSignals__Group_0__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1373:1: ( rule__InOutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1373:2: rule__InOutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__02806);
            rule__InOutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__02815);
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


    // $ANTLR start rule__InOutputSignals__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1384:1: rule__InOutputSignals__Group__1 : ( ';' ) ;
    public final void rule__InOutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1388:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1389:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1389:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1390:1: ';'
            {
             before(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__InOutputSignals__Group__12844); 
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
    // $ANTLR end rule__InOutputSignals__Group__1


    // $ANTLR start rule__InOutputSignals__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1407:1: rule__InOutputSignals__Group_0__0 : ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1 ;
    public final void rule__InOutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1411:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1412:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1412:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1413:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1414:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1414:2: rule__InOutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__02883);
            rule__InOutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__02892);
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


    // $ANTLR start rule__InOutputSignals__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1425:1: rule__InOutputSignals__Group_0__1 : ( ( rule__InOutputSignals__Group_0_1__0 )* ) ;
    public final void rule__InOutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1429:1: ( ( ( rule__InOutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1430:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1430:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1431:1: ( rule__InOutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1432:1: ( rule__InOutputSignals__Group_0_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1432:2: rule__InOutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__12920);
            	    rule__InOutputSignals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end rule__InOutputSignals__Group_0__1


    // $ANTLR start rule__InOutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1446:1: rule__InOutputSignals__Group_0_1__0 : ( ',' ) rule__InOutputSignals__Group_0_1__1 ;
    public final void rule__InOutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1450:1: ( ( ',' ) rule__InOutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1451:1: ( ',' ) rule__InOutputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1451:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1452:1: ','
            {
             before(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,30,FOLLOW_30_in_rule__InOutputSignals__Group_0_1__02960); 
             after(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__02970);
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


    // $ANTLR start rule__InOutputSignals__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1466:1: rule__InOutputSignals__Group_0_1__1 : ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InOutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1470:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1471:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1471:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1472:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1473:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1473:2: rule__InOutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__12998);
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
    // $ANTLR end rule__InOutputSignals__Group_0_1__1


    // $ANTLR start rule__Signal__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1487:1: rule__Signal__Group_1__0 : ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1491:1: ( ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1492:1: ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1492:1: ( ( rule__Signal__NameAssignment_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1493:1: ( rule__Signal__NameAssignment_1_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1494:1: ( rule__Signal__NameAssignment_1_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1494:2: rule__Signal__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__03036);
            rule__Signal__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__03045);
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


    // $ANTLR start rule__Signal__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1505:1: rule__Signal__Group_1__1 : ( ( rule__Signal__Group_1_1__0 ) ) ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1509:1: ( ( ( rule__Signal__Group_1_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1510:1: ( ( rule__Signal__Group_1_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1510:1: ( ( rule__Signal__Group_1_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1511:1: ( rule__Signal__Group_1_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1512:1: ( rule__Signal__Group_1_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1512:2: rule__Signal__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_1_1__0_in_rule__Signal__Group_1__13073);
            rule__Signal__Group_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_1_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1526:1: rule__Signal__Group_1_1__0 : ( ':=' ) rule__Signal__Group_1_1__1 ;
    public final void rule__Signal__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1530:1: ( ( ':=' ) rule__Signal__Group_1_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1531:1: ( ':=' ) rule__Signal__Group_1_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1531:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1532:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_1_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_1_1__03112); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1_1__1_in_rule__Signal__Group_1_1__03122);
            rule__Signal__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1_1__0


    // $ANTLR start rule__Signal__Group_1_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1546:1: rule__Signal__Group_1_1__1 : ( ( rule__Signal__InitialValueAssignment_1_1_1 ) ) ;
    public final void rule__Signal__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1550:1: ( ( ( rule__Signal__InitialValueAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1551:1: ( ( rule__Signal__InitialValueAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1551:1: ( ( rule__Signal__InitialValueAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1552:1: ( rule__Signal__InitialValueAssignment_1_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_1_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1553:1: ( rule__Signal__InitialValueAssignment_1_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1553:2: rule__Signal__InitialValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_1_1_1_in_rule__Signal__Group_1_1__13150);
            rule__Signal__InitialValueAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_1_1__1


    // $ANTLR start rule__Signal__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1567:1: rule__Signal__Group_2__0 : ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1571:1: ( ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1572:1: ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1572:1: ( ( rule__Signal__NameAssignment_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1573:1: ( rule__Signal__NameAssignment_2_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1574:1: ( rule__Signal__NameAssignment_2_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1574:2: rule__Signal__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__03188);
            rule__Signal__NameAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__03197);
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


    // $ANTLR start rule__Signal__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1585:1: rule__Signal__Group_2__1 : ( ( rule__Signal__Group_2_1__0 ) ) rule__Signal__Group_2__2 ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1589:1: ( ( ( rule__Signal__Group_2_1__0 ) ) rule__Signal__Group_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1590:1: ( ( rule__Signal__Group_2_1__0 ) ) rule__Signal__Group_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1590:1: ( ( rule__Signal__Group_2_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1591:1: ( rule__Signal__Group_2_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1592:1: ( rule__Signal__Group_2_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1592:2: rule__Signal__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__13225);
            rule__Signal__Group_2_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_2_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_2__2_in_rule__Signal__Group_2__13234);
            rule__Signal__Group_2__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Signal__Group_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1603:1: rule__Signal__Group_2__2 : ( ( rule__Signal__TypeAssignment_2_2 ) ) ;
    public final void rule__Signal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1607:1: ( ( ( rule__Signal__TypeAssignment_2_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1608:1: ( ( rule__Signal__TypeAssignment_2_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1608:1: ( ( rule__Signal__TypeAssignment_2_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1609:1: ( rule__Signal__TypeAssignment_2_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_2_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1610:1: ( rule__Signal__TypeAssignment_2_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1610:2: rule__Signal__TypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_2_2_in_rule__Signal__Group_2__23262);
            rule__Signal__TypeAssignment_2_2();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_2__2


    // $ANTLR start rule__Signal__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1626:1: rule__Signal__Group_2_1__0 : ( ':=' ) rule__Signal__Group_2_1__1 ;
    public final void rule__Signal__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1630:1: ( ( ':=' ) rule__Signal__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1631:1: ( ':=' ) rule__Signal__Group_2_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1631:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1632:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_2_1__03303); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__03313);
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


    // $ANTLR start rule__Signal__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1646:1: rule__Signal__Group_2_1__1 : ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) ;
    public final void rule__Signal__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1650:1: ( ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1651:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1651:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1652:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1653:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1653:2: rule__Signal__InitialValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__13341);
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
    // $ANTLR end rule__Signal__Group_2_1__1


    // $ANTLR start rule__Signal__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1667:1: rule__Signal__Group_3__0 : ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1671:1: ( ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1672:1: ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1672:1: ( ( rule__Signal__NameAssignment_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1673:1: ( rule__Signal__NameAssignment_3_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1674:1: ( rule__Signal__NameAssignment_3_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1674:2: rule__Signal__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__03379);
            rule__Signal__NameAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__03388);
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


    // $ANTLR start rule__Signal__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1685:1: rule__Signal__Group_3__1 : ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2 ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1689:1: ( ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1690:1: ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1690:1: ( ( rule__Signal__Group_3_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1691:1: ( rule__Signal__Group_3_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1692:1: ( rule__Signal__Group_3_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1692:2: rule__Signal__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__13416);
            rule__Signal__Group_3_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_3_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__13425);
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


    // $ANTLR start rule__Signal__Group_3__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1703:1: rule__Signal__Group_3__2 : ( ( rule__Signal__Group_3_2__0 ) ) ;
    public final void rule__Signal__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1707:1: ( ( ( rule__Signal__Group_3_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1708:1: ( ( rule__Signal__Group_3_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1708:1: ( ( rule__Signal__Group_3_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1709:1: ( rule__Signal__Group_3_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_3_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1710:1: ( rule__Signal__Group_3_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1710:2: rule__Signal__Group_3_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_2__0_in_rule__Signal__Group_3__23453);
            rule__Signal__Group_3_2__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_3_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1726:1: rule__Signal__Group_3_1__0 : ( ':=' ) rule__Signal__Group_3_1__1 ;
    public final void rule__Signal__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1730:1: ( ( ':=' ) rule__Signal__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1731:1: ( ':=' ) rule__Signal__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1731:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1732:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_3_1__03494); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__03504);
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


    // $ANTLR start rule__Signal__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1746:1: rule__Signal__Group_3_1__1 : ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) ;
    public final void rule__Signal__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1750:1: ( ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1751:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1751:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1752:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_3_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1753:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1753:2: rule__Signal__InitialValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__13532);
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
    // $ANTLR end rule__Signal__Group_3_1__1


    // $ANTLR start rule__Signal__Group_3_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1767:1: rule__Signal__Group_3_2__0 : ( 'combine' ) rule__Signal__Group_3_2__1 ;
    public final void rule__Signal__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1771:1: ( ( 'combine' ) rule__Signal__Group_3_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1772:1: ( 'combine' ) rule__Signal__Group_3_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1772:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1773:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_3_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Signal__Group_3_2__03571); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_3_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3_2__1_in_rule__Signal__Group_3_2__03581);
            rule__Signal__Group_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_2__0


    // $ANTLR start rule__Signal__Group_3_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1787:1: rule__Signal__Group_3_2__1 : ( ( rule__Signal__TypeAssignment_3_2_1 ) ) rule__Signal__Group_3_2__2 ;
    public final void rule__Signal__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1791:1: ( ( ( rule__Signal__TypeAssignment_3_2_1 ) ) rule__Signal__Group_3_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1792:1: ( ( rule__Signal__TypeAssignment_3_2_1 ) ) rule__Signal__Group_3_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1792:1: ( ( rule__Signal__TypeAssignment_3_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1793:1: ( rule__Signal__TypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_3_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1794:1: ( rule__Signal__TypeAssignment_3_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1794:2: rule__Signal__TypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_3_2_1_in_rule__Signal__Group_3_2__13609);
            rule__Signal__TypeAssignment_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_3_2_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3_2__2_in_rule__Signal__Group_3_2__13618);
            rule__Signal__Group_3_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_2__1


    // $ANTLR start rule__Signal__Group_3_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1805:1: rule__Signal__Group_3_2__2 : ( 'with' ) rule__Signal__Group_3_2__3 ;
    public final void rule__Signal__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1809:1: ( ( 'with' ) rule__Signal__Group_3_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1810:1: ( 'with' ) rule__Signal__Group_3_2__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1810:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1811:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_3_2_2()); 
            match(input,33,FOLLOW_33_in_rule__Signal__Group_3_2__23647); 
             after(grammarAccess.getSignalAccess().getWithKeyword_3_2_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3_2__3_in_rule__Signal__Group_3_2__23657);
            rule__Signal__Group_3_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_2__2


    // $ANTLR start rule__Signal__Group_3_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1825:1: rule__Signal__Group_3_2__3 : ( ( rule__Signal__CombineOperatorAssignment_3_2_3 ) ) ;
    public final void rule__Signal__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1829:1: ( ( ( rule__Signal__CombineOperatorAssignment_3_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1830:1: ( ( rule__Signal__CombineOperatorAssignment_3_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1830:1: ( ( rule__Signal__CombineOperatorAssignment_3_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1831:1: ( rule__Signal__CombineOperatorAssignment_3_2_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_3_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1832:1: ( rule__Signal__CombineOperatorAssignment_3_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1832:2: rule__Signal__CombineOperatorAssignment_3_2_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_3_2_3_in_rule__Signal__Group_3_2__33685);
            rule__Signal__CombineOperatorAssignment_3_2_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getCombineOperatorAssignment_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_3_2__3


    // $ANTLR start rule__Signal__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1850:1: rule__Signal__Group_4__0 : ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1854:1: ( ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1855:1: ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1855:1: ( ( rule__Signal__NameAssignment_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1856:1: ( rule__Signal__NameAssignment_4_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1857:1: ( rule__Signal__NameAssignment_4_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1857:2: rule__Signal__NameAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__03727);
            rule__Signal__NameAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__03736);
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


    // $ANTLR start rule__Signal__Group_4__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1868:1: rule__Signal__Group_4__1 : ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2 ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1872:1: ( ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1873:1: ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1873:1: ( ( rule__Signal__Group_4_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1874:1: ( rule__Signal__Group_4_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1875:1: ( rule__Signal__Group_4_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1875:2: rule__Signal__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__13764);
            rule__Signal__Group_4_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_4_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__13773);
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


    // $ANTLR start rule__Signal__Group_4__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1886:1: rule__Signal__Group_4__2 : ( ( rule__Signal__HostTypeAssignment_4_2 ) ) ;
    public final void rule__Signal__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1890:1: ( ( ( rule__Signal__HostTypeAssignment_4_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1891:1: ( ( rule__Signal__HostTypeAssignment_4_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1891:1: ( ( rule__Signal__HostTypeAssignment_4_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1892:1: ( rule__Signal__HostTypeAssignment_4_2 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_4_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1893:1: ( rule__Signal__HostTypeAssignment_4_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1893:2: rule__Signal__HostTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_4_2_in_rule__Signal__Group_4__23801);
            rule__Signal__HostTypeAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_4_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_4_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1909:1: rule__Signal__Group_4_1__0 : ( ':=' ) rule__Signal__Group_4_1__1 ;
    public final void rule__Signal__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1913:1: ( ( ':=' ) rule__Signal__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1914:1: ( ':=' ) rule__Signal__Group_4_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1914:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1915:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_4_1__03842); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__03852);
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


    // $ANTLR start rule__Signal__Group_4_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1929:1: rule__Signal__Group_4_1__1 : ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) ;
    public final void rule__Signal__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1933:1: ( ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1934:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1934:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1935:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_4_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1936:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1936:2: rule__Signal__InitialValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__13880);
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
    // $ANTLR end rule__Signal__Group_4_1__1


    // $ANTLR start rule__Signal__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1950:1: rule__Signal__Group_5__0 : ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1 ;
    public final void rule__Signal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1954:1: ( ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1955:1: ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1955:1: ( ( rule__Signal__NameAssignment_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1956:1: ( rule__Signal__NameAssignment_5_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1957:1: ( rule__Signal__NameAssignment_5_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1957:2: rule__Signal__NameAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__03918);
            rule__Signal__NameAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__03927);
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


    // $ANTLR start rule__Signal__Group_5__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1968:1: rule__Signal__Group_5__1 : ( ( rule__Signal__Group_5_1__0 ) ) rule__Signal__Group_5__2 ;
    public final void rule__Signal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1972:1: ( ( ( rule__Signal__Group_5_1__0 ) ) rule__Signal__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1973:1: ( ( rule__Signal__Group_5_1__0 ) ) rule__Signal__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1973:1: ( ( rule__Signal__Group_5_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1974:1: ( rule__Signal__Group_5_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_5_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1975:1: ( rule__Signal__Group_5_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1975:2: rule__Signal__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_5_1__0_in_rule__Signal__Group_5__13955);
            rule__Signal__Group_5_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_5_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__13964);
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


    // $ANTLR start rule__Signal__Group_5__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1986:1: rule__Signal__Group_5__2 : ( ( rule__Signal__Group_5_2__0 ) ) ;
    public final void rule__Signal__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1990:1: ( ( ( rule__Signal__Group_5_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1991:1: ( ( rule__Signal__Group_5_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1991:1: ( ( rule__Signal__Group_5_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1992:1: ( rule__Signal__Group_5_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_5_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1993:1: ( rule__Signal__Group_5_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:1993:2: rule__Signal__Group_5_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_5_2__0_in_rule__Signal__Group_5__23992);
            rule__Signal__Group_5_2__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_5_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__Group_5_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2009:1: rule__Signal__Group_5_1__0 : ( ':=' ) rule__Signal__Group_5_1__1 ;
    public final void rule__Signal__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2013:1: ( ( ':=' ) rule__Signal__Group_5_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2014:1: ( ':=' ) rule__Signal__Group_5_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2014:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2015:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_5_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_5_1__04033); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_5_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5_1__1_in_rule__Signal__Group_5_1__04043);
            rule__Signal__Group_5_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_1__0


    // $ANTLR start rule__Signal__Group_5_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2029:1: rule__Signal__Group_5_1__1 : ( ( rule__Signal__InitialValueAssignment_5_1_1 ) ) ;
    public final void rule__Signal__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2033:1: ( ( ( rule__Signal__InitialValueAssignment_5_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2034:1: ( ( rule__Signal__InitialValueAssignment_5_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2034:1: ( ( rule__Signal__InitialValueAssignment_5_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2035:1: ( rule__Signal__InitialValueAssignment_5_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_5_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2036:1: ( rule__Signal__InitialValueAssignment_5_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2036:2: rule__Signal__InitialValueAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_5_1_1_in_rule__Signal__Group_5_1__14071);
            rule__Signal__InitialValueAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getInitialValueAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_1__1


    // $ANTLR start rule__Signal__Group_5_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2050:1: rule__Signal__Group_5_2__0 : ( 'combine' ) rule__Signal__Group_5_2__1 ;
    public final void rule__Signal__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2054:1: ( ( 'combine' ) rule__Signal__Group_5_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2055:1: ( 'combine' ) rule__Signal__Group_5_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2055:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2056:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_5_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Signal__Group_5_2__04110); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_5_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5_2__1_in_rule__Signal__Group_5_2__04120);
            rule__Signal__Group_5_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_2__0


    // $ANTLR start rule__Signal__Group_5_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2070:1: rule__Signal__Group_5_2__1 : ( ( rule__Signal__HostTypeAssignment_5_2_1 ) ) rule__Signal__Group_5_2__2 ;
    public final void rule__Signal__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2074:1: ( ( ( rule__Signal__HostTypeAssignment_5_2_1 ) ) rule__Signal__Group_5_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2075:1: ( ( rule__Signal__HostTypeAssignment_5_2_1 ) ) rule__Signal__Group_5_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2075:1: ( ( rule__Signal__HostTypeAssignment_5_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2076:1: ( rule__Signal__HostTypeAssignment_5_2_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_5_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2077:1: ( rule__Signal__HostTypeAssignment_5_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2077:2: rule__Signal__HostTypeAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_5_2_1_in_rule__Signal__Group_5_2__14148);
            rule__Signal__HostTypeAssignment_5_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_5_2_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5_2__2_in_rule__Signal__Group_5_2__14157);
            rule__Signal__Group_5_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_2__1


    // $ANTLR start rule__Signal__Group_5_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2088:1: rule__Signal__Group_5_2__2 : ( 'with' ) rule__Signal__Group_5_2__3 ;
    public final void rule__Signal__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2092:1: ( ( 'with' ) rule__Signal__Group_5_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2093:1: ( 'with' ) rule__Signal__Group_5_2__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2093:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2094:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_5_2_2()); 
            match(input,33,FOLLOW_33_in_rule__Signal__Group_5_2__24186); 
             after(grammarAccess.getSignalAccess().getWithKeyword_5_2_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5_2__3_in_rule__Signal__Group_5_2__24196);
            rule__Signal__Group_5_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_2__2


    // $ANTLR start rule__Signal__Group_5_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2108:1: rule__Signal__Group_5_2__3 : ( ( rule__Signal__HostCombineOperatorAssignment_5_2_3 ) ) ;
    public final void rule__Signal__Group_5_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2112:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_5_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2113:1: ( ( rule__Signal__HostCombineOperatorAssignment_5_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2113:1: ( ( rule__Signal__HostCombineOperatorAssignment_5_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2114:1: ( rule__Signal__HostCombineOperatorAssignment_5_2_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_5_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2115:1: ( rule__Signal__HostCombineOperatorAssignment_5_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2115:2: rule__Signal__HostCombineOperatorAssignment_5_2_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_5_2_3_in_rule__Signal__Group_5_2__34224);
            rule__Signal__HostCombineOperatorAssignment_5_2_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_5_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_5_2__3


    // $ANTLR start rule__Signal__Group_6__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2133:1: rule__Signal__Group_6__0 : ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1 ;
    public final void rule__Signal__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2137:1: ( ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2138:1: ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2138:1: ( ( rule__Signal__NameAssignment_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2139:1: ( rule__Signal__NameAssignment_6_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2140:1: ( rule__Signal__NameAssignment_6_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2140:2: rule__Signal__NameAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__04266);
            rule__Signal__NameAssignment_6_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__04275);
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


    // $ANTLR start rule__Signal__Group_6__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2151:1: rule__Signal__Group_6__1 : ( ( rule__Signal__Group_6_1__0 ) ) ;
    public final void rule__Signal__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2155:1: ( ( ( rule__Signal__Group_6_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2156:1: ( ( rule__Signal__Group_6_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2156:1: ( ( rule__Signal__Group_6_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2157:1: ( rule__Signal__Group_6_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_6_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2158:1: ( rule__Signal__Group_6_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2158:2: rule__Signal__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__14303);
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
    // $ANTLR end rule__Signal__Group_6__1


    // $ANTLR start rule__Signal__Group_6_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2172:1: rule__Signal__Group_6_1__0 : ( 'combine' ) rule__Signal__Group_6_1__1 ;
    public final void rule__Signal__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2176:1: ( ( 'combine' ) rule__Signal__Group_6_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2177:1: ( 'combine' ) rule__Signal__Group_6_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2177:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2178:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_6_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Signal__Group_6_1__04342); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_6_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__04352);
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


    // $ANTLR start rule__Signal__Group_6_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2192:1: rule__Signal__Group_6_1__1 : ( ( rule__Signal__TypeAssignment_6_1_1 ) ) rule__Signal__Group_6_1__2 ;
    public final void rule__Signal__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2196:1: ( ( ( rule__Signal__TypeAssignment_6_1_1 ) ) rule__Signal__Group_6_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2197:1: ( ( rule__Signal__TypeAssignment_6_1_1 ) ) rule__Signal__Group_6_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2197:1: ( ( rule__Signal__TypeAssignment_6_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2198:1: ( rule__Signal__TypeAssignment_6_1_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_6_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2199:1: ( rule__Signal__TypeAssignment_6_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2199:2: rule__Signal__TypeAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_6_1_1_in_rule__Signal__Group_6_1__14380);
            rule__Signal__TypeAssignment_6_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_6_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6_1__2_in_rule__Signal__Group_6_1__14389);
            rule__Signal__Group_6_1__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Signal__Group_6_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2210:1: rule__Signal__Group_6_1__2 : ( 'with' ) rule__Signal__Group_6_1__3 ;
    public final void rule__Signal__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2214:1: ( ( 'with' ) rule__Signal__Group_6_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2215:1: ( 'with' ) rule__Signal__Group_6_1__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2215:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2216:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_6_1_2()); 
            match(input,33,FOLLOW_33_in_rule__Signal__Group_6_1__24418); 
             after(grammarAccess.getSignalAccess().getWithKeyword_6_1_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6_1__3_in_rule__Signal__Group_6_1__24428);
            rule__Signal__Group_6_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__2


    // $ANTLR start rule__Signal__Group_6_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2230:1: rule__Signal__Group_6_1__3 : ( ( rule__Signal__CombineOperatorAssignment_6_1_3 ) ) ;
    public final void rule__Signal__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2234:1: ( ( ( rule__Signal__CombineOperatorAssignment_6_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2235:1: ( ( rule__Signal__CombineOperatorAssignment_6_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2235:1: ( ( rule__Signal__CombineOperatorAssignment_6_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2236:1: ( rule__Signal__CombineOperatorAssignment_6_1_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_6_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2237:1: ( rule__Signal__CombineOperatorAssignment_6_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2237:2: rule__Signal__CombineOperatorAssignment_6_1_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_6_1_3_in_rule__Signal__Group_6_1__34456);
            rule__Signal__CombineOperatorAssignment_6_1_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getCombineOperatorAssignment_6_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_6_1__3


    // $ANTLR start rule__Signal__Group_7__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2255:1: rule__Signal__Group_7__0 : ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1 ;
    public final void rule__Signal__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2259:1: ( ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2260:1: ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2260:1: ( ( rule__Signal__NameAssignment_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2261:1: ( rule__Signal__NameAssignment_7_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2262:1: ( rule__Signal__NameAssignment_7_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2262:2: rule__Signal__NameAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__04498);
            rule__Signal__NameAssignment_7_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__04507);
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


    // $ANTLR start rule__Signal__Group_7__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2273:1: rule__Signal__Group_7__1 : ( ( rule__Signal__Group_7_1__0 ) ) ;
    public final void rule__Signal__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2277:1: ( ( ( rule__Signal__Group_7_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2278:1: ( ( rule__Signal__Group_7_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2278:1: ( ( rule__Signal__Group_7_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2279:1: ( rule__Signal__Group_7_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_7_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2280:1: ( rule__Signal__Group_7_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2280:2: rule__Signal__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__14535);
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
    // $ANTLR end rule__Signal__Group_7__1


    // $ANTLR start rule__Signal__Group_7_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2294:1: rule__Signal__Group_7_1__0 : ( 'combine' ) rule__Signal__Group_7_1__1 ;
    public final void rule__Signal__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2298:1: ( ( 'combine' ) rule__Signal__Group_7_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2299:1: ( 'combine' ) rule__Signal__Group_7_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2299:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2300:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_7_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Signal__Group_7_1__04574); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__04584);
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


    // $ANTLR start rule__Signal__Group_7_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2314:1: rule__Signal__Group_7_1__1 : ( ( rule__Signal__HostTypeAssignment_7_1_1 ) ) rule__Signal__Group_7_1__2 ;
    public final void rule__Signal__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2318:1: ( ( ( rule__Signal__HostTypeAssignment_7_1_1 ) ) rule__Signal__Group_7_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2319:1: ( ( rule__Signal__HostTypeAssignment_7_1_1 ) ) rule__Signal__Group_7_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2319:1: ( ( rule__Signal__HostTypeAssignment_7_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2320:1: ( rule__Signal__HostTypeAssignment_7_1_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_7_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2321:1: ( rule__Signal__HostTypeAssignment_7_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2321:2: rule__Signal__HostTypeAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_7_1_1_in_rule__Signal__Group_7_1__14612);
            rule__Signal__HostTypeAssignment_7_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_7_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_1__2_in_rule__Signal__Group_7_1__14621);
            rule__Signal__Group_7_1__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Signal__Group_7_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2332:1: rule__Signal__Group_7_1__2 : ( 'with' ) rule__Signal__Group_7_1__3 ;
    public final void rule__Signal__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2336:1: ( ( 'with' ) rule__Signal__Group_7_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2337:1: ( 'with' ) rule__Signal__Group_7_1__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2337:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2338:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_7_1_2()); 
            match(input,33,FOLLOW_33_in_rule__Signal__Group_7_1__24650); 
             after(grammarAccess.getSignalAccess().getWithKeyword_7_1_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_1__3_in_rule__Signal__Group_7_1__24660);
            rule__Signal__Group_7_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__2


    // $ANTLR start rule__Signal__Group_7_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2352:1: rule__Signal__Group_7_1__3 : ( ( rule__Signal__HostCombineOperatorAssignment_7_1_3 ) ) ;
    public final void rule__Signal__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2356:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_7_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2357:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2357:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2358:1: ( rule__Signal__HostCombineOperatorAssignment_7_1_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_7_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2359:1: ( rule__Signal__HostCombineOperatorAssignment_7_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2359:2: rule__Signal__HostCombineOperatorAssignment_7_1_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_1_3_in_rule__Signal__Group_7_1__34688);
            rule__Signal__HostCombineOperatorAssignment_7_1_3();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_7_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__Group_7_1__3


    // $ANTLR start rule__Variable__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2377:1: rule__Variable__Group__0 : ( 'var' ) rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2381:1: ( ( 'var' ) rule__Variable__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2382:1: ( 'var' ) rule__Variable__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2382:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2383:1: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Variable__Group__04731); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04741);
            rule__Variable__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__0


    // $ANTLR start rule__Variable__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2397:1: rule__Variable__Group__1 : ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2401:1: ( ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2402:1: ( ( rule__Variable__NameAssignment_1 ) ) rule__Variable__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2402:1: ( ( rule__Variable__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2403:1: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2404:1: ( rule__Variable__NameAssignment_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2404:2: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__14769);
            rule__Variable__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14778);
            rule__Variable__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__1


    // $ANTLR start rule__Variable__Group__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2415:1: rule__Variable__Group__2 : ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2419:1: ( ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2420:1: ( ( rule__Variable__Group_2__0 )? ) rule__Variable__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2420:1: ( ( rule__Variable__Group_2__0 )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2421:1: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2422:1: ( rule__Variable__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2422:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__24806);
                    rule__Variable__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__24816);
            rule__Variable__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__2


    // $ANTLR start rule__Variable__Group__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2433:1: rule__Variable__Group__3 : ( ( rule__Variable__TypeAssignment_3 )? ) rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2437:1: ( ( ( rule__Variable__TypeAssignment_3 )? ) rule__Variable__Group__4 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2438:1: ( ( rule__Variable__TypeAssignment_3 )? ) rule__Variable__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2438:1: ( ( rule__Variable__TypeAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2439:1: ( rule__Variable__TypeAssignment_3 )?
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2440:1: ( rule__Variable__TypeAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=16)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2440:2: rule__Variable__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Variable__TypeAssignment_3_in_rule__Variable__Group__34844);
                    rule__Variable__TypeAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__34854);
            rule__Variable__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__3


    // $ANTLR start rule__Variable__Group__4
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2451:1: rule__Variable__Group__4 : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2455:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2456:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2456:1: ( ( rule__Variable__Group_4__0 )? )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2457:1: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2458:1: ( rule__Variable__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2458:2: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Group__44882);
                    rule__Variable__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__Group__4


    // $ANTLR start rule__Variable__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2478:1: rule__Variable__Group_2__0 : ( ':=' ) rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2482:1: ( ( ':=' ) rule__Variable__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2483:1: ( ':=' ) rule__Variable__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2483:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2484:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_2__04928); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__04938);
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


    // $ANTLR start rule__Variable__Group_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2498:1: rule__Variable__Group_2__1 : ( ( rule__Variable__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2502:1: ( ( ( rule__Variable__InitialValueAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2503:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2503:1: ( ( rule__Variable__InitialValueAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2504:1: ( rule__Variable__InitialValueAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2505:1: ( rule__Variable__InitialValueAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2505:2: rule__Variable__InitialValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__14966);
            rule__Variable__InitialValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Variable__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2519:1: rule__Variable__Group_4__0 : ( 'host' ) rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2523:1: ( ( 'host' ) rule__Variable__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2524:1: ( 'host' ) rule__Variable__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2524:1: ( 'host' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2525:1: 'host'
            {
             before(grammarAccess.getVariableAccess().getHostKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Variable__Group_4__05005); 
             after(grammarAccess.getVariableAccess().getHostKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__05015);
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


    // $ANTLR start rule__Variable__Group_4__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2539:1: rule__Variable__Group_4__1 : ( ( rule__Variable__HostTypeAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2543:1: ( ( ( rule__Variable__HostTypeAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2544:1: ( ( rule__Variable__HostTypeAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2544:1: ( ( rule__Variable__HostTypeAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2545:1: ( rule__Variable__HostTypeAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getHostTypeAssignment_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2546:1: ( rule__Variable__HostTypeAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2546:2: rule__Variable__HostTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Variable__HostTypeAssignment_4_1_in_rule__Variable__Group_4__15043);
            rule__Variable__HostTypeAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getHostTypeAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start rule__StateExtend__InputSignalsAssignment_0_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2560:1: rule__StateExtend__InputSignalsAssignment_0_1 : ( ruleInputSignals ) ;
    public final void rule__StateExtend__InputSignalsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2564:1: ( ( ruleInputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2565:1: ( ruleInputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2565:1: ( ruleInputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2566:1: ruleInputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_0_15081);
            ruleInputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__InputSignalsAssignment_0_1


    // $ANTLR start rule__StateExtend__OutputSignalsAssignment_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2575:1: rule__StateExtend__OutputSignalsAssignment_1_1 : ( ruleOutputSignals ) ;
    public final void rule__StateExtend__OutputSignalsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2579:1: ( ( ruleOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2580:1: ( ruleOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2580:1: ( ruleOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2581:1: ruleOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_1_15112);
            ruleOutputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__OutputSignalsAssignment_1_1


    // $ANTLR start rule__StateExtend__InOutputSignalsAssignment_2_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2590:1: rule__StateExtend__InOutputSignalsAssignment_2_2 : ( ruleInOutputSignals ) ;
    public final void rule__StateExtend__InOutputSignalsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2594:1: ( ( ruleInOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2595:1: ( ruleInOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2595:1: ( ruleInOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2596:1: ruleInOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_2_25143);
            ruleInOutputSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__InOutputSignalsAssignment_2_2


    // $ANTLR start rule__StateExtend__SignalsAssignment_3_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2605:1: rule__StateExtend__SignalsAssignment_3_1 : ( ruleSignals ) ;
    public final void rule__StateExtend__SignalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2609:1: ( ( ruleSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2610:1: ( ruleSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2610:1: ( ruleSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2611:1: ruleSignals
            {
             before(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_3_15174);
            ruleSignals();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__SignalsAssignment_3_1


    // $ANTLR start rule__StateExtend__RegionsAssignment_4
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2620:1: rule__StateExtend__RegionsAssignment_4 : ( ruleRegionSignalDec ) ;
    public final void rule__StateExtend__RegionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2624:1: ( ( ruleRegionSignalDec ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2625:1: ( ruleRegionSignalDec )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2625:1: ( ruleRegionSignalDec )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2626:1: ruleRegionSignalDec
            {
             before(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_45205);
            ruleRegionSignalDec();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__RegionsAssignment_4


    // $ANTLR start rule__RegionSignalDec__RegionAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2635:1: rule__RegionSignalDec__RegionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RegionSignalDec__RegionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2639:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2640:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2640:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2641:1: ( RULE_ID )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2642:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2643:1: RULE_ID
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_05240); 
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


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_2_0_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2654:1: rule__RegionSignalDec__SignalsAssignment_2_0_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2658:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2659:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2659:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2660:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_0_15275);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_2_0_1


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2669:1: rule__RegionSignalDec__VarsAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2673:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2674:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2674:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2675:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_15306);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_2_1


    // $ANTLR start rule__RegionSignalDec__SignalsAssignment_3_1_0_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2684:1: rule__RegionSignalDec__SignalsAssignment_3_1_0_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_3_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2688:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2689:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2689:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2690:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_0_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_0_15337);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__SignalsAssignment_3_1_0_1


    // $ANTLR start rule__RegionSignalDec__VarsAssignment_3_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2699:1: rule__RegionSignalDec__VarsAssignment_3_1_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2703:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2704:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2704:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2705:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_1_15368);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RegionSignalDec__VarsAssignment_3_1_1


    // $ANTLR start rule__Signals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2714:1: rule__Signals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2718:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2719:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2719:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2720:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_05399);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2729:1: rule__Signals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2733:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2734:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2734:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2735:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_15430);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2744:1: rule__InputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2748:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2749:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2749:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2750:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_05461);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2759:1: rule__InputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2763:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2764:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2764:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2765:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_15492);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2774:1: rule__OutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2778:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2779:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2779:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2780:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_05523);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2789:1: rule__OutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2793:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2794:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2794:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2795:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_15554);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2804:1: rule__InOutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2808:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2809:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2809:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2810:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_05585);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2819:1: rule__InOutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2823:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2824:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2824:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2825:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_15616);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2834:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2838:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2839:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2839:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2840:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_05647); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2849:1: rule__Signal__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2853:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2854:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2854:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2855:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_05678); 
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


    // $ANTLR start rule__Signal__InitialValueAssignment_1_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2864:1: rule__Signal__InitialValueAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__InitialValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2868:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2869:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2869:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2870:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_1_1_15709); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_1_1_1


    // $ANTLR start rule__Signal__NameAssignment_2_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2879:1: rule__Signal__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2883:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2884:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2884:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2885:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_05740); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2894:1: rule__Signal__InitialValueAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__InitialValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2898:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2899:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2899:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2900:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_2_1_15771); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__TypeAssignment_2_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2909:1: rule__Signal__TypeAssignment_2_2 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2913:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2914:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2914:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2915:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_2_25802);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_2_2


    // $ANTLR start rule__Signal__NameAssignment_3_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2924:1: rule__Signal__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2928:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2929:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2929:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2930:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_05833); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2939:1: rule__Signal__InitialValueAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__InitialValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2943:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2944:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2944:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2945:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_3_1_15864); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__TypeAssignment_3_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2954:1: rule__Signal__TypeAssignment_3_2_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2958:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2959:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2959:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2960:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_2_15895);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_3_2_1


    // $ANTLR start rule__Signal__CombineOperatorAssignment_3_2_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2969:1: rule__Signal__CombineOperatorAssignment_3_2_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_3_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2973:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2974:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2974:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2975:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_2_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_3_2_35926);
            ruleCombineOperator();
            _fsp--;

             after(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__CombineOperatorAssignment_3_2_3


    // $ANTLR start rule__Signal__NameAssignment_4_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2984:1: rule__Signal__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2988:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2989:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2989:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2990:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_05957); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:2999:1: rule__Signal__InitialValueAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__InitialValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3003:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3004:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3004:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3005:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_4_1_15988); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_4_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Signal__HostTypeAssignment_4_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3014:1: rule__Signal__HostTypeAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Signal__HostTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3018:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3019:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3019:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3020:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_4_26019); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_4_2


    // $ANTLR start rule__Signal__NameAssignment_5_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3029:1: rule__Signal__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3033:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3034:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3034:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3035:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_06050); 
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


    // $ANTLR start rule__Signal__InitialValueAssignment_5_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3044:1: rule__Signal__InitialValueAssignment_5_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__InitialValueAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3048:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3049:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3049:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3050:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_5_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_5_1_16081); 
             after(grammarAccess.getSignalAccess().getInitialValueSTRINGTerminalRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__InitialValueAssignment_5_1_1


    // $ANTLR start rule__Signal__HostTypeAssignment_5_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3059:1: rule__Signal__HostTypeAssignment_5_2_1 : ( RULE_STRING ) ;
    public final void rule__Signal__HostTypeAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3063:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3064:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3064:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3065:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_5_2_16112); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_5_2_1


    // $ANTLR start rule__Signal__HostCombineOperatorAssignment_5_2_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3074:1: rule__Signal__HostCombineOperatorAssignment_5_2_3 : ( RULE_STRING ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_5_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3078:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3079:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3079:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3080:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_5_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__HostCombineOperatorAssignment_5_2_36143); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_5_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostCombineOperatorAssignment_5_2_3


    // $ANTLR start rule__Signal__NameAssignment_6_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3089:1: rule__Signal__NameAssignment_6_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3093:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3094:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3094:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3095:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_06174); 
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


    // $ANTLR start rule__Signal__TypeAssignment_6_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3104:1: rule__Signal__TypeAssignment_6_1_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3108:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3109:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3109:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3110:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_6_1_16205);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__TypeAssignment_6_1_1


    // $ANTLR start rule__Signal__CombineOperatorAssignment_6_1_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3119:1: rule__Signal__CombineOperatorAssignment_6_1_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_6_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3123:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3124:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3124:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3125:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_6_1_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_6_1_36236);
            ruleCombineOperator();
            _fsp--;

             after(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_6_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__CombineOperatorAssignment_6_1_3


    // $ANTLR start rule__Signal__NameAssignment_7_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3134:1: rule__Signal__NameAssignment_7_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3138:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3139:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3139:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3140:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_06267); 
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


    // $ANTLR start rule__Signal__HostTypeAssignment_7_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3149:1: rule__Signal__HostTypeAssignment_7_1_1 : ( RULE_STRING ) ;
    public final void rule__Signal__HostTypeAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3153:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3154:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3154:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3155:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_7_1_16298); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostTypeAssignment_7_1_1


    // $ANTLR start rule__Signal__HostCombineOperatorAssignment_7_1_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3164:1: rule__Signal__HostCombineOperatorAssignment_7_1_3 : ( RULE_STRING ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_7_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3168:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3169:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3169:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3170:1: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_7_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Signal__HostCombineOperatorAssignment_7_1_36329); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_7_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Signal__HostCombineOperatorAssignment_7_1_3


    // $ANTLR start rule__Variable__NameAssignment_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3179:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3183:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3184:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3184:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3185:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_16360); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__NameAssignment_1


    // $ANTLR start rule__Variable__InitialValueAssignment_2_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3194:1: rule__Variable__InitialValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Variable__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3198:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3199:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3199:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3200:1: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Variable__InitialValueAssignment_2_16391); 
             after(grammarAccess.getVariableAccess().getInitialValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__InitialValueAssignment_2_1


    // $ANTLR start rule__Variable__TypeAssignment_3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3209:1: rule__Variable__TypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3213:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3214:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3214:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3215:1: ruleValueType
            {
             before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_36422);
            ruleValueType();
            _fsp--;

             after(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__TypeAssignment_3


    // $ANTLR start rule__Variable__HostTypeAssignment_4_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3224:1: rule__Variable__HostTypeAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Variable__HostTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3228:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3229:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3229:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/contentassist/antlr/internal/InternalInterfaceDecl.g:3230:1: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Variable__HostTypeAssignment_4_16453); 
             after(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Variable__HostTypeAssignment_4_1


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend97 = new BitSet(new long[]{0x000000000E000012L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend109 = new BitSet(new long[]{0x000000000E000012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__0_in_ruleRegionSignalDec173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group__0_in_ruleSignals234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_0__0_in_rule__StateExtend__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__RegionsAssignment_4_in_rule__StateExtend__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_2_1_in_rule__RegionSignalDec__Alternatives_2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_0__0_in_rule__RegionSignalDec__Alternatives_3_1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_3_1_1_in_rule__RegionSignalDec__Alternatives_3_1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ValueType__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ValueType__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ValueType__Alternatives1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ValueType__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ValueType__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValueType__Alternatives1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CombineOperator__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CombineOperator__Alternatives1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CombineOperator__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CombineOperator__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CombineOperator__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CombineOperator__Alternatives1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CombineOperator__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CombineOperator__Alternatives1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateExtend__Group_0__01340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_0__1_in_rule__StateExtend__Group_0__01350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InputSignalsAssignment_0_1_in_rule__StateExtend__Group_0__11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StateExtend__Group_1__01417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__OutputSignalsAssignment_1_1_in_rule__StateExtend__Group_1__11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateExtend__Group_2__01494 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StateExtend__Group_2__11533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__2_in_rule__StateExtend__Group_2__11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InOutputSignalsAssignment_2_2_in_rule__StateExtend__Group_2__21571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateExtend__Group_3__01612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__SignalsAssignment_3_1_in_rule__StateExtend__Group_3__11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__01688 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__01697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RegionSignalDec__Group__11726 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__21764 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__21773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3__0_in_rule__RegionSignalDec__Group__31801 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__31811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegionSignalDec__Group__41840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RegionSignalDec__Group_2_0__01886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__01896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RegionSignalDec__Group_3__01963 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3__1_in_rule__RegionSignalDec__Group_3__01973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_3_1_in_rule__RegionSignalDec__Group_3__12001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RegionSignalDec__Group_3_1_0__02040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_0__1_in_rule__RegionSignalDec__Group_3_1_0__02050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_0_1_in_rule__RegionSignalDec__Group_3_1_0__12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__02116 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Signals__Group__12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__02193 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__12230 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rule__Signals__Group_0_1__02270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__02346 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__02355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InputSignals__Group__12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__02423 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__12460 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rule__InputSignals__Group_0_1__02500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__02576 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OutputSignals__Group__12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__02653 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__12690 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rule__OutputSignals__Group_0_1__02730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__02740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__02806 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__02815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InOutputSignals__Group__12844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__02883 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__02892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__12920 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rule__InOutputSignals__Group_0_1__02960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__03036 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1_1__0_in_rule__Signal__Group_1__13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_1_1__03112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_1_1__1_in_rule__Signal__Group_1_1__03122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_1_1_1_in_rule__Signal__Group_1_1__13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__03188 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__13225 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__2_in_rule__Signal__Group_2__13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_2_2_in_rule__Signal__Group_2__23262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_2_1__03303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__03313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__03379 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__03388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__13416 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_2__0_in_rule__Signal__Group_3__23453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_3_1__03494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signal__Group_3_2__03571 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_2__1_in_rule__Signal__Group_3_2__03581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_3_2_1_in_rule__Signal__Group_3_2__13609 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_2__2_in_rule__Signal__Group_3_2__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Signal__Group_3_2__23647 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_2__3_in_rule__Signal__Group_3_2__23657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_3_2_3_in_rule__Signal__Group_3_2__33685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__03727 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__03736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__13764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__13773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_4_2_in_rule__Signal__Group_4__23801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_4_1__03842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__03852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__13880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__03918 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__03927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_1__0_in_rule__Signal__Group_5__13955 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_2__0_in_rule__Signal__Group_5__23992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_5_1__04033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_1__1_in_rule__Signal__Group_5_1__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_5_1_1_in_rule__Signal__Group_5_1__14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signal__Group_5_2__04110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_2__1_in_rule__Signal__Group_5_2__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_5_2_1_in_rule__Signal__Group_5_2__14148 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_2__2_in_rule__Signal__Group_5_2__14157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Signal__Group_5_2__24186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_5_2__3_in_rule__Signal__Group_5_2__24196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_5_2_3_in_rule__Signal__Group_5_2__34224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__04266 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__04275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signal__Group_6_1__04342 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_6_1_1_in_rule__Signal__Group_6_1__14380 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__2_in_rule__Signal__Group_6_1__14389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Signal__Group_6_1__24418 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__3_in_rule__Signal__Group_6_1__24428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_6_1_3_in_rule__Signal__Group_6_1__34456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__04498 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__04507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__14535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signal__Group_7_1__04574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__04584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_7_1_1_in_rule__Signal__Group_7_1__14612 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__2_in_rule__Signal__Group_7_1__14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Signal__Group_7_1__24650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__3_in_rule__Signal__Group_7_1__24660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_1_3_in_rule__Signal__Group_7_1__34688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Variable__Group__04731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__04741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_in_rule__Variable__Group__14769 = new BitSet(new long[]{0x000000008101F802L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__14778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Group__24806 = new BitSet(new long[]{0x000000000101F802L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__24816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_3_in_rule__Variable__Group__34844 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__34854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Group__44882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_2__04928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__04938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_2_1_in_rule__Variable__Group_2__14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable__Group_4__05005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__05015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__HostTypeAssignment_4_1_in_rule__Variable__Group_4__15043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_0_15081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_1_15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_2_25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_3_15174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_45205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_05240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_0_15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_0_15337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_1_15368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_15430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_05461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_15492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_05523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_15554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_15616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_05647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_1_1_15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_05740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_2_1_15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_2_25802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_3_1_15864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_2_15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_3_2_35926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_4_1_15988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_4_26019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_06050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__InitialValueAssignment_5_1_16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_5_2_16112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__HostCombineOperatorAssignment_5_2_36143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_06174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_6_1_16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_6_1_36236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_06267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__HostTypeAssignment_7_1_16298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Signal__HostCombineOperatorAssignment_7_1_36329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_16360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Variable__InitialValueAssignment_2_16391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_36422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Variable__HostTypeAssignment_4_16453 = new BitSet(new long[]{0x0000000000000002L});

}