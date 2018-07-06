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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'tocpath'", "'copyfile'", "'home'", "'chapter'", "'{'", "'}'", "'list'", "'enum'", "'-'", "'table'", "'spacing'", "'='", "'|'", "'?'", "'!'", "'['", "']'", "'stretch'", "'center'", "'left'", "'right'", "'top'", "'middle'", "'bottom'"
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
    public static final int T__35=35;
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


    // $ANTLR start "entryRuleConfigTOCPath"
    // InternalEHelp.g:103:1: entryRuleConfigTOCPath : ruleConfigTOCPath EOF ;
    public final void entryRuleConfigTOCPath() throws RecognitionException {
        try {
            // InternalEHelp.g:104:1: ( ruleConfigTOCPath EOF )
            // InternalEHelp.g:105:1: ruleConfigTOCPath EOF
            {
             before(grammarAccess.getConfigTOCPathRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigTOCPath();

            state._fsp--;

             after(grammarAccess.getConfigTOCPathRule()); 
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
    // $ANTLR end "entryRuleConfigTOCPath"


    // $ANTLR start "ruleConfigTOCPath"
    // InternalEHelp.g:112:1: ruleConfigTOCPath : ( ( rule__ConfigTOCPath__Group__0 ) ) ;
    public final void ruleConfigTOCPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:116:2: ( ( ( rule__ConfigTOCPath__Group__0 ) ) )
            // InternalEHelp.g:117:2: ( ( rule__ConfigTOCPath__Group__0 ) )
            {
            // InternalEHelp.g:117:2: ( ( rule__ConfigTOCPath__Group__0 ) )
            // InternalEHelp.g:118:3: ( rule__ConfigTOCPath__Group__0 )
            {
             before(grammarAccess.getConfigTOCPathAccess().getGroup()); 
            // InternalEHelp.g:119:3: ( rule__ConfigTOCPath__Group__0 )
            // InternalEHelp.g:119:4: rule__ConfigTOCPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigTOCPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigTOCPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigTOCPath"


    // $ANTLR start "entryRuleConfigCopyFile"
    // InternalEHelp.g:128:1: entryRuleConfigCopyFile : ruleConfigCopyFile EOF ;
    public final void entryRuleConfigCopyFile() throws RecognitionException {
        try {
            // InternalEHelp.g:129:1: ( ruleConfigCopyFile EOF )
            // InternalEHelp.g:130:1: ruleConfigCopyFile EOF
            {
             before(grammarAccess.getConfigCopyFileRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigCopyFile();

            state._fsp--;

             after(grammarAccess.getConfigCopyFileRule()); 
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
    // $ANTLR end "entryRuleConfigCopyFile"


    // $ANTLR start "ruleConfigCopyFile"
    // InternalEHelp.g:137:1: ruleConfigCopyFile : ( ( rule__ConfigCopyFile__Group__0 ) ) ;
    public final void ruleConfigCopyFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:141:2: ( ( ( rule__ConfigCopyFile__Group__0 ) ) )
            // InternalEHelp.g:142:2: ( ( rule__ConfigCopyFile__Group__0 ) )
            {
            // InternalEHelp.g:142:2: ( ( rule__ConfigCopyFile__Group__0 ) )
            // InternalEHelp.g:143:3: ( rule__ConfigCopyFile__Group__0 )
            {
             before(grammarAccess.getConfigCopyFileAccess().getGroup()); 
            // InternalEHelp.g:144:3: ( rule__ConfigCopyFile__Group__0 )
            // InternalEHelp.g:144:4: rule__ConfigCopyFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigCopyFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigCopyFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigCopyFile"


    // $ANTLR start "entryRuleConfigHome"
    // InternalEHelp.g:153:1: entryRuleConfigHome : ruleConfigHome EOF ;
    public final void entryRuleConfigHome() throws RecognitionException {
        try {
            // InternalEHelp.g:154:1: ( ruleConfigHome EOF )
            // InternalEHelp.g:155:1: ruleConfigHome EOF
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
    // InternalEHelp.g:162:1: ruleConfigHome : ( ( rule__ConfigHome__Group__0 ) ) ;
    public final void ruleConfigHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:166:2: ( ( ( rule__ConfigHome__Group__0 ) ) )
            // InternalEHelp.g:167:2: ( ( rule__ConfigHome__Group__0 ) )
            {
            // InternalEHelp.g:167:2: ( ( rule__ConfigHome__Group__0 ) )
            // InternalEHelp.g:168:3: ( rule__ConfigHome__Group__0 )
            {
             before(grammarAccess.getConfigHomeAccess().getGroup()); 
            // InternalEHelp.g:169:3: ( rule__ConfigHome__Group__0 )
            // InternalEHelp.g:169:4: rule__ConfigHome__Group__0
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
    // InternalEHelp.g:178:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalEHelp.g:179:1: ( ruleChapter EOF )
            // InternalEHelp.g:180:1: ruleChapter EOF
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
    // InternalEHelp.g:187:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:191:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalEHelp.g:192:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalEHelp.g:192:2: ( ( rule__Chapter__Group__0 ) )
            // InternalEHelp.g:193:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalEHelp.g:194:3: ( rule__Chapter__Group__0 )
            // InternalEHelp.g:194:4: rule__Chapter__Group__0
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
    // InternalEHelp.g:203:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalEHelp.g:204:1: ( ruleList EOF )
            // InternalEHelp.g:205:1: ruleList EOF
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
    // InternalEHelp.g:212:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:216:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalEHelp.g:217:2: ( ( rule__List__Group__0 ) )
            {
            // InternalEHelp.g:217:2: ( ( rule__List__Group__0 ) )
            // InternalEHelp.g:218:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalEHelp.g:219:3: ( rule__List__Group__0 )
            // InternalEHelp.g:219:4: rule__List__Group__0
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
    // InternalEHelp.g:228:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalEHelp.g:229:1: ( ruleEnum EOF )
            // InternalEHelp.g:230:1: ruleEnum EOF
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
    // InternalEHelp.g:237:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:241:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalEHelp.g:242:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalEHelp.g:242:2: ( ( rule__Enum__Group__0 ) )
            // InternalEHelp.g:243:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalEHelp.g:244:3: ( rule__Enum__Group__0 )
            // InternalEHelp.g:244:4: rule__Enum__Group__0
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
    // InternalEHelp.g:253:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalEHelp.g:254:1: ( ruleListItem EOF )
            // InternalEHelp.g:255:1: ruleListItem EOF
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
    // InternalEHelp.g:262:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:266:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalEHelp.g:267:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalEHelp.g:267:2: ( ( rule__ListItem__Group__0 ) )
            // InternalEHelp.g:268:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalEHelp.g:269:3: ( rule__ListItem__Group__0 )
            // InternalEHelp.g:269:4: rule__ListItem__Group__0
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
    // InternalEHelp.g:278:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalEHelp.g:279:1: ( ruleContent EOF )
            // InternalEHelp.g:280:1: ruleContent EOF
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
    // InternalEHelp.g:287:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:291:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalEHelp.g:292:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalEHelp.g:292:2: ( ( rule__Content__Alternatives ) )
            // InternalEHelp.g:293:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalEHelp.g:294:3: ( rule__Content__Alternatives )
            // InternalEHelp.g:294:4: rule__Content__Alternatives
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
    // InternalEHelp.g:303:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalEHelp.g:304:1: ( ruleTable EOF )
            // InternalEHelp.g:305:1: ruleTable EOF
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
    // InternalEHelp.g:312:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:316:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalEHelp.g:317:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalEHelp.g:317:2: ( ( rule__Table__Group__0 ) )
            // InternalEHelp.g:318:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalEHelp.g:319:3: ( rule__Table__Group__0 )
            // InternalEHelp.g:319:4: rule__Table__Group__0
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
    // InternalEHelp.g:328:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalEHelp.g:329:1: ( ruleTableRow EOF )
            // InternalEHelp.g:330:1: ruleTableRow EOF
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
    // InternalEHelp.g:337:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:341:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalEHelp.g:342:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalEHelp.g:342:2: ( ( rule__TableRow__Group__0 ) )
            // InternalEHelp.g:343:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalEHelp.g:344:3: ( rule__TableRow__Group__0 )
            // InternalEHelp.g:344:4: rule__TableRow__Group__0
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
    // InternalEHelp.g:353:1: entryRuleTableCell : ruleTableCell EOF ;
    public final void entryRuleTableCell() throws RecognitionException {
        try {
            // InternalEHelp.g:354:1: ( ruleTableCell EOF )
            // InternalEHelp.g:355:1: ruleTableCell EOF
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
    // InternalEHelp.g:362:1: ruleTableCell : ( ( rule__TableCell__Group__0 ) ) ;
    public final void ruleTableCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:366:2: ( ( ( rule__TableCell__Group__0 ) ) )
            // InternalEHelp.g:367:2: ( ( rule__TableCell__Group__0 ) )
            {
            // InternalEHelp.g:367:2: ( ( rule__TableCell__Group__0 ) )
            // InternalEHelp.g:368:3: ( rule__TableCell__Group__0 )
            {
             before(grammarAccess.getTableCellAccess().getGroup()); 
            // InternalEHelp.g:369:3: ( rule__TableCell__Group__0 )
            // InternalEHelp.g:369:4: rule__TableCell__Group__0
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
    // InternalEHelp.g:378:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalEHelp.g:379:1: ( ruleText EOF )
            // InternalEHelp.g:380:1: ruleText EOF
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
    // InternalEHelp.g:387:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:391:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalEHelp.g:392:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalEHelp.g:392:2: ( ( rule__Text__TextAssignment ) )
            // InternalEHelp.g:393:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalEHelp.g:394:3: ( rule__Text__TextAssignment )
            // InternalEHelp.g:394:4: rule__Text__TextAssignment
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
    // InternalEHelp.g:403:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalEHelp.g:404:1: ( ruleKeyword EOF )
            // InternalEHelp.g:405:1: ruleKeyword EOF
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
    // InternalEHelp.g:412:1: ruleKeyword : ( ( rule__Keyword__Group__0 ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:416:2: ( ( ( rule__Keyword__Group__0 ) ) )
            // InternalEHelp.g:417:2: ( ( rule__Keyword__Group__0 ) )
            {
            // InternalEHelp.g:417:2: ( ( rule__Keyword__Group__0 ) )
            // InternalEHelp.g:418:3: ( rule__Keyword__Group__0 )
            {
             before(grammarAccess.getKeywordAccess().getGroup()); 
            // InternalEHelp.g:419:3: ( rule__Keyword__Group__0 )
            // InternalEHelp.g:419:4: rule__Keyword__Group__0
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
    // InternalEHelp.g:428:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalEHelp.g:429:1: ( ruleContext EOF )
            // InternalEHelp.g:430:1: ruleContext EOF
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
    // InternalEHelp.g:437:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:441:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalEHelp.g:442:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalEHelp.g:442:2: ( ( rule__Context__Group__0 ) )
            // InternalEHelp.g:443:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalEHelp.g:444:3: ( rule__Context__Group__0 )
            // InternalEHelp.g:444:4: rule__Context__Group__0
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
    // InternalEHelp.g:453:1: entryRuleImages : ruleImages EOF ;
    public final void entryRuleImages() throws RecognitionException {
        try {
            // InternalEHelp.g:454:1: ( ruleImages EOF )
            // InternalEHelp.g:455:1: ruleImages EOF
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
    // InternalEHelp.g:462:1: ruleImages : ( ( rule__Images__Group__0 ) ) ;
    public final void ruleImages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:466:2: ( ( ( rule__Images__Group__0 ) ) )
            // InternalEHelp.g:467:2: ( ( rule__Images__Group__0 ) )
            {
            // InternalEHelp.g:467:2: ( ( rule__Images__Group__0 ) )
            // InternalEHelp.g:468:3: ( rule__Images__Group__0 )
            {
             before(grammarAccess.getImagesAccess().getGroup()); 
            // InternalEHelp.g:469:3: ( rule__Images__Group__0 )
            // InternalEHelp.g:469:4: rule__Images__Group__0
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
    // InternalEHelp.g:478:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalEHelp.g:479:1: ( ruleLink EOF )
            // InternalEHelp.g:480:1: ruleLink EOF
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
    // InternalEHelp.g:487:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:491:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalEHelp.g:492:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalEHelp.g:492:2: ( ( rule__Link__Group__0 ) )
            // InternalEHelp.g:493:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalEHelp.g:494:3: ( rule__Link__Group__0 )
            // InternalEHelp.g:494:4: rule__Link__Group__0
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
    // InternalEHelp.g:502:1: rule__Config__Alternatives : ( ( ruleConfigTOCPath ) | ( ruleConfigCopyFile ) | ( ruleConfigHome ) );
    public final void rule__Config__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:506:1: ( ( ruleConfigTOCPath ) | ( ruleConfigCopyFile ) | ( ruleConfigHome ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                default:
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
                    // InternalEHelp.g:507:2: ( ruleConfigTOCPath )
                    {
                    // InternalEHelp.g:507:2: ( ruleConfigTOCPath )
                    // InternalEHelp.g:508:3: ruleConfigTOCPath
                    {
                     before(grammarAccess.getConfigAccess().getConfigTOCPathParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigTOCPath();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getConfigTOCPathParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEHelp.g:513:2: ( ruleConfigCopyFile )
                    {
                    // InternalEHelp.g:513:2: ( ruleConfigCopyFile )
                    // InternalEHelp.g:514:3: ruleConfigCopyFile
                    {
                     before(grammarAccess.getConfigAccess().getConfigCopyFileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigCopyFile();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getConfigCopyFileParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEHelp.g:519:2: ( ruleConfigHome )
                    {
                    // InternalEHelp.g:519:2: ( ruleConfigHome )
                    // InternalEHelp.g:520:3: ruleConfigHome
                    {
                     before(grammarAccess.getConfigAccess().getConfigHomeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConfigHome();

                    state._fsp--;

                     after(grammarAccess.getConfigAccess().getConfigHomeParserRuleCall_2()); 

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
    // InternalEHelp.g:529:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:533:1: ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEHelp.g:534:2: ( ruleKeyword )
                    {
                    // InternalEHelp.g:534:2: ( ruleKeyword )
                    // InternalEHelp.g:535:3: ruleKeyword
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
                    // InternalEHelp.g:540:2: ( ruleContext )
                    {
                    // InternalEHelp.g:540:2: ( ruleContext )
                    // InternalEHelp.g:541:3: ruleContext
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
                    // InternalEHelp.g:546:2: ( ruleText )
                    {
                    // InternalEHelp.g:546:2: ( ruleText )
                    // InternalEHelp.g:547:3: ruleText
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
                    // InternalEHelp.g:552:2: ( ruleImages )
                    {
                    // InternalEHelp.g:552:2: ( ruleImages )
                    // InternalEHelp.g:553:3: ruleImages
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
                    // InternalEHelp.g:558:2: ( ruleLink )
                    {
                    // InternalEHelp.g:558:2: ( ruleLink )
                    // InternalEHelp.g:559:3: ruleLink
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
                    // InternalEHelp.g:564:2: ( ruleList )
                    {
                    // InternalEHelp.g:564:2: ( ruleList )
                    // InternalEHelp.g:565:3: ruleList
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
                    // InternalEHelp.g:570:2: ( ruleEnum )
                    {
                    // InternalEHelp.g:570:2: ( ruleEnum )
                    // InternalEHelp.g:571:3: ruleEnum
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
                    // InternalEHelp.g:576:2: ( ruleTable )
                    {
                    // InternalEHelp.g:576:2: ( ruleTable )
                    // InternalEHelp.g:577:3: ruleTable
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
    // InternalEHelp.g:586:1: rule__EHelpModel__Group__0 : rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1 ;
    public final void rule__EHelpModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:590:1: ( rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1 )
            // InternalEHelp.g:591:2: rule__EHelpModel__Group__0__Impl rule__EHelpModel__Group__1
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
    // InternalEHelp.g:598:1: rule__EHelpModel__Group__0__Impl : ( ( rule__EHelpModel__ConfigsAssignment_0 )* ) ;
    public final void rule__EHelpModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:602:1: ( ( ( rule__EHelpModel__ConfigsAssignment_0 )* ) )
            // InternalEHelp.g:603:1: ( ( rule__EHelpModel__ConfigsAssignment_0 )* )
            {
            // InternalEHelp.g:603:1: ( ( rule__EHelpModel__ConfigsAssignment_0 )* )
            // InternalEHelp.g:604:2: ( rule__EHelpModel__ConfigsAssignment_0 )*
            {
             before(grammarAccess.getEHelpModelAccess().getConfigsAssignment_0()); 
            // InternalEHelp.g:605:2: ( rule__EHelpModel__ConfigsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEHelp.g:605:3: rule__EHelpModel__ConfigsAssignment_0
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
    // InternalEHelp.g:613:1: rule__EHelpModel__Group__1 : rule__EHelpModel__Group__1__Impl ;
    public final void rule__EHelpModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:617:1: ( rule__EHelpModel__Group__1__Impl )
            // InternalEHelp.g:618:2: rule__EHelpModel__Group__1__Impl
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
    // InternalEHelp.g:624:1: rule__EHelpModel__Group__1__Impl : ( ( rule__EHelpModel__ChaptersAssignment_1 )* ) ;
    public final void rule__EHelpModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:628:1: ( ( ( rule__EHelpModel__ChaptersAssignment_1 )* ) )
            // InternalEHelp.g:629:1: ( ( rule__EHelpModel__ChaptersAssignment_1 )* )
            {
            // InternalEHelp.g:629:1: ( ( rule__EHelpModel__ChaptersAssignment_1 )* )
            // InternalEHelp.g:630:2: ( rule__EHelpModel__ChaptersAssignment_1 )*
            {
             before(grammarAccess.getEHelpModelAccess().getChaptersAssignment_1()); 
            // InternalEHelp.g:631:2: ( rule__EHelpModel__ChaptersAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEHelp.g:631:3: rule__EHelpModel__ChaptersAssignment_1
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


    // $ANTLR start "rule__ConfigTOCPath__Group__0"
    // InternalEHelp.g:640:1: rule__ConfigTOCPath__Group__0 : rule__ConfigTOCPath__Group__0__Impl rule__ConfigTOCPath__Group__1 ;
    public final void rule__ConfigTOCPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:644:1: ( rule__ConfigTOCPath__Group__0__Impl rule__ConfigTOCPath__Group__1 )
            // InternalEHelp.g:645:2: rule__ConfigTOCPath__Group__0__Impl rule__ConfigTOCPath__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfigTOCPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigTOCPath__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__0"


    // $ANTLR start "rule__ConfigTOCPath__Group__0__Impl"
    // InternalEHelp.g:652:1: rule__ConfigTOCPath__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigTOCPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:656:1: ( ( 'config' ) )
            // InternalEHelp.g:657:1: ( 'config' )
            {
            // InternalEHelp.g:657:1: ( 'config' )
            // InternalEHelp.g:658:2: 'config'
            {
             before(grammarAccess.getConfigTOCPathAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConfigTOCPathAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__0__Impl"


    // $ANTLR start "rule__ConfigTOCPath__Group__1"
    // InternalEHelp.g:667:1: rule__ConfigTOCPath__Group__1 : rule__ConfigTOCPath__Group__1__Impl rule__ConfigTOCPath__Group__2 ;
    public final void rule__ConfigTOCPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:671:1: ( rule__ConfigTOCPath__Group__1__Impl rule__ConfigTOCPath__Group__2 )
            // InternalEHelp.g:672:2: rule__ConfigTOCPath__Group__1__Impl rule__ConfigTOCPath__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConfigTOCPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigTOCPath__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__1"


    // $ANTLR start "rule__ConfigTOCPath__Group__1__Impl"
    // InternalEHelp.g:679:1: rule__ConfigTOCPath__Group__1__Impl : ( 'tocpath' ) ;
    public final void rule__ConfigTOCPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:683:1: ( ( 'tocpath' ) )
            // InternalEHelp.g:684:1: ( 'tocpath' )
            {
            // InternalEHelp.g:684:1: ( 'tocpath' )
            // InternalEHelp.g:685:2: 'tocpath'
            {
             before(grammarAccess.getConfigTOCPathAccess().getTocpathKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigTOCPathAccess().getTocpathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__1__Impl"


    // $ANTLR start "rule__ConfigTOCPath__Group__2"
    // InternalEHelp.g:694:1: rule__ConfigTOCPath__Group__2 : rule__ConfigTOCPath__Group__2__Impl ;
    public final void rule__ConfigTOCPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:698:1: ( rule__ConfigTOCPath__Group__2__Impl )
            // InternalEHelp.g:699:2: rule__ConfigTOCPath__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigTOCPath__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__2"


    // $ANTLR start "rule__ConfigTOCPath__Group__2__Impl"
    // InternalEHelp.g:705:1: rule__ConfigTOCPath__Group__2__Impl : ( ( rule__ConfigTOCPath__PathAssignment_2 ) ) ;
    public final void rule__ConfigTOCPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:709:1: ( ( ( rule__ConfigTOCPath__PathAssignment_2 ) ) )
            // InternalEHelp.g:710:1: ( ( rule__ConfigTOCPath__PathAssignment_2 ) )
            {
            // InternalEHelp.g:710:1: ( ( rule__ConfigTOCPath__PathAssignment_2 ) )
            // InternalEHelp.g:711:2: ( rule__ConfigTOCPath__PathAssignment_2 )
            {
             before(grammarAccess.getConfigTOCPathAccess().getPathAssignment_2()); 
            // InternalEHelp.g:712:2: ( rule__ConfigTOCPath__PathAssignment_2 )
            // InternalEHelp.g:712:3: rule__ConfigTOCPath__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigTOCPath__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigTOCPathAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__Group__2__Impl"


    // $ANTLR start "rule__ConfigCopyFile__Group__0"
    // InternalEHelp.g:721:1: rule__ConfigCopyFile__Group__0 : rule__ConfigCopyFile__Group__0__Impl rule__ConfigCopyFile__Group__1 ;
    public final void rule__ConfigCopyFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:725:1: ( rule__ConfigCopyFile__Group__0__Impl rule__ConfigCopyFile__Group__1 )
            // InternalEHelp.g:726:2: rule__ConfigCopyFile__Group__0__Impl rule__ConfigCopyFile__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConfigCopyFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigCopyFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__0"


    // $ANTLR start "rule__ConfigCopyFile__Group__0__Impl"
    // InternalEHelp.g:733:1: rule__ConfigCopyFile__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigCopyFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:737:1: ( ( 'config' ) )
            // InternalEHelp.g:738:1: ( 'config' )
            {
            // InternalEHelp.g:738:1: ( 'config' )
            // InternalEHelp.g:739:2: 'config'
            {
             before(grammarAccess.getConfigCopyFileAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConfigCopyFileAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__0__Impl"


    // $ANTLR start "rule__ConfigCopyFile__Group__1"
    // InternalEHelp.g:748:1: rule__ConfigCopyFile__Group__1 : rule__ConfigCopyFile__Group__1__Impl rule__ConfigCopyFile__Group__2 ;
    public final void rule__ConfigCopyFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:752:1: ( rule__ConfigCopyFile__Group__1__Impl rule__ConfigCopyFile__Group__2 )
            // InternalEHelp.g:753:2: rule__ConfigCopyFile__Group__1__Impl rule__ConfigCopyFile__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ConfigCopyFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigCopyFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__1"


    // $ANTLR start "rule__ConfigCopyFile__Group__1__Impl"
    // InternalEHelp.g:760:1: rule__ConfigCopyFile__Group__1__Impl : ( 'copyfile' ) ;
    public final void rule__ConfigCopyFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:764:1: ( ( 'copyfile' ) )
            // InternalEHelp.g:765:1: ( 'copyfile' )
            {
            // InternalEHelp.g:765:1: ( 'copyfile' )
            // InternalEHelp.g:766:2: 'copyfile'
            {
             before(grammarAccess.getConfigCopyFileAccess().getCopyfileKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigCopyFileAccess().getCopyfileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__1__Impl"


    // $ANTLR start "rule__ConfigCopyFile__Group__2"
    // InternalEHelp.g:775:1: rule__ConfigCopyFile__Group__2 : rule__ConfigCopyFile__Group__2__Impl ;
    public final void rule__ConfigCopyFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:779:1: ( rule__ConfigCopyFile__Group__2__Impl )
            // InternalEHelp.g:780:2: rule__ConfigCopyFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigCopyFile__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__2"


    // $ANTLR start "rule__ConfigCopyFile__Group__2__Impl"
    // InternalEHelp.g:786:1: rule__ConfigCopyFile__Group__2__Impl : ( ( rule__ConfigCopyFile__FileAssignment_2 ) ) ;
    public final void rule__ConfigCopyFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:790:1: ( ( ( rule__ConfigCopyFile__FileAssignment_2 ) ) )
            // InternalEHelp.g:791:1: ( ( rule__ConfigCopyFile__FileAssignment_2 ) )
            {
            // InternalEHelp.g:791:1: ( ( rule__ConfigCopyFile__FileAssignment_2 ) )
            // InternalEHelp.g:792:2: ( rule__ConfigCopyFile__FileAssignment_2 )
            {
             before(grammarAccess.getConfigCopyFileAccess().getFileAssignment_2()); 
            // InternalEHelp.g:793:2: ( rule__ConfigCopyFile__FileAssignment_2 )
            // InternalEHelp.g:793:3: rule__ConfigCopyFile__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigCopyFile__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigCopyFileAccess().getFileAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__Group__2__Impl"


    // $ANTLR start "rule__ConfigHome__Group__0"
    // InternalEHelp.g:802:1: rule__ConfigHome__Group__0 : rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1 ;
    public final void rule__ConfigHome__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:806:1: ( rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1 )
            // InternalEHelp.g:807:2: rule__ConfigHome__Group__0__Impl rule__ConfigHome__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalEHelp.g:814:1: rule__ConfigHome__Group__0__Impl : ( 'config' ) ;
    public final void rule__ConfigHome__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:818:1: ( ( 'config' ) )
            // InternalEHelp.g:819:1: ( 'config' )
            {
            // InternalEHelp.g:819:1: ( 'config' )
            // InternalEHelp.g:820:2: 'config'
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
    // InternalEHelp.g:829:1: rule__ConfigHome__Group__1 : rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2 ;
    public final void rule__ConfigHome__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:833:1: ( rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2 )
            // InternalEHelp.g:834:2: rule__ConfigHome__Group__1__Impl rule__ConfigHome__Group__2
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
    // InternalEHelp.g:841:1: rule__ConfigHome__Group__1__Impl : ( 'home' ) ;
    public final void rule__ConfigHome__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:845:1: ( ( 'home' ) )
            // InternalEHelp.g:846:1: ( 'home' )
            {
            // InternalEHelp.g:846:1: ( 'home' )
            // InternalEHelp.g:847:2: 'home'
            {
             before(grammarAccess.getConfigHomeAccess().getHomeKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEHelp.g:856:1: rule__ConfigHome__Group__2 : rule__ConfigHome__Group__2__Impl ;
    public final void rule__ConfigHome__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:860:1: ( rule__ConfigHome__Group__2__Impl )
            // InternalEHelp.g:861:2: rule__ConfigHome__Group__2__Impl
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
    // InternalEHelp.g:867:1: rule__ConfigHome__Group__2__Impl : ( ( rule__ConfigHome__FileAssignment_2 ) ) ;
    public final void rule__ConfigHome__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:871:1: ( ( ( rule__ConfigHome__FileAssignment_2 ) ) )
            // InternalEHelp.g:872:1: ( ( rule__ConfigHome__FileAssignment_2 ) )
            {
            // InternalEHelp.g:872:1: ( ( rule__ConfigHome__FileAssignment_2 ) )
            // InternalEHelp.g:873:2: ( rule__ConfigHome__FileAssignment_2 )
            {
             before(grammarAccess.getConfigHomeAccess().getFileAssignment_2()); 
            // InternalEHelp.g:874:2: ( rule__ConfigHome__FileAssignment_2 )
            // InternalEHelp.g:874:3: rule__ConfigHome__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigHome__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigHomeAccess().getFileAssignment_2()); 

            }


            }

        }
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
    // InternalEHelp.g:883:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:887:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalEHelp.g:888:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEHelp.g:895:1: rule__Chapter__Group__0__Impl : ( 'chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:899:1: ( ( 'chapter' ) )
            // InternalEHelp.g:900:1: ( 'chapter' )
            {
            // InternalEHelp.g:900:1: ( 'chapter' )
            // InternalEHelp.g:901:2: 'chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEHelp.g:910:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:914:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalEHelp.g:915:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalEHelp.g:922:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__NameAssignment_1 )? ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:926:1: ( ( ( rule__Chapter__NameAssignment_1 )? ) )
            // InternalEHelp.g:927:1: ( ( rule__Chapter__NameAssignment_1 )? )
            {
            // InternalEHelp.g:927:1: ( ( rule__Chapter__NameAssignment_1 )? )
            // InternalEHelp.g:928:2: ( rule__Chapter__NameAssignment_1 )?
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1()); 
            // InternalEHelp.g:929:2: ( rule__Chapter__NameAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEHelp.g:929:3: rule__Chapter__NameAssignment_1
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
    // InternalEHelp.g:937:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:941:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalEHelp.g:942:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:949:1: rule__Chapter__Group__2__Impl : ( ( rule__Chapter__TitleAssignment_2 ) ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:953:1: ( ( ( rule__Chapter__TitleAssignment_2 ) ) )
            // InternalEHelp.g:954:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            {
            // InternalEHelp.g:954:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            // InternalEHelp.g:955:2: ( rule__Chapter__TitleAssignment_2 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_2()); 
            // InternalEHelp.g:956:2: ( rule__Chapter__TitleAssignment_2 )
            // InternalEHelp.g:956:3: rule__Chapter__TitleAssignment_2
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
    // InternalEHelp.g:964:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:968:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalEHelp.g:969:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalEHelp.g:976:1: rule__Chapter__Group__3__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:980:1: ( ( '{' ) )
            // InternalEHelp.g:981:1: ( '{' )
            {
            // InternalEHelp.g:981:1: ( '{' )
            // InternalEHelp.g:982:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:991:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:995:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // InternalEHelp.g:996:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalEHelp.g:1003:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__ContentAssignment_4 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1007:1: ( ( ( rule__Chapter__ContentAssignment_4 )* ) )
            // InternalEHelp.g:1008:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            {
            // InternalEHelp.g:1008:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            // InternalEHelp.g:1009:2: ( rule__Chapter__ContentAssignment_4 )*
            {
             before(grammarAccess.getChapterAccess().getContentAssignment_4()); 
            // InternalEHelp.g:1010:2: ( rule__Chapter__ContentAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||(LA6_0>=18 && LA6_0<=19)||LA6_0==21||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEHelp.g:1010:3: rule__Chapter__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalEHelp.g:1018:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1022:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // InternalEHelp.g:1023:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalEHelp.g:1030:1: rule__Chapter__Group__5__Impl : ( ( rule__Chapter__SubchaptersAssignment_5 )* ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1034:1: ( ( ( rule__Chapter__SubchaptersAssignment_5 )* ) )
            // InternalEHelp.g:1035:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            {
            // InternalEHelp.g:1035:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            // InternalEHelp.g:1036:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            {
             before(grammarAccess.getChapterAccess().getSubchaptersAssignment_5()); 
            // InternalEHelp.g:1037:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEHelp.g:1037:3: rule__Chapter__SubchaptersAssignment_5
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
    // InternalEHelp.g:1045:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1049:1: ( rule__Chapter__Group__6__Impl )
            // InternalEHelp.g:1050:2: rule__Chapter__Group__6__Impl
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
    // InternalEHelp.g:1056:1: rule__Chapter__Group__6__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1060:1: ( ( '}' ) )
            // InternalEHelp.g:1061:1: ( '}' )
            {
            // InternalEHelp.g:1061:1: ( '}' )
            // InternalEHelp.g:1062:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEHelp.g:1072:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1076:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalEHelp.g:1077:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:1084:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1088:1: ( ( 'list' ) )
            // InternalEHelp.g:1089:1: ( 'list' )
            {
            // InternalEHelp.g:1089:1: ( 'list' )
            // InternalEHelp.g:1090:2: 'list'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEHelp.g:1099:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1103:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalEHelp.g:1104:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1111:1: rule__List__Group__1__Impl : ( '{' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1115:1: ( ( '{' ) )
            // InternalEHelp.g:1116:1: ( '{' )
            {
            // InternalEHelp.g:1116:1: ( '{' )
            // InternalEHelp.g:1117:2: '{'
            {
             before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:1126:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1130:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // InternalEHelp.g:1131:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1138:1: rule__List__Group__2__Impl : ( ( rule__List__ItemsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1142:1: ( ( ( rule__List__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:1143:1: ( ( rule__List__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:1143:1: ( ( rule__List__ItemsAssignment_2 )* )
            // InternalEHelp.g:1144:2: ( rule__List__ItemsAssignment_2 )*
            {
             before(grammarAccess.getListAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:1145:2: ( rule__List__ItemsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEHelp.g:1145:3: rule__List__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalEHelp.g:1153:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1157:1: ( rule__List__Group__3__Impl )
            // InternalEHelp.g:1158:2: rule__List__Group__3__Impl
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
    // InternalEHelp.g:1164:1: rule__List__Group__3__Impl : ( '}' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1168:1: ( ( '}' ) )
            // InternalEHelp.g:1169:1: ( '}' )
            {
            // InternalEHelp.g:1169:1: ( '}' )
            // InternalEHelp.g:1170:2: '}'
            {
             before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEHelp.g:1180:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1184:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalEHelp.g:1185:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:1192:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1196:1: ( ( 'enum' ) )
            // InternalEHelp.g:1197:1: ( 'enum' )
            {
            // InternalEHelp.g:1197:1: ( 'enum' )
            // InternalEHelp.g:1198:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEHelp.g:1207:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1211:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalEHelp.g:1212:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1219:1: rule__Enum__Group__1__Impl : ( '{' ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1223:1: ( ( '{' ) )
            // InternalEHelp.g:1224:1: ( '{' )
            {
            // InternalEHelp.g:1224:1: ( '{' )
            // InternalEHelp.g:1225:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:1234:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1238:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalEHelp.g:1239:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1246:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__ItemsAssignment_2 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1250:1: ( ( ( rule__Enum__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:1251:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:1251:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            // InternalEHelp.g:1252:2: ( rule__Enum__ItemsAssignment_2 )*
            {
             before(grammarAccess.getEnumAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:1253:2: ( rule__Enum__ItemsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEHelp.g:1253:3: rule__Enum__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalEHelp.g:1261:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1265:1: ( rule__Enum__Group__3__Impl )
            // InternalEHelp.g:1266:2: rule__Enum__Group__3__Impl
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
    // InternalEHelp.g:1272:1: rule__Enum__Group__3__Impl : ( '}' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1276:1: ( ( '}' ) )
            // InternalEHelp.g:1277:1: ( '}' )
            {
            // InternalEHelp.g:1277:1: ( '}' )
            // InternalEHelp.g:1278:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEHelp.g:1288:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1292:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalEHelp.g:1293:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEHelp.g:1300:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1304:1: ( ( '-' ) )
            // InternalEHelp.g:1305:1: ( '-' )
            {
            // InternalEHelp.g:1305:1: ( '-' )
            // InternalEHelp.g:1306:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEHelp.g:1315:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1319:1: ( rule__ListItem__Group__1__Impl )
            // InternalEHelp.g:1320:2: rule__ListItem__Group__1__Impl
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
    // InternalEHelp.g:1326:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ContentAssignment_1 )* ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1330:1: ( ( ( rule__ListItem__ContentAssignment_1 )* ) )
            // InternalEHelp.g:1331:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            {
            // InternalEHelp.g:1331:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            // InternalEHelp.g:1332:2: ( rule__ListItem__ContentAssignment_1 )*
            {
             before(grammarAccess.getListItemAccess().getContentAssignment_1()); 
            // InternalEHelp.g:1333:2: ( rule__ListItem__ContentAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||(LA10_0>=18 && LA10_0<=19)||LA10_0==21||(LA10_0>=25 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEHelp.g:1333:3: rule__ListItem__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalEHelp.g:1342:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1346:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalEHelp.g:1347:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1354:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1358:1: ( ( 'table' ) )
            // InternalEHelp.g:1359:1: ( 'table' )
            {
            // InternalEHelp.g:1359:1: ( 'table' )
            // InternalEHelp.g:1360:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEHelp.g:1369:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1373:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalEHelp.g:1374:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1381:1: rule__Table__Group__1__Impl : ( ( rule__Table__WidthAssignment_1 )? ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1385:1: ( ( ( rule__Table__WidthAssignment_1 )? ) )
            // InternalEHelp.g:1386:1: ( ( rule__Table__WidthAssignment_1 )? )
            {
            // InternalEHelp.g:1386:1: ( ( rule__Table__WidthAssignment_1 )? )
            // InternalEHelp.g:1387:2: ( rule__Table__WidthAssignment_1 )?
            {
             before(grammarAccess.getTableAccess().getWidthAssignment_1()); 
            // InternalEHelp.g:1388:2: ( rule__Table__WidthAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEHelp.g:1388:3: rule__Table__WidthAssignment_1
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
    // InternalEHelp.g:1396:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1400:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalEHelp.g:1401:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1408:1: rule__Table__Group__2__Impl : ( ( rule__Table__Group_2__0 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1412:1: ( ( ( rule__Table__Group_2__0 )? ) )
            // InternalEHelp.g:1413:1: ( ( rule__Table__Group_2__0 )? )
            {
            // InternalEHelp.g:1413:1: ( ( rule__Table__Group_2__0 )? )
            // InternalEHelp.g:1414:2: ( rule__Table__Group_2__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_2()); 
            // InternalEHelp.g:1415:2: ( rule__Table__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEHelp.g:1415:3: rule__Table__Group_2__0
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
    // InternalEHelp.g:1423:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1427:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalEHelp.g:1428:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1435:1: rule__Table__Group__3__Impl : ( ( rule__Table__StretchAssignment_3 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1439:1: ( ( ( rule__Table__StretchAssignment_3 )? ) )
            // InternalEHelp.g:1440:1: ( ( rule__Table__StretchAssignment_3 )? )
            {
            // InternalEHelp.g:1440:1: ( ( rule__Table__StretchAssignment_3 )? )
            // InternalEHelp.g:1441:2: ( rule__Table__StretchAssignment_3 )?
            {
             before(grammarAccess.getTableAccess().getStretchAssignment_3()); 
            // InternalEHelp.g:1442:2: ( rule__Table__StretchAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEHelp.g:1442:3: rule__Table__StretchAssignment_3
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
    // InternalEHelp.g:1450:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1454:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalEHelp.g:1455:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1462:1: rule__Table__Group__4__Impl : ( '{' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1466:1: ( ( '{' ) )
            // InternalEHelp.g:1467:1: ( '{' )
            {
            // InternalEHelp.g:1467:1: ( '{' )
            // InternalEHelp.g:1468:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:1477:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1481:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalEHelp.g:1482:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1489:1: rule__Table__Group__5__Impl : ( ( rule__Table__RowsAssignment_5 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1493:1: ( ( ( rule__Table__RowsAssignment_5 )* ) )
            // InternalEHelp.g:1494:1: ( ( rule__Table__RowsAssignment_5 )* )
            {
            // InternalEHelp.g:1494:1: ( ( rule__Table__RowsAssignment_5 )* )
            // InternalEHelp.g:1495:2: ( rule__Table__RowsAssignment_5 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_5()); 
            // InternalEHelp.g:1496:2: ( rule__Table__RowsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEHelp.g:1496:3: rule__Table__RowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalEHelp.g:1504:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1508:1: ( rule__Table__Group__6__Impl )
            // InternalEHelp.g:1509:2: rule__Table__Group__6__Impl
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
    // InternalEHelp.g:1515:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1519:1: ( ( '}' ) )
            // InternalEHelp.g:1520:1: ( '}' )
            {
            // InternalEHelp.g:1520:1: ( '}' )
            // InternalEHelp.g:1521:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEHelp.g:1531:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1535:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalEHelp.g:1536:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalEHelp.g:1543:1: rule__Table__Group_2__0__Impl : ( 'spacing' ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1547:1: ( ( 'spacing' ) )
            // InternalEHelp.g:1548:1: ( 'spacing' )
            {
            // InternalEHelp.g:1548:1: ( 'spacing' )
            // InternalEHelp.g:1549:2: 'spacing'
            {
             before(grammarAccess.getTableAccess().getSpacingKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEHelp.g:1558:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl rule__Table__Group_2__2 ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1562:1: ( rule__Table__Group_2__1__Impl rule__Table__Group_2__2 )
            // InternalEHelp.g:1563:2: rule__Table__Group_2__1__Impl rule__Table__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalEHelp.g:1570:1: rule__Table__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1574:1: ( ( '=' ) )
            // InternalEHelp.g:1575:1: ( '=' )
            {
            // InternalEHelp.g:1575:1: ( '=' )
            // InternalEHelp.g:1576:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEHelp.g:1585:1: rule__Table__Group_2__2 : rule__Table__Group_2__2__Impl ;
    public final void rule__Table__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1589:1: ( rule__Table__Group_2__2__Impl )
            // InternalEHelp.g:1590:2: rule__Table__Group_2__2__Impl
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
    // InternalEHelp.g:1596:1: rule__Table__Group_2__2__Impl : ( ( rule__Table__SpacingAssignment_2_2 ) ) ;
    public final void rule__Table__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1600:1: ( ( ( rule__Table__SpacingAssignment_2_2 ) ) )
            // InternalEHelp.g:1601:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            {
            // InternalEHelp.g:1601:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            // InternalEHelp.g:1602:2: ( rule__Table__SpacingAssignment_2_2 )
            {
             before(grammarAccess.getTableAccess().getSpacingAssignment_2_2()); 
            // InternalEHelp.g:1603:2: ( rule__Table__SpacingAssignment_2_2 )
            // InternalEHelp.g:1603:3: rule__Table__SpacingAssignment_2_2
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
    // InternalEHelp.g:1612:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1616:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalEHelp.g:1617:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1624:1: rule__TableRow__Group__0__Impl : ( '-' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1628:1: ( ( '-' ) )
            // InternalEHelp.g:1629:1: ( '-' )
            {
            // InternalEHelp.g:1629:1: ( '-' )
            // InternalEHelp.g:1630:2: '-'
            {
             before(grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEHelp.g:1639:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1643:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalEHelp.g:1644:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalEHelp.g:1651:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__CellsAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1655:1: ( ( ( rule__TableRow__CellsAssignment_1 ) ) )
            // InternalEHelp.g:1656:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            {
            // InternalEHelp.g:1656:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            // InternalEHelp.g:1657:2: ( rule__TableRow__CellsAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_1()); 
            // InternalEHelp.g:1658:2: ( rule__TableRow__CellsAssignment_1 )
            // InternalEHelp.g:1658:3: rule__TableRow__CellsAssignment_1
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
    // InternalEHelp.g:1666:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1670:1: ( rule__TableRow__Group__2__Impl )
            // InternalEHelp.g:1671:2: rule__TableRow__Group__2__Impl
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
    // InternalEHelp.g:1677:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1681:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalEHelp.g:1682:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalEHelp.g:1682:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalEHelp.g:1683:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalEHelp.g:1684:2: ( rule__TableRow__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEHelp.g:1684:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalEHelp.g:1693:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1697:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalEHelp.g:1698:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1705:1: rule__TableRow__Group_2__0__Impl : ( '|' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1709:1: ( ( '|' ) )
            // InternalEHelp.g:1710:1: ( '|' )
            {
            // InternalEHelp.g:1710:1: ( '|' )
            // InternalEHelp.g:1711:2: '|'
            {
             before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEHelp.g:1720:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1724:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalEHelp.g:1725:2: rule__TableRow__Group_2__1__Impl
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
    // InternalEHelp.g:1731:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__CellsAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1735:1: ( ( ( rule__TableRow__CellsAssignment_2_1 ) ) )
            // InternalEHelp.g:1736:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            {
            // InternalEHelp.g:1736:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            // InternalEHelp.g:1737:2: ( rule__TableRow__CellsAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_2_1()); 
            // InternalEHelp.g:1738:2: ( rule__TableRow__CellsAssignment_2_1 )
            // InternalEHelp.g:1738:3: rule__TableRow__CellsAssignment_2_1
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
    // InternalEHelp.g:1747:1: rule__TableCell__Group__0 : rule__TableCell__Group__0__Impl rule__TableCell__Group__1 ;
    public final void rule__TableCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1751:1: ( rule__TableCell__Group__0__Impl rule__TableCell__Group__1 )
            // InternalEHelp.g:1752:2: rule__TableCell__Group__0__Impl rule__TableCell__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1759:1: rule__TableCell__Group__0__Impl : ( ( rule__TableCell__CenterAssignment_0 )? ) ;
    public final void rule__TableCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1763:1: ( ( ( rule__TableCell__CenterAssignment_0 )? ) )
            // InternalEHelp.g:1764:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            {
            // InternalEHelp.g:1764:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            // InternalEHelp.g:1765:2: ( rule__TableCell__CenterAssignment_0 )?
            {
             before(grammarAccess.getTableCellAccess().getCenterAssignment_0()); 
            // InternalEHelp.g:1766:2: ( rule__TableCell__CenterAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEHelp.g:1766:3: rule__TableCell__CenterAssignment_0
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
    // InternalEHelp.g:1774:1: rule__TableCell__Group__1 : rule__TableCell__Group__1__Impl rule__TableCell__Group__2 ;
    public final void rule__TableCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1778:1: ( rule__TableCell__Group__1__Impl rule__TableCell__Group__2 )
            // InternalEHelp.g:1779:2: rule__TableCell__Group__1__Impl rule__TableCell__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1786:1: rule__TableCell__Group__1__Impl : ( ( rule__TableCell__LeftAssignment_1 )? ) ;
    public final void rule__TableCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1790:1: ( ( ( rule__TableCell__LeftAssignment_1 )? ) )
            // InternalEHelp.g:1791:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            {
            // InternalEHelp.g:1791:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            // InternalEHelp.g:1792:2: ( rule__TableCell__LeftAssignment_1 )?
            {
             before(grammarAccess.getTableCellAccess().getLeftAssignment_1()); 
            // InternalEHelp.g:1793:2: ( rule__TableCell__LeftAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEHelp.g:1793:3: rule__TableCell__LeftAssignment_1
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
    // InternalEHelp.g:1801:1: rule__TableCell__Group__2 : rule__TableCell__Group__2__Impl rule__TableCell__Group__3 ;
    public final void rule__TableCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1805:1: ( rule__TableCell__Group__2__Impl rule__TableCell__Group__3 )
            // InternalEHelp.g:1806:2: rule__TableCell__Group__2__Impl rule__TableCell__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1813:1: rule__TableCell__Group__2__Impl : ( ( rule__TableCell__RightAssignment_2 )? ) ;
    public final void rule__TableCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1817:1: ( ( ( rule__TableCell__RightAssignment_2 )? ) )
            // InternalEHelp.g:1818:1: ( ( rule__TableCell__RightAssignment_2 )? )
            {
            // InternalEHelp.g:1818:1: ( ( rule__TableCell__RightAssignment_2 )? )
            // InternalEHelp.g:1819:2: ( rule__TableCell__RightAssignment_2 )?
            {
             before(grammarAccess.getTableCellAccess().getRightAssignment_2()); 
            // InternalEHelp.g:1820:2: ( rule__TableCell__RightAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEHelp.g:1820:3: rule__TableCell__RightAssignment_2
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
    // InternalEHelp.g:1828:1: rule__TableCell__Group__3 : rule__TableCell__Group__3__Impl rule__TableCell__Group__4 ;
    public final void rule__TableCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1832:1: ( rule__TableCell__Group__3__Impl rule__TableCell__Group__4 )
            // InternalEHelp.g:1833:2: rule__TableCell__Group__3__Impl rule__TableCell__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1840:1: rule__TableCell__Group__3__Impl : ( ( rule__TableCell__TopAssignment_3 )? ) ;
    public final void rule__TableCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1844:1: ( ( ( rule__TableCell__TopAssignment_3 )? ) )
            // InternalEHelp.g:1845:1: ( ( rule__TableCell__TopAssignment_3 )? )
            {
            // InternalEHelp.g:1845:1: ( ( rule__TableCell__TopAssignment_3 )? )
            // InternalEHelp.g:1846:2: ( rule__TableCell__TopAssignment_3 )?
            {
             before(grammarAccess.getTableCellAccess().getTopAssignment_3()); 
            // InternalEHelp.g:1847:2: ( rule__TableCell__TopAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEHelp.g:1847:3: rule__TableCell__TopAssignment_3
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
    // InternalEHelp.g:1855:1: rule__TableCell__Group__4 : rule__TableCell__Group__4__Impl rule__TableCell__Group__5 ;
    public final void rule__TableCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1859:1: ( rule__TableCell__Group__4__Impl rule__TableCell__Group__5 )
            // InternalEHelp.g:1860:2: rule__TableCell__Group__4__Impl rule__TableCell__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1867:1: rule__TableCell__Group__4__Impl : ( ( rule__TableCell__MiddleAssignment_4 )? ) ;
    public final void rule__TableCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1871:1: ( ( ( rule__TableCell__MiddleAssignment_4 )? ) )
            // InternalEHelp.g:1872:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            {
            // InternalEHelp.g:1872:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            // InternalEHelp.g:1873:2: ( rule__TableCell__MiddleAssignment_4 )?
            {
             before(grammarAccess.getTableCellAccess().getMiddleAssignment_4()); 
            // InternalEHelp.g:1874:2: ( rule__TableCell__MiddleAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEHelp.g:1874:3: rule__TableCell__MiddleAssignment_4
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
    // InternalEHelp.g:1882:1: rule__TableCell__Group__5 : rule__TableCell__Group__5__Impl rule__TableCell__Group__6 ;
    public final void rule__TableCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1886:1: ( rule__TableCell__Group__5__Impl rule__TableCell__Group__6 )
            // InternalEHelp.g:1887:2: rule__TableCell__Group__5__Impl rule__TableCell__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1894:1: rule__TableCell__Group__5__Impl : ( ( rule__TableCell__BottomAssignment_5 )? ) ;
    public final void rule__TableCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1898:1: ( ( ( rule__TableCell__BottomAssignment_5 )? ) )
            // InternalEHelp.g:1899:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            {
            // InternalEHelp.g:1899:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            // InternalEHelp.g:1900:2: ( rule__TableCell__BottomAssignment_5 )?
            {
             before(grammarAccess.getTableCellAccess().getBottomAssignment_5()); 
            // InternalEHelp.g:1901:2: ( rule__TableCell__BottomAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEHelp.g:1901:3: rule__TableCell__BottomAssignment_5
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
    // InternalEHelp.g:1909:1: rule__TableCell__Group__6 : rule__TableCell__Group__6__Impl ;
    public final void rule__TableCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1913:1: ( rule__TableCell__Group__6__Impl )
            // InternalEHelp.g:1914:2: rule__TableCell__Group__6__Impl
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
    // InternalEHelp.g:1920:1: rule__TableCell__Group__6__Impl : ( ( rule__TableCell__ContentAssignment_6 )* ) ;
    public final void rule__TableCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1924:1: ( ( ( rule__TableCell__ContentAssignment_6 )* ) )
            // InternalEHelp.g:1925:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            {
            // InternalEHelp.g:1925:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            // InternalEHelp.g:1926:2: ( rule__TableCell__ContentAssignment_6 )*
            {
             before(grammarAccess.getTableCellAccess().getContentAssignment_6()); 
            // InternalEHelp.g:1927:2: ( rule__TableCell__ContentAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||(LA22_0>=18 && LA22_0<=19)||LA22_0==21||(LA22_0>=25 && LA22_0<=27)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEHelp.g:1927:3: rule__TableCell__ContentAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalEHelp.g:1936:1: rule__Keyword__Group__0 : rule__Keyword__Group__0__Impl rule__Keyword__Group__1 ;
    public final void rule__Keyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1940:1: ( rule__Keyword__Group__0__Impl rule__Keyword__Group__1 )
            // InternalEHelp.g:1941:2: rule__Keyword__Group__0__Impl rule__Keyword__Group__1
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
    // InternalEHelp.g:1948:1: rule__Keyword__Group__0__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1952:1: ( ( '?' ) )
            // InternalEHelp.g:1953:1: ( '?' )
            {
            // InternalEHelp.g:1953:1: ( '?' )
            // InternalEHelp.g:1954:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEHelp.g:1963:1: rule__Keyword__Group__1 : rule__Keyword__Group__1__Impl rule__Keyword__Group__2 ;
    public final void rule__Keyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1967:1: ( rule__Keyword__Group__1__Impl rule__Keyword__Group__2 )
            // InternalEHelp.g:1968:2: rule__Keyword__Group__1__Impl rule__Keyword__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalEHelp.g:1975:1: rule__Keyword__Group__1__Impl : ( ( rule__Keyword__TextAssignment_1 ) ) ;
    public final void rule__Keyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1979:1: ( ( ( rule__Keyword__TextAssignment_1 ) ) )
            // InternalEHelp.g:1980:1: ( ( rule__Keyword__TextAssignment_1 ) )
            {
            // InternalEHelp.g:1980:1: ( ( rule__Keyword__TextAssignment_1 ) )
            // InternalEHelp.g:1981:2: ( rule__Keyword__TextAssignment_1 )
            {
             before(grammarAccess.getKeywordAccess().getTextAssignment_1()); 
            // InternalEHelp.g:1982:2: ( rule__Keyword__TextAssignment_1 )
            // InternalEHelp.g:1982:3: rule__Keyword__TextAssignment_1
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
    // InternalEHelp.g:1990:1: rule__Keyword__Group__2 : rule__Keyword__Group__2__Impl ;
    public final void rule__Keyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1994:1: ( rule__Keyword__Group__2__Impl )
            // InternalEHelp.g:1995:2: rule__Keyword__Group__2__Impl
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
    // InternalEHelp.g:2001:1: rule__Keyword__Group__2__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2005:1: ( ( '?' ) )
            // InternalEHelp.g:2006:1: ( '?' )
            {
            // InternalEHelp.g:2006:1: ( '?' )
            // InternalEHelp.g:2007:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEHelp.g:2017:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2021:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalEHelp.g:2022:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalEHelp.g:2029:1: rule__Context__Group__0__Impl : ( '!' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2033:1: ( ( '!' ) )
            // InternalEHelp.g:2034:1: ( '!' )
            {
            // InternalEHelp.g:2034:1: ( '!' )
            // InternalEHelp.g:2035:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEHelp.g:2044:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2048:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalEHelp.g:2049:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalEHelp.g:2056:1: rule__Context__Group__1__Impl : ( ( rule__Context__IdAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2060:1: ( ( ( rule__Context__IdAssignment_1 ) ) )
            // InternalEHelp.g:2061:1: ( ( rule__Context__IdAssignment_1 ) )
            {
            // InternalEHelp.g:2061:1: ( ( rule__Context__IdAssignment_1 ) )
            // InternalEHelp.g:2062:2: ( rule__Context__IdAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getIdAssignment_1()); 
            // InternalEHelp.g:2063:2: ( rule__Context__IdAssignment_1 )
            // InternalEHelp.g:2063:3: rule__Context__IdAssignment_1
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
    // InternalEHelp.g:2071:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2075:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalEHelp.g:2076:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalEHelp.g:2083:1: rule__Context__Group__2__Impl : ( ( rule__Context__LabelAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2087:1: ( ( ( rule__Context__LabelAssignment_2 ) ) )
            // InternalEHelp.g:2088:1: ( ( rule__Context__LabelAssignment_2 ) )
            {
            // InternalEHelp.g:2088:1: ( ( rule__Context__LabelAssignment_2 ) )
            // InternalEHelp.g:2089:2: ( rule__Context__LabelAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getLabelAssignment_2()); 
            // InternalEHelp.g:2090:2: ( rule__Context__LabelAssignment_2 )
            // InternalEHelp.g:2090:3: rule__Context__LabelAssignment_2
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
    // InternalEHelp.g:2098:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2102:1: ( rule__Context__Group__3__Impl )
            // InternalEHelp.g:2103:2: rule__Context__Group__3__Impl
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
    // InternalEHelp.g:2109:1: rule__Context__Group__3__Impl : ( '!' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2113:1: ( ( '!' ) )
            // InternalEHelp.g:2114:1: ( '!' )
            {
            // InternalEHelp.g:2114:1: ( '!' )
            // InternalEHelp.g:2115:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEHelp.g:2125:1: rule__Images__Group__0 : rule__Images__Group__0__Impl rule__Images__Group__1 ;
    public final void rule__Images__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2129:1: ( rule__Images__Group__0__Impl rule__Images__Group__1 )
            // InternalEHelp.g:2130:2: rule__Images__Group__0__Impl rule__Images__Group__1
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
    // InternalEHelp.g:2137:1: rule__Images__Group__0__Impl : ( '[' ) ;
    public final void rule__Images__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2141:1: ( ( '[' ) )
            // InternalEHelp.g:2142:1: ( '[' )
            {
            // InternalEHelp.g:2142:1: ( '[' )
            // InternalEHelp.g:2143:2: '['
            {
             before(grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEHelp.g:2152:1: rule__Images__Group__1 : rule__Images__Group__1__Impl rule__Images__Group__2 ;
    public final void rule__Images__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2156:1: ( rule__Images__Group__1__Impl rule__Images__Group__2 )
            // InternalEHelp.g:2157:2: rule__Images__Group__1__Impl rule__Images__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalEHelp.g:2164:1: rule__Images__Group__1__Impl : ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) ;
    public final void rule__Images__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2168:1: ( ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) )
            // InternalEHelp.g:2169:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            {
            // InternalEHelp.g:2169:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            // InternalEHelp.g:2170:2: ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* )
            {
            // InternalEHelp.g:2170:2: ( ( rule__Images__ImagesAssignment_1 ) )
            // InternalEHelp.g:2171:3: ( rule__Images__ImagesAssignment_1 )
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:2172:3: ( rule__Images__ImagesAssignment_1 )
            // InternalEHelp.g:2172:4: rule__Images__ImagesAssignment_1
            {
            pushFollow(FOLLOW_27);
            rule__Images__ImagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImagesAccess().getImagesAssignment_1()); 

            }

            // InternalEHelp.g:2175:2: ( ( rule__Images__ImagesAssignment_1 )* )
            // InternalEHelp.g:2176:3: ( rule__Images__ImagesAssignment_1 )*
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:2177:3: ( rule__Images__ImagesAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEHelp.g:2177:4: rule__Images__ImagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalEHelp.g:2186:1: rule__Images__Group__2 : rule__Images__Group__2__Impl ;
    public final void rule__Images__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2190:1: ( rule__Images__Group__2__Impl )
            // InternalEHelp.g:2191:2: rule__Images__Group__2__Impl
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
    // InternalEHelp.g:2197:1: rule__Images__Group__2__Impl : ( ']' ) ;
    public final void rule__Images__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2201:1: ( ( ']' ) )
            // InternalEHelp.g:2202:1: ( ']' )
            {
            // InternalEHelp.g:2202:1: ( ']' )
            // InternalEHelp.g:2203:2: ']'
            {
             before(grammarAccess.getImagesAccess().getRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEHelp.g:2213:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2217:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalEHelp.g:2218:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalEHelp.g:2225:1: rule__Link__Group__0__Impl : ( '[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2229:1: ( ( '[' ) )
            // InternalEHelp.g:2230:1: ( '[' )
            {
            // InternalEHelp.g:2230:1: ( '[' )
            // InternalEHelp.g:2231:2: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEHelp.g:2240:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2244:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalEHelp.g:2245:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalEHelp.g:2252:1: rule__Link__Group__1__Impl : ( ( rule__Link__LinkAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2256:1: ( ( ( rule__Link__LinkAssignment_1 ) ) )
            // InternalEHelp.g:2257:1: ( ( rule__Link__LinkAssignment_1 ) )
            {
            // InternalEHelp.g:2257:1: ( ( rule__Link__LinkAssignment_1 ) )
            // InternalEHelp.g:2258:2: ( rule__Link__LinkAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_1()); 
            // InternalEHelp.g:2259:2: ( rule__Link__LinkAssignment_1 )
            // InternalEHelp.g:2259:3: rule__Link__LinkAssignment_1
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
    // InternalEHelp.g:2267:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2271:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalEHelp.g:2272:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalEHelp.g:2279:1: rule__Link__Group__2__Impl : ( ( rule__Link__CaptionAssignment_2 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2283:1: ( ( ( rule__Link__CaptionAssignment_2 )? ) )
            // InternalEHelp.g:2284:1: ( ( rule__Link__CaptionAssignment_2 )? )
            {
            // InternalEHelp.g:2284:1: ( ( rule__Link__CaptionAssignment_2 )? )
            // InternalEHelp.g:2285:2: ( rule__Link__CaptionAssignment_2 )?
            {
             before(grammarAccess.getLinkAccess().getCaptionAssignment_2()); 
            // InternalEHelp.g:2286:2: ( rule__Link__CaptionAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEHelp.g:2286:3: rule__Link__CaptionAssignment_2
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
    // InternalEHelp.g:2294:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2298:1: ( rule__Link__Group__3__Impl )
            // InternalEHelp.g:2299:2: rule__Link__Group__3__Impl
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
    // InternalEHelp.g:2305:1: rule__Link__Group__3__Impl : ( ']' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2309:1: ( ( ']' ) )
            // InternalEHelp.g:2310:1: ( ']' )
            {
            // InternalEHelp.g:2310:1: ( ']' )
            // InternalEHelp.g:2311:2: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEHelp.g:2321:1: rule__EHelpModel__ConfigsAssignment_0 : ( ruleConfig ) ;
    public final void rule__EHelpModel__ConfigsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2325:1: ( ( ruleConfig ) )
            // InternalEHelp.g:2326:2: ( ruleConfig )
            {
            // InternalEHelp.g:2326:2: ( ruleConfig )
            // InternalEHelp.g:2327:3: ruleConfig
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
    // InternalEHelp.g:2336:1: rule__EHelpModel__ChaptersAssignment_1 : ( ruleChapter ) ;
    public final void rule__EHelpModel__ChaptersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2340:1: ( ( ruleChapter ) )
            // InternalEHelp.g:2341:2: ( ruleChapter )
            {
            // InternalEHelp.g:2341:2: ( ruleChapter )
            // InternalEHelp.g:2342:3: ruleChapter
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


    // $ANTLR start "rule__ConfigTOCPath__PathAssignment_2"
    // InternalEHelp.g:2351:1: rule__ConfigTOCPath__PathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConfigTOCPath__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2355:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2356:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2356:2: ( RULE_STRING )
            // InternalEHelp.g:2357:3: RULE_STRING
            {
             before(grammarAccess.getConfigTOCPathAccess().getPathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigTOCPathAccess().getPathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigTOCPath__PathAssignment_2"


    // $ANTLR start "rule__ConfigCopyFile__FileAssignment_2"
    // InternalEHelp.g:2366:1: rule__ConfigCopyFile__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConfigCopyFile__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2370:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2371:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2371:2: ( RULE_STRING )
            // InternalEHelp.g:2372:3: RULE_STRING
            {
             before(grammarAccess.getConfigCopyFileAccess().getFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigCopyFileAccess().getFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigCopyFile__FileAssignment_2"


    // $ANTLR start "rule__ConfigHome__FileAssignment_2"
    // InternalEHelp.g:2381:1: rule__ConfigHome__FileAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConfigHome__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2385:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2386:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2386:2: ( RULE_STRING )
            // InternalEHelp.g:2387:3: RULE_STRING
            {
             before(grammarAccess.getConfigHomeAccess().getFileSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigHomeAccess().getFileSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigHome__FileAssignment_2"


    // $ANTLR start "rule__Chapter__NameAssignment_1"
    // InternalEHelp.g:2396:1: rule__Chapter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2400:1: ( ( RULE_ID ) )
            // InternalEHelp.g:2401:2: ( RULE_ID )
            {
            // InternalEHelp.g:2401:2: ( RULE_ID )
            // InternalEHelp.g:2402:3: RULE_ID
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
    // InternalEHelp.g:2411:1: rule__Chapter__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chapter__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2415:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2416:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2416:2: ( RULE_STRING )
            // InternalEHelp.g:2417:3: RULE_STRING
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
    // InternalEHelp.g:2426:1: rule__Chapter__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__Chapter__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2430:1: ( ( ruleContent ) )
            // InternalEHelp.g:2431:2: ( ruleContent )
            {
            // InternalEHelp.g:2431:2: ( ruleContent )
            // InternalEHelp.g:2432:3: ruleContent
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
    // InternalEHelp.g:2441:1: rule__Chapter__SubchaptersAssignment_5 : ( ruleChapter ) ;
    public final void rule__Chapter__SubchaptersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2445:1: ( ( ruleChapter ) )
            // InternalEHelp.g:2446:2: ( ruleChapter )
            {
            // InternalEHelp.g:2446:2: ( ruleChapter )
            // InternalEHelp.g:2447:3: ruleChapter
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
    // InternalEHelp.g:2456:1: rule__List__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__List__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2460:1: ( ( ruleListItem ) )
            // InternalEHelp.g:2461:2: ( ruleListItem )
            {
            // InternalEHelp.g:2461:2: ( ruleListItem )
            // InternalEHelp.g:2462:3: ruleListItem
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
    // InternalEHelp.g:2471:1: rule__Enum__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__Enum__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2475:1: ( ( ruleListItem ) )
            // InternalEHelp.g:2476:2: ( ruleListItem )
            {
            // InternalEHelp.g:2476:2: ( ruleListItem )
            // InternalEHelp.g:2477:3: ruleListItem
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
    // InternalEHelp.g:2486:1: rule__ListItem__ContentAssignment_1 : ( ruleContent ) ;
    public final void rule__ListItem__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2490:1: ( ( ruleContent ) )
            // InternalEHelp.g:2491:2: ( ruleContent )
            {
            // InternalEHelp.g:2491:2: ( ruleContent )
            // InternalEHelp.g:2492:3: ruleContent
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
    // InternalEHelp.g:2501:1: rule__Table__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Table__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2505:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2506:2: ( RULE_INT )
            {
            // InternalEHelp.g:2506:2: ( RULE_INT )
            // InternalEHelp.g:2507:3: RULE_INT
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
    // InternalEHelp.g:2516:1: rule__Table__SpacingAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Table__SpacingAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2520:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2521:2: ( RULE_INT )
            {
            // InternalEHelp.g:2521:2: ( RULE_INT )
            // InternalEHelp.g:2522:3: RULE_INT
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
    // InternalEHelp.g:2531:1: rule__Table__StretchAssignment_3 : ( ( 'stretch' ) ) ;
    public final void rule__Table__StretchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2535:1: ( ( ( 'stretch' ) ) )
            // InternalEHelp.g:2536:2: ( ( 'stretch' ) )
            {
            // InternalEHelp.g:2536:2: ( ( 'stretch' ) )
            // InternalEHelp.g:2537:3: ( 'stretch' )
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            // InternalEHelp.g:2538:3: ( 'stretch' )
            // InternalEHelp.g:2539:4: 'stretch'
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEHelp.g:2550:1: rule__Table__RowsAssignment_5 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2554:1: ( ( ruleTableRow ) )
            // InternalEHelp.g:2555:2: ( ruleTableRow )
            {
            // InternalEHelp.g:2555:2: ( ruleTableRow )
            // InternalEHelp.g:2556:3: ruleTableRow
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
    // InternalEHelp.g:2565:1: rule__TableRow__CellsAssignment_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2569:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2570:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2570:2: ( ruleTableCell )
            // InternalEHelp.g:2571:3: ruleTableCell
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
    // InternalEHelp.g:2580:1: rule__TableRow__CellsAssignment_2_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2584:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2585:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2585:2: ( ruleTableCell )
            // InternalEHelp.g:2586:3: ruleTableCell
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
    // InternalEHelp.g:2595:1: rule__TableCell__CenterAssignment_0 : ( ( 'center' ) ) ;
    public final void rule__TableCell__CenterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2599:1: ( ( ( 'center' ) ) )
            // InternalEHelp.g:2600:2: ( ( 'center' ) )
            {
            // InternalEHelp.g:2600:2: ( ( 'center' ) )
            // InternalEHelp.g:2601:3: ( 'center' )
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            // InternalEHelp.g:2602:3: ( 'center' )
            // InternalEHelp.g:2603:4: 'center'
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEHelp.g:2614:1: rule__TableCell__LeftAssignment_1 : ( ( 'left' ) ) ;
    public final void rule__TableCell__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2618:1: ( ( ( 'left' ) ) )
            // InternalEHelp.g:2619:2: ( ( 'left' ) )
            {
            // InternalEHelp.g:2619:2: ( ( 'left' ) )
            // InternalEHelp.g:2620:3: ( 'left' )
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            // InternalEHelp.g:2621:3: ( 'left' )
            // InternalEHelp.g:2622:4: 'left'
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEHelp.g:2633:1: rule__TableCell__RightAssignment_2 : ( ( 'right' ) ) ;
    public final void rule__TableCell__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2637:1: ( ( ( 'right' ) ) )
            // InternalEHelp.g:2638:2: ( ( 'right' ) )
            {
            // InternalEHelp.g:2638:2: ( ( 'right' ) )
            // InternalEHelp.g:2639:3: ( 'right' )
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            // InternalEHelp.g:2640:3: ( 'right' )
            // InternalEHelp.g:2641:4: 'right'
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalEHelp.g:2652:1: rule__TableCell__TopAssignment_3 : ( ( 'top' ) ) ;
    public final void rule__TableCell__TopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2656:1: ( ( ( 'top' ) ) )
            // InternalEHelp.g:2657:2: ( ( 'top' ) )
            {
            // InternalEHelp.g:2657:2: ( ( 'top' ) )
            // InternalEHelp.g:2658:3: ( 'top' )
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            // InternalEHelp.g:2659:3: ( 'top' )
            // InternalEHelp.g:2660:4: 'top'
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalEHelp.g:2671:1: rule__TableCell__MiddleAssignment_4 : ( ( 'middle' ) ) ;
    public final void rule__TableCell__MiddleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2675:1: ( ( ( 'middle' ) ) )
            // InternalEHelp.g:2676:2: ( ( 'middle' ) )
            {
            // InternalEHelp.g:2676:2: ( ( 'middle' ) )
            // InternalEHelp.g:2677:3: ( 'middle' )
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            // InternalEHelp.g:2678:3: ( 'middle' )
            // InternalEHelp.g:2679:4: 'middle'
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalEHelp.g:2690:1: rule__TableCell__BottomAssignment_5 : ( ( 'bottom' ) ) ;
    public final void rule__TableCell__BottomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2694:1: ( ( ( 'bottom' ) ) )
            // InternalEHelp.g:2695:2: ( ( 'bottom' ) )
            {
            // InternalEHelp.g:2695:2: ( ( 'bottom' ) )
            // InternalEHelp.g:2696:3: ( 'bottom' )
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            // InternalEHelp.g:2697:3: ( 'bottom' )
            // InternalEHelp.g:2698:4: 'bottom'
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalEHelp.g:2709:1: rule__TableCell__ContentAssignment_6 : ( ruleContent ) ;
    public final void rule__TableCell__ContentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2713:1: ( ( ruleContent ) )
            // InternalEHelp.g:2714:2: ( ruleContent )
            {
            // InternalEHelp.g:2714:2: ( ruleContent )
            // InternalEHelp.g:2715:3: ruleContent
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
    // InternalEHelp.g:2724:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2728:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2729:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2729:2: ( RULE_STRING )
            // InternalEHelp.g:2730:3: RULE_STRING
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
    // InternalEHelp.g:2739:1: rule__Keyword__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Keyword__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2743:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2744:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2744:2: ( RULE_STRING )
            // InternalEHelp.g:2745:3: RULE_STRING
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
    // InternalEHelp.g:2754:1: rule__Context__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2758:1: ( ( RULE_ID ) )
            // InternalEHelp.g:2759:2: ( RULE_ID )
            {
            // InternalEHelp.g:2759:2: ( RULE_ID )
            // InternalEHelp.g:2760:3: RULE_ID
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
    // InternalEHelp.g:2769:1: rule__Context__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Context__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2773:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2774:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2774:2: ( RULE_STRING )
            // InternalEHelp.g:2775:3: RULE_STRING
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
    // InternalEHelp.g:2784:1: rule__Images__ImagesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Images__ImagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2788:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2789:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2789:2: ( RULE_STRING )
            // InternalEHelp.g:2790:3: RULE_STRING
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
    // InternalEHelp.g:2799:1: rule__Link__LinkAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2803:1: ( ( ( RULE_ID ) ) )
            // InternalEHelp.g:2804:2: ( ( RULE_ID ) )
            {
            // InternalEHelp.g:2804:2: ( ( RULE_ID ) )
            // InternalEHelp.g:2805:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0()); 
            // InternalEHelp.g:2806:3: ( RULE_ID )
            // InternalEHelp.g:2807:4: RULE_ID
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
    // InternalEHelp.g:2818:1: rule__Link__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Link__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2822:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2823:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2823:2: ( RULE_STRING )
            // InternalEHelp.g:2824:3: RULE_STRING
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
    static final String dfa_3s = "\1\33\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\5\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\15\uffff\1\5\1\6\1\uffff\1\7\3\uffff\1\1\1\2\1\4",
            "",
            "",
            "",
            "\1\11\1\10",
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
            return "529:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E2E8010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E2C0012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E2C0010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020410040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000FCE2C0010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000010L});

}