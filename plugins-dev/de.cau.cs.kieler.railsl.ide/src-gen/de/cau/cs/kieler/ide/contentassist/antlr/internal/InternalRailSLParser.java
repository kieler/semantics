package de.cau.cs.kieler.ide.contentassist.antlr.internal;

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
import de.cau.cs.kieler.services.RailSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEG_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End.'", "'Loop.'", "'stop'", "'full'", "'slow'", "'straight'", "'branch'", "'Reach'", "'Pass'", "'Open'", "'Close'", "'on'", "'off'", "'first'", "'second'", "'Start:'", "'Set track'", "'to'", "'.'", "', '", "'and'", "', and'", "'reverse'", "'Set point'", "'Wait for'", "'seconds.'", "'contact of'", "'crossing.'", "'Turn light'", "'Branch:'", "'If'", "'is reached first, do'"
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
    // InternalRailSL.g:62:1: ruleProgram : ( ( rule__Program__BlocksAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:66:2: ( ( ( rule__Program__BlocksAssignment )* ) )
            // InternalRailSL.g:67:2: ( ( rule__Program__BlocksAssignment )* )
            {
            // InternalRailSL.g:67:2: ( ( rule__Program__BlocksAssignment )* )
            // InternalRailSL.g:68:3: ( rule__Program__BlocksAssignment )*
            {
             before(grammarAccess.getProgramAccess().getBlocksAssignment()); 
            // InternalRailSL.g:69:3: ( rule__Program__BlocksAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRailSL.g:69:4: rule__Program__BlocksAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__BlocksAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getBlocksAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleContactIndex"
    // InternalRailSL.g:453:1: entryRuleContactIndex : ruleContactIndex EOF ;
    public final void entryRuleContactIndex() throws RecognitionException {
        try {
            // InternalRailSL.g:454:1: ( ruleContactIndex EOF )
            // InternalRailSL.g:455:1: ruleContactIndex EOF
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
    // InternalRailSL.g:462:1: ruleContactIndex : ( ( rule__ContactIndex__Alternatives ) ) ;
    public final void ruleContactIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:466:2: ( ( ( rule__ContactIndex__Alternatives ) ) )
            // InternalRailSL.g:467:2: ( ( rule__ContactIndex__Alternatives ) )
            {
            // InternalRailSL.g:467:2: ( ( rule__ContactIndex__Alternatives ) )
            // InternalRailSL.g:468:3: ( rule__ContactIndex__Alternatives )
            {
             before(grammarAccess.getContactIndexAccess().getAlternatives()); 
            // InternalRailSL.g:469:3: ( rule__ContactIndex__Alternatives )
            // InternalRailSL.g:469:4: rule__ContactIndex__Alternatives
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
    // InternalRailSL.g:477:1: rule__BLOCK_END__Alternatives : ( ( 'End.' ) | ( 'Loop.' ) );
    public final void rule__BLOCK_END__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:481:1: ( ( 'End.' ) | ( 'Loop.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:482:2: ( 'End.' )
                    {
                    // InternalRailSL.g:482:2: ( 'End.' )
                    // InternalRailSL.g:483:3: 'End.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:488:2: ( 'Loop.' )
                    {
                    // InternalRailSL.g:488:2: ( 'Loop.' )
                    // InternalRailSL.g:489:3: 'Loop.'
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
    // InternalRailSL.g:498:1: rule__Statement__Alternatives : ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:502:1: ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
            case 35:
                {
                alt3=1;
                }
                break;
            case 19:
            case 20:
            case 36:
                {
                alt3=2;
                }
                break;
            case 21:
            case 22:
            case 40:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:503:2: ( ruleSetStatement )
                    {
                    // InternalRailSL.g:503:2: ( ruleSetStatement )
                    // InternalRailSL.g:504:3: ruleSetStatement
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
                    // InternalRailSL.g:509:2: ( ruleWaitStatement )
                    {
                    // InternalRailSL.g:509:2: ( ruleWaitStatement )
                    // InternalRailSL.g:510:3: ruleWaitStatement
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
                    // InternalRailSL.g:515:2: ( ruleOpStatement )
                    {
                    // InternalRailSL.g:515:2: ( ruleOpStatement )
                    // InternalRailSL.g:516:3: ruleOpStatement
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
                    // InternalRailSL.g:521:2: ( ruleConditionalStatement )
                    {
                    // InternalRailSL.g:521:2: ( ruleConditionalStatement )
                    // InternalRailSL.g:522:3: ruleConditionalStatement
                    {
                     before(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3()); 

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
    // InternalRailSL.g:531:1: rule__SetStatement__Alternatives : ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) );
    public final void rule__SetStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:535:1: ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:536:2: ( ruleSetTrackStatement )
                    {
                    // InternalRailSL.g:536:2: ( ruleSetTrackStatement )
                    // InternalRailSL.g:537:3: ruleSetTrackStatement
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
                    // InternalRailSL.g:542:2: ( ruleSetPointStatement )
                    {
                    // InternalRailSL.g:542:2: ( ruleSetPointStatement )
                    // InternalRailSL.g:543:3: ruleSetPointStatement
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
    // InternalRailSL.g:552:1: rule__SetTrackStatement__Alternatives_3 : ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) );
    public final void rule__SetTrackStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:556:1: ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:557:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:557:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:558:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:559:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    // InternalRailSL.g:559:4: rule__SetTrackStatement__Group_3_0__0
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
                    // InternalRailSL.g:563:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:563:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:564:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:565:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    // InternalRailSL.g:565:4: rule__SetTrackStatement__Group_3_1__0
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
    // InternalRailSL.g:573:1: rule__TrackSetting__Alternatives : ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) );
    public final void rule__TrackSetting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:577:1: ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:578:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    {
                    // InternalRailSL.g:578:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    // InternalRailSL.g:579:3: ( rule__TrackSetting__Group_0__0 )
                    {
                     before(grammarAccess.getTrackSettingAccess().getGroup_0()); 
                    // InternalRailSL.g:580:3: ( rule__TrackSetting__Group_0__0 )
                    // InternalRailSL.g:580:4: rule__TrackSetting__Group_0__0
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
                    // InternalRailSL.g:584:2: ( 'stop' )
                    {
                    // InternalRailSL.g:584:2: ( 'stop' )
                    // InternalRailSL.g:585:3: 'stop'
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
    // InternalRailSL.g:594:1: rule__TrackSetting__Alternatives_0_0 : ( ( 'full' ) | ( 'slow' ) );
    public final void rule__TrackSetting__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:598:1: ( ( 'full' ) | ( 'slow' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:599:2: ( 'full' )
                    {
                    // InternalRailSL.g:599:2: ( 'full' )
                    // InternalRailSL.g:600:3: 'full'
                    {
                     before(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:605:2: ( 'slow' )
                    {
                    // InternalRailSL.g:605:2: ( 'slow' )
                    // InternalRailSL.g:606:3: 'slow'
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
    // InternalRailSL.g:615:1: rule__SetPointStatement__Alternatives_3 : ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) );
    public final void rule__SetPointStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:619:1: ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:620:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:620:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:621:3: ( rule__SetPointStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:622:3: ( rule__SetPointStatement__Group_3_0__0 )
                    // InternalRailSL.g:622:4: rule__SetPointStatement__Group_3_0__0
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
                    // InternalRailSL.g:626:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:626:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:627:3: ( rule__SetPointStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:628:3: ( rule__SetPointStatement__Group_3_1__0 )
                    // InternalRailSL.g:628:4: rule__SetPointStatement__Group_3_1__0
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
    // InternalRailSL.g:636:1: rule__SetPointStatement__OrientationAlternatives_5_0 : ( ( 'straight' ) | ( 'branch' ) );
    public final void rule__SetPointStatement__OrientationAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:640:1: ( ( 'straight' ) | ( 'branch' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:641:2: ( 'straight' )
                    {
                    // InternalRailSL.g:641:2: ( 'straight' )
                    // InternalRailSL.g:642:3: 'straight'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:647:2: ( 'branch' )
                    {
                    // InternalRailSL.g:647:2: ( 'branch' )
                    // InternalRailSL.g:648:3: 'branch'
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
    // InternalRailSL.g:657:1: rule__WaitStatement__Alternatives : ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) );
    public final void rule__WaitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:661:1: ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=19 && LA10_0<=20)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:662:2: ( ruleTimeWaitStatement )
                    {
                    // InternalRailSL.g:662:2: ( ruleTimeWaitStatement )
                    // InternalRailSL.g:663:3: ruleTimeWaitStatement
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
                    // InternalRailSL.g:668:2: ( ruleContactWaitStatement )
                    {
                    // InternalRailSL.g:668:2: ( ruleContactWaitStatement )
                    // InternalRailSL.g:669:3: ruleContactWaitStatement
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
    // InternalRailSL.g:678:1: rule__ContactWaitStatement__EventAlternatives_0_0 : ( ( 'Reach' ) | ( 'Pass' ) );
    public final void rule__ContactWaitStatement__EventAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:682:1: ( ( 'Reach' ) | ( 'Pass' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:683:2: ( 'Reach' )
                    {
                    // InternalRailSL.g:683:2: ( 'Reach' )
                    // InternalRailSL.g:684:3: 'Reach'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:689:2: ( 'Pass' )
                    {
                    // InternalRailSL.g:689:2: ( 'Pass' )
                    // InternalRailSL.g:690:3: 'Pass'
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
    // InternalRailSL.g:699:1: rule__OpStatement__Alternatives : ( ( ruleCrossingStatement ) | ( ruleLightStatement ) );
    public final void rule__OpStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:703:1: ( ( ruleCrossingStatement ) | ( ruleLightStatement ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=22)) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:704:2: ( ruleCrossingStatement )
                    {
                    // InternalRailSL.g:704:2: ( ruleCrossingStatement )
                    // InternalRailSL.g:705:3: ruleCrossingStatement
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
                    // InternalRailSL.g:710:2: ( ruleLightStatement )
                    {
                    // InternalRailSL.g:710:2: ( ruleLightStatement )
                    // InternalRailSL.g:711:3: ruleLightStatement
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
    // InternalRailSL.g:720:1: rule__CrossingStatement__ModeAlternatives_0_0 : ( ( 'Open' ) | ( 'Close' ) );
    public final void rule__CrossingStatement__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:724:1: ( ( 'Open' ) | ( 'Close' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRailSL.g:725:2: ( 'Open' )
                    {
                    // InternalRailSL.g:725:2: ( 'Open' )
                    // InternalRailSL.g:726:3: 'Open'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:731:2: ( 'Close' )
                    {
                    // InternalRailSL.g:731:2: ( 'Close' )
                    // InternalRailSL.g:732:3: 'Close'
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
    // InternalRailSL.g:741:1: rule__LightStatement__Alternatives_3 : ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) );
    public final void rule__LightStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:745:1: ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:746:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:746:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:747:3: ( rule__LightStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:748:3: ( rule__LightStatement__Group_3_0__0 )
                    // InternalRailSL.g:748:4: rule__LightStatement__Group_3_0__0
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
                    // InternalRailSL.g:752:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:752:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:753:3: ( rule__LightStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:754:3: ( rule__LightStatement__Group_3_1__0 )
                    // InternalRailSL.g:754:4: rule__LightStatement__Group_3_1__0
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
    // InternalRailSL.g:762:1: rule__LightStatement__StateAlternatives_4_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__LightStatement__StateAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:766:1: ( ( 'on' ) | ( 'off' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:767:2: ( 'on' )
                    {
                    // InternalRailSL.g:767:2: ( 'on' )
                    // InternalRailSL.g:768:3: 'on'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:773:2: ( 'off' )
                    {
                    // InternalRailSL.g:773:2: ( 'off' )
                    // InternalRailSL.g:774:3: 'off'
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
    // InternalRailSL.g:783:1: rule__ContactIndex__Alternatives : ( ( 'first' ) | ( 'second' ) );
    public final void rule__ContactIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:787:1: ( ( 'first' ) | ( 'second' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRailSL.g:788:2: ( 'first' )
                    {
                    // InternalRailSL.g:788:2: ( 'first' )
                    // InternalRailSL.g:789:3: 'first'
                    {
                     before(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:794:2: ( 'second' )
                    {
                    // InternalRailSL.g:794:2: ( 'second' )
                    // InternalRailSL.g:795:3: 'second'
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
    // InternalRailSL.g:804:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:808:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRailSL.g:809:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRailSL.g:816:1: rule__Block__Group__0__Impl : ( 'Start:' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:820:1: ( ( 'Start:' ) )
            // InternalRailSL.g:821:1: ( 'Start:' )
            {
            // InternalRailSL.g:821:1: ( 'Start:' )
            // InternalRailSL.g:822:2: 'Start:'
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
    // InternalRailSL.g:831:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:835:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRailSL.g:836:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRailSL.g:843:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:847:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalRailSL.g:848:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalRailSL.g:848:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalRailSL.g:849:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalRailSL.g:849:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalRailSL.g:850:3: ( rule__Block__StatementsAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:851:3: ( rule__Block__StatementsAssignment_1 )
            // InternalRailSL.g:851:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Block__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }

            // InternalRailSL.g:854:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalRailSL.g:855:3: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:856:3: ( rule__Block__StatementsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=19 && LA17_0<=22)||LA17_0==28||(LA17_0>=35 && LA17_0<=36)||(LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRailSL.g:856:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRailSL.g:865:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:869:1: ( rule__Block__Group__2__Impl )
            // InternalRailSL.g:870:2: rule__Block__Group__2__Impl
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
    // InternalRailSL.g:876:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:880:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalRailSL.g:881:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalRailSL.g:881:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalRailSL.g:882:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalRailSL.g:883:2: ( rule__Block__EndAssignment_2 )
            // InternalRailSL.g:883:3: rule__Block__EndAssignment_2
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
    // InternalRailSL.g:892:1: rule__SetTrackStatement__Group__0 : rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 ;
    public final void rule__SetTrackStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:896:1: ( rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 )
            // InternalRailSL.g:897:2: rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:904:1: rule__SetTrackStatement__Group__0__Impl : ( 'Set track' ) ;
    public final void rule__SetTrackStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:908:1: ( ( 'Set track' ) )
            // InternalRailSL.g:909:1: ( 'Set track' )
            {
            // InternalRailSL.g:909:1: ( 'Set track' )
            // InternalRailSL.g:910:2: 'Set track'
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
    // InternalRailSL.g:919:1: rule__SetTrackStatement__Group__1 : rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 ;
    public final void rule__SetTrackStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:923:1: ( rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 )
            // InternalRailSL.g:924:2: rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:931:1: rule__SetTrackStatement__Group__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ;
    public final void rule__SetTrackStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:935:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) )
            // InternalRailSL.g:936:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            {
            // InternalRailSL.g:936:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            // InternalRailSL.g:937:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:938:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            // InternalRailSL.g:938:3: rule__SetTrackStatement__SegmentsAssignment_1
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
    // InternalRailSL.g:946:1: rule__SetTrackStatement__Group__2 : rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 ;
    public final void rule__SetTrackStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:950:1: ( rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 )
            // InternalRailSL.g:951:2: rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:958:1: rule__SetTrackStatement__Group__2__Impl : ( ( rule__SetTrackStatement__Group_2__0 )* ) ;
    public final void rule__SetTrackStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:962:1: ( ( ( rule__SetTrackStatement__Group_2__0 )* ) )
            // InternalRailSL.g:963:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:963:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            // InternalRailSL.g:964:2: ( rule__SetTrackStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup_2()); 
            // InternalRailSL.g:965:2: ( rule__SetTrackStatement__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:965:3: rule__SetTrackStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetTrackStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRailSL.g:973:1: rule__SetTrackStatement__Group__3 : rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 ;
    public final void rule__SetTrackStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:977:1: ( rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 )
            // InternalRailSL.g:978:2: rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:985:1: rule__SetTrackStatement__Group__3__Impl : ( ( rule__SetTrackStatement__Alternatives_3 )? ) ;
    public final void rule__SetTrackStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:989:1: ( ( ( rule__SetTrackStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:990:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:990:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            // InternalRailSL.g:991:2: ( rule__SetTrackStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetTrackStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:992:2: ( rule__SetTrackStatement__Alternatives_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRailSL.g:992:3: rule__SetTrackStatement__Alternatives_3
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
    // InternalRailSL.g:1000:1: rule__SetTrackStatement__Group__4 : rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 ;
    public final void rule__SetTrackStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1004:1: ( rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 )
            // InternalRailSL.g:1005:2: rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalRailSL.g:1012:1: rule__SetTrackStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetTrackStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1016:1: ( ( 'to' ) )
            // InternalRailSL.g:1017:1: ( 'to' )
            {
            // InternalRailSL.g:1017:1: ( 'to' )
            // InternalRailSL.g:1018:2: 'to'
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
    // InternalRailSL.g:1027:1: rule__SetTrackStatement__Group__5 : rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 ;
    public final void rule__SetTrackStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1031:1: ( rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 )
            // InternalRailSL.g:1032:2: rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1039:1: rule__SetTrackStatement__Group__5__Impl : ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) ;
    public final void rule__SetTrackStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1043:1: ( ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) )
            // InternalRailSL.g:1044:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            {
            // InternalRailSL.g:1044:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            // InternalRailSL.g:1045:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeAssignment_5()); 
            // InternalRailSL.g:1046:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            // InternalRailSL.g:1046:3: rule__SetTrackStatement__ModeAssignment_5
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
    // InternalRailSL.g:1054:1: rule__SetTrackStatement__Group__6 : rule__SetTrackStatement__Group__6__Impl ;
    public final void rule__SetTrackStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1058:1: ( rule__SetTrackStatement__Group__6__Impl )
            // InternalRailSL.g:1059:2: rule__SetTrackStatement__Group__6__Impl
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
    // InternalRailSL.g:1065:1: rule__SetTrackStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetTrackStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1069:1: ( ( '.' ) )
            // InternalRailSL.g:1070:1: ( '.' )
            {
            // InternalRailSL.g:1070:1: ( '.' )
            // InternalRailSL.g:1071:2: '.'
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
    // InternalRailSL.g:1081:1: rule__SetTrackStatement__Group_2__0 : rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 ;
    public final void rule__SetTrackStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1085:1: ( rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 )
            // InternalRailSL.g:1086:2: rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:1093:1: rule__SetTrackStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__SetTrackStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1097:1: ( ( ', ' ) )
            // InternalRailSL.g:1098:1: ( ', ' )
            {
            // InternalRailSL.g:1098:1: ( ', ' )
            // InternalRailSL.g:1099:2: ', '
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
    // InternalRailSL.g:1108:1: rule__SetTrackStatement__Group_2__1 : rule__SetTrackStatement__Group_2__1__Impl ;
    public final void rule__SetTrackStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1112:1: ( rule__SetTrackStatement__Group_2__1__Impl )
            // InternalRailSL.g:1113:2: rule__SetTrackStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1119:1: rule__SetTrackStatement__Group_2__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) ;
    public final void rule__SetTrackStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1123:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) )
            // InternalRailSL.g:1124:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1124:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            // InternalRailSL.g:1125:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_2_1()); 
            // InternalRailSL.g:1126:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            // InternalRailSL.g:1126:3: rule__SetTrackStatement__SegmentsAssignment_2_1
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
    // InternalRailSL.g:1135:1: rule__SetTrackStatement__Group_3_0__0 : rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 ;
    public final void rule__SetTrackStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1139:1: ( rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 )
            // InternalRailSL.g:1140:2: rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:1147:1: rule__SetTrackStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetTrackStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1151:1: ( ( 'and' ) )
            // InternalRailSL.g:1152:1: ( 'and' )
            {
            // InternalRailSL.g:1152:1: ( 'and' )
            // InternalRailSL.g:1153:2: 'and'
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
    // InternalRailSL.g:1162:1: rule__SetTrackStatement__Group_3_0__1 : rule__SetTrackStatement__Group_3_0__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1166:1: ( rule__SetTrackStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1167:2: rule__SetTrackStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:1173:1: rule__SetTrackStatement__Group_3_0__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1177:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1178:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1178:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            // InternalRailSL.g:1179:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_0_1()); 
            // InternalRailSL.g:1180:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            // InternalRailSL.g:1180:3: rule__SetTrackStatement__SegmentsAssignment_3_0_1
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
    // InternalRailSL.g:1189:1: rule__SetTrackStatement__Group_3_1__0 : rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 ;
    public final void rule__SetTrackStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1193:1: ( rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 )
            // InternalRailSL.g:1194:2: rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:1201:1: rule__SetTrackStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetTrackStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1205:1: ( ( ', and' ) )
            // InternalRailSL.g:1206:1: ( ', and' )
            {
            // InternalRailSL.g:1206:1: ( ', and' )
            // InternalRailSL.g:1207:2: ', and'
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
    // InternalRailSL.g:1216:1: rule__SetTrackStatement__Group_3_1__1 : rule__SetTrackStatement__Group_3_1__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1220:1: ( rule__SetTrackStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1221:2: rule__SetTrackStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:1227:1: rule__SetTrackStatement__Group_3_1__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1231:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1232:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1232:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            // InternalRailSL.g:1233:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_1_1()); 
            // InternalRailSL.g:1234:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            // InternalRailSL.g:1234:3: rule__SetTrackStatement__SegmentsAssignment_3_1_1
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
    // InternalRailSL.g:1243:1: rule__TrackSetting__Group_0__0 : rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 ;
    public final void rule__TrackSetting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1247:1: ( rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 )
            // InternalRailSL.g:1248:2: rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRailSL.g:1255:1: rule__TrackSetting__Group_0__0__Impl : ( ( rule__TrackSetting__Alternatives_0_0 ) ) ;
    public final void rule__TrackSetting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1259:1: ( ( ( rule__TrackSetting__Alternatives_0_0 ) ) )
            // InternalRailSL.g:1260:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            {
            // InternalRailSL.g:1260:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            // InternalRailSL.g:1261:2: ( rule__TrackSetting__Alternatives_0_0 )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives_0_0()); 
            // InternalRailSL.g:1262:2: ( rule__TrackSetting__Alternatives_0_0 )
            // InternalRailSL.g:1262:3: rule__TrackSetting__Alternatives_0_0
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
    // InternalRailSL.g:1270:1: rule__TrackSetting__Group_0__1 : rule__TrackSetting__Group_0__1__Impl ;
    public final void rule__TrackSetting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1274:1: ( rule__TrackSetting__Group_0__1__Impl )
            // InternalRailSL.g:1275:2: rule__TrackSetting__Group_0__1__Impl
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
    // InternalRailSL.g:1281:1: rule__TrackSetting__Group_0__1__Impl : ( ( 'reverse' )? ) ;
    public final void rule__TrackSetting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1285:1: ( ( ( 'reverse' )? ) )
            // InternalRailSL.g:1286:1: ( ( 'reverse' )? )
            {
            // InternalRailSL.g:1286:1: ( ( 'reverse' )? )
            // InternalRailSL.g:1287:2: ( 'reverse' )?
            {
             before(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1()); 
            // InternalRailSL.g:1288:2: ( 'reverse' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRailSL.g:1288:3: 'reverse'
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
    // InternalRailSL.g:1297:1: rule__SetPointStatement__Group__0 : rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 ;
    public final void rule__SetPointStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1301:1: ( rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 )
            // InternalRailSL.g:1302:2: rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1309:1: rule__SetPointStatement__Group__0__Impl : ( 'Set point' ) ;
    public final void rule__SetPointStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1313:1: ( ( 'Set point' ) )
            // InternalRailSL.g:1314:1: ( 'Set point' )
            {
            // InternalRailSL.g:1314:1: ( 'Set point' )
            // InternalRailSL.g:1315:2: 'Set point'
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
    // InternalRailSL.g:1324:1: rule__SetPointStatement__Group__1 : rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 ;
    public final void rule__SetPointStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1328:1: ( rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 )
            // InternalRailSL.g:1329:2: rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:1336:1: rule__SetPointStatement__Group__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ;
    public final void rule__SetPointStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1340:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) )
            // InternalRailSL.g:1341:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            {
            // InternalRailSL.g:1341:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            // InternalRailSL.g:1342:2: ( rule__SetPointStatement__PointsAssignment_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:1343:2: ( rule__SetPointStatement__PointsAssignment_1 )
            // InternalRailSL.g:1343:3: rule__SetPointStatement__PointsAssignment_1
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
    // InternalRailSL.g:1351:1: rule__SetPointStatement__Group__2 : rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 ;
    public final void rule__SetPointStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1355:1: ( rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 )
            // InternalRailSL.g:1356:2: rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:1363:1: rule__SetPointStatement__Group__2__Impl : ( ( rule__SetPointStatement__Group_2__0 )* ) ;
    public final void rule__SetPointStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1367:1: ( ( ( rule__SetPointStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1368:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1368:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            // InternalRailSL.g:1369:2: ( rule__SetPointStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1370:2: ( rule__SetPointStatement__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRailSL.g:1370:3: rule__SetPointStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetPointStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRailSL.g:1378:1: rule__SetPointStatement__Group__3 : rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 ;
    public final void rule__SetPointStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1382:1: ( rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 )
            // InternalRailSL.g:1383:2: rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRailSL.g:1390:1: rule__SetPointStatement__Group__3__Impl : ( ( rule__SetPointStatement__Alternatives_3 )? ) ;
    public final void rule__SetPointStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1394:1: ( ( ( rule__SetPointStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:1395:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:1395:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            // InternalRailSL.g:1396:2: ( rule__SetPointStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetPointStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:1397:2: ( rule__SetPointStatement__Alternatives_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=32 && LA22_0<=33)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRailSL.g:1397:3: rule__SetPointStatement__Alternatives_3
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
    // InternalRailSL.g:1405:1: rule__SetPointStatement__Group__4 : rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 ;
    public final void rule__SetPointStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1409:1: ( rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 )
            // InternalRailSL.g:1410:2: rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalRailSL.g:1417:1: rule__SetPointStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetPointStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1421:1: ( ( 'to' ) )
            // InternalRailSL.g:1422:1: ( 'to' )
            {
            // InternalRailSL.g:1422:1: ( 'to' )
            // InternalRailSL.g:1423:2: 'to'
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
    // InternalRailSL.g:1432:1: rule__SetPointStatement__Group__5 : rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 ;
    public final void rule__SetPointStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1436:1: ( rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 )
            // InternalRailSL.g:1437:2: rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1444:1: rule__SetPointStatement__Group__5__Impl : ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) ;
    public final void rule__SetPointStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1448:1: ( ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) )
            // InternalRailSL.g:1449:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            {
            // InternalRailSL.g:1449:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            // InternalRailSL.g:1450:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_5()); 
            // InternalRailSL.g:1451:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            // InternalRailSL.g:1451:3: rule__SetPointStatement__OrientationAssignment_5
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
    // InternalRailSL.g:1459:1: rule__SetPointStatement__Group__6 : rule__SetPointStatement__Group__6__Impl ;
    public final void rule__SetPointStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1463:1: ( rule__SetPointStatement__Group__6__Impl )
            // InternalRailSL.g:1464:2: rule__SetPointStatement__Group__6__Impl
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
    // InternalRailSL.g:1470:1: rule__SetPointStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetPointStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1474:1: ( ( '.' ) )
            // InternalRailSL.g:1475:1: ( '.' )
            {
            // InternalRailSL.g:1475:1: ( '.' )
            // InternalRailSL.g:1476:2: '.'
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
    // InternalRailSL.g:1486:1: rule__SetPointStatement__Group_2__0 : rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 ;
    public final void rule__SetPointStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1490:1: ( rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 )
            // InternalRailSL.g:1491:2: rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1498:1: rule__SetPointStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__SetPointStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1502:1: ( ( ', ' ) )
            // InternalRailSL.g:1503:1: ( ', ' )
            {
            // InternalRailSL.g:1503:1: ( ', ' )
            // InternalRailSL.g:1504:2: ', '
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
    // InternalRailSL.g:1513:1: rule__SetPointStatement__Group_2__1 : rule__SetPointStatement__Group_2__1__Impl ;
    public final void rule__SetPointStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1517:1: ( rule__SetPointStatement__Group_2__1__Impl )
            // InternalRailSL.g:1518:2: rule__SetPointStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1524:1: rule__SetPointStatement__Group_2__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) ;
    public final void rule__SetPointStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1528:1: ( ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) )
            // InternalRailSL.g:1529:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1529:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            // InternalRailSL.g:1530:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_2_1()); 
            // InternalRailSL.g:1531:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            // InternalRailSL.g:1531:3: rule__SetPointStatement__PointsAssignment_2_1
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
    // InternalRailSL.g:1540:1: rule__SetPointStatement__Group_3_0__0 : rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 ;
    public final void rule__SetPointStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1544:1: ( rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 )
            // InternalRailSL.g:1545:2: rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1552:1: rule__SetPointStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetPointStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1556:1: ( ( 'and' ) )
            // InternalRailSL.g:1557:1: ( 'and' )
            {
            // InternalRailSL.g:1557:1: ( 'and' )
            // InternalRailSL.g:1558:2: 'and'
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
    // InternalRailSL.g:1567:1: rule__SetPointStatement__Group_3_0__1 : rule__SetPointStatement__Group_3_0__1__Impl ;
    public final void rule__SetPointStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1571:1: ( rule__SetPointStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1572:2: rule__SetPointStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:1578:1: rule__SetPointStatement__Group_3_0__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1582:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1583:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1583:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            // InternalRailSL.g:1584:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_0_1()); 
            // InternalRailSL.g:1585:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            // InternalRailSL.g:1585:3: rule__SetPointStatement__PointsAssignment_3_0_1
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
    // InternalRailSL.g:1594:1: rule__SetPointStatement__Group_3_1__0 : rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 ;
    public final void rule__SetPointStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1598:1: ( rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 )
            // InternalRailSL.g:1599:2: rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1606:1: rule__SetPointStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetPointStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1610:1: ( ( ', and' ) )
            // InternalRailSL.g:1611:1: ( ', and' )
            {
            // InternalRailSL.g:1611:1: ( ', and' )
            // InternalRailSL.g:1612:2: ', and'
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
    // InternalRailSL.g:1621:1: rule__SetPointStatement__Group_3_1__1 : rule__SetPointStatement__Group_3_1__1__Impl ;
    public final void rule__SetPointStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1625:1: ( rule__SetPointStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1626:2: rule__SetPointStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:1632:1: rule__SetPointStatement__Group_3_1__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1636:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1637:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1637:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            // InternalRailSL.g:1638:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_1_1()); 
            // InternalRailSL.g:1639:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            // InternalRailSL.g:1639:3: rule__SetPointStatement__PointsAssignment_3_1_1
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
    // InternalRailSL.g:1648:1: rule__TimeWaitStatement__Group__0 : rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 ;
    public final void rule__TimeWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1652:1: ( rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 )
            // InternalRailSL.g:1653:2: rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1660:1: rule__TimeWaitStatement__Group__0__Impl : ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) ;
    public final void rule__TimeWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1664:1: ( ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) )
            // InternalRailSL.g:1665:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            {
            // InternalRailSL.g:1665:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            // InternalRailSL.g:1666:2: ( ( 'Wait for' ) ) ( ( 'Wait for' )* )
            {
            // InternalRailSL.g:1666:2: ( ( 'Wait for' ) )
            // InternalRailSL.g:1667:3: ( 'Wait for' )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1668:3: ( 'Wait for' )
            // InternalRailSL.g:1668:4: 'Wait for'
            {
            match(input,36,FOLLOW_15); 

            }

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

            }

            // InternalRailSL.g:1671:2: ( ( 'Wait for' )* )
            // InternalRailSL.g:1672:3: ( 'Wait for' )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1673:3: ( 'Wait for' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRailSL.g:1673:4: 'Wait for'
            	    {
            	    match(input,36,FOLLOW_15); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRailSL.g:1682:1: rule__TimeWaitStatement__Group__1 : rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 ;
    public final void rule__TimeWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1686:1: ( rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 )
            // InternalRailSL.g:1687:2: rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRailSL.g:1694:1: rule__TimeWaitStatement__Group__1__Impl : ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) ;
    public final void rule__TimeWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1698:1: ( ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) )
            // InternalRailSL.g:1699:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            {
            // InternalRailSL.g:1699:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            // InternalRailSL.g:1700:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            {
            // InternalRailSL.g:1700:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) )
            // InternalRailSL.g:1701:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1702:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            // InternalRailSL.g:1702:4: rule__TimeWaitStatement__TimeAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__TimeWaitStatement__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

            }

            // InternalRailSL.g:1705:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            // InternalRailSL.g:1706:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1707:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRailSL.g:1707:4: rule__TimeWaitStatement__TimeAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TimeWaitStatement__TimeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRailSL.g:1716:1: rule__TimeWaitStatement__Group__2 : rule__TimeWaitStatement__Group__2__Impl ;
    public final void rule__TimeWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1720:1: ( rule__TimeWaitStatement__Group__2__Impl )
            // InternalRailSL.g:1721:2: rule__TimeWaitStatement__Group__2__Impl
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
    // InternalRailSL.g:1727:1: rule__TimeWaitStatement__Group__2__Impl : ( 'seconds.' ) ;
    public final void rule__TimeWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1731:1: ( ( 'seconds.' ) )
            // InternalRailSL.g:1732:1: ( 'seconds.' )
            {
            // InternalRailSL.g:1732:1: ( 'seconds.' )
            // InternalRailSL.g:1733:2: 'seconds.'
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
    // InternalRailSL.g:1743:1: rule__ContactWaitStatement__Group__0 : rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 ;
    public final void rule__ContactWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1747:1: ( rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 )
            // InternalRailSL.g:1748:2: rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRailSL.g:1755:1: rule__ContactWaitStatement__Group__0__Impl : ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) ;
    public final void rule__ContactWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1759:1: ( ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) )
            // InternalRailSL.g:1760:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            {
            // InternalRailSL.g:1760:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            // InternalRailSL.g:1761:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 
            // InternalRailSL.g:1762:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            // InternalRailSL.g:1762:3: rule__ContactWaitStatement__EventAssignment_0
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
    // InternalRailSL.g:1770:1: rule__ContactWaitStatement__Group__1 : rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 ;
    public final void rule__ContactWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1774:1: ( rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 )
            // InternalRailSL.g:1775:2: rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRailSL.g:1782:1: rule__ContactWaitStatement__Group__1__Impl : ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) ;
    public final void rule__ContactWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1786:1: ( ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) )
            // InternalRailSL.g:1787:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            {
            // InternalRailSL.g:1787:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            // InternalRailSL.g:1788:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 
            // InternalRailSL.g:1789:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            // InternalRailSL.g:1789:3: rule__ContactWaitStatement__ContactIndexAssignment_1
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
    // InternalRailSL.g:1797:1: rule__ContactWaitStatement__Group__2 : rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 ;
    public final void rule__ContactWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1801:1: ( rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 )
            // InternalRailSL.g:1802:2: rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:1809:1: rule__ContactWaitStatement__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ContactWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1813:1: ( ( 'contact of' ) )
            // InternalRailSL.g:1814:1: ( 'contact of' )
            {
            // InternalRailSL.g:1814:1: ( 'contact of' )
            // InternalRailSL.g:1815:2: 'contact of'
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
    // InternalRailSL.g:1824:1: rule__ContactWaitStatement__Group__3 : rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 ;
    public final void rule__ContactWaitStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1828:1: ( rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 )
            // InternalRailSL.g:1829:2: rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1836:1: rule__ContactWaitStatement__Group__3__Impl : ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) ;
    public final void rule__ContactWaitStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1840:1: ( ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:1841:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:1841:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            // InternalRailSL.g:1842:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:1843:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            // InternalRailSL.g:1843:3: rule__ContactWaitStatement__SegNameAssignment_3
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
    // InternalRailSL.g:1851:1: rule__ContactWaitStatement__Group__4 : rule__ContactWaitStatement__Group__4__Impl ;
    public final void rule__ContactWaitStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1855:1: ( rule__ContactWaitStatement__Group__4__Impl )
            // InternalRailSL.g:1856:2: rule__ContactWaitStatement__Group__4__Impl
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
    // InternalRailSL.g:1862:1: rule__ContactWaitStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__ContactWaitStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1866:1: ( ( '.' ) )
            // InternalRailSL.g:1867:1: ( '.' )
            {
            // InternalRailSL.g:1867:1: ( '.' )
            // InternalRailSL.g:1868:2: '.'
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
    // InternalRailSL.g:1878:1: rule__CrossingStatement__Group__0 : rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 ;
    public final void rule__CrossingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1882:1: ( rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 )
            // InternalRailSL.g:1883:2: rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRailSL.g:1890:1: rule__CrossingStatement__Group__0__Impl : ( ( rule__CrossingStatement__ModeAssignment_0 ) ) ;
    public final void rule__CrossingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1894:1: ( ( ( rule__CrossingStatement__ModeAssignment_0 ) ) )
            // InternalRailSL.g:1895:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            {
            // InternalRailSL.g:1895:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            // InternalRailSL.g:1896:2: ( rule__CrossingStatement__ModeAssignment_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAssignment_0()); 
            // InternalRailSL.g:1897:2: ( rule__CrossingStatement__ModeAssignment_0 )
            // InternalRailSL.g:1897:3: rule__CrossingStatement__ModeAssignment_0
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
    // InternalRailSL.g:1905:1: rule__CrossingStatement__Group__1 : rule__CrossingStatement__Group__1__Impl ;
    public final void rule__CrossingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1909:1: ( rule__CrossingStatement__Group__1__Impl )
            // InternalRailSL.g:1910:2: rule__CrossingStatement__Group__1__Impl
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
    // InternalRailSL.g:1916:1: rule__CrossingStatement__Group__1__Impl : ( 'crossing.' ) ;
    public final void rule__CrossingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1920:1: ( ( 'crossing.' ) )
            // InternalRailSL.g:1921:1: ( 'crossing.' )
            {
            // InternalRailSL.g:1921:1: ( 'crossing.' )
            // InternalRailSL.g:1922:2: 'crossing.'
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
    // InternalRailSL.g:1932:1: rule__LightStatement__Group__0 : rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 ;
    public final void rule__LightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1936:1: ( rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 )
            // InternalRailSL.g:1937:2: rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:1944:1: rule__LightStatement__Group__0__Impl : ( 'Turn light' ) ;
    public final void rule__LightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1948:1: ( ( 'Turn light' ) )
            // InternalRailSL.g:1949:1: ( 'Turn light' )
            {
            // InternalRailSL.g:1949:1: ( 'Turn light' )
            // InternalRailSL.g:1950:2: 'Turn light'
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
    // InternalRailSL.g:1959:1: rule__LightStatement__Group__1 : rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 ;
    public final void rule__LightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1963:1: ( rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 )
            // InternalRailSL.g:1964:2: rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRailSL.g:1971:1: rule__LightStatement__Group__1__Impl : ( ( rule__LightStatement__LightsAssignment_1 ) ) ;
    public final void rule__LightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1975:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) )
            // InternalRailSL.g:1976:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            {
            // InternalRailSL.g:1976:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            // InternalRailSL.g:1977:2: ( rule__LightStatement__LightsAssignment_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:1978:2: ( rule__LightStatement__LightsAssignment_1 )
            // InternalRailSL.g:1978:3: rule__LightStatement__LightsAssignment_1
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
    // InternalRailSL.g:1986:1: rule__LightStatement__Group__2 : rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 ;
    public final void rule__LightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1990:1: ( rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 )
            // InternalRailSL.g:1991:2: rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalRailSL.g:1998:1: rule__LightStatement__Group__2__Impl : ( ( rule__LightStatement__Group_2__0 )* ) ;
    public final void rule__LightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2002:1: ( ( ( rule__LightStatement__Group_2__0 )* ) )
            // InternalRailSL.g:2003:1: ( ( rule__LightStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:2003:1: ( ( rule__LightStatement__Group_2__0 )* )
            // InternalRailSL.g:2004:2: ( rule__LightStatement__Group_2__0 )*
            {
             before(grammarAccess.getLightStatementAccess().getGroup_2()); 
            // InternalRailSL.g:2005:2: ( rule__LightStatement__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRailSL.g:2005:3: rule__LightStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LightStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRailSL.g:2013:1: rule__LightStatement__Group__3 : rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 ;
    public final void rule__LightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2017:1: ( rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 )
            // InternalRailSL.g:2018:2: rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRailSL.g:2025:1: rule__LightStatement__Group__3__Impl : ( ( rule__LightStatement__Alternatives_3 )? ) ;
    public final void rule__LightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2029:1: ( ( ( rule__LightStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:2030:1: ( ( rule__LightStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:2030:1: ( ( rule__LightStatement__Alternatives_3 )? )
            // InternalRailSL.g:2031:2: ( rule__LightStatement__Alternatives_3 )?
            {
             before(grammarAccess.getLightStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:2032:2: ( rule__LightStatement__Alternatives_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=32 && LA26_0<=33)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRailSL.g:2032:3: rule__LightStatement__Alternatives_3
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
    // InternalRailSL.g:2040:1: rule__LightStatement__Group__4 : rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 ;
    public final void rule__LightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2044:1: ( rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 )
            // InternalRailSL.g:2045:2: rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:2052:1: rule__LightStatement__Group__4__Impl : ( ( rule__LightStatement__StateAssignment_4 ) ) ;
    public final void rule__LightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2056:1: ( ( ( rule__LightStatement__StateAssignment_4 ) ) )
            // InternalRailSL.g:2057:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            {
            // InternalRailSL.g:2057:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            // InternalRailSL.g:2058:2: ( rule__LightStatement__StateAssignment_4 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAssignment_4()); 
            // InternalRailSL.g:2059:2: ( rule__LightStatement__StateAssignment_4 )
            // InternalRailSL.g:2059:3: rule__LightStatement__StateAssignment_4
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
    // InternalRailSL.g:2067:1: rule__LightStatement__Group__5 : rule__LightStatement__Group__5__Impl ;
    public final void rule__LightStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2071:1: ( rule__LightStatement__Group__5__Impl )
            // InternalRailSL.g:2072:2: rule__LightStatement__Group__5__Impl
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
    // InternalRailSL.g:2078:1: rule__LightStatement__Group__5__Impl : ( '.' ) ;
    public final void rule__LightStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2082:1: ( ( '.' ) )
            // InternalRailSL.g:2083:1: ( '.' )
            {
            // InternalRailSL.g:2083:1: ( '.' )
            // InternalRailSL.g:2084:2: '.'
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
    // InternalRailSL.g:2094:1: rule__LightStatement__Group_2__0 : rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 ;
    public final void rule__LightStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2098:1: ( rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 )
            // InternalRailSL.g:2099:2: rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:2106:1: rule__LightStatement__Group_2__0__Impl : ( ', ' ) ;
    public final void rule__LightStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2110:1: ( ( ', ' ) )
            // InternalRailSL.g:2111:1: ( ', ' )
            {
            // InternalRailSL.g:2111:1: ( ', ' )
            // InternalRailSL.g:2112:2: ', '
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
    // InternalRailSL.g:2121:1: rule__LightStatement__Group_2__1 : rule__LightStatement__Group_2__1__Impl ;
    public final void rule__LightStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2125:1: ( rule__LightStatement__Group_2__1__Impl )
            // InternalRailSL.g:2126:2: rule__LightStatement__Group_2__1__Impl
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
    // InternalRailSL.g:2132:1: rule__LightStatement__Group_2__1__Impl : ( ( rule__LightStatement__LightsAssignment_2_1 ) ) ;
    public final void rule__LightStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2136:1: ( ( ( rule__LightStatement__LightsAssignment_2_1 ) ) )
            // InternalRailSL.g:2137:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            {
            // InternalRailSL.g:2137:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            // InternalRailSL.g:2138:2: ( rule__LightStatement__LightsAssignment_2_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_2_1()); 
            // InternalRailSL.g:2139:2: ( rule__LightStatement__LightsAssignment_2_1 )
            // InternalRailSL.g:2139:3: rule__LightStatement__LightsAssignment_2_1
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
    // InternalRailSL.g:2148:1: rule__LightStatement__Group_3_0__0 : rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 ;
    public final void rule__LightStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2152:1: ( rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 )
            // InternalRailSL.g:2153:2: rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:2160:1: rule__LightStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__LightStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2164:1: ( ( 'and' ) )
            // InternalRailSL.g:2165:1: ( 'and' )
            {
            // InternalRailSL.g:2165:1: ( 'and' )
            // InternalRailSL.g:2166:2: 'and'
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
    // InternalRailSL.g:2175:1: rule__LightStatement__Group_3_0__1 : rule__LightStatement__Group_3_0__1__Impl ;
    public final void rule__LightStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2179:1: ( rule__LightStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:2180:2: rule__LightStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:2186:1: rule__LightStatement__Group_3_0__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) ;
    public final void rule__LightStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2190:1: ( ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:2191:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:2191:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            // InternalRailSL.g:2192:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_0_1()); 
            // InternalRailSL.g:2193:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            // InternalRailSL.g:2193:3: rule__LightStatement__LightsAssignment_3_0_1
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
    // InternalRailSL.g:2202:1: rule__LightStatement__Group_3_1__0 : rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 ;
    public final void rule__LightStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2206:1: ( rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 )
            // InternalRailSL.g:2207:2: rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRailSL.g:2214:1: rule__LightStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__LightStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2218:1: ( ( ', and' ) )
            // InternalRailSL.g:2219:1: ( ', and' )
            {
            // InternalRailSL.g:2219:1: ( ', and' )
            // InternalRailSL.g:2220:2: ', and'
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
    // InternalRailSL.g:2229:1: rule__LightStatement__Group_3_1__1 : rule__LightStatement__Group_3_1__1__Impl ;
    public final void rule__LightStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2233:1: ( rule__LightStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:2234:2: rule__LightStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:2240:1: rule__LightStatement__Group_3_1__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) ;
    public final void rule__LightStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2244:1: ( ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:2245:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:2245:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            // InternalRailSL.g:2246:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_1_1()); 
            // InternalRailSL.g:2247:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            // InternalRailSL.g:2247:3: rule__LightStatement__LightsAssignment_3_1_1
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
    // InternalRailSL.g:2256:1: rule__ConditionalStatement__Group__0 : rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 ;
    public final void rule__ConditionalStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2260:1: ( rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 )
            // InternalRailSL.g:2261:2: rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRailSL.g:2268:1: rule__ConditionalStatement__Group__0__Impl : ( 'Branch:' ) ;
    public final void rule__ConditionalStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2272:1: ( ( 'Branch:' ) )
            // InternalRailSL.g:2273:1: ( 'Branch:' )
            {
            // InternalRailSL.g:2273:1: ( 'Branch:' )
            // InternalRailSL.g:2274:2: 'Branch:'
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
    // InternalRailSL.g:2283:1: rule__ConditionalStatement__Group__1 : rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 ;
    public final void rule__ConditionalStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2287:1: ( rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 )
            // InternalRailSL.g:2288:2: rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRailSL.g:2295:1: rule__ConditionalStatement__Group__1__Impl : ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) ;
    public final void rule__ConditionalStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2299:1: ( ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) )
            // InternalRailSL.g:2300:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            {
            // InternalRailSL.g:2300:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            // InternalRailSL.g:2301:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_1()); 
            // InternalRailSL.g:2302:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            // InternalRailSL.g:2302:3: rule__ConditionalStatement__LinesAssignment_1
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
    // InternalRailSL.g:2310:1: rule__ConditionalStatement__Group__2 : rule__ConditionalStatement__Group__2__Impl ;
    public final void rule__ConditionalStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2314:1: ( rule__ConditionalStatement__Group__2__Impl )
            // InternalRailSL.g:2315:2: rule__ConditionalStatement__Group__2__Impl
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
    // InternalRailSL.g:2321:1: rule__ConditionalStatement__Group__2__Impl : ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) ;
    public final void rule__ConditionalStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2325:1: ( ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) )
            // InternalRailSL.g:2326:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            {
            // InternalRailSL.g:2326:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            // InternalRailSL.g:2327:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            {
            // InternalRailSL.g:2327:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) )
            // InternalRailSL.g:2328:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2329:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            // InternalRailSL.g:2329:4: rule__ConditionalStatement__LinesAssignment_2
            {
            pushFollow(FOLLOW_23);
            rule__ConditionalStatement__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 

            }

            // InternalRailSL.g:2332:2: ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            // InternalRailSL.g:2333:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2334:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRailSL.g:2334:4: rule__ConditionalStatement__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionalStatement__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalRailSL.g:2344:1: rule__ConditionalLine__Group__0 : rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 ;
    public final void rule__ConditionalLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2348:1: ( rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 )
            // InternalRailSL.g:2349:2: rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRailSL.g:2356:1: rule__ConditionalLine__Group__0__Impl : ( 'If' ) ;
    public final void rule__ConditionalLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2360:1: ( ( 'If' ) )
            // InternalRailSL.g:2361:1: ( 'If' )
            {
            // InternalRailSL.g:2361:1: ( 'If' )
            // InternalRailSL.g:2362:2: 'If'
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
    // InternalRailSL.g:2371:1: rule__ConditionalLine__Group__1 : rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 ;
    public final void rule__ConditionalLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2375:1: ( rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 )
            // InternalRailSL.g:2376:2: rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalRailSL.g:2383:1: rule__ConditionalLine__Group__1__Impl : ( ( rule__ConditionalLine__ContactAssignment_1 ) ) ;
    public final void rule__ConditionalLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2387:1: ( ( ( rule__ConditionalLine__ContactAssignment_1 ) ) )
            // InternalRailSL.g:2388:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            {
            // InternalRailSL.g:2388:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            // InternalRailSL.g:2389:2: ( rule__ConditionalLine__ContactAssignment_1 )
            {
             before(grammarAccess.getConditionalLineAccess().getContactAssignment_1()); 
            // InternalRailSL.g:2390:2: ( rule__ConditionalLine__ContactAssignment_1 )
            // InternalRailSL.g:2390:3: rule__ConditionalLine__ContactAssignment_1
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
    // InternalRailSL.g:2398:1: rule__ConditionalLine__Group__2 : rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 ;
    public final void rule__ConditionalLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2402:1: ( rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 )
            // InternalRailSL.g:2403:2: rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRailSL.g:2410:1: rule__ConditionalLine__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ConditionalLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2414:1: ( ( 'contact of' ) )
            // InternalRailSL.g:2415:1: ( 'contact of' )
            {
            // InternalRailSL.g:2415:1: ( 'contact of' )
            // InternalRailSL.g:2416:2: 'contact of'
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
    // InternalRailSL.g:2425:1: rule__ConditionalLine__Group__3 : rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 ;
    public final void rule__ConditionalLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2429:1: ( rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 )
            // InternalRailSL.g:2430:2: rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalRailSL.g:2437:1: rule__ConditionalLine__Group__3__Impl : ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) ;
    public final void rule__ConditionalLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2441:1: ( ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:2442:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:2442:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            // InternalRailSL.g:2443:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            {
             before(grammarAccess.getConditionalLineAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:2444:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            // InternalRailSL.g:2444:3: rule__ConditionalLine__SegNameAssignment_3
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
    // InternalRailSL.g:2452:1: rule__ConditionalLine__Group__4 : rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 ;
    public final void rule__ConditionalLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2456:1: ( rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 )
            // InternalRailSL.g:2457:2: rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalRailSL.g:2464:1: rule__ConditionalLine__Group__4__Impl : ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) ;
    public final void rule__ConditionalLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2468:1: ( ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) )
            // InternalRailSL.g:2469:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            {
            // InternalRailSL.g:2469:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            // InternalRailSL.g:2470:2: ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* )
            {
            // InternalRailSL.g:2470:2: ( ( 'is reached first, do' ) )
            // InternalRailSL.g:2471:3: ( 'is reached first, do' )
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2472:3: ( 'is reached first, do' )
            // InternalRailSL.g:2472:4: 'is reached first, do'
            {
            match(input,43,FOLLOW_26); 

            }

             after(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 

            }

            // InternalRailSL.g:2475:2: ( ( 'is reached first, do' )* )
            // InternalRailSL.g:2476:3: ( 'is reached first, do' )*
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2477:3: ( 'is reached first, do' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRailSL.g:2477:4: 'is reached first, do'
            	    {
            	    match(input,43,FOLLOW_26); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalRailSL.g:2486:1: rule__ConditionalLine__Group__5 : rule__ConditionalLine__Group__5__Impl ;
    public final void rule__ConditionalLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2490:1: ( rule__ConditionalLine__Group__5__Impl )
            // InternalRailSL.g:2491:2: rule__ConditionalLine__Group__5__Impl
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
    // InternalRailSL.g:2497:1: rule__ConditionalLine__Group__5__Impl : ( ( rule__ConditionalLine__BlockAssignment_5 ) ) ;
    public final void rule__ConditionalLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2501:1: ( ( ( rule__ConditionalLine__BlockAssignment_5 ) ) )
            // InternalRailSL.g:2502:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            {
            // InternalRailSL.g:2502:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            // InternalRailSL.g:2503:2: ( rule__ConditionalLine__BlockAssignment_5 )
            {
             before(grammarAccess.getConditionalLineAccess().getBlockAssignment_5()); 
            // InternalRailSL.g:2504:2: ( rule__ConditionalLine__BlockAssignment_5 )
            // InternalRailSL.g:2504:3: rule__ConditionalLine__BlockAssignment_5
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


    // $ANTLR start "rule__Program__BlocksAssignment"
    // InternalRailSL.g:2513:1: rule__Program__BlocksAssignment : ( ruleBlock ) ;
    public final void rule__Program__BlocksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2517:1: ( ( ruleBlock ) )
            // InternalRailSL.g:2518:2: ( ruleBlock )
            {
            // InternalRailSL.g:2518:2: ( ruleBlock )
            // InternalRailSL.g:2519:3: ruleBlock
            {
             before(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlocksAssignment"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalRailSL.g:2528:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2532:1: ( ( ruleStatement ) )
            // InternalRailSL.g:2533:2: ( ruleStatement )
            {
            // InternalRailSL.g:2533:2: ( ruleStatement )
            // InternalRailSL.g:2534:3: ruleStatement
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
    // InternalRailSL.g:2543:1: rule__Block__EndAssignment_2 : ( ruleBLOCK_END ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2547:1: ( ( ruleBLOCK_END ) )
            // InternalRailSL.g:2548:2: ( ruleBLOCK_END )
            {
            // InternalRailSL.g:2548:2: ( ruleBLOCK_END )
            // InternalRailSL.g:2549:3: ruleBLOCK_END
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
    // InternalRailSL.g:2558:1: rule__SetTrackStatement__SegmentsAssignment_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2562:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2563:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2563:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2564:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2573:1: rule__SetTrackStatement__SegmentsAssignment_2_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2577:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2578:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2578:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2579:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2588:1: rule__SetTrackStatement__SegmentsAssignment_3_0_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2592:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2593:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2593:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2594:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2603:1: rule__SetTrackStatement__SegmentsAssignment_3_1_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2607:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2608:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2608:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2609:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2618:1: rule__SetTrackStatement__ModeAssignment_5 : ( ruleTrackSetting ) ;
    public final void rule__SetTrackStatement__ModeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2622:1: ( ( ruleTrackSetting ) )
            // InternalRailSL.g:2623:2: ( ruleTrackSetting )
            {
            // InternalRailSL.g:2623:2: ( ruleTrackSetting )
            // InternalRailSL.g:2624:3: ruleTrackSetting
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
    // InternalRailSL.g:2633:1: rule__SetPointStatement__PointsAssignment_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2637:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2638:2: ( RULE_INT )
            {
            // InternalRailSL.g:2638:2: ( RULE_INT )
            // InternalRailSL.g:2639:3: RULE_INT
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
    // InternalRailSL.g:2648:1: rule__SetPointStatement__PointsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2652:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2653:2: ( RULE_INT )
            {
            // InternalRailSL.g:2653:2: ( RULE_INT )
            // InternalRailSL.g:2654:3: RULE_INT
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
    // InternalRailSL.g:2663:1: rule__SetPointStatement__PointsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2667:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2668:2: ( RULE_INT )
            {
            // InternalRailSL.g:2668:2: ( RULE_INT )
            // InternalRailSL.g:2669:3: RULE_INT
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
    // InternalRailSL.g:2678:1: rule__SetPointStatement__PointsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2682:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2683:2: ( RULE_INT )
            {
            // InternalRailSL.g:2683:2: ( RULE_INT )
            // InternalRailSL.g:2684:3: RULE_INT
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
    // InternalRailSL.g:2693:1: rule__SetPointStatement__OrientationAssignment_5 : ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) ;
    public final void rule__SetPointStatement__OrientationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2697:1: ( ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) )
            // InternalRailSL.g:2698:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            {
            // InternalRailSL.g:2698:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            // InternalRailSL.g:2699:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_5_0()); 
            // InternalRailSL.g:2700:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            // InternalRailSL.g:2700:4: rule__SetPointStatement__OrientationAlternatives_5_0
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
    // InternalRailSL.g:2708:1: rule__TimeWaitStatement__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__TimeWaitStatement__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2712:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2713:2: ( RULE_INT )
            {
            // InternalRailSL.g:2713:2: ( RULE_INT )
            // InternalRailSL.g:2714:3: RULE_INT
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
    // InternalRailSL.g:2723:1: rule__ContactWaitStatement__EventAssignment_0 : ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) ;
    public final void rule__ContactWaitStatement__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2727:1: ( ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) )
            // InternalRailSL.g:2728:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2728:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            // InternalRailSL.g:2729:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 
            // InternalRailSL.g:2730:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            // InternalRailSL.g:2730:4: rule__ContactWaitStatement__EventAlternatives_0_0
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
    // InternalRailSL.g:2738:1: rule__ContactWaitStatement__ContactIndexAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ContactWaitStatement__ContactIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2742:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:2743:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:2743:2: ( ruleContactIndex )
            // InternalRailSL.g:2744:3: ruleContactIndex
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
    // InternalRailSL.g:2753:1: rule__ContactWaitStatement__SegNameAssignment_3 : ( RULE_SEG_NAME ) ;
    public final void rule__ContactWaitStatement__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2757:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2758:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2758:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2759:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2768:1: rule__CrossingStatement__ModeAssignment_0 : ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) ;
    public final void rule__CrossingStatement__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2772:1: ( ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) )
            // InternalRailSL.g:2773:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2773:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            // InternalRailSL.g:2774:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAlternatives_0_0()); 
            // InternalRailSL.g:2775:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            // InternalRailSL.g:2775:4: rule__CrossingStatement__ModeAlternatives_0_0
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
    // InternalRailSL.g:2783:1: rule__LightStatement__LightsAssignment_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2787:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2788:2: ( RULE_INT )
            {
            // InternalRailSL.g:2788:2: ( RULE_INT )
            // InternalRailSL.g:2789:3: RULE_INT
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
    // InternalRailSL.g:2798:1: rule__LightStatement__LightsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2802:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2803:2: ( RULE_INT )
            {
            // InternalRailSL.g:2803:2: ( RULE_INT )
            // InternalRailSL.g:2804:3: RULE_INT
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
    // InternalRailSL.g:2813:1: rule__LightStatement__LightsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2817:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2818:2: ( RULE_INT )
            {
            // InternalRailSL.g:2818:2: ( RULE_INT )
            // InternalRailSL.g:2819:3: RULE_INT
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
    // InternalRailSL.g:2828:1: rule__LightStatement__LightsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2832:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2833:2: ( RULE_INT )
            {
            // InternalRailSL.g:2833:2: ( RULE_INT )
            // InternalRailSL.g:2834:3: RULE_INT
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
    // InternalRailSL.g:2843:1: rule__LightStatement__StateAssignment_4 : ( ( rule__LightStatement__StateAlternatives_4_0 ) ) ;
    public final void rule__LightStatement__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2847:1: ( ( ( rule__LightStatement__StateAlternatives_4_0 ) ) )
            // InternalRailSL.g:2848:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            {
            // InternalRailSL.g:2848:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            // InternalRailSL.g:2849:3: ( rule__LightStatement__StateAlternatives_4_0 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAlternatives_4_0()); 
            // InternalRailSL.g:2850:3: ( rule__LightStatement__StateAlternatives_4_0 )
            // InternalRailSL.g:2850:4: rule__LightStatement__StateAlternatives_4_0
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
    // InternalRailSL.g:2858:1: rule__ConditionalStatement__LinesAssignment_1 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2862:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:2863:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:2863:2: ( ruleConditionalLine )
            // InternalRailSL.g:2864:3: ruleConditionalLine
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
    // InternalRailSL.g:2873:1: rule__ConditionalStatement__LinesAssignment_2 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2877:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:2878:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:2878:2: ( ruleConditionalLine )
            // InternalRailSL.g:2879:3: ruleConditionalLine
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
    // InternalRailSL.g:2888:1: rule__ConditionalLine__ContactAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ConditionalLine__ContactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2892:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:2893:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:2893:2: ( ruleContactIndex )
            // InternalRailSL.g:2894:3: ruleContactIndex
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
    // InternalRailSL.g:2903:1: rule__ConditionalLine__SegNameAssignment_3 : ( RULE_SEG_NAME ) ;
    public final void rule__ConditionalLine__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2907:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:2908:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:2908:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:2909:3: RULE_SEG_NAME
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
    // InternalRailSL.g:2918:1: rule__ConditionalLine__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__ConditionalLine__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2922:1: ( ( ruleBlock ) )
            // InternalRailSL.g:2923:2: ( ruleBlock )
            {
            // InternalRailSL.g:2923:2: ( ruleBlock )
            // InternalRailSL.g:2924:3: ruleBlock
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000031810780000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000031810780002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003A0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000381800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});

}