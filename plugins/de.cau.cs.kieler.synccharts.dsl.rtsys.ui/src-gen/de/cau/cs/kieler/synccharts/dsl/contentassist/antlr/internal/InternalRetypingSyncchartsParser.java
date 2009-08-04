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
            ruleMemo = new HashMap[109+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );
    public final void rule__State__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:112:1: ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) )
            int alt1=17;
            switch ( input.LA(1) ) {
            case 16:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    switch ( input.LA(3) ) {
                    case 11:
                        {
                        int LA1_22 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 12:
                        {
                        int LA1_23 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 13:
                        {
                        int LA1_24 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA1_25 = input.LA(4);

                        if ( (synpred11()) ) {
                            alt1=11;
                        }
                        else if ( (synpred12()) ) {
                            alt1=12;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_STRING:
                    case 15:
                        {
                        alt1=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 7, input);

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
                case 11:
                    {
                    int LA1_9 = input.LA(3);

                    if ( (LA1_9==17) ) {
                        alt1=13;
                    }
                    else if ( (LA1_9==EOF||(LA1_9>=RULE_ID && LA1_9<=RULE_STRING)||LA1_9==15) ) {
                        alt1=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10==17) ) {
                        alt1=13;
                    }
                    else if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||LA1_10==15) ) {
                        alt1=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_11 = input.LA(3);

                    if ( (LA1_11==EOF||(LA1_11>=RULE_ID && LA1_11<=RULE_STRING)||LA1_11==15) ) {
                        alt1=3;
                    }
                    else if ( (LA1_11==17) ) {
                        alt1=13;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12==17) ) {
                        alt1=13;
                    }
                    else if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||LA1_12==15) ) {
                        alt1=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==16) ) {
                        int LA1_29 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||LA1_13==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_14==17) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 12:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_14==17) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                case 17:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==16) ) {
                        int LA1_29 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||LA1_13==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_14==17) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                case 17:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==16) ) {
                        int LA1_29 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||LA1_13==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13==16) ) {
                        int LA1_29 = input.LA(4);

                        if ( (synpred10()) ) {
                            alt1=10;
                        }
                        else if ( (true) ) {
                            alt1=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||LA1_13==15) ) {
                        alt1=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    int LA1_14 = input.LA(3);

                    if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==15) ) {
                        alt1=5;
                    }
                    else if ( (LA1_14==17) ) {
                        alt1=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16==EOF||(LA1_16>=RULE_ID && LA1_16<=RULE_STRING)||LA1_16==15) ) {
                        alt1=8;
                    }
                    else if ( ((LA1_16>=11 && LA1_16<=14)) ) {
                        alt1=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case 15:
                    {
                    alt1=7;
                    }
                    break;
                case 11:
                    {
                    int LA1_18 = input.LA(3);

                    if ( (LA1_18==EOF||(LA1_18>=RULE_ID && LA1_18<=RULE_STRING)||LA1_18==15) ) {
                        alt1=9;
                    }
                    else if ( (LA1_18==16) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 12:
                    {
                    int LA1_19 = input.LA(3);

                    if ( (LA1_19==16) ) {
                        alt1=15;
                    }
                    else if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==15) ) {
                        alt1=9;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==15) ) {
                        alt1=9;
                    }
                    else if ( (LA1_20==16) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_21 = input.LA(3);

                    if ( (LA1_21==EOF||(LA1_21>=RULE_ID && LA1_21<=RULE_STRING)||LA1_21==15) ) {
                        alt1=9;
                    }
                    else if ( (LA1_21==16) ) {
                        alt1=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 21, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("108:1: rule__State__Alternatives_0 : ( ( ( rule__State__IsInitialAssignment_0_0 ) ) | ( ( rule__State__Group_0_1__0 ) ) | ( ( rule__State__Group_0_2__0 ) ) | ( ( rule__State__StateKindAssignment_0_3 ) ) | ( ( rule__State__Group_0_4__0 ) ) | ( ( rule__State__Group_0_5__0 ) ) | ( ( rule__State__IsFinalAssignment_0_6 ) ) | ( ( rule__State__Group_0_7__0 ) ) | ( ( rule__State__Group_0_8__0 ) ) | ( ( rule__State__Group_0_9__0 ) ) | ( ( rule__State__Group_0_10__0 ) ) | ( ( rule__State__Group_0_11__0 ) ) | ( ( rule__State__Group_0_12__0 ) ) | ( ( rule__State__Group_0_13__0 ) ) | ( ( rule__State__Group_0_14__0 ) ) | ( ( rule__State__Group_0_15__0 ) ) | ( ( rule__State__Group_0_16__0 ) ) );", 1, 0, input);

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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:119:6: ( ( rule__State__Group_0_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:119:6: ( ( rule__State__Group_0_1__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:120:1: ( rule__State__Group_0_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:121:1: ( rule__State__Group_0_1__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:121:2: rule__State__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_1__0_in_rule__State__Alternatives_0196);
                    rule__State__Group_0_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:6: ( ( rule__State__Group_0_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:125:6: ( ( rule__State__Group_0_2__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:126:1: ( rule__State__Group_0_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:1: ( rule__State__Group_0_2__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:127:2: rule__State__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_2__0_in_rule__State__Alternatives_0214);
                    rule__State__Group_0_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:131:6: ( ( rule__State__StateKindAssignment_0_3 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:131:6: ( ( rule__State__StateKindAssignment_0_3 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:132:1: ( rule__State__StateKindAssignment_0_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getStateKindAssignment_0_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:133:1: ( rule__State__StateKindAssignment_0_3 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:133:2: rule__State__StateKindAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__State__StateKindAssignment_0_3_in_rule__State__Alternatives_0232);
                    rule__State__StateKindAssignment_0_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getStateKindAssignment_0_3()); 
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:149:6: ( ( rule__State__IsFinalAssignment_0_6 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:149:6: ( ( rule__State__IsFinalAssignment_0_6 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:150:1: ( rule__State__IsFinalAssignment_0_6 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getIsFinalAssignment_0_6()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:151:1: ( rule__State__IsFinalAssignment_0_6 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:151:2: rule__State__IsFinalAssignment_0_6
                    {
                    pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_6_in_rule__State__Alternatives_0286);
                    rule__State__IsFinalAssignment_0_6();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getIsFinalAssignment_0_6()); 
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
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:203:6: ( ( rule__State__Group_0_15__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:203:6: ( ( rule__State__Group_0_15__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:204:1: ( rule__State__Group_0_15__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_15()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:205:1: ( rule__State__Group_0_15__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:205:2: rule__State__Group_0_15__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_15__0_in_rule__State__Alternatives_0448);
                    rule__State__Group_0_15__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:209:6: ( ( rule__State__Group_0_16__0 ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:209:6: ( ( rule__State__Group_0_16__0 ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:210:1: ( rule__State__Group_0_16__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateAccess().getGroup_0_16()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:211:1: ( rule__State__Group_0_16__0 )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:211:2: rule__State__Group_0_16__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0_16__0_in_rule__State__Alternatives_0466);
                    rule__State__Group_0_16__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateAccess().getGroup_0_16()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:220:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:224:1: ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) )
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
                    new NoViableAltException("220:1: rule__StateType__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'cond' ) ) | ( ( 'reference' ) ) | ( ( 'textual' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:225:1: ( ( 'NORMAL' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:225:1: ( ( 'NORMAL' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:226:1: ( 'NORMAL' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:1: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:227:3: 'NORMAL'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives500); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:232:6: ( ( 'cond' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:232:6: ( ( 'cond' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:233:1: ( 'cond' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:1: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:234:3: 'cond'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives521); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:239:6: ( ( 'reference' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:239:6: ( ( 'reference' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:240:1: ( 'reference' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:241:1: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:241:3: 'reference'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives542); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:246:6: ( ( 'textual' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:246:6: ( ( 'textual' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:247:1: ( 'textual' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:248:1: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:248:3: 'textual'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives563); if (failed) return ;

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:260:1: rule__State__Group__0 : ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:264:1: ( ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:1: ( ( rule__State__Alternatives_0 )? ) rule__State__Group__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:265:1: ( ( rule__State__Alternatives_0 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:266:1: ( rule__State__Alternatives_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:267:1: ( rule__State__Alternatives_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=14)||(LA3_0>=16 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:267:2: rule__State__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0600);
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

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__0610);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:278:1: rule__State__Group__1 : ( ( 'state' )? ) rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:282:1: ( ( ( 'state' )? ) rule__State__Group__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:1: ( ( 'state' )? ) rule__State__Group__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:283:1: ( ( 'state' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:284:1: ( 'state' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:285:1: ( 'state' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:286:2: 'state'
                    {
                    match(input,15,FOLLOW_15_in_rule__State__Group__1640); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__1652);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:298:1: rule__State__Group__2 : ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:302:1: ( ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:303:1: ( ( rule__State__StateNameAssignment_2 )? ) rule__State__Group__3
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:303:1: ( ( rule__State__StateNameAssignment_2 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:304:1: ( rule__State__StateNameAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameAssignment_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:305:1: ( rule__State__StateNameAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:305:2: rule__State__StateNameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__2680);
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

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__2690);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:316:1: rule__State__Group__3 : ( ( rule__State__LabelAssignment_3 )? ) ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:320:1: ( ( ( rule__State__LabelAssignment_3 )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:321:1: ( ( rule__State__LabelAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:321:1: ( ( rule__State__LabelAssignment_3 )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:322:1: ( rule__State__LabelAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelAssignment_3()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:323:1: ( rule__State__LabelAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:323:2: rule__State__LabelAssignment_3
                    {
                    pushFollow(FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__3718);
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


    // $ANTLR start rule__State__Group_0_1__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:341:1: rule__State__Group_0_1__0 : ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1 ;
    public final void rule__State__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:345:1: ( ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:346:1: ( ( rule__State__IsInitialAssignment_0_1_0 ) ) rule__State__Group_0_1__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:346:1: ( ( rule__State__IsInitialAssignment_0_1_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:347:1: ( rule__State__IsInitialAssignment_0_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:1: ( rule__State__IsInitialAssignment_0_1_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:348:2: rule__State__IsInitialAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_1_0_in_rule__State__Group_0_1__0761);
            rule__State__IsInitialAssignment_0_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_1__1_in_rule__State__Group_0_1__0770);
            rule__State__Group_0_1__1();
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
    // $ANTLR end rule__State__Group_0_1__0


    // $ANTLR start rule__State__Group_0_1__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:359:1: rule__State__Group_0_1__1 : ( ( rule__State__IsFinalAssignment_0_1_1 ) ) ;
    public final void rule__State__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:363:1: ( ( ( rule__State__IsFinalAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:364:1: ( ( rule__State__IsFinalAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:364:1: ( ( rule__State__IsFinalAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:365:1: ( rule__State__IsFinalAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:366:1: ( rule__State__IsFinalAssignment_0_1_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:366:2: rule__State__IsFinalAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_1_1_in_rule__State__Group_0_1__1798);
            rule__State__IsFinalAssignment_0_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_1_1()); 
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
    // $ANTLR end rule__State__Group_0_1__1


    // $ANTLR start rule__State__Group_0_2__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:380:1: rule__State__Group_0_2__0 : ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1 ;
    public final void rule__State__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:384:1: ( ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:385:1: ( ( rule__State__IsInitialAssignment_0_2_0 ) ) rule__State__Group_0_2__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:385:1: ( ( rule__State__IsInitialAssignment_0_2_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:386:1: ( rule__State__IsInitialAssignment_0_2_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:387:1: ( rule__State__IsInitialAssignment_0_2_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:387:2: rule__State__IsInitialAssignment_0_2_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_2_0_in_rule__State__Group_0_2__0836);
            rule__State__IsInitialAssignment_0_2_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__0845);
            rule__State__Group_0_2__1();
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
    // $ANTLR end rule__State__Group_0_2__0


    // $ANTLR start rule__State__Group_0_2__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:398:1: rule__State__Group_0_2__1 : ( ( rule__State__StateKindAssignment_0_2_1 ) ) ;
    public final void rule__State__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:402:1: ( ( ( rule__State__StateKindAssignment_0_2_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:403:1: ( ( rule__State__StateKindAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:403:1: ( ( rule__State__StateKindAssignment_0_2_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:404:1: ( rule__State__StateKindAssignment_0_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_2_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:405:1: ( rule__State__StateKindAssignment_0_2_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:405:2: rule__State__StateKindAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_2_1_in_rule__State__Group_0_2__1873);
            rule__State__StateKindAssignment_0_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_2_1()); 
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
    // $ANTLR end rule__State__Group_0_2__1


    // $ANTLR start rule__State__Group_0_4__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:419:1: rule__State__Group_0_4__0 : ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1 ;
    public final void rule__State__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:423:1: ( ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:1: ( ( rule__State__StateKindAssignment_0_4_0 ) ) rule__State__Group_0_4__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:424:1: ( ( rule__State__StateKindAssignment_0_4_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:425:1: ( rule__State__StateKindAssignment_0_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_4_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:426:1: ( rule__State__StateKindAssignment_0_4_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:426:2: rule__State__StateKindAssignment_0_4_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_4_0_in_rule__State__Group_0_4__0911);
            rule__State__StateKindAssignment_0_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__0920);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:437:1: rule__State__Group_0_4__1 : ( ( rule__State__IsInitialAssignment_0_4_1 ) ) ;
    public final void rule__State__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:441:1: ( ( ( rule__State__IsInitialAssignment_0_4_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:442:1: ( ( rule__State__IsInitialAssignment_0_4_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:442:1: ( ( rule__State__IsInitialAssignment_0_4_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:443:1: ( rule__State__IsInitialAssignment_0_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:444:1: ( rule__State__IsInitialAssignment_0_4_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:444:2: rule__State__IsInitialAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_4_1_in_rule__State__Group_0_4__1948);
            rule__State__IsInitialAssignment_0_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_4_1()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:458:1: rule__State__Group_0_5__0 : ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1 ;
    public final void rule__State__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:462:1: ( ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:463:1: ( ( rule__State__StateKindAssignment_0_5_0 ) ) rule__State__Group_0_5__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:463:1: ( ( rule__State__StateKindAssignment_0_5_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:464:1: ( rule__State__StateKindAssignment_0_5_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_5_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:465:1: ( rule__State__StateKindAssignment_0_5_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:465:2: rule__State__StateKindAssignment_0_5_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_5_0_in_rule__State__Group_0_5__0986);
            rule__State__StateKindAssignment_0_5_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_5_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__0995);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:476:1: rule__State__Group_0_5__1 : ( ( rule__State__IsFinalAssignment_0_5_1 ) ) ;
    public final void rule__State__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:480:1: ( ( ( rule__State__IsFinalAssignment_0_5_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:481:1: ( ( rule__State__IsFinalAssignment_0_5_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:481:1: ( ( rule__State__IsFinalAssignment_0_5_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:482:1: ( rule__State__IsFinalAssignment_0_5_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:483:1: ( rule__State__IsFinalAssignment_0_5_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:483:2: rule__State__IsFinalAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_5_1_in_rule__State__Group_0_5__11023);
            rule__State__IsFinalAssignment_0_5_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_5_1()); 
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


    // $ANTLR start rule__State__Group_0_7__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:497:1: rule__State__Group_0_7__0 : ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1 ;
    public final void rule__State__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:501:1: ( ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: ( ( rule__State__IsFinalAssignment_0_7_0 ) ) rule__State__Group_0_7__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:502:1: ( ( rule__State__IsFinalAssignment_0_7_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:503:1: ( rule__State__IsFinalAssignment_0_7_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_7_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:504:1: ( rule__State__IsFinalAssignment_0_7_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:504:2: rule__State__IsFinalAssignment_0_7_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_7_0_in_rule__State__Group_0_7__01061);
            rule__State__IsFinalAssignment_0_7_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_7_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01070);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:515:1: rule__State__Group_0_7__1 : ( ( rule__State__IsInitialAssignment_0_7_1 ) ) ;
    public final void rule__State__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:519:1: ( ( ( rule__State__IsInitialAssignment_0_7_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:520:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:520:1: ( ( rule__State__IsInitialAssignment_0_7_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:521:1: ( rule__State__IsInitialAssignment_0_7_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_7_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:1: ( rule__State__IsInitialAssignment_0_7_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:522:2: rule__State__IsInitialAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11098);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:536:1: rule__State__Group_0_8__0 : ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1 ;
    public final void rule__State__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:540:1: ( ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( ( rule__State__IsFinalAssignment_0_8_0 ) ) rule__State__Group_0_8__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:541:1: ( ( rule__State__IsFinalAssignment_0_8_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:542:1: ( rule__State__IsFinalAssignment_0_8_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:543:1: ( rule__State__IsFinalAssignment_0_8_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:543:2: rule__State__IsFinalAssignment_0_8_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_8_0_in_rule__State__Group_0_8__01136);
            rule__State__IsFinalAssignment_0_8_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_8_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01145);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:554:1: rule__State__Group_0_8__1 : ( ( rule__State__StateKindAssignment_0_8_1 ) ) ;
    public final void rule__State__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:558:1: ( ( ( rule__State__StateKindAssignment_0_8_1 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__State__StateKindAssignment_0_8_1 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:559:1: ( ( rule__State__StateKindAssignment_0_8_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:560:1: ( rule__State__StateKindAssignment_0_8_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_8_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:1: ( rule__State__StateKindAssignment_0_8_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:561:2: rule__State__StateKindAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_8_1_in_rule__State__Group_0_8__11173);
            rule__State__StateKindAssignment_0_8_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_8_1()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:575:1: rule__State__Group_0_9__0 : ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1 ;
    public final void rule__State__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:579:1: ( ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: ( ( rule__State__StateKindAssignment_0_9_0 ) ) rule__State__Group_0_9__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:580:1: ( ( rule__State__StateKindAssignment_0_9_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:581:1: ( rule__State__StateKindAssignment_0_9_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_9_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:582:1: ( rule__State__StateKindAssignment_0_9_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:582:2: rule__State__StateKindAssignment_0_9_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_9_0_in_rule__State__Group_0_9__01211);
            rule__State__StateKindAssignment_0_9_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_9_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01220);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:593:1: rule__State__Group_0_9__1 : ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 ;
    public final void rule__State__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:597:1: ( ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:598:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) ) rule__State__Group_0_9__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:598:1: ( ( rule__State__IsFinalAssignment_0_9_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:599:1: ( rule__State__IsFinalAssignment_0_9_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:600:1: ( rule__State__IsFinalAssignment_0_9_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:600:2: rule__State__IsFinalAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11248);
            rule__State__IsFinalAssignment_0_9_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_9_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11257);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:611:1: rule__State__Group_0_9__2 : ( ( rule__State__IsInitialAssignment_0_9_2 ) ) ;
    public final void rule__State__Group_0_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:615:1: ( ( ( rule__State__IsInitialAssignment_0_9_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:616:1: ( ( rule__State__IsInitialAssignment_0_9_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:616:1: ( ( rule__State__IsInitialAssignment_0_9_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:617:1: ( rule__State__IsInitialAssignment_0_9_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:618:1: ( rule__State__IsInitialAssignment_0_9_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:618:2: rule__State__IsInitialAssignment_0_9_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_9_2_in_rule__State__Group_0_9__21285);
            rule__State__IsInitialAssignment_0_9_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_9_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:634:1: rule__State__Group_0_10__0 : ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 ;
    public final void rule__State__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:638:1: ( ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) ) rule__State__Group_0_10__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:639:1: ( ( rule__State__IsInitialAssignment_0_10_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:640:1: ( rule__State__IsInitialAssignment_0_10_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:641:1: ( rule__State__IsInitialAssignment_0_10_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:641:2: rule__State__IsInitialAssignment_0_10_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01325);
            rule__State__IsInitialAssignment_0_10_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_10_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01334);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:652:1: rule__State__Group_0_10__1 : ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2 ;
    public final void rule__State__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:656:1: ( ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:657:1: ( ( rule__State__IsFinalAssignment_0_10_1 ) ) rule__State__Group_0_10__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:657:1: ( ( rule__State__IsFinalAssignment_0_10_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:658:1: ( rule__State__IsFinalAssignment_0_10_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:659:1: ( rule__State__IsFinalAssignment_0_10_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:659:2: rule__State__IsFinalAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_10_1_in_rule__State__Group_0_10__11362);
            rule__State__IsFinalAssignment_0_10_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_10_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11371);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:670:1: rule__State__Group_0_10__2 : ( ( rule__State__StateKindAssignment_0_10_2 ) ) ;
    public final void rule__State__Group_0_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:674:1: ( ( ( rule__State__StateKindAssignment_0_10_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:675:1: ( ( rule__State__StateKindAssignment_0_10_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:675:1: ( ( rule__State__StateKindAssignment_0_10_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:676:1: ( rule__State__StateKindAssignment_0_10_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_10_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:677:1: ( rule__State__StateKindAssignment_0_10_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:677:2: rule__State__StateKindAssignment_0_10_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_10_2_in_rule__State__Group_0_10__21399);
            rule__State__StateKindAssignment_0_10_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_10_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:693:1: rule__State__Group_0_11__0 : ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1 ;
    public final void rule__State__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:697:1: ( ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:1: ( ( rule__State__IsInitialAssignment_0_11_0 ) ) rule__State__Group_0_11__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:698:1: ( ( rule__State__IsInitialAssignment_0_11_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:699:1: ( rule__State__IsInitialAssignment_0_11_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:700:1: ( rule__State__IsInitialAssignment_0_11_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:700:2: rule__State__IsInitialAssignment_0_11_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_11_0_in_rule__State__Group_0_11__01439);
            rule__State__IsInitialAssignment_0_11_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_11_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01448);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:711:1: rule__State__Group_0_11__1 : ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2 ;
    public final void rule__State__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:715:1: ( ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:716:1: ( ( rule__State__IsFinalAssignment_0_11_1 ) ) rule__State__Group_0_11__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:716:1: ( ( rule__State__IsFinalAssignment_0_11_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:717:1: ( rule__State__IsFinalAssignment_0_11_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:718:1: ( rule__State__IsFinalAssignment_0_11_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:718:2: rule__State__IsFinalAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_11_1_in_rule__State__Group_0_11__11476);
            rule__State__IsFinalAssignment_0_11_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_11_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11485);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:729:1: rule__State__Group_0_11__2 : ( ( rule__State__StateKindAssignment_0_11_2 ) ) ;
    public final void rule__State__Group_0_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:733:1: ( ( ( rule__State__StateKindAssignment_0_11_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:734:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:734:1: ( ( rule__State__StateKindAssignment_0_11_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:735:1: ( rule__State__StateKindAssignment_0_11_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_11_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:736:1: ( rule__State__StateKindAssignment_0_11_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:736:2: rule__State__StateKindAssignment_0_11_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21513);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:752:1: rule__State__Group_0_12__0 : ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1 ;
    public final void rule__State__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:756:1: ( ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:757:1: ( ( rule__State__IsInitialAssignment_0_12_0 ) ) rule__State__Group_0_12__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:757:1: ( ( rule__State__IsInitialAssignment_0_12_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:758:1: ( rule__State__IsInitialAssignment_0_12_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:759:1: ( rule__State__IsInitialAssignment_0_12_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:759:2: rule__State__IsInitialAssignment_0_12_0
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_12_0_in_rule__State__Group_0_12__01553);
            rule__State__IsInitialAssignment_0_12_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_12_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01562);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:770:1: rule__State__Group_0_12__1 : ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 ;
    public final void rule__State__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:774:1: ( ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:775:1: ( ( rule__State__StateKindAssignment_0_12_1 ) ) rule__State__Group_0_12__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:775:1: ( ( rule__State__StateKindAssignment_0_12_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:776:1: ( rule__State__StateKindAssignment_0_12_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:777:1: ( rule__State__StateKindAssignment_0_12_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:777:2: rule__State__StateKindAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11590);
            rule__State__StateKindAssignment_0_12_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_12_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11599);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:788:1: rule__State__Group_0_12__2 : ( ( rule__State__IsFinalAssignment_0_12_2 ) ) ;
    public final void rule__State__Group_0_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:792:1: ( ( ( rule__State__IsFinalAssignment_0_12_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:793:1: ( ( rule__State__IsFinalAssignment_0_12_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:793:1: ( ( rule__State__IsFinalAssignment_0_12_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:794:1: ( rule__State__IsFinalAssignment_0_12_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:795:1: ( rule__State__IsFinalAssignment_0_12_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:795:2: rule__State__IsFinalAssignment_0_12_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_12_2_in_rule__State__Group_0_12__21627);
            rule__State__IsFinalAssignment_0_12_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_12_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:811:1: rule__State__Group_0_13__0 : ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1 ;
    public final void rule__State__Group_0_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:815:1: ( ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:816:1: ( ( rule__State__IsFinalAssignment_0_13_0 ) ) rule__State__Group_0_13__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:816:1: ( ( rule__State__IsFinalAssignment_0_13_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:817:1: ( rule__State__IsFinalAssignment_0_13_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:818:1: ( rule__State__IsFinalAssignment_0_13_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:818:2: rule__State__IsFinalAssignment_0_13_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_13_0_in_rule__State__Group_0_13__01667);
            rule__State__IsFinalAssignment_0_13_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_13_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01676);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:829:1: rule__State__Group_0_13__1 : ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2 ;
    public final void rule__State__Group_0_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:833:1: ( ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:834:1: ( ( rule__State__IsInitialAssignment_0_13_1 ) ) rule__State__Group_0_13__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:834:1: ( ( rule__State__IsInitialAssignment_0_13_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:835:1: ( rule__State__IsInitialAssignment_0_13_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:836:1: ( rule__State__IsInitialAssignment_0_13_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:836:2: rule__State__IsInitialAssignment_0_13_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_13_1_in_rule__State__Group_0_13__11704);
            rule__State__IsInitialAssignment_0_13_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_13_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__11713);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:847:1: rule__State__Group_0_13__2 : ( ( rule__State__StateKindAssignment_0_13_2 ) ) ;
    public final void rule__State__Group_0_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:851:1: ( ( ( rule__State__StateKindAssignment_0_13_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:852:1: ( ( rule__State__StateKindAssignment_0_13_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:852:1: ( ( rule__State__StateKindAssignment_0_13_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:853:1: ( rule__State__StateKindAssignment_0_13_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_13_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:854:1: ( rule__State__StateKindAssignment_0_13_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:854:2: rule__State__StateKindAssignment_0_13_2
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_13_2_in_rule__State__Group_0_13__21741);
            rule__State__StateKindAssignment_0_13_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_13_2()); 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:870:1: rule__State__Group_0_14__0 : ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1 ;
    public final void rule__State__Group_0_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:874:1: ( ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:875:1: ( ( rule__State__IsFinalAssignment_0_14_0 ) ) rule__State__Group_0_14__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:875:1: ( ( rule__State__IsFinalAssignment_0_14_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:876:1: ( rule__State__IsFinalAssignment_0_14_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:877:1: ( rule__State__IsFinalAssignment_0_14_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:877:2: rule__State__IsFinalAssignment_0_14_0
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_14_0_in_rule__State__Group_0_14__01781);
            rule__State__IsFinalAssignment_0_14_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_14_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__01790);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:888:1: rule__State__Group_0_14__1 : ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2 ;
    public final void rule__State__Group_0_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:892:1: ( ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:893:1: ( ( rule__State__StateKindAssignment_0_14_1 ) ) rule__State__Group_0_14__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:893:1: ( ( rule__State__StateKindAssignment_0_14_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:894:1: ( rule__State__StateKindAssignment_0_14_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_14_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:895:1: ( rule__State__StateKindAssignment_0_14_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:895:2: rule__State__StateKindAssignment_0_14_1
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_14_1_in_rule__State__Group_0_14__11818);
            rule__State__StateKindAssignment_0_14_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_14_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__11827);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:906:1: rule__State__Group_0_14__2 : ( ( rule__State__IsInitialAssignment_0_14_2 ) ) ;
    public final void rule__State__Group_0_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:910:1: ( ( ( rule__State__IsInitialAssignment_0_14_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:911:1: ( ( rule__State__IsInitialAssignment_0_14_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:911:1: ( ( rule__State__IsInitialAssignment_0_14_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:912:1: ( rule__State__IsInitialAssignment_0_14_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:1: ( rule__State__IsInitialAssignment_0_14_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:913:2: rule__State__IsInitialAssignment_0_14_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_14_2_in_rule__State__Group_0_14__21855);
            rule__State__IsInitialAssignment_0_14_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_14_2()); 
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


    // $ANTLR start rule__State__Group_0_15__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:929:1: rule__State__Group_0_15__0 : ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1 ;
    public final void rule__State__Group_0_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:933:1: ( ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:934:1: ( ( rule__State__StateKindAssignment_0_15_0 ) ) rule__State__Group_0_15__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:934:1: ( ( rule__State__StateKindAssignment_0_15_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:935:1: ( rule__State__StateKindAssignment_0_15_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_15_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:936:1: ( rule__State__StateKindAssignment_0_15_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:936:2: rule__State__StateKindAssignment_0_15_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_15_0_in_rule__State__Group_0_15__01895);
            rule__State__StateKindAssignment_0_15_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_15_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_15__1_in_rule__State__Group_0_15__01904);
            rule__State__Group_0_15__1();
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
    // $ANTLR end rule__State__Group_0_15__0


    // $ANTLR start rule__State__Group_0_15__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:947:1: rule__State__Group_0_15__1 : ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2 ;
    public final void rule__State__Group_0_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:951:1: ( ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:952:1: ( ( rule__State__IsInitialAssignment_0_15_1 ) ) rule__State__Group_0_15__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:952:1: ( ( rule__State__IsInitialAssignment_0_15_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:953:1: ( rule__State__IsInitialAssignment_0_15_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_15_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:954:1: ( rule__State__IsInitialAssignment_0_15_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:954:2: rule__State__IsInitialAssignment_0_15_1
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_15_1_in_rule__State__Group_0_15__11932);
            rule__State__IsInitialAssignment_0_15_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_15_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_15__2_in_rule__State__Group_0_15__11941);
            rule__State__Group_0_15__2();
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
    // $ANTLR end rule__State__Group_0_15__1


    // $ANTLR start rule__State__Group_0_15__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:965:1: rule__State__Group_0_15__2 : ( ( rule__State__IsFinalAssignment_0_15_2 ) ) ;
    public final void rule__State__Group_0_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:969:1: ( ( ( rule__State__IsFinalAssignment_0_15_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:970:1: ( ( rule__State__IsFinalAssignment_0_15_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:970:1: ( ( rule__State__IsFinalAssignment_0_15_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:971:1: ( rule__State__IsFinalAssignment_0_15_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_15_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:1: ( rule__State__IsFinalAssignment_0_15_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:972:2: rule__State__IsFinalAssignment_0_15_2
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_15_2_in_rule__State__Group_0_15__21969);
            rule__State__IsFinalAssignment_0_15_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_15_2()); 
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
    // $ANTLR end rule__State__Group_0_15__2


    // $ANTLR start rule__State__Group_0_16__0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:988:1: rule__State__Group_0_16__0 : ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1 ;
    public final void rule__State__Group_0_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:992:1: ( ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:1: ( ( rule__State__StateKindAssignment_0_16_0 ) ) rule__State__Group_0_16__1
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:993:1: ( ( rule__State__StateKindAssignment_0_16_0 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:994:1: ( rule__State__StateKindAssignment_0_16_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindAssignment_0_16_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:995:1: ( rule__State__StateKindAssignment_0_16_0 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:995:2: rule__State__StateKindAssignment_0_16_0
            {
            pushFollow(FOLLOW_rule__State__StateKindAssignment_0_16_0_in_rule__State__Group_0_16__02009);
            rule__State__StateKindAssignment_0_16_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindAssignment_0_16_0()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_16__1_in_rule__State__Group_0_16__02018);
            rule__State__Group_0_16__1();
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
    // $ANTLR end rule__State__Group_0_16__0


    // $ANTLR start rule__State__Group_0_16__1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1006:1: rule__State__Group_0_16__1 : ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2 ;
    public final void rule__State__Group_0_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1010:1: ( ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1011:1: ( ( rule__State__IsFinalAssignment_0_16_1 ) ) rule__State__Group_0_16__2
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1011:1: ( ( rule__State__IsFinalAssignment_0_16_1 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1012:1: ( rule__State__IsFinalAssignment_0_16_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalAssignment_0_16_1()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1013:1: ( rule__State__IsFinalAssignment_0_16_1 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1013:2: rule__State__IsFinalAssignment_0_16_1
            {
            pushFollow(FOLLOW_rule__State__IsFinalAssignment_0_16_1_in_rule__State__Group_0_16__12046);
            rule__State__IsFinalAssignment_0_16_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalAssignment_0_16_1()); 
            }

            }

            pushFollow(FOLLOW_rule__State__Group_0_16__2_in_rule__State__Group_0_16__12055);
            rule__State__Group_0_16__2();
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
    // $ANTLR end rule__State__Group_0_16__1


    // $ANTLR start rule__State__Group_0_16__2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1024:1: rule__State__Group_0_16__2 : ( ( rule__State__IsInitialAssignment_0_16_2 ) ) ;
    public final void rule__State__Group_0_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1028:1: ( ( ( rule__State__IsInitialAssignment_0_16_2 ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1029:1: ( ( rule__State__IsInitialAssignment_0_16_2 ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1029:1: ( ( rule__State__IsInitialAssignment_0_16_2 ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1030:1: ( rule__State__IsInitialAssignment_0_16_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialAssignment_0_16_2()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:1: ( rule__State__IsInitialAssignment_0_16_2 )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1031:2: rule__State__IsInitialAssignment_0_16_2
            {
            pushFollow(FOLLOW_rule__State__IsInitialAssignment_0_16_2_in_rule__State__Group_0_16__22083);
            rule__State__IsInitialAssignment_0_16_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialAssignment_0_16_2()); 
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
    // $ANTLR end rule__State__Group_0_16__2


    // $ANTLR start rule__State__IsInitialAssignment_0_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1050:1: rule__State__IsInitialAssignment_0_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1054:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1055:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1056:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1057:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1058:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_02131); if (failed) return ;
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


    // $ANTLR start rule__State__IsInitialAssignment_0_1_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1073:1: rule__State__IsInitialAssignment_0_1_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1077:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1078:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1078:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1079:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1080:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1081:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_1_02175); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_1_0


    // $ANTLR start rule__State__IsFinalAssignment_0_1_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1096:1: rule__State__IsFinalAssignment_0_1_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1100:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1101:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1101:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1102:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1103:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1104:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_1_12219); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_1_1


    // $ANTLR start rule__State__IsInitialAssignment_0_2_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1119:1: rule__State__IsInitialAssignment_0_2_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1123:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1124:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1124:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1125:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1126:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1127:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_2_02263); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_2_0


    // $ANTLR start rule__State__StateKindAssignment_0_2_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1142:1: rule__State__StateKindAssignment_0_2_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1146:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1147:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1147:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1148:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_2_12302);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_2_1


    // $ANTLR start rule__State__StateKindAssignment_0_3
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1157:1: rule__State__StateKindAssignment_0_3 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1161:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1162:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1162:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1163:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_32333);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_3_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_3


    // $ANTLR start rule__State__StateKindAssignment_0_4_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1172:1: rule__State__StateKindAssignment_0_4_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1176:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1177:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1177:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1178:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_02364);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_4_0


    // $ANTLR start rule__State__IsInitialAssignment_0_4_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1187:1: rule__State__IsInitialAssignment_0_4_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1191:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1192:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1192:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1193:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1194:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1195:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_4_12400); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_4_1


    // $ANTLR start rule__State__StateKindAssignment_0_5_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1210:1: rule__State__StateKindAssignment_0_5_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1214:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1215:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1215:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1216:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_5_02439);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_5_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_5_0


    // $ANTLR start rule__State__IsFinalAssignment_0_5_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1225:1: rule__State__IsFinalAssignment_0_5_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1229:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1230:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1231:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1232:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1233:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_5_12475); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_5_1


    // $ANTLR start rule__State__IsFinalAssignment_0_6
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1248:1: rule__State__IsFinalAssignment_0_6 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1252:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1253:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1254:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1255:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1256:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_62519); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_6


    // $ANTLR start rule__State__IsFinalAssignment_0_7_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1271:1: rule__State__IsFinalAssignment_0_7_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1275:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1276:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1276:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1277:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1278:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1279:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_7_02563); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_7_0


    // $ANTLR start rule__State__IsInitialAssignment_0_7_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1294:1: rule__State__IsInitialAssignment_0_7_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1298:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1299:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1299:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1300:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1301:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1302:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_7_12607); if (failed) return ;
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


    // $ANTLR start rule__State__IsFinalAssignment_0_8_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1317:1: rule__State__IsFinalAssignment_0_8_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1321:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1322:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1322:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1323:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1324:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1325:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_8_02651); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_8_0


    // $ANTLR start rule__State__StateKindAssignment_0_8_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1340:1: rule__State__StateKindAssignment_0_8_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1344:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1345:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1345:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1346:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_12690);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_8_1


    // $ANTLR start rule__State__StateKindAssignment_0_9_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1355:1: rule__State__StateKindAssignment_0_9_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1359:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1360:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1360:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1361:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_02721);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_9_0


    // $ANTLR start rule__State__IsFinalAssignment_0_9_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1370:1: rule__State__IsFinalAssignment_0_9_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1374:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1375:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1376:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1377:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1378:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_9_12757); if (failed) return ;
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


    // $ANTLR start rule__State__IsInitialAssignment_0_9_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1393:1: rule__State__IsInitialAssignment_0_9_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1397:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1398:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1398:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1399:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1400:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1401:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_9_22801); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_9_2


    // $ANTLR start rule__State__IsInitialAssignment_0_10_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1416:1: rule__State__IsInitialAssignment_0_10_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1420:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1421:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1421:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1422:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1423:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1424:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_10_02845); if (failed) return ;
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


    // $ANTLR start rule__State__IsFinalAssignment_0_10_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1439:1: rule__State__IsFinalAssignment_0_10_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1443:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1444:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1445:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1446:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1447:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_10_12889); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_10_1


    // $ANTLR start rule__State__StateKindAssignment_0_10_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1462:1: rule__State__StateKindAssignment_0_10_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1466:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1467:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1467:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1468:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_22928);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_10_2


    // $ANTLR start rule__State__IsInitialAssignment_0_11_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1477:1: rule__State__IsInitialAssignment_0_11_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1481:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1482:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1483:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1484:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1485:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_11_02964); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_11_0


    // $ANTLR start rule__State__IsFinalAssignment_0_11_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1500:1: rule__State__IsFinalAssignment_0_11_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1504:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1505:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1505:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1506:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1507:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1508:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_11_13008); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_11_1


    // $ANTLR start rule__State__StateKindAssignment_0_11_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1523:1: rule__State__StateKindAssignment_0_11_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1527:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1528:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1528:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1529:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23047);
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


    // $ANTLR start rule__State__IsInitialAssignment_0_12_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1538:1: rule__State__IsInitialAssignment_0_12_0 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1542:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1543:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1543:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1544:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1545:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1546:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_12_03083); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_12_0


    // $ANTLR start rule__State__StateKindAssignment_0_12_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1561:1: rule__State__StateKindAssignment_0_12_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1565:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1566:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1566:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1567:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13122);
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


    // $ANTLR start rule__State__IsFinalAssignment_0_12_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1576:1: rule__State__IsFinalAssignment_0_12_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1580:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1581:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1581:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1582:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1583:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1584:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_12_23158); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_12_2


    // $ANTLR start rule__State__IsFinalAssignment_0_13_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1599:1: rule__State__IsFinalAssignment_0_13_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1603:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1604:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1604:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1605:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1606:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1607:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_13_03202); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_13_0


    // $ANTLR start rule__State__IsInitialAssignment_0_13_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1622:1: rule__State__IsInitialAssignment_0_13_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1626:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1627:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1627:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1628:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1629:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1630:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_13_13246); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_13_1


    // $ANTLR start rule__State__StateKindAssignment_0_13_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1645:1: rule__State__StateKindAssignment_0_13_2 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1649:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1650:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1650:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1651:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_2_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_23285);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_2_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_13_2


    // $ANTLR start rule__State__IsFinalAssignment_0_14_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1660:1: rule__State__IsFinalAssignment_0_14_0 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1664:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1665:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1665:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1666:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1667:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1668:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_14_03321); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_14_0


    // $ANTLR start rule__State__StateKindAssignment_0_14_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1683:1: rule__State__StateKindAssignment_0_14_1 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1687:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1688:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1688:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1689:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_1_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_13360);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_1_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_14_1


    // $ANTLR start rule__State__IsInitialAssignment_0_14_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1698:1: rule__State__IsInitialAssignment_0_14_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1702:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1703:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1703:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1704:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1705:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1706:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_14_23396); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_14_2


    // $ANTLR start rule__State__StateKindAssignment_0_15_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1721:1: rule__State__StateKindAssignment_0_15_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1725:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1726:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1726:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1727:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_15_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_15_03435);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_15_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_15_0


    // $ANTLR start rule__State__IsInitialAssignment_0_15_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1736:1: rule__State__IsInitialAssignment_0_15_1 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1740:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1741:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1741:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1742:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1743:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1744:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_15_13471); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_15_1


    // $ANTLR start rule__State__IsFinalAssignment_0_15_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1759:1: rule__State__IsFinalAssignment_0_15_2 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1763:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1764:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1764:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1765:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1766:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1767:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_15_23515); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_15_2


    // $ANTLR start rule__State__StateKindAssignment_0_16_0
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1782:1: rule__State__StateKindAssignment_0_16_0 : ( ruleStateType ) ;
    public final void rule__State__StateKindAssignment_0_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1786:1: ( ( ruleStateType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1787:1: ( ruleStateType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1787:1: ( ruleStateType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1788:1: ruleStateType
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_16_03554);
            ruleStateType();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0()); 
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
    // $ANTLR end rule__State__StateKindAssignment_0_16_0


    // $ANTLR start rule__State__IsFinalAssignment_0_16_1
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1797:1: rule__State__IsFinalAssignment_0_16_1 : ( ( 'final' ) ) ;
    public final void rule__State__IsFinalAssignment_0_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1801:1: ( ( ( 'final' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1802:1: ( ( 'final' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1802:1: ( ( 'final' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1803:1: ( 'final' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1804:1: ( 'final' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1805:1: 'final'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__State__IsFinalAssignment_0_16_13590); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0()); 
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
    // $ANTLR end rule__State__IsFinalAssignment_0_16_1


    // $ANTLR start rule__State__IsInitialAssignment_0_16_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1820:1: rule__State__IsInitialAssignment_0_16_2 : ( ( 'init' ) ) ;
    public final void rule__State__IsInitialAssignment_0_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1824:1: ( ( ( 'init' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1825:1: ( ( 'init' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1825:1: ( ( 'init' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1826:1: ( 'init' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1827:1: ( 'init' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1828:1: 'init'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__State__IsInitialAssignment_0_16_23634); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0()); 
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
    // $ANTLR end rule__State__IsInitialAssignment_0_16_2


    // $ANTLR start rule__State__StateNameAssignment_2
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1843:1: rule__State__StateNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__StateNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1847:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1848:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1848:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1849:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_23673); if (failed) return ;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1858:1: rule__State__LabelAssignment_3 : ( RULE_STRING ) ;
    public final void rule__State__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1862:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1863:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1863:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:1864:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_33704); if (failed) return ;
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

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:167:6: ( ( ( rule__State__Group_0_9__0 ) ) )
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
        pushFollow(FOLLOW_rule__State__Group_0_9__0_in_synpred10340);
        rule__State__Group_0_9__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:173:6: ( ( ( rule__State__Group_0_10__0 ) ) )
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
        pushFollow(FOLLOW_rule__State__Group_0_10__0_in_synpred11358);
        rule__State__Group_0_10__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys.ui/src-gen/de/cau/cs/kieler/synccharts/dsl/contentassist/antlr/internal/InternalRetypingSynccharts.g:179:6: ( ( ( rule__State__Group_0_11__0 ) ) )
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
        pushFollow(FOLLOW_rule__State__Group_0_11__0_in_synpred12376);
        rule__State__Group_0_11__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_0_in_rule__State__Alternatives_0178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_1__0_in_rule__State__Alternatives_0196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__0_in_rule__State__Alternatives_0214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_3_in_rule__State__Alternatives_0232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__0_in_rule__State__Alternatives_0250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__0_in_rule__State__Alternatives_0268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_6_in_rule__State__Alternatives_0286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__0_in_rule__State__Alternatives_0304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__0_in_rule__State__Alternatives_0322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_rule__State__Alternatives_0340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_rule__State__Alternatives_0358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_rule__State__Alternatives_0376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__0_in_rule__State__Alternatives_0394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__0_in_rule__State__Alternatives_0412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__0_in_rule__State__Alternatives_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__0_in_rule__State__Alternatives_0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__0_in_rule__State__Alternatives_0466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_0_in_rule__State__Group__0600 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__0610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__1640 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateNameAssignment_2_in_rule__State__Group__2680 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LabelAssignment_3_in_rule__State__Group__3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_1_0_in_rule__State__Group_0_1__0761 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_1__1_in_rule__State__Group_0_1__0770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_1_1_in_rule__State__Group_0_1__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_2_0_in_rule__State__Group_0_2__0836 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_2__1_in_rule__State__Group_0_2__0845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_2_1_in_rule__State__Group_0_2__1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_4_0_in_rule__State__Group_0_4__0911 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_4__1_in_rule__State__Group_0_4__0920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_4_1_in_rule__State__Group_0_4__1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_5_0_in_rule__State__Group_0_5__0986 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_5__1_in_rule__State__Group_0_5__0995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_5_1_in_rule__State__Group_0_5__11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_7_0_in_rule__State__Group_0_7__01061 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_7__1_in_rule__State__Group_0_7__01070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_7_1_in_rule__State__Group_0_7__11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_8_0_in_rule__State__Group_0_8__01136 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_8__1_in_rule__State__Group_0_8__01145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_8_1_in_rule__State__Group_0_8__11173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_9_0_in_rule__State__Group_0_9__01211 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__1_in_rule__State__Group_0_9__01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_9_1_in_rule__State__Group_0_9__11248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__2_in_rule__State__Group_0_9__11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_9_2_in_rule__State__Group_0_9__21285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_10_0_in_rule__State__Group_0_10__01325 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__1_in_rule__State__Group_0_10__01334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_10_1_in_rule__State__Group_0_10__11362 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__2_in_rule__State__Group_0_10__11371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_10_2_in_rule__State__Group_0_10__21399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_11_0_in_rule__State__Group_0_11__01439 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__1_in_rule__State__Group_0_11__01448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_11_1_in_rule__State__Group_0_11__11476 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__2_in_rule__State__Group_0_11__11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_11_2_in_rule__State__Group_0_11__21513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_12_0_in_rule__State__Group_0_12__01553 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__1_in_rule__State__Group_0_12__01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_12_1_in_rule__State__Group_0_12__11590 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_12__2_in_rule__State__Group_0_12__11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_12_2_in_rule__State__Group_0_12__21627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_13_0_in_rule__State__Group_0_13__01667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__1_in_rule__State__Group_0_13__01676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_13_1_in_rule__State__Group_0_13__11704 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_13__2_in_rule__State__Group_0_13__11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_13_2_in_rule__State__Group_0_13__21741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_14_0_in_rule__State__Group_0_14__01781 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__1_in_rule__State__Group_0_14__01790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_14_1_in_rule__State__Group_0_14__11818 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_14__2_in_rule__State__Group_0_14__11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_14_2_in_rule__State__Group_0_14__21855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_15_0_in_rule__State__Group_0_15__01895 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__1_in_rule__State__Group_0_15__01904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_15_1_in_rule__State__Group_0_15__11932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_15__2_in_rule__State__Group_0_15__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_15_2_in_rule__State__Group_0_15__21969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__StateKindAssignment_0_16_0_in_rule__State__Group_0_16__02009 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__1_in_rule__State__Group_0_16__02018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsFinalAssignment_0_16_1_in_rule__State__Group_0_16__12046 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__State__Group_0_16__2_in_rule__State__Group_0_16__12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_0_16_2_in_rule__State__Group_0_16__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_02131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_1_02175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_1_12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_2_02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_2_12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_32333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_4_02364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_4_12400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_5_02439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_5_12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_62519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_7_02563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_7_12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_8_02651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_8_12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_9_02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_9_12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_9_22801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_10_02845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_10_12889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_10_22928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_11_02964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_11_13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_11_23047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_12_03083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_12_13122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_12_23158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_13_03202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_13_13246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_13_23285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_14_03321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_14_13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_14_23396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_15_03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_15_13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_15_23515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__StateKindAssignment_0_16_03554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__IsFinalAssignment_0_16_13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__IsInitialAssignment_0_16_23634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__StateNameAssignment_23673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__LabelAssignment_33704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_9__0_in_synpred10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_10__0_in_synpred11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0_11__0_in_synpred12376 = new BitSet(new long[]{0x0000000000000002L});

}