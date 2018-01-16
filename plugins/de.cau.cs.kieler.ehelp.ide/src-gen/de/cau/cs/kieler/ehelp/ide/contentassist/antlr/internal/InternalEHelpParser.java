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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'chapter'", "'{'", "'}'", "'list'", "'enum'", "'-'", "'table'", "'spacing'", "'='", "'|'", "'?'", "'!'", "'['", "']'", "'stretch'", "'center'", "'left'", "'right'", "'top'", "'middle'", "'bottom'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
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
    // InternalEHelp.g:62:1: ruleEHelpModel : ( ( rule__EHelpModel__ChaptersAssignment )* ) ;
    public final void ruleEHelpModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:66:2: ( ( ( rule__EHelpModel__ChaptersAssignment )* ) )
            // InternalEHelp.g:67:2: ( ( rule__EHelpModel__ChaptersAssignment )* )
            {
            // InternalEHelp.g:67:2: ( ( rule__EHelpModel__ChaptersAssignment )* )
            // InternalEHelp.g:68:3: ( rule__EHelpModel__ChaptersAssignment )*
            {
             before(grammarAccess.getEHelpModelAccess().getChaptersAssignment()); 
            // InternalEHelp.g:69:3: ( rule__EHelpModel__ChaptersAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEHelp.g:69:4: rule__EHelpModel__ChaptersAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__EHelpModel__ChaptersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEHelpModelAccess().getChaptersAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleChapter"
    // InternalEHelp.g:78:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalEHelp.g:79:1: ( ruleChapter EOF )
            // InternalEHelp.g:80:1: ruleChapter EOF
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
    // InternalEHelp.g:87:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:91:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalEHelp.g:92:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalEHelp.g:92:2: ( ( rule__Chapter__Group__0 ) )
            // InternalEHelp.g:93:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalEHelp.g:94:3: ( rule__Chapter__Group__0 )
            // InternalEHelp.g:94:4: rule__Chapter__Group__0
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
    // InternalEHelp.g:103:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalEHelp.g:104:1: ( ruleList EOF )
            // InternalEHelp.g:105:1: ruleList EOF
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
    // InternalEHelp.g:112:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:116:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalEHelp.g:117:2: ( ( rule__List__Group__0 ) )
            {
            // InternalEHelp.g:117:2: ( ( rule__List__Group__0 ) )
            // InternalEHelp.g:118:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalEHelp.g:119:3: ( rule__List__Group__0 )
            // InternalEHelp.g:119:4: rule__List__Group__0
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
    // InternalEHelp.g:128:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalEHelp.g:129:1: ( ruleEnum EOF )
            // InternalEHelp.g:130:1: ruleEnum EOF
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
    // InternalEHelp.g:137:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:141:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalEHelp.g:142:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalEHelp.g:142:2: ( ( rule__Enum__Group__0 ) )
            // InternalEHelp.g:143:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalEHelp.g:144:3: ( rule__Enum__Group__0 )
            // InternalEHelp.g:144:4: rule__Enum__Group__0
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
    // InternalEHelp.g:153:1: entryRuleListItem : ruleListItem EOF ;
    public final void entryRuleListItem() throws RecognitionException {
        try {
            // InternalEHelp.g:154:1: ( ruleListItem EOF )
            // InternalEHelp.g:155:1: ruleListItem EOF
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
    // InternalEHelp.g:162:1: ruleListItem : ( ( rule__ListItem__Group__0 ) ) ;
    public final void ruleListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:166:2: ( ( ( rule__ListItem__Group__0 ) ) )
            // InternalEHelp.g:167:2: ( ( rule__ListItem__Group__0 ) )
            {
            // InternalEHelp.g:167:2: ( ( rule__ListItem__Group__0 ) )
            // InternalEHelp.g:168:3: ( rule__ListItem__Group__0 )
            {
             before(grammarAccess.getListItemAccess().getGroup()); 
            // InternalEHelp.g:169:3: ( rule__ListItem__Group__0 )
            // InternalEHelp.g:169:4: rule__ListItem__Group__0
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
    // InternalEHelp.g:178:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalEHelp.g:179:1: ( ruleContent EOF )
            // InternalEHelp.g:180:1: ruleContent EOF
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
    // InternalEHelp.g:187:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:191:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalEHelp.g:192:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalEHelp.g:192:2: ( ( rule__Content__Alternatives ) )
            // InternalEHelp.g:193:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalEHelp.g:194:3: ( rule__Content__Alternatives )
            // InternalEHelp.g:194:4: rule__Content__Alternatives
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
    // InternalEHelp.g:203:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalEHelp.g:204:1: ( ruleTable EOF )
            // InternalEHelp.g:205:1: ruleTable EOF
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
    // InternalEHelp.g:212:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:216:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalEHelp.g:217:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalEHelp.g:217:2: ( ( rule__Table__Group__0 ) )
            // InternalEHelp.g:218:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalEHelp.g:219:3: ( rule__Table__Group__0 )
            // InternalEHelp.g:219:4: rule__Table__Group__0
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
    // InternalEHelp.g:228:1: entryRuleTableRow : ruleTableRow EOF ;
    public final void entryRuleTableRow() throws RecognitionException {
        try {
            // InternalEHelp.g:229:1: ( ruleTableRow EOF )
            // InternalEHelp.g:230:1: ruleTableRow EOF
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
    // InternalEHelp.g:237:1: ruleTableRow : ( ( rule__TableRow__Group__0 ) ) ;
    public final void ruleTableRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:241:2: ( ( ( rule__TableRow__Group__0 ) ) )
            // InternalEHelp.g:242:2: ( ( rule__TableRow__Group__0 ) )
            {
            // InternalEHelp.g:242:2: ( ( rule__TableRow__Group__0 ) )
            // InternalEHelp.g:243:3: ( rule__TableRow__Group__0 )
            {
             before(grammarAccess.getTableRowAccess().getGroup()); 
            // InternalEHelp.g:244:3: ( rule__TableRow__Group__0 )
            // InternalEHelp.g:244:4: rule__TableRow__Group__0
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
    // InternalEHelp.g:253:1: entryRuleTableCell : ruleTableCell EOF ;
    public final void entryRuleTableCell() throws RecognitionException {
        try {
            // InternalEHelp.g:254:1: ( ruleTableCell EOF )
            // InternalEHelp.g:255:1: ruleTableCell EOF
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
    // InternalEHelp.g:262:1: ruleTableCell : ( ( rule__TableCell__Group__0 ) ) ;
    public final void ruleTableCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:266:2: ( ( ( rule__TableCell__Group__0 ) ) )
            // InternalEHelp.g:267:2: ( ( rule__TableCell__Group__0 ) )
            {
            // InternalEHelp.g:267:2: ( ( rule__TableCell__Group__0 ) )
            // InternalEHelp.g:268:3: ( rule__TableCell__Group__0 )
            {
             before(grammarAccess.getTableCellAccess().getGroup()); 
            // InternalEHelp.g:269:3: ( rule__TableCell__Group__0 )
            // InternalEHelp.g:269:4: rule__TableCell__Group__0
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
    // InternalEHelp.g:278:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalEHelp.g:279:1: ( ruleText EOF )
            // InternalEHelp.g:280:1: ruleText EOF
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
    // InternalEHelp.g:287:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:291:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalEHelp.g:292:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalEHelp.g:292:2: ( ( rule__Text__TextAssignment ) )
            // InternalEHelp.g:293:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalEHelp.g:294:3: ( rule__Text__TextAssignment )
            // InternalEHelp.g:294:4: rule__Text__TextAssignment
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
    // InternalEHelp.g:303:1: entryRuleKeyword : ruleKeyword EOF ;
    public final void entryRuleKeyword() throws RecognitionException {
        try {
            // InternalEHelp.g:304:1: ( ruleKeyword EOF )
            // InternalEHelp.g:305:1: ruleKeyword EOF
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
    // InternalEHelp.g:312:1: ruleKeyword : ( ( rule__Keyword__Group__0 ) ) ;
    public final void ruleKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:316:2: ( ( ( rule__Keyword__Group__0 ) ) )
            // InternalEHelp.g:317:2: ( ( rule__Keyword__Group__0 ) )
            {
            // InternalEHelp.g:317:2: ( ( rule__Keyword__Group__0 ) )
            // InternalEHelp.g:318:3: ( rule__Keyword__Group__0 )
            {
             before(grammarAccess.getKeywordAccess().getGroup()); 
            // InternalEHelp.g:319:3: ( rule__Keyword__Group__0 )
            // InternalEHelp.g:319:4: rule__Keyword__Group__0
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
    // InternalEHelp.g:328:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalEHelp.g:329:1: ( ruleContext EOF )
            // InternalEHelp.g:330:1: ruleContext EOF
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
    // InternalEHelp.g:337:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:341:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalEHelp.g:342:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalEHelp.g:342:2: ( ( rule__Context__Group__0 ) )
            // InternalEHelp.g:343:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalEHelp.g:344:3: ( rule__Context__Group__0 )
            // InternalEHelp.g:344:4: rule__Context__Group__0
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
    // InternalEHelp.g:353:1: entryRuleImages : ruleImages EOF ;
    public final void entryRuleImages() throws RecognitionException {
        try {
            // InternalEHelp.g:354:1: ( ruleImages EOF )
            // InternalEHelp.g:355:1: ruleImages EOF
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
    // InternalEHelp.g:362:1: ruleImages : ( ( rule__Images__Group__0 ) ) ;
    public final void ruleImages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:366:2: ( ( ( rule__Images__Group__0 ) ) )
            // InternalEHelp.g:367:2: ( ( rule__Images__Group__0 ) )
            {
            // InternalEHelp.g:367:2: ( ( rule__Images__Group__0 ) )
            // InternalEHelp.g:368:3: ( rule__Images__Group__0 )
            {
             before(grammarAccess.getImagesAccess().getGroup()); 
            // InternalEHelp.g:369:3: ( rule__Images__Group__0 )
            // InternalEHelp.g:369:4: rule__Images__Group__0
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
    // InternalEHelp.g:378:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalEHelp.g:379:1: ( ruleLink EOF )
            // InternalEHelp.g:380:1: ruleLink EOF
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
    // InternalEHelp.g:387:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:391:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalEHelp.g:392:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalEHelp.g:392:2: ( ( rule__Link__Group__0 ) )
            // InternalEHelp.g:393:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalEHelp.g:394:3: ( rule__Link__Group__0 )
            // InternalEHelp.g:394:4: rule__Link__Group__0
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


    // $ANTLR start "rule__Content__Alternatives"
    // InternalEHelp.g:402:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:406:1: ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEHelp.g:407:2: ( ruleKeyword )
                    {
                    // InternalEHelp.g:407:2: ( ruleKeyword )
                    // InternalEHelp.g:408:3: ruleKeyword
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
                    // InternalEHelp.g:413:2: ( ruleContext )
                    {
                    // InternalEHelp.g:413:2: ( ruleContext )
                    // InternalEHelp.g:414:3: ruleContext
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
                    // InternalEHelp.g:419:2: ( ruleText )
                    {
                    // InternalEHelp.g:419:2: ( ruleText )
                    // InternalEHelp.g:420:3: ruleText
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
                    // InternalEHelp.g:425:2: ( ruleImages )
                    {
                    // InternalEHelp.g:425:2: ( ruleImages )
                    // InternalEHelp.g:426:3: ruleImages
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
                    // InternalEHelp.g:431:2: ( ruleLink )
                    {
                    // InternalEHelp.g:431:2: ( ruleLink )
                    // InternalEHelp.g:432:3: ruleLink
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
                    // InternalEHelp.g:437:2: ( ruleList )
                    {
                    // InternalEHelp.g:437:2: ( ruleList )
                    // InternalEHelp.g:438:3: ruleList
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
                    // InternalEHelp.g:443:2: ( ruleEnum )
                    {
                    // InternalEHelp.g:443:2: ( ruleEnum )
                    // InternalEHelp.g:444:3: ruleEnum
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
                    // InternalEHelp.g:449:2: ( ruleTable )
                    {
                    // InternalEHelp.g:449:2: ( ruleTable )
                    // InternalEHelp.g:450:3: ruleTable
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


    // $ANTLR start "rule__Chapter__Group__0"
    // InternalEHelp.g:459:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:463:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalEHelp.g:464:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEHelp.g:471:1: rule__Chapter__Group__0__Impl : ( 'chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:475:1: ( ( 'chapter' ) )
            // InternalEHelp.g:476:1: ( 'chapter' )
            {
            // InternalEHelp.g:476:1: ( 'chapter' )
            // InternalEHelp.g:477:2: 'chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalEHelp.g:486:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:490:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalEHelp.g:491:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalEHelp.g:498:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__NameAssignment_1 )? ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:502:1: ( ( ( rule__Chapter__NameAssignment_1 )? ) )
            // InternalEHelp.g:503:1: ( ( rule__Chapter__NameAssignment_1 )? )
            {
            // InternalEHelp.g:503:1: ( ( rule__Chapter__NameAssignment_1 )? )
            // InternalEHelp.g:504:2: ( rule__Chapter__NameAssignment_1 )?
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1()); 
            // InternalEHelp.g:505:2: ( rule__Chapter__NameAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEHelp.g:505:3: rule__Chapter__NameAssignment_1
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
    // InternalEHelp.g:513:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:517:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalEHelp.g:518:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEHelp.g:525:1: rule__Chapter__Group__2__Impl : ( ( rule__Chapter__TitleAssignment_2 ) ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:529:1: ( ( ( rule__Chapter__TitleAssignment_2 ) ) )
            // InternalEHelp.g:530:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            {
            // InternalEHelp.g:530:1: ( ( rule__Chapter__TitleAssignment_2 ) )
            // InternalEHelp.g:531:2: ( rule__Chapter__TitleAssignment_2 )
            {
             before(grammarAccess.getChapterAccess().getTitleAssignment_2()); 
            // InternalEHelp.g:532:2: ( rule__Chapter__TitleAssignment_2 )
            // InternalEHelp.g:532:3: rule__Chapter__TitleAssignment_2
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
    // InternalEHelp.g:540:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:544:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalEHelp.g:545:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalEHelp.g:552:1: rule__Chapter__Group__3__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:556:1: ( ( '{' ) )
            // InternalEHelp.g:557:1: ( '{' )
            {
            // InternalEHelp.g:557:1: ( '{' )
            // InternalEHelp.g:558:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEHelp.g:567:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl rule__Chapter__Group__5 ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:571:1: ( rule__Chapter__Group__4__Impl rule__Chapter__Group__5 )
            // InternalEHelp.g:572:2: rule__Chapter__Group__4__Impl rule__Chapter__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalEHelp.g:579:1: rule__Chapter__Group__4__Impl : ( ( rule__Chapter__ContentAssignment_4 )* ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:583:1: ( ( ( rule__Chapter__ContentAssignment_4 )* ) )
            // InternalEHelp.g:584:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            {
            // InternalEHelp.g:584:1: ( ( rule__Chapter__ContentAssignment_4 )* )
            // InternalEHelp.g:585:2: ( rule__Chapter__ContentAssignment_4 )*
            {
             before(grammarAccess.getChapterAccess().getContentAssignment_4()); 
            // InternalEHelp.g:586:2: ( rule__Chapter__ContentAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||(LA4_0>=14 && LA4_0<=15)||LA4_0==17||(LA4_0>=21 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEHelp.g:586:3: rule__Chapter__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Chapter__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalEHelp.g:594:1: rule__Chapter__Group__5 : rule__Chapter__Group__5__Impl rule__Chapter__Group__6 ;
    public final void rule__Chapter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:598:1: ( rule__Chapter__Group__5__Impl rule__Chapter__Group__6 )
            // InternalEHelp.g:599:2: rule__Chapter__Group__5__Impl rule__Chapter__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalEHelp.g:606:1: rule__Chapter__Group__5__Impl : ( ( rule__Chapter__SubchaptersAssignment_5 )* ) ;
    public final void rule__Chapter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:610:1: ( ( ( rule__Chapter__SubchaptersAssignment_5 )* ) )
            // InternalEHelp.g:611:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            {
            // InternalEHelp.g:611:1: ( ( rule__Chapter__SubchaptersAssignment_5 )* )
            // InternalEHelp.g:612:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            {
             before(grammarAccess.getChapterAccess().getSubchaptersAssignment_5()); 
            // InternalEHelp.g:613:2: ( rule__Chapter__SubchaptersAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEHelp.g:613:3: rule__Chapter__SubchaptersAssignment_5
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Chapter__SubchaptersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalEHelp.g:621:1: rule__Chapter__Group__6 : rule__Chapter__Group__6__Impl ;
    public final void rule__Chapter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:625:1: ( rule__Chapter__Group__6__Impl )
            // InternalEHelp.g:626:2: rule__Chapter__Group__6__Impl
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
    // InternalEHelp.g:632:1: rule__Chapter__Group__6__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:636:1: ( ( '}' ) )
            // InternalEHelp.g:637:1: ( '}' )
            {
            // InternalEHelp.g:637:1: ( '}' )
            // InternalEHelp.g:638:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEHelp.g:648:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:652:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalEHelp.g:653:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEHelp.g:660:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:664:1: ( ( 'list' ) )
            // InternalEHelp.g:665:1: ( 'list' )
            {
            // InternalEHelp.g:665:1: ( 'list' )
            // InternalEHelp.g:666:2: 'list'
            {
             before(grammarAccess.getListAccess().getListKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEHelp.g:675:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:679:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalEHelp.g:680:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:687:1: rule__List__Group__1__Impl : ( '{' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:691:1: ( ( '{' ) )
            // InternalEHelp.g:692:1: ( '{' )
            {
            // InternalEHelp.g:692:1: ( '{' )
            // InternalEHelp.g:693:2: '{'
            {
             before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEHelp.g:702:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:706:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // InternalEHelp.g:707:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:714:1: rule__List__Group__2__Impl : ( ( rule__List__ItemsAssignment_2 )* ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:718:1: ( ( ( rule__List__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:719:1: ( ( rule__List__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:719:1: ( ( rule__List__ItemsAssignment_2 )* )
            // InternalEHelp.g:720:2: ( rule__List__ItemsAssignment_2 )*
            {
             before(grammarAccess.getListAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:721:2: ( rule__List__ItemsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEHelp.g:721:3: rule__List__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__List__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalEHelp.g:729:1: rule__List__Group__3 : rule__List__Group__3__Impl ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:733:1: ( rule__List__Group__3__Impl )
            // InternalEHelp.g:734:2: rule__List__Group__3__Impl
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
    // InternalEHelp.g:740:1: rule__List__Group__3__Impl : ( '}' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:744:1: ( ( '}' ) )
            // InternalEHelp.g:745:1: ( '}' )
            {
            // InternalEHelp.g:745:1: ( '}' )
            // InternalEHelp.g:746:2: '}'
            {
             before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEHelp.g:756:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:760:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalEHelp.g:761:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEHelp.g:768:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:772:1: ( ( 'enum' ) )
            // InternalEHelp.g:773:1: ( 'enum' )
            {
            // InternalEHelp.g:773:1: ( 'enum' )
            // InternalEHelp.g:774:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEHelp.g:783:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:787:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalEHelp.g:788:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:795:1: rule__Enum__Group__1__Impl : ( '{' ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:799:1: ( ( '{' ) )
            // InternalEHelp.g:800:1: ( '{' )
            {
            // InternalEHelp.g:800:1: ( '{' )
            // InternalEHelp.g:801:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEHelp.g:810:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:814:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalEHelp.g:815:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:822:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__ItemsAssignment_2 )* ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:826:1: ( ( ( rule__Enum__ItemsAssignment_2 )* ) )
            // InternalEHelp.g:827:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            {
            // InternalEHelp.g:827:1: ( ( rule__Enum__ItemsAssignment_2 )* )
            // InternalEHelp.g:828:2: ( rule__Enum__ItemsAssignment_2 )*
            {
             before(grammarAccess.getEnumAccess().getItemsAssignment_2()); 
            // InternalEHelp.g:829:2: ( rule__Enum__ItemsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEHelp.g:829:3: rule__Enum__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Enum__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalEHelp.g:837:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:841:1: ( rule__Enum__Group__3__Impl )
            // InternalEHelp.g:842:2: rule__Enum__Group__3__Impl
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
    // InternalEHelp.g:848:1: rule__Enum__Group__3__Impl : ( '}' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:852:1: ( ( '}' ) )
            // InternalEHelp.g:853:1: ( '}' )
            {
            // InternalEHelp.g:853:1: ( '}' )
            // InternalEHelp.g:854:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEHelp.g:864:1: rule__ListItem__Group__0 : rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
    public final void rule__ListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:868:1: ( rule__ListItem__Group__0__Impl rule__ListItem__Group__1 )
            // InternalEHelp.g:869:2: rule__ListItem__Group__0__Impl rule__ListItem__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEHelp.g:876:1: rule__ListItem__Group__0__Impl : ( '-' ) ;
    public final void rule__ListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:880:1: ( ( '-' ) )
            // InternalEHelp.g:881:1: ( '-' )
            {
            // InternalEHelp.g:881:1: ( '-' )
            // InternalEHelp.g:882:2: '-'
            {
             before(grammarAccess.getListItemAccess().getHyphenMinusKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:891:1: rule__ListItem__Group__1 : rule__ListItem__Group__1__Impl ;
    public final void rule__ListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:895:1: ( rule__ListItem__Group__1__Impl )
            // InternalEHelp.g:896:2: rule__ListItem__Group__1__Impl
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
    // InternalEHelp.g:902:1: rule__ListItem__Group__1__Impl : ( ( rule__ListItem__ContentAssignment_1 )* ) ;
    public final void rule__ListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:906:1: ( ( ( rule__ListItem__ContentAssignment_1 )* ) )
            // InternalEHelp.g:907:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            {
            // InternalEHelp.g:907:1: ( ( rule__ListItem__ContentAssignment_1 )* )
            // InternalEHelp.g:908:2: ( rule__ListItem__ContentAssignment_1 )*
            {
             before(grammarAccess.getListItemAccess().getContentAssignment_1()); 
            // InternalEHelp.g:909:2: ( rule__ListItem__ContentAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||(LA8_0>=14 && LA8_0<=15)||LA8_0==17||(LA8_0>=21 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEHelp.g:909:3: rule__ListItem__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ListItem__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalEHelp.g:918:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:922:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalEHelp.g:923:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:930:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:934:1: ( ( 'table' ) )
            // InternalEHelp.g:935:1: ( 'table' )
            {
            // InternalEHelp.g:935:1: ( 'table' )
            // InternalEHelp.g:936:2: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEHelp.g:945:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:949:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalEHelp.g:950:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:957:1: rule__Table__Group__1__Impl : ( ( rule__Table__WidthAssignment_1 )? ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:961:1: ( ( ( rule__Table__WidthAssignment_1 )? ) )
            // InternalEHelp.g:962:1: ( ( rule__Table__WidthAssignment_1 )? )
            {
            // InternalEHelp.g:962:1: ( ( rule__Table__WidthAssignment_1 )? )
            // InternalEHelp.g:963:2: ( rule__Table__WidthAssignment_1 )?
            {
             before(grammarAccess.getTableAccess().getWidthAssignment_1()); 
            // InternalEHelp.g:964:2: ( rule__Table__WidthAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEHelp.g:964:3: rule__Table__WidthAssignment_1
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
    // InternalEHelp.g:972:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:976:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalEHelp.g:977:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:984:1: rule__Table__Group__2__Impl : ( ( rule__Table__Group_2__0 )? ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:988:1: ( ( ( rule__Table__Group_2__0 )? ) )
            // InternalEHelp.g:989:1: ( ( rule__Table__Group_2__0 )? )
            {
            // InternalEHelp.g:989:1: ( ( rule__Table__Group_2__0 )? )
            // InternalEHelp.g:990:2: ( rule__Table__Group_2__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_2()); 
            // InternalEHelp.g:991:2: ( rule__Table__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEHelp.g:991:3: rule__Table__Group_2__0
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
    // InternalEHelp.g:999:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1003:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalEHelp.g:1004:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalEHelp.g:1011:1: rule__Table__Group__3__Impl : ( ( rule__Table__StretchAssignment_3 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1015:1: ( ( ( rule__Table__StretchAssignment_3 )? ) )
            // InternalEHelp.g:1016:1: ( ( rule__Table__StretchAssignment_3 )? )
            {
            // InternalEHelp.g:1016:1: ( ( rule__Table__StretchAssignment_3 )? )
            // InternalEHelp.g:1017:2: ( rule__Table__StretchAssignment_3 )?
            {
             before(grammarAccess.getTableAccess().getStretchAssignment_3()); 
            // InternalEHelp.g:1018:2: ( rule__Table__StretchAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEHelp.g:1018:3: rule__Table__StretchAssignment_3
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
    // InternalEHelp.g:1026:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1030:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalEHelp.g:1031:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:1038:1: rule__Table__Group__4__Impl : ( '{' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1042:1: ( ( '{' ) )
            // InternalEHelp.g:1043:1: ( '{' )
            {
            // InternalEHelp.g:1043:1: ( '{' )
            // InternalEHelp.g:1044:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
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
    // InternalEHelp.g:1053:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1057:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalEHelp.g:1058:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalEHelp.g:1065:1: rule__Table__Group__5__Impl : ( ( rule__Table__RowsAssignment_5 )* ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1069:1: ( ( ( rule__Table__RowsAssignment_5 )* ) )
            // InternalEHelp.g:1070:1: ( ( rule__Table__RowsAssignment_5 )* )
            {
            // InternalEHelp.g:1070:1: ( ( rule__Table__RowsAssignment_5 )* )
            // InternalEHelp.g:1071:2: ( rule__Table__RowsAssignment_5 )*
            {
             before(grammarAccess.getTableAccess().getRowsAssignment_5()); 
            // InternalEHelp.g:1072:2: ( rule__Table__RowsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEHelp.g:1072:3: rule__Table__RowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__RowsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalEHelp.g:1080:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1084:1: ( rule__Table__Group__6__Impl )
            // InternalEHelp.g:1085:2: rule__Table__Group__6__Impl
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
    // InternalEHelp.g:1091:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1095:1: ( ( '}' ) )
            // InternalEHelp.g:1096:1: ( '}' )
            {
            // InternalEHelp.g:1096:1: ( '}' )
            // InternalEHelp.g:1097:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEHelp.g:1107:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1111:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalEHelp.g:1112:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalEHelp.g:1119:1: rule__Table__Group_2__0__Impl : ( 'spacing' ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1123:1: ( ( 'spacing' ) )
            // InternalEHelp.g:1124:1: ( 'spacing' )
            {
            // InternalEHelp.g:1124:1: ( 'spacing' )
            // InternalEHelp.g:1125:2: 'spacing'
            {
             before(grammarAccess.getTableAccess().getSpacingKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEHelp.g:1134:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl rule__Table__Group_2__2 ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1138:1: ( rule__Table__Group_2__1__Impl rule__Table__Group_2__2 )
            // InternalEHelp.g:1139:2: rule__Table__Group_2__1__Impl rule__Table__Group_2__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalEHelp.g:1146:1: rule__Table__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1150:1: ( ( '=' ) )
            // InternalEHelp.g:1151:1: ( '=' )
            {
            // InternalEHelp.g:1151:1: ( '=' )
            // InternalEHelp.g:1152:2: '='
            {
             before(grammarAccess.getTableAccess().getEqualsSignKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEHelp.g:1161:1: rule__Table__Group_2__2 : rule__Table__Group_2__2__Impl ;
    public final void rule__Table__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1165:1: ( rule__Table__Group_2__2__Impl )
            // InternalEHelp.g:1166:2: rule__Table__Group_2__2__Impl
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
    // InternalEHelp.g:1172:1: rule__Table__Group_2__2__Impl : ( ( rule__Table__SpacingAssignment_2_2 ) ) ;
    public final void rule__Table__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1176:1: ( ( ( rule__Table__SpacingAssignment_2_2 ) ) )
            // InternalEHelp.g:1177:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            {
            // InternalEHelp.g:1177:1: ( ( rule__Table__SpacingAssignment_2_2 ) )
            // InternalEHelp.g:1178:2: ( rule__Table__SpacingAssignment_2_2 )
            {
             before(grammarAccess.getTableAccess().getSpacingAssignment_2_2()); 
            // InternalEHelp.g:1179:2: ( rule__Table__SpacingAssignment_2_2 )
            // InternalEHelp.g:1179:3: rule__Table__SpacingAssignment_2_2
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
    // InternalEHelp.g:1188:1: rule__TableRow__Group__0 : rule__TableRow__Group__0__Impl rule__TableRow__Group__1 ;
    public final void rule__TableRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1192:1: ( rule__TableRow__Group__0__Impl rule__TableRow__Group__1 )
            // InternalEHelp.g:1193:2: rule__TableRow__Group__0__Impl rule__TableRow__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1200:1: rule__TableRow__Group__0__Impl : ( '-' ) ;
    public final void rule__TableRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1204:1: ( ( '-' ) )
            // InternalEHelp.g:1205:1: ( '-' )
            {
            // InternalEHelp.g:1205:1: ( '-' )
            // InternalEHelp.g:1206:2: '-'
            {
             before(grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEHelp.g:1215:1: rule__TableRow__Group__1 : rule__TableRow__Group__1__Impl rule__TableRow__Group__2 ;
    public final void rule__TableRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1219:1: ( rule__TableRow__Group__1__Impl rule__TableRow__Group__2 )
            // InternalEHelp.g:1220:2: rule__TableRow__Group__1__Impl rule__TableRow__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalEHelp.g:1227:1: rule__TableRow__Group__1__Impl : ( ( rule__TableRow__CellsAssignment_1 ) ) ;
    public final void rule__TableRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1231:1: ( ( ( rule__TableRow__CellsAssignment_1 ) ) )
            // InternalEHelp.g:1232:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            {
            // InternalEHelp.g:1232:1: ( ( rule__TableRow__CellsAssignment_1 ) )
            // InternalEHelp.g:1233:2: ( rule__TableRow__CellsAssignment_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_1()); 
            // InternalEHelp.g:1234:2: ( rule__TableRow__CellsAssignment_1 )
            // InternalEHelp.g:1234:3: rule__TableRow__CellsAssignment_1
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
    // InternalEHelp.g:1242:1: rule__TableRow__Group__2 : rule__TableRow__Group__2__Impl ;
    public final void rule__TableRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1246:1: ( rule__TableRow__Group__2__Impl )
            // InternalEHelp.g:1247:2: rule__TableRow__Group__2__Impl
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
    // InternalEHelp.g:1253:1: rule__TableRow__Group__2__Impl : ( ( rule__TableRow__Group_2__0 )* ) ;
    public final void rule__TableRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1257:1: ( ( ( rule__TableRow__Group_2__0 )* ) )
            // InternalEHelp.g:1258:1: ( ( rule__TableRow__Group_2__0 )* )
            {
            // InternalEHelp.g:1258:1: ( ( rule__TableRow__Group_2__0 )* )
            // InternalEHelp.g:1259:2: ( rule__TableRow__Group_2__0 )*
            {
             before(grammarAccess.getTableRowAccess().getGroup_2()); 
            // InternalEHelp.g:1260:2: ( rule__TableRow__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEHelp.g:1260:3: rule__TableRow__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TableRow__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalEHelp.g:1269:1: rule__TableRow__Group_2__0 : rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 ;
    public final void rule__TableRow__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1273:1: ( rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1 )
            // InternalEHelp.g:1274:2: rule__TableRow__Group_2__0__Impl rule__TableRow__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1281:1: rule__TableRow__Group_2__0__Impl : ( '|' ) ;
    public final void rule__TableRow__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1285:1: ( ( '|' ) )
            // InternalEHelp.g:1286:1: ( '|' )
            {
            // InternalEHelp.g:1286:1: ( '|' )
            // InternalEHelp.g:1287:2: '|'
            {
             before(grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEHelp.g:1296:1: rule__TableRow__Group_2__1 : rule__TableRow__Group_2__1__Impl ;
    public final void rule__TableRow__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1300:1: ( rule__TableRow__Group_2__1__Impl )
            // InternalEHelp.g:1301:2: rule__TableRow__Group_2__1__Impl
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
    // InternalEHelp.g:1307:1: rule__TableRow__Group_2__1__Impl : ( ( rule__TableRow__CellsAssignment_2_1 ) ) ;
    public final void rule__TableRow__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1311:1: ( ( ( rule__TableRow__CellsAssignment_2_1 ) ) )
            // InternalEHelp.g:1312:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            {
            // InternalEHelp.g:1312:1: ( ( rule__TableRow__CellsAssignment_2_1 ) )
            // InternalEHelp.g:1313:2: ( rule__TableRow__CellsAssignment_2_1 )
            {
             before(grammarAccess.getTableRowAccess().getCellsAssignment_2_1()); 
            // InternalEHelp.g:1314:2: ( rule__TableRow__CellsAssignment_2_1 )
            // InternalEHelp.g:1314:3: rule__TableRow__CellsAssignment_2_1
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
    // InternalEHelp.g:1323:1: rule__TableCell__Group__0 : rule__TableCell__Group__0__Impl rule__TableCell__Group__1 ;
    public final void rule__TableCell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1327:1: ( rule__TableCell__Group__0__Impl rule__TableCell__Group__1 )
            // InternalEHelp.g:1328:2: rule__TableCell__Group__0__Impl rule__TableCell__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1335:1: rule__TableCell__Group__0__Impl : ( ( rule__TableCell__CenterAssignment_0 )? ) ;
    public final void rule__TableCell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1339:1: ( ( ( rule__TableCell__CenterAssignment_0 )? ) )
            // InternalEHelp.g:1340:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            {
            // InternalEHelp.g:1340:1: ( ( rule__TableCell__CenterAssignment_0 )? )
            // InternalEHelp.g:1341:2: ( rule__TableCell__CenterAssignment_0 )?
            {
             before(grammarAccess.getTableCellAccess().getCenterAssignment_0()); 
            // InternalEHelp.g:1342:2: ( rule__TableCell__CenterAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEHelp.g:1342:3: rule__TableCell__CenterAssignment_0
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
    // InternalEHelp.g:1350:1: rule__TableCell__Group__1 : rule__TableCell__Group__1__Impl rule__TableCell__Group__2 ;
    public final void rule__TableCell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1354:1: ( rule__TableCell__Group__1__Impl rule__TableCell__Group__2 )
            // InternalEHelp.g:1355:2: rule__TableCell__Group__1__Impl rule__TableCell__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1362:1: rule__TableCell__Group__1__Impl : ( ( rule__TableCell__LeftAssignment_1 )? ) ;
    public final void rule__TableCell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1366:1: ( ( ( rule__TableCell__LeftAssignment_1 )? ) )
            // InternalEHelp.g:1367:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            {
            // InternalEHelp.g:1367:1: ( ( rule__TableCell__LeftAssignment_1 )? )
            // InternalEHelp.g:1368:2: ( rule__TableCell__LeftAssignment_1 )?
            {
             before(grammarAccess.getTableCellAccess().getLeftAssignment_1()); 
            // InternalEHelp.g:1369:2: ( rule__TableCell__LeftAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEHelp.g:1369:3: rule__TableCell__LeftAssignment_1
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
    // InternalEHelp.g:1377:1: rule__TableCell__Group__2 : rule__TableCell__Group__2__Impl rule__TableCell__Group__3 ;
    public final void rule__TableCell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1381:1: ( rule__TableCell__Group__2__Impl rule__TableCell__Group__3 )
            // InternalEHelp.g:1382:2: rule__TableCell__Group__2__Impl rule__TableCell__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1389:1: rule__TableCell__Group__2__Impl : ( ( rule__TableCell__RightAssignment_2 )? ) ;
    public final void rule__TableCell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1393:1: ( ( ( rule__TableCell__RightAssignment_2 )? ) )
            // InternalEHelp.g:1394:1: ( ( rule__TableCell__RightAssignment_2 )? )
            {
            // InternalEHelp.g:1394:1: ( ( rule__TableCell__RightAssignment_2 )? )
            // InternalEHelp.g:1395:2: ( rule__TableCell__RightAssignment_2 )?
            {
             before(grammarAccess.getTableCellAccess().getRightAssignment_2()); 
            // InternalEHelp.g:1396:2: ( rule__TableCell__RightAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEHelp.g:1396:3: rule__TableCell__RightAssignment_2
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
    // InternalEHelp.g:1404:1: rule__TableCell__Group__3 : rule__TableCell__Group__3__Impl rule__TableCell__Group__4 ;
    public final void rule__TableCell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1408:1: ( rule__TableCell__Group__3__Impl rule__TableCell__Group__4 )
            // InternalEHelp.g:1409:2: rule__TableCell__Group__3__Impl rule__TableCell__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1416:1: rule__TableCell__Group__3__Impl : ( ( rule__TableCell__TopAssignment_3 )? ) ;
    public final void rule__TableCell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1420:1: ( ( ( rule__TableCell__TopAssignment_3 )? ) )
            // InternalEHelp.g:1421:1: ( ( rule__TableCell__TopAssignment_3 )? )
            {
            // InternalEHelp.g:1421:1: ( ( rule__TableCell__TopAssignment_3 )? )
            // InternalEHelp.g:1422:2: ( rule__TableCell__TopAssignment_3 )?
            {
             before(grammarAccess.getTableCellAccess().getTopAssignment_3()); 
            // InternalEHelp.g:1423:2: ( rule__TableCell__TopAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEHelp.g:1423:3: rule__TableCell__TopAssignment_3
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
    // InternalEHelp.g:1431:1: rule__TableCell__Group__4 : rule__TableCell__Group__4__Impl rule__TableCell__Group__5 ;
    public final void rule__TableCell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1435:1: ( rule__TableCell__Group__4__Impl rule__TableCell__Group__5 )
            // InternalEHelp.g:1436:2: rule__TableCell__Group__4__Impl rule__TableCell__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1443:1: rule__TableCell__Group__4__Impl : ( ( rule__TableCell__MiddleAssignment_4 )? ) ;
    public final void rule__TableCell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1447:1: ( ( ( rule__TableCell__MiddleAssignment_4 )? ) )
            // InternalEHelp.g:1448:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            {
            // InternalEHelp.g:1448:1: ( ( rule__TableCell__MiddleAssignment_4 )? )
            // InternalEHelp.g:1449:2: ( rule__TableCell__MiddleAssignment_4 )?
            {
             before(grammarAccess.getTableCellAccess().getMiddleAssignment_4()); 
            // InternalEHelp.g:1450:2: ( rule__TableCell__MiddleAssignment_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEHelp.g:1450:3: rule__TableCell__MiddleAssignment_4
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
    // InternalEHelp.g:1458:1: rule__TableCell__Group__5 : rule__TableCell__Group__5__Impl rule__TableCell__Group__6 ;
    public final void rule__TableCell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1462:1: ( rule__TableCell__Group__5__Impl rule__TableCell__Group__6 )
            // InternalEHelp.g:1463:2: rule__TableCell__Group__5__Impl rule__TableCell__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalEHelp.g:1470:1: rule__TableCell__Group__5__Impl : ( ( rule__TableCell__BottomAssignment_5 )? ) ;
    public final void rule__TableCell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1474:1: ( ( ( rule__TableCell__BottomAssignment_5 )? ) )
            // InternalEHelp.g:1475:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            {
            // InternalEHelp.g:1475:1: ( ( rule__TableCell__BottomAssignment_5 )? )
            // InternalEHelp.g:1476:2: ( rule__TableCell__BottomAssignment_5 )?
            {
             before(grammarAccess.getTableCellAccess().getBottomAssignment_5()); 
            // InternalEHelp.g:1477:2: ( rule__TableCell__BottomAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEHelp.g:1477:3: rule__TableCell__BottomAssignment_5
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
    // InternalEHelp.g:1485:1: rule__TableCell__Group__6 : rule__TableCell__Group__6__Impl ;
    public final void rule__TableCell__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1489:1: ( rule__TableCell__Group__6__Impl )
            // InternalEHelp.g:1490:2: rule__TableCell__Group__6__Impl
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
    // InternalEHelp.g:1496:1: rule__TableCell__Group__6__Impl : ( ( rule__TableCell__ContentAssignment_6 )* ) ;
    public final void rule__TableCell__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1500:1: ( ( ( rule__TableCell__ContentAssignment_6 )* ) )
            // InternalEHelp.g:1501:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            {
            // InternalEHelp.g:1501:1: ( ( rule__TableCell__ContentAssignment_6 )* )
            // InternalEHelp.g:1502:2: ( rule__TableCell__ContentAssignment_6 )*
            {
             before(grammarAccess.getTableCellAccess().getContentAssignment_6()); 
            // InternalEHelp.g:1503:2: ( rule__TableCell__ContentAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||(LA20_0>=14 && LA20_0<=15)||LA20_0==17||(LA20_0>=21 && LA20_0<=23)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEHelp.g:1503:3: rule__TableCell__ContentAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TableCell__ContentAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalEHelp.g:1512:1: rule__Keyword__Group__0 : rule__Keyword__Group__0__Impl rule__Keyword__Group__1 ;
    public final void rule__Keyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1516:1: ( rule__Keyword__Group__0__Impl rule__Keyword__Group__1 )
            // InternalEHelp.g:1517:2: rule__Keyword__Group__0__Impl rule__Keyword__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1524:1: rule__Keyword__Group__0__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1528:1: ( ( '?' ) )
            // InternalEHelp.g:1529:1: ( '?' )
            {
            // InternalEHelp.g:1529:1: ( '?' )
            // InternalEHelp.g:1530:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEHelp.g:1539:1: rule__Keyword__Group__1 : rule__Keyword__Group__1__Impl rule__Keyword__Group__2 ;
    public final void rule__Keyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1543:1: ( rule__Keyword__Group__1__Impl rule__Keyword__Group__2 )
            // InternalEHelp.g:1544:2: rule__Keyword__Group__1__Impl rule__Keyword__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalEHelp.g:1551:1: rule__Keyword__Group__1__Impl : ( ( rule__Keyword__TextAssignment_1 ) ) ;
    public final void rule__Keyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1555:1: ( ( ( rule__Keyword__TextAssignment_1 ) ) )
            // InternalEHelp.g:1556:1: ( ( rule__Keyword__TextAssignment_1 ) )
            {
            // InternalEHelp.g:1556:1: ( ( rule__Keyword__TextAssignment_1 ) )
            // InternalEHelp.g:1557:2: ( rule__Keyword__TextAssignment_1 )
            {
             before(grammarAccess.getKeywordAccess().getTextAssignment_1()); 
            // InternalEHelp.g:1558:2: ( rule__Keyword__TextAssignment_1 )
            // InternalEHelp.g:1558:3: rule__Keyword__TextAssignment_1
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
    // InternalEHelp.g:1566:1: rule__Keyword__Group__2 : rule__Keyword__Group__2__Impl ;
    public final void rule__Keyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1570:1: ( rule__Keyword__Group__2__Impl )
            // InternalEHelp.g:1571:2: rule__Keyword__Group__2__Impl
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
    // InternalEHelp.g:1577:1: rule__Keyword__Group__2__Impl : ( '?' ) ;
    public final void rule__Keyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1581:1: ( ( '?' ) )
            // InternalEHelp.g:1582:1: ( '?' )
            {
            // InternalEHelp.g:1582:1: ( '?' )
            // InternalEHelp.g:1583:2: '?'
            {
             before(grammarAccess.getKeywordAccess().getQuestionMarkKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEHelp.g:1593:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1597:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalEHelp.g:1598:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalEHelp.g:1605:1: rule__Context__Group__0__Impl : ( '!' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1609:1: ( ( '!' ) )
            // InternalEHelp.g:1610:1: ( '!' )
            {
            // InternalEHelp.g:1610:1: ( '!' )
            // InternalEHelp.g:1611:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEHelp.g:1620:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1624:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalEHelp.g:1625:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1632:1: rule__Context__Group__1__Impl : ( ( rule__Context__IdAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1636:1: ( ( ( rule__Context__IdAssignment_1 ) ) )
            // InternalEHelp.g:1637:1: ( ( rule__Context__IdAssignment_1 ) )
            {
            // InternalEHelp.g:1637:1: ( ( rule__Context__IdAssignment_1 ) )
            // InternalEHelp.g:1638:2: ( rule__Context__IdAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getIdAssignment_1()); 
            // InternalEHelp.g:1639:2: ( rule__Context__IdAssignment_1 )
            // InternalEHelp.g:1639:3: rule__Context__IdAssignment_1
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
    // InternalEHelp.g:1647:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1651:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalEHelp.g:1652:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalEHelp.g:1659:1: rule__Context__Group__2__Impl : ( ( rule__Context__LabelAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1663:1: ( ( ( rule__Context__LabelAssignment_2 ) ) )
            // InternalEHelp.g:1664:1: ( ( rule__Context__LabelAssignment_2 ) )
            {
            // InternalEHelp.g:1664:1: ( ( rule__Context__LabelAssignment_2 ) )
            // InternalEHelp.g:1665:2: ( rule__Context__LabelAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getLabelAssignment_2()); 
            // InternalEHelp.g:1666:2: ( rule__Context__LabelAssignment_2 )
            // InternalEHelp.g:1666:3: rule__Context__LabelAssignment_2
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
    // InternalEHelp.g:1674:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1678:1: ( rule__Context__Group__3__Impl )
            // InternalEHelp.g:1679:2: rule__Context__Group__3__Impl
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
    // InternalEHelp.g:1685:1: rule__Context__Group__3__Impl : ( '!' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1689:1: ( ( '!' ) )
            // InternalEHelp.g:1690:1: ( '!' )
            {
            // InternalEHelp.g:1690:1: ( '!' )
            // InternalEHelp.g:1691:2: '!'
            {
             before(grammarAccess.getContextAccess().getExclamationMarkKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEHelp.g:1701:1: rule__Images__Group__0 : rule__Images__Group__0__Impl rule__Images__Group__1 ;
    public final void rule__Images__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1705:1: ( rule__Images__Group__0__Impl rule__Images__Group__1 )
            // InternalEHelp.g:1706:2: rule__Images__Group__0__Impl rule__Images__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEHelp.g:1713:1: rule__Images__Group__0__Impl : ( '[' ) ;
    public final void rule__Images__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1717:1: ( ( '[' ) )
            // InternalEHelp.g:1718:1: ( '[' )
            {
            // InternalEHelp.g:1718:1: ( '[' )
            // InternalEHelp.g:1719:2: '['
            {
             before(grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEHelp.g:1728:1: rule__Images__Group__1 : rule__Images__Group__1__Impl rule__Images__Group__2 ;
    public final void rule__Images__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1732:1: ( rule__Images__Group__1__Impl rule__Images__Group__2 )
            // InternalEHelp.g:1733:2: rule__Images__Group__1__Impl rule__Images__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalEHelp.g:1740:1: rule__Images__Group__1__Impl : ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) ;
    public final void rule__Images__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1744:1: ( ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) ) )
            // InternalEHelp.g:1745:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            {
            // InternalEHelp.g:1745:1: ( ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* ) )
            // InternalEHelp.g:1746:2: ( ( rule__Images__ImagesAssignment_1 ) ) ( ( rule__Images__ImagesAssignment_1 )* )
            {
            // InternalEHelp.g:1746:2: ( ( rule__Images__ImagesAssignment_1 ) )
            // InternalEHelp.g:1747:3: ( rule__Images__ImagesAssignment_1 )
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:1748:3: ( rule__Images__ImagesAssignment_1 )
            // InternalEHelp.g:1748:4: rule__Images__ImagesAssignment_1
            {
            pushFollow(FOLLOW_22);
            rule__Images__ImagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImagesAccess().getImagesAssignment_1()); 

            }

            // InternalEHelp.g:1751:2: ( ( rule__Images__ImagesAssignment_1 )* )
            // InternalEHelp.g:1752:3: ( rule__Images__ImagesAssignment_1 )*
            {
             before(grammarAccess.getImagesAccess().getImagesAssignment_1()); 
            // InternalEHelp.g:1753:3: ( rule__Images__ImagesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEHelp.g:1753:4: rule__Images__ImagesAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Images__ImagesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalEHelp.g:1762:1: rule__Images__Group__2 : rule__Images__Group__2__Impl ;
    public final void rule__Images__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1766:1: ( rule__Images__Group__2__Impl )
            // InternalEHelp.g:1767:2: rule__Images__Group__2__Impl
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
    // InternalEHelp.g:1773:1: rule__Images__Group__2__Impl : ( ']' ) ;
    public final void rule__Images__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1777:1: ( ( ']' ) )
            // InternalEHelp.g:1778:1: ( ']' )
            {
            // InternalEHelp.g:1778:1: ( ']' )
            // InternalEHelp.g:1779:2: ']'
            {
             before(grammarAccess.getImagesAccess().getRightSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEHelp.g:1789:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1793:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalEHelp.g:1794:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalEHelp.g:1801:1: rule__Link__Group__0__Impl : ( '[' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1805:1: ( ( '[' ) )
            // InternalEHelp.g:1806:1: ( '[' )
            {
            // InternalEHelp.g:1806:1: ( '[' )
            // InternalEHelp.g:1807:2: '['
            {
             before(grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEHelp.g:1816:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1820:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalEHelp.g:1821:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalEHelp.g:1828:1: rule__Link__Group__1__Impl : ( ( rule__Link__LinkAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1832:1: ( ( ( rule__Link__LinkAssignment_1 ) ) )
            // InternalEHelp.g:1833:1: ( ( rule__Link__LinkAssignment_1 ) )
            {
            // InternalEHelp.g:1833:1: ( ( rule__Link__LinkAssignment_1 ) )
            // InternalEHelp.g:1834:2: ( rule__Link__LinkAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_1()); 
            // InternalEHelp.g:1835:2: ( rule__Link__LinkAssignment_1 )
            // InternalEHelp.g:1835:3: rule__Link__LinkAssignment_1
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
    // InternalEHelp.g:1843:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1847:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalEHelp.g:1848:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalEHelp.g:1855:1: rule__Link__Group__2__Impl : ( ( rule__Link__CaptionAssignment_2 )? ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1859:1: ( ( ( rule__Link__CaptionAssignment_2 )? ) )
            // InternalEHelp.g:1860:1: ( ( rule__Link__CaptionAssignment_2 )? )
            {
            // InternalEHelp.g:1860:1: ( ( rule__Link__CaptionAssignment_2 )? )
            // InternalEHelp.g:1861:2: ( rule__Link__CaptionAssignment_2 )?
            {
             before(grammarAccess.getLinkAccess().getCaptionAssignment_2()); 
            // InternalEHelp.g:1862:2: ( rule__Link__CaptionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEHelp.g:1862:3: rule__Link__CaptionAssignment_2
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
    // InternalEHelp.g:1870:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1874:1: ( rule__Link__Group__3__Impl )
            // InternalEHelp.g:1875:2: rule__Link__Group__3__Impl
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
    // InternalEHelp.g:1881:1: rule__Link__Group__3__Impl : ( ']' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1885:1: ( ( ']' ) )
            // InternalEHelp.g:1886:1: ( ']' )
            {
            // InternalEHelp.g:1886:1: ( ']' )
            // InternalEHelp.g:1887:2: ']'
            {
             before(grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__EHelpModel__ChaptersAssignment"
    // InternalEHelp.g:1897:1: rule__EHelpModel__ChaptersAssignment : ( ruleChapter ) ;
    public final void rule__EHelpModel__ChaptersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1901:1: ( ( ruleChapter ) )
            // InternalEHelp.g:1902:2: ( ruleChapter )
            {
            // InternalEHelp.g:1902:2: ( ruleChapter )
            // InternalEHelp.g:1903:3: ruleChapter
            {
             before(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EHelpModel__ChaptersAssignment"


    // $ANTLR start "rule__Chapter__NameAssignment_1"
    // InternalEHelp.g:1912:1: rule__Chapter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1916:1: ( ( RULE_ID ) )
            // InternalEHelp.g:1917:2: ( RULE_ID )
            {
            // InternalEHelp.g:1917:2: ( RULE_ID )
            // InternalEHelp.g:1918:3: RULE_ID
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
    // InternalEHelp.g:1927:1: rule__Chapter__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Chapter__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1931:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:1932:2: ( RULE_STRING )
            {
            // InternalEHelp.g:1932:2: ( RULE_STRING )
            // InternalEHelp.g:1933:3: RULE_STRING
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
    // InternalEHelp.g:1942:1: rule__Chapter__ContentAssignment_4 : ( ruleContent ) ;
    public final void rule__Chapter__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1946:1: ( ( ruleContent ) )
            // InternalEHelp.g:1947:2: ( ruleContent )
            {
            // InternalEHelp.g:1947:2: ( ruleContent )
            // InternalEHelp.g:1948:3: ruleContent
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
    // InternalEHelp.g:1957:1: rule__Chapter__SubchaptersAssignment_5 : ( ruleChapter ) ;
    public final void rule__Chapter__SubchaptersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1961:1: ( ( ruleChapter ) )
            // InternalEHelp.g:1962:2: ( ruleChapter )
            {
            // InternalEHelp.g:1962:2: ( ruleChapter )
            // InternalEHelp.g:1963:3: ruleChapter
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
    // InternalEHelp.g:1972:1: rule__List__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__List__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1976:1: ( ( ruleListItem ) )
            // InternalEHelp.g:1977:2: ( ruleListItem )
            {
            // InternalEHelp.g:1977:2: ( ruleListItem )
            // InternalEHelp.g:1978:3: ruleListItem
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
    // InternalEHelp.g:1987:1: rule__Enum__ItemsAssignment_2 : ( ruleListItem ) ;
    public final void rule__Enum__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:1991:1: ( ( ruleListItem ) )
            // InternalEHelp.g:1992:2: ( ruleListItem )
            {
            // InternalEHelp.g:1992:2: ( ruleListItem )
            // InternalEHelp.g:1993:3: ruleListItem
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
    // InternalEHelp.g:2002:1: rule__ListItem__ContentAssignment_1 : ( ruleContent ) ;
    public final void rule__ListItem__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2006:1: ( ( ruleContent ) )
            // InternalEHelp.g:2007:2: ( ruleContent )
            {
            // InternalEHelp.g:2007:2: ( ruleContent )
            // InternalEHelp.g:2008:3: ruleContent
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
    // InternalEHelp.g:2017:1: rule__Table__WidthAssignment_1 : ( RULE_INT ) ;
    public final void rule__Table__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2021:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2022:2: ( RULE_INT )
            {
            // InternalEHelp.g:2022:2: ( RULE_INT )
            // InternalEHelp.g:2023:3: RULE_INT
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
    // InternalEHelp.g:2032:1: rule__Table__SpacingAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__Table__SpacingAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2036:1: ( ( RULE_INT ) )
            // InternalEHelp.g:2037:2: ( RULE_INT )
            {
            // InternalEHelp.g:2037:2: ( RULE_INT )
            // InternalEHelp.g:2038:3: RULE_INT
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
    // InternalEHelp.g:2047:1: rule__Table__StretchAssignment_3 : ( ( 'stretch' ) ) ;
    public final void rule__Table__StretchAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2051:1: ( ( ( 'stretch' ) ) )
            // InternalEHelp.g:2052:2: ( ( 'stretch' ) )
            {
            // InternalEHelp.g:2052:2: ( ( 'stretch' ) )
            // InternalEHelp.g:2053:3: ( 'stretch' )
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            // InternalEHelp.g:2054:3: ( 'stretch' )
            // InternalEHelp.g:2055:4: 'stretch'
            {
             before(grammarAccess.getTableAccess().getStretchStretchKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEHelp.g:2066:1: rule__Table__RowsAssignment_5 : ( ruleTableRow ) ;
    public final void rule__Table__RowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2070:1: ( ( ruleTableRow ) )
            // InternalEHelp.g:2071:2: ( ruleTableRow )
            {
            // InternalEHelp.g:2071:2: ( ruleTableRow )
            // InternalEHelp.g:2072:3: ruleTableRow
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
    // InternalEHelp.g:2081:1: rule__TableRow__CellsAssignment_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2085:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2086:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2086:2: ( ruleTableCell )
            // InternalEHelp.g:2087:3: ruleTableCell
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
    // InternalEHelp.g:2096:1: rule__TableRow__CellsAssignment_2_1 : ( ruleTableCell ) ;
    public final void rule__TableRow__CellsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2100:1: ( ( ruleTableCell ) )
            // InternalEHelp.g:2101:2: ( ruleTableCell )
            {
            // InternalEHelp.g:2101:2: ( ruleTableCell )
            // InternalEHelp.g:2102:3: ruleTableCell
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
    // InternalEHelp.g:2111:1: rule__TableCell__CenterAssignment_0 : ( ( 'center' ) ) ;
    public final void rule__TableCell__CenterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2115:1: ( ( ( 'center' ) ) )
            // InternalEHelp.g:2116:2: ( ( 'center' ) )
            {
            // InternalEHelp.g:2116:2: ( ( 'center' ) )
            // InternalEHelp.g:2117:3: ( 'center' )
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            // InternalEHelp.g:2118:3: ( 'center' )
            // InternalEHelp.g:2119:4: 'center'
            {
             before(grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEHelp.g:2130:1: rule__TableCell__LeftAssignment_1 : ( ( 'left' ) ) ;
    public final void rule__TableCell__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2134:1: ( ( ( 'left' ) ) )
            // InternalEHelp.g:2135:2: ( ( 'left' ) )
            {
            // InternalEHelp.g:2135:2: ( ( 'left' ) )
            // InternalEHelp.g:2136:3: ( 'left' )
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            // InternalEHelp.g:2137:3: ( 'left' )
            // InternalEHelp.g:2138:4: 'left'
            {
             before(grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEHelp.g:2149:1: rule__TableCell__RightAssignment_2 : ( ( 'right' ) ) ;
    public final void rule__TableCell__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2153:1: ( ( ( 'right' ) ) )
            // InternalEHelp.g:2154:2: ( ( 'right' ) )
            {
            // InternalEHelp.g:2154:2: ( ( 'right' ) )
            // InternalEHelp.g:2155:3: ( 'right' )
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            // InternalEHelp.g:2156:3: ( 'right' )
            // InternalEHelp.g:2157:4: 'right'
            {
             before(grammarAccess.getTableCellAccess().getRightRightKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEHelp.g:2168:1: rule__TableCell__TopAssignment_3 : ( ( 'top' ) ) ;
    public final void rule__TableCell__TopAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2172:1: ( ( ( 'top' ) ) )
            // InternalEHelp.g:2173:2: ( ( 'top' ) )
            {
            // InternalEHelp.g:2173:2: ( ( 'top' ) )
            // InternalEHelp.g:2174:3: ( 'top' )
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            // InternalEHelp.g:2175:3: ( 'top' )
            // InternalEHelp.g:2176:4: 'top'
            {
             before(grammarAccess.getTableCellAccess().getTopTopKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEHelp.g:2187:1: rule__TableCell__MiddleAssignment_4 : ( ( 'middle' ) ) ;
    public final void rule__TableCell__MiddleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2191:1: ( ( ( 'middle' ) ) )
            // InternalEHelp.g:2192:2: ( ( 'middle' ) )
            {
            // InternalEHelp.g:2192:2: ( ( 'middle' ) )
            // InternalEHelp.g:2193:3: ( 'middle' )
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            // InternalEHelp.g:2194:3: ( 'middle' )
            // InternalEHelp.g:2195:4: 'middle'
            {
             before(grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEHelp.g:2206:1: rule__TableCell__BottomAssignment_5 : ( ( 'bottom' ) ) ;
    public final void rule__TableCell__BottomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2210:1: ( ( ( 'bottom' ) ) )
            // InternalEHelp.g:2211:2: ( ( 'bottom' ) )
            {
            // InternalEHelp.g:2211:2: ( ( 'bottom' ) )
            // InternalEHelp.g:2212:3: ( 'bottom' )
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            // InternalEHelp.g:2213:3: ( 'bottom' )
            // InternalEHelp.g:2214:4: 'bottom'
            {
             before(grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalEHelp.g:2225:1: rule__TableCell__ContentAssignment_6 : ( ruleContent ) ;
    public final void rule__TableCell__ContentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2229:1: ( ( ruleContent ) )
            // InternalEHelp.g:2230:2: ( ruleContent )
            {
            // InternalEHelp.g:2230:2: ( ruleContent )
            // InternalEHelp.g:2231:3: ruleContent
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
    // InternalEHelp.g:2240:1: rule__Text__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2244:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2245:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2245:2: ( RULE_STRING )
            // InternalEHelp.g:2246:3: RULE_STRING
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
    // InternalEHelp.g:2255:1: rule__Keyword__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Keyword__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2259:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2260:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2260:2: ( RULE_STRING )
            // InternalEHelp.g:2261:3: RULE_STRING
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
    // InternalEHelp.g:2270:1: rule__Context__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2274:1: ( ( RULE_ID ) )
            // InternalEHelp.g:2275:2: ( RULE_ID )
            {
            // InternalEHelp.g:2275:2: ( RULE_ID )
            // InternalEHelp.g:2276:3: RULE_ID
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
    // InternalEHelp.g:2285:1: rule__Context__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Context__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2289:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2290:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2290:2: ( RULE_STRING )
            // InternalEHelp.g:2291:3: RULE_STRING
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
    // InternalEHelp.g:2300:1: rule__Images__ImagesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Images__ImagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2304:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2305:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2305:2: ( RULE_STRING )
            // InternalEHelp.g:2306:3: RULE_STRING
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
    // InternalEHelp.g:2315:1: rule__Link__LinkAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2319:1: ( ( ( RULE_ID ) ) )
            // InternalEHelp.g:2320:2: ( ( RULE_ID ) )
            {
            // InternalEHelp.g:2320:2: ( ( RULE_ID ) )
            // InternalEHelp.g:2321:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0()); 
            // InternalEHelp.g:2322:3: ( RULE_ID )
            // InternalEHelp.g:2323:4: RULE_ID
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
    // InternalEHelp.g:2334:1: rule__Link__CaptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Link__CaptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEHelp.g:2338:1: ( ( RULE_STRING ) )
            // InternalEHelp.g:2339:2: ( RULE_STRING )
            {
            // InternalEHelp.g:2339:2: ( RULE_STRING )
            // InternalEHelp.g:2340:3: RULE_STRING
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
    static final String dfa_2s = "\1\5\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\27\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\4\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\5\1\6\1\uffff\1\7\3\uffff\1\1\1\2\1\4",
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
            return "402:1: rule__Content__Alternatives : ( ( ruleKeyword ) | ( ruleContext ) | ( ruleText ) | ( ruleImages ) | ( ruleLink ) | ( ruleList ) | ( ruleEnum ) | ( ruleTable ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000E2E820L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000E2C022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000E2C020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002041040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000FCE2C020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000020L});

}