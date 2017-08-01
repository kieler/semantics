package de.cau.cs.kieler.railsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.railsl.services.RailSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEG_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End.'", "'Loop.'", "'stop'", "'full'", "'slow'", "'straight'", "'branch'", "'Reach'", "'Pass'", "'Open'", "'Close'", "'on'", "'off'", "'first'", "'second'", "'Start:'", "'Set track'", "'to'", "'.'", "', '", "'and'", "', and'", "'reverse'", "'Set point'", "'Wait for'", "'seconds.'", "'contact of'", "'crossing.'", "'Turn light'", "'Branch:'", "'If'", "'is reached first, do'", "'Parallel:'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SEG_NAME=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRailSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRailSL.g"; }


    	private RailSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(RailSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalRailSL.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalRailSL.g:54:1: ( ruleProgram EOF )
            // InternalRailSL.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRailSL.g:62:1: ruleProgram : ( ( rule__Program__BlockAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:66:2: ( ( ( rule__Program__BlockAssignment ) ) )
            // InternalRailSL.g:67:2: ( ( rule__Program__BlockAssignment ) )
            {
            // InternalRailSL.g:67:2: ( ( rule__Program__BlockAssignment ) )
            // InternalRailSL.g:68:3: ( rule__Program__BlockAssignment )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment()); 
            // InternalRailSL.g:69:3: ( rule__Program__BlockAssignment )
            // InternalRailSL.g:69:4: rule__Program__BlockAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlockAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlockAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBlock"
    // InternalRailSL.g:78:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRailSL.g:79:1: ( ruleBlock EOF )
            // InternalRailSL.g:80:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRailSL.g:87:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:91:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRailSL.g:92:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRailSL.g:92:2: ( ( rule__Block__Group__0 ) )
            // InternalRailSL.g:93:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRailSL.g:94:3: ( rule__Block__Group__0 )
            // InternalRailSL.g:94:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBLOCK_END"
    // InternalRailSL.g:103:1: entryRuleBLOCK_END : ruleBLOCK_END EOF ;
    public final void entryRuleBLOCK_END() throws RecognitionException {
        try {
            // InternalRailSL.g:104:1: ( ruleBLOCK_END EOF )
            // InternalRailSL.g:105:1: ruleBLOCK_END EOF
            {
             before(grammarAccess.getBLOCK_ENDRule()); 
            pushFollow(FOLLOW_1);
            ruleBLOCK_END();

            state._fsp--;

             after(grammarAccess.getBLOCK_ENDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBLOCK_END"


    // $ANTLR start "ruleBLOCK_END"
    // InternalRailSL.g:112:1: ruleBLOCK_END : ( ( rule__BLOCK_END__Alternatives ) ) ;
    public final void ruleBLOCK_END() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:116:2: ( ( ( rule__BLOCK_END__Alternatives ) ) )
            // InternalRailSL.g:117:2: ( ( rule__BLOCK_END__Alternatives ) )
            {
            // InternalRailSL.g:117:2: ( ( rule__BLOCK_END__Alternatives ) )
            // InternalRailSL.g:118:3: ( rule__BLOCK_END__Alternatives )
            {
             before(grammarAccess.getBLOCK_ENDAccess().getAlternatives()); 
            // InternalRailSL.g:119:3: ( rule__BLOCK_END__Alternatives )
            // InternalRailSL.g:119:4: rule__BLOCK_END__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BLOCK_END__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBLOCK_ENDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBLOCK_END"


    // $ANTLR start "entryRuleStatement"
    // InternalRailSL.g:128:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:129:1: ( ruleStatement EOF )
            // InternalRailSL.g:130:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRailSL.g:137:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:141:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRailSL.g:142:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRailSL.g:142:2: ( ( rule__Statement__Alternatives ) )
            // InternalRailSL.g:143:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRailSL.g:144:3: ( rule__Statement__Alternatives )
            // InternalRailSL.g:144:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSetStatement"
    // InternalRailSL.g:153:1: entryRuleSetStatement : ruleSetStatement EOF ;
    public final void entryRuleSetStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:154:1: ( ruleSetStatement EOF )
            // InternalRailSL.g:155:1: ruleSetStatement EOF
            {
             before(grammarAccess.getSetStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSetStatement();

            state._fsp--;

             after(grammarAccess.getSetStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetStatement"


    // $ANTLR start "ruleSetStatement"
    // InternalRailSL.g:162:1: ruleSetStatement : ( ( rule__SetStatement__Alternatives ) ) ;
    public final void ruleSetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:166:2: ( ( ( rule__SetStatement__Alternatives ) ) )
            // InternalRailSL.g:167:2: ( ( rule__SetStatement__Alternatives ) )
            {
            // InternalRailSL.g:167:2: ( ( rule__SetStatement__Alternatives ) )
            // InternalRailSL.g:168:3: ( rule__SetStatement__Alternatives )
            {
             before(grammarAccess.getSetStatementAccess().getAlternatives()); 
            // InternalRailSL.g:169:3: ( rule__SetStatement__Alternatives )
            // InternalRailSL.g:169:4: rule__SetStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SetStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSetStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetStatement"


    // $ANTLR start "entryRuleSetTrackStatement"
    // InternalRailSL.g:178:1: entryRuleSetTrackStatement : ruleSetTrackStatement EOF ;
    public final void entryRuleSetTrackStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:179:1: ( ruleSetTrackStatement EOF )
            // InternalRailSL.g:180:1: ruleSetTrackStatement EOF
            {
             before(grammarAccess.getSetTrackStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSetTrackStatement();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetTrackStatement"


    // $ANTLR start "ruleSetTrackStatement"
    // InternalRailSL.g:187:1: ruleSetTrackStatement : ( ( rule__SetTrackStatement__Group__0 ) ) ;
    public final void ruleSetTrackStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:191:2: ( ( ( rule__SetTrackStatement__Group__0 ) ) )
            // InternalRailSL.g:192:2: ( ( rule__SetTrackStatement__Group__0 ) )
            {
            // InternalRailSL.g:192:2: ( ( rule__SetTrackStatement__Group__0 ) )
            // InternalRailSL.g:193:3: ( rule__SetTrackStatement__Group__0 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup()); 
            // InternalRailSL.g:194:3: ( rule__SetTrackStatement__Group__0 )
            // InternalRailSL.g:194:4: rule__SetTrackStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetTrackStatement"


    // $ANTLR start "entryRuleTrackSetting"
    // InternalRailSL.g:203:1: entryRuleTrackSetting : ruleTrackSetting EOF ;
    public final void entryRuleTrackSetting() throws RecognitionException {
        try {
            // InternalRailSL.g:204:1: ( ruleTrackSetting EOF )
            // InternalRailSL.g:205:1: ruleTrackSetting EOF
            {
             before(grammarAccess.getTrackSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleTrackSetting();

            state._fsp--;

             after(grammarAccess.getTrackSettingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrackSetting"


    // $ANTLR start "ruleTrackSetting"
    // InternalRailSL.g:212:1: ruleTrackSetting : ( ( rule__TrackSetting__Alternatives ) ) ;
    public final void ruleTrackSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:216:2: ( ( ( rule__TrackSetting__Alternatives ) ) )
            // InternalRailSL.g:217:2: ( ( rule__TrackSetting__Alternatives ) )
            {
            // InternalRailSL.g:217:2: ( ( rule__TrackSetting__Alternatives ) )
            // InternalRailSL.g:218:3: ( rule__TrackSetting__Alternatives )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives()); 
            // InternalRailSL.g:219:3: ( rule__TrackSetting__Alternatives )
            // InternalRailSL.g:219:4: rule__TrackSetting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TrackSetting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTrackSettingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrackSetting"


    // $ANTLR start "entryRuleSetPointStatement"
    // InternalRailSL.g:228:1: entryRuleSetPointStatement : ruleSetPointStatement EOF ;
    public final void entryRuleSetPointStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:229:1: ( ruleSetPointStatement EOF )
            // InternalRailSL.g:230:1: ruleSetPointStatement EOF
            {
             before(grammarAccess.getSetPointStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSetPointStatement();

            state._fsp--;

             after(grammarAccess.getSetPointStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetPointStatement"


    // $ANTLR start "ruleSetPointStatement"
    // InternalRailSL.g:237:1: ruleSetPointStatement : ( ( rule__SetPointStatement__Group__0 ) ) ;
    public final void ruleSetPointStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:241:2: ( ( ( rule__SetPointStatement__Group__0 ) ) )
            // InternalRailSL.g:242:2: ( ( rule__SetPointStatement__Group__0 ) )
            {
            // InternalRailSL.g:242:2: ( ( rule__SetPointStatement__Group__0 ) )
            // InternalRailSL.g:243:3: ( rule__SetPointStatement__Group__0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup()); 
            // InternalRailSL.g:244:3: ( rule__SetPointStatement__Group__0 )
            // InternalRailSL.g:244:4: rule__SetPointStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetPointStatement"


    // $ANTLR start "entryRuleWaitStatement"
    // InternalRailSL.g:253:1: entryRuleWaitStatement : ruleWaitStatement EOF ;
    public final void entryRuleWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:254:1: ( ruleWaitStatement EOF )
            // InternalRailSL.g:255:1: ruleWaitStatement EOF
            {
             before(grammarAccess.getWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWaitStatement();

            state._fsp--;

             after(grammarAccess.getWaitStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWaitStatement"


    // $ANTLR start "ruleWaitStatement"
    // InternalRailSL.g:262:1: ruleWaitStatement : ( ( rule__WaitStatement__Alternatives ) ) ;
    public final void ruleWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:266:2: ( ( ( rule__WaitStatement__Alternatives ) ) )
            // InternalRailSL.g:267:2: ( ( rule__WaitStatement__Alternatives ) )
            {
            // InternalRailSL.g:267:2: ( ( rule__WaitStatement__Alternatives ) )
            // InternalRailSL.g:268:3: ( rule__WaitStatement__Alternatives )
            {
             before(grammarAccess.getWaitStatementAccess().getAlternatives()); 
            // InternalRailSL.g:269:3: ( rule__WaitStatement__Alternatives )
            // InternalRailSL.g:269:4: rule__WaitStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WaitStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWaitStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWaitStatement"


    // $ANTLR start "entryRuleTimeWaitStatement"
    // InternalRailSL.g:278:1: entryRuleTimeWaitStatement : ruleTimeWaitStatement EOF ;
    public final void entryRuleTimeWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:279:1: ( ruleTimeWaitStatement EOF )
            // InternalRailSL.g:280:1: ruleTimeWaitStatement EOF
            {
             before(grammarAccess.getTimeWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeWaitStatement();

            state._fsp--;

             after(grammarAccess.getTimeWaitStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeWaitStatement"


    // $ANTLR start "ruleTimeWaitStatement"
    // InternalRailSL.g:287:1: ruleTimeWaitStatement : ( ( rule__TimeWaitStatement__Group__0 ) ) ;
    public final void ruleTimeWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:291:2: ( ( ( rule__TimeWaitStatement__Group__0 ) ) )
            // InternalRailSL.g:292:2: ( ( rule__TimeWaitStatement__Group__0 ) )
            {
            // InternalRailSL.g:292:2: ( ( rule__TimeWaitStatement__Group__0 ) )
            // InternalRailSL.g:293:3: ( rule__TimeWaitStatement__Group__0 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getGroup()); 
            // InternalRailSL.g:294:3: ( rule__TimeWaitStatement__Group__0 )
            // InternalRailSL.g:294:4: rule__TimeWaitStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeWaitStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeWaitStatement"


    // $ANTLR start "entryRuleContactWaitStatement"
    // InternalRailSL.g:303:1: entryRuleContactWaitStatement : ruleContactWaitStatement EOF ;
    public final void entryRuleContactWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:304:1: ( ruleContactWaitStatement EOF )
            // InternalRailSL.g:305:1: ruleContactWaitStatement EOF
            {
             before(grammarAccess.getContactWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleContactWaitStatement();

            state._fsp--;

             after(grammarAccess.getContactWaitStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContactWaitStatement"


    // $ANTLR start "ruleContactWaitStatement"
    // InternalRailSL.g:312:1: ruleContactWaitStatement : ( ( rule__ContactWaitStatement__Group__0 ) ) ;
    public final void ruleContactWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:316:2: ( ( ( rule__ContactWaitStatement__Group__0 ) ) )
            // InternalRailSL.g:317:2: ( ( rule__ContactWaitStatement__Group__0 ) )
            {
            // InternalRailSL.g:317:2: ( ( rule__ContactWaitStatement__Group__0 ) )
            // InternalRailSL.g:318:3: ( rule__ContactWaitStatement__Group__0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getGroup()); 
            // InternalRailSL.g:319:3: ( rule__ContactWaitStatement__Group__0 )
            // InternalRailSL.g:319:4: rule__ContactWaitStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContactWaitStatement"


    // $ANTLR start "entryRuleOpStatement"
    // InternalRailSL.g:328:1: entryRuleOpStatement : ruleOpStatement EOF ;
    public final void entryRuleOpStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:329:1: ( ruleOpStatement EOF )
            // InternalRailSL.g:330:1: ruleOpStatement EOF
            {
             before(grammarAccess.getOpStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleOpStatement();

            state._fsp--;

             after(grammarAccess.getOpStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpStatement"


    // $ANTLR start "ruleOpStatement"
    // InternalRailSL.g:337:1: ruleOpStatement : ( ( rule__OpStatement__Alternatives ) ) ;
    public final void ruleOpStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:341:2: ( ( ( rule__OpStatement__Alternatives ) ) )
            // InternalRailSL.g:342:2: ( ( rule__OpStatement__Alternatives ) )
            {
            // InternalRailSL.g:342:2: ( ( rule__OpStatement__Alternatives ) )
            // InternalRailSL.g:343:3: ( rule__OpStatement__Alternatives )
            {
             before(grammarAccess.getOpStatementAccess().getAlternatives()); 
            // InternalRailSL.g:344:3: ( rule__OpStatement__Alternatives )
            // InternalRailSL.g:344:4: rule__OpStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpStatement"


    // $ANTLR start "entryRuleCrossingStatement"
    // InternalRailSL.g:353:1: entryRuleCrossingStatement : ruleCrossingStatement EOF ;
    public final void entryRuleCrossingStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:354:1: ( ruleCrossingStatement EOF )
            // InternalRailSL.g:355:1: ruleCrossingStatement EOF
            {
             before(grammarAccess.getCrossingStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossingStatement();

            state._fsp--;

             after(grammarAccess.getCrossingStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrossingStatement"


    // $ANTLR start "ruleCrossingStatement"
    // InternalRailSL.g:362:1: ruleCrossingStatement : ( ( rule__CrossingStatement__Group__0 ) ) ;
    public final void ruleCrossingStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:366:2: ( ( ( rule__CrossingStatement__Group__0 ) ) )
            // InternalRailSL.g:367:2: ( ( rule__CrossingStatement__Group__0 ) )
            {
            // InternalRailSL.g:367:2: ( ( rule__CrossingStatement__Group__0 ) )
            // InternalRailSL.g:368:3: ( rule__CrossingStatement__Group__0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getGroup()); 
            // InternalRailSL.g:369:3: ( rule__CrossingStatement__Group__0 )
            // InternalRailSL.g:369:4: rule__CrossingStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossingStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossingStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossingStatement"


    // $ANTLR start "entryRuleLightStatement"
    // InternalRailSL.g:378:1: entryRuleLightStatement : ruleLightStatement EOF ;
    public final void entryRuleLightStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:379:1: ( ruleLightStatement EOF )
            // InternalRailSL.g:380:1: ruleLightStatement EOF
            {
             before(grammarAccess.getLightStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLightStatement();

            state._fsp--;

             after(grammarAccess.getLightStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLightStatement"


    // $ANTLR start "ruleLightStatement"
    // InternalRailSL.g:387:1: ruleLightStatement : ( ( rule__LightStatement__Group__0 ) ) ;
    public final void ruleLightStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:391:2: ( ( ( rule__LightStatement__Group__0 ) ) )
            // InternalRailSL.g:392:2: ( ( rule__LightStatement__Group__0 ) )
            {
            // InternalRailSL.g:392:2: ( ( rule__LightStatement__Group__0 ) )
            // InternalRailSL.g:393:3: ( rule__LightStatement__Group__0 )
            {
             before(grammarAccess.getLightStatementAccess().getGroup()); 
            // InternalRailSL.g:394:3: ( rule__LightStatement__Group__0 )
            // InternalRailSL.g:394:4: rule__LightStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLightStatement"


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalRailSL.g:403:1: entryRuleConditionalStatement : ruleConditionalStatement EOF ;
    public final void entryRuleConditionalStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:404:1: ( ruleConditionalStatement EOF )
            // InternalRailSL.g:405:1: ruleConditionalStatement EOF
            {
             before(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalStatement();

            state._fsp--;

             after(grammarAccess.getConditionalStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalRailSL.g:412:1: ruleConditionalStatement : ( ( rule__ConditionalStatement__Group__0 ) ) ;
    public final void ruleConditionalStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:416:2: ( ( ( rule__ConditionalStatement__Group__0 ) ) )
            // InternalRailSL.g:417:2: ( ( rule__ConditionalStatement__Group__0 ) )
            {
            // InternalRailSL.g:417:2: ( ( rule__ConditionalStatement__Group__0 ) )
            // InternalRailSL.g:418:3: ( rule__ConditionalStatement__Group__0 )
            {
             before(grammarAccess.getConditionalStatementAccess().getGroup()); 
            // InternalRailSL.g:419:3: ( rule__ConditionalStatement__Group__0 )
            // InternalRailSL.g:419:4: rule__ConditionalStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleConditionalLine"
    // InternalRailSL.g:428:1: entryRuleConditionalLine : ruleConditionalLine EOF ;
    public final void entryRuleConditionalLine() throws RecognitionException {
        try {
            // InternalRailSL.g:429:1: ( ruleConditionalLine EOF )
            // InternalRailSL.g:430:1: ruleConditionalLine EOF
            {
             before(grammarAccess.getConditionalLineRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalLine();

            state._fsp--;

             after(grammarAccess.getConditionalLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalLine"


    // $ANTLR start "ruleConditionalLine"
    // InternalRailSL.g:437:1: ruleConditionalLine : ( ( rule__ConditionalLine__Group__0 ) ) ;
    public final void ruleConditionalLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:441:2: ( ( ( rule__ConditionalLine__Group__0 ) ) )
            // InternalRailSL.g:442:2: ( ( rule__ConditionalLine__Group__0 ) )
            {
            // InternalRailSL.g:442:2: ( ( rule__ConditionalLine__Group__0 ) )
            // InternalRailSL.g:443:3: ( rule__ConditionalLine__Group__0 )
            {
             before(grammarAccess.getConditionalLineAccess().getGroup()); 
            // InternalRailSL.g:444:3: ( rule__ConditionalLine__Group__0 )
            // InternalRailSL.g:444:4: rule__ConditionalLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalLine"


    // $ANTLR start "entryRuleParallelStatement"
    // InternalRailSL.g:453:1: entryRuleParallelStatement : ruleParallelStatement EOF ;
    public final void entryRuleParallelStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:454:1: ( ruleParallelStatement EOF )
            // InternalRailSL.g:455:1: ruleParallelStatement EOF
            {
             before(grammarAccess.getParallelStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleParallelStatement();

            state._fsp--;

             after(grammarAccess.getParallelStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParallelStatement"


    // $ANTLR start "ruleParallelStatement"
    // InternalRailSL.g:462:1: ruleParallelStatement : ( ( rule__ParallelStatement__Group__0 ) ) ;
    public final void ruleParallelStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:466:2: ( ( ( rule__ParallelStatement__Group__0 ) ) )
            // InternalRailSL.g:467:2: ( ( rule__ParallelStatement__Group__0 ) )
            {
            // InternalRailSL.g:467:2: ( ( rule__ParallelStatement__Group__0 ) )
            // InternalRailSL.g:468:3: ( rule__ParallelStatement__Group__0 )
            {
             before(grammarAccess.getParallelStatementAccess().getGroup()); 
            // InternalRailSL.g:469:3: ( rule__ParallelStatement__Group__0 )
            // InternalRailSL.g:469:4: rule__ParallelStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallelStatement"


    // $ANTLR start "entryRuleContactIndex"
    // InternalRailSL.g:478:1: entryRuleContactIndex : ruleContactIndex EOF ;
    public final void entryRuleContactIndex() throws RecognitionException {
        try {
            // InternalRailSL.g:479:1: ( ruleContactIndex EOF )
            // InternalRailSL.g:480:1: ruleContactIndex EOF
            {
             before(grammarAccess.getContactIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleContactIndex();

            state._fsp--;

             after(grammarAccess.getContactIndexRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContactIndex"


    // $ANTLR start "ruleContactIndex"
    // InternalRailSL.g:487:1: ruleContactIndex : ( ( rule__ContactIndex__Alternatives ) ) ;
    public final void ruleContactIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:491:2: ( ( ( rule__ContactIndex__Alternatives ) ) )
            // InternalRailSL.g:492:2: ( ( rule__ContactIndex__Alternatives ) )
            {
            // InternalRailSL.g:492:2: ( ( rule__ContactIndex__Alternatives ) )
            // InternalRailSL.g:493:3: ( rule__ContactIndex__Alternatives )
            {
             before(grammarAccess.getContactIndexAccess().getAlternatives()); 
            // InternalRailSL.g:494:3: ( rule__ContactIndex__Alternatives )
            // InternalRailSL.g:494:4: rule__ContactIndex__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContactIndex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContactIndexAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContactIndex"


    // $ANTLR start "rule__BLOCK_END__Alternatives"
    // InternalRailSL.g:502:1: rule__BLOCK_END__Alternatives : ( ( 'End.' ) | ( 'Loop.' ) );
    public final void rule__BLOCK_END__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:506:1: ( ( 'End.' ) | ( 'Loop.' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRailSL.g:507:2: ( 'End.' )
                    {
                    // InternalRailSL.g:507:2: ( 'End.' )
                    // InternalRailSL.g:508:3: 'End.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:513:2: ( 'Loop.' )
                    {
                    // InternalRailSL.g:513:2: ( 'Loop.' )
                    // InternalRailSL.g:514:3: 'Loop.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getLoopKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBLOCK_ENDAccess().getLoopKeyword_1()); 

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
    // $ANTLR end "rule__BLOCK_END__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRailSL.g:523:1: rule__Statement__Alternatives : ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) | ( ruleParallelStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:527:1: ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) | ( ruleParallelStatement ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
            case 35:
                {
                alt2=1;
                }
                break;
            case 19:
            case 20:
            case 36:
                {
                alt2=2;
                }
                break;
            case 21:
            case 22:
            case 40:
                {
                alt2=3;
                }
                break;
            case 41:
                {
                alt2=4;
                }
                break;
            case 44:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:528:2: ( ruleSetStatement )
                    {
                    // InternalRailSL.g:528:2: ( ruleSetStatement )
                    // InternalRailSL.g:529:3: ruleSetStatement
                    {
                     before(grammarAccess.getStatementAccess().getSetStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSetStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSetStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:534:2: ( ruleWaitStatement )
                    {
                    // InternalRailSL.g:534:2: ( ruleWaitStatement )
                    // InternalRailSL.g:535:3: ruleWaitStatement
                    {
                     before(grammarAccess.getStatementAccess().getWaitStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWaitStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWaitStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailSL.g:540:2: ( ruleOpStatement )
                    {
                    // InternalRailSL.g:540:2: ( ruleOpStatement )
                    // InternalRailSL.g:541:3: ruleOpStatement
                    {
                     before(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOpStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRailSL.g:546:2: ( ruleConditionalStatement )
                    {
                    // InternalRailSL.g:546:2: ( ruleConditionalStatement )
                    // InternalRailSL.g:547:3: ruleConditionalStatement
                    {
                     before(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRailSL.g:552:2: ( ruleParallelStatement )
                    {
                    // InternalRailSL.g:552:2: ( ruleParallelStatement )
                    // InternalRailSL.g:553:3: ruleParallelStatement
                    {
                     before(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParallelStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_4()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__SetStatement__Alternatives"
    // InternalRailSL.g:562:1: rule__SetStatement__Alternatives : ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) );
    public final void rule__SetStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:566:1: ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:567:2: ( ruleSetTrackStatement )
                    {
                    // InternalRailSL.g:567:2: ( ruleSetTrackStatement )
                    // InternalRailSL.g:568:3: ruleSetTrackStatement
                    {
                     before(grammarAccess.getSetStatementAccess().getSetTrackStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSetTrackStatement();

                    state._fsp--;

                     after(grammarAccess.getSetStatementAccess().getSetTrackStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:573:2: ( ruleSetPointStatement )
                    {
                    // InternalRailSL.g:573:2: ( ruleSetPointStatement )
                    // InternalRailSL.g:574:3: ruleSetPointStatement
                    {
                     before(grammarAccess.getSetStatementAccess().getSetPointStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetPointStatement();

                    state._fsp--;

                     after(grammarAccess.getSetStatementAccess().getSetPointStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__SetStatement__Alternatives"


    // $ANTLR start "rule__SetTrackStatement__Alternatives_3"
    // InternalRailSL.g:583:1: rule__SetTrackStatement__Alternatives_3 : ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) );
    public final void rule__SetTrackStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:587:1: ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:588:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:588:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:589:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:590:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    // InternalRailSL.g:590:4: rule__SetTrackStatement__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetTrackStatement__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetTrackStatementAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:594:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:594:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:595:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:596:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    // InternalRailSL.g:596:4: rule__SetTrackStatement__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetTrackStatement__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetTrackStatementAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__SetTrackStatement__Alternatives_3"


    // $ANTLR start "rule__TrackSetting__Alternatives"
    // InternalRailSL.g:604:1: rule__TrackSetting__Alternatives : ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) );
    public final void rule__TrackSetting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:608:1: ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:609:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    {
                    // InternalRailSL.g:609:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    // InternalRailSL.g:610:3: ( rule__TrackSetting__Group_0__0 )
                    {
                     before(grammarAccess.getTrackSettingAccess().getGroup_0()); 
                    // InternalRailSL.g:611:3: ( rule__TrackSetting__Group_0__0 )
                    // InternalRailSL.g:611:4: rule__TrackSetting__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrackSetting__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrackSettingAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:615:2: ( 'stop' )
                    {
                    // InternalRailSL.g:615:2: ( 'stop' )
                    // InternalRailSL.g:616:3: 'stop'
                    {
                     before(grammarAccess.getTrackSettingAccess().getStopKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getStopKeyword_1()); 

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
    // $ANTLR end "rule__TrackSetting__Alternatives"


    // $ANTLR start "rule__TrackSetting__Alternatives_0_0"
    // InternalRailSL.g:625:1: rule__TrackSetting__Alternatives_0_0 : ( ( 'full' ) | ( 'slow' ) );
    public final void rule__TrackSetting__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:629:1: ( ( 'full' ) | ( 'slow' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:630:2: ( 'full' )
                    {
                    // InternalRailSL.g:630:2: ( 'full' )
                    // InternalRailSL.g:631:3: 'full'
                    {
                     before(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:636:2: ( 'slow' )
                    {
                    // InternalRailSL.g:636:2: ( 'slow' )
                    // InternalRailSL.g:637:3: 'slow'
                    {
                     before(grammarAccess.getTrackSettingAccess().getSlowKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getSlowKeyword_0_0_1()); 

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
    // $ANTLR end "rule__TrackSetting__Alternatives_0_0"


    // $ANTLR start "rule__SetPointStatement__Alternatives_3"
    // InternalRailSL.g:646:1: rule__SetPointStatement__Alternatives_3 : ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) );
    public final void rule__SetPointStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:650:1: ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:651:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:651:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:652:3: ( rule__SetPointStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:653:3: ( rule__SetPointStatement__Group_3_0__0 )
                    // InternalRailSL.g:653:4: rule__SetPointStatement__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetPointStatement__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetPointStatementAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:657:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:657:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:658:3: ( rule__SetPointStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:659:3: ( rule__SetPointStatement__Group_3_1__0 )
                    // InternalRailSL.g:659:4: rule__SetPointStatement__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetPointStatement__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetPointStatementAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__SetPointStatement__Alternatives_3"


    // $ANTLR start "rule__SetPointStatement__OrientationAlternatives_5_0"
    // InternalRailSL.g:667:1: rule__SetPointStatement__OrientationAlternatives_5_0 : ( ( 'straight' ) | ( 'branch' ) );
    public final void rule__SetPointStatement__OrientationAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:671:1: ( ( 'straight' ) | ( 'branch' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:672:2: ( 'straight' )
                    {
                    // InternalRailSL.g:672:2: ( 'straight' )
                    // InternalRailSL.g:673:3: 'straight'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:678:2: ( 'branch' )
                    {
                    // InternalRailSL.g:678:2: ( 'branch' )
                    // InternalRailSL.g:679:3: 'branch'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_5_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_5_0_1()); 

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
    // $ANTLR end "rule__SetPointStatement__OrientationAlternatives_5_0"


    // $ANTLR start "rule__WaitStatement__Alternatives"
    // InternalRailSL.g:688:1: rule__WaitStatement__Alternatives : ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) );
    public final void rule__WaitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:692:1: ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=19 && LA9_0<=20)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:693:2: ( ruleTimeWaitStatement )
                    {
                    // InternalRailSL.g:693:2: ( ruleTimeWaitStatement )
                    // InternalRailSL.g:694:3: ruleTimeWaitStatement
                    {
                     before(grammarAccess.getWaitStatementAccess().getTimeWaitStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeWaitStatement();

                    state._fsp--;

                     after(grammarAccess.getWaitStatementAccess().getTimeWaitStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:699:2: ( ruleContactWaitStatement )
                    {
                    // InternalRailSL.g:699:2: ( ruleContactWaitStatement )
                    // InternalRailSL.g:700:3: ruleContactWaitStatement
                    {
                     before(grammarAccess.getWaitStatementAccess().getContactWaitStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContactWaitStatement();

                    state._fsp--;

                     after(grammarAccess.getWaitStatementAccess().getContactWaitStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__WaitStatement__Alternatives"


    // $ANTLR start "rule__ContactWaitStatement__EventAlternatives_0_0"
    // InternalRailSL.g:709:1: rule__ContactWaitStatement__EventAlternatives_0_0 : ( ( 'Reach' ) | ( 'Pass' ) );
    public final void rule__ContactWaitStatement__EventAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:713:1: ( ( 'Reach' ) | ( 'Pass' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:714:2: ( 'Reach' )
                    {
                    // InternalRailSL.g:714:2: ( 'Reach' )
                    // InternalRailSL.g:715:3: 'Reach'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:720:2: ( 'Pass' )
                    {
                    // InternalRailSL.g:720:2: ( 'Pass' )
                    // InternalRailSL.g:721:3: 'Pass'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventPassKeyword_0_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventPassKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ContactWaitStatement__EventAlternatives_0_0"


    // $ANTLR start "rule__OpStatement__Alternatives"
    // InternalRailSL.g:730:1: rule__OpStatement__Alternatives : ( ( ruleCrossingStatement ) | ( ruleLightStatement ) );
    public final void rule__OpStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:734:1: ( ( ruleCrossingStatement ) | ( ruleLightStatement ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=21 && LA11_0<=22)) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:735:2: ( ruleCrossingStatement )
                    {
                    // InternalRailSL.g:735:2: ( ruleCrossingStatement )
                    // InternalRailSL.g:736:3: ruleCrossingStatement
                    {
                     before(grammarAccess.getOpStatementAccess().getCrossingStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossingStatement();

                    state._fsp--;

                     after(grammarAccess.getOpStatementAccess().getCrossingStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:741:2: ( ruleLightStatement )
                    {
                    // InternalRailSL.g:741:2: ( ruleLightStatement )
                    // InternalRailSL.g:742:3: ruleLightStatement
                    {
                     before(grammarAccess.getOpStatementAccess().getLightStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLightStatement();

                    state._fsp--;

                     after(grammarAccess.getOpStatementAccess().getLightStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__OpStatement__Alternatives"


    // $ANTLR start "rule__CrossingStatement__ModeAlternatives_0_0"
    // InternalRailSL.g:751:1: rule__CrossingStatement__ModeAlternatives_0_0 : ( ( 'Open' ) | ( 'Close' ) );
    public final void rule__CrossingStatement__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:755:1: ( ( 'Open' ) | ( 'Close' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:756:2: ( 'Open' )
                    {
                    // InternalRailSL.g:756:2: ( 'Open' )
                    // InternalRailSL.g:757:3: 'Open'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:762:2: ( 'Close' )
                    {
                    // InternalRailSL.g:762:2: ( 'Close' )
                    // InternalRailSL.g:763:3: 'Close'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeCloseKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getModeCloseKeyword_0_0_1()); 

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
    // $ANTLR end "rule__CrossingStatement__ModeAlternatives_0_0"


    // $ANTLR start "rule__LightStatement__Alternatives_3"
    // InternalRailSL.g:772:1: rule__LightStatement__Alternatives_3 : ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) );
    public final void rule__LightStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:776:1: ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRailSL.g:777:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:777:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:778:3: ( rule__LightStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:779:3: ( rule__LightStatement__Group_3_0__0 )
                    // InternalRailSL.g:779:4: rule__LightStatement__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightStatement__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLightStatementAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:783:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:783:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:784:3: ( rule__LightStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:785:3: ( rule__LightStatement__Group_3_1__0 )
                    // InternalRailSL.g:785:4: rule__LightStatement__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightStatement__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLightStatementAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__LightStatement__Alternatives_3"


    // $ANTLR start "rule__LightStatement__StateAlternatives_4_0"
    // InternalRailSL.g:793:1: rule__LightStatement__StateAlternatives_4_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__LightStatement__StateAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:797:1: ( ( 'on' ) | ( 'off' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:798:2: ( 'on' )
                    {
                    // InternalRailSL.g:798:2: ( 'on' )
                    // InternalRailSL.g:799:3: 'on'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:804:2: ( 'off' )
                    {
                    // InternalRailSL.g:804:2: ( 'off' )
                    // InternalRailSL.g:805:3: 'off'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOffKeyword_4_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOffKeyword_4_0_1()); 

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
    // $ANTLR end "rule__LightStatement__StateAlternatives_4_0"


    // $ANTLR start "rule__ContactIndex__Alternatives"
    // InternalRailSL.g:814:1: rule__ContactIndex__Alternatives : ( ( 'first' ) | ( 'second' ) );
    public final void rule__ContactIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:818:1: ( ( 'first' ) | ( 'second' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:819:2: ( 'first' )
                    {
                    // InternalRailSL.g:819:2: ( 'first' )
                    // InternalRailSL.g:820:3: 'first'
                    {
                     before(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:825:2: ( 'second' )
                    {
                    // InternalRailSL.g:825:2: ( 'second' )
                    // InternalRailSL.g:826:3: 'second'
                    {
                     before(grammarAccess.getContactIndexAccess().getSecondKeyword_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getContactIndexAccess().getSecondKeyword_1()); 

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
    // $ANTLR end "rule__ContactIndex__Alternatives"


    // $ANTLR start "rule__Block__Group__0"
    // InternalRailSL.g:835:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:839:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRailSL.g:840:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalRailSL.g:847:1: rule__Block__Group__0__Impl : ( 'Start:' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:851:1: ( ( 'Start:' ) )
            // InternalRailSL.g:852:1: ( 'Start:' )
            {
            // InternalRailSL.g:852:1: ( 'Start:' )
            // InternalRailSL.g:853:2: 'Start:'
            {
             before(grammarAccess.getBlockAccess().getStartKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getStartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalRailSL.g:862:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:866:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRailSL.g:867:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalRailSL.g:874:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:878:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalRailSL.g:879:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalRailSL.g:879:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalRailSL.g:880:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalRailSL.g:880:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalRailSL.g:881:3: ( rule__Block__StatementsAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:882:3: ( rule__Block__StatementsAssignment_1 )
            // InternalRailSL.g:882:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Block__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }

            // InternalRailSL.g:885:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalRailSL.g:886:3: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:887:3: ( rule__Block__StatementsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=19 && LA16_0<=22)||LA16_0==28||(LA16_0>=35 && LA16_0<=36)||(LA16_0>=40 && LA16_0<=41)||LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRailSL.g:887:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalRailSL.g:896:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:900:1: ( rule__Block__Group__2__Impl )
            // InternalRailSL.g:901:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalRailSL.g:907:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:911:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalRailSL.g:912:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalRailSL.g:912:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalRailSL.g:913:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalRailSL.g:914:2: ( rule__Block__EndAssignment_2 )
            // InternalRailSL.g:914:3: rule__Block__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__EndAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getEndAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__0"
    // InternalRailSL.g:923:1: rule__SetTrackStatement__Group__0 : rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 ;
    public final void rule__SetTrackStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:927:1: ( rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 )
            // InternalRailSL.g:928:2: rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SetTrackStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__0"


    // $ANTLR start "rule__SetTrackStatement__Group__0__Impl"
    // InternalRailSL.g:935:1: rule__SetTrackStatement__Group__0__Impl : ( 'Set track' ) ;
    public final void rule__SetTrackStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:939:1: ( ( 'Set track' ) )
            // InternalRailSL.g:940:1: ( 'Set track' )
            {
            // InternalRailSL.g:940:1: ( 'Set track' )
            // InternalRailSL.g:941:2: 'Set track'
            {
             before(grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__0__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__1"
    // InternalRailSL.g:950:1: rule__SetTrackStatement__Group__1 : rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 ;
    public final void rule__SetTrackStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:954:1: ( rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 )
            // InternalRailSL.g:955:2: rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SetTrackStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__1"


    // $ANTLR start "rule__SetTrackStatement__Group__1__Impl"
    // InternalRailSL.g:962:1: rule__SetTrackStatement__Group__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ;
    public final void rule__SetTrackStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:966:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) )
            // InternalRailSL.g:967:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            {
            // InternalRailSL.g:967:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            // InternalRailSL.g:968:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:969:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            // InternalRailSL.g:969:3: rule__SetTrackStatement__SegmentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__SegmentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__1__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__2"
    // InternalRailSL.g:977:1: rule__SetTrackStatement__Group__2 : rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 ;
    public final void rule__SetTrackStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:981:1: ( rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 )
            // InternalRailSL.g:982:2: rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SetTrackStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__2"


    // $ANTLR start "rule__SetTrackStatement__Group__2__Impl"
    // InternalRailSL.g:989:1: rule__SetTrackStatement__Group__2__Impl : ( ( rule__SetTrackStatement__Group_2__0 )* ) ;
    public final void rule__SetTrackStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:993:1: ( ( ( rule__SetTrackStatement__Group_2__0 )* ) )
            // InternalRailSL.g:994:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:994:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            // InternalRailSL.g:995:2: ( rule__SetTrackStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup_2()); 
            // InternalRailSL.g:996:2: ( rule__SetTrackStatement__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRailSL.g:996:3: rule__SetTrackStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SetTrackStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSetTrackStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__2__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__3"
    // InternalRailSL.g:1004:1: rule__SetTrackStatement__Group__3 : rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 ;
    public final void rule__SetTrackStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1008:1: ( rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 )
            // InternalRailSL.g:1009:2: rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SetTrackStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__3"


    // $ANTLR start "rule__SetTrackStatement__Group__3__Impl"
    // InternalRailSL.g:1016:1: rule__SetTrackStatement__Group__3__Impl : ( ( rule__SetTrackStatement__Alternatives_3 )? ) ;
    public final void rule__SetTrackStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1020:1: ( ( ( rule__SetTrackStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:1021:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:1021:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            // InternalRailSL.g:1022:2: ( rule__SetTrackStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetTrackStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:1023:2: ( rule__SetTrackStatement__Alternatives_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRailSL.g:1023:3: rule__SetTrackStatement__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetTrackStatement__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetTrackStatementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__3__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__4"
    // InternalRailSL.g:1031:1: rule__SetTrackStatement__Group__4 : rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 ;
    public final void rule__SetTrackStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1035:1: ( rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 )
            // InternalRailSL.g:1036:2: rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SetTrackStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__4"


    // $ANTLR start "rule__SetTrackStatement__Group__4__Impl"
    // InternalRailSL.g:1043:1: rule__SetTrackStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetTrackStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1047:1: ( ( 'to' ) )
            // InternalRailSL.g:1048:1: ( 'to' )
            {
            // InternalRailSL.g:1048:1: ( 'to' )
            // InternalRailSL.g:1049:2: 'to'
            {
             before(grammarAccess.getSetTrackStatementAccess().getToKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__4__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__5"
    // InternalRailSL.g:1058:1: rule__SetTrackStatement__Group__5 : rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 ;
    public final void rule__SetTrackStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1062:1: ( rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 )
            // InternalRailSL.g:1063:2: rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SetTrackStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__5"


    // $ANTLR start "rule__SetTrackStatement__Group__5__Impl"
    // InternalRailSL.g:1070:1: rule__SetTrackStatement__Group__5__Impl : ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) ;
    public final void rule__SetTrackStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1074:1: ( ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) )
            // InternalRailSL.g:1075:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            {
            // InternalRailSL.g:1075:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            // InternalRailSL.g:1076:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeAssignment_5()); 
            // InternalRailSL.g:1077:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            // InternalRailSL.g:1077:3: rule__SetTrackStatement__ModeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__ModeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getModeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__5__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__6"
    // InternalRailSL.g:1085:1: rule__SetTrackStatement__Group__6 : rule__SetTrackStatement__Group__6__Impl ;
    public final void rule__SetTrackStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1089:1: ( rule__SetTrackStatement__Group__6__Impl )
            // InternalRailSL.g:1090:2: rule__SetTrackStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__6"


    // $ANTLR start "rule__SetTrackStatement__Group__6__Impl"
    // InternalRailSL.g:1096:1: rule__SetTrackStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetTrackStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1100:1: ( ( '.' ) )
            // InternalRailSL.g:1101:1: ( '.' )
            {
            // InternalRailSL.g:1101:1: ( '.' )
            // InternalRailSL.g:1102:2: '.'
            {
             before(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group__6__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_2__0"
    // InternalRailSL.g:1112:1: rule__SetTrackStatement__Group_2__0 : rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 ;
    public final void rule__SetTrackStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1116:1: ( rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 )
            // InternalRailSL.g:1117:2: rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__SetTrackStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_2__0"


    // $ANTLR start "rule__SetTrackStatement__Group_2__0__Impl"
    // InternalRailSL.g:1124:1: rule__SetTrackStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__SetTrackStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1128:1: ( ( ', ' ) )
            // InternalRailSL.g:1129:1: ( ', ' )
            {
            // InternalRailSL.g:1129:1: ( ', ' )
            // InternalRailSL.g:1130:2: ', '
            {
             before(grammarAccess.getSetTrackStatementAccess().getCommaSpaceKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getCommaSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_2__1"
    // InternalRailSL.g:1139:1: rule__SetTrackStatement__Group_2__1 : rule__SetTrackStatement__Group_2__1__Impl ;
    public final void rule__SetTrackStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1143:1: ( rule__SetTrackStatement__Group_2__1__Impl )
            // InternalRailSL.g:1144:2: rule__SetTrackStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_2__1"


    // $ANTLR start "rule__SetTrackStatement__Group_2__1__Impl"
    // InternalRailSL.g:1150:1: rule__SetTrackStatement__Group_2__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) ;
    public final void rule__SetTrackStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1154:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) )
            // InternalRailSL.g:1155:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1155:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            // InternalRailSL.g:1156:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_2_1()); 
            // InternalRailSL.g:1157:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            // InternalRailSL.g:1157:3: rule__SetTrackStatement__SegmentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__SegmentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_3_0__0"
    // InternalRailSL.g:1166:1: rule__SetTrackStatement__Group_3_0__0 : rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 ;
    public final void rule__SetTrackStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1170:1: ( rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 )
            // InternalRailSL.g:1171:2: rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_6);
            rule__SetTrackStatement__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_0__0"


    // $ANTLR start "rule__SetTrackStatement__Group_3_0__0__Impl"
    // InternalRailSL.g:1178:1: rule__SetTrackStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetTrackStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1182:1: ( ( 'and' ) )
            // InternalRailSL.g:1183:1: ( 'and' )
            {
            // InternalRailSL.g:1183:1: ( 'and' )
            // InternalRailSL.g:1184:2: 'and'
            {
             before(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_0__0__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_3_0__1"
    // InternalRailSL.g:1193:1: rule__SetTrackStatement__Group_3_0__1 : rule__SetTrackStatement__Group_3_0__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1197:1: ( rule__SetTrackStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1198:2: rule__SetTrackStatement__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_0__1"


    // $ANTLR start "rule__SetTrackStatement__Group_3_0__1__Impl"
    // InternalRailSL.g:1204:1: rule__SetTrackStatement__Group_3_0__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1208:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1209:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1209:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            // InternalRailSL.g:1210:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_0_1()); 
            // InternalRailSL.g:1211:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            // InternalRailSL.g:1211:3: rule__SetTrackStatement__SegmentsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__SegmentsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_0__1__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_3_1__0"
    // InternalRailSL.g:1220:1: rule__SetTrackStatement__Group_3_1__0 : rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 ;
    public final void rule__SetTrackStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1224:1: ( rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 )
            // InternalRailSL.g:1225:2: rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__SetTrackStatement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_1__0"


    // $ANTLR start "rule__SetTrackStatement__Group_3_1__0__Impl"
    // InternalRailSL.g:1232:1: rule__SetTrackStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetTrackStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1236:1: ( ( ', and' ) )
            // InternalRailSL.g:1237:1: ( ', and' )
            {
            // InternalRailSL.g:1237:1: ( ', and' )
            // InternalRailSL.g:1238:2: ', and'
            {
             before(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_1__0__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group_3_1__1"
    // InternalRailSL.g:1247:1: rule__SetTrackStatement__Group_3_1__1 : rule__SetTrackStatement__Group_3_1__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1251:1: ( rule__SetTrackStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1252:2: rule__SetTrackStatement__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_1__1"


    // $ANTLR start "rule__SetTrackStatement__Group_3_1__1__Impl"
    // InternalRailSL.g:1258:1: rule__SetTrackStatement__Group_3_1__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1262:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1263:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1263:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            // InternalRailSL.g:1264:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_1_1()); 
            // InternalRailSL.g:1265:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            // InternalRailSL.g:1265:3: rule__SetTrackStatement__SegmentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__SegmentsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__Group_3_1__1__Impl"


    // $ANTLR start "rule__TrackSetting__Group_0__0"
    // InternalRailSL.g:1274:1: rule__TrackSetting__Group_0__0 : rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 ;
    public final void rule__TrackSetting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1278:1: ( rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 )
            // InternalRailSL.g:1279:2: rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__TrackSetting__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackSetting__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackSetting__Group_0__0"


    // $ANTLR start "rule__TrackSetting__Group_0__0__Impl"
    // InternalRailSL.g:1286:1: rule__TrackSetting__Group_0__0__Impl : ( ( rule__TrackSetting__Alternatives_0_0 ) ) ;
    public final void rule__TrackSetting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1290:1: ( ( ( rule__TrackSetting__Alternatives_0_0 ) ) )
            // InternalRailSL.g:1291:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            {
            // InternalRailSL.g:1291:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            // InternalRailSL.g:1292:2: ( rule__TrackSetting__Alternatives_0_0 )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives_0_0()); 
            // InternalRailSL.g:1293:2: ( rule__TrackSetting__Alternatives_0_0 )
            // InternalRailSL.g:1293:3: rule__TrackSetting__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TrackSetting__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTrackSettingAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackSetting__Group_0__0__Impl"


    // $ANTLR start "rule__TrackSetting__Group_0__1"
    // InternalRailSL.g:1301:1: rule__TrackSetting__Group_0__1 : rule__TrackSetting__Group_0__1__Impl ;
    public final void rule__TrackSetting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1305:1: ( rule__TrackSetting__Group_0__1__Impl )
            // InternalRailSL.g:1306:2: rule__TrackSetting__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrackSetting__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackSetting__Group_0__1"


    // $ANTLR start "rule__TrackSetting__Group_0__1__Impl"
    // InternalRailSL.g:1312:1: rule__TrackSetting__Group_0__1__Impl : ( ( 'reverse' )? ) ;
    public final void rule__TrackSetting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1316:1: ( ( ( 'reverse' )? ) )
            // InternalRailSL.g:1317:1: ( ( 'reverse' )? )
            {
            // InternalRailSL.g:1317:1: ( ( 'reverse' )? )
            // InternalRailSL.g:1318:2: ( 'reverse' )?
            {
             before(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1()); 
            // InternalRailSL.g:1319:2: ( 'reverse' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRailSL.g:1319:3: 'reverse'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackSetting__Group_0__1__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__0"
    // InternalRailSL.g:1328:1: rule__SetPointStatement__Group__0 : rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 ;
    public final void rule__SetPointStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1332:1: ( rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 )
            // InternalRailSL.g:1333:2: rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SetPointStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__0"


    // $ANTLR start "rule__SetPointStatement__Group__0__Impl"
    // InternalRailSL.g:1340:1: rule__SetPointStatement__Group__0__Impl : ( 'Set point' ) ;
    public final void rule__SetPointStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1344:1: ( ( 'Set point' ) )
            // InternalRailSL.g:1345:1: ( 'Set point' )
            {
            // InternalRailSL.g:1345:1: ( 'Set point' )
            // InternalRailSL.g:1346:2: 'Set point'
            {
             before(grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__0__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__1"
    // InternalRailSL.g:1355:1: rule__SetPointStatement__Group__1 : rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 ;
    public final void rule__SetPointStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1359:1: ( rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 )
            // InternalRailSL.g:1360:2: rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SetPointStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__1"


    // $ANTLR start "rule__SetPointStatement__Group__1__Impl"
    // InternalRailSL.g:1367:1: rule__SetPointStatement__Group__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ;
    public final void rule__SetPointStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1371:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) )
            // InternalRailSL.g:1372:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            {
            // InternalRailSL.g:1372:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            // InternalRailSL.g:1373:2: ( rule__SetPointStatement__PointsAssignment_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:1374:2: ( rule__SetPointStatement__PointsAssignment_1 )
            // InternalRailSL.g:1374:3: rule__SetPointStatement__PointsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__PointsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__1__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__2"
    // InternalRailSL.g:1382:1: rule__SetPointStatement__Group__2 : rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 ;
    public final void rule__SetPointStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1386:1: ( rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 )
            // InternalRailSL.g:1387:2: rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SetPointStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__2"


    // $ANTLR start "rule__SetPointStatement__Group__2__Impl"
    // InternalRailSL.g:1394:1: rule__SetPointStatement__Group__2__Impl : ( ( rule__SetPointStatement__Group_2__0 )* ) ;
    public final void rule__SetPointStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1398:1: ( ( ( rule__SetPointStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1399:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1399:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            // InternalRailSL.g:1400:2: ( rule__SetPointStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1401:2: ( rule__SetPointStatement__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRailSL.g:1401:3: rule__SetPointStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SetPointStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSetPointStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__2__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__3"
    // InternalRailSL.g:1409:1: rule__SetPointStatement__Group__3 : rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 ;
    public final void rule__SetPointStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1413:1: ( rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 )
            // InternalRailSL.g:1414:2: rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__SetPointStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__3"


    // $ANTLR start "rule__SetPointStatement__Group__3__Impl"
    // InternalRailSL.g:1421:1: rule__SetPointStatement__Group__3__Impl : ( ( rule__SetPointStatement__Alternatives_3 )? ) ;
    public final void rule__SetPointStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1425:1: ( ( ( rule__SetPointStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:1426:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:1426:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            // InternalRailSL.g:1427:2: ( rule__SetPointStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetPointStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:1428:2: ( rule__SetPointStatement__Alternatives_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=33)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRailSL.g:1428:3: rule__SetPointStatement__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetPointStatement__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetPointStatementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__3__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__4"
    // InternalRailSL.g:1436:1: rule__SetPointStatement__Group__4 : rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 ;
    public final void rule__SetPointStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1440:1: ( rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 )
            // InternalRailSL.g:1441:2: rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SetPointStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__4"


    // $ANTLR start "rule__SetPointStatement__Group__4__Impl"
    // InternalRailSL.g:1448:1: rule__SetPointStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetPointStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1452:1: ( ( 'to' ) )
            // InternalRailSL.g:1453:1: ( 'to' )
            {
            // InternalRailSL.g:1453:1: ( 'to' )
            // InternalRailSL.g:1454:2: 'to'
            {
             before(grammarAccess.getSetPointStatementAccess().getToKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__4__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__5"
    // InternalRailSL.g:1463:1: rule__SetPointStatement__Group__5 : rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 ;
    public final void rule__SetPointStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1467:1: ( rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 )
            // InternalRailSL.g:1468:2: rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SetPointStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__5"


    // $ANTLR start "rule__SetPointStatement__Group__5__Impl"
    // InternalRailSL.g:1475:1: rule__SetPointStatement__Group__5__Impl : ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) ;
    public final void rule__SetPointStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1479:1: ( ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) )
            // InternalRailSL.g:1480:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            {
            // InternalRailSL.g:1480:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            // InternalRailSL.g:1481:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_5()); 
            // InternalRailSL.g:1482:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            // InternalRailSL.g:1482:3: rule__SetPointStatement__OrientationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__5__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__6"
    // InternalRailSL.g:1490:1: rule__SetPointStatement__Group__6 : rule__SetPointStatement__Group__6__Impl ;
    public final void rule__SetPointStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1494:1: ( rule__SetPointStatement__Group__6__Impl )
            // InternalRailSL.g:1495:2: rule__SetPointStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__6"


    // $ANTLR start "rule__SetPointStatement__Group__6__Impl"
    // InternalRailSL.g:1501:1: rule__SetPointStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetPointStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1505:1: ( ( '.' ) )
            // InternalRailSL.g:1506:1: ( '.' )
            {
            // InternalRailSL.g:1506:1: ( '.' )
            // InternalRailSL.g:1507:2: '.'
            {
             before(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group__6__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_2__0"
    // InternalRailSL.g:1517:1: rule__SetPointStatement__Group_2__0 : rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 ;
    public final void rule__SetPointStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1521:1: ( rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 )
            // InternalRailSL.g:1522:2: rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__SetPointStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_2__0"


    // $ANTLR start "rule__SetPointStatement__Group_2__0__Impl"
    // InternalRailSL.g:1529:1: rule__SetPointStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__SetPointStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1533:1: ( ( ', ' ) )
            // InternalRailSL.g:1534:1: ( ', ' )
            {
            // InternalRailSL.g:1534:1: ( ', ' )
            // InternalRailSL.g:1535:2: ', '
            {
             before(grammarAccess.getSetPointStatementAccess().getCommaSpaceKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getCommaSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_2__1"
    // InternalRailSL.g:1544:1: rule__SetPointStatement__Group_2__1 : rule__SetPointStatement__Group_2__1__Impl ;
    public final void rule__SetPointStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1548:1: ( rule__SetPointStatement__Group_2__1__Impl )
            // InternalRailSL.g:1549:2: rule__SetPointStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_2__1"


    // $ANTLR start "rule__SetPointStatement__Group_2__1__Impl"
    // InternalRailSL.g:1555:1: rule__SetPointStatement__Group_2__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) ;
    public final void rule__SetPointStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1559:1: ( ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) )
            // InternalRailSL.g:1560:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1560:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            // InternalRailSL.g:1561:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_2_1()); 
            // InternalRailSL.g:1562:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            // InternalRailSL.g:1562:3: rule__SetPointStatement__PointsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__PointsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_3_0__0"
    // InternalRailSL.g:1571:1: rule__SetPointStatement__Group_3_0__0 : rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 ;
    public final void rule__SetPointStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1575:1: ( rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 )
            // InternalRailSL.g:1576:2: rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_12);
            rule__SetPointStatement__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_0__0"


    // $ANTLR start "rule__SetPointStatement__Group_3_0__0__Impl"
    // InternalRailSL.g:1583:1: rule__SetPointStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetPointStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1587:1: ( ( 'and' ) )
            // InternalRailSL.g:1588:1: ( 'and' )
            {
            // InternalRailSL.g:1588:1: ( 'and' )
            // InternalRailSL.g:1589:2: 'and'
            {
             before(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_0__0__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_3_0__1"
    // InternalRailSL.g:1598:1: rule__SetPointStatement__Group_3_0__1 : rule__SetPointStatement__Group_3_0__1__Impl ;
    public final void rule__SetPointStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1602:1: ( rule__SetPointStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1603:2: rule__SetPointStatement__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_0__1"


    // $ANTLR start "rule__SetPointStatement__Group_3_0__1__Impl"
    // InternalRailSL.g:1609:1: rule__SetPointStatement__Group_3_0__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1613:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1614:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1614:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            // InternalRailSL.g:1615:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_0_1()); 
            // InternalRailSL.g:1616:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            // InternalRailSL.g:1616:3: rule__SetPointStatement__PointsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__PointsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_0__1__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_3_1__0"
    // InternalRailSL.g:1625:1: rule__SetPointStatement__Group_3_1__0 : rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 ;
    public final void rule__SetPointStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1629:1: ( rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 )
            // InternalRailSL.g:1630:2: rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SetPointStatement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_1__0"


    // $ANTLR start "rule__SetPointStatement__Group_3_1__0__Impl"
    // InternalRailSL.g:1637:1: rule__SetPointStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetPointStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1641:1: ( ( ', and' ) )
            // InternalRailSL.g:1642:1: ( ', and' )
            {
            // InternalRailSL.g:1642:1: ( ', and' )
            // InternalRailSL.g:1643:2: ', and'
            {
             before(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_1__0__Impl"


    // $ANTLR start "rule__SetPointStatement__Group_3_1__1"
    // InternalRailSL.g:1652:1: rule__SetPointStatement__Group_3_1__1 : rule__SetPointStatement__Group_3_1__1__Impl ;
    public final void rule__SetPointStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1656:1: ( rule__SetPointStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1657:2: rule__SetPointStatement__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_1__1"


    // $ANTLR start "rule__SetPointStatement__Group_3_1__1__Impl"
    // InternalRailSL.g:1663:1: rule__SetPointStatement__Group_3_1__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1667:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1668:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1668:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            // InternalRailSL.g:1669:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_1_1()); 
            // InternalRailSL.g:1670:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            // InternalRailSL.g:1670:3: rule__SetPointStatement__PointsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__PointsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__Group_3_1__1__Impl"


    // $ANTLR start "rule__TimeWaitStatement__Group__0"
    // InternalRailSL.g:1679:1: rule__TimeWaitStatement__Group__0 : rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 ;
    public final void rule__TimeWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1683:1: ( rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 )
            // InternalRailSL.g:1684:2: rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TimeWaitStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWaitStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWaitStatement__Group__0"


    // $ANTLR start "rule__TimeWaitStatement__Group__0__Impl"
    // InternalRailSL.g:1691:1: rule__TimeWaitStatement__Group__0__Impl : ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) ;
    public final void rule__TimeWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1695:1: ( ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) )
            // InternalRailSL.g:1696:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            {
            // InternalRailSL.g:1696:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            // InternalRailSL.g:1697:2: ( ( 'Wait for' ) ) ( ( 'Wait for' )* )
            {
            // InternalRailSL.g:1697:2: ( ( 'Wait for' ) )
            // InternalRailSL.g:1698:3: ( 'Wait for' )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1699:3: ( 'Wait for' )
            // InternalRailSL.g:1699:4: 'Wait for'
            {
            match(input,36,FOLLOW_14); 

            }

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

            }

            // InternalRailSL.g:1702:2: ( ( 'Wait for' )* )
            // InternalRailSL.g:1703:3: ( 'Wait for' )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1704:3: ( 'Wait for' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRailSL.g:1704:4: 'Wait for'
            	    {
            	    match(input,36,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

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
    // $ANTLR end "rule__TimeWaitStatement__Group__0__Impl"


    // $ANTLR start "rule__TimeWaitStatement__Group__1"
    // InternalRailSL.g:1713:1: rule__TimeWaitStatement__Group__1 : rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 ;
    public final void rule__TimeWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1717:1: ( rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 )
            // InternalRailSL.g:1718:2: rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TimeWaitStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeWaitStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWaitStatement__Group__1"


    // $ANTLR start "rule__TimeWaitStatement__Group__1__Impl"
    // InternalRailSL.g:1725:1: rule__TimeWaitStatement__Group__1__Impl : ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) ;
    public final void rule__TimeWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1729:1: ( ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) )
            // InternalRailSL.g:1730:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            {
            // InternalRailSL.g:1730:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            // InternalRailSL.g:1731:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            {
            // InternalRailSL.g:1731:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) )
            // InternalRailSL.g:1732:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1733:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            // InternalRailSL.g:1733:4: rule__TimeWaitStatement__TimeAssignment_1
            {
            pushFollow(FOLLOW_16);
            rule__TimeWaitStatement__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

            }

            // InternalRailSL.g:1736:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            // InternalRailSL.g:1737:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1738:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRailSL.g:1738:4: rule__TimeWaitStatement__TimeAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TimeWaitStatement__TimeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

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
    // $ANTLR end "rule__TimeWaitStatement__Group__1__Impl"


    // $ANTLR start "rule__TimeWaitStatement__Group__2"
    // InternalRailSL.g:1747:1: rule__TimeWaitStatement__Group__2 : rule__TimeWaitStatement__Group__2__Impl ;
    public final void rule__TimeWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1751:1: ( rule__TimeWaitStatement__Group__2__Impl )
            // InternalRailSL.g:1752:2: rule__TimeWaitStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeWaitStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWaitStatement__Group__2"


    // $ANTLR start "rule__TimeWaitStatement__Group__2__Impl"
    // InternalRailSL.g:1758:1: rule__TimeWaitStatement__Group__2__Impl : ( 'seconds.' ) ;
    public final void rule__TimeWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1762:1: ( ( 'seconds.' ) )
            // InternalRailSL.g:1763:1: ( 'seconds.' )
            {
            // InternalRailSL.g:1763:1: ( 'seconds.' )
            // InternalRailSL.g:1764:2: 'seconds.'
            {
             before(grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWaitStatement__Group__2__Impl"


    // $ANTLR start "rule__ContactWaitStatement__Group__0"
    // InternalRailSL.g:1774:1: rule__ContactWaitStatement__Group__0 : rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 ;
    public final void rule__ContactWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1778:1: ( rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 )
            // InternalRailSL.g:1779:2: rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ContactWaitStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__0"


    // $ANTLR start "rule__ContactWaitStatement__Group__0__Impl"
    // InternalRailSL.g:1786:1: rule__ContactWaitStatement__Group__0__Impl : ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) ;
    public final void rule__ContactWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1790:1: ( ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) )
            // InternalRailSL.g:1791:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            {
            // InternalRailSL.g:1791:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            // InternalRailSL.g:1792:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 
            // InternalRailSL.g:1793:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            // InternalRailSL.g:1793:3: rule__ContactWaitStatement__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__0__Impl"


    // $ANTLR start "rule__ContactWaitStatement__Group__1"
    // InternalRailSL.g:1801:1: rule__ContactWaitStatement__Group__1 : rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 ;
    public final void rule__ContactWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1805:1: ( rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 )
            // InternalRailSL.g:1806:2: rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ContactWaitStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__1"


    // $ANTLR start "rule__ContactWaitStatement__Group__1__Impl"
    // InternalRailSL.g:1813:1: rule__ContactWaitStatement__Group__1__Impl : ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) ;
    public final void rule__ContactWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1817:1: ( ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) )
            // InternalRailSL.g:1818:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            {
            // InternalRailSL.g:1818:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            // InternalRailSL.g:1819:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 
            // InternalRailSL.g:1820:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            // InternalRailSL.g:1820:3: rule__ContactWaitStatement__ContactIndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__ContactIndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__1__Impl"


    // $ANTLR start "rule__ContactWaitStatement__Group__2"
    // InternalRailSL.g:1828:1: rule__ContactWaitStatement__Group__2 : rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 ;
    public final void rule__ContactWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1832:1: ( rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 )
            // InternalRailSL.g:1833:2: rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ContactWaitStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__2"


    // $ANTLR start "rule__ContactWaitStatement__Group__2__Impl"
    // InternalRailSL.g:1840:1: rule__ContactWaitStatement__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ContactWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1844:1: ( ( 'contact of' ) )
            // InternalRailSL.g:1845:1: ( 'contact of' )
            {
            // InternalRailSL.g:1845:1: ( 'contact of' )
            // InternalRailSL.g:1846:2: 'contact of'
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__2__Impl"


    // $ANTLR start "rule__ContactWaitStatement__Group__3"
    // InternalRailSL.g:1855:1: rule__ContactWaitStatement__Group__3 : rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 ;
    public final void rule__ContactWaitStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1859:1: ( rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 )
            // InternalRailSL.g:1860:2: rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ContactWaitStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__3"


    // $ANTLR start "rule__ContactWaitStatement__Group__3__Impl"
    // InternalRailSL.g:1867:1: rule__ContactWaitStatement__Group__3__Impl : ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) ;
    public final void rule__ContactWaitStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1871:1: ( ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:1872:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:1872:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            // InternalRailSL.g:1873:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:1874:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            // InternalRailSL.g:1874:3: rule__ContactWaitStatement__SegNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__SegNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__3__Impl"


    // $ANTLR start "rule__ContactWaitStatement__Group__4"
    // InternalRailSL.g:1882:1: rule__ContactWaitStatement__Group__4 : rule__ContactWaitStatement__Group__4__Impl ;
    public final void rule__ContactWaitStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1886:1: ( rule__ContactWaitStatement__Group__4__Impl )
            // InternalRailSL.g:1887:2: rule__ContactWaitStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__4"


    // $ANTLR start "rule__ContactWaitStatement__Group__4__Impl"
    // InternalRailSL.g:1893:1: rule__ContactWaitStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__ContactWaitStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1897:1: ( ( '.' ) )
            // InternalRailSL.g:1898:1: ( '.' )
            {
            // InternalRailSL.g:1898:1: ( '.' )
            // InternalRailSL.g:1899:2: '.'
            {
             before(grammarAccess.getContactWaitStatementAccess().getFullStopKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getContactWaitStatementAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__Group__4__Impl"


    // $ANTLR start "rule__CrossingStatement__Group__0"
    // InternalRailSL.g:1909:1: rule__CrossingStatement__Group__0 : rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 ;
    public final void rule__CrossingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1913:1: ( rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 )
            // InternalRailSL.g:1914:2: rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__CrossingStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossingStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossingStatement__Group__0"


    // $ANTLR start "rule__CrossingStatement__Group__0__Impl"
    // InternalRailSL.g:1921:1: rule__CrossingStatement__Group__0__Impl : ( ( rule__CrossingStatement__ModeAssignment_0 ) ) ;
    public final void rule__CrossingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1925:1: ( ( ( rule__CrossingStatement__ModeAssignment_0 ) ) )
            // InternalRailSL.g:1926:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            {
            // InternalRailSL.g:1926:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            // InternalRailSL.g:1927:2: ( rule__CrossingStatement__ModeAssignment_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAssignment_0()); 
            // InternalRailSL.g:1928:2: ( rule__CrossingStatement__ModeAssignment_0 )
            // InternalRailSL.g:1928:3: rule__CrossingStatement__ModeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CrossingStatement__ModeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCrossingStatementAccess().getModeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossingStatement__Group__0__Impl"


    // $ANTLR start "rule__CrossingStatement__Group__1"
    // InternalRailSL.g:1936:1: rule__CrossingStatement__Group__1 : rule__CrossingStatement__Group__1__Impl ;
    public final void rule__CrossingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1940:1: ( rule__CrossingStatement__Group__1__Impl )
            // InternalRailSL.g:1941:2: rule__CrossingStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossingStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossingStatement__Group__1"


    // $ANTLR start "rule__CrossingStatement__Group__1__Impl"
    // InternalRailSL.g:1947:1: rule__CrossingStatement__Group__1__Impl : ( 'crossing.' ) ;
    public final void rule__CrossingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1951:1: ( ( 'crossing.' ) )
            // InternalRailSL.g:1952:1: ( 'crossing.' )
            {
            // InternalRailSL.g:1952:1: ( 'crossing.' )
            // InternalRailSL.g:1953:2: 'crossing.'
            {
             before(grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossingStatement__Group__1__Impl"


    // $ANTLR start "rule__LightStatement__Group__0"
    // InternalRailSL.g:1963:1: rule__LightStatement__Group__0 : rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 ;
    public final void rule__LightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1967:1: ( rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 )
            // InternalRailSL.g:1968:2: rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LightStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__0"


    // $ANTLR start "rule__LightStatement__Group__0__Impl"
    // InternalRailSL.g:1975:1: rule__LightStatement__Group__0__Impl : ( 'Turn light' ) ;
    public final void rule__LightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1979:1: ( ( 'Turn light' ) )
            // InternalRailSL.g:1980:1: ( 'Turn light' )
            {
            // InternalRailSL.g:1980:1: ( 'Turn light' )
            // InternalRailSL.g:1981:2: 'Turn light'
            {
             before(grammarAccess.getLightStatementAccess().getTurnLightKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getTurnLightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__0__Impl"


    // $ANTLR start "rule__LightStatement__Group__1"
    // InternalRailSL.g:1990:1: rule__LightStatement__Group__1 : rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 ;
    public final void rule__LightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1994:1: ( rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 )
            // InternalRailSL.g:1995:2: rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__LightStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__1"


    // $ANTLR start "rule__LightStatement__Group__1__Impl"
    // InternalRailSL.g:2002:1: rule__LightStatement__Group__1__Impl : ( ( rule__LightStatement__LightsAssignment_1 ) ) ;
    public final void rule__LightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2006:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) )
            // InternalRailSL.g:2007:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            {
            // InternalRailSL.g:2007:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            // InternalRailSL.g:2008:2: ( rule__LightStatement__LightsAssignment_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:2009:2: ( rule__LightStatement__LightsAssignment_1 )
            // InternalRailSL.g:2009:3: rule__LightStatement__LightsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__LightsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__1__Impl"


    // $ANTLR start "rule__LightStatement__Group__2"
    // InternalRailSL.g:2017:1: rule__LightStatement__Group__2 : rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 ;
    public final void rule__LightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2021:1: ( rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 )
            // InternalRailSL.g:2022:2: rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__LightStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__2"


    // $ANTLR start "rule__LightStatement__Group__2__Impl"
    // InternalRailSL.g:2029:1: rule__LightStatement__Group__2__Impl : ( ( rule__LightStatement__Group_2__0 )* ) ;
    public final void rule__LightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2033:1: ( ( ( rule__LightStatement__Group_2__0 )* ) )
            // InternalRailSL.g:2034:1: ( ( rule__LightStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:2034:1: ( ( rule__LightStatement__Group_2__0 )* )
            // InternalRailSL.g:2035:2: ( rule__LightStatement__Group_2__0 )*
            {
             before(grammarAccess.getLightStatementAccess().getGroup_2()); 
            // InternalRailSL.g:2036:2: ( rule__LightStatement__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRailSL.g:2036:3: rule__LightStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__LightStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLightStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__2__Impl"


    // $ANTLR start "rule__LightStatement__Group__3"
    // InternalRailSL.g:2044:1: rule__LightStatement__Group__3 : rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 ;
    public final void rule__LightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2048:1: ( rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 )
            // InternalRailSL.g:2049:2: rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__LightStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__3"


    // $ANTLR start "rule__LightStatement__Group__3__Impl"
    // InternalRailSL.g:2056:1: rule__LightStatement__Group__3__Impl : ( ( rule__LightStatement__Alternatives_3 )? ) ;
    public final void rule__LightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2060:1: ( ( ( rule__LightStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:2061:1: ( ( rule__LightStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:2061:1: ( ( rule__LightStatement__Alternatives_3 )? )
            // InternalRailSL.g:2062:2: ( rule__LightStatement__Alternatives_3 )?
            {
             before(grammarAccess.getLightStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:2063:2: ( rule__LightStatement__Alternatives_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=32 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRailSL.g:2063:3: rule__LightStatement__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightStatement__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLightStatementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__3__Impl"


    // $ANTLR start "rule__LightStatement__Group__4"
    // InternalRailSL.g:2071:1: rule__LightStatement__Group__4 : rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 ;
    public final void rule__LightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2075:1: ( rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 )
            // InternalRailSL.g:2076:2: rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__LightStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__4"


    // $ANTLR start "rule__LightStatement__Group__4__Impl"
    // InternalRailSL.g:2083:1: rule__LightStatement__Group__4__Impl : ( ( rule__LightStatement__StateAssignment_4 ) ) ;
    public final void rule__LightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2087:1: ( ( ( rule__LightStatement__StateAssignment_4 ) ) )
            // InternalRailSL.g:2088:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            {
            // InternalRailSL.g:2088:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            // InternalRailSL.g:2089:2: ( rule__LightStatement__StateAssignment_4 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAssignment_4()); 
            // InternalRailSL.g:2090:2: ( rule__LightStatement__StateAssignment_4 )
            // InternalRailSL.g:2090:3: rule__LightStatement__StateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__4__Impl"


    // $ANTLR start "rule__LightStatement__Group__5"
    // InternalRailSL.g:2098:1: rule__LightStatement__Group__5 : rule__LightStatement__Group__5__Impl ;
    public final void rule__LightStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2102:1: ( rule__LightStatement__Group__5__Impl )
            // InternalRailSL.g:2103:2: rule__LightStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__5"


    // $ANTLR start "rule__LightStatement__Group__5__Impl"
    // InternalRailSL.g:2109:1: rule__LightStatement__Group__5__Impl : ( '.' ) ;
    public final void rule__LightStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2113:1: ( ( '.' ) )
            // InternalRailSL.g:2114:1: ( '.' )
            {
            // InternalRailSL.g:2114:1: ( '.' )
            // InternalRailSL.g:2115:2: '.'
            {
             before(grammarAccess.getLightStatementAccess().getFullStopKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group__5__Impl"


    // $ANTLR start "rule__LightStatement__Group_2__0"
    // InternalRailSL.g:2125:1: rule__LightStatement__Group_2__0 : rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 ;
    public final void rule__LightStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2129:1: ( rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 )
            // InternalRailSL.g:2130:2: rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__LightStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_2__0"


    // $ANTLR start "rule__LightStatement__Group_2__0__Impl"
    // InternalRailSL.g:2137:1: rule__LightStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__LightStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2141:1: ( ( ', ' ) )
            // InternalRailSL.g:2142:1: ( ', ' )
            {
            // InternalRailSL.g:2142:1: ( ', ' )
            // InternalRailSL.g:2143:2: ', '
            {
             before(grammarAccess.getLightStatementAccess().getCommaSpaceKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getCommaSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_2__0__Impl"


    // $ANTLR start "rule__LightStatement__Group_2__1"
    // InternalRailSL.g:2152:1: rule__LightStatement__Group_2__1 : rule__LightStatement__Group_2__1__Impl ;
    public final void rule__LightStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2156:1: ( rule__LightStatement__Group_2__1__Impl )
            // InternalRailSL.g:2157:2: rule__LightStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_2__1"


    // $ANTLR start "rule__LightStatement__Group_2__1__Impl"
    // InternalRailSL.g:2163:1: rule__LightStatement__Group_2__1__Impl : ( ( rule__LightStatement__LightsAssignment_2_1 ) ) ;
    public final void rule__LightStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2167:1: ( ( ( rule__LightStatement__LightsAssignment_2_1 ) ) )
            // InternalRailSL.g:2168:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            {
            // InternalRailSL.g:2168:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            // InternalRailSL.g:2169:2: ( rule__LightStatement__LightsAssignment_2_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_2_1()); 
            // InternalRailSL.g:2170:2: ( rule__LightStatement__LightsAssignment_2_1 )
            // InternalRailSL.g:2170:3: rule__LightStatement__LightsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__LightsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_2__1__Impl"


    // $ANTLR start "rule__LightStatement__Group_3_0__0"
    // InternalRailSL.g:2179:1: rule__LightStatement__Group_3_0__0 : rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 ;
    public final void rule__LightStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2183:1: ( rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 )
            // InternalRailSL.g:2184:2: rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_12);
            rule__LightStatement__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_0__0"


    // $ANTLR start "rule__LightStatement__Group_3_0__0__Impl"
    // InternalRailSL.g:2191:1: rule__LightStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__LightStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2195:1: ( ( 'and' ) )
            // InternalRailSL.g:2196:1: ( 'and' )
            {
            // InternalRailSL.g:2196:1: ( 'and' )
            // InternalRailSL.g:2197:2: 'and'
            {
             before(grammarAccess.getLightStatementAccess().getAndKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getAndKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_0__0__Impl"


    // $ANTLR start "rule__LightStatement__Group_3_0__1"
    // InternalRailSL.g:2206:1: rule__LightStatement__Group_3_0__1 : rule__LightStatement__Group_3_0__1__Impl ;
    public final void rule__LightStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2210:1: ( rule__LightStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:2211:2: rule__LightStatement__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_0__1"


    // $ANTLR start "rule__LightStatement__Group_3_0__1__Impl"
    // InternalRailSL.g:2217:1: rule__LightStatement__Group_3_0__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) ;
    public final void rule__LightStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2221:1: ( ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:2222:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:2222:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            // InternalRailSL.g:2223:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_0_1()); 
            // InternalRailSL.g:2224:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            // InternalRailSL.g:2224:3: rule__LightStatement__LightsAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__LightsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_0__1__Impl"


    // $ANTLR start "rule__LightStatement__Group_3_1__0"
    // InternalRailSL.g:2233:1: rule__LightStatement__Group_3_1__0 : rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 ;
    public final void rule__LightStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2237:1: ( rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 )
            // InternalRailSL.g:2238:2: rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__LightStatement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_1__0"


    // $ANTLR start "rule__LightStatement__Group_3_1__0__Impl"
    // InternalRailSL.g:2245:1: rule__LightStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__LightStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2249:1: ( ( ', and' ) )
            // InternalRailSL.g:2250:1: ( ', and' )
            {
            // InternalRailSL.g:2250:1: ( ', and' )
            // InternalRailSL.g:2251:2: ', and'
            {
             before(grammarAccess.getLightStatementAccess().getAndKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getAndKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_1__0__Impl"


    // $ANTLR start "rule__LightStatement__Group_3_1__1"
    // InternalRailSL.g:2260:1: rule__LightStatement__Group_3_1__1 : rule__LightStatement__Group_3_1__1__Impl ;
    public final void rule__LightStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2264:1: ( rule__LightStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:2265:2: rule__LightStatement__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_1__1"


    // $ANTLR start "rule__LightStatement__Group_3_1__1__Impl"
    // InternalRailSL.g:2271:1: rule__LightStatement__Group_3_1__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) ;
    public final void rule__LightStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2275:1: ( ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:2276:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:2276:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            // InternalRailSL.g:2277:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_1_1()); 
            // InternalRailSL.g:2278:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            // InternalRailSL.g:2278:3: rule__LightStatement__LightsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__LightsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__Group_3_1__1__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__0"
    // InternalRailSL.g:2287:1: rule__ConditionalStatement__Group__0 : rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 ;
    public final void rule__ConditionalStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2291:1: ( rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 )
            // InternalRailSL.g:2292:2: rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConditionalStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__0"


    // $ANTLR start "rule__ConditionalStatement__Group__0__Impl"
    // InternalRailSL.g:2299:1: rule__ConditionalStatement__Group__0__Impl : ( 'Branch:' ) ;
    public final void rule__ConditionalStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2303:1: ( ( 'Branch:' ) )
            // InternalRailSL.g:2304:1: ( 'Branch:' )
            {
            // InternalRailSL.g:2304:1: ( 'Branch:' )
            // InternalRailSL.g:2305:2: 'Branch:'
            {
             before(grammarAccess.getConditionalStatementAccess().getBranchKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConditionalStatementAccess().getBranchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__0__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__1"
    // InternalRailSL.g:2314:1: rule__ConditionalStatement__Group__1 : rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 ;
    public final void rule__ConditionalStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2318:1: ( rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 )
            // InternalRailSL.g:2319:2: rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ConditionalStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__1"


    // $ANTLR start "rule__ConditionalStatement__Group__1__Impl"
    // InternalRailSL.g:2326:1: rule__ConditionalStatement__Group__1__Impl : ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) ;
    public final void rule__ConditionalStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2330:1: ( ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) )
            // InternalRailSL.g:2331:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            {
            // InternalRailSL.g:2331:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            // InternalRailSL.g:2332:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_1()); 
            // InternalRailSL.g:2333:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            // InternalRailSL.g:2333:3: rule__ConditionalStatement__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStatement__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__1__Impl"


    // $ANTLR start "rule__ConditionalStatement__Group__2"
    // InternalRailSL.g:2341:1: rule__ConditionalStatement__Group__2 : rule__ConditionalStatement__Group__2__Impl ;
    public final void rule__ConditionalStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2345:1: ( rule__ConditionalStatement__Group__2__Impl )
            // InternalRailSL.g:2346:2: rule__ConditionalStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__Group__2"


    // $ANTLR start "rule__ConditionalStatement__Group__2__Impl"
    // InternalRailSL.g:2352:1: rule__ConditionalStatement__Group__2__Impl : ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) ;
    public final void rule__ConditionalStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2356:1: ( ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) )
            // InternalRailSL.g:2357:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            {
            // InternalRailSL.g:2357:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            // InternalRailSL.g:2358:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            {
            // InternalRailSL.g:2358:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) )
            // InternalRailSL.g:2359:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2360:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            // InternalRailSL.g:2360:4: rule__ConditionalStatement__LinesAssignment_2
            {
            pushFollow(FOLLOW_22);
            rule__ConditionalStatement__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 

            }

            // InternalRailSL.g:2363:2: ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            // InternalRailSL.g:2364:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2365:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRailSL.g:2365:4: rule__ConditionalStatement__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ConditionalStatement__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 

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
    // $ANTLR end "rule__ConditionalStatement__Group__2__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__0"
    // InternalRailSL.g:2375:1: rule__ConditionalLine__Group__0 : rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 ;
    public final void rule__ConditionalLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2379:1: ( rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 )
            // InternalRailSL.g:2380:2: rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ConditionalLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__0"


    // $ANTLR start "rule__ConditionalLine__Group__0__Impl"
    // InternalRailSL.g:2387:1: rule__ConditionalLine__Group__0__Impl : ( 'If' ) ;
    public final void rule__ConditionalLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2391:1: ( ( 'If' ) )
            // InternalRailSL.g:2392:1: ( 'If' )
            {
            // InternalRailSL.g:2392:1: ( 'If' )
            // InternalRailSL.g:2393:2: 'If'
            {
             before(grammarAccess.getConditionalLineAccess().getIfKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConditionalLineAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__0__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__1"
    // InternalRailSL.g:2402:1: rule__ConditionalLine__Group__1 : rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 ;
    public final void rule__ConditionalLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2406:1: ( rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 )
            // InternalRailSL.g:2407:2: rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ConditionalLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__1"


    // $ANTLR start "rule__ConditionalLine__Group__1__Impl"
    // InternalRailSL.g:2414:1: rule__ConditionalLine__Group__1__Impl : ( ( rule__ConditionalLine__ContactAssignment_1 ) ) ;
    public final void rule__ConditionalLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2418:1: ( ( ( rule__ConditionalLine__ContactAssignment_1 ) ) )
            // InternalRailSL.g:2419:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            {
            // InternalRailSL.g:2419:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            // InternalRailSL.g:2420:2: ( rule__ConditionalLine__ContactAssignment_1 )
            {
             before(grammarAccess.getConditionalLineAccess().getContactAssignment_1()); 
            // InternalRailSL.g:2421:2: ( rule__ConditionalLine__ContactAssignment_1 )
            // InternalRailSL.g:2421:3: rule__ConditionalLine__ContactAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalLine__ContactAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalLineAccess().getContactAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__1__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__2"
    // InternalRailSL.g:2429:1: rule__ConditionalLine__Group__2 : rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 ;
    public final void rule__ConditionalLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2433:1: ( rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 )
            // InternalRailSL.g:2434:2: rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConditionalLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__2"


    // $ANTLR start "rule__ConditionalLine__Group__2__Impl"
    // InternalRailSL.g:2441:1: rule__ConditionalLine__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ConditionalLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2445:1: ( ( 'contact of' ) )
            // InternalRailSL.g:2446:1: ( 'contact of' )
            {
            // InternalRailSL.g:2446:1: ( 'contact of' )
            // InternalRailSL.g:2447:2: 'contact of'
            {
             before(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__2__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__3"
    // InternalRailSL.g:2456:1: rule__ConditionalLine__Group__3 : rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 ;
    public final void rule__ConditionalLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2460:1: ( rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 )
            // InternalRailSL.g:2461:2: rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ConditionalLine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__3"


    // $ANTLR start "rule__ConditionalLine__Group__3__Impl"
    // InternalRailSL.g:2468:1: rule__ConditionalLine__Group__3__Impl : ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) ;
    public final void rule__ConditionalLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2472:1: ( ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:2473:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:2473:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            // InternalRailSL.g:2474:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            {
             before(grammarAccess.getConditionalLineAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:2475:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            // InternalRailSL.g:2475:3: rule__ConditionalLine__SegNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalLine__SegNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalLineAccess().getSegNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__3__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__4"
    // InternalRailSL.g:2483:1: rule__ConditionalLine__Group__4 : rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 ;
    public final void rule__ConditionalLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2487:1: ( rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 )
            // InternalRailSL.g:2488:2: rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ConditionalLine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__4"


    // $ANTLR start "rule__ConditionalLine__Group__4__Impl"
    // InternalRailSL.g:2495:1: rule__ConditionalLine__Group__4__Impl : ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) ;
    public final void rule__ConditionalLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2499:1: ( ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) )
            // InternalRailSL.g:2500:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            {
            // InternalRailSL.g:2500:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            // InternalRailSL.g:2501:2: ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* )
            {
            // InternalRailSL.g:2501:2: ( ( 'is reached first, do' ) )
            // InternalRailSL.g:2502:3: ( 'is reached first, do' )
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2503:3: ( 'is reached first, do' )
            // InternalRailSL.g:2503:4: 'is reached first, do'
            {
            match(input,43,FOLLOW_25); 

            }

             after(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 

            }

            // InternalRailSL.g:2506:2: ( ( 'is reached first, do' )* )
            // InternalRailSL.g:2507:3: ( 'is reached first, do' )*
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2508:3: ( 'is reached first, do' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRailSL.g:2508:4: 'is reached first, do'
            	    {
            	    match(input,43,FOLLOW_25); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 

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
    // $ANTLR end "rule__ConditionalLine__Group__4__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__5"
    // InternalRailSL.g:2517:1: rule__ConditionalLine__Group__5 : rule__ConditionalLine__Group__5__Impl ;
    public final void rule__ConditionalLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2521:1: ( rule__ConditionalLine__Group__5__Impl )
            // InternalRailSL.g:2522:2: rule__ConditionalLine__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalLine__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__5"


    // $ANTLR start "rule__ConditionalLine__Group__5__Impl"
    // InternalRailSL.g:2528:1: rule__ConditionalLine__Group__5__Impl : ( ( rule__ConditionalLine__BlockAssignment_5 ) ) ;
    public final void rule__ConditionalLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2532:1: ( ( ( rule__ConditionalLine__BlockAssignment_5 ) ) )
            // InternalRailSL.g:2533:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            {
            // InternalRailSL.g:2533:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            // InternalRailSL.g:2534:2: ( rule__ConditionalLine__BlockAssignment_5 )
            {
             before(grammarAccess.getConditionalLineAccess().getBlockAssignment_5()); 
            // InternalRailSL.g:2535:2: ( rule__ConditionalLine__BlockAssignment_5 )
            // InternalRailSL.g:2535:3: rule__ConditionalLine__BlockAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalLine__BlockAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConditionalLineAccess().getBlockAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__Group__5__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__0"
    // InternalRailSL.g:2544:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2548:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // InternalRailSL.g:2549:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ParallelStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__Group__0"


    // $ANTLR start "rule__ParallelStatement__Group__0__Impl"
    // InternalRailSL.g:2556:1: rule__ParallelStatement__Group__0__Impl : ( 'Parallel:' ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2560:1: ( ( 'Parallel:' ) )
            // InternalRailSL.g:2561:1: ( 'Parallel:' )
            {
            // InternalRailSL.g:2561:1: ( 'Parallel:' )
            // InternalRailSL.g:2562:2: 'Parallel:'
            {
             before(grammarAccess.getParallelStatementAccess().getParallelKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParallelStatementAccess().getParallelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__Group__0__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__1"
    // InternalRailSL.g:2571:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2 ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2575:1: ( rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2 )
            // InternalRailSL.g:2576:2: rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ParallelStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__Group__1"


    // $ANTLR start "rule__ParallelStatement__Group__1__Impl"
    // InternalRailSL.g:2583:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__BlocksAssignment_1 ) ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2587:1: ( ( ( rule__ParallelStatement__BlocksAssignment_1 ) ) )
            // InternalRailSL.g:2588:1: ( ( rule__ParallelStatement__BlocksAssignment_1 ) )
            {
            // InternalRailSL.g:2588:1: ( ( rule__ParallelStatement__BlocksAssignment_1 ) )
            // InternalRailSL.g:2589:2: ( rule__ParallelStatement__BlocksAssignment_1 )
            {
             before(grammarAccess.getParallelStatementAccess().getBlocksAssignment_1()); 
            // InternalRailSL.g:2590:2: ( rule__ParallelStatement__BlocksAssignment_1 )
            // InternalRailSL.g:2590:3: rule__ParallelStatement__BlocksAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__BlocksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getBlocksAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__Group__1__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__2"
    // InternalRailSL.g:2598:1: rule__ParallelStatement__Group__2 : rule__ParallelStatement__Group__2__Impl ;
    public final void rule__ParallelStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2602:1: ( rule__ParallelStatement__Group__2__Impl )
            // InternalRailSL.g:2603:2: rule__ParallelStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__Group__2"


    // $ANTLR start "rule__ParallelStatement__Group__2__Impl"
    // InternalRailSL.g:2609:1: rule__ParallelStatement__Group__2__Impl : ( ( ( rule__ParallelStatement__BlocksAssignment_2 ) ) ( ( rule__ParallelStatement__BlocksAssignment_2 )* ) ) ;
    public final void rule__ParallelStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2613:1: ( ( ( ( rule__ParallelStatement__BlocksAssignment_2 ) ) ( ( rule__ParallelStatement__BlocksAssignment_2 )* ) ) )
            // InternalRailSL.g:2614:1: ( ( ( rule__ParallelStatement__BlocksAssignment_2 ) ) ( ( rule__ParallelStatement__BlocksAssignment_2 )* ) )
            {
            // InternalRailSL.g:2614:1: ( ( ( rule__ParallelStatement__BlocksAssignment_2 ) ) ( ( rule__ParallelStatement__BlocksAssignment_2 )* ) )
            // InternalRailSL.g:2615:2: ( ( rule__ParallelStatement__BlocksAssignment_2 ) ) ( ( rule__ParallelStatement__BlocksAssignment_2 )* )
            {
            // InternalRailSL.g:2615:2: ( ( rule__ParallelStatement__BlocksAssignment_2 ) )
            // InternalRailSL.g:2616:3: ( rule__ParallelStatement__BlocksAssignment_2 )
            {
             before(grammarAccess.getParallelStatementAccess().getBlocksAssignment_2()); 
            // InternalRailSL.g:2617:3: ( rule__ParallelStatement__BlocksAssignment_2 )
            // InternalRailSL.g:2617:4: rule__ParallelStatement__BlocksAssignment_2
            {
            pushFollow(FOLLOW_26);
            rule__ParallelStatement__BlocksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParallelStatementAccess().getBlocksAssignment_2()); 

            }

            // InternalRailSL.g:2620:2: ( ( rule__ParallelStatement__BlocksAssignment_2 )* )
            // InternalRailSL.g:2621:3: ( rule__ParallelStatement__BlocksAssignment_2 )*
            {
             before(grammarAccess.getParallelStatementAccess().getBlocksAssignment_2()); 
            // InternalRailSL.g:2622:3: ( rule__ParallelStatement__BlocksAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRailSL.g:2622:4: rule__ParallelStatement__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ParallelStatement__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getParallelStatementAccess().getBlocksAssignment_2()); 

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
    // $ANTLR end "rule__ParallelStatement__Group__2__Impl"


    // $ANTLR start "rule__Program__BlockAssignment"
    // InternalRailSL.g:2632:1: rule__Program__BlockAssignment : ( ruleBlock ) ;
    public final void rule__Program__BlockAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2636:1: ( ( ruleBlock ) )
            // InternalRailSL.g:2637:2: ( ruleBlock )
            {
            // InternalRailSL.g:2637:2: ( ruleBlock )
            // InternalRailSL.g:2638:3: ruleBlock
            {
             before(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlockAssignment"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalRailSL.g:2647:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2651:1: ( ( ruleStatement ) )
            // InternalRailSL.g:2652:2: ( ruleStatement )
            {
            // InternalRailSL.g:2652:2: ( ruleStatement )
            // InternalRailSL.g:2653:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__Block__EndAssignment_2"
    // InternalRailSL.g:2662:1: rule__Block__EndAssignment_2 : ( ruleBLOCK_END ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2666:1: ( ( ruleBLOCK_END ) )
            // InternalRailSL.g:2667:2: ( ruleBLOCK_END )
            {
            // InternalRailSL.g:2667:2: ( ruleBLOCK_END )
            // InternalRailSL.g:2668:3: ruleBLOCK_END
            {
             before(grammarAccess.getBlockAccess().getEndBLOCK_ENDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBLOCK_END();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getEndBLOCK_ENDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__EndAssignment_2"


    // $ANTLR start "rule__SetTrackStatement__SegmentsAssignment_1"
    // InternalRailSL.g:2677:1: rule__SetTrackStatement__SegmentsAssignment_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2681:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2682:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2682:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2683:3: RULE_SEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_1_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__SegmentsAssignment_1"


    // $ANTLR start "rule__SetTrackStatement__SegmentsAssignment_2_1"
    // InternalRailSL.g:2692:1: rule__SetTrackStatement__SegmentsAssignment_2_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2696:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2697:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2697:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2698:3: RULE_SEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_2_1_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__SegmentsAssignment_2_1"


    // $ANTLR start "rule__SetTrackStatement__SegmentsAssignment_3_0_1"
    // InternalRailSL.g:2707:1: rule__SetTrackStatement__SegmentsAssignment_3_0_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2711:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2712:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2712:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2713:3: RULE_SEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_0_1_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__SegmentsAssignment_3_0_1"


    // $ANTLR start "rule__SetTrackStatement__SegmentsAssignment_3_1_1"
    // InternalRailSL.g:2722:1: rule__SetTrackStatement__SegmentsAssignment_3_1_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2726:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2727:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2727:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2728:3: RULE_SEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_1_1_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__SegmentsAssignment_3_1_1"


    // $ANTLR start "rule__SetTrackStatement__ModeAssignment_5"
    // InternalRailSL.g:2737:1: rule__SetTrackStatement__ModeAssignment_5 : ( ruleTrackSetting ) ;
    public final void rule__SetTrackStatement__ModeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2741:1: ( ( ruleTrackSetting ) )
            // InternalRailSL.g:2742:2: ( ruleTrackSetting )
            {
            // InternalRailSL.g:2742:2: ( ruleTrackSetting )
            // InternalRailSL.g:2743:3: ruleTrackSetting
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTrackSetting();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__ModeAssignment_5"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_1"
    // InternalRailSL.g:2752:1: rule__SetPointStatement__PointsAssignment_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2756:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2757:2: ( RULE_INT )
            {
            // InternalRailSL.g:2757:2: ( RULE_INT )
            // InternalRailSL.g:2758:3: RULE_INT
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__PointsAssignment_1"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_2_1"
    // InternalRailSL.g:2767:1: rule__SetPointStatement__PointsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2771:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2772:2: ( RULE_INT )
            {
            // InternalRailSL.g:2772:2: ( RULE_INT )
            // InternalRailSL.g:2773:3: RULE_INT
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__PointsAssignment_2_1"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_3_0_1"
    // InternalRailSL.g:2782:1: rule__SetPointStatement__PointsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2786:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2787:2: ( RULE_INT )
            {
            // InternalRailSL.g:2787:2: ( RULE_INT )
            // InternalRailSL.g:2788:3: RULE_INT
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__PointsAssignment_3_0_1"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_3_1_1"
    // InternalRailSL.g:2797:1: rule__SetPointStatement__PointsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2801:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2802:2: ( RULE_INT )
            {
            // InternalRailSL.g:2802:2: ( RULE_INT )
            // InternalRailSL.g:2803:3: RULE_INT
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__PointsAssignment_3_1_1"


    // $ANTLR start "rule__SetPointStatement__OrientationAssignment_5"
    // InternalRailSL.g:2812:1: rule__SetPointStatement__OrientationAssignment_5 : ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) ;
    public final void rule__SetPointStatement__OrientationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2816:1: ( ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) )
            // InternalRailSL.g:2817:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            {
            // InternalRailSL.g:2817:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            // InternalRailSL.g:2818:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_5_0()); 
            // InternalRailSL.g:2819:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            // InternalRailSL.g:2819:4: rule__SetPointStatement__OrientationAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__OrientationAssignment_5"


    // $ANTLR start "rule__TimeWaitStatement__TimeAssignment_1"
    // InternalRailSL.g:2827:1: rule__TimeWaitStatement__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__TimeWaitStatement__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2831:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2832:2: ( RULE_INT )
            {
            // InternalRailSL.g:2832:2: ( RULE_INT )
            // InternalRailSL.g:2833:3: RULE_INT
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeWaitStatementAccess().getTimeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeWaitStatement__TimeAssignment_1"


    // $ANTLR start "rule__ContactWaitStatement__EventAssignment_0"
    // InternalRailSL.g:2842:1: rule__ContactWaitStatement__EventAssignment_0 : ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) ;
    public final void rule__ContactWaitStatement__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2846:1: ( ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) )
            // InternalRailSL.g:2847:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2847:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            // InternalRailSL.g:2848:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 
            // InternalRailSL.g:2849:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            // InternalRailSL.g:2849:4: rule__ContactWaitStatement__EventAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__EventAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__EventAssignment_0"


    // $ANTLR start "rule__ContactWaitStatement__ContactIndexAssignment_1"
    // InternalRailSL.g:2857:1: rule__ContactWaitStatement__ContactIndexAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ContactWaitStatement__ContactIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2861:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:2862:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:2862:2: ( ruleContactIndex )
            // InternalRailSL.g:2863:3: ruleContactIndex
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexContactIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContactIndex();

            state._fsp--;

             after(grammarAccess.getContactWaitStatementAccess().getContactIndexContactIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__ContactIndexAssignment_1"


    // $ANTLR start "rule__ContactWaitStatement__SegNameAssignment_3"
    // InternalRailSL.g:2872:1: rule__ContactWaitStatement__SegNameAssignment_3 : ( RULE_SEG_NAME ) ;
    public final void rule__ContactWaitStatement__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2876:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2877:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2877:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2878:3: RULE_SEG_NAME
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMETerminalRuleCall_3_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContactWaitStatement__SegNameAssignment_3"


    // $ANTLR start "rule__CrossingStatement__ModeAssignment_0"
    // InternalRailSL.g:2887:1: rule__CrossingStatement__ModeAssignment_0 : ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) ;
    public final void rule__CrossingStatement__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2891:1: ( ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) )
            // InternalRailSL.g:2892:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2892:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            // InternalRailSL.g:2893:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAlternatives_0_0()); 
            // InternalRailSL.g:2894:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            // InternalRailSL.g:2894:4: rule__CrossingStatement__ModeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CrossingStatement__ModeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCrossingStatementAccess().getModeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossingStatement__ModeAssignment_0"


    // $ANTLR start "rule__LightStatement__LightsAssignment_1"
    // InternalRailSL.g:2902:1: rule__LightStatement__LightsAssignment_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2906:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2907:2: ( RULE_INT )
            {
            // InternalRailSL.g:2907:2: ( RULE_INT )
            // InternalRailSL.g:2908:3: RULE_INT
            {
             before(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__LightsAssignment_1"


    // $ANTLR start "rule__LightStatement__LightsAssignment_2_1"
    // InternalRailSL.g:2917:1: rule__LightStatement__LightsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2921:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2922:2: ( RULE_INT )
            {
            // InternalRailSL.g:2922:2: ( RULE_INT )
            // InternalRailSL.g:2923:3: RULE_INT
            {
             before(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__LightsAssignment_2_1"


    // $ANTLR start "rule__LightStatement__LightsAssignment_3_0_1"
    // InternalRailSL.g:2932:1: rule__LightStatement__LightsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2936:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2937:2: ( RULE_INT )
            {
            // InternalRailSL.g:2937:2: ( RULE_INT )
            // InternalRailSL.g:2938:3: RULE_INT
            {
             before(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__LightsAssignment_3_0_1"


    // $ANTLR start "rule__LightStatement__LightsAssignment_3_1_1"
    // InternalRailSL.g:2947:1: rule__LightStatement__LightsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2951:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2952:2: ( RULE_INT )
            {
            // InternalRailSL.g:2952:2: ( RULE_INT )
            // InternalRailSL.g:2953:3: RULE_INT
            {
             before(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__LightsAssignment_3_1_1"


    // $ANTLR start "rule__LightStatement__StateAssignment_4"
    // InternalRailSL.g:2962:1: rule__LightStatement__StateAssignment_4 : ( ( rule__LightStatement__StateAlternatives_4_0 ) ) ;
    public final void rule__LightStatement__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2966:1: ( ( ( rule__LightStatement__StateAlternatives_4_0 ) ) )
            // InternalRailSL.g:2967:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            {
            // InternalRailSL.g:2967:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            // InternalRailSL.g:2968:3: ( rule__LightStatement__StateAlternatives_4_0 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAlternatives_4_0()); 
            // InternalRailSL.g:2969:3: ( rule__LightStatement__StateAlternatives_4_0 )
            // InternalRailSL.g:2969:4: rule__LightStatement__StateAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__StateAssignment_4"


    // $ANTLR start "rule__ConditionalStatement__LinesAssignment_1"
    // InternalRailSL.g:2977:1: rule__ConditionalStatement__LinesAssignment_1 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2981:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:2982:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:2982:2: ( ruleConditionalLine )
            // InternalRailSL.g:2983:3: ruleConditionalLine
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalLine();

            state._fsp--;

             after(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__LinesAssignment_1"


    // $ANTLR start "rule__ConditionalStatement__LinesAssignment_2"
    // InternalRailSL.g:2992:1: rule__ConditionalStatement__LinesAssignment_2 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2996:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:2997:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:2997:2: ( ruleConditionalLine )
            // InternalRailSL.g:2998:3: ruleConditionalLine
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalLine();

            state._fsp--;

             after(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalStatement__LinesAssignment_2"


    // $ANTLR start "rule__ConditionalLine__ContactAssignment_1"
    // InternalRailSL.g:3007:1: rule__ConditionalLine__ContactAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ConditionalLine__ContactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3011:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:3012:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:3012:2: ( ruleContactIndex )
            // InternalRailSL.g:3013:3: ruleContactIndex
            {
             before(grammarAccess.getConditionalLineAccess().getContactContactIndexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContactIndex();

            state._fsp--;

             after(grammarAccess.getConditionalLineAccess().getContactContactIndexParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__ContactAssignment_1"


    // $ANTLR start "rule__ConditionalLine__SegNameAssignment_3"
    // InternalRailSL.g:3022:1: rule__ConditionalLine__SegNameAssignment_3 : ( RULE_SEG_NAME ) ;
    public final void rule__ConditionalLine__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3026:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:3027:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:3027:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:3028:3: RULE_SEG_NAME
            {
             before(grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMETerminalRuleCall_3_0()); 
            match(input,RULE_SEG_NAME,FOLLOW_2); 
             after(grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__SegNameAssignment_3"


    // $ANTLR start "rule__ConditionalLine__BlockAssignment_5"
    // InternalRailSL.g:3037:1: rule__ConditionalLine__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__ConditionalLine__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3041:1: ( ( ruleBlock ) )
            // InternalRailSL.g:3042:2: ( ruleBlock )
            {
            // InternalRailSL.g:3042:2: ( ruleBlock )
            // InternalRailSL.g:3043:3: ruleBlock
            {
             before(grammarAccess.getConditionalLineAccess().getBlockBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getConditionalLineAccess().getBlockBlockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalLine__BlockAssignment_5"


    // $ANTLR start "rule__ParallelStatement__BlocksAssignment_1"
    // InternalRailSL.g:3052:1: rule__ParallelStatement__BlocksAssignment_1 : ( ruleBlock ) ;
    public final void rule__ParallelStatement__BlocksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3056:1: ( ( ruleBlock ) )
            // InternalRailSL.g:3057:2: ( ruleBlock )
            {
            // InternalRailSL.g:3057:2: ( ruleBlock )
            // InternalRailSL.g:3058:3: ruleBlock
            {
             before(grammarAccess.getParallelStatementAccess().getBlocksBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getParallelStatementAccess().getBlocksBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__BlocksAssignment_1"


    // $ANTLR start "rule__ParallelStatement__BlocksAssignment_2"
    // InternalRailSL.g:3067:1: rule__ParallelStatement__BlocksAssignment_2 : ( ruleBlock ) ;
    public final void rule__ParallelStatement__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3071:1: ( ( ruleBlock ) )
            // InternalRailSL.g:3072:2: ( ruleBlock )
            {
            // InternalRailSL.g:3072:2: ( ruleBlock )
            // InternalRailSL.g:3073:3: ruleBlock
            {
             before(grammarAccess.getParallelStatementAccess().getBlocksBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getParallelStatementAccess().getBlocksBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStatement__BlocksAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000131810780000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000131810780002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000003A0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000381800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});

}