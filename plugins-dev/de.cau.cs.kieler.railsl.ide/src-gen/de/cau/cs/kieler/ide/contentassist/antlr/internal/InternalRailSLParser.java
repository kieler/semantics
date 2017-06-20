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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End.'", "'Loop.'", "'stop'", "'full'", "'slow'", "'straight'", "'branch'", "'Reach'", "'Pass'", "'Open'", "'Close'", "'on'", "'off'", "'first'", "'second'", "'KH_ST_0'", "'KH_ST_1'", "'KH_ST_2'", "'KH_ST_3'", "'KH_ST_4'", "'KH_ST_5'", "'KH_ST_6'", "'KH_LN_0'", "'KH_LN_1'", "'KH_LN_2'", "'KH_LN_3'", "'KH_LN_4'", "'KH_LN_5'", "'KH_LN_6'", "'KH_LN_7'", "'KH_LN_8'", "'KIO_LN_0'", "'KIO_LN_1'", "'OC_ST_0'", "'OC_ST_1'", "'OC_ST_2'", "'OC_ST_3'", "'OC_ST_4'", "'OC_LN_0'", "'OC_LN_1'", "'OC_LN_2'", "'OC_LN_3'", "'OC_LN_4'", "'OC_LN_5'", "'IC_ST_0'", "'IC_ST_1'", "'IC_ST_2'", "'IC_ST_3'", "'IC_ST_4'", "'IC_LN_0'", "'IC_LN_1'", "'IC_LN_2'", "'IC_LN_3'", "'IC_LN_4'", "'IC_LN_5'", "'OC_JCT_0'", "'IC_JCT_0'", "'OI_LN_0'", "'OI_LN_1'", "'OI_LN_2'", "'IO_LN_0'", "'IO_LN_1'", "'IO_LN_2'", "'Start:'", "'Set track'", "'to'", "'.'", "','", "'and'", "', and'", "'reverse'", "'Set point'", "'Wait for'", "'seconds.'", "'contact of'", "'crossing.'", "'Turn light'", "'Branch:'", "'If'", "'is reached first, do'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
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
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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


    // $ANTLR start "entryRuleSEG_NAME"
    // InternalRailSL.g:478:1: entryRuleSEG_NAME : ruleSEG_NAME EOF ;
    public final void entryRuleSEG_NAME() throws RecognitionException {
        try {
            // InternalRailSL.g:479:1: ( ruleSEG_NAME EOF )
            // InternalRailSL.g:480:1: ruleSEG_NAME EOF
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
    // InternalRailSL.g:487:1: ruleSEG_NAME : ( ( rule__SEG_NAME__Alternatives ) ) ;
    public final void ruleSEG_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:491:2: ( ( ( rule__SEG_NAME__Alternatives ) ) )
            // InternalRailSL.g:492:2: ( ( rule__SEG_NAME__Alternatives ) )
            {
            // InternalRailSL.g:492:2: ( ( rule__SEG_NAME__Alternatives ) )
            // InternalRailSL.g:493:3: ( rule__SEG_NAME__Alternatives )
            {
             before(grammarAccess.getSEG_NAMEAccess().getAlternatives()); 
            // InternalRailSL.g:494:3: ( rule__SEG_NAME__Alternatives )
            // InternalRailSL.g:494:4: rule__SEG_NAME__Alternatives
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
    // InternalRailSL.g:502:1: rule__BLOCK_END__Alternatives : ( ( 'End.' ) | ( 'Loop.' ) );
    public final void rule__BLOCK_END__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:506:1: ( ( 'End.' ) | ( 'Loop.' ) )
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
                    // InternalRailSL.g:507:2: ( 'End.' )
                    {
                    // InternalRailSL.g:507:2: ( 'End.' )
                    // InternalRailSL.g:508:3: 'End.'
                    {
                     before(grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0()); 
                    match(input,11,FOLLOW_2); 
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
    // InternalRailSL.g:523:1: rule__Statement__Alternatives : ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:527:1: ( ( ruleSetStatement ) | ( ruleWaitStatement ) | ( ruleOpStatement ) | ( ruleConditionalStatement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 75:
            case 82:
                {
                alt3=1;
                }
                break;
            case 18:
            case 19:
            case 83:
                {
                alt3=2;
                }
                break;
            case 20:
            case 21:
            case 87:
                {
                alt3=3;
                }
                break;
            case 88:
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

            }
        }
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
    // InternalRailSL.g:556:1: rule__SetStatement__Alternatives : ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) );
    public final void rule__SetStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:560:1: ( ( ruleSetTrackStatement ) | ( ruleSetPointStatement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==75) ) {
                alt4=1;
            }
            else if ( (LA4_0==82) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:561:2: ( ruleSetTrackStatement )
                    {
                    // InternalRailSL.g:561:2: ( ruleSetTrackStatement )
                    // InternalRailSL.g:562:3: ruleSetTrackStatement
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
                    // InternalRailSL.g:567:2: ( ruleSetPointStatement )
                    {
                    // InternalRailSL.g:567:2: ( ruleSetPointStatement )
                    // InternalRailSL.g:568:3: ruleSetPointStatement
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
    // InternalRailSL.g:577:1: rule__SetTrackStatement__Alternatives_3 : ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) );
    public final void rule__SetTrackStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:581:1: ( ( ( rule__SetTrackStatement__Group_3_0__0 ) ) | ( ( rule__SetTrackStatement__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==79) ) {
                alt5=1;
            }
            else if ( (LA5_0==80) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:582:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:582:2: ( ( rule__SetTrackStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:583:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:584:3: ( rule__SetTrackStatement__Group_3_0__0 )
                    // InternalRailSL.g:584:4: rule__SetTrackStatement__Group_3_0__0
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
                    // InternalRailSL.g:588:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:588:2: ( ( rule__SetTrackStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:589:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetTrackStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:590:3: ( rule__SetTrackStatement__Group_3_1__0 )
                    // InternalRailSL.g:590:4: rule__SetTrackStatement__Group_3_1__0
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
    // InternalRailSL.g:598:1: rule__TrackSetting__Alternatives : ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) );
    public final void rule__TrackSetting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:602:1: ( ( ( rule__TrackSetting__Group_0__0 ) ) | ( 'stop' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRailSL.g:603:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    {
                    // InternalRailSL.g:603:2: ( ( rule__TrackSetting__Group_0__0 ) )
                    // InternalRailSL.g:604:3: ( rule__TrackSetting__Group_0__0 )
                    {
                     before(grammarAccess.getTrackSettingAccess().getGroup_0()); 
                    // InternalRailSL.g:605:3: ( rule__TrackSetting__Group_0__0 )
                    // InternalRailSL.g:605:4: rule__TrackSetting__Group_0__0
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
                    // InternalRailSL.g:609:2: ( 'stop' )
                    {
                    // InternalRailSL.g:609:2: ( 'stop' )
                    // InternalRailSL.g:610:3: 'stop'
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


    // $ANTLR start "rule__TrackSetting__Alternatives_0_0"
    // InternalRailSL.g:619:1: rule__TrackSetting__Alternatives_0_0 : ( ( 'full' ) | ( 'slow' ) );
    public final void rule__TrackSetting__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:623:1: ( ( 'full' ) | ( 'slow' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:624:2: ( 'full' )
                    {
                    // InternalRailSL.g:624:2: ( 'full' )
                    // InternalRailSL.g:625:3: 'full'
                    {
                     before(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:630:2: ( 'slow' )
                    {
                    // InternalRailSL.g:630:2: ( 'slow' )
                    // InternalRailSL.g:631:3: 'slow'
                    {
                     before(grammarAccess.getTrackSettingAccess().getSlowKeyword_0_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalRailSL.g:640:1: rule__SetPointStatement__Alternatives_3 : ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) );
    public final void rule__SetPointStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:644:1: ( ( ( rule__SetPointStatement__Group_3_0__0 ) ) | ( ( rule__SetPointStatement__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==79) ) {
                alt8=1;
            }
            else if ( (LA8_0==80) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:645:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:645:2: ( ( rule__SetPointStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:646:3: ( rule__SetPointStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:647:3: ( rule__SetPointStatement__Group_3_0__0 )
                    // InternalRailSL.g:647:4: rule__SetPointStatement__Group_3_0__0
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
                    // InternalRailSL.g:651:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:651:2: ( ( rule__SetPointStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:652:3: ( rule__SetPointStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getSetPointStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:653:3: ( rule__SetPointStatement__Group_3_1__0 )
                    // InternalRailSL.g:653:4: rule__SetPointStatement__Group_3_1__0
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
    // InternalRailSL.g:661:1: rule__SetPointStatement__OrientationAlternatives_5_0 : ( ( 'straight' ) | ( 'branch' ) );
    public final void rule__SetPointStatement__OrientationAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:665:1: ( ( 'straight' ) | ( 'branch' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:666:2: ( 'straight' )
                    {
                    // InternalRailSL.g:666:2: ( 'straight' )
                    // InternalRailSL.g:667:3: 'straight'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:672:2: ( 'branch' )
                    {
                    // InternalRailSL.g:672:2: ( 'branch' )
                    // InternalRailSL.g:673:3: 'branch'
                    {
                     before(grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_5_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalRailSL.g:682:1: rule__WaitStatement__Alternatives : ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) );
    public final void rule__WaitStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:686:1: ( ( ruleTimeWaitStatement ) | ( ruleContactWaitStatement ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==83) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:687:2: ( ruleTimeWaitStatement )
                    {
                    // InternalRailSL.g:687:2: ( ruleTimeWaitStatement )
                    // InternalRailSL.g:688:3: ruleTimeWaitStatement
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
                    // InternalRailSL.g:693:2: ( ruleContactWaitStatement )
                    {
                    // InternalRailSL.g:693:2: ( ruleContactWaitStatement )
                    // InternalRailSL.g:694:3: ruleContactWaitStatement
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
    // InternalRailSL.g:703:1: rule__ContactWaitStatement__EventAlternatives_0_0 : ( ( 'Reach' ) | ( 'Pass' ) );
    public final void rule__ContactWaitStatement__EventAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:707:1: ( ( 'Reach' ) | ( 'Pass' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:708:2: ( 'Reach' )
                    {
                    // InternalRailSL.g:708:2: ( 'Reach' )
                    // InternalRailSL.g:709:3: 'Reach'
                    {
                     before(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:714:2: ( 'Pass' )
                    {
                    // InternalRailSL.g:714:2: ( 'Pass' )
                    // InternalRailSL.g:715:3: 'Pass'
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


    // $ANTLR start "rule__OpStatement__Alternatives"
    // InternalRailSL.g:724:1: rule__OpStatement__Alternatives : ( ( ruleCrossingStatement ) | ( ruleLightStatement ) );
    public final void rule__OpStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:728:1: ( ( ruleCrossingStatement ) | ( ruleLightStatement ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=20 && LA12_0<=21)) ) {
                alt12=1;
            }
            else if ( (LA12_0==87) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:729:2: ( ruleCrossingStatement )
                    {
                    // InternalRailSL.g:729:2: ( ruleCrossingStatement )
                    // InternalRailSL.g:730:3: ruleCrossingStatement
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
                    // InternalRailSL.g:735:2: ( ruleLightStatement )
                    {
                    // InternalRailSL.g:735:2: ( ruleLightStatement )
                    // InternalRailSL.g:736:3: ruleLightStatement
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
    // InternalRailSL.g:745:1: rule__CrossingStatement__ModeAlternatives_0_0 : ( ( 'Open' ) | ( 'Close' ) );
    public final void rule__CrossingStatement__ModeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:749:1: ( ( 'Open' ) | ( 'Close' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRailSL.g:750:2: ( 'Open' )
                    {
                    // InternalRailSL.g:750:2: ( 'Open' )
                    // InternalRailSL.g:751:3: 'Open'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:756:2: ( 'Close' )
                    {
                    // InternalRailSL.g:756:2: ( 'Close' )
                    // InternalRailSL.g:757:3: 'Close'
                    {
                     before(grammarAccess.getCrossingStatementAccess().getModeCloseKeyword_0_0_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalRailSL.g:766:1: rule__LightStatement__Alternatives_3 : ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) );
    public final void rule__LightStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:770:1: ( ( ( rule__LightStatement__Group_3_0__0 ) ) | ( ( rule__LightStatement__Group_3_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==79) ) {
                alt14=1;
            }
            else if ( (LA14_0==80) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:771:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    {
                    // InternalRailSL.g:771:2: ( ( rule__LightStatement__Group_3_0__0 ) )
                    // InternalRailSL.g:772:3: ( rule__LightStatement__Group_3_0__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_0()); 
                    // InternalRailSL.g:773:3: ( rule__LightStatement__Group_3_0__0 )
                    // InternalRailSL.g:773:4: rule__LightStatement__Group_3_0__0
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
                    // InternalRailSL.g:777:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    {
                    // InternalRailSL.g:777:2: ( ( rule__LightStatement__Group_3_1__0 ) )
                    // InternalRailSL.g:778:3: ( rule__LightStatement__Group_3_1__0 )
                    {
                     before(grammarAccess.getLightStatementAccess().getGroup_3_1()); 
                    // InternalRailSL.g:779:3: ( rule__LightStatement__Group_3_1__0 )
                    // InternalRailSL.g:779:4: rule__LightStatement__Group_3_1__0
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
    // InternalRailSL.g:787:1: rule__LightStatement__StateAlternatives_4_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__LightStatement__StateAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:791:1: ( ( 'on' ) | ( 'off' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:792:2: ( 'on' )
                    {
                    // InternalRailSL.g:792:2: ( 'on' )
                    // InternalRailSL.g:793:3: 'on'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:798:2: ( 'off' )
                    {
                    // InternalRailSL.g:798:2: ( 'off' )
                    // InternalRailSL.g:799:3: 'off'
                    {
                     before(grammarAccess.getLightStatementAccess().getStateOffKeyword_4_0_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalRailSL.g:808:1: rule__ContactIndex__Alternatives : ( ( 'first' ) | ( 'second' ) );
    public final void rule__ContactIndex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:812:1: ( ( 'first' ) | ( 'second' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRailSL.g:813:2: ( 'first' )
                    {
                    // InternalRailSL.g:813:2: ( 'first' )
                    // InternalRailSL.g:814:3: 'first'
                    {
                     before(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getContactIndexAccess().getFirstKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:819:2: ( 'second' )
                    {
                    // InternalRailSL.g:819:2: ( 'second' )
                    // InternalRailSL.g:820:3: 'second'
                    {
                     before(grammarAccess.getContactIndexAccess().getSecondKeyword_1()); 
                    match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__SEG_NAME__Alternatives"
    // InternalRailSL.g:829:1: rule__SEG_NAME__Alternatives : ( ( 'KH_ST_0' ) | ( 'KH_ST_1' ) | ( 'KH_ST_2' ) | ( 'KH_ST_3' ) | ( 'KH_ST_4' ) | ( 'KH_ST_5' ) | ( 'KH_ST_6' ) | ( 'KH_LN_0' ) | ( 'KH_LN_1' ) | ( 'KH_LN_2' ) | ( 'KH_LN_3' ) | ( 'KH_LN_4' ) | ( 'KH_LN_5' ) | ( 'KH_LN_6' ) | ( 'KH_LN_7' ) | ( 'KH_LN_8' ) | ( 'KIO_LN_0' ) | ( 'KIO_LN_1' ) | ( 'OC_ST_0' ) | ( 'OC_ST_1' ) | ( 'OC_ST_2' ) | ( 'OC_ST_3' ) | ( 'OC_ST_4' ) | ( 'OC_LN_0' ) | ( 'OC_LN_1' ) | ( 'OC_LN_2' ) | ( 'OC_LN_3' ) | ( 'OC_LN_4' ) | ( 'OC_LN_5' ) | ( 'IC_ST_0' ) | ( 'IC_ST_1' ) | ( 'IC_ST_2' ) | ( 'IC_ST_3' ) | ( 'IC_ST_4' ) | ( 'IC_LN_0' ) | ( 'IC_LN_1' ) | ( 'IC_LN_2' ) | ( 'IC_LN_3' ) | ( 'IC_LN_4' ) | ( 'IC_LN_5' ) | ( 'OC_JCT_0' ) | ( 'IC_JCT_0' ) | ( 'OI_LN_0' ) | ( 'OI_LN_1' ) | ( 'OI_LN_2' ) | ( 'IO_LN_0' ) | ( 'IO_LN_1' ) | ( 'IO_LN_2' ) );
    public final void rule__SEG_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:833:1: ( ( 'KH_ST_0' ) | ( 'KH_ST_1' ) | ( 'KH_ST_2' ) | ( 'KH_ST_3' ) | ( 'KH_ST_4' ) | ( 'KH_ST_5' ) | ( 'KH_ST_6' ) | ( 'KH_LN_0' ) | ( 'KH_LN_1' ) | ( 'KH_LN_2' ) | ( 'KH_LN_3' ) | ( 'KH_LN_4' ) | ( 'KH_LN_5' ) | ( 'KH_LN_6' ) | ( 'KH_LN_7' ) | ( 'KH_LN_8' ) | ( 'KIO_LN_0' ) | ( 'KIO_LN_1' ) | ( 'OC_ST_0' ) | ( 'OC_ST_1' ) | ( 'OC_ST_2' ) | ( 'OC_ST_3' ) | ( 'OC_ST_4' ) | ( 'OC_LN_0' ) | ( 'OC_LN_1' ) | ( 'OC_LN_2' ) | ( 'OC_LN_3' ) | ( 'OC_LN_4' ) | ( 'OC_LN_5' ) | ( 'IC_ST_0' ) | ( 'IC_ST_1' ) | ( 'IC_ST_2' ) | ( 'IC_ST_3' ) | ( 'IC_ST_4' ) | ( 'IC_LN_0' ) | ( 'IC_LN_1' ) | ( 'IC_LN_2' ) | ( 'IC_LN_3' ) | ( 'IC_LN_4' ) | ( 'IC_LN_5' ) | ( 'OC_JCT_0' ) | ( 'IC_JCT_0' ) | ( 'OI_LN_0' ) | ( 'OI_LN_1' ) | ( 'OI_LN_2' ) | ( 'IO_LN_0' ) | ( 'IO_LN_1' ) | ( 'IO_LN_2' ) )
            int alt17=48;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            case 30:
                {
                alt17=5;
                }
                break;
            case 31:
                {
                alt17=6;
                }
                break;
            case 32:
                {
                alt17=7;
                }
                break;
            case 33:
                {
                alt17=8;
                }
                break;
            case 34:
                {
                alt17=9;
                }
                break;
            case 35:
                {
                alt17=10;
                }
                break;
            case 36:
                {
                alt17=11;
                }
                break;
            case 37:
                {
                alt17=12;
                }
                break;
            case 38:
                {
                alt17=13;
                }
                break;
            case 39:
                {
                alt17=14;
                }
                break;
            case 40:
                {
                alt17=15;
                }
                break;
            case 41:
                {
                alt17=16;
                }
                break;
            case 42:
                {
                alt17=17;
                }
                break;
            case 43:
                {
                alt17=18;
                }
                break;
            case 44:
                {
                alt17=19;
                }
                break;
            case 45:
                {
                alt17=20;
                }
                break;
            case 46:
                {
                alt17=21;
                }
                break;
            case 47:
                {
                alt17=22;
                }
                break;
            case 48:
                {
                alt17=23;
                }
                break;
            case 49:
                {
                alt17=24;
                }
                break;
            case 50:
                {
                alt17=25;
                }
                break;
            case 51:
                {
                alt17=26;
                }
                break;
            case 52:
                {
                alt17=27;
                }
                break;
            case 53:
                {
                alt17=28;
                }
                break;
            case 54:
                {
                alt17=29;
                }
                break;
            case 55:
                {
                alt17=30;
                }
                break;
            case 56:
                {
                alt17=31;
                }
                break;
            case 57:
                {
                alt17=32;
                }
                break;
            case 58:
                {
                alt17=33;
                }
                break;
            case 59:
                {
                alt17=34;
                }
                break;
            case 60:
                {
                alt17=35;
                }
                break;
            case 61:
                {
                alt17=36;
                }
                break;
            case 62:
                {
                alt17=37;
                }
                break;
            case 63:
                {
                alt17=38;
                }
                break;
            case 64:
                {
                alt17=39;
                }
                break;
            case 65:
                {
                alt17=40;
                }
                break;
            case 66:
                {
                alt17=41;
                }
                break;
            case 67:
                {
                alt17=42;
                }
                break;
            case 68:
                {
                alt17=43;
                }
                break;
            case 69:
                {
                alt17=44;
                }
                break;
            case 70:
                {
                alt17=45;
                }
                break;
            case 71:
                {
                alt17=46;
                }
                break;
            case 72:
                {
                alt17=47;
                }
                break;
            case 73:
                {
                alt17=48;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRailSL.g:834:2: ( 'KH_ST_0' )
                    {
                    // InternalRailSL.g:834:2: ( 'KH_ST_0' )
                    // InternalRailSL.g:835:3: 'KH_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_0Keyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_0Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:840:2: ( 'KH_ST_1' )
                    {
                    // InternalRailSL.g:840:2: ( 'KH_ST_1' )
                    // InternalRailSL.g:841:3: 'KH_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_1Keyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_1Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRailSL.g:846:2: ( 'KH_ST_2' )
                    {
                    // InternalRailSL.g:846:2: ( 'KH_ST_2' )
                    // InternalRailSL.g:847:3: 'KH_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_2Keyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_2Keyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRailSL.g:852:2: ( 'KH_ST_3' )
                    {
                    // InternalRailSL.g:852:2: ( 'KH_ST_3' )
                    // InternalRailSL.g:853:3: 'KH_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_3Keyword_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_3Keyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRailSL.g:858:2: ( 'KH_ST_4' )
                    {
                    // InternalRailSL.g:858:2: ( 'KH_ST_4' )
                    // InternalRailSL.g:859:3: 'KH_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_4Keyword_4()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_4Keyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRailSL.g:864:2: ( 'KH_ST_5' )
                    {
                    // InternalRailSL.g:864:2: ( 'KH_ST_5' )
                    // InternalRailSL.g:865:3: 'KH_ST_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_5Keyword_5()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_5Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRailSL.g:870:2: ( 'KH_ST_6' )
                    {
                    // InternalRailSL.g:870:2: ( 'KH_ST_6' )
                    // InternalRailSL.g:871:3: 'KH_ST_6'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_ST_6Keyword_6()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_ST_6Keyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRailSL.g:876:2: ( 'KH_LN_0' )
                    {
                    // InternalRailSL.g:876:2: ( 'KH_LN_0' )
                    // InternalRailSL.g:877:3: 'KH_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_0Keyword_7()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_0Keyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRailSL.g:882:2: ( 'KH_LN_1' )
                    {
                    // InternalRailSL.g:882:2: ( 'KH_LN_1' )
                    // InternalRailSL.g:883:3: 'KH_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_1Keyword_8()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_1Keyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRailSL.g:888:2: ( 'KH_LN_2' )
                    {
                    // InternalRailSL.g:888:2: ( 'KH_LN_2' )
                    // InternalRailSL.g:889:3: 'KH_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_2Keyword_9()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_2Keyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRailSL.g:894:2: ( 'KH_LN_3' )
                    {
                    // InternalRailSL.g:894:2: ( 'KH_LN_3' )
                    // InternalRailSL.g:895:3: 'KH_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_3Keyword_10()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_3Keyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalRailSL.g:900:2: ( 'KH_LN_4' )
                    {
                    // InternalRailSL.g:900:2: ( 'KH_LN_4' )
                    // InternalRailSL.g:901:3: 'KH_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_4Keyword_11()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_4Keyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalRailSL.g:906:2: ( 'KH_LN_5' )
                    {
                    // InternalRailSL.g:906:2: ( 'KH_LN_5' )
                    // InternalRailSL.g:907:3: 'KH_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_5Keyword_12()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_5Keyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalRailSL.g:912:2: ( 'KH_LN_6' )
                    {
                    // InternalRailSL.g:912:2: ( 'KH_LN_6' )
                    // InternalRailSL.g:913:3: 'KH_LN_6'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_6Keyword_13()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_6Keyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalRailSL.g:918:2: ( 'KH_LN_7' )
                    {
                    // InternalRailSL.g:918:2: ( 'KH_LN_7' )
                    // InternalRailSL.g:919:3: 'KH_LN_7'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_7Keyword_14()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_7Keyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalRailSL.g:924:2: ( 'KH_LN_8' )
                    {
                    // InternalRailSL.g:924:2: ( 'KH_LN_8' )
                    // InternalRailSL.g:925:3: 'KH_LN_8'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKH_LN_8Keyword_15()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKH_LN_8Keyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalRailSL.g:930:2: ( 'KIO_LN_0' )
                    {
                    // InternalRailSL.g:930:2: ( 'KIO_LN_0' )
                    // InternalRailSL.g:931:3: 'KIO_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKIO_LN_0Keyword_16()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKIO_LN_0Keyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalRailSL.g:936:2: ( 'KIO_LN_1' )
                    {
                    // InternalRailSL.g:936:2: ( 'KIO_LN_1' )
                    // InternalRailSL.g:937:3: 'KIO_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getKIO_LN_1Keyword_17()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getKIO_LN_1Keyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalRailSL.g:942:2: ( 'OC_ST_0' )
                    {
                    // InternalRailSL.g:942:2: ( 'OC_ST_0' )
                    // InternalRailSL.g:943:3: 'OC_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_0Keyword_18()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_0Keyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalRailSL.g:948:2: ( 'OC_ST_1' )
                    {
                    // InternalRailSL.g:948:2: ( 'OC_ST_1' )
                    // InternalRailSL.g:949:3: 'OC_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_1Keyword_19()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_1Keyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalRailSL.g:954:2: ( 'OC_ST_2' )
                    {
                    // InternalRailSL.g:954:2: ( 'OC_ST_2' )
                    // InternalRailSL.g:955:3: 'OC_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_2Keyword_20()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_2Keyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalRailSL.g:960:2: ( 'OC_ST_3' )
                    {
                    // InternalRailSL.g:960:2: ( 'OC_ST_3' )
                    // InternalRailSL.g:961:3: 'OC_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_3Keyword_21()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_3Keyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalRailSL.g:966:2: ( 'OC_ST_4' )
                    {
                    // InternalRailSL.g:966:2: ( 'OC_ST_4' )
                    // InternalRailSL.g:967:3: 'OC_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_ST_4Keyword_22()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_ST_4Keyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalRailSL.g:972:2: ( 'OC_LN_0' )
                    {
                    // InternalRailSL.g:972:2: ( 'OC_LN_0' )
                    // InternalRailSL.g:973:3: 'OC_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_0Keyword_23()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_0Keyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalRailSL.g:978:2: ( 'OC_LN_1' )
                    {
                    // InternalRailSL.g:978:2: ( 'OC_LN_1' )
                    // InternalRailSL.g:979:3: 'OC_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_1Keyword_24()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_1Keyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalRailSL.g:984:2: ( 'OC_LN_2' )
                    {
                    // InternalRailSL.g:984:2: ( 'OC_LN_2' )
                    // InternalRailSL.g:985:3: 'OC_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_2Keyword_25()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_2Keyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalRailSL.g:990:2: ( 'OC_LN_3' )
                    {
                    // InternalRailSL.g:990:2: ( 'OC_LN_3' )
                    // InternalRailSL.g:991:3: 'OC_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_3Keyword_26()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_3Keyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalRailSL.g:996:2: ( 'OC_LN_4' )
                    {
                    // InternalRailSL.g:996:2: ( 'OC_LN_4' )
                    // InternalRailSL.g:997:3: 'OC_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_4Keyword_27()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_4Keyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalRailSL.g:1002:2: ( 'OC_LN_5' )
                    {
                    // InternalRailSL.g:1002:2: ( 'OC_LN_5' )
                    // InternalRailSL.g:1003:3: 'OC_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_LN_5Keyword_28()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_LN_5Keyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalRailSL.g:1008:2: ( 'IC_ST_0' )
                    {
                    // InternalRailSL.g:1008:2: ( 'IC_ST_0' )
                    // InternalRailSL.g:1009:3: 'IC_ST_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_0Keyword_29()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_0Keyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalRailSL.g:1014:2: ( 'IC_ST_1' )
                    {
                    // InternalRailSL.g:1014:2: ( 'IC_ST_1' )
                    // InternalRailSL.g:1015:3: 'IC_ST_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_1Keyword_30()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_1Keyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalRailSL.g:1020:2: ( 'IC_ST_2' )
                    {
                    // InternalRailSL.g:1020:2: ( 'IC_ST_2' )
                    // InternalRailSL.g:1021:3: 'IC_ST_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_2Keyword_31()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_2Keyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalRailSL.g:1026:2: ( 'IC_ST_3' )
                    {
                    // InternalRailSL.g:1026:2: ( 'IC_ST_3' )
                    // InternalRailSL.g:1027:3: 'IC_ST_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_3Keyword_32()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_3Keyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalRailSL.g:1032:2: ( 'IC_ST_4' )
                    {
                    // InternalRailSL.g:1032:2: ( 'IC_ST_4' )
                    // InternalRailSL.g:1033:3: 'IC_ST_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_ST_4Keyword_33()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_ST_4Keyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalRailSL.g:1038:2: ( 'IC_LN_0' )
                    {
                    // InternalRailSL.g:1038:2: ( 'IC_LN_0' )
                    // InternalRailSL.g:1039:3: 'IC_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_0Keyword_34()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_0Keyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalRailSL.g:1044:2: ( 'IC_LN_1' )
                    {
                    // InternalRailSL.g:1044:2: ( 'IC_LN_1' )
                    // InternalRailSL.g:1045:3: 'IC_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_1Keyword_35()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_1Keyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalRailSL.g:1050:2: ( 'IC_LN_2' )
                    {
                    // InternalRailSL.g:1050:2: ( 'IC_LN_2' )
                    // InternalRailSL.g:1051:3: 'IC_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_2Keyword_36()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_2Keyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalRailSL.g:1056:2: ( 'IC_LN_3' )
                    {
                    // InternalRailSL.g:1056:2: ( 'IC_LN_3' )
                    // InternalRailSL.g:1057:3: 'IC_LN_3'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_3Keyword_37()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_3Keyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalRailSL.g:1062:2: ( 'IC_LN_4' )
                    {
                    // InternalRailSL.g:1062:2: ( 'IC_LN_4' )
                    // InternalRailSL.g:1063:3: 'IC_LN_4'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_4Keyword_38()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_4Keyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalRailSL.g:1068:2: ( 'IC_LN_5' )
                    {
                    // InternalRailSL.g:1068:2: ( 'IC_LN_5' )
                    // InternalRailSL.g:1069:3: 'IC_LN_5'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_LN_5Keyword_39()); 
                    match(input,65,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_LN_5Keyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalRailSL.g:1074:2: ( 'OC_JCT_0' )
                    {
                    // InternalRailSL.g:1074:2: ( 'OC_JCT_0' )
                    // InternalRailSL.g:1075:3: 'OC_JCT_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOC_JCT_0Keyword_40()); 
                    match(input,66,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOC_JCT_0Keyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalRailSL.g:1080:2: ( 'IC_JCT_0' )
                    {
                    // InternalRailSL.g:1080:2: ( 'IC_JCT_0' )
                    // InternalRailSL.g:1081:3: 'IC_JCT_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIC_JCT_0Keyword_41()); 
                    match(input,67,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIC_JCT_0Keyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalRailSL.g:1086:2: ( 'OI_LN_0' )
                    {
                    // InternalRailSL.g:1086:2: ( 'OI_LN_0' )
                    // InternalRailSL.g:1087:3: 'OI_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_0Keyword_42()); 
                    match(input,68,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_0Keyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalRailSL.g:1092:2: ( 'OI_LN_1' )
                    {
                    // InternalRailSL.g:1092:2: ( 'OI_LN_1' )
                    // InternalRailSL.g:1093:3: 'OI_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_1Keyword_43()); 
                    match(input,69,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_1Keyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalRailSL.g:1098:2: ( 'OI_LN_2' )
                    {
                    // InternalRailSL.g:1098:2: ( 'OI_LN_2' )
                    // InternalRailSL.g:1099:3: 'OI_LN_2'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getOI_LN_2Keyword_44()); 
                    match(input,70,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getOI_LN_2Keyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalRailSL.g:1104:2: ( 'IO_LN_0' )
                    {
                    // InternalRailSL.g:1104:2: ( 'IO_LN_0' )
                    // InternalRailSL.g:1105:3: 'IO_LN_0'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIO_LN_0Keyword_45()); 
                    match(input,71,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIO_LN_0Keyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // InternalRailSL.g:1110:2: ( 'IO_LN_1' )
                    {
                    // InternalRailSL.g:1110:2: ( 'IO_LN_1' )
                    // InternalRailSL.g:1111:3: 'IO_LN_1'
                    {
                     before(grammarAccess.getSEG_NAMEAccess().getIO_LN_1Keyword_46()); 
                    match(input,72,FOLLOW_2); 
                     after(grammarAccess.getSEG_NAMEAccess().getIO_LN_1Keyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // InternalRailSL.g:1116:2: ( 'IO_LN_2' )
                    {
                    // InternalRailSL.g:1116:2: ( 'IO_LN_2' )
                    // InternalRailSL.g:1117:3: 'IO_LN_2'
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
    // InternalRailSL.g:1126:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1130:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalRailSL.g:1131:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalRailSL.g:1138:1: rule__Block__Group__0__Impl : ( 'Start:' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1142:1: ( ( 'Start:' ) )
            // InternalRailSL.g:1143:1: ( 'Start:' )
            {
            // InternalRailSL.g:1143:1: ( 'Start:' )
            // InternalRailSL.g:1144:2: 'Start:'
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
    // InternalRailSL.g:1153:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1157:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalRailSL.g:1158:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalRailSL.g:1165:1: rule__Block__Group__1__Impl : ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1169:1: ( ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) ) )
            // InternalRailSL.g:1170:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            {
            // InternalRailSL.g:1170:1: ( ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalRailSL.g:1171:2: ( ( rule__Block__StatementsAssignment_1 ) ) ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalRailSL.g:1171:2: ( ( rule__Block__StatementsAssignment_1 ) )
            // InternalRailSL.g:1172:3: ( rule__Block__StatementsAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:1173:3: ( rule__Block__StatementsAssignment_1 )
            // InternalRailSL.g:1173:4: rule__Block__StatementsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__Block__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }

            // InternalRailSL.g:1176:2: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalRailSL.g:1177:3: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalRailSL.g:1178:3: ( rule__Block__StatementsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=18 && LA18_0<=21)||LA18_0==75||(LA18_0>=82 && LA18_0<=83)||(LA18_0>=87 && LA18_0<=88)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:1178:4: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRailSL.g:1187:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1191:1: ( rule__Block__Group__2__Impl )
            // InternalRailSL.g:1192:2: rule__Block__Group__2__Impl
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
    // InternalRailSL.g:1198:1: rule__Block__Group__2__Impl : ( ( rule__Block__EndAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1202:1: ( ( ( rule__Block__EndAssignment_2 ) ) )
            // InternalRailSL.g:1203:1: ( ( rule__Block__EndAssignment_2 ) )
            {
            // InternalRailSL.g:1203:1: ( ( rule__Block__EndAssignment_2 ) )
            // InternalRailSL.g:1204:2: ( rule__Block__EndAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getEndAssignment_2()); 
            // InternalRailSL.g:1205:2: ( rule__Block__EndAssignment_2 )
            // InternalRailSL.g:1205:3: rule__Block__EndAssignment_2
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
    // InternalRailSL.g:1214:1: rule__SetTrackStatement__Group__0 : rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 ;
    public final void rule__SetTrackStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1218:1: ( rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1 )
            // InternalRailSL.g:1219:2: rule__SetTrackStatement__Group__0__Impl rule__SetTrackStatement__Group__1
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
    // InternalRailSL.g:1226:1: rule__SetTrackStatement__Group__0__Impl : ( 'Set track' ) ;
    public final void rule__SetTrackStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1230:1: ( ( 'Set track' ) )
            // InternalRailSL.g:1231:1: ( 'Set track' )
            {
            // InternalRailSL.g:1231:1: ( 'Set track' )
            // InternalRailSL.g:1232:2: 'Set track'
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
    // InternalRailSL.g:1241:1: rule__SetTrackStatement__Group__1 : rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 ;
    public final void rule__SetTrackStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1245:1: ( rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2 )
            // InternalRailSL.g:1246:2: rule__SetTrackStatement__Group__1__Impl rule__SetTrackStatement__Group__2
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
    // InternalRailSL.g:1253:1: rule__SetTrackStatement__Group__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) ;
    public final void rule__SetTrackStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1257:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) ) )
            // InternalRailSL.g:1258:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            {
            // InternalRailSL.g:1258:1: ( ( rule__SetTrackStatement__SegmentsAssignment_1 ) )
            // InternalRailSL.g:1259:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_1()); 
            // InternalRailSL.g:1260:2: ( rule__SetTrackStatement__SegmentsAssignment_1 )
            // InternalRailSL.g:1260:3: rule__SetTrackStatement__SegmentsAssignment_1
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
    // InternalRailSL.g:1268:1: rule__SetTrackStatement__Group__2 : rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 ;
    public final void rule__SetTrackStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1272:1: ( rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3 )
            // InternalRailSL.g:1273:2: rule__SetTrackStatement__Group__2__Impl rule__SetTrackStatement__Group__3
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
    // InternalRailSL.g:1280:1: rule__SetTrackStatement__Group__2__Impl : ( ( rule__SetTrackStatement__Group_2__0 )* ) ;
    public final void rule__SetTrackStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1284:1: ( ( ( rule__SetTrackStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1285:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1285:1: ( ( rule__SetTrackStatement__Group_2__0 )* )
            // InternalRailSL.g:1286:2: ( rule__SetTrackStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetTrackStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1287:2: ( rule__SetTrackStatement__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==78) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRailSL.g:1287:3: rule__SetTrackStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetTrackStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRailSL.g:1295:1: rule__SetTrackStatement__Group__3 : rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 ;
    public final void rule__SetTrackStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1299:1: ( rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4 )
            // InternalRailSL.g:1300:2: rule__SetTrackStatement__Group__3__Impl rule__SetTrackStatement__Group__4
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
    // InternalRailSL.g:1307:1: rule__SetTrackStatement__Group__3__Impl : ( ( rule__SetTrackStatement__Alternatives_3 )? ) ;
    public final void rule__SetTrackStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1311:1: ( ( ( rule__SetTrackStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:1312:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:1312:1: ( ( rule__SetTrackStatement__Alternatives_3 )? )
            // InternalRailSL.g:1313:2: ( rule__SetTrackStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetTrackStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:1314:2: ( rule__SetTrackStatement__Alternatives_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=79 && LA20_0<=80)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRailSL.g:1314:3: rule__SetTrackStatement__Alternatives_3
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
    // InternalRailSL.g:1322:1: rule__SetTrackStatement__Group__4 : rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 ;
    public final void rule__SetTrackStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1326:1: ( rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5 )
            // InternalRailSL.g:1327:2: rule__SetTrackStatement__Group__4__Impl rule__SetTrackStatement__Group__5
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
    // InternalRailSL.g:1334:1: rule__SetTrackStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetTrackStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1338:1: ( ( 'to' ) )
            // InternalRailSL.g:1339:1: ( 'to' )
            {
            // InternalRailSL.g:1339:1: ( 'to' )
            // InternalRailSL.g:1340:2: 'to'
            {
             before(grammarAccess.getSetTrackStatementAccess().getToKeyword_4()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRailSL.g:1349:1: rule__SetTrackStatement__Group__5 : rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 ;
    public final void rule__SetTrackStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1353:1: ( rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6 )
            // InternalRailSL.g:1354:2: rule__SetTrackStatement__Group__5__Impl rule__SetTrackStatement__Group__6
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
    // InternalRailSL.g:1361:1: rule__SetTrackStatement__Group__5__Impl : ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) ;
    public final void rule__SetTrackStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1365:1: ( ( ( rule__SetTrackStatement__ModeAssignment_5 ) ) )
            // InternalRailSL.g:1366:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            {
            // InternalRailSL.g:1366:1: ( ( rule__SetTrackStatement__ModeAssignment_5 ) )
            // InternalRailSL.g:1367:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getModeAssignment_5()); 
            // InternalRailSL.g:1368:2: ( rule__SetTrackStatement__ModeAssignment_5 )
            // InternalRailSL.g:1368:3: rule__SetTrackStatement__ModeAssignment_5
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
    // InternalRailSL.g:1376:1: rule__SetTrackStatement__Group__6 : rule__SetTrackStatement__Group__6__Impl ;
    public final void rule__SetTrackStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1380:1: ( rule__SetTrackStatement__Group__6__Impl )
            // InternalRailSL.g:1381:2: rule__SetTrackStatement__Group__6__Impl
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
    // InternalRailSL.g:1387:1: rule__SetTrackStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetTrackStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1391:1: ( ( '.' ) )
            // InternalRailSL.g:1392:1: ( '.' )
            {
            // InternalRailSL.g:1392:1: ( '.' )
            // InternalRailSL.g:1393:2: '.'
            {
             before(grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_6()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRailSL.g:1403:1: rule__SetTrackStatement__Group_2__0 : rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 ;
    public final void rule__SetTrackStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1407:1: ( rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1 )
            // InternalRailSL.g:1408:2: rule__SetTrackStatement__Group_2__0__Impl rule__SetTrackStatement__Group_2__1
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
    // InternalRailSL.g:1415:1: rule__SetTrackStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SetTrackStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1419:1: ( ( ',' ) )
            // InternalRailSL.g:1420:1: ( ',' )
            {
            // InternalRailSL.g:1420:1: ( ',' )
            // InternalRailSL.g:1421:2: ','
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
    // InternalRailSL.g:1430:1: rule__SetTrackStatement__Group_2__1 : rule__SetTrackStatement__Group_2__1__Impl ;
    public final void rule__SetTrackStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1434:1: ( rule__SetTrackStatement__Group_2__1__Impl )
            // InternalRailSL.g:1435:2: rule__SetTrackStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1441:1: rule__SetTrackStatement__Group_2__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) ;
    public final void rule__SetTrackStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1445:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) ) )
            // InternalRailSL.g:1446:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1446:1: ( ( rule__SetTrackStatement__SegmentsAssignment_2_1 ) )
            // InternalRailSL.g:1447:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_2_1()); 
            // InternalRailSL.g:1448:2: ( rule__SetTrackStatement__SegmentsAssignment_2_1 )
            // InternalRailSL.g:1448:3: rule__SetTrackStatement__SegmentsAssignment_2_1
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
    // InternalRailSL.g:1457:1: rule__SetTrackStatement__Group_3_0__0 : rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 ;
    public final void rule__SetTrackStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1461:1: ( rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1 )
            // InternalRailSL.g:1462:2: rule__SetTrackStatement__Group_3_0__0__Impl rule__SetTrackStatement__Group_3_0__1
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
    // InternalRailSL.g:1469:1: rule__SetTrackStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetTrackStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1473:1: ( ( 'and' ) )
            // InternalRailSL.g:1474:1: ( 'and' )
            {
            // InternalRailSL.g:1474:1: ( 'and' )
            // InternalRailSL.g:1475:2: 'and'
            {
             before(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_0_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRailSL.g:1484:1: rule__SetTrackStatement__Group_3_0__1 : rule__SetTrackStatement__Group_3_0__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1488:1: ( rule__SetTrackStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1489:2: rule__SetTrackStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:1495:1: rule__SetTrackStatement__Group_3_0__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1499:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1500:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1500:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 ) )
            // InternalRailSL.g:1501:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_0_1()); 
            // InternalRailSL.g:1502:2: ( rule__SetTrackStatement__SegmentsAssignment_3_0_1 )
            // InternalRailSL.g:1502:3: rule__SetTrackStatement__SegmentsAssignment_3_0_1
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
    // InternalRailSL.g:1511:1: rule__SetTrackStatement__Group_3_1__0 : rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 ;
    public final void rule__SetTrackStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1515:1: ( rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1 )
            // InternalRailSL.g:1516:2: rule__SetTrackStatement__Group_3_1__0__Impl rule__SetTrackStatement__Group_3_1__1
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
    // InternalRailSL.g:1523:1: rule__SetTrackStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetTrackStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1527:1: ( ( ', and' ) )
            // InternalRailSL.g:1528:1: ( ', and' )
            {
            // InternalRailSL.g:1528:1: ( ', and' )
            // InternalRailSL.g:1529:2: ', and'
            {
             before(grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_1_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRailSL.g:1538:1: rule__SetTrackStatement__Group_3_1__1 : rule__SetTrackStatement__Group_3_1__1__Impl ;
    public final void rule__SetTrackStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1542:1: ( rule__SetTrackStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1543:2: rule__SetTrackStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:1549:1: rule__SetTrackStatement__Group_3_1__1__Impl : ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) ;
    public final void rule__SetTrackStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1553:1: ( ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1554:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1554:1: ( ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 ) )
            // InternalRailSL.g:1555:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsAssignment_3_1_1()); 
            // InternalRailSL.g:1556:2: ( rule__SetTrackStatement__SegmentsAssignment_3_1_1 )
            // InternalRailSL.g:1556:3: rule__SetTrackStatement__SegmentsAssignment_3_1_1
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
    // InternalRailSL.g:1565:1: rule__TrackSetting__Group_0__0 : rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 ;
    public final void rule__TrackSetting__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1569:1: ( rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1 )
            // InternalRailSL.g:1570:2: rule__TrackSetting__Group_0__0__Impl rule__TrackSetting__Group_0__1
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
    // InternalRailSL.g:1577:1: rule__TrackSetting__Group_0__0__Impl : ( ( rule__TrackSetting__Alternatives_0_0 ) ) ;
    public final void rule__TrackSetting__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1581:1: ( ( ( rule__TrackSetting__Alternatives_0_0 ) ) )
            // InternalRailSL.g:1582:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            {
            // InternalRailSL.g:1582:1: ( ( rule__TrackSetting__Alternatives_0_0 ) )
            // InternalRailSL.g:1583:2: ( rule__TrackSetting__Alternatives_0_0 )
            {
             before(grammarAccess.getTrackSettingAccess().getAlternatives_0_0()); 
            // InternalRailSL.g:1584:2: ( rule__TrackSetting__Alternatives_0_0 )
            // InternalRailSL.g:1584:3: rule__TrackSetting__Alternatives_0_0
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
    // InternalRailSL.g:1592:1: rule__TrackSetting__Group_0__1 : rule__TrackSetting__Group_0__1__Impl ;
    public final void rule__TrackSetting__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1596:1: ( rule__TrackSetting__Group_0__1__Impl )
            // InternalRailSL.g:1597:2: rule__TrackSetting__Group_0__1__Impl
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
    // InternalRailSL.g:1603:1: rule__TrackSetting__Group_0__1__Impl : ( ( 'reverse' )? ) ;
    public final void rule__TrackSetting__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1607:1: ( ( ( 'reverse' )? ) )
            // InternalRailSL.g:1608:1: ( ( 'reverse' )? )
            {
            // InternalRailSL.g:1608:1: ( ( 'reverse' )? )
            // InternalRailSL.g:1609:2: ( 'reverse' )?
            {
             before(grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1()); 
            // InternalRailSL.g:1610:2: ( 'reverse' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==81) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRailSL.g:1610:3: 'reverse'
                    {
                    match(input,81,FOLLOW_2); 

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
    // InternalRailSL.g:1619:1: rule__SetPointStatement__Group__0 : rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 ;
    public final void rule__SetPointStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1623:1: ( rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1 )
            // InternalRailSL.g:1624:2: rule__SetPointStatement__Group__0__Impl rule__SetPointStatement__Group__1
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
    // InternalRailSL.g:1631:1: rule__SetPointStatement__Group__0__Impl : ( 'Set point' ) ;
    public final void rule__SetPointStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1635:1: ( ( 'Set point' ) )
            // InternalRailSL.g:1636:1: ( 'Set point' )
            {
            // InternalRailSL.g:1636:1: ( 'Set point' )
            // InternalRailSL.g:1637:2: 'Set point'
            {
             before(grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalRailSL.g:1646:1: rule__SetPointStatement__Group__1 : rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 ;
    public final void rule__SetPointStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1650:1: ( rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2 )
            // InternalRailSL.g:1651:2: rule__SetPointStatement__Group__1__Impl rule__SetPointStatement__Group__2
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
    // InternalRailSL.g:1658:1: rule__SetPointStatement__Group__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_1 ) ) ;
    public final void rule__SetPointStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1662:1: ( ( ( rule__SetPointStatement__PointsAssignment_1 ) ) )
            // InternalRailSL.g:1663:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            {
            // InternalRailSL.g:1663:1: ( ( rule__SetPointStatement__PointsAssignment_1 ) )
            // InternalRailSL.g:1664:2: ( rule__SetPointStatement__PointsAssignment_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_1()); 
            // InternalRailSL.g:1665:2: ( rule__SetPointStatement__PointsAssignment_1 )
            // InternalRailSL.g:1665:3: rule__SetPointStatement__PointsAssignment_1
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
    // InternalRailSL.g:1673:1: rule__SetPointStatement__Group__2 : rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 ;
    public final void rule__SetPointStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1677:1: ( rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3 )
            // InternalRailSL.g:1678:2: rule__SetPointStatement__Group__2__Impl rule__SetPointStatement__Group__3
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
    // InternalRailSL.g:1685:1: rule__SetPointStatement__Group__2__Impl : ( ( rule__SetPointStatement__Group_2__0 )* ) ;
    public final void rule__SetPointStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1689:1: ( ( ( rule__SetPointStatement__Group_2__0 )* ) )
            // InternalRailSL.g:1690:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:1690:1: ( ( rule__SetPointStatement__Group_2__0 )* )
            // InternalRailSL.g:1691:2: ( rule__SetPointStatement__Group_2__0 )*
            {
             before(grammarAccess.getSetPointStatementAccess().getGroup_2()); 
            // InternalRailSL.g:1692:2: ( rule__SetPointStatement__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==78) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRailSL.g:1692:3: rule__SetPointStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SetPointStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRailSL.g:1700:1: rule__SetPointStatement__Group__3 : rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 ;
    public final void rule__SetPointStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1704:1: ( rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4 )
            // InternalRailSL.g:1705:2: rule__SetPointStatement__Group__3__Impl rule__SetPointStatement__Group__4
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
    // InternalRailSL.g:1712:1: rule__SetPointStatement__Group__3__Impl : ( ( rule__SetPointStatement__Alternatives_3 )? ) ;
    public final void rule__SetPointStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1716:1: ( ( ( rule__SetPointStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:1717:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:1717:1: ( ( rule__SetPointStatement__Alternatives_3 )? )
            // InternalRailSL.g:1718:2: ( rule__SetPointStatement__Alternatives_3 )?
            {
             before(grammarAccess.getSetPointStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:1719:2: ( rule__SetPointStatement__Alternatives_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=79 && LA23_0<=80)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRailSL.g:1719:3: rule__SetPointStatement__Alternatives_3
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
    // InternalRailSL.g:1727:1: rule__SetPointStatement__Group__4 : rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 ;
    public final void rule__SetPointStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1731:1: ( rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5 )
            // InternalRailSL.g:1732:2: rule__SetPointStatement__Group__4__Impl rule__SetPointStatement__Group__5
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
    // InternalRailSL.g:1739:1: rule__SetPointStatement__Group__4__Impl : ( 'to' ) ;
    public final void rule__SetPointStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1743:1: ( ( 'to' ) )
            // InternalRailSL.g:1744:1: ( 'to' )
            {
            // InternalRailSL.g:1744:1: ( 'to' )
            // InternalRailSL.g:1745:2: 'to'
            {
             before(grammarAccess.getSetPointStatementAccess().getToKeyword_4()); 
            match(input,76,FOLLOW_2); 
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
    // InternalRailSL.g:1754:1: rule__SetPointStatement__Group__5 : rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 ;
    public final void rule__SetPointStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1758:1: ( rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6 )
            // InternalRailSL.g:1759:2: rule__SetPointStatement__Group__5__Impl rule__SetPointStatement__Group__6
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
    // InternalRailSL.g:1766:1: rule__SetPointStatement__Group__5__Impl : ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) ;
    public final void rule__SetPointStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1770:1: ( ( ( rule__SetPointStatement__OrientationAssignment_5 ) ) )
            // InternalRailSL.g:1771:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            {
            // InternalRailSL.g:1771:1: ( ( rule__SetPointStatement__OrientationAssignment_5 ) )
            // InternalRailSL.g:1772:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAssignment_5()); 
            // InternalRailSL.g:1773:2: ( rule__SetPointStatement__OrientationAssignment_5 )
            // InternalRailSL.g:1773:3: rule__SetPointStatement__OrientationAssignment_5
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
    // InternalRailSL.g:1781:1: rule__SetPointStatement__Group__6 : rule__SetPointStatement__Group__6__Impl ;
    public final void rule__SetPointStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1785:1: ( rule__SetPointStatement__Group__6__Impl )
            // InternalRailSL.g:1786:2: rule__SetPointStatement__Group__6__Impl
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
    // InternalRailSL.g:1792:1: rule__SetPointStatement__Group__6__Impl : ( '.' ) ;
    public final void rule__SetPointStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1796:1: ( ( '.' ) )
            // InternalRailSL.g:1797:1: ( '.' )
            {
            // InternalRailSL.g:1797:1: ( '.' )
            // InternalRailSL.g:1798:2: '.'
            {
             before(grammarAccess.getSetPointStatementAccess().getFullStopKeyword_6()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRailSL.g:1808:1: rule__SetPointStatement__Group_2__0 : rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 ;
    public final void rule__SetPointStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1812:1: ( rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1 )
            // InternalRailSL.g:1813:2: rule__SetPointStatement__Group_2__0__Impl rule__SetPointStatement__Group_2__1
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
    // InternalRailSL.g:1820:1: rule__SetPointStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SetPointStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1824:1: ( ( ',' ) )
            // InternalRailSL.g:1825:1: ( ',' )
            {
            // InternalRailSL.g:1825:1: ( ',' )
            // InternalRailSL.g:1826:2: ','
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
    // InternalRailSL.g:1835:1: rule__SetPointStatement__Group_2__1 : rule__SetPointStatement__Group_2__1__Impl ;
    public final void rule__SetPointStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1839:1: ( rule__SetPointStatement__Group_2__1__Impl )
            // InternalRailSL.g:1840:2: rule__SetPointStatement__Group_2__1__Impl
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
    // InternalRailSL.g:1846:1: rule__SetPointStatement__Group_2__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) ;
    public final void rule__SetPointStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1850:1: ( ( ( rule__SetPointStatement__PointsAssignment_2_1 ) ) )
            // InternalRailSL.g:1851:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            {
            // InternalRailSL.g:1851:1: ( ( rule__SetPointStatement__PointsAssignment_2_1 ) )
            // InternalRailSL.g:1852:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_2_1()); 
            // InternalRailSL.g:1853:2: ( rule__SetPointStatement__PointsAssignment_2_1 )
            // InternalRailSL.g:1853:3: rule__SetPointStatement__PointsAssignment_2_1
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
    // InternalRailSL.g:1862:1: rule__SetPointStatement__Group_3_0__0 : rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 ;
    public final void rule__SetPointStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1866:1: ( rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1 )
            // InternalRailSL.g:1867:2: rule__SetPointStatement__Group_3_0__0__Impl rule__SetPointStatement__Group_3_0__1
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
    // InternalRailSL.g:1874:1: rule__SetPointStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__SetPointStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1878:1: ( ( 'and' ) )
            // InternalRailSL.g:1879:1: ( 'and' )
            {
            // InternalRailSL.g:1879:1: ( 'and' )
            // InternalRailSL.g:1880:2: 'and'
            {
             before(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_0_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRailSL.g:1889:1: rule__SetPointStatement__Group_3_0__1 : rule__SetPointStatement__Group_3_0__1__Impl ;
    public final void rule__SetPointStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1893:1: ( rule__SetPointStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:1894:2: rule__SetPointStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:1900:1: rule__SetPointStatement__Group_3_0__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1904:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:1905:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:1905:1: ( ( rule__SetPointStatement__PointsAssignment_3_0_1 ) )
            // InternalRailSL.g:1906:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_0_1()); 
            // InternalRailSL.g:1907:2: ( rule__SetPointStatement__PointsAssignment_3_0_1 )
            // InternalRailSL.g:1907:3: rule__SetPointStatement__PointsAssignment_3_0_1
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
    // InternalRailSL.g:1916:1: rule__SetPointStatement__Group_3_1__0 : rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 ;
    public final void rule__SetPointStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1920:1: ( rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1 )
            // InternalRailSL.g:1921:2: rule__SetPointStatement__Group_3_1__0__Impl rule__SetPointStatement__Group_3_1__1
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
    // InternalRailSL.g:1928:1: rule__SetPointStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__SetPointStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1932:1: ( ( ', and' ) )
            // InternalRailSL.g:1933:1: ( ', and' )
            {
            // InternalRailSL.g:1933:1: ( ', and' )
            // InternalRailSL.g:1934:2: ', and'
            {
             before(grammarAccess.getSetPointStatementAccess().getAndKeyword_3_1_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRailSL.g:1943:1: rule__SetPointStatement__Group_3_1__1 : rule__SetPointStatement__Group_3_1__1__Impl ;
    public final void rule__SetPointStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1947:1: ( rule__SetPointStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:1948:2: rule__SetPointStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:1954:1: rule__SetPointStatement__Group_3_1__1__Impl : ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) ;
    public final void rule__SetPointStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1958:1: ( ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:1959:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:1959:1: ( ( rule__SetPointStatement__PointsAssignment_3_1_1 ) )
            // InternalRailSL.g:1960:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            {
             before(grammarAccess.getSetPointStatementAccess().getPointsAssignment_3_1_1()); 
            // InternalRailSL.g:1961:2: ( rule__SetPointStatement__PointsAssignment_3_1_1 )
            // InternalRailSL.g:1961:3: rule__SetPointStatement__PointsAssignment_3_1_1
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
    // InternalRailSL.g:1970:1: rule__TimeWaitStatement__Group__0 : rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 ;
    public final void rule__TimeWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1974:1: ( rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1 )
            // InternalRailSL.g:1975:2: rule__TimeWaitStatement__Group__0__Impl rule__TimeWaitStatement__Group__1
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
    // InternalRailSL.g:1982:1: rule__TimeWaitStatement__Group__0__Impl : ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) ;
    public final void rule__TimeWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:1986:1: ( ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) ) )
            // InternalRailSL.g:1987:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            {
            // InternalRailSL.g:1987:1: ( ( ( 'Wait for' ) ) ( ( 'Wait for' )* ) )
            // InternalRailSL.g:1988:2: ( ( 'Wait for' ) ) ( ( 'Wait for' )* )
            {
            // InternalRailSL.g:1988:2: ( ( 'Wait for' ) )
            // InternalRailSL.g:1989:3: ( 'Wait for' )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1990:3: ( 'Wait for' )
            // InternalRailSL.g:1990:4: 'Wait for'
            {
            match(input,83,FOLLOW_15); 

            }

             after(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 

            }

            // InternalRailSL.g:1993:2: ( ( 'Wait for' )* )
            // InternalRailSL.g:1994:3: ( 'Wait for' )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0()); 
            // InternalRailSL.g:1995:3: ( 'Wait for' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==83) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRailSL.g:1995:4: 'Wait for'
            	    {
            	    match(input,83,FOLLOW_15); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRailSL.g:2004:1: rule__TimeWaitStatement__Group__1 : rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 ;
    public final void rule__TimeWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2008:1: ( rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2 )
            // InternalRailSL.g:2009:2: rule__TimeWaitStatement__Group__1__Impl rule__TimeWaitStatement__Group__2
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
    // InternalRailSL.g:2016:1: rule__TimeWaitStatement__Group__1__Impl : ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) ;
    public final void rule__TimeWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2020:1: ( ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) ) )
            // InternalRailSL.g:2021:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            {
            // InternalRailSL.g:2021:1: ( ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* ) )
            // InternalRailSL.g:2022:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) ) ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            {
            // InternalRailSL.g:2022:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 ) )
            // InternalRailSL.g:2023:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:2024:3: ( rule__TimeWaitStatement__TimeAssignment_1 )
            // InternalRailSL.g:2024:4: rule__TimeWaitStatement__TimeAssignment_1
            {
            pushFollow(FOLLOW_17);
            rule__TimeWaitStatement__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 

            }

            // InternalRailSL.g:2027:2: ( ( rule__TimeWaitStatement__TimeAssignment_1 )* )
            // InternalRailSL.g:2028:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            {
             before(grammarAccess.getTimeWaitStatementAccess().getTimeAssignment_1()); 
            // InternalRailSL.g:2029:3: ( rule__TimeWaitStatement__TimeAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_INT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRailSL.g:2029:4: rule__TimeWaitStatement__TimeAssignment_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TimeWaitStatement__TimeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRailSL.g:2038:1: rule__TimeWaitStatement__Group__2 : rule__TimeWaitStatement__Group__2__Impl ;
    public final void rule__TimeWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2042:1: ( rule__TimeWaitStatement__Group__2__Impl )
            // InternalRailSL.g:2043:2: rule__TimeWaitStatement__Group__2__Impl
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
    // InternalRailSL.g:2049:1: rule__TimeWaitStatement__Group__2__Impl : ( 'seconds.' ) ;
    public final void rule__TimeWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2053:1: ( ( 'seconds.' ) )
            // InternalRailSL.g:2054:1: ( 'seconds.' )
            {
            // InternalRailSL.g:2054:1: ( 'seconds.' )
            // InternalRailSL.g:2055:2: 'seconds.'
            {
             before(grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2()); 
            match(input,84,FOLLOW_2); 
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
    // InternalRailSL.g:2065:1: rule__ContactWaitStatement__Group__0 : rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 ;
    public final void rule__ContactWaitStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2069:1: ( rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1 )
            // InternalRailSL.g:2070:2: rule__ContactWaitStatement__Group__0__Impl rule__ContactWaitStatement__Group__1
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
    // InternalRailSL.g:2077:1: rule__ContactWaitStatement__Group__0__Impl : ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) ;
    public final void rule__ContactWaitStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2081:1: ( ( ( rule__ContactWaitStatement__EventAssignment_0 ) ) )
            // InternalRailSL.g:2082:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            {
            // InternalRailSL.g:2082:1: ( ( rule__ContactWaitStatement__EventAssignment_0 ) )
            // InternalRailSL.g:2083:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAssignment_0()); 
            // InternalRailSL.g:2084:2: ( rule__ContactWaitStatement__EventAssignment_0 )
            // InternalRailSL.g:2084:3: rule__ContactWaitStatement__EventAssignment_0
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
    // InternalRailSL.g:2092:1: rule__ContactWaitStatement__Group__1 : rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 ;
    public final void rule__ContactWaitStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2096:1: ( rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2 )
            // InternalRailSL.g:2097:2: rule__ContactWaitStatement__Group__1__Impl rule__ContactWaitStatement__Group__2
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
    // InternalRailSL.g:2104:1: rule__ContactWaitStatement__Group__1__Impl : ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) ;
    public final void rule__ContactWaitStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2108:1: ( ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) ) )
            // InternalRailSL.g:2109:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            {
            // InternalRailSL.g:2109:1: ( ( rule__ContactWaitStatement__ContactIndexAssignment_1 ) )
            // InternalRailSL.g:2110:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactIndexAssignment_1()); 
            // InternalRailSL.g:2111:2: ( rule__ContactWaitStatement__ContactIndexAssignment_1 )
            // InternalRailSL.g:2111:3: rule__ContactWaitStatement__ContactIndexAssignment_1
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
    // InternalRailSL.g:2119:1: rule__ContactWaitStatement__Group__2 : rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 ;
    public final void rule__ContactWaitStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2123:1: ( rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3 )
            // InternalRailSL.g:2124:2: rule__ContactWaitStatement__Group__2__Impl rule__ContactWaitStatement__Group__3
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
    // InternalRailSL.g:2131:1: rule__ContactWaitStatement__Group__2__Impl : ( 'contact of' ) ;
    public final void rule__ContactWaitStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2135:1: ( ( 'contact of' ) )
            // InternalRailSL.g:2136:1: ( 'contact of' )
            {
            // InternalRailSL.g:2136:1: ( 'contact of' )
            // InternalRailSL.g:2137:2: 'contact of'
            {
             before(grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2()); 
            match(input,85,FOLLOW_2); 
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
    // InternalRailSL.g:2146:1: rule__ContactWaitStatement__Group__3 : rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 ;
    public final void rule__ContactWaitStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2150:1: ( rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4 )
            // InternalRailSL.g:2151:2: rule__ContactWaitStatement__Group__3__Impl rule__ContactWaitStatement__Group__4
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
    // InternalRailSL.g:2158:1: rule__ContactWaitStatement__Group__3__Impl : ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) ;
    public final void rule__ContactWaitStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2162:1: ( ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:2163:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:2163:1: ( ( rule__ContactWaitStatement__SegNameAssignment_3 ) )
            // InternalRailSL.g:2164:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:2165:2: ( rule__ContactWaitStatement__SegNameAssignment_3 )
            // InternalRailSL.g:2165:3: rule__ContactWaitStatement__SegNameAssignment_3
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
    // InternalRailSL.g:2173:1: rule__ContactWaitStatement__Group__4 : rule__ContactWaitStatement__Group__4__Impl ;
    public final void rule__ContactWaitStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2177:1: ( rule__ContactWaitStatement__Group__4__Impl )
            // InternalRailSL.g:2178:2: rule__ContactWaitStatement__Group__4__Impl
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
    // InternalRailSL.g:2184:1: rule__ContactWaitStatement__Group__4__Impl : ( '.' ) ;
    public final void rule__ContactWaitStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2188:1: ( ( '.' ) )
            // InternalRailSL.g:2189:1: ( '.' )
            {
            // InternalRailSL.g:2189:1: ( '.' )
            // InternalRailSL.g:2190:2: '.'
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
    // InternalRailSL.g:2200:1: rule__CrossingStatement__Group__0 : rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 ;
    public final void rule__CrossingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2204:1: ( rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1 )
            // InternalRailSL.g:2205:2: rule__CrossingStatement__Group__0__Impl rule__CrossingStatement__Group__1
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
    // InternalRailSL.g:2212:1: rule__CrossingStatement__Group__0__Impl : ( ( rule__CrossingStatement__ModeAssignment_0 ) ) ;
    public final void rule__CrossingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2216:1: ( ( ( rule__CrossingStatement__ModeAssignment_0 ) ) )
            // InternalRailSL.g:2217:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            {
            // InternalRailSL.g:2217:1: ( ( rule__CrossingStatement__ModeAssignment_0 ) )
            // InternalRailSL.g:2218:2: ( rule__CrossingStatement__ModeAssignment_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAssignment_0()); 
            // InternalRailSL.g:2219:2: ( rule__CrossingStatement__ModeAssignment_0 )
            // InternalRailSL.g:2219:3: rule__CrossingStatement__ModeAssignment_0
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
    // InternalRailSL.g:2227:1: rule__CrossingStatement__Group__1 : rule__CrossingStatement__Group__1__Impl ;
    public final void rule__CrossingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2231:1: ( rule__CrossingStatement__Group__1__Impl )
            // InternalRailSL.g:2232:2: rule__CrossingStatement__Group__1__Impl
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
    // InternalRailSL.g:2238:1: rule__CrossingStatement__Group__1__Impl : ( 'crossing.' ) ;
    public final void rule__CrossingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2242:1: ( ( 'crossing.' ) )
            // InternalRailSL.g:2243:1: ( 'crossing.' )
            {
            // InternalRailSL.g:2243:1: ( 'crossing.' )
            // InternalRailSL.g:2244:2: 'crossing.'
            {
             before(grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1()); 
            match(input,86,FOLLOW_2); 
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
    // InternalRailSL.g:2254:1: rule__LightStatement__Group__0 : rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 ;
    public final void rule__LightStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2258:1: ( rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1 )
            // InternalRailSL.g:2259:2: rule__LightStatement__Group__0__Impl rule__LightStatement__Group__1
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
    // InternalRailSL.g:2266:1: rule__LightStatement__Group__0__Impl : ( 'Turn light' ) ;
    public final void rule__LightStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2270:1: ( ( 'Turn light' ) )
            // InternalRailSL.g:2271:1: ( 'Turn light' )
            {
            // InternalRailSL.g:2271:1: ( 'Turn light' )
            // InternalRailSL.g:2272:2: 'Turn light'
            {
             before(grammarAccess.getLightStatementAccess().getTurnLightKeyword_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalRailSL.g:2281:1: rule__LightStatement__Group__1 : rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 ;
    public final void rule__LightStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2285:1: ( rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2 )
            // InternalRailSL.g:2286:2: rule__LightStatement__Group__1__Impl rule__LightStatement__Group__2
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
    // InternalRailSL.g:2293:1: rule__LightStatement__Group__1__Impl : ( ( rule__LightStatement__LightsAssignment_1 ) ) ;
    public final void rule__LightStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2297:1: ( ( ( rule__LightStatement__LightsAssignment_1 ) ) )
            // InternalRailSL.g:2298:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            {
            // InternalRailSL.g:2298:1: ( ( rule__LightStatement__LightsAssignment_1 ) )
            // InternalRailSL.g:2299:2: ( rule__LightStatement__LightsAssignment_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_1()); 
            // InternalRailSL.g:2300:2: ( rule__LightStatement__LightsAssignment_1 )
            // InternalRailSL.g:2300:3: rule__LightStatement__LightsAssignment_1
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
    // InternalRailSL.g:2308:1: rule__LightStatement__Group__2 : rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 ;
    public final void rule__LightStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2312:1: ( rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3 )
            // InternalRailSL.g:2313:2: rule__LightStatement__Group__2__Impl rule__LightStatement__Group__3
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
    // InternalRailSL.g:2320:1: rule__LightStatement__Group__2__Impl : ( ( rule__LightStatement__Group_2__0 )* ) ;
    public final void rule__LightStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2324:1: ( ( ( rule__LightStatement__Group_2__0 )* ) )
            // InternalRailSL.g:2325:1: ( ( rule__LightStatement__Group_2__0 )* )
            {
            // InternalRailSL.g:2325:1: ( ( rule__LightStatement__Group_2__0 )* )
            // InternalRailSL.g:2326:2: ( rule__LightStatement__Group_2__0 )*
            {
             before(grammarAccess.getLightStatementAccess().getGroup_2()); 
            // InternalRailSL.g:2327:2: ( rule__LightStatement__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==78) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRailSL.g:2327:3: rule__LightStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LightStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRailSL.g:2335:1: rule__LightStatement__Group__3 : rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 ;
    public final void rule__LightStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2339:1: ( rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4 )
            // InternalRailSL.g:2340:2: rule__LightStatement__Group__3__Impl rule__LightStatement__Group__4
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
    // InternalRailSL.g:2347:1: rule__LightStatement__Group__3__Impl : ( ( rule__LightStatement__Alternatives_3 )? ) ;
    public final void rule__LightStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2351:1: ( ( ( rule__LightStatement__Alternatives_3 )? ) )
            // InternalRailSL.g:2352:1: ( ( rule__LightStatement__Alternatives_3 )? )
            {
            // InternalRailSL.g:2352:1: ( ( rule__LightStatement__Alternatives_3 )? )
            // InternalRailSL.g:2353:2: ( rule__LightStatement__Alternatives_3 )?
            {
             before(grammarAccess.getLightStatementAccess().getAlternatives_3()); 
            // InternalRailSL.g:2354:2: ( rule__LightStatement__Alternatives_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=79 && LA27_0<=80)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRailSL.g:2354:3: rule__LightStatement__Alternatives_3
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
    // InternalRailSL.g:2362:1: rule__LightStatement__Group__4 : rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 ;
    public final void rule__LightStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2366:1: ( rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5 )
            // InternalRailSL.g:2367:2: rule__LightStatement__Group__4__Impl rule__LightStatement__Group__5
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
    // InternalRailSL.g:2374:1: rule__LightStatement__Group__4__Impl : ( ( rule__LightStatement__StateAssignment_4 ) ) ;
    public final void rule__LightStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2378:1: ( ( ( rule__LightStatement__StateAssignment_4 ) ) )
            // InternalRailSL.g:2379:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            {
            // InternalRailSL.g:2379:1: ( ( rule__LightStatement__StateAssignment_4 ) )
            // InternalRailSL.g:2380:2: ( rule__LightStatement__StateAssignment_4 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAssignment_4()); 
            // InternalRailSL.g:2381:2: ( rule__LightStatement__StateAssignment_4 )
            // InternalRailSL.g:2381:3: rule__LightStatement__StateAssignment_4
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
    // InternalRailSL.g:2389:1: rule__LightStatement__Group__5 : rule__LightStatement__Group__5__Impl ;
    public final void rule__LightStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2393:1: ( rule__LightStatement__Group__5__Impl )
            // InternalRailSL.g:2394:2: rule__LightStatement__Group__5__Impl
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
    // InternalRailSL.g:2400:1: rule__LightStatement__Group__5__Impl : ( '.' ) ;
    public final void rule__LightStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2404:1: ( ( '.' ) )
            // InternalRailSL.g:2405:1: ( '.' )
            {
            // InternalRailSL.g:2405:1: ( '.' )
            // InternalRailSL.g:2406:2: '.'
            {
             before(grammarAccess.getLightStatementAccess().getFullStopKeyword_5()); 
            match(input,77,FOLLOW_2); 
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
    // InternalRailSL.g:2416:1: rule__LightStatement__Group_2__0 : rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 ;
    public final void rule__LightStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2420:1: ( rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1 )
            // InternalRailSL.g:2421:2: rule__LightStatement__Group_2__0__Impl rule__LightStatement__Group_2__1
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
    // InternalRailSL.g:2428:1: rule__LightStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LightStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2432:1: ( ( ',' ) )
            // InternalRailSL.g:2433:1: ( ',' )
            {
            // InternalRailSL.g:2433:1: ( ',' )
            // InternalRailSL.g:2434:2: ','
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
    // InternalRailSL.g:2443:1: rule__LightStatement__Group_2__1 : rule__LightStatement__Group_2__1__Impl ;
    public final void rule__LightStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2447:1: ( rule__LightStatement__Group_2__1__Impl )
            // InternalRailSL.g:2448:2: rule__LightStatement__Group_2__1__Impl
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
    // InternalRailSL.g:2454:1: rule__LightStatement__Group_2__1__Impl : ( ( rule__LightStatement__LightsAssignment_2_1 ) ) ;
    public final void rule__LightStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2458:1: ( ( ( rule__LightStatement__LightsAssignment_2_1 ) ) )
            // InternalRailSL.g:2459:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            {
            // InternalRailSL.g:2459:1: ( ( rule__LightStatement__LightsAssignment_2_1 ) )
            // InternalRailSL.g:2460:2: ( rule__LightStatement__LightsAssignment_2_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_2_1()); 
            // InternalRailSL.g:2461:2: ( rule__LightStatement__LightsAssignment_2_1 )
            // InternalRailSL.g:2461:3: rule__LightStatement__LightsAssignment_2_1
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
    // InternalRailSL.g:2470:1: rule__LightStatement__Group_3_0__0 : rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 ;
    public final void rule__LightStatement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2474:1: ( rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1 )
            // InternalRailSL.g:2475:2: rule__LightStatement__Group_3_0__0__Impl rule__LightStatement__Group_3_0__1
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
    // InternalRailSL.g:2482:1: rule__LightStatement__Group_3_0__0__Impl : ( 'and' ) ;
    public final void rule__LightStatement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2486:1: ( ( 'and' ) )
            // InternalRailSL.g:2487:1: ( 'and' )
            {
            // InternalRailSL.g:2487:1: ( 'and' )
            // InternalRailSL.g:2488:2: 'and'
            {
             before(grammarAccess.getLightStatementAccess().getAndKeyword_3_0_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalRailSL.g:2497:1: rule__LightStatement__Group_3_0__1 : rule__LightStatement__Group_3_0__1__Impl ;
    public final void rule__LightStatement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2501:1: ( rule__LightStatement__Group_3_0__1__Impl )
            // InternalRailSL.g:2502:2: rule__LightStatement__Group_3_0__1__Impl
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
    // InternalRailSL.g:2508:1: rule__LightStatement__Group_3_0__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) ;
    public final void rule__LightStatement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2512:1: ( ( ( rule__LightStatement__LightsAssignment_3_0_1 ) ) )
            // InternalRailSL.g:2513:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            {
            // InternalRailSL.g:2513:1: ( ( rule__LightStatement__LightsAssignment_3_0_1 ) )
            // InternalRailSL.g:2514:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_0_1()); 
            // InternalRailSL.g:2515:2: ( rule__LightStatement__LightsAssignment_3_0_1 )
            // InternalRailSL.g:2515:3: rule__LightStatement__LightsAssignment_3_0_1
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
    // InternalRailSL.g:2524:1: rule__LightStatement__Group_3_1__0 : rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 ;
    public final void rule__LightStatement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2528:1: ( rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1 )
            // InternalRailSL.g:2529:2: rule__LightStatement__Group_3_1__0__Impl rule__LightStatement__Group_3_1__1
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
    // InternalRailSL.g:2536:1: rule__LightStatement__Group_3_1__0__Impl : ( ', and' ) ;
    public final void rule__LightStatement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2540:1: ( ( ', and' ) )
            // InternalRailSL.g:2541:1: ( ', and' )
            {
            // InternalRailSL.g:2541:1: ( ', and' )
            // InternalRailSL.g:2542:2: ', and'
            {
             before(grammarAccess.getLightStatementAccess().getAndKeyword_3_1_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalRailSL.g:2551:1: rule__LightStatement__Group_3_1__1 : rule__LightStatement__Group_3_1__1__Impl ;
    public final void rule__LightStatement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2555:1: ( rule__LightStatement__Group_3_1__1__Impl )
            // InternalRailSL.g:2556:2: rule__LightStatement__Group_3_1__1__Impl
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
    // InternalRailSL.g:2562:1: rule__LightStatement__Group_3_1__1__Impl : ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) ;
    public final void rule__LightStatement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2566:1: ( ( ( rule__LightStatement__LightsAssignment_3_1_1 ) ) )
            // InternalRailSL.g:2567:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            {
            // InternalRailSL.g:2567:1: ( ( rule__LightStatement__LightsAssignment_3_1_1 ) )
            // InternalRailSL.g:2568:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            {
             before(grammarAccess.getLightStatementAccess().getLightsAssignment_3_1_1()); 
            // InternalRailSL.g:2569:2: ( rule__LightStatement__LightsAssignment_3_1_1 )
            // InternalRailSL.g:2569:3: rule__LightStatement__LightsAssignment_3_1_1
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
    // InternalRailSL.g:2578:1: rule__ConditionalStatement__Group__0 : rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 ;
    public final void rule__ConditionalStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2582:1: ( rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1 )
            // InternalRailSL.g:2583:2: rule__ConditionalStatement__Group__0__Impl rule__ConditionalStatement__Group__1
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
    // InternalRailSL.g:2590:1: rule__ConditionalStatement__Group__0__Impl : ( 'Branch:' ) ;
    public final void rule__ConditionalStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2594:1: ( ( 'Branch:' ) )
            // InternalRailSL.g:2595:1: ( 'Branch:' )
            {
            // InternalRailSL.g:2595:1: ( 'Branch:' )
            // InternalRailSL.g:2596:2: 'Branch:'
            {
             before(grammarAccess.getConditionalStatementAccess().getBranchKeyword_0()); 
            match(input,88,FOLLOW_2); 
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
    // InternalRailSL.g:2605:1: rule__ConditionalStatement__Group__1 : rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 ;
    public final void rule__ConditionalStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2609:1: ( rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2 )
            // InternalRailSL.g:2610:2: rule__ConditionalStatement__Group__1__Impl rule__ConditionalStatement__Group__2
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
    // InternalRailSL.g:2617:1: rule__ConditionalStatement__Group__1__Impl : ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) ;
    public final void rule__ConditionalStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2621:1: ( ( ( rule__ConditionalStatement__LinesAssignment_1 ) ) )
            // InternalRailSL.g:2622:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            {
            // InternalRailSL.g:2622:1: ( ( rule__ConditionalStatement__LinesAssignment_1 ) )
            // InternalRailSL.g:2623:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_1()); 
            // InternalRailSL.g:2624:2: ( rule__ConditionalStatement__LinesAssignment_1 )
            // InternalRailSL.g:2624:3: rule__ConditionalStatement__LinesAssignment_1
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
    // InternalRailSL.g:2632:1: rule__ConditionalStatement__Group__2 : rule__ConditionalStatement__Group__2__Impl ;
    public final void rule__ConditionalStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2636:1: ( rule__ConditionalStatement__Group__2__Impl )
            // InternalRailSL.g:2637:2: rule__ConditionalStatement__Group__2__Impl
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
    // InternalRailSL.g:2643:1: rule__ConditionalStatement__Group__2__Impl : ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) ;
    public final void rule__ConditionalStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2647:1: ( ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) ) )
            // InternalRailSL.g:2648:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            {
            // InternalRailSL.g:2648:1: ( ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* ) )
            // InternalRailSL.g:2649:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) ) ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            {
            // InternalRailSL.g:2649:2: ( ( rule__ConditionalStatement__LinesAssignment_2 ) )
            // InternalRailSL.g:2650:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2651:3: ( rule__ConditionalStatement__LinesAssignment_2 )
            // InternalRailSL.g:2651:4: rule__ConditionalStatement__LinesAssignment_2
            {
            pushFollow(FOLLOW_23);
            rule__ConditionalStatement__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 

            }

            // InternalRailSL.g:2654:2: ( ( rule__ConditionalStatement__LinesAssignment_2 )* )
            // InternalRailSL.g:2655:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            {
             before(grammarAccess.getConditionalStatementAccess().getLinesAssignment_2()); 
            // InternalRailSL.g:2656:3: ( rule__ConditionalStatement__LinesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==89) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRailSL.g:2656:4: rule__ConditionalStatement__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ConditionalStatement__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalRailSL.g:2666:1: rule__ConditionalLine__Group__0 : rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 ;
    public final void rule__ConditionalLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2670:1: ( rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1 )
            // InternalRailSL.g:2671:2: rule__ConditionalLine__Group__0__Impl rule__ConditionalLine__Group__1
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
    // InternalRailSL.g:2678:1: rule__ConditionalLine__Group__0__Impl : ( 'If' ) ;
    public final void rule__ConditionalLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2682:1: ( ( 'If' ) )
            // InternalRailSL.g:2683:1: ( 'If' )
            {
            // InternalRailSL.g:2683:1: ( 'If' )
            // InternalRailSL.g:2684:2: 'If'
            {
             before(grammarAccess.getConditionalLineAccess().getIfKeyword_0()); 
            match(input,89,FOLLOW_2); 
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
    // InternalRailSL.g:2693:1: rule__ConditionalLine__Group__1 : rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 ;
    public final void rule__ConditionalLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2697:1: ( rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2 )
            // InternalRailSL.g:2698:2: rule__ConditionalLine__Group__1__Impl rule__ConditionalLine__Group__2
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
    // InternalRailSL.g:2705:1: rule__ConditionalLine__Group__1__Impl : ( ( rule__ConditionalLine__ContactAssignment_1 ) ) ;
    public final void rule__ConditionalLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2709:1: ( ( ( rule__ConditionalLine__ContactAssignment_1 ) ) )
            // InternalRailSL.g:2710:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            {
            // InternalRailSL.g:2710:1: ( ( rule__ConditionalLine__ContactAssignment_1 ) )
            // InternalRailSL.g:2711:2: ( rule__ConditionalLine__ContactAssignment_1 )
            {
             before(grammarAccess.getConditionalLineAccess().getContactAssignment_1()); 
            // InternalRailSL.g:2712:2: ( rule__ConditionalLine__ContactAssignment_1 )
            // InternalRailSL.g:2712:3: rule__ConditionalLine__ContactAssignment_1
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
    // InternalRailSL.g:2720:1: rule__ConditionalLine__Group__2 : rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 ;
    public final void rule__ConditionalLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2724:1: ( rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3 )
            // InternalRailSL.g:2725:2: rule__ConditionalLine__Group__2__Impl rule__ConditionalLine__Group__3
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
    // InternalRailSL.g:2732:1: rule__ConditionalLine__Group__2__Impl : ( ( ( 'contact of' ) ) ( ( 'contact of' )* ) ) ;
    public final void rule__ConditionalLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2736:1: ( ( ( ( 'contact of' ) ) ( ( 'contact of' )* ) ) )
            // InternalRailSL.g:2737:1: ( ( ( 'contact of' ) ) ( ( 'contact of' )* ) )
            {
            // InternalRailSL.g:2737:1: ( ( ( 'contact of' ) ) ( ( 'contact of' )* ) )
            // InternalRailSL.g:2738:2: ( ( 'contact of' ) ) ( ( 'contact of' )* )
            {
            // InternalRailSL.g:2738:2: ( ( 'contact of' ) )
            // InternalRailSL.g:2739:3: ( 'contact of' )
            {
             before(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 
            // InternalRailSL.g:2740:3: ( 'contact of' )
            // InternalRailSL.g:2740:4: 'contact of'
            {
            match(input,85,FOLLOW_24); 

            }

             after(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 

            }

            // InternalRailSL.g:2743:2: ( ( 'contact of' )* )
            // InternalRailSL.g:2744:3: ( 'contact of' )*
            {
             before(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 
            // InternalRailSL.g:2745:3: ( 'contact of' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==85) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRailSL.g:2745:4: 'contact of'
            	    {
            	    match(input,85,FOLLOW_24); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getConditionalLineAccess().getContactOfKeyword_2()); 

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
    // $ANTLR end "rule__ConditionalLine__Group__2__Impl"


    // $ANTLR start "rule__ConditionalLine__Group__3"
    // InternalRailSL.g:2754:1: rule__ConditionalLine__Group__3 : rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 ;
    public final void rule__ConditionalLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2758:1: ( rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4 )
            // InternalRailSL.g:2759:2: rule__ConditionalLine__Group__3__Impl rule__ConditionalLine__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalRailSL.g:2766:1: rule__ConditionalLine__Group__3__Impl : ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) ;
    public final void rule__ConditionalLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2770:1: ( ( ( rule__ConditionalLine__SegNameAssignment_3 ) ) )
            // InternalRailSL.g:2771:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            {
            // InternalRailSL.g:2771:1: ( ( rule__ConditionalLine__SegNameAssignment_3 ) )
            // InternalRailSL.g:2772:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            {
             before(grammarAccess.getConditionalLineAccess().getSegNameAssignment_3()); 
            // InternalRailSL.g:2773:2: ( rule__ConditionalLine__SegNameAssignment_3 )
            // InternalRailSL.g:2773:3: rule__ConditionalLine__SegNameAssignment_3
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
    // InternalRailSL.g:2781:1: rule__ConditionalLine__Group__4 : rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 ;
    public final void rule__ConditionalLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2785:1: ( rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5 )
            // InternalRailSL.g:2786:2: rule__ConditionalLine__Group__4__Impl rule__ConditionalLine__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalRailSL.g:2793:1: rule__ConditionalLine__Group__4__Impl : ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) ;
    public final void rule__ConditionalLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2797:1: ( ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) ) )
            // InternalRailSL.g:2798:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            {
            // InternalRailSL.g:2798:1: ( ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* ) )
            // InternalRailSL.g:2799:2: ( ( 'is reached first, do' ) ) ( ( 'is reached first, do' )* )
            {
            // InternalRailSL.g:2799:2: ( ( 'is reached first, do' ) )
            // InternalRailSL.g:2800:3: ( 'is reached first, do' )
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2801:3: ( 'is reached first, do' )
            // InternalRailSL.g:2801:4: 'is reached first, do'
            {
            match(input,90,FOLLOW_27); 

            }

             after(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 

            }

            // InternalRailSL.g:2804:2: ( ( 'is reached first, do' )* )
            // InternalRailSL.g:2805:3: ( 'is reached first, do' )*
            {
             before(grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4()); 
            // InternalRailSL.g:2806:3: ( 'is reached first, do' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==90) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRailSL.g:2806:4: 'is reached first, do'
            	    {
            	    match(input,90,FOLLOW_27); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalRailSL.g:2815:1: rule__ConditionalLine__Group__5 : rule__ConditionalLine__Group__5__Impl ;
    public final void rule__ConditionalLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2819:1: ( rule__ConditionalLine__Group__5__Impl )
            // InternalRailSL.g:2820:2: rule__ConditionalLine__Group__5__Impl
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
    // InternalRailSL.g:2826:1: rule__ConditionalLine__Group__5__Impl : ( ( rule__ConditionalLine__BlockAssignment_5 ) ) ;
    public final void rule__ConditionalLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2830:1: ( ( ( rule__ConditionalLine__BlockAssignment_5 ) ) )
            // InternalRailSL.g:2831:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            {
            // InternalRailSL.g:2831:1: ( ( rule__ConditionalLine__BlockAssignment_5 ) )
            // InternalRailSL.g:2832:2: ( rule__ConditionalLine__BlockAssignment_5 )
            {
             before(grammarAccess.getConditionalLineAccess().getBlockAssignment_5()); 
            // InternalRailSL.g:2833:2: ( rule__ConditionalLine__BlockAssignment_5 )
            // InternalRailSL.g:2833:3: rule__ConditionalLine__BlockAssignment_5
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
    // InternalRailSL.g:2842:1: rule__Program__BlocksAssignment : ( ruleBlock ) ;
    public final void rule__Program__BlocksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2846:1: ( ( ruleBlock ) )
            // InternalRailSL.g:2847:2: ( ruleBlock )
            {
            // InternalRailSL.g:2847:2: ( ruleBlock )
            // InternalRailSL.g:2848:3: ruleBlock
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
    // InternalRailSL.g:2857:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2861:1: ( ( ruleStatement ) )
            // InternalRailSL.g:2862:2: ( ruleStatement )
            {
            // InternalRailSL.g:2862:2: ( ruleStatement )
            // InternalRailSL.g:2863:3: ruleStatement
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
    // InternalRailSL.g:2872:1: rule__Block__EndAssignment_2 : ( ruleBLOCK_END ) ;
    public final void rule__Block__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2876:1: ( ( ruleBLOCK_END ) )
            // InternalRailSL.g:2877:2: ( ruleBLOCK_END )
            {
            // InternalRailSL.g:2877:2: ( ruleBLOCK_END )
            // InternalRailSL.g:2878:3: ruleBLOCK_END
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
    // InternalRailSL.g:2887:1: rule__SetTrackStatement__SegmentsAssignment_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2891:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2892:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2892:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2893:3: ruleSEG_NAME
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
    // InternalRailSL.g:2902:1: rule__SetTrackStatement__SegmentsAssignment_2_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2906:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2907:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2907:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2908:3: ruleSEG_NAME
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


    // $ANTLR start "rule__SetTrackStatement__SegmentsAssignment_3_0_1"
    // InternalRailSL.g:2917:1: rule__SetTrackStatement__SegmentsAssignment_3_0_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2921:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2922:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2922:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2923:3: ruleSEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_3_0_1_0()); 

            }


            }

        }
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
    // InternalRailSL.g:2932:1: rule__SetTrackStatement__SegmentsAssignment_3_1_1 : ( ruleSEG_NAME ) ;
    public final void rule__SetTrackStatement__SegmentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2936:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:2937:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:2937:2: ( ruleSEG_NAME )
            // InternalRailSL.g:2938:3: ruleSEG_NAME
            {
             before(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_3_1_1_0()); 

            }


            }

        }
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
    // InternalRailSL.g:2947:1: rule__SetTrackStatement__ModeAssignment_5 : ( ruleTrackSetting ) ;
    public final void rule__SetTrackStatement__ModeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2951:1: ( ( ruleTrackSetting ) )
            // InternalRailSL.g:2952:2: ( ruleTrackSetting )
            {
            // InternalRailSL.g:2952:2: ( ruleTrackSetting )
            // InternalRailSL.g:2953:3: ruleTrackSetting
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
    // InternalRailSL.g:2962:1: rule__SetPointStatement__PointsAssignment_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2966:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2967:2: ( RULE_INT )
            {
            // InternalRailSL.g:2967:2: ( RULE_INT )
            // InternalRailSL.g:2968:3: RULE_INT
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
    // InternalRailSL.g:2977:1: rule__SetPointStatement__PointsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2981:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2982:2: ( RULE_INT )
            {
            // InternalRailSL.g:2982:2: ( RULE_INT )
            // InternalRailSL.g:2983:3: RULE_INT
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
    // InternalRailSL.g:2992:1: rule__SetPointStatement__PointsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:2996:1: ( ( RULE_INT ) )
            // InternalRailSL.g:2997:2: ( RULE_INT )
            {
            // InternalRailSL.g:2997:2: ( RULE_INT )
            // InternalRailSL.g:2998:3: RULE_INT
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
    // InternalRailSL.g:3007:1: rule__SetPointStatement__PointsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__SetPointStatement__PointsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3011:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3012:2: ( RULE_INT )
            {
            // InternalRailSL.g:3012:2: ( RULE_INT )
            // InternalRailSL.g:3013:3: RULE_INT
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
    // InternalRailSL.g:3022:1: rule__SetPointStatement__OrientationAssignment_5 : ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) ;
    public final void rule__SetPointStatement__OrientationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3026:1: ( ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) ) )
            // InternalRailSL.g:3027:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            {
            // InternalRailSL.g:3027:2: ( ( rule__SetPointStatement__OrientationAlternatives_5_0 ) )
            // InternalRailSL.g:3028:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            {
             before(grammarAccess.getSetPointStatementAccess().getOrientationAlternatives_5_0()); 
            // InternalRailSL.g:3029:3: ( rule__SetPointStatement__OrientationAlternatives_5_0 )
            // InternalRailSL.g:3029:4: rule__SetPointStatement__OrientationAlternatives_5_0
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
    // InternalRailSL.g:3037:1: rule__TimeWaitStatement__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__TimeWaitStatement__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3041:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3042:2: ( RULE_INT )
            {
            // InternalRailSL.g:3042:2: ( RULE_INT )
            // InternalRailSL.g:3043:3: RULE_INT
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
    // InternalRailSL.g:3052:1: rule__ContactWaitStatement__EventAssignment_0 : ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) ;
    public final void rule__ContactWaitStatement__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3056:1: ( ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) ) )
            // InternalRailSL.g:3057:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            {
            // InternalRailSL.g:3057:2: ( ( rule__ContactWaitStatement__EventAlternatives_0_0 ) )
            // InternalRailSL.g:3058:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            {
             before(grammarAccess.getContactWaitStatementAccess().getEventAlternatives_0_0()); 
            // InternalRailSL.g:3059:3: ( rule__ContactWaitStatement__EventAlternatives_0_0 )
            // InternalRailSL.g:3059:4: rule__ContactWaitStatement__EventAlternatives_0_0
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
    // InternalRailSL.g:3067:1: rule__ContactWaitStatement__ContactIndexAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ContactWaitStatement__ContactIndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3071:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:3072:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:3072:2: ( ruleContactIndex )
            // InternalRailSL.g:3073:3: ruleContactIndex
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
    // InternalRailSL.g:3082:1: rule__ContactWaitStatement__SegNameAssignment_3 : ( ruleSEG_NAME ) ;
    public final void rule__ContactWaitStatement__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3086:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:3087:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:3087:2: ( ruleSEG_NAME )
            // InternalRailSL.g:3088:3: ruleSEG_NAME
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
    // InternalRailSL.g:3097:1: rule__CrossingStatement__ModeAssignment_0 : ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) ;
    public final void rule__CrossingStatement__ModeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3101:1: ( ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) ) )
            // InternalRailSL.g:3102:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            {
            // InternalRailSL.g:3102:2: ( ( rule__CrossingStatement__ModeAlternatives_0_0 ) )
            // InternalRailSL.g:3103:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            {
             before(grammarAccess.getCrossingStatementAccess().getModeAlternatives_0_0()); 
            // InternalRailSL.g:3104:3: ( rule__CrossingStatement__ModeAlternatives_0_0 )
            // InternalRailSL.g:3104:4: rule__CrossingStatement__ModeAlternatives_0_0
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
    // InternalRailSL.g:3112:1: rule__LightStatement__LightsAssignment_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3116:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3117:2: ( RULE_INT )
            {
            // InternalRailSL.g:3117:2: ( RULE_INT )
            // InternalRailSL.g:3118:3: RULE_INT
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
    // InternalRailSL.g:3127:1: rule__LightStatement__LightsAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3131:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3132:2: ( RULE_INT )
            {
            // InternalRailSL.g:3132:2: ( RULE_INT )
            // InternalRailSL.g:3133:3: RULE_INT
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
    // InternalRailSL.g:3142:1: rule__LightStatement__LightsAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3146:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3147:2: ( RULE_INT )
            {
            // InternalRailSL.g:3147:2: ( RULE_INT )
            // InternalRailSL.g:3148:3: RULE_INT
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
    // InternalRailSL.g:3157:1: rule__LightStatement__LightsAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__LightStatement__LightsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3161:1: ( ( RULE_INT ) )
            // InternalRailSL.g:3162:2: ( RULE_INT )
            {
            // InternalRailSL.g:3162:2: ( RULE_INT )
            // InternalRailSL.g:3163:3: RULE_INT
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
    // InternalRailSL.g:3172:1: rule__LightStatement__StateAssignment_4 : ( ( rule__LightStatement__StateAlternatives_4_0 ) ) ;
    public final void rule__LightStatement__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3176:1: ( ( ( rule__LightStatement__StateAlternatives_4_0 ) ) )
            // InternalRailSL.g:3177:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            {
            // InternalRailSL.g:3177:2: ( ( rule__LightStatement__StateAlternatives_4_0 ) )
            // InternalRailSL.g:3178:3: ( rule__LightStatement__StateAlternatives_4_0 )
            {
             before(grammarAccess.getLightStatementAccess().getStateAlternatives_4_0()); 
            // InternalRailSL.g:3179:3: ( rule__LightStatement__StateAlternatives_4_0 )
            // InternalRailSL.g:3179:4: rule__LightStatement__StateAlternatives_4_0
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
    // InternalRailSL.g:3187:1: rule__ConditionalStatement__LinesAssignment_1 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3191:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:3192:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:3192:2: ( ruleConditionalLine )
            // InternalRailSL.g:3193:3: ruleConditionalLine
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
    // InternalRailSL.g:3202:1: rule__ConditionalStatement__LinesAssignment_2 : ( ruleConditionalLine ) ;
    public final void rule__ConditionalStatement__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3206:1: ( ( ruleConditionalLine ) )
            // InternalRailSL.g:3207:2: ( ruleConditionalLine )
            {
            // InternalRailSL.g:3207:2: ( ruleConditionalLine )
            // InternalRailSL.g:3208:3: ruleConditionalLine
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
    // InternalRailSL.g:3217:1: rule__ConditionalLine__ContactAssignment_1 : ( ruleContactIndex ) ;
    public final void rule__ConditionalLine__ContactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3221:1: ( ( ruleContactIndex ) )
            // InternalRailSL.g:3222:2: ( ruleContactIndex )
            {
            // InternalRailSL.g:3222:2: ( ruleContactIndex )
            // InternalRailSL.g:3223:3: ruleContactIndex
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
    // InternalRailSL.g:3232:1: rule__ConditionalLine__SegNameAssignment_3 : ( ruleSEG_NAME ) ;
    public final void rule__ConditionalLine__SegNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3236:1: ( ( ruleSEG_NAME ) )
            // InternalRailSL.g:3237:2: ( ruleSEG_NAME )
            {
            // InternalRailSL.g:3237:2: ( ruleSEG_NAME )
            // InternalRailSL.g:3238:3: ruleSEG_NAME
            {
             before(grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSEG_NAME();

            state._fsp--;

             after(grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMEParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalRailSL.g:3247:1: rule__ConditionalLine__BlockAssignment_5 : ( ruleBlock ) ;
    public final void rule__ConditionalLine__BlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRailSL.g:3251:1: ( ( ruleBlock ) )
            // InternalRailSL.g:3252:2: ( ruleBlock )
            {
            // InternalRailSL.g:3252:2: ( ruleBlock )
            // InternalRailSL.g:3253:3: ruleBlock
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003C0000L,0x00000000018C0800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C0002L,0x00000000018C0800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xFFFFFFFFFC000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x000000000001D000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L,0x000000000001C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});

}