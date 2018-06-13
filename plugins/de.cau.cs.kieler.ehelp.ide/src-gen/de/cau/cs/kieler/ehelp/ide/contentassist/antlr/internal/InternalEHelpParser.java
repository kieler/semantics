package de.cau.cs.kieler.ehelp.ide.contentassist.antlr.internal;

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
import de.cau.cs.kieler.ehelp.services.EHelpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEHelpParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'path'", "'home'", "'chapter'", "'{'", "'}'", "'list'", "'enum'", "'-'", "'table'", "'spacing'", "'='", "'|'", "'?'", "'!'", "'['", "']'", "'stretch'", "'center'", "'left'", "'right'", "'top'", "'middle'", "'bottom'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEHelpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEHelpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEHelpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEHelp.g"; }


    	private EHelpGrammarAccess grammarAccess;

    	public void setGrammarAccess(EHelpGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEHelpModel"
    // InternalEHelp.g:53:1: entryRuleEHelpModel : ruleEHelpModel EOF ;
    public final void entryRuleEHelpModel() throws RecognitionException {
        try {
            // InternalEHelp.g:54:1: ( ruleEHelpModel EOF )
            // InternalEHelp.g:55:1: ruleEHelpModel EOF
            {
             before(grammarAccess.getEHelpModelRule()); 
            pushFollow(FOLLOW_1);
            ruleEHelpModel();

            state._fsp--;

             after(grammarAccess.getEHelpModelRule()); 
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
    // $ANTLR end "entryRuleEHelpModel"


    // $ANTLR start "ruleEHelpModel"
    // InternalEHelp.g:62:1: ruleEHelpModel : ( ( rule__EHelpModel__Group__0 ) ) ;
    public final void ruleEHelpModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:66:2: ( ( ( rule__EHelpModel__Group__0 ) ) )
            // InternalEHelp.g:67:2: ( ( rule__EHelpModel__Group__0 ) )
            {
            // InternalEHelp.g:67:2: ( ( rule__EHelpModel__Group__0 ) )
            // InternalEHelp.g:68:3: ( rule__EHelpModel__Group__0 )
            {
             before(grammarAccess.getEHelpModelAccess().getGroup()); 
            // InternalEHelp.g:69:3: ( rule__EHelpModel__Group__0 )
            // InternalEHelp.g:69:4: rule__EHelpModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EHelpModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEHelpModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEHelpModel"


    // $ANTLR start "entryRuleConfig"
    // InternalEHelp.g:78:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalEHelp.g:79:1: ( ruleConfig EOF )
            // InternalEHelp.g:80:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalEHelp.g:87:1: ruleConfig : ( ( rule__Config__Alternatives ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:91:2: ( ( ( rule__Config__Alternatives ) ) )
            // InternalEHelp.g:92:2: ( ( rule__Config__Alternatives ) )
            {
            // InternalEHelp.g:92:2: ( ( rule__Config__Alternatives ) )
            // InternalEHelp.g:93:3: ( rule__Config__Alternatives )
            {
             before(grammarAccess.getConfigAccess().getAlternatives()); 
            // InternalEHelp.g:94:3: ( rule__Config__Alternatives )
            // InternalEHelp.g:94:4: rule__Config__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Config__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigPath"
    // InternalEHelp.g:103:1: entryRuleConfigPath : ruleConfigPath EOF ;
    public final void entryRuleConfigPath() throws RecognitionException {
        try {
            // InternalEHelp.g:104:1: ( ruleConfigPath EOF )
            // InternalEHelp.g:105:1: ruleConfigPath EOF
            {
             before(grammarAccess.getConfigPathRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigPath();

            state._fsp--;

             after(grammarAccess.getConfigPathRule()); 
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
    // $ANTLR end "entryRuleConfigPath"


    // $ANTLR start "ruleConfigPath"
    // InternalEHelp.g:112:1: ruleConfigPath : ( ( rule__ConfigPath__Group__0 ) ) ;
    public final void ruleConfigPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:116:2: ( ( ( rule__ConfigPath__Group__0 ) ) )
            // InternalEHelp.g:117:2: ( ( rule__ConfigPath__Group__0 ) )
            {
            // InternalEHelp.g:117:2: ( ( rule__ConfigPath__Group__0 ) )
            // InternalEHelp.g:118:3: ( rule__ConfigPath__Group__0 )
            {
             before(grammarAccess.getConfigPathAccess().getGroup()); 
            // InternalEHelp.g:119:3: ( rule__ConfigPath__Group__0 )
            // InternalEHelp.g:119:4: rule__ConfigPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigPath"


    // $ANTLR start "entryRuleConfigHome"
    // InternalEHelp.g:128:1: entryRuleConfigHome : ruleConfigHome EOF ;
    public final void entryRuleConfigHome() throws RecognitionException {
        try {
            // InternalEHelp.g:129:1: ( ruleConfigHome EOF )
            // InternalEHelp.g:130:1: ruleConfigHome EOF
            {
             before(grammarAccess.getConfigHomeRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigHome();

            state._fsp--;

             after(grammarAccess.getConfigHomeRule()); 
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
    // $ANTLR end "entryRuleConfigHome"


    // $ANTLR start "ruleConfigHome"
    // InternalEHelp.g:137:1: ruleConfigHome : ( ( rule__ConfigHome__Group__0 ) ) ;
    public final void ruleConfigHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:141:2: ( ( ( rule__ConfigHome__Group__0 ) ) )
            // InternalEHelp.g:142:2: ( ( rule__ConfigHome__Group__0 ) )
            {
            // InternalEHelp.g:142:2: ( ( rule__ConfigHome__Group__0 ) )
            // InternalEHelp.g:143:3: ( rule__ConfigHome__Group__0 )
            {
             before(grammarAccess.getConfigHomeAccess().getGroup()); 
            // InternalEHelp.g:144:3: ( rule__ConfigHome__Group__0 )
            // InternalEHelp.g:144:4: rule__ConfigHome__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigHome__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigHomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigHome"


    // $ANTLR start "entryRuleChapter"
    // InternalEHelp.g:153:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalEHelp.g:154:1: ( ruleChapter EOF )
            // InternalEHelp.g:155:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterRule()); 
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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalEHelp.g:162:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:166:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalEHelp.g:167:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalEHelp.g:167:2: ( ( rule__Chapter__Group__0 ) )
            // InternalEHelp.g:168:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalEHelp.g:169:3: ( rule__Chapter__Group__0 )
            // InternalEHelp.g:169:4: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleList"
    // InternalEHelp.g:178:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalEHelp.g:179:1: ( ruleList EOF )
            // InternalEHelp.g:180:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalEHelp.g:187:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:191:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalEHelp.g:192:2: ( ( rule__List__Group__0 ) )
            {
            // InternalEHelp.g:192:2: ( ( rule__List__Group__0 ) )
            // InternalEHelp.g:193:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalEHelp.g:194:3: ( rule__List__Group__0 )
            // InternalEHelp.g:194:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleEnum"
    // InternalEHelp.g:203:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalEHelp.g:204:1: ( ruleEnum EOF )
            // InternalEHelp.g:205:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalEHelp.g:212:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:216:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalEHelp.g:217:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalEHelp.g:217:2: ( ( rule__Enum__Group__0 ) )
            // InternalEHelp.g:218:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalEHelp.g:219:3: ( rule__Enum__Group__0 )
            // InternalEHelp.g:219:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleListItem"
    // InternalEHelp.g:228:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalEHelp.g:229:1: ( ruleListItem EOF )
            // InternalEHelp.g:230:1: ruleListItem EOF
            {
             before(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListItemRule()); 
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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalEHelp.g:237:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:241:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalEHelp.g:242:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalEHelp.g:242:2: ( ( rule__ListItem__Group__0 ) )
            // InternalEHelp.g:243:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalEHelp.g:244:3: ( rule__ListItem__Group__0 )
            // InternalEHelp.g:244:4: rule__ListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleContent"
    // InternalEHelp.g:253:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalEHelp.g:254:1: ( ruleContent EOF )
            // InternalEHelp.g:255:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalEHelp.g:262:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:266:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalEHelp.g:267:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalEHelp.g:267:2: ( ( rule__Content__Alternatives ) )
            // InternalEHelp.g:268:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalEHelp.g:269:3: ( rule__Content__Alternatives )
            // InternalEHelp.g:269:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTable"
    // InternalEHelp.g:278:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalEHelp.g:279:1: ( ruleTable EOF )
            // InternalEHelp.g:280:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalEHelp.g:287:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:291:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalEHelp.g:292:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalEHelp.g:292:2: ( ( rule__Table__Group__0 ) )
            // InternalEHelp.g:293:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalEHelp.g:294:3: ( rule__Table__Group__0 )
            // InternalEHelp.g:294:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalEHelp.g:303:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalEHelp.g:304:1: ( ruleTableRow EOF )
            // InternalEHelp.g:305:1: ruleTableRow EOF
            {
             before(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableRowRule()); 
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
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalEHelp.g:312:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:316:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalEHelp.g:317:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalEHelp.g:317:2: ( ( rule__TableRow__Group__0 ) )
            // InternalEHelp.g:318:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalEHelp.g:319:3: ( rule__TableRow__Group__0 )
            // InternalEHelp.g:319:4: rule__TableRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCell"
    // InternalEHelp.g:328:1: entryRuleTableCell : ruleTableCell EOF ;
    public final void entryRuleTableCell() throws RecognitionException {
        try {
            // InternalEHelp.g:329:1: ( ruleTableCell EOF )
            // InternalEHelp.g:330:1: ruleTableCell EOF
            {
             before(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_1);
            ruleTableCell();

            state._fsp--;

             after(grammarAccess.getTableCellRule()); 
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
    // $ANTLR end "entryRuleTableCell"


    // $ANTLR start "ruleTableCell"
    // InternalEHelp.g:337:1: ruleTableCell : ( ( rule__TableCell__Group__0 ) ) ;
    public final void ruleTableCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:341:2: ( ( ( rule__TableCell__Group__0 ) ) )
            // InternalEHelp.g:342:2: ( ( rule__TableCell__Group__0 ) )
            {
            // InternalEHelp.g:342:2: ( ( rule__TableCell__Group__0 ) )
            // InternalEHelp.g:343:3: ( rule__TableCell__Group__0 )
            {
             before(grammarAccess.getTableCellAccess().getGroup()); 
            // InternalEHelp.g:344:3: ( rule__TableCell__Group__0 )
            // InternalEHelp.g:344:4: rule__TableCell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableCell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableCell"


    // $ANTLR start "entryRuleText"
    // InternalEHelp.g:353:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalEHelp.g:354:1: ( ruleText EOF )
            // InternalEHelp.g:355:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalEHelp.g:362:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:366:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalEHelp.g:367:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalEHelp.g:367:2: ( ( rule__Text__TextAssignment ) )
            // InternalEHelp.g:368:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalEHelp.g:369:3: ( rule__Text__TextAssignment )
            // InternalEHelp.g:369:4: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleKeyword"
    // InternalEHelp.g:378:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalEHelp.g:379:1: ( ruleKeyword EOF )
            // InternalEHelp.g:380:1: ruleKeyword EOF
            {
             before(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyword();

            state._fsp--;

             after(grammarAccess.getKeywordRule()); 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalEHelp.g:387:1: ruleKeyword : ( ( rule__Keyword__Group__0 ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:391:2: ( ( ( rule__Keyword__Group__0 ) ) )
            // InternalEHelp.g:392:2: ( ( rule__Keyword__Group__0 ) )
            {
            // InternalEHelp.g:392:2: ( ( rule__Keyword__Group__0 ) )
            // InternalEHelp.g:393:3: ( rule__Keyword__Group__0 )
            {
             before(grammarAccess.getKeywordAccess().getGroup()); 
            // InternalEHelp.g:394:3: ( rule__Keyword__Group__0 )
            // InternalEHelp.g:394:4: rule__Keyword__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleContext"
    // InternalEHelp.g:403:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalEHelp.g:404:1: ( ruleContext EOF )
            // InternalEHelp.g:405:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalEHelp.g:412:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:416:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalEHelp.g:417:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalEHelp.g:417:2: ( ( rule__Context__Group__0 ) )
            // InternalEHelp.g:418:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalEHelp.g:419:3: ( rule__Context__Group__0 )
            // InternalEHelp.g:419:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleImages"
    // InternalEHelp.g:428:1: entryRuleImages : ruleImages EOF ;
    public final void entryRuleImages() throws RecognitionException {
        try {
            // InternalEHelp.g:429:1: ( ruleImages EOF )
            // InternalEHelp.g:430:1: ruleImages EOF
            {
             before(grammarAccess.getImagesRule()); 
            pushFollow(FOLLOW_1);
            ruleImages();

            state._fsp--;

             after(grammarAccess.getImagesRule()); 
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
    // $ANTLR end "entryRuleImages"


    // $ANTLR start "ruleImages"
    // InternalEHelp.g:437:1: ruleImages : ( ( rule__Images__Group__0 ) ) ;
    public final void ruleImages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:441:2: ( ( ( rule__Images__Group__0 ) ) )
            // InternalEHelp.g:442:2: ( ( rule__Images__Group__0 ) )
            {
            // InternalEHelp.g:442:2: ( ( rule__Images__Group__0 ) )
            // InternalEHelp.g:443:3: ( rule__Images__Group__0 )
            {
             before(grammarAccess.getImagesAccess().getGroup()); 
            // InternalEHelp.g:444:3: ( rule__Images__Group__0 )
            // InternalEHelp.g:444:4: rule__Images__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Images__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImages"


    // $ANTLR start "entryRuleLink"
    // InternalEHelp.g:453:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalEHelp.g:454:1: ( ruleLink EOF )
            // InternalEHelp.g:455:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalEHelp.g:462:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:466:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalEHelp.g:467:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalEHelp.g:467:2: ( ( rule__Link__Group__0 ) )
            // InternalEHelp.g:468:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalEHelp.g:469:3: ( rule__Link__Group__0 )
            // InternalEHelp.g:469:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "rule__Config__Alternatives"
    // InternalEHelp.g:477:1: rule__Config__Alternatives : ( ( ruleConfigPath ) | ( ruleConfigHome ) );
    public final void rule__Config__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:481:1: ( ( ruleConfigPath ) | ( ruleConfigHome ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    alt1=2;
                }
                else if ( (LA1_1==12) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEHelp.g:482:2: ( ruleConfigPath )
                    {
                    // InternalEHelp.g:482:2: ( ruleConfigPath )
                    // InternalEHelp.g:483:3: ruleConfigPath
                    {
                     before(grammarAccess.getConfigAccess().getConfigPathParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigPath();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getConfigPathParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHelp.g:488:2: ( ruleConfigHome )
                    {
                    // InternalEHelp.g:488:2: ( ruleConfigHome )
                    // InternalEHelp.g:489:3: ruleConfigHome
                    {
                     before(grammarAccess.getConfigAccess().getConfigHomeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigHome();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getConfigHomeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Config__Alternatives"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalEHelp.g:498:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:502:1: ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEHelp.g:503:2: ( ruleKeyword )
                    {
                    // InternalEHelp.g:503:2: ( ruleKeyword )
                    // InternalEHelp.g:504:3: ruleKeyword
                    {
                     before(grammarAccess.getContentAccess().getKeywordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyword();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getKeywordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHelp.g:509:2: ( ruleContext )
                    {
                    // InternalEHelp.g:509:2: ( ruleContext )
                    // InternalEHelp.g:510:3: ruleContext
                    {
                     before(grammarAccess.getContentAccess().getContextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContext();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getContextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEHelp.g:515:2: ( ruleText )
                    {
                    // InternalEHelp.g:515:2: ( ruleText )
                    // InternalEHelp.g:516:3: ruleText
                    {
                     before(grammarAccess.getContentAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEHelp.g:521:2: ( ruleImages )
                    {
                    // InternalEHelp.g:521:2: ( ruleImages )
                    // InternalEHelp.g:522:3: ruleImages
                    {
                     before(grammarAccess.getContentAccess().getImagesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImages();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getImagesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEHelp.g:527:2: ( ruleLink )
                    {
                    // InternalEHelp.g:527:2: ( ruleLink )
                    // InternalEHelp.g:528:3: ruleLink
                    {
                     before(grammarAccess.getContentAccess().getLinkParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getLinkParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEHelp.g:533:2: ( ruleList )
                    {
                    // InternalEHelp.g:533:2: ( ruleList )
                    // InternalEHelp.g:534:3: ruleList
                    {
                     before(grammarAccess.getContentAccess().getListParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEHelp.g:539:2: ( ruleEnum )
                    {
                    // InternalEHelp.g:539:2: ( ruleEnum )
                    // InternalEHelp.g:540:3: ruleEnum
                    {
                     before(grammarAccess.getContentAccess().getEnumParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEnumParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalEHelp.g:545:2: ( ruleTable )
                    {
                    // InternalEHelp.g:545:2: ( ruleTable )
                    // InternalEHelp.g:546:3: ruleTable
                    {
                     before(grammarAccess.getContentAccess().getTableParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getTableParserRuleCall_7()); 

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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__EHelpModel__Group__0"
    // InternalEHelp.g:555:1: rule__EHelpModel__Group__0 : rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1 ;
    public final void rule__EHelpModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:559:1: ( rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1 )
            // InternalEHelp.g:560:2: rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EHelpModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EHelpModel__Group__1();

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
    // $ANTLR end "rule__EHelpModel__Group__0"


    // $ANTLR start "rule__EHelpModel__Group__0__Impl"
    // InternalEHelp.g:567:1: rule__EHelpModel__Group__0__Impl : ( ( rule__EHelpModel__ConfigsAssignment_0 )* ) ;
    public final void rule__EHelpModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:571:1: ( ( ( rule__EHelpModel__ConfigsAssignment_0 )* ) )
            // InternalEHelp.g:572:1: ( ( rule__EHelpModel__ConfigsAssignment_0 )* )
            {
            // InternalEHelp.g:572:1: ( ( rule__EHelpModel__ConfigsAssignment_0 )* )
            // InternalEHelp.g:573:2: ( rule__EHelpModel__ConfigsAssignment_0 )*
            {
             before(grammarAccess.getEHelpModelAccess().getConfigsAssignment_0()); 
            // InternalEHelp.g:574:2: ( rule__EHelpModel__ConfigsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEHelp.g:574:3: rule__EHelpModel__ConfigsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EHelpModel__ConfigsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEHelpModelAccess().getConfigsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EHelpModel__Group__0__Impl"


    // $ANTLR start "rule__EHelpModel__Group__1"
    // InternalEHelp.g:582:1: rule__EHelpModel__Group__1 : rule__EHelpModel__Group__1__Impl ;
    public final void rule__EHelpModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:586:1: ( rule__EHelpModel__Group__1__Impl )
            // InternalEHelp.g:587:2: rule__EHelpModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EHelpModel__Group__1__Impl();

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
    // $ANTLR end "rule__EHelpModel__Group__1"


    // $ANTLR start "rule__EHelpModel__Group__1__Impl"
    // InternalEHelp.g:593:1: rule__EHelpModel__Group__1__Impl : ( ( rule__EHelpModel__ChaptersAssignment_1 )* ) ;
    public final void rule__EHelpModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:597:1: ( ( ( rule__EHelpModel__ChaptersAssignment_1 )* ) )
            // InternalEHelp.g:598:1: ( ( rule__EHelpModel__ChaptersAssignment_1 )* )
            {
            // InternalEHelp.g:598:1: ( ( rule__EHelpModel__ChaptersAssignment_1 )* )
            // InternalEHelp.g:599:2: ( rule__EHelpModel__ChaptersAssignment_1 )*
            {
             before(grammarAccess.getEHelpModelAccess().getChaptersAssignment_1()); 
            // InternalEHelp.g:600:2: ( rule__EHelpModel__ChaptersAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEHelp.g:600:3: rule__EHelpModel__ChaptersAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EHelpModel__ChaptersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEHelpModelAccess().getChaptersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EHelpModel__Group__1__Impl"


    // $ANTLR start "rule__ConfigPath__Group__0"
    // InternalEHelp.g:609:1: rule__ConfigPath__Group__0 : rule__ConfigPath__Group__0__Impl rule__ConfigPath__Group__1 ;
    public final void rule__ConfigPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:613:1: ( rule__ConfigPath__Group__0__Impl rule__ConfigPath__Group__1 )
            // InternalEHelp.g:614:2: rule__ConfigPath__Group__0__Impl rule__ConfigPath__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfigPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigPath__Group__1();

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
    // $ANTLR end "rule__ConfigPath__Group__0"


    // $ANTLR start "rule__ConfigPath__Group__0__Impl"
    // InternalEHelp.g:621:1: rule__ConfigPath__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:625:1: ( ( 'config' ) )
            // InternalEHelp.g:626:1: ( 'config' )
            {
            // InternalEHelp.g:626:1: ( 'config' )
            // InternalEHelp.g:627:2: 'config'
            {
             before(grammarAccess.getConfigPathAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConfigPathAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigPath__Group__0__Impl"


    // $ANTLR start "rule__ConfigPath__Group__1"
    // InternalEHelp.g:636:1: rule__ConfigPath__Group__1 : rule__ConfigPath__Group__1__Impl rule__ConfigPath__Group__2 ;
    public final void rule__ConfigPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:640:1: ( rule__ConfigPath__Group__1__Impl rule__ConfigPath__Group__2 )
            // InternalEHelp.g:641:2: rule__ConfigPath__Group__1__Impl rule__ConfigPath__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConfigPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigPath__Group__2();

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
    // $ANTLR end "rule__ConfigPath__Group__1"


    // $ANTLR start "rule__ConfigPath__Group__1__Impl"
    // InternalEHelp.g:648:1: rule__ConfigPath__Group__1__Impl : ( 'path' ) ;
    public final void rule__ConfigPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:652:1: ( ( 'path' ) )
            // InternalEHelp.g:653:1: ( 'path' )
            {
            // InternalEHelp.g:653:1: ( 'path' )
            // InternalEHelp.g:654:2: 'path'
            {
             before(grammarAccess.getConfigPathAccess().getPathKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigPathAccess().getPathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigPath__Group__1__Impl"


    // $ANTLR start "rule__ConfigPath__Group__2"
    // InternalEHelp.g:663:1: rule__ConfigPath__Group__2 : rule__ConfigPath__Group__2__Impl ;
    public final void rule__ConfigPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:667:1: ( rule__ConfigPath__Group__2__Impl )
            // InternalEHelp.g:668:2: rule__ConfigPath__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigPath__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigPath__Group__2"


    // $ANTLR start "rule__ConfigPath__Group__2__Impl"
    // InternalEHelp.g:674:1: rule__ConfigPath__Group__2__Impl : ( ( rule__ConfigPath__PathAssignment_2 ) ) ;
    public final void rule__ConfigPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:678:1: ( ( ( rule__ConfigPath__PathAssignment_2 ) ) )
            // InternalEHelp.g:679:1: ( ( rule__ConfigPath__PathAssignment_2 ) )
            {
            // InternalEHelp.g:679:1: ( ( rule__ConfigPath__PathAssignment_2 ) )
            // InternalEHelp.g:680:2: ( rule__ConfigPath__PathAssignment_2 )
            {
             before(grammarAccess.getConfigPathAccess().getPathAssignment_2()); 
            // InternalEHelp.g:681:2: ( rule__ConfigPath__PathAssignment_2 )
            // InternalEHelp.g:681:3: rule__ConfigPath__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigPath__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigPathAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigPath__Group__2__Impl"


    // $ANTLR start "rule__ConfigHome__Group__0"
    // InternalEHelp.g:690:1: rule__ConfigHome__Group__0 : rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1 ;
    public final void rule__ConfigHome__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:694:1: ( rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1 )
            // InternalEHelp.g:695:2: rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConfigHome__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigHome__Group__1();

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
    // $ANTLR end "rule__ConfigHome__Group__0"


    // $ANTLR start "rule__ConfigHome__Group__0__Impl"
    // InternalEHelp.g:702:1: rule__ConfigHome__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigHome__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:706:1: ( ( 'config' ) )
            // InternalEHelp.g:707:1: ( 'config' )
            {
            // InternalEHelp.g:707:1: ( 'config' )
            // InternalEHelp.g:708:2: 'config'
            {
             before(grammarAccess.getConfigHomeAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConfigHomeAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigHome__Group__0__Impl"


    // $ANTLR start "rule__ConfigHome__Group__1"
    // InternalEHelp.g:717:1: rule__ConfigHome__Group__1 : rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2 ;
    public final void rule__ConfigHome__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:721:1: ( rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2 )
            // InternalEHelp.g:722:2: rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConfigHome__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigHome__Group__2();

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
    // $ANTLR end "rule__ConfigHome__Group__1"


    // $ANTLR start "rule__ConfigHome__Group__1__Impl"
    // InternalEHelp.g:729:1: rule__ConfigHome__Group__1__Impl : ( 'home' ) ;
    public final void rule__ConfigHome__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:733:1: ( ( 'home' ) )
            // InternalEHelp.g:734:1: ( 'home' )
            {
            // InternalEHelp.g:734:1: ( 'home' )
            // InternalEHelp.g:735:2: 'home'
            {
             before(grammarAccess.getConfigHomeAccess().getHomeKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigHomeAccess().getHomeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigHome__Group__1__Impl"


    // $ANTLR start "rule__ConfigHome__Group__2"
    // InternalEHelp.g:744:1: rule__ConfigHome__Group__2 : rule__ConfigHome__Group__2__Impl ;
    public final void rule__ConfigHome__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:748:1: ( rule__ConfigHome__Group__2__Impl )
            // InternalEHelp.g:749:2: rule__ConfigHome__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigHome__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigHome__Group__2"


    // $ANTLR start "rule__ConfigHome__Group__2__Impl"
    // InternalEHelp.g:755:1: rule__ConfigHome__Group__2__Impl : ( ( rule__ConfigHome__HomeAssignment_2 ) ) ;
    public final void rule__ConfigHome__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:759:1: ( ( ( rule__ConfigHome__HomeAssignment_2 ) ) )
            // InternalEHelp.g:760:1: ( ( rule__ConfigHome__HomeAssignment_2 ) )
            {
            // InternalEHelp.g:760:1: ( ( rule__ConfigHome__HomeAssignment_2 ) )
            // InternalEHelp.g:761:2: ( rule__ConfigHome__HomeAssignment_2 )
            {
             before(grammarAccess.getConfigHomeAccess().getHomeAssignment_2()); 
            // InternalEHelp.g:762:2: ( rule__ConfigHome__HomeAssignment_2 )
            // InternalEHelp.g:762:3: rule__ConfigHome__HomeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigHome__HomeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigHomeAccess().getHomeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigHome__Group__2__Impl"


    // $ANTLR start "rule__Chapter__Group__0"
    // InternalEHelp.g:771:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:775:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalEHelp.g:776:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Chapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__1();

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
    // $ANTLR end "rule__Chapter__Group__0"


    // $ANTLR start "rule__Chapter__Group__0__Impl"
    // InternalEHelp.g:783:1: rule__Chapter__Group__0__Impl : ( 'chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:787:1: ( ( 'chapter' ) )
            // InternalEHelp.g:788:1: ( 'chapter' )
            {
            // InternalEHelp.g:788:1: ( 'chapter' )
            // InternalEHelp.g:789:2: 'chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__0__Impl"


    // $ANTLR start "rule__Chapter__Group__1"
    // InternalEHelp.g:798:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:802:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalEHelp.g:803:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Chapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__2();

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
    // $ANTLR end "rule__Chapter__Group__1"


    // $ANTLR start "rule__Chapter__Group__1__Impl"
    // InternalEHelp.g:810:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__NameAssignment_1 )? ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:814:1: ( ( ( rule__Chapter__NameAssignment_1 )? ) )
            // InternalEHelp.g:815:1: ( ( rule__Chapter__NameAssignment_1 )? )
            {
            // InternalEHelp.g:815:1: ( ( rule__Chapter__NameAssignment_1 )? )
            // InternalEHelp.g:816:2: ( rule__Chapter__NameAssignment_1 )?
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1()); 
            // InternalEHelp.g:817:2: ( rule__Chapter__NameAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEHelp.g:817:3: rule__Chapter__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChapterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__1__Impl"


    // $ANTLR start "rule__Chapter__Group__2"
    // InternalEHelp.g:825:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:829:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalEHelp.g:830:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Chapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__3();

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
    // $ANTLR end "rule__Chapter__Group__2"


    // $ANTLR start "rule__Chapter__Group__2__Impl"
    // InternalEHelp.g:837:1: rule__Chapter__Group__2__Impl : ( ( rule__Chapter__TitleAssignment_2 ) ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:841:1: ( ( ( rule__Chapter__TitleAssignment_2 ) ) )
            // InternalEHelp.g:842:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            {
            // InternalEHelp.g:842:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            // InternalEHelp.g:843:2: ( rule__Chapter__TitleAssignment_2 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_2()); 
            // InternalEHelp.g:844:2: ( rule__Chapter__TitleAssignment_2 )
            // InternalEHelp.g:844:3: rule__Chapter__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__2__Impl"


    // $ANTLR start "rule__Chapter__Group__3"
    // InternalEHelp.g:852:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:856:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalEHelp.g:857:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4();

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
    // $ANTLR end "rule__Chapter__Group__3"


    // $ANTLR start "rule__Chapter__Group__3__Impl"
    // InternalEHelp.g:864:1: rule__Chapter__Group__3__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:868:1: ( ( '{' ) )
            // InternalEHelp.g:869:1: ( '{' )
            {
            // InternalEHelp.g:869:1: ( '{' )
            // InternalEHelp.g:870:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__3__Impl"


    // $ANTLR start "rule__Chapter__Group__4"
    // InternalEHelp.g:879:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:883:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // InternalEHelp.g:884:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__5();

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
    // $ANTLR end "rule__Chapter__Group__4"


    // $ANTLR start "rule__Chapter__Group__4__Impl"
    // InternalEHelp.g:891:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__ContentAssignment_4 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:895:1: ( ( ( rule__Chapter__ContentAssignment_4 )* ) )
            // InternalEHelp.g:896:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            {
            // InternalEHelp.g:896:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            // InternalEHelp.g:897:2: ( rule__Chapter__ContentAssignment_4 )*
            {
             before(grammarAccess.getChapterAccess().getContentAssignment_4()); 
            // InternalEHelp.g:898:2: ( rule__Chapter__ContentAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||(LA6_0>=17 && LA6_0<=18)||LA6_0==20||(LA6_0>=24 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEHelp.g:898:3: rule__Chapter__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Chapter__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__4__Impl"


    // $ANTLR start "rule__Chapter__Group__5"
    // InternalEHelp.g:906:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:910:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // InternalEHelp.g:911:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__6();

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
    // $ANTLR end "rule__Chapter__Group__5"


    // $ANTLR start "rule__Chapter__Group__5__Impl"
    // InternalEHelp.g:918:1: rule__Chapter__Group__5__Impl : ( ( rule__Chapter__SubchaptersAssignment_5 )* ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:922:1: ( ( ( rule__Chapter__SubchaptersAssignment_5 )* ) )
            // InternalEHelp.g:923:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            {
            // InternalEHelp.g:923:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            // InternalEHelp.g:924:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            {
             before(grammarAccess.getChapterAccess().getSubchaptersAssignment_5()); 
            // InternalEHelp.g:925:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEHelp.g:925:3: rule__Chapter__SubchaptersAssignment_5
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Chapter__SubchaptersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getSubchaptersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__5__Impl"


    // $ANTLR start "rule__Chapter__Group__6"
    // InternalEHelp.g:933:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:937:1: ( rule__Chapter__Group__6__Impl )
            // InternalEHelp.g:938:2: rule__Chapter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__6__Impl();

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
    // $ANTLR end "rule__Chapter__Group__6"


    // $ANTLR start "rule__Chapter__Group__6__Impl"
    // InternalEHelp.g:944:1: rule__Chapter__Group__6__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:948:1: ( ( '}' ) )
            // InternalEHelp.g:949:1: ( '}' )
            {
            // InternalEHelp.g:949:1: ( '}' )
            // InternalEHelp.g:950:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__Group__6__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalEHelp.g:960:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:964:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalEHelp.g:965:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

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
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalEHelp.g:972:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:976:1: ( ( 'list' ) )
            // InternalEHelp.g:977:1: ( 'list' )
            {
            // InternalEHelp.g:977:1: ( 'list' )
            // InternalEHelp.g:978:2: 'list'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalEHelp.g:987:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:991:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalEHelp.g:992:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

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
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalEHelp.g:999:1: rule__List__Group__1__Impl : ( '{' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1003:1: ( ( '{' ) )
            // InternalEHelp.g:1004:1: ( '{' )
            {
            // InternalEHelp.g:1004:1: ( '{' )
            // InternalEHelp.g:1005:2: '{'
            {
             before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalEHelp.g:1014:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1018:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // InternalEHelp.g:1019:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__List__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__3();

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
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalEHelp.g:1026:1: rule__List__Group__2__Impl : ( ( rule__List__ItemsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1030:1: ( ( ( rule__List__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:1031:1: ( ( rule__List__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:1031:1: ( ( rule__List__ItemsAssignment_2 )* )
            // InternalEHelp.g:1032:2: ( rule__List__ItemsAssignment_2 )*
            {
             before(grammarAccess.getListAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:1033:2: ( rule__List__ItemsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEHelp.g:1033:3: rule__List__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__List__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getListAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // InternalEHelp.g:1041:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1045:1: ( rule__List__Group__3__Impl )
            // InternalEHelp.g:1046:2: rule__List__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__3__Impl();

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
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // InternalEHelp.g:1052:1: rule__List__Group__3__Impl : ( '}' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1056:1: ( ( '}' ) )
            // InternalEHelp.g:1057:1: ( '}' )
            {
            // InternalEHelp.g:1057:1: ( '}' )
            // InternalEHelp.g:1058:2: '}'
            {
             before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getListAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalEHelp.g:1068:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1072:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalEHelp.g:1073:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalEHelp.g:1080:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1084:1: ( ( 'enum' ) )
            // InternalEHelp.g:1085:1: ( 'enum' )
            {
            // InternalEHelp.g:1085:1: ( 'enum' )
            // InternalEHelp.g:1086:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalEHelp.g:1095:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1099:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalEHelp.g:1100:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalEHelp.g:1107:1: rule__Enum__Group__1__Impl : ( '{' ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1111:1: ( ( '{' ) )
            // InternalEHelp.g:1112:1: ( '{' )
            {
            // InternalEHelp.g:1112:1: ( '{' )
            // InternalEHelp.g:1113:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalEHelp.g:1122:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1126:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalEHelp.g:1127:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalEHelp.g:1134:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__ItemsAssignment_2 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1138:1: ( ( ( rule__Enum__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:1139:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:1139:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            // InternalEHelp.g:1140:2: ( rule__Enum__ItemsAssignment_2 )*
            {
             before(grammarAccess.getEnumAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:1141:2: ( rule__Enum__ItemsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEHelp.g:1141:3: rule__Enum__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Enum__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalEHelp.g:1149:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1153:1: ( rule__Enum__Group__3__Impl )
            // InternalEHelp.g:1154:2: rule__Enum__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__3__Impl();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalEHelp.g:1160:1: rule__Enum__Group__3__Impl : ( '}' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1164:1: ( ( '}' ) )
            // InternalEHelp.g:1165:1: ( '}' )
            {
            // InternalEHelp.g:1165:1: ( '}' )
            // InternalEHelp.g:1166:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__ListItem__Group__0"
    // InternalEHelp.g:1176:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1180:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalEHelp.g:1181:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListItem__Group__1();

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
    // $ANTLR end "rule__ListItem__Group__0"


    // $ANTLR start "rule__ListItem__Group__0__Impl"
    // InternalEHelp.g:1188:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1192:1: ( ( '-' ) )
            // InternalEHelp.g:1193:1: ( '-' )
            {
            // InternalEHelp.g:1193:1: ( '-' )
            // InternalEHelp.g:1194:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__0__Impl"


    // $ANTLR start "rule__ListItem__Group__1"
    // InternalEHelp.g:1203:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1207:1: ( rule__ListItem__Group__1__Impl )
            // InternalEHelp.g:1208:2: rule__ListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListItem__Group__1__Impl();

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
    // $ANTLR end "rule__ListItem__Group__1"


    // $ANTLR start "rule__ListItem__Group__1__Impl"
    // InternalEHelp.g:1214:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ContentAssignment_1 )* ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1218:1: ( ( ( rule__ListItem__ContentAssignment_1 )* ) )
            // InternalEHelp.g:1219:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            {
            // InternalEHelp.g:1219:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            // InternalEHelp.g:1220:2: ( rule__ListItem__ContentAssignment_1 )*
            {
             before(grammarAccess.getListItemAccess().getContentAssignment_1()); 
            // InternalEHelp.g:1221:2: ( rule__ListItem__ContentAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||(LA10_0>=17 && LA10_0<=18)||LA10_0==20||(LA10_0>=24 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEHelp.g:1221:3: rule__ListItem__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ListItem__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListItemAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalEHelp.g:1230:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1234:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalEHelp.g:1235:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalEHelp.g:1242:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1246:1: ( ( 'table' ) )
            // InternalEHelp.g:1247:1: ( 'table' )
            {
            // InternalEHelp.g:1247:1: ( 'table' )
            // InternalEHelp.g:1248:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalEHelp.g:1257:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1261:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalEHelp.g:1262:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalEHelp.g:1269:1: rule__Table__Group__1__Impl : ( ( rule__Table__WidthAssignment_1 )? ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1273:1: ( ( ( rule__Table__WidthAssignment_1 )? ) )
            // InternalEHelp.g:1274:1: ( ( rule__Table__WidthAssignment_1 )? )
            {
            // InternalEHelp.g:1274:1: ( ( rule__Table__WidthAssignment_1 )? )
            // InternalEHelp.g:1275:2: ( rule__Table__WidthAssignment_1 )?
            {
             before(grammarAccess.getTableAccess().getWidthAssignment_1()); 
            // InternalEHelp.g:1276:2: ( rule__Table__WidthAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEHelp.g:1276:3: rule__Table__WidthAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__WidthAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalEHelp.g:1284:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1288:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalEHelp.g:1289:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalEHelp.g:1296:1: rule__Table__Group__2__Impl : ( ( rule__Table__Group_2__0 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1300:1: ( ( ( rule__Table__Group_2__0 )? ) )
            // InternalEHelp.g:1301:1: ( ( rule__Table__Group_2__0 )? )
            {
            // InternalEHelp.g:1301:1: ( ( rule__Table__Group_2__0 )? )
            // InternalEHelp.g:1302:2: ( rule__Table__Group_2__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_2()); 
            // InternalEHelp.g:1303:2: ( rule__Table__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEHelp.g:1303:3: rule__Table__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalEHelp.g:1311:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1315:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalEHelp.g:1316:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalEHelp.g:1323:1: rule__Table__Group__3__Impl : ( ( rule__Table__StretchAssignment_3 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1327:1: ( ( ( rule__Table__StretchAssignment_3 )? ) )
            // InternalEHelp.g:1328:1: ( ( rule__Table__StretchAssignment_3 )? )
            {
            // InternalEHelp.g:1328:1: ( ( rule__Table__StretchAssignment_3 )? )
            // InternalEHelp.g:1329:2: ( rule__Table__StretchAssignment_3 )?
            {
             before(grammarAccess.getTableAccess().getStretchAssignment_3()); 
            // InternalEHelp.g:1330:2: ( rule__Table__StretchAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEHelp.g:1330:3: rule__Table__StretchAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__StretchAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getStretchAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalEHelp.g:1338:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1342:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalEHelp.g:1343:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalEHelp.g:1350:1: rule__Table__Group__4__Impl : ( '{' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1354:1: ( ( '{' ) )
            // InternalEHelp.g:1355:1: ( '{' )
            {
            // InternalEHelp.g:1355:1: ( '{' )
            // InternalEHelp.g:1356:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalEHelp.g:1365:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1369:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalEHelp.g:1370:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalEHelp.g:1377:1: rule__Table__Group__5__Impl : ( ( rule__Table__RowsAssignment_5 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1381:1: ( ( ( rule__Table__RowsAssignment_5 )* ) )
            // InternalEHelp.g:1382:1: ( ( rule__Table__RowsAssignment_5 )* )
            {
            // InternalEHelp.g:1382:1: ( ( rule__Table__RowsAssignment_5 )* )
            // InternalEHelp.g:1383:2: ( rule__Table__RowsAssignment_5 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_5()); 
            // InternalEHelp.g:1384:2: ( rule__Table__RowsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEHelp.g:1384:3: rule__Table__RowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Table__RowsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getRowsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalEHelp.g:1392:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1396:1: ( rule__Table__Group__6__Impl )
            // InternalEHelp.g:1397:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

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
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalEHelp.g:1403:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1407:1: ( ( '}' ) )
            // InternalEHelp.g:1408:1: ( '}' )
            {
            // InternalEHelp.g:1408:1: ( '}' )
            // InternalEHelp.g:1409:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group_2__0"
    // InternalEHelp.g:1419:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1423:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalEHelp.g:1424:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1();

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
    // $ANTLR end "rule__Table__Group_2__0"


    // $ANTLR start "rule__Table__Group_2__0__Impl"
    // InternalEHelp.g:1431:1: rule__Table__Group_2__0__Impl : ( 'spacing' ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1435:1: ( ( 'spacing' ) )
            // InternalEHelp.g:1436:1: ( 'spacing' )
            {
            // InternalEHelp.g:1436:1: ( 'spacing' )
            // InternalEHelp.g:1437:2: 'spacing'
            {
             before(grammarAccess.getTableAccess().getSpacingKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSpacingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0__Impl"


    // $ANTLR start "rule__Table__Group_2__1"
    // InternalEHelp.g:1446:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl rule__Table__Group_2__2 ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1450:1: ( rule__Table__Group_2__1__Impl rule__Table__Group_2__2 )
            // InternalEHelp.g:1451:2: rule__Table__Group_2__1__Impl rule__Table__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Table__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_2__2();

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
    // $ANTLR end "rule__Table__Group_2__1"


    // $ANTLR start "rule__Table__Group_2__1__Impl"
    // InternalEHelp.g:1458:1: rule__Table__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1462:1: ( ( '=' ) )
            // InternalEHelp.g:1463:1: ( '=' )
            {
            // InternalEHelp.g:1463:1: ( '=' )
            // InternalEHelp.g:1464:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1__Impl"


    // $ANTLR start "rule__Table__Group_2__2"
    // InternalEHelp.g:1473:1: rule__Table__Group_2__2 : rule__Table__Group_2__2__Impl ;
    public final void rule__Table__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1477:1: ( rule__Table__Group_2__2__Impl )
            // InternalEHelp.g:1478:2: rule__Table__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__2__Impl();

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
    // $ANTLR end "rule__Table__Group_2__2"


    // $ANTLR start "rule__Table__Group_2__2__Impl"
    // InternalEHelp.g:1484:1: rule__Table__Group_2__2__Impl : ( ( rule__Table__SpacingAssignment_2_2 ) ) ;
    public final void rule__Table__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1488:1: ( ( ( rule__Table__SpacingAssignment_2_2 ) ) )
            // InternalEHelp.g:1489:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            {
            // InternalEHelp.g:1489:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            // InternalEHelp.g:1490:2: ( rule__Table__SpacingAssignment_2_2 )
            {
             before(grammarAccess.getTableAccess().getSpacingAssignment_2_2()); 
            // InternalEHelp.g:1491:2: ( rule__Table__SpacingAssignment_2_2 )
            // InternalEHelp.g:1491:3: rule__Table__SpacingAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__SpacingAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getSpacingAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__2__Impl"


    // $ANTLR start "rule__TableRow__Group__0"
    // InternalEHelp.g:1500:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1504:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalEHelp.g:1505:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TableRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__1();

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
    // $ANTLR end "rule__TableRow__Group__0"


    // $ANTLR start "rule__TableRow__Group__0__Impl"
    // InternalEHelp.g:1512:1: rule__TableRow__Group__0__Impl : ( '-' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1516:1: ( ( '-' ) )
            // InternalEHelp.g:1517:1: ( '-' )
            {
            // InternalEHelp.g:1517:1: ( '-' )
            // InternalEHelp.g:1518:2: '-'
            {
             before(grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__0__Impl"


    // $ANTLR start "rule__TableRow__Group__1"
    // InternalEHelp.g:1527:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1531:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalEHelp.g:1532:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__TableRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2();

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
    // $ANTLR end "rule__TableRow__Group__1"


    // $ANTLR start "rule__TableRow__Group__1__Impl"
    // InternalEHelp.g:1539:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__CellsAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1543:1: ( ( ( rule__TableRow__CellsAssignment_1 ) ) )
            // InternalEHelp.g:1544:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            {
            // InternalEHelp.g:1544:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            // InternalEHelp.g:1545:2: ( rule__TableRow__CellsAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_1()); 
            // InternalEHelp.g:1546:2: ( rule__TableRow__CellsAssignment_1 )
            // InternalEHelp.g:1546:3: rule__TableRow__CellsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__CellsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__1__Impl"


    // $ANTLR start "rule__TableRow__Group__2"
    // InternalEHelp.g:1554:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1558:1: ( rule__TableRow__Group__2__Impl )
            // InternalEHelp.g:1559:2: rule__TableRow__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group__2__Impl();

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
    // $ANTLR end "rule__TableRow__Group__2"


    // $ANTLR start "rule__TableRow__Group__2__Impl"
    // InternalEHelp.g:1565:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1569:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalEHelp.g:1570:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalEHelp.g:1570:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalEHelp.g:1571:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalEHelp.g:1572:2: ( rule__TableRow__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEHelp.g:1572:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTableRowAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group__2__Impl"


    // $ANTLR start "rule__TableRow__Group_2__0"
    // InternalEHelp.g:1581:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1585:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalEHelp.g:1586:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__TableRow__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableRow__Group_2__1();

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
    // $ANTLR end "rule__TableRow__Group_2__0"


    // $ANTLR start "rule__TableRow__Group_2__0__Impl"
    // InternalEHelp.g:1593:1: rule__TableRow__Group_2__0__Impl : ( '|' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1597:1: ( ( '|' ) )
            // InternalEHelp.g:1598:1: ( '|' )
            {
            // InternalEHelp.g:1598:1: ( '|' )
            // InternalEHelp.g:1599:2: '|'
            {
             before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__0__Impl"


    // $ANTLR start "rule__TableRow__Group_2__1"
    // InternalEHelp.g:1608:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1612:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalEHelp.g:1613:2: rule__TableRow__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__Group_2__1__Impl();

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
    // $ANTLR end "rule__TableRow__Group_2__1"


    // $ANTLR start "rule__TableRow__Group_2__1__Impl"
    // InternalEHelp.g:1619:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__CellsAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1623:1: ( ( ( rule__TableRow__CellsAssignment_2_1 ) ) )
            // InternalEHelp.g:1624:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            {
            // InternalEHelp.g:1624:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            // InternalEHelp.g:1625:2: ( rule__TableRow__CellsAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_2_1()); 
            // InternalEHelp.g:1626:2: ( rule__TableRow__CellsAssignment_2_1 )
            // InternalEHelp.g:1626:3: rule__TableRow__CellsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TableRow__CellsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTableRowAccess().getCellsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__Group_2__1__Impl"


    // $ANTLR start "rule__TableCell__Group__0"
    // InternalEHelp.g:1635:1: rule__TableCell__Group__0 : rule__TableCell__Group__0__Impl rule__TableCell__Group__1 ;
    public final void rule__TableCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1639:1: ( rule__TableCell__Group__0__Impl rule__TableCell__Group__1 )
            // InternalEHelp.g:1640:2: rule__TableCell__Group__0__Impl rule__TableCell__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__1();

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
    // $ANTLR end "rule__TableCell__Group__0"


    // $ANTLR start "rule__TableCell__Group__0__Impl"
    // InternalEHelp.g:1647:1: rule__TableCell__Group__0__Impl : ( ( rule__TableCell__CenterAssignment_0 )? ) ;
    public final void rule__TableCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1651:1: ( ( ( rule__TableCell__CenterAssignment_0 )? ) )
            // InternalEHelp.g:1652:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            {
            // InternalEHelp.g:1652:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            // InternalEHelp.g:1653:2: ( rule__TableCell__CenterAssignment_0 )?
            {
             before(grammarAccess.getTableCellAccess().getCenterAssignment_0()); 
            // InternalEHelp.g:1654:2: ( rule__TableCell__CenterAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEHelp.g:1654:3: rule__TableCell__CenterAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__CenterAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getCenterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__0__Impl"


    // $ANTLR start "rule__TableCell__Group__1"
    // InternalEHelp.g:1662:1: rule__TableCell__Group__1 : rule__TableCell__Group__1__Impl rule__TableCell__Group__2 ;
    public final void rule__TableCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1666:1: ( rule__TableCell__Group__1__Impl rule__TableCell__Group__2 )
            // InternalEHelp.g:1667:2: rule__TableCell__Group__1__Impl rule__TableCell__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__2();

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
    // $ANTLR end "rule__TableCell__Group__1"


    // $ANTLR start "rule__TableCell__Group__1__Impl"
    // InternalEHelp.g:1674:1: rule__TableCell__Group__1__Impl : ( ( rule__TableCell__LeftAssignment_1 )? ) ;
    public final void rule__TableCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1678:1: ( ( ( rule__TableCell__LeftAssignment_1 )? ) )
            // InternalEHelp.g:1679:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            {
            // InternalEHelp.g:1679:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            // InternalEHelp.g:1680:2: ( rule__TableCell__LeftAssignment_1 )?
            {
             before(grammarAccess.getTableCellAccess().getLeftAssignment_1()); 
            // InternalEHelp.g:1681:2: ( rule__TableCell__LeftAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEHelp.g:1681:3: rule__TableCell__LeftAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__LeftAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__1__Impl"


    // $ANTLR start "rule__TableCell__Group__2"
    // InternalEHelp.g:1689:1: rule__TableCell__Group__2 : rule__TableCell__Group__2__Impl rule__TableCell__Group__3 ;
    public final void rule__TableCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1693:1: ( rule__TableCell__Group__2__Impl rule__TableCell__Group__3 )
            // InternalEHelp.g:1694:2: rule__TableCell__Group__2__Impl rule__TableCell__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__3();

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
    // $ANTLR end "rule__TableCell__Group__2"


    // $ANTLR start "rule__TableCell__Group__2__Impl"
    // InternalEHelp.g:1701:1: rule__TableCell__Group__2__Impl : ( ( rule__TableCell__RightAssignment_2 )? ) ;
    public final void rule__TableCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1705:1: ( ( ( rule__TableCell__RightAssignment_2 )? ) )
            // InternalEHelp.g:1706:1: ( ( rule__TableCell__RightAssignment_2 )? )
            {
            // InternalEHelp.g:1706:1: ( ( rule__TableCell__RightAssignment_2 )? )
            // InternalEHelp.g:1707:2: ( rule__TableCell__RightAssignment_2 )?
            {
             before(grammarAccess.getTableCellAccess().getRightAssignment_2()); 
            // InternalEHelp.g:1708:2: ( rule__TableCell__RightAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEHelp.g:1708:3: rule__TableCell__RightAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__RightAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__2__Impl"


    // $ANTLR start "rule__TableCell__Group__3"
    // InternalEHelp.g:1716:1: rule__TableCell__Group__3 : rule__TableCell__Group__3__Impl rule__TableCell__Group__4 ;
    public final void rule__TableCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1720:1: ( rule__TableCell__Group__3__Impl rule__TableCell__Group__4 )
            // InternalEHelp.g:1721:2: rule__TableCell__Group__3__Impl rule__TableCell__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__4();

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
    // $ANTLR end "rule__TableCell__Group__3"


    // $ANTLR start "rule__TableCell__Group__3__Impl"
    // InternalEHelp.g:1728:1: rule__TableCell__Group__3__Impl : ( ( rule__TableCell__TopAssignment_3 )? ) ;
    public final void rule__TableCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1732:1: ( ( ( rule__TableCell__TopAssignment_3 )? ) )
            // InternalEHelp.g:1733:1: ( ( rule__TableCell__TopAssignment_3 )? )
            {
            // InternalEHelp.g:1733:1: ( ( rule__TableCell__TopAssignment_3 )? )
            // InternalEHelp.g:1734:2: ( rule__TableCell__TopAssignment_3 )?
            {
             before(grammarAccess.getTableCellAccess().getTopAssignment_3()); 
            // InternalEHelp.g:1735:2: ( rule__TableCell__TopAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEHelp.g:1735:3: rule__TableCell__TopAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__TopAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getTopAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__3__Impl"


    // $ANTLR start "rule__TableCell__Group__4"
    // InternalEHelp.g:1743:1: rule__TableCell__Group__4 : rule__TableCell__Group__4__Impl rule__TableCell__Group__5 ;
    public final void rule__TableCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1747:1: ( rule__TableCell__Group__4__Impl rule__TableCell__Group__5 )
            // InternalEHelp.g:1748:2: rule__TableCell__Group__4__Impl rule__TableCell__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__5();

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
    // $ANTLR end "rule__TableCell__Group__4"


    // $ANTLR start "rule__TableCell__Group__4__Impl"
    // InternalEHelp.g:1755:1: rule__TableCell__Group__4__Impl : ( ( rule__TableCell__MiddleAssignment_4 )? ) ;
    public final void rule__TableCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1759:1: ( ( ( rule__TableCell__MiddleAssignment_4 )? ) )
            // InternalEHelp.g:1760:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            {
            // InternalEHelp.g:1760:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            // InternalEHelp.g:1761:2: ( rule__TableCell__MiddleAssignment_4 )?
            {
             before(grammarAccess.getTableCellAccess().getMiddleAssignment_4()); 
            // InternalEHelp.g:1762:2: ( rule__TableCell__MiddleAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEHelp.g:1762:3: rule__TableCell__MiddleAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__MiddleAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getMiddleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__4__Impl"


    // $ANTLR start "rule__TableCell__Group__5"
    // InternalEHelp.g:1770:1: rule__TableCell__Group__5 : rule__TableCell__Group__5__Impl rule__TableCell__Group__6 ;
    public final void rule__TableCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1774:1: ( rule__TableCell__Group__5__Impl rule__TableCell__Group__6 )
            // InternalEHelp.g:1775:2: rule__TableCell__Group__5__Impl rule__TableCell__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__TableCell__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableCell__Group__6();

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
    // $ANTLR end "rule__TableCell__Group__5"


    // $ANTLR start "rule__TableCell__Group__5__Impl"
    // InternalEHelp.g:1782:1: rule__TableCell__Group__5__Impl : ( ( rule__TableCell__BottomAssignment_5 )? ) ;
    public final void rule__TableCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1786:1: ( ( ( rule__TableCell__BottomAssignment_5 )? ) )
            // InternalEHelp.g:1787:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            {
            // InternalEHelp.g:1787:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            // InternalEHelp.g:1788:2: ( rule__TableCell__BottomAssignment_5 )?
            {
             before(grammarAccess.getTableCellAccess().getBottomAssignment_5()); 
            // InternalEHelp.g:1789:2: ( rule__TableCell__BottomAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEHelp.g:1789:3: rule__TableCell__BottomAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__TableCell__BottomAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableCellAccess().getBottomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__5__Impl"


    // $ANTLR start "rule__TableCell__Group__6"
    // InternalEHelp.g:1797:1: rule__TableCell__Group__6 : rule__TableCell__Group__6__Impl ;
    public final void rule__TableCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1801:1: ( rule__TableCell__Group__6__Impl )
            // InternalEHelp.g:1802:2: rule__TableCell__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableCell__Group__6__Impl();

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
    // $ANTLR end "rule__TableCell__Group__6"


    // $ANTLR start "rule__TableCell__Group__6__Impl"
    // InternalEHelp.g:1808:1: rule__TableCell__Group__6__Impl : ( ( rule__TableCell__ContentAssignment_6 )* ) ;
    public final void rule__TableCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1812:1: ( ( ( rule__TableCell__ContentAssignment_6 )* ) )
            // InternalEHelp.g:1813:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            {
            // InternalEHelp.g:1813:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            // InternalEHelp.g:1814:2: ( rule__TableCell__ContentAssignment_6 )*
            {
             before(grammarAccess.getTableCellAccess().getContentAssignment_6()); 
            // InternalEHelp.g:1815:2: ( rule__TableCell__ContentAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||(LA22_0>=17 && LA22_0<=18)||LA22_0==20||(LA22_0>=24 && LA22_0<=26)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEHelp.g:1815:3: rule__TableCell__ContentAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__TableCell__ContentAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTableCellAccess().getContentAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__Group__6__Impl"


    // $ANTLR start "rule__Keyword__Group__0"
    // InternalEHelp.g:1824:1: rule__Keyword__Group__0 : rule__Keyword__Group__0__Impl rule__Keyword__Group__1 ;
    public final void rule__Keyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1828:1: ( rule__Keyword__Group__0__Impl rule__Keyword__Group__1 )
            // InternalEHelp.g:1829:2: rule__Keyword__Group__0__Impl rule__Keyword__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Keyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keyword__Group__1();

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
    // $ANTLR end "rule__Keyword__Group__0"


    // $ANTLR start "rule__Keyword__Group__0__Impl"
    // InternalEHelp.g:1836:1: rule__Keyword__Group__0__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1840:1: ( ( '?' ) )
            // InternalEHelp.g:1841:1: ( '?' )
            {
            // InternalEHelp.g:1841:1: ( '?' )
            // InternalEHelp.g:1842:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__Group__0__Impl"


    // $ANTLR start "rule__Keyword__Group__1"
    // InternalEHelp.g:1851:1: rule__Keyword__Group__1 : rule__Keyword__Group__1__Impl rule__Keyword__Group__2 ;
    public final void rule__Keyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1855:1: ( rule__Keyword__Group__1__Impl rule__Keyword__Group__2 )
            // InternalEHelp.g:1856:2: rule__Keyword__Group__1__Impl rule__Keyword__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Keyword__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keyword__Group__2();

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
    // $ANTLR end "rule__Keyword__Group__1"


    // $ANTLR start "rule__Keyword__Group__1__Impl"
    // InternalEHelp.g:1863:1: rule__Keyword__Group__1__Impl : ( ( rule__Keyword__TextAssignment_1 ) ) ;
    public final void rule__Keyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1867:1: ( ( ( rule__Keyword__TextAssignment_1 ) ) )
            // InternalEHelp.g:1868:1: ( ( rule__Keyword__TextAssignment_1 ) )
            {
            // InternalEHelp.g:1868:1: ( ( rule__Keyword__TextAssignment_1 ) )
            // InternalEHelp.g:1869:2: ( rule__Keyword__TextAssignment_1 )
            {
             before(grammarAccess.getKeywordAccess().getTextAssignment_1()); 
            // InternalEHelp.g:1870:2: ( rule__Keyword__TextAssignment_1 )
            // InternalEHelp.g:1870:3: rule__Keyword__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeywordAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__Group__1__Impl"


    // $ANTLR start "rule__Keyword__Group__2"
    // InternalEHelp.g:1878:1: rule__Keyword__Group__2 : rule__Keyword__Group__2__Impl ;
    public final void rule__Keyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1882:1: ( rule__Keyword__Group__2__Impl )
            // InternalEHelp.g:1883:2: rule__Keyword__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keyword__Group__2__Impl();

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
    // $ANTLR end "rule__Keyword__Group__2"


    // $ANTLR start "rule__Keyword__Group__2__Impl"
    // InternalEHelp.g:1889:1: rule__Keyword__Group__2__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1893:1: ( ( '?' ) )
            // InternalEHelp.g:1894:1: ( '?' )
            {
            // InternalEHelp.g:1894:1: ( '?' )
            // InternalEHelp.g:1895:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalEHelp.g:1905:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1909:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalEHelp.g:1910:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

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
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalEHelp.g:1917:1: rule__Context__Group__0__Impl : ( '!' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1921:1: ( ( '!' ) )
            // InternalEHelp.g:1922:1: ( '!' )
            {
            // InternalEHelp.g:1922:1: ( '!' )
            // InternalEHelp.g:1923:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalEHelp.g:1932:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1936:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalEHelp.g:1937:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

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
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalEHelp.g:1944:1: rule__Context__Group__1__Impl : ( ( rule__Context__IdAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1948:1: ( ( ( rule__Context__IdAssignment_1 ) ) )
            // InternalEHelp.g:1949:1: ( ( rule__Context__IdAssignment_1 ) )
            {
            // InternalEHelp.g:1949:1: ( ( rule__Context__IdAssignment_1 ) )
            // InternalEHelp.g:1950:2: ( rule__Context__IdAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getIdAssignment_1()); 
            // InternalEHelp.g:1951:2: ( rule__Context__IdAssignment_1 )
            // InternalEHelp.g:1951:3: rule__Context__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalEHelp.g:1959:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1963:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalEHelp.g:1964:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

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
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalEHelp.g:1971:1: rule__Context__Group__2__Impl : ( ( rule__Context__LabelAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1975:1: ( ( ( rule__Context__LabelAssignment_2 ) ) )
            // InternalEHelp.g:1976:1: ( ( rule__Context__LabelAssignment_2 ) )
            {
            // InternalEHelp.g:1976:1: ( ( rule__Context__LabelAssignment_2 ) )
            // InternalEHelp.g:1977:2: ( rule__Context__LabelAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getLabelAssignment_2()); 
            // InternalEHelp.g:1978:2: ( rule__Context__LabelAssignment_2 )
            // InternalEHelp.g:1978:3: rule__Context__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Context__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalEHelp.g:1986:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1990:1: ( rule__Context__Group__3__Impl )
            // InternalEHelp.g:1991:2: rule__Context__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__3__Impl();

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
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalEHelp.g:1997:1: rule__Context__Group__3__Impl : ( '!' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2001:1: ( ( '!' ) )
            // InternalEHelp.g:2002:1: ( '!' )
            {
            // InternalEHelp.g:2002:1: ( '!' )
            // InternalEHelp.g:2003:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getExclamationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Images__Group__0"
    // InternalEHelp.g:2013:1: rule__Images__Group__0 : rule__Images__Group__0__Impl rule__Images__Group__1 ;
    public final void rule__Images__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2017:1: ( rule__Images__Group__0__Impl rule__Images__Group__1 )
            // InternalEHelp.g:2018:2: rule__Images__Group__0__Impl rule__Images__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Images__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Images__Group__1();

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
    // $ANTLR end "rule__Images__Group__0"


    // $ANTLR start "rule__Images__Group__0__Impl"
    // InternalEHelp.g:2025:1: rule__Images__Group__0__Impl : ( '[' ) ;
    public final void rule__Images__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2029:1: ( ( '[' ) )
            // InternalEHelp.g:2030:1: ( '[' )
            {
            // InternalEHelp.g:2030:1: ( '[' )
            // InternalEHelp.g:2031:2: '['
            {
             before(grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Images__Group__0__Impl"


    // $ANTLR start "rule__Images__Group__1"
    // InternalEHelp.g:2040:1: rule__Images__Group__1 : rule__Images__Group__1__Impl rule__Images__Group__2 ;
    public final void rule__Images__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2044:1: ( rule__Images__Group__1__Impl rule__Images__Group__2 )
            // InternalEHelp.g:2045:2: rule__Images__Group__1__Impl rule__Images__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Images__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Images__Group__2();

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
    // $ANTLR end "rule__Images__Group__1"


    // $ANTLR start "rule__Images__Group__1__Impl"
    // InternalEHelp.g:2052:1: rule__Images__Group__1__Impl : ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) ;
    public final void rule__Images__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2056:1: ( ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) )
            // InternalEHelp.g:2057:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            {
            // InternalEHelp.g:2057:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            // InternalEHelp.g:2058:2: ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* )
            {
            // InternalEHelp.g:2058:2: ( ( rule__Images__ImagesAssignment_1 ) )
            // InternalEHelp.g:2059:3: ( rule__Images__ImagesAssignment_1 )
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:2060:3: ( rule__Images__ImagesAssignment_1 )
            // InternalEHelp.g:2060:4: rule__Images__ImagesAssignment_1
            {
            pushFollow(FOLLOW_26);
            rule__Images__ImagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImagesAccess().getImagesAssignment_1()); 

            }

            // InternalEHelp.g:2063:2: ( ( rule__Images__ImagesAssignment_1 )* )
            // InternalEHelp.g:2064:3: ( rule__Images__ImagesAssignment_1 )*
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:2065:3: ( rule__Images__ImagesAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEHelp.g:2065:4: rule__Images__ImagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Images__ImagesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getImagesAccess().getImagesAssignment_1()); 

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
    // $ANTLR end "rule__Images__Group__1__Impl"


    // $ANTLR start "rule__Images__Group__2"
    // InternalEHelp.g:2074:1: rule__Images__Group__2 : rule__Images__Group__2__Impl ;
    public final void rule__Images__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2078:1: ( rule__Images__Group__2__Impl )
            // InternalEHelp.g:2079:2: rule__Images__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Images__Group__2__Impl();

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
    // $ANTLR end "rule__Images__Group__2"


    // $ANTLR start "rule__Images__Group__2__Impl"
    // InternalEHelp.g:2085:1: rule__Images__Group__2__Impl : ( ']' ) ;
    public final void rule__Images__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2089:1: ( ( ']' ) )
            // InternalEHelp.g:2090:1: ( ']' )
            {
            // InternalEHelp.g:2090:1: ( ']' )
            // InternalEHelp.g:2091:2: ']'
            {
             before(grammarAccess.getImagesAccess().getRightSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImagesAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Images__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalEHelp.g:2101:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2105:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalEHelp.g:2106:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalEHelp.g:2113:1: rule__Link__Group__0__Impl : ( '[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2117:1: ( ( '[' ) )
            // InternalEHelp.g:2118:1: ( '[' )
            {
            // InternalEHelp.g:2118:1: ( '[' )
            // InternalEHelp.g:2119:2: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalEHelp.g:2128:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2132:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalEHelp.g:2133:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalEHelp.g:2140:1: rule__Link__Group__1__Impl : ( ( rule__Link__LinkAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2144:1: ( ( ( rule__Link__LinkAssignment_1 ) ) )
            // InternalEHelp.g:2145:1: ( ( rule__Link__LinkAssignment_1 ) )
            {
            // InternalEHelp.g:2145:1: ( ( rule__Link__LinkAssignment_1 ) )
            // InternalEHelp.g:2146:2: ( rule__Link__LinkAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_1()); 
            // InternalEHelp.g:2147:2: ( rule__Link__LinkAssignment_1 )
            // InternalEHelp.g:2147:3: rule__Link__LinkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalEHelp.g:2155:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2159:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalEHelp.g:2160:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalEHelp.g:2167:1: rule__Link__Group__2__Impl : ( ( rule__Link__CaptionAssignment_2 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2171:1: ( ( ( rule__Link__CaptionAssignment_2 )? ) )
            // InternalEHelp.g:2172:1: ( ( rule__Link__CaptionAssignment_2 )? )
            {
            // InternalEHelp.g:2172:1: ( ( rule__Link__CaptionAssignment_2 )? )
            // InternalEHelp.g:2173:2: ( rule__Link__CaptionAssignment_2 )?
            {
             before(grammarAccess.getLinkAccess().getCaptionAssignment_2()); 
            // InternalEHelp.g:2174:2: ( rule__Link__CaptionAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEHelp.g:2174:3: rule__Link__CaptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__CaptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCaptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalEHelp.g:2182:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2186:1: ( rule__Link__Group__3__Impl )
            // InternalEHelp.g:2187:2: rule__Link__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__3__Impl();

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
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalEHelp.g:2193:1: rule__Link__Group__3__Impl : ( ']' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2197:1: ( ( ']' ) )
            // InternalEHelp.g:2198:1: ( ']' )
            {
            // InternalEHelp.g:2198:1: ( ']' )
            // InternalEHelp.g:2199:2: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__EHelpModel__ConfigsAssignment_0"
    // InternalEHelp.g:2209:1: rule__EHelpModel__ConfigsAssignment_0 : ( ruleConfig ) ;
    public final void rule__EHelpModel__ConfigsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2213:1: ( ( ruleConfig ) )
            // InternalEHelp.g:2214:2: ( ruleConfig )
            {
            // InternalEHelp.g:2214:2: ( ruleConfig )
            // InternalEHelp.g:2215:3: ruleConfig
            {
             before(grammarAccess.getEHelpModelAccess().getConfigsConfigParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getEHelpModelAccess().getConfigsConfigParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EHelpModel__ConfigsAssignment_0"


    // $ANTLR start "rule__EHelpModel__ChaptersAssignment_1"
    // InternalEHelp.g:2224:1: rule__EHelpModel__ChaptersAssignment_1 : ( ruleChapter ) ;
    public final void rule__EHelpModel__ChaptersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2228:1: ( ( ruleChapter ) )
            // InternalEHelp.g:2229:2: ( ruleChapter )
            {
            // InternalEHelp.g:2229:2: ( ruleChapter )
            // InternalEHelp.g:2230:3: ruleChapter
            {
             before(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EHelpModel__ChaptersAssignment_1"


    // $ANTLR start "rule__ConfigPath__PathAssignment_2"
    // InternalEHelp.g:2239:1: rule__ConfigPath__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConfigPath__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2243:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2244:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2244:2: ( RULE_STRING )
            // InternalEHelp.g:2245:3: RULE_STRING
            {
             before(grammarAccess.getConfigPathAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigPathAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigPath__PathAssignment_2"


    // $ANTLR start "rule__ConfigHome__HomeAssignment_2"
    // InternalEHelp.g:2254:1: rule__ConfigHome__HomeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConfigHome__HomeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2258:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2259:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2259:2: ( RULE_STRING )
            // InternalEHelp.g:2260:3: RULE_STRING
            {
             before(grammarAccess.getConfigHomeAccess().getHomeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigHomeAccess().getHomeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigHome__HomeAssignment_2"


    // $ANTLR start "rule__Chapter__NameAssignment_1"
    // InternalEHelp.g:2269:1: rule__Chapter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2273:1: ( ( RULE_ID ) )
            // InternalEHelp.g:2274:2: ( RULE_ID )
            {
            // InternalEHelp.g:2274:2: ( RULE_ID )
            // InternalEHelp.g:2275:3: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__NameAssignment_1"


    // $ANTLR start "rule__Chapter__TitleAssignment_2"
    // InternalEHelp.g:2284:1: rule__Chapter__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chapter__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2288:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2289:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2289:2: ( RULE_STRING )
            // InternalEHelp.g:2290:3: RULE_STRING
            {
             before(grammarAccess.getChapterAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__TitleAssignment_2"


    // $ANTLR start "rule__Chapter__ContentAssignment_4"
    // InternalEHelp.g:2299:1: rule__Chapter__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__Chapter__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2303:1: ( ( ruleContent ) )
            // InternalEHelp.g:2304:2: ( ruleContent )
            {
            // InternalEHelp.g:2304:2: ( ruleContent )
            // InternalEHelp.g:2305:3: ruleContent
            {
             before(grammarAccess.getChapterAccess().getContentContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getContentContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__ContentAssignment_4"


    // $ANTLR start "rule__Chapter__SubchaptersAssignment_5"
    // InternalEHelp.g:2314:1: rule__Chapter__SubchaptersAssignment_5 : ( ruleChapter ) ;
    public final void rule__Chapter__SubchaptersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2318:1: ( ( ruleChapter ) )
            // InternalEHelp.g:2319:2: ( ruleChapter )
            {
            // InternalEHelp.g:2319:2: ( ruleChapter )
            // InternalEHelp.g:2320:3: ruleChapter
            {
             before(grammarAccess.getChapterAccess().getSubchaptersChapterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getSubchaptersChapterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapter__SubchaptersAssignment_5"


    // $ANTLR start "rule__List__ItemsAssignment_2"
    // InternalEHelp.g:2329:1: rule__List__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__List__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2333:1: ( ( ruleListItem ) )
            // InternalEHelp.g:2334:2: ( ruleListItem )
            {
            // InternalEHelp.g:2334:2: ( ruleListItem )
            // InternalEHelp.g:2335:3: ruleListItem
            {
             before(grammarAccess.getListAccess().getItemsListItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getListAccess().getItemsListItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ItemsAssignment_2"


    // $ANTLR start "rule__Enum__ItemsAssignment_2"
    // InternalEHelp.g:2344:1: rule__Enum__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__Enum__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2348:1: ( ( ruleListItem ) )
            // InternalEHelp.g:2349:2: ( ruleListItem )
            {
            // InternalEHelp.g:2349:2: ( ruleListItem )
            // InternalEHelp.g:2350:3: ruleListItem
            {
             before(grammarAccess.getEnumAccess().getItemsListItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListItem();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getItemsListItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__ItemsAssignment_2"


    // $ANTLR start "rule__ListItem__ContentAssignment_1"
    // InternalEHelp.g:2359:1: rule__ListItem__ContentAssignment_1 : ( ruleContent ) ;
    public final void rule__ListItem__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2363:1: ( ( ruleContent ) )
            // InternalEHelp.g:2364:2: ( ruleContent )
            {
            // InternalEHelp.g:2364:2: ( ruleContent )
            // InternalEHelp.g:2365:3: ruleContent
            {
             before(grammarAccess.getListItemAccess().getContentContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getListItemAccess().getContentContentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListItem__ContentAssignment_1"


    // $ANTLR start "rule__Table__WidthAssignment_1"
    // InternalEHelp.g:2374:1: rule__Table__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Table__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2378:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2379:2: ( RULE_INT )
            {
            // InternalEHelp.g:2379:2: ( RULE_INT )
            // InternalEHelp.g:2380:3: RULE_INT
            {
             before(grammarAccess.getTableAccess().getWidthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getWidthINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__WidthAssignment_1"


    // $ANTLR start "rule__Table__SpacingAssignment_2_2"
    // InternalEHelp.g:2389:1: rule__Table__SpacingAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Table__SpacingAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2393:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2394:2: ( RULE_INT )
            {
            // InternalEHelp.g:2394:2: ( RULE_INT )
            // InternalEHelp.g:2395:3: RULE_INT
            {
             before(grammarAccess.getTableAccess().getSpacingINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getSpacingINTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__SpacingAssignment_2_2"


    // $ANTLR start "rule__Table__StretchAssignment_3"
    // InternalEHelp.g:2404:1: rule__Table__StretchAssignment_3 : ( ( 'stretch' ) ) ;
    public final void rule__Table__StretchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2408:1: ( ( ( 'stretch' ) ) )
            // InternalEHelp.g:2409:2: ( ( 'stretch' ) )
            {
            // InternalEHelp.g:2409:2: ( ( 'stretch' ) )
            // InternalEHelp.g:2410:3: ( 'stretch' )
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            // InternalEHelp.g:2411:3: ( 'stretch' )
            // InternalEHelp.g:2412:4: 'stretch'
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 

            }

             after(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__StretchAssignment_3"


    // $ANTLR start "rule__Table__RowsAssignment_5"
    // InternalEHelp.g:2423:1: rule__Table__RowsAssignment_5 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2427:1: ( ( ruleTableRow ) )
            // InternalEHelp.g:2428:2: ( ruleTableRow )
            {
            // InternalEHelp.g:2428:2: ( ruleTableRow )
            // InternalEHelp.g:2429:3: ruleTableRow
            {
             before(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTableRow();

            state._fsp--;

             after(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RowsAssignment_5"


    // $ANTLR start "rule__TableRow__CellsAssignment_1"
    // InternalEHelp.g:2438:1: rule__TableRow__CellsAssignment_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2442:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2443:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2443:2: ( ruleTableCell )
            // InternalEHelp.g:2444:3: ruleTableCell
            {
             before(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableCell();

            state._fsp--;

             after(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__CellsAssignment_1"


    // $ANTLR start "rule__TableRow__CellsAssignment_2_1"
    // InternalEHelp.g:2453:1: rule__TableRow__CellsAssignment_2_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2457:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2458:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2458:2: ( ruleTableCell )
            // InternalEHelp.g:2459:3: ruleTableCell
            {
             before(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableCell();

            state._fsp--;

             after(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableRow__CellsAssignment_2_1"


    // $ANTLR start "rule__TableCell__CenterAssignment_0"
    // InternalEHelp.g:2468:1: rule__TableCell__CenterAssignment_0 : ( ( 'center' ) ) ;
    public final void rule__TableCell__CenterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2472:1: ( ( ( 'center' ) ) )
            // InternalEHelp.g:2473:2: ( ( 'center' ) )
            {
            // InternalEHelp.g:2473:2: ( ( 'center' ) )
            // InternalEHelp.g:2474:3: ( 'center' )
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            // InternalEHelp.g:2475:3: ( 'center' )
            // InternalEHelp.g:2476:4: 'center'
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 

            }

             after(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__CenterAssignment_0"


    // $ANTLR start "rule__TableCell__LeftAssignment_1"
    // InternalEHelp.g:2487:1: rule__TableCell__LeftAssignment_1 : ( ( 'left' ) ) ;
    public final void rule__TableCell__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2491:1: ( ( ( 'left' ) ) )
            // InternalEHelp.g:2492:2: ( ( 'left' ) )
            {
            // InternalEHelp.g:2492:2: ( ( 'left' ) )
            // InternalEHelp.g:2493:3: ( 'left' )
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            // InternalEHelp.g:2494:3: ( 'left' )
            // InternalEHelp.g:2495:4: 'left'
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 

            }

             after(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__LeftAssignment_1"


    // $ANTLR start "rule__TableCell__RightAssignment_2"
    // InternalEHelp.g:2506:1: rule__TableCell__RightAssignment_2 : ( ( 'right' ) ) ;
    public final void rule__TableCell__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2510:1: ( ( ( 'right' ) ) )
            // InternalEHelp.g:2511:2: ( ( 'right' ) )
            {
            // InternalEHelp.g:2511:2: ( ( 'right' ) )
            // InternalEHelp.g:2512:3: ( 'right' )
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            // InternalEHelp.g:2513:3: ( 'right' )
            // InternalEHelp.g:2514:4: 'right'
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 

            }

             after(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__RightAssignment_2"


    // $ANTLR start "rule__TableCell__TopAssignment_3"
    // InternalEHelp.g:2525:1: rule__TableCell__TopAssignment_3 : ( ( 'top' ) ) ;
    public final void rule__TableCell__TopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2529:1: ( ( ( 'top' ) ) )
            // InternalEHelp.g:2530:2: ( ( 'top' ) )
            {
            // InternalEHelp.g:2530:2: ( ( 'top' ) )
            // InternalEHelp.g:2531:3: ( 'top' )
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            // InternalEHelp.g:2532:3: ( 'top' )
            // InternalEHelp.g:2533:4: 'top'
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 

            }

             after(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__TopAssignment_3"


    // $ANTLR start "rule__TableCell__MiddleAssignment_4"
    // InternalEHelp.g:2544:1: rule__TableCell__MiddleAssignment_4 : ( ( 'middle' ) ) ;
    public final void rule__TableCell__MiddleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2548:1: ( ( ( 'middle' ) ) )
            // InternalEHelp.g:2549:2: ( ( 'middle' ) )
            {
            // InternalEHelp.g:2549:2: ( ( 'middle' ) )
            // InternalEHelp.g:2550:3: ( 'middle' )
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            // InternalEHelp.g:2551:3: ( 'middle' )
            // InternalEHelp.g:2552:4: 'middle'
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 

            }

             after(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__MiddleAssignment_4"


    // $ANTLR start "rule__TableCell__BottomAssignment_5"
    // InternalEHelp.g:2563:1: rule__TableCell__BottomAssignment_5 : ( ( 'bottom' ) ) ;
    public final void rule__TableCell__BottomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2567:1: ( ( ( 'bottom' ) ) )
            // InternalEHelp.g:2568:2: ( ( 'bottom' ) )
            {
            // InternalEHelp.g:2568:2: ( ( 'bottom' ) )
            // InternalEHelp.g:2569:3: ( 'bottom' )
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            // InternalEHelp.g:2570:3: ( 'bottom' )
            // InternalEHelp.g:2571:4: 'bottom'
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 

            }

             after(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__BottomAssignment_5"


    // $ANTLR start "rule__TableCell__ContentAssignment_6"
    // InternalEHelp.g:2582:1: rule__TableCell__ContentAssignment_6 : ( ruleContent ) ;
    public final void rule__TableCell__ContentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2586:1: ( ( ruleContent ) )
            // InternalEHelp.g:2587:2: ( ruleContent )
            {
            // InternalEHelp.g:2587:2: ( ruleContent )
            // InternalEHelp.g:2588:3: ruleContent
            {
             before(grammarAccess.getTableCellAccess().getContentContentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTableCellAccess().getContentContentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableCell__ContentAssignment_6"


    // $ANTLR start "rule__Text__TextAssignment"
    // InternalEHelp.g:2597:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2601:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2602:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2602:2: ( RULE_STRING )
            // InternalEHelp.g:2603:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Keyword__TextAssignment_1"
    // InternalEHelp.g:2612:1: rule__Keyword__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Keyword__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2616:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2617:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2617:2: ( RULE_STRING )
            // InternalEHelp.g:2618:3: RULE_STRING
            {
             before(grammarAccess.getKeywordAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeywordAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keyword__TextAssignment_1"


    // $ANTLR start "rule__Context__IdAssignment_1"
    // InternalEHelp.g:2627:1: rule__Context__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2631:1: ( ( RULE_ID ) )
            // InternalEHelp.g:2632:2: ( RULE_ID )
            {
            // InternalEHelp.g:2632:2: ( RULE_ID )
            // InternalEHelp.g:2633:3: RULE_ID
            {
             before(grammarAccess.getContextAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__IdAssignment_1"


    // $ANTLR start "rule__Context__LabelAssignment_2"
    // InternalEHelp.g:2642:1: rule__Context__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Context__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2646:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2647:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2647:2: ( RULE_STRING )
            // InternalEHelp.g:2648:3: RULE_STRING
            {
             before(grammarAccess.getContextAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__LabelAssignment_2"


    // $ANTLR start "rule__Images__ImagesAssignment_1"
    // InternalEHelp.g:2657:1: rule__Images__ImagesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Images__ImagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2661:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2662:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2662:2: ( RULE_STRING )
            // InternalEHelp.g:2663:3: RULE_STRING
            {
             before(grammarAccess.getImagesAccess().getImagesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImagesAccess().getImagesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Images__ImagesAssignment_1"


    // $ANTLR start "rule__Link__LinkAssignment_1"
    // InternalEHelp.g:2672:1: rule__Link__LinkAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2676:1: ( ( ( RULE_ID ) ) )
            // InternalEHelp.g:2677:2: ( ( RULE_ID ) )
            {
            // InternalEHelp.g:2677:2: ( ( RULE_ID ) )
            // InternalEHelp.g:2678:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0()); 
            // InternalEHelp.g:2679:3: ( RULE_ID )
            // InternalEHelp.g:2680:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getLinkChapterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkChapterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkAssignment_1"


    // $ANTLR start "rule__Link__CaptionAssignment_2"
    // InternalEHelp.g:2691:1: rule__Link__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Link__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2695:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2696:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2696:2: ( RULE_STRING )
            // InternalEHelp.g:2697:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCaptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CaptionAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\32\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\4\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\14\uffff\1\5\1\6\1\uffff\1\7\3\uffff\1\1\1\2\1\4",
            "",
            "",
            "",
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "498:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007174010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007160012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007160010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010208040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000007E7160010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000010L});

}