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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'{'", "'}'", "'oninner'", "'onentry'", "'onexit'", "'NORMAL'", "'cond'", "'reference'", "'textual'"
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
            ruleMemo = new HashMap[36+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? ( 'state' )? (lv_stateID_34= RULE_ID )? (lv_stateLabel_35= RULE_STRING )? (lv_stateContent_36= ruleStateContent )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_isInitial_3=null;
        Token lv_isFinal_4=null;
        Token lv_isInitial_5=null;
        Token lv_isFinal_7=null;
        Token lv_isInitial_8=null;
        Token lv_isFinal_9=null;
        Token lv_isInitial_12=null;
        Token lv_isFinal_14=null;
        Token lv_isInitial_15=null;
        Token lv_isFinal_16=null;
        Token lv_isInitial_18=null;
        Token lv_isFinal_20=null;
        Token lv_isFinal_21=null;
        Token lv_isInitial_22=null;
        Token lv_isFinal_24=null;
        Token lv_isInitial_26=null;
        Token lv_isFinal_28=null;
        Token lv_isInitial_29=null;
        Token lv_isInitial_31=null;
        Token lv_isFinal_32=null;
        Token lv_stateID_34=null;
        Token lv_stateLabel_35=null;
        Enumerator lv_stateKind_2 = null;

        Enumerator lv_stateKind_6 = null;

        Enumerator lv_stateKind_10 = null;

        Enumerator lv_stateKind_11 = null;

        Enumerator lv_stateKind_13 = null;

        Enumerator lv_stateKind_17 = null;

        Enumerator lv_stateKind_19 = null;

        Enumerator lv_stateKind_23 = null;

        Enumerator lv_stateKind_25 = null;

        Enumerator lv_stateKind_27 = null;

        Enumerator lv_stateKind_30 = null;

        EObject lv_stateContent_36 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? ( 'state' )? (lv_stateID_34= RULE_ID )? (lv_stateLabel_35= RULE_STRING )? (lv_stateContent_36= ruleStateContent )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? ( 'state' )? (lv_stateID_34= RULE_ID )? (lv_stateLabel_35= RULE_STRING )? (lv_stateContent_36= ruleStateContent )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? ( 'state' )? (lv_stateID_34= RULE_ID )? (lv_stateLabel_35= RULE_STRING )? (lv_stateContent_36= ruleStateContent )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )? ( 'state' )? (lv_stateID_34= RULE_ID )? (lv_stateLabel_35= RULE_STRING )? (lv_stateContent_36= ruleStateContent )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: ( (lv_isInitial_0= 'init' ) | (lv_isFinal_1= 'final' ) | (lv_stateKind_2= ruleStateType ) | ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) ) | ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) ) | ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) ) | ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) ) | ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) ) | ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) ) | ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) ) | ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) ) | ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) ) | ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) ) | ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) | ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) ) )?
            int alt1=16;
            switch ( input.LA(1) ) {
                case 11:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_8 = input.LA(3);

                            if ( (LA1_8==EOF||(LA1_8>=RULE_ID && LA1_8<=RULE_STRING)||(LA1_8>=13 && LA1_8<=14)) ) {
                                alt1=4;
                            }
                            else if ( ((LA1_8>=19 && LA1_8<=22)) ) {
                                alt1=10;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=1;
                            }
                            break;
                        case 19:
                            {
                            int LA1_10 = input.LA(3);

                            if ( (LA1_10==EOF||(LA1_10>=RULE_ID && LA1_10<=RULE_STRING)||(LA1_10>=13 && LA1_10<=14)) ) {
                                alt1=5;
                            }
                            else if ( (LA1_10==12) ) {
                                alt1=11;
                            }
                            }
                            break;
                        case 20:
                            {
                            int LA1_11 = input.LA(3);

                            if ( (LA1_11==12) ) {
                                alt1=11;
                            }
                            else if ( (LA1_11==EOF||(LA1_11>=RULE_ID && LA1_11<=RULE_STRING)||(LA1_11>=13 && LA1_11<=14)) ) {
                                alt1=5;
                            }
                            }
                            break;
                        case 21:
                            {
                            int LA1_12 = input.LA(3);

                            if ( (LA1_12==EOF||(LA1_12>=RULE_ID && LA1_12<=RULE_STRING)||(LA1_12>=13 && LA1_12<=14)) ) {
                                alt1=5;
                            }
                            else if ( (LA1_12==12) ) {
                                alt1=11;
                            }
                            }
                            break;
                        case 22:
                            {
                            int LA1_13 = input.LA(3);

                            if ( (LA1_13==EOF||(LA1_13>=RULE_ID && LA1_13<=RULE_STRING)||(LA1_13>=13 && LA1_13<=14)) ) {
                                alt1=5;
                            }
                            else if ( (LA1_13==12) ) {
                                alt1=11;
                            }
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
                            int LA1_14 = input.LA(3);

                            if ( (LA1_14==EOF||(LA1_14>=RULE_ID && LA1_14<=RULE_STRING)||(LA1_14>=13 && LA1_14<=14)) ) {
                                alt1=6;
                            }
                            else if ( ((LA1_14>=19 && LA1_14<=22)) ) {
                                alt1=12;
                            }
                            }
                            break;
                        case 19:
                            {
                            int LA1_15 = input.LA(3);

                            if ( (LA1_15==11) ) {
                                alt1=13;
                            }
                            else if ( (LA1_15==EOF||(LA1_15>=RULE_ID && LA1_15<=RULE_STRING)||(LA1_15>=13 && LA1_15<=14)) ) {
                                alt1=7;
                            }
                            }
                            break;
                        case 20:
                            {
                            int LA1_16 = input.LA(3);

                            if ( (LA1_16==11) ) {
                                alt1=13;
                            }
                            else if ( (LA1_16==EOF||(LA1_16>=RULE_ID && LA1_16<=RULE_STRING)||(LA1_16>=13 && LA1_16<=14)) ) {
                                alt1=7;
                            }
                            }
                            break;
                        case 21:
                            {
                            int LA1_17 = input.LA(3);

                            if ( (LA1_17==11) ) {
                                alt1=13;
                            }
                            else if ( (LA1_17==EOF||(LA1_17>=RULE_ID && LA1_17<=RULE_STRING)||(LA1_17>=13 && LA1_17<=14)) ) {
                                alt1=7;
                            }
                            }
                            break;
                        case 22:
                            {
                            int LA1_18 = input.LA(3);

                            if ( (LA1_18==EOF||(LA1_18>=RULE_ID && LA1_18<=RULE_STRING)||(LA1_18>=13 && LA1_18<=14)) ) {
                                alt1=7;
                            }
                            else if ( (LA1_18==11) ) {
                                alt1=13;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=2;
                            }
                            break;
                    }

                    }
                    break;
                case 19:
                    {
                    switch ( input.LA(2) ) {
                        case 11:
                            {
                            int LA1_20 = input.LA(3);

                            if ( (LA1_20==12) ) {
                                alt1=15;
                            }
                            else if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=13 && LA1_20<=14)) ) {
                                alt1=8;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=3;
                            }
                            break;
                        case 12:
                            {
                            int LA1_22 = input.LA(3);

                            if ( (LA1_22==11) ) {
                                alt1=14;
                            }
                            else if ( (LA1_22==EOF||(LA1_22>=RULE_ID && LA1_22<=RULE_STRING)||(LA1_22>=13 && LA1_22<=14)) ) {
                                alt1=9;
                            }
                            }
                            break;
                    }

                    }
                    break;
                case 20:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_22 = input.LA(3);

                            if ( (LA1_22==11) ) {
                                alt1=14;
                            }
                            else if ( (LA1_22==EOF||(LA1_22>=RULE_ID && LA1_22<=RULE_STRING)||(LA1_22>=13 && LA1_22<=14)) ) {
                                alt1=9;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=3;
                            }
                            break;
                        case 11:
                            {
                            int LA1_20 = input.LA(3);

                            if ( (LA1_20==12) ) {
                                alt1=15;
                            }
                            else if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=13 && LA1_20<=14)) ) {
                                alt1=8;
                            }
                            }
                            break;
                    }

                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(2) ) {
                        case 11:
                            {
                            int LA1_20 = input.LA(3);

                            if ( (LA1_20==12) ) {
                                alt1=15;
                            }
                            else if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=13 && LA1_20<=14)) ) {
                                alt1=8;
                            }
                            }
                            break;
                        case 12:
                            {
                            int LA1_22 = input.LA(3);

                            if ( (LA1_22==11) ) {
                                alt1=14;
                            }
                            else if ( (LA1_22==EOF||(LA1_22>=RULE_ID && LA1_22<=RULE_STRING)||(LA1_22>=13 && LA1_22<=14)) ) {
                                alt1=9;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=3;
                            }
                            break;
                    }

                    }
                    break;
                case 22:
                    {
                    switch ( input.LA(2) ) {
                        case 12:
                            {
                            int LA1_22 = input.LA(3);

                            if ( (LA1_22==11) ) {
                                alt1=14;
                            }
                            else if ( (LA1_22==EOF||(LA1_22>=RULE_ID && LA1_22<=RULE_STRING)||(LA1_22>=13 && LA1_22<=14)) ) {
                                alt1=9;
                            }
                            }
                            break;
                        case 11:
                            {
                            int LA1_20 = input.LA(3);

                            if ( (LA1_20==12) ) {
                                alt1=15;
                            }
                            else if ( (LA1_20==EOF||(LA1_20>=RULE_ID && LA1_20<=RULE_STRING)||(LA1_20>=13 && LA1_20<=14)) ) {
                                alt1=8;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case RULE_STRING:
                        case 13:
                        case 14:
                            {
                            alt1=3;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:6: (lv_isFinal_1= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:110:6: (lv_isFinal_1= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:112:6: lv_isFinal_1= 'final'
                    {
                    lv_isFinal_1=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState176); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0(), "isFinal"); 
                          
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
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:132:6: (lv_stateKind_2= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:132:6: (lv_stateKind_2= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:135:6: lv_stateKind_2= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState229);
                    lv_stateKind_2=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_2, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:154:6: ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:154:6: ( (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:154:7: (lv_isInitial_3= 'init' ) (lv_isFinal_4= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:154:7: (lv_isInitial_3= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:156:6: lv_isInitial_3= 'init'
                    {
                    lv_isInitial_3=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState261); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:175:2: (lv_isFinal_4= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: lv_isFinal_4= 'final'
                    {
                    lv_isFinal_4=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState295); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_1_0(), "isFinal"); 
                          
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
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:6: ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:6: ( (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:7: (lv_isInitial_5= 'init' ) (lv_stateKind_6= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:197:7: (lv_isInitial_5= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:199:6: lv_isInitial_5= 'init'
                    {
                    lv_isInitial_5=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState337); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:218:2: (lv_stateKind_6= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:221:6: lv_stateKind_6= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState384);
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


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:240:6: ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:240:6: ( (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:240:7: (lv_isFinal_7= 'final' ) (lv_isInitial_8= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:240:7: (lv_isFinal_7= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:242:6: lv_isFinal_7= 'final'
                    {
                    lv_isFinal_7=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState417); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:261:2: (lv_isInitial_8= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:263:6: lv_isInitial_8= 'init'
                    {
                    lv_isInitial_8=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState451); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_1_0(), "isInitial"); 
                          
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
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:6: ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:6: ( (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:7: (lv_isFinal_9= 'final' ) (lv_stateKind_10= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:283:7: (lv_isFinal_9= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:285:6: lv_isFinal_9= 'final'
                    {
                    lv_isFinal_9=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState493); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:304:2: (lv_stateKind_10= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:307:6: lv_stateKind_10= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState540);
                    lv_stateKind_10=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_10, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:6: ( (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_stateKind_11= ruleStateType ) (lv_isInitial_12= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:326:7: (lv_stateKind_11= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:329:6: lv_stateKind_11= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_7_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState586);
                    lv_stateKind_11=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_11, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:6: ( (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_stateKind_13= ruleStateType ) (lv_isFinal_14= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:369:7: (lv_stateKind_13= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:372:6: lv_stateKind_13= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_8_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState666);
                    lv_stateKind_13=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_13, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:390:2: (lv_isFinal_14= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:392:6: lv_isFinal_14= 'final'
                    {
                    lv_isFinal_14=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState691); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_1_0(), "isFinal"); 
                          
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
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:6: ( (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_isInitial_15= 'init' ) (lv_isFinal_16= 'final' ) (lv_stateKind_17= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:412:7: (lv_isInitial_15= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:414:6: lv_isInitial_15= 'init'
                    {
                    lv_isInitial_15=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState733); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:433:2: (lv_isFinal_16= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:435:6: lv_isFinal_16= 'final'
                    {
                    lv_isFinal_16=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState767); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:454:2: (lv_stateKind_17= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:457:6: lv_stateKind_17= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_9_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState814);
                    lv_stateKind_17=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_17, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:6: ( (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:476:7: (lv_isInitial_18= 'init' ) (lv_stateKind_19= ruleStateType ) (lv_isFinal_20= 'final' )
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:497:2: (lv_stateKind_19= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:500:6: lv_stateKind_19= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState894);
                    lv_stateKind_19=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_19, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:518:2: (lv_isFinal_20= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:520:6: lv_isFinal_20= 'final'
                    {
                    lv_isFinal_20=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState919); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_2_0(), "isFinal"); 
                          
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
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:6: ( (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isFinal_21= 'final' ) (lv_isInitial_22= 'init' ) (lv_stateKind_23= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:540:7: (lv_isFinal_21= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:542:6: lv_isFinal_21= 'final'
                    {
                    lv_isFinal_21=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState961); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:561:2: (lv_isInitial_22= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:6: lv_isInitial_22= 'init'
                    {
                    lv_isInitial_22=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState995); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_1_0(), "isInitial"); 
                          
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:6: ( (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isFinal_24= 'final' ) (lv_stateKind_25= ruleStateType ) (lv_isInitial_26= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:604:7: (lv_isFinal_24= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:606:6: lv_isFinal_24= 'final'
                    {
                    lv_isFinal_24=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1075); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:646:2: (lv_isInitial_26= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:648:6: lv_isInitial_26= 'init'
                    {
                    lv_isInitial_26=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1147); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_2_0(), "isInitial"); 
                          
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
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:6: ( (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_stateKind_27= ruleStateType ) (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:668:7: (lv_stateKind_27= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:671:6: lv_stateKind_27= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_13_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1202);
                    lv_stateKind_27=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_27, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:689:2: (lv_isFinal_28= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:691:6: lv_isFinal_28= 'final'
                    {
                    lv_isFinal_28=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1227); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:710:2: (lv_isInitial_29= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:712:6: lv_isInitial_29= 'init'
                    {
                    lv_isInitial_29=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1261); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_2_0(), "isInitial"); 
                          
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
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:6: ( (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_stateKind_30= ruleStateType ) (lv_isInitial_31= 'init' ) (lv_isFinal_32= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:732:7: (lv_stateKind_30= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:735:6: lv_stateKind_30= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_0_14_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1316);
                    lv_stateKind_30=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_30, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:753:2: (lv_isInitial_31= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:755:6: lv_isInitial_31= 'init'
                    {
                    lv_isInitial_31=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleState1341); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:774:2: (lv_isFinal_32= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:776:6: lv_isFinal_32= 'final'
                    {
                    lv_isFinal_32=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1375); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_2_0(), "isFinal"); 
                          
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

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:795:5: ( 'state' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:795:6: 'state'
                    {
                    match(input,13,FOLLOW_13_in_ruleState1401); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:799:3: (lv_stateID_34= RULE_ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:801:6: lv_stateID_34= RULE_ID
                    {
                    lv_stateID_34=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState1425); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getStateIDIDTerminalRuleCall_2_0(), "stateID"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateID", lv_stateID_34, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:819:3: (lv_stateLabel_35= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:821:6: lv_stateLabel_35= RULE_STRING
                    {
                    lv_stateLabel_35=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState1456); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getStateLabelSTRINGTerminalRuleCall_3_0(), "stateLabel"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateLabel", lv_stateLabel_35, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:839:3: (lv_stateContent_36= ruleStateContent )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:842:6: lv_stateContent_36= ruleStateContent
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateContent_in_ruleState1499);
                    lv_stateContent_36=ruleStateContent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateContent", lv_stateContent_36, "StateContent", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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


    // $ANTLR start entryRuleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:867:1: entryRuleStateContent returns [EObject current=null] : iv_ruleStateContent= ruleStateContent EOF ;
    public final EObject entryRuleStateContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateContent = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:867:54: (iv_ruleStateContent= ruleStateContent EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:868:2: iv_ruleStateContent= ruleStateContent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateContentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_entryRuleStateContent1537);
            iv_ruleStateContent=ruleStateContent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStateContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateContent1547); if (failed) return current;

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
    // $ANTLR end entryRuleStateContent


    // $ANTLR start ruleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:875:1: ruleStateContent returns [EObject current=null] : ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+ '}' ) ;
    public final EObject ruleStateContent() throws RecognitionException {
        EObject current = null;

        EObject lv_exitActions_1 = null;

        EObject lv_entryActions_2 = null;

        EObject lv_innerAction_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:880:6: ( ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+ '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:1: ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+ '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:1: ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+ '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:881:2: '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+ '}'
            {
            match(input,14,FOLLOW_14_in_ruleStateContent1581); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:885:1: ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt6=1;
                    }
                    break;
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case 16:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:885:2: (lv_exitActions_1= ruleExitAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:885:2: (lv_exitActions_1= ruleExitAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:888:6: lv_exitActions_1= ruleExitAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExitAction_in_ruleStateContent1616);
            	    lv_exitActions_1=ruleExitAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "exitActions", lv_exitActions_1, "ExitAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: (lv_entryActions_2= ruleEntryAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:907:6: (lv_entryActions_2= ruleEntryAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:910:6: lv_entryActions_2= ruleEntryAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntryAction_in_ruleStateContent1660);
            	    lv_entryActions_2=ruleEntryAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "entryActions", lv_entryActions_2, "EntryAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:929:6: (lv_innerAction_3= ruleInnerAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:929:6: (lv_innerAction_3= ruleInnerAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:932:6: lv_innerAction_3= ruleInnerAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInnerAction_in_ruleStateContent1704);
            	    lv_innerAction_3=ruleInnerAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerAction", lv_innerAction_3, "InnerAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match(input,15,FOLLOW_15_in_ruleStateContent1719); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2(), null); 
                  
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
    // $ANTLR end ruleStateContent


    // $ANTLR start entryRuleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:961:1: entryRuleInnerAction returns [EObject current=null] : iv_ruleInnerAction= ruleInnerAction EOF ;
    public final EObject entryRuleInnerAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:961:53: (iv_ruleInnerAction= ruleInnerAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:962:2: iv_ruleInnerAction= ruleInnerAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInnerActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_entryRuleInnerAction1752);
            iv_ruleInnerAction=ruleInnerAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInnerAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerAction1762); if (failed) return current;

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
    // $ANTLR end entryRuleInnerAction


    // $ANTLR start ruleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:969:1: ruleInnerAction returns [EObject current=null] : ( 'oninner' (lv_inner_1= RULE_STRING ) ) ;
    public final EObject ruleInnerAction() throws RecognitionException {
        EObject current = null;

        Token lv_inner_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:974:6: ( ( 'oninner' (lv_inner_1= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:975:1: ( 'oninner' (lv_inner_1= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:975:1: ( 'oninner' (lv_inner_1= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:975:2: 'oninner' (lv_inner_1= RULE_STRING )
            {
            match(input,16,FOLLOW_16_in_ruleInnerAction1796); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInnerActionAccess().getOninnerKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:979:1: (lv_inner_1= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:981:6: lv_inner_1= RULE_STRING
            {
            lv_inner_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInnerAction1818); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getInnerActionAccess().getInnerSTRINGTerminalRuleCall_1_0(), "inner"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInnerActionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "inner", lv_inner_1, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

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
    // $ANTLR end ruleInnerAction


    // $ANTLR start entryRuleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1006:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1006:53: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1007:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEntryActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction1859);
            iv_ruleEntryAction=ruleEntryAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction1869); if (failed) return current;

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
    // $ANTLR end entryRuleEntryAction


    // $ANTLR start ruleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1014:1: ruleEntryAction returns [EObject current=null] : ( 'onentry' (lv_entryAction_1= RULE_STRING ) ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        Token lv_entryAction_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1019:6: ( ( 'onentry' (lv_entryAction_1= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1020:1: ( 'onentry' (lv_entryAction_1= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1020:1: ( 'onentry' (lv_entryAction_1= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1020:2: 'onentry' (lv_entryAction_1= RULE_STRING )
            {
            match(input,17,FOLLOW_17_in_ruleEntryAction1903); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEntryActionAccess().getOnentryKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1024:1: (lv_entryAction_1= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1026:6: lv_entryAction_1= RULE_STRING
            {
            lv_entryAction_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntryAction1925); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEntryActionAccess().getEntryActionSTRINGTerminalRuleCall_1_0(), "entryAction"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEntryActionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "entryAction", lv_entryAction_1, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

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
    // $ANTLR end ruleEntryAction


    // $ANTLR start entryRuleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1051:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1051:52: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1052:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExitActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction1966);
            iv_ruleExitAction=ruleExitAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction1976); if (failed) return current;

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
    // $ANTLR end entryRuleExitAction


    // $ANTLR start ruleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1059:1: ruleExitAction returns [EObject current=null] : ( 'onexit' (lv_exit_1= RULE_STRING ) ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        Token lv_exit_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1064:6: ( ( 'onexit' (lv_exit_1= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1065:1: ( 'onexit' (lv_exit_1= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1065:1: ( 'onexit' (lv_exit_1= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1065:2: 'onexit' (lv_exit_1= RULE_STRING )
            {
            match(input,18,FOLLOW_18_in_ruleExitAction2010); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExitActionAccess().getOnexitKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1069:1: (lv_exit_1= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1071:6: lv_exit_1= RULE_STRING
            {
            lv_exit_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExitAction2032); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getExitActionAccess().getExitSTRINGTerminalRuleCall_1_0(), "exit"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExitActionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "exit", lv_exit_1, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

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
    // $ANTLR end ruleExitAction


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1096:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1100:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1101:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'reference' ) | ( 'textual' ) )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1101:4: 'NORMAL'
                    {
                    match(input,19,FOLLOW_19_in_ruleStateType2087); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1107:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1107:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1107:8: 'cond'
                    {
                    match(input,20,FOLLOW_20_in_ruleStateType2102); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1113:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1113:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1113:8: 'reference'
                    {
                    match(input,21,FOLLOW_21_in_ruleStateType2117); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1119:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1119:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1119:8: 'textual'
                    {
                    match(input,22,FOLLOW_22_in_ruleStateType2132); if (failed) return current;
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


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState136 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_12_in_ruleState176 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState229 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_11_in_ruleState261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState295 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_11_in_ruleState337 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState384 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_12_in_ruleState417 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState451 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_12_in_ruleState493 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState540 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState586 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState611 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState666 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState691 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_11_in_ruleState733 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState767 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState814 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_11_in_ruleState847 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState894 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState919 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_12_in_ruleState961 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState995 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1042 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_12_in_ruleState1075 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1147 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1202 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1227 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1261 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleState1341 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1375 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_13_in_ruleState1401 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState1425 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState1456 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleStateContent_in_ruleState1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_entryRuleStateContent1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateContent1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateContent1581 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_ruleExitAction_in_ruleStateContent1616 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_ruleEntryAction_in_ruleStateContent1660 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_ruleInnerAction_in_ruleStateContent1704 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_15_in_ruleStateContent1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_entryRuleInnerAction1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerAction1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInnerAction1796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInnerAction1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntryAction1903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntryAction1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction1966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExitAction2010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExitAction2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStateType2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStateType2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStateType2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStateType2132 = new BitSet(new long[]{0x0000000000000002L});

}