package de.cau.cs.kieler.verification.ide.ltl.contentassist.antlr.internal;

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
import de.cau.cs.kieler.verification.ltl.services.LTLFormulaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLTLFormulaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'&&'", "'||'", "'('", "')'", "'G'", "'F'", "'X'", "'!'", "'U'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLTLFormulaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLTLFormulaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLTLFormulaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLTLFormula.g"; }


    	private LTLFormulaGrammarAccess grammarAccess;

    	public void setGrammarAccess(LTLFormulaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLTLFormula"
    // InternalLTLFormula.g:54:1: entryRuleLTLFormula : ruleLTLFormula EOF ;
    public final void entryRuleLTLFormula() throws RecognitionException {
        try {
            // InternalLTLFormula.g:55:1: ( ruleLTLFormula EOF )
            // InternalLTLFormula.g:56:1: ruleLTLFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLTLFormula"


    // $ANTLR start "ruleLTLFormula"
    // InternalLTLFormula.g:63:1: ruleLTLFormula : ( ( rule__LTLFormula__Group__0 ) ) ;
    public final void ruleLTLFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:67:2: ( ( ( rule__LTLFormula__Group__0 ) ) )
            // InternalLTLFormula.g:68:2: ( ( rule__LTLFormula__Group__0 ) )
            {
            // InternalLTLFormula.g:68:2: ( ( rule__LTLFormula__Group__0 ) )
            // InternalLTLFormula.g:69:3: ( rule__LTLFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getGroup()); 
            }
            // InternalLTLFormula.g:70:3: ( rule__LTLFormula__Group__0 )
            // InternalLTLFormula.g:70:4: rule__LTLFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleLTLFormula"


    // $ANTLR start "entryRuleAnd"
    // InternalLTLFormula.g:79:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalLTLFormula.g:80:1: ( ruleAnd EOF )
            // InternalLTLFormula.g:81:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLTLFormula.g:88:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:92:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalLTLFormula.g:93:2: ( ( rule__And__Group__0 ) )
            {
            // InternalLTLFormula.g:93:2: ( ( rule__And__Group__0 ) )
            // InternalLTLFormula.g:94:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalLTLFormula.g:95:3: ( rule__And__Group__0 )
            // InternalLTLFormula.g:95:4: rule__And__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLTLFormula.g:104:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalLTLFormula.g:105:1: ( ruleOr EOF )
            // InternalLTLFormula.g:106:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLTLFormula.g:113:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:117:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalLTLFormula.g:118:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalLTLFormula.g:118:2: ( ( rule__Or__Group__0 ) )
            // InternalLTLFormula.g:119:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalLTLFormula.g:120:3: ( rule__Or__Group__0 )
            // InternalLTLFormula.g:120:4: rule__Or__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleLast"
    // InternalLTLFormula.g:129:1: entryRuleLast : ruleLast EOF ;
    public final void entryRuleLast() throws RecognitionException {
        try {
            // InternalLTLFormula.g:130:1: ( ruleLast EOF )
            // InternalLTLFormula.g:131:1: ruleLast EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLast"


    // $ANTLR start "ruleLast"
    // InternalLTLFormula.g:138:1: ruleLast : ( ( rule__Last__Alternatives ) ) ;
    public final void ruleLast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:142:2: ( ( ( rule__Last__Alternatives ) ) )
            // InternalLTLFormula.g:143:2: ( ( rule__Last__Alternatives ) )
            {
            // InternalLTLFormula.g:143:2: ( ( rule__Last__Alternatives ) )
            // InternalLTLFormula.g:144:3: ( rule__Last__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getAlternatives()); 
            }
            // InternalLTLFormula.g:145:3: ( rule__Last__Alternatives )
            // InternalLTLFormula.g:145:4: rule__Last__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLast"


    // $ANTLR start "entryRuleVariable"
    // InternalLTLFormula.g:154:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalLTLFormula.g:155:1: ( ruleVariable EOF )
            // InternalLTLFormula.g:156:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalLTLFormula.g:163:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:167:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalLTLFormula.g:168:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalLTLFormula.g:168:2: ( ( rule__Variable__Alternatives ) )
            // InternalLTLFormula.g:169:3: ( rule__Variable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives()); 
            }
            // InternalLTLFormula.g:170:3: ( rule__Variable__Alternatives )
            // InternalLTLFormula.g:170:4: rule__Variable__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Last__Alternatives"
    // InternalLTLFormula.g:178:1: rule__Last__Alternatives : ( ( ( rule__Last__Group_0__0 ) ) | ( ( rule__Last__Group_1__0 ) ) | ( ( rule__Last__Group_2__0 ) ) | ( ( rule__Last__Group_3__0 ) ) | ( ( rule__Last__Group_4__0 ) ) | ( ( rule__Last__FormulasAssignment_5 ) ) );
    public final void rule__Last__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:182:1: ( ( ( rule__Last__Group_0__0 ) ) | ( ( rule__Last__Group_1__0 ) ) | ( ( rule__Last__Group_2__0 ) ) | ( ( rule__Last__Group_3__0 ) ) | ( ( rule__Last__Group_4__0 ) ) | ( ( rule__Last__FormulasAssignment_5 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            case RULE_ID:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLTLFormula.g:183:2: ( ( rule__Last__Group_0__0 ) )
                    {
                    // InternalLTLFormula.g:183:2: ( ( rule__Last__Group_0__0 ) )
                    // InternalLTLFormula.g:184:3: ( rule__Last__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getGroup_0()); 
                    }
                    // InternalLTLFormula.g:185:3: ( rule__Last__Group_0__0 )
                    // InternalLTLFormula.g:185:4: rule__Last__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLTLFormula.g:189:2: ( ( rule__Last__Group_1__0 ) )
                    {
                    // InternalLTLFormula.g:189:2: ( ( rule__Last__Group_1__0 ) )
                    // InternalLTLFormula.g:190:3: ( rule__Last__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getGroup_1()); 
                    }
                    // InternalLTLFormula.g:191:3: ( rule__Last__Group_1__0 )
                    // InternalLTLFormula.g:191:4: rule__Last__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLTLFormula.g:195:2: ( ( rule__Last__Group_2__0 ) )
                    {
                    // InternalLTLFormula.g:195:2: ( ( rule__Last__Group_2__0 ) )
                    // InternalLTLFormula.g:196:3: ( rule__Last__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getGroup_2()); 
                    }
                    // InternalLTLFormula.g:197:3: ( rule__Last__Group_2__0 )
                    // InternalLTLFormula.g:197:4: rule__Last__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLTLFormula.g:201:2: ( ( rule__Last__Group_3__0 ) )
                    {
                    // InternalLTLFormula.g:201:2: ( ( rule__Last__Group_3__0 ) )
                    // InternalLTLFormula.g:202:3: ( rule__Last__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getGroup_3()); 
                    }
                    // InternalLTLFormula.g:203:3: ( rule__Last__Group_3__0 )
                    // InternalLTLFormula.g:203:4: rule__Last__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLTLFormula.g:207:2: ( ( rule__Last__Group_4__0 ) )
                    {
                    // InternalLTLFormula.g:207:2: ( ( rule__Last__Group_4__0 ) )
                    // InternalLTLFormula.g:208:3: ( rule__Last__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getGroup_4()); 
                    }
                    // InternalLTLFormula.g:209:3: ( rule__Last__Group_4__0 )
                    // InternalLTLFormula.g:209:4: rule__Last__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLTLFormula.g:213:2: ( ( rule__Last__FormulasAssignment_5 ) )
                    {
                    // InternalLTLFormula.g:213:2: ( ( rule__Last__FormulasAssignment_5 ) )
                    // InternalLTLFormula.g:214:3: ( rule__Last__FormulasAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLastAccess().getFormulasAssignment_5()); 
                    }
                    // InternalLTLFormula.g:215:3: ( rule__Last__FormulasAssignment_5 )
                    // InternalLTLFormula.g:215:4: rule__Last__FormulasAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Last__FormulasAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLastAccess().getFormulasAssignment_5()); 
                    }

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
    // $ANTLR end "rule__Last__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalLTLFormula.g:223:1: rule__Variable__Alternatives : ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:227:1: ( ( ( rule__Variable__Group_0__0 ) ) | ( ( rule__Variable__Group_1__0 ) ) | ( ( rule__Variable__Group_2__0 ) ) | ( ( rule__Variable__Group_3__0 ) ) | ( ( rule__Variable__Group_4__0 ) ) | ( ( rule__Variable__Group_5__0 ) ) )
            int alt2=6;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt2=6;
                    }
                    break;
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                case 24:
                    {
                    alt2=4;
                    }
                    break;
                case 21:
                    {
                    alt2=1;
                    }
                    break;
                case 23:
                    {
                    alt2=3;
                    }
                    break;
                case 25:
                    {
                    alt2=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLTLFormula.g:228:2: ( ( rule__Variable__Group_0__0 ) )
                    {
                    // InternalLTLFormula.g:228:2: ( ( rule__Variable__Group_0__0 ) )
                    // InternalLTLFormula.g:229:3: ( rule__Variable__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_0()); 
                    }
                    // InternalLTLFormula.g:230:3: ( rule__Variable__Group_0__0 )
                    // InternalLTLFormula.g:230:4: rule__Variable__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLTLFormula.g:234:2: ( ( rule__Variable__Group_1__0 ) )
                    {
                    // InternalLTLFormula.g:234:2: ( ( rule__Variable__Group_1__0 ) )
                    // InternalLTLFormula.g:235:3: ( rule__Variable__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_1()); 
                    }
                    // InternalLTLFormula.g:236:3: ( rule__Variable__Group_1__0 )
                    // InternalLTLFormula.g:236:4: rule__Variable__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLTLFormula.g:240:2: ( ( rule__Variable__Group_2__0 ) )
                    {
                    // InternalLTLFormula.g:240:2: ( ( rule__Variable__Group_2__0 ) )
                    // InternalLTLFormula.g:241:3: ( rule__Variable__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_2()); 
                    }
                    // InternalLTLFormula.g:242:3: ( rule__Variable__Group_2__0 )
                    // InternalLTLFormula.g:242:4: rule__Variable__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLTLFormula.g:246:2: ( ( rule__Variable__Group_3__0 ) )
                    {
                    // InternalLTLFormula.g:246:2: ( ( rule__Variable__Group_3__0 ) )
                    // InternalLTLFormula.g:247:3: ( rule__Variable__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_3()); 
                    }
                    // InternalLTLFormula.g:248:3: ( rule__Variable__Group_3__0 )
                    // InternalLTLFormula.g:248:4: rule__Variable__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLTLFormula.g:252:2: ( ( rule__Variable__Group_4__0 ) )
                    {
                    // InternalLTLFormula.g:252:2: ( ( rule__Variable__Group_4__0 ) )
                    // InternalLTLFormula.g:253:3: ( rule__Variable__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_4()); 
                    }
                    // InternalLTLFormula.g:254:3: ( rule__Variable__Group_4__0 )
                    // InternalLTLFormula.g:254:4: rule__Variable__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLTLFormula.g:258:2: ( ( rule__Variable__Group_5__0 ) )
                    {
                    // InternalLTLFormula.g:258:2: ( ( rule__Variable__Group_5__0 ) )
                    // InternalLTLFormula.g:259:3: ( rule__Variable__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getGroup_5()); 
                    }
                    // InternalLTLFormula.g:260:3: ( rule__Variable__Group_5__0 )
                    // InternalLTLFormula.g:260:4: rule__Variable__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Variable__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getGroup_5()); 
                    }

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__LTLFormula__Group__0"
    // InternalLTLFormula.g:268:1: rule__LTLFormula__Group__0 : rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1 ;
    public final void rule__LTLFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:272:1: ( rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1 )
            // InternalLTLFormula.g:273:2: rule__LTLFormula__Group__0__Impl rule__LTLFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__LTLFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTLFormula__Group__0"


    // $ANTLR start "rule__LTLFormula__Group__0__Impl"
    // InternalLTLFormula.g:280:1: rule__LTLFormula__Group__0__Impl : ( ( rule__LTLFormula__FormulasAssignment_0 ) ) ;
    public final void rule__LTLFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:284:1: ( ( ( rule__LTLFormula__FormulasAssignment_0 ) ) )
            // InternalLTLFormula.g:285:1: ( ( rule__LTLFormula__FormulasAssignment_0 ) )
            {
            // InternalLTLFormula.g:285:1: ( ( rule__LTLFormula__FormulasAssignment_0 ) )
            // InternalLTLFormula.g:286:2: ( rule__LTLFormula__FormulasAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getFormulasAssignment_0()); 
            }
            // InternalLTLFormula.g:287:2: ( rule__LTLFormula__FormulasAssignment_0 )
            // InternalLTLFormula.g:287:3: rule__LTLFormula__FormulasAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__FormulasAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getFormulasAssignment_0()); 
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
    // $ANTLR end "rule__LTLFormula__Group__0__Impl"


    // $ANTLR start "rule__LTLFormula__Group__1"
    // InternalLTLFormula.g:295:1: rule__LTLFormula__Group__1 : rule__LTLFormula__Group__1__Impl ;
    public final void rule__LTLFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:299:1: ( rule__LTLFormula__Group__1__Impl )
            // InternalLTLFormula.g:300:2: rule__LTLFormula__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTLFormula__Group__1"


    // $ANTLR start "rule__LTLFormula__Group__1__Impl"
    // InternalLTLFormula.g:306:1: rule__LTLFormula__Group__1__Impl : ( ( rule__LTLFormula__Group_1__0 )* ) ;
    public final void rule__LTLFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:310:1: ( ( ( rule__LTLFormula__Group_1__0 )* ) )
            // InternalLTLFormula.g:311:1: ( ( rule__LTLFormula__Group_1__0 )* )
            {
            // InternalLTLFormula.g:311:1: ( ( rule__LTLFormula__Group_1__0 )* )
            // InternalLTLFormula.g:312:2: ( rule__LTLFormula__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getGroup_1()); 
            }
            // InternalLTLFormula.g:313:2: ( rule__LTLFormula__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLTLFormula.g:313:3: rule__LTLFormula__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__LTLFormula__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getGroup_1()); 
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
    // $ANTLR end "rule__LTLFormula__Group__1__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1__0"
    // InternalLTLFormula.g:322:1: rule__LTLFormula__Group_1__0 : rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1 ;
    public final void rule__LTLFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:326:1: ( rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1 )
            // InternalLTLFormula.g:327:2: rule__LTLFormula__Group_1__0__Impl rule__LTLFormula__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LTLFormula__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTLFormula__Group_1__0"


    // $ANTLR start "rule__LTLFormula__Group_1__0__Impl"
    // InternalLTLFormula.g:334:1: rule__LTLFormula__Group_1__0__Impl : ( '->' ) ;
    public final void rule__LTLFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:338:1: ( ( '->' ) )
            // InternalLTLFormula.g:339:1: ( '->' )
            {
            // InternalLTLFormula.g:339:1: ( '->' )
            // InternalLTLFormula.g:340:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            }
            match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
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
    // $ANTLR end "rule__LTLFormula__Group_1__0__Impl"


    // $ANTLR start "rule__LTLFormula__Group_1__1"
    // InternalLTLFormula.g:349:1: rule__LTLFormula__Group_1__1 : rule__LTLFormula__Group_1__1__Impl ;
    public final void rule__LTLFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:353:1: ( rule__LTLFormula__Group_1__1__Impl )
            // InternalLTLFormula.g:354:2: rule__LTLFormula__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LTLFormula__Group_1__1"


    // $ANTLR start "rule__LTLFormula__Group_1__1__Impl"
    // InternalLTLFormula.g:360:1: rule__LTLFormula__Group_1__1__Impl : ( ( rule__LTLFormula__FormulasAssignment_1_1 ) ) ;
    public final void rule__LTLFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:364:1: ( ( ( rule__LTLFormula__FormulasAssignment_1_1 ) ) )
            // InternalLTLFormula.g:365:1: ( ( rule__LTLFormula__FormulasAssignment_1_1 ) )
            {
            // InternalLTLFormula.g:365:1: ( ( rule__LTLFormula__FormulasAssignment_1_1 ) )
            // InternalLTLFormula.g:366:2: ( rule__LTLFormula__FormulasAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getFormulasAssignment_1_1()); 
            }
            // InternalLTLFormula.g:367:2: ( rule__LTLFormula__FormulasAssignment_1_1 )
            // InternalLTLFormula.g:367:3: rule__LTLFormula__FormulasAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LTLFormula__FormulasAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getFormulasAssignment_1_1()); 
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
    // $ANTLR end "rule__LTLFormula__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalLTLFormula.g:376:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:380:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalLTLFormula.g:381:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalLTLFormula.g:388:1: rule__And__Group__0__Impl : ( ( rule__And__FormulasAssignment_0 ) ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:392:1: ( ( ( rule__And__FormulasAssignment_0 ) ) )
            // InternalLTLFormula.g:393:1: ( ( rule__And__FormulasAssignment_0 ) )
            {
            // InternalLTLFormula.g:393:1: ( ( rule__And__FormulasAssignment_0 ) )
            // InternalLTLFormula.g:394:2: ( rule__And__FormulasAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getFormulasAssignment_0()); 
            }
            // InternalLTLFormula.g:395:2: ( rule__And__FormulasAssignment_0 )
            // InternalLTLFormula.g:395:3: rule__And__FormulasAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__FormulasAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getFormulasAssignment_0()); 
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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalLTLFormula.g:403:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:407:1: ( rule__And__Group__1__Impl )
            // InternalLTLFormula.g:408:2: rule__And__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalLTLFormula.g:414:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:418:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalLTLFormula.g:419:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalLTLFormula.g:419:1: ( ( rule__And__Group_1__0 )* )
            // InternalLTLFormula.g:420:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalLTLFormula.g:421:2: ( rule__And__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLTLFormula.g:421:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalLTLFormula.g:430:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:434:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalLTLFormula.g:435:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalLTLFormula.g:442:1: rule__And__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:446:1: ( ( '&&' ) )
            // InternalLTLFormula.g:447:1: ( '&&' )
            {
            // InternalLTLFormula.g:447:1: ( '&&' )
            // InternalLTLFormula.g:448:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0()); 
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
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalLTLFormula.g:457:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:461:1: ( rule__And__Group_1__1__Impl )
            // InternalLTLFormula.g:462:2: rule__And__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalLTLFormula.g:468:1: rule__And__Group_1__1__Impl : ( ( rule__And__FormulasAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:472:1: ( ( ( rule__And__FormulasAssignment_1_1 ) ) )
            // InternalLTLFormula.g:473:1: ( ( rule__And__FormulasAssignment_1_1 ) )
            {
            // InternalLTLFormula.g:473:1: ( ( rule__And__FormulasAssignment_1_1 ) )
            // InternalLTLFormula.g:474:2: ( rule__And__FormulasAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getFormulasAssignment_1_1()); 
            }
            // InternalLTLFormula.g:475:2: ( rule__And__FormulasAssignment_1_1 )
            // InternalLTLFormula.g:475:3: rule__And__FormulasAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__And__FormulasAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getFormulasAssignment_1_1()); 
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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalLTLFormula.g:484:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:488:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalLTLFormula.g:489:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalLTLFormula.g:496:1: rule__Or__Group__0__Impl : ( ( rule__Or__FormulasAssignment_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:500:1: ( ( ( rule__Or__FormulasAssignment_0 ) ) )
            // InternalLTLFormula.g:501:1: ( ( rule__Or__FormulasAssignment_0 ) )
            {
            // InternalLTLFormula.g:501:1: ( ( rule__Or__FormulasAssignment_0 ) )
            // InternalLTLFormula.g:502:2: ( rule__Or__FormulasAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getFormulasAssignment_0()); 
            }
            // InternalLTLFormula.g:503:2: ( rule__Or__FormulasAssignment_0 )
            // InternalLTLFormula.g:503:3: rule__Or__FormulasAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__FormulasAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getFormulasAssignment_0()); 
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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalLTLFormula.g:511:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:515:1: ( rule__Or__Group__1__Impl )
            // InternalLTLFormula.g:516:2: rule__Or__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalLTLFormula.g:522:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:526:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalLTLFormula.g:527:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalLTLFormula.g:527:1: ( ( rule__Or__Group_1__0 )* )
            // InternalLTLFormula.g:528:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalLTLFormula.g:529:2: ( rule__Or__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLTLFormula.g:529:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalLTLFormula.g:538:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:542:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalLTLFormula.g:543:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalLTLFormula.g:550:1: rule__Or__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:554:1: ( ( '||' ) )
            // InternalLTLFormula.g:555:1: ( '||' )
            {
            // InternalLTLFormula.g:555:1: ( '||' )
            // InternalLTLFormula.g:556:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0()); 
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
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalLTLFormula.g:565:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:569:1: ( rule__Or__Group_1__1__Impl )
            // InternalLTLFormula.g:570:2: rule__Or__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalLTLFormula.g:576:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__FormulasAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:580:1: ( ( ( rule__Or__FormulasAssignment_1_1 ) ) )
            // InternalLTLFormula.g:581:1: ( ( rule__Or__FormulasAssignment_1_1 ) )
            {
            // InternalLTLFormula.g:581:1: ( ( rule__Or__FormulasAssignment_1_1 ) )
            // InternalLTLFormula.g:582:2: ( rule__Or__FormulasAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getFormulasAssignment_1_1()); 
            }
            // InternalLTLFormula.g:583:2: ( rule__Or__FormulasAssignment_1_1 )
            // InternalLTLFormula.g:583:3: rule__Or__FormulasAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Or__FormulasAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getFormulasAssignment_1_1()); 
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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Last__Group_0__0"
    // InternalLTLFormula.g:592:1: rule__Last__Group_0__0 : rule__Last__Group_0__0__Impl rule__Last__Group_0__1 ;
    public final void rule__Last__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:596:1: ( rule__Last__Group_0__0__Impl rule__Last__Group_0__1 )
            // InternalLTLFormula.g:597:2: rule__Last__Group_0__0__Impl rule__Last__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_0__0"


    // $ANTLR start "rule__Last__Group_0__0__Impl"
    // InternalLTLFormula.g:604:1: rule__Last__Group_0__0__Impl : ( ( rule__Last__OperatorAssignment_0_0 ) ) ;
    public final void rule__Last__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:608:1: ( ( ( rule__Last__OperatorAssignment_0_0 ) ) )
            // InternalLTLFormula.g:609:1: ( ( rule__Last__OperatorAssignment_0_0 ) )
            {
            // InternalLTLFormula.g:609:1: ( ( rule__Last__OperatorAssignment_0_0 ) )
            // InternalLTLFormula.g:610:2: ( rule__Last__OperatorAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorAssignment_0_0()); 
            }
            // InternalLTLFormula.g:611:2: ( rule__Last__OperatorAssignment_0_0 )
            // InternalLTLFormula.g:611:3: rule__Last__OperatorAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__OperatorAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorAssignment_0_0()); 
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
    // $ANTLR end "rule__Last__Group_0__0__Impl"


    // $ANTLR start "rule__Last__Group_0__1"
    // InternalLTLFormula.g:619:1: rule__Last__Group_0__1 : rule__Last__Group_0__1__Impl rule__Last__Group_0__2 ;
    public final void rule__Last__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:623:1: ( rule__Last__Group_0__1__Impl rule__Last__Group_0__2 )
            // InternalLTLFormula.g:624:2: rule__Last__Group_0__1__Impl rule__Last__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_0__1"


    // $ANTLR start "rule__Last__Group_0__1__Impl"
    // InternalLTLFormula.g:631:1: rule__Last__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Last__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:635:1: ( ( '(' ) )
            // InternalLTLFormula.g:636:1: ( '(' )
            {
            // InternalLTLFormula.g:636:1: ( '(' )
            // InternalLTLFormula.g:637:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_0_1()); 
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
    // $ANTLR end "rule__Last__Group_0__1__Impl"


    // $ANTLR start "rule__Last__Group_0__2"
    // InternalLTLFormula.g:646:1: rule__Last__Group_0__2 : rule__Last__Group_0__2__Impl rule__Last__Group_0__3 ;
    public final void rule__Last__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:650:1: ( rule__Last__Group_0__2__Impl rule__Last__Group_0__3 )
            // InternalLTLFormula.g:651:2: rule__Last__Group_0__2__Impl rule__Last__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_0__2"


    // $ANTLR start "rule__Last__Group_0__2__Impl"
    // InternalLTLFormula.g:658:1: rule__Last__Group_0__2__Impl : ( ( rule__Last__FormulasAssignment_0_2 ) ) ;
    public final void rule__Last__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:662:1: ( ( ( rule__Last__FormulasAssignment_0_2 ) ) )
            // InternalLTLFormula.g:663:1: ( ( rule__Last__FormulasAssignment_0_2 ) )
            {
            // InternalLTLFormula.g:663:1: ( ( rule__Last__FormulasAssignment_0_2 ) )
            // InternalLTLFormula.g:664:2: ( rule__Last__FormulasAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_0_2()); 
            }
            // InternalLTLFormula.g:665:2: ( rule__Last__FormulasAssignment_0_2 )
            // InternalLTLFormula.g:665:3: rule__Last__FormulasAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_0_2()); 
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
    // $ANTLR end "rule__Last__Group_0__2__Impl"


    // $ANTLR start "rule__Last__Group_0__3"
    // InternalLTLFormula.g:673:1: rule__Last__Group_0__3 : rule__Last__Group_0__3__Impl ;
    public final void rule__Last__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:677:1: ( rule__Last__Group_0__3__Impl )
            // InternalLTLFormula.g:678:2: rule__Last__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_0__3"


    // $ANTLR start "rule__Last__Group_0__3__Impl"
    // InternalLTLFormula.g:684:1: rule__Last__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Last__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:688:1: ( ( ')' ) )
            // InternalLTLFormula.g:689:1: ( ')' )
            {
            // InternalLTLFormula.g:689:1: ( ')' )
            // InternalLTLFormula.g:690:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_0_3()); 
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
    // $ANTLR end "rule__Last__Group_0__3__Impl"


    // $ANTLR start "rule__Last__Group_1__0"
    // InternalLTLFormula.g:700:1: rule__Last__Group_1__0 : rule__Last__Group_1__0__Impl rule__Last__Group_1__1 ;
    public final void rule__Last__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:704:1: ( rule__Last__Group_1__0__Impl rule__Last__Group_1__1 )
            // InternalLTLFormula.g:705:2: rule__Last__Group_1__0__Impl rule__Last__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_1__0"


    // $ANTLR start "rule__Last__Group_1__0__Impl"
    // InternalLTLFormula.g:712:1: rule__Last__Group_1__0__Impl : ( ( rule__Last__OperatorAssignment_1_0 ) ) ;
    public final void rule__Last__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:716:1: ( ( ( rule__Last__OperatorAssignment_1_0 ) ) )
            // InternalLTLFormula.g:717:1: ( ( rule__Last__OperatorAssignment_1_0 ) )
            {
            // InternalLTLFormula.g:717:1: ( ( rule__Last__OperatorAssignment_1_0 ) )
            // InternalLTLFormula.g:718:2: ( rule__Last__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorAssignment_1_0()); 
            }
            // InternalLTLFormula.g:719:2: ( rule__Last__OperatorAssignment_1_0 )
            // InternalLTLFormula.g:719:3: rule__Last__OperatorAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__OperatorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorAssignment_1_0()); 
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
    // $ANTLR end "rule__Last__Group_1__0__Impl"


    // $ANTLR start "rule__Last__Group_1__1"
    // InternalLTLFormula.g:727:1: rule__Last__Group_1__1 : rule__Last__Group_1__1__Impl rule__Last__Group_1__2 ;
    public final void rule__Last__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:731:1: ( rule__Last__Group_1__1__Impl rule__Last__Group_1__2 )
            // InternalLTLFormula.g:732:2: rule__Last__Group_1__1__Impl rule__Last__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_1__1"


    // $ANTLR start "rule__Last__Group_1__1__Impl"
    // InternalLTLFormula.g:739:1: rule__Last__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Last__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:743:1: ( ( '(' ) )
            // InternalLTLFormula.g:744:1: ( '(' )
            {
            // InternalLTLFormula.g:744:1: ( '(' )
            // InternalLTLFormula.g:745:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_1_1()); 
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
    // $ANTLR end "rule__Last__Group_1__1__Impl"


    // $ANTLR start "rule__Last__Group_1__2"
    // InternalLTLFormula.g:754:1: rule__Last__Group_1__2 : rule__Last__Group_1__2__Impl rule__Last__Group_1__3 ;
    public final void rule__Last__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:758:1: ( rule__Last__Group_1__2__Impl rule__Last__Group_1__3 )
            // InternalLTLFormula.g:759:2: rule__Last__Group_1__2__Impl rule__Last__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_1__2"


    // $ANTLR start "rule__Last__Group_1__2__Impl"
    // InternalLTLFormula.g:766:1: rule__Last__Group_1__2__Impl : ( ( rule__Last__FormulasAssignment_1_2 ) ) ;
    public final void rule__Last__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:770:1: ( ( ( rule__Last__FormulasAssignment_1_2 ) ) )
            // InternalLTLFormula.g:771:1: ( ( rule__Last__FormulasAssignment_1_2 ) )
            {
            // InternalLTLFormula.g:771:1: ( ( rule__Last__FormulasAssignment_1_2 ) )
            // InternalLTLFormula.g:772:2: ( rule__Last__FormulasAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_1_2()); 
            }
            // InternalLTLFormula.g:773:2: ( rule__Last__FormulasAssignment_1_2 )
            // InternalLTLFormula.g:773:3: rule__Last__FormulasAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_1_2()); 
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
    // $ANTLR end "rule__Last__Group_1__2__Impl"


    // $ANTLR start "rule__Last__Group_1__3"
    // InternalLTLFormula.g:781:1: rule__Last__Group_1__3 : rule__Last__Group_1__3__Impl ;
    public final void rule__Last__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:785:1: ( rule__Last__Group_1__3__Impl )
            // InternalLTLFormula.g:786:2: rule__Last__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_1__3"


    // $ANTLR start "rule__Last__Group_1__3__Impl"
    // InternalLTLFormula.g:792:1: rule__Last__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Last__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:796:1: ( ( ')' ) )
            // InternalLTLFormula.g:797:1: ( ')' )
            {
            // InternalLTLFormula.g:797:1: ( ')' )
            // InternalLTLFormula.g:798:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_1_3()); 
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
    // $ANTLR end "rule__Last__Group_1__3__Impl"


    // $ANTLR start "rule__Last__Group_2__0"
    // InternalLTLFormula.g:808:1: rule__Last__Group_2__0 : rule__Last__Group_2__0__Impl rule__Last__Group_2__1 ;
    public final void rule__Last__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:812:1: ( rule__Last__Group_2__0__Impl rule__Last__Group_2__1 )
            // InternalLTLFormula.g:813:2: rule__Last__Group_2__0__Impl rule__Last__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_2__0"


    // $ANTLR start "rule__Last__Group_2__0__Impl"
    // InternalLTLFormula.g:820:1: rule__Last__Group_2__0__Impl : ( ( rule__Last__OperatorAssignment_2_0 ) ) ;
    public final void rule__Last__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:824:1: ( ( ( rule__Last__OperatorAssignment_2_0 ) ) )
            // InternalLTLFormula.g:825:1: ( ( rule__Last__OperatorAssignment_2_0 ) )
            {
            // InternalLTLFormula.g:825:1: ( ( rule__Last__OperatorAssignment_2_0 ) )
            // InternalLTLFormula.g:826:2: ( rule__Last__OperatorAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorAssignment_2_0()); 
            }
            // InternalLTLFormula.g:827:2: ( rule__Last__OperatorAssignment_2_0 )
            // InternalLTLFormula.g:827:3: rule__Last__OperatorAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__OperatorAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorAssignment_2_0()); 
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
    // $ANTLR end "rule__Last__Group_2__0__Impl"


    // $ANTLR start "rule__Last__Group_2__1"
    // InternalLTLFormula.g:835:1: rule__Last__Group_2__1 : rule__Last__Group_2__1__Impl rule__Last__Group_2__2 ;
    public final void rule__Last__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:839:1: ( rule__Last__Group_2__1__Impl rule__Last__Group_2__2 )
            // InternalLTLFormula.g:840:2: rule__Last__Group_2__1__Impl rule__Last__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_2__1"


    // $ANTLR start "rule__Last__Group_2__1__Impl"
    // InternalLTLFormula.g:847:1: rule__Last__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Last__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:851:1: ( ( '(' ) )
            // InternalLTLFormula.g:852:1: ( '(' )
            {
            // InternalLTLFormula.g:852:1: ( '(' )
            // InternalLTLFormula.g:853:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_2_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_2_1()); 
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
    // $ANTLR end "rule__Last__Group_2__1__Impl"


    // $ANTLR start "rule__Last__Group_2__2"
    // InternalLTLFormula.g:862:1: rule__Last__Group_2__2 : rule__Last__Group_2__2__Impl rule__Last__Group_2__3 ;
    public final void rule__Last__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:866:1: ( rule__Last__Group_2__2__Impl rule__Last__Group_2__3 )
            // InternalLTLFormula.g:867:2: rule__Last__Group_2__2__Impl rule__Last__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_2__2"


    // $ANTLR start "rule__Last__Group_2__2__Impl"
    // InternalLTLFormula.g:874:1: rule__Last__Group_2__2__Impl : ( ( rule__Last__FormulasAssignment_2_2 ) ) ;
    public final void rule__Last__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:878:1: ( ( ( rule__Last__FormulasAssignment_2_2 ) ) )
            // InternalLTLFormula.g:879:1: ( ( rule__Last__FormulasAssignment_2_2 ) )
            {
            // InternalLTLFormula.g:879:1: ( ( rule__Last__FormulasAssignment_2_2 ) )
            // InternalLTLFormula.g:880:2: ( rule__Last__FormulasAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_2_2()); 
            }
            // InternalLTLFormula.g:881:2: ( rule__Last__FormulasAssignment_2_2 )
            // InternalLTLFormula.g:881:3: rule__Last__FormulasAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_2_2()); 
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
    // $ANTLR end "rule__Last__Group_2__2__Impl"


    // $ANTLR start "rule__Last__Group_2__3"
    // InternalLTLFormula.g:889:1: rule__Last__Group_2__3 : rule__Last__Group_2__3__Impl ;
    public final void rule__Last__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:893:1: ( rule__Last__Group_2__3__Impl )
            // InternalLTLFormula.g:894:2: rule__Last__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_2__3"


    // $ANTLR start "rule__Last__Group_2__3__Impl"
    // InternalLTLFormula.g:900:1: rule__Last__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Last__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:904:1: ( ( ')' ) )
            // InternalLTLFormula.g:905:1: ( ')' )
            {
            // InternalLTLFormula.g:905:1: ( ')' )
            // InternalLTLFormula.g:906:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__Last__Group_2__3__Impl"


    // $ANTLR start "rule__Last__Group_3__0"
    // InternalLTLFormula.g:916:1: rule__Last__Group_3__0 : rule__Last__Group_3__0__Impl rule__Last__Group_3__1 ;
    public final void rule__Last__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:920:1: ( rule__Last__Group_3__0__Impl rule__Last__Group_3__1 )
            // InternalLTLFormula.g:921:2: rule__Last__Group_3__0__Impl rule__Last__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_3__0"


    // $ANTLR start "rule__Last__Group_3__0__Impl"
    // InternalLTLFormula.g:928:1: rule__Last__Group_3__0__Impl : ( ( rule__Last__OperatorAssignment_3_0 ) ) ;
    public final void rule__Last__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:932:1: ( ( ( rule__Last__OperatorAssignment_3_0 ) ) )
            // InternalLTLFormula.g:933:1: ( ( rule__Last__OperatorAssignment_3_0 ) )
            {
            // InternalLTLFormula.g:933:1: ( ( rule__Last__OperatorAssignment_3_0 ) )
            // InternalLTLFormula.g:934:2: ( rule__Last__OperatorAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorAssignment_3_0()); 
            }
            // InternalLTLFormula.g:935:2: ( rule__Last__OperatorAssignment_3_0 )
            // InternalLTLFormula.g:935:3: rule__Last__OperatorAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__OperatorAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorAssignment_3_0()); 
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
    // $ANTLR end "rule__Last__Group_3__0__Impl"


    // $ANTLR start "rule__Last__Group_3__1"
    // InternalLTLFormula.g:943:1: rule__Last__Group_3__1 : rule__Last__Group_3__1__Impl rule__Last__Group_3__2 ;
    public final void rule__Last__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:947:1: ( rule__Last__Group_3__1__Impl rule__Last__Group_3__2 )
            // InternalLTLFormula.g:948:2: rule__Last__Group_3__1__Impl rule__Last__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_3__1"


    // $ANTLR start "rule__Last__Group_3__1__Impl"
    // InternalLTLFormula.g:955:1: rule__Last__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Last__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:959:1: ( ( '(' ) )
            // InternalLTLFormula.g:960:1: ( '(' )
            {
            // InternalLTLFormula.g:960:1: ( '(' )
            // InternalLTLFormula.g:961:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_3_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_3_1()); 
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
    // $ANTLR end "rule__Last__Group_3__1__Impl"


    // $ANTLR start "rule__Last__Group_3__2"
    // InternalLTLFormula.g:970:1: rule__Last__Group_3__2 : rule__Last__Group_3__2__Impl rule__Last__Group_3__3 ;
    public final void rule__Last__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:974:1: ( rule__Last__Group_3__2__Impl rule__Last__Group_3__3 )
            // InternalLTLFormula.g:975:2: rule__Last__Group_3__2__Impl rule__Last__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_3__2"


    // $ANTLR start "rule__Last__Group_3__2__Impl"
    // InternalLTLFormula.g:982:1: rule__Last__Group_3__2__Impl : ( ( rule__Last__FormulasAssignment_3_2 ) ) ;
    public final void rule__Last__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:986:1: ( ( ( rule__Last__FormulasAssignment_3_2 ) ) )
            // InternalLTLFormula.g:987:1: ( ( rule__Last__FormulasAssignment_3_2 ) )
            {
            // InternalLTLFormula.g:987:1: ( ( rule__Last__FormulasAssignment_3_2 ) )
            // InternalLTLFormula.g:988:2: ( rule__Last__FormulasAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_3_2()); 
            }
            // InternalLTLFormula.g:989:2: ( rule__Last__FormulasAssignment_3_2 )
            // InternalLTLFormula.g:989:3: rule__Last__FormulasAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_3_2()); 
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
    // $ANTLR end "rule__Last__Group_3__2__Impl"


    // $ANTLR start "rule__Last__Group_3__3"
    // InternalLTLFormula.g:997:1: rule__Last__Group_3__3 : rule__Last__Group_3__3__Impl ;
    public final void rule__Last__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1001:1: ( rule__Last__Group_3__3__Impl )
            // InternalLTLFormula.g:1002:2: rule__Last__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_3__3"


    // $ANTLR start "rule__Last__Group_3__3__Impl"
    // InternalLTLFormula.g:1008:1: rule__Last__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Last__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1012:1: ( ( ')' ) )
            // InternalLTLFormula.g:1013:1: ( ')' )
            {
            // InternalLTLFormula.g:1013:1: ( ')' )
            // InternalLTLFormula.g:1014:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_3_3()); 
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
    // $ANTLR end "rule__Last__Group_3__3__Impl"


    // $ANTLR start "rule__Last__Group_4__0"
    // InternalLTLFormula.g:1024:1: rule__Last__Group_4__0 : rule__Last__Group_4__0__Impl rule__Last__Group_4__1 ;
    public final void rule__Last__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1028:1: ( rule__Last__Group_4__0__Impl rule__Last__Group_4__1 )
            // InternalLTLFormula.g:1029:2: rule__Last__Group_4__0__Impl rule__Last__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__0"


    // $ANTLR start "rule__Last__Group_4__0__Impl"
    // InternalLTLFormula.g:1036:1: rule__Last__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Last__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1040:1: ( ( '(' ) )
            // InternalLTLFormula.g:1041:1: ( '(' )
            {
            // InternalLTLFormula.g:1041:1: ( '(' )
            // InternalLTLFormula.g:1042:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_0()); 
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
    // $ANTLR end "rule__Last__Group_4__0__Impl"


    // $ANTLR start "rule__Last__Group_4__1"
    // InternalLTLFormula.g:1051:1: rule__Last__Group_4__1 : rule__Last__Group_4__1__Impl rule__Last__Group_4__2 ;
    public final void rule__Last__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1055:1: ( rule__Last__Group_4__1__Impl rule__Last__Group_4__2 )
            // InternalLTLFormula.g:1056:2: rule__Last__Group_4__1__Impl rule__Last__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__1"


    // $ANTLR start "rule__Last__Group_4__1__Impl"
    // InternalLTLFormula.g:1063:1: rule__Last__Group_4__1__Impl : ( ( rule__Last__FormulasAssignment_4_1 ) ) ;
    public final void rule__Last__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1067:1: ( ( ( rule__Last__FormulasAssignment_4_1 ) ) )
            // InternalLTLFormula.g:1068:1: ( ( rule__Last__FormulasAssignment_4_1 ) )
            {
            // InternalLTLFormula.g:1068:1: ( ( rule__Last__FormulasAssignment_4_1 ) )
            // InternalLTLFormula.g:1069:2: ( rule__Last__FormulasAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_4_1()); 
            }
            // InternalLTLFormula.g:1070:2: ( rule__Last__FormulasAssignment_4_1 )
            // InternalLTLFormula.g:1070:3: rule__Last__FormulasAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_4_1()); 
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
    // $ANTLR end "rule__Last__Group_4__1__Impl"


    // $ANTLR start "rule__Last__Group_4__2"
    // InternalLTLFormula.g:1078:1: rule__Last__Group_4__2 : rule__Last__Group_4__2__Impl rule__Last__Group_4__3 ;
    public final void rule__Last__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1082:1: ( rule__Last__Group_4__2__Impl rule__Last__Group_4__3 )
            // InternalLTLFormula.g:1083:2: rule__Last__Group_4__2__Impl rule__Last__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Last__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__2"


    // $ANTLR start "rule__Last__Group_4__2__Impl"
    // InternalLTLFormula.g:1090:1: rule__Last__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Last__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1094:1: ( ( ')' ) )
            // InternalLTLFormula.g:1095:1: ( ')' )
            {
            // InternalLTLFormula.g:1095:1: ( ')' )
            // InternalLTLFormula.g:1096:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_2()); 
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
    // $ANTLR end "rule__Last__Group_4__2__Impl"


    // $ANTLR start "rule__Last__Group_4__3"
    // InternalLTLFormula.g:1105:1: rule__Last__Group_4__3 : rule__Last__Group_4__3__Impl rule__Last__Group_4__4 ;
    public final void rule__Last__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1109:1: ( rule__Last__Group_4__3__Impl rule__Last__Group_4__4 )
            // InternalLTLFormula.g:1110:2: rule__Last__Group_4__3__Impl rule__Last__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__3"


    // $ANTLR start "rule__Last__Group_4__3__Impl"
    // InternalLTLFormula.g:1117:1: rule__Last__Group_4__3__Impl : ( ( rule__Last__OperatorAssignment_4_3 ) ) ;
    public final void rule__Last__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1121:1: ( ( ( rule__Last__OperatorAssignment_4_3 ) ) )
            // InternalLTLFormula.g:1122:1: ( ( rule__Last__OperatorAssignment_4_3 ) )
            {
            // InternalLTLFormula.g:1122:1: ( ( rule__Last__OperatorAssignment_4_3 ) )
            // InternalLTLFormula.g:1123:2: ( rule__Last__OperatorAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorAssignment_4_3()); 
            }
            // InternalLTLFormula.g:1124:2: ( rule__Last__OperatorAssignment_4_3 )
            // InternalLTLFormula.g:1124:3: rule__Last__OperatorAssignment_4_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__OperatorAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorAssignment_4_3()); 
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
    // $ANTLR end "rule__Last__Group_4__3__Impl"


    // $ANTLR start "rule__Last__Group_4__4"
    // InternalLTLFormula.g:1132:1: rule__Last__Group_4__4 : rule__Last__Group_4__4__Impl rule__Last__Group_4__5 ;
    public final void rule__Last__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1136:1: ( rule__Last__Group_4__4__Impl rule__Last__Group_4__5 )
            // InternalLTLFormula.g:1137:2: rule__Last__Group_4__4__Impl rule__Last__Group_4__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__4"


    // $ANTLR start "rule__Last__Group_4__4__Impl"
    // InternalLTLFormula.g:1144:1: rule__Last__Group_4__4__Impl : ( '(' ) ;
    public final void rule__Last__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1148:1: ( ( '(' ) )
            // InternalLTLFormula.g:1149:1: ( '(' )
            {
            // InternalLTLFormula.g:1149:1: ( '(' )
            // InternalLTLFormula.g:1150:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_4()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_4()); 
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
    // $ANTLR end "rule__Last__Group_4__4__Impl"


    // $ANTLR start "rule__Last__Group_4__5"
    // InternalLTLFormula.g:1159:1: rule__Last__Group_4__5 : rule__Last__Group_4__5__Impl rule__Last__Group_4__6 ;
    public final void rule__Last__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1163:1: ( rule__Last__Group_4__5__Impl rule__Last__Group_4__6 )
            // InternalLTLFormula.g:1164:2: rule__Last__Group_4__5__Impl rule__Last__Group_4__6
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__5"


    // $ANTLR start "rule__Last__Group_4__5__Impl"
    // InternalLTLFormula.g:1171:1: rule__Last__Group_4__5__Impl : ( ( rule__Last__FormulasAssignment_4_5 ) ) ;
    public final void rule__Last__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1175:1: ( ( ( rule__Last__FormulasAssignment_4_5 ) ) )
            // InternalLTLFormula.g:1176:1: ( ( rule__Last__FormulasAssignment_4_5 ) )
            {
            // InternalLTLFormula.g:1176:1: ( ( rule__Last__FormulasAssignment_4_5 ) )
            // InternalLTLFormula.g:1177:2: ( rule__Last__FormulasAssignment_4_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_4_5()); 
            }
            // InternalLTLFormula.g:1178:2: ( rule__Last__FormulasAssignment_4_5 )
            // InternalLTLFormula.g:1178:3: rule__Last__FormulasAssignment_4_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_4_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_4_5()); 
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
    // $ANTLR end "rule__Last__Group_4__5__Impl"


    // $ANTLR start "rule__Last__Group_4__6"
    // InternalLTLFormula.g:1186:1: rule__Last__Group_4__6 : rule__Last__Group_4__6__Impl rule__Last__Group_4__7 ;
    public final void rule__Last__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1190:1: ( rule__Last__Group_4__6__Impl rule__Last__Group_4__7 )
            // InternalLTLFormula.g:1191:2: rule__Last__Group_4__6__Impl rule__Last__Group_4__7
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Last__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__6"


    // $ANTLR start "rule__Last__Group_4__6__Impl"
    // InternalLTLFormula.g:1198:1: rule__Last__Group_4__6__Impl : ( ')' ) ;
    public final void rule__Last__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1202:1: ( ( ')' ) )
            // InternalLTLFormula.g:1203:1: ( ')' )
            {
            // InternalLTLFormula.g:1203:1: ( ')' )
            // InternalLTLFormula.g:1204:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_6()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_6()); 
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
    // $ANTLR end "rule__Last__Group_4__6__Impl"


    // $ANTLR start "rule__Last__Group_4__7"
    // InternalLTLFormula.g:1213:1: rule__Last__Group_4__7 : rule__Last__Group_4__7__Impl rule__Last__Group_4__8 ;
    public final void rule__Last__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1217:1: ( rule__Last__Group_4__7__Impl rule__Last__Group_4__8 )
            // InternalLTLFormula.g:1218:2: rule__Last__Group_4__7__Impl rule__Last__Group_4__8
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Last__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__7"


    // $ANTLR start "rule__Last__Group_4__7__Impl"
    // InternalLTLFormula.g:1225:1: rule__Last__Group_4__7__Impl : ( '(' ) ;
    public final void rule__Last__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1229:1: ( ( '(' ) )
            // InternalLTLFormula.g:1230:1: ( '(' )
            {
            // InternalLTLFormula.g:1230:1: ( '(' )
            // InternalLTLFormula.g:1231:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_7()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_7()); 
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
    // $ANTLR end "rule__Last__Group_4__7__Impl"


    // $ANTLR start "rule__Last__Group_4__8"
    // InternalLTLFormula.g:1240:1: rule__Last__Group_4__8 : rule__Last__Group_4__8__Impl rule__Last__Group_4__9 ;
    public final void rule__Last__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1244:1: ( rule__Last__Group_4__8__Impl rule__Last__Group_4__9 )
            // InternalLTLFormula.g:1245:2: rule__Last__Group_4__8__Impl rule__Last__Group_4__9
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Last__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__8"


    // $ANTLR start "rule__Last__Group_4__8__Impl"
    // InternalLTLFormula.g:1252:1: rule__Last__Group_4__8__Impl : ( ( rule__Last__FormulasAssignment_4_8 ) ) ;
    public final void rule__Last__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1256:1: ( ( ( rule__Last__FormulasAssignment_4_8 ) ) )
            // InternalLTLFormula.g:1257:1: ( ( rule__Last__FormulasAssignment_4_8 ) )
            {
            // InternalLTLFormula.g:1257:1: ( ( rule__Last__FormulasAssignment_4_8 ) )
            // InternalLTLFormula.g:1258:2: ( rule__Last__FormulasAssignment_4_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasAssignment_4_8()); 
            }
            // InternalLTLFormula.g:1259:2: ( rule__Last__FormulasAssignment_4_8 )
            // InternalLTLFormula.g:1259:3: rule__Last__FormulasAssignment_4_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__FormulasAssignment_4_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasAssignment_4_8()); 
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
    // $ANTLR end "rule__Last__Group_4__8__Impl"


    // $ANTLR start "rule__Last__Group_4__9"
    // InternalLTLFormula.g:1267:1: rule__Last__Group_4__9 : rule__Last__Group_4__9__Impl ;
    public final void rule__Last__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1271:1: ( rule__Last__Group_4__9__Impl )
            // InternalLTLFormula.g:1272:2: rule__Last__Group_4__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Last__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Last__Group_4__9"


    // $ANTLR start "rule__Last__Group_4__9__Impl"
    // InternalLTLFormula.g:1278:1: rule__Last__Group_4__9__Impl : ( ')' ) ;
    public final void rule__Last__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1282:1: ( ( ')' ) )
            // InternalLTLFormula.g:1283:1: ( ')' )
            {
            // InternalLTLFormula.g:1283:1: ( ')' )
            // InternalLTLFormula.g:1284:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_9()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getRightParenthesisKeyword_4_9()); 
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
    // $ANTLR end "rule__Last__Group_4__9__Impl"


    // $ANTLR start "rule__Variable__Group_0__0"
    // InternalLTLFormula.g:1294:1: rule__Variable__Group_0__0 : rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 ;
    public final void rule__Variable__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1298:1: ( rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1 )
            // InternalLTLFormula.g:1299:2: rule__Variable__Group_0__0__Impl rule__Variable__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Variable__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0__0"


    // $ANTLR start "rule__Variable__Group_0__0__Impl"
    // InternalLTLFormula.g:1306:1: rule__Variable__Group_0__0__Impl : ( ( rule__Variable__NameAssignment_0_0 ) ) ;
    public final void rule__Variable__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1310:1: ( ( ( rule__Variable__NameAssignment_0_0 ) ) )
            // InternalLTLFormula.g:1311:1: ( ( rule__Variable__NameAssignment_0_0 ) )
            {
            // InternalLTLFormula.g:1311:1: ( ( rule__Variable__NameAssignment_0_0 ) )
            // InternalLTLFormula.g:1312:2: ( rule__Variable__NameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0_0()); 
            }
            // InternalLTLFormula.g:1313:2: ( rule__Variable__NameAssignment_0_0 )
            // InternalLTLFormula.g:1313:3: rule__Variable__NameAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_0_0()); 
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
    // $ANTLR end "rule__Variable__Group_0__0__Impl"


    // $ANTLR start "rule__Variable__Group_0__1"
    // InternalLTLFormula.g:1321:1: rule__Variable__Group_0__1 : rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 ;
    public final void rule__Variable__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1325:1: ( rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2 )
            // InternalLTLFormula.g:1326:2: rule__Variable__Group_0__1__Impl rule__Variable__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0__1"


    // $ANTLR start "rule__Variable__Group_0__1__Impl"
    // InternalLTLFormula.g:1333:1: rule__Variable__Group_0__1__Impl : ( ( rule__Variable__OperatorAssignment_0_1 ) ) ;
    public final void rule__Variable__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1337:1: ( ( ( rule__Variable__OperatorAssignment_0_1 ) ) )
            // InternalLTLFormula.g:1338:1: ( ( rule__Variable__OperatorAssignment_0_1 ) )
            {
            // InternalLTLFormula.g:1338:1: ( ( rule__Variable__OperatorAssignment_0_1 ) )
            // InternalLTLFormula.g:1339:2: ( rule__Variable__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_0_1()); 
            }
            // InternalLTLFormula.g:1340:2: ( rule__Variable__OperatorAssignment_0_1 )
            // InternalLTLFormula.g:1340:3: rule__Variable__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_0_1()); 
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
    // $ANTLR end "rule__Variable__Group_0__1__Impl"


    // $ANTLR start "rule__Variable__Group_0__2"
    // InternalLTLFormula.g:1348:1: rule__Variable__Group_0__2 : rule__Variable__Group_0__2__Impl ;
    public final void rule__Variable__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1352:1: ( rule__Variable__Group_0__2__Impl )
            // InternalLTLFormula.g:1353:2: rule__Variable__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_0__2"


    // $ANTLR start "rule__Variable__Group_0__2__Impl"
    // InternalLTLFormula.g:1359:1: rule__Variable__Group_0__2__Impl : ( ( rule__Variable__ValueAssignment_0_2 ) ) ;
    public final void rule__Variable__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1363:1: ( ( ( rule__Variable__ValueAssignment_0_2 ) ) )
            // InternalLTLFormula.g:1364:1: ( ( rule__Variable__ValueAssignment_0_2 ) )
            {
            // InternalLTLFormula.g:1364:1: ( ( rule__Variable__ValueAssignment_0_2 ) )
            // InternalLTLFormula.g:1365:2: ( rule__Variable__ValueAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_0_2()); 
            }
            // InternalLTLFormula.g:1366:2: ( rule__Variable__ValueAssignment_0_2 )
            // InternalLTLFormula.g:1366:3: rule__Variable__ValueAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_0_2()); 
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
    // $ANTLR end "rule__Variable__Group_0__2__Impl"


    // $ANTLR start "rule__Variable__Group_1__0"
    // InternalLTLFormula.g:1375:1: rule__Variable__Group_1__0 : rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 ;
    public final void rule__Variable__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1379:1: ( rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1 )
            // InternalLTLFormula.g:1380:2: rule__Variable__Group_1__0__Impl rule__Variable__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Variable__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__0"


    // $ANTLR start "rule__Variable__Group_1__0__Impl"
    // InternalLTLFormula.g:1387:1: rule__Variable__Group_1__0__Impl : ( ( rule__Variable__NameAssignment_1_0 ) ) ;
    public final void rule__Variable__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1391:1: ( ( ( rule__Variable__NameAssignment_1_0 ) ) )
            // InternalLTLFormula.g:1392:1: ( ( rule__Variable__NameAssignment_1_0 ) )
            {
            // InternalLTLFormula.g:1392:1: ( ( rule__Variable__NameAssignment_1_0 ) )
            // InternalLTLFormula.g:1393:2: ( rule__Variable__NameAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 
            }
            // InternalLTLFormula.g:1394:2: ( rule__Variable__NameAssignment_1_0 )
            // InternalLTLFormula.g:1394:3: rule__Variable__NameAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_1_0()); 
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
    // $ANTLR end "rule__Variable__Group_1__0__Impl"


    // $ANTLR start "rule__Variable__Group_1__1"
    // InternalLTLFormula.g:1402:1: rule__Variable__Group_1__1 : rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2 ;
    public final void rule__Variable__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1406:1: ( rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2 )
            // InternalLTLFormula.g:1407:2: rule__Variable__Group_1__1__Impl rule__Variable__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__1"


    // $ANTLR start "rule__Variable__Group_1__1__Impl"
    // InternalLTLFormula.g:1414:1: rule__Variable__Group_1__1__Impl : ( ( rule__Variable__OperatorAssignment_1_1 ) ) ;
    public final void rule__Variable__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1418:1: ( ( ( rule__Variable__OperatorAssignment_1_1 ) ) )
            // InternalLTLFormula.g:1419:1: ( ( rule__Variable__OperatorAssignment_1_1 ) )
            {
            // InternalLTLFormula.g:1419:1: ( ( rule__Variable__OperatorAssignment_1_1 ) )
            // InternalLTLFormula.g:1420:2: ( rule__Variable__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_1_1()); 
            }
            // InternalLTLFormula.g:1421:2: ( rule__Variable__OperatorAssignment_1_1 )
            // InternalLTLFormula.g:1421:3: rule__Variable__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_1_1()); 
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
    // $ANTLR end "rule__Variable__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group_1__2"
    // InternalLTLFormula.g:1429:1: rule__Variable__Group_1__2 : rule__Variable__Group_1__2__Impl ;
    public final void rule__Variable__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1433:1: ( rule__Variable__Group_1__2__Impl )
            // InternalLTLFormula.g:1434:2: rule__Variable__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_1__2"


    // $ANTLR start "rule__Variable__Group_1__2__Impl"
    // InternalLTLFormula.g:1440:1: rule__Variable__Group_1__2__Impl : ( ( rule__Variable__ValueAssignment_1_2 ) ) ;
    public final void rule__Variable__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1444:1: ( ( ( rule__Variable__ValueAssignment_1_2 ) ) )
            // InternalLTLFormula.g:1445:1: ( ( rule__Variable__ValueAssignment_1_2 ) )
            {
            // InternalLTLFormula.g:1445:1: ( ( rule__Variable__ValueAssignment_1_2 ) )
            // InternalLTLFormula.g:1446:2: ( rule__Variable__ValueAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_1_2()); 
            }
            // InternalLTLFormula.g:1447:2: ( rule__Variable__ValueAssignment_1_2 )
            // InternalLTLFormula.g:1447:3: rule__Variable__ValueAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_1_2()); 
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
    // $ANTLR end "rule__Variable__Group_1__2__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // InternalLTLFormula.g:1456:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1460:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // InternalLTLFormula.g:1461:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // InternalLTLFormula.g:1468:1: rule__Variable__Group_2__0__Impl : ( ( rule__Variable__NameAssignment_2_0 ) ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1472:1: ( ( ( rule__Variable__NameAssignment_2_0 ) ) )
            // InternalLTLFormula.g:1473:1: ( ( rule__Variable__NameAssignment_2_0 ) )
            {
            // InternalLTLFormula.g:1473:1: ( ( rule__Variable__NameAssignment_2_0 ) )
            // InternalLTLFormula.g:1474:2: ( rule__Variable__NameAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 
            }
            // InternalLTLFormula.g:1475:2: ( rule__Variable__NameAssignment_2_0 )
            // InternalLTLFormula.g:1475:3: rule__Variable__NameAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_2_0()); 
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
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // InternalLTLFormula.g:1483:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1487:1: ( rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 )
            // InternalLTLFormula.g:1488:2: rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // InternalLTLFormula.g:1495:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__OperatorAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1499:1: ( ( ( rule__Variable__OperatorAssignment_2_1 ) ) )
            // InternalLTLFormula.g:1500:1: ( ( rule__Variable__OperatorAssignment_2_1 ) )
            {
            // InternalLTLFormula.g:1500:1: ( ( rule__Variable__OperatorAssignment_2_1 ) )
            // InternalLTLFormula.g:1501:2: ( rule__Variable__OperatorAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_2_1()); 
            }
            // InternalLTLFormula.g:1502:2: ( rule__Variable__OperatorAssignment_2_1 )
            // InternalLTLFormula.g:1502:3: rule__Variable__OperatorAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_2_1()); 
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
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__Group_2__2"
    // InternalLTLFormula.g:1510:1: rule__Variable__Group_2__2 : rule__Variable__Group_2__2__Impl ;
    public final void rule__Variable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1514:1: ( rule__Variable__Group_2__2__Impl )
            // InternalLTLFormula.g:1515:2: rule__Variable__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__2"


    // $ANTLR start "rule__Variable__Group_2__2__Impl"
    // InternalLTLFormula.g:1521:1: rule__Variable__Group_2__2__Impl : ( ( rule__Variable__ValueAssignment_2_2 ) ) ;
    public final void rule__Variable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1525:1: ( ( ( rule__Variable__ValueAssignment_2_2 ) ) )
            // InternalLTLFormula.g:1526:1: ( ( rule__Variable__ValueAssignment_2_2 ) )
            {
            // InternalLTLFormula.g:1526:1: ( ( rule__Variable__ValueAssignment_2_2 ) )
            // InternalLTLFormula.g:1527:2: ( rule__Variable__ValueAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_2_2()); 
            }
            // InternalLTLFormula.g:1528:2: ( rule__Variable__ValueAssignment_2_2 )
            // InternalLTLFormula.g:1528:3: rule__Variable__ValueAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_2_2()); 
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
    // $ANTLR end "rule__Variable__Group_2__2__Impl"


    // $ANTLR start "rule__Variable__Group_3__0"
    // InternalLTLFormula.g:1537:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1541:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalLTLFormula.g:1542:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Variable__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0"


    // $ANTLR start "rule__Variable__Group_3__0__Impl"
    // InternalLTLFormula.g:1549:1: rule__Variable__Group_3__0__Impl : ( ( rule__Variable__NameAssignment_3_0 ) ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1553:1: ( ( ( rule__Variable__NameAssignment_3_0 ) ) )
            // InternalLTLFormula.g:1554:1: ( ( rule__Variable__NameAssignment_3_0 ) )
            {
            // InternalLTLFormula.g:1554:1: ( ( rule__Variable__NameAssignment_3_0 ) )
            // InternalLTLFormula.g:1555:2: ( rule__Variable__NameAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 
            }
            // InternalLTLFormula.g:1556:2: ( rule__Variable__NameAssignment_3_0 )
            // InternalLTLFormula.g:1556:3: rule__Variable__NameAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_3_0()); 
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
    // $ANTLR end "rule__Variable__Group_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_3__1"
    // InternalLTLFormula.g:1564:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2 ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1568:1: ( rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2 )
            // InternalLTLFormula.g:1569:2: rule__Variable__Group_3__1__Impl rule__Variable__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1"


    // $ANTLR start "rule__Variable__Group_3__1__Impl"
    // InternalLTLFormula.g:1576:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__OperatorAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1580:1: ( ( ( rule__Variable__OperatorAssignment_3_1 ) ) )
            // InternalLTLFormula.g:1581:1: ( ( rule__Variable__OperatorAssignment_3_1 ) )
            {
            // InternalLTLFormula.g:1581:1: ( ( rule__Variable__OperatorAssignment_3_1 ) )
            // InternalLTLFormula.g:1582:2: ( rule__Variable__OperatorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_3_1()); 
            }
            // InternalLTLFormula.g:1583:2: ( rule__Variable__OperatorAssignment_3_1 )
            // InternalLTLFormula.g:1583:3: rule__Variable__OperatorAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_3_1()); 
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
    // $ANTLR end "rule__Variable__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group_3__2"
    // InternalLTLFormula.g:1591:1: rule__Variable__Group_3__2 : rule__Variable__Group_3__2__Impl ;
    public final void rule__Variable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1595:1: ( rule__Variable__Group_3__2__Impl )
            // InternalLTLFormula.g:1596:2: rule__Variable__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__2"


    // $ANTLR start "rule__Variable__Group_3__2__Impl"
    // InternalLTLFormula.g:1602:1: rule__Variable__Group_3__2__Impl : ( ( rule__Variable__ValueAssignment_3_2 ) ) ;
    public final void rule__Variable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1606:1: ( ( ( rule__Variable__ValueAssignment_3_2 ) ) )
            // InternalLTLFormula.g:1607:1: ( ( rule__Variable__ValueAssignment_3_2 ) )
            {
            // InternalLTLFormula.g:1607:1: ( ( rule__Variable__ValueAssignment_3_2 ) )
            // InternalLTLFormula.g:1608:2: ( rule__Variable__ValueAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_3_2()); 
            }
            // InternalLTLFormula.g:1609:2: ( rule__Variable__ValueAssignment_3_2 )
            // InternalLTLFormula.g:1609:3: rule__Variable__ValueAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_3_2()); 
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
    // $ANTLR end "rule__Variable__Group_3__2__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalLTLFormula.g:1618:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1622:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalLTLFormula.g:1623:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalLTLFormula.g:1630:1: rule__Variable__Group_4__0__Impl : ( ( rule__Variable__NameAssignment_4_0 ) ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1634:1: ( ( ( rule__Variable__NameAssignment_4_0 ) ) )
            // InternalLTLFormula.g:1635:1: ( ( rule__Variable__NameAssignment_4_0 ) )
            {
            // InternalLTLFormula.g:1635:1: ( ( rule__Variable__NameAssignment_4_0 ) )
            // InternalLTLFormula.g:1636:2: ( rule__Variable__NameAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 
            }
            // InternalLTLFormula.g:1637:2: ( rule__Variable__NameAssignment_4_0 )
            // InternalLTLFormula.g:1637:3: rule__Variable__NameAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_4_0()); 
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
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalLTLFormula.g:1645:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2 ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1649:1: ( rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2 )
            // InternalLTLFormula.g:1650:2: rule__Variable__Group_4__1__Impl rule__Variable__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalLTLFormula.g:1657:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__OperatorAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1661:1: ( ( ( rule__Variable__OperatorAssignment_4_1 ) ) )
            // InternalLTLFormula.g:1662:1: ( ( rule__Variable__OperatorAssignment_4_1 ) )
            {
            // InternalLTLFormula.g:1662:1: ( ( rule__Variable__OperatorAssignment_4_1 ) )
            // InternalLTLFormula.g:1663:2: ( rule__Variable__OperatorAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_4_1()); 
            }
            // InternalLTLFormula.g:1664:2: ( rule__Variable__OperatorAssignment_4_1 )
            // InternalLTLFormula.g:1664:3: rule__Variable__OperatorAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_4_1()); 
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
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__Variable__Group_4__2"
    // InternalLTLFormula.g:1672:1: rule__Variable__Group_4__2 : rule__Variable__Group_4__2__Impl ;
    public final void rule__Variable__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1676:1: ( rule__Variable__Group_4__2__Impl )
            // InternalLTLFormula.g:1677:2: rule__Variable__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__2"


    // $ANTLR start "rule__Variable__Group_4__2__Impl"
    // InternalLTLFormula.g:1683:1: rule__Variable__Group_4__2__Impl : ( ( rule__Variable__ValueAssignment_4_2 ) ) ;
    public final void rule__Variable__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1687:1: ( ( ( rule__Variable__ValueAssignment_4_2 ) ) )
            // InternalLTLFormula.g:1688:1: ( ( rule__Variable__ValueAssignment_4_2 ) )
            {
            // InternalLTLFormula.g:1688:1: ( ( rule__Variable__ValueAssignment_4_2 ) )
            // InternalLTLFormula.g:1689:2: ( rule__Variable__ValueAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_4_2()); 
            }
            // InternalLTLFormula.g:1690:2: ( rule__Variable__ValueAssignment_4_2 )
            // InternalLTLFormula.g:1690:3: rule__Variable__ValueAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_4_2()); 
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
    // $ANTLR end "rule__Variable__Group_4__2__Impl"


    // $ANTLR start "rule__Variable__Group_5__0"
    // InternalLTLFormula.g:1699:1: rule__Variable__Group_5__0 : rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 ;
    public final void rule__Variable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1703:1: ( rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1 )
            // InternalLTLFormula.g:1704:2: rule__Variable__Group_5__0__Impl rule__Variable__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Variable__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_5__0"


    // $ANTLR start "rule__Variable__Group_5__0__Impl"
    // InternalLTLFormula.g:1711:1: rule__Variable__Group_5__0__Impl : ( ( rule__Variable__NameAssignment_5_0 ) ) ;
    public final void rule__Variable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1715:1: ( ( ( rule__Variable__NameAssignment_5_0 ) ) )
            // InternalLTLFormula.g:1716:1: ( ( rule__Variable__NameAssignment_5_0 ) )
            {
            // InternalLTLFormula.g:1716:1: ( ( rule__Variable__NameAssignment_5_0 ) )
            // InternalLTLFormula.g:1717:2: ( rule__Variable__NameAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 
            }
            // InternalLTLFormula.g:1718:2: ( rule__Variable__NameAssignment_5_0 )
            // InternalLTLFormula.g:1718:3: rule__Variable__NameAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__NameAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_5_0()); 
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
    // $ANTLR end "rule__Variable__Group_5__0__Impl"


    // $ANTLR start "rule__Variable__Group_5__1"
    // InternalLTLFormula.g:1726:1: rule__Variable__Group_5__1 : rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2 ;
    public final void rule__Variable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1730:1: ( rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2 )
            // InternalLTLFormula.g:1731:2: rule__Variable__Group_5__1__Impl rule__Variable__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Variable__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_5__1"


    // $ANTLR start "rule__Variable__Group_5__1__Impl"
    // InternalLTLFormula.g:1738:1: rule__Variable__Group_5__1__Impl : ( ( rule__Variable__OperatorAssignment_5_1 ) ) ;
    public final void rule__Variable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1742:1: ( ( ( rule__Variable__OperatorAssignment_5_1 ) ) )
            // InternalLTLFormula.g:1743:1: ( ( rule__Variable__OperatorAssignment_5_1 ) )
            {
            // InternalLTLFormula.g:1743:1: ( ( rule__Variable__OperatorAssignment_5_1 ) )
            // InternalLTLFormula.g:1744:2: ( rule__Variable__OperatorAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorAssignment_5_1()); 
            }
            // InternalLTLFormula.g:1745:2: ( rule__Variable__OperatorAssignment_5_1 )
            // InternalLTLFormula.g:1745:3: rule__Variable__OperatorAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__OperatorAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorAssignment_5_1()); 
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
    // $ANTLR end "rule__Variable__Group_5__1__Impl"


    // $ANTLR start "rule__Variable__Group_5__2"
    // InternalLTLFormula.g:1753:1: rule__Variable__Group_5__2 : rule__Variable__Group_5__2__Impl ;
    public final void rule__Variable__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1757:1: ( rule__Variable__Group_5__2__Impl )
            // InternalLTLFormula.g:1758:2: rule__Variable__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_5__2"


    // $ANTLR start "rule__Variable__Group_5__2__Impl"
    // InternalLTLFormula.g:1764:1: rule__Variable__Group_5__2__Impl : ( ( rule__Variable__ValueAssignment_5_2 ) ) ;
    public final void rule__Variable__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1768:1: ( ( ( rule__Variable__ValueAssignment_5_2 ) ) )
            // InternalLTLFormula.g:1769:1: ( ( rule__Variable__ValueAssignment_5_2 ) )
            {
            // InternalLTLFormula.g:1769:1: ( ( rule__Variable__ValueAssignment_5_2 ) )
            // InternalLTLFormula.g:1770:2: ( rule__Variable__ValueAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueAssignment_5_2()); 
            }
            // InternalLTLFormula.g:1771:2: ( rule__Variable__ValueAssignment_5_2 )
            // InternalLTLFormula.g:1771:3: rule__Variable__ValueAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__ValueAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueAssignment_5_2()); 
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
    // $ANTLR end "rule__Variable__Group_5__2__Impl"


    // $ANTLR start "rule__LTLFormula__FormulasAssignment_0"
    // InternalLTLFormula.g:1780:1: rule__LTLFormula__FormulasAssignment_0 : ( ruleOr ) ;
    public final void rule__LTLFormula__FormulasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1784:1: ( ( ruleOr ) )
            // InternalLTLFormula.g:1785:2: ( ruleOr )
            {
            // InternalLTLFormula.g:1785:2: ( ruleOr )
            // InternalLTLFormula.g:1786:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__LTLFormula__FormulasAssignment_0"


    // $ANTLR start "rule__LTLFormula__FormulasAssignment_1_1"
    // InternalLTLFormula.g:1795:1: rule__LTLFormula__FormulasAssignment_1_1 : ( ruleOr ) ;
    public final void rule__LTLFormula__FormulasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1799:1: ( ( ruleOr ) )
            // InternalLTLFormula.g:1800:2: ( ruleOr )
            {
            // InternalLTLFormula.g:1800:2: ( ruleOr )
            // InternalLTLFormula.g:1801:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__LTLFormula__FormulasAssignment_1_1"


    // $ANTLR start "rule__And__FormulasAssignment_0"
    // InternalLTLFormula.g:1810:1: rule__And__FormulasAssignment_0 : ( ruleLast ) ;
    public final void rule__And__FormulasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1814:1: ( ( ruleLast ) )
            // InternalLTLFormula.g:1815:2: ( ruleLast )
            {
            // InternalLTLFormula.g:1815:2: ( ruleLast )
            // InternalLTLFormula.g:1816:3: ruleLast
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__And__FormulasAssignment_0"


    // $ANTLR start "rule__And__FormulasAssignment_1_1"
    // InternalLTLFormula.g:1825:1: rule__And__FormulasAssignment_1_1 : ( ruleLast ) ;
    public final void rule__And__FormulasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1829:1: ( ( ruleLast ) )
            // InternalLTLFormula.g:1830:2: ( ruleLast )
            {
            // InternalLTLFormula.g:1830:2: ( ruleLast )
            // InternalLTLFormula.g:1831:3: ruleLast
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__And__FormulasAssignment_1_1"


    // $ANTLR start "rule__Or__FormulasAssignment_0"
    // InternalLTLFormula.g:1840:1: rule__Or__FormulasAssignment_0 : ( ruleAnd ) ;
    public final void rule__Or__FormulasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1844:1: ( ( ruleAnd ) )
            // InternalLTLFormula.g:1845:2: ( ruleAnd )
            {
            // InternalLTLFormula.g:1845:2: ( ruleAnd )
            // InternalLTLFormula.g:1846:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Or__FormulasAssignment_0"


    // $ANTLR start "rule__Or__FormulasAssignment_1_1"
    // InternalLTLFormula.g:1855:1: rule__Or__FormulasAssignment_1_1 : ( ruleAnd ) ;
    public final void rule__Or__FormulasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1859:1: ( ( ruleAnd ) )
            // InternalLTLFormula.g:1860:2: ( ruleAnd )
            {
            // InternalLTLFormula.g:1860:2: ( ruleAnd )
            // InternalLTLFormula.g:1861:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Or__FormulasAssignment_1_1"


    // $ANTLR start "rule__Last__OperatorAssignment_0_0"
    // InternalLTLFormula.g:1870:1: rule__Last__OperatorAssignment_0_0 : ( ( 'G' ) ) ;
    public final void rule__Last__OperatorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1874:1: ( ( ( 'G' ) ) )
            // InternalLTLFormula.g:1875:2: ( ( 'G' ) )
            {
            // InternalLTLFormula.g:1875:2: ( ( 'G' ) )
            // InternalLTLFormula.g:1876:3: ( 'G' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorGKeyword_0_0_0()); 
            }
            // InternalLTLFormula.g:1877:3: ( 'G' )
            // InternalLTLFormula.g:1878:4: 'G'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorGKeyword_0_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorGKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorGKeyword_0_0_0()); 
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
    // $ANTLR end "rule__Last__OperatorAssignment_0_0"


    // $ANTLR start "rule__Last__FormulasAssignment_0_2"
    // InternalLTLFormula.g:1889:1: rule__Last__FormulasAssignment_0_2 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1893:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:1894:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:1894:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:1895:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_0_2"


    // $ANTLR start "rule__Last__OperatorAssignment_1_0"
    // InternalLTLFormula.g:1904:1: rule__Last__OperatorAssignment_1_0 : ( ( 'F' ) ) ;
    public final void rule__Last__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1908:1: ( ( ( 'F' ) ) )
            // InternalLTLFormula.g:1909:2: ( ( 'F' ) )
            {
            // InternalLTLFormula.g:1909:2: ( ( 'F' ) )
            // InternalLTLFormula.g:1910:3: ( 'F' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorFKeyword_1_0_0()); 
            }
            // InternalLTLFormula.g:1911:3: ( 'F' )
            // InternalLTLFormula.g:1912:4: 'F'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorFKeyword_1_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorFKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorFKeyword_1_0_0()); 
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
    // $ANTLR end "rule__Last__OperatorAssignment_1_0"


    // $ANTLR start "rule__Last__FormulasAssignment_1_2"
    // InternalLTLFormula.g:1923:1: rule__Last__FormulasAssignment_1_2 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1927:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:1928:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:1928:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:1929:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_1_2"


    // $ANTLR start "rule__Last__OperatorAssignment_2_0"
    // InternalLTLFormula.g:1938:1: rule__Last__OperatorAssignment_2_0 : ( ( 'X' ) ) ;
    public final void rule__Last__OperatorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1942:1: ( ( ( 'X' ) ) )
            // InternalLTLFormula.g:1943:2: ( ( 'X' ) )
            {
            // InternalLTLFormula.g:1943:2: ( ( 'X' ) )
            // InternalLTLFormula.g:1944:3: ( 'X' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorXKeyword_2_0_0()); 
            }
            // InternalLTLFormula.g:1945:3: ( 'X' )
            // InternalLTLFormula.g:1946:4: 'X'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorXKeyword_2_0_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorXKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorXKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Last__OperatorAssignment_2_0"


    // $ANTLR start "rule__Last__FormulasAssignment_2_2"
    // InternalLTLFormula.g:1957:1: rule__Last__FormulasAssignment_2_2 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1961:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:1962:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:1962:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:1963:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_2_2"


    // $ANTLR start "rule__Last__OperatorAssignment_3_0"
    // InternalLTLFormula.g:1972:1: rule__Last__OperatorAssignment_3_0 : ( ( '!' ) ) ;
    public final void rule__Last__OperatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1976:1: ( ( ( '!' ) ) )
            // InternalLTLFormula.g:1977:2: ( ( '!' ) )
            {
            // InternalLTLFormula.g:1977:2: ( ( '!' ) )
            // InternalLTLFormula.g:1978:3: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorExclamationMarkKeyword_3_0_0()); 
            }
            // InternalLTLFormula.g:1979:3: ( '!' )
            // InternalLTLFormula.g:1980:4: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorExclamationMarkKeyword_3_0_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorExclamationMarkKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorExclamationMarkKeyword_3_0_0()); 
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
    // $ANTLR end "rule__Last__OperatorAssignment_3_0"


    // $ANTLR start "rule__Last__FormulasAssignment_3_2"
    // InternalLTLFormula.g:1991:1: rule__Last__FormulasAssignment_3_2 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:1995:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:1996:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:1996:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:1997:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_3_2"


    // $ANTLR start "rule__Last__FormulasAssignment_4_1"
    // InternalLTLFormula.g:2006:1: rule__Last__FormulasAssignment_4_1 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2010:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:2011:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:2011:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:2012:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_4_1"


    // $ANTLR start "rule__Last__OperatorAssignment_4_3"
    // InternalLTLFormula.g:2021:1: rule__Last__OperatorAssignment_4_3 : ( ( 'U' ) ) ;
    public final void rule__Last__OperatorAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2025:1: ( ( ( 'U' ) ) )
            // InternalLTLFormula.g:2026:2: ( ( 'U' ) )
            {
            // InternalLTLFormula.g:2026:2: ( ( 'U' ) )
            // InternalLTLFormula.g:2027:3: ( 'U' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorUKeyword_4_3_0()); 
            }
            // InternalLTLFormula.g:2028:3: ( 'U' )
            // InternalLTLFormula.g:2029:4: 'U'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getOperatorUKeyword_4_3_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorUKeyword_4_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getOperatorUKeyword_4_3_0()); 
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
    // $ANTLR end "rule__Last__OperatorAssignment_4_3"


    // $ANTLR start "rule__Last__FormulasAssignment_4_5"
    // InternalLTLFormula.g:2040:1: rule__Last__FormulasAssignment_4_5 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2044:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:2045:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:2045:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:2046:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_5_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_4_5"


    // $ANTLR start "rule__Last__FormulasAssignment_4_8"
    // InternalLTLFormula.g:2055:1: rule__Last__FormulasAssignment_4_8 : ( ruleLTLFormula ) ;
    public final void rule__Last__FormulasAssignment_4_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2059:1: ( ( ruleLTLFormula ) )
            // InternalLTLFormula.g:2060:2: ( ruleLTLFormula )
            {
            // InternalLTLFormula.g:2060:2: ( ruleLTLFormula )
            // InternalLTLFormula.g:2061:3: ruleLTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_8_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_4_8"


    // $ANTLR start "rule__Last__FormulasAssignment_5"
    // InternalLTLFormula.g:2070:1: rule__Last__FormulasAssignment_5 : ( ruleVariable ) ;
    public final void rule__Last__FormulasAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2074:1: ( ( ruleVariable ) )
            // InternalLTLFormula.g:2075:2: ( ruleVariable )
            {
            // InternalLTLFormula.g:2075:2: ( ruleVariable )
            // InternalLTLFormula.g:2076:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLastAccess().getFormulasVariableParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLastAccess().getFormulasVariableParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Last__FormulasAssignment_5"


    // $ANTLR start "rule__Variable__NameAssignment_0_0"
    // InternalLTLFormula.g:2085:1: rule__Variable__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2089:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2090:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2090:2: ( RULE_ID )
            // InternalLTLFormula.g:2091:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_0_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_0_1"
    // InternalLTLFormula.g:2100:1: rule__Variable__OperatorAssignment_0_1 : ( ( '==' ) ) ;
    public final void rule__Variable__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2104:1: ( ( ( '==' ) ) )
            // InternalLTLFormula.g:2105:2: ( ( '==' ) )
            {
            // InternalLTLFormula.g:2105:2: ( ( '==' ) )
            // InternalLTLFormula.g:2106:3: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0()); 
            }
            // InternalLTLFormula.g:2107:3: ( '==' )
            // InternalLTLFormula.g:2108:4: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_0_1"


    // $ANTLR start "rule__Variable__ValueAssignment_0_2"
    // InternalLTLFormula.g:2119:1: rule__Variable__ValueAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2123:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2124:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2124:2: ( RULE_ID )
            // InternalLTLFormula.g:2125:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_0_2"


    // $ANTLR start "rule__Variable__NameAssignment_1_0"
    // InternalLTLFormula.g:2134:1: rule__Variable__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2138:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2139:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2139:2: ( RULE_ID )
            // InternalLTLFormula.g:2140:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_1_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_1_1"
    // InternalLTLFormula.g:2149:1: rule__Variable__OperatorAssignment_1_1 : ( ( '!=' ) ) ;
    public final void rule__Variable__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2153:1: ( ( ( '!=' ) ) )
            // InternalLTLFormula.g:2154:2: ( ( '!=' ) )
            {
            // InternalLTLFormula.g:2154:2: ( ( '!=' ) )
            // InternalLTLFormula.g:2155:3: ( '!=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0()); 
            }
            // InternalLTLFormula.g:2156:3: ( '!=' )
            // InternalLTLFormula.g:2157:4: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_1_1"


    // $ANTLR start "rule__Variable__ValueAssignment_1_2"
    // InternalLTLFormula.g:2168:1: rule__Variable__ValueAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2172:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2173:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2173:2: ( RULE_ID )
            // InternalLTLFormula.g:2174:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_1_2"


    // $ANTLR start "rule__Variable__NameAssignment_2_0"
    // InternalLTLFormula.g:2183:1: rule__Variable__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2187:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2188:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2188:2: ( RULE_ID )
            // InternalLTLFormula.g:2189:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_2_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_2_1"
    // InternalLTLFormula.g:2198:1: rule__Variable__OperatorAssignment_2_1 : ( ( '>=' ) ) ;
    public final void rule__Variable__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2202:1: ( ( ( '>=' ) ) )
            // InternalLTLFormula.g:2203:2: ( ( '>=' ) )
            {
            // InternalLTLFormula.g:2203:2: ( ( '>=' ) )
            // InternalLTLFormula.g:2204:3: ( '>=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorGreaterThanSignEqualsSignKeyword_2_1_0()); 
            }
            // InternalLTLFormula.g:2205:3: ( '>=' )
            // InternalLTLFormula.g:2206:4: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorGreaterThanSignEqualsSignKeyword_2_1_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorGreaterThanSignEqualsSignKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorGreaterThanSignEqualsSignKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_2_1"


    // $ANTLR start "rule__Variable__ValueAssignment_2_2"
    // InternalLTLFormula.g:2217:1: rule__Variable__ValueAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2221:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2222:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2222:2: ( RULE_ID )
            // InternalLTLFormula.g:2223:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_2_2"


    // $ANTLR start "rule__Variable__NameAssignment_3_0"
    // InternalLTLFormula.g:2232:1: rule__Variable__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2236:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2237:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2237:2: ( RULE_ID )
            // InternalLTLFormula.g:2238:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_3_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_3_1"
    // InternalLTLFormula.g:2247:1: rule__Variable__OperatorAssignment_3_1 : ( ( '<=' ) ) ;
    public final void rule__Variable__OperatorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2251:1: ( ( ( '<=' ) ) )
            // InternalLTLFormula.g:2252:2: ( ( '<=' ) )
            {
            // InternalLTLFormula.g:2252:2: ( ( '<=' ) )
            // InternalLTLFormula.g:2253:3: ( '<=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorLessThanSignEqualsSignKeyword_3_1_0()); 
            }
            // InternalLTLFormula.g:2254:3: ( '<=' )
            // InternalLTLFormula.g:2255:4: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorLessThanSignEqualsSignKeyword_3_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorLessThanSignEqualsSignKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorLessThanSignEqualsSignKeyword_3_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_3_1"


    // $ANTLR start "rule__Variable__ValueAssignment_3_2"
    // InternalLTLFormula.g:2266:1: rule__Variable__ValueAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2270:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2271:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2271:2: ( RULE_ID )
            // InternalLTLFormula.g:2272:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_3_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_3_2"


    // $ANTLR start "rule__Variable__NameAssignment_4_0"
    // InternalLTLFormula.g:2281:1: rule__Variable__NameAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2285:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2286:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2286:2: ( RULE_ID )
            // InternalLTLFormula.g:2287:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_4_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_4_1"
    // InternalLTLFormula.g:2296:1: rule__Variable__OperatorAssignment_4_1 : ( ( '>' ) ) ;
    public final void rule__Variable__OperatorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2300:1: ( ( ( '>' ) ) )
            // InternalLTLFormula.g:2301:2: ( ( '>' ) )
            {
            // InternalLTLFormula.g:2301:2: ( ( '>' ) )
            // InternalLTLFormula.g:2302:3: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorGreaterThanSignKeyword_4_1_0()); 
            }
            // InternalLTLFormula.g:2303:3: ( '>' )
            // InternalLTLFormula.g:2304:4: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorGreaterThanSignKeyword_4_1_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorGreaterThanSignKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorGreaterThanSignKeyword_4_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_4_1"


    // $ANTLR start "rule__Variable__ValueAssignment_4_2"
    // InternalLTLFormula.g:2315:1: rule__Variable__ValueAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2319:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2320:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2320:2: ( RULE_ID )
            // InternalLTLFormula.g:2321:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_4_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_4_2"


    // $ANTLR start "rule__Variable__NameAssignment_5_0"
    // InternalLTLFormula.g:2330:1: rule__Variable__NameAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2334:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2335:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2335:2: ( RULE_ID )
            // InternalLTLFormula.g:2336:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0()); 
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
    // $ANTLR end "rule__Variable__NameAssignment_5_0"


    // $ANTLR start "rule__Variable__OperatorAssignment_5_1"
    // InternalLTLFormula.g:2345:1: rule__Variable__OperatorAssignment_5_1 : ( ( '<' ) ) ;
    public final void rule__Variable__OperatorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2349:1: ( ( ( '<' ) ) )
            // InternalLTLFormula.g:2350:2: ( ( '<' ) )
            {
            // InternalLTLFormula.g:2350:2: ( ( '<' ) )
            // InternalLTLFormula.g:2351:3: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorLessThanSignKeyword_5_1_0()); 
            }
            // InternalLTLFormula.g:2352:3: ( '<' )
            // InternalLTLFormula.g:2353:4: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getOperatorLessThanSignKeyword_5_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorLessThanSignKeyword_5_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getOperatorLessThanSignKeyword_5_1_0()); 
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
    // $ANTLR end "rule__Variable__OperatorAssignment_5_1"


    // $ANTLR start "rule__Variable__ValueAssignment_5_2"
    // InternalLTLFormula.g:2364:1: rule__Variable__ValueAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLTLFormula.g:2368:1: ( ( RULE_ID ) )
            // InternalLTLFormula.g:2369:2: ( RULE_ID )
            {
            // InternalLTLFormula.g:2369:2: ( RULE_ID )
            // InternalLTLFormula.g:2370:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_5_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__Variable__ValueAssignment_5_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F4010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    }


}