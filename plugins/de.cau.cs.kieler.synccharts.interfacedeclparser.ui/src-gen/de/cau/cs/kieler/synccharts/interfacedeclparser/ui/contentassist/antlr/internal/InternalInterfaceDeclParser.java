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
import de.cau.cs.kieler.synccharts.interfacedeclparser.services.InterfaceDeclGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalInterfaceDeclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_D", "RULE_STRING_S", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PURE'", "'BOOL'", "'UNSIGNED'", "'INT'", "'FLOAT'", "'HOST'", "'NONE'", "'+'", "'*'", "'max'", "'min'", "'or'", "'and'", "'host'", "'input'", "'output'", "'signal'", "'renaming'", "':'", "';'", "'var'", "','", "':='", "'combine'", "'with'", "'/'"
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:60:1: entryRuleStateExtend : ruleStateExtend EOF ;
    public final void entryRuleStateExtend() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:61:1: ( ruleStateExtend EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:62:1: ruleStateExtend EOF
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:69:1: ruleStateExtend : ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) ;
    public final void ruleStateExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:73:2: ( ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:74:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:74:1: ( ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( rule__StateExtend__Alternatives ) ) ( ( rule__StateExtend__Alternatives )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:75:1: ( ( rule__StateExtend__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:76:1: ( rule__StateExtend__Alternatives )
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:77:1: ( rule__StateExtend__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:77:2: rule__StateExtend__Alternatives
            {
            pushFollow(FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend96);
            rule__StateExtend__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getAlternatives()); 

            }

            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:80:1: ( ( rule__StateExtend__Alternatives )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:81:1: ( rule__StateExtend__Alternatives )*
            {
             before(grammarAccess.getStateExtendAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:82:1: ( rule__StateExtend__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=27 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:82:2: rule__StateExtend__Alternatives
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:95:1: entryRuleRegionSignalDec : ruleRegionSignalDec EOF ;
    public final void entryRuleRegionSignalDec() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:96:1: ( ruleRegionSignalDec EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:97:1: ruleRegionSignalDec EOF
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:104:1: ruleRegionSignalDec : ( ( rule__RegionSignalDec__Group__0 ) ) ;
    public final void ruleRegionSignalDec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:108:2: ( ( ( rule__RegionSignalDec__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:109:1: ( ( rule__RegionSignalDec__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:109:1: ( ( rule__RegionSignalDec__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:110:1: ( rule__RegionSignalDec__Group__0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:111:1: ( rule__RegionSignalDec__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:111:2: rule__RegionSignalDec__Group__0
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


    // $ANTLR start entryRuleSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:125:1: entryRuleSignals : ruleSignals EOF ;
    public final void entryRuleSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:126:1: ( ruleSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:127:1: ruleSignals EOF
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:134:1: ruleSignals : ( ( rule__Signals__Group__0 ) ) ;
    public final void ruleSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:138:2: ( ( ( rule__Signals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:139:1: ( ( rule__Signals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:139:1: ( ( rule__Signals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:140:1: ( rule__Signals__Group__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:141:1: ( rule__Signals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:141:2: rule__Signals__Group__0
            {
            pushFollow(FOLLOW_rule__Signals__Group__0_in_ruleSignals233);
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


    // $ANTLR start entryRuleRenamings
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:153:1: entryRuleRenamings : ruleRenamings EOF ;
    public final void entryRuleRenamings() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:154:1: ( ruleRenamings EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:155:1: ruleRenamings EOF
            {
             before(grammarAccess.getRenamingsRule()); 
            pushFollow(FOLLOW_ruleRenamings_in_entryRuleRenamings260);
            ruleRenamings();
            _fsp--;

             after(grammarAccess.getRenamingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenamings267); 

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
    // $ANTLR end entryRuleRenamings


    // $ANTLR start ruleRenamings
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:162:1: ruleRenamings : ( ( rule__Renamings__Group__0 ) ) ;
    public final void ruleRenamings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:166:2: ( ( ( rule__Renamings__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:167:1: ( ( rule__Renamings__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:167:1: ( ( rule__Renamings__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:168:1: ( rule__Renamings__Group__0 )
            {
             before(grammarAccess.getRenamingsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:169:1: ( rule__Renamings__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:169:2: rule__Renamings__Group__0
            {
            pushFollow(FOLLOW_rule__Renamings__Group__0_in_ruleRenamings293);
            rule__Renamings__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRenamingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRenamings


    // $ANTLR start entryRuleInputSignals
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:181:1: entryRuleInputSignals : ruleInputSignals EOF ;
    public final void entryRuleInputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:182:1: ( ruleInputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:183:1: ruleInputSignals EOF
            {
             before(grammarAccess.getInputSignalsRule()); 
            pushFollow(FOLLOW_ruleInputSignals_in_entryRuleInputSignals320);
            ruleInputSignals();
            _fsp--;

             after(grammarAccess.getInputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSignals327); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:190:1: ruleInputSignals : ( ( rule__InputSignals__Group__0 ) ) ;
    public final void ruleInputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:194:2: ( ( ( rule__InputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:195:1: ( ( rule__InputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:195:1: ( ( rule__InputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:196:1: ( rule__InputSignals__Group__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:197:1: ( rule__InputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:197:2: rule__InputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals353);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:209:1: entryRuleOutputSignals : ruleOutputSignals EOF ;
    public final void entryRuleOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:210:1: ( ruleOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:211:1: ruleOutputSignals EOF
            {
             before(grammarAccess.getOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals380);
            ruleOutputSignals();
            _fsp--;

             after(grammarAccess.getOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSignals387); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:218:1: ruleOutputSignals : ( ( rule__OutputSignals__Group__0 ) ) ;
    public final void ruleOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:222:2: ( ( ( rule__OutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:223:1: ( ( rule__OutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:223:1: ( ( rule__OutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:224:1: ( rule__OutputSignals__Group__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:225:1: ( rule__OutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:225:2: rule__OutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals413);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:237:1: entryRuleInOutputSignals : ruleInOutputSignals EOF ;
    public final void entryRuleInOutputSignals() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:238:1: ( ruleInOutputSignals EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:239:1: ruleInOutputSignals EOF
            {
             before(grammarAccess.getInOutputSignalsRule()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals440);
            ruleInOutputSignals();
            _fsp--;

             after(grammarAccess.getInOutputSignalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutputSignals447); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:246:1: ruleInOutputSignals : ( ( rule__InOutputSignals__Group__0 ) ) ;
    public final void ruleInOutputSignals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:250:2: ( ( ( rule__InOutputSignals__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:251:1: ( ( rule__InOutputSignals__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:251:1: ( ( rule__InOutputSignals__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:252:1: ( rule__InOutputSignals__Group__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:253:1: ( rule__InOutputSignals__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:253:2: rule__InOutputSignals__Group__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals473);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:265:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:266:1: ( ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:267:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal500);
            ruleSignal();
            _fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal507); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:274:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:278:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:279:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:279:1: ( ( rule__Signal__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:280:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:281:1: ( rule__Signal__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:281:2: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_rule__Signal__Alternatives_in_ruleSignal533);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:293:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:294:1: ( ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:295:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable560);
            ruleVariable();
            _fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable567); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:302:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:306:2: ( ( ( rule__Variable__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:307:1: ( ( rule__Variable__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:307:1: ( ( rule__Variable__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:308:1: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:309:1: ( rule__Variable__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:309:2: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_rule__Variable__Alternatives_in_ruleVariable593);
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


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:321:1: entryRuleRenaming : ruleRenaming EOF ;
    public final void entryRuleRenaming() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:322:1: ( ruleRenaming EOF )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:323:1: ruleRenaming EOF
            {
             before(grammarAccess.getRenamingRule()); 
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming620);
            ruleRenaming();
            _fsp--;

             after(grammarAccess.getRenamingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming627); 

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
    // $ANTLR end entryRuleRenaming


    // $ANTLR start ruleRenaming
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:330:1: ruleRenaming : ( ( rule__Renaming__Group__0 ) ) ;
    public final void ruleRenaming() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:334:2: ( ( ( rule__Renaming__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:335:1: ( ( rule__Renaming__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:335:1: ( ( rule__Renaming__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:336:1: ( rule__Renaming__Group__0 )
            {
             before(grammarAccess.getRenamingAccess().getGroup()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:337:1: ( rule__Renaming__Group__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:337:2: rule__Renaming__Group__0
            {
            pushFollow(FOLLOW_rule__Renaming__Group__0_in_ruleRenaming653);
            rule__Renaming__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRenamingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRenaming


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:350:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:354:1: ( ( ( rule__ValueType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:355:1: ( ( rule__ValueType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:355:1: ( ( rule__ValueType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:356:1: ( rule__ValueType__Alternatives )
            {
             before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:357:1: ( rule__ValueType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:357:2: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ValueType__Alternatives_in_ruleValueType690);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:369:1: ruleCombineOperator : ( ( rule__CombineOperator__Alternatives ) ) ;
    public final void ruleCombineOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:373:1: ( ( ( rule__CombineOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:374:1: ( ( rule__CombineOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:374:1: ( ( rule__CombineOperator__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:375:1: ( rule__CombineOperator__Alternatives )
            {
             before(grammarAccess.getCombineOperatorAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:376:1: ( rule__CombineOperator__Alternatives )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:376:2: rule__CombineOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator726);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:387:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );
    public final void rule__StateExtend__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:391:1: ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) )
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
                        new NoViableAltException("387:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );", 2, 2, input);

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
                    new NoViableAltException("387:1: rule__StateExtend__Alternatives : ( ( ( rule__StateExtend__RegionsAssignment_0 ) ) | ( ( rule__StateExtend__Group_1__0 ) ) | ( ( rule__StateExtend__Group_2__0 ) ) | ( ( rule__StateExtend__Group_3__0 ) ) | ( ( rule__StateExtend__Group_4__0 ) ) | ( ( rule__StateExtend__Group_5__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:392:1: ( ( rule__StateExtend__RegionsAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:392:1: ( ( rule__StateExtend__RegionsAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:393:1: ( rule__StateExtend__RegionsAssignment_0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getRegionsAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:394:1: ( rule__StateExtend__RegionsAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:394:2: rule__StateExtend__RegionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__RegionsAssignment_0_in_rule__StateExtend__Alternatives761);
                    rule__StateExtend__RegionsAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getRegionsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:398:6: ( ( rule__StateExtend__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:398:6: ( ( rule__StateExtend__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:399:1: ( rule__StateExtend__Group_1__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:400:1: ( rule__StateExtend__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:400:2: rule__StateExtend__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives779);
                    rule__StateExtend__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:404:6: ( ( rule__StateExtend__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:404:6: ( ( rule__StateExtend__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:405:1: ( rule__StateExtend__Group_2__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:406:1: ( rule__StateExtend__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:406:2: rule__StateExtend__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives797);
                    rule__StateExtend__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:410:6: ( ( rule__StateExtend__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:410:6: ( ( rule__StateExtend__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:411:1: ( rule__StateExtend__Group_3__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:412:1: ( rule__StateExtend__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:412:2: rule__StateExtend__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives815);
                    rule__StateExtend__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:416:6: ( ( rule__StateExtend__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:416:6: ( ( rule__StateExtend__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:417:1: ( rule__StateExtend__Group_4__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:418:1: ( rule__StateExtend__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:418:2: rule__StateExtend__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_4__0_in_rule__StateExtend__Alternatives833);
                    rule__StateExtend__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStateExtendAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:422:6: ( ( rule__StateExtend__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:422:6: ( ( rule__StateExtend__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:423:1: ( rule__StateExtend__Group_5__0 )
                    {
                     before(grammarAccess.getStateExtendAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:424:1: ( rule__StateExtend__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:424:2: rule__StateExtend__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StateExtend__Group_5__0_in_rule__StateExtend__Alternatives851);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:433:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) );
    public final void rule__RegionSignalDec__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:437:1: ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) )
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
                    new NoViableAltException("433:1: rule__RegionSignalDec__Alternatives_2 : ( ( ( rule__RegionSignalDec__Group_2_0__0 ) ) | ( ( rule__RegionSignalDec__Group_2_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:438:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:438:1: ( ( rule__RegionSignalDec__Group_2_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:439:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:440:1: ( rule__RegionSignalDec__Group_2_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:440:2: rule__RegionSignalDec__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2884);
                    rule__RegionSignalDec__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:444:6: ( ( rule__RegionSignalDec__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:444:6: ( ( rule__RegionSignalDec__Group_2_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:445:1: ( rule__RegionSignalDec__Group_2_1__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_2_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:446:1: ( rule__RegionSignalDec__Group_2_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:446:2: rule__RegionSignalDec__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__0_in_rule__RegionSignalDec__Alternatives_2902);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:455:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );
    public final void rule__RegionSignalDec__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:459:1: ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==29) ) {
                    alt4=2;
                }
                else if ( (LA4_1==33) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("455:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("455:1: rule__RegionSignalDec__Alternatives_3 : ( ( ( rule__RegionSignalDec__Group_3_0__0 ) ) | ( ( rule__RegionSignalDec__Group_3_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:460:1: ( ( rule__RegionSignalDec__Group_3_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:460:1: ( ( rule__RegionSignalDec__Group_3_0__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:461:1: ( rule__RegionSignalDec__Group_3_0__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_3_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:462:1: ( rule__RegionSignalDec__Group_3_0__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:462:2: rule__RegionSignalDec__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__0_in_rule__RegionSignalDec__Alternatives_3935);
                    rule__RegionSignalDec__Group_3_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRegionSignalDecAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:466:6: ( ( rule__RegionSignalDec__Group_3_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:466:6: ( ( rule__RegionSignalDec__Group_3_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:467:1: ( rule__RegionSignalDec__Group_3_1__0 )
                    {
                     before(grammarAccess.getRegionSignalDecAccess().getGroup_3_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:468:1: ( rule__RegionSignalDec__Group_3_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:468:2: rule__RegionSignalDec__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__0_in_rule__RegionSignalDec__Alternatives_3953);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:481:1: ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) )
            int alt5=10;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 32:
                case 34:
                    {
                    alt5=1;
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

                            if ( (LA5_11==RULE_STRING_D) ) {
                                alt5=8;
                            }
                            else if ( ((LA5_11>=13 && LA5_11<=18)) ) {
                                alt5=5;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 11, input);

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
                        case 31:
                            {
                            int LA5_13 = input.LA(5);

                            if ( (LA5_13==RULE_STRING_D) ) {
                                alt5=7;
                            }
                            else if ( ((LA5_13>=13 && LA5_13<=18)) ) {
                                alt5=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 13, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==RULE_STRING_D) ) {
                        alt5=10;
                    }
                    else if ( ((LA5_4>=13 && LA5_4<=18)) ) {
                        alt5=9;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA5_5 = input.LA(3);

                    if ( ((LA5_5>=13 && LA5_5<=18)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_5==RULE_STRING_D) ) {
                        alt5=6;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("477:1: rule__Signal__Alternatives : ( ( ( rule__Signal__NameAssignment_0 ) ) | ( ( rule__Signal__Group_1__0 ) ) | ( ( rule__Signal__Group_2__0 ) ) | ( ( rule__Signal__Group_3__0 ) ) | ( ( rule__Signal__Group_4__0 ) ) | ( ( rule__Signal__Group_5__0 ) ) | ( ( rule__Signal__Group_6__0 ) ) | ( ( rule__Signal__Group_7__0 ) ) | ( ( rule__Signal__Group_8__0 ) ) | ( ( rule__Signal__Group_9__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:482:1: ( ( rule__Signal__NameAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:482:1: ( ( rule__Signal__NameAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:483:1: ( rule__Signal__NameAssignment_0 )
                    {
                     before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:484:1: ( rule__Signal__NameAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:484:2: rule__Signal__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives986);
                    rule__Signal__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:488:6: ( ( rule__Signal__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:488:6: ( ( rule__Signal__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:489:1: ( rule__Signal__Group_1__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:490:1: ( rule__Signal__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:490:2: rule__Signal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives1004);
                    rule__Signal__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:494:6: ( ( rule__Signal__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:494:6: ( ( rule__Signal__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:495:1: ( rule__Signal__Group_2__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:496:1: ( rule__Signal__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:496:2: rule__Signal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives1022);
                    rule__Signal__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:500:6: ( ( rule__Signal__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:500:6: ( ( rule__Signal__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:501:1: ( rule__Signal__Group_3__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:502:1: ( rule__Signal__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:502:2: rule__Signal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives1040);
                    rule__Signal__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:506:6: ( ( rule__Signal__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:506:6: ( ( rule__Signal__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:507:1: ( rule__Signal__Group_4__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:508:1: ( rule__Signal__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:508:2: rule__Signal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives1058);
                    rule__Signal__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:512:6: ( ( rule__Signal__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:512:6: ( ( rule__Signal__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:513:1: ( rule__Signal__Group_5__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:514:1: ( rule__Signal__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:514:2: rule__Signal__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives1076);
                    rule__Signal__Group_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:518:6: ( ( rule__Signal__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:518:6: ( ( rule__Signal__Group_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:519:1: ( rule__Signal__Group_6__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:520:1: ( rule__Signal__Group_6__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:520:2: rule__Signal__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives1094);
                    rule__Signal__Group_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:524:6: ( ( rule__Signal__Group_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:524:6: ( ( rule__Signal__Group_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:525:1: ( rule__Signal__Group_7__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:526:1: ( rule__Signal__Group_7__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:526:2: rule__Signal__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives1112);
                    rule__Signal__Group_7__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:530:6: ( ( rule__Signal__Group_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:530:6: ( ( rule__Signal__Group_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:531:1: ( rule__Signal__Group_8__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_8()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:532:1: ( rule__Signal__Group_8__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:532:2: rule__Signal__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_8__0_in_rule__Signal__Alternatives1130);
                    rule__Signal__Group_8__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSignalAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:536:6: ( ( rule__Signal__Group_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:536:6: ( ( rule__Signal__Group_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:537:1: ( rule__Signal__Group_9__0 )
                    {
                     before(grammarAccess.getSignalAccess().getGroup_9()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:538:1: ( rule__Signal__Group_9__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:538:2: rule__Signal__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Signal__Group_9__0_in_rule__Signal__Alternatives1148);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:551:1: ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_STRING_D) ) {
                        int LA6_5 = input.LA(4);

                        if ( (LA6_5==31) ) {
                            int LA6_8 = input.LA(5);

                            if ( (LA6_8==RULE_STRING_D) ) {
                                alt6=6;
                            }
                            else if ( ((LA6_8>=13 && LA6_8<=18)) ) {
                                alt6=4;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA6_5==EOF||LA6_5==32||LA6_5==34) ) {
                            alt6=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_STRING_D) ) {
                        alt6=5;
                    }
                    else if ( ((LA6_3>=13 && LA6_3<=18)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 3, input);

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
                        new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("547:1: rule__Variable__Alternatives : ( ( ( rule__Variable__NameAssignment_0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:552:1: ( ( rule__Variable__NameAssignment_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:552:1: ( ( rule__Variable__NameAssignment_0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:553:1: ( rule__Variable__NameAssignment_0 )
                    {
                     before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:554:1: ( rule__Variable__NameAssignment_0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:554:2: rule__Variable__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Alternatives1181);
                    rule__Variable__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:558:6: ( ( rule__Variable__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:558:6: ( ( rule__Variable__Group_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:559:1: ( rule__Variable__Group_1__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:560:1: ( rule__Variable__Group_1__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:560:2: rule__Variable__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Alternatives1199);
                    rule__Variable__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:564:6: ( ( rule__Variable__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:564:6: ( ( rule__Variable__Group_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:565:1: ( rule__Variable__Group_2__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:566:1: ( rule__Variable__Group_2__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:566:2: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Alternatives1217);
                    rule__Variable__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:570:6: ( ( rule__Variable__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:570:6: ( ( rule__Variable__Group_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:571:1: ( rule__Variable__Group_3__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:572:1: ( rule__Variable__Group_3__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:572:2: rule__Variable__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Alternatives1235);
                    rule__Variable__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:576:6: ( ( rule__Variable__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:576:6: ( ( rule__Variable__Group_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:577:1: ( rule__Variable__Group_4__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:578:1: ( rule__Variable__Group_4__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:578:2: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Alternatives1253);
                    rule__Variable__Group_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getVariableAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:582:6: ( ( rule__Variable__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:582:6: ( ( rule__Variable__Group_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:583:1: ( rule__Variable__Group_5__0 )
                    {
                     before(grammarAccess.getVariableAccess().getGroup_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:584:1: ( rule__Variable__Group_5__0 )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:584:2: rule__Variable__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Variable__Group_5__0_in_rule__Variable__Alternatives1271);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:593:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:597:1: ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) )
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
                    new NoViableAltException("593:1: rule__ValueType__Alternatives : ( ( ( 'PURE' ) ) | ( ( 'BOOL' ) ) | ( ( 'UNSIGNED' ) ) | ( ( 'INT' ) ) | ( ( 'FLOAT' ) ) | ( ( 'HOST' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:598:1: ( ( 'PURE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:598:1: ( ( 'PURE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:599:1: ( 'PURE' )
                    {
                     before(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:600:1: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:600:3: 'PURE'
                    {
                    match(input,13,FOLLOW_13_in_rule__ValueType__Alternatives1305); 

                    }

                     after(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:605:6: ( ( 'BOOL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:605:6: ( ( 'BOOL' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:606:1: ( 'BOOL' )
                    {
                     before(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:607:1: ( 'BOOL' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:607:3: 'BOOL'
                    {
                    match(input,14,FOLLOW_14_in_rule__ValueType__Alternatives1326); 

                    }

                     after(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:612:6: ( ( 'UNSIGNED' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:612:6: ( ( 'UNSIGNED' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:613:1: ( 'UNSIGNED' )
                    {
                     before(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:614:1: ( 'UNSIGNED' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:614:3: 'UNSIGNED'
                    {
                    match(input,15,FOLLOW_15_in_rule__ValueType__Alternatives1347); 

                    }

                     after(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:619:6: ( ( 'INT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:619:6: ( ( 'INT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:620:1: ( 'INT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:621:1: ( 'INT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:621:3: 'INT'
                    {
                    match(input,16,FOLLOW_16_in_rule__ValueType__Alternatives1368); 

                    }

                     after(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:626:6: ( ( 'FLOAT' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:626:6: ( ( 'FLOAT' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:627:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:628:1: ( 'FLOAT' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:628:3: 'FLOAT'
                    {
                    match(input,17,FOLLOW_17_in_rule__ValueType__Alternatives1389); 

                    }

                     after(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:633:6: ( ( 'HOST' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:633:6: ( ( 'HOST' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:634:1: ( 'HOST' )
                    {
                     before(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:635:1: ( 'HOST' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:635:3: 'HOST'
                    {
                    match(input,18,FOLLOW_18_in_rule__ValueType__Alternatives1410); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:645:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );
    public final void rule__CombineOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:649:1: ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) )
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
                    new NoViableAltException("645:1: rule__CombineOperator__Alternatives : ( ( ( 'NONE' ) ) | ( ( '+' ) ) | ( ( '*' ) ) | ( ( 'max' ) ) | ( ( 'min' ) ) | ( ( 'or' ) ) | ( ( 'and' ) ) | ( ( 'host' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:650:1: ( ( 'NONE' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:650:1: ( ( 'NONE' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:651:1: ( 'NONE' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:652:1: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:652:3: 'NONE'
                    {
                    match(input,19,FOLLOW_19_in_rule__CombineOperator__Alternatives1446); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:657:6: ( ( '+' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:657:6: ( ( '+' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:658:1: ( '+' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:659:1: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:659:3: '+'
                    {
                    match(input,20,FOLLOW_20_in_rule__CombineOperator__Alternatives1467); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:664:6: ( ( '*' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:664:6: ( ( '*' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:665:1: ( '*' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:666:1: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:666:3: '*'
                    {
                    match(input,21,FOLLOW_21_in_rule__CombineOperator__Alternatives1488); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:671:6: ( ( 'max' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:671:6: ( ( 'max' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:672:1: ( 'max' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:673:1: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:673:3: 'max'
                    {
                    match(input,22,FOLLOW_22_in_rule__CombineOperator__Alternatives1509); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:678:6: ( ( 'min' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:678:6: ( ( 'min' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:679:1: ( 'min' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:680:1: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:680:3: 'min'
                    {
                    match(input,23,FOLLOW_23_in_rule__CombineOperator__Alternatives1530); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:685:6: ( ( 'or' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:685:6: ( ( 'or' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:686:1: ( 'or' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:687:1: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:687:3: 'or'
                    {
                    match(input,24,FOLLOW_24_in_rule__CombineOperator__Alternatives1551); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:692:6: ( ( 'and' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:692:6: ( ( 'and' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:693:1: ( 'and' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:694:1: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:694:3: 'and'
                    {
                    match(input,25,FOLLOW_25_in_rule__CombineOperator__Alternatives1572); 

                    }

                     after(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:699:6: ( ( 'host' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:699:6: ( ( 'host' ) )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:700:1: ( 'host' )
                    {
                     before(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7()); 
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:701:1: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:701:3: 'host'
                    {
                    match(input,26,FOLLOW_26_in_rule__CombineOperator__Alternatives1593); 

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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:713:1: rule__StateExtend__Group_1__0 : ( 'input' ) rule__StateExtend__Group_1__1 ;
    public final void rule__StateExtend__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:717:1: ( ( 'input' ) rule__StateExtend__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:718:1: ( 'input' ) rule__StateExtend__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:718:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:719:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__StateExtend__Group_1__01631); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01641);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:733:1: rule__StateExtend__Group_1__1 : ( 'output' ) rule__StateExtend__Group_1__2 ;
    public final void rule__StateExtend__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:737:1: ( ( 'output' ) rule__StateExtend__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:738:1: ( 'output' ) rule__StateExtend__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:738:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:739:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__StateExtend__Group_1__11670); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_1__2_in_rule__StateExtend__Group_1__11680);
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


    // $ANTLR start rule__StateExtend__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:753:1: rule__StateExtend__Group_1__2 : ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) ) ;
    public final void rule__StateExtend__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:757:1: ( ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:758:1: ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:758:1: ( ( rule__StateExtend__InOutputSignalsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:759:1: ( rule__StateExtend__InOutputSignalsAssignment_1_2 )
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:760:1: ( rule__StateExtend__InOutputSignalsAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:760:2: rule__StateExtend__InOutputSignalsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__StateExtend__InOutputSignalsAssignment_1_2_in_rule__StateExtend__Group_1__21708);
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
    // $ANTLR end rule__StateExtend__Group_1__2


    // $ANTLR start rule__StateExtend__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:776:1: rule__StateExtend__Group_2__0 : ( 'output' ) rule__StateExtend__Group_2__1 ;
    public final void rule__StateExtend__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:780:1: ( ( 'output' ) rule__StateExtend__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:781:1: ( 'output' ) rule__StateExtend__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:781:1: ( 'output' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:782:1: 'output'
            {
             before(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__StateExtend__Group_2__01749); 
             after(grammarAccess.getStateExtendAccess().getOutputKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01759);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:796:1: rule__StateExtend__Group_2__1 : ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) ) ;
    public final void rule__StateExtend__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:800:1: ( ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:801:1: ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:801:1: ( ( rule__StateExtend__OutputSignalsAssignment_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:802:1: ( rule__StateExtend__OutputSignalsAssignment_2_1 )
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsAssignment_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:803:1: ( rule__StateExtend__OutputSignalsAssignment_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:803:2: rule__StateExtend__OutputSignalsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StateExtend__OutputSignalsAssignment_2_1_in_rule__StateExtend__Group_2__11787);
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
    // $ANTLR end rule__StateExtend__Group_2__1


    // $ANTLR start rule__StateExtend__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:817:1: rule__StateExtend__Group_3__0 : ( 'input' ) rule__StateExtend__Group_3__1 ;
    public final void rule__StateExtend__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:821:1: ( ( 'input' ) rule__StateExtend__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:822:1: ( 'input' ) rule__StateExtend__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:822:1: ( 'input' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:823:1: 'input'
            {
             before(grammarAccess.getStateExtendAccess().getInputKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__StateExtend__Group_3__01826); 
             after(grammarAccess.getStateExtendAccess().getInputKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01836);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:837:1: rule__StateExtend__Group_3__1 : ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) ) ;
    public final void rule__StateExtend__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:841:1: ( ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:842:1: ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:842:1: ( ( rule__StateExtend__InputSignalsAssignment_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:843:1: ( rule__StateExtend__InputSignalsAssignment_3_1 )
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsAssignment_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:844:1: ( rule__StateExtend__InputSignalsAssignment_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:844:2: rule__StateExtend__InputSignalsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StateExtend__InputSignalsAssignment_3_1_in_rule__StateExtend__Group_3__11864);
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
    // $ANTLR end rule__StateExtend__Group_3__1


    // $ANTLR start rule__StateExtend__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:858:1: rule__StateExtend__Group_4__0 : ( 'signal' ) rule__StateExtend__Group_4__1 ;
    public final void rule__StateExtend__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:862:1: ( ( 'signal' ) rule__StateExtend__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:863:1: ( 'signal' ) rule__StateExtend__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:863:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:864:1: 'signal'
            {
             before(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__StateExtend__Group_4__01903); 
             after(grammarAccess.getStateExtendAccess().getSignalKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_4__1_in_rule__StateExtend__Group_4__01913);
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


    // $ANTLR start rule__StateExtend__Group_4__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:878:1: rule__StateExtend__Group_4__1 : ( ( rule__StateExtend__SignalsAssignment_4_1 ) ) ;
    public final void rule__StateExtend__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:882:1: ( ( ( rule__StateExtend__SignalsAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:883:1: ( ( rule__StateExtend__SignalsAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:883:1: ( ( rule__StateExtend__SignalsAssignment_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:884:1: ( rule__StateExtend__SignalsAssignment_4_1 )
            {
             before(grammarAccess.getStateExtendAccess().getSignalsAssignment_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:885:1: ( rule__StateExtend__SignalsAssignment_4_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:885:2: rule__StateExtend__SignalsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StateExtend__SignalsAssignment_4_1_in_rule__StateExtend__Group_4__11941);
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
    // $ANTLR end rule__StateExtend__Group_4__1


    // $ANTLR start rule__StateExtend__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:899:1: rule__StateExtend__Group_5__0 : ( 'renaming' ) rule__StateExtend__Group_5__1 ;
    public final void rule__StateExtend__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:903:1: ( ( 'renaming' ) rule__StateExtend__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:904:1: ( 'renaming' ) rule__StateExtend__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:904:1: ( 'renaming' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:905:1: 'renaming'
            {
             before(grammarAccess.getStateExtendAccess().getRenamingKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__StateExtend__Group_5__01980); 
             after(grammarAccess.getStateExtendAccess().getRenamingKeyword_5_0()); 

            }

            pushFollow(FOLLOW_rule__StateExtend__Group_5__1_in_rule__StateExtend__Group_5__01990);
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


    // $ANTLR start rule__StateExtend__Group_5__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:919:1: rule__StateExtend__Group_5__1 : ( ( rule__StateExtend__RenamingsAssignment_5_1 ) ) ;
    public final void rule__StateExtend__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:923:1: ( ( ( rule__StateExtend__RenamingsAssignment_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:924:1: ( ( rule__StateExtend__RenamingsAssignment_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:924:1: ( ( rule__StateExtend__RenamingsAssignment_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:925:1: ( rule__StateExtend__RenamingsAssignment_5_1 )
            {
             before(grammarAccess.getStateExtendAccess().getRenamingsAssignment_5_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:926:1: ( rule__StateExtend__RenamingsAssignment_5_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:926:2: rule__StateExtend__RenamingsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StateExtend__RenamingsAssignment_5_1_in_rule__StateExtend__Group_5__12018);
            rule__StateExtend__RenamingsAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStateExtendAccess().getRenamingsAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start rule__RegionSignalDec__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:940:1: rule__RegionSignalDec__Group__0 : ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1 ;
    public final void rule__RegionSignalDec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:944:1: ( ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:945:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) ) rule__RegionSignalDec__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:945:1: ( ( rule__RegionSignalDec__RegionAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:946:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:947:1: ( rule__RegionSignalDec__RegionAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:947:2: rule__RegionSignalDec__RegionAssignment_0
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__02056);
            rule__RegionSignalDec__RegionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getRegionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__02065);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:958:1: rule__RegionSignalDec__Group__1 : ( ':' ) rule__RegionSignalDec__Group__2 ;
    public final void rule__RegionSignalDec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:962:1: ( ( ':' ) rule__RegionSignalDec__Group__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:963:1: ( ':' ) rule__RegionSignalDec__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:963:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:964:1: ':'
            {
             before(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__RegionSignalDec__Group__12094); 
             after(grammarAccess.getRegionSignalDecAccess().getColonKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__12104);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:978:1: rule__RegionSignalDec__Group__2 : ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3 ;
    public final void rule__RegionSignalDec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:982:1: ( ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:983:1: ( ( rule__RegionSignalDec__Alternatives_2 ) ) rule__RegionSignalDec__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:983:1: ( ( rule__RegionSignalDec__Alternatives_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:984:1: ( rule__RegionSignalDec__Alternatives_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:985:1: ( rule__RegionSignalDec__Alternatives_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:985:2: rule__RegionSignalDec__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__22132);
            rule__RegionSignalDec__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__22141);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:996:1: rule__RegionSignalDec__Group__3 : ( ( rule__RegionSignalDec__Alternatives_3 )* ) rule__RegionSignalDec__Group__4 ;
    public final void rule__RegionSignalDec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1000:1: ( ( ( rule__RegionSignalDec__Alternatives_3 )* ) rule__RegionSignalDec__Group__4 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1001:1: ( ( rule__RegionSignalDec__Alternatives_3 )* ) rule__RegionSignalDec__Group__4
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1001:1: ( ( rule__RegionSignalDec__Alternatives_3 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1002:1: ( rule__RegionSignalDec__Alternatives_3 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getAlternatives_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1003:1: ( rule__RegionSignalDec__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1003:2: rule__RegionSignalDec__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Alternatives_3_in_rule__RegionSignalDec__Group__32169);
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

            pushFollow(FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__32179);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1014:1: rule__RegionSignalDec__Group__4 : ( ';' ) ;
    public final void rule__RegionSignalDec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1018:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1019:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1019:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1020:1: ';'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__RegionSignalDec__Group__42208); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1043:1: rule__RegionSignalDec__Group_2_0__0 : ( 'var' ) rule__RegionSignalDec__Group_2_0__1 ;
    public final void rule__RegionSignalDec__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1047:1: ( ( 'var' ) rule__RegionSignalDec__Group_2_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1048:1: ( 'var' ) rule__RegionSignalDec__Group_2_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1048:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1049:1: 'var'
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0()); 
            match(input,33,FOLLOW_33_in_rule__RegionSignalDec__Group_2_0__02254); 
             after(grammarAccess.getRegionSignalDecAccess().getVarKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__02264);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1063:1: rule__RegionSignalDec__Group_2_0__1 : ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) ) rule__RegionSignalDec__Group_2_0__2 ;
    public final void rule__RegionSignalDec__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1067:1: ( ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) ) rule__RegionSignalDec__Group_2_0__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1068:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) ) rule__RegionSignalDec__Group_2_0__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1068:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1069:1: ( rule__RegionSignalDec__VarsAssignment_2_0_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1070:1: ( rule__RegionSignalDec__VarsAssignment_2_0_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1070:2: rule__RegionSignalDec__VarsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__12292);
            rule__RegionSignalDec__VarsAssignment_2_0_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0__2_in_rule__RegionSignalDec__Group_2_0__12301);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_0__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1081:1: rule__RegionSignalDec__Group_2_0__2 : ( ( rule__RegionSignalDec__Group_2_0_2__0 )* ) ;
    public final void rule__RegionSignalDec__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1085:1: ( ( ( rule__RegionSignalDec__Group_2_0_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1086:1: ( ( rule__RegionSignalDec__Group_2_0_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1086:1: ( ( rule__RegionSignalDec__Group_2_0_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1087:1: ( rule__RegionSignalDec__Group_2_0_2__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_2_0_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1088:1: ( rule__RegionSignalDec__Group_2_0_2__0 )*
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1088:2: rule__RegionSignalDec__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__0_in_rule__RegionSignalDec__Group_2_0__22329);
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
    // $ANTLR end rule__RegionSignalDec__Group_2_0__2


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1104:1: rule__RegionSignalDec__Group_2_0_2__0 : ( ',' ) rule__RegionSignalDec__Group_2_0_2__1 ;
    public final void rule__RegionSignalDec__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1108:1: ( ( ',' ) rule__RegionSignalDec__Group_2_0_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1109:1: ( ',' ) rule__RegionSignalDec__Group_2_0_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1109:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1110:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_2_0_2__02371); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_0_2_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_0_2__1_in_rule__RegionSignalDec__Group_2_0_2__02381);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_0_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1124:1: rule__RegionSignalDec__Group_2_0_2__1 : ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1128:1: ( ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1129:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1129:1: ( ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1130:1: ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_2_0_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1131:1: ( rule__RegionSignalDec__VarsAssignment_2_0_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1131:2: rule__RegionSignalDec__VarsAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_2_1_in_rule__RegionSignalDec__Group_2_0_2__12409);
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
    // $ANTLR end rule__RegionSignalDec__Group_2_0_2__1


    // $ANTLR start rule__RegionSignalDec__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1145:1: rule__RegionSignalDec__Group_2_1__0 : ( 'signal' ) rule__RegionSignalDec__Group_2_1__1 ;
    public final void rule__RegionSignalDec__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1149:1: ( ( 'signal' ) rule__RegionSignalDec__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1150:1: ( 'signal' ) rule__RegionSignalDec__Group_2_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1150:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1151:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__RegionSignalDec__Group_2_1__02448); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__1_in_rule__RegionSignalDec__Group_2_1__02458);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1165:1: rule__RegionSignalDec__Group_2_1__1 : ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) ) rule__RegionSignalDec__Group_2_1__2 ;
    public final void rule__RegionSignalDec__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1169:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) ) rule__RegionSignalDec__Group_2_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1170:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) ) rule__RegionSignalDec__Group_2_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1170:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1171:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1172:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1172:2: rule__RegionSignalDec__SignalsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_1_in_rule__RegionSignalDec__Group_2_1__12486);
            rule__RegionSignalDec__SignalsAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1__2_in_rule__RegionSignalDec__Group_2_1__12495);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1183:1: rule__RegionSignalDec__Group_2_1__2 : ( ( rule__RegionSignalDec__Group_2_1_2__0 )* ) ;
    public final void rule__RegionSignalDec__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1187:1: ( ( ( rule__RegionSignalDec__Group_2_1_2__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1188:1: ( ( rule__RegionSignalDec__Group_2_1_2__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1188:1: ( ( rule__RegionSignalDec__Group_2_1_2__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1189:1: ( rule__RegionSignalDec__Group_2_1_2__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_2_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1190:1: ( rule__RegionSignalDec__Group_2_1_2__0 )*
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1190:2: rule__RegionSignalDec__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__0_in_rule__RegionSignalDec__Group_2_1__22523);
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
    // $ANTLR end rule__RegionSignalDec__Group_2_1__2


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1206:1: rule__RegionSignalDec__Group_2_1_2__0 : ( ',' ) rule__RegionSignalDec__Group_2_1_2__1 ;
    public final void rule__RegionSignalDec__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1210:1: ( ( ',' ) rule__RegionSignalDec__Group_2_1_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1211:1: ( ',' ) rule__RegionSignalDec__Group_2_1_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1211:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1212:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_2_1_2__02565); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_2_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_2_1_2__1_in_rule__RegionSignalDec__Group_2_1_2__02575);
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


    // $ANTLR start rule__RegionSignalDec__Group_2_1_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1226:1: rule__RegionSignalDec__Group_2_1_2__1 : ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) ) ;
    public final void rule__RegionSignalDec__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1230:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1231:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1231:1: ( ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1232:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_2_1_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1233:1: ( rule__RegionSignalDec__SignalsAssignment_2_1_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1233:2: rule__RegionSignalDec__SignalsAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_2_1_in_rule__RegionSignalDec__Group_2_1_2__12603);
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
    // $ANTLR end rule__RegionSignalDec__Group_2_1_2__1


    // $ANTLR start rule__RegionSignalDec__Group_3_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1247:1: rule__RegionSignalDec__Group_3_0__0 : ( ',' ) rule__RegionSignalDec__Group_3_0__1 ;
    public final void rule__RegionSignalDec__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1251:1: ( ( ',' ) rule__RegionSignalDec__Group_3_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1252:1: ( ',' ) rule__RegionSignalDec__Group_3_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1252:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1253:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_0__02642); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__1_in_rule__RegionSignalDec__Group_3_0__02652);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1267:1: rule__RegionSignalDec__Group_3_0__1 : ( 'var' ) rule__RegionSignalDec__Group_3_0__2 ;
    public final void rule__RegionSignalDec__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1271:1: ( ( 'var' ) rule__RegionSignalDec__Group_3_0__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1272:1: ( 'var' ) rule__RegionSignalDec__Group_3_0__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1272:1: ( 'var' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1273:1: 'var'
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1()); 
            match(input,33,FOLLOW_33_in_rule__RegionSignalDec__Group_3_0__12681); 
             after(grammarAccess.getRegionSignalDecAccess().getVarKeyword_3_0_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__2_in_rule__RegionSignalDec__Group_3_0__12691);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_0__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1287:1: rule__RegionSignalDec__Group_3_0__2 : ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) ) rule__RegionSignalDec__Group_3_0__3 ;
    public final void rule__RegionSignalDec__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1291:1: ( ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) ) rule__RegionSignalDec__Group_3_0__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1292:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) ) rule__RegionSignalDec__Group_3_0__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1292:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1293:1: ( rule__RegionSignalDec__VarsAssignment_3_0_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1294:1: ( rule__RegionSignalDec__VarsAssignment_3_0_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1294:2: rule__RegionSignalDec__VarsAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_2_in_rule__RegionSignalDec__Group_3_0__22719);
            rule__RegionSignalDec__VarsAssignment_3_0_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_2()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0__3_in_rule__RegionSignalDec__Group_3_0__22728);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_0__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1305:1: rule__RegionSignalDec__Group_3_0__3 : ( ( rule__RegionSignalDec__Group_3_0_3__0 )* ) ;
    public final void rule__RegionSignalDec__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1309:1: ( ( ( rule__RegionSignalDec__Group_3_0_3__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1310:1: ( ( rule__RegionSignalDec__Group_3_0_3__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1310:1: ( ( rule__RegionSignalDec__Group_3_0_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1311:1: ( rule__RegionSignalDec__Group_3_0_3__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_3_0_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1312:1: ( rule__RegionSignalDec__Group_3_0_3__0 )*
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1312:2: rule__RegionSignalDec__Group_3_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__0_in_rule__RegionSignalDec__Group_3_0__32756);
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
    // $ANTLR end rule__RegionSignalDec__Group_3_0__3


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1330:1: rule__RegionSignalDec__Group_3_0_3__0 : ( ',' ) rule__RegionSignalDec__Group_3_0_3__1 ;
    public final void rule__RegionSignalDec__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1334:1: ( ( ',' ) rule__RegionSignalDec__Group_3_0_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1335:1: ( ',' ) rule__RegionSignalDec__Group_3_0_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1335:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1336:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_0_3__02800); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_0_3_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_0_3__1_in_rule__RegionSignalDec__Group_3_0_3__02810);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_0_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1350:1: rule__RegionSignalDec__Group_3_0_3__1 : ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1354:1: ( ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1355:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1355:1: ( ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1356:1: ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsAssignment_3_0_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1357:1: ( rule__RegionSignalDec__VarsAssignment_3_0_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1357:2: rule__RegionSignalDec__VarsAssignment_3_0_3_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_3_1_in_rule__RegionSignalDec__Group_3_0_3__12838);
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
    // $ANTLR end rule__RegionSignalDec__Group_3_0_3__1


    // $ANTLR start rule__RegionSignalDec__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1371:1: rule__RegionSignalDec__Group_3_1__0 : ( ',' ) rule__RegionSignalDec__Group_3_1__1 ;
    public final void rule__RegionSignalDec__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1375:1: ( ( ',' ) rule__RegionSignalDec__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1376:1: ( ',' ) rule__RegionSignalDec__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1376:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1377:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_1__02877); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__1_in_rule__RegionSignalDec__Group_3_1__02887);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1391:1: rule__RegionSignalDec__Group_3_1__1 : ( 'signal' ) rule__RegionSignalDec__Group_3_1__2 ;
    public final void rule__RegionSignalDec__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1395:1: ( ( 'signal' ) rule__RegionSignalDec__Group_3_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1396:1: ( 'signal' ) rule__RegionSignalDec__Group_3_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1396:1: ( 'signal' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1397:1: 'signal'
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1()); 
            match(input,29,FOLLOW_29_in_rule__RegionSignalDec__Group_3_1__12916); 
             after(grammarAccess.getRegionSignalDecAccess().getSignalKeyword_3_1_1()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__2_in_rule__RegionSignalDec__Group_3_1__12926);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1411:1: rule__RegionSignalDec__Group_3_1__2 : ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) ) rule__RegionSignalDec__Group_3_1__3 ;
    public final void rule__RegionSignalDec__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1415:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) ) rule__RegionSignalDec__Group_3_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1416:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) ) rule__RegionSignalDec__Group_3_1__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1416:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1417:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_2 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1418:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1418:2: rule__RegionSignalDec__SignalsAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_2_in_rule__RegionSignalDec__Group_3_1__22954);
            rule__RegionSignalDec__SignalsAssignment_3_1_2();
            _fsp--;


            }

             after(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_2()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1__3_in_rule__RegionSignalDec__Group_3_1__22963);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1429:1: rule__RegionSignalDec__Group_3_1__3 : ( ( rule__RegionSignalDec__Group_3_1_3__0 )* ) ;
    public final void rule__RegionSignalDec__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1433:1: ( ( ( rule__RegionSignalDec__Group_3_1_3__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1434:1: ( ( rule__RegionSignalDec__Group_3_1_3__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1434:1: ( ( rule__RegionSignalDec__Group_3_1_3__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1435:1: ( rule__RegionSignalDec__Group_3_1_3__0 )*
            {
             before(grammarAccess.getRegionSignalDecAccess().getGroup_3_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1436:1: ( rule__RegionSignalDec__Group_3_1_3__0 )*
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
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1436:2: rule__RegionSignalDec__Group_3_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__0_in_rule__RegionSignalDec__Group_3_1__32991);
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
    // $ANTLR end rule__RegionSignalDec__Group_3_1__3


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1454:1: rule__RegionSignalDec__Group_3_1_3__0 : ( ',' ) rule__RegionSignalDec__Group_3_1_3__1 ;
    public final void rule__RegionSignalDec__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1458:1: ( ( ',' ) rule__RegionSignalDec__Group_3_1_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1459:1: ( ',' ) rule__RegionSignalDec__Group_3_1_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1459:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1460:1: ','
            {
             before(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0()); 
            match(input,34,FOLLOW_34_in_rule__RegionSignalDec__Group_3_1_3__03035); 
             after(grammarAccess.getRegionSignalDecAccess().getCommaKeyword_3_1_3_0()); 

            }

            pushFollow(FOLLOW_rule__RegionSignalDec__Group_3_1_3__1_in_rule__RegionSignalDec__Group_3_1_3__03045);
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


    // $ANTLR start rule__RegionSignalDec__Group_3_1_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1474:1: rule__RegionSignalDec__Group_3_1_3__1 : ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) ) ;
    public final void rule__RegionSignalDec__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1478:1: ( ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1479:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1479:1: ( ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1480:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsAssignment_3_1_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1481:1: ( rule__RegionSignalDec__SignalsAssignment_3_1_3_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1481:2: rule__RegionSignalDec__SignalsAssignment_3_1_3_1
            {
            pushFollow(FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_3_1_in_rule__RegionSignalDec__Group_3_1_3__13073);
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
    // $ANTLR end rule__RegionSignalDec__Group_3_1_3__1


    // $ANTLR start rule__Signals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1498:1: rule__Signals__Group__0 : ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1 ;
    public final void rule__Signals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1502:1: ( ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1503:1: ( ( rule__Signals__Group_0__0 ) ) rule__Signals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1503:1: ( ( rule__Signals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1504:1: ( rule__Signals__Group_0__0 )
            {
             before(grammarAccess.getSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1505:1: ( rule__Signals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1505:2: rule__Signals__Group_0__0
            {
            pushFollow(FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__03114);
            rule__Signals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__03123);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1516:1: rule__Signals__Group__1 : ( ';' ) ;
    public final void rule__Signals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1520:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1521:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1521:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1522:1: ';'
            {
             before(grammarAccess.getSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Signals__Group__13152); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1539:1: rule__Signals__Group_0__0 : ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1 ;
    public final void rule__Signals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1543:1: ( ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1544:1: ( ( rule__Signals__SignalsAssignment_0_0 ) ) rule__Signals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1544:1: ( ( rule__Signals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1545:1: ( rule__Signals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1546:1: ( rule__Signals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1546:2: rule__Signals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__03191);
            rule__Signals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__03200);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1557:1: rule__Signals__Group_0__1 : ( ( rule__Signals__Group_0_1__0 )* ) ;
    public final void rule__Signals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1561:1: ( ( ( rule__Signals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1562:1: ( ( rule__Signals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1562:1: ( ( rule__Signals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1563:1: ( rule__Signals__Group_0_1__0 )*
            {
             before(grammarAccess.getSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1564:1: ( rule__Signals__Group_0_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1564:2: rule__Signals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__13228);
            	    rule__Signals__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1578:1: rule__Signals__Group_0_1__0 : ( ',' ) rule__Signals__Group_0_1__1 ;
    public final void rule__Signals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1582:1: ( ( ',' ) rule__Signals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1583:1: ( ',' ) rule__Signals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1583:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1584:1: ','
            {
             before(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Signals__Group_0_1__03268); 
             after(grammarAccess.getSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__03278);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1598:1: rule__Signals__Group_0_1__1 : ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__Signals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1602:1: ( ( ( rule__Signals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1603:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1603:1: ( ( rule__Signals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1604:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1605:1: ( rule__Signals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1605:2: rule__Signals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__13306);
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


    // $ANTLR start rule__Renamings__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1619:1: rule__Renamings__Group__0 : ( ( rule__Renamings__Group_0__0 ) ) rule__Renamings__Group__1 ;
    public final void rule__Renamings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1623:1: ( ( ( rule__Renamings__Group_0__0 ) ) rule__Renamings__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1624:1: ( ( rule__Renamings__Group_0__0 ) ) rule__Renamings__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1624:1: ( ( rule__Renamings__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1625:1: ( rule__Renamings__Group_0__0 )
            {
             before(grammarAccess.getRenamingsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1626:1: ( rule__Renamings__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1626:2: rule__Renamings__Group_0__0
            {
            pushFollow(FOLLOW_rule__Renamings__Group_0__0_in_rule__Renamings__Group__03344);
            rule__Renamings__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getRenamingsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__Renamings__Group__1_in_rule__Renamings__Group__03353);
            rule__Renamings__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group__0


    // $ANTLR start rule__Renamings__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1637:1: rule__Renamings__Group__1 : ( ';' ) ;
    public final void rule__Renamings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1641:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1642:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1642:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1643:1: ';'
            {
             before(grammarAccess.getRenamingsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Renamings__Group__13382); 
             after(grammarAccess.getRenamingsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group__1


    // $ANTLR start rule__Renamings__Group_0__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1660:1: rule__Renamings__Group_0__0 : ( ( rule__Renamings__RenamingsAssignment_0_0 ) ) rule__Renamings__Group_0__1 ;
    public final void rule__Renamings__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1664:1: ( ( ( rule__Renamings__RenamingsAssignment_0_0 ) ) rule__Renamings__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1665:1: ( ( rule__Renamings__RenamingsAssignment_0_0 ) ) rule__Renamings__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1665:1: ( ( rule__Renamings__RenamingsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1666:1: ( rule__Renamings__RenamingsAssignment_0_0 )
            {
             before(grammarAccess.getRenamingsAccess().getRenamingsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1667:1: ( rule__Renamings__RenamingsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1667:2: rule__Renamings__RenamingsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Renamings__RenamingsAssignment_0_0_in_rule__Renamings__Group_0__03421);
            rule__Renamings__RenamingsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getRenamingsAccess().getRenamingsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__Renamings__Group_0__1_in_rule__Renamings__Group_0__03430);
            rule__Renamings__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group_0__0


    // $ANTLR start rule__Renamings__Group_0__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1678:1: rule__Renamings__Group_0__1 : ( ( rule__Renamings__Group_0_1__0 )* ) ;
    public final void rule__Renamings__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1682:1: ( ( ( rule__Renamings__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1683:1: ( ( rule__Renamings__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1683:1: ( ( rule__Renamings__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1684:1: ( rule__Renamings__Group_0_1__0 )*
            {
             before(grammarAccess.getRenamingsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1685:1: ( rule__Renamings__Group_0_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1685:2: rule__Renamings__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Renamings__Group_0_1__0_in_rule__Renamings__Group_0__13458);
            	    rule__Renamings__Group_0_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRenamingsAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group_0__1


    // $ANTLR start rule__Renamings__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1699:1: rule__Renamings__Group_0_1__0 : ( ',' ) rule__Renamings__Group_0_1__1 ;
    public final void rule__Renamings__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1703:1: ( ( ',' ) rule__Renamings__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1704:1: ( ',' ) rule__Renamings__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1704:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1705:1: ','
            {
             before(grammarAccess.getRenamingsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Renamings__Group_0_1__03498); 
             after(grammarAccess.getRenamingsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__Renamings__Group_0_1__1_in_rule__Renamings__Group_0_1__03508);
            rule__Renamings__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group_0_1__0


    // $ANTLR start rule__Renamings__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1719:1: rule__Renamings__Group_0_1__1 : ( ( rule__Renamings__RenamingsAssignment_0_1_1 ) ) ;
    public final void rule__Renamings__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1723:1: ( ( ( rule__Renamings__RenamingsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1724:1: ( ( rule__Renamings__RenamingsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1724:1: ( ( rule__Renamings__RenamingsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1725:1: ( rule__Renamings__RenamingsAssignment_0_1_1 )
            {
             before(grammarAccess.getRenamingsAccess().getRenamingsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1726:1: ( rule__Renamings__RenamingsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1726:2: rule__Renamings__RenamingsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Renamings__RenamingsAssignment_0_1_1_in_rule__Renamings__Group_0_1__13536);
            rule__Renamings__RenamingsAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getRenamingsAccess().getRenamingsAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__Group_0_1__1


    // $ANTLR start rule__InputSignals__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1740:1: rule__InputSignals__Group__0 : ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1 ;
    public final void rule__InputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1744:1: ( ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1745:1: ( ( rule__InputSignals__Group_0__0 ) ) rule__InputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1745:1: ( ( rule__InputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1746:1: ( rule__InputSignals__Group_0__0 )
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1747:1: ( rule__InputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1747:2: rule__InputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__03574);
            rule__InputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__03583);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1758:1: rule__InputSignals__Group__1 : ( ';' ) ;
    public final void rule__InputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1762:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1763:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1763:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1764:1: ';'
            {
             before(grammarAccess.getInputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InputSignals__Group__13612); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1781:1: rule__InputSignals__Group_0__0 : ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1 ;
    public final void rule__InputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1785:1: ( ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1786:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) ) rule__InputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1786:1: ( ( rule__InputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1787:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1788:1: ( rule__InputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1788:2: rule__InputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__03651);
            rule__InputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__03660);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1799:1: rule__InputSignals__Group_0__1 : ( ( rule__InputSignals__Group_0_1__0 )* ) ;
    public final void rule__InputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1803:1: ( ( ( rule__InputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1804:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1804:1: ( ( rule__InputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1805:1: ( rule__InputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1806:1: ( rule__InputSignals__Group_0_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1806:2: rule__InputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__13688);
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
    // $ANTLR end rule__InputSignals__Group_0__1


    // $ANTLR start rule__InputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1820:1: rule__InputSignals__Group_0_1__0 : ( ',' ) rule__InputSignals__Group_0_1__1 ;
    public final void rule__InputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1824:1: ( ( ',' ) rule__InputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1825:1: ( ',' ) rule__InputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1825:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1826:1: ','
            {
             before(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__InputSignals__Group_0_1__03728); 
             after(grammarAccess.getInputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__03738);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1840:1: rule__InputSignals__Group_0_1__1 : ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1844:1: ( ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1845:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1845:1: ( ( rule__InputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1846:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1847:1: ( rule__InputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1847:2: rule__InputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__13766);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1861:1: rule__OutputSignals__Group__0 : ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1 ;
    public final void rule__OutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1865:1: ( ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1866:1: ( ( rule__OutputSignals__Group_0__0 ) ) rule__OutputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1866:1: ( ( rule__OutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1867:1: ( rule__OutputSignals__Group_0__0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1868:1: ( rule__OutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1868:2: rule__OutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__03804);
            rule__OutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__03813);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1879:1: rule__OutputSignals__Group__1 : ( ';' ) ;
    public final void rule__OutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1883:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1884:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1884:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1885:1: ';'
            {
             before(grammarAccess.getOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__OutputSignals__Group__13842); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1902:1: rule__OutputSignals__Group_0__0 : ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1 ;
    public final void rule__OutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1906:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1907:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) ) rule__OutputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1907:1: ( ( rule__OutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1908:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1909:1: ( rule__OutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1909:2: rule__OutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__03881);
            rule__OutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__03890);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1920:1: rule__OutputSignals__Group_0__1 : ( ( rule__OutputSignals__Group_0_1__0 )* ) ;
    public final void rule__OutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1924:1: ( ( ( rule__OutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1925:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1925:1: ( ( rule__OutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1926:1: ( rule__OutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1927:1: ( rule__OutputSignals__Group_0_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1927:2: rule__OutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__13918);
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
    // $ANTLR end rule__OutputSignals__Group_0__1


    // $ANTLR start rule__OutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1941:1: rule__OutputSignals__Group_0_1__0 : ( ',' ) rule__OutputSignals__Group_0_1__1 ;
    public final void rule__OutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1945:1: ( ( ',' ) rule__OutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1946:1: ( ',' ) rule__OutputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1946:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1947:1: ','
            {
             before(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__OutputSignals__Group_0_1__03958); 
             after(grammarAccess.getOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__03968);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1961:1: rule__OutputSignals__Group_0_1__1 : ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__OutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1965:1: ( ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1966:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1966:1: ( ( rule__OutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1967:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1968:1: ( rule__OutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1968:2: rule__OutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__13996);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1982:1: rule__InOutputSignals__Group__0 : ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1 ;
    public final void rule__InOutputSignals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1986:1: ( ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1987:1: ( ( rule__InOutputSignals__Group_0__0 ) ) rule__InOutputSignals__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1987:1: ( ( rule__InOutputSignals__Group_0__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1988:1: ( rule__InOutputSignals__Group_0__0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1989:1: ( rule__InOutputSignals__Group_0__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:1989:2: rule__InOutputSignals__Group_0__0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__04034);
            rule__InOutputSignals__Group_0__0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getGroup_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__04043);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2000:1: rule__InOutputSignals__Group__1 : ( ';' ) ;
    public final void rule__InOutputSignals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2004:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2005:1: ( ';' )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2005:1: ( ';' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2006:1: ';'
            {
             before(grammarAccess.getInOutputSignalsAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InOutputSignals__Group__14072); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2023:1: rule__InOutputSignals__Group_0__0 : ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1 ;
    public final void rule__InOutputSignals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2027:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2028:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) ) rule__InOutputSignals__Group_0__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2028:1: ( ( rule__InOutputSignals__SignalsAssignment_0_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2029:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2030:1: ( rule__InOutputSignals__SignalsAssignment_0_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2030:2: rule__InOutputSignals__SignalsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__04111);
            rule__InOutputSignals__SignalsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__04120);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2041:1: rule__InOutputSignals__Group_0__1 : ( ( rule__InOutputSignals__Group_0_1__0 )* ) ;
    public final void rule__InOutputSignals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2045:1: ( ( ( rule__InOutputSignals__Group_0_1__0 )* ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2046:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2046:1: ( ( rule__InOutputSignals__Group_0_1__0 )* )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2047:1: ( rule__InOutputSignals__Group_0_1__0 )*
            {
             before(grammarAccess.getInOutputSignalsAccess().getGroup_0_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2048:1: ( rule__InOutputSignals__Group_0_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2048:2: rule__InOutputSignals__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__14148);
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
    // $ANTLR end rule__InOutputSignals__Group_0__1


    // $ANTLR start rule__InOutputSignals__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2062:1: rule__InOutputSignals__Group_0_1__0 : ( ',' ) rule__InOutputSignals__Group_0_1__1 ;
    public final void rule__InOutputSignals__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2066:1: ( ( ',' ) rule__InOutputSignals__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2067:1: ( ',' ) rule__InOutputSignals__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2067:1: ( ',' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2068:1: ','
            {
             before(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__InOutputSignals__Group_0_1__04188); 
             after(grammarAccess.getInOutputSignalsAccess().getCommaKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__04198);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2082:1: rule__InOutputSignals__Group_0_1__1 : ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) ;
    public final void rule__InOutputSignals__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2086:1: ( ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2087:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2087:1: ( ( rule__InOutputSignals__SignalsAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2088:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsAssignment_0_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2089:1: ( rule__InOutputSignals__SignalsAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2089:2: rule__InOutputSignals__SignalsAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__14226);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2103:1: rule__Signal__Group_1__0 : ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1 ;
    public final void rule__Signal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2107:1: ( ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2108:1: ( ( rule__Signal__NameAssignment_1_0 ) ) rule__Signal__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2108:1: ( ( rule__Signal__NameAssignment_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2109:1: ( rule__Signal__NameAssignment_1_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2110:1: ( rule__Signal__NameAssignment_1_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2110:2: rule__Signal__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__04264);
            rule__Signal__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__04273);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2121:1: rule__Signal__Group_1__1 : ( ':' ) rule__Signal__Group_1__2 ;
    public final void rule__Signal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2125:1: ( ( ':' ) rule__Signal__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2126:1: ( ':' ) rule__Signal__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2126:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2127:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_1__14302); 
             after(grammarAccess.getSignalAccess().getColonKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__14312);
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


    // $ANTLR start rule__Signal__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2141:1: rule__Signal__Group_1__2 : ( ( rule__Signal__TypeAssignment_1_2 ) ) ;
    public final void rule__Signal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2145:1: ( ( ( rule__Signal__TypeAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2146:1: ( ( rule__Signal__TypeAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2146:1: ( ( rule__Signal__TypeAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2147:1: ( rule__Signal__TypeAssignment_1_2 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2148:1: ( rule__Signal__TypeAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2148:2: rule__Signal__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_1_2_in_rule__Signal__Group_1__24340);
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
    // $ANTLR end rule__Signal__Group_1__2


    // $ANTLR start rule__Signal__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2164:1: rule__Signal__Group_2__0 : ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1 ;
    public final void rule__Signal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2168:1: ( ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2169:1: ( ( rule__Signal__NameAssignment_2_0 ) ) rule__Signal__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2169:1: ( ( rule__Signal__NameAssignment_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2170:1: ( rule__Signal__NameAssignment_2_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2171:1: ( rule__Signal__NameAssignment_2_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2171:2: rule__Signal__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__04380);
            rule__Signal__NameAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__04389);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2182:1: rule__Signal__Group_2__1 : ( ( rule__Signal__Group_2_1__0 ) ) ;
    public final void rule__Signal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2186:1: ( ( ( rule__Signal__Group_2_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2187:1: ( ( rule__Signal__Group_2_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2187:1: ( ( rule__Signal__Group_2_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2188:1: ( rule__Signal__Group_2_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2189:1: ( rule__Signal__Group_2_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2189:2: rule__Signal__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__14417);
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
    // $ANTLR end rule__Signal__Group_2__1


    // $ANTLR start rule__Signal__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2203:1: rule__Signal__Group_2_1__0 : ( ':=' ) rule__Signal__Group_2_1__1 ;
    public final void rule__Signal__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2207:1: ( ( ':=' ) rule__Signal__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2208:1: ( ':=' ) rule__Signal__Group_2_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2208:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2209:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_2_1__04456); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__04466);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2223:1: rule__Signal__Group_2_1__1 : ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) ;
    public final void rule__Signal__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2227:1: ( ( ( rule__Signal__InitialValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2228:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2228:1: ( ( rule__Signal__InitialValueAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2229:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2230:1: ( rule__Signal__InitialValueAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2230:2: rule__Signal__InitialValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__14494);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2244:1: rule__Signal__Group_3__0 : ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1 ;
    public final void rule__Signal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2248:1: ( ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2249:1: ( ( rule__Signal__NameAssignment_3_0 ) ) rule__Signal__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2249:1: ( ( rule__Signal__NameAssignment_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2250:1: ( rule__Signal__NameAssignment_3_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2251:1: ( rule__Signal__NameAssignment_3_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2251:2: rule__Signal__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__04532);
            rule__Signal__NameAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04541);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2262:1: rule__Signal__Group_3__1 : ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2 ;
    public final void rule__Signal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2266:1: ( ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2267:1: ( ( rule__Signal__Group_3_1__0 ) ) rule__Signal__Group_3__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2267:1: ( ( rule__Signal__Group_3_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2268:1: ( rule__Signal__Group_3_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2269:1: ( rule__Signal__Group_3_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2269:2: rule__Signal__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__14569);
            rule__Signal__Group_3_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_3_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__14578);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2280:1: rule__Signal__Group_3__2 : ( ':' ) rule__Signal__Group_3__3 ;
    public final void rule__Signal__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2284:1: ( ( ':' ) rule__Signal__Group_3__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2285:1: ( ':' ) rule__Signal__Group_3__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2285:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2286:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_3_2()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_3__24607); 
             after(grammarAccess.getSignalAccess().getColonKeyword_3_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3__3_in_rule__Signal__Group_3__24617);
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


    // $ANTLR start rule__Signal__Group_3__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2300:1: rule__Signal__Group_3__3 : ( ( rule__Signal__TypeAssignment_3_3 ) ) ;
    public final void rule__Signal__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2304:1: ( ( ( rule__Signal__TypeAssignment_3_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2305:1: ( ( rule__Signal__TypeAssignment_3_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2305:1: ( ( rule__Signal__TypeAssignment_3_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2306:1: ( rule__Signal__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_3_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2307:1: ( rule__Signal__TypeAssignment_3_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2307:2: rule__Signal__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_3_3_in_rule__Signal__Group_3__34645);
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
    // $ANTLR end rule__Signal__Group_3__3


    // $ANTLR start rule__Signal__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2325:1: rule__Signal__Group_3_1__0 : ( ':=' ) rule__Signal__Group_3_1__1 ;
    public final void rule__Signal__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2329:1: ( ( ':=' ) rule__Signal__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2330:1: ( ':=' ) rule__Signal__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2330:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2331:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_3_1__04688); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__04698);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2345:1: rule__Signal__Group_3_1__1 : ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) ;
    public final void rule__Signal__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2349:1: ( ( ( rule__Signal__InitialValueAssignment_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2350:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2350:1: ( ( rule__Signal__InitialValueAssignment_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2351:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_3_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2352:1: ( rule__Signal__InitialValueAssignment_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2352:2: rule__Signal__InitialValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__14726);
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


    // $ANTLR start rule__Signal__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2366:1: rule__Signal__Group_4__0 : ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1 ;
    public final void rule__Signal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2370:1: ( ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2371:1: ( ( rule__Signal__NameAssignment_4_0 ) ) rule__Signal__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2371:1: ( ( rule__Signal__NameAssignment_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2372:1: ( rule__Signal__NameAssignment_4_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2373:1: ( rule__Signal__NameAssignment_4_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2373:2: rule__Signal__NameAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__04764);
            rule__Signal__NameAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_4_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04773);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2384:1: rule__Signal__Group_4__1 : ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2 ;
    public final void rule__Signal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2388:1: ( ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2389:1: ( ( rule__Signal__Group_4_1__0 ) ) rule__Signal__Group_4__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2389:1: ( ( rule__Signal__Group_4_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2390:1: ( rule__Signal__Group_4_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_4_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2391:1: ( rule__Signal__Group_4_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2391:2: rule__Signal__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__14801);
            rule__Signal__Group_4_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_4_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__14810);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2402:1: rule__Signal__Group_4__2 : ( ( rule__Signal__Group_4_2__0 ) ) ;
    public final void rule__Signal__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2406:1: ( ( ( rule__Signal__Group_4_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2407:1: ( ( rule__Signal__Group_4_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2407:1: ( ( rule__Signal__Group_4_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2408:1: ( rule__Signal__Group_4_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_4_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2409:1: ( rule__Signal__Group_4_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2409:2: rule__Signal__Group_4_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_4_2__0_in_rule__Signal__Group_4__24838);
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
    // $ANTLR end rule__Signal__Group_4__2


    // $ANTLR start rule__Signal__Group_4_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2425:1: rule__Signal__Group_4_1__0 : ( ':=' ) rule__Signal__Group_4_1__1 ;
    public final void rule__Signal__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2429:1: ( ( ':=' ) rule__Signal__Group_4_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2430:1: ( ':=' ) rule__Signal__Group_4_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2430:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2431:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_4_1__04879); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__04889);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2445:1: rule__Signal__Group_4_1__1 : ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) ;
    public final void rule__Signal__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2449:1: ( ( ( rule__Signal__InitialValueAssignment_4_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2450:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2450:1: ( ( rule__Signal__InitialValueAssignment_4_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2451:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_4_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2452:1: ( rule__Signal__InitialValueAssignment_4_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2452:2: rule__Signal__InitialValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__14917);
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


    // $ANTLR start rule__Signal__Group_4_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2466:1: rule__Signal__Group_4_2__0 : ( 'combine' ) rule__Signal__Group_4_2__1 ;
    public final void rule__Signal__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2470:1: ( ( 'combine' ) rule__Signal__Group_4_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2471:1: ( 'combine' ) rule__Signal__Group_4_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2471:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2472:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_4_2__04956); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_4_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4_2__1_in_rule__Signal__Group_4_2__04966);
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


    // $ANTLR start rule__Signal__Group_4_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2486:1: rule__Signal__Group_4_2__1 : ( ( rule__Signal__TypeAssignment_4_2_1 ) ) rule__Signal__Group_4_2__2 ;
    public final void rule__Signal__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2490:1: ( ( ( rule__Signal__TypeAssignment_4_2_1 ) ) rule__Signal__Group_4_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2491:1: ( ( rule__Signal__TypeAssignment_4_2_1 ) ) rule__Signal__Group_4_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2491:1: ( ( rule__Signal__TypeAssignment_4_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2492:1: ( rule__Signal__TypeAssignment_4_2_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_4_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2493:1: ( rule__Signal__TypeAssignment_4_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2493:2: rule__Signal__TypeAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_4_2_1_in_rule__Signal__Group_4_2__14994);
            rule__Signal__TypeAssignment_4_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_4_2_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4_2__2_in_rule__Signal__Group_4_2__15003);
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


    // $ANTLR start rule__Signal__Group_4_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2504:1: rule__Signal__Group_4_2__2 : ( 'with' ) rule__Signal__Group_4_2__3 ;
    public final void rule__Signal__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2508:1: ( ( 'with' ) rule__Signal__Group_4_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2509:1: ( 'with' ) rule__Signal__Group_4_2__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2509:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2510:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_4_2_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_4_2__25032); 
             after(grammarAccess.getSignalAccess().getWithKeyword_4_2_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_4_2__3_in_rule__Signal__Group_4_2__25042);
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


    // $ANTLR start rule__Signal__Group_4_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2524:1: rule__Signal__Group_4_2__3 : ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) ) ;
    public final void rule__Signal__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2528:1: ( ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2529:1: ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2529:1: ( ( rule__Signal__CombineOperatorAssignment_4_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2530:1: ( rule__Signal__CombineOperatorAssignment_4_2_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_4_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2531:1: ( rule__Signal__CombineOperatorAssignment_4_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2531:2: rule__Signal__CombineOperatorAssignment_4_2_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_4_2_3_in_rule__Signal__Group_4_2__35070);
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
    // $ANTLR end rule__Signal__Group_4_2__3


    // $ANTLR start rule__Signal__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2549:1: rule__Signal__Group_5__0 : ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1 ;
    public final void rule__Signal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2553:1: ( ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2554:1: ( ( rule__Signal__NameAssignment_5_0 ) ) rule__Signal__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2554:1: ( ( rule__Signal__NameAssignment_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2555:1: ( rule__Signal__NameAssignment_5_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2556:1: ( rule__Signal__NameAssignment_5_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2556:2: rule__Signal__NameAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__05112);
            rule__Signal__NameAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_5_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__05121);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2567:1: rule__Signal__Group_5__1 : ( ':' ) rule__Signal__Group_5__2 ;
    public final void rule__Signal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2571:1: ( ( ':' ) rule__Signal__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2572:1: ( ':' ) rule__Signal__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2572:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2573:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_5_1()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_5__15150); 
             after(grammarAccess.getSignalAccess().getColonKeyword_5_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__15160);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2587:1: rule__Signal__Group_5__2 : ( ( rule__Signal__HostTypeAssignment_5_2 ) ) ;
    public final void rule__Signal__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2591:1: ( ( ( rule__Signal__HostTypeAssignment_5_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2592:1: ( ( rule__Signal__HostTypeAssignment_5_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2592:1: ( ( rule__Signal__HostTypeAssignment_5_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2593:1: ( rule__Signal__HostTypeAssignment_5_2 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_5_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2594:1: ( rule__Signal__HostTypeAssignment_5_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2594:2: rule__Signal__HostTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_5_2_in_rule__Signal__Group_5__25188);
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
    // $ANTLR end rule__Signal__Group_5__2


    // $ANTLR start rule__Signal__Group_6__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2610:1: rule__Signal__Group_6__0 : ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1 ;
    public final void rule__Signal__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2614:1: ( ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2615:1: ( ( rule__Signal__NameAssignment_6_0 ) ) rule__Signal__Group_6__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2615:1: ( ( rule__Signal__NameAssignment_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2616:1: ( rule__Signal__NameAssignment_6_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2617:1: ( rule__Signal__NameAssignment_6_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2617:2: rule__Signal__NameAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__05228);
            rule__Signal__NameAssignment_6_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_6_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__05237);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2628:1: rule__Signal__Group_6__1 : ( ( rule__Signal__Group_6_1__0 ) ) rule__Signal__Group_6__2 ;
    public final void rule__Signal__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2632:1: ( ( ( rule__Signal__Group_6_1__0 ) ) rule__Signal__Group_6__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2633:1: ( ( rule__Signal__Group_6_1__0 ) ) rule__Signal__Group_6__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2633:1: ( ( rule__Signal__Group_6_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2634:1: ( rule__Signal__Group_6_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_6_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2635:1: ( rule__Signal__Group_6_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2635:2: rule__Signal__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__15265);
            rule__Signal__Group_6_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_6_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6__2_in_rule__Signal__Group_6__15274);
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


    // $ANTLR start rule__Signal__Group_6__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2646:1: rule__Signal__Group_6__2 : ( ':' ) rule__Signal__Group_6__3 ;
    public final void rule__Signal__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2650:1: ( ( ':' ) rule__Signal__Group_6__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2651:1: ( ':' ) rule__Signal__Group_6__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2651:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2652:1: ':'
            {
             before(grammarAccess.getSignalAccess().getColonKeyword_6_2()); 
            match(input,31,FOLLOW_31_in_rule__Signal__Group_6__25303); 
             after(grammarAccess.getSignalAccess().getColonKeyword_6_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6__3_in_rule__Signal__Group_6__25313);
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


    // $ANTLR start rule__Signal__Group_6__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2666:1: rule__Signal__Group_6__3 : ( ( rule__Signal__HostTypeAssignment_6_3 ) ) ;
    public final void rule__Signal__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2670:1: ( ( ( rule__Signal__HostTypeAssignment_6_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2671:1: ( ( rule__Signal__HostTypeAssignment_6_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2671:1: ( ( rule__Signal__HostTypeAssignment_6_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2672:1: ( rule__Signal__HostTypeAssignment_6_3 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_6_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2673:1: ( rule__Signal__HostTypeAssignment_6_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2673:2: rule__Signal__HostTypeAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_6_3_in_rule__Signal__Group_6__35341);
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
    // $ANTLR end rule__Signal__Group_6__3


    // $ANTLR start rule__Signal__Group_6_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2691:1: rule__Signal__Group_6_1__0 : ( ':=' ) rule__Signal__Group_6_1__1 ;
    public final void rule__Signal__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2695:1: ( ( ':=' ) rule__Signal__Group_6_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2696:1: ( ':=' ) rule__Signal__Group_6_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2696:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2697:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_6_1__05384); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_6_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__05394);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2711:1: rule__Signal__Group_6_1__1 : ( ( rule__Signal__InitialValueAssignment_6_1_1 ) ) ;
    public final void rule__Signal__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2715:1: ( ( ( rule__Signal__InitialValueAssignment_6_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2716:1: ( ( rule__Signal__InitialValueAssignment_6_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2716:1: ( ( rule__Signal__InitialValueAssignment_6_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2717:1: ( rule__Signal__InitialValueAssignment_6_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_6_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2718:1: ( rule__Signal__InitialValueAssignment_6_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2718:2: rule__Signal__InitialValueAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_6_1_1_in_rule__Signal__Group_6_1__15422);
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
    // $ANTLR end rule__Signal__Group_6_1__1


    // $ANTLR start rule__Signal__Group_7__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2732:1: rule__Signal__Group_7__0 : ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1 ;
    public final void rule__Signal__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2736:1: ( ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2737:1: ( ( rule__Signal__NameAssignment_7_0 ) ) rule__Signal__Group_7__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2737:1: ( ( rule__Signal__NameAssignment_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2738:1: ( rule__Signal__NameAssignment_7_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2739:1: ( rule__Signal__NameAssignment_7_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2739:2: rule__Signal__NameAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__05460);
            rule__Signal__NameAssignment_7_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_7_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__05469);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2750:1: rule__Signal__Group_7__1 : ( ( rule__Signal__Group_7_1__0 ) ) rule__Signal__Group_7__2 ;
    public final void rule__Signal__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2754:1: ( ( ( rule__Signal__Group_7_1__0 ) ) rule__Signal__Group_7__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2755:1: ( ( rule__Signal__Group_7_1__0 ) ) rule__Signal__Group_7__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2755:1: ( ( rule__Signal__Group_7_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2756:1: ( rule__Signal__Group_7_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_7_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2757:1: ( rule__Signal__Group_7_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2757:2: rule__Signal__Group_7_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__15497);
            rule__Signal__Group_7_1__0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup_7_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7__2_in_rule__Signal__Group_7__15506);
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


    // $ANTLR start rule__Signal__Group_7__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2768:1: rule__Signal__Group_7__2 : ( ( rule__Signal__Group_7_2__0 ) ) ;
    public final void rule__Signal__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2772:1: ( ( ( rule__Signal__Group_7_2__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2773:1: ( ( rule__Signal__Group_7_2__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2773:1: ( ( rule__Signal__Group_7_2__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2774:1: ( rule__Signal__Group_7_2__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_7_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2775:1: ( rule__Signal__Group_7_2__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2775:2: rule__Signal__Group_7_2__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_7_2__0_in_rule__Signal__Group_7__25534);
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
    // $ANTLR end rule__Signal__Group_7__2


    // $ANTLR start rule__Signal__Group_7_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2791:1: rule__Signal__Group_7_1__0 : ( ':=' ) rule__Signal__Group_7_1__1 ;
    public final void rule__Signal__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2795:1: ( ( ':=' ) rule__Signal__Group_7_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2796:1: ( ':=' ) rule__Signal__Group_7_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2796:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2797:1: ':='
            {
             before(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Signal__Group_7_1__05575); 
             after(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_7_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__05585);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2811:1: rule__Signal__Group_7_1__1 : ( ( rule__Signal__InitialValueAssignment_7_1_1 ) ) ;
    public final void rule__Signal__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2815:1: ( ( ( rule__Signal__InitialValueAssignment_7_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2816:1: ( ( rule__Signal__InitialValueAssignment_7_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2816:1: ( ( rule__Signal__InitialValueAssignment_7_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2817:1: ( rule__Signal__InitialValueAssignment_7_1_1 )
            {
             before(grammarAccess.getSignalAccess().getInitialValueAssignment_7_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2818:1: ( rule__Signal__InitialValueAssignment_7_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2818:2: rule__Signal__InitialValueAssignment_7_1_1
            {
            pushFollow(FOLLOW_rule__Signal__InitialValueAssignment_7_1_1_in_rule__Signal__Group_7_1__15613);
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
    // $ANTLR end rule__Signal__Group_7_1__1


    // $ANTLR start rule__Signal__Group_7_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2832:1: rule__Signal__Group_7_2__0 : ( 'combine' ) rule__Signal__Group_7_2__1 ;
    public final void rule__Signal__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2836:1: ( ( 'combine' ) rule__Signal__Group_7_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2837:1: ( 'combine' ) rule__Signal__Group_7_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2837:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2838:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_7_2__05652); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_7_2_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_2__1_in_rule__Signal__Group_7_2__05662);
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


    // $ANTLR start rule__Signal__Group_7_2__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2852:1: rule__Signal__Group_7_2__1 : ( ( rule__Signal__HostTypeAssignment_7_2_1 ) ) rule__Signal__Group_7_2__2 ;
    public final void rule__Signal__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2856:1: ( ( ( rule__Signal__HostTypeAssignment_7_2_1 ) ) rule__Signal__Group_7_2__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2857:1: ( ( rule__Signal__HostTypeAssignment_7_2_1 ) ) rule__Signal__Group_7_2__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2857:1: ( ( rule__Signal__HostTypeAssignment_7_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2858:1: ( rule__Signal__HostTypeAssignment_7_2_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_7_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2859:1: ( rule__Signal__HostTypeAssignment_7_2_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2859:2: rule__Signal__HostTypeAssignment_7_2_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_7_2_1_in_rule__Signal__Group_7_2__15690);
            rule__Signal__HostTypeAssignment_7_2_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_7_2_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_2__2_in_rule__Signal__Group_7_2__15699);
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


    // $ANTLR start rule__Signal__Group_7_2__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2870:1: rule__Signal__Group_7_2__2 : ( 'with' ) rule__Signal__Group_7_2__3 ;
    public final void rule__Signal__Group_7_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2874:1: ( ( 'with' ) rule__Signal__Group_7_2__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2875:1: ( 'with' ) rule__Signal__Group_7_2__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2875:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2876:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_7_2_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_7_2__25728); 
             after(grammarAccess.getSignalAccess().getWithKeyword_7_2_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_7_2__3_in_rule__Signal__Group_7_2__25738);
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


    // $ANTLR start rule__Signal__Group_7_2__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2890:1: rule__Signal__Group_7_2__3 : ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) ) ;
    public final void rule__Signal__Group_7_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2894:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2895:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2895:1: ( ( rule__Signal__HostCombineOperatorAssignment_7_2_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2896:1: ( rule__Signal__HostCombineOperatorAssignment_7_2_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_7_2_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2897:1: ( rule__Signal__HostCombineOperatorAssignment_7_2_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2897:2: rule__Signal__HostCombineOperatorAssignment_7_2_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_2_3_in_rule__Signal__Group_7_2__35766);
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
    // $ANTLR end rule__Signal__Group_7_2__3


    // $ANTLR start rule__Signal__Group_8__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2915:1: rule__Signal__Group_8__0 : ( ( rule__Signal__NameAssignment_8_0 ) ) rule__Signal__Group_8__1 ;
    public final void rule__Signal__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2919:1: ( ( ( rule__Signal__NameAssignment_8_0 ) ) rule__Signal__Group_8__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2920:1: ( ( rule__Signal__NameAssignment_8_0 ) ) rule__Signal__Group_8__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2920:1: ( ( rule__Signal__NameAssignment_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2921:1: ( rule__Signal__NameAssignment_8_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_8_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2922:1: ( rule__Signal__NameAssignment_8_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2922:2: rule__Signal__NameAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_8_0_in_rule__Signal__Group_8__05808);
            rule__Signal__NameAssignment_8_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_8_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_8__1_in_rule__Signal__Group_8__05817);
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


    // $ANTLR start rule__Signal__Group_8__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2933:1: rule__Signal__Group_8__1 : ( ( rule__Signal__Group_8_1__0 ) ) ;
    public final void rule__Signal__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2937:1: ( ( ( rule__Signal__Group_8_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2938:1: ( ( rule__Signal__Group_8_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2938:1: ( ( rule__Signal__Group_8_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2939:1: ( rule__Signal__Group_8_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_8_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2940:1: ( rule__Signal__Group_8_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2940:2: rule__Signal__Group_8_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_8_1__0_in_rule__Signal__Group_8__15845);
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
    // $ANTLR end rule__Signal__Group_8__1


    // $ANTLR start rule__Signal__Group_8_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2954:1: rule__Signal__Group_8_1__0 : ( 'combine' ) rule__Signal__Group_8_1__1 ;
    public final void rule__Signal__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2958:1: ( ( 'combine' ) rule__Signal__Group_8_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2959:1: ( 'combine' ) rule__Signal__Group_8_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2959:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2960:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_8_1__05884); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_8_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_8_1__1_in_rule__Signal__Group_8_1__05894);
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


    // $ANTLR start rule__Signal__Group_8_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2974:1: rule__Signal__Group_8_1__1 : ( ( rule__Signal__TypeAssignment_8_1_1 ) ) rule__Signal__Group_8_1__2 ;
    public final void rule__Signal__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2978:1: ( ( ( rule__Signal__TypeAssignment_8_1_1 ) ) rule__Signal__Group_8_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2979:1: ( ( rule__Signal__TypeAssignment_8_1_1 ) ) rule__Signal__Group_8_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2979:1: ( ( rule__Signal__TypeAssignment_8_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2980:1: ( rule__Signal__TypeAssignment_8_1_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_8_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2981:1: ( rule__Signal__TypeAssignment_8_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2981:2: rule__Signal__TypeAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_8_1_1_in_rule__Signal__Group_8_1__15922);
            rule__Signal__TypeAssignment_8_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_8_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_8_1__2_in_rule__Signal__Group_8_1__15931);
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


    // $ANTLR start rule__Signal__Group_8_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2992:1: rule__Signal__Group_8_1__2 : ( 'with' ) rule__Signal__Group_8_1__3 ;
    public final void rule__Signal__Group_8_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2996:1: ( ( 'with' ) rule__Signal__Group_8_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2997:1: ( 'with' ) rule__Signal__Group_8_1__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2997:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:2998:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_8_1_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_8_1__25960); 
             after(grammarAccess.getSignalAccess().getWithKeyword_8_1_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_8_1__3_in_rule__Signal__Group_8_1__25970);
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


    // $ANTLR start rule__Signal__Group_8_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3012:1: rule__Signal__Group_8_1__3 : ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) ) ;
    public final void rule__Signal__Group_8_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3016:1: ( ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3017:1: ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3017:1: ( ( rule__Signal__CombineOperatorAssignment_8_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3018:1: ( rule__Signal__CombineOperatorAssignment_8_1_3 )
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorAssignment_8_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3019:1: ( rule__Signal__CombineOperatorAssignment_8_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3019:2: rule__Signal__CombineOperatorAssignment_8_1_3
            {
            pushFollow(FOLLOW_rule__Signal__CombineOperatorAssignment_8_1_3_in_rule__Signal__Group_8_1__35998);
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
    // $ANTLR end rule__Signal__Group_8_1__3


    // $ANTLR start rule__Signal__Group_9__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3037:1: rule__Signal__Group_9__0 : ( ( rule__Signal__NameAssignment_9_0 ) ) rule__Signal__Group_9__1 ;
    public final void rule__Signal__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3041:1: ( ( ( rule__Signal__NameAssignment_9_0 ) ) rule__Signal__Group_9__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3042:1: ( ( rule__Signal__NameAssignment_9_0 ) ) rule__Signal__Group_9__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3042:1: ( ( rule__Signal__NameAssignment_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3043:1: ( rule__Signal__NameAssignment_9_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_9_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3044:1: ( rule__Signal__NameAssignment_9_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3044:2: rule__Signal__NameAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_9_0_in_rule__Signal__Group_9__06040);
            rule__Signal__NameAssignment_9_0();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_9_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_9__1_in_rule__Signal__Group_9__06049);
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


    // $ANTLR start rule__Signal__Group_9__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3055:1: rule__Signal__Group_9__1 : ( ( rule__Signal__Group_9_1__0 ) ) ;
    public final void rule__Signal__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3059:1: ( ( ( rule__Signal__Group_9_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3060:1: ( ( rule__Signal__Group_9_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3060:1: ( ( rule__Signal__Group_9_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3061:1: ( rule__Signal__Group_9_1__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup_9_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3062:1: ( rule__Signal__Group_9_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3062:2: rule__Signal__Group_9_1__0
            {
            pushFollow(FOLLOW_rule__Signal__Group_9_1__0_in_rule__Signal__Group_9__16077);
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
    // $ANTLR end rule__Signal__Group_9__1


    // $ANTLR start rule__Signal__Group_9_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3076:1: rule__Signal__Group_9_1__0 : ( 'combine' ) rule__Signal__Group_9_1__1 ;
    public final void rule__Signal__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3080:1: ( ( 'combine' ) rule__Signal__Group_9_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3081:1: ( 'combine' ) rule__Signal__Group_9_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3081:1: ( 'combine' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3082:1: 'combine'
            {
             before(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Signal__Group_9_1__06116); 
             after(grammarAccess.getSignalAccess().getCombineKeyword_9_1_0()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_9_1__1_in_rule__Signal__Group_9_1__06126);
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


    // $ANTLR start rule__Signal__Group_9_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3096:1: rule__Signal__Group_9_1__1 : ( ( rule__Signal__HostTypeAssignment_9_1_1 ) ) rule__Signal__Group_9_1__2 ;
    public final void rule__Signal__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3100:1: ( ( ( rule__Signal__HostTypeAssignment_9_1_1 ) ) rule__Signal__Group_9_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3101:1: ( ( rule__Signal__HostTypeAssignment_9_1_1 ) ) rule__Signal__Group_9_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3101:1: ( ( rule__Signal__HostTypeAssignment_9_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3102:1: ( rule__Signal__HostTypeAssignment_9_1_1 )
            {
             before(grammarAccess.getSignalAccess().getHostTypeAssignment_9_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3103:1: ( rule__Signal__HostTypeAssignment_9_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3103:2: rule__Signal__HostTypeAssignment_9_1_1
            {
            pushFollow(FOLLOW_rule__Signal__HostTypeAssignment_9_1_1_in_rule__Signal__Group_9_1__16154);
            rule__Signal__HostTypeAssignment_9_1_1();
            _fsp--;


            }

             after(grammarAccess.getSignalAccess().getHostTypeAssignment_9_1_1()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_9_1__2_in_rule__Signal__Group_9_1__16163);
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


    // $ANTLR start rule__Signal__Group_9_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3114:1: rule__Signal__Group_9_1__2 : ( 'with' ) rule__Signal__Group_9_1__3 ;
    public final void rule__Signal__Group_9_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3118:1: ( ( 'with' ) rule__Signal__Group_9_1__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3119:1: ( 'with' ) rule__Signal__Group_9_1__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3119:1: ( 'with' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3120:1: 'with'
            {
             before(grammarAccess.getSignalAccess().getWithKeyword_9_1_2()); 
            match(input,37,FOLLOW_37_in_rule__Signal__Group_9_1__26192); 
             after(grammarAccess.getSignalAccess().getWithKeyword_9_1_2()); 

            }

            pushFollow(FOLLOW_rule__Signal__Group_9_1__3_in_rule__Signal__Group_9_1__26202);
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


    // $ANTLR start rule__Signal__Group_9_1__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3134:1: rule__Signal__Group_9_1__3 : ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) ) ;
    public final void rule__Signal__Group_9_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3138:1: ( ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3139:1: ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3139:1: ( ( rule__Signal__HostCombineOperatorAssignment_9_1_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3140:1: ( rule__Signal__HostCombineOperatorAssignment_9_1_3 )
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorAssignment_9_1_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3141:1: ( rule__Signal__HostCombineOperatorAssignment_9_1_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3141:2: rule__Signal__HostCombineOperatorAssignment_9_1_3
            {
            pushFollow(FOLLOW_rule__Signal__HostCombineOperatorAssignment_9_1_3_in_rule__Signal__Group_9_1__36230);
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
    // $ANTLR end rule__Signal__Group_9_1__3


    // $ANTLR start rule__Variable__Group_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3159:1: rule__Variable__Group_1__0 : ( ( rule__Variable__NameAssignment_1_0 ) ) rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3163:1: ( ( ( rule__Variable__NameAssignment_1_0 ) ) rule__Variable__Group_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3164:1: ( ( rule__Variable__NameAssignment_1_0 ) ) rule__Variable__Group_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3164:1: ( ( rule__Variable__NameAssignment_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3165:1: ( rule__Variable__NameAssignment_1_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3166:1: ( rule__Variable__NameAssignment_1_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3166:2: rule__Variable__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_1_0_in_rule__Variable__Group_1__06272);
            rule__Variable__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__06281);
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


    // $ANTLR start rule__Variable__Group_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3177:1: rule__Variable__Group_1__1 : ( ':' ) rule__Variable__Group_1__2 ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3181:1: ( ( ':' ) rule__Variable__Group_1__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3182:1: ( ':' ) rule__Variable__Group_1__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3182:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3183:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_1__16310); 
             after(grammarAccess.getVariableAccess().getColonKeyword_1_1()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_1__2_in_rule__Variable__Group_1__16320);
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


    // $ANTLR start rule__Variable__Group_1__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3197:1: rule__Variable__Group_1__2 : ( ( rule__Variable__TypeAssignment_1_2 ) ) ;
    public final void rule__Variable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3201:1: ( ( ( rule__Variable__TypeAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3202:1: ( ( rule__Variable__TypeAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3202:1: ( ( rule__Variable__TypeAssignment_1_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3203:1: ( rule__Variable__TypeAssignment_1_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_1_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3204:1: ( rule__Variable__TypeAssignment_1_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3204:2: rule__Variable__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_1_2_in_rule__Variable__Group_1__26348);
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
    // $ANTLR end rule__Variable__Group_1__2


    // $ANTLR start rule__Variable__Group_2__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3220:1: rule__Variable__Group_2__0 : ( ( rule__Variable__NameAssignment_2_0 ) ) rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3224:1: ( ( ( rule__Variable__NameAssignment_2_0 ) ) rule__Variable__Group_2__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3225:1: ( ( rule__Variable__NameAssignment_2_0 ) ) rule__Variable__Group_2__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3225:1: ( ( rule__Variable__NameAssignment_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3226:1: ( rule__Variable__NameAssignment_2_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3227:1: ( rule__Variable__NameAssignment_2_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3227:2: rule__Variable__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_2_0_in_rule__Variable__Group_2__06388);
            rule__Variable__NameAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__06397);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3238:1: rule__Variable__Group_2__1 : ( ( rule__Variable__Group_2_1__0 ) ) ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3242:1: ( ( ( rule__Variable__Group_2_1__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3243:1: ( ( rule__Variable__Group_2_1__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3243:1: ( ( rule__Variable__Group_2_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3244:1: ( rule__Variable__Group_2_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_2_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3245:1: ( rule__Variable__Group_2_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3245:2: rule__Variable__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_2_1__0_in_rule__Variable__Group_2__16425);
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
    // $ANTLR end rule__Variable__Group_2__1


    // $ANTLR start rule__Variable__Group_2_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3259:1: rule__Variable__Group_2_1__0 : ( ':=' ) rule__Variable__Group_2_1__1 ;
    public final void rule__Variable__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3263:1: ( ( ':=' ) rule__Variable__Group_2_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3264:1: ( ':=' ) rule__Variable__Group_2_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3264:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3265:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_2_1__06464); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_2_1__1_in_rule__Variable__Group_2_1__06474);
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


    // $ANTLR start rule__Variable__Group_2_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3279:1: rule__Variable__Group_2_1__1 : ( ( rule__Variable__InitialValueAssignment_2_1_1 ) ) ;
    public final void rule__Variable__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3283:1: ( ( ( rule__Variable__InitialValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3284:1: ( ( rule__Variable__InitialValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3284:1: ( ( rule__Variable__InitialValueAssignment_2_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3285:1: ( rule__Variable__InitialValueAssignment_2_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_2_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3286:1: ( rule__Variable__InitialValueAssignment_2_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3286:2: rule__Variable__InitialValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_2_1_1_in_rule__Variable__Group_2_1__16502);
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
    // $ANTLR end rule__Variable__Group_2_1__1


    // $ANTLR start rule__Variable__Group_3__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3300:1: rule__Variable__Group_3__0 : ( ( rule__Variable__NameAssignment_3_0 ) ) rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3304:1: ( ( ( rule__Variable__NameAssignment_3_0 ) ) rule__Variable__Group_3__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3305:1: ( ( rule__Variable__NameAssignment_3_0 ) ) rule__Variable__Group_3__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3305:1: ( ( rule__Variable__NameAssignment_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3306:1: ( rule__Variable__NameAssignment_3_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3307:1: ( rule__Variable__NameAssignment_3_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3307:2: rule__Variable__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_3_0_in_rule__Variable__Group_3__06540);
            rule__Variable__NameAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__06549);
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


    // $ANTLR start rule__Variable__Group_3__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3318:1: rule__Variable__Group_3__1 : ( ( rule__Variable__Group_3_1__0 ) ) rule__Variable__Group_3__2 ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3322:1: ( ( ( rule__Variable__Group_3_1__0 ) ) rule__Variable__Group_3__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3323:1: ( ( rule__Variable__Group_3_1__0 ) ) rule__Variable__Group_3__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3323:1: ( ( rule__Variable__Group_3_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3324:1: ( rule__Variable__Group_3_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_3_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3325:1: ( rule__Variable__Group_3_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3325:2: rule__Variable__Group_3_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_3_1__0_in_rule__Variable__Group_3__16577);
            rule__Variable__Group_3_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_3_1()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_3__2_in_rule__Variable__Group_3__16586);
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


    // $ANTLR start rule__Variable__Group_3__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3336:1: rule__Variable__Group_3__2 : ( ':' ) rule__Variable__Group_3__3 ;
    public final void rule__Variable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3340:1: ( ( ':' ) rule__Variable__Group_3__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3341:1: ( ':' ) rule__Variable__Group_3__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3341:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3342:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_3_2()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_3__26615); 
             after(grammarAccess.getVariableAccess().getColonKeyword_3_2()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_3__3_in_rule__Variable__Group_3__26625);
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


    // $ANTLR start rule__Variable__Group_3__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3356:1: rule__Variable__Group_3__3 : ( ( rule__Variable__TypeAssignment_3_3 ) ) ;
    public final void rule__Variable__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3360:1: ( ( ( rule__Variable__TypeAssignment_3_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3361:1: ( ( rule__Variable__TypeAssignment_3_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3361:1: ( ( rule__Variable__TypeAssignment_3_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3362:1: ( rule__Variable__TypeAssignment_3_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3363:1: ( rule__Variable__TypeAssignment_3_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3363:2: rule__Variable__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_3_3_in_rule__Variable__Group_3__36653);
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
    // $ANTLR end rule__Variable__Group_3__3


    // $ANTLR start rule__Variable__Group_3_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3381:1: rule__Variable__Group_3_1__0 : ( ':=' ) rule__Variable__Group_3_1__1 ;
    public final void rule__Variable__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3385:1: ( ( ':=' ) rule__Variable__Group_3_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3386:1: ( ':=' ) rule__Variable__Group_3_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3386:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3387:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_3_1__06696); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_3_1__1_in_rule__Variable__Group_3_1__06706);
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


    // $ANTLR start rule__Variable__Group_3_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3401:1: rule__Variable__Group_3_1__1 : ( ( rule__Variable__InitialValueAssignment_3_1_1 ) ) ;
    public final void rule__Variable__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3405:1: ( ( ( rule__Variable__InitialValueAssignment_3_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3406:1: ( ( rule__Variable__InitialValueAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3406:1: ( ( rule__Variable__InitialValueAssignment_3_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3407:1: ( rule__Variable__InitialValueAssignment_3_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_3_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3408:1: ( rule__Variable__InitialValueAssignment_3_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3408:2: rule__Variable__InitialValueAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_3_1_1_in_rule__Variable__Group_3_1__16734);
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
    // $ANTLR end rule__Variable__Group_3_1__1


    // $ANTLR start rule__Variable__Group_4__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3422:1: rule__Variable__Group_4__0 : ( ( rule__Variable__NameAssignment_4_0 ) ) rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3426:1: ( ( ( rule__Variable__NameAssignment_4_0 ) ) rule__Variable__Group_4__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3427:1: ( ( rule__Variable__NameAssignment_4_0 ) ) rule__Variable__Group_4__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3427:1: ( ( rule__Variable__NameAssignment_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3428:1: ( rule__Variable__NameAssignment_4_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3429:1: ( rule__Variable__NameAssignment_4_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3429:2: rule__Variable__NameAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_4_0_in_rule__Variable__Group_4__06772);
            rule__Variable__NameAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__06781);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3440:1: rule__Variable__Group_4__1 : ( ':' ) rule__Variable__Group_4__2 ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3444:1: ( ( ':' ) rule__Variable__Group_4__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3445:1: ( ':' ) rule__Variable__Group_4__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3445:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3446:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_4_1()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_4__16810); 
             after(grammarAccess.getVariableAccess().getColonKeyword_4_1()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_4__2_in_rule__Variable__Group_4__16820);
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


    // $ANTLR start rule__Variable__Group_4__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3460:1: rule__Variable__Group_4__2 : ( ( rule__Variable__HostTypeAssignment_4_2 ) ) ;
    public final void rule__Variable__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3464:1: ( ( ( rule__Variable__HostTypeAssignment_4_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3465:1: ( ( rule__Variable__HostTypeAssignment_4_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3465:1: ( ( rule__Variable__HostTypeAssignment_4_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3466:1: ( rule__Variable__HostTypeAssignment_4_2 )
            {
             before(grammarAccess.getVariableAccess().getHostTypeAssignment_4_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3467:1: ( rule__Variable__HostTypeAssignment_4_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3467:2: rule__Variable__HostTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Variable__HostTypeAssignment_4_2_in_rule__Variable__Group_4__26848);
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
    // $ANTLR end rule__Variable__Group_4__2


    // $ANTLR start rule__Variable__Group_5__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3483:1: rule__Variable__Group_5__0 : ( ( rule__Variable__NameAssignment_5_0 ) ) rule__Variable__Group_5__1 ;
    public final void rule__Variable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3487:1: ( ( ( rule__Variable__NameAssignment_5_0 ) ) rule__Variable__Group_5__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3488:1: ( ( rule__Variable__NameAssignment_5_0 ) ) rule__Variable__Group_5__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3488:1: ( ( rule__Variable__NameAssignment_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3489:1: ( rule__Variable__NameAssignment_5_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3490:1: ( rule__Variable__NameAssignment_5_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3490:2: rule__Variable__NameAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_5_0_in_rule__Variable__Group_5__06888);
            rule__Variable__NameAssignment_5_0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_5__1_in_rule__Variable__Group_5__06897);
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


    // $ANTLR start rule__Variable__Group_5__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3501:1: rule__Variable__Group_5__1 : ( ( rule__Variable__Group_5_1__0 ) ) rule__Variable__Group_5__2 ;
    public final void rule__Variable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3505:1: ( ( ( rule__Variable__Group_5_1__0 ) ) rule__Variable__Group_5__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3506:1: ( ( rule__Variable__Group_5_1__0 ) ) rule__Variable__Group_5__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3506:1: ( ( rule__Variable__Group_5_1__0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3507:1: ( rule__Variable__Group_5_1__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup_5_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3508:1: ( rule__Variable__Group_5_1__0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3508:2: rule__Variable__Group_5_1__0
            {
            pushFollow(FOLLOW_rule__Variable__Group_5_1__0_in_rule__Variable__Group_5__16925);
            rule__Variable__Group_5_1__0();
            _fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup_5_1()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_5__2_in_rule__Variable__Group_5__16934);
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


    // $ANTLR start rule__Variable__Group_5__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3519:1: rule__Variable__Group_5__2 : ( ':' ) rule__Variable__Group_5__3 ;
    public final void rule__Variable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3523:1: ( ( ':' ) rule__Variable__Group_5__3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3524:1: ( ':' ) rule__Variable__Group_5__3
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3524:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3525:1: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_5_2()); 
            match(input,31,FOLLOW_31_in_rule__Variable__Group_5__26963); 
             after(grammarAccess.getVariableAccess().getColonKeyword_5_2()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_5__3_in_rule__Variable__Group_5__26973);
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


    // $ANTLR start rule__Variable__Group_5__3
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3539:1: rule__Variable__Group_5__3 : ( ( rule__Variable__HostTypeAssignment_5_3 ) ) ;
    public final void rule__Variable__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3543:1: ( ( ( rule__Variable__HostTypeAssignment_5_3 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3544:1: ( ( rule__Variable__HostTypeAssignment_5_3 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3544:1: ( ( rule__Variable__HostTypeAssignment_5_3 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3545:1: ( rule__Variable__HostTypeAssignment_5_3 )
            {
             before(grammarAccess.getVariableAccess().getHostTypeAssignment_5_3()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3546:1: ( rule__Variable__HostTypeAssignment_5_3 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3546:2: rule__Variable__HostTypeAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Variable__HostTypeAssignment_5_3_in_rule__Variable__Group_5__37001);
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
    // $ANTLR end rule__Variable__Group_5__3


    // $ANTLR start rule__Variable__Group_5_1__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3564:1: rule__Variable__Group_5_1__0 : ( ':=' ) rule__Variable__Group_5_1__1 ;
    public final void rule__Variable__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3568:1: ( ( ':=' ) rule__Variable__Group_5_1__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3569:1: ( ':=' ) rule__Variable__Group_5_1__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3569:1: ( ':=' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3570:1: ':='
            {
             before(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_5_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Variable__Group_5_1__07044); 
             after(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_5_1_0()); 

            }

            pushFollow(FOLLOW_rule__Variable__Group_5_1__1_in_rule__Variable__Group_5_1__07054);
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


    // $ANTLR start rule__Variable__Group_5_1__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3584:1: rule__Variable__Group_5_1__1 : ( ( rule__Variable__InitialValueAssignment_5_1_1 ) ) ;
    public final void rule__Variable__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3588:1: ( ( ( rule__Variable__InitialValueAssignment_5_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3589:1: ( ( rule__Variable__InitialValueAssignment_5_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3589:1: ( ( rule__Variable__InitialValueAssignment_5_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3590:1: ( rule__Variable__InitialValueAssignment_5_1_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_5_1_1()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3591:1: ( rule__Variable__InitialValueAssignment_5_1_1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3591:2: rule__Variable__InitialValueAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Variable__InitialValueAssignment_5_1_1_in_rule__Variable__Group_5_1__17082);
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
    // $ANTLR end rule__Variable__Group_5_1__1


    // $ANTLR start rule__Renaming__Group__0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3605:1: rule__Renaming__Group__0 : ( ( rule__Renaming__OldIDAssignment_0 ) ) rule__Renaming__Group__1 ;
    public final void rule__Renaming__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3609:1: ( ( ( rule__Renaming__OldIDAssignment_0 ) ) rule__Renaming__Group__1 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3610:1: ( ( rule__Renaming__OldIDAssignment_0 ) ) rule__Renaming__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3610:1: ( ( rule__Renaming__OldIDAssignment_0 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3611:1: ( rule__Renaming__OldIDAssignment_0 )
            {
             before(grammarAccess.getRenamingAccess().getOldIDAssignment_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3612:1: ( rule__Renaming__OldIDAssignment_0 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3612:2: rule__Renaming__OldIDAssignment_0
            {
            pushFollow(FOLLOW_rule__Renaming__OldIDAssignment_0_in_rule__Renaming__Group__07120);
            rule__Renaming__OldIDAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRenamingAccess().getOldIDAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Renaming__Group__1_in_rule__Renaming__Group__07129);
            rule__Renaming__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renaming__Group__0


    // $ANTLR start rule__Renaming__Group__1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3623:1: rule__Renaming__Group__1 : ( '/' ) rule__Renaming__Group__2 ;
    public final void rule__Renaming__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3627:1: ( ( '/' ) rule__Renaming__Group__2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3628:1: ( '/' ) rule__Renaming__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3628:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3629:1: '/'
            {
             before(grammarAccess.getRenamingAccess().getSolidusKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Renaming__Group__17158); 
             after(grammarAccess.getRenamingAccess().getSolidusKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Renaming__Group__2_in_rule__Renaming__Group__17168);
            rule__Renaming__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renaming__Group__1


    // $ANTLR start rule__Renaming__Group__2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3643:1: rule__Renaming__Group__2 : ( ( rule__Renaming__NewIDAssignment_2 ) ) ;
    public final void rule__Renaming__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3647:1: ( ( ( rule__Renaming__NewIDAssignment_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3648:1: ( ( rule__Renaming__NewIDAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3648:1: ( ( rule__Renaming__NewIDAssignment_2 ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3649:1: ( rule__Renaming__NewIDAssignment_2 )
            {
             before(grammarAccess.getRenamingAccess().getNewIDAssignment_2()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3650:1: ( rule__Renaming__NewIDAssignment_2 )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3650:2: rule__Renaming__NewIDAssignment_2
            {
            pushFollow(FOLLOW_rule__Renaming__NewIDAssignment_2_in_rule__Renaming__Group__27196);
            rule__Renaming__NewIDAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRenamingAccess().getNewIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renaming__Group__2


    // $ANTLR start rule__StateExtend__RegionsAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3667:1: rule__StateExtend__RegionsAssignment_0 : ( ruleRegionSignalDec ) ;
    public final void rule__StateExtend__RegionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3671:1: ( ( ruleRegionSignalDec ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3672:1: ( ruleRegionSignalDec )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3672:1: ( ruleRegionSignalDec )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3673:1: ruleRegionSignalDec
            {
             before(grammarAccess.getStateExtendAccess().getRegionsRegionSignalDecParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_07237);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3682:1: rule__StateExtend__InOutputSignalsAssignment_1_2 : ( ruleInOutputSignals ) ;
    public final void rule__StateExtend__InOutputSignalsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3686:1: ( ( ruleInOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3687:1: ( ruleInOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3687:1: ( ruleInOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3688:1: ruleInOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInOutputSignalsInOutputSignalsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_1_27268);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3697:1: rule__StateExtend__OutputSignalsAssignment_2_1 : ( ruleOutputSignals ) ;
    public final void rule__StateExtend__OutputSignalsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3701:1: ( ( ruleOutputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3702:1: ( ruleOutputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3702:1: ( ruleOutputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3703:1: ruleOutputSignals
            {
             before(grammarAccess.getStateExtendAccess().getOutputSignalsOutputSignalsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_2_17299);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3712:1: rule__StateExtend__InputSignalsAssignment_3_1 : ( ruleInputSignals ) ;
    public final void rule__StateExtend__InputSignalsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3716:1: ( ( ruleInputSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3717:1: ( ruleInputSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3717:1: ( ruleInputSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3718:1: ruleInputSignals
            {
             before(grammarAccess.getStateExtendAccess().getInputSignalsInputSignalsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_3_17330);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3727:1: rule__StateExtend__SignalsAssignment_4_1 : ( ruleSignals ) ;
    public final void rule__StateExtend__SignalsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3731:1: ( ( ruleSignals ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3732:1: ( ruleSignals )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3732:1: ( ruleSignals )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3733:1: ruleSignals
            {
             before(grammarAccess.getStateExtendAccess().getSignalsSignalsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_4_17361);
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


    // $ANTLR start rule__StateExtend__RenamingsAssignment_5_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3742:1: rule__StateExtend__RenamingsAssignment_5_1 : ( ruleRenamings ) ;
    public final void rule__StateExtend__RenamingsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3746:1: ( ( ruleRenamings ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3747:1: ( ruleRenamings )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3747:1: ( ruleRenamings )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3748:1: ruleRenamings
            {
             before(grammarAccess.getStateExtendAccess().getRenamingsRenamingsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleRenamings_in_rule__StateExtend__RenamingsAssignment_5_17392);
            ruleRenamings();
            _fsp--;

             after(grammarAccess.getStateExtendAccess().getRenamingsRenamingsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateExtend__RenamingsAssignment_5_1


    // $ANTLR start rule__RegionSignalDec__RegionAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3757:1: rule__RegionSignalDec__RegionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RegionSignalDec__RegionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3761:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3762:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3762:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3763:1: ( RULE_ID )
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionCrossReference_0_0()); 
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3764:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3765:1: RULE_ID
            {
             before(grammarAccess.getRegionSignalDecAccess().getRegionRegionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_07427); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3776:1: rule__RegionSignalDec__VarsAssignment_2_0_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3780:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3781:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3781:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3782:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_17462);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3791:1: rule__RegionSignalDec__VarsAssignment_2_0_2_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3795:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3796:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3796:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3797:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_2_17493);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3806:1: rule__RegionSignalDec__SignalsAssignment_2_1_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3810:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3811:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3811:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3812:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_17524);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3821:1: rule__RegionSignalDec__SignalsAssignment_2_1_2_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3825:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3826:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3826:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3827:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_2_17555);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3836:1: rule__RegionSignalDec__VarsAssignment_3_0_2 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3840:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3841:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3841:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3842:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_27586);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3851:1: rule__RegionSignalDec__VarsAssignment_3_0_3_1 : ( ruleVariable ) ;
    public final void rule__RegionSignalDec__VarsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3855:1: ( ( ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3856:1: ( ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3856:1: ( ruleVariable )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3857:1: ruleVariable
            {
             before(grammarAccess.getRegionSignalDecAccess().getVarsVariableParserRuleCall_3_0_3_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_3_17617);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3866:1: rule__RegionSignalDec__SignalsAssignment_3_1_2 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3870:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3871:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3871:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3872:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_27648);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3881:1: rule__RegionSignalDec__SignalsAssignment_3_1_3_1 : ( ruleSignal ) ;
    public final void rule__RegionSignalDec__SignalsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3885:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3886:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3886:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3887:1: ruleSignal
            {
             before(grammarAccess.getRegionSignalDecAccess().getSignalsSignalParserRuleCall_3_1_3_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_3_17679);
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


    // $ANTLR start rule__Signals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3898:1: rule__Signals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3902:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3903:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3903:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3904:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_07712);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3913:1: rule__Signals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__Signals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3917:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3918:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3918:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3919:1: ruleSignal
            {
             before(grammarAccess.getSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_17743);
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


    // $ANTLR start rule__Renamings__RenamingsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3928:1: rule__Renamings__RenamingsAssignment_0_0 : ( ruleRenaming ) ;
    public final void rule__Renamings__RenamingsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3932:1: ( ( ruleRenaming ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3933:1: ( ruleRenaming )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3933:1: ( ruleRenaming )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3934:1: ruleRenaming
            {
             before(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleRenaming_in_rule__Renamings__RenamingsAssignment_0_07774);
            ruleRenaming();
            _fsp--;

             after(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__RenamingsAssignment_0_0


    // $ANTLR start rule__Renamings__RenamingsAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3943:1: rule__Renamings__RenamingsAssignment_0_1_1 : ( ruleRenaming ) ;
    public final void rule__Renamings__RenamingsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3947:1: ( ( ruleRenaming ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3948:1: ( ruleRenaming )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3948:1: ( ruleRenaming )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3949:1: ruleRenaming
            {
             before(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleRenaming_in_rule__Renamings__RenamingsAssignment_0_1_17805);
            ruleRenaming();
            _fsp--;

             after(grammarAccess.getRenamingsAccess().getRenamingsRenamingParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renamings__RenamingsAssignment_0_1_1


    // $ANTLR start rule__InputSignals__SignalsAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3958:1: rule__InputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3962:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3963:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3963:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3964:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_07836);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3973:1: rule__InputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3977:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3978:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3978:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3979:1: ruleSignal
            {
             before(grammarAccess.getInputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_17867);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3988:1: rule__OutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3992:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3993:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3993:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:3994:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_07898);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4003:1: rule__OutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__OutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4007:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4008:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4008:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4009:1: ruleSignal
            {
             before(grammarAccess.getOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_17929);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4018:1: rule__InOutputSignals__SignalsAssignment_0_0 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4022:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4023:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4023:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4024:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_07960);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4033:1: rule__InOutputSignals__SignalsAssignment_0_1_1 : ( ruleSignal ) ;
    public final void rule__InOutputSignals__SignalsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4037:1: ( ( ruleSignal ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4038:1: ( ruleSignal )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4038:1: ( ruleSignal )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4039:1: ruleSignal
            {
             before(grammarAccess.getInOutputSignalsAccess().getSignalsSignalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_17991);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4048:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4052:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4053:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4053:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4054:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_08022); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4063:1: rule__Signal__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4067:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4068:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4068:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4069:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_08053); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4078:1: rule__Signal__TypeAssignment_1_2 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4082:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4083:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4083:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4084:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_1_28084);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4093:1: rule__Signal__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4097:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4098:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4098:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4099:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_08115); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4108:1: rule__Signal__InitialValueAssignment_2_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4112:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4113:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4113:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4114:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_2_1_18146); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4123:1: rule__Signal__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4127:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4128:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4128:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4129:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_08177); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4138:1: rule__Signal__InitialValueAssignment_3_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4142:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4143:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4143:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4144:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_3_1_18208); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4153:1: rule__Signal__TypeAssignment_3_3 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4157:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4158:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4158:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4159:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_38239);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4168:1: rule__Signal__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4172:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4173:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4173:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4174:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_08270); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4183:1: rule__Signal__InitialValueAssignment_4_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4187:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4188:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4188:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4189:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_4_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_4_1_18301); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4198:1: rule__Signal__TypeAssignment_4_2_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4202:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4203:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4203:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4204:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_4_2_18332);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4213:1: rule__Signal__CombineOperatorAssignment_4_2_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_4_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4217:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4218:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4218:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4219:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_4_2_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_4_2_38363);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4228:1: rule__Signal__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4232:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4233:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4233:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4234:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_08394); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4243:1: rule__Signal__HostTypeAssignment_5_2 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4247:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4248:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4248:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4249:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_5_28425); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_5_2_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4258:1: rule__Signal__NameAssignment_6_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4262:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4263:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4263:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4264:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_6_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_08456); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4273:1: rule__Signal__InitialValueAssignment_6_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4277:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4278:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4278:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4279:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_6_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_6_1_18487); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4288:1: rule__Signal__HostTypeAssignment_6_3 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostTypeAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4292:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4293:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4293:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4294:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_6_3_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_6_38518); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_6_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4303:1: rule__Signal__NameAssignment_7_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4307:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4308:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4308:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4309:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_7_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_08549); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4318:1: rule__Signal__InitialValueAssignment_7_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__InitialValueAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4322:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4323:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4323:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4324:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getInitialValueSTRING_DTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_7_1_18580); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4333:1: rule__Signal__HostTypeAssignment_7_2_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostTypeAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4337:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4338:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4338:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4339:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_7_2_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_7_2_18611); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_7_2_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4348:1: rule__Signal__HostCombineOperatorAssignment_7_2_3 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_7_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4352:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4353:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4353:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4354:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_DTerminalRuleCall_7_2_3_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostCombineOperatorAssignment_7_2_38642); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_DTerminalRuleCall_7_2_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4363:1: rule__Signal__NameAssignment_8_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4367:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4368:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4368:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4369:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_8_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_8_08673); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4378:1: rule__Signal__TypeAssignment_8_1_1 : ( ruleValueType ) ;
    public final void rule__Signal__TypeAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4382:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4383:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4383:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4384:1: ruleValueType
            {
             before(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_8_1_18704);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4393:1: rule__Signal__CombineOperatorAssignment_8_1_3 : ( ruleCombineOperator ) ;
    public final void rule__Signal__CombineOperatorAssignment_8_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4397:1: ( ( ruleCombineOperator ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4398:1: ( ruleCombineOperator )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4398:1: ( ruleCombineOperator )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4399:1: ruleCombineOperator
            {
             before(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_3_0()); 
            pushFollow(FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_8_1_38735);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4408:1: rule__Signal__NameAssignment_9_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4412:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4413:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4413:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4414:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_9_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_9_08766); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4423:1: rule__Signal__HostTypeAssignment_9_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostTypeAssignment_9_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4427:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4428:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4428:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4429:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_9_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_9_1_18797); 
             after(grammarAccess.getSignalAccess().getHostTypeSTRING_DTerminalRuleCall_9_1_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4438:1: rule__Signal__HostCombineOperatorAssignment_9_1_3 : ( RULE_STRING_D ) ;
    public final void rule__Signal__HostCombineOperatorAssignment_9_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4442:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4443:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4443:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4444:1: RULE_STRING_D
            {
             before(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_DTerminalRuleCall_9_1_3_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Signal__HostCombineOperatorAssignment_9_1_38828); 
             after(grammarAccess.getSignalAccess().getHostCombineOperatorSTRING_DTerminalRuleCall_9_1_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4453:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4457:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4458:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4458:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4459:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_08859); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4468:1: rule__Variable__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4472:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4473:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4473:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4474:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1_08890); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4483:1: rule__Variable__TypeAssignment_1_2 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4487:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4488:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4488:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4489:1: ruleValueType
            {
             before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_1_28921);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4498:1: rule__Variable__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4502:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4503:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4503:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4504:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_2_08952); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4513:1: rule__Variable__InitialValueAssignment_2_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4517:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4518:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4518:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4519:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_2_1_18983); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4528:1: rule__Variable__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4532:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4533:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4533:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4534:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_3_09014); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4543:1: rule__Variable__InitialValueAssignment_3_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4547:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4548:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4548:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4549:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_3_1_19045); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4558:1: rule__Variable__TypeAssignment_3_3 : ( ruleValueType ) ;
    public final void rule__Variable__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4562:1: ( ( ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4563:1: ( ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4563:1: ( ruleValueType )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4564:1: ruleValueType
            {
             before(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_3_39076);
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4573:1: rule__Variable__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4577:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4578:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4578:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4579:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_4_09107); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4588:1: rule__Variable__HostTypeAssignment_4_2 : ( RULE_STRING_D ) ;
    public final void rule__Variable__HostTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4592:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4593:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4593:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4594:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getHostTypeSTRING_DTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__HostTypeAssignment_4_29138); 
             after(grammarAccess.getVariableAccess().getHostTypeSTRING_DTerminalRuleCall_4_2_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4603:1: rule__Variable__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4607:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4608:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4608:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4609:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_5_09169); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4618:1: rule__Variable__InitialValueAssignment_5_1_1 : ( RULE_STRING_D ) ;
    public final void rule__Variable__InitialValueAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4622:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4623:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4623:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4624:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getInitialValueSTRING_DTerminalRuleCall_5_1_1_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_5_1_19200); 
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
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4633:1: rule__Variable__HostTypeAssignment_5_3 : ( RULE_STRING_D ) ;
    public final void rule__Variable__HostTypeAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4637:1: ( ( RULE_STRING_D ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4638:1: ( RULE_STRING_D )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4638:1: ( RULE_STRING_D )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4639:1: RULE_STRING_D
            {
             before(grammarAccess.getVariableAccess().getHostTypeSTRING_DTerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING_D,FOLLOW_RULE_STRING_D_in_rule__Variable__HostTypeAssignment_5_39231); 
             after(grammarAccess.getVariableAccess().getHostTypeSTRING_DTerminalRuleCall_5_3_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Renaming__OldIDAssignment_0
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4648:1: rule__Renaming__OldIDAssignment_0 : ( RULE_ID ) ;
    public final void rule__Renaming__OldIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4652:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4653:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4653:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4654:1: RULE_ID
            {
             before(grammarAccess.getRenamingAccess().getOldIDIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Renaming__OldIDAssignment_09262); 
             after(grammarAccess.getRenamingAccess().getOldIDIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renaming__OldIDAssignment_0


    // $ANTLR start rule__Renaming__NewIDAssignment_2
    // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4663:1: rule__Renaming__NewIDAssignment_2 : ( RULE_ID ) ;
    public final void rule__Renaming__NewIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4667:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4668:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4668:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.interfacedeclparser.ui/src-gen/de/cau/cs/kieler/synccharts/interfacedeclparser/ui/contentassist/antlr/internal/InternalInterfaceDecl.g:4669:1: RULE_ID
            {
             before(grammarAccess.getRenamingAccess().getNewIDIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Renaming__NewIDAssignment_29293); 
             after(grammarAccess.getRenamingAccess().getNewIDIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Renaming__NewIDAssignment_2


 

    public static final BitSet FOLLOW_ruleStateExtend_in_entryRuleStateExtend61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateExtend68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend96 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_rule__StateExtend__Alternatives_in_ruleStateExtend108 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_entryRuleRegionSignalDec138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegionSignalDec145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__0_in_ruleRegionSignalDec171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_entryRuleSignals200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignals207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group__0_in_ruleSignals233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenamings_in_entryRuleRenamings260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenamings267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renamings__Group__0_in_ruleRenamings293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_entryRuleInputSignals320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSignals327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__0_in_ruleInputSignals353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_entryRuleOutputSignals380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSignals387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__0_in_ruleOutputSignals413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_entryRuleInOutputSignals440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutputSignals447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__0_in_ruleInOutputSignals473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Alternatives_in_ruleVariable593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renaming__Group__0_in_ruleRenaming653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueType__Alternatives_in_ruleValueType690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CombineOperator__Alternatives_in_ruleCombineOperator726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__RegionsAssignment_0_in_rule__StateExtend__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__0_in_rule__StateExtend__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__0_in_rule__StateExtend__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__0_in_rule__StateExtend__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__0_in_rule__StateExtend__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__0_in_rule__StateExtend__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__0_in_rule__RegionSignalDec__Alternatives_2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__0_in_rule__RegionSignalDec__Alternatives_2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__0_in_rule__RegionSignalDec__Alternatives_3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__0_in_rule__RegionSignalDec__Alternatives_3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__0_in_rule__Signal__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__0_in_rule__Signal__Alternatives1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__0_in_rule__Signal__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__0_in_rule__Signal__Alternatives1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__0_in_rule__Signal__Alternatives1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__0_in_rule__Signal__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__0_in_rule__Signal__Alternatives1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__0_in_rule__Signal__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__0_in_rule__Signal__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__0_in_rule__Variable__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__0_in_rule__Variable__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__0_in_rule__Variable__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__0_in_rule__Variable__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__0_in_rule__Variable__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ValueType__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ValueType__Alternatives1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ValueType__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ValueType__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ValueType__Alternatives1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ValueType__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CombineOperator__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CombineOperator__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CombineOperator__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CombineOperator__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CombineOperator__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CombineOperator__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CombineOperator__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CombineOperator__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateExtend__Group_1__01631 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__1_in_rule__StateExtend__Group_1__01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateExtend__Group_1__11670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_1__2_in_rule__StateExtend__Group_1__11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InOutputSignalsAssignment_1_2_in_rule__StateExtend__Group_1__21708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StateExtend__Group_2__01749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_2__1_in_rule__StateExtend__Group_2__01759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__OutputSignalsAssignment_2_1_in_rule__StateExtend__Group_2__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__StateExtend__Group_3__01826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_3__1_in_rule__StateExtend__Group_3__01836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__InputSignalsAssignment_3_1_in_rule__StateExtend__Group_3__11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StateExtend__Group_4__01903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_4__1_in_rule__StateExtend__Group_4__01913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__SignalsAssignment_4_1_in_rule__StateExtend__Group_4__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StateExtend__Group_5__01980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StateExtend__Group_5__1_in_rule__StateExtend__Group_5__01990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateExtend__RenamingsAssignment_5_1_in_rule__StateExtend__Group_5__12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__RegionAssignment_0_in_rule__RegionSignalDec__Group__02056 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__1_in_rule__RegionSignalDec__Group__02065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RegionSignalDec__Group__12094 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__2_in_rule__RegionSignalDec__Group__12104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_2_in_rule__RegionSignalDec__Group__22132 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__3_in_rule__RegionSignalDec__Group__22141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Alternatives_3_in_rule__RegionSignalDec__Group__32169 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group__4_in_rule__RegionSignalDec__Group__32179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RegionSignalDec__Group__42208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RegionSignalDec__Group_2_0__02254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__1_in_rule__RegionSignalDec__Group_2_0__02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_1_in_rule__RegionSignalDec__Group_2_0__12292 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0__2_in_rule__RegionSignalDec__Group_2_0__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__0_in_rule__RegionSignalDec__Group_2_0__22329 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_2_0_2__02371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_0_2__1_in_rule__RegionSignalDec__Group_2_0_2__02381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_2_0_2_1_in_rule__RegionSignalDec__Group_2_0_2__12409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegionSignalDec__Group_2_1__02448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__1_in_rule__RegionSignalDec__Group_2_1__02458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_1_in_rule__RegionSignalDec__Group_2_1__12486 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1__2_in_rule__RegionSignalDec__Group_2_1__12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__0_in_rule__RegionSignalDec__Group_2_1__22523 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_2_1_2__02565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_2_1_2__1_in_rule__RegionSignalDec__Group_2_1_2__02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_2_1_2_1_in_rule__RegionSignalDec__Group_2_1_2__12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_0__02642 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__1_in_rule__RegionSignalDec__Group_3_0__02652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RegionSignalDec__Group_3_0__12681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__2_in_rule__RegionSignalDec__Group_3_0__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_2_in_rule__RegionSignalDec__Group_3_0__22719 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0__3_in_rule__RegionSignalDec__Group_3_0__22728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__0_in_rule__RegionSignalDec__Group_3_0__32756 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_0_3__02800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_0_3__1_in_rule__RegionSignalDec__Group_3_0_3__02810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__VarsAssignment_3_0_3_1_in_rule__RegionSignalDec__Group_3_0_3__12838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_1__02877 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__1_in_rule__RegionSignalDec__Group_3_1__02887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegionSignalDec__Group_3_1__12916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__2_in_rule__RegionSignalDec__Group_3_1__12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_2_in_rule__RegionSignalDec__Group_3_1__22954 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1__3_in_rule__RegionSignalDec__Group_3_1__22963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__0_in_rule__RegionSignalDec__Group_3_1__32991 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__RegionSignalDec__Group_3_1_3__03035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__Group_3_1_3__1_in_rule__RegionSignalDec__Group_3_1_3__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegionSignalDec__SignalsAssignment_3_1_3_1_in_rule__RegionSignalDec__Group_3_1_3__13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__0_in_rule__Signals__Group__03114 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Signals__Group__1_in_rule__Signals__Group__03123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Signals__Group__13152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_0_in_rule__Signals__Group_0__03191 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0__1_in_rule__Signals__Group_0__03200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__0_in_rule__Signals__Group_0__13228 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__Signals__Group_0_1__03268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Signals__Group_0_1__1_in_rule__Signals__Group_0_1__03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signals__SignalsAssignment_0_1_1_in_rule__Signals__Group_0_1__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renamings__Group_0__0_in_rule__Renamings__Group__03344 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Renamings__Group__1_in_rule__Renamings__Group__03353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Renamings__Group__13382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renamings__RenamingsAssignment_0_0_in_rule__Renamings__Group_0__03421 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Renamings__Group_0__1_in_rule__Renamings__Group_0__03430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renamings__Group_0_1__0_in_rule__Renamings__Group_0__13458 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__Renamings__Group_0_1__03498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Renamings__Group_0_1__1_in_rule__Renamings__Group_0_1__03508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renamings__RenamingsAssignment_0_1_1_in_rule__Renamings__Group_0_1__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__0_in_rule__InputSignals__Group__03574 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InputSignals__Group__1_in_rule__InputSignals__Group__03583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InputSignals__Group__13612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_0_in_rule__InputSignals__Group_0__03651 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0__1_in_rule__InputSignals__Group_0__03660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__0_in_rule__InputSignals__Group_0__13688 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__InputSignals__Group_0_1__03728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InputSignals__Group_0_1__1_in_rule__InputSignals__Group_0_1__03738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputSignals__SignalsAssignment_0_1_1_in_rule__InputSignals__Group_0_1__13766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__0_in_rule__OutputSignals__Group__03804 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group__1_in_rule__OutputSignals__Group__03813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OutputSignals__Group__13842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_0_in_rule__OutputSignals__Group_0__03881 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0__1_in_rule__OutputSignals__Group_0__03890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__0_in_rule__OutputSignals__Group_0__13918 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__OutputSignals__Group_0_1__03958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutputSignals__Group_0_1__1_in_rule__OutputSignals__Group_0_1__03968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutputSignals__SignalsAssignment_0_1_1_in_rule__OutputSignals__Group_0_1__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__0_in_rule__InOutputSignals__Group__04034 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group__1_in_rule__InOutputSignals__Group__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InOutputSignals__Group__14072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_0_in_rule__InOutputSignals__Group_0__04111 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0__1_in_rule__InOutputSignals__Group_0__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__0_in_rule__InOutputSignals__Group_0__14148 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_rule__InOutputSignals__Group_0_1__04188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InOutputSignals__Group_0_1__1_in_rule__InOutputSignals__Group_0_1__04198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOutputSignals__SignalsAssignment_0_1_1_in_rule__InOutputSignals__Group_0_1__14226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_1_0_in_rule__Signal__Group_1__04264 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__1_in_rule__Signal__Group_1__04273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_1__14302 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_1__2_in_rule__Signal__Group_1__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_1_2_in_rule__Signal__Group_1__24340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_2_0_in_rule__Signal__Group_2__04380 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_2__1_in_rule__Signal__Group_2__04389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__0_in_rule__Signal__Group_2__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_2_1__04456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_2_1__1_in_rule__Signal__Group_2_1__04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_2_1_1_in_rule__Signal__Group_2_1__14494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_3_0_in_rule__Signal__Group_3__04532 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__1_in_rule__Signal__Group_3__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__0_in_rule__Signal__Group_3__14569 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__2_in_rule__Signal__Group_3__14578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_3__24607 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_3__3_in_rule__Signal__Group_3__24617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_3_3_in_rule__Signal__Group_3__34645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_3_1__04688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_3_1__1_in_rule__Signal__Group_3_1__04698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_3_1_1_in_rule__Signal__Group_3_1__14726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_4_0_in_rule__Signal__Group_4__04764 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__1_in_rule__Signal__Group_4__04773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__0_in_rule__Signal__Group_4__14801 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4__2_in_rule__Signal__Group_4__14810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__0_in_rule__Signal__Group_4__24838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_4_1__04879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_1__1_in_rule__Signal__Group_4_1__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_4_1_1_in_rule__Signal__Group_4_1__14917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_4_2__04956 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__1_in_rule__Signal__Group_4_2__04966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_4_2_1_in_rule__Signal__Group_4_2__14994 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__2_in_rule__Signal__Group_4_2__15003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_4_2__25032 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_rule__Signal__Group_4_2__3_in_rule__Signal__Group_4_2__25042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_4_2_3_in_rule__Signal__Group_4_2__35070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_5_0_in_rule__Signal__Group_5__05112 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__1_in_rule__Signal__Group_5__05121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_5__15150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_5__2_in_rule__Signal__Group_5__15160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_5_2_in_rule__Signal__Group_5__25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_6_0_in_rule__Signal__Group_6__05228 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__1_in_rule__Signal__Group_6__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__0_in_rule__Signal__Group_6__15265 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__2_in_rule__Signal__Group_6__15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Signal__Group_6__25303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_6__3_in_rule__Signal__Group_6__25313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_6_3_in_rule__Signal__Group_6__35341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_6_1__05384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_6_1__1_in_rule__Signal__Group_6_1__05394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_6_1_1_in_rule__Signal__Group_6_1__15422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_7_0_in_rule__Signal__Group_7__05460 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__1_in_rule__Signal__Group_7__05469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__0_in_rule__Signal__Group_7__15497 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7__2_in_rule__Signal__Group_7__15506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__0_in_rule__Signal__Group_7__25534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Signal__Group_7_1__05575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_1__1_in_rule__Signal__Group_7_1__05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__InitialValueAssignment_7_1_1_in_rule__Signal__Group_7_1__15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_7_2__05652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__1_in_rule__Signal__Group_7_2__05662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_7_2_1_in_rule__Signal__Group_7_2__15690 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__2_in_rule__Signal__Group_7_2__15699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_7_2__25728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_7_2__3_in_rule__Signal__Group_7_2__25738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_7_2_3_in_rule__Signal__Group_7_2__35766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_8_0_in_rule__Signal__Group_8__05808 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8__1_in_rule__Signal__Group_8__05817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__0_in_rule__Signal__Group_8__15845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_8_1__05884 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__1_in_rule__Signal__Group_8_1__05894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_8_1_1_in_rule__Signal__Group_8_1__15922 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__2_in_rule__Signal__Group_8_1__15931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_8_1__25960 = new BitSet(new long[]{0x0000000007F80000L});
    public static final BitSet FOLLOW_rule__Signal__Group_8_1__3_in_rule__Signal__Group_8_1__25970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__CombineOperatorAssignment_8_1_3_in_rule__Signal__Group_8_1__35998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_9_0_in_rule__Signal__Group_9__06040 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_9__1_in_rule__Signal__Group_9__06049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__0_in_rule__Signal__Group_9__16077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Signal__Group_9_1__06116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__1_in_rule__Signal__Group_9_1__06126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostTypeAssignment_9_1_1_in_rule__Signal__Group_9_1__16154 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__2_in_rule__Signal__Group_9_1__16163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Signal__Group_9_1__26192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal__Group_9_1__3_in_rule__Signal__Group_9_1__26202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__HostCombineOperatorAssignment_9_1_3_in_rule__Signal__Group_9_1__36230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_1_0_in_rule__Variable__Group_1__06272 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__1_in_rule__Variable__Group_1__06281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_1__16310 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Variable__Group_1__2_in_rule__Variable__Group_1__16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_1_2_in_rule__Variable__Group_1__26348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_2_0_in_rule__Variable__Group_2__06388 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_2__1_in_rule__Variable__Group_2__06397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__0_in_rule__Variable__Group_2__16425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_2_1__06464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_2_1__1_in_rule__Variable__Group_2_1__06474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_2_1_1_in_rule__Variable__Group_2_1__16502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_3_0_in_rule__Variable__Group_3__06540 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__1_in_rule__Variable__Group_3__06549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__0_in_rule__Variable__Group_3__16577 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__2_in_rule__Variable__Group_3__16586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_3__26615 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Variable__Group_3__3_in_rule__Variable__Group_3__26625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_3_3_in_rule__Variable__Group_3__36653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_3_1__06696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_3_1__1_in_rule__Variable__Group_3_1__06706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_3_1_1_in_rule__Variable__Group_3_1__16734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_4_0_in_rule__Variable__Group_4__06772 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__1_in_rule__Variable__Group_4__06781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_4__16810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_4__2_in_rule__Variable__Group_4__16820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__HostTypeAssignment_4_2_in_rule__Variable__Group_4__26848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_5_0_in_rule__Variable__Group_5__06888 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__1_in_rule__Variable__Group_5__06897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__0_in_rule__Variable__Group_5__16925 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__2_in_rule__Variable__Group_5__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable__Group_5__26963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_5__3_in_rule__Variable__Group_5__26973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__HostTypeAssignment_5_3_in_rule__Variable__Group_5__37001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Variable__Group_5_1__07044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Variable__Group_5_1__1_in_rule__Variable__Group_5_1__07054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InitialValueAssignment_5_1_1_in_rule__Variable__Group_5_1__17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renaming__OldIDAssignment_0_in_rule__Renaming__Group__07120 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Renaming__Group__1_in_rule__Renaming__Group__07129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Renaming__Group__17158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Renaming__Group__2_in_rule__Renaming__Group__17168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Renaming__NewIDAssignment_2_in_rule__Renaming__Group__27196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegionSignalDec_in_rule__StateExtend__RegionsAssignment_07237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutputSignals_in_rule__StateExtend__InOutputSignalsAssignment_1_27268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputSignals_in_rule__StateExtend__OutputSignalsAssignment_2_17299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSignals_in_rule__StateExtend__InputSignalsAssignment_3_17330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignals_in_rule__StateExtend__SignalsAssignment_4_17361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenamings_in_rule__StateExtend__RenamingsAssignment_5_17392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegionSignalDec__RegionAssignment_07427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_17462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_2_0_2_17493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_17524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_2_1_2_17555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_27586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__RegionSignalDec__VarsAssignment_3_0_3_17617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_27648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RegionSignalDec__SignalsAssignment_3_1_3_17679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_07712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Signals__SignalsAssignment_0_1_17743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_rule__Renamings__RenamingsAssignment_0_07774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_rule__Renamings__RenamingsAssignment_0_1_17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_07836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InputSignals__SignalsAssignment_0_1_17867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_07898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__OutputSignals__SignalsAssignment_0_1_17929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_07960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__InOutputSignals__SignalsAssignment_0_1_17991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_08022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_1_08053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_1_28084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_2_08115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_2_1_18146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_3_08177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_3_1_18208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_3_38239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_4_08270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_4_1_18301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_4_2_18332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_4_2_38363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_5_08394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_5_28425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_6_08456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_6_1_18487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_6_38518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_7_08549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__InitialValueAssignment_7_1_18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_7_2_18611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostCombineOperatorAssignment_7_2_38642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_8_08673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Signal__TypeAssignment_8_1_18704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_rule__Signal__CombineOperatorAssignment_8_1_38735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_9_08766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostTypeAssignment_9_1_18797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Signal__HostCombineOperatorAssignment_9_1_38828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_08859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_1_08890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_1_28921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_2_08952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_2_1_18983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_3_09014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_3_1_19045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_rule__Variable__TypeAssignment_3_39076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_4_09107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__HostTypeAssignment_4_29138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_5_09169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__InitialValueAssignment_5_1_19200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_D_in_rule__Variable__HostTypeAssignment_5_39231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Renaming__OldIDAssignment_09262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Renaming__NewIDAssignment_29293 = new BitSet(new long[]{0x0000000000000002L});

}