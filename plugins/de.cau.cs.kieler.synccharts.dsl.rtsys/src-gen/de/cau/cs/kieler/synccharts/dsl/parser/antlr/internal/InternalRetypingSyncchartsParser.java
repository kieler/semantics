package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.synccharts.dsl.services.RetypingSyncchartsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalRetypingSyncchartsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'NORMAL'", "'cond'", "'reference'", "'textual'"
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
            ruleMemo = new HashMap[26+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g"; }


     
     	private RetypingSyncchartsGrammarAccess grammarAccess;
     	
        public InternalRetypingSyncchartsParser(TokenStream input, IAstFactory factory, RetypingSyncchartsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "State";	
       	} 



    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:74:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:74:47: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:75:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState79);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState89); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )? ( 'state' )? (lv_stateName_40= RULE_ID )? (lv_label_41= RULE_STRING )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isInitial_1=null;
        Token lv_isFinal_2=null;
        Token lv_isInitial_3=null;
        Token lv_isInitial_7=null;
        Token lv_isFinal_9=null;
        Token lv_isFinal_10=null;
        Token lv_isFinal_11=null;
        Token lv_isInitial_12=null;
        Token lv_isFinal_13=null;
        Token lv_isFinal_16=null;
        Token lv_isInitial_17=null;
        Token lv_isInitial_18=null;
        Token lv_isFinal_19=null;
        Token lv_isInitial_21=null;
        Token lv_isFinal_22=null;
        Token lv_isInitial_24=null;
        Token lv_isFinal_26=null;
        Token lv_isFinal_27=null;
        Token lv_isInitial_28=null;
        Token lv_isFinal_30=null;
        Token lv_isInitial_32=null;
        Token lv_isInitial_34=null;
        Token lv_isFinal_35=null;
        Token lv_isFinal_37=null;
        Token lv_isInitial_38=null;
        Token lv_stateName_40=null;
        Token lv_label_41=null;
        Enumerator lv_stateKind_4 = null;

        Enumerator lv_stateKind_5 = null;

        Enumerator lv_stateKind_6 = null;

        Enumerator lv_stateKind_8 = null;

        Enumerator lv_stateKind_14 = null;

        Enumerator lv_stateKind_15 = null;

        Enumerator lv_stateKind_20 = null;

        Enumerator lv_stateKind_23 = null;

        Enumerator lv_stateKind_25 = null;

        Enumerator lv_stateKind_29 = null;

        Enumerator lv_stateKind_31 = null;

        Enumerator lv_stateKind_33 = null;

        Enumerator lv_stateKind_36 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )? ( 'state' )? (lv_stateName_40= RULE_ID )? (lv_label_41= RULE_STRING )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )? ( 'state' )? (lv_stateName_40= RULE_ID )? (lv_label_41= RULE_STRING )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )? ( 'state' )? (lv_stateName_40= RULE_ID )? (lv_label_41= RULE_STRING )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )? ( 'state' )? (lv_stateName_40= RULE_ID )? (lv_label_41= RULE_STRING )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( (lv_isInitial_0= 'init' ) | ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) | ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) ) | (lv_stateKind_5= ruleStateType ) | ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) ) | ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) ) | (lv_isFinal_10= 'final' ) | ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) ) | ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) ) | ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) ) | ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) ) | ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) ) | ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) ) | ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) ) | ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) ) | ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) )?
            int alt1=18;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            switch ( input.LA(3) ) {
                                case EOF:
                                case RULE_ID:
                                case RULE_STRING:
                                case 13:
                                    {
                                    alt1=2;
                                    }
                                    break;
                                case 14:
                                    {
                                    int LA1_24 = input.LA(4);

                                    if ( (synpred11()) ) {
                                        alt1=11;
                                    }
                                    else if ( (synpred12()) ) {
                                        alt1=12;
                                    }
                                    }
                                    break;
                                case 15:
                                    {
                                    int LA1_25 = input.LA(4);

                                    if ( (synpred11()) ) {
                                        alt1=11;
                                    }
                                    else if ( (synpred12()) ) {
                                        alt1=12;
                                    }
                                    }
                                    break;
                                case 16:
                                    {
                                    int LA1_26 = input.LA(4);

                                    if ( (synpred11()) ) {
                                        alt1=11;
                                    }
                                    else if ( (synpred12()) ) {
                                        alt1=12;
                                    }
                                    }
                                    break;
                                case 17:
                                    {
                                    int LA1_27 = input.LA(4);

                                    if ( (synpred11()) ) {
                                        alt1=11;
                                    }
                                    else if ( (synpred12()) ) {
                                        alt1=12;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 14:
                            {
                            int LA1_9 = input.LA(3);

                            if ( (LA1_9==EOF||(LA1_9>=RULE_ID && LA1_9<=RULE_STRING)||LA1_9==13) ) {
                                alt1=3;
                            }
                            else if ( (LA1_9==12) ) {
                                alt1=13;
                            }
                            }
                            break;
                        case 15:
                            {
                            int LA1_10 = input.LA(3);

                            if ( (LA1_10==12) ) {
                                alt1=13;
                            }
                            else if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||LA1_10==13) ) {
                                alt1=3;
                            }
                            }
                            break;
                        case 16:
                            {
                            int LA1_11 = input.LA(3);

                            if ( (LA1_11==12) ) {
                                alt1=13;
                            }
                            else if ( (LA1_11==EOF||(LA1_11>=RULE_ID && LA1_11<=RULE_STRING)||LA1_11==13) ) {
                                alt1=3;
                            }
                            }
                            break;
                        case 17:
                            {
                            int LA1_12 = input.LA(3);

                            if ( (LA1_12==12) ) {
                                alt1=13;
                            }
                            else if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||LA1_12==13) ) {
                                alt1=3;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=1;
                            }
                            break;
                    }

                    }
                    break;
                case 14:
                    {
                    switch ( input.LA(2) ) {
                        case 11:
                            {
                            int LA1_14 = input.LA(3);

                            if ( (LA1_14==12) ) {
                                alt1=16;
                            }
                            else if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==13) ) {
                                alt1=5;
                            }
                            }
                            break;
                        case 12:
                            {
                            int LA1_15 = input.LA(3);

                            if ( (LA1_15==11) ) {
                                int LA1_32 = input.LA(4);

                                if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else if ( (synpred17()) ) {
                                    alt1=17;
                                }
                            }
                            else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||LA1_15==13) ) {
                                alt1=6;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=4;
                            }
                            break;
                    }

                    }
                    break;
                case 15:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_15 = input.LA(3);

                            if ( (LA1_15==11) ) {
                                int LA1_32 = input.LA(4);

                                if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else if ( (synpred17()) ) {
                                    alt1=17;
                                }
                            }
                            else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||LA1_15==13) ) {
                                alt1=6;
                            }
                            }
                            break;
                        case 11:
                            {
                            int LA1_14 = input.LA(3);

                            if ( (LA1_14==12) ) {
                                alt1=16;
                            }
                            else if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==13) ) {
                                alt1=5;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=4;
                            }
                            break;
                    }

                    }
                    break;
                case 16:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_15 = input.LA(3);

                            if ( (LA1_15==11) ) {
                                int LA1_32 = input.LA(4);

                                if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else if ( (synpred17()) ) {
                                    alt1=17;
                                }
                            }
                            else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||LA1_15==13) ) {
                                alt1=6;
                            }
                            }
                            break;
                        case 11:
                            {
                            int LA1_14 = input.LA(3);

                            if ( (LA1_14==12) ) {
                                alt1=16;
                            }
                            else if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==13) ) {
                                alt1=5;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=4;
                            }
                            break;
                    }

                    }
                    break;
                case 17:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_15 = input.LA(3);

                            if ( (LA1_15==11) ) {
                                int LA1_32 = input.LA(4);

                                if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else if ( (synpred17()) ) {
                                    alt1=17;
                                }
                            }
                            else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||LA1_15==13) ) {
                                alt1=6;
                            }
                            }
                            break;
                        case 11:
                            {
                            int LA1_14 = input.LA(3);

                            if ( (LA1_14==12) ) {
                                alt1=16;
                            }
                            else if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||LA1_14==13) ) {
                                alt1=5;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=4;
                            }
                            break;
                    }

                    }
                    break;
                case 12:
                    {
                    switch ( input.LA(2) ) {
                        case 11:
                            {
                            int LA1_17 = input.LA(3);

                            if ( ((LA1_17>=14 && LA1_17<=17)) ) {
                                alt1=14;
                            }
                            else if ( (LA1_17==EOF||(LA1_17>=RULE_ID && LA1_17<=RULE_STRING)||LA1_17==13) ) {
                                alt1=8;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                            {
                            alt1=7;
                            }
                            break;
                        case 14:
                            {
                            int LA1_19 = input.LA(3);

                            if ( (LA1_19==EOF||(LA1_19>=RULE_ID && LA1_19<=RULE_STRING)||LA1_19==13) ) {
                                alt1=9;
                            }
                            else if ( (LA1_19==11) ) {
                                alt1=15;
                            }
                            }
                            break;
                        case 15:
                            {
                            int LA1_20 = input.LA(3);

                            if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||LA1_20==13) ) {
                                alt1=9;
                            }
                            else if ( (LA1_20==11) ) {
                                alt1=15;
                            }
                            }
                            break;
                        case 16:
                            {
                            int LA1_21 = input.LA(3);

                            if ( (LA1_21==11) ) {
                                alt1=15;
                            }
                            else if ( (LA1_21==EOF||(LA1_21>=RULE_ID && LA1_21<=RULE_STRING)||LA1_21==13) ) {
                                alt1=9;
                            }
                            }
                            break;
                        case 17:
                            {
                            int LA1_22 = input.LA(3);

                            if ( (LA1_22==EOF||(LA1_22>=RULE_ID && LA1_22<=RULE_STRING)||LA1_22==13) ) {
                                alt1=9;
                            }
                            else if ( (LA1_22==11) ) {
                                alt1=15;
                            }
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: (lv_isInitial_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:3: (lv_isInitial_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: lv_isInitial_0= 'init'
                    {
                    lv_isInitial_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState136); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:6: ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:6: ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:7: (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:7: (lv_isInitial_1= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:112:6: lv_isInitial_1= 'init'
                    {
                    lv_isInitial_1=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState177); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:131:2: (lv_isFinal_2= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: lv_isFinal_2= 'final'
                    {
                    lv_isFinal_2=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:153:6: ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:153:6: ( (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:153:7: (lv_isInitial_3= 'init' ) (lv_stateKind_4= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:153:7: (lv_isInitial_3= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:6: lv_isInitial_3= 'init'
                    {
                    lv_isInitial_3=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState253); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:174:2: (lv_stateKind_4= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: lv_stateKind_4= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState300);
                    lv_stateKind_4=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_4, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:196:6: (lv_stateKind_5= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:196:6: (lv_stateKind_5= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:199:6: lv_stateKind_5= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState345);
                    lv_stateKind_5=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_5, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:6: ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:6: ( (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:7: (lv_stateKind_6= ruleStateType ) (lv_isInitial_7= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:7: (lv_stateKind_6= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:221:6: lv_stateKind_6= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState390);
                    lv_stateKind_6=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_6, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:239:2: (lv_isInitial_7= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:241:6: lv_isInitial_7= 'init'
                    {
                    lv_isInitial_7=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState415); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_1_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:261:6: ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:261:6: ( (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:261:7: (lv_stateKind_8= ruleStateType ) (lv_isFinal_9= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:261:7: (lv_stateKind_8= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:264:6: lv_stateKind_8= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_5_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState470);
                    lv_stateKind_8=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_8, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:282:2: (lv_isFinal_9= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: lv_isFinal_9= 'final'
                    {
                    lv_isFinal_9=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState495); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:304:6: (lv_isFinal_10= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:304:6: (lv_isFinal_10= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: lv_isFinal_10= 'final'
                    {
                    lv_isFinal_10=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState536); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_isFinal_11= 'final' ) (lv_isInitial_12= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_isFinal_11= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: lv_isFinal_11= 'final'
                    {
                    lv_isFinal_11=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState577); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_0_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:347:2: (lv_isInitial_12= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:349:6: lv_isInitial_12= 'init'
                    {
                    lv_isInitial_12=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState611); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_1_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_isFinal_13= 'final' ) (lv_stateKind_14= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_isFinal_13= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:6: lv_isFinal_13= 'final'
                    {
                    lv_isFinal_13=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState653); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:390:2: (lv_stateKind_14= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:393:6: lv_stateKind_14= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState700);
                    lv_stateKind_14=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_14, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_stateKind_15= ruleStateType ) (lv_isFinal_16= 'final' ) (lv_isInitial_17= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_stateKind_15= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:415:6: lv_stateKind_15= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState746);
                    lv_stateKind_15=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_15, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:433:2: (lv_isFinal_16= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:435:6: lv_isFinal_16= 'final'
                    {
                    lv_isFinal_16=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState771); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:454:2: (lv_isInitial_17= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:456:6: lv_isInitial_17= 'init'
                    {
                    lv_isInitial_17=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState805); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_2_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) (lv_stateKind_20= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: (lv_isInitial_18= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:478:6: lv_isInitial_18= 'init'
                    {
                    lv_isInitial_18=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState847); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:497:2: (lv_isFinal_19= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:499:6: lv_isFinal_19= 'final'
                    {
                    lv_isFinal_19=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState881); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:518:2: (lv_stateKind_20= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:521:6: lv_stateKind_20= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState928);
                    lv_stateKind_20=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_20, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) (lv_stateKind_23= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isInitial_21= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:542:6: lv_isInitial_21= 'init'
                    {
                    lv_isInitial_21=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState961); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:561:2: (lv_isFinal_22= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:6: lv_isFinal_22= 'final'
                    {
                    lv_isFinal_22=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState995); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:582:2: (lv_stateKind_23= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:585:6: lv_stateKind_23= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1042);
                    lv_stateKind_23=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_23, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isInitial_24= 'init' ) (lv_stateKind_25= ruleStateType ) (lv_isFinal_26= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isInitial_24= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:606:6: lv_isInitial_24= 'init'
                    {
                    lv_isInitial_24=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1075); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:625:2: (lv_stateKind_25= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:628:6: lv_stateKind_25= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1122);
                    lv_stateKind_25=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_25, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:646:2: (lv_isFinal_26= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:648:6: lv_isFinal_26= 'final'
                    {
                    lv_isFinal_26=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1147); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_2_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_isFinal_27= 'final' ) (lv_isInitial_28= 'init' ) (lv_stateKind_29= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_isFinal_27= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:670:6: lv_isFinal_27= 'final'
                    {
                    lv_isFinal_27=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1189); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:689:2: (lv_isInitial_28= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:691:6: lv_isInitial_28= 'init'
                    {
                    lv_isInitial_28=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1223); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_1_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:710:2: (lv_stateKind_29= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:713:6: lv_stateKind_29= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1270);
                    lv_stateKind_29=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_29, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_isFinal_30= 'final' ) (lv_stateKind_31= ruleStateType ) (lv_isInitial_32= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_isFinal_30= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:734:6: lv_isFinal_30= 'final'
                    {
                    lv_isFinal_30=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:753:2: (lv_stateKind_31= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:756:6: lv_stateKind_31= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1350);
                    lv_stateKind_31=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_31, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:774:2: (lv_isInitial_32= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:776:6: lv_isInitial_32= 'init'
                    {
                    lv_isInitial_32=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1375); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_2_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:6: ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:6: ( (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:7: (lv_stateKind_33= ruleStateType ) (lv_isInitial_34= 'init' ) (lv_isFinal_35= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:796:7: (lv_stateKind_33= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:799:6: lv_stateKind_33= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_15_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1430);
                    lv_stateKind_33=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_33, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:817:2: (lv_isInitial_34= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:819:6: lv_isInitial_34= 'init'
                    {
                    lv_isInitial_34=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1455); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:838:2: (lv_isFinal_35= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:840:6: lv_isFinal_35= 'final'
                    {
                    lv_isFinal_35=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1489); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_2_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: (lv_stateKind_36= ruleStateType ) (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: (lv_stateKind_36= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:863:6: lv_stateKind_36= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1544);
                    lv_stateKind_36=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_36, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:2: (lv_isFinal_37= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:883:6: lv_isFinal_37= 'final'
                    {
                    lv_isFinal_37=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1569); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_16_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:902:2: (lv_isInitial_38= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:6: lv_isInitial_38= 'init'
                    {
                    lv_isInitial_38=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1603); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_2_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:923:5: ( 'state' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:923:6: 'state'
                    {
                    match(input,13,FOLLOW_13_in_ruleState1629); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:927:3: (lv_stateName_40= RULE_ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:929:6: lv_stateName_40= RULE_ID
                    {
                    lv_stateName_40=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1653); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_2_0(), "stateName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateName", lv_stateName_40, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:947:3: (lv_label_41= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:949:6: lv_label_41= RULE_STRING
                    {
                    lv_label_41=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1684); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "label", lv_label_41, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:980:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("985:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:985:4: 'NORMAL'
                    {
                    match(input,14,FOLLOW_14_in_ruleStateType1746); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:991:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:991:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:991:8: 'cond'
                    {
                    match(input,15,FOLLOW_15_in_ruleStateType1761); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:997:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:997:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:997:8: 'reference'
                    {
                    match(input,16,FOLLOW_16_in_ruleStateType1776); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1003:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1003:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1003:8: 'textual'
                    {
                    match(input,17,FOLLOW_17_in_ruleStateType1791); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateType

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( ( ( ruleStateType ) ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( ( ruleStateType ) ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( ( ruleStateType ) ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: ( ruleStateType ) ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:415:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred10746);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:433:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:435:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred10771); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:454:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:456:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred10805); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( ( ( 'init' ) ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( ( 'init' ) ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( ( 'init' ) ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: ( 'init' ) ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:478:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred11847); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:497:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:499:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred11881); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:518:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:521:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred11928);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( ( 'init' ) ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( 'init' ) ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( ( 'init' ) ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: ( 'init' ) ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:542:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred12961); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:561:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred12995); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:582:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:585:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_11_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred121042);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( ( ( ruleStateType ) ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( ( ruleStateType ) ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:6: ( ( ruleStateType ) ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: ( ruleStateType ) ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:860:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:863:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_16_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred171544);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:883:6: 'final'
        {
        match(input,12,FOLLOW_12_in_synpred171569); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:902:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:6: 'init'
        {
        match(input,11,FOLLOW_11_in_synpred171603); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState136 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_11_in_ruleState177 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState211 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_11_in_ruleState253 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState300 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState345 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState390 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState415 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState470 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState495 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_12_in_ruleState536 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_12_in_ruleState577 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState611 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_12_in_ruleState653 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState700 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState746 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState771 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState805 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_11_in_ruleState847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState881 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState928 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_11_in_ruleState961 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState995 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1042 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_11_in_ruleState1075 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1147 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_12_in_ruleState1189 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1223 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1270 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_12_in_ruleState1303 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1350 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1375 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1455 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1489 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1603 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_13_in_ruleState1629 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1653 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateType1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStateType1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStateType1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStateType1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred10746 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred10771 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred11847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred11881 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_synpred12961 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred12995 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred121042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred171544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred171569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_synpred171603 = new BitSet(new long[]{0x0000000000000002L});

}