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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End.'", "'Loop.'", "'stop'", "'go'", "'slow'", "'straight'", "'branch'", "'Reach'", "'Pass'", "'first'", "'second'", "'Open'", "'Close'", "'on'", "'off'", "'KH_ST_0'", "'KH_ST_1'", "'KH_ST_2'", "'KH_ST_3'", "'KH_ST_4'", "'KH_ST_5'", "'KH_ST_6'", "'KH_LN_0'", "'KH_LN_1'", "'KH_LN_2'", "'KH_LN_3'", "'KH_LN_4'", "'KH_LN_5'", "'KH_LN_6'", "'KH_LN_7'", "'KH_LN_8'", "'KIO_LN_0'", "'KIO_LN_1'", "'OC_ST_0'", "'OC_ST_1'", "'OC_ST_2'", "'OC_ST_3'", "'OC_ST_4'", "'OC_LN_0'", "'OC_LN_1'", "'OC_LN_2'", "'OC_LN_3'", "'OC_LN_4'", "'OC_LN_5'", "'IC_ST_0'", "'IC_ST_1'", "'IC_ST_2'", "'IC_ST_3'", "'IC_ST_4'", "'IC_LN_0'", "'IC_LN_1'", "'IC_LN_2'", "'IC_LN_3'", "'IC_LN_4'", "'IC_LN_5'", "'OC_JCT_0'", "'IC_JCT_0'", "'OI_LN_0'", "'OI_LN_1'", "'OI_LN_2'", "'IO_LN_0'", "'IO_LN_1'", "'IO_LN_2'", "'Start:'", "'Set track'", "'to'", "'.'", "','", "'reverse'", "'Set point'", "'Wait for'", "'seconds.'", "'contact of'", "'crossing.'", "'Turn light'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
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

                if ( (LA1_0==74) ) {
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


    // $ANTLR start "entryRuleSEG_NAME"
    // InternalRailSL.g:403:1: entryRuleSEG_NAME : ruleSEG_NAME EOF ;
    public final void entryRuleSEG_NAME() throws RecognitionException {
        try {
            // InternalRailSL.g:404:1: ( ruleSEG_NAME EOF )
            // InternalRailSL.g:405:1: ruleSEG_NAME EOF
            {
             before(grammarAccess.getSEG_NAMERule()); 
            pushFollow(FOLLOW_1);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getSEG_NAMERule()); 
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
    // $ANTLR end "entryRuleSEG_NAME"


    // $ANTLR start "ruleSEG_NAME"
    // InternalRailSL.g:412:1: ruleSEG_NAME : ( ( rule__SEG_NAME__Alternatives ) ) ;
    public final void ruleSEG_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:416:2: ( ( ( rule__SEG_NAME__Alternatives ) ) )
            // InternalRailSL.g:417:2: ( ( rule__SEG_NAME__Alternatives ) )
            {
            // InternalRailSL.g:417:2: ( ( rule__SEG_NAME__Alternatives ) )
            // InternalRailSL.g:418:3: ( rule__SEG_NAME__Alternatives )
            {
             before(grammarAccess.getSEG_NAMEAccess().getAlternatives()); 
            // InternalRailSL.g:419:3: ( rule__SEG_NAME__Alternatives )
            // InternalRailSL.g:419:4: rule__SEG_NAME__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SEG_NAME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSEG_NAMEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEG_NAME"


    // $ANTLR start "rule__BLOCK_END__Alternatives"
    // InternalRailSL.g:427:1: rule__BLOCK_END__Alternatives : ( ( 'End.' ) | ( 'Loop.' ) );
    public final void rule__BLOCK_END__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:431:1: ( ( 'End.' ) | ( 'Loop.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRailSL.g:432:2: ( 'End.' )
                    {
                    // InternalRailSL.g:432:2: ( 'End.' )
                    // InternalRailSL.g:433:3: 'End.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:438:2: ( 'Loop.' )
                    {
                    // InternalRailSL.g:438:2: ( 'Loop.' )
                    // InternalRailSL.g:439:3: 'Loop.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getLoopKeyword_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalRailSL.g:448:1: rule__Statement__Alternatives : ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:452:1: ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 75:
            case 80:
                {
                alt3=1;
                }
                break;
            case 18:
            case 19:
            case 81:
                {
                alt3=2;
                }
                break;
            case 22:
            case 23:
            case 85:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:453:2: ( ruleSetStatement )
                    {
                    // InternalRailSL.g:453:2: ( ruleSetStatement )
                    // InternalRailSL.g:454:3: ruleSetStatement
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
                    // InternalRailSL.g:459:2: ( ruleWaitStatement )
                    {
                    // InternalRailSL.g:459:2: ( ruleWaitStatement )
                    // InternalRailSL.g:460:3: ruleWaitStatement
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
                    // InternalRailSL.g:465:2: ( ruleOpStatement )
                    {
                    // InternalRailSL.g:465:2: ( ruleOpStatement )
                    // InternalRailSL.g:466:3: ruleOpStatement
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
    // InternalRailSL.g:475:1: rule__SetStatement__Alternatives : ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) );
    public final void rule__SetStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:479:1: ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==75) ) {
                alt4=1;
            }
            else if ( (LA4_0==80) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:480:2: ( ruleSetTrackStatement )
                    {
                    // InternalRailSL.g:480:2: ( ruleSetTrackStatement )
                    // InternalRailSL.g:481:3: ruleSetTrackStatement
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
                    // InternalRailSL.g:486:2: ( ruleSetPointStatement )
                    {
                    // InternalRailSL.g:486:2: ( ruleSetPointStatement )
                    // InternalRailSL.g:487:3: ruleSetPointStatement
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
    // InternalRailSL.g:496:1: rule__TrackSetting__Alternatives : ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) );
    public final void rule__TrackSetting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:500:1: ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=15)||LA5_0==79) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:501:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    {
                    // InternalRailSL.g:501:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    // InternalRailSL.g:502:3: ( rule__TrackSetting__Group_0__0 )
                    {
                     before(grammarAccess.getTrackSettingAccess().getGroup_0()); 
                    // InternalRailSL.g:503:3: ( rule__TrackSetting__Group_0__0 )
                    // InternalRailSL.g:503:4: rule__TrackSetting__Group_0__0
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
                    // InternalRailSL.g:507:2: ( 'stop' )
                    {
                    // InternalRailSL.g:507:2: ( 'stop' )
                    // InternalRailSL.g:508:3: 'stop'
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
    // InternalRailSL.g:517:1: rule__TrackSetting__Alternatives_0_1 : ( ( 'go' ) | ( 'slow' ) );
    public final void rule__TrackSetting__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:521:1: ( ( 'go' ) | ( 'slow' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:522:2: ( 'go' )
                    {
                    // InternalRailSL.g:522:2: ( 'go' )
                    // InternalRailSL.g:523:3: 'go'
                    {
                     before(grammarAccess.getTrackSettingAccess().getGoKeyword_0_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getGoKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:528:2: ( 'slow' )
                    {
                    // InternalRailSL.g:528:2: ( 'slow' )
                    // InternalRailSL.g:529:3: 'slow'
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


    // $ANTLR start "rule__SetPointStatement__OrientationAlternatives_4_0"
    // InternalRailSL.g:538:1: rule__SetPointStatement__OrientationAlternatives_4_0 : ( ( 'straight' ) | ( 'branch' ) );
    public final void rule__SetPointStatement__OrientationAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:542:1: ( ( 'straight' ) | ( 'branch' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:543:2: ( 'straight' )
                    {
                    // InternalRailSL.g:543:2: ( 'straight' )
                    // InternalRailSL.g:544:3: 'straight'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:549:2: ( 'branch' )
                    {
                    // InternalRailSL.g:549:2: ( 'branch' )
                    // InternalRailSL.g:550:3: 'branch'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_4_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_4_0_1()); 

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
    // $ANTLR end "rule__SetPointStatement__OrientationAlternatives_4_0"


    // $ANTLR start "rule__WaitStatement__Alternatives"
    // InternalRailSL.g:559:1: rule__WaitStatement__Alternatives : ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) );
    public final void rule__WaitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:563:1: ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==81) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:564:2: ( ruleTimeWaitStatement )
                    {
                    // InternalRailSL.g:564:2: ( ruleTimeWaitStatement )
                    // InternalRailSL.g:565:3: ruleTimeWaitStatement
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
                    // InternalRailSL.g:570:2: ( ruleContactWaitStatement )
                    {
                    // InternalRailSL.g:570:2: ( ruleContactWaitStatement )
                    // InternalRailSL.g:571:3: ruleContactWaitStatement
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
    // InternalRailSL.g:580:1: rule__ContactWaitStatement__EventAlternatives_0_0 : ( ( 'Reach' ) | ( 'Pass' ) );
    public final void rule__ContactWaitStatement__EventAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:584:1: ( ( 'Reach' ) | ( 'Pass' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:585:2: ( 'Reach' )
                    {
                    // InternalRailSL.g:585:2: ( 'Reach' )
                    // InternalRailSL.g:586:3: 'Reach'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:591:2: ( 'Pass' )
                    {
                    // InternalRailSL.g:591:2: ( 'Pass' )
                    // InternalRailSL.g:592:3: 'Pass'
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
    // InternalRailSL.g:601:1: rule__ContactWaitStatement__ContactIndexAlternatives_1_0 : ( ( 'first' ) | ( 'second' ) );
    public final void rule__ContactWaitStatement__ContactIndexAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:605:1: ( ( 'first' ) | ( 'second' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:606:2: ( 'first' )
                    {
                    // InternalRailSL.g:606:2: ( 'first' )
                    // InternalRailSL.g:607:3: 'first'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getContactIndexFirstKeyword_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getContactIndexFirstKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:612:2: ( 'second' )
                    {
                    // InternalRailSL.g:612:2: ( 'second' )
                    // InternalRailSL.g:613:3: 'second'
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
    // InternalRailSL.g:622:1: rule__OpStatement__Alternatives : ( ( ruleCrossingStatement ) | ( ruleLightStatement ) );
    public final void rule__OpStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:626:1: ( ( ruleCrossingStatement ) | ( ruleLightStatement ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                alt11=1;
            }
            else if ( (LA11_0==85) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:627:2: ( ruleCrossingStatement )
                    {
                    // InternalRailSL.g:627:2: ( ruleCrossingStatement )
                    // InternalRailSL.g:628:3: ruleCrossingStatement
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
                    // InternalRailSL.g:633:2: ( ruleLightStatement )
                    {
                    // InternalRailSL.g:633:2: ( ruleLightStatement )
                    // InternalRailSL.g:634:3: ruleLightStatement
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
    // InternalRailSL.g:643:1: rule__CrossingStatement__ModeAlternatives_0_0 : ( ( 'Open' ) | ( 'Close' ) );
    public final void rule__CrossingStatement__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:647:1: ( ( 'Open' ) | ( 'Close' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:648:2: ( 'Open' )
                    {
                    // InternalRailSL.g:648:2: ( 'Open' )
                    // InternalRailSL.g:649:3: 'Open'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:654:2: ( 'Close' )
                    {
                    // InternalRailSL.g:654:2: ( 'Close' )
                    // InternalRailSL.g:655:3: 'Close'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeCloseKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__LightStatement__StateAlternatives_3_0"
    // InternalRailSL.g:664:1: rule__LightStatement__StateAlternatives_3_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__LightStatement__StateAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:668:1: ( ( 'on' ) | ( 'off' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRailSL.g:669:2: ( 'on' )
                    {
                    // InternalRailSL.g:669:2: ( 'on' )
                    // InternalRailSL.g:670:3: 'on'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOnKeyword_3_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOnKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:675:2: ( 'off' )
                    {
                    // InternalRailSL.g:675:2: ( 'off' )
                    // InternalRailSL.g:676:3: 'off'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOffKeyword_3_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOffKeyword_3_0_1()); 

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
    // $ANTLR end "rule__LightStatement__StateAlternatives_3_0"


    // $ANTLR start "rule__SEG_NAME__Alternatives"
    // InternalRailSL.g:685:1: rule__SEG_NAME__Alternatives : ( ( 'KH_ST_0' ) | ( 'KH_ST_1' ) | ( 'KH_ST_2' ) | ( 'KH_ST_3' ) | ( 'KH_ST_4' ) | ( 'KH_ST_5' ) | ( 'KH_ST_6' ) | ( 'KH_LN_0' ) | ( 'KH_LN_1' ) | ( 'KH_LN_2' ) | ( 'KH_LN_3' ) | ( 'KH_LN_4' ) | ( 'KH_LN_5' ) | ( 'KH_LN_6' ) | ( 'KH_LN_7' ) | ( 'KH_LN_8' ) | ( 'KIO_LN_0' ) | ( 'KIO_LN_1' ) | ( 'OC_ST_0' ) | ( 'OC_ST_1' ) | ( 'OC_ST_2' ) | ( 'OC_ST_3' ) | ( 'OC_ST_4' ) | ( 'OC_LN_0' ) | ( 'OC_LN_1' ) | ( 'OC_LN_2' ) | ( 'OC_LN_3' ) | ( 'OC_LN_4' ) | ( 'OC_LN_5' ) | ( 'IC_ST_0' ) | ( 'IC_ST_1' ) | ( 'IC_ST_2' ) | ( 'IC_ST_3' ) | ( 'IC_ST_4' ) | ( 'IC_LN_0' ) | ( 'IC_LN_1' ) | ( 'IC_LN_2' ) | ( 'IC_LN_3' ) | ( 'IC_LN_4' ) | ( 'IC_LN_5' ) | ( 'OC_JCT_0' ) | ( 'IC_JCT_0' ) | ( 'OI_LN_0' ) | ( 'OI_LN_1' ) | ( 'OI_LN_2' ) | ( 'IO_LN_0' ) | ( 'IO_LN_1' ) | ( 'IO_LN_2' ) );
    public final void rule__SEG_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:689:1: ( ( 'KH_ST_0' ) | ( 'KH_ST_1' ) | ( 'KH_ST_2' ) | ( 'KH_ST_3' ) | ( 'KH_ST_4' ) | ( 'KH_ST_5' ) | ( 'KH_ST_6' ) | ( 'KH_LN_0' ) | ( 'KH_LN_1' ) | ( 'KH_LN_2' ) | ( 'KH_LN_3' ) | ( 'KH_LN_4' ) | ( 'KH_LN_5' ) | ( 'KH_LN_6' ) | ( 'KH_LN_7' ) | ( 'KH_LN_8' ) | ( 'KIO_LN_0' ) | ( 'KIO_LN_1' ) | ( 'OC_ST_0' ) | ( 'OC_ST_1' ) | ( 'OC_ST_2' ) | ( 'OC_ST_3' ) | ( 'OC_ST_4' ) | ( 'OC_LN_0' ) | ( 'OC_LN_1' ) | ( 'OC_LN_2' ) | ( 'OC_LN_3' ) | ( 'OC_LN_4' ) | ( 'OC_LN_5' ) | ( 'IC_ST_0' ) | ( 'IC_ST_1' ) | ( 'IC_ST_2' ) | ( 'IC_ST_3' ) | ( 'IC_ST_4' ) | ( 'IC_LN_0' ) | ( 'IC_LN_1' ) | ( 'IC_LN_2' ) | ( 'IC_LN_3' ) | ( 'IC_LN_4' ) | ( 'IC_LN_5' ) | ( 'OC_JCT_0' ) | ( 'IC_JCT_0' ) | ( 'OI_LN_0' ) | ( 'OI_LN_1' ) | ( 'OI_LN_2' ) | ( 'IO_LN_0' ) | ( 'IO_LN_1' ) | ( 'IO_LN_2' ) )
            int alt14=48;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 30:
                {
                alt14=5;
                }
                break;
            case 31:
                {
                alt14=6;
                }
                break;
            case 32:
                {
                alt14=7;
                }
                break;
            case 33:
                {
                alt14=8;
                }
                break;
            case 34:
                {
                alt14=9;
                }
                break;
            case 35:
                {
                alt14=10;
                }
                break;
            case 36:
                {
                alt14=11;
                }
                break;
            case 37:
                {
                alt14=12;
                }
                break;
            case 38:
                {
                alt14=13;
                }
                break;
            case 39:
                {
                alt14=14;
                }
                break;
            case 40:
                {
                alt14=15;
                }
                break;
            case 41:
                {
                alt14=16;
                }
                break;
            case 42:
                {
                alt14=17;
                }
                break;
            case 43:
                {
                alt14=18;
                }
                break;
            case 44:
                {
                alt14=19;
                }
                break;
            case 45:
                {
                alt14=20;
                }
                break;
            case 46:
                {
                alt14=21;
                }
                break;
            case 47:
                {
                alt14=22;
                }
                break;
            case 48:
                {
                alt14=23;
                }
                break;
            case 49:
                {
                alt14=24;
                }
                break;
            case 50:
                {
                alt14=25;
                }
                break;
            case 51:
                {
                alt14=26;
                }
                break;
            case 52:
                {
                alt14=27;
                }
                break;
            case 53:
                {
                alt14=28;
                }
                break;
            case 54:
                {
                alt14=29;
                }
                break;
            case 55:
                {
                alt14=30;
                }
                break;
            case 56:
                {
                alt14=31;
                }
                break;
            case 57:
                {
                alt14=32;
                }
                break;
            case 58:
                {
                alt14=33;
                }
                break;
            case 59:
                {
                alt14=34;
                }
                break;
            case 60:
                {
                alt14=35;
                }
                break;
            case 61:
                {
                alt14=36;
                }
                break;
            case 62:
                {
                alt14=37;
                }
                break;
            case 63:
                {
                alt14=38;
                }
                break;
            case 64:
                {
                alt14=39;
                }
                break;
            case 65:
                {
                alt14=40;
                }
                break;
            case 66:
                {
                alt14=41;
                }
                break;
            case 67:
                {
                alt14=42;
                }
                break;
            case 68:
                {
                alt14=43;
                }
                break;
            case 69:
                {
                alt14=44;
                }
                break;
            case 70:
                {
                alt14=45;
                }
                break;
            case 71:
                {
                alt14=46;
                }
                break;
            case 72:
                {
                alt14=47;
                }
                break;
            case 73:
                {
                alt14=48;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:690:2: ( 'KH_ST_0' )
                    {
                    // InternalRailSL.g:690:2: ( 'KH_ST_0' )
                    // InternalRailSL.g:691:3: 'KH_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_0Keyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_0Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:696:2: ( 'KH_ST_1' )
                    {
                    // InternalRailSL.g:696:2: ( 'KH_ST_1' )
                    // InternalRailSL.g:697:3: 'KH_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_1Keyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_1Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailSL.g:702:2: ( 'KH_ST_2' )
                    {
                    // InternalRailSL.g:702:2: ( 'KH_ST_2' )
                    // InternalRailSL.g:703:3: 'KH_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_2Keyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_2Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRailSL.g:708:2: ( 'KH_ST_3' )
                    {
                    // InternalRailSL.g:708:2: ( 'KH_ST_3' )
                    // InternalRailSL.g:709:3: 'KH_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_3Keyword_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_3Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRailSL.g:714:2: ( 'KH_ST_4' )
                    {
                    // InternalRailSL.g:714:2: ( 'KH_ST_4' )
                    // InternalRailSL.g:715:3: 'KH_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_4Keyword_4()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_4Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRailSL.g:720:2: ( 'KH_ST_5' )
                    {
                    // InternalRailSL.g:720:2: ( 'KH_ST_5' )
                    // InternalRailSL.g:721:3: 'KH_ST_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_5Keyword_5()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_5Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRailSL.g:726:2: ( 'KH_ST_6' )
                    {
                    // InternalRailSL.g:726:2: ( 'KH_ST_6' )
                    // InternalRailSL.g:727:3: 'KH_ST_6'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_6Keyword_6()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_6Keyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRailSL.g:732:2: ( 'KH_LN_0' )
                    {
                    // InternalRailSL.g:732:2: ( 'KH_LN_0' )
                    // InternalRailSL.g:733:3: 'KH_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_0Keyword_7()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_0Keyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRailSL.g:738:2: ( 'KH_LN_1' )
                    {
                    // InternalRailSL.g:738:2: ( 'KH_LN_1' )
                    // InternalRailSL.g:739:3: 'KH_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_1Keyword_8()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_1Keyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRailSL.g:744:2: ( 'KH_LN_2' )
                    {
                    // InternalRailSL.g:744:2: ( 'KH_LN_2' )
                    // InternalRailSL.g:745:3: 'KH_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_2Keyword_9()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_2Keyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRailSL.g:750:2: ( 'KH_LN_3' )
                    {
                    // InternalRailSL.g:750:2: ( 'KH_LN_3' )
                    // InternalRailSL.g:751:3: 'KH_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_3Keyword_10()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_3Keyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalRailSL.g:756:2: ( 'KH_LN_4' )
                    {
                    // InternalRailSL.g:756:2: ( 'KH_LN_4' )
                    // InternalRailSL.g:757:3: 'KH_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_4Keyword_11()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_4Keyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalRailSL.g:762:2: ( 'KH_LN_5' )
                    {
                    // InternalRailSL.g:762:2: ( 'KH_LN_5' )
                    // InternalRailSL.g:763:3: 'KH_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_5Keyword_12()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_5Keyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalRailSL.g:768:2: ( 'KH_LN_6' )
                    {
                    // InternalRailSL.g:768:2: ( 'KH_LN_6' )
                    // InternalRailSL.g:769:3: 'KH_LN_6'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_6Keyword_13()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_6Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalRailSL.g:774:2: ( 'KH_LN_7' )
                    {
                    // InternalRailSL.g:774:2: ( 'KH_LN_7' )
                    // InternalRailSL.g:775:3: 'KH_LN_7'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_7Keyword_14()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_7Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalRailSL.g:780:2: ( 'KH_LN_8' )
                    {
                    // InternalRailSL.g:780:2: ( 'KH_LN_8' )
                    // InternalRailSL.g:781:3: 'KH_LN_8'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_8Keyword_15()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_8Keyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalRailSL.g:786:2: ( 'KIO_LN_0' )
                    {
                    // InternalRailSL.g:786:2: ( 'KIO_LN_0' )
                    // InternalRailSL.g:787:3: 'KIO_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKIO_LN_0Keyword_16()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKIO_LN_0Keyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalRailSL.g:792:2: ( 'KIO_LN_1' )
                    {
                    // InternalRailSL.g:792:2: ( 'KIO_LN_1' )
                    // InternalRailSL.g:793:3: 'KIO_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKIO_LN_1Keyword_17()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKIO_LN_1Keyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalRailSL.g:798:2: ( 'OC_ST_0' )
                    {
                    // InternalRailSL.g:798:2: ( 'OC_ST_0' )
                    // InternalRailSL.g:799:3: 'OC_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_0Keyword_18()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_0Keyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalRailSL.g:804:2: ( 'OC_ST_1' )
                    {
                    // InternalRailSL.g:804:2: ( 'OC_ST_1' )
                    // InternalRailSL.g:805:3: 'OC_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_1Keyword_19()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_1Keyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalRailSL.g:810:2: ( 'OC_ST_2' )
                    {
                    // InternalRailSL.g:810:2: ( 'OC_ST_2' )
                    // InternalRailSL.g:811:3: 'OC_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_2Keyword_20()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_2Keyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalRailSL.g:816:2: ( 'OC_ST_3' )
                    {
                    // InternalRailSL.g:816:2: ( 'OC_ST_3' )
                    // InternalRailSL.g:817:3: 'OC_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_3Keyword_21()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_3Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalRailSL.g:822:2: ( 'OC_ST_4' )
                    {
                    // InternalRailSL.g:822:2: ( 'OC_ST_4' )
                    // InternalRailSL.g:823:3: 'OC_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_4Keyword_22()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_4Keyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalRailSL.g:828:2: ( 'OC_LN_0' )
                    {
                    // InternalRailSL.g:828:2: ( 'OC_LN_0' )
                    // InternalRailSL.g:829:3: 'OC_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_0Keyword_23()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_0Keyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalRailSL.g:834:2: ( 'OC_LN_1' )
                    {
                    // InternalRailSL.g:834:2: ( 'OC_LN_1' )
                    // InternalRailSL.g:835:3: 'OC_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_1Keyword_24()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_1Keyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalRailSL.g:840:2: ( 'OC_LN_2' )
                    {
                    // InternalRailSL.g:840:2: ( 'OC_LN_2' )
                    // InternalRailSL.g:841:3: 'OC_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_2Keyword_25()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_2Keyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalRailSL.g:846:2: ( 'OC_LN_3' )
                    {
                    // InternalRailSL.g:846:2: ( 'OC_LN_3' )
                    // InternalRailSL.g:847:3: 'OC_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_3Keyword_26()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_3Keyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalRailSL.g:852:2: ( 'OC_LN_4' )
                    {
                    // InternalRailSL.g:852:2: ( 'OC_LN_4' )
                    // InternalRailSL.g:853:3: 'OC_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_4Keyword_27()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_4Keyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalRailSL.g:858:2: ( 'OC_LN_5' )
                    {
                    // InternalRailSL.g:858:2: ( 'OC_LN_5' )
                    // InternalRailSL.g:859:3: 'OC_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_5Keyword_28()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_5Keyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalRailSL.g:864:2: ( 'IC_ST_0' )
                    {
                    // InternalRailSL.g:864:2: ( 'IC_ST_0' )
                    // InternalRailSL.g:865:3: 'IC_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_0Keyword_29()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_0Keyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalRailSL.g:870:2: ( 'IC_ST_1' )
                    {
                    // InternalRailSL.g:870:2: ( 'IC_ST_1' )
                    // InternalRailSL.g:871:3: 'IC_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_1Keyword_30()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_1Keyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalRailSL.g:876:2: ( 'IC_ST_2' )
                    {
                    // InternalRailSL.g:876:2: ( 'IC_ST_2' )
                    // InternalRailSL.g:877:3: 'IC_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_2Keyword_31()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_2Keyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalRailSL.g:882:2: ( 'IC_ST_3' )
                    {
                    // InternalRailSL.g:882:2: ( 'IC_ST_3' )
                    // InternalRailSL.g:883:3: 'IC_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_3Keyword_32()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_3Keyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalRailSL.g:888:2: ( 'IC_ST_4' )
                    {
                    // InternalRailSL.g:888:2: ( 'IC_ST_4' )
                    // InternalRailSL.g:889:3: 'IC_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_4Keyword_33()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_4Keyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalRailSL.g:894:2: ( 'IC_LN_0' )
                    {
                    // InternalRailSL.g:894:2: ( 'IC_LN_0' )
                    // InternalRailSL.g:895:3: 'IC_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_0Keyword_34()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_0Keyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalRailSL.g:900:2: ( 'IC_LN_1' )
                    {
                    // InternalRailSL.g:900:2: ( 'IC_LN_1' )
                    // InternalRailSL.g:901:3: 'IC_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_1Keyword_35()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_1Keyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalRailSL.g:906:2: ( 'IC_LN_2' )
                    {
                    // InternalRailSL.g:906:2: ( 'IC_LN_2' )
                    // InternalRailSL.g:907:3: 'IC_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_2Keyword_36()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_2Keyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalRailSL.g:912:2: ( 'IC_LN_3' )
                    {
                    // InternalRailSL.g:912:2: ( 'IC_LN_3' )
                    // InternalRailSL.g:913:3: 'IC_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_3Keyword_37()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_3Keyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalRailSL.g:918:2: ( 'IC_LN_4' )
                    {
                    // InternalRailSL.g:918:2: ( 'IC_LN_4' )
                    // InternalRailSL.g:919:3: 'IC_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_4Keyword_38()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_4Keyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalRailSL.g:924:2: ( 'IC_LN_5' )
                    {
                    // InternalRailSL.g:924:2: ( 'IC_LN_5' )
                    // InternalRailSL.g:925:3: 'IC_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_5Keyword_39()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_5Keyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalRailSL.g:930:2: ( 'OC_JCT_0' )
                    {
                    // InternalRailSL.g:930:2: ( 'OC_JCT_0' )
                    // InternalRailSL.g:931:3: 'OC_JCT_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_JCT_0Keyword_40()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_JCT_0Keyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalRailSL.g:936:2: ( 'IC_JCT_0' )
                    {
                    // InternalRailSL.g:936:2: ( 'IC_JCT_0' )
                    // InternalRailSL.g:937:3: 'IC_JCT_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_JCT_0Keyword_41()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_JCT_0Keyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalRailSL.g:942:2: ( 'OI_LN_0' )
                    {
                    // InternalRailSL.g:942:2: ( 'OI_LN_0' )
                    // InternalRailSL.g:943:3: 'OI_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_0Keyword_42()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_0Keyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalRailSL.g:948:2: ( 'OI_LN_1' )
                    {
                    // InternalRailSL.g:948:2: ( 'OI_LN_1' )
                    // InternalRailSL.g:949:3: 'OI_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_1Keyword_43()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_1Keyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalRailSL.g:954:2: ( 'OI_LN_2' )
                    {
                    // InternalRailSL.g:954:2: ( 'OI_LN_2' )
                    // InternalRailSL.g:955:3: 'OI_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_2Keyword_44()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_2Keyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalRailSL.g:960:2: ( 'IO_LN_0' )
                    {
                    // InternalRailSL.g:960:2: ( 'IO_LN_0' )
                    // InternalRailSL.g:961:3: 'IO_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIO_LN_0Keyword_45()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIO_LN_0Keyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // InternalRailSL.g:966:2: ( 'IO_LN_1' )
                    {
                    // InternalRailSL.g:966:2: ( 'IO_LN_1' )
                    // InternalRailSL.g:967:3: 'IO_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIO_LN_1Keyword_46()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIO_LN_1Keyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // InternalRailSL.g:972:2: ( 'IO_LN_2' )
                    {
                    // InternalRailSL.g:972:2: ( 'IO_LN_2' )
                    // InternalRailSL.g:973:3: 'IO_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIO_LN_2Keyword_47()); 
                    match(input,73,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIO_LN_2Keyword_47()); 

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
    // $ANTLR end "rule__SEG_NAME__Alternatives"


    // $ANTLR start "rule__Block__Group__0"
    // InternalRailSL.g:982:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:986:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRailSL.g:987:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRailSL.g:994:1: rule__Block__Group__0__Impl : ( 'Start:' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:998:1: ( ( 'Start:' ) )
            // InternalRailSL.g:999:1: ( 'Start:' )
            {
            // InternalRailSL.g:999:1: ( 'Start:' )
            // InternalRailSL.g:1000:2: 'Start:'
            {
             before(grammarAccess.getBlockAccess().getStartKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalRailSL.g:1009:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1013:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRailSL.g:1014:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRailSL.g:1021:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1025:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalRailSL.g:1026:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalRailSL.g:1026:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalRailSL.g:1027:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalRailSL.g:1027:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalRailSL.g:1028:3: ( rule__Block__StatementsAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:1029:3: ( rule__Block__StatementsAssignment_1 )
            // InternalRailSL.g:1029:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Block__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }

            // InternalRailSL.g:1032:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalRailSL.g:1033:3: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:1034:3: ( rule__Block__StatementsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=18 && LA15_0<=19)||(LA15_0>=22 && LA15_0<=23)||LA15_0==75||(LA15_0>=80 && LA15_0<=81)||LA15_0==85) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRailSL.g:1034:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRailSL.g:1043:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1047:1: ( rule__Block__Group__2__Impl )
            // InternalRailSL.g:1048:2: rule__Block__Group__2__Impl
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
    // InternalRailSL.g:1054:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1058:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalRailSL.g:1059:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalRailSL.g:1059:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalRailSL.g:1060:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalRailSL.g:1061:2: ( rule__Block__EndAssignment_2 )
            // InternalRailSL.g:1061:3: rule__Block__EndAssignment_2
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
    // InternalRailSL.g:1070:1: rule__SetTrackStatement__Group__0 : rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 ;
    public final void rule__SetTrackStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1074:1: ( rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 )
            // InternalRailSL.g:1075:2: rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1
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
    // InternalRailSL.g:1082:1: rule__SetTrackStatement__Group__0__Impl : ( 'Set track' ) ;
    public final void rule__SetTrackStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1086:1: ( ( 'Set track' ) )
            // InternalRailSL.g:1087:1: ( 'Set track' )
            {
            // InternalRailSL.g:1087:1: ( 'Set track' )
            // InternalRailSL.g:1088:2: 'Set track'
            {
             before(grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalRailSL.g:1097:1: rule__SetTrackStatement__Group__1 : rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 ;
    public final void rule__SetTrackStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1101:1: ( rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 )
            // InternalRailSL.g:1102:2: rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2
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
    // InternalRailSL.g:1109:1: rule__SetTrackStatement__Group__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ;
    public final void rule__SetTrackStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1113:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) )
            // InternalRailSL.g:1114:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            {
            // InternalRailSL.g:1114:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            // InternalRailSL.g:1115:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:1116:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            // InternalRailSL.g:1116:3: rule__SetTrackStatement__SegmentsAssignment_1
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
    // InternalRailSL.g:1124:1: rule__SetTrackStatement__Group__2 : rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 ;
    public final void rule__SetTrackStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1128:1: ( rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 )
            // InternalRailSL.g:1129:2: rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3
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
    // InternalRailSL.g:1136:1: rule__SetTrackStatement__Group__2__Impl : ( ( rule__SetTrackStatement__Group_2__0 )* ) ;
    public final void rule__SetTrackStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1140:1: ( ( ( rule__SetTrackStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1141:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1141:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            // InternalRailSL.g:1142:2: ( rule__SetTrackStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1143:2: ( rule__SetTrackStatement__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==78) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRailSL.g:1143:3: rule__SetTrackStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetTrackStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRailSL.g:1151:1: rule__SetTrackStatement__Group__3 : rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 ;
    public final void rule__SetTrackStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1155:1: ( rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 )
            // InternalRailSL.g:1156:2: rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalRailSL.g:1163:1: rule__SetTrackStatement__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetTrackStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1167:1: ( ( 'to' ) )
            // InternalRailSL.g:1168:1: ( 'to' )
            {
            // InternalRailSL.g:1168:1: ( 'to' )
            // InternalRailSL.g:1169:2: 'to'
            {
             before(grammarAccess.getSetTrackStatementAccess().getToKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getToKeyword_3()); 

            }


            }

        }
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
    // InternalRailSL.g:1178:1: rule__SetTrackStatement__Group__4 : rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 ;
    public final void rule__SetTrackStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1182:1: ( rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 )
            // InternalRailSL.g:1183:2: rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1190:1: rule__SetTrackStatement__Group__4__Impl : ( ( rule__SetTrackStatement__ModeAssignment_4 ) ) ;
    public final void rule__SetTrackStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1194:1: ( ( ( rule__SetTrackStatement__ModeAssignment_4 ) ) )
            // InternalRailSL.g:1195:1: ( ( rule__SetTrackStatement__ModeAssignment_4 ) )
            {
            // InternalRailSL.g:1195:1: ( ( rule__SetTrackStatement__ModeAssignment_4 ) )
            // InternalRailSL.g:1196:2: ( rule__SetTrackStatement__ModeAssignment_4 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeAssignment_4()); 
            // InternalRailSL.g:1197:2: ( rule__SetTrackStatement__ModeAssignment_4 )
            // InternalRailSL.g:1197:3: rule__SetTrackStatement__ModeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__ModeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetTrackStatementAccess().getModeAssignment_4()); 

            }


            }

        }
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
    // InternalRailSL.g:1205:1: rule__SetTrackStatement__Group__5 : rule__SetTrackStatement__Group__5__Impl ;
    public final void rule__SetTrackStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1209:1: ( rule__SetTrackStatement__Group__5__Impl )
            // InternalRailSL.g:1210:2: rule__SetTrackStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetTrackStatement__Group__5__Impl();

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
    // InternalRailSL.g:1216:1: rule__SetTrackStatement__Group__5__Impl : ( '.' ) ;
    public final void rule__SetTrackStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1220:1: ( ( '.' ) )
            // InternalRailSL.g:1221:1: ( '.' )
            {
            // InternalRailSL.g:1221:1: ( '.' )
            // InternalRailSL.g:1222:2: '.'
            {
             before(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetTrackStatement__Group_2__0"
    // InternalRailSL.g:1232:1: rule__SetTrackStatement__Group_2__0 : rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 ;
    public final void rule__SetTrackStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1236:1: ( rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 )
            // InternalRailSL.g:1237:2: rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1
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
    // InternalRailSL.g:1244:1: rule__SetTrackStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SetTrackStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1248:1: ( ( ',' ) )
            // InternalRailSL.g:1249:1: ( ',' )
            {
            // InternalRailSL.g:1249:1: ( ',' )
            // InternalRailSL.g:1250:2: ','
            {
             before(grammarAccess.getSetTrackStatementAccess().getCommaKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSetTrackStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalRailSL.g:1259:1: rule__SetTrackStatement__Group_2__1 : rule__SetTrackStatement__Group_2__1__Impl ;
    public final void rule__SetTrackStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1263:1: ( rule__SetTrackStatement__Group_2__1__Impl )
            // InternalRailSL.g:1264:2: rule__SetTrackStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1270:1: rule__SetTrackStatement__Group_2__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) ;
    public final void rule__SetTrackStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1274:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) )
            // InternalRailSL.g:1275:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1275:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            // InternalRailSL.g:1276:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_2_1()); 
            // InternalRailSL.g:1277:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            // InternalRailSL.g:1277:3: rule__SetTrackStatement__SegmentsAssignment_2_1
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


    // $ANTLR start "rule__TrackSetting__Group_0__0"
    // InternalRailSL.g:1286:1: rule__TrackSetting__Group_0__0 : rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 ;
    public final void rule__TrackSetting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1290:1: ( rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 )
            // InternalRailSL.g:1291:2: rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1
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
    // InternalRailSL.g:1298:1: rule__TrackSetting__Group_0__0__Impl : ( ( 'reverse' )? ) ;
    public final void rule__TrackSetting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1302:1: ( ( ( 'reverse' )? ) )
            // InternalRailSL.g:1303:1: ( ( 'reverse' )? )
            {
            // InternalRailSL.g:1303:1: ( ( 'reverse' )? )
            // InternalRailSL.g:1304:2: ( 'reverse' )?
            {
             before(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_0()); 
            // InternalRailSL.g:1305:2: ( 'reverse' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==79) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRailSL.g:1305:3: 'reverse'
                    {
                    match(input,79,FOLLOW_2); 

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
    // InternalRailSL.g:1313:1: rule__TrackSetting__Group_0__1 : rule__TrackSetting__Group_0__1__Impl ;
    public final void rule__TrackSetting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1317:1: ( rule__TrackSetting__Group_0__1__Impl )
            // InternalRailSL.g:1318:2: rule__TrackSetting__Group_0__1__Impl
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
    // InternalRailSL.g:1324:1: rule__TrackSetting__Group_0__1__Impl : ( ( rule__TrackSetting__Alternatives_0_1 ) ) ;
    public final void rule__TrackSetting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1328:1: ( ( ( rule__TrackSetting__Alternatives_0_1 ) ) )
            // InternalRailSL.g:1329:1: ( ( rule__TrackSetting__Alternatives_0_1 ) )
            {
            // InternalRailSL.g:1329:1: ( ( rule__TrackSetting__Alternatives_0_1 ) )
            // InternalRailSL.g:1330:2: ( rule__TrackSetting__Alternatives_0_1 )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives_0_1()); 
            // InternalRailSL.g:1331:2: ( rule__TrackSetting__Alternatives_0_1 )
            // InternalRailSL.g:1331:3: rule__TrackSetting__Alternatives_0_1
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
    // InternalRailSL.g:1340:1: rule__SetPointStatement__Group__0 : rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 ;
    public final void rule__SetPointStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1344:1: ( rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 )
            // InternalRailSL.g:1345:2: rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1
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
    // InternalRailSL.g:1352:1: rule__SetPointStatement__Group__0__Impl : ( 'Set point' ) ;
    public final void rule__SetPointStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1356:1: ( ( 'Set point' ) )
            // InternalRailSL.g:1357:1: ( 'Set point' )
            {
            // InternalRailSL.g:1357:1: ( 'Set point' )
            // InternalRailSL.g:1358:2: 'Set point'
            {
             before(grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRailSL.g:1367:1: rule__SetPointStatement__Group__1 : rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 ;
    public final void rule__SetPointStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1371:1: ( rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 )
            // InternalRailSL.g:1372:2: rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2
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
    // InternalRailSL.g:1379:1: rule__SetPointStatement__Group__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ;
    public final void rule__SetPointStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1383:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) )
            // InternalRailSL.g:1384:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            {
            // InternalRailSL.g:1384:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            // InternalRailSL.g:1385:2: ( rule__SetPointStatement__PointsAssignment_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:1386:2: ( rule__SetPointStatement__PointsAssignment_1 )
            // InternalRailSL.g:1386:3: rule__SetPointStatement__PointsAssignment_1
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
    // InternalRailSL.g:1394:1: rule__SetPointStatement__Group__2 : rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 ;
    public final void rule__SetPointStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1398:1: ( rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 )
            // InternalRailSL.g:1399:2: rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3
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
    // InternalRailSL.g:1406:1: rule__SetPointStatement__Group__2__Impl : ( ( rule__SetPointStatement__Group_2__0 )* ) ;
    public final void rule__SetPointStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1410:1: ( ( ( rule__SetPointStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1411:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1411:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            // InternalRailSL.g:1412:2: ( rule__SetPointStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1413:2: ( rule__SetPointStatement__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==78) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:1413:3: rule__SetPointStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetPointStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRailSL.g:1421:1: rule__SetPointStatement__Group__3 : rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 ;
    public final void rule__SetPointStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1425:1: ( rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 )
            // InternalRailSL.g:1426:2: rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalRailSL.g:1433:1: rule__SetPointStatement__Group__3__Impl : ( 'to' ) ;
    public final void rule__SetPointStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1437:1: ( ( 'to' ) )
            // InternalRailSL.g:1438:1: ( 'to' )
            {
            // InternalRailSL.g:1438:1: ( 'to' )
            // InternalRailSL.g:1439:2: 'to'
            {
             before(grammarAccess.getSetPointStatementAccess().getToKeyword_3()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getToKeyword_3()); 

            }


            }

        }
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
    // InternalRailSL.g:1448:1: rule__SetPointStatement__Group__4 : rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 ;
    public final void rule__SetPointStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1452:1: ( rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 )
            // InternalRailSL.g:1453:2: rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1460:1: rule__SetPointStatement__Group__4__Impl : ( ( rule__SetPointStatement__OrientationAssignment_4 ) ) ;
    public final void rule__SetPointStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1464:1: ( ( ( rule__SetPointStatement__OrientationAssignment_4 ) ) )
            // InternalRailSL.g:1465:1: ( ( rule__SetPointStatement__OrientationAssignment_4 ) )
            {
            // InternalRailSL.g:1465:1: ( ( rule__SetPointStatement__OrientationAssignment_4 ) )
            // InternalRailSL.g:1466:2: ( rule__SetPointStatement__OrientationAssignment_4 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_4()); 
            // InternalRailSL.g:1467:2: ( rule__SetPointStatement__OrientationAssignment_4 )
            // InternalRailSL.g:1467:3: rule__SetPointStatement__OrientationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_4()); 

            }


            }

        }
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
    // InternalRailSL.g:1475:1: rule__SetPointStatement__Group__5 : rule__SetPointStatement__Group__5__Impl ;
    public final void rule__SetPointStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1479:1: ( rule__SetPointStatement__Group__5__Impl )
            // InternalRailSL.g:1480:2: rule__SetPointStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__Group__5__Impl();

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
    // InternalRailSL.g:1486:1: rule__SetPointStatement__Group__5__Impl : ( '.' ) ;
    public final void rule__SetPointStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1490:1: ( ( '.' ) )
            // InternalRailSL.g:1491:1: ( '.' )
            {
            // InternalRailSL.g:1491:1: ( '.' )
            // InternalRailSL.g:1492:2: '.'
            {
             before(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_5()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetPointStatement__Group_2__0"
    // InternalRailSL.g:1502:1: rule__SetPointStatement__Group_2__0 : rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 ;
    public final void rule__SetPointStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1506:1: ( rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 )
            // InternalRailSL.g:1507:2: rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1
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
    // InternalRailSL.g:1514:1: rule__SetPointStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SetPointStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1518:1: ( ( ',' ) )
            // InternalRailSL.g:1519:1: ( ',' )
            {
            // InternalRailSL.g:1519:1: ( ',' )
            // InternalRailSL.g:1520:2: ','
            {
             before(grammarAccess.getSetPointStatementAccess().getCommaKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getSetPointStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalRailSL.g:1529:1: rule__SetPointStatement__Group_2__1 : rule__SetPointStatement__Group_2__1__Impl ;
    public final void rule__SetPointStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1533:1: ( rule__SetPointStatement__Group_2__1__Impl )
            // InternalRailSL.g:1534:2: rule__SetPointStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1540:1: rule__SetPointStatement__Group_2__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) ;
    public final void rule__SetPointStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1544:1: ( ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) )
            // InternalRailSL.g:1545:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1545:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            // InternalRailSL.g:1546:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_2_1()); 
            // InternalRailSL.g:1547:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            // InternalRailSL.g:1547:3: rule__SetPointStatement__PointsAssignment_2_1
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


    // $ANTLR start "rule__TimeWaitStatement__Group__0"
    // InternalRailSL.g:1556:1: rule__TimeWaitStatement__Group__0 : rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 ;
    public final void rule__TimeWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1560:1: ( rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 )
            // InternalRailSL.g:1561:2: rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1
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
    // InternalRailSL.g:1568:1: rule__TimeWaitStatement__Group__0__Impl : ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) ;
    public final void rule__TimeWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1572:1: ( ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) )
            // InternalRailSL.g:1573:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            {
            // InternalRailSL.g:1573:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            // InternalRailSL.g:1574:2: ( ( 'Wait for' ) ) ( ( 'Wait for' )* )
            {
            // InternalRailSL.g:1574:2: ( ( 'Wait for' ) )
            // InternalRailSL.g:1575:3: ( 'Wait for' )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1576:3: ( 'Wait for' )
            // InternalRailSL.g:1576:4: 'Wait for'
            {
            match(input,81,FOLLOW_15); 

            }

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

            }

            // InternalRailSL.g:1579:2: ( ( 'Wait for' )* )
            // InternalRailSL.g:1580:3: ( 'Wait for' )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1581:3: ( 'Wait for' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==81) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRailSL.g:1581:4: 'Wait for'
            	    {
            	    match(input,81,FOLLOW_15); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRailSL.g:1590:1: rule__TimeWaitStatement__Group__1 : rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 ;
    public final void rule__TimeWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1594:1: ( rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 )
            // InternalRailSL.g:1595:2: rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2
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
    // InternalRailSL.g:1602:1: rule__TimeWaitStatement__Group__1__Impl : ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) ;
    public final void rule__TimeWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1606:1: ( ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) )
            // InternalRailSL.g:1607:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            {
            // InternalRailSL.g:1607:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            // InternalRailSL.g:1608:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            {
            // InternalRailSL.g:1608:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) )
            // InternalRailSL.g:1609:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1610:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            // InternalRailSL.g:1610:4: rule__TimeWaitStatement__TimeAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__TimeWaitStatement__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

            }

            // InternalRailSL.g:1613:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            // InternalRailSL.g:1614:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:1615:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRailSL.g:1615:4: rule__TimeWaitStatement__TimeAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TimeWaitStatement__TimeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRailSL.g:1624:1: rule__TimeWaitStatement__Group__2 : rule__TimeWaitStatement__Group__2__Impl ;
    public final void rule__TimeWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1628:1: ( rule__TimeWaitStatement__Group__2__Impl )
            // InternalRailSL.g:1629:2: rule__TimeWaitStatement__Group__2__Impl
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
    // InternalRailSL.g:1635:1: rule__TimeWaitStatement__Group__2__Impl : ( 'seconds.' ) ;
    public final void rule__TimeWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1639:1: ( ( 'seconds.' ) )
            // InternalRailSL.g:1640:1: ( 'seconds.' )
            {
            // InternalRailSL.g:1640:1: ( 'seconds.' )
            // InternalRailSL.g:1641:2: 'seconds.'
            {
             before(grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRailSL.g:1651:1: rule__ContactWaitStatement__Group__0 : rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 ;
    public final void rule__ContactWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1655:1: ( rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 )
            // InternalRailSL.g:1656:2: rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1
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
    // InternalRailSL.g:1663:1: rule__ContactWaitStatement__Group__0__Impl : ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) ;
    public final void rule__ContactWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1667:1: ( ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) )
            // InternalRailSL.g:1668:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            {
            // InternalRailSL.g:1668:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            // InternalRailSL.g:1669:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 
            // InternalRailSL.g:1670:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            // InternalRailSL.g:1670:3: rule__ContactWaitStatement__EventAssignment_0
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
    // InternalRailSL.g:1678:1: rule__ContactWaitStatement__Group__1 : rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 ;
    public final void rule__ContactWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1682:1: ( rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 )
            // InternalRailSL.g:1683:2: rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2
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
    // InternalRailSL.g:1690:1: rule__ContactWaitStatement__Group__1__Impl : ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) ;
    public final void rule__ContactWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1694:1: ( ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) )
            // InternalRailSL.g:1695:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            {
            // InternalRailSL.g:1695:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            // InternalRailSL.g:1696:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 
            // InternalRailSL.g:1697:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            // InternalRailSL.g:1697:3: rule__ContactWaitStatement__ContactIndexAssignment_1
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
    // InternalRailSL.g:1705:1: rule__ContactWaitStatement__Group__2 : rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 ;
    public final void rule__ContactWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1709:1: ( rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 )
            // InternalRailSL.g:1710:2: rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3
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
    // InternalRailSL.g:1717:1: rule__ContactWaitStatement__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ContactWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1721:1: ( ( 'contact of' ) )
            // InternalRailSL.g:1722:1: ( 'contact of' )
            {
            // InternalRailSL.g:1722:1: ( 'contact of' )
            // InternalRailSL.g:1723:2: 'contact of'
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2()); 
            match(input,83,FOLLOW_2); 
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
    // InternalRailSL.g:1732:1: rule__ContactWaitStatement__Group__3 : rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 ;
    public final void rule__ContactWaitStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1736:1: ( rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 )
            // InternalRailSL.g:1737:2: rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4
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
    // InternalRailSL.g:1744:1: rule__ContactWaitStatement__Group__3__Impl : ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) ;
    public final void rule__ContactWaitStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1748:1: ( ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:1749:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:1749:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            // InternalRailSL.g:1750:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:1751:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            // InternalRailSL.g:1751:3: rule__ContactWaitStatement__SegNameAssignment_3
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
    // InternalRailSL.g:1759:1: rule__ContactWaitStatement__Group__4 : rule__ContactWaitStatement__Group__4__Impl ;
    public final void rule__ContactWaitStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1763:1: ( rule__ContactWaitStatement__Group__4__Impl )
            // InternalRailSL.g:1764:2: rule__ContactWaitStatement__Group__4__Impl
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
    // InternalRailSL.g:1770:1: rule__ContactWaitStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__ContactWaitStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1774:1: ( ( '.' ) )
            // InternalRailSL.g:1775:1: ( '.' )
            {
            // InternalRailSL.g:1775:1: ( '.' )
            // InternalRailSL.g:1776:2: '.'
            {
             before(grammarAccess.getContactWaitStatementAccess().getFullStopKeyword_4()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRailSL.g:1786:1: rule__CrossingStatement__Group__0 : rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 ;
    public final void rule__CrossingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1790:1: ( rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 )
            // InternalRailSL.g:1791:2: rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1
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
    // InternalRailSL.g:1798:1: rule__CrossingStatement__Group__0__Impl : ( ( rule__CrossingStatement__ModeAssignment_0 ) ) ;
    public final void rule__CrossingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1802:1: ( ( ( rule__CrossingStatement__ModeAssignment_0 ) ) )
            // InternalRailSL.g:1803:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            {
            // InternalRailSL.g:1803:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            // InternalRailSL.g:1804:2: ( rule__CrossingStatement__ModeAssignment_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAssignment_0()); 
            // InternalRailSL.g:1805:2: ( rule__CrossingStatement__ModeAssignment_0 )
            // InternalRailSL.g:1805:3: rule__CrossingStatement__ModeAssignment_0
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
    // InternalRailSL.g:1813:1: rule__CrossingStatement__Group__1 : rule__CrossingStatement__Group__1__Impl ;
    public final void rule__CrossingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1817:1: ( rule__CrossingStatement__Group__1__Impl )
            // InternalRailSL.g:1818:2: rule__CrossingStatement__Group__1__Impl
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
    // InternalRailSL.g:1824:1: rule__CrossingStatement__Group__1__Impl : ( 'crossing.' ) ;
    public final void rule__CrossingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1828:1: ( ( 'crossing.' ) )
            // InternalRailSL.g:1829:1: ( 'crossing.' )
            {
            // InternalRailSL.g:1829:1: ( 'crossing.' )
            // InternalRailSL.g:1830:2: 'crossing.'
            {
             before(grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRailSL.g:1840:1: rule__LightStatement__Group__0 : rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 ;
    public final void rule__LightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1844:1: ( rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 )
            // InternalRailSL.g:1845:2: rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1
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
    // InternalRailSL.g:1852:1: rule__LightStatement__Group__0__Impl : ( 'Turn light' ) ;
    public final void rule__LightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1856:1: ( ( 'Turn light' ) )
            // InternalRailSL.g:1857:1: ( 'Turn light' )
            {
            // InternalRailSL.g:1857:1: ( 'Turn light' )
            // InternalRailSL.g:1858:2: 'Turn light'
            {
             before(grammarAccess.getLightStatementAccess().getTurnLightKeyword_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRailSL.g:1867:1: rule__LightStatement__Group__1 : rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 ;
    public final void rule__LightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1871:1: ( rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 )
            // InternalRailSL.g:1872:2: rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2
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
    // InternalRailSL.g:1879:1: rule__LightStatement__Group__1__Impl : ( ( rule__LightStatement__LightsAssignment_1 ) ) ;
    public final void rule__LightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1883:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) )
            // InternalRailSL.g:1884:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            {
            // InternalRailSL.g:1884:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            // InternalRailSL.g:1885:2: ( rule__LightStatement__LightsAssignment_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:1886:2: ( rule__LightStatement__LightsAssignment_1 )
            // InternalRailSL.g:1886:3: rule__LightStatement__LightsAssignment_1
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
    // InternalRailSL.g:1894:1: rule__LightStatement__Group__2 : rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 ;
    public final void rule__LightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1898:1: ( rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 )
            // InternalRailSL.g:1899:2: rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3
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
    // InternalRailSL.g:1906:1: rule__LightStatement__Group__2__Impl : ( ( rule__LightStatement__Group_2__0 )* ) ;
    public final void rule__LightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1910:1: ( ( ( rule__LightStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1911:1: ( ( rule__LightStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1911:1: ( ( rule__LightStatement__Group_2__0 )* )
            // InternalRailSL.g:1912:2: ( rule__LightStatement__Group_2__0 )*
            {
             before(grammarAccess.getLightStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1913:2: ( rule__LightStatement__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==78) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRailSL.g:1913:3: rule__LightStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LightStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRailSL.g:1921:1: rule__LightStatement__Group__3 : rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 ;
    public final void rule__LightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1925:1: ( rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 )
            // InternalRailSL.g:1926:2: rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRailSL.g:1933:1: rule__LightStatement__Group__3__Impl : ( ( rule__LightStatement__StateAssignment_3 ) ) ;
    public final void rule__LightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1937:1: ( ( ( rule__LightStatement__StateAssignment_3 ) ) )
            // InternalRailSL.g:1938:1: ( ( rule__LightStatement__StateAssignment_3 ) )
            {
            // InternalRailSL.g:1938:1: ( ( rule__LightStatement__StateAssignment_3 ) )
            // InternalRailSL.g:1939:2: ( rule__LightStatement__StateAssignment_3 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAssignment_3()); 
            // InternalRailSL.g:1940:2: ( rule__LightStatement__StateAssignment_3 )
            // InternalRailSL.g:1940:3: rule__LightStatement__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAssignment_3()); 

            }


            }

        }
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
    // InternalRailSL.g:1948:1: rule__LightStatement__Group__4 : rule__LightStatement__Group__4__Impl ;
    public final void rule__LightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1952:1: ( rule__LightStatement__Group__4__Impl )
            // InternalRailSL.g:1953:2: rule__LightStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__Group__4__Impl();

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
    // InternalRailSL.g:1959:1: rule__LightStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__LightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1963:1: ( ( '.' ) )
            // InternalRailSL.g:1964:1: ( '.' )
            {
            // InternalRailSL.g:1964:1: ( '.' )
            // InternalRailSL.g:1965:2: '.'
            {
             before(grammarAccess.getLightStatementAccess().getFullStopKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getFullStopKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LightStatement__Group_2__0"
    // InternalRailSL.g:1975:1: rule__LightStatement__Group_2__0 : rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 ;
    public final void rule__LightStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1979:1: ( rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 )
            // InternalRailSL.g:1980:2: rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1
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
    // InternalRailSL.g:1987:1: rule__LightStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LightStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1991:1: ( ( ',' ) )
            // InternalRailSL.g:1992:1: ( ',' )
            {
            // InternalRailSL.g:1992:1: ( ',' )
            // InternalRailSL.g:1993:2: ','
            {
             before(grammarAccess.getLightStatementAccess().getCommaKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getLightStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
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
    // InternalRailSL.g:2002:1: rule__LightStatement__Group_2__1 : rule__LightStatement__Group_2__1__Impl ;
    public final void rule__LightStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2006:1: ( rule__LightStatement__Group_2__1__Impl )
            // InternalRailSL.g:2007:2: rule__LightStatement__Group_2__1__Impl
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
    // InternalRailSL.g:2013:1: rule__LightStatement__Group_2__1__Impl : ( ( rule__LightStatement__LightsAssignment_2_1 ) ) ;
    public final void rule__LightStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2017:1: ( ( ( rule__LightStatement__LightsAssignment_2_1 ) ) )
            // InternalRailSL.g:2018:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            {
            // InternalRailSL.g:2018:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            // InternalRailSL.g:2019:2: ( rule__LightStatement__LightsAssignment_2_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_2_1()); 
            // InternalRailSL.g:2020:2: ( rule__LightStatement__LightsAssignment_2_1 )
            // InternalRailSL.g:2020:3: rule__LightStatement__LightsAssignment_2_1
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


    // $ANTLR start "rule__Program__BlocksAssignment"
    // InternalRailSL.g:2029:1: rule__Program__BlocksAssignment : ( ruleBlock ) ;
    public final void rule__Program__BlocksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2033:1: ( ( ruleBlock ) )
            // InternalRailSL.g:2034:2: ( ruleBlock )
            {
            // InternalRailSL.g:2034:2: ( ruleBlock )
            // InternalRailSL.g:2035:3: ruleBlock
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
    // InternalRailSL.g:2044:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2048:1: ( ( ruleStatement ) )
            // InternalRailSL.g:2049:2: ( ruleStatement )
            {
            // InternalRailSL.g:2049:2: ( ruleStatement )
            // InternalRailSL.g:2050:3: ruleStatement
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
    // InternalRailSL.g:2059:1: rule__Block__EndAssignment_2 : ( ruleBLOCK_END ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2063:1: ( ( ruleBLOCK_END ) )
            // InternalRailSL.g:2064:2: ( ruleBLOCK_END )
            {
            // InternalRailSL.g:2064:2: ( ruleBLOCK_END )
            // InternalRailSL.g:2065:3: ruleBLOCK_END
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
    // InternalRailSL.g:2074:1: rule__SetTrackStatement__SegmentsAssignment_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2078:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2079:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2079:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2080:3: ruleSEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalRailSL.g:2089:1: rule__SetTrackStatement__SegmentsAssignment_2_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2093:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2094:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2094:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2095:3: ruleSEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetTrackStatement__ModeAssignment_4"
    // InternalRailSL.g:2104:1: rule__SetTrackStatement__ModeAssignment_4 : ( ruleTrackSetting ) ;
    public final void rule__SetTrackStatement__ModeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2108:1: ( ( ruleTrackSetting ) )
            // InternalRailSL.g:2109:2: ( ruleTrackSetting )
            {
            // InternalRailSL.g:2109:2: ( ruleTrackSetting )
            // InternalRailSL.g:2110:3: ruleTrackSetting
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTrackSetting();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetTrackStatement__ModeAssignment_4"


    // $ANTLR start "rule__SetPointStatement__PointsAssignment_1"
    // InternalRailSL.g:2119:1: rule__SetPointStatement__PointsAssignment_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2123:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2124:2: ( RULE_INT )
            {
            // InternalRailSL.g:2124:2: ( RULE_INT )
            // InternalRailSL.g:2125:3: RULE_INT
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
    // InternalRailSL.g:2134:1: rule__SetPointStatement__PointsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2138:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2139:2: ( RULE_INT )
            {
            // InternalRailSL.g:2139:2: ( RULE_INT )
            // InternalRailSL.g:2140:3: RULE_INT
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


    // $ANTLR start "rule__SetPointStatement__OrientationAssignment_4"
    // InternalRailSL.g:2149:1: rule__SetPointStatement__OrientationAssignment_4 : ( ( rule__SetPointStatement__OrientationAlternatives_4_0 ) ) ;
    public final void rule__SetPointStatement__OrientationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2153:1: ( ( ( rule__SetPointStatement__OrientationAlternatives_4_0 ) ) )
            // InternalRailSL.g:2154:2: ( ( rule__SetPointStatement__OrientationAlternatives_4_0 ) )
            {
            // InternalRailSL.g:2154:2: ( ( rule__SetPointStatement__OrientationAlternatives_4_0 ) )
            // InternalRailSL.g:2155:3: ( rule__SetPointStatement__OrientationAlternatives_4_0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_4_0()); 
            // InternalRailSL.g:2156:3: ( rule__SetPointStatement__OrientationAlternatives_4_0 )
            // InternalRailSL.g:2156:4: rule__SetPointStatement__OrientationAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SetPointStatement__OrientationAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetPointStatement__OrientationAssignment_4"


    // $ANTLR start "rule__TimeWaitStatement__TimeAssignment_1"
    // InternalRailSL.g:2164:1: rule__TimeWaitStatement__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__TimeWaitStatement__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2168:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2169:2: ( RULE_INT )
            {
            // InternalRailSL.g:2169:2: ( RULE_INT )
            // InternalRailSL.g:2170:3: RULE_INT
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
    // InternalRailSL.g:2179:1: rule__ContactWaitStatement__EventAssignment_0 : ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) ;
    public final void rule__ContactWaitStatement__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2183:1: ( ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) )
            // InternalRailSL.g:2184:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2184:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            // InternalRailSL.g:2185:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 
            // InternalRailSL.g:2186:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            // InternalRailSL.g:2186:4: rule__ContactWaitStatement__EventAlternatives_0_0
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
    // InternalRailSL.g:2194:1: rule__ContactWaitStatement__ContactIndexAssignment_1 : ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) ) ;
    public final void rule__ContactWaitStatement__ContactIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2198:1: ( ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) ) )
            // InternalRailSL.g:2199:2: ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) )
            {
            // InternalRailSL.g:2199:2: ( ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 ) )
            // InternalRailSL.g:2200:3: ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAlternatives_1_0()); 
            // InternalRailSL.g:2201:3: ( rule__ContactWaitStatement__ContactIndexAlternatives_1_0 )
            // InternalRailSL.g:2201:4: rule__ContactWaitStatement__ContactIndexAlternatives_1_0
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
    // InternalRailSL.g:2209:1: rule__ContactWaitStatement__SegNameAssignment_3 : ( ruleSEG_NAME ) ;
    public final void rule__ContactWaitStatement__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2213:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2214:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2214:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2215:3: ruleSEG_NAME
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMEParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalRailSL.g:2224:1: rule__CrossingStatement__ModeAssignment_0 : ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) ;
    public final void rule__CrossingStatement__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2228:1: ( ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) )
            // InternalRailSL.g:2229:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            {
            // InternalRailSL.g:2229:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            // InternalRailSL.g:2230:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAlternatives_0_0()); 
            // InternalRailSL.g:2231:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            // InternalRailSL.g:2231:4: rule__CrossingStatement__ModeAlternatives_0_0
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
    // InternalRailSL.g:2239:1: rule__LightStatement__LightsAssignment_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2243:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2244:2: ( RULE_INT )
            {
            // InternalRailSL.g:2244:2: ( RULE_INT )
            // InternalRailSL.g:2245:3: RULE_INT
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
    // InternalRailSL.g:2254:1: rule__LightStatement__LightsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2258:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2259:2: ( RULE_INT )
            {
            // InternalRailSL.g:2259:2: ( RULE_INT )
            // InternalRailSL.g:2260:3: RULE_INT
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


    // $ANTLR start "rule__LightStatement__StateAssignment_3"
    // InternalRailSL.g:2269:1: rule__LightStatement__StateAssignment_3 : ( ( rule__LightStatement__StateAlternatives_3_0 ) ) ;
    public final void rule__LightStatement__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2273:1: ( ( ( rule__LightStatement__StateAlternatives_3_0 ) ) )
            // InternalRailSL.g:2274:2: ( ( rule__LightStatement__StateAlternatives_3_0 ) )
            {
            // InternalRailSL.g:2274:2: ( ( rule__LightStatement__StateAlternatives_3_0 ) )
            // InternalRailSL.g:2275:3: ( rule__LightStatement__StateAlternatives_3_0 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAlternatives_3_0()); 
            // InternalRailSL.g:2276:3: ( rule__LightStatement__StateAlternatives_3_0 )
            // InternalRailSL.g:2276:4: rule__LightStatement__StateAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__LightStatement__StateAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLightStatementAccess().getStateAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightStatement__StateAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000CC0000L,0x0000000000230800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000CC0002L,0x0000000000230800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFFFFFC000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L,0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C000L,0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L,0x0000000000004000L});

}