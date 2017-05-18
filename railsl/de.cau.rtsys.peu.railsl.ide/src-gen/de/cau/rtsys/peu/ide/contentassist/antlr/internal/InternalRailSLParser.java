package de.cau.rtsys.peu.ide.contentassist.antlr.internal;

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
import de.cau.rtsys.peu.services.RailSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK_END", "RULE_SEG_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stop'", "'go'", "'slow'", "'straight'", "'branch'", "'Reach'", "'Pass'", "'first'", "'second'", "'Open'", "'Close'", "'on'", "'off'", "'Start:'", "'Set track'", "'to'", "'.'", "'reverse'", "'Set point'", "'Wait for'", "'seconds.'", "'contact of'", "'crossing.'", "'Turn light'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_SEG_NAME=5;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BLOCK_END=4;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalRailSL.g:62:1: ruleProgram : ( ( ( rule__Program__BlocksAssignment ) ) ( ( rule__Program__BlocksAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:66:2: ( ( ( ( rule__Program__BlocksAssignment ) ) ( ( rule__Program__BlocksAssignment )* ) ) )
            // InternalRailSL.g:67:2: ( ( ( rule__Program__BlocksAssignment ) ) ( ( rule__Program__BlocksAssignment )* ) )
            {
            // InternalRailSL.g:67:2: ( ( ( rule__Program__BlocksAssignment ) ) ( ( rule__Program__BlocksAssignment )* ) )
            // InternalRailSL.g:68:3: ( ( rule__Program__BlocksAssignment ) ) ( ( rule__Program__BlocksAssignment )* )
            {
            // InternalRailSL.g:68:3: ( ( rule__Program__BlocksAssignment ) )
            // InternalRailSL.g:69:4: ( rule__Program__BlocksAssignment )
            {
             before(grammarAccess.getProgramAccess().getBlocksAssignment()); 
            // InternalRailSL.g:70:4: ( rule__Program__BlocksAssignment )
            // InternalRailSL.g:70:5: rule__Program__BlocksAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__BlocksAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlocksAssignment()); 

            }

            // InternalRailSL.g:73:3: ( ( rule__Program__BlocksAssignment )* )
            // InternalRailSL.g:74:4: ( rule__Program__BlocksAssignment )*
            {
             before(grammarAccess.getProgramAccess().getBlocksAssignment()); 
            // InternalRailSL.g:75:4: ( rule__Program__BlocksAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRailSL.g:75:5: rule__Program__BlocksAssignment
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

        }
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
    // InternalRailSL.g:85:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalRailSL.g:86:1: ( ruleBlock EOF )
            // InternalRailSL.g:87:1: ruleBlock EOF
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
    // InternalRailSL.g:94:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:98:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalRailSL.g:99:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalRailSL.g:99:2: ( ( rule__Block__Group__0 ) )
            // InternalRailSL.g:100:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalRailSL.g:101:3: ( rule__Block__Group__0 )
            // InternalRailSL.g:101:4: rule__Block__Group__0
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


    // $ANTLR start "entryRuleStatement"
    // InternalRailSL.g:110:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:111:1: ( ruleStatement EOF )
            // InternalRailSL.g:112:1: ruleStatement EOF
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
    // InternalRailSL.g:119:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:123:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRailSL.g:124:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRailSL.g:124:2: ( ( rule__Statement__Alternatives ) )
            // InternalRailSL.g:125:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRailSL.g:126:3: ( rule__Statement__Alternatives )
            // InternalRailSL.g:126:4: rule__Statement__Alternatives
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
    // InternalRailSL.g:135:1: entryRuleSetStatement : ruleSetStatement EOF ;
    public final void entryRuleSetStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:136:1: ( ruleSetStatement EOF )
            // InternalRailSL.g:137:1: ruleSetStatement EOF
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
    // InternalRailSL.g:144:1: ruleSetStatement : ( ( rule__SetStatement__Alternatives ) ) ;
    public final void ruleSetStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:148:2: ( ( ( rule__SetStatement__Alternatives ) ) )
            // InternalRailSL.g:149:2: ( ( rule__SetStatement__Alternatives ) )
            {
            // InternalRailSL.g:149:2: ( ( rule__SetStatement__Alternatives ) )
            // InternalRailSL.g:150:3: ( rule__SetStatement__Alternatives )
            {
             before(grammarAccess.getSetStatementAccess().getAlternatives()); 
            // InternalRailSL.g:151:3: ( rule__SetStatement__Alternatives )
            // InternalRailSL.g:151:4: rule__SetStatement__Alternatives
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
    // InternalRailSL.g:160:1: entryRuleSetTrackStatement : ruleSetTrackStatement EOF ;
    public final void entryRuleSetTrackStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:161:1: ( ruleSetTrackStatement EOF )
            // InternalRailSL.g:162:1: ruleSetTrackStatement EOF
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
    // InternalRailSL.g:169:1: ruleSetTrackStatement : ( ( rule__SetTrackStatement__Group__0 ) ) ;
    public final void ruleSetTrackStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:173:2: ( ( ( rule__SetTrackStatement__Group__0 ) ) )
            // InternalRailSL.g:174:2: ( ( rule__SetTrackStatement__Group__0 ) )
            {
            // InternalRailSL.g:174:2: ( ( rule__SetTrackStatement__Group__0 ) )
            // InternalRailSL.g:175:3: ( rule__SetTrackStatement__Group__0 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup()); 
            // InternalRailSL.g:176:3: ( rule__SetTrackStatement__Group__0 )
            // InternalRailSL.g:176:4: rule__SetTrackStatement__Group__0
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
    // InternalRailSL.g:185:1: entryRuleTrackSetting : ruleTrackSetting EOF ;
    public final void entryRuleTrackSetting() throws RecognitionException {
        try {
            // InternalRailSL.g:186:1: ( ruleTrackSetting EOF )
            // InternalRailSL.g:187:1: ruleTrackSetting EOF
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
    // InternalRailSL.g:194:1: ruleTrackSetting : ( ( rule__TrackSetting__Alternatives ) ) ;
    public final void ruleTrackSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:198:2: ( ( ( rule__TrackSetting__Alternatives ) ) )
            // InternalRailSL.g:199:2: ( ( rule__TrackSetting__Alternatives ) )
            {
            // InternalRailSL.g:199:2: ( ( rule__TrackSetting__Alternatives ) )
            // InternalRailSL.g:200:3: ( rule__TrackSetting__Alternatives )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives()); 
            // InternalRailSL.g:201:3: ( rule__TrackSetting__Alternatives )
            // InternalRailSL.g:201:4: rule__TrackSetting__Alternatives
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
    // InternalRailSL.g:210:1: entryRuleSetPointStatement : ruleSetPointStatement EOF ;
    public final void entryRuleSetPointStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:211:1: ( ruleSetPointStatement EOF )
            // InternalRailSL.g:212:1: ruleSetPointStatement EOF
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
    // InternalRailSL.g:219:1: ruleSetPointStatement : ( ( rule__SetPointStatement__Group__0 ) ) ;
    public final void ruleSetPointStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:223:2: ( ( ( rule__SetPointStatement__Group__0 ) ) )
            // InternalRailSL.g:224:2: ( ( rule__SetPointStatement__Group__0 ) )
            {
            // InternalRailSL.g:224:2: ( ( rule__SetPointStatement__Group__0 ) )
            // InternalRailSL.g:225:3: ( rule__SetPointStatement__Group__0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup()); 
            // InternalRailSL.g:226:3: ( rule__SetPointStatement__Group__0 )
            // InternalRailSL.g:226:4: rule__SetPointStatement__Group__0
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
    // InternalRailSL.g:235:1: entryRuleWaitStatement : ruleWaitStatement EOF ;
    public final void entryRuleWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:236:1: ( ruleWaitStatement EOF )
            // InternalRailSL.g:237:1: ruleWaitStatement EOF
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
    // InternalRailSL.g:244:1: ruleWaitStatement : ( ( rule__WaitStatement__Alternatives ) ) ;
    public final void ruleWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:248:2: ( ( ( rule__WaitStatement__Alternatives ) ) )
            // InternalRailSL.g:249:2: ( ( rule__WaitStatement__Alternatives ) )
            {
            // InternalRailSL.g:249:2: ( ( rule__WaitStatement__Alternatives ) )
            // InternalRailSL.g:250:3: ( rule__WaitStatement__Alternatives )
            {
             before(grammarAccess.getWaitStatementAccess().getAlternatives()); 
            // InternalRailSL.g:251:3: ( rule__WaitStatement__Alternatives )
            // InternalRailSL.g:251:4: rule__WaitStatement__Alternatives
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
    // InternalRailSL.g:260:1: entryRuleTimeWaitStatement : ruleTimeWaitStatement EOF ;
    public final void entryRuleTimeWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:261:1: ( ruleTimeWaitStatement EOF )
            // InternalRailSL.g:262:1: ruleTimeWaitStatement EOF
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
    // InternalRailSL.g:269:1: ruleTimeWaitStatement : ( ( rule__TimeWaitStatement__Group__0 ) ) ;
    public final void ruleTimeWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:273:2: ( ( ( rule__TimeWaitStatement__Group__0 ) ) )
            // InternalRailSL.g:274:2: ( ( rule__TimeWaitStatement__Group__0 ) )
            {
            // InternalRailSL.g:274:2: ( ( rule__TimeWaitStatement__Group__0 ) )
            // InternalRailSL.g:275:3: ( rule__TimeWaitStatement__Group__0 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getGroup()); 
            // InternalRailSL.g:276:3: ( rule__TimeWaitStatement__Group__0 )
            // InternalRailSL.g:276:4: rule__TimeWaitStatement__Group__0
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
    // InternalRailSL.g:285:1: entryRuleContactWaitStatement : ruleContactWaitStatement EOF ;
    public final void entryRuleContactWaitStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:286:1: ( ruleContactWaitStatement EOF )
            // InternalRailSL.g:287:1: ruleContactWaitStatement EOF
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
    // InternalRailSL.g:294:1: ruleContactWaitStatement : ( ( rule__ContactWaitStatement__Group__0 ) ) ;
    public final void ruleContactWaitStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:298:2: ( ( ( rule__ContactWaitStatement__Group__0 ) ) )
            // InternalRailSL.g:299:2: ( ( rule__ContactWaitStatement__Group__0 ) )
            {
            // InternalRailSL.g:299:2: ( ( rule__ContactWaitStatement__Group__0 ) )
            // InternalRailSL.g:300:3: ( rule__ContactWaitStatement__Group__0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getGroup()); 
            // InternalRailSL.g:301:3: ( rule__ContactWaitStatement__Group__0 )
            // InternalRailSL.g:301:4: rule__ContactWaitStatement__Group__0
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
    // InternalRailSL.g:310:1: entryRuleOpStatement : ruleOpStatement EOF ;
    public final void entryRuleOpStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:311:1: ( ruleOpStatement EOF )
            // InternalRailSL.g:312:1: ruleOpStatement EOF
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
    // InternalRailSL.g:319:1: ruleOpStatement : ( ( rule__OpStatement__Alternatives ) ) ;
    public final void ruleOpStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:323:2: ( ( ( rule__OpStatement__Alternatives ) ) )
            // InternalRailSL.g:324:2: ( ( rule__OpStatement__Alternatives ) )
            {
            // InternalRailSL.g:324:2: ( ( rule__OpStatement__Alternatives ) )
            // InternalRailSL.g:325:3: ( rule__OpStatement__Alternatives )
            {
             before(grammarAccess.getOpStatementAccess().getAlternatives()); 
            // InternalRailSL.g:326:3: ( rule__OpStatement__Alternatives )
            // InternalRailSL.g:326:4: rule__OpStatement__Alternatives
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
    // InternalRailSL.g:335:1: entryRuleCrossingStatement : ruleCrossingStatement EOF ;
    public final void entryRuleCrossingStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:336:1: ( ruleCrossingStatement EOF )
            // InternalRailSL.g:337:1: ruleCrossingStatement EOF
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
    // InternalRailSL.g:344:1: ruleCrossingStatement : ( ( rule__CrossingStatement__Group__0 ) ) ;
    public final void ruleCrossingStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:348:2: ( ( ( rule__CrossingStatement__Group__0 ) ) )
            // InternalRailSL.g:349:2: ( ( rule__CrossingStatement__Group__0 ) )
            {
            // InternalRailSL.g:349:2: ( ( rule__CrossingStatement__Group__0 ) )
            // InternalRailSL.g:350:3: ( rule__CrossingStatement__Group__0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getGroup()); 
            // InternalRailSL.g:351:3: ( rule__CrossingStatement__Group__0 )
            // InternalRailSL.g:351:4: rule__CrossingStatement__Group__0
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
    // InternalRailSL.g:360:1: entryRuleLightStatement : ruleLightStatement EOF ;
    public final void entryRuleLightStatement() throws RecognitionException {
        try {
            // InternalRailSL.g:361:1: ( ruleLightStatement EOF )
            // InternalRailSL.g:362:1: ruleLightStatement EOF
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
    // InternalRailSL.g:369:1: ruleLightStatement : ( ( rule__LightStatement__Group__0 ) ) ;
    public final void ruleLightStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:373:2: ( ( ( rule__LightStatement__Group__0 ) ) )
            // InternalRailSL.g:374:2: ( ( rule__LightStatement__Group__0 ) )
            {
            // InternalRailSL.g:374:2: ( ( rule__LightStatement__Group__0 ) )
            // InternalRailSL.g:375:3: ( rule__LightStatement__Group__0 )
            {
             before(grammarAccess.getLightStatementAccess().getGroup()); 
            // InternalRailSL.g:376:3: ( rule__LightStatement__Group__0 )
            // InternalRailSL.g:376:4: rule__LightStatement__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRailSL.g:384:1: rule__Statement__Alternatives : ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:388:1: ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
            case 31:
                {
                alt2=1;
                }
                break;
            case 18:
            case 19:
            case 32:
                {
                alt2=2;
                }
                break;
            case 22:
            case 23:
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:389:2: ( ruleSetStatement )
                    {
                    // InternalRailSL.g:389:2: ( ruleSetStatement )
                    // InternalRailSL.g:390:3: ruleSetStatement
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
                    // InternalRailSL.g:395:2: ( ruleWaitStatement )
                    {
                    // InternalRailSL.g:395:2: ( ruleWaitStatement )
                    // InternalRailSL.g:396:3: ruleWaitStatement
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
                    // InternalRailSL.g:401:2: ( ruleOpStatement )
                    {
                    // InternalRailSL.g:401:2: ( ruleOpStatement )
                    // InternalRailSL.g:402:3: ruleOpStatement
                    {
                     before(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOpStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2()); 

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
    // InternalRailSL.g:411:1: rule__SetStatement__Alternatives : ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) );
    public final void rule__SetStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:415:1: ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:416:2: ( ruleSetTrackStatement )
                    {
                    // InternalRailSL.g:416:2: ( ruleSetTrackStatement )
                    // InternalRailSL.g:417:3: ruleSetTrackStatement
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
                    // InternalRailSL.g:422:2: ( ruleSetPointStatement )
                    {
                    // InternalRailSL.g:422:2: ( ruleSetPointStatement )
                    // InternalRailSL.g:423:3: ruleSetPointStatement
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


    // $ANTLR start "rule__TrackSetting__Alternatives"
    // InternalRailSL.g:432:1: rule__TrackSetting__Alternatives : ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) );
    public final void rule__TrackSetting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:436:1: ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)||LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:437:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    {
                    // InternalRailSL.g:437:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    // InternalRailSL.g:438:3: ( rule__TrackSetting__Group_0__0 )
                    {
                     before(grammarAccess.getTrackSettingAccess().getGroup_0()); 
                    // InternalRailSL.g:439:3: ( rule__TrackSetting__Group_0__0 )
                    // InternalRailSL.g:439:4: rule__TrackSetting__Group_0__0
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
                    // InternalRailSL.g:443:2: ( 'stop' )
                    {
                    // InternalRailSL.g:443:2: ( 'stop' )
                    // InternalRailSL.g:444:3: 'stop'
                    {
                     before(grammarAccess.getTrackSettingAccess().getStopKeyword_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__TrackSetting__Alternatives_0_1"
    // InternalRailSL.g:453:1: rule__TrackSetting__Alternatives_0_1 : ( ( 'go' ) | ( 'slow' ) );
    public final void rule__TrackSetting__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:457:1: ( ( 'go' ) | ( 'slow' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:458:2: ( 'go' )
                    {
                    // InternalRailSL.g:458:2: ( 'go' )
                    // InternalRailSL.g:459:3: 'go'
                    {
                     before(grammarAccess.getTrackSettingAccess().getGoKeyword_0_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getGoKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:464:2: ( 'slow' )
                    {
                    // InternalRailSL.g:464:2: ( 'slow' )
                    // InternalRailSL.g:465:3: 'slow'
                    {
                     before(grammarAccess.getTrackSettingAccess().getSlowKeyword_0_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getSlowKeyword_0_1_1()); 

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
    // $ANTLR end "rule__TrackSetting__Alternatives_0_1"


    // $ANTLR start "rule__SetPointStatement__OrientationAlternatives_3_0"
    // InternalRailSL.g:474:1: rule__SetPointStatement__OrientationAlternatives_3_0 : ( ( 'straight' ) | ( 'branch' ) );
    public final void rule__SetPointStatement__OrientationAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:478:1: ( ( 'straight' ) | ( 'branch' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:479:2: ( 'straight' )
                    {
                    // InternalRailSL.g:479:2: ( 'straight' )
                    // InternalRailSL.g:480:3: 'straight'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_3_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:485:2: ( 'branch' )
                    {
                    // InternalRailSL.g:485:2: ( 'branch' )
                    // InternalRailSL.g:486:3: 'branch'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_3_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_3_0_1()); 

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
    // $ANTLR end "rule__SetPointStatement__OrientationAlternatives_3_0"


    // $ANTLR start "rule__WaitStatement__Alternatives"
    // InternalRailSL.g:495:1: rule__WaitStatement__Alternatives : ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) );
    public final void rule__WaitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:499:1: ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:500:2: ( ruleTimeWaitStatement )
                    {
                    // InternalRailSL.g:500:2: ( ruleTimeWaitStatement )
                    // InternalRailSL.g:501:3: ruleTimeWaitStatement
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
                    // InternalRailSL.g:506:2: ( ruleContactWaitStatement )
                    {
                    // InternalRailSL.g:506:2: ( ruleContactWaitStatement )
                    // InternalRailSL.g:507:3: ruleContactWaitStatement
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
    // InternalRailSL.g:516:1: rule__ContactWaitStatement__EventAlternatives_0_0 : ( ( 'Reach' ) | ( 'Pass' ) );
    public final void rule__ContactWaitStatement__EventAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:520:1: ( ( 'Reach' ) | ( 'Pass' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:521:2: ( 'Reach' )
                    {
                    // InternalRailSL.g:521:2: ( 'Reach' )
                    // InternalRailSL.g:522:3: 'Reach'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:527:2: ( 'Pass' )
                    {
                    // InternalRailSL.g:527:2: ( 'Pass' )
                    // InternalRailSL.g:528:3: 'Pass'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventPassKeyword_0_0_1()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__ContactWaitStatement__ContactIndexAlternatives_1_0"
    // InternalRailSL.g:537:1: rule__ContactWaitStatement__ContactIndexAlternatives_1_0 : ( ( 'first' ) | ( 'second' ) );
    public final void rule__ContactWaitStatement__ContactIndexAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:541:1: ( ( 'first' ) | ( 'second' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:542:2: ( 'first' )
                    {
                    // InternalRailSL.g:542:2: ( 'first' )
                    // InternalRailSL.g:543:3: 'first'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getContactIndexFirstKeyword_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getContactIndexFirstKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:548:2: ( 'second' )
                    {
                    // InternalRailSL.g:548:2: ( 'second' )
                    // InternalRailSL.g:549:3: 'second'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getContactIndexSecondKeyword_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getContactIndexSecondKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ContactWaitStatement__ContactIndexAlternatives_1_0"


    // $ANTLR start "rule__OpStatement__Alternatives"
    // InternalRailSL.g:558:1: rule__OpStatement__Alternatives : ( ( ruleCrossingStatement ) | ( ruleLightStatement ) );
    public final void rule__OpStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:562:1: ( ( ruleCrossingStatement ) | ( ruleLightStatement ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=23)) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:563:2: ( ruleCrossingStatement )
                    {
                    // InternalRailSL.g:563:2: ( ruleCrossingStatement )
                    // InternalRailSL.g:564:3: ruleCrossingStatement
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
                    // InternalRailSL.g:569:2: ( ruleLightStatement )
                    {
                    // InternalRailSL.g:569:2: ( ruleLightStatement )
                    // InternalRailSL.g:570:3: ruleLightStatement
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


    // $ANTLR start "rule__CrossingStatement__Alternatives_0"
    // InternalRailSL.g:579:1: rule__CrossingStatement__Alternatives_0 : ( ( 'Open' ) | ( 'Close' ) );
    public final void rule__CrossingStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:583:1: ( ( 'Open' ) | ( 'Close' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:584:2: ( 'Open' )
                    {
                    // InternalRailSL.g:584:2: ( 'Open' )
                    // InternalRailSL.g:585:3: 'Open'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getOpenKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getOpenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:590:2: ( 'Close' )
                    {
                    // InternalRailSL.g:590:2: ( 'Close' )
                    // InternalRailSL.g:591:3: 'Close'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getCloseKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getCloseKeyword_0_1()); 

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
    // $ANTLR end "rule__CrossingStatement__Alternatives_0"


    // $ANTLR start "rule__LightStatement__StateAlternatives_2_0"
    // InternalRailSL.g:600:1: rule__LightStatement__StateAlternatives_2_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__LightStatement__StateAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:604:1: ( ( 'on' ) | ( 'off' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:605:2: ( 'on' )
                    {
                    // InternalRailSL.g:605:2: ( 'on' )
                    // InternalRailSL.g:606:3: 'on'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOnKeyword_2_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOnKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:611:2: ( 'off' )
                    {
                    // InternalRailSL.g:611:2: ( 'off' )
                    // InternalRailSL.g:612:3: 'off'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOffKeyword_2_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOffKeyword_2_0_1()); 

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
    // $ANTLR end "rule__LightStatement__StateAlternatives_2_0"


    // $ANTLR start "rule__Block__Group__0"
    // InternalRailSL.g:621:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:625:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRailSL.g:626:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRailSL.g:633:1: rule__Block__Group__0__Impl : ( 'Start:' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:637:1: ( ( 'Start:' ) )
            // InternalRailSL.g:638:1: ( 'Start:' )
            {
            // InternalRailSL.g:638:1: ( 'Start:' )
            // InternalRailSL.g:639:2: 'Start:'
            {
             before(grammarAccess.getBlockAccess().getStartKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRailSL.g:648:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:652:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRailSL.g:653:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRailSL.g:660:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:664:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalRailSL.g:665:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalRailSL.g:665:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalRailSL.g:666:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalRailSL.g:666:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalRailSL.g:667:3: ( rule__Block__StatementsAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:668:3: ( rule__Block__StatementsAssignment_1 )
            // InternalRailSL.g:668:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Block__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }

            // InternalRailSL.g:671:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalRailSL.g:672:3: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:673:3: ( rule__Block__StatementsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=18 && LA13_0<=19)||(LA13_0>=22 && LA13_0<=23)||LA13_0==27||(LA13_0>=31 && LA13_0<=32)||LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRailSL.g:673:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRailSL.g:682:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:686:1: ( rule__Block__Group__2__Impl )
            // InternalRailSL.g:687:2: rule__Block__Group__2__Impl
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
    // InternalRailSL.g:693:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:697:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalRailSL.g:698:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalRailSL.g:698:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalRailSL.g:699:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalRailSL.g:700:2: ( rule__Block__EndAssignment_2 )
            // InternalRailSL.g:700:3: rule__Block__EndAssignment_2
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
    // InternalRailSL.g:709:1: rule__SetTrackStatement__Group__0 : rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 ;
    public final void rule__SetTrackStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:713:1: ( rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 )
            // InternalRailSL.g:714:2: rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1
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
    // InternalRailSL.g:721:1: rule__SetTrackStatement__Group__0__Impl : ( 'Set track' ) ;
    public final void rule__SetTrackStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:725:1: ( ( 'Set track' ) )
            // InternalRailSL.g:726:1: ( 'Set track' )
            {
            // InternalRailSL.g:726:1: ( 'Set track' )
            // InternalRailSL.g:727:2: 'Set track'
            {
             before(grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRailSL.g:736:1: rule__SetTrackStatement__Group__1 : rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 ;
    public final void rule__SetTrackStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:740:1: ( rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 )
            // InternalRailSL.g:741:2: rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2
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
    // InternalRailSL.g:748:1: rule__SetTrackStatement__Group__1__Impl : ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* ) ) ;
    public final void rule__SetTrackStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:752:1: ( ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* ) ) )
            // InternalRailSL.g:753:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* ) )
            {
            // InternalRailSL.g:753:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* ) )
            // InternalRailSL.g:754:2: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* )
            {
            // InternalRailSL.g:754:2: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            // InternalRailSL.g:755:3: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:756:3: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            // InternalRailSL.g:756:4: rule__SetTrackStatement__SegmentsAssignment_1
            {
            pushFollow(FOLLOW_9);
            rule__SetTrackStatement__SegmentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 

            }

            // InternalRailSL.g:759:2: ( ( rule__SetTrackStatement__SegmentsAssignment_1 )* )
            // InternalRailSL.g:760:3: ( rule__SetTrackStatement__SegmentsAssignment_1 )*
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:761:3: ( rule__SetTrackStatement__SegmentsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SEG_NAME) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRailSL.g:761:4: rule__SetTrackStatement__SegmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetTrackStatement__SegmentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 

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
    // $ANTLR end "rule__SetTrackStatement__Group__1__Impl"


    // $ANTLR start "rule__SetTrackStatement__Group__2"
    // InternalRailSL.g:770:1: rule__SetTrackStatement__Group__2 : rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 ;
    public final void rule__SetTrackStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:774:1: ( rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 )
            // InternalRailSL.g:775:2: rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRailSL.g:782:1: rule__SetTrackStatement__Group__2__Impl : ( 'to' ) ;
    public final void rule__SetTrackStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:786:1: ( ( 'to' ) )
            // InternalRailSL.g:787:1: ( 'to' )
            {
            // InternalRailSL.g:787:1: ( 'to' )
            // InternalRailSL.g:788:2: 'to'
            {
             before(grammarAccess.getSetTrackStatementAccess().getToKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getToKeyword_2()); 

            }


            }

        }
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
    // InternalRailSL.g:797:1: rule__SetTrackStatement__Group__3 : rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 ;
    public final void rule__SetTrackStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:801:1: ( rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 )
            // InternalRailSL.g:802:2: rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:809:1: rule__SetTrackStatement__Group__3__Impl : ( ( rule__SetTrackStatement__ModeAssignment_3 ) ) ;
    public final void rule__SetTrackStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:813:1: ( ( ( rule__SetTrackStatement__ModeAssignment_3 ) ) )
            // InternalRailSL.g:814:1: ( ( rule__SetTrackStatement__ModeAssignment_3 ) )
            {
            // InternalRailSL.g:814:1: ( ( rule__SetTrackStatement__ModeAssignment_3 ) )
            // InternalRailSL.g:815:2: ( rule__SetTrackStatement__ModeAssignment_3 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeAssignment_3()); 
            // InternalRailSL.g:816:2: ( rule__SetTrackStatement__ModeAssignment_3 )
            // InternalRailSL.g:816:3: rule__SetTrackStatement__ModeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__ModeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getModeAssignment_3()); 

            }


            }

        }
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
    // InternalRailSL.g:824:1: rule__SetTrackStatement__Group__4 : rule__SetTrackStatement__Group__4__Impl ;
    public final void rule__SetTrackStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:828:1: ( rule__SetTrackStatement__Group__4__Impl )
            // InternalRailSL.g:829:2: rule__SetTrackStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__4__Impl();

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
    // InternalRailSL.g:835:1: rule__SetTrackStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__SetTrackStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:839:1: ( ( '.' ) )
            // InternalRailSL.g:840:1: ( '.' )
            {
            // InternalRailSL.g:840:1: ( '.' )
            // InternalRailSL.g:841:2: '.'
            {
             before(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TrackSetting__Group_0__0"
    // InternalRailSL.g:851:1: rule__TrackSetting__Group_0__0 : rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 ;
    public final void rule__TrackSetting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:855:1: ( rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 )
            // InternalRailSL.g:856:2: rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1
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
    // InternalRailSL.g:863:1: rule__TrackSetting__Group_0__0__Impl : ( ( 'reverse' )? ) ;
    public final void rule__TrackSetting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:867:1: ( ( ( 'reverse' )? ) )
            // InternalRailSL.g:868:1: ( ( 'reverse' )? )
            {
            // InternalRailSL.g:868:1: ( ( 'reverse' )? )
            // InternalRailSL.g:869:2: ( 'reverse' )?
            {
             before(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_0()); 
            // InternalRailSL.g:870:2: ( 'reverse' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:870:3: 'reverse'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_0()); 

            }


            }

        }
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
    // InternalRailSL.g:878:1: rule__TrackSetting__Group_0__1 : rule__TrackSetting__Group_0__1__Impl ;
    public final void rule__TrackSetting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:882:1: ( rule__TrackSetting__Group_0__1__Impl )
            // InternalRailSL.g:883:2: rule__TrackSetting__Group_0__1__Impl
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
    // InternalRailSL.g:889:1: rule__TrackSetting__Group_0__1__Impl : ( ( rule__TrackSetting__Alternatives_0_1 ) ) ;
    public final void rule__TrackSetting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:893:1: ( ( ( rule__TrackSetting__Alternatives_0_1 ) ) )
            // InternalRailSL.g:894:1: ( ( rule__TrackSetting__Alternatives_0_1 ) )
            {
            // InternalRailSL.g:894:1: ( ( rule__TrackSetting__Alternatives_0_1 ) )
            // InternalRailSL.g:895:2: ( rule__TrackSetting__Alternatives_0_1 )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives_0_1()); 
            // InternalRailSL.g:896:2: ( rule__TrackSetting__Alternatives_0_1 )
            // InternalRailSL.g:896:3: rule__TrackSetting__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TrackSetting__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackSettingAccess().getAlternatives_0_1()); 

            }


            }

        }
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
    // InternalRailSL.g:905:1: rule__SetPointStatement__Group__0 : rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 ;
    public final void rule__SetPointStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:909:1: ( rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 )
            // InternalRailSL.g:910:2: rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1
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
    // InternalRailSL.g:917:1: rule__SetPointStatement__Group__0__Impl : ( 'Set point' ) ;
    public final void rule__SetPointStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:921:1: ( ( 'Set point' ) )
            // InternalRailSL.g:922:1: ( 'Set point' )
            {
            // InternalRailSL.g:922:1: ( 'Set point' )
            // InternalRailSL.g:923:2: 'Set point'
            {
             before(grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRailSL.g:932:1: rule__SetPointStatement__Group__1 : rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 ;
    public final void rule__SetPointStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:936:1: ( rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 )
            // InternalRailSL.g:937:2: rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2
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
    // InternalRailSL.g:944:1: rule__SetPointStatement__Group__1__Impl : ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ( ( rule__SetPointStatement__PointsAssignment_1 )* ) ) ;
    public final void rule__SetPointStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:948:1: ( ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ( ( rule__SetPointStatement__PointsAssignment_1 )* ) ) )
            // InternalRailSL.g:949:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ( ( rule__SetPointStatement__PointsAssignment_1 )* ) )
            {
            // InternalRailSL.g:949:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ( ( rule__SetPointStatement__PointsAssignment_1 )* ) )
            // InternalRailSL.g:950:2: ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ( ( rule__SetPointStatement__PointsAssignment_1 )* )
            {
            // InternalRailSL.g:950:2: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            // InternalRailSL.g:951:3: ( rule__SetPointStatement__PointsAssignment_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:952:3: ( rule__SetPointStatement__PointsAssignment_1 )
            // InternalRailSL.g:952:4: rule__SetPointStatement__PointsAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__SetPointStatement__PointsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 

            }

            // InternalRailSL.g:955:2: ( ( rule__SetPointStatement__PointsAssignment_1 )* )
            // InternalRailSL.g:956:3: ( rule__SetPointStatement__PointsAssignment_1 )*
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:957:3: ( rule__SetPointStatement__PointsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRailSL.g:957:4: rule__SetPointStatement__PointsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SetPointStatement__PointsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 

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
    // $ANTLR end "rule__SetPointStatement__Group__1__Impl"


    // $ANTLR start "rule__SetPointStatement__Group__2"
    // InternalRailSL.g:966:1: rule__SetPointStatement__Group__2 : rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 ;
    public final void rule__SetPointStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:970:1: ( rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 )
            // InternalRailSL.g:971:2: rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRailSL.g:978:1: rule__SetPointStatement__Group__2__Impl : ( 'to' ) ;
    public final void rule__SetPointStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:982:1: ( ( 'to' ) )
            // InternalRailSL.g:983:1: ( 'to' )
            {
            // InternalRailSL.g:983:1: ( 'to' )
            // InternalRailSL.g:984:2: 'to'
            {
             before(grammarAccess.getSetPointStatementAccess().getToKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getToKeyword_2()); 

            }


            }

        }
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
    // InternalRailSL.g:993:1: rule__SetPointStatement__Group__3 : rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 ;
    public final void rule__SetPointStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:997:1: ( rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 )
            // InternalRailSL.g:998:2: rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1005:1: rule__SetPointStatement__Group__3__Impl : ( ( rule__SetPointStatement__OrientationAssignment_3 ) ) ;
    public final void rule__SetPointStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1009:1: ( ( ( rule__SetPointStatement__OrientationAssignment_3 ) ) )
            // InternalRailSL.g:1010:1: ( ( rule__SetPointStatement__OrientationAssignment_3 ) )
            {
            // InternalRailSL.g:1010:1: ( ( rule__SetPointStatement__OrientationAssignment_3 ) )
            // InternalRailSL.g:1011:2: ( rule__SetPointStatement__OrientationAssignment_3 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_3()); 
            // InternalRailSL.g:1012:2: ( rule__SetPointStatement__OrientationAssignment_3 )
            // InternalRailSL.g:1012:3: rule__SetPointStatement__OrientationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_3()); 

            }


            }

        }
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
    // InternalRailSL.g:1020:1: rule__SetPointStatement__Group__4 : rule__SetPointStatement__Group__4__Impl ;
    public final void rule__SetPointStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1024:1: ( rule__SetPointStatement__Group__4__Impl )
            // InternalRailSL.g:1025:2: rule__SetPointStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__4__Impl();

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
    // InternalRailSL.g:1031:1: rule__SetPointStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__SetPointStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1035:1: ( ( '.' ) )
            // InternalRailSL.g:1036:1: ( '.' )
            {
            // InternalRailSL.g:1036:1: ( '.' )
            // InternalRailSL.g:1037:2: '.'
            {
             before(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TimeWaitStatement__Group__0"
    // InternalRailSL.g:1047:1: rule__TimeWaitStatement__Group__0 : rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 ;
    public final void rule__TimeWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1051:1: ( rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 )
            // InternalRailSL.g:1052:2: rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1
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
    // InternalRailSL.g:1059:1: rule__TimeWaitStatement__Group__0__Impl : ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) ;
    public final void rule__TimeWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1063:1: ( ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) )
            // InternalRailSL.g:1064:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            {
            // InternalRailSL.g:1064:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            // InternalRailSL.g:1065:2: ( ( 'Wait for' ) ) ( ( 'Wait for' )* )
            {
            // InternalRailSL.g:1065:2: ( ( 'Wait for' ) )
            // InternalRailSL.g:1066:3: ( 'Wait for' )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1067:3: ( 'Wait for' )
            // InternalRailSL.g:1067:4: 'Wait for'
            {
            match(input,32,FOLLOW_16); 

            }

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

            }

            // InternalRailSL.g:1070:2: ( ( 'Wait for' )* )
            // InternalRailSL.g:1071:3: ( 'Wait for' )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1072:3: ( 'Wait for' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRailSL.g:1072:4: 'Wait for'
            	    {
            	    match(input,32,FOLLOW_16); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRailSL.g:1081:1: rule__TimeWaitStatement__Group__1 : rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 ;
    public final void rule__TimeWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1085:1: ( rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 )
            // InternalRailSL.g:1086:2: rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalRailSL.g:1093:1: rule__TimeWaitStatement__Group__1__Impl : ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) ;
    public final void rule__TimeWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1097:1: ( ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) )
            // InternalRailSL.g:1098:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            {
            // InternalRailSL.g:1098:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            // InternalRailSL.g:1099:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            {
            // InternalRailSL.g:1099:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) )
            // InternalRailSL.g:1100:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1101:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            // InternalRailSL.g:1101:4: rule__TimeWaitStatement__TimeAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__TimeWaitStatement__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

            }

            // InternalRailSL.g:1104:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            // InternalRailSL.g:1105:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1106:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:1106:4: rule__TimeWaitStatement__TimeAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TimeWaitStatement__TimeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRailSL.g:1115:1: rule__TimeWaitStatement__Group__2 : rule__TimeWaitStatement__Group__2__Impl ;
    public final void rule__TimeWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1119:1: ( rule__TimeWaitStatement__Group__2__Impl )
            // InternalRailSL.g:1120:2: rule__TimeWaitStatement__Group__2__Impl
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
    // InternalRailSL.g:1126:1: rule__TimeWaitStatement__Group__2__Impl : ( 'seconds.' ) ;
    public final void rule__TimeWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1130:1: ( ( 'seconds.' ) )
            // InternalRailSL.g:1131:1: ( 'seconds.' )
            {
            // InternalRailSL.g:1131:1: ( 'seconds.' )
            // InternalRailSL.g:1132:2: 'seconds.'
            {
             before(grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRailSL.g:1142:1: rule__ContactWaitStatement__Group__0 : rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 ;
    public final void rule__ContactWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1146:1: ( rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 )
            // InternalRailSL.g:1147:2: rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1
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
    // InternalRailSL.g:1154:1: rule__ContactWaitStatement__Group__0__Impl : ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) ;
    public final void rule__ContactWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1158:1: ( ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) )
            // InternalRailSL.g:1159:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            {
            // InternalRailSL.g:1159:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            // InternalRailSL.g:1160:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 
            // InternalRailSL.g:1161:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            // InternalRailSL.g:1161:3: rule__ContactWaitStatement__EventAssignment_0
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
    // InternalRailSL.g:1169:1: rule__ContactWaitStatement__Group__1 : rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 ;
    public final void rule__ContactWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1173:1: ( rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 )
            // InternalRailSL.g:1174:2: rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2
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
    // InternalRailSL.g:1181:1: rule__ContactWaitStatement__Group__1__Impl : ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) ;
    public final void rule__ContactWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1185:1: ( ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) )
            // InternalRailSL.g:1186:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            {
            // InternalRailSL.g:1186:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            // InternalRailSL.g:1187:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 
            // InternalRailSL.g:1188:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            // InternalRailSL.g:1188:3: rule__ContactWaitStatement__ContactIndexAssignment_1
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
    // InternalRailSL.g:1196:1: rule__ContactWaitStatement__Group__2 : rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 ;
    public final void rule__ContactWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1200:1: ( rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 )
            // InternalRailSL.g:1201:2: rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3
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
    // InternalRailSL.g:1208:1: rule__ContactWaitStatement__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ContactWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1212:1: ( ( 'contact of' ) )
            // InternalRailSL.g:1213:1: ( 'contact of' )
            {
            // InternalRailSL.g:1213:1: ( 'contact of' )
            // InternalRailSL.g:1214:2: 'contact of'
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRailSL.g:1223:1: rule__ContactWaitStatement__Group__3 : rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 ;
    public final void rule__ContactWaitStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1227:1: ( rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 )
            // InternalRailSL.g:1228:2: rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4
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
    // InternalRailSL.g:1235:1: rule__ContactWaitStatement__Group__3__Impl : ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) ;
    public final void rule__ContactWaitStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1239:1: ( ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:1240:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:1240:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            // InternalRailSL.g:1241:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:1242:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            // InternalRailSL.g:1242:3: rule__ContactWaitStatement__SegNameAssignment_3
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
    // InternalRailSL.g:1250:1: rule__ContactWaitStatement__Group__4 : rule__ContactWaitStatement__Group__4__Impl ;
    public final void rule__ContactWaitStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1254:1: ( rule__ContactWaitStatement__Group__4__Impl )
            // InternalRailSL.g:1255:2: rule__ContactWaitStatement__Group__4__Impl
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
    // InternalRailSL.g:1261:1: rule__ContactWaitStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__ContactWaitStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1265:1: ( ( '.' ) )
            // InternalRailSL.g:1266:1: ( '.' )
            {
            // InternalRailSL.g:1266:1: ( '.' )
            // InternalRailSL.g:1267:2: '.'
            {
             before(grammarAccess.getContactWaitStatementAccess().getFullStopKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRailSL.g:1277:1: rule__CrossingStatement__Group__0 : rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 ;
    public final void rule__CrossingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1281:1: ( rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 )
            // InternalRailSL.g:1282:2: rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1
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
    // InternalRailSL.g:1289:1: rule__CrossingStatement__Group__0__Impl : ( ( rule__CrossingStatement__Alternatives_0 ) ) ;
    public final void rule__CrossingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1293:1: ( ( ( rule__CrossingStatement__Alternatives_0 ) ) )
            // InternalRailSL.g:1294:1: ( ( rule__CrossingStatement__Alternatives_0 ) )
            {
            // InternalRailSL.g:1294:1: ( ( rule__CrossingStatement__Alternatives_0 ) )
            // InternalRailSL.g:1295:2: ( rule__CrossingStatement__Alternatives_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getAlternatives_0()); 
            // InternalRailSL.g:1296:2: ( rule__CrossingStatement__Alternatives_0 )
            // InternalRailSL.g:1296:3: rule__CrossingStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CrossingStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCrossingStatementAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalRailSL.g:1304:1: rule__CrossingStatement__Group__1 : rule__CrossingStatement__Group__1__Impl ;
    public final void rule__CrossingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1308:1: ( rule__CrossingStatement__Group__1__Impl )
            // InternalRailSL.g:1309:2: rule__CrossingStatement__Group__1__Impl
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
    // InternalRailSL.g:1315:1: rule__CrossingStatement__Group__1__Impl : ( 'crossing.' ) ;
    public final void rule__CrossingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1319:1: ( ( 'crossing.' ) )
            // InternalRailSL.g:1320:1: ( 'crossing.' )
            {
            // InternalRailSL.g:1320:1: ( 'crossing.' )
            // InternalRailSL.g:1321:2: 'crossing.'
            {
             before(grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRailSL.g:1331:1: rule__LightStatement__Group__0 : rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 ;
    public final void rule__LightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1335:1: ( rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 )
            // InternalRailSL.g:1336:2: rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1
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
    // InternalRailSL.g:1343:1: rule__LightStatement__Group__0__Impl : ( 'Turn light' ) ;
    public final void rule__LightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1347:1: ( ( 'Turn light' ) )
            // InternalRailSL.g:1348:1: ( 'Turn light' )
            {
            // InternalRailSL.g:1348:1: ( 'Turn light' )
            // InternalRailSL.g:1349:2: 'Turn light'
            {
             before(grammarAccess.getLightStatementAccess().getTurnLightKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRailSL.g:1358:1: rule__LightStatement__Group__1 : rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 ;
    public final void rule__LightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1362:1: ( rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 )
            // InternalRailSL.g:1363:2: rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2
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
    // InternalRailSL.g:1370:1: rule__LightStatement__Group__1__Impl : ( ( ( rule__LightStatement__LightsAssignment_1 ) ) ( ( rule__LightStatement__LightsAssignment_1 )* ) ) ;
    public final void rule__LightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1374:1: ( ( ( ( rule__LightStatement__LightsAssignment_1 ) ) ( ( rule__LightStatement__LightsAssignment_1 )* ) ) )
            // InternalRailSL.g:1375:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) ( ( rule__LightStatement__LightsAssignment_1 )* ) )
            {
            // InternalRailSL.g:1375:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) ( ( rule__LightStatement__LightsAssignment_1 )* ) )
            // InternalRailSL.g:1376:2: ( ( rule__LightStatement__LightsAssignment_1 ) ) ( ( rule__LightStatement__LightsAssignment_1 )* )
            {
            // InternalRailSL.g:1376:2: ( ( rule__LightStatement__LightsAssignment_1 ) )
            // InternalRailSL.g:1377:3: ( rule__LightStatement__LightsAssignment_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:1378:3: ( rule__LightStatement__LightsAssignment_1 )
            // InternalRailSL.g:1378:4: rule__LightStatement__LightsAssignment_1
            {
            pushFollow(FOLLOW_14);
            rule__LightStatement__LightsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 

            }

            // InternalRailSL.g:1381:2: ( ( rule__LightStatement__LightsAssignment_1 )* )
            // InternalRailSL.g:1382:3: ( rule__LightStatement__LightsAssignment_1 )*
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:1383:3: ( rule__LightStatement__LightsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_INT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRailSL.g:1383:4: rule__LightStatement__LightsAssignment_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__LightStatement__LightsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 

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
    // $ANTLR end "rule__LightStatement__Group__1__Impl"


    // $ANTLR start "rule__LightStatement__Group__2"
    // InternalRailSL.g:1392:1: rule__LightStatement__Group__2 : rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 ;
    public final void rule__LightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1396:1: ( rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 )
            // InternalRailSL.g:1397:2: rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1404:1: rule__LightStatement__Group__2__Impl : ( ( rule__LightStatement__StateAssignment_2 ) ) ;
    public final void rule__LightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1408:1: ( ( ( rule__LightStatement__StateAssignment_2 ) ) )
            // InternalRailSL.g:1409:1: ( ( rule__LightStatement__StateAssignment_2 ) )
            {
            // InternalRailSL.g:1409:1: ( ( rule__LightStatement__StateAssignment_2 ) )
            // InternalRailSL.g:1410:2: ( rule__LightStatement__StateAssignment_2 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAssignment_2()); 
            // InternalRailSL.g:1411:2: ( rule__LightStatement__StateAssignment_2 )
            // InternalRailSL.g:1411:3: rule__LightStatement__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAssignment_2()); 

            }


            }

        }
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
    // InternalRailSL.g:1419:1: rule__LightStatement__Group__3 : rule__LightStatement__Group__3__Impl ;
    public final void rule__LightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1423:1: ( rule__LightStatement__Group__3__Impl )
            // InternalRailSL.g:1424:2: rule__LightStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__3__Impl();

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
    // InternalRailSL.g:1430:1: rule__LightStatement__Group__3__Impl : ( '.' ) ;
    public final void rule__LightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1434:1: ( ( '.' ) )
            // InternalRailSL.g:1435:1: ( '.' )
            {
            // InternalRailSL.g:1435:1: ( '.' )
            // InternalRailSL.g:1436:2: '.'
            {
             before(grammarAccess.getLightStatementAccess().getFullStopKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getFullStopKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__BlocksAssignment"
    // InternalRailSL.g:1446:1: rule__Program__BlocksAssignment : ( ruleBlock ) ;
    public final void rule__Program__BlocksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1450:1: ( ( ruleBlock ) )
            // InternalRailSL.g:1451:2: ( ruleBlock )
            {
            // InternalRailSL.g:1451:2: ( ruleBlock )
            // InternalRailSL.g:1452:3: ruleBlock
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
    // InternalRailSL.g:1461:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1465:1: ( ( ruleStatement ) )
            // InternalRailSL.g:1466:2: ( ruleStatement )
            {
            // InternalRailSL.g:1466:2: ( ruleStatement )
            // InternalRailSL.g:1467:3: ruleStatement
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
    // InternalRailSL.g:1476:1: rule__Block__EndAssignment_2 : ( RULE_BLOCK_END ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1480:1: ( ( RULE_BLOCK_END ) )
            // InternalRailSL.g:1481:2: ( RULE_BLOCK_END )
            {
            // InternalRailSL.g:1481:2: ( RULE_BLOCK_END )
            // InternalRailSL.g:1482:3: RULE_BLOCK_END
            {
             before(grammarAccess.getBlockAccess().getEndBLOCK_ENDTerminalRuleCall_2_0()); 
            match(input,RULE_BLOCK_END,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getEndBLOCK_ENDTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalRailSL.g:1491:1: rule__SetTrackStatement__SegmentsAssignment_1 : ( RULE_SEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1495:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:1496:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:1496:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:1497:3: RULE_SEG_NAME
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


    // $ANTLR start "rule__SetTrackStatement__ModeAssignment_3"
    // InternalRailSL.g:1506:1: rule__SetTrackStatement__ModeAssignment_3 : ( ruleTrackSetting ) ;
    public final void rule__SetTrackStatement__ModeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1510:1: ( ( ruleTrackSetting ) )
            // InternalRailSL.g:1511:2: ( ruleTrackSetting )
            {
            // InternalRailSL.g:1511:2: ( ruleTrackSetting )
            // InternalRailSL.g:1512:3: ruleTrackSetting
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTrackSetting();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__ModeAssignment_3"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_1"
    // InternalRailSL.g:1521:1: rule__SetPointStatement__PointsAssignment_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1525:1: ( ( RULE_INT ) )
            // InternalRailSL.g:1526:2: ( RULE_INT )
            {
            // InternalRailSL.g:1526:2: ( RULE_INT )
            // InternalRailSL.g:1527:3: RULE_INT
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


    // $ANTLR start "rule__SetPointStatement__OrientationAssignment_3"
    // InternalRailSL.g:1536:1: rule__SetPointStatement__OrientationAssignment_3 : ( ( rule__SetPointStatement__OrientationAlternatives_3_0 ) ) ;
    public final void rule__SetPointStatement__OrientationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1540:1: ( ( ( rule__SetPointStatement__OrientationAlternatives_3_0 ) ) )
            // InternalRailSL.g:1541:2: ( ( rule__SetPointStatement__OrientationAlternatives_3_0 ) )
            {
            // InternalRailSL.g:1541:2: ( ( rule__SetPointStatement__OrientationAlternatives_3_0 ) )
            // InternalRailSL.g:1542:3: ( rule__SetPointStatement__OrientationAlternatives_3_0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_3_0()); 
            // InternalRailSL.g:1543:3: ( rule__SetPointStatement__OrientationAlternatives_3_0 )
            // InternalRailSL.g:1543:4: rule__SetPointStatement__OrientationAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__OrientationAssignment_3"


    // $ANTLR start "rule__TimeWaitStatement__TimeAssignment_1"
    // InternalRailSL.g:1551:1: rule__TimeWaitStatement__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__TimeWaitStatement__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1555:1: ( ( RULE_INT ) )
            // InternalRailSL.g:1556:2: ( RULE_INT )
            {
            // InternalRailSL.g:1556:2: ( RULE_INT )
            // InternalRailSL.g:1557:3: RULE_INT
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
    // InternalRailSL.g:1566:1: rule__ContactWaitStatement__EventAssignment_0 : ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) ;
    public final void rule__ContactWaitStatement__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1570:1: ( ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) )
            // InternalRailSL.g:1571:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            {
            // InternalRailSL.g:1571:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            // InternalRailSL.g:1572:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 
            // InternalRailSL.g:1573:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            // InternalRailSL.g:1573:4: rule__ContactWaitStatement__EventAlternatives_0_0
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
    // InternalRailSL.g:1581:1: rule__ContactWaitStatement__ContactIndexAssignment_1 : ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) ) ;
    public final void rule__ContactWaitStatement__ContactIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1585:1: ( ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) ) )
            // InternalRailSL.g:1586:2: ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) )
            {
            // InternalRailSL.g:1586:2: ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) )
            // InternalRailSL.g:1587:3: ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAlternatives_1_0()); 
            // InternalRailSL.g:1588:3: ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 )
            // InternalRailSL.g:1588:4: rule__ContactWaitStatement__ContactIndexAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ContactWaitStatement__ContactIndexAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContactWaitStatementAccess().getContactIndexAlternatives_1_0()); 

            }


            }

        }
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
    // InternalRailSL.g:1596:1: rule__ContactWaitStatement__SegNameAssignment_3 : ( RULE_SEG_NAME ) ;
    public final void rule__ContactWaitStatement__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1600:1: ( ( RULE_SEG_NAME ) )
            // InternalRailSL.g:1601:2: ( RULE_SEG_NAME )
            {
            // InternalRailSL.g:1601:2: ( RULE_SEG_NAME )
            // InternalRailSL.g:1602:3: RULE_SEG_NAME
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


    // $ANTLR start "rule__LightStatement__LightsAssignment_1"
    // InternalRailSL.g:1611:1: rule__LightStatement__LightsAssignment_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1615:1: ( ( RULE_INT ) )
            // InternalRailSL.g:1616:2: ( RULE_INT )
            {
            // InternalRailSL.g:1616:2: ( RULE_INT )
            // InternalRailSL.g:1617:3: RULE_INT
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


    // $ANTLR start "rule__LightStatement__StateAssignment_2"
    // InternalRailSL.g:1626:1: rule__LightStatement__StateAssignment_2 : ( ( rule__LightStatement__StateAlternatives_2_0 ) ) ;
    public final void rule__LightStatement__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1630:1: ( ( ( rule__LightStatement__StateAlternatives_2_0 ) ) )
            // InternalRailSL.g:1631:2: ( ( rule__LightStatement__StateAlternatives_2_0 ) )
            {
            // InternalRailSL.g:1631:2: ( ( rule__LightStatement__StateAlternatives_2_0 ) )
            // InternalRailSL.g:1632:3: ( rule__LightStatement__StateAlternatives_2_0 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAlternatives_2_0()); 
            // InternalRailSL.g:1633:3: ( rule__LightStatement__StateAlternatives_2_0 )
            // InternalRailSL.g:1633:4: rule__LightStatement__StateAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__StateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001188CC0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001188CC0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000004000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000004000C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});

}