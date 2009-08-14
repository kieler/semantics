package de.cau.cs.kieler.synccharts.dsl.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.synccharts.dsl.services.RetypingSyncchartsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalRetypingSyncchartsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NORMAL'", "'cond'", "'reference'", "'textual'", "'state'", "'init'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRetypingSyncchartsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[95+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g"; }


     
     	private RetypingSyncchartsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RetypingSyncchartsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }




    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:56:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:56:16: ( ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:57:1: ruleState EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState66);
            ruleState();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState73); if (failed) return ;

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
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:64:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:68:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:69:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:69:1: ( ( rule__State__Group__0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:70:1: ( rule__State__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:71:1: ( rule__State__Group__0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:71:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState100);
            rule__State__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup()); 
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
    // $ANTLR end ruleState


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:90:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:94:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:95:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:95:1: ( ( rule__StateType__Alternatives ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:96:1: ( rule__StateType__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:97:1: ( rule__StateType__Alternatives )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:97:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType143);
            rule__StateType__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateTypeAccess().getAlternatives()); 
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
    // $ANTLR end ruleStateType


    // $ANTLR start rule__State__Alternatives_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:112:1: ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 16:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA1_7 = input.LA(3);

                    if ( (LA1_7==17) ) {
                        alt1=11;
                    }
                    else if ( (LA1_7==EOF||(LA1_7>=RULE_ID && LA1_7<=RULE_STRING)||LA1_7==15) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==EOF||(LA1_8>=RULE_ID && LA1_8<=RULE_STRING)||LA1_8==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_8==17) ) {
                        alt1=11;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==17) ) {
                        alt1=11;
                    }
                    else if ( (LA1_9==EOF||(LA1_9>=RULE_ID && LA1_9<=RULE_STRING)||LA1_9==15) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==17) ) {
                        alt1=11;
                    }
                    else if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||LA1_10==15) ) {
                        alt1=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||LA1_12==15) ) {
                        alt1=4;
                    }
                    else if ( ((LA1_12>=11 && LA1_12<=14)) ) {
                        alt1=10;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=2;
                    }
                    break;
                case 16:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==15) ) {
                        alt1=6;
                    }
                    else if ( ((LA1_14>=11 && LA1_14<=14)) ) {
                        alt1=12;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA1_15 = input.LA(3);

                    if ( (LA1_15==16) ) {
                        alt1=13;
                    }
                    else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||LA1_15==15) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==EOF||(LA1_16>=RULE_ID && LA1_16<=RULE_STRING)||LA1_16==15) ) {
                        alt1=7;
                    }
                    else if ( (LA1_16==16) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (LA1_17==EOF||(LA1_17>=RULE_ID && LA1_17<=RULE_STRING)||LA1_17==15) ) {
                        alt1=7;
                    }
                    else if ( (LA1_17==16) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==16) ) {
                        alt1=13;
                    }
                    else if ( (LA1_18==EOF||(LA1_18>=RULE_ID && LA1_18<=RULE_STRING)||LA1_18==15) ) {
                        alt1=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==16) ) {
                        alt1=14;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==15) ) {
                        alt1=8;
                    }
                    else if ( (LA1_20==17) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=3;
                    }
                    break;
                case 17:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==16) ) {
                        alt1=14;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==15) ) {
                        alt1=8;
                    }
                    else if ( (LA1_20==17) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==15) ) {
                        alt1=8;
                    }
                    else if ( (LA1_20==17) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==16) ) {
                        alt1=14;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==15) ) {
                        alt1=8;
                    }
                    else if ( (LA1_20==17) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==16) ) {
                        alt1=14;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__IsFinalAssignment_0_1 ) ) | ( ( rule__State__StateKindAssignment_0_2 ) ) | ( ( rule__State__Group_0_3__0 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__Group_0_6__0 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:113:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:113:1: ( ( rule__State__IsInitialAssignment_0_0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:114:1: ( rule__State__IsInitialAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:1: ( rule__State__IsInitialAssignment_0_0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:115:2: rule__State__IsInitialAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0178);
                    rule__State__IsInitialAssignment_0_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsInitialAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:119:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:119:6: ( ( rule__State__IsFinalAssignment_0_1 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:120:1: ( rule__State__IsFinalAssignment_0_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsFinalAssignment_0_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:121:1: ( rule__State__IsFinalAssignment_0_1 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:121:2: rule__State__IsFinalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0196);
                    rule__State__IsFinalAssignment_0_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsFinalAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:6: ( ( rule__State__StateKindAssignment_0_2 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:126:1: ( rule__State__StateKindAssignment_0_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getStateKindAssignment_0_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:1: ( rule__State__StateKindAssignment_0_2 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:2: rule__State__StateKindAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0214);
                    rule__State__StateKindAssignment_0_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getStateKindAssignment_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:131:6: ( ( rule__State__Group_0_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:131:6: ( ( rule__State__Group_0_3__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:132:1: ( rule__State__Group_0_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:133:1: ( rule__State__Group_0_3__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:133:2: rule__State__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0232);
                    rule__State__Group_0_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:137:6: ( ( rule__State__Group_0_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:137:6: ( ( rule__State__Group_0_4__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:138:1: ( rule__State__Group_0_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:139:1: ( rule__State__Group_0_4__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:139:2: rule__State__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0250);
                    rule__State__Group_0_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:143:6: ( ( rule__State__Group_0_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:143:6: ( ( rule__State__Group_0_5__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:144:1: ( rule__State__Group_0_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:145:1: ( rule__State__Group_0_5__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:145:2: rule__State__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0268);
                    rule__State__Group_0_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:149:6: ( ( rule__State__Group_0_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:149:6: ( ( rule__State__Group_0_6__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:150:1: ( rule__State__Group_0_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:151:1: ( rule__State__Group_0_6__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:151:2: rule__State__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0286);
                    rule__State__Group_0_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:155:6: ( ( rule__State__Group_0_7__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:155:6: ( ( rule__State__Group_0_7__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:156:1: ( rule__State__Group_0_7__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:157:1: ( rule__State__Group_0_7__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:157:2: rule__State__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0304);
                    rule__State__Group_0_7__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:161:6: ( ( rule__State__Group_0_8__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:161:6: ( ( rule__State__Group_0_8__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:162:1: ( rule__State__Group_0_8__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:163:1: ( rule__State__Group_0_8__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:163:2: rule__State__Group_0_8__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0322);
                    rule__State__Group_0_8__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:167:6: ( ( rule__State__Group_0_9__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:167:6: ( ( rule__State__Group_0_9__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:168:1: ( rule__State__Group_0_9__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:1: ( rule__State__Group_0_9__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:169:2: rule__State__Group_0_9__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0340);
                    rule__State__Group_0_9__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:173:6: ( ( rule__State__Group_0_10__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:173:6: ( ( rule__State__Group_0_10__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:174:1: ( rule__State__Group_0_10__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:175:1: ( rule__State__Group_0_10__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:175:2: rule__State__Group_0_10__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0358);
                    rule__State__Group_0_10__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:179:6: ( ( rule__State__Group_0_11__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:179:6: ( ( rule__State__Group_0_11__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:180:1: ( rule__State__Group_0_11__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:181:1: ( rule__State__Group_0_11__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:181:2: rule__State__Group_0_11__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0376);
                    rule__State__Group_0_11__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:185:6: ( ( rule__State__Group_0_12__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:185:6: ( ( rule__State__Group_0_12__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:186:1: ( rule__State__Group_0_12__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:187:1: ( rule__State__Group_0_12__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:187:2: rule__State__Group_0_12__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0394);
                    rule__State__Group_0_12__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:191:6: ( ( rule__State__Group_0_13__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:191:6: ( ( rule__State__Group_0_13__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:192:1: ( rule__State__Group_0_13__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:193:1: ( rule__State__Group_0_13__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:193:2: rule__State__Group_0_13__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0412);
                    rule__State__Group_0_13__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:6: ( ( rule__State__Group_0_14__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:197:6: ( ( rule__State__Group_0_14__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:198:1: ( rule__State__Group_0_14__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_14()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:199:1: ( rule__State__Group_0_14__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:199:2: rule__State__Group_0_14__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0430);
                    rule__State__Group_0_14__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_14()); 
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
    // $ANTLR end rule__State__Alternatives_0


    // $ANTLR start rule__StateType__Alternatives
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:208:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:212:1: ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("208:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:213:1: ( ( 'NORMAL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:213:1: ( ( 'NORMAL' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:214:1: ( 'NORMAL' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:215:1: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:215:3: 'NORMAL'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives464); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:220:6: ( ( 'cond' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:220:6: ( ( 'cond' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:221:1: ( 'cond' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:222:1: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:222:3: 'cond'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives485); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:228:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:229:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:229:3: 'reference'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives506); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:235:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:236:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:236:3: 'textual'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives527); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
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
    // $ANTLR end rule__StateType__Alternatives


    // $ANTLR start rule__State__Group__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:248:1: rule__State__Group__0 : ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:252:1: ( ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:253:1: ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:253:1: ( ( rule__State__Alternatives_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:254:1: ( rule__State__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:255:1: ( rule__State__Alternatives_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=14)||(LA3_0>=16 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:255:2: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0564);
                    rule__State__Alternatives_0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getAlternatives_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0574);
            rule__State__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:266:1: rule__State__Group__1 : ( ( 'state' )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:270:1: ( ( ( 'state' )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:1: ( ( 'state' )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:271:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:272:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:273:1: ( 'state' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:274:2: 'state'
                    {
                    match(input,15,FOLLOW_15_in_rule__State__Group__1604); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1616);
            rule__State__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__State__Group__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:286:1: rule__State__Group__2 : ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:290:1: ( ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:291:1: ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:291:1: ( ( rule__State__StateNameAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:292:1: ( rule__State__StateNameAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:1: ( rule__State__StateNameAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:293:2: rule__State__StateNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__2644);
                    rule__State__StateNameAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2654);
            rule__State__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__2


    // $ANTLR start rule__State__Group__3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:304:1: rule__State__Group__3 : ( ( rule__State__LabelAssignment_3 )? ) ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:308:1: ( ( ( rule__State__LabelAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:309:1: ( ( rule__State__LabelAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:309:1: ( ( rule__State__LabelAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:310:1: ( rule__State__LabelAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:311:1: ( rule__State__LabelAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:311:2: rule__State__LabelAssignment_3
                    {
                    pushFollow(FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__3682);
                    rule__State__LabelAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelAssignment_3()); 
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
    // $ANTLR end rule__State__Group__3


    // $ANTLR start rule__State__Group_0_3__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:329:1: rule__State__Group_0_3__0 : ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 ;
    public final void rule__State__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:333:1: ( ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) ) rule__State__Group_0_3__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:334:1: ( ( rule__State__IsInitialAssignment_0_3_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:335:1: ( rule__State__IsInitialAssignment_0_3_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:336:1: ( rule__State__IsInitialAssignment_0_3_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:336:2: rule__State__IsInitialAssignment_0_3_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__0725);
            rule__State__IsInitialAssignment_0_3_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__0734);
            rule__State__Group_0_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_3__0


    // $ANTLR start rule__State__Group_0_3__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:1: rule__State__Group_0_3__1 : ( ( rule__State__IsFinalAssignment_0_3_1 ) ) ;
    public final void rule__State__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:351:1: ( ( ( rule__State__IsFinalAssignment_0_3_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:352:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:352:1: ( ( rule__State__IsFinalAssignment_0_3_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:353:1: ( rule__State__IsFinalAssignment_0_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_3_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:354:1: ( rule__State__IsFinalAssignment_0_3_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:354:2: rule__State__IsFinalAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__1762);
            rule__State__IsFinalAssignment_0_3_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_3_1()); 
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
    // $ANTLR end rule__State__Group_0_3__1


    // $ANTLR start rule__State__Group_0_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:368:1: rule__State__Group_0_4__0 : ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 ;
    public final void rule__State__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:372:1: ( ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:373:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) ) rule__State__Group_0_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:373:1: ( ( rule__State__IsInitialAssignment_0_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:374:1: ( rule__State__IsInitialAssignment_0_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:375:1: ( rule__State__IsInitialAssignment_0_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:375:2: rule__State__IsInitialAssignment_0_4_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__0800);
            rule__State__IsInitialAssignment_0_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__0809);
            rule__State__Group_0_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_4__0


    // $ANTLR start rule__State__Group_0_4__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:386:1: rule__State__Group_0_4__1 : ( ( rule__State__StateKindAssignment_0_4_1 ) ) ;
    public final void rule__State__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:390:1: ( ( ( rule__State__StateKindAssignment_0_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:391:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:391:1: ( ( rule__State__StateKindAssignment_0_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:392:1: ( rule__State__StateKindAssignment_0_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:393:1: ( rule__State__StateKindAssignment_0_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:393:2: rule__State__StateKindAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__1837);
            rule__State__StateKindAssignment_0_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_4_1()); 
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
    // $ANTLR end rule__State__Group_0_4__1


    // $ANTLR start rule__State__Group_0_5__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:407:1: rule__State__Group_0_5__0 : ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 ;
    public final void rule__State__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:411:1: ( ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:412:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) ) rule__State__Group_0_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:412:1: ( ( rule__State__IsFinalAssignment_0_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:413:1: ( rule__State__IsFinalAssignment_0_5_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:414:1: ( rule__State__IsFinalAssignment_0_5_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:414:2: rule__State__IsFinalAssignment_0_5_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__0875);
            rule__State__IsFinalAssignment_0_5_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__0884);
            rule__State__Group_0_5__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_5__0


    // $ANTLR start rule__State__Group_0_5__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:425:1: rule__State__Group_0_5__1 : ( ( rule__State__IsInitialAssignment_0_5_1 ) ) ;
    public final void rule__State__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:429:1: ( ( ( rule__State__IsInitialAssignment_0_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:430:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:430:1: ( ( rule__State__IsInitialAssignment_0_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:431:1: ( rule__State__IsInitialAssignment_0_5_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:432:1: ( rule__State__IsInitialAssignment_0_5_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:432:2: rule__State__IsInitialAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__1912);
            rule__State__IsInitialAssignment_0_5_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_5_1()); 
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
    // $ANTLR end rule__State__Group_0_5__1


    // $ANTLR start rule__State__Group_0_6__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:446:1: rule__State__Group_0_6__0 : ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 ;
    public final void rule__State__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:450:1: ( ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:451:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) ) rule__State__Group_0_6__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:451:1: ( ( rule__State__IsFinalAssignment_0_6_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:452:1: ( rule__State__IsFinalAssignment_0_6_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:453:1: ( rule__State__IsFinalAssignment_0_6_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:453:2: rule__State__IsFinalAssignment_0_6_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__0950);
            rule__State__IsFinalAssignment_0_6_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_6_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__0959);
            rule__State__Group_0_6__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_6__0


    // $ANTLR start rule__State__Group_0_6__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:1: rule__State__Group_0_6__1 : ( ( rule__State__StateKindAssignment_0_6_1 ) ) ;
    public final void rule__State__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:468:1: ( ( ( rule__State__StateKindAssignment_0_6_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:469:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:469:1: ( ( rule__State__StateKindAssignment_0_6_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:470:1: ( rule__State__StateKindAssignment_0_6_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_6_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:471:1: ( rule__State__StateKindAssignment_0_6_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:471:2: rule__State__StateKindAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__1987);
            rule__State__StateKindAssignment_0_6_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_6_1()); 
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
    // $ANTLR end rule__State__Group_0_6__1


    // $ANTLR start rule__State__Group_0_7__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:485:1: rule__State__Group_0_7__0 : ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 ;
    public final void rule__State__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:489:1: ( ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:1: ( ( rule__State__StateKindAssignment_0_7_0 ) ) rule__State__Group_0_7__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:490:1: ( ( rule__State__StateKindAssignment_0_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:491:1: ( rule__State__StateKindAssignment_0_7_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:492:1: ( rule__State__StateKindAssignment_0_7_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:492:2: rule__State__StateKindAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__01025);
            rule__State__StateKindAssignment_0_7_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_7_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01034);
            rule__State__Group_0_7__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_7__0


    // $ANTLR start rule__State__Group_0_7__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:503:1: rule__State__Group_0_7__1 : ( ( rule__State__IsInitialAssignment_0_7_1 ) ) ;
    public final void rule__State__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:507:1: ( ( ( rule__State__IsInitialAssignment_0_7_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:508:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:508:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:509:1: ( rule__State__IsInitialAssignment_0_7_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:510:1: ( rule__State__IsInitialAssignment_0_7_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:510:2: rule__State__IsInitialAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11062);
            rule__State__IsInitialAssignment_0_7_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
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
    // $ANTLR end rule__State__Group_0_7__1


    // $ANTLR start rule__State__Group_0_8__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:524:1: rule__State__Group_0_8__0 : ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 ;
    public final void rule__State__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:528:1: ( ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:1: ( ( rule__State__StateKindAssignment_0_8_0 ) ) rule__State__Group_0_8__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:529:1: ( ( rule__State__StateKindAssignment_0_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:530:1: ( rule__State__StateKindAssignment_0_8_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:531:1: ( rule__State__StateKindAssignment_0_8_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:531:2: rule__State__StateKindAssignment_0_8_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__01100);
            rule__State__StateKindAssignment_0_8_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_8_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01109);
            rule__State__Group_0_8__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_8__0


    // $ANTLR start rule__State__Group_0_8__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:1: rule__State__Group_0_8__1 : ( ( rule__State__IsFinalAssignment_0_8_1 ) ) ;
    public final void rule__State__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:546:1: ( ( ( rule__State__IsFinalAssignment_0_8_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:547:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:547:1: ( ( rule__State__IsFinalAssignment_0_8_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:548:1: ( rule__State__IsFinalAssignment_0_8_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:549:1: ( rule__State__IsFinalAssignment_0_8_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:549:2: rule__State__IsFinalAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__11137);
            rule__State__IsFinalAssignment_0_8_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_1()); 
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
    // $ANTLR end rule__State__Group_0_8__1


    // $ANTLR start rule__State__Group_0_9__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:563:1: rule__State__Group_0_9__0 : ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 ;
    public final void rule__State__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:567:1: ( ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:568:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) ) rule__State__Group_0_9__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:568:1: ( ( rule__State__IsInitialAssignment_0_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:569:1: ( rule__State__IsInitialAssignment_0_9_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:570:1: ( rule__State__IsInitialAssignment_0_9_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:570:2: rule__State__IsInitialAssignment_0_9_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__01175);
            rule__State__IsInitialAssignment_0_9_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01184);
            rule__State__Group_0_9__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_9__0


    // $ANTLR start rule__State__Group_0_9__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:581:1: rule__State__Group_0_9__1 : ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 ;
    public final void rule__State__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:585:1: ( ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:586:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:586:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:587:1: ( rule__State__IsFinalAssignment_0_9_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:588:1: ( rule__State__IsFinalAssignment_0_9_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:588:2: rule__State__IsFinalAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11212);
            rule__State__IsFinalAssignment_0_9_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11221);
            rule__State__Group_0_9__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_9__1


    // $ANTLR start rule__State__Group_0_9__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:599:1: rule__State__Group_0_9__2 : ( ( rule__State__StateKindAssignment_0_9_2 ) ) ;
    public final void rule__State__Group_0_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:603:1: ( ( ( rule__State__StateKindAssignment_0_9_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:604:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:604:1: ( ( rule__State__StateKindAssignment_0_9_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:605:1: ( rule__State__StateKindAssignment_0_9_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_9_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:1: ( rule__State__StateKindAssignment_0_9_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:606:2: rule__State__StateKindAssignment_0_9_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__21249);
            rule__State__StateKindAssignment_0_9_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_9_2()); 
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
    // $ANTLR end rule__State__Group_0_9__2


    // $ANTLR start rule__State__Group_0_10__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:622:1: rule__State__Group_0_10__0 : ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 ;
    public final void rule__State__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:626:1: ( ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:627:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:627:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:628:1: ( rule__State__IsInitialAssignment_0_10_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:629:1: ( rule__State__IsInitialAssignment_0_10_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:629:2: rule__State__IsInitialAssignment_0_10_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01289);
            rule__State__IsInitialAssignment_0_10_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01298);
            rule__State__Group_0_10__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_10__0


    // $ANTLR start rule__State__Group_0_10__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:640:1: rule__State__Group_0_10__1 : ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 ;
    public final void rule__State__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:644:1: ( ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:645:1: ( ( rule__State__StateKindAssignment_0_10_1 ) ) rule__State__Group_0_10__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:645:1: ( ( rule__State__StateKindAssignment_0_10_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:646:1: ( rule__State__StateKindAssignment_0_10_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:647:1: ( rule__State__StateKindAssignment_0_10_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:647:2: rule__State__StateKindAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__11326);
            rule__State__StateKindAssignment_0_10_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_10_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11335);
            rule__State__Group_0_10__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_10__1


    // $ANTLR start rule__State__Group_0_10__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:658:1: rule__State__Group_0_10__2 : ( ( rule__State__IsFinalAssignment_0_10_2 ) ) ;
    public final void rule__State__Group_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:662:1: ( ( ( rule__State__IsFinalAssignment_0_10_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:663:1: ( ( rule__State__IsFinalAssignment_0_10_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:664:1: ( rule__State__IsFinalAssignment_0_10_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:665:1: ( rule__State__IsFinalAssignment_0_10_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:665:2: rule__State__IsFinalAssignment_0_10_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__21363);
            rule__State__IsFinalAssignment_0_10_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_2()); 
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
    // $ANTLR end rule__State__Group_0_10__2


    // $ANTLR start rule__State__Group_0_11__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:681:1: rule__State__Group_0_11__0 : ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 ;
    public final void rule__State__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:685:1: ( ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:686:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) ) rule__State__Group_0_11__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:686:1: ( ( rule__State__IsFinalAssignment_0_11_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:687:1: ( rule__State__IsFinalAssignment_0_11_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:688:1: ( rule__State__IsFinalAssignment_0_11_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:688:2: rule__State__IsFinalAssignment_0_11_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__01403);
            rule__State__IsFinalAssignment_0_11_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01412);
            rule__State__Group_0_11__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_11__0


    // $ANTLR start rule__State__Group_0_11__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:699:1: rule__State__Group_0_11__1 : ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 ;
    public final void rule__State__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:703:1: ( ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:704:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) ) rule__State__Group_0_11__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:704:1: ( ( rule__State__IsInitialAssignment_0_11_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:705:1: ( rule__State__IsInitialAssignment_0_11_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:706:1: ( rule__State__IsInitialAssignment_0_11_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:706:2: rule__State__IsInitialAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__11440);
            rule__State__IsInitialAssignment_0_11_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11449);
            rule__State__Group_0_11__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_11__1


    // $ANTLR start rule__State__Group_0_11__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:717:1: rule__State__Group_0_11__2 : ( ( rule__State__StateKindAssignment_0_11_2 ) ) ;
    public final void rule__State__Group_0_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:721:1: ( ( ( rule__State__StateKindAssignment_0_11_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:722:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:723:1: ( rule__State__StateKindAssignment_0_11_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:1: ( rule__State__StateKindAssignment_0_11_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:724:2: rule__State__StateKindAssignment_0_11_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21477);
            rule__State__StateKindAssignment_0_11_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
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
    // $ANTLR end rule__State__Group_0_11__2


    // $ANTLR start rule__State__Group_0_12__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:740:1: rule__State__Group_0_12__0 : ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 ;
    public final void rule__State__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:744:1: ( ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:745:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) ) rule__State__Group_0_12__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:745:1: ( ( rule__State__IsFinalAssignment_0_12_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:746:1: ( rule__State__IsFinalAssignment_0_12_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:747:1: ( rule__State__IsFinalAssignment_0_12_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:747:2: rule__State__IsFinalAssignment_0_12_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__01517);
            rule__State__IsFinalAssignment_0_12_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01526);
            rule__State__Group_0_12__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_12__0


    // $ANTLR start rule__State__Group_0_12__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:758:1: rule__State__Group_0_12__1 : ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 ;
    public final void rule__State__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:762:1: ( ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:763:1: ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:763:1: ( ( rule__State__StateKindAssignment_0_12_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:764:1: ( rule__State__StateKindAssignment_0_12_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:765:1: ( rule__State__StateKindAssignment_0_12_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:765:2: rule__State__StateKindAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11554);
            rule__State__StateKindAssignment_0_12_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11563);
            rule__State__Group_0_12__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_12__1


    // $ANTLR start rule__State__Group_0_12__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:776:1: rule__State__Group_0_12__2 : ( ( rule__State__IsInitialAssignment_0_12_2 ) ) ;
    public final void rule__State__Group_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:780:1: ( ( ( rule__State__IsInitialAssignment_0_12_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:781:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:781:1: ( ( rule__State__IsInitialAssignment_0_12_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:782:1: ( rule__State__IsInitialAssignment_0_12_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:783:1: ( rule__State__IsInitialAssignment_0_12_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:783:2: rule__State__IsInitialAssignment_0_12_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__21591);
            rule__State__IsInitialAssignment_0_12_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_2()); 
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
    // $ANTLR end rule__State__Group_0_12__2


    // $ANTLR start rule__State__Group_0_13__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:799:1: rule__State__Group_0_13__0 : ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 ;
    public final void rule__State__Group_0_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:803:1: ( ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:804:1: ( ( rule__State__StateKindAssignment_0_13_0 ) ) rule__State__Group_0_13__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:804:1: ( ( rule__State__StateKindAssignment_0_13_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:805:1: ( rule__State__StateKindAssignment_0_13_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:806:1: ( rule__State__StateKindAssignment_0_13_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:806:2: rule__State__StateKindAssignment_0_13_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__01631);
            rule__State__StateKindAssignment_0_13_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_13_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01640);
            rule__State__Group_0_13__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_13__0


    // $ANTLR start rule__State__Group_0_13__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:817:1: rule__State__Group_0_13__1 : ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 ;
    public final void rule__State__Group_0_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:821:1: ( ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:822:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) ) rule__State__Group_0_13__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:822:1: ( ( rule__State__IsFinalAssignment_0_13_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:823:1: ( rule__State__IsFinalAssignment_0_13_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:1: ( rule__State__IsFinalAssignment_0_13_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:824:2: rule__State__IsFinalAssignment_0_13_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__11668);
            rule__State__IsFinalAssignment_0_13_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__11677);
            rule__State__Group_0_13__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_13__1


    // $ANTLR start rule__State__Group_0_13__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:835:1: rule__State__Group_0_13__2 : ( ( rule__State__IsInitialAssignment_0_13_2 ) ) ;
    public final void rule__State__Group_0_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:839:1: ( ( ( rule__State__IsInitialAssignment_0_13_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:840:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:840:1: ( ( rule__State__IsInitialAssignment_0_13_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:841:1: ( rule__State__IsInitialAssignment_0_13_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:1: ( rule__State__IsInitialAssignment_0_13_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:842:2: rule__State__IsInitialAssignment_0_13_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__21705);
            rule__State__IsInitialAssignment_0_13_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_2()); 
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
    // $ANTLR end rule__State__Group_0_13__2


    // $ANTLR start rule__State__Group_0_14__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:858:1: rule__State__Group_0_14__0 : ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 ;
    public final void rule__State__Group_0_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:862:1: ( ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:863:1: ( ( rule__State__StateKindAssignment_0_14_0 ) ) rule__State__Group_0_14__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:863:1: ( ( rule__State__StateKindAssignment_0_14_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:864:1: ( rule__State__StateKindAssignment_0_14_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:865:1: ( rule__State__StateKindAssignment_0_14_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:865:2: rule__State__StateKindAssignment_0_14_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__01745);
            rule__State__StateKindAssignment_0_14_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_14_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__01754);
            rule__State__Group_0_14__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_14__0


    // $ANTLR start rule__State__Group_0_14__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:876:1: rule__State__Group_0_14__1 : ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 ;
    public final void rule__State__Group_0_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:880:1: ( ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) ) rule__State__Group_0_14__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:881:1: ( ( rule__State__IsInitialAssignment_0_14_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:882:1: ( rule__State__IsInitialAssignment_0_14_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:883:1: ( rule__State__IsInitialAssignment_0_14_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:883:2: rule__State__IsInitialAssignment_0_14_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__11782);
            rule__State__IsInitialAssignment_0_14_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__11791);
            rule__State__Group_0_14__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group_0_14__1


    // $ANTLR start rule__State__Group_0_14__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:894:1: rule__State__Group_0_14__2 : ( ( rule__State__IsFinalAssignment_0_14_2 ) ) ;
    public final void rule__State__Group_0_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:898:1: ( ( ( rule__State__IsFinalAssignment_0_14_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:899:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:899:1: ( ( rule__State__IsFinalAssignment_0_14_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:900:1: ( rule__State__IsFinalAssignment_0_14_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:1: ( rule__State__IsFinalAssignment_0_14_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:901:2: rule__State__IsFinalAssignment_0_14_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__21819);
            rule__State__IsFinalAssignment_0_14_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_2()); 
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
    // $ANTLR end rule__State__Group_0_14__2


    // $ANTLR start rule__State__IsInitialAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:920:1: rule__State__IsInitialAssignment_0_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:924:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:925:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:925:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:926:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:927:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:928:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_01867); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_0


    // $ANTLR start rule__State__IsFinalAssignment_0_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:943:1: rule__State__IsFinalAssignment_0_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:947:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:948:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:948:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:949:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:950:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:951:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_11911); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_1


    // $ANTLR start rule__State__StateKindAssignment_0_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:966:1: rule__State__StateKindAssignment_0_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:970:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:971:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:971:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_21950);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_2


    // $ANTLR start rule__State__IsInitialAssignment_0_3_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:981:1: rule__State__IsInitialAssignment_0_3_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:985:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:986:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:986:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:987:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:988:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:989:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_3_01986); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_3_0


    // $ANTLR start rule__State__IsFinalAssignment_0_3_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1004:1: rule__State__IsFinalAssignment_0_3_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1008:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1009:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1009:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1010:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1011:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1012:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_3_12030); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_3_1


    // $ANTLR start rule__State__IsInitialAssignment_0_4_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1027:1: rule__State__IsInitialAssignment_0_4_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1032:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1032:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1033:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1034:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1035:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_4_02074); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_4_0


    // $ANTLR start rule__State__StateKindAssignment_0_4_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1050:1: rule__State__StateKindAssignment_0_4_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1056:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_12113);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_4_1


    // $ANTLR start rule__State__IsFinalAssignment_0_5_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1065:1: rule__State__IsFinalAssignment_0_5_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1069:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1070:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1070:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1071:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1072:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1073:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_5_02149); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_5_0


    // $ANTLR start rule__State__IsInitialAssignment_0_5_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1088:1: rule__State__IsInitialAssignment_0_5_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1092:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1093:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1093:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1094:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1095:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1096:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_5_12193); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_5_1


    // $ANTLR start rule__State__IsFinalAssignment_0_6_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1111:1: rule__State__IsFinalAssignment_0_6_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1115:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1116:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1116:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1117:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1118:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1119:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_6_02237); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_6_0


    // $ANTLR start rule__State__StateKindAssignment_0_6_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1134:1: rule__State__StateKindAssignment_0_6_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1138:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1139:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1139:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1140:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_12276);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_6_1


    // $ANTLR start rule__State__StateKindAssignment_0_7_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1149:1: rule__State__StateKindAssignment_0_7_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1153:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1154:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1154:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1155:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_02307);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_7_0


    // $ANTLR start rule__State__IsInitialAssignment_0_7_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1164:1: rule__State__IsInitialAssignment_0_7_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1168:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1169:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1170:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1171:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1172:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_7_12343); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_7_1


    // $ANTLR start rule__State__StateKindAssignment_0_8_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1187:1: rule__State__StateKindAssignment_0_8_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1191:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1192:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1192:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1193:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_02382);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_8_0


    // $ANTLR start rule__State__IsFinalAssignment_0_8_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1202:1: rule__State__IsFinalAssignment_0_8_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1206:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1207:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1207:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1208:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1209:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1210:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_8_12418); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_8_1


    // $ANTLR start rule__State__IsInitialAssignment_0_9_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1225:1: rule__State__IsInitialAssignment_0_9_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1231:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1232:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1233:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_9_02462); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_9_0


    // $ANTLR start rule__State__IsFinalAssignment_0_9_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1248:1: rule__State__IsFinalAssignment_0_9_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1252:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1254:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1255:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1256:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_9_12506); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_9_1


    // $ANTLR start rule__State__StateKindAssignment_0_9_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1271:1: rule__State__StateKindAssignment_0_9_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1275:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1276:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1276:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1277:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_22545);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_9_2


    // $ANTLR start rule__State__IsInitialAssignment_0_10_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1286:1: rule__State__IsInitialAssignment_0_10_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1290:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1291:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1291:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1292:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1293:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1294:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_10_02581); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_10_0


    // $ANTLR start rule__State__StateKindAssignment_0_10_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1309:1: rule__State__StateKindAssignment_0_10_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1313:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1314:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1315:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_12620);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_10_1


    // $ANTLR start rule__State__IsFinalAssignment_0_10_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1324:1: rule__State__IsFinalAssignment_0_10_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1328:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1329:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1329:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1330:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1331:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1332:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_10_22656); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_10_2


    // $ANTLR start rule__State__IsFinalAssignment_0_11_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1347:1: rule__State__IsFinalAssignment_0_11_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1351:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1352:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1352:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1353:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1354:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1355:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_11_02700); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_11_0


    // $ANTLR start rule__State__IsInitialAssignment_0_11_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1370:1: rule__State__IsInitialAssignment_0_11_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1374:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1376:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1377:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1378:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_11_12744); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_11_1


    // $ANTLR start rule__State__StateKindAssignment_0_11_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1393:1: rule__State__StateKindAssignment_0_11_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1397:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1398:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1398:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1399:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_22783);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_11_2


    // $ANTLR start rule__State__IsFinalAssignment_0_12_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1408:1: rule__State__IsFinalAssignment_0_12_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1412:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1413:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1413:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1414:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1415:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1416:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_12_02819); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_12_0


    // $ANTLR start rule__State__StateKindAssignment_0_12_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1431:1: rule__State__StateKindAssignment_0_12_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1435:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1436:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1436:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1437:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_12858);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_12_1


    // $ANTLR start rule__State__IsInitialAssignment_0_12_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1446:1: rule__State__IsInitialAssignment_0_12_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1450:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1451:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1451:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1452:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1453:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1454:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_12_22894); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_12_2


    // $ANTLR start rule__State__StateKindAssignment_0_13_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1469:1: rule__State__StateKindAssignment_0_13_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1473:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1474:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1474:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1475:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_02933);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_13_0


    // $ANTLR start rule__State__IsFinalAssignment_0_13_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1484:1: rule__State__IsFinalAssignment_0_13_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1488:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1489:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1489:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1490:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1491:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1492:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_13_12969); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_13_1


    // $ANTLR start rule__State__IsInitialAssignment_0_13_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1507:1: rule__State__IsInitialAssignment_0_13_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1511:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1512:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1512:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1513:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1514:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1515:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_13_23013); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_13_2


    // $ANTLR start rule__State__StateKindAssignment_0_14_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1530:1: rule__State__StateKindAssignment_0_14_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1534:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1535:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1535:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1536:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_03052);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_14_0


    // $ANTLR start rule__State__IsInitialAssignment_0_14_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1545:1: rule__State__IsInitialAssignment_0_14_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1549:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1550:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1550:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1551:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1552:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1553:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_14_13088); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_14_1


    // $ANTLR start rule__State__IsFinalAssignment_0_14_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1568:1: rule__State__IsFinalAssignment_0_14_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1572:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1573:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1573:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1574:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1575:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1576:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_14_23132); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_14_2


    // $ANTLR start rule__State__StateNameAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1591:1: rule__State__StateNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__StateNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1595:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1596:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1596:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1597:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_23171); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__State__StateNameAssignment_2


    // $ANTLR start rule__State__LabelAssignment_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1606:1: rule__State__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__State__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1610:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1611:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1611:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1612:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_33202); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end rule__State__LabelAssignment_3


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_1_in_rule__State__Alternatives_0196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_2_in_rule__State__Alternatives_0214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__0_in_rule__State__Alternatives_0232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__0_in_rule__State__Alternatives_0286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0564 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__1604 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__2644 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_3_0_in_rule__State__Group_0_3__0725 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_3__1_in_rule__State__Group_0_3__0734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_3_1_in_rule__State__Group_0_3__1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_4_0_in_rule__State__Group_0_4__0800 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__0809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_4_1_in_rule__State__Group_0_4__1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_5_0_in_rule__State__Group_0_5__0875 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__0884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_5_1_in_rule__State__Group_0_5__1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_6_0_in_rule__State__Group_0_6__0950 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_6__1_in_rule__State__Group_0_6__0959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_6_1_in_rule__State__Group_0_6__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_7_0_in_rule__State__Group_0_7__01025 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_8_0_in_rule__State__Group_0_8__01100 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_8_1_in_rule__State__Group_0_8__11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_9_0_in_rule__State__Group_0_9__01175 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11212 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_9_2_in_rule__State__Group_0_9__21249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01289 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_10_1_in_rule__State__Group_0_10__11326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_10_2_in_rule__State__Group_0_10__21363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_11_0_in_rule__State__Group_0_11__01403 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_11_1_in_rule__State__Group_0_11__11440 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_12_0_in_rule__State__Group_0_12__01517 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11554 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_12_2_in_rule__State__Group_0_12__21591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_13_0_in_rule__State__Group_0_13__01631 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_13_1_in_rule__State__Group_0_13__11668 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_13_2_in_rule__State__Group_0_13__21705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_14_0_in_rule__State__Group_0_14__01745 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_14_1_in_rule__State__Group_0_14__11782 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_14_2_in_rule__State__Group_0_14__21819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_21950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_3_01986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_3_12030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_4_02074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_5_02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_5_12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_6_02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_6_12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_7_02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_7_12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_8_12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_9_02462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_9_12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_22545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_10_02581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_10_22656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_11_02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_11_12744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_22783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_12_02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_12858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_12_22894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_02933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_13_12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_13_23013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_03052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_14_13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_14_23132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_23171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_33202 = new BitSet(new long[]{0x0000000000000002L});

}